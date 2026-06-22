package com.Spring0To1LearningProjectionAndMoreModule3.HospitalManagementSystem.repository;

import com.Spring0To1LearningProjectionAndMoreModule3.HospitalManagementSystem.entity.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceRepository extends JpaRepository<Insurance, Long> {
}