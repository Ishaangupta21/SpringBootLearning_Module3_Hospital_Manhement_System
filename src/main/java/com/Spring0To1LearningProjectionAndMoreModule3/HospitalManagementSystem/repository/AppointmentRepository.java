package com.Spring0To1LearningProjectionAndMoreModule3.HospitalManagementSystem.repository;

import com.Spring0To1LearningProjectionAndMoreModule3.HospitalManagementSystem.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}