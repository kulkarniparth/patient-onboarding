package com.example.patient.onboarding.app;

import com.example.patient.onboarding.entity.Doctor;
import com.example.patient.onboarding.entity.Hospital;
import io.temporal.activity.ActivityInterface;

@ActivityInterface
public interface ServiceExecutor {
    Hospital assignHospitalToPatient(String zip);
    Doctor assignDoctorToPatient(String condition);
    String finalizePatientOnboarding();
    String notifyViaEmail(String email);
    String notifyViaPhone(String phone);
    String notifyViaText(String text);
}
