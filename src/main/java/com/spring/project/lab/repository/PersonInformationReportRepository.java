package com.spring.project.lab.repository;

import com.spring.project.lab.domain.implementation.PersonInformationReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonInformationReportRepository extends JpaRepository<PersonInformationReport, Integer> {
}
