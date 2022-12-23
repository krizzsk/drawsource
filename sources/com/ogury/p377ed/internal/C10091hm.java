package com.ogury.p377ed.internal;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;

/* renamed from: com.ogury.ed.internal.hm */
public final class C10091hm {

    /* renamed from: a */
    private final Context f25326a;

    /* renamed from: b */
    private final FrameLayout f25327b;

    /* renamed from: c */
    private final C9981eb f25328c;

    public C10091hm(Context context, FrameLayout frameLayout, C9981eb ebVar) {
        C10263mq.m29882b(context, "context");
        C10263mq.m29882b(frameLayout, "activityRoot");
        C10263mq.m29882b(ebVar, "ad");
        this.f25326a = context;
        this.f25327b = frameLayout;
        this.f25328c = ebVar;
    }

    /* renamed from: a */
    public final C10158jh mo64826a(C10106hv hvVar) {
        C10263mq.m29882b(hvVar, "webViewArgs");
        FrameLayout.LayoutParams b = m29330a(hvVar, (FrameLayout.LayoutParams) null);
        C10158jh a = C10161jk.m29713a(this.f25326a, this.f25328c);
        if (a == null) {
            return null;
        }
        a.setTag(hvVar.mo64866c());
        C10092hn.m29337a(a);
        this.f25327b.addView(a, b);
        return a;
    }

    /* renamed from: a */
    public static void m29331a(WebView webView, C10106hv hvVar) {
        C10263mq.m29882b(webView, "webView");
        C10263mq.m29882b(hvVar, "webViewArgs");
        ViewGroup.LayoutParams layoutParams = webView.getLayoutParams();
        webView.setLayoutParams(m29330a(hvVar, layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null));
    }

    /* renamed from: a */
    public final void mo64827a(WebView webView) {
        C10263mq.m29882b(webView, "webView");
        this.f25327b.removeView(webView);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static FrameLayout.LayoutParams m29330a(C10106hv hvVar, FrameLayout.LayoutParams layoutParams) {
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        }
        m29334b(hvVar, layoutParams);
        m29332a(layoutParams, hvVar);
        return layoutParams;
    }

    /* renamed from: b */
    private static void m29334b(C10106hv hvVar, FrameLayout.LayoutParams layoutParams) {
        if (hvVar.mo64874g() != -1) {
            layoutParams.leftMargin = C10054gi.m29196b(hvVar.mo64874g());
        }
        if (hvVar.mo64873f() != -1) {
            layoutParams.topMargin = C10054gi.m29196b(hvVar.mo64873f());
        }
    }

    /* renamed from: a */
    private static void m29332a(FrameLayout.LayoutParams layoutParams, C10106hv hvVar) {
        int i = -1;
        layoutParams.width = hvVar.mo64872e() <= 0 ? -1 : C10054gi.m29196b(hvVar.mo64872e());
        if (hvVar.mo64870d() > 0) {
            i = C10054gi.m29196b(hvVar.mo64870d());
        }
        layoutParams.height = i;
    }
}
