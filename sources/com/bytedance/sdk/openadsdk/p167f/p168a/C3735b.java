package com.bytedance.sdk.openadsdk.p167f.p168a;

import com.bytedance.sdk.component.p088a.C2488d;
import com.bytedance.sdk.component.p088a.C2492f;
import com.bytedance.sdk.component.p088a.C2512r;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.core.C3457h;
import com.bytedance.sdk.openadsdk.core.C3666w;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.f.a.b */
/* compiled from: DoInterstitialWebViewCloseMethod */
public class C3735b extends C2488d<JSONObject, JSONObject> {

    /* renamed from: a */
    private WeakReference<C3666w> f9665a;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo16480d() {
    }

    /* renamed from: a */
    public static void m12215a(C2512r rVar, final C3666w wVar) {
        rVar.mo16524a("interstitial_webview_close", (C2488d.C2490b) new C2488d.C2490b() {
            /* renamed from: a */
            public C2488d mo16485a() {
                return new C3735b(wVar);
            }
        });
    }

    public C3735b(C3666w wVar) {
        this.f9665a = new WeakReference<>(wVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16476a(JSONObject jSONObject, C2492f fVar) throws Exception {
        if (C3457h.m10580d().mo19779s()) {
            StringBuilder sb = new StringBuilder();
            sb.append("[JSB-REQ] version: 3 data=");
            sb.append(jSONObject != null ? jSONObject.toString() : "");
            C2905l.m8111b("DoInterstitialWebViewCloseMethod", sb.toString());
        }
        C2905l.m8118e("DoInterstitialWebViewCloseMethod", "DoInterstitialWebViewCloseMethod invoke ");
        C3666w wVar = (C3666w) this.f9665a.get();
        if (wVar == null) {
            C2905l.m8118e("DoInterstitialWebViewCloseMethod", "invoke error");
            mo16479c();
            return;
        }
        wVar.mo20372g();
    }
}
