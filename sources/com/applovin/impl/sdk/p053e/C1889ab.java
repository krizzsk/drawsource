package com.applovin.impl.sdk.p053e;

import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.network.C1995b;
import com.applovin.impl.sdk.p050b.C1864c;
import com.applovin.impl.sdk.p051c.C1867b;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.ab */
public abstract class C1889ab extends C1942y {
    protected C1889ab(String str, C1969m mVar) {
        super(str, mVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m4199b(JSONObject jSONObject) {
        C1864c c = m4200c(jSONObject);
        if (c != null) {
            mo13602a(c);
            if (C2102v.m5104a()) {
                mo14365a("Pending reward handled: " + c);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        r3 = java.util.Collections.emptyMap();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0020 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.applovin.impl.sdk.p050b.C1864c m4200c(org.json.JSONObject r3) {
        /*
            r2 = this;
            org.json.JSONObject r0 = com.applovin.impl.sdk.utils.C2050h.m4952a((org.json.JSONObject) r3)     // Catch:{ JSONException -> 0x0032 }
            com.applovin.impl.sdk.m r1 = r2.f3496b     // Catch:{ JSONException -> 0x0032 }
            com.applovin.impl.sdk.utils.C2050h.m4962d(r0, r1)     // Catch:{ JSONException -> 0x0032 }
            com.applovin.impl.sdk.m r1 = r2.f3496b     // Catch:{ JSONException -> 0x0032 }
            com.applovin.impl.sdk.utils.C2050h.m4961c(r3, r1)     // Catch:{ JSONException -> 0x0032 }
            com.applovin.impl.sdk.m r1 = r2.f3496b     // Catch:{ JSONException -> 0x0032 }
            com.applovin.impl.sdk.utils.C2050h.m4964e(r3, r1)     // Catch:{ JSONException -> 0x0032 }
            java.lang.String r3 = "params"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x0020 }
            org.json.JSONObject r3 = (org.json.JSONObject) r3     // Catch:{ all -> 0x0020 }
            java.util.Map r3 = com.applovin.impl.sdk.utils.JsonUtils.toStringMap(r3)     // Catch:{ all -> 0x0020 }
            goto L_0x0024
        L_0x0020:
            java.util.Map r3 = java.util.Collections.emptyMap()     // Catch:{ JSONException -> 0x0032 }
        L_0x0024:
            java.lang.String r1 = "result"
            java.lang.String r0 = r0.getString(r1)     // Catch:{ all -> 0x002b }
            goto L_0x002d
        L_0x002b:
            java.lang.String r0 = "network_timeout"
        L_0x002d:
            com.applovin.impl.sdk.b.c r3 = com.applovin.impl.sdk.p050b.C1864c.m4069a(r0, r3)     // Catch:{ JSONException -> 0x0032 }
            return r3
        L_0x0032:
            r3 = move-exception
            boolean r0 = com.applovin.impl.sdk.C2102v.m5104a()
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = "Unable to parse API response"
            r2.mo14366a(r0, r3)
        L_0x003e:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.p053e.C1889ab.m4200c(org.json.JSONObject):com.applovin.impl.sdk.b.c");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo13602a(C1864c cVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo13603b();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public int mo14374h() {
        return ((Integer) this.f3496b.mo14534a(C1867b.f3197bs)).intValue();
    }

    public void run() {
        mo14463a(mo14464i(), new C1995b.C1999c<JSONObject>() {
            /* renamed from: a */
            public void mo13585a(int i, String str, JSONObject jSONObject) {
                if (!C1889ab.this.mo13603b()) {
                    if (C2102v.m5104a()) {
                        C1889ab abVar = C1889ab.this;
                        abVar.mo14370d("Reward validation failed with code " + i + " and error: " + str);
                    }
                    C1889ab.this.mo13597a(i);
                } else if (C2102v.m5104a()) {
                    C1889ab abVar2 = C1889ab.this;
                    abVar2.mo14370d("Reward validation failed with error code " + i + " but task was cancelled already");
                }
            }

            /* renamed from: a */
            public void mo13587a(JSONObject jSONObject, int i) {
                if (!C1889ab.this.mo13603b()) {
                    if (C2102v.m5104a()) {
                        C1889ab abVar = C1889ab.this;
                        abVar.mo14365a("Reward validation succeeded with code " + i + " and response: " + jSONObject);
                    }
                    C1889ab.this.m4199b(jSONObject);
                } else if (C2102v.m5104a()) {
                    C1889ab abVar2 = C1889ab.this;
                    abVar2.mo14370d("Reward validation succeeded with code " + i + " but task was cancelled already");
                    C1889ab abVar3 = C1889ab.this;
                    abVar3.mo14370d("Response: " + jSONObject);
                }
            }
        });
    }
}
