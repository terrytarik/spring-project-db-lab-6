package com.spring.project.lab.service.implementation;

import com.spring.project.lab.domain.implementation.Description;
import com.spring.project.lab.repository.DescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class DescriptionService extends GeneralService<Description> {

    @Autowired
    DescriptionRepository descriptionRepository;

    @Override
    public JpaRepository<Description, Integer> getRepository() {
        return descriptionRepository;
    }

}
