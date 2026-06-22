package com.Spring0To1LearningProjectionAndMoreModule3.HospitalManagementSystem.repository;

import com.Spring0To1LearningProjectionAndMoreModule3.HospitalManagementSystem.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}