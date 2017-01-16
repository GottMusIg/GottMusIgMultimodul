package com.gottmusig.dpsdifference.jpa;

import com.gottmusig.dpsdifference.domain.api.ClassSpecification;
import com.gottmusig.dpsdifference.domain.api.DPSDifference;
import com.gottmusig.dpsdifference.domain.api.SpecificationDPS;
import com.gottmusig.dpsdifference.domain.api.WOWClass;
import com.gottmusig.dpsdifference.jpa.ClassSpecificationEntity.ClassSpecificationRepository;
import com.gottmusig.dpsdifference.jpa.SpecificationDPSEntity.SpecificationDPSRepository;
import com.gottmusig.dpsdifference.jpa.WOWClassEntity.WOWClassRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Leon Gottschick
 * @since 0.0.1
 */

public class DPSDifferenceImpl implements DPSDifference {

    @Autowired private SpecificationDPSRepository specificationDPSRepository;
    @Autowired private ClassSpecificationRepository classSpecificationRepository;
    @Autowired private WOWClassRepository classRepository;

    public DPSDifferenceImpl() {
    }

    /*
    for testing TODO FIX ME
     */
    public void addSpecificationDPS(int dps, String specificationName, String className) {
        SpecificationDPSEntity specificationDPS = new SpecificationDPSEntity();
        specificationDPS.setDps(dps);
        Optional<ClassSpecification> specificationOptional = findClassSpecification(specificationName);

        if (specificationOptional.isPresent() && isSpecificationAndClassPresent(specificationOptional.get(), className))
            specificationDPS.setSpecification((ClassSpecificationEntity) specificationOptional.get());
        else
            specificationDPS.setSpecification(addClassSpecification(specificationName, className));

        specificationDPSRepository.save(specificationDPS);
    }

    private boolean isSpecificationAndClassPresent(ClassSpecification classSpecification, String className) {
        Optional<WOWClass> wowClassOptional = findWOWClass(className);
        return wowClassOptional.isPresent() && classSpecification.getWOWClass().getName().equals(wowClassOptional.get().getName());
    }

    public WOWClassEntity addWOWClass(String name) {
        WOWClassEntity wowClassEntity = new WOWClassEntity();
        wowClassEntity.setName(name);
        return classRepository.save(wowClassEntity);
    }

    public ClassSpecificationEntity addClassSpecification(String specificationName, String className) {
        ClassSpecificationEntity classSpecification = new ClassSpecificationEntity();
        classSpecification.setName(specificationName);

        Optional<WOWClass> wowClass = findWOWClass(className);
        if (wowClass.isPresent())
            classSpecification.setWowClass((WOWClassEntity) wowClass.get());
        else
            classSpecification.setWowClass(addWOWClass(className));

        return classSpecificationRepository.save(classSpecification);
    }

    @Override
    public Optional<SpecificationDPS> findSpecificationDPS(String specificationName) {
        return Optional.ofNullable(specificationDPSRepository.findBySpecification(
                classSpecificationRepository.findByName(specificationName)
        ));
    }

    @Override
    public Optional<ClassSpecification> findClassSpecification(String name) {

        return Optional.ofNullable(classSpecificationRepository.findByName(name));

    }

    @Override
    public Optional<WOWClass> findWOWClass(String name) {

        return Optional.ofNullable(classRepository.findByName(name));

    }

    @Override
    public List<SpecificationDPS> getAllDPSValues() {
        return ((List<SpecificationDPSEntity>) specificationDPSRepository.findAll())
                                                                         .stream()
                                                                         .sorted((o1, o2) -> o1.getSpecificationDPS() < o2.getSpecificationDPS() ? 1 : (o1 == o2 ? 0 : -1))
                .map(specificationDPSEntity -> (SpecificationDPS) specificationDPSEntity)
                                                                         .collect(Collectors.toList());
    }

    @Override
    public int getMaxDPSValue() {
        return getAllDPSValues().get(0).getSpecificationDPS();
    }

}