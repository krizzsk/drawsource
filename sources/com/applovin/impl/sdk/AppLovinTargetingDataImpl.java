package com.applovin.impl.sdk;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdContentRating;
import com.applovin.sdk.AppLovinGender;
import com.applovin.sdk.AppLovinTargetingData;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppLovinTargetingDataImpl implements AppLovinTargetingData {

    /* renamed from: a */
    private final Map<String, String> f2841a = new HashMap();

    /* renamed from: b */
    private final Object f2842b = new Object();

    /* renamed from: c */
    private Integer f2843c = null;

    /* renamed from: d */
    private AppLovinGender f2844d = null;

    /* renamed from: e */
    private AppLovinAdContentRating f2845e = null;

    /* renamed from: f */
    private String f2846f = null;

    /* renamed from: g */
    private String f2847g = null;

    /* renamed from: h */
    private List<String> f2848h = null;

    /* renamed from: i */
    private List<String> f2849i = null;

    /* renamed from: a */
    private void m3792a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f2842b) {
                if (StringUtils.isValidString(str2)) {
                    this.f2841a.put(str, str2);
                } else {
                    this.f2841a.remove(str);
                }
            }
        }
    }

    public void clearAll() {
        synchronized (this.f2842b) {
            this.f2841a.clear();
        }
    }

    public Map<String, String> getAllData() {
        HashMap hashMap;
        synchronized (this.f2842b) {
            hashMap = new HashMap(this.f2841a);
        }
        return hashMap;
    }

    public String getEmail() {
        return this.f2846f;
    }

    public AppLovinGender getGender() {
        return this.f2844d;
    }

    public List<String> getInterests() {
        return this.f2849i;
    }

    public List<String> getKeywords() {
        return this.f2848h;
    }

    public AppLovinAdContentRating getMaximumAdContentRating() {
        return this.f2845e;
    }

    public String getPhoneNumber() {
        return this.f2847g;
    }

    public Integer getYearOfBirth() {
        return this.f2843c;
    }

    public void setEmail(String str) {
        m3792a("email", str != null ? StringUtils.toFullSHA1Hash(str.toLowerCase().trim()) : str);
        this.f2846f = str;
    }

    public void setGender(AppLovinGender appLovinGender) {
        String str;
        if (appLovinGender != null) {
            if (appLovinGender == AppLovinGender.FEMALE) {
                str = "F";
            } else if (appLovinGender == AppLovinGender.MALE) {
                str = "M";
            } else if (appLovinGender == AppLovinGender.OTHER) {
                str = "O";
            }
            m3792a(InneractiveMediationDefs.KEY_GENDER, str);
            this.f2844d = appLovinGender;
        }
        str = null;
        m3792a(InneractiveMediationDefs.KEY_GENDER, str);
        this.f2844d = appLovinGender;
    }

    public void setInterests(List<String> list) {
        m3792a("interests", list == null ? null : CollectionUtils.implode(list, list.size()));
        this.f2849i = list;
    }

    public void setKeywords(List<String> list) {
        m3792a("keywords", list == null ? null : CollectionUtils.implode(list, list.size()));
        this.f2848h = list;
    }

    public void setMaximumAdContentRating(AppLovinAdContentRating appLovinAdContentRating) {
        m3792a("maximum_ad_content_rating", (appLovinAdContentRating == null || appLovinAdContentRating == AppLovinAdContentRating.NONE) ? null : Integer.toString(appLovinAdContentRating.ordinal()));
        this.f2845e = appLovinAdContentRating;
    }

    public void setPhoneNumber(String str) {
        m3792a("phone_number", str != null ? StringUtils.toFullSHA1Hash(str.replaceAll("[^0-9]", "")) : str);
        this.f2847g = str;
    }

    public void setYearOfBirth(Integer num) {
        m3792a("year_of_birth", num == null ? null : Integer.toString(num.intValue()));
        this.f2843c = num;
    }
}
