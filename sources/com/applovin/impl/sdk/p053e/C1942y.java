package com.applovin.impl.sdk.p053e;

import androidx.browser.trusted.sharing.ShareTarget;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.network.C1995b;
import com.applovin.impl.sdk.network.C2000c;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.utils.C2050h;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.y */
public abstract class C1942y extends C1887a {
    protected C1942y(String str, C1969m mVar) {
        super(str, mVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo13596a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13597a(int i) {
        C2050h.m4953a(i, this.f3496b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo13598a(JSONObject jSONObject);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14463a(JSONObject jSONObject, final C1995b.C1999c<JSONObject> cVar) {
        C19431 r0 = new C1935u<JSONObject>(C2000c.m4627a(this.f3496b).mo14724a(C2050h.m4950a(mo13596a(), this.f3496b)).mo14734c(C2050h.m4960b(mo13596a(), this.f3496b)).mo14725a(C2050h.m4963e(this.f3496b)).mo14730b(ShareTarget.METHOD_POST).mo14726a(jSONObject).mo14736d(((Boolean) this.f3496b.mo14534a(C1867b.f3309eA)).booleanValue()).mo14723a(new JSONObject()).mo14722a(mo14374h()).mo14728a(), this.f3496b) {
            /* renamed from: a */
            public void mo13585a(int i, String str, JSONObject jSONObject) {
                cVar.mo13585a(i, str, jSONObject);
            }

            /* renamed from: a */
            public void mo13587a(JSONObject jSONObject, int i) {
                cVar.mo13587a(jSONObject, i);
            }
        };
        r0.mo14453a(C1867b.f3119aT);
        r0.mo14455b(C1867b.f3120aU);
        this.f3496b.mo14526S().mo14428a((C1887a) r0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract int mo14374h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public JSONObject mo14464i() {
        JSONObject jSONObject = new JSONObject();
        String m = this.f3496b.mo14583m();
        if (((Boolean) this.f3496b.mo14534a(C1867b.f3301ds)).booleanValue() && StringUtils.isValidString(m)) {
            JsonUtils.putString(jSONObject, "cuid", m);
        }
        if (((Boolean) this.f3496b.mo14534a(C1867b.f3303du)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.f3496b.mo14584n());
        }
        if (((Boolean) this.f3496b.mo14534a(C1867b.f3305dw)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", this.f3496b.mo14585o());
        }
        mo13598a(jSONObject);
        return jSONObject;
    }
}
