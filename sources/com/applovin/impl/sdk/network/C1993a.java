package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.p053e.C1887a;
import com.applovin.impl.sdk.p053e.C1935u;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.network.a */
public class C1993a extends C1887a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f3799a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2000c<JSONObject> f3800c;

    public C1993a(String str, C2000c<JSONObject> cVar, C1969m mVar) {
        super("CommunicatorRequestTask:" + str, mVar);
        this.f3799a = str;
        this.f3800c = cVar;
    }

    public void run() {
        this.f3496b.mo14526S().mo14428a((C1887a) new C1935u<JSONObject>(this.f3800c, this.f3496b, mo14373g()) {
            /* renamed from: a */
            public void mo13585a(int i, String str, JSONObject jSONObject) {
                this.f3496b.mo14557ag().mo14485a(C1993a.this.f3799a, C1993a.this.f3800c.mo14701a(), i, jSONObject, str, false);
            }

            /* renamed from: a */
            public void mo13587a(JSONObject jSONObject, int i) {
                this.f3496b.mo14557ag().mo14485a(C1993a.this.f3799a, C1993a.this.f3800c.mo14701a(), i, jSONObject, (String) null, true);
            }
        });
    }
}
