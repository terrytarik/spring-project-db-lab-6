package com.spring.project.lab.service.implementation;

import com.spring.project.lab.domain.implementation.EmergencyDetails;
import com.spring.project.lab.repository.EmergencyDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class EmergencyDetailsService extends GeneralService<EmergencyDetails> {
    @Autowired
    EmergencyDetailsRepository emergencyDetailsRepository;

    @Override
    public JpaRepository<EmergencyDetails, Integer> getRepository() {
        return emergencyDetailsRepository;
    }
}
