package com.applovin.impl.sdk.p049ad;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.ad.d */
public final class C1838d {

    /* renamed from: a */
    private static final Map<String, C1838d> f2965a = new HashMap();

    /* renamed from: b */
    private static final Object f2966b = new Object();

    /* renamed from: c */
    private JSONObject f2967c;

    /* renamed from: d */
    private final String f2968d;

    /* renamed from: e */
    private AppLovinAdSize f2969e;

    /* renamed from: f */
    private AppLovinAdType f2970f;

    private C1838d(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str) {
        String str2;
        if (!TextUtils.isEmpty(str) || !(appLovinAdType == null || appLovinAdSize == null)) {
            this.f2969e = appLovinAdSize;
            this.f2970f = appLovinAdType;
            if (StringUtils.isValidString(str)) {
                str2 = str.trim();
            } else {
                str2 = appLovinAdSize.getLabel() + "_" + appLovinAdType.getLabel();
            }
            this.f2968d = str2.toLowerCase(Locale.ENGLISH);
            return;
        }
        throw new IllegalArgumentException("No zone identifier or type or size specified");
    }

    /* renamed from: a */
    public static C1838d m3901a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType) {
        return m3902a(appLovinAdSize, appLovinAdType, (String) null);
    }

    /* renamed from: a */
    public static C1838d m3902a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str) {
        C1838d dVar = new C1838d(appLovinAdSize, appLovinAdType, str);
        synchronized (f2966b) {
            String str2 = dVar.f2968d;
            if (f2965a.containsKey(str2)) {
                dVar = f2965a.get(str2);
            } else {
                f2965a.put(str2, dVar);
            }
        }
        return dVar;
    }

    /* renamed from: a */
    public static C1838d m3903a(String str) {
        return m3902a((AppLovinAdSize) null, (AppLovinAdType) null, str);
    }

    /* renamed from: a */
    public static void m3904a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("ad_size") && jSONObject.has("ad_type")) {
            synchronized (f2966b) {
                C1838d dVar = f2965a.get(JsonUtils.getString(jSONObject, "zone_id", ""));
                if (dVar != null) {
                    dVar.f2969e = AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, "ad_size", ""));
                    dVar.f2970f = AppLovinAdType.fromString(JsonUtils.getString(jSONObject, "ad_type", ""));
                }
            }
        }
    }

    /* renamed from: b */
    public static C1838d m3905b(String str) {
        return m3902a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED, str);
    }

    /* renamed from: f */
    public static Collection<C1838d> m3906f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(6);
        Collections.addAll(linkedHashSet, new C1838d[]{m3907g(), m3908h(), m3909i(), m3910j(), m3911k(), m3912l()});
        return Collections.unmodifiableSet(linkedHashSet);
    }

    /* renamed from: g */
    public static C1838d m3907g() {
        return m3901a(AppLovinAdSize.BANNER, AppLovinAdType.REGULAR);
    }

    /* renamed from: h */
    public static C1838d m3908h() {
        return m3901a(AppLovinAdSize.MREC, AppLovinAdType.REGULAR);
    }

    /* renamed from: i */
    public static C1838d m3909i() {
        return m3901a(AppLovinAdSize.LEADER, AppLovinAdType.REGULAR);
    }

    /* renamed from: j */
    public static C1838d m3910j() {
        return m3901a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.REGULAR);
    }

    /* renamed from: k */
    public static C1838d m3911k() {
        return m3901a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED);
    }

    /* renamed from: l */
    public static C1838d m3912l() {
        return m3901a(AppLovinAdSize.NATIVE, AppLovinAdType.NATIVE);
    }

    /* renamed from: a */
    public String mo14154a() {
        return this.f2968d;
    }

    /* renamed from: b */
    public MaxAdFormat mo14155b() {
        AppLovinAdSize c = mo14156c();
        if (c == AppLovinAdSize.BANNER) {
            return MaxAdFormat.BANNER;
        }
        if (c == AppLovinAdSize.LEADER) {
            return MaxAdFormat.LEADER;
        }
        if (c == AppLovinAdSize.MREC) {
            return MaxAdFormat.MREC;
        }
        if (c == AppLovinAdSize.CROSS_PROMO) {
            return MaxAdFormat.CROSS_PROMO;
        }
        if (c == AppLovinAdSize.INTERSTITIAL) {
            if (mo14157d() == AppLovinAdType.REGULAR) {
                return MaxAdFormat.INTERSTITIAL;
            }
            if (mo14157d() == AppLovinAdType.INCENTIVIZED) {
                return MaxAdFormat.REWARDED;
            }
            if (mo14157d() == AppLovinAdType.AUTO_INCENTIVIZED) {
                return MaxAdFormat.REWARDED_INTERSTITIAL;
            }
            return null;
        } else if (c == AppLovinAdSize.NATIVE) {
            return MaxAdFormat.NATIVE;
        } else {
            return null;
        }
    }

    /* renamed from: c */
    public AppLovinAdSize mo14156c() {
        if (this.f2969e == null && JsonUtils.valueExists(this.f2967c, "ad_size")) {
            this.f2969e = AppLovinAdSize.fromString(JsonUtils.getString(this.f2967c, "ad_size", (String) null));
        }
        return this.f2969e;
    }

    /* renamed from: d */
    public AppLovinAdType mo14157d() {
        if (this.f2970f == null && JsonUtils.valueExists(this.f2967c, "ad_type")) {
            this.f2970f = AppLovinAdType.fromString(JsonUtils.getString(this.f2967c, "ad_type", (String) null));
        }
        return this.f2970f;
    }

    /* renamed from: e */
    public boolean mo14158e() {
        return m3906f().contains(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f2968d.equalsIgnoreCase(((C1838d) obj).f2968d);
    }

    public int hashCode() {
        return this.f2968d.hashCode();
    }

    public String toString() {
        return "AdZone{id=" + this.f2968d + ", zoneObject=" + this.f2967c + '}';
    }
}
