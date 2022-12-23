package com.bytedance.sdk.component.adexpress.p095d;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.C2528a;
import com.bytedance.sdk.component.adexpress.C2548b;
import com.bytedance.sdk.component.adexpress.C2570c;
import com.bytedance.sdk.component.adexpress.p089a.p091b.C2533a;
import com.bytedance.sdk.component.adexpress.p089a.p092c.C2546b;
import com.bytedance.sdk.component.adexpress.p093b.C2553d;
import com.bytedance.sdk.component.adexpress.p093b.C2556f;
import com.bytedance.sdk.component.adexpress.p093b.C2557g;
import com.bytedance.sdk.component.adexpress.p093b.C2561j;
import com.bytedance.sdk.component.adexpress.p093b.C2563l;
import com.bytedance.sdk.component.adexpress.p093b.C2565m;
import com.bytedance.sdk.component.adexpress.p094c.C2572b;
import com.bytedance.sdk.component.adexpress.theme.C2676a;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.utils.C2889b;
import com.bytedance.sdk.component.utils.C2901k;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.widget.SSWebView;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.d.a */
/* compiled from: BaseWebViewRender */
public abstract class C2575a implements C2528a, C2553d<SSWebView>, C2561j, C2676a {

    /* renamed from: a */
    protected SSWebView f5480a;

    /* renamed from: b */
    protected int f5481b = 8;

    /* renamed from: c */
    protected C2546b f5482c;

    /* renamed from: d */
    protected AtomicBoolean f5483d = new AtomicBoolean(false);

    /* renamed from: e */
    private Context f5484e;

    /* renamed from: f */
    private String f5485f;

    /* renamed from: g */
    private JSONObject f5486g;

    /* renamed from: h */
    private String f5487h;

    /* renamed from: i */
    private C2556f f5488i;

    /* renamed from: j */
    private boolean f5489j = false;

    /* renamed from: k */
    private boolean f5490k;

    /* renamed from: l */
    private C2557g f5491l;

    /* renamed from: m */
    private C2563l f5492m;

    /* renamed from: n */
    private boolean f5493n;

    /* renamed from: o */
    private int f5494o;

    /* renamed from: a */
    public abstract void mo16736a(int i);

    /* renamed from: c */
    public int mo16632c() {
        return 0;
    }

    /* renamed from: g */
    public abstract void mo16743g();

    /* renamed from: h */
    public void mo16744h() {
    }

    /* renamed from: i */
    public void mo16745i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo16747k() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo16748l() {
    }

    public C2575a(Context context, C2563l lVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver) {
        this.f5484e = context;
        this.f5492m = lVar;
        this.f5485f = lVar.mo16672b();
        this.f5486g = lVar.mo16671a();
        themeStatusBroadcastReceiver.mo17237a(this);
        SSWebView b = C2580e.m6660a().mo16783b();
        this.f5480a = b;
        if (b == null) {
            Log.d("WebViewRender", "initWebView: create WebView");
            if (C2570c.m6618a() != null) {
                this.f5480a = new SSWebView(C2570c.m6618a());
                return;
            }
            return;
        }
        this.f5489j = true;
        Log.d("WebViewRender", "initWebView: reuse WebView");
    }

    /* renamed from: a */
    public void mo16738a(String str) {
        this.f5487h = str;
    }

    /* renamed from: a */
    public SSWebView mo16735a() {
        return this.f5480a;
    }

    /* renamed from: a */
    public void mo16737a(C2557g gVar) {
        this.f5491l = gVar;
    }

    /* renamed from: a */
    public void mo16641a(C2556f fVar) {
        this.f5488i = fVar;
        if (mo16735a() == null || mo16735a().getWebView() == null) {
            this.f5488i.mo16638a(102);
        } else if (!C2533a.m6376f()) {
            this.f5488i.mo16638a(102);
        } else if (TextUtils.isEmpty(this.f5487h)) {
            this.f5488i.mo16638a(102);
        } else if (this.f5482c != null || C2533a.m6369a(this.f5486g)) {
            this.f5492m.mo16673c().mo16648a(this.f5489j);
            if (this.f5489j) {
                try {
                    this.f5480a.mo17863m();
                    this.f5492m.mo16673c().mo16649b();
                    C2901k.m8099a(this.f5480a.getWebView(), "javascript:window.SDK_RESET_RENDER();window.SDK_TRIGGER_RENDER();");
                } catch (Exception unused) {
                    C2905l.m8111b("WebViewRender", "reuse webview load fail ");
                    C2580e.m6660a().mo16786c(this.f5480a);
                    this.f5488i.mo16638a(102);
                }
            } else {
                SSWebView a = mo16735a();
                a.mo17863m();
                this.f5492m.mo16673c().mo16649b();
                a.mo17835a(this.f5487h);
            }
        } else {
            this.f5488i.mo16638a(103);
        }
    }

    /* renamed from: b */
    public SSWebView mo16642e() {
        return mo16735a();
    }

    /* renamed from: d */
    public void mo16741d() {
        if (!this.f5483d.get()) {
            this.f5483d.set(true);
            mo16743g();
            if (this.f5480a.getParent() != null) {
                ((ViewGroup) this.f5480a.getParent()).removeView(this.f5480a);
            }
            if (this.f5490k) {
                C2580e.m6660a().mo16781a(this.f5480a);
            } else {
                C2580e.m6660a().mo16786c(this.f5480a);
            }
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

    /* renamed from: a */
    public void mo16739a(boolean z) {
        this.f5493n = z;
    }

    /* renamed from: a */
    public void mo16670a(final C2565m mVar) {
        if (mVar == null) {
            this.f5488i.mo16638a(105);
            return;
        }
        boolean a = mVar.mo16708a();
        final float b = (float) mVar.mo16709b();
        final float c = (float) mVar.mo16714c();
        if (b <= 0.0f || c <= 0.0f) {
            this.f5488i.mo16638a(105);
            return;
        }
        this.f5490k = a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m6633a(mVar, b, c);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    C2575a.this.m6633a(mVar, b, c);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m6633a(C2565m mVar, float f, float f2) {
        if (!this.f5490k || this.f5493n) {
            C2580e.m6660a().mo16786c(this.f5480a);
            m6635c(mVar.mo16725h());
            return;
        }
        m6632a(f, f2);
        mo16736a(this.f5481b);
        C2556f fVar = this.f5488i;
        if (fVar != null) {
            fVar.mo16639a(mo16735a(), mVar);
        }
    }

    /* renamed from: a */
    public void mo16669a(View view, int i, C2548b bVar) {
        C2557g gVar = this.f5491l;
        if (gVar != null) {
            gVar.mo16644a(view, i, bVar);
        }
    }

    /* renamed from: a */
    private void m6632a(float f, float f2) {
        this.f5492m.mo16673c().mo16651c();
        int a = (int) C2572b.m6622a(this.f5484e, f);
        int a2 = (int) C2572b.m6622a(this.f5484e, f2);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) mo16735a().getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(a, a2);
        }
        layoutParams.width = a;
        layoutParams.height = a2;
        mo16735a().setLayoutParams(layoutParams);
    }

    /* renamed from: c */
    private void m6635c(int i) {
        C2556f fVar = this.f5488i;
        if (fVar != null) {
            fVar.mo16638a(i);
        }
    }

    /* renamed from: j */
    public void mo16746j() {
        mo16747k();
        Activity a = C2889b.m8065a(this.f5480a);
        if (a != null) {
            this.f5494o = a.hashCode();
        }
    }

    /* renamed from: a */
    public void mo16544a(Activity activity) {
        if (this.f5494o != 0 && activity != null && activity.hashCode() == this.f5494o) {
            C2905l.m8111b("WebViewRender", "release from activity onDestroy");
            mo16741d();
            mo16748l();
        }
    }
}
