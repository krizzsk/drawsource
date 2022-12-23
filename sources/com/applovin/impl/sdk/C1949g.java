package com.applovin.impl.sdk;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinUserSegment;

/* renamed from: com.applovin.impl.sdk.g */
class C1949g implements AppLovinUserSegment {

    /* renamed from: a */
    private String f3631a;

    C1949g() {
    }

    public String getName() {
        return this.f3631a;
    }

    public void setName(String str) {
        if (C2102v.m5104a() && str != null) {
            if (str.length() > 32) {
                C2102v.m5110i("AppLovinUserSegment", "Setting name greater than 32 characters: " + str);
            }
            if (!StringUtils.isAlphaNumeric(str)) {
                C2102v.m5110i("AppLovinUserSegment", "Setting name that is not alphanumeric: " + str);
            }
        }
        this.f3631a = str;
    }

    public String toString() {
        return "AppLovinUserSegment{name=" + getName() + '}';
    }
}
