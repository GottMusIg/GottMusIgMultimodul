package com.gottmusig.gottmusig.utils;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.RepositoryService;
import org.camunda.bpm.engine.exception.DeploymentResourceNotFoundException;
import org.camunda.bpm.engine.impl.test.TestHelper;
import org.camunda.bpm.engine.repository.DeploymentBuilder;
import org.camunda.bpm.engine.test.Deployment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.TestContext;
import org.springframework.test.context.TestExecutionListener;

/**
 * This {@link TestExecutionListener} will automatically deploy Camunda resources
 * if a test is annotated with {@link Deployment}. See javadoc of {@link Deployment}
 * for more information.
 *
 * <p>Remember if you define one {@link TestExecutionListener} you have to list all
 * standard spring listeners again. <code>DependencyInjectionTestExecutionListener,
 * DirtiesContextTestExecutionListener and TransactionalTestExecutionListener </code></p>
 */
public class CamundaDeploymentTestExecutionListener implements TestExecutionListener {

    private static final Logger LOG = LoggerFactory.getLogger(CamundaDeploymentTestExecutionListener.class);

    private static final String DEPLOYMENT_ID = CamundaDeploymentTestExecutionListener.class.getName() + "DEPLOYMENT_ID";


    public void beforeTestClass(TestContext testContext) throws Exception {

    }

    public void prepareTestInstance(TestContext testContext) throws Exception {

    }

    public void beforeTestMethod(TestContext testContext) throws Exception {
        Method testMethod = testContext.getTestMethod();
        Deployment deployment = testMethod.getAnnotation(Deployment.class);
        if (deployment == null) {
            deployment = findAnnotationOnClassHierarchy(testContext.getTestClass(), Deployment.class);
        }
        if (deployment != null) {
            ProcessEngine processEngine = getProcessEngine(testContext);
            String deploymentId =
                    annotationDeploymentSetUp(deployment, processEngine.getRepositoryService(), testContext.getTestClass(),
                            testMethod.getName());
            testContext.setAttribute(DEPLOYMENT_ID, deploymentId);
        }
    }

    private <T extends Annotation> T findAnnotationOnClassHierarchy(Class<?> testClass, Class<T> annotation) {
        Class<?> clazz = testClass;
        while (clazz != null) {
            T annot = clazz.getAnnotation(annotation);
            if (annot != null) {
                return annot;
            }
            clazz = clazz.getSuperclass();
        }

        return null;
    }

    public void afterTestMethod(TestContext testContext) throws Exception {
        String deploymentId = (String) testContext.getAttribute(DEPLOYMENT_ID);
        if (deploymentId != null) {
            ProcessEngine processEngine = getProcessEngine(testContext);
            annotationDeploymentTearDown(deploymentId, processEngine.getRepositoryService(), testContext.getTestClass(),
                    testContext.getTestMethod().getName());
        }
        testContext.setAttribute(DEPLOYMENT_ID, null);
    }

    public void afterTestClass(TestContext testContext) throws Exception {

    }

    private ProcessEngine getProcessEngine(TestContext testContext) {
        ProcessEngine processEngine = testContext.getApplicationContext().getBean(ProcessEngine.class);
        return processEngine;
    }

    private String annotationDeploymentSetUp(Deployment deploymentAnnotation, RepositoryService repositoryService,
                                             Class<?> testClass, String methodName) {
        String deploymentId = null;
        LOG.debug("annotation @Deployment creates deployment for {}.{}", testClass.getSimpleName(), methodName);
        String[] resources = deploymentAnnotation.resources();
        if (resources.length == 0) {
            String resource = TestHelper.getBpmnProcessDefinitionResource(testClass, methodName);
            resources = new String[] { resource };
        }

        DeploymentBuilder deploymentBuilder = repositoryService.createDeployment()
                .name(testClass.getSimpleName() + "." + methodName);

        for (String resource : resources) {
            deploymentBuilder.addClasspathResource(resource);
        }

        deploymentId = deploymentBuilder.deploy().getId();

        return deploymentId;
    }

    private void annotationDeploymentTearDown(String deploymentId, RepositoryService repositoryService, Class<?> testClass,
                                              String methodName) {
        LOG.debug("annotation @Deployment deletes deployment for {}.{}", testClass.getSimpleName(), methodName);
        if (deploymentId != null) {
            try {
                repositoryService.deleteDeployment(deploymentId, true);
            } catch (DeploymentResourceNotFoundException e) {
                // Deployment was already deleted by the test case. Ignore.
            }
        }
    }
}
