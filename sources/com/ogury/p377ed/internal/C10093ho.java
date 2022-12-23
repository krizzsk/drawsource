package com.ogury.p377ed.internal;

import android.content.Context;
import android.webkit.WebView;
import android.widget.FrameLayout;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.ogury.ed.internal.ho */
public final class C10093ho {

    /* renamed from: a */
    public static final C10094a f25329a = new C10094a((byte) 0);

    /* renamed from: b */
    private final C9981eb f25330b;

    /* renamed from: c */
    private final Map<String, C10158jh> f25331c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Map<String, C10109hx> f25332d;

    /* renamed from: e */
    private final C10091hm f25333e;

    /* renamed from: f */
    private final C10096hp f25334f;

    /* renamed from: g */
    private final C10113ia f25335g;

    /* renamed from: h */
    private final C9943di f25336h;

    /* renamed from: i */
    private final C10141iv f25337i;

    /* renamed from: j */
    private final C10110hy f25338j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C10097hq f25339k;

    /* renamed from: l */
    private final Pattern f25340l;

    public /* synthetic */ C10093ho(C9981eb ebVar, Map map, Map map2, C10091hm hmVar, C10096hp hpVar, C10113ia iaVar, C9943di diVar, C10141iv ivVar, C10110hy hyVar, byte b) {
        this(ebVar, map, map2, hmVar, hpVar, iaVar, diVar, ivVar, hyVar);
    }

    private C10093ho(C9981eb ebVar, Map<String, C10158jh> map, Map<String, C10109hx> map2, C10091hm hmVar, C10096hp hpVar, C10113ia iaVar, C9943di diVar, C10141iv ivVar, C10110hy hyVar) {
        this.f25330b = ebVar;
        this.f25331c = map;
        this.f25332d = map2;
        this.f25333e = hmVar;
        this.f25334f = hpVar;
        this.f25335g = iaVar;
        this.f25336h = diVar;
        this.f25337i = ivVar;
        this.f25338j = hyVar;
        this.f25340l = Pattern.compile(ebVar.mo64522i());
    }

    /* renamed from: com.ogury.ed.internal.ho$a */
    public static final class C10094a {
        public /* synthetic */ C10094a(byte b) {
            this();
        }

        private C10094a() {
        }

        /* renamed from: a */
        public static C10093ho m29363a(Context context, C9981eb ebVar, FrameLayout frameLayout, C10141iv ivVar) {
            C10263mq.m29882b(context, "context");
            C10263mq.m29882b(ebVar, "ad");
            C10263mq.m29882b(frameLayout, "activityRoot");
            C10263mq.m29882b(ivVar, "mraidHandlersFactory");
            Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
            C10263mq.m29879a((Object) synchronizedMap, "synchronizedMap(mutableMapOf())");
            Map synchronizedMap2 = Collections.synchronizedMap(new LinkedHashMap());
            C10263mq.m29879a((Object) synchronizedMap2, "synchronizedMap(mutableMapOf())");
            C10091hm hmVar = new C10091hm(context, frameLayout, ebVar);
            C10096hp hpVar = new C10096hp(synchronizedMap, synchronizedMap2);
            C9981eb ebVar2 = ebVar;
            C10096hp hpVar2 = hpVar;
            C10093ho hoVar = new C10093ho(ebVar2, synchronizedMap, synchronizedMap2, hmVar, hpVar2, new C10113ia(context, hpVar), C9943di.f25015a, ivVar, new C10110hy(context, hpVar), (byte) 0);
            hoVar.f25339k = new C10097hq(hoVar, hpVar);
            return hoVar;
        }
    }

    /* renamed from: a */
    public final void mo64830a(C10227lj<C10182ke> ljVar) {
        C10263mq.m29882b(ljVar, "newWebViewCreatedCallback");
        C10097hq hqVar = this.f25339k;
        if (hqVar == null) {
            C10263mq.m29880a("multiWebViewUrlHandler");
            hqVar = null;
        }
        hqVar.mo64849a(ljVar);
    }

    /* renamed from: b */
    public final void mo64834b(C10227lj<C10182ke> ljVar) {
        C10263mq.m29882b(ljVar, "newForceCloseCallback");
        if (C9992el.m28925b(this.f25330b)) {
            C10097hq hqVar = this.f25339k;
            if (hqVar == null) {
                C10263mq.m29880a("multiWebViewUrlHandler");
                hqVar = null;
            }
            hqVar.mo64850b(ljVar);
        }
    }

    /* renamed from: a */
    public final C10087hj mo64828a() {
        C10097hq hqVar = this.f25339k;
        if (hqVar == null) {
            C10263mq.m29880a("multiWebViewUrlHandler");
            hqVar = null;
        }
        return hqVar;
    }

    /* renamed from: b */
    public final boolean mo64836b() {
        return this.f25334f.mo64848d();
    }

    /* renamed from: a */
    public final void mo64829a(C10106hv hvVar) {
        C10263mq.m29882b(hvVar, "webViewArgs");
        C10158jh a = this.f25333e.mo64826a(hvVar);
        if (a != null) {
            this.f25331c.put(hvVar.mo64866c(), a);
            this.f25332d.put(hvVar.mo64866c(), new C10109hx(hvVar.mo64875h(), hvVar.mo64876i(), hvVar.mo64858a(), false, 56));
            m29348a(a);
            WebView webView = a;
            C10064gr.m29219d(webView);
            if (hvVar.mo64877j()) {
                C10064gr.m29214a(webView);
                a.getSettings().setCacheMode(1);
            }
            m29347a(hvVar, webView);
        }
    }

    /* renamed from: a */
    private final void m29347a(C10106hv hvVar, WebView webView) {
        if (hvVar.mo64858a().length() > 0) {
            webView.loadUrl(hvVar.mo64858a());
        } else {
            webView.loadDataWithBaseURL(this.f25330b.mo64520h(), hvVar.mo64862b(), "text/html", "UTF-8", (String) null);
        }
    }

    /* renamed from: a */
    public final void mo64832a(String str, C10158jh jhVar, boolean z) {
        C10263mq.m29882b(str, "webViewName");
        C10263mq.m29882b(jhVar, "webView");
        jhVar.setTag(str);
        this.f25331c.put(str, jhVar);
        this.f25332d.put(str, new C10109hx(false, z, "", true, 48));
    }

    /* renamed from: b */
    public final void mo64833b(C10106hv hvVar) {
        C10263mq.m29882b(hvVar, "webViewArgs");
        C10158jh jhVar = this.f25331c.get(hvVar.mo64866c());
        if (jhVar != null) {
            WebView webView = jhVar;
            C10091hm.m29331a(webView, hvVar);
            boolean z = true;
            if (!(hvVar.mo64858a().length() > 0)) {
                if (hvVar.mo64862b().length() <= 0) {
                    z = false;
                }
                if (!z) {
                    return;
                }
            }
            m29347a(hvVar, webView);
        }
    }

    /* renamed from: a */
    public final void mo64831a(String str) {
        C10263mq.m29882b(str, "webViewName");
        C10158jh jhVar = this.f25331c.get(str);
        if (jhVar != null) {
            this.f25333e.mo64827a((WebView) jhVar);
        }
        this.f25331c.remove(str);
        this.f25332d.remove(str);
    }

    /* renamed from: a */
    private final void m29348a(C10158jh jhVar) {
        C10087hj[] hjVarArr = new C10087hj[2];
        C10097hq hqVar = this.f25339k;
        if (hqVar == null) {
            C10263mq.m29880a("multiWebViewUrlHandler");
            hqVar = null;
        }
        hjVarArr[0] = hqVar;
        hjVarArr[1] = this.f25337i.mo64937a(jhVar);
        jhVar.setMraidUrlHandler(new C10139iu(hjVarArr));
        jhVar.setClientAdapter(new C10095b(this, jhVar));
    }

    /* renamed from: com.ogury.ed.internal.ho$b */
    public static final class C10095b extends C10159ji {

        /* renamed from: a */
        final /* synthetic */ C10093ho f25341a;

        /* renamed from: b */
        final /* synthetic */ C10158jh f25342b;

        /* renamed from: c */
        private String f25343c = "";

        /* renamed from: d */
        private boolean f25344d;

        /* renamed from: d */
        public final boolean mo64843d(WebView webView, String str) {
            C10263mq.m29882b(webView, "view");
            C10263mq.m29882b(str, "url");
            return false;
        }

        C10095b(C10093ho hoVar, C10158jh jhVar) {
            this.f25341a = hoVar;
            this.f25342b = jhVar;
        }

        /* renamed from: a */
        public final void mo64840a(WebView webView, String str) {
            C10263mq.m29882b(webView, "webView");
            C10263mq.m29882b(str, "url");
            this.f25343c = str;
            this.f25344d = true;
            this.f25341a.m29340a(webView, str);
        }

        /* renamed from: b */
        public final void mo64841b(WebView webView, String str) {
            C10263mq.m29882b(webView, "webView");
            C10263mq.m29882b(str, "url");
            this.f25341a.m29342a(webView, str, this.f25344d);
            this.f25344d = false;
        }

        /* renamed from: c */
        public final void mo64842c(WebView webView, String str) {
            C10263mq.m29882b(webView, "view");
            C10263mq.m29882b(str, "url");
            this.f25341a.m29341a(webView, this.f25343c, str);
        }

        /* renamed from: a */
        public final void mo64360a(WebView webView) {
            C10263mq.m29882b(webView, "webView");
            C10109hx hxVar = (C10109hx) this.f25341a.f25332d.get(C10092hn.m29338b(webView));
            if (hxVar != null) {
                hxVar.mo64882e();
            }
            this.f25342b.mo64971c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m29340a(WebView webView, String str) {
        this.f25334f.mo64845a("started", m29350f(), m29349e(), C10092hn.m29338b(webView), str, "");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m29342a(WebView webView, String str, boolean z) {
        C10096hp hpVar = this.f25334f;
        boolean f = m29350f();
        boolean e = m29349e();
        String b = C10092hn.m29338b(webView);
        String title = webView.getTitle();
        C10263mq.m29879a((Object) title, "webView.title");
        hpVar.mo64845a("finished", f, e, b, str, title);
        C10109hx hxVar = this.f25332d.get(C10092hn.m29338b(webView));
        if (hxVar != null) {
            boolean z2 = true;
            boolean z3 = (!hxVar.mo64883f() || !C10263mq.m29881a((Object) hxVar.mo64880c(), (Object) str)) && hxVar.mo64878a();
            if (z && z3) {
                if (this.f25330b.mo64522i().length() != 0) {
                    z2 = false;
                }
                if (z2) {
                    C9943di.m28717a((C9942dh) new C9941dg(this.f25330b, str, "format", (String) null, (String) null));
                }
            }
            hxVar.mo64884g();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m29341a(WebView webView, String str, String str2) {
        C10109hx hxVar = this.f25332d.get(C10092hn.m29338b(webView));
        if (hxVar != null && !hxVar.mo64885h()) {
            if ((this.f25330b.mo64522i().length() > 0) && this.f25340l.matcher(str2).matches()) {
                C9981eb ebVar = this.f25330b;
                C9943di.m28717a((C9942dh) new C9941dg(ebVar, str, "format", ebVar.mo64522i(), str2));
                hxVar.mo64886i();
            }
        }
    }

    /* renamed from: c */
    public final void mo64837c() {
        for (C10158jh next : this.f25331c.values()) {
            if (next.canGoBack()) {
                next.goBack();
            }
        }
    }

    /* renamed from: d */
    public final void mo64839d() {
        this.f25334f.mo64844a();
        this.f25335g.mo64892a();
        this.f25338j.mo64887a();
        C10097hq hqVar = this.f25339k;
        if (hqVar == null) {
            C10263mq.m29880a("multiWebViewUrlHandler");
            hqVar = null;
        }
        hqVar.mo64849a((C10227lj<C10182ke>) null);
    }

    /* renamed from: e */
    private final boolean m29349e() {
        for (C10158jh canGoBack : this.f25331c.values()) {
            if (canGoBack.canGoBack()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private final boolean m29350f() {
        for (C10158jh canGoForward : this.f25331c.values()) {
            if (canGoForward.canGoForward()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo64835b(String str) {
        C10263mq.m29882b(str, "webViewName");
        C10158jh jhVar = this.f25331c.get(str);
        if (jhVar != null && jhVar.canGoBack()) {
            jhVar.goBack();
        }
    }

    /* renamed from: c */
    public final void mo64838c(String str) {
        C10263mq.m29882b(str, "webViewName");
        C10158jh jhVar = this.f25331c.get(str);
        if (jhVar != null && jhVar.canGoForward()) {
            jhVar.goForward();
        }
    }
}
