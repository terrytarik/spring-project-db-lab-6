package com.spring.project.lab.repository;

import com.spring.project.lab.domain.implementation.Description;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DescriptionRepository extends JpaRepository<Description,Integer> {
}
