package com.bytedance.mobsec.metasec.p087ov;

import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import p405ms.p406bd.p407o.Pgl.C12631r0;
import p405ms.p406bd.p407o.Pgl.C12635t0;
import p405ms.p406bd.p407o.Pgl.pblb;

/* renamed from: com.bytedance.mobsec.metasec.ov.pgla */
public class pgla {

    /* renamed from: com.bytedance.mobsec.metasec.ov.pgla$pblb */
    static class pblb extends pblb.pgla {
        pblb() {
        }

        /* renamed from: a */
        public Object mo16452a(int i, long j, String str, Object obj) throws Throwable {
            return "";
        }
    }

    /* renamed from: com.bytedance.mobsec.metasec.ov.pgla$pblc */
    static class pblc extends pblb.pgla {
        pblc() {
        }

        /* renamed from: a */
        public Object mo16452a(int i, long j, String str, Object obj) throws Throwable {
            return C12635t0.m33527c();
        }
    }

    /* renamed from: com.bytedance.mobsec.metasec.ov.pgla$pbld */
    static class pbld extends pblb.pgla {
        pbld() {
        }

        /* renamed from: a */
        public Object mo16452a(int i, long j, String str, Object obj) throws Throwable {
            return "";
        }
    }

    /* renamed from: com.bytedance.mobsec.metasec.ov.pgla$pgla  reason: collision with other inner class name */
    static class C12655pgla extends pblb.pgla {
        C12655pgla() {
        }

        /* renamed from: a */
        public Object mo16452a(int i, long j, String str, Object obj) throws Throwable {
            int i2;
            try {
                Display defaultDisplay = ((WindowManager) p405ms.p406bd.p407o.Pgl.pgla.m33513a().mo74929b().getSystemService("window")).getDefaultDisplay();
                Point point = new Point();
                if (Build.VERSION.SDK_INT >= 17) {
                    defaultDisplay.getRealSize(point);
                } else if (Build.VERSION.SDK_INT >= 13) {
                    defaultDisplay.getSize(point);
                } else {
                    C12631r0.f29908a = defaultDisplay.getWidth();
                    i2 = defaultDisplay.getHeight();
                    C12631r0.f29909b = i2;
                    return C12631r0.f29908a + "*" + C12631r0.f29909b;
                }
                C12631r0.f29908a = point.x;
                i2 = point.y;
                C12631r0.f29909b = i2;
            } catch (Throwable unused) {
            }
            return C12631r0.f29908a + "*" + C12631r0.f29909b;
        }
    }

    /* renamed from: a */
    public static void m6188a() {
        p405ms.p406bd.p407o.Pgl.pblb.m33441a(268435457, (pblb.pgla) new C12655pgla());
        p405ms.p406bd.p407o.Pgl.pblb.m33441a(268435463, (pblb.pgla) new pblb());
        p405ms.p406bd.p407o.Pgl.pblb.m33441a(268435462, (pblb.pgla) new pblc());
        p405ms.p406bd.p407o.Pgl.pblb.m33441a(268435464, (pblb.pgla) new pbld());
    }
}
