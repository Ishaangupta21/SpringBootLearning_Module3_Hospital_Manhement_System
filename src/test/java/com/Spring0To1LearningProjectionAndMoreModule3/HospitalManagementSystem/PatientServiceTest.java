package com.Spring0To1LearningProjectionAndMoreModule3.HospitalManagementSystem;

import com.Spring0To1LearningProjectionAndMoreModule3.HospitalManagementSystem.dto.BloodGroupStats;
import com.Spring0To1LearningProjectionAndMoreModule3.HospitalManagementSystem.dto.CPatientInfo;
import com.Spring0To1LearningProjectionAndMoreModule3.HospitalManagementSystem.dto.IPatientInfo;
import com.Spring0To1LearningProjectionAndMoreModule3.HospitalManagementSystem.entity.Patient;
import com.Spring0To1LearningProjectionAndMoreModule3.HospitalManagementSystem.entity.type.BloodGroupType;
import com.Spring0To1LearningProjectionAndMoreModule3.HospitalManagementSystem.repository.PatientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PatientServiceTest {

    @Autowired
    private PatientRepository patientRepository;

    @Test
    public void testPatient(){
//        List<BloodGroupStats> patientListConcrete = patientRepository.getBloodGroupStats();
//        for(BloodGroupStats p : patientListConcrete) {
//            System.out.println(p);
//        }

        int rowsAffected = patientRepository.updatePatientNameWithId("Peehu Gupta", 1L);
        System.out.println(rowsAffected);
    }



}
