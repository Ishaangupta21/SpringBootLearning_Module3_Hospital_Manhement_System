package com.Spring0To1LearningProjectionAndMoreModule3.HospitalManagementSystem.service;

import com.Spring0To1LearningProjectionAndMoreModule3.HospitalManagementSystem.entity.Insurance;
import com.Spring0To1LearningProjectionAndMoreModule3.HospitalManagementSystem.entity.Patient;
import com.Spring0To1LearningProjectionAndMoreModule3.HospitalManagementSystem.repository.InsuranceRepository;
import com.Spring0To1LearningProjectionAndMoreModule3.HospitalManagementSystem.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor // This take care of Constructor DI
public class InsuranceService {


    private final InsuranceRepository insuranceRepository;

    private final PatientRepository patientRepository;

    @Transactional
    public Insurance assignInsuranceToPatient(Insurance insurance, Long patientId){
        Patient patient = patientRepository.findById(patientId).orElseThrow();

        patient.setInsurance(insurance); // this is mandatory since patient owns the Insurance
        // In this step we have Dirtied the patient hence it will have to persist since it is under one single Transaction
        // So, when Dirty Checking will happen it will create an insurance instance and insert and Persist the data by itself
        // this is the power of Spring Data JPA

        insurance.setPatient(patient); //Optional -> Just to maintain  Bi -Directional Mapping
        return insurance;

    }



    @Transactional
    public Insurance updateInsuranceToPatient(Insurance insurance, Long patientId){
        Patient patient = patientRepository.findById(patientId).orElseThrow();

        patient.setInsurance(insurance); // this is mandatory since patient owns the Insurance
        insurance.setPatient(patient); //Optional -> Just to maintain  Bi -Directional Mapping
        return insurance;

    }

    @Transactional
    public Patient removeInsuranceToPatient(Insurance insurance, Long patientId){
        Patient patient = patientRepository.findById(patientId).orElseThrow();

        patient.setInsurance(null); // this is mandatory since patient owns the Insurance
         return  patient;

    }

    // should be in Service Layer since it is a Business Logic and not a Repository Logic
    @Transactional
    public void deletePatient(Long patientId){
        patientRepository.findById(patientId);
        patientRepository.deleteById(patientId);
    }



}
