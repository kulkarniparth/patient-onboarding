package com.example.patient.onboarding.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Hospital {
    private String hospitalName;
    private String hospitalAddress;
    private String hospitalPhone;
    private String hospitalZip;
}
