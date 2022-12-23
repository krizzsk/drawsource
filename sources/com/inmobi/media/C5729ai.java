package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.common.base.Ascii;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C5706af;
import java.util.Map;

/* renamed from: com.inmobi.media.ai */
/* compiled from: BannerAdUnit */
public class C5729ai extends C5706af implements Application.ActivityLifecycleCallbacks {
    /* access modifiers changed from: private */

    /* renamed from: y */
    public static final String f14404y = C5729ai.class.getSimpleName();

    /* renamed from: A */
    private int f14405A = 0;

    /* renamed from: z */
    private boolean f14406z = false;

    /* renamed from: b */
    public void mo34556b() {
    }

    /* renamed from: k */
    public String mo34479k() {
        return "banner";
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final byte mo34481l() {
        return 0;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final boolean mo34494x() {
        return false;
    }

    /* renamed from: a */
    static /* synthetic */ int m16941a(C5729ai aiVar) {
        int i = aiVar.f14405A;
        aiVar.f14405A = i + 1;
        return i;
    }

    /* renamed from: b */
    static /* synthetic */ int m16943b(C5729ai aiVar) {
        int i = aiVar.f14405A - 1;
        aiVar.f14405A = i;
        return i;
    }

    public C5729ai(Context context, C5791bc bcVar, C5706af.C5724a aVar) {
        super(context, bcVar, aVar);
        bcVar.mo34723e();
        mo34409a(context, bcVar, aVar);
    }

    /* renamed from: b */
    public void mo34557b(boolean z) {
        if (z) {
            C6195ic.m18378a((byte) 2, "InMobi", "Initiating Banner refresh for placement id: " + mo34475i().toString());
        }
        this.f14406z = z;
        mo34495y();
    }

    /* renamed from: Y */
    public boolean mo34549Y() {
        return mo34477j() == 7;
    }

    /* renamed from: t */
    public C6301q mo34490t() {
        C6301q t = super.mo34490t();
        if (mo34475i().mo34725f() && t != null) {
            t.mo35448a();
        }
        return t;
    }

    /* renamed from: c */
    public void mo34559c(String str) {
        mo34475i().mo34716a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final Map<String, String> mo34483m() {
        Map<String, String> m = super.mo34483m();
        m.put("u-rt", this.f14406z ? "1" : "0");
        m.put("mk-ad-slot", mo34475i().mo34733m());
        return m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34432a(boolean z, InMobiAdRequestStatus inMobiAdRequestStatus) {
        C5706af.C5724a p;
        super.mo34432a(z, inMobiAdRequestStatus);
        C6195ic.m18378a((byte) 2, "InMobi", "Banner ad fetch successful for placement id: " + mo34475i().toString());
        if (mo34477j() == 2 && (p = mo34486p()) != null) {
            mo34439b(p);
        }
    }

    /* renamed from: S */
    public void mo34395S() {
        mo34382F();
        try {
            if (!mo34394R()) {
                mo34396T();
                this.f14349i.post(new Runnable() {
                    public final void run() {
                        if (C5729ai.this.f14362v) {
                            C5729ai.this.f14360t = System.currentTimeMillis();
                            for (int i = 0; i < C5729ai.this.f14356p.mo34756b().size(); i++) {
                                C5729ai.this.f14361u.add(Integer.valueOf(i));
                            }
                        }
                        C5729ai.this.mo34431a(true);
                    }
                });
            }
        } catch (IllegalStateException unused) {
            mo34411a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (byte) 48);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo34478j(C6301q qVar) {
        super.mo34478j(qVar);
        if (this.f14362v && this.f14344d.indexOf(qVar) > 0 && mo34477j() == 6) {
            mo34467f((byte) 2);
            ((C6301q) this.f14344d.get(this.f14359s)).mo35580a(true);
        } else if (mo34477j() == 2) {
            mo34467f((byte) 2);
            this.f14342b = 4;
            mo34385I();
            C6195ic.m18378a((byte) 2, "InMobi", "Successfully loaded Banner ad markup in the WebView for placement id: " + mo34475i().toString());
            C5706af.C5724a p = mo34486p();
            if (p != null) {
                mo34451c(p);
            }
            mo34378B();
            if (!mo34397U()) {
                mo34466f();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo34480k(C6301q qVar) {
        super.mo34480k(qVar);
        if (this.f14362v) {
            int indexOf = this.f14344d.indexOf(qVar);
            mo34458d(indexOf);
            if (indexOf > 0 && mo34477j() == 6) {
                mo34467f((byte) 2);
                ((C6301q) this.f14344d.get(this.f14359s)).mo35580a(false);
            }
        }
        if (mo34477j() == 2) {
            mo34467f((byte) 2);
            this.f14342b = 3;
            C6195ic.m18378a((byte) 2, "InMobi", "Failed to load the Banner markup in the WebView for placement id: " + mo34475i().toString());
            mo34411a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), false, (byte) 43);
        }
    }

    /* renamed from: f */
    public void mo34469f(C6301q qVar) {
        super.mo34469f(qVar);
        this.f14349i.post(new Runnable() {
            public final void run() {
                try {
                    if (C5729ai.this.mo34477j() == 4) {
                        C5729ai.this.f14342b = 6;
                    }
                } catch (Exception unused) {
                    C6195ic.m18378a((byte) 1, "InMobi", "Unable to load ad; SDK encountered an internal error");
                    String unused2 = C5729ai.f14404y;
                }
            }
        });
    }

    /* renamed from: a_ */
    public synchronized void mo34552a_(C6301q qVar) {
        super.mo34552a_(qVar);
        this.f14349i.post(new Runnable() {
            public final void run() {
                try {
                    if (C5729ai.this.mo34477j() == 6) {
                        C5729ai.m16941a(C5729ai.this);
                        C5729ai.this.f14342b = 7;
                        C6195ic.m18378a((byte) 2, "InMobi", "Successfully displayed banner ad for placement Id : " + C5729ai.this.mo34475i().toString());
                        C5706af.C5724a p = C5729ai.this.mo34486p();
                        if (p != null) {
                            C5729ai.this.mo34459d(p);
                        }
                    } else if (C5729ai.this.mo34477j() == 7) {
                        C5729ai.m16941a(C5729ai.this);
                    }
                } catch (Exception unused) {
                    C6195ic.m18378a((byte) 1, "InMobi", "Unable to display ad; SDK encountered an internal error");
                    String unused2 = C5729ai.f14404y;
                }
            }
        });
    }

    /* renamed from: b_ */
    public synchronized void mo34558b_(C6301q qVar) {
        super.mo34558b_(qVar);
        this.f14349i.post(new Runnable() {
            public final void run() {
                try {
                    if (C5729ai.this.mo34477j() == 7 && C5729ai.m16943b(C5729ai.this) == 0) {
                        C5729ai.this.f14342b = 6;
                        if (C5729ai.this.mo34486p() != null) {
                            C5729ai.this.mo34486p().mo34537c();
                        }
                    }
                } catch (Exception unused) {
                    C6195ic.m18378a((byte) 1, "InMobi", "Unable to dismiss ad; SDK encountered an internal error");
                    String unused2 = C5729ai.f14404y;
                }
            }
        });
    }

    /* renamed from: Z */
    public void mo34550Z() {
        C6234j s;
        C5953dz viewableAd;
        byte j = mo34477j();
        if ((j == 4 || j == 6 || j == 7) && (s = mo34489s()) != null && (viewableAd = s.getViewableAd()) != null) {
            viewableAd.mo35070a(mo34473h(), (byte) 1);
        }
    }

    /* renamed from: aa */
    public void mo34553aa() {
        C6234j s;
        C5953dz viewableAd;
        byte j = mo34477j();
        if ((j == 4 || j == 6 || j == 7) && (s = mo34489s()) != null && (viewableAd = s.getViewableAd()) != null) {
            viewableAd.mo35070a(mo34473h(), (byte) 0);
        }
    }

    /* renamed from: ab */
    public void mo34554ab() {
        if (mo34473h() instanceof Activity) {
            ((Activity) mo34473h()).getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }

    public void onActivityStarted(Activity activity) {
        Context h = mo34473h();
        if (h != null && h.equals(activity)) {
            mo34553aa();
        }
    }

    public void onActivityStopped(Activity activity) {
        Context h = mo34473h();
        if (h != null && h.equals(activity)) {
            mo34550Z();
        }
    }

    public void onActivityDestroyed(Activity activity) {
        Context h = mo34473h();
        if (h != null && h.equals(activity)) {
            ((Activity) h).getApplication().unregisterActivityLifecycleCallbacks(this);
            mo34380D();
        }
    }

    /* renamed from: g */
    public void mo34470g() {
        super.mo34470g();
        this.f14357q = true;
        this.f14349i.post(new Runnable() {
            public final void run() {
                C6234j s = C5729ai.this.mo34489s();
                if (s != null) {
                    s.destroy();
                }
            }
        });
    }

    /* renamed from: ac */
    public void mo34555ac() {
        Context h = mo34473h();
        if (h != null) {
            C6183hw.m18312a(h, (Application.ActivityLifecycleCallbacks) this);
        }
    }

    /* renamed from: a */
    public void mo34551a(int i, C6301q qVar) {
        if (!this.f14361u.contains(Integer.valueOf(i)) || i <= this.f14344d.indexOf(qVar)) {
            ((C6301q) this.f14344d.get(this.f14344d.indexOf(qVar))).mo35580a(false);
            return;
        }
        this.f14358r = i;
        this.f14349i.post(new Runnable() {
            public final void run() {
                C5729ai.this.mo34431a(true);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34410a(InMobiAdRequestStatus inMobiAdRequestStatus) {
        super.mo34410a(inMobiAdRequestStatus);
        if (this.f14362v && this.f14358r > 0) {
            ((C6301q) this.f14344d.get(this.f14359s)).mo35580a(false);
            this.f14349i.post(new Runnable() {
                public final void run() {
                    C5729ai aiVar = C5729ai.this;
                    aiVar.mo34458d(aiVar.f14358r);
                }
            });
        }
    }

    /* renamed from: y */
    public void mo34495y() {
        boolean z = false;
        if (mo34494x()) {
            mo34411a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (byte) 39);
        } else if (1 == mo34477j() || 2 == mo34477j()) {
            C6195ic.m18378a((byte) 1, f14404y, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            mo34437b((byte) 53);
        } else if (7 == mo34477j()) {
            mo34411a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (byte) Ascii.f18305SI);
            C6195ic.m18378a((byte) 1, "InMobi", C5771av.f14488a + mo34475i().mo34723e());
        } else {
            C6195ic.m18378a((byte) 2, "InMobi", "Fetching a Banner ad for placement id: " + mo34475i().toString());
            this.f14352l = false;
            z = true;
        }
        if (z) {
            super.mo34495y();
        }
    }

    /* renamed from: a */
    public void mo34406a(final int i, final C6301q qVar, Context context) {
        if (!this.f14362v) {
            ((C6301q) this.f14344d.get(this.f14344d.indexOf(qVar))).mo35589d(false);
        } else if (!this.f14361u.contains(Integer.valueOf(i)) || i <= this.f14344d.indexOf(qVar) || this.f14344d.get(i) == null || !((C6301q) this.f14344d.get(i)).f15963w) {
            ((C6301q) this.f14344d.get(this.f14344d.indexOf(qVar))).mo35589d(false);
        } else {
            super.mo34406a(i, qVar, context);
            this.f14349i.post(new Runnable() {
                public final void run() {
                    int indexOf = C5729ai.this.f14344d.indexOf(qVar);
                    try {
                        C5706af.C5724a p = C5729ai.this.mo34486p();
                        if (p != null) {
                            p.mo34522a(i, indexOf, qVar);
                        }
                    } catch (Exception unused) {
                        C5729ai.this.mo34407a(indexOf, false);
                        C5729ai.this.mo34463e(indexOf);
                    }
                }
            });
        }
    }
}
