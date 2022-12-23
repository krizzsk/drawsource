package com.applovin.impl.sdk.p053e;

import android.net.Uri;
import android.webkit.URLUtil;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.p028a.C1411a;
import com.applovin.impl.p028a.C1418d;
import com.applovin.impl.p028a.C1422h;
import com.applovin.impl.p028a.C1431n;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p049ad.C1839e;
import com.applovin.impl.sdk.p052d.C1879d;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.impl.sdk.e.e */
class C1897e extends C1893c {

    /* renamed from: c */
    private final C1411a f3518c;

    public C1897e(C1411a aVar, C1969m mVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheVastAd", aVar, mVar, appLovinAdLoadListener);
        this.f3518c = aVar;
    }

    /* renamed from: j */
    private void m4247j() {
        String str;
        String str2;
        String str3;
        if (!mo14388b()) {
            if (this.f3518c.mo12840aQ()) {
                C1418d aM = this.f3518c.mo12836aM();
                if (aM != null) {
                    C1422h b = aM.mo12891b();
                    if (b != null) {
                        Uri b2 = b.mo12914b();
                        String uri = b2 != null ? b2.toString() : "";
                        String c = b.mo12915c();
                        if (URLUtil.isValidUrl(uri) || StringUtils.isValidString(c)) {
                            if (b.mo12911a() == C1422h.C1423a.STATIC) {
                                if (C2102v.m5104a()) {
                                    mo14365a("Caching static companion ad at " + uri + APSSharedUtil.TRUNCATE_SEPARATOR);
                                }
                                Uri c2 = mo14389c(uri, Collections.emptyList(), false);
                                if (c2 != null) {
                                    b.mo12912a(c2);
                                } else if (C2102v.m5104a()) {
                                    str2 = "Failed to cache static companion ad";
                                } else {
                                    return;
                                }
                            } else if (b.mo12911a() == C1422h.C1423a.HTML) {
                                if (StringUtils.isValidString(uri)) {
                                    if (C2102v.m5104a()) {
                                        mo14365a("Begin caching HTML companion ad. Fetching from " + uri + APSSharedUtil.TRUNCATE_SEPARATOR);
                                    }
                                    c = mo14393f(uri);
                                    if (StringUtils.isValidString(c)) {
                                        if (C2102v.m5104a()) {
                                            str3 = "HTML fetched. Caching HTML now...";
                                        }
                                        b.mo12913a(mo14383a(c, (List<String>) Collections.emptyList(), (C1839e) this.f3518c));
                                    } else if (C2102v.m5104a()) {
                                        str2 = "Unable to load companion ad resources from " + uri;
                                    } else {
                                        return;
                                    }
                                } else {
                                    if (C2102v.m5104a()) {
                                        str3 = "Caching provided HTML for companion ad. No fetch required. HTML: " + c;
                                    }
                                    b.mo12913a(mo14383a(c, (List<String>) Collections.emptyList(), (C1839e) this.f3518c));
                                }
                                mo14365a(str3);
                                b.mo12913a(mo14383a(c, (List<String>) Collections.emptyList(), (C1839e) this.f3518c));
                            } else if (b.mo12911a() == C1422h.C1423a.IFRAME && C2102v.m5104a()) {
                                str = "Skip caching of iFrame resource...";
                            } else {
                                return;
                            }
                            this.f3518c.mo14191a(true);
                            return;
                        } else if (C2102v.m5104a()) {
                            mo14368c("Companion ad does not have any resources attached. Skipping...");
                            return;
                        } else {
                            return;
                        }
                    } else if (C2102v.m5104a()) {
                        str2 = "Failed to retrieve non-video resources from companion ad. Skipping...";
                    } else {
                        return;
                    }
                    mo14370d(str2);
                    return;
                } else if (C2102v.m5104a()) {
                    str = "No companion ad provided. Skipping...";
                } else {
                    return;
                }
            } else if (C2102v.m5104a()) {
                str = "Companion ad caching disabled. Skipping...";
            } else {
                return;
            }
            mo14365a(str);
        }
    }

    /* renamed from: k */
    private void m4248k() {
        C1431n n;
        Uri b;
        if (!mo14388b()) {
            if (this.f3518c.mo12841aR()) {
                if (this.f3518c.mo12861m() != null && (n = this.f3518c.mo12862n()) != null && (b = n.mo12941b()) != null) {
                    Uri a = mo14381a(b.toString(), (List<String>) Collections.emptyList(), false);
                    if (a != null) {
                        if (C2102v.m5104a()) {
                            mo14365a("Video file successfully cached into: " + a);
                        }
                        n.mo12940a(a);
                    } else if (C2102v.m5104a()) {
                        mo14370d("Failed to cache video file: " + n);
                    }
                }
            } else if (C2102v.m5104a()) {
                mo14365a("Video caching disabled. Skipping...");
            }
        }
    }

    /* renamed from: l */
    private void m4249l() {
        String str;
        String str2;
        if (!mo14388b()) {
            if (this.f3518c.mo12839aP() != null) {
                if (C2102v.m5104a()) {
                    mo14365a("Begin caching HTML template. Fetching from " + this.f3518c.mo12839aP() + APSSharedUtil.TRUNCATE_SEPARATOR);
                }
                str = mo14382a(this.f3518c.mo12839aP().toString(), this.f3518c.mo14168H());
            } else {
                str = this.f3518c.mo12838aO();
            }
            if (StringUtils.isValidString(str)) {
                C1411a aVar = this.f3518c;
                aVar.mo12835a(mo14383a(str, aVar.mo14168H(), (C1839e) this.f3518c));
                if (C2102v.m5104a()) {
                    str2 = "Finish caching HTML template " + this.f3518c.mo12838aO() + " for ad #" + this.f3518c.getAdIdNumber();
                } else {
                    return;
                }
            } else if (C2102v.m5104a()) {
                str2 = "Unable to load HTML template";
            } else {
                return;
            }
            mo14365a(str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo14394h() {
        this.f3518c.mo12863o().mo14070e();
        super.mo14394h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo14395i() {
        this.f3518c.mo12863o().mo14068c();
        super.mo14395i();
    }

    public void run() {
        super.run();
        if (this.f3518c.mo12849f()) {
            if (C2102v.m5104a()) {
                mo14365a("Begin caching for VAST streaming ad #" + this.f3504a.getAdIdNumber() + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            mo14390c();
            if (this.f3518c.mo12856i()) {
                mo14395i();
            }
            if (this.f3518c.mo12850g() == C1411a.C1414b.COMPANION_AD) {
                m4247j();
                m4249l();
            } else {
                m4248k();
            }
            if (!this.f3518c.mo12856i()) {
                mo14395i();
            }
            if (this.f3518c.mo12850g() == C1411a.C1414b.COMPANION_AD) {
                m4248k();
            } else {
                m4247j();
                m4249l();
            }
        } else {
            if (C2102v.m5104a()) {
                mo14365a("Begin caching for VAST ad #" + this.f3504a.getAdIdNumber() + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            mo14390c();
            m4247j();
            m4248k();
            m4249l();
            mo14395i();
        }
        if (C2102v.m5104a()) {
            mo14365a("Finished caching VAST ad #" + this.f3518c.getAdIdNumber());
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f3518c.getCreatedAtMillis();
        C1879d.m4139a(this.f3518c, this.f3496b);
        C1879d.m4138a(currentTimeMillis, (AppLovinAdBase) this.f3518c, this.f3496b);
        mo14385a((AppLovinAdBase) this.f3518c);
        this.f3518c.mo12844b();
        mo14384a();
    }
}
