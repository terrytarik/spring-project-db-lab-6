package com.spring.project.lab.repository;

import com.spring.project.lab.domain.implementation.EmergencyDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmergencyDetailsRepository extends JpaRepository<EmergencyDetails,Integer> {
}
