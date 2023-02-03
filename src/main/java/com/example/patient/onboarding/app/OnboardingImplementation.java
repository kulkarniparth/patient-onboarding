package com.example.patient.onboarding.app;

import com.example.patient.onboarding.entity.Patient;
import com.example.patient.onboarding.utils.ActivityStubUtils;

public class OnboardingImplementation implements Onboarding{

    Patient onboardingPatient;
    String patientStatus;

    ServiceExecutor serviceExecutor = ActivityStubUtils.getActivitiesStub();

    @Override
    public Patient onBoardNewPatient(Patient patient) {
        onboardingPatient = patient;

        try {
            patientStatus = "Assigning hospital to patient: " + onboardingPatient.getPatientName();
            onboardingPatient.setPatientHospital(
                    serviceExecutor.assignHospitalToPatient(onboardingPatient.getPatientZip())
            );


        } catch (Exception e) {

        }
        return null;
    }

    @Override
    public String getPatientOnBoardingStatus() {
        return null;
    }
}
