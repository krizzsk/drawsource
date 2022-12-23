package com.bytedance.sdk.openadsdk.p167f.p168a;

import com.bytedance.sdk.component.p088a.C2488d;
import com.bytedance.sdk.component.p088a.C2492f;
import com.bytedance.sdk.component.p088a.C2512r;
import com.bytedance.sdk.openadsdk.core.C3666w;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.f.a.c */
/* compiled from: DoNewClickEventMethod */
public class C3737c extends C2488d<JSONObject, JSONObject> {

    /* renamed from: a */
    private WeakReference<C3666w> f9667a;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo16480d() {
    }

    /* renamed from: a */
    public static void m12220a(C2512r rVar, final C3666w wVar) {
        rVar.mo16524a("newClickEvent", (C2488d.C2490b) new C2488d.C2490b() {
            /* renamed from: a */
            public C2488d mo16485a() {
                return new C3737c(wVar);
            }
        });
    }

    public C3737c(C3666w wVar) {
        this.f9667a = new WeakReference<>(wVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16476a(JSONObject jSONObject, C2492f fVar) throws Exception {
        C3666w wVar = (C3666w) this.f9667a.get();
        if (wVar == null) {
            mo16479c();
        } else {
            wVar.mo20365d(jSONObject);
        }
    }
}
