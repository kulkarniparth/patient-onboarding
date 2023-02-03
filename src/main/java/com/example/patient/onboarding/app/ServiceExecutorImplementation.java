package com.example.patient.onboarding.app;

import com.example.patient.onboarding.entity.Doctor;
import com.example.patient.onboarding.entity.Hospital;

public class ServiceExecutorImplementation implements ServiceExecutor{
    @Override
    public Hospital assignHospitalToPatient(String zip) {
        return null;
    }

    @Override
    public Doctor assignDoctorToPatient(String condition) {
        return null;
    }

    @Override
    public String finalizePatientOnboarding() {
        return null;
    }

    @Override
    public String notifyViaEmail(String email) {
        return null;
    }

    @Override
    public String notifyViaPhone(String phone) {
        return null;
    }

    @Override
    public String notifyViaText(String text) {
        return null;
    }
}
