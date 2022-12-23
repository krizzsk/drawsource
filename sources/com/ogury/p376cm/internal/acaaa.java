package com.ogury.p376cm.internal;

import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ogury.p376cm.ConsentActivity;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ogury.cm.internal.acaaa */
public final class acaaa {

    /* renamed from: a */
    public static final aaaaa f24397a = new aaaaa((bbabb) null);

    /* renamed from: b */
    private final String f24398b;

    /* renamed from: c */
    private final String f24399c;

    /* renamed from: d */
    private final String f24400d;

    /* renamed from: e */
    private final String f24401e;

    /* renamed from: f */
    private final String f24402f;

    /* renamed from: g */
    private final String f24403g;

    /* renamed from: h */
    private final String f24404h;

    /* renamed from: i */
    private final String f24405i;

    /* renamed from: j */
    private final String f24406j;

    /* renamed from: k */
    private final Integer f24407k;

    /* renamed from: l */
    private final Integer f24408l;

    /* renamed from: m */
    private final String f24409m;

    /* renamed from: n */
    private final String f24410n;

    /* renamed from: o */
    private final Double f24411o;

    /* renamed from: p */
    private final String f24412p;

    /* renamed from: q */
    private final String f24413q;

    /* renamed from: r */
    private final String f24414r;

    /* renamed from: s */
    private final String f24415s;

    /* renamed from: t */
    private final String f24416t;

    /* renamed from: u */
    private final Boolean f24417u;

    /* renamed from: v */
    private final Boolean f24418v;

    /* renamed from: w */
    private final Boolean f24419w;

    /* renamed from: com.ogury.cm.internal.acaaa$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    public acaaa(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, Integer num2, String str10, String str11, Double d, String str12, String str13, String str14, String str15, String str16, Boolean bool, Boolean bool2, Boolean bool3) {
        this.f24398b = str;
        this.f24399c = str2;
        this.f24400d = str3;
        this.f24401e = str4;
        this.f24402f = str5;
        this.f24403g = str6;
        this.f24404h = str7;
        this.f24405i = str8;
        this.f24406j = str9;
        this.f24407k = num;
        this.f24408l = num2;
        this.f24409m = str10;
        this.f24410n = str11;
        this.f24411o = d;
        this.f24412p = str12;
        this.f24413q = str13;
        this.f24414r = str14;
        this.f24415s = str15;
        this.f24416t = str16;
        this.f24417u = bool;
        this.f24418v = bool2;
        this.f24419w = bool3;
    }

    /* renamed from: a */
    private static JSONArray m27919a(String str) {
        JSONArray jSONArray = new JSONArray(str);
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            System.out.print(jSONObject.toString() + "\n");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("product_id", jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID));
            jSONObject2.put("purchase_token", jSONObject.getString(SDKConstants.PARAM_PURCHASE_TOKEN));
            jSONArray2.put(jSONObject2);
        }
        return jSONArray2;
    }

    /* renamed from: a */
    public final JSONObject mo63894a() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        String str = this.f24398b;
        if (str != null) {
            jSONObject2.put("asset_key", str);
        }
        String str2 = this.f24399c;
        if (str2 != null) {
            jSONObject2.put("asset_type", str2);
        }
        String str3 = this.f24400d;
        if (str3 != null) {
            jSONObject2.put("bundle_id", str3);
        }
        String str4 = this.f24404h;
        if (str4 != null) {
            jSONObject2.put("version", str4);
        }
        if (!ConsentActivity.aaaaa.m27630a(jSONObject2)) {
            jSONObject.put(TapjoyConstants.TJC_APP_PLACEMENT, jSONObject2);
        }
        JSONObject jSONObject3 = new JSONObject();
        String str5 = this.f24401e;
        if (str5 != null) {
            jSONObject3.put("module_version", str5);
        }
        if (!ConsentActivity.aaaaa.m27630a(jSONObject3)) {
            jSONObject.put("sdk", jSONObject3);
        }
        JSONObject jSONObject4 = new JSONObject();
        String str6 = this.f24402f;
        if (str6 != null) {
            jSONObject4.put("os", str6);
        }
        String str7 = this.f24403g;
        if (str7 != null) {
            jSONObject4.put(TapjoyConstants.TJC_DEVICE_OS_VERSION_NAME, str7);
        }
        String str8 = this.f24405i;
        if (str8 != null) {
            jSONObject4.put("manufacturer", str8);
        }
        String str9 = this.f24406j;
        if (str9 != null) {
            jSONObject4.put(DeviceRequestsHelper.DEVICE_INFO_MODEL, str9);
        }
        JSONObject jSONObject5 = new JSONObject();
        Integer num = this.f24407k;
        if (num != null) {
            jSONObject5.put("height", num.intValue());
        }
        String str10 = this.f24409m;
        if (str10 != null) {
            jSONObject5.put("ui_mode", str10);
        }
        String str11 = this.f24410n;
        if (str11 != null) {
            jSONObject5.put("layout_size", str11);
        }
        Integer num2 = this.f24408l;
        if (num2 != null) {
            jSONObject5.put("width", num2.intValue());
        }
        Double d = this.f24411o;
        if (d != null) {
            jSONObject5.put("density", d.doubleValue());
        }
        if (!ConsentActivity.aaaaa.m27630a(jSONObject5)) {
            jSONObject4.put("screen", jSONObject5);
        }
        JSONObject jSONObject6 = new JSONObject();
        JSONObject jSONObject7 = new JSONObject();
        String str12 = this.f24413q;
        if (str12 != null) {
            jSONObject7.put("country", str12);
        }
        String str13 = this.f24412p;
        if (str13 != null) {
            jSONObject7.put("language", str13);
        }
        if (!ConsentActivity.aaaaa.m27630a(jSONObject7)) {
            jSONObject6.put("locale", jSONObject7);
        }
        if (!ConsentActivity.aaaaa.m27630a(jSONObject6)) {
            jSONObject4.put("settings", jSONObject6);
        }
        JSONObject jSONObject8 = new JSONObject();
        String str14 = this.f24414r;
        if (str14 != null) {
            jSONObject8.put("connectivity", str14);
        }
        if (!ConsentActivity.aaaaa.m27630a(jSONObject8)) {
            jSONObject4.put("network", jSONObject8);
        }
        if (!ConsentActivity.aaaaa.m27630a(jSONObject4)) {
            jSONObject.put("device", jSONObject4);
        }
        JSONObject jSONObject9 = new JSONObject();
        String str15 = this.f24415s;
        if (str15 != null) {
            jSONObject9.put("consent_token", str15);
        }
        Boolean bool = this.f24418v;
        if (bool != null) {
            bool.booleanValue();
            jSONObject9.put("is_child_under_coppa", this.f24418v.booleanValue());
        }
        Boolean bool2 = this.f24419w;
        if (bool2 != null) {
            bool2.booleanValue();
            jSONObject9.put("is_under_age_of_gdpr_consent", this.f24419w.booleanValue());
        }
        if (!ConsentActivity.aaaaa.m27630a(jSONObject9)) {
            jSONObject.put("privacy_compliancy", jSONObject9);
        }
        JSONObject jSONObject10 = new JSONObject();
        Boolean bool3 = this.f24417u;
        if (bool3 != null) {
            jSONObject10.put(TJAdUnitConstants.String.ENABLED, bool3.booleanValue());
        }
        CharSequence charSequence = this.f24416t;
        if (!(charSequence == null || charSequence.length() == 0)) {
            jSONObject10.put("purchase_tokens", m27919a(this.f24416t));
        }
        if (!ConsentActivity.aaaaa.m27630a(jSONObject10)) {
            jSONObject.put("billing", jSONObject10);
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof acaaa)) {
            return false;
        }
        acaaa acaaa = (acaaa) obj;
        return bbabc.m28051a((Object) this.f24398b, (Object) acaaa.f24398b) && bbabc.m28051a((Object) this.f24399c, (Object) acaaa.f24399c) && bbabc.m28051a((Object) this.f24400d, (Object) acaaa.f24400d) && bbabc.m28051a((Object) this.f24401e, (Object) acaaa.f24401e) && bbabc.m28051a((Object) this.f24402f, (Object) acaaa.f24402f) && bbabc.m28051a((Object) this.f24403g, (Object) acaaa.f24403g) && bbabc.m28051a((Object) this.f24404h, (Object) acaaa.f24404h) && bbabc.m28051a((Object) this.f24405i, (Object) acaaa.f24405i) && bbabc.m28051a((Object) this.f24406j, (Object) acaaa.f24406j) && bbabc.m28051a((Object) this.f24407k, (Object) acaaa.f24407k) && bbabc.m28051a((Object) this.f24408l, (Object) acaaa.f24408l) && bbabc.m28051a((Object) this.f24409m, (Object) acaaa.f24409m) && bbabc.m28051a((Object) this.f24410n, (Object) acaaa.f24410n) && bbabc.m28051a((Object) this.f24411o, (Object) acaaa.f24411o) && bbabc.m28051a((Object) this.f24412p, (Object) acaaa.f24412p) && bbabc.m28051a((Object) this.f24413q, (Object) acaaa.f24413q) && bbabc.m28051a((Object) this.f24414r, (Object) acaaa.f24414r) && bbabc.m28051a((Object) this.f24415s, (Object) acaaa.f24415s) && bbabc.m28051a((Object) this.f24416t, (Object) acaaa.f24416t) && bbabc.m28051a((Object) this.f24417u, (Object) acaaa.f24417u) && bbabc.m28051a((Object) this.f24418v, (Object) acaaa.f24418v) && bbabc.m28051a((Object) this.f24419w, (Object) acaaa.f24419w);
    }

    public final int hashCode() {
        String str = this.f24398b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f24399c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f24400d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f24401e;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f24402f;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f24403g;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f24404h;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f24405i;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f24406j;
        int hashCode9 = (hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        Integer num = this.f24407k;
        int hashCode10 = (hashCode9 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f24408l;
        int hashCode11 = (hashCode10 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str10 = this.f24409m;
        int hashCode12 = (hashCode11 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.f24410n;
        int hashCode13 = (hashCode12 + (str11 != null ? str11.hashCode() : 0)) * 31;
        Double d = this.f24411o;
        int hashCode14 = (hashCode13 + (d != null ? d.hashCode() : 0)) * 31;
        String str12 = this.f24412p;
        int hashCode15 = (hashCode14 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.f24413q;
        int hashCode16 = (hashCode15 + (str13 != null ? str13.hashCode() : 0)) * 31;
        String str14 = this.f24414r;
        int hashCode17 = (hashCode16 + (str14 != null ? str14.hashCode() : 0)) * 31;
        String str15 = this.f24415s;
        int hashCode18 = (hashCode17 + (str15 != null ? str15.hashCode() : 0)) * 31;
        String str16 = this.f24416t;
        int hashCode19 = (hashCode18 + (str16 != null ? str16.hashCode() : 0)) * 31;
        Boolean bool = this.f24417u;
        int hashCode20 = (hashCode19 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f24418v;
        int hashCode21 = (hashCode20 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.f24419w;
        if (bool3 != null) {
            i = bool3.hashCode();
        }
        return hashCode21 + i;
    }

    public final String toString() {
        return "RequestBody(assetKey=" + this.f24398b + ", assetType=" + this.f24399c + ", bundleId=" + this.f24400d + ", moduleVersion=" + this.f24401e + ", os=" + this.f24402f + ", osVersion=" + this.f24403g + ", version=" + this.f24404h + ", manufacturer=" + this.f24405i + ", model=" + this.f24406j + ", height=" + this.f24407k + ", width=" + this.f24408l + ", uiMode=" + this.f24409m + ", layoutSize=" + this.f24410n + ", density=" + this.f24411o + ", language=" + this.f24412p + ", country=" + this.f24413q + ", connectivity=" + this.f24414r + ", consentToken=" + this.f24415s + ", purchases=" + this.f24416t + ", enabled=" + this.f24417u + ", isChildUnderCoppa=" + this.f24418v + ", isUnderAgeOfGdprConsent=" + this.f24419w + ")";
    }
}
