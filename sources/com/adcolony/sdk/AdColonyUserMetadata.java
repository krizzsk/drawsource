package com.adcolony.sdk;

import android.location.Location;

@Deprecated
public class AdColonyUserMetadata {
    public static final String USER_EDUCATION_ASSOCIATES_DEGREE = "associates_degree";
    public static final String USER_EDUCATION_BACHELORS_DEGREE = "bachelors_degree";
    public static final String USER_EDUCATION_GRADE_SCHOOL = "grade_school";
    public static final String USER_EDUCATION_GRADUATE_DEGREE = "graduate_degree";
    public static final String USER_EDUCATION_HIGH_SCHOOL_DIPLOMA = "high_school_diploma";
    public static final String USER_EDUCATION_SOME_COLLEGE = "some_college";
    public static final String USER_EDUCATION_SOME_HIGH_SCHOOL = "some_high_school";
    public static final String USER_FEMALE = "female";
    public static final String USER_MALE = "male";
    public static final String USER_MARRIED = "married";
    public static final String USER_SINGLE = "single";

    /* renamed from: a */
    C0828e1 f190a = C0773c0.m365a();

    /* renamed from: b */
    C0832f1 f191b = C0773c0.m379b();

    /* renamed from: c */
    Location f192c;

    public AdColonyUserMetadata addUserInterest(String str) {
        if (C1047z0.m1270e(str)) {
            C0773c0.m372a(this.f190a, str);
            C0773c0.m374a(this.f191b, "adc_interests", this.f190a);
        }
        return this;
    }

    public AdColonyUserMetadata clearUserInterests() {
        C0828e1 a = C0773c0.m365a();
        this.f190a = a;
        C0773c0.m374a(this.f191b, "adc_interests", a);
        return this;
    }

    public Object getMetadata(String str) {
        return C0773c0.m392g(this.f191b, str);
    }

    public int getUserAge() {
        return C0773c0.m389d(this.f191b, "adc_age");
    }

    public int getUserAnnualHouseholdIncome() {
        return C0773c0.m389d(this.f191b, "adc_household_income");
    }

    public String getUserEducation() {
        return C0773c0.m393h(this.f191b, "adc_education");
    }

    public String getUserGender() {
        return C0773c0.m393h(this.f191b, "adc_gender");
    }

    public String[] getUserInterests() {
        return this.f190a.mo10758d();
    }

    public Location getUserLocation() {
        return this.f192c;
    }

    public String getUserMaritalStatus() {
        return C0773c0.m393h(this.f191b, "adc_marital_status");
    }

    public String getUserZipCode() {
        return C0773c0.m393h(this.f191b, "adc_zip");
    }

    public AdColonyUserMetadata setMetadata(String str, boolean z) {
        if (C1047z0.m1270e(str)) {
            C0773c0.m385b(this.f191b, str, z);
        }
        return this;
    }

    public AdColonyUserMetadata setUserAge(int i) {
        setMetadata("adc_age", (double) i);
        return this;
    }

    public AdColonyUserMetadata setUserAnnualHouseholdIncome(int i) {
        setMetadata("adc_household_income", (double) i);
        return this;
    }

    public AdColonyUserMetadata setUserEducation(String str) {
        if (C1047z0.m1270e(str)) {
            setMetadata("adc_education", str);
        }
        return this;
    }

    public AdColonyUserMetadata setUserGender(String str) {
        if (C1047z0.m1270e(str)) {
            setMetadata("adc_gender", str);
        }
        return this;
    }

    public AdColonyUserMetadata setUserLocation(Location location) {
        this.f192c = location;
        setMetadata("adc_longitude", location.getLongitude());
        setMetadata("adc_latitude", location.getLatitude());
        setMetadata("adc_speed", (double) location.getSpeed());
        setMetadata("adc_altitude", location.getAltitude());
        setMetadata("adc_time", (double) location.getTime());
        setMetadata("adc_accuracy", (double) location.getAccuracy());
        return this;
    }

    public AdColonyUserMetadata setUserMaritalStatus(String str) {
        if (C1047z0.m1270e(str)) {
            setMetadata("adc_marital_status", str);
        }
        return this;
    }

    public AdColonyUserMetadata setUserZipCode(String str) {
        if (C1047z0.m1270e(str)) {
            setMetadata("adc_zip", str);
        }
        return this;
    }

    public AdColonyUserMetadata setMetadata(String str, double d) {
        if (C1047z0.m1270e(str)) {
            C0773c0.m373a(this.f191b, str, d);
        }
        return this;
    }

    public AdColonyUserMetadata setMetadata(String str, String str2) {
        if (C1047z0.m1270e(str2) && C1047z0.m1270e(str)) {
            C0773c0.m376a(this.f191b, str, str2);
        }
        return this;
    }
}
