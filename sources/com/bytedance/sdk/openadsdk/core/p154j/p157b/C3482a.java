package com.bytedance.sdk.openadsdk.core.p154j.p157b;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.p154j.p157b.C3487c;
import com.facebook.internal.security.CertificateUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.j.b.a */
/* compiled from: VastAbsoluteProgressTracker */
public class C3482a extends C3487c implements Comparable<C3482a> {

    /* renamed from: a */
    public long f8698a;

    protected C3482a(long j, String str, C3487c.C3490b bVar, Boolean bool) {
        super(str, bVar, bool);
        this.f8698a = j;
    }

    /* renamed from: a */
    public static int m10833a(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        String[] split = str.split(CertificateUtil.DELIMITER);
        if (split.length == 3) {
            try {
                return (int) (((float) ((Integer.parseInt(split[0]) * 60 * 60 * 1000) + (Integer.parseInt(split[1]) * 60 * 1000))) + (Float.parseFloat(split[2]) * 1000.0f));
            } catch (Throwable unused) {
            }
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: a */
    public boolean mo19919a(long j) {
        return this.f8698a <= j && !mo19930e();
    }

    /* renamed from: a */
    public int compareTo(C3482a aVar) {
        if (aVar == null) {
            return 1;
        }
        long j = this.f8698a;
        long j2 = aVar.f8698a;
        if (j > j2) {
            return 1;
        }
        return j < j2 ? -1 : 0;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.j.b.a$a */
    /* compiled from: VastAbsoluteProgressTracker */
    public static class C3483a {

        /* renamed from: a */
        private String f8699a;

        /* renamed from: b */
        private long f8700b;

        /* renamed from: c */
        private C3487c.C3490b f8701c = C3487c.C3490b.TRACKING_URL;

        /* renamed from: d */
        private boolean f8702d = false;

        public C3483a(String str, long j) {
            this.f8699a = str;
            this.f8700b = j;
        }

        /* renamed from: a */
        public C3482a mo19921a() {
            return new C3482a(this.f8700b, this.f8699a, this.f8701c, Boolean.valueOf(this.f8702d));
        }
    }

    /* renamed from: a */
    public JSONObject mo19918a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("content", mo19928c());
        jSONObject.put("trackingMilliseconds", this.f8698a);
        return jSONObject;
    }
}
