package com.onboarding.core;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private Map<String, Object> data = new HashMap<>();

    public void put(String key, Object value) {
        data.put(key, value);
    }
}

