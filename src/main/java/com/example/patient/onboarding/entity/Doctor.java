package com.example.patient.onboarding.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Doctor {
    private String doctorName;
    private String doctorImage;
    private String doctorSpeciality;
}
