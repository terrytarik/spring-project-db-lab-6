package com.spring.project.lab.controller.implementation;

import com.spring.project.lab.domain.implementation.EmergencyDetails;
import com.spring.project.lab.service.GeneralServiceInterface;
import com.spring.project.lab.service.implementation.EmergencyDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("emergencyDetails")
public class EmergencyDetailsController extends GeneralController<EmergencyDetails> {
    @Autowired
    EmergencyDetailsService emergencyDetailsService;

    @Override
    public GeneralServiceInterface<EmergencyDetails> getService() {
        return emergencyDetailsService;
    }
}
