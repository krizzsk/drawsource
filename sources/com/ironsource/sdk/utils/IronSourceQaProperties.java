package com.ironsource.sdk.utils;

import java.util.HashMap;
import java.util.Map;

public class IronSourceQaProperties {

    /* renamed from: a */
    private static IronSourceQaProperties f20309a;

    /* renamed from: b */
    private static Map<String, String> f20310b = new HashMap();

    private IronSourceQaProperties() {
    }

    public static IronSourceQaProperties getInstance() {
        if (f20309a == null) {
            f20309a = new IronSourceQaProperties();
        }
        return f20309a;
    }

    public static boolean isInitialized() {
        return f20309a != null;
    }

    public Map<String, String> getParameters() {
        return f20310b;
    }

    public void setQaParameter(String str, String str2) {
        if (str != null && str2 != null) {
            f20310b.put(str, str2);
        }
    }
}
