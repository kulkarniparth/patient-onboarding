package com.example.patient.onboarding.app;

import com.example.patient.onboarding.entity.Patient;
import io.temporal.workflow.WorkflowInterface;
import io.temporal.workflow.WorkflowMethod;

@WorkflowInterface
public interface Onboarding {

    @WorkflowMethod
    Patient onBoardNewPatient(Patient patient);

    @WorkflowMethod
    String getPatientOnBoardingStatus();
}
