package com.inmobi.media;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.base.Ascii;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.C5706af;
import com.inmobi.media.C5791bc;

/* renamed from: com.inmobi.media.ao */
/* compiled from: InterstitialUnifiedAdManager */
public class C5752ao extends C5771av {

    /* renamed from: k */
    private static final String f14447k = C5752ao.class.getSimpleName();

    /* renamed from: l */
    private static final String f14448l = "InMobi";

    /* renamed from: m */
    private C5745an f14449m;

    /* renamed from: n */
    private boolean f14450n;

    /* renamed from: d */
    private void m17052d(final AdMetaInfo adMetaInfo) {
        super.mo34533b(adMetaInfo);
        this.f14494f = 2;
        this.f14497i.post(new Runnable() {
            public final void run() {
                if (C5752ao.this.f14496h != null) {
                    C5752ao.this.f14496h.onAdLoadSucceeded(adMetaInfo);
                }
            }
        });
    }

    /* renamed from: a */
    private void m17050a(boolean z, byte b) {
        C5745an anVar = this.f14449m;
        if (!(anVar == null || b == 0)) {
            anVar.mo34450c((int) b);
        }
        this.f14497i.post(new Runnable() {
            public final void run() {
                if (C5752ao.this.f14496h != null) {
                    C5752ao.this.f14496h.onAdDisplayFailed();
                }
                C5752ao.this.m17055q();
            }
        });
        if (z) {
            this.f14494f = 6;
            C5745an anVar2 = this.f14449m;
            if (anVar2 != null) {
                anVar2.mo34380D();
            }
        }
    }

    /* renamed from: a */
    public void mo34612a(C5840bp bpVar, Context context) {
        if (this.f14449m == null) {
            this.f14449m = new C5745an(context, new C5791bc.C5793a("int", f14448l).mo34741a(bpVar.f14690a).mo34750c(bpVar.f14691b).mo34745a(bpVar.f14692c).mo34751d(bpVar.f14694e).mo34752e(bpVar.f14695f).mo34747a(), this);
        }
        if (!TextUtils.isEmpty(bpVar.f14694e)) {
            this.f14449m.mo34386J();
        }
        this.f14449m.mo34408a(context);
        this.f14449m.mo34429a(bpVar.f14692c);
        this.f14449m.mo34441b("activity");
        if (bpVar.f14693d) {
            this.f14449m.mo34550Z();
        }
    }

    /* renamed from: a */
    public void mo34523a(final AdMetaInfo adMetaInfo) {
        this.f14498j = adMetaInfo;
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        if (this.f14449m == null) {
            mo34525a((C5706af) null, inMobiAdRequestStatus);
            return;
        }
        super.mo34523a(adMetaInfo);
        this.f14497i.post(new Runnable() {
            public final void run() {
                if (C5752ao.this.f14496h != null) {
                    C5752ao.this.f14496h.onAdFetchSuccessful(adMetaInfo);
                }
            }
        });
    }

    /* renamed from: l */
    public void mo34613l() throws IllegalStateException {
        C5745an anVar = this.f14449m;
        if (anVar != null) {
            if (!anVar.mo34549Y() || this.f14498j == null) {
                if (this.f14450n) {
                    this.f14449m.mo34404a((byte) 89);
                    C6195ic.m18378a((byte) 1, f14448l, C5771av.f14489b);
                    return;
                }
                C5783aw u = this.f14449m.mo34491u();
                boolean a = mo34650a(f14448l, this.f14449m.mo34475i().toString());
                if (u != null && this.f14498j != null && a) {
                    if (u.mo34681k()) {
                        this.f14494f = 8;
                        if (this.f14449m.mo34465e((byte) 1)) {
                            this.f14449m.mo34395S();
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            }
            m17052d(this.f14498j);
            return;
        }
        throw new IllegalStateException(C5771av.f14491d);
    }

    /* renamed from: b */
    public final void mo34533b(AdMetaInfo adMetaInfo) {
        C5745an anVar = this.f14449m;
        if (anVar == null) {
            m17053d((C5706af) null, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            return;
        }
        try {
            if (!m17051a(anVar, true) || this.f14450n) {
                this.f14449m.mo34387K();
                this.f14449m.mo34603h(this);
                return;
            }
            m17052d(adMetaInfo);
        } catch (IllegalStateException unused) {
        }
    }

    /* renamed from: a */
    public final void mo34521a() {
        C5745an anVar = this.f14449m;
        if (anVar != null) {
            anVar.mo34438b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        }
    }

    /* renamed from: c */
    public final void mo34537c() {
        C5745an anVar = this.f14449m;
        if (anVar != null && !anVar.mo34398V()) {
            this.f14497i.post(new Runnable() {
                public final void run() {
                    if (C5752ao.this.f14496h != null) {
                        C5752ao.this.f14496h.onAdDismissed();
                    }
                }
            });
            this.f14449m.mo34380D();
            this.f14494f = 0;
            this.f14495g = null;
            this.f14449m.mo34399W();
        }
    }

    /* renamed from: m */
    public C5706af mo34587m() {
        return this.f14449m;
    }

    /* renamed from: a */
    public void mo34611a(PublisherCallbacks publisherCallbacks) {
        if (this.f14495g != null && !this.f14495g.booleanValue()) {
            this.f14449m.mo34437b((byte) 52);
            C6195ic.m18378a((byte) 1, f14448l, "Cannot call load() API after calling load(byte[])");
        } else if (this.f14450n) {
            this.f14449m.mo34437b((byte) 89);
            C6195ic.m18378a((byte) 1, f14448l, C5771av.f14489b);
        } else {
            this.f14495g = Boolean.TRUE;
            C5745an anVar = this.f14449m;
            if (anVar != null && mo34651a(f14448l, anVar.mo34475i().toString(), publisherCallbacks)) {
                this.f14494f = 1;
                this.f14496h = publisherCallbacks;
                String str = f14447k;
                C6195ic.m18378a((byte) 2, str, "Fetching an Interstitial ad for placement id: " + this.f14449m.mo34475i().toString());
                this.f14449m.mo34412a((C5706af.C5724a) this);
                this.f14449m.mo34495y();
            }
        }
    }

    /* renamed from: n */
    public boolean mo34614n() {
        if (this.f14449m == null || 2 != this.f14494f) {
            return false;
        }
        try {
            if (!m17051a(this.f14449m, false) || this.f14449m.mo34549Y()) {
                return true;
            }
            return false;
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    /* renamed from: o */
    public void mo34615o() {
        this.f14449m.mo34387K();
        if (!m17054p()) {
            return;
        }
        if (!C6219in.m18467h()) {
            C5745an anVar = this.f14449m;
            if (anVar != null) {
                anVar.mo34450c(21);
                m17053d(this.f14449m, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED));
                this.f14449m.mo34380D();
                return;
            }
            return;
        }
        C5745an anVar2 = this.f14449m;
        if (anVar2 != null && anVar2.mo34465e((byte) 4)) {
            this.f14450n = true;
            try {
                if (m17051a(this.f14449m, true)) {
                    this.f14449m.mo34603h(this);
                } else {
                    this.f14449m.mo34395S();
                }
            } catch (IllegalStateException unused) {
            }
        }
    }

    /* renamed from: i */
    public void mo34544i() {
        C5706af m = mo34587m();
        if (m == null) {
            return;
        }
        if (m.mo34477j() == 6 || m.mo34477j() == 7) {
            C5745an anVar = this.f14449m;
            if (anVar != null) {
                anVar.mo34399W();
            }
            m.mo34471g((C5706af.C5724a) this);
            return;
        }
        m17050a(true, (byte) 45);
    }

    /* renamed from: j */
    public void mo34545j() {
        C5745an anVar = this.f14449m;
        if (anVar != null) {
            anVar.mo34438b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo34583b(C5706af afVar, boolean z, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (!z) {
            m17053d(afVar, inMobiAdRequestStatus);
        }
    }

    /* renamed from: a */
    public final void mo34525a(C5706af afVar, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (inMobiAdRequestStatus == null || !InMobiAdRequestStatus.StatusCode.AD_ACTIVE.equals(inMobiAdRequestStatus.getStatusCode())) {
            super.mo34525a(afVar, inMobiAdRequestStatus);
        } else {
            mo34653c(afVar, inMobiAdRequestStatus);
        }
    }

    /* renamed from: c */
    public void mo34538c(AdMetaInfo adMetaInfo) {
        super.mo34538c(adMetaInfo);
        C5706af m = mo34587m();
        if (m != null) {
            m.mo34388L();
        }
        this.f14450n = false;
    }

    /* renamed from: a */
    private boolean m17051a(C5745an anVar, boolean z) throws IllegalStateException {
        C5783aw awVar;
        C5794bd bdVar = anVar.f14356p;
        if (bdVar == null) {
            awVar = null;
        } else {
            awVar = bdVar.mo34766l();
        }
        if (awVar != null) {
            return bdVar.mo34764j();
        }
        if (z) {
            m17053d(anVar, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        }
        throw new IllegalStateException("AdUnit doesn't have a current ad");
    }

    /* renamed from: d */
    private void m17053d(C5706af afVar, InMobiAdRequestStatus inMobiAdRequestStatus) {
        byte b = this.f14494f;
        if (b != 1) {
            if (b == 2) {
                C6195ic.m18378a((byte) 1, f14448l, "Unable to Show Ad, canShowAd Failed");
                m17050a(true, (byte) 0);
                return;
            } else if (b == 5) {
                C6195ic.m18378a((byte) 1, f14448l, "Ad will be dismissed, Internal error");
                C5745an anVar = this.f14449m;
                if (anVar != null) {
                    anVar.mo34399W();
                }
                m17055q();
                mo34537c();
                return;
            } else if (b != 8) {
                return;
            }
        }
        mo34653c(afVar, inMobiAdRequestStatus);
    }

    /* renamed from: p */
    private boolean m17054p() {
        byte b = this.f14494f;
        if (b != 1) {
            if (b == 5) {
                if (this.f14449m != null) {
                    C6195ic.m18378a((byte) 1, f14448l, C5771av.f14488a + this.f14449m.mo34475i().toString());
                    m17050a(false, (byte) Ascii.f18305SI);
                }
                return false;
            } else if (b != 7) {
                if (!this.f14450n) {
                    return true;
                }
                C5745an anVar = this.f14449m;
                if (anVar != null) {
                    anVar.mo34450c(89);
                }
                C6195ic.m18378a((byte) 1, f14448l, C5771av.f14489b);
                return false;
            }
        }
        C6195ic.m18378a((byte) 1, f14448l, "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m17055q() {
        C5745an anVar = this.f14449m;
        if (anVar != null) {
            anVar.mo34467f((byte) 4);
        }
    }
}
