package com.tapjoy.internal;

import android.graphics.PointF;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;

/* renamed from: com.tapjoy.internal.ik */
public final class C11616ik {

    /* renamed from: d */
    public static final C11288bc<C11616ik> f27947d = new C11288bc<C11616ik>() {
        /* renamed from: a */
        public final /* synthetic */ Object mo69701a(C11296bh bhVar) {
            return new C11616ik(bhVar);
        }
    };

    /* renamed from: a */
    public C11692z f27948a = C11692z.UNSPECIFIED;

    /* renamed from: b */
    public PointF f27949b;

    /* renamed from: c */
    public ArrayList<C11614ij> f27950c = new ArrayList<>();

    public C11616ik(C11296bh bhVar) {
        bhVar.mo69722h();
        while (bhVar.mo69724j()) {
            String l = bhVar.mo69726l();
            if (TJAdUnitConstants.String.BUTTONS.equals(l)) {
                if (bhVar.mo69725k() == C11305bm.BEGIN_ARRAY) {
                    bhVar.mo69708a(this.f27950c, C11614ij.f27933n);
                } else {
                    bhVar.mo69733s();
                }
            } else if ("window_aspect_ratio".equals(l)) {
                if (bhVar.mo69710a()) {
                    PointF pointF = new PointF();
                    bhVar.mo69722h();
                    while (bhVar.mo69724j()) {
                        String l2 = bhVar.mo69726l();
                        if ("width".equals(l2)) {
                            pointF.x = (float) bhVar.mo69730p();
                        } else if ("height".equals(l2)) {
                            pointF.y = (float) bhVar.mo69730p();
                        } else {
                            bhVar.mo69733s();
                        }
                    }
                    bhVar.mo69723i();
                    if (!(pointF.x == 0.0f || pointF.y == 0.0f)) {
                        this.f27949b = pointF;
                    }
                } else {
                    bhVar.mo69733s();
                }
            } else if (TJAdUnitConstants.String.ORIENTATION.equals(l)) {
                String m = bhVar.mo69727m();
                if ("landscape".equals(m)) {
                    this.f27948a = C11692z.LANDSCAPE;
                } else if ("portrait".equals(m)) {
                    this.f27948a = C11692z.PORTRAIT;
                }
            } else {
                bhVar.mo69733s();
            }
        }
        bhVar.mo69723i();
    }
}
