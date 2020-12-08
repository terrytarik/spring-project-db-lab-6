package com.spring.project.lab.service.implementation;

import com.spring.project.lab.domain.implementation.ReceivedCall;
import com.spring.project.lab.repository.ReceivedCallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ReceivedCallService extends GeneralService<ReceivedCall> {
    @Autowired
    ReceivedCallRepository receivedCallRepository;

    @Override
    public JpaRepository<ReceivedCall, Integer> getRepository() {
        return receivedCallRepository;
    }
}
