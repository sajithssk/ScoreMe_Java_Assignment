package com.onboarding.steps;

import com.onboarding.core.Context;
import com.onboarding.core.ProcessStep;

public class MobileOnboardingStep implements ProcessStep {
    @Override
    public void execute(Context context) {
        System.out.println("Executing Mobile Onboarding Step");
        context.put("onboardingMethod", "mobile");
    }

    @Override
    public String getName() {
        return "Mobile Onboarding";
    }
}
