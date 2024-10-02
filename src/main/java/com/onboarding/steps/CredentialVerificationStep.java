package com.onboarding.steps;

import com.onboarding.core.Context;
import com.onboarding.core.ProcessStep;

public class CredentialVerificationStep implements ProcessStep {
    private String credentialType;

    public CredentialVerificationStep(String credentialType) {
        this.credentialType = credentialType;
    }

    @Override
    public void execute(Context context) {
        System.out.println("Verifying " + credentialType + " credentials");
        context.put("verifiedCredential", credentialType);
    }

    @Override
    public String getName() {
        return credentialType + " Verification";
    }
}
