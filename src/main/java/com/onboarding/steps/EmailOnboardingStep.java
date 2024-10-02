package com.onboarding.steps;

import com.onboarding.core.Context;
import com.onboarding.core.ProcessStep;

public class EmailOnboardingStep implements ProcessStep {
    @Override
    public void execute(Context context) {
        System.out.println("Executing Email Onboarding Step");
        context.put("onboardingMethod", "email");
    }

    @Override
    public String getName() {
        return "Email Onboarding";
    }
}
