package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.regex.Pattern;

public class InneractiveUserConfig {

    /* renamed from: a */
    public int f10641a = -1;

    /* renamed from: b */
    public Gender f10642b = null;
    @Deprecated

    /* renamed from: c */
    public String f10643c = null;

    public enum Gender {
        MALE,
        FEMALE
    }

    public static boolean ageIsValid(int i) {
        return i >= 1 && i <= 120;
    }

    public int getAge() {
        return this.f10641a;
    }

    public Gender getGender() {
        return this.f10642b;
    }

    @Deprecated
    public String getZipCode() {
        return this.f10643c;
    }

    public InneractiveUserConfig setAge(int i) {
        if (ageIsValid(i)) {
            this.f10641a = i;
        } else {
            IAlog.m16450e("The Age is invalid. Please use a number between 1 and 120", new Object[0]);
        }
        return this;
    }

    public InneractiveUserConfig setGender(Gender gender) {
        if (gender != null) {
            this.f10642b = gender;
        } else {
            IAlog.m16450e("The gender is invalid. Please use one of the suggested InneractiveAdView.Gender", new Object[0]);
        }
        return this;
    }

    @Deprecated
    public InneractiveUserConfig setZipCode(String str) {
        if (str == null || !Pattern.compile("(^\\d{5}$)|(^\\d{5}-\\d{4}$)").matcher(str).matches()) {
            IAlog.m16448c("The zipcode format is invalid. Please use a valid value.", new Object[0]);
        } else {
            this.f10643c = str;
        }
        return this;
    }
}
