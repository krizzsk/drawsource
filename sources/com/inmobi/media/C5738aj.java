package com.inmobi.media;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.common.base.Ascii;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.C5706af;
import com.inmobi.media.C5791bc;
import java.util.Map;

/* renamed from: com.inmobi.media.aj */
/* compiled from: BannerUnifiedAdManager */
public class C5738aj extends C5771av {

    /* renamed from: k */
    private static final String f14417k = C5738aj.class.getSimpleName();

    /* renamed from: l */
    private static final String f14418l = "InMobi";

    /* renamed from: m */
    private C5729ai f14419m;

    /* renamed from: n */
    private C5729ai f14420n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C5729ai f14421o;

    /* renamed from: p */
    private C5729ai f14422p;

    /* renamed from: a */
    public void mo34577a(Context context, C5840bp bpVar, String str) {
        C5791bc a = new C5791bc.C5793a("banner", f14418l).mo34749b(C5903d.m17571a(context)).mo34741a(bpVar.f14690a).mo34750c(bpVar.f14691b).mo34745a(bpVar.f14692c).mo34744a(str).mo34746a(bpVar.f14693d).mo34751d(bpVar.f14694e).mo34752e(bpVar.f14695f).mo34747a();
        C5729ai aiVar = this.f14419m;
        if (aiVar == null || this.f14420n == null) {
            this.f14419m = new C5729ai(context, a, this);
            this.f14420n = new C5729ai(context, a, this);
            this.f14422p = this.f14419m;
            return;
        }
        aiVar.mo34409a(context, a, (C5706af.C5724a) this);
        this.f14420n.mo34409a(context, a, (C5706af.C5724a) this);
    }

    /* renamed from: a */
    public final void mo34523a(final AdMetaInfo adMetaInfo) {
        this.f14498j = adMetaInfo;
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        C5729ai aiVar = this.f14422p;
        if (aiVar == null) {
            mo34525a((C5706af) null, inMobiAdRequestStatus);
        } else if (aiVar.mo34491u() == null) {
            mo34525a((C5706af) null, inMobiAdRequestStatus);
        } else {
            super.mo34523a(adMetaInfo);
            this.f14497i.post(new Runnable() {
                public final void run() {
                    if (C5738aj.this.f14496h != null) {
                        C5738aj.this.f14496h.onAdFetchSuccessful(adMetaInfo);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public void mo34533b(final AdMetaInfo adMetaInfo) {
        super.mo34533b(adMetaInfo);
        this.f14494f = 0;
        this.f14497i.post(new Runnable() {
            public final void run() {
                if (C5738aj.this.f14496h != null) {
                    C5738aj.this.f14496h.onAdLoadSucceeded(adMetaInfo);
                }
            }
        });
    }

    /* renamed from: c */
    public void mo34537c() {
        this.f14494f = 0;
        super.mo34537c();
    }

    /* renamed from: j */
    public void mo34545j() {
        C5706af m = mo34587m();
        if (m != null) {
            m.mo34438b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        }
    }

    /* renamed from: a */
    public void mo34522a(int i, final int i2, C6301q qVar) {
        super.mo34522a(i, i2, qVar);
        try {
            if (this.f14421o != null) {
                InMobiBanner inMobiBanner = (InMobiBanner) qVar.getParent();
                if (inMobiBanner != null) {
                    this.f14421o.mo34407a(i2, true);
                    mo34585c(inMobiBanner);
                    this.f14497i.post(new Runnable() {
                        public final void run() {
                            if (C5738aj.this.f14421o != null) {
                                C5738aj.this.f14421o.mo34458d(i2);
                            }
                        }
                    });
                    return;
                }
                this.f14421o.mo34463e(i2);
                this.f14421o.mo34407a(i2, false);
            }
        } catch (Exception unused) {
            this.f14421o.mo34463e(i2);
            this.f14421o.mo34407a(i2, false);
        }
    }

    /* renamed from: l */
    public boolean mo34586l() {
        C5729ai aiVar;
        C5729ai aiVar2 = this.f14422p;
        if (aiVar2 == null || aiVar2.mo34477j() == 4 || this.f14422p.mo34477j() == 1 || this.f14422p.mo34477j() == 2 || ((aiVar = this.f14421o) != null && aiVar.mo34477j() == 7)) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public C5706af mo34587m() {
        if (m16970y()) {
            return this.f14421o;
        }
        return this.f14422p;
    }

    /* renamed from: y */
    private boolean m16970y() {
        C5729ai aiVar = this.f14421o;
        if (aiVar != null) {
            return aiVar.mo34477j() == 4 || this.f14421o.mo34477j() == 7 || this.f14421o.mo34477j() == 6;
        }
        return false;
    }

    /* renamed from: a */
    public void mo34579a(PublisherCallbacks publisherCallbacks, String str, boolean z) {
        if (this.f14495g == null || this.f14495g.booleanValue()) {
            this.f14495g = Boolean.TRUE;
            C5729ai aiVar = this.f14422p;
            if (aiVar != null && mo34651a(f14418l, aiVar.mo34475i().toString(), publisherCallbacks)) {
                this.f14494f = 1;
                this.f14498j = null;
                this.f14496h = publisherCallbacks;
                this.f14422p.mo34559c(str);
                this.f14422p.mo34557b(z);
                return;
            }
            return;
        }
        C5729ai aiVar2 = this.f14422p;
        if (aiVar2 != null) {
            aiVar2.mo34437b((byte) 52);
        }
        C6195ic.m18378a((byte) 1, f14418l, "Cannot call load() API after calling load(byte[])");
    }

    /* renamed from: n */
    public void mo34588n() throws IllegalStateException {
        C5729ai aiVar = this.f14422p;
        if (aiVar == null) {
            throw new IllegalStateException(C5771av.f14491d);
        } else if (mo34650a(f14418l, aiVar.mo34475i().toString())) {
            this.f14494f = 8;
            if (this.f14422p.mo34465e((byte) 1)) {
                this.f14422p.mo34395S();
            }
        }
    }

    /* renamed from: o */
    public void mo34589o() {
        C5729ai aiVar = this.f14422p;
        if (aiVar != null) {
            aiVar.mo34496z();
        }
    }

    /* renamed from: a */
    public void mo34580a(byte[] bArr, PublisherCallbacks publisherCallbacks) {
        if (this.f14495g == null || !this.f14495g.booleanValue()) {
            this.f14495g = Boolean.FALSE;
            this.f14494f = 1;
            if (this.f14422p != null) {
                C5729ai aiVar = this.f14421o;
                if (aiVar == null || !aiVar.mo34377A()) {
                    this.f14496h = publisherCallbacks;
                    this.f14422p.f14352l = false;
                    this.f14422p.mo34433a(bArr);
                    return;
                }
                return;
            }
            return;
        }
        C6195ic.m18378a((byte) 1, f14418l, "Cannot call load(byte[]) API after load() API is called");
    }

    /* renamed from: p */
    public void mo34590p() {
        C5729ai aiVar = this.f14421o;
        if (aiVar == null) {
            this.f14421o = this.f14419m;
            this.f14422p = this.f14420n;
        } else if (aiVar.equals(this.f14419m)) {
            this.f14421o = this.f14420n;
            this.f14422p = this.f14419m;
        } else if (this.f14421o.equals(this.f14420n)) {
            this.f14421o = this.f14419m;
            this.f14422p = this.f14420n;
        }
    }

    /* renamed from: a */
    public void mo34578a(RelativeLayout relativeLayout) {
        C6301q qVar;
        C5729ai aiVar = this.f14421o;
        if (aiVar != null && (qVar = (C6301q) aiVar.mo34489s()) != null) {
            C5953dz viewableAd = qVar.getViewableAd();
            if (this.f14421o.mo34475i().mo34725f()) {
                qVar.mo35448a();
            }
            ViewGroup viewGroup = (ViewGroup) qVar.getParent();
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            View c = viewableAd.mo35074c();
            viewableAd.mo35072a((Map<View, FriendlyObstructionPurpose>) null);
            C5729ai aiVar2 = this.f14422p;
            if (aiVar2 != null) {
                aiVar2.mo34550Z();
            }
            if (viewGroup == null) {
                relativeLayout.addView(c, layoutParams);
            } else {
                viewGroup.removeAllViews();
                viewGroup.addView(c, layoutParams);
            }
            this.f14422p.mo34380D();
        }
    }

    /* renamed from: q */
    public void mo34591q() {
        C5729ai aiVar = this.f14421o;
        if (aiVar != null) {
            aiVar.mo34553aa();
        }
    }

    /* renamed from: r */
    public void mo34592r() {
        C5729ai aiVar = this.f14421o;
        if (aiVar != null) {
            aiVar.mo34550Z();
        }
    }

    /* renamed from: a */
    public int mo34575a(int i, int i2) {
        C5729ai aiVar = this.f14422p;
        if (aiVar != null) {
            return i < aiVar.mo34485o().minimumRefreshInterval ? this.f14422p.mo34485o().minimumRefreshInterval : i;
        }
        return i2;
    }

    /* renamed from: s */
    public int mo34593s() {
        C5706af m = mo34587m();
        if (m != null) {
            return m.mo34485o().defaultRefreshInterval;
        }
        return -1;
    }

    /* renamed from: a */
    public boolean mo34581a(long j) {
        C5729ai aiVar = this.f14422p;
        if (aiVar == null) {
            return false;
        }
        int i = aiVar.mo34485o().minimumRefreshInterval;
        if (SystemClock.elapsedRealtime() - j >= ((long) (i * 1000))) {
            return true;
        }
        mo34576a((byte) Ascii.DLE);
        C5729ai aiVar2 = this.f14422p;
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST);
        mo34653c(aiVar2, inMobiAdRequestStatus.setCustomMessage("Ad cannot be refreshed before " + i + " seconds"));
        String str = f14417k;
        C6195ic.m18378a((byte) 1, str, "Ad cannot be refreshed before " + i + " seconds (AdPlacement Id = " + this.f14422p.mo34475i().toString() + ")");
        return false;
    }

    /* renamed from: t */
    public boolean mo34594t() {
        C5729ai aiVar = this.f14421o;
        return aiVar != null && aiVar.mo34549Y();
    }

    /* renamed from: u */
    public void mo34595u() {
        C5729ai aiVar = this.f14419m;
        if (aiVar != null) {
            aiVar.mo34554ab();
        }
        C5729ai aiVar2 = this.f14420n;
        if (aiVar2 != null) {
            aiVar2.mo34554ab();
        }
    }

    /* renamed from: b */
    public boolean mo34584b(RelativeLayout relativeLayout) {
        if (this.f14421o == null) {
            return true;
        }
        C5729ai aiVar = this.f14422p;
        if ((aiVar != null && aiVar.mo34477j() == 4) || !this.f14421o.mo34398V()) {
            return true;
        }
        mo34585c(relativeLayout);
        this.f14421o.mo34399W();
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo34585c(RelativeLayout relativeLayout) {
        C6301q qVar;
        C5729ai aiVar = this.f14421o;
        if (aiVar != null && (qVar = (C6301q) aiVar.mo34489s()) != null) {
            C5953dz viewableAd = qVar.getViewableAd();
            if (this.f14421o.mo34475i().mo34725f()) {
                qVar.mo35448a();
            }
            View c = viewableAd.mo35074c();
            viewableAd.mo35072a((Map<View, FriendlyObstructionPurpose>) null);
            ViewGroup viewGroup = (ViewGroup) qVar.getParent();
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            if (viewGroup == null) {
                relativeLayout.addView(c, layoutParams);
                return;
            }
            viewGroup.removeAllViews();
            viewGroup.addView(c, layoutParams);
        }
    }

    /* renamed from: a */
    public final void mo34525a(C5706af afVar, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (!mo34654c(inMobiAdRequestStatus) || !mo34649a(afVar)) {
            mo34653c(afVar, inMobiAdRequestStatus);
            return;
        }
        C5729ai aiVar = this.f14421o;
        if (aiVar != null && aiVar.equals(afVar)) {
            this.f14421o.f14357q = true;
        }
        afVar.mo34438b(inMobiAdRequestStatus);
    }

    /* renamed from: b */
    public void mo34583b(C5706af afVar, boolean z, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (2 == this.f14494f) {
            if (z) {
            }
        } else if (!z) {
            afVar.mo34399W();
            mo34653c(afVar, inMobiAdRequestStatus);
        }
    }

    /* renamed from: v */
    public void mo34596v() {
        C5729ai aiVar = this.f14419m;
        if (aiVar != null) {
            aiVar.mo34555ac();
        }
        C5729ai aiVar2 = this.f14420n;
        if (aiVar2 != null) {
            aiVar2.mo34555ac();
        }
    }

    /* renamed from: w */
    public void mo34597w() {
        mo34595u();
        C5729ai aiVar = this.f14419m;
        if (aiVar != null) {
            aiVar.mo34380D();
            this.f14419m = null;
        }
        C5729ai aiVar2 = this.f14420n;
        if (aiVar2 != null) {
            aiVar2.mo34380D();
            this.f14420n = null;
        }
        this.f14421o = null;
        this.f14422p = null;
        this.f14495g = null;
    }

    /* renamed from: x */
    public void mo34598x() {
        C5706af m = mo34587m();
        if (m != null) {
            m.mo34386J();
        }
    }

    /* renamed from: a */
    public void mo34576a(byte b) {
        C5706af m = mo34587m();
        if (m != null) {
            m.mo34437b(b);
        }
    }

    /* renamed from: b */
    public void mo34582b(byte b) {
        C5706af m = mo34587m();
        if (m != null) {
            m.mo34404a(b);
        }
    }
}
