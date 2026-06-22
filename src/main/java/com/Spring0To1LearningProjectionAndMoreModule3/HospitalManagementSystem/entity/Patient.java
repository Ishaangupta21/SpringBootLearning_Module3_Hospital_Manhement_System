package com.Spring0To1LearningProjectionAndMoreModule3.HospitalManagementSystem.entity;

import com.Spring0To1LearningProjectionAndMoreModule3.HospitalManagementSystem.entity.type.BloodGroupType;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@ToString(exclude = {"appointmentSet", "insurance"})
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDate birthDate;

    private String email;

    private String gender;

    @Enumerated(value = EnumType.STRING)
    private BloodGroupType bloodGroup;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "patient_insurance")// @JoinColumn Annotation can only be used on the owning side of the relationship mapping
    private  Insurance insurance; // This is the owing side

    @OneToMany(mappedBy = "patient")
    private Set<Appointment> appointmentSet = new HashSet<>();
}
