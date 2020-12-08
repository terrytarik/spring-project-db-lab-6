package com.spring.project.lab.service.implementation;

import com.spring.project.lab.domain.implementation.PersonInformationReport;
import com.spring.project.lab.repository.PersonInformationReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonInformationReportService extends GeneralService<PersonInformationReport> {
    @Autowired
    PersonInformationReportRepository personInformationReportRepository;

    @Override
    public JpaRepository<PersonInformationReport, Integer> getRepository() {
        return personInformationReportRepository;
    }
}
