package com.applovin.impl.sdk.p048a;

import android.view.View;
import android.webkit.WebView;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.internal.security.CertificateUtil;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.ErrorType;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.impl.sdk.a.b */
public abstract class C1800b {

    /* renamed from: a */
    protected final AppLovinAdBase f2870a;

    /* renamed from: b */
    protected final C1969m f2871b;

    /* renamed from: c */
    protected final C2102v f2872c;

    /* renamed from: d */
    protected final String f2873d;

    /* renamed from: e */
    protected boolean f2874e;

    /* renamed from: f */
    protected AdSession f2875f;

    /* renamed from: g */
    protected AdEvents f2876g;

    public C1800b(AppLovinAdBase appLovinAdBase) {
        this.f2870a = appLovinAdBase;
        this.f2871b = appLovinAdBase.getSdk();
        this.f2872c = appLovinAdBase.getSdk().mo14509A();
        String str = "AdEventTracker:" + appLovinAdBase.getAdIdNumber();
        if (StringUtils.isValidString(appLovinAdBase.getDspName())) {
            str = str + CertificateUtil.DELIMITER + appLovinAdBase.getDspName();
        }
        this.f2873d = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract AdSessionConfiguration mo14059a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract AdSessionContext mo14060a(WebView webView);

    /* renamed from: a */
    public void mo14061a(View view) {
        mo14062a(view, (List<C1809d>) Collections.emptyList());
    }

    /* renamed from: a */
    public void mo14062a(final View view, final List<C1809d> list) {
        mo14065a("update main view: " + view, (Runnable) new Runnable() {
            public void run() {
                C1800b.this.f2875f.registerAdView(view);
                C1800b.this.f2875f.removeAllFriendlyObstructions();
                for (C1809d dVar : list) {
                    if (dVar.mo14078a() != null) {
                        try {
                            C1800b.this.f2875f.addFriendlyObstruction(dVar.mo14078a(), dVar.mo14079b(), dVar.mo14080c());
                        } catch (Throwable th) {
                            if (C2102v.m5104a()) {
                                C2102v vVar = C1800b.this.f2872c;
                                String str = C1800b.this.f2873d;
                                vVar.mo15013b(str, "Failed to add friendly obstruction (" + dVar + ")", th);
                            }
                        }
                    }
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14063a(AdSession adSession) {
    }

    /* renamed from: a */
    public void mo14064a(final String str) {
        mo14065a("track error", (Runnable) new Runnable() {
            public void run() {
                C1800b.this.f2875f.error(ErrorType.VIDEO, str);
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14065a(final String str, final Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                try {
                    if (C1800b.this.f2874e) {
                        if (C2102v.m5104a()) {
                            C2102v vVar = C1800b.this.f2872c;
                            String str = C1800b.this.f2873d;
                            vVar.mo15012b(str, "Running operation: " + str);
                        }
                        runnable.run();
                    } else if (C2102v.m5104a()) {
                        C2102v vVar2 = C1800b.this.f2872c;
                        String str2 = C1800b.this.f2873d;
                        vVar2.mo15016e(str2, "Failed to run operation: " + str);
                    }
                } catch (Throwable th) {
                    if (C2102v.m5104a()) {
                        C2102v vVar3 = C1800b.this.f2872c;
                        String str3 = C1800b.this.f2873d;
                        vVar3.mo15013b(str3, "Failed to run operation: " + str, th);
                    }
                }
            }
        });
    }

    /* renamed from: b */
    public void mo14066b() {
        mo14067b((WebView) null);
    }

    /* renamed from: b */
    public void mo14067b(final WebView webView) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                AdSessionContext a;
                if (!C1800b.this.f2870a.isOpenMeasurementEnabled()) {
                    if (C2102v.m5104a()) {
                        C1800b.this.f2872c.mo15014c(C1800b.this.f2873d, "Skip starting session - Open Measurement disabled");
                    }
                } else if (C1800b.this.f2875f == null) {
                    if (C2102v.m5104a()) {
                        C1800b.this.f2872c.mo15012b(C1800b.this.f2873d, "Starting session");
                    }
                    AdSessionConfiguration a2 = C1800b.this.mo14059a();
                    if (a2 != null && (a = C1800b.this.mo14060a(webView)) != null) {
                        try {
                            C1800b.this.f2875f = AdSession.createAdSession(a2, a);
                            try {
                                C1800b.this.f2876g = AdEvents.createAdEvents(C1800b.this.f2875f);
                                C1800b bVar = C1800b.this;
                                bVar.mo14063a(bVar.f2875f);
                                C1800b.this.f2875f.start();
                                C1800b.this.f2874e = true;
                                if (C2102v.m5104a()) {
                                    C1800b.this.f2872c.mo15012b(C1800b.this.f2873d, "Session started");
                                }
                            } catch (Throwable th) {
                                if (C2102v.m5104a()) {
                                    C1800b.this.f2872c.mo15013b(C1800b.this.f2873d, "Failed to create ad events", th);
                                }
                            }
                        } catch (Throwable th2) {
                            if (C2102v.m5104a()) {
                                C1800b.this.f2872c.mo15013b(C1800b.this.f2873d, "Failed to create session", th2);
                            }
                        }
                    }
                } else if (C2102v.m5104a()) {
                    C2102v vVar = C1800b.this.f2872c;
                    String str = C1800b.this.f2873d;
                    vVar.mo15015d(str, "Attempting to start session again for ad: " + C1800b.this.f2870a);
                }
            }
        });
    }

    /* renamed from: c */
    public void mo14068c() {
        mo14065a("track loaded", (Runnable) new Runnable() {
            public void run() {
                C1800b.this.f2876g.loaded();
            }
        });
    }

    /* renamed from: d */
    public void mo14069d() {
        mo14065a("track impression event", (Runnable) new Runnable() {
            public void run() {
                C1800b.this.f2876g.impressionOccurred();
            }
        });
    }

    /* renamed from: e */
    public void mo14070e() {
        mo14065a("stop session", (Runnable) new Runnable() {
            public void run() {
                C1800b.this.f2874e = false;
                C1800b.this.f2875f.finish();
                C1800b.this.f2875f = null;
            }
        });
    }
}
