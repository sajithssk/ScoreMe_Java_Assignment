package com.onboarding.core;

public interface ProcessStep {
    void execute(Context context);
    String getName();
}
