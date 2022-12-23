package com.bytedance.sdk.component.p088a;

import android.text.TextUtils;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.a.w */
/* compiled from: PermissionConfigRepository */
class C2522w {

    /* renamed from: a */
    private final Collection<String> f5324a;

    /* renamed from: b */
    private final Map<String, C2517v> f5325b;

    /* renamed from: c */
    private final C2500k f5326c;

    /* renamed from: d */
    private final Set<C2523a> f5327d;

    /* renamed from: com.bytedance.sdk.component.a.w$a */
    /* compiled from: PermissionConfigRepository */
    interface C2523a {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2517v mo16537a(String str) {
        if (this.f5324a.contains(str) || TextUtils.equals(str, "host")) {
            return m6320a(str, (JSONObject) null);
        }
        throw new IllegalArgumentException("Namespace: " + str + " not registered.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16538a(C2523a aVar) {
        this.f5327d.add(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo16539b(C2523a aVar) {
        this.f5327d.remove(aVar);
    }

    /* renamed from: a */
    private C2517v m6320a(String str, JSONObject jSONObject) {
        C2517v vVar = this.f5325b.get(str);
        if (vVar == null) {
            C2517v vVar2 = new C2517v(str, this.f5326c.mo16502c(), this.f5326c.mo16500a(), this.f5326c.mo16501b(), jSONObject);
            this.f5325b.put(str, vVar2);
            return vVar2;
        } else if (jSONObject == null) {
            return vVar;
        } else {
            vVar.mo16536a(jSONObject);
            return vVar;
        }
    }
}
