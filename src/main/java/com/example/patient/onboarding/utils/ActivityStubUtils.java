package com.example.patient.onboarding.utils;

import com.example.patient.onboarding.app.ServiceExecutor;
import io.temporal.activity.ActivityOptions;
import io.temporal.common.RetryOptions;
import io.temporal.workflow.Workflow;

import java.time.Duration;

public class ActivityStubUtils {
    public static ServiceExecutor getActivitiesStub() {
        return Workflow.newActivityStub(
                ServiceExecutor.class,
                ActivityOptions.newBuilder()
                        .setScheduleToCloseTimeout(Duration.ofSeconds(60))
                        .setRetryOptions(RetryOptions.newBuilder()
                                .setBackoffCoefficient(1)
                                .build())
                        .build());

    }
}
