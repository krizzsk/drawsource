package com.ogury.p377ed.internal;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ogury.p377ed.internal.C10139iu;
import com.ogury.p377ed.internal.C10152jd;

/* renamed from: com.ogury.ed.internal.jh */
public final class C10158jh extends WebView {

    /* renamed from: a */
    private C9981eb f25507a;

    /* renamed from: b */
    private MutableContextWrapper f25508b;

    /* renamed from: c */
    private boolean f25509c;

    /* renamed from: d */
    private C10162jl f25510d;

    /* renamed from: e */
    private String f25511e;

    /* renamed from: f */
    private C10078hb f25512f;

    /* renamed from: g */
    private boolean f25513g;

    /* renamed from: h */
    private C10087hj f25514h;

    /* renamed from: i */
    private C10160jj f25515i;

    /* renamed from: j */
    private boolean f25516j;

    /* renamed from: k */
    private boolean f25517k;

    /* renamed from: l */
    private C10159ji f25518l;

    /* renamed from: m */
    private C10116id f25519m;

    /* renamed from: n */
    private C10058gm f25520n;

    /* renamed from: o */
    private C10152jd f25521o;

    /* renamed from: p */
    private final C10308ob f25522p;

    public /* synthetic */ C10158jh(Context context, C9981eb ebVar) {
        this(context, ebVar, new MutableContextWrapper(context));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C10158jh(Context context, C9981eb ebVar, MutableContextWrapper mutableContextWrapper) {
        super(mutableContextWrapper);
        C10263mq.m29882b(context, "context");
        C10263mq.m29882b(ebVar, "ad");
        C10263mq.m29882b(mutableContextWrapper, "mutableContext");
        this.f25507a = ebVar;
        this.f25508b = mutableContextWrapper;
        this.f25509c = true;
        this.f25511e = "loading";
        this.f25512f = new C10078hb(this);
        this.f25514h = new C10136is(this);
        this.f25515i = new C10160jj(this);
        this.f25519m = C10116id.f25410a;
        this.f25520n = C10058gm.f25283a;
        C10152jd.C10153a aVar = C10152jd.f25497a;
        this.f25521o = C10152jd.C10153a.m29677a(context, this.f25507a);
        this.f25522p = new C10308ob("bunaZiua");
        setAdUnit(this.f25507a.mo64530m());
        setWebViewClient(this.f25515i);
    }

    public final boolean getShowSdkCloseButton() {
        return this.f25509c;
    }

    public final void setShowSdkCloseButton(boolean z) {
        this.f25509c = z;
    }

    public final C10162jl getVisibilityChangedListener() {
        return this.f25510d;
    }

    public final void setVisibilityChangedListener(C10162jl jlVar) {
        this.f25510d = jlVar;
    }

    public final String getAdState() {
        return this.f25511e;
    }

    public final void setAdState(String str) {
        C10263mq.m29882b(str, "<set-?>");
        this.f25511e = str;
    }

    public final C10078hb getMraidCommandExecutor() {
        C10078hb hbVar = this.f25512f;
        return hbVar == null ? new C10078hb(this) : hbVar;
    }

    public final boolean getContainsMraid() {
        return this.f25513g;
    }

    public final void setContainsMraid(boolean z) {
        this.f25513g = z;
    }

    public final C10087hj getMraidUrlHandler() {
        return this.f25514h;
    }

    public final void setMraidUrlHandler(C10087hj hjVar) {
        C10263mq.m29882b(hjVar, "<set-?>");
        this.f25514h = hjVar;
    }

    /* renamed from: a */
    public final boolean mo64968a() {
        return this.f25516j;
    }

    public final void setResumed(boolean z) {
        this.f25516j = z;
    }

    /* renamed from: b */
    public final boolean mo64970b() {
        return this.f25517k;
    }

    public final void setMultiBrowserOpened(boolean z) {
        this.f25517k = z;
    }

    public final C10159ji getClientAdapter() {
        return this.f25518l;
    }

    public final void setClientAdapter(C10159ji jiVar) {
        this.f25518l = jiVar;
        C10160jj jjVar = this.f25515i;
        if (jjVar != null) {
            jjVar.mo65005a(jiVar);
        }
    }

    public final void setTestTopActivityMonitor(C10058gm gmVar) {
        C10263mq.m29882b(gmVar, "topActivityMonitor");
        this.f25520n = gmVar;
    }

    public final void setTestMraidLifecycle(C10152jd jdVar) {
        C10263mq.m29882b(jdVar, "mraidLifecycle");
        this.f25521o = jdVar;
    }

    public final void setMraidCommandExecutor(C10078hb hbVar) {
        C10263mq.m29882b(hbVar, "mraidCommandExecutor");
        this.f25512f = hbVar;
    }

    public final void setTestCacheStore(C10116id idVar) {
        C10263mq.m29882b(idVar, "mraidCacheStore");
        this.f25519m = idVar;
    }

    public final void setTestMraidViewClientWrapper(C10160jj jjVar) {
        C10263mq.m29882b(jjVar, "mraidWebViewClientWrapper");
        this.f25515i = jjVar;
    }

    public final C10160jj getMraidWebViewClient() {
        return this.f25515i;
    }

    private final void setAdUnit(C9991ek ekVar) {
        C10160jj jjVar = this.f25515i;
        if (jjVar != null) {
            jjVar.mo64824a(ekVar);
        }
    }

    /* renamed from: c */
    public final void mo64971c() {
        this.f25521o.mo64963a(this);
    }

    /* renamed from: j */
    private final void m29686j() {
        this.f25521o.mo64964b(this);
    }

    /* renamed from: d */
    public final void mo64972d() {
        this.f25521o.mo64965c(this);
    }

    /* renamed from: e */
    public final void mo64973e() {
        this.f25521o.mo64966d(this);
    }

    public final void setOnVisibilityChangedListener(C10162jl jlVar) {
        C10263mq.m29882b(jlVar, "visibilityListener");
        this.f25510d = jlVar;
    }

    /* renamed from: a */
    public final void mo64967a(String str) {
        C10263mq.m29882b(str, "url");
        if (this.f25522p.mo65164a(str)) {
            this.f25513g = true;
            m29686j();
            C10159ji jiVar = this.f25518l;
            if (jiVar != null) {
                jiVar.mo64360a((WebView) this);
            }
        }
        this.f25514h.mo64822a(str, this, this.f25507a);
    }

    /* renamed from: b */
    public final void mo64969b(String str) {
        C10263mq.m29882b(str, "url");
        getMraidCommandExecutor().mo64817c(str);
    }

    /* renamed from: f */
    public final void mo64974f() {
        getMraidCommandExecutor().mo64814c();
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        C10263mq.m29882b(view, "changedView");
        C10162jl jlVar = this.f25510d;
        if (jlVar != null) {
            jlVar.mo64356a();
        }
        super.onVisibilityChanged(view, i);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        if (webViewClient != null && !C10263mq.m29881a((Object) this.f25515i, (Object) webViewClient)) {
            new IllegalAccessError("Cannot change the webview client for MraidWebView");
        }
        super.setWebViewClient(webViewClient);
    }

    /* renamed from: g */
    public final void mo64975g() {
        C10116id.m29476a(this.f25507a.mo64503b());
        C10159ji jiVar = this.f25518l;
        if (jiVar != null) {
            jiVar.mo64912a();
        }
    }

    /* renamed from: h */
    public final boolean mo64984h() {
        return this.f25516j && !this.f25517k;
    }

    public final String toString() {
        return C10263mq.m29874a("MraidWebView>> ", (Object) Integer.toHexString(System.identityHashCode(this)));
    }

    /* renamed from: i */
    public final void mo64985i() {
        this.f25510d = null;
        setClientAdapter((C10159ji) null);
        C10139iu.C10140a aVar = C10139iu.f25459a;
        this.f25514h = C10139iu.C10140a.m29609a();
        this.f25512f = null;
        setWebViewClient((WebViewClient) null);
        this.f25515i = null;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Activity a = C10058gm.m29204a();
        if (a != null) {
            this.f25508b.setBaseContext(a);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MutableContextWrapper mutableContextWrapper = this.f25508b;
        mutableContextWrapper.setBaseContext(mutableContextWrapper.getBaseContext().getApplicationContext());
    }
}
