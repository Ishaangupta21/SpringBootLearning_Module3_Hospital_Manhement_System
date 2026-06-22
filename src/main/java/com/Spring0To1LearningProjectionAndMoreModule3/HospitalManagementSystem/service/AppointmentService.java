package com.Spring0To1LearningProjectionAndMoreModule3.HospitalManagementSystem.service;

import com.Spring0To1LearningProjectionAndMoreModule3.HospitalManagementSystem.entity.Appointment;
import com.Spring0To1LearningProjectionAndMoreModule3.HospitalManagementSystem.entity.Doctor;
import com.Spring0To1LearningProjectionAndMoreModule3.HospitalManagementSystem.entity.Patient;
import com.Spring0To1LearningProjectionAndMoreModule3.HospitalManagementSystem.repository.AppointmentRepository;
import com.Spring0To1LearningProjectionAndMoreModule3.HospitalManagementSystem.repository.DoctorRepository;
import com.Spring0To1LearningProjectionAndMoreModule3.HospitalManagementSystem.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppointmentService {
    private final AppointmentRepository appointmentRepository;
    private final PatientRepository patientRepository;
    private final DoctorRepository doctorRepository;

    @Transactional
    public Appointment createNewAppointment(Appointment appointment, Long patientId, Long doctorId){
        Patient patient = patientRepository.findById(patientId).orElseThrow();
        Doctor doctor = doctorRepository.findById(doctorId).orElseThrow();

        appointment.setDoctor(doctor);
        appointment.setPatient(patient);
        // Transient State --> Appointment

        appointmentRepository.save(appointment);

        // Persistent State --> Appointment

        return appointment;
    }
}
