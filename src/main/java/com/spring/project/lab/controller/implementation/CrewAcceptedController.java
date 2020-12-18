package com.spring.project.lab.controller.implementation;

import com.spring.project.lab.domain.implementation.CrewAccepted;
import com.spring.project.lab.service.GeneralServiceInterface;
import com.spring.project.lab.service.implementation.CrewAcceptedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("crewAccepted")
public class CrewAcceptedController extends GeneralController<CrewAccepted> {
    @Autowired
    CrewAcceptedService crewAcceptedService;

    @Override
    public GeneralServiceInterface<CrewAccepted> getService() {
        return crewAcceptedService;
    }
}
