package com.ogury.p376cm.internal;

import com.ogury.p376cm.ConsentActivity;
import com.tapjoy.TapjoyConstants;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ogury.cm.internal.abcbb */
public final class abcbb {

    /* renamed from: a */
    public static final aaaaa f24365a = new aaaaa((bbabb) null);

    /* renamed from: b */
    private final String f24366b;

    /* renamed from: c */
    private final String f24367c;

    /* renamed from: d */
    private final String f24368d;

    /* renamed from: e */
    private final String f24369e;

    /* renamed from: f */
    private final String f24370f;

    /* renamed from: g */
    private final String f24371g;

    /* renamed from: h */
    private final String f24372h;

    /* renamed from: i */
    private final String f24373i;

    /* renamed from: j */
    private final String f24374j;

    /* renamed from: k */
    private final String f24375k;

    /* renamed from: l */
    private final Boolean f24376l;

    /* renamed from: m */
    private final String f24377m;

    /* renamed from: n */
    private final Integer[] f24378n;

    /* renamed from: com.ogury.cm.internal.abcbb$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    public abcbb(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, String str11, Integer[] numArr) {
        this.f24366b = str;
        this.f24367c = str2;
        this.f24368d = str3;
        this.f24369e = str4;
        this.f24370f = str5;
        this.f24371g = str6;
        this.f24372h = str7;
        this.f24373i = str8;
        this.f24374j = str9;
        this.f24375k = str10;
        this.f24376l = bool;
        this.f24377m = str11;
        this.f24378n = numArr;
    }

    /* renamed from: b */
    private final JSONObject m27907b() {
        JSONObject jSONObject = new JSONObject();
        String str = this.f24374j;
        if (str != null) {
            jSONObject.put("retrieval_method", str);
        }
        String str2 = this.f24375k;
        if (str2 != null) {
            jSONObject.put("iab_string", str2);
        }
        Integer[] numArr = this.f24378n;
        boolean z = true;
        if (numArr != null) {
            if (!(numArr.length == 0)) {
                z = false;
            }
        }
        if (!z) {
            JSONArray jSONArray = new JSONArray();
            for (Integer intValue : this.f24378n) {
                jSONArray.put(intValue.intValue());
            }
            jSONObject.put("vendor_ids", jSONArray);
        }
        Boolean bool = this.f24376l;
        if (bool != null) {
            bool.booleanValue();
            jSONObject.put("has_consent", this.f24376l.booleanValue());
        }
        String str3 = this.f24377m;
        if (str3 != null) {
            jSONObject.put("origin", str3);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final JSONObject mo63884a() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        String str = this.f24366b;
        if (str != null) {
            jSONObject2.put("asset_key", str);
        }
        String str2 = this.f24367c;
        if (str2 != null) {
            jSONObject2.put("asset_type", str2);
        }
        String str3 = this.f24368d;
        if (str3 != null) {
            jSONObject2.put("bundle_id", str3);
        }
        String str4 = this.f24372h;
        if (str4 != null) {
            jSONObject2.put("version", str4);
        }
        if (!ConsentActivity.aaaaa.m27630a(jSONObject2)) {
            jSONObject.put(TapjoyConstants.TJC_APP_PLACEMENT, jSONObject2);
        }
        JSONObject jSONObject3 = new JSONObject();
        String str5 = this.f24369e;
        if (str5 != null) {
            jSONObject3.put("module_version", str5);
        }
        if (!ConsentActivity.aaaaa.m27630a(jSONObject3)) {
            jSONObject.put("sdk", jSONObject3);
        }
        JSONObject jSONObject4 = new JSONObject();
        String str6 = this.f24370f;
        if (str6 != null) {
            jSONObject4.put("os", str6);
        }
        String str7 = this.f24371g;
        if (str7 != null) {
            jSONObject4.put(TapjoyConstants.TJC_DEVICE_OS_VERSION_NAME, str7);
        }
        if (!ConsentActivity.aaaaa.m27630a(jSONObject4)) {
            jSONObject.put("device", jSONObject4);
        }
        JSONObject jSONObject5 = new JSONObject();
        String str8 = this.f24373i;
        if (str8 != null) {
            jSONObject5.put("consent_token", str8);
        }
        if (!ConsentActivity.aaaaa.m27630a(m27907b())) {
            jSONObject5.put("consent", m27907b());
        }
        if (!ConsentActivity.aaaaa.m27630a(jSONObject5)) {
            jSONObject.put("privacy_compliancy", jSONObject5);
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abcbb)) {
            return false;
        }
        abcbb abcbb = (abcbb) obj;
        return bbabc.m28051a((Object) this.f24366b, (Object) abcbb.f24366b) && bbabc.m28051a((Object) this.f24367c, (Object) abcbb.f24367c) && bbabc.m28051a((Object) this.f24368d, (Object) abcbb.f24368d) && bbabc.m28051a((Object) this.f24369e, (Object) abcbb.f24369e) && bbabc.m28051a((Object) this.f24370f, (Object) abcbb.f24370f) && bbabc.m28051a((Object) this.f24371g, (Object) abcbb.f24371g) && bbabc.m28051a((Object) this.f24372h, (Object) abcbb.f24372h) && bbabc.m28051a((Object) this.f24373i, (Object) abcbb.f24373i) && bbabc.m28051a((Object) this.f24374j, (Object) abcbb.f24374j) && bbabc.m28051a((Object) this.f24375k, (Object) abcbb.f24375k) && bbabc.m28051a((Object) this.f24376l, (Object) abcbb.f24376l) && bbabc.m28051a((Object) this.f24377m, (Object) abcbb.f24377m) && bbabc.m28051a((Object) this.f24378n, (Object) abcbb.f24378n);
    }

    public final int hashCode() {
        String str = this.f24366b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f24367c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f24368d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f24369e;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f24370f;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f24371g;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f24372h;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f24373i;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f24374j;
        int hashCode9 = (hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.f24375k;
        int hashCode10 = (hashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31;
        Boolean bool = this.f24376l;
        int hashCode11 = (hashCode10 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str11 = this.f24377m;
        int hashCode12 = (hashCode11 + (str11 != null ? str11.hashCode() : 0)) * 31;
        Integer[] numArr = this.f24378n;
        if (numArr != null) {
            i = Arrays.hashCode(numArr);
        }
        return hashCode12 + i;
    }

    public final String toString() {
        return "ExternalRequestBody(assetKey=" + this.f24366b + ", assetType=" + this.f24367c + ", bundleId=" + this.f24368d + ", moduleVersion=" + this.f24369e + ", os=" + this.f24370f + ", osVersion=" + this.f24371g + ", version=" + this.f24372h + ", consentToken=" + this.f24373i + ", retrievalMethod=" + this.f24374j + ", iabString=" + this.f24375k + ", hasConsent=" + this.f24376l + ", origin=" + this.f24377m + ", vendorIds=" + Arrays.toString(this.f24378n) + ")";
    }
}
