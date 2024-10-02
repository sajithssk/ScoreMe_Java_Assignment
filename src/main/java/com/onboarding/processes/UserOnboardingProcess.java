package com.onboarding.processes;

import com.onboarding.core.Context;
import com.onboarding.core.Process;
import com.onboarding.core.ProcessStep;
import java.util.List;

public class UserOnboardingProcess implements Process {
    private final List<ProcessStep> steps;

    public UserOnboardingProcess(List<ProcessStep> steps) {
        this.steps = steps;
    }

    @Override
    public void execute(Context context) {
        for (ProcessStep step : steps) {
            step.execute(context);
        }
    }

    @Override
    public String getName() {
        return "User Onboarding Process";
    }
}
