package com.spring.project.lab.controller.implementation;

import com.spring.project.lab.domain.implementation.ReceivedCall;
import com.spring.project.lab.service.GeneralServiceInterface;
import com.spring.project.lab.service.implementation.ReceivedCallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("receivedCall")
public class ReceivedCallController extends GeneralController<ReceivedCall> {
    @Autowired
    ReceivedCallService receivedCallService;

    @Override
    public GeneralServiceInterface<ReceivedCall> getService() {
        return receivedCallService;
    }
}
