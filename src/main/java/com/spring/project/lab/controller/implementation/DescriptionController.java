package com.spring.project.lab.controller.implementation;

import com.spring.project.lab.domain.implementation.Description;
import com.spring.project.lab.service.GeneralServiceInterface;
import com.spring.project.lab.service.implementation.DescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("description")
public class DescriptionController extends GeneralController<Description> {
    @Autowired
    DescriptionService descriptionService;

    @Override
    public GeneralServiceInterface<Description> getService() {
        return descriptionService;
    }
}

