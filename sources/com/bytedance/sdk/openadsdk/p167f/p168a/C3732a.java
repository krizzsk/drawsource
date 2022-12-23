package com.bytedance.sdk.openadsdk.p167f.p168a;

import com.bytedance.sdk.component.p088a.C2488d;
import com.bytedance.sdk.component.p088a.C2492f;
import com.bytedance.sdk.component.p088a.C2512r;
import com.bytedance.sdk.openadsdk.core.C3666w;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.p169g.C3743c;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.f.a.a */
/* compiled from: DoGetAdsFromNetworkAsyncMethod */
public class C3732a extends C2488d<JSONObject, JSONObject> {

    /* renamed from: a */
    private WeakReference<C3666w> f9662a;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo16480d() {
    }

    /* renamed from: a */
    public static void m12207a(C2512r rVar, final C3666w wVar) {
        rVar.mo16524a("getNetworkData", (C2488d.C2490b) new C2488d.C2490b() {
            /* renamed from: a */
            public C2488d mo16485a() {
                return new C3732a(wVar);
            }
        });
    }

    public C3732a(C3666w wVar) {
        this.f9662a = new WeakReference<>(wVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16476a(JSONObject jSONObject, C2492f fVar) throws Exception {
        C3666w wVar = (C3666w) this.f9662a.get();
        if (wVar == null) {
            mo16479c();
        } else {
            wVar.mo20351a(jSONObject, (C3743c) new C3743c() {
                /* renamed from: a */
                public void mo20385a(boolean z, List<C3431n> list) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (z) {
                            jSONObject.put("creatives", C3666w.m11910b(list));
                            C3732a.this.mo16475a(jSONObject);
                            return;
                        }
                        C3732a.this.mo16475a(jSONObject);
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
