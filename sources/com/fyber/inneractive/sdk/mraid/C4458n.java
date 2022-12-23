package com.fyber.inneractive.sdk.mraid;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.util.C5292l;
import com.fyber.inneractive.sdk.util.C5306p0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C5347c;
import com.fyber.inneractive.sdk.web.C5349d;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.mraid.n */
public class C4458n extends C4445b {
    public C4458n(Map<String, String> map, C5349d dVar, C5306p0 p0Var) {
        super(map, dVar, p0Var);
    }

    /* renamed from: a */
    public void mo24635a() {
        int a = mo24634a("w");
        int a2 = mo24634a("h");
        int a3 = mo24634a("offsetX");
        int a4 = mo24634a("offsetY");
        boolean equals = "true".equals(this.f10962b.get("allowOffscreen"));
        String str = this.f10962b.get("customClosePosition");
        if (a <= 0) {
            a = this.f10963c.f14129K;
        }
        if (a2 <= 0) {
            a2 = this.f10963c.f14130L;
        }
        C5349d dVar = this.f10963c;
        C5347c cVar = dVar.f14079b;
        if (cVar != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) cVar.getRootView().findViewById(16908290);
                dVar.f14121C = viewGroup;
                if (viewGroup == null) {
                    IAlog.m16450e("Couldn't find content in the view tree", new Object[0]);
                    dVar.mo26470a(C4450f.RESIZE, "Ad can be resized only if it's state is default or resized.");
                } else if (dVar.f14145z != C5349d.C5353d.DISABLED) {
                    C4444a0 a0Var = dVar.f14144y;
                    if (a0Var != C4444a0.DEFAULT && a0Var != C4444a0.RESIZED) {
                        dVar.mo26470a(C4450f.RESIZE, "Ad can be resized only if it's state is default or resized.");
                    } else if (a >= 0 || a2 >= 0) {
                        dVar.mo26474b(false);
                        C5349d.C5357h hVar = dVar.f14119A;
                        if (hVar == C5349d.C5357h.ALWAYS_VISIBLE || (!dVar.f14127I && hVar != C5349d.C5357h.ALWAYS_HIDDEN)) {
                            dVar.mo26476c(true);
                        }
                        dVar.mo26477d(false);
                        dVar.f14134P = C5292l.m16507b(a2);
                        dVar.f14133O = C5292l.m16507b(a);
                        if (!equals) {
                            int i = (a3 + a) - dVar.f14129K;
                            if (i > 0) {
                                a3 -= i;
                            }
                            if (a3 < 0) {
                                a3 = 0;
                            }
                            int i2 = (a4 + a2) - dVar.f14130L;
                            if (i2 > 0) {
                                a4 -= i2;
                            }
                            if (a4 < 0) {
                                a4 = 0;
                            }
                        }
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C5292l.m16507b(a), C5292l.m16507b(a2));
                        layoutParams.leftMargin = a3;
                        layoutParams.topMargin = a4;
                        if (a3 == 0 && a4 == 0) {
                            layoutParams.gravity = 17;
                        }
                        dVar.f14079b.setLayoutParams(layoutParams);
                        C4444a0 a0Var2 = dVar.f14144y;
                        C4444a0 a0Var3 = C4444a0.RESIZED;
                        if (a0Var2 != a0Var3) {
                            dVar.f14144y = a0Var3;
                            dVar.mo26471a((C4464t) new C4469y(a0Var3));
                            int i3 = dVar.f14133O;
                            if (!(i3 == -1 || dVar.f14134P == -1)) {
                                dVar.mo26471a((C4464t) new C4463s(C5292l.m16512c(i3), C5292l.m16512c(dVar.f14134P)));
                            }
                        }
                        L l = dVar.f14084g;
                        if (l != null) {
                            ((C5349d.C5355f) l).mo24896b(dVar);
                        }
                    } else {
                        dVar.mo26470a(C4450f.RESIZE, "Creative size passed to resize() was invalid.");
                    }
                }
            } catch (Exception unused) {
                IAlog.m16450e("Couldn't find content in the view tree", new Object[0]);
                dVar.mo26470a(C4450f.RESIZE, "Ad can be resized only if it's state is default or resized.");
            }
        }
    }

    /* renamed from: b */
    public boolean mo24631b() {
        return true;
    }
}
