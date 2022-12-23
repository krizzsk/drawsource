package com.bytedance.sdk.openadsdk.core.p154j;

import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.j.a */
/* compiled from: VastAdConfig */
public class C3473a {

    /* renamed from: a */
    C3501d f8664a = new C3501d(this);

    /* renamed from: b */
    C3481b f8665b;

    /* renamed from: c */
    C3491c f8666c;

    /* renamed from: d */
    private String f8667d;

    /* renamed from: e */
    private String f8668e;

    /* renamed from: f */
    private String f8669f;

    /* renamed from: g */
    private String f8670g;

    /* renamed from: h */
    private double f8671h;

    /* renamed from: i */
    private String f8672i;

    /* renamed from: j */
    private String f8673j;

    /* renamed from: a */
    public C3501d mo19887a() {
        return this.f8664a;
    }

    /* renamed from: b */
    public C3481b mo19893b() {
        return this.f8665b;
    }

    /* renamed from: c */
    public C3491c mo19895c() {
        return this.f8666c;
    }

    /* renamed from: d */
    public String mo19897d() {
        return this.f8667d;
    }

    /* renamed from: e */
    public String mo19899e() {
        return this.f8668e;
    }

    /* renamed from: f */
    public String mo19901f() {
        return this.f8669f;
    }

    /* renamed from: g */
    public String mo19903g() {
        return this.f8670g;
    }

    /* renamed from: a */
    public void mo19890a(C3481b bVar) {
        if (bVar != null) {
            bVar.mo19934a(this.f8670g);
        }
        this.f8665b = bVar;
    }

    /* renamed from: a */
    public void mo19891a(C3491c cVar) {
        if (cVar != null) {
            cVar.mo19934a(this.f8670g);
        }
        this.f8666c = cVar;
    }

    /* renamed from: a */
    public void mo19892a(String str) {
        this.f8667d = str;
    }

    /* renamed from: b */
    public void mo19894b(String str) {
        this.f8668e = str;
    }

    /* renamed from: c */
    public void mo19896c(String str) {
        this.f8669f = str;
    }

    /* renamed from: d */
    public void mo19898d(String str) {
        this.f8670g = str;
    }

    /* renamed from: h */
    public double mo19904h() {
        return this.f8671h;
    }

    /* renamed from: a */
    public void mo19888a(double d) {
        this.f8671h = d;
    }

    /* renamed from: i */
    public String mo19905i() {
        String str = this.f8673j;
        if (str == null) {
            return this.f8669f;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -360520052) {
            if (hashCode == 519982247 && str.equals("VAST_END_CARD")) {
                c = 1;
            }
        } else if (str.equals("VAST_ICON")) {
            c = 0;
        }
        if (c == 0) {
            C3481b bVar = this.f8665b;
            return bVar != null ? bVar.f8725h : this.f8669f;
        } else if (c != 1) {
            return this.f8669f;
        } else {
            C3491c cVar = this.f8666c;
            return cVar != null ? cVar.f8725h : this.f8669f;
        }
    }

    /* renamed from: e */
    public void mo19900e(String str) {
        this.f8673j = str;
    }

    /* renamed from: j */
    public JSONObject mo19906j() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("videoTrackers", this.f8664a.mo19945a());
        C3481b bVar = this.f8665b;
        if (bVar != null) {
            jSONObject.put("vastIcon", bVar.mo19916a());
        }
        C3491c cVar = this.f8666c;
        if (cVar != null) {
            jSONObject.put("endCard", cVar.mo19916a());
        }
        jSONObject.put("title", this.f8667d);
        jSONObject.put("description", this.f8668e);
        jSONObject.put("clickThroughUrl", this.f8669f);
        jSONObject.put("videoUrl", this.f8670g);
        jSONObject.put("videDuration", this.f8671h);
        jSONObject.put("tag", this.f8672i);
        return jSONObject;
    }

    /* renamed from: a */
    public static C3473a m10781a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C3473a aVar = new C3473a();
        aVar.f8664a.mo19955a(jSONObject.optJSONObject("videoTrackers"));
        aVar.f8665b = C3481b.m10831a(jSONObject.optJSONObject("vastIcon"));
        aVar.f8666c = C3491c.m10861b(jSONObject.optJSONObject("endCard"));
        aVar.f8667d = jSONObject.optString("title");
        aVar.f8668e = jSONObject.optString("description");
        aVar.f8669f = jSONObject.optString("clickThroughUrl");
        aVar.f8670g = jSONObject.optString("videoUrl");
        aVar.f8671h = jSONObject.optDouble("videDuration");
        aVar.f8672i = jSONObject.optString("tag");
        return aVar;
    }

    /* renamed from: a */
    public void mo19889a(C3431n nVar) {
        this.f8664a.mo19948a(nVar);
    }

    /* renamed from: k */
    public String mo19907k() {
        return this.f8672i;
    }

    /* renamed from: f */
    public void mo19902f(String str) {
        this.f8672i = str;
        this.f8664a.mo19951a(str);
    }
}
