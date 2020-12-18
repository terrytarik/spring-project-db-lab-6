package com.spring.project.lab.service.implementation;

import com.spring.project.lab.domain.implementation.CrewAccepted;
import com.spring.project.lab.repository.CrewAcceptedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class CrewAcceptedService extends GeneralService<CrewAccepted> {
    @Autowired
    CrewAcceptedRepository crewAcceptedRepository;

    @Override
    public JpaRepository<CrewAccepted, Integer> getRepository() {
        return crewAcceptedRepository;
    }
}
