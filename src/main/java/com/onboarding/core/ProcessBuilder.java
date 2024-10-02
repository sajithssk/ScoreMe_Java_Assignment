package com.onboarding.core;

import com.onboarding.processes.UserOnboardingProcess;
import java.util.ArrayList;
import java.util.List;

public class ProcessBuilder {
    private final List<ProcessStep> steps = new ArrayList<>();

    public ProcessBuilder addStep(ProcessStep step) {
        steps.add(step);
        return this;
    }

    public Process build() {
        return new UserOnboardingProcess(steps);
    }
}
