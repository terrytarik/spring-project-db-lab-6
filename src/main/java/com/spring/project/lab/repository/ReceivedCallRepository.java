package com.spring.project.lab.repository;

import com.spring.project.lab.domain.implementation.ReceivedCall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceivedCallRepository extends JpaRepository<ReceivedCall, Integer> {
}
