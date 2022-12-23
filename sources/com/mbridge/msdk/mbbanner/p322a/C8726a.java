package com.mbridge.msdk.mbbanner.p322a;

import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.report.C8598e;
import com.mbridge.msdk.foundation.tools.C8620ag;
import com.mbridge.msdk.mbbanner.common.p323a.C8730b;
import com.mbridge.msdk.mbbanner.common.p324b.C8734b;
import com.mbridge.msdk.mbbanner.common.p324b.C8735c;
import com.mbridge.msdk.mbbanner.common.p325c.C8747a;
import com.mbridge.msdk.mbbanner.common.p325c.C8754c;
import com.mbridge.msdk.mbsignalcommon.webEnvCheck.C8878a;
import com.mbridge.msdk.out.BannerAdListener;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.p078c.C2445b;
import com.mbridge.msdk.p078c.C2452c;
import com.mbridge.msdk.p078c.C2456d;
import java.util.List;

/* renamed from: com.mbridge.msdk.mbbanner.a.a */
/* compiled from: BannerController */
public final class C8726a {

    /* renamed from: a */
    private static String f21396a = "BannerController";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f21397b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f21398c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public MBridgeIds f21399d;

    /* renamed from: e */
    private boolean f21400e;

    /* renamed from: f */
    private int f21401f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public MBBannerView f21402g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f21403h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f21404i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f21405j;

    /* renamed from: k */
    private int f21406k = -1;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public BannerAdListener f21407l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public CampaignUnit f21408m;

    /* renamed from: n */
    private C8754c f21409n;

    /* renamed from: o */
    private C2456d f21410o;

    /* renamed from: p */
    private C2452c f21411p;

    /* renamed from: q */
    private boolean f21412q;

    /* renamed from: r */
    private boolean f21413r;

    /* renamed from: s */
    private boolean f21414s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean f21415t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f21416u;

    /* renamed from: v */
    private C8735c f21417v = new C8735c() {
        /* renamed from: a */
        public final void mo58334a(List<CampaignEx> list) {
            if (C8726a.this.f21407l != null) {
                C8726a.this.f21407l.onLoadSuccessed(C8726a.this.f21399d);
            }
        }

        /* renamed from: a */
        public final void mo58332a(CampaignEx campaignEx) {
            C8726a.this.mo58327c();
            if (C8726a.this.f21407l != null) {
                C8726a.this.f21407l.onLogImpression(C8726a.this.f21399d);
            }
        }

        /* renamed from: a */
        public final void mo58333a(String str) {
            C8726a.this.m25094b(str);
        }

        /* renamed from: a */
        public final void mo58331a() {
            if (C8726a.this.f21407l != null) {
                C8726a.this.f21407l.onClick(C8726a.this.f21399d);
            }
        }

        /* renamed from: b */
        public final void mo58335b() {
            if (C8726a.this.f21407l != null) {
                C8726a.this.f21407l.onLeaveApp(C8726a.this.f21399d);
            }
        }

        /* renamed from: c */
        public final void mo58336c() {
            if (C8726a.this.f21407l != null) {
                C8726a.this.f21407l.showFullScreen(C8726a.this.f21399d);
                boolean unused = C8726a.this.f21416u = true;
                C8747a.m25208a().mo58391a(2, C8726a.this.f21398c, C8726a.this.f21397b, (C8730b) null, (C8734b) null);
            }
        }

        /* renamed from: d */
        public final void mo58337d() {
            if (C8726a.this.f21407l != null) {
                C8726a.this.f21407l.closeFullScreen(C8726a.this.f21399d);
                boolean unused = C8726a.this.f21416u = false;
                C8747a a = C8747a.m25208a();
                String c = C8726a.this.f21398c;
                String d = C8726a.this.f21397b;
                a.mo58391a(3, c, d, new C8730b(C8726a.this.f21404i + "x" + C8726a.this.f21403h, C8726a.this.f21405j * 1000), C8726a.this.f21418w);
            }
        }

        /* renamed from: e */
        public final void mo58338e() {
            if (C8726a.this.f21407l != null) {
                C8726a.this.f21407l.onCloseBanner(C8726a.this.f21399d);
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C8734b f21418w = new C8734b() {
        /* renamed from: a */
        public final void mo58339a(String str, CampaignUnit campaignUnit, boolean z) {
            CampaignUnit unused = C8726a.this.f21408m = campaignUnit;
        }

        /* renamed from: a */
        public final void mo58340a(String str, String str2, boolean z) {
            if (C8726a.this.f21407l != null) {
                C8726a.this.f21407l.onLoadFailed(C8726a.this.f21399d, str2);
            }
            C8726a.this.mo58327c();
            C8598e.m24674a(C8388a.m23845e().mo56913g(), str2, C8726a.this.f21397b, z);
        }

        /* renamed from: a */
        public final void mo58341a(String str, boolean z) {
            if (C8726a.this.f21408m != null) {
                C8598e.m24676a(C8388a.m23845e().mo56913g(), (List<CampaignEx>) C8726a.this.f21408m.getAds(), C8726a.this.f21397b, z);
            }
            if (C8726a.this.f21402g != null) {
                boolean unused = C8726a.this.f21415t = true;
                C8726a.this.m25102g();
            }
        }

        /* renamed from: b */
        public final void mo58342b(String str, boolean z) {
            if (C8726a.this.f21407l != null) {
                C8726a.this.f21407l.onLoadFailed(C8726a.this.f21399d, "banner res load failed");
            }
            C8726a.this.mo58327c();
            C8598e.m24674a(C8388a.m23845e().mo56913g(), "banner res load failed", C8726a.this.f21397b, z);
        }
    };

    /* renamed from: b */
    private int m25092b(int i) {
        if (i <= 0) {
            return i;
        }
        if (i < 10) {
            return 10;
        }
        if (i > 180) {
            return 180;
        }
        return i;
    }

    /* renamed from: a */
    public final String mo58318a() {
        CampaignUnit campaignUnit = this.f21408m;
        return (campaignUnit == null || campaignUnit.getRequestId() == null) ? "" : this.f21408m.getRequestId();
    }

    public C8726a(MBBannerView mBBannerView, BannerSize bannerSize, String str, String str2) {
        this.f21402g = mBBannerView;
        if (bannerSize != null) {
            this.f21403h = bannerSize.getHeight();
            this.f21404i = bannerSize.getWidth();
        }
        this.f21397b = str2;
        this.f21398c = str;
        this.f21399d = new MBridgeIds(str, str2);
        String h = C8388a.m23845e().mo56914h();
        String j = C8388a.m23845e().mo56916j();
        if (this.f21411p == null) {
            this.f21411p = new C2452c();
        }
        this.f21411p.mo16303a(C8388a.m23845e().mo56913g(), h, j, this.f21397b);
        m25100f();
    }

    /* renamed from: a */
    public final void mo58322a(BannerSize bannerSize) {
        if (bannerSize != null) {
            this.f21403h = bannerSize.getHeight();
            this.f21404i = bannerSize.getWidth();
        }
    }

    /* renamed from: a */
    public final void mo58319a(int i) {
        int b = m25092b(i);
        this.f21406k = b;
        this.f21405j = b;
    }

    /* renamed from: a */
    public final void mo58324a(boolean z) {
        this.f21400e = z;
        this.f21401f = z ? 1 : 2;
    }

    /* renamed from: f */
    private void m25100f() {
        C2456d e = C2445b.m6020a().mo16292e(C8388a.m23845e().mo56914h(), this.f21397b);
        this.f21410o = e;
        if (e == null) {
            this.f21410o = C2456d.m6070d(this.f21397b);
        }
        if (this.f21406k == -1) {
            this.f21405j = m25092b(this.f21410o.mo16309b());
        }
        if (this.f21401f == 0) {
            boolean z = true;
            if (this.f21410o.mo16311c() != 1) {
                z = false;
            }
            this.f21400e = z;
            C8754c cVar = this.f21409n;
            if (cVar != null) {
                cVar.mo58407a(z);
            }
        }
    }

    /* renamed from: a */
    public final void mo58323a(String str) {
        if (this.f21403h < 1 || this.f21404i < 1) {
            BannerAdListener bannerAdListener = this.f21407l;
            if (bannerAdListener != null) {
                bannerAdListener.onLoadFailed(this.f21399d, "banner load failed because params are exception");
                return;
            }
            return;
        }
        boolean z = false;
        try {
            z = C8878a.m25646a(C8388a.m23845e().mo56913g());
        } catch (Exception unused) {
        }
        if (!z) {
            BannerAdListener bannerAdListener2 = this.f21407l;
            if (bannerAdListener2 != null) {
                bannerAdListener2.onLoadFailed(this.f21399d, "banner load failed because WebView is not available");
                return;
            }
            return;
        }
        C8730b bVar = new C8730b(this.f21404i + "x" + this.f21403h, this.f21405j * 1000);
        bVar.mo58354a(str);
        bVar.mo58356b(this.f21398c);
        C8747a.m25208a().mo58393a(this.f21398c, this.f21397b, bVar, this.f21418w);
        C8747a.m25208a().mo58391a(1, this.f21398c, this.f21397b, bVar, this.f21418w);
    }

    /* renamed from: a */
    public final void mo58321a(BannerAdListener bannerAdListener) {
        this.f21407l = bannerAdListener;
    }

    /* renamed from: b */
    public final void mo58325b() {
        this.f21414s = true;
        if (this.f21407l != null) {
            this.f21407l = null;
        }
        if (this.f21418w != null) {
            this.f21418w = null;
        }
        if (this.f21417v != null) {
            this.f21417v = null;
        }
        if (this.f21402g != null) {
            this.f21402g = null;
        }
        C8747a.m25208a().mo58391a(4, this.f21398c, this.f21397b, (C8730b) null, (C8734b) null);
        C8747a.m25208a().mo58392a(this.f21397b);
        C8747a.m25208a().mo58394b();
        C8754c cVar = this.f21409n;
        if (cVar != null) {
            cVar.mo58403a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m25102g() {
        if (!this.f21414s && this.f21415t) {
            if (this.f21408m != null) {
                if (this.f21409n == null) {
                    this.f21409n = new C8754c(this.f21402g, this.f21417v, this.f21398c, this.f21397b, this.f21400e, this.f21410o);
                }
                this.f21409n.mo58409b(this.f21412q);
                this.f21409n.mo58410c(this.f21413r);
                this.f21409n.mo58408a(this.f21400e, this.f21401f);
                this.f21409n.mo58406a(this.f21408m);
            } else {
                m25094b("banner show failed because campain is exception");
            }
            this.f21415t = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m25094b(String str) {
        BannerAdListener bannerAdListener = this.f21407l;
        if (bannerAdListener != null) {
            bannerAdListener.onLoadFailed(this.f21399d, str);
        }
        mo58327c();
    }

    /* renamed from: c */
    public final void mo58327c() {
        if (!this.f21414s) {
            m25104h();
            m25100f();
            C8730b bVar = new C8730b(this.f21404i + "x" + this.f21403h, this.f21405j * 1000);
            bVar.mo58356b(this.f21398c);
            C8747a.m25208a().mo58395b(this.f21398c, this.f21397b, bVar, this.f21418w);
        }
    }

    /* renamed from: b */
    public final void mo58326b(boolean z) {
        this.f21412q = z;
        m25106i();
        m25102g();
    }

    /* renamed from: c */
    public final void mo58328c(boolean z) {
        this.f21413r = z;
        m25106i();
    }

    /* renamed from: h */
    private void m25104h() {
        MBBannerView mBBannerView = this.f21402g;
        if (mBBannerView != null) {
            if (!this.f21412q || !this.f21413r || this.f21416u || C8620ag.m24732a(mBBannerView)) {
                C8747a.m25208a().mo58391a(2, this.f21398c, this.f21397b, (C8730b) null, (C8734b) null);
            } else {
                C8747a a = C8747a.m25208a();
                String str = this.f21398c;
                String str2 = this.f21397b;
                a.mo58391a(3, str, str2, new C8730b(this.f21404i + "x" + this.f21403h, this.f21405j * 1000), this.f21418w);
            }
            if (!this.f21412q) {
                C8747a.m25208a().mo58391a(4, this.f21398c, this.f21397b, (C8730b) null, (C8734b) null);
                C8747a.m25208a().mo58392a(this.f21397b);
            }
        }
    }

    /* renamed from: i */
    private void m25106i() {
        m25104h();
        C8754c cVar = this.f21409n;
        if (cVar != null) {
            cVar.mo58409b(this.f21412q);
            this.f21409n.mo58410c(this.f21413r);
        }
    }

    /* renamed from: a */
    public final void mo58320a(int i, int i2, int i3, int i4) {
        C8754c cVar = this.f21409n;
        if (cVar != null) {
            cVar.mo58404a(i, i2, i3, i4);
        }
    }

    /* renamed from: d */
    public final void mo58329d() {
        C8747a a = C8747a.m25208a();
        String str = this.f21398c;
        String str2 = this.f21397b;
        a.mo58391a(4, str, str2, new C8730b(this.f21404i + "x" + this.f21403h, this.f21405j * 1000), this.f21418w);
    }

    /* renamed from: e */
    public final void mo58330e() {
        C8747a a = C8747a.m25208a();
        String str = this.f21398c;
        String str2 = this.f21397b;
        a.mo58391a(3, str, str2, new C8730b(this.f21404i + "x" + this.f21403h, this.f21405j * 1000), this.f21418w);
    }
}
