package com.applovin.impl.sdk.p053e;

import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.network.C1995b;
import com.applovin.impl.sdk.p050b.C1864c;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.w */
public abstract class C1938w extends C1942y {
    protected C1938w(String str, C1969m mVar) {
        super(str, mVar);
    }

    /* renamed from: a */
    private JSONObject m4356a(C1864c cVar) {
        JSONObject i = mo14464i();
        JsonUtils.putString(i, IronSourceConstants.EVENTS_RESULT, cVar.mo14273b());
        Map<String, String> a = cVar.mo14272a();
        if (a != null) {
            JsonUtils.putJSONObject(i, "params", new JSONObject(a));
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C1864c mo13599b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo13600b(JSONObject jSONObject);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo13601c();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public int mo14374h() {
        return ((Integer) this.f3496b.mo14534a(C1867b.f3198bt)).intValue();
    }

    public void run() {
        C1864c b = mo13599b();
        if (b != null) {
            if (C2102v.m5104a()) {
                mo14365a("Reporting pending reward: " + b + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            mo14463a(m4356a(b), new C1995b.C1999c<JSONObject>() {
                /* renamed from: a */
                public void mo13585a(int i, String str, JSONObject jSONObject) {
                    C1938w.this.mo13597a(i);
                }

                /* renamed from: a */
                public void mo13587a(JSONObject jSONObject, int i) {
                    C1938w.this.mo13600b(jSONObject);
                }
            });
            return;
        }
        if (C2102v.m5104a()) {
            mo14370d("Pending reward not found");
        }
        mo13601c();
    }
}
