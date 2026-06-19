package com.Spring0To1LearningProjectionAndMoreModule3.HospitalManagementSystem.repository;

import com.Spring0To1LearningProjectionAndMoreModule3.HospitalManagementSystem.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {
}
