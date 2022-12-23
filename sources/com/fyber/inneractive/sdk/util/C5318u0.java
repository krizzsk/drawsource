package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.fyber.inneractive.sdk.util.u0 */
public class C5318u0 {

    /* renamed from: a */
    public volatile String f14050a = null;

    /* renamed from: b */
    public Context f14051b = null;

    /* renamed from: c */
    public AtomicBoolean f14052c = new AtomicBoolean(false);

    /* renamed from: d */
    public final Runnable f14053d = new C5319a();

    /* renamed from: com.fyber.inneractive.sdk.util.u0$a */
    public class C5319a implements Runnable {
        public C5319a() {
        }

        public void run() {
            C5318u0.this.mo26399e();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.util.u0$b */
    public class C5320b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f14055a;

        public C5320b(String str) {
            this.f14055a = str;
        }

        public void run() {
            C5318u0.this.f14051b.getSharedPreferences("fyber.ua", 0).edit().putString("ua", this.f14055a).apply();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.util.u0$c */
    public class C5321c implements Runnable {
        public C5321c() {
        }

        public void run() {
            C5318u0 u0Var = C5318u0.this;
            Context context = u0Var.f14051b;
            if (context != null) {
                String str = null;
                try {
                    str = WebSettings.getDefaultUserAgent(context);
                } catch (Throwable unused) {
                }
                if (!TextUtils.isEmpty(str)) {
                    u0Var.mo26395a(str);
                }
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.util.u0$d */
    public class C5322d implements Runnable {
        public C5322d() {
        }

        public void run() {
            C5318u0.this.mo26396b();
        }
    }

    /* renamed from: a */
    public String mo26394a() {
        if (!TextUtils.isEmpty(this.f14050a)) {
            return this.f14050a;
        }
        Runnable runnable = this.f14053d;
        if (runnable != null) {
            Handler handler = C5299n.f14024b;
            handler.removeCallbacks(runnable);
            handler.postDelayed(this.f14053d, 50);
        }
        return System.getProperty("http.agent");
    }

    /* renamed from: b */
    public final void mo26396b() {
        WebView webView;
        String str = null;
        try {
            webView = new WebView(this.f14051b);
            try {
                str = webView.getSettings().getUserAgentString();
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            webView = null;
        }
        if (!TextUtils.isEmpty(str)) {
            mo26395a(str);
        }
        if (webView != null) {
            webView.destroy();
        }
    }

    /* renamed from: c */
    public final void mo26397c() {
        if (this.f14051b != null && TextUtils.isEmpty(this.f14050a)) {
            this.f14050a = this.f14051b.getSharedPreferences("fyber.ua", 0).getString("ua", (String) null);
            if (!TextUtils.isEmpty(this.f14050a)) {
                IAlog.m16446a("UserAgentProvider | populated user agent from shared prefs", new Object[0]);
                this.f14052c.compareAndSet(false, true);
            }
            mo26399e();
        }
    }

    /* renamed from: d */
    public void mo26398d() {
        Context context;
        mo26397c();
        if (!this.f14052c.get() && Build.VERSION.SDK_INT >= 17 && (context = this.f14051b) != null) {
            String str = null;
            try {
                str = WebSettings.getDefaultUserAgent(context);
            } catch (Throwable unused) {
            }
            if (!TextUtils.isEmpty(str)) {
                mo26395a(str);
            }
        }
    }

    /* renamed from: e */
    public final void mo26399e() {
        if (Build.VERSION.SDK_INT >= 17) {
            C5299n.m16520a(new C5321c());
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            mo26396b();
        } else {
            C5299n.f14024b.post(new C5322d());
        }
    }

    /* renamed from: a */
    public final void mo26395a(String str) {
        this.f14050a = str;
        if (!TextUtils.isEmpty(this.f14050a)) {
            IAlog.m16446a("UserAgentProvider | populated user agent form updateUserAgentIfPossible", new Object[0]);
            this.f14052c.compareAndSet(false, true);
        }
        C5299n.m16520a(new C5320b(str));
    }
}
