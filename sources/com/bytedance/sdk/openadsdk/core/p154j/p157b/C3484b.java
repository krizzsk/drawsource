package com.bytedance.sdk.openadsdk.core.p154j.p157b;

import com.bytedance.sdk.openadsdk.core.p154j.p157b.C3487c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.j.b.b */
/* compiled from: VastFractionalProgressTracker */
public class C3484b extends C3487c implements Comparable<C3484b> {

    /* renamed from: a */
    private float f8703a;

    private C3484b(float f, String str, C3487c.C3490b bVar, Boolean bool) {
        super(str, bVar, bool);
        this.f8703a = f;
    }

    /* renamed from: a */
    public boolean mo19923a(float f) {
        return this.f8703a <= f && !mo19930e();
    }

    /* renamed from: a */
    public int compareTo(C3484b bVar) {
        if (bVar == null) {
            return 1;
        }
        float f = this.f8703a;
        float f2 = bVar.f8703a;
        if (f > f2) {
            return 1;
        }
        return f < f2 ? -1 : 0;
    }

    /* renamed from: f_ */
    public void mo19926f_() {
        super.mo19926f_();
        float f = this.f8703a;
        if (f != 0.25f) {
            int i = (f > 0.5f ? 1 : (f == 0.5f ? 0 : -1));
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.j.b.b$a */
    /* compiled from: VastFractionalProgressTracker */
    public static class C3486a {

        /* renamed from: a */
        private String f8704a;

        /* renamed from: b */
        private float f8705b;

        /* renamed from: c */
        private C3487c.C3490b f8706c = C3487c.C3490b.TRACKING_URL;

        /* renamed from: d */
        private boolean f8707d = false;

        public C3486a(String str, float f) {
            this.f8704a = str;
            this.f8705b = f;
        }

        /* renamed from: a */
        public C3484b mo19927a() {
            return new C3484b(this.f8705b, this.f8704a, this.f8706c, Boolean.valueOf(this.f8707d));
        }
    }

    /* renamed from: b */
    public JSONObject mo19924b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("content", mo19928c());
        jSONObject.put("trackingFraction", (double) this.f8703a);
        return jSONObject;
    }
}
