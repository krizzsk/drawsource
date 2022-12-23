package com.fyber.inneractive.sdk.mraid;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.C4109R;
import com.fyber.inneractive.sdk.util.C5292l;
import com.fyber.inneractive.sdk.util.C5306p0;
import com.fyber.inneractive.sdk.util.C5312s;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C5347c;
import com.fyber.inneractive.sdk.web.C5349d;
import com.fyber.inneractive.sdk.web.C5364h;
import com.fyber.inneractive.sdk.web.C5368l;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.mraid.e */
public class C4449e extends C4443a {
    public C4449e(Map<String, String> map, C5349d dVar, C5306p0 p0Var) {
        super(map, dVar, p0Var);
    }

    /* renamed from: a */
    public void mo24635a() {
        int i;
        int a = mo24634a("w");
        int a2 = mo24634a("h");
        String str = this.f10962b.get("url");
        boolean equals = "true".equals(this.f10962b.get("shouldUseCustomClose"));
        boolean equals2 = "true".equals(this.f10962b.get("lockOrientation"));
        if (a <= 0) {
            a = -1;
        }
        if (a2 <= 0) {
            a2 = -1;
        }
        C5349d dVar = this.f10963c;
        if (dVar.f14079b != null && dVar.f14145z != C5349d.C5353d.DISABLED && dVar.f14144y == C4444a0.DEFAULT) {
            if (str == null || URLUtil.isValidUrl(str)) {
                int i2 = 0;
                try {
                    ViewGroup viewGroup = (ViewGroup) dVar.f14079b.getRootView().findViewById(16908290);
                    dVar.f14121C = viewGroup;
                    if (viewGroup == null) {
                        IAlog.m16450e("Couldn't find content in the view tree", new Object[0]);
                        dVar.mo26470a(C4450f.RESIZE, "Ad can be resized only if it's state is default or resized.");
                        return;
                    }
                    dVar.f14127I = equals;
                    L l = dVar.f14084g;
                    if (l != null) {
                        ((C5349d.C5355f) l).mo24891a(dVar, equals);
                    }
                    dVar.mo26477d(equals2);
                    if (dVar.f14134P >= 0) {
                        dVar.f14134P = C5292l.m16507b(a2);
                    }
                    if (dVar.f14133O >= 0) {
                        dVar.f14133O = C5292l.m16507b(i);
                    }
                    C5347c cVar = dVar.f14079b;
                    if (str != null) {
                        C5347c cVar2 = new C5347c(dVar.mo26479g());
                        dVar.f14122D = cVar2;
                        cVar2.setId(C4109R.C4111id.inneractive_webview_mraid);
                        dVar.f14122D.loadUrl(str);
                        dVar.f14122D.setWebChromeClient(dVar.f14080c);
                        dVar.f14122D.setWebViewClient(dVar.f14081d);
                        cVar = dVar.f14122D;
                        cVar.setOnKeyListener(new C5364h(dVar));
                    } else {
                        ViewGroup viewGroup2 = (ViewGroup) cVar.getParent();
                        if (viewGroup2 != null) {
                            int childCount = viewGroup2.getChildCount();
                            while (i2 < childCount && viewGroup2.getChildAt(i2) != dVar.f14079b) {
                                i2++;
                            }
                            dVar.f14136R = i2;
                            C5312s.m16536a((View) dVar.f14137S);
                            viewGroup2.addView(dVar.f14137S, i2, new ViewGroup.LayoutParams(dVar.f14079b.getWidth(), dVar.f14079b.getHeight()));
                            viewGroup2.removeView(dVar.f14079b);
                        }
                    }
                    float f = dVar.f14128J;
                    int i3 = (int) ((50.0f * f) + 0.5f);
                    if (a2 >= 0 && i >= 0) {
                        i = (int) (((float) i) * f);
                        a2 = (int) (((float) a2) * f);
                        if (i < i3) {
                            i = i3;
                        }
                        if (a2 < i3) {
                            a2 = i3;
                        }
                    }
                    View view = new View(dVar.mo26479g());
                    view.setBackgroundColor(dVar.mo26479g().getResources().getColor(C4109R.color.ia_mraid_expanded_dimmed_bk));
                    view.setOnTouchListener(new C5368l(dVar));
                    dVar.f14139U.addView(view, new RelativeLayout.LayoutParams(-1, -1));
                    C5312s.m16536a((View) cVar);
                    dVar.f14138T.addView(cVar, new RelativeLayout.LayoutParams(-1, -1));
                    C5312s.m16536a((View) dVar.f14138T);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, a2);
                    layoutParams.addRule(13);
                    dVar.f14139U.addView(dVar.f14138T, layoutParams);
                    C5312s.m16536a((View) dVar.f14139U);
                    dVar.f14121C.addView(dVar.f14139U, new ViewGroup.LayoutParams(-1, -1));
                    if (!cVar.hasFocus()) {
                        cVar.requestFocus();
                    }
                    C5349d.C5357h hVar = dVar.f14119A;
                    if (hVar == C5349d.C5357h.ALWAYS_VISIBLE || (!dVar.f14127I && hVar != C5349d.C5357h.ALWAYS_HIDDEN)) {
                        dVar.mo26476c(true);
                    }
                    C4444a0 a0Var = C4444a0.EXPANDED;
                    dVar.f14144y = a0Var;
                    dVar.mo26471a((C4464t) new C4469y(a0Var));
                    int i4 = dVar.f14133O;
                    if (!(i4 == -1 || dVar.f14134P == -1)) {
                        dVar.mo26471a((C4464t) new C4463s(C5292l.m16512c(i4), C5292l.m16512c(dVar.f14134P)));
                    }
                    L l2 = dVar.f14084g;
                    if (l2 != null) {
                        ((C5349d.C5355f) l2).mo24889a(dVar);
                    }
                } catch (Exception unused) {
                    IAlog.m16450e("Couldn't find content in the view tree", new Object[0]);
                    dVar.mo26470a(C4450f.RESIZE, "Ad can be resized only if it's state is default or resized.");
                }
            } else {
                dVar.mo26470a(C4450f.EXPAND, "URL passed to expand() was invalid.");
            }
        }
    }

    /* renamed from: c */
    public String mo24632c() {
        return this.f10962b.get("url");
    }
}
