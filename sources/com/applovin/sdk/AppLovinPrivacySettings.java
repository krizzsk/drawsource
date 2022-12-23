package com.applovin.sdk;

import android.content.Context;
import com.applovin.impl.sdk.C1954j;
import com.applovin.impl.sdk.C2102v;

public class AppLovinPrivacySettings {
    public static boolean hasUserConsent(Context context) {
        C2102v.m5107f("AppLovinPrivacySettings", "hasUserConsent()");
        Boolean a = C1954j.m4423b().mo14489a(context);
        if (a != null) {
            return a.booleanValue();
        }
        return false;
    }

    public static boolean isAgeRestrictedUser(Context context) {
        C2102v.m5107f("AppLovinPrivacySettings", "isAgeRestrictedUser()");
        Boolean a = C1954j.m4418a().mo14489a(context);
        if (a != null) {
            return a.booleanValue();
        }
        return false;
    }

    public static boolean isAgeRestrictedUserSet(Context context) {
        C2102v.m5107f("AppLovinPrivacySettings", "isAgeRestrictedUserSet()");
        return C1954j.m4418a().mo14489a(context) != null;
    }

    public static boolean isDoNotSell(Context context) {
        C2102v.m5107f("AppLovinPrivacySettings", "isDoNotSell()");
        Boolean a = C1954j.m4425c().mo14489a(context);
        if (a != null) {
            return a.booleanValue();
        }
        return false;
    }

    public static boolean isDoNotSellSet(Context context) {
        C2102v.m5107f("AppLovinPrivacySettings", "isDoNotSellSet()");
        return C1954j.m4425c().mo14489a(context) != null;
    }

    public static boolean isUserConsentSet(Context context) {
        C2102v.m5107f("AppLovinPrivacySettings", "isUserConsentSet()");
        return C1954j.m4423b().mo14489a(context) != null;
    }

    public static void setDoNotSell(boolean z, Context context) {
        C2102v.m5107f("AppLovinPrivacySettings", "setDoNotSell()");
        if (C1954j.m4426c(z, context)) {
            AppLovinSdk.reinitializeAll((Boolean) null, (Boolean) null, Boolean.valueOf(z));
        }
    }

    public static void setHasUserConsent(boolean z, Context context) {
        C2102v.m5107f("AppLovinPrivacySettings", "setHasUserConsent()");
        if (C1954j.m4424b(z, context)) {
            AppLovinSdk.reinitializeAll(Boolean.valueOf(z), (Boolean) null, (Boolean) null);
        }
    }

    public static void setIsAgeRestrictedUser(boolean z, Context context) {
        C2102v.m5107f("AppLovinPrivacySettings", "setIsAgeRestrictedUser()");
        if (C1954j.m4422a(z, context)) {
            AppLovinSdk.reinitializeAll((Boolean) null, Boolean.valueOf(z), (Boolean) null);
        }
    }
}
