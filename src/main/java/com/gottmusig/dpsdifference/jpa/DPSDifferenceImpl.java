package com.gottmusig.dpsdifference.jpa;

import com.gottmusig.dpsdifference.domain.api.DPSDifference;
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
        Optional<ClassSpecificationEntity> specificationEntityOptional = findClassSpecification(specificationName);

        if (specificationEntityOptional.isPresent() && isSpecificationAndClassPresent(specificationEntityOptional.get(),className))
                specificationDPS.setSpecification(specificationEntityOptional.get());
        else
            specificationDPS.setSpecification(addClassSpecification(specificationName, className));

        specificationDPSRepository.save(specificationDPS);
    }

    private boolean isSpecificationAndClassPresent(ClassSpecificationEntity classSpecificationEntity, String className) {
        Optional<WOWClassEntity> wowClassEntityOptional = findWOWClass(className);
        return wowClassEntityOptional.isPresent() && classSpecificationEntity.getWOWClass().getName().equals(wowClassEntityOptional.get().getName());
    }

    public WOWClassEntity addWOWClass(String name) {
        WOWClassEntity wowClassEntity = new WOWClassEntity();
        wowClassEntity.setName(name);
        return classRepository.save(wowClassEntity);
    }

    public ClassSpecificationEntity addClassSpecification(String specificationName, String className) {
        ClassSpecificationEntity classSpecification = new ClassSpecificationEntity();
        classSpecification.setName(specificationName);

        Optional<WOWClassEntity> wowClass = findWOWClass(className);
        if (wowClass.isPresent())
            classSpecification.setWowClass(wowClass.get());
        else
            classSpecification.setWowClass(addWOWClass(className));

        return classSpecificationRepository.save(classSpecification);
    }

    @Override
    public Optional<SpecificationDPSEntity> findSpecificationDPS(String specificationName){
        return Optional.ofNullable(specificationDPSRepository.findBySpecification(
                classSpecificationRepository.findByName(specificationName)
        ));
    }

    @Override
    public Optional<ClassSpecificationEntity> findClassSpecification(String name) {

        return Optional.ofNullable(classSpecificationRepository.findByName(name));

    }

    @Override
    public Optional<WOWClassEntity> findWOWClass(String name) {

        return Optional.ofNullable(classRepository.findByName(name));

    }

    @Override
    public List<SpecificationDPSEntity> getAllDPSValues() {
        return ((List<SpecificationDPSEntity>) specificationDPSRepository.findAll())
                                                                         .stream()
                                                                         .sorted((o1, o2) -> o1.getSpecificationDPS() < o2.getSpecificationDPS() ? 1 : (o1 == o2 ? 0 : -1))
                                                                         .collect(Collectors.toList());
    }

    @Override
    public int getMaxDPSValue() {
        return getAllDPSValues().get(0).getSpecificationDPS();
    }

}