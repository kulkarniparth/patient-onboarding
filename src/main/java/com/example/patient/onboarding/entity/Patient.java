package com.example.patient.onboarding.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Patient {
    private String patientId;
    private String patientName;
    private String patientAge;
    private String patientZip;
    private String patientInsurance;
    private String patientInsuranceId;
    private String patientCondition;
    private Hospital patientHospital;
    private Doctor patientDoctor;
    private String patientOnboardedStatus;
    private String patientPhoneNumber;
    private String patientEmail;
    private ContactMethod contactMethod = ContactMethod.TEXT;
}
