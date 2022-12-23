package com.ogury.p377ed.internal;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.fr */
public final class C10033fr {

    /* renamed from: a */
    private final String f25242a;

    /* renamed from: b */
    private final String f25243b;

    /* renamed from: c */
    private final String f25244c;

    /* renamed from: d */
    private final String f25245d;

    /* renamed from: e */
    private final String f25246e;

    /* renamed from: f */
    private final String f25247f;

    /* renamed from: g */
    private final Boolean f25248g;

    /* renamed from: h */
    private final Boolean f25249h;

    /* renamed from: i */
    private final String f25250i;

    /* renamed from: j */
    private final String f25251j;

    /* renamed from: k */
    private final String f25252k;

    /* renamed from: l */
    private final String f25253l;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10033fr)) {
            return false;
        }
        C10033fr frVar = (C10033fr) obj;
        return C10263mq.m29881a((Object) this.f25242a, (Object) frVar.f25242a) && C10263mq.m29881a((Object) this.f25243b, (Object) frVar.f25243b) && C10263mq.m29881a((Object) this.f25244c, (Object) frVar.f25244c) && C10263mq.m29881a((Object) this.f25245d, (Object) frVar.f25245d) && C10263mq.m29881a((Object) this.f25246e, (Object) frVar.f25246e) && C10263mq.m29881a((Object) this.f25247f, (Object) frVar.f25247f) && C10263mq.m29881a((Object) this.f25248g, (Object) frVar.f25248g) && C10263mq.m29881a((Object) this.f25249h, (Object) frVar.f25249h) && C10263mq.m29881a((Object) this.f25250i, (Object) frVar.f25250i) && C10263mq.m29881a((Object) this.f25251j, (Object) frVar.f25251j) && C10263mq.m29881a((Object) this.f25252k, (Object) frVar.f25252k) && C10263mq.m29881a((Object) this.f25253l, (Object) frVar.f25253l);
    }

    public final int hashCode() {
        int hashCode = ((((((this.f25242a.hashCode() * 31) + this.f25243b.hashCode()) * 31) + this.f25244c.hashCode()) * 31) + this.f25245d.hashCode()) * 31;
        String str = this.f25246e;
        int i = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f25247f.hashCode()) * 31;
        Boolean bool = this.f25248g;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f25249h;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.f25250i;
        int hashCode5 = (((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f25251j.hashCode()) * 31;
        String str3 = this.f25252k;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f25253l;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        return "Token(assetKey=" + this.f25242a + ", moduleVersion=" + this.f25243b + ", orientation=" + this.f25244c + ", timeZone=" + this.f25245d + ", deviceId=" + this.f25246e + ", consentToken=" + this.f25247f + ", isChildUnderCoppa=" + this.f25248g + ", isUnderAgeOfGdprConsent=" + this.f25249h + ", adContentThreshold=" + this.f25250i + ", instanceToken=" + this.f25251j + ", campaignId=" + this.f25252k + ", creativeId=" + this.f25253l + ')';
    }

    private C10033fr(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, String str8) {
        C10263mq.m29882b(str, "assetKey");
        C10263mq.m29882b(str2, "moduleVersion");
        C10263mq.m29882b(str3, TJAdUnitConstants.String.ORIENTATION);
        C10263mq.m29882b(str4, "timeZone");
        C10263mq.m29882b(str6, "consentToken");
        C10263mq.m29882b(str8, "instanceToken");
        this.f25242a = str;
        this.f25243b = str2;
        this.f25244c = str3;
        this.f25245d = str4;
        this.f25246e = str5;
        this.f25247f = str6;
        this.f25248g = bool;
        this.f25249h = bool2;
        this.f25250i = str7;
        this.f25251j = str8;
        this.f25252k = null;
        this.f25253l = null;
    }

    public /* synthetic */ C10033fr(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, String str8, byte b) {
        this(str, str2, str3, str4, str5, str6, bool, bool2, str7, str8);
    }

    /* renamed from: b */
    private String m29128b() {
        return this.f25242a;
    }

    /* renamed from: c */
    private String m29129c() {
        return this.f25243b;
    }

    /* renamed from: d */
    private String m29130d() {
        return this.f25244c;
    }

    /* renamed from: e */
    private String m29131e() {
        return this.f25245d;
    }

    /* renamed from: f */
    private String m29132f() {
        return this.f25246e;
    }

    /* renamed from: g */
    private String m29133g() {
        return this.f25247f;
    }

    /* renamed from: h */
    private Boolean m29134h() {
        return this.f25248g;
    }

    /* renamed from: i */
    private Boolean m29135i() {
        return this.f25249h;
    }

    /* renamed from: j */
    private String m29136j() {
        return this.f25250i;
    }

    /* renamed from: k */
    private String m29137k() {
        return this.f25251j;
    }

    /* renamed from: l */
    private String m29138l() {
        return this.f25252k;
    }

    /* renamed from: m */
    private String m29139m() {
        return this.f25253l;
    }

    /* renamed from: a */
    public final JSONObject mo64726a() {
        JSONObject jSONObject = new JSONObject();
        JSONObject n = m29140n();
        if (!C10050ge.m29189a(n)) {
            jSONObject.put(TapjoyConstants.TJC_APP_PLACEMENT, n);
        }
        JSONObject o = m29141o();
        if (!C10050ge.m29189a(o)) {
            jSONObject.put("ad", o);
        }
        JSONObject p = m29142p();
        if (!C10050ge.m29189a(p)) {
            jSONObject.put("sdk", p);
        }
        JSONObject q = m29143q();
        if (!C10050ge.m29189a(q)) {
            jSONObject.put("device", q);
        }
        JSONObject t = m29146t();
        if (!C10050ge.m29189a(t)) {
            jSONObject.put("privacy_compliancy", t);
        }
        JSONObject u = m29147u();
        if (!C10050ge.m29189a(u)) {
            jSONObject.put("targeting", u);
        }
        return jSONObject;
    }

    /* renamed from: n */
    private final JSONObject m29140n() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_key", m29128b());
        jSONObject.put("instance_token", m29137k());
        return jSONObject;
    }

    /* renamed from: o */
    private final JSONObject m29141o() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("campaign_id", m29138l());
        jSONObject.put(CampaignEx.JSON_KEY_CREATIVE_ID, m29139m());
        return jSONObject;
    }

    /* renamed from: p */
    private final JSONObject m29142p() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("module_version", m29129c());
        return jSONObject;
    }

    /* renamed from: q */
    private final JSONObject m29143q() {
        JSONObject jSONObject = new JSONObject();
        JSONObject r = m29144r();
        if (!C10050ge.m29189a(r)) {
            jSONObject.put("screen", r);
        }
        JSONObject s = m29145s();
        if (!C10050ge.m29189a(s)) {
            jSONObject.put("settings", s);
        }
        return jSONObject;
    }

    /* renamed from: r */
    private final JSONObject m29144r() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TJAdUnitConstants.String.ORIENTATION, m29130d());
        return jSONObject;
    }

    /* renamed from: s */
    private final JSONObject m29145s() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("time_zone", m29131e());
        jSONObject.put("device_id", m29132f());
        return jSONObject;
    }

    /* renamed from: t */
    private final JSONObject m29146t() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("consent_token", m29133g());
        if (m29134h() != null) {
            jSONObject.put("is_child_under_coppa", m29134h().booleanValue());
        }
        if (m29135i() != null) {
            jSONObject.put("is_under_age_of_gdpr_consent", m29135i().booleanValue());
        }
        return jSONObject;
    }

    /* renamed from: u */
    private final JSONObject m29147u() {
        JSONObject jSONObject = new JSONObject();
        CharSequence j = m29136j();
        if (!(j == null || j.length() == 0)) {
            jSONObject.put("ad_content_threshold", m29136j());
        }
        return jSONObject;
    }
}
