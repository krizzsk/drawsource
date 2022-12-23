package com.tapjoy.internal;

import android.graphics.Rect;
import com.tapjoy.TapjoyConstants;

/* renamed from: com.tapjoy.internal.ic */
public final class C11598ic {

    /* renamed from: h */
    public static final C11288bc<C11598ic> f27881h = new C11288bc<C11598ic>() {
        /* renamed from: a */
        public final /* synthetic */ Object mo69701a(C11296bh bhVar) {
            bhVar.mo69722h();
            Rect rect = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            C11591hy hyVar = null;
            boolean z = false;
            String str4 = "";
            while (bhVar.mo69724j()) {
                String l = bhVar.mo69726l();
                if ("region".equals(l)) {
                    rect = C11289bd.f26952b.mo69701a(bhVar);
                } else if ("value".equals(l)) {
                    str = bhVar.mo69727m();
                } else if (TapjoyConstants.TJC_FULLSCREEN_AD_DISMISS_URL.equals(l)) {
                    z = bhVar.mo69728n();
                } else if ("url".equals(l)) {
                    str4 = bhVar.mo69727m();
                } else if (TapjoyConstants.TJC_REDIRECT_URL.equals(l)) {
                    str2 = bhVar.mo69711b();
                } else if ("ad_content".equals(l)) {
                    str3 = bhVar.mo69711b();
                } else if (C11591hy.m31774a(l)) {
                    hyVar = C11591hy.m31773a(l, bhVar);
                } else {
                    bhVar.mo69733s();
                }
            }
            bhVar.mo69723i();
            return new C11598ic(rect, str, z, str4, str2, str3, hyVar);
        }
    };

    /* renamed from: a */
    public final Rect f27882a;

    /* renamed from: b */
    public final String f27883b;

    /* renamed from: c */
    public final boolean f27884c;

    /* renamed from: d */
    public final String f27885d;

    /* renamed from: e */
    public String f27886e;

    /* renamed from: f */
    public String f27887f;

    /* renamed from: g */
    public final C11537gv f27888g;

    C11598ic(Rect rect, String str, boolean z, String str2, String str3, String str4, C11537gv gvVar) {
        this.f27882a = rect;
        this.f27883b = str;
        this.f27884c = z;
        this.f27885d = str2;
        this.f27886e = str3;
        this.f27887f = str4;
        this.f27888g = gvVar;
    }
}
