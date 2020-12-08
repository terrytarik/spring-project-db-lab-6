package com.spring.project.lab.controller.implementation;

import com.spring.project.lab.domain.implementation.PersonInformationReport;
import com.spring.project.lab.service.GeneralServiceInterface;
import com.spring.project.lab.service.implementation.PersonInformationReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("personInformationReportController")
public class PersonInformationReportController extends GeneralController<PersonInformationReport> {
    @Autowired
    PersonInformationReportService personInformationReportService;

    @Override
    public GeneralServiceInterface<PersonInformationReport> getService() {
        return personInformationReportService;
    }
}