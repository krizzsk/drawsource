package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.os.Build;
import android.webkit.WebSettings;
import com.bytedance.sdk.component.adexpress.C2528a;
import com.bytedance.sdk.component.adexpress.p089a.p091b.C2533a;
import com.bytedance.sdk.component.adexpress.p089a.p092c.C2546b;
import com.bytedance.sdk.component.adexpress.p093b.C2556f;
import com.bytedance.sdk.component.adexpress.p093b.C2561j;
import com.bytedance.sdk.component.adexpress.p093b.C2563l;
import com.bytedance.sdk.component.adexpress.p095d.C2575a;
import com.bytedance.sdk.component.adexpress.p095d.C2577b;
import com.bytedance.sdk.component.adexpress.p095d.C2580e;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.p123f.C2882e;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.C3457h;
import com.bytedance.sdk.openadsdk.core.C3502k;
import com.bytedance.sdk.openadsdk.core.C3666w;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.widget.p164a.C3685b;
import com.bytedance.sdk.openadsdk.core.widget.p164a.C3686c;
import com.bytedance.sdk.openadsdk.p128b.C3104n;
import com.bytedance.sdk.openadsdk.p128b.C3118u;
import com.bytedance.sdk.openadsdk.p178l.C3851a;
import com.bytedance.sdk.openadsdk.p178l.C3881j;
import com.bytedance.sdk.openadsdk.p178l.C3896v;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import com.com.bytedance.overseas.sdk.p185a.C3968c;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.o */
/* compiled from: WebViewRender */
public class C3559o extends C2575a {

    /* renamed from: e */
    C3851a f8967e;

    /* renamed from: f */
    private Context f8968f;

    /* renamed from: g */
    private String f8969g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C3431n f8970h;

    /* renamed from: i */
    private JSONObject f8971i;

    /* renamed from: j */
    private C3118u f8972j;

    /* renamed from: k */
    private String f8973k;

    /* renamed from: l */
    private C3104n f8974l;

    /* renamed from: m */
    private final Map<String, C3968c> f8975m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n */
    private C3666w f8976n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C2556f f8977o;

    /* renamed from: p */
    private C3431n.C3432a f8978p;

    /* renamed from: q */
    private final Runnable f8979q = new Runnable() {
        public void run() {
            if (!C3559o.this.f5483d.get()) {
                if (!(C3559o.this.f8970h == null || C3559o.this.f8970h.mo19514G() == null)) {
                    C3559o oVar = C3559o.this;
                    C2546b unused = oVar.f5482c = C2533a.m6372c(oVar.f8970h.mo19514G().mo19672b());
                }
                C3502k.m10922d().post(C3559o.this.f8980r);
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final Runnable f8980r = new Runnable() {
        public void run() {
            if (!C3559o.this.f5483d.get() && C3559o.this.f8977o != null) {
                C3559o oVar = C3559o.this;
                C3559o.super.mo16641a(oVar.f8977o);
            }
        }
    };

    /* renamed from: s */
    private int f8981s = 8;

    public C3559o(Context context, C2563l lVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, C3118u uVar, C3431n nVar) {
        super(context, lVar, themeStatusBroadcastReceiver);
        if (this.f5480a != null && this.f5480a.getWebView() != null) {
            this.f8968f = context;
            this.f8969g = lVar.mo16672b();
            this.f8970h = nVar;
            this.f8972j = uVar;
            this.f8971i = lVar.mo16671a();
            String e = C2533a.m6375e();
            this.f8973k = e;
            mo16738a(C3896v.m12743b(e));
            themeStatusBroadcastReceiver.mo17237a(this);
            mo20107n();
            mo20106m();
            mo20108o();
        }
    }

    /* renamed from: m */
    public void mo20106m() {
        if (this.f5480a != null && this.f5480a.getWebView() != null) {
            C3666w wVar = new C3666w(this.f8968f);
            this.f8976n = wVar;
            wVar.mo20354b(this.f5480a).mo20337a(this.f8970h).mo20364d(this.f8970h.mo19532Y()).mo20368e(this.f8970h.mo19569ac()).mo20353b(C3898x.m12747a(this.f8969g)).mo20370f(C3898x.m12810i(this.f8970h)).mo20333a((C2561j) this).mo20347a(this.f8971i).mo20334a(this.f5480a).mo20335a(this.f8972j);
        }
    }

    /* renamed from: n */
    public void mo20107n() {
        C3431n nVar = this.f8970h;
        if (nVar != null && nVar.mo19514G() != null) {
            this.f8978p = this.f8970h.mo19514G();
        }
    }

    /* renamed from: o */
    public void mo20108o() {
        if (this.f5480a != null && this.f5480a.getWebView() != null) {
            this.f5480a.setBackgroundColor(0);
            this.f5480a.setBackgroundResource(17170445);
            m11206a(this.f5480a);
            if (mo16735a() != null) {
                this.f8974l = new C3104n(this.f8968f, this.f8970h, mo16735a().getWebView()).mo18688a(false);
            }
            this.f8974l.mo18697a(this.f8972j);
            this.f5480a.setWebViewClient(new C3547g(this.f8968f, this.f8976n, this.f8970h, this.f8974l));
            this.f5480a.setWebChromeClient(new C3686c(this.f8976n, this.f8974l));
            if (Build.VERSION.SDK_INT >= 17) {
                C2580e.m6660a().mo16782a(this.f5480a, (C2577b) this.f8976n);
            }
        }
    }

    /* renamed from: a */
    public void mo16641a(C2556f fVar) {
        this.f8977o = fVar;
        C2882e.m8032a().execute(this.f8979q);
    }

    /* renamed from: a */
    private void m11206a(SSWebView sSWebView) {
        if (sSWebView != null) {
            try {
                C3685b.m12035a(this.f8968f).mo20447a(false).mo20448a(sSWebView.getWebView());
                sSWebView.setVerticalScrollBarEnabled(false);
                sSWebView.setHorizontalScrollBarEnabled(false);
                sSWebView.mo17839a(true);
                sSWebView.mo17860j();
                sSWebView.setUserAgentString(C3881j.m12666a(sSWebView.getWebView(), (int) BuildConfig.VERSION_CODE));
                if (Build.VERSION.SDK_INT >= 21) {
                    sSWebView.setMixedContentMode(0);
                }
                sSWebView.setJavaScriptEnabled(true);
                sSWebView.setJavaScriptCanOpenWindowsAutomatically(true);
                sSWebView.setDomStorageEnabled(true);
                sSWebView.setDatabaseEnabled(true);
                sSWebView.setAppCacheEnabled(true);
                sSWebView.setAllowFileAccess(false);
                sSWebView.setSupportZoom(true);
                sSWebView.setBuiltInZoomControls(true);
                sSWebView.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
                sSWebView.setUseWideViewPort(true);
            } catch (Exception e) {
                C2905l.m8118e("WebViewRender", e.toString());
            }
        }
    }

    /* renamed from: a */
    public SSWebView mo16735a() {
        return this.f5480a;
    }

    /* renamed from: d */
    public void mo16741d() {
        if (!this.f5483d.get()) {
            C3666w wVar = this.f8976n;
            if (wVar != null) {
                wVar.mo20357b();
                this.f8976n = null;
            }
            super.mo16741d();
            C3502k.m10922d().removeCallbacks(this.f8980r);
            this.f8975m.clear();
        }
    }

    /* renamed from: f */
    public void mo16742f() {
        if (mo16735a() != null) {
            try {
                mo16735a().getWebView().resumeTimers();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: j */
    public void mo16746j() {
        super.mo16746j();
        if (this.f8976n != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("expressShow", true);
                this.f8976n.mo20350a("expressShow", jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo16747k() {
        C3851a c = C3457h.m10580d().mo19753c();
        this.f8967e = c;
        if (c != null) {
            c.mo20711a((C2528a) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo16748l() {
        super.mo16748l();
        C3851a aVar = this.f8967e;
        if (aVar != null) {
            aVar.mo20713b((C2528a) this);
        }
    }

    /* renamed from: g */
    public void mo16743g() {
        C3666w wVar = this.f8976n;
        if (wVar != null) {
            wVar.mo20350a("expressWebviewRecycle", (JSONObject) null);
        }
    }

    /* renamed from: a */
    public void mo16736a(int i) {
        if (i != this.f8981s) {
            this.f8981s = i;
            m11209b(i == 0);
        }
    }

    /* renamed from: b */
    private void m11209b(boolean z) {
        if (this.f8976n != null && this.f5480a != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adVisible", z);
                this.f8976n.mo20350a("expressAdShow", jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: p */
    public C3666w mo20109p() {
        return this.f8976n;
    }

    /* renamed from: b */
    public void mo17184b(int i) {
        if (this.f8976n != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("status", i);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            this.f8976n.mo20350a("themeChange", jSONObject);
        }
    }

    /* renamed from: b */
    public static boolean m11210b(String str) {
        return "banner_call".equals(str) || "banner_ad".equals(str) || "slide_banner_ad".equals(str) || "banner_ad_landingpage".equals(str);
    }
}
