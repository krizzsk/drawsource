package com.tapjoy.internal;

import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;

/* renamed from: com.tapjoy.internal.ij */
public final class C11614ij {

    /* renamed from: n */
    public static final C11288bc<C11614ij> f27933n = new C11288bc<C11614ij>() {
        /* renamed from: a */
        public final /* synthetic */ Object mo69701a(C11296bh bhVar) {
            return new C11614ij(bhVar);
        }
    };

    /* renamed from: a */
    public C11618il f27934a;

    /* renamed from: b */
    public C11618il f27935b;

    /* renamed from: c */
    public C11618il f27936c;

    /* renamed from: d */
    public C11618il f27937d;

    /* renamed from: e */
    public int f27938e = 9;

    /* renamed from: f */
    public int f27939f = 10;

    /* renamed from: g */
    public String f27940g;

    /* renamed from: h */
    public String f27941h;

    /* renamed from: i */
    public String f27942i;

    /* renamed from: j */
    public boolean f27943j = false;

    /* renamed from: k */
    public String f27944k;

    /* renamed from: l */
    public C11610ih f27945l;

    /* renamed from: m */
    public C11610ih f27946m;

    public C11614ij(C11296bh bhVar) {
        bhVar.mo69722h();
        while (bhVar.mo69724j()) {
            String l = bhVar.mo69726l();
            if ("x".equals(l)) {
                this.f27934a = C11618il.m31818a(bhVar.mo69727m());
            } else if ("y".equals(l)) {
                this.f27935b = C11618il.m31818a(bhVar.mo69727m());
            } else if ("width".equals(l)) {
                this.f27936c = C11618il.m31818a(bhVar.mo69727m());
            } else if ("height".equals(l)) {
                this.f27937d = C11618il.m31818a(bhVar.mo69727m());
            } else if ("url".equals(l)) {
                this.f27940g = bhVar.mo69727m();
            } else if (TapjoyConstants.TJC_REDIRECT_URL.equals(l)) {
                this.f27941h = bhVar.mo69727m();
            } else if ("ad_content".equals(l)) {
                this.f27942i = bhVar.mo69727m();
            } else if (TapjoyConstants.TJC_FULLSCREEN_AD_DISMISS_URL.equals(l)) {
                this.f27943j = bhVar.mo69728n();
            } else if ("value".equals(l)) {
                this.f27944k = bhVar.mo69727m();
            } else if ("image".equals(l)) {
                this.f27945l = C11610ih.f27922e.mo69701a(bhVar);
            } else if ("image_clicked".equals(l)) {
                this.f27946m = C11610ih.f27922e.mo69701a(bhVar);
            } else if ("align".equals(l)) {
                String m = bhVar.mo69727m();
                if ("left".equals(m)) {
                    this.f27938e = 9;
                } else if ("right".equals(m)) {
                    this.f27938e = 11;
                } else if ("center".equals(m)) {
                    this.f27938e = 14;
                } else {
                    bhVar.mo69733s();
                }
            } else if ("valign".equals(l)) {
                String m2 = bhVar.mo69727m();
                if ("top".equals(m2)) {
                    this.f27939f = 10;
                } else if ("middle".equals(m2)) {
                    this.f27939f = 15;
                } else if (TJAdUnitConstants.String.BOTTOM.equals(m2)) {
                    this.f27939f = 12;
                } else {
                    bhVar.mo69733s();
                }
            } else {
                bhVar.mo69733s();
            }
        }
        bhVar.mo69723i();
    }
}
