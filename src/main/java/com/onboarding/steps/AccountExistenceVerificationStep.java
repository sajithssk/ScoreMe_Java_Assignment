package com.onboarding.steps;

import com.onboarding.core.Context;
import com.onboarding.core.ProcessStep;

public class AccountExistenceVerificationStep implements ProcessStep {
    @Override
    public void execute(Context context) {
        System.out.println("Checking if account exists");
        context.put("accountExists", false);
    }

    @Override
    public String getName() {
        return "Account Existence Verification";
    }
}
