package com.bytedance.sdk.openadsdk.core.p154j;

import com.bytedance.sdk.openadsdk.core.p154j.p157b.C3487c;
import com.bytedance.sdk.openadsdk.core.p154j.p158c.C3493a;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.j.b */
/* compiled from: VastIcon */
public class C3481b extends C3491c {

    /* renamed from: i */
    private long f8696i;

    /* renamed from: j */
    private long f8697j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3481b(int i, int i2, long j, long j2, C3493a.C3496a aVar, C3493a.C3497b bVar, String str, List<C3487c> list, List<C3487c> list2, String str2) {
        super(i, i2, aVar, bVar, str, list, list2, str2);
        this.f8696i = j;
        this.f8697j = j2;
    }

    /* renamed from: a */
    public JSONObject mo19916a() throws JSONException {
        JSONObject a = super.mo19916a();
        if (a != null) {
            a.put("offset", this.f8696i);
            a.put("duration", this.f8697j);
        }
        return a;
    }

    /* renamed from: a */
    public static C3481b m10831a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        C3491c b = C3491c.m10861b(jSONObject);
        if (b == null) {
            return null;
        }
        long optLong = jSONObject2.optLong("offset", -1);
        long optLong2 = jSONObject2.optLong("duration", -1);
        return new C3481b(b.f8718a, b.f8719b, optLong, optLong2, b.f8720c, b.f8721d, b.f8722e, b.f8723f, b.f8724g, b.f8725h);
    }
}
