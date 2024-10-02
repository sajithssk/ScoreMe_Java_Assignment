package com.onboarding;

import com.onboarding.core.Context;
import com.onboarding.core.Process;
import com.onboarding.core.ProcessBuilder;
import com.onboarding.steps.AccountExistenceVerificationStep;
import com.onboarding.steps.CredentialVerificationStep;
import com.onboarding.steps.EmailOnboardingStep;
import com.onboarding.steps.MobileOnboardingStep;


public class Main {
    public static void main(String[] args) {
        // Creating a process with mobile onboarding and Aadhaar verification
        Process mobileAadhaarProcess = new ProcessBuilder()
                .addStep(new MobileOnboardingStep())
                .addStep(new CredentialVerificationStep("Aadhaar"))
                .addStep(new AccountExistenceVerificationStep())
                .build();

        Context context1 = new Context();
        mobileAadhaarProcess.execute(context1);

        // Creating a different process with email onboarding and PAN verification
        Process emailPanProcess = new ProcessBuilder()
                .addStep(new EmailOnboardingStep())
                .addStep(new CredentialVerificationStep("PAN"))
                .addStep(new AccountExistenceVerificationStep())
                .build();

        Context context2 = new Context();
        emailPanProcess.execute(context2);
    }
}
