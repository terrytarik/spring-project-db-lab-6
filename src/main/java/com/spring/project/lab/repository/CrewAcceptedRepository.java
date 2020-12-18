package com.spring.project.lab.repository;

import com.spring.project.lab.domain.implementation.CrewAccepted;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrewAcceptedRepository extends JpaRepository<CrewAccepted, Integer> {
}
