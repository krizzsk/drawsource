package com.applovin.impl.mediation.debugger.p037b.p039b;

import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.utils.C2045d;
import com.applovin.impl.sdk.utils.C2050h;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.b.b.c */
public class C1674c {

    /* renamed from: a */
    private final boolean f2420a;

    /* renamed from: b */
    private final boolean f2421b;

    /* renamed from: c */
    private final boolean f2422c;

    /* renamed from: d */
    private final String f2423d;

    public C1674c(JSONObject jSONObject, C1969m mVar) {
        this.f2420a = C2045d.m4928a(mVar.mo14520L()).mo14891a();
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "cleartext_traffic", (JSONObject) null);
        boolean z = false;
        if (jSONObject2 != null) {
            this.f2421b = true;
            this.f2423d = JsonUtils.getString(jSONObject2, "description", "");
            if (C2050h.m4955a()) {
                this.f2422c = true;
                return;
            }
            List list = JsonUtils.getList(jSONObject2, "domains", new ArrayList());
            if (list.size() > 0) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!C2050h.m4958a((String) it.next())) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
            }
            this.f2422c = z;
            return;
        }
        this.f2421b = false;
        this.f2423d = "";
        this.f2422c = C2050h.m4955a();
    }

    /* renamed from: a */
    public boolean mo13682a() {
        return this.f2421b;
    }

    /* renamed from: b */
    public boolean mo13683b() {
        boolean z = this.f2422c;
        return z && (this.f2420a || z);
    }

    /* renamed from: c */
    public String mo13684c() {
        return this.f2420a ? this.f2423d : "You must include an entry in your AndroidManifest.xml to point to your network_security_config.xml.\n\nFor more information, visit: https://developer.android.com/training/articles/security-config";
    }
}
