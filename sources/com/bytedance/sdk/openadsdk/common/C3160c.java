package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;

/* renamed from: com.bytedance.sdk.openadsdk.common.c */
/* compiled from: LandingPageNewStyleManager */
public class C3160c {

    /* renamed from: a */
    private C3431n f7410a;

    /* renamed from: b */
    private RelativeLayout f7411b;

    /* renamed from: c */
    private final Context f7412c;

    /* renamed from: d */
    private SSWebView f7413d;

    /* renamed from: e */
    private ImageView f7414e;

    /* renamed from: f */
    private final String f7415f;

    /* renamed from: g */
    private C3171f f7416g;

    /* renamed from: h */
    private C3161d f7417h;

    public C3160c(Context context, C3431n nVar, String str) {
        this.f7412c = context;
        this.f7410a = nVar;
        this.f7415f = str;
        m9141f();
    }

    /* renamed from: f */
    private void m9141f() {
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(this.f7412c).inflate(C2914t.m8159f(this.f7412c, "tt_activity_endcard_landingpage_newstyle"), (ViewGroup) null, false);
        this.f7411b = relativeLayout;
        this.f7413d = (SSWebView) relativeLayout.findViewById(C2914t.m8158e(this.f7412c, "tt_browser_webview"));
        C3171f fVar = new C3171f(this.f7412c, (RelativeLayout) this.f7411b.findViewById(C2914t.m8158e(this.f7412c, "tt_title_bar")), this.f7410a);
        this.f7416g = fVar;
        this.f7414e = fVar.mo18813c();
        this.f7417h = new C3161d(this.f7412c, (LinearLayout) this.f7411b.findViewById(C2914t.m8158e(this.f7412c, "tt_bottom_bar")), this.f7413d, this.f7410a, this.f7415f);
    }

    /* renamed from: a */
    public void mo18790a() {
        C3171f fVar = this.f7416g;
        if (fVar != null) {
            fVar.mo18810a();
        }
        C3161d dVar = this.f7417h;
        if (dVar != null) {
            dVar.mo18796a();
        }
    }

    /* renamed from: b */
    public void mo18792b() {
        C3171f fVar = this.f7416g;
        if (fVar != null) {
            fVar.mo18812b();
        }
        C3161d dVar = this.f7417h;
        if (dVar != null) {
            dVar.mo18798b();
        }
    }

    /* renamed from: c */
    public ImageView mo18793c() {
        return this.f7414e;
    }

    /* renamed from: d */
    public SSWebView mo18794d() {
        return this.f7413d;
    }

    /* renamed from: e */
    public View mo18795e() {
        return this.f7411b;
    }

    /* renamed from: a */
    public void mo18791a(WebView webView, int i) {
        C3171f fVar = this.f7416g;
        if (fVar != null) {
            fVar.mo18811a(webView, i);
        }
        C3161d dVar = this.f7417h;
        if (dVar != null) {
            dVar.mo18797a(webView);
        }
    }
}
