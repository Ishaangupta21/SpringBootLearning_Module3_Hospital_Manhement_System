package com.Spring0To1LearningProjectionAndMoreModule3.HospitalManagementSystem.repository;

import com.Spring0To1LearningProjectionAndMoreModule3.HospitalManagementSystem.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}