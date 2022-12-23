package com.applovin.impl.sdk;

import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.sdk.p053e.C1887a;
import com.applovin.impl.sdk.p053e.C1918o;
import com.applovin.impl.sdk.p053e.C1944z;
import com.applovin.impl.sdk.utils.C2049g;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.sdk.ab */
public class C1831ab {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static WebView f2939a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static volatile String f2940b;

    /* renamed from: a */
    public static String m3871a() {
        return f2940b;
    }

    /* renamed from: a */
    public static void m3873a(C1969m mVar) {
    }

    /* renamed from: b */
    public static void m3875b(final C1969m mVar) {
        if (f2940b == null) {
            f2940b = "";
            if (C2049g.m4940b()) {
                mVar.mo14526S().mo14429a((C1887a) new C1944z(mVar, true, new Runnable() {
                    public void run() {
                        try {
                            String unused = C1831ab.f2940b = WebSettings.getDefaultUserAgent(C1969m.this.mo14520L());
                        } catch (Throwable th) {
                            if (C2102v.m5104a()) {
                                C1969m.this.mo14509A().mo15013b("WebViewDataCollector", "Failed to collect user agent", th);
                            }
                        }
                    }
                }), C1918o.C1920a.BACKGROUND);
            } else {
                AppLovinSdkUtils.runOnUiThread(new Runnable() {
                    public void run() {
                        try {
                            C1831ab.m3873a(C1969m.this);
                            String unused = C1831ab.f2940b = C1831ab.f2939a.getSettings().getUserAgentString();
                        } catch (Throwable th) {
                            if (C2102v.m5104a()) {
                                C1969m.this.mo14509A().mo15013b("WebViewDataCollector", "Failed to collect user agent", th);
                            }
                        }
                    }
                });
            }
        }
    }
}
