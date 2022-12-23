package com.tapjoy.internal;

import android.graphics.Point;
import android.text.TextUtils;
import java.net.URL;

/* renamed from: com.tapjoy.internal.if */
public final class C11606if {

    /* renamed from: d */
    public static final C11288bc<C11606if> f27915d = new C11288bc<C11606if>() {
        /* renamed from: b */
        private static Point m31802b(C11296bh bhVar) {
            bhVar.mo69722h();
            Point point = null;
            while (bhVar.mo69724j()) {
                if ("offset".equals(bhVar.mo69726l())) {
                    bhVar.mo69722h();
                    int i = 0;
                    int i2 = 0;
                    while (bhVar.mo69724j()) {
                        String l = bhVar.mo69726l();
                        if ("x".equals(l)) {
                            i = bhVar.mo69732r();
                        } else if ("y".equals(l)) {
                            i2 = bhVar.mo69732r();
                        } else {
                            bhVar.mo69733s();
                        }
                    }
                    bhVar.mo69723i();
                    point = new Point(i, i2);
                } else {
                    bhVar.mo69733s();
                }
            }
            bhVar.mo69723i();
            return point;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo69701a(C11296bh bhVar) {
            bhVar.mo69722h();
            C11610ih ihVar = null;
            Point point = null;
            Point point2 = null;
            while (bhVar.mo69724j()) {
                String l = bhVar.mo69726l();
                if ("image".equals(l)) {
                    String m = bhVar.mo69727m();
                    if (!TextUtils.isEmpty(m)) {
                        ihVar = new C11610ih(new URL(m));
                    }
                } else if ("landscape".equals(l)) {
                    point = m31802b(bhVar);
                } else if ("portrait".equals(l)) {
                    point2 = m31802b(bhVar);
                } else {
                    bhVar.mo69733s();
                }
            }
            bhVar.mo69723i();
            return new C11606if(ihVar, point, point2);
        }
    };

    /* renamed from: a */
    public final C11610ih f27916a;

    /* renamed from: b */
    public final Point f27917b;

    /* renamed from: c */
    public final Point f27918c;

    public C11606if(C11610ih ihVar, Point point, Point point2) {
        this.f27916a = ihVar;
        this.f27917b = point;
        this.f27918c = point2;
    }
}
