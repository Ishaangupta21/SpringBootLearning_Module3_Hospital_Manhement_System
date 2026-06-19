package com.Spring0To1LearningProjectionAndMoreModule3.HospitalManagementSystem.dto;

import com.Spring0To1LearningProjectionAndMoreModule3.HospitalManagementSystem.entity.type.BloodGroupType;
import lombok.Data;

@Data
public class BloodGroupStats {
    private final BloodGroupType bloodGroup;
    private final Long count;
}
