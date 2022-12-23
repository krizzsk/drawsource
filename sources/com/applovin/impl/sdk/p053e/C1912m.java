package com.applovin.impl.sdk.p053e;

import androidx.browser.trusted.sharing.ShareTarget;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.network.C2000c;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.utils.C2050h;
import com.applovin.impl.sdk.utils.Utils;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.m */
public class C1912m extends C1887a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1914a f3537a;

    /* renamed from: com.applovin.impl.sdk.e.m$a */
    public interface C1914a {
        /* renamed from: a */
        void mo14043a();
    }

    public C1912m(C1969m mVar, C1914a aVar) {
        super("TaskFetchVariables", mVar);
        this.f3537a = aVar;
    }

    /* renamed from: a */
    private Map<String, String> m4295a() {
        return Utils.stringifyObjectMap(this.f3496b.mo14529V().mo14821a((Map<String, String>) null, false, false));
    }

    public void run() {
        C19131 r1 = new C1935u<JSONObject>(C2000c.m4627a(this.f3496b).mo14724a(C2050h.m4971k(this.f3496b)).mo14734c(C2050h.m4972l(this.f3496b)).mo14725a(m4295a()).mo14730b(ShareTarget.METHOD_GET).mo14723a(new JSONObject()).mo14729b(((Integer) this.f3496b.mo14534a(C1867b.f3285dc)).intValue()).mo14728a(), this.f3496b) {
            /* renamed from: a */
            public void mo13585a(int i, String str, JSONObject jSONObject) {
                if (C2102v.m5104a()) {
                    mo14370d("Unable to fetch variables: server returned " + i);
                    C2102v.m5110i("AppLovinVariableService", "Failed to load variables.");
                }
                C1912m.this.f3537a.mo14043a();
            }

            /* renamed from: a */
            public void mo13587a(JSONObject jSONObject, int i) {
                C2050h.m4962d(jSONObject, this.f3496b);
                C2050h.m4961c(jSONObject, this.f3496b);
                C2050h.m4966f(jSONObject, this.f3496b);
                C2050h.m4964e(jSONObject, this.f3496b);
                C1912m.this.f3537a.mo14043a();
            }
        };
        r1.mo14453a(C1867b.f3123aX);
        r1.mo14455b(C1867b.f3124aY);
        this.f3496b.mo14526S().mo14428a((C1887a) r1);
    }
}
