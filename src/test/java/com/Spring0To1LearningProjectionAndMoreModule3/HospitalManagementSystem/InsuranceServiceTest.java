package com.Spring0To1LearningProjectionAndMoreModule3.HospitalManagementSystem;

import com.Spring0To1LearningProjectionAndMoreModule3.HospitalManagementSystem.entity.Appointment;
import com.Spring0To1LearningProjectionAndMoreModule3.HospitalManagementSystem.entity.Insurance;
import com.Spring0To1LearningProjectionAndMoreModule3.HospitalManagementSystem.service.AppointmentService;
import com.Spring0To1LearningProjectionAndMoreModule3.HospitalManagementSystem.service.InsuranceService;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest
public class InsuranceServiceTest {

    @Autowired
    private InsuranceService insuranceService;

    @Autowired
    private AppointmentService appointmentService;

    @Test
    public void testAssignInsuranceToPatient(){
        Insurance insurance = Insurance.builder()
                .provider("HDFC Ergo")
                .policyNumber("HDFC_23G")
                .validUntil(LocalDate.of(2030,10,10))
                .build();

        Insurance updatedInsurance = insuranceService.assignInsuranceToPatient(insurance,2L);

        System.out.println(updatedInsurance);
    }

    @Test
    @Transactional
    public void testNewAppointment(){
        Appointment appointment = Appointment.builder()
                .appointmentTime(LocalDateTime.of(2026,1,1,1,1,1))
                .reason("Typhoid")
                .build();

        var updatedAppointment = appointmentService.createNewAppointment(appointment,1L,1L);
        System.out.println(updatedAppointment);
    }
}
