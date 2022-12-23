package com.ogury.p377ed.internal;

import android.app.Application;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ogury.p377ed.internal.C10093ho;
import com.ogury.p377ed.internal.C9827ak;
import com.ogury.p377ed.internal.C9829al;
import com.smaato.sdk.core.injections.CoreLightModuleInterface;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ogury.ed.internal.aj */
public final class C9816aj implements C10145iy {

    /* renamed from: a */
    public static final C9818b f24745a = new C9818b((byte) 0);

    /* renamed from: A */
    private View.OnLayoutChangeListener f24746A;

    /* renamed from: B */
    private int f24747B;

    /* renamed from: C */
    private C9832am f24748C;

    /* renamed from: D */
    private C9840au f24749D;

    /* renamed from: E */
    private C9832am f24750E;

    /* renamed from: F */
    private C9832am f24751F;

    /* renamed from: G */
    private boolean f24752G;

    /* renamed from: b */
    private final Application f24753b;

    /* renamed from: c */
    private final C10093ho.C10094a f24754c;

    /* renamed from: d */
    private final C9829al.C9830a f24755d;

    /* renamed from: e */
    private final C10029fn f24756e;

    /* renamed from: f */
    private final C9827ak f24757f;

    /* renamed from: g */
    private final C9968dw f24758g;

    /* renamed from: h */
    private final C9813ah f24759h;

    /* renamed from: i */
    private final C10084hg f24760i;

    /* renamed from: j */
    private final C10044g f24761j;

    /* renamed from: k */
    private final C9832am f24762k;

    /* renamed from: l */
    private final C9856bf f24763l;

    /* renamed from: m */
    private boolean f24764m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C10327q f24765n;

    /* renamed from: o */
    private final C10008ez f24766o;

    /* renamed from: p */
    private final C9810af f24767p;

    /* renamed from: q */
    private C10158jh f24768q;

    /* renamed from: r */
    private C9829al f24769r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C10078hb f24770s;

    /* renamed from: t */
    private boolean f24771t;

    /* renamed from: u */
    private boolean f24772u;

    /* renamed from: v */
    private C10093ho f24773v;

    /* renamed from: w */
    private C9981eb f24774w;

    /* renamed from: x */
    private List<C9981eb> f24775x;

    /* renamed from: y */
    private C9812ag f24776y;

    /* renamed from: z */
    private C10146iz f24777z;

    public /* synthetic */ C9816aj(C9817a aVar, byte b) {
        this(aVar);
    }

    private C9816aj(C9817a aVar) {
        this.f24753b = aVar.mo64338a();
        this.f24754c = aVar.mo64343e();
        this.f24755d = aVar.mo64344f();
        this.f24756e = aVar.mo64345g();
        this.f24757f = aVar.mo64346h();
        this.f24758g = aVar.mo64347i();
        this.f24759h = aVar.mo64348j();
        this.f24760i = aVar.mo64349k();
        this.f24761j = aVar.mo64340b();
        this.f24762k = aVar.mo64341c();
        this.f24763l = aVar.mo64350l();
        this.f24764m = aVar.mo64342d();
        this.f24765n = aVar.mo64351m();
        this.f24766o = aVar.mo64352n();
        this.f24767p = aVar.mo64353o();
        this.f24772u = true;
        this.f24775x = new ArrayList();
        this.f24777z = new C10146iz();
        this.f24746A = m28293E();
        this.f24747B = 1;
        this.f24748C = C9838as.f24816a;
        this.f24750E = C9838as.f24816a;
        this.f24751F = C9838as.f24816a;
    }

    /* renamed from: a */
    public final Application mo64302a() {
        return this.f24753b;
    }

    /* renamed from: a */
    private final void m28302a(int i) {
        if (this.f24747B != 4) {
            this.f24747B = i;
        }
    }

    /* renamed from: a */
    public final void mo64304a(C9832am amVar) {
        C10263mq.m29882b(amVar, "<set-?>");
        this.f24748C = amVar;
    }

    /* renamed from: a */
    public final void mo64305a(C9840au auVar) {
        this.f24749D = auVar;
    }

    /* renamed from: b */
    public final C9832am mo64310b() {
        return this.f24750E;
    }

    /* renamed from: b */
    public final void mo64311b(C9832am amVar) {
        C10263mq.m29882b(amVar, "<set-?>");
        this.f24750E = amVar;
    }

    /* renamed from: c */
    public final void mo64313c(C9832am amVar) {
        C10263mq.m29882b(amVar, "<set-?>");
        this.f24751F = amVar;
    }

    /* renamed from: c */
    public final boolean mo64315c() {
        return this.f24752G;
    }

    /* renamed from: d */
    public final void mo64316d() {
        this.f24752G = true;
    }

    /* renamed from: com.ogury.ed.internal.aj$b */
    public static final class C9818b {
        public /* synthetic */ C9818b(byte b) {
            this();
        }

        private C9818b() {
        }
    }

    /* renamed from: com.ogury.ed.internal.aj$a */
    public static final class C9817a {

        /* renamed from: a */
        private final Application f24778a;

        /* renamed from: b */
        private final C10044g f24779b;

        /* renamed from: c */
        private final C9832am f24780c;

        /* renamed from: d */
        private final boolean f24781d;

        /* renamed from: e */
        private C10093ho.C10094a f24782e = C10093ho.f25329a;

        /* renamed from: f */
        private C9829al.C9830a f24783f = C9829al.f24798a;

        /* renamed from: g */
        private C10029fn f24784g = C10029fn.f25239a;

        /* renamed from: h */
        private C9827ak f24785h;

        /* renamed from: i */
        private C9968dw f24786i;

        /* renamed from: j */
        private C9813ah f24787j;

        /* renamed from: k */
        private C10084hg f24788k;

        /* renamed from: l */
        private C9814ai f24789l;

        /* renamed from: m */
        private C9856bf f24790m;

        /* renamed from: n */
        private C10327q f24791n;

        /* renamed from: o */
        private C10008ez f24792o;

        /* renamed from: p */
        private C9810af f24793p;

        public C9817a(Application application, C10044g gVar, C9832am amVar, boolean z) {
            C10263mq.m29882b(application, "application");
            C10263mq.m29882b(gVar, "adLayout");
            C10263mq.m29882b(amVar, "expandCommand");
            this.f24778a = application;
            this.f24779b = gVar;
            this.f24780c = amVar;
            this.f24781d = z;
            C9827ak.C9828a aVar = C9827ak.f24796a;
            this.f24785h = C9827ak.C9828a.m28386a();
            this.f24786i = C9968dw.f25057a;
            this.f24787j = C9813ah.f24740a;
            this.f24788k = C10084hg.f25316a;
            this.f24789l = new C9814ai(this.f24778a);
            this.f24790m = new C9856bf();
            this.f24791n = new C9843ax(this.f24779b);
            this.f24792o = new C10008ez(this.f24778a);
            this.f24793p = new C9810af(this.f24778a);
        }

        /* renamed from: a */
        public final Application mo64338a() {
            return this.f24778a;
        }

        /* renamed from: b */
        public final C10044g mo64340b() {
            return this.f24779b;
        }

        /* renamed from: c */
        public final C9832am mo64341c() {
            return this.f24780c;
        }

        /* renamed from: d */
        public final boolean mo64342d() {
            return this.f24781d;
        }

        /* renamed from: e */
        public final C10093ho.C10094a mo64343e() {
            return this.f24782e;
        }

        /* renamed from: f */
        public final C9829al.C9830a mo64344f() {
            return this.f24783f;
        }

        /* renamed from: g */
        public final C10029fn mo64345g() {
            return this.f24784g;
        }

        /* renamed from: h */
        public final C9827ak mo64346h() {
            return this.f24785h;
        }

        /* renamed from: i */
        public final C9968dw mo64347i() {
            return this.f24786i;
        }

        /* renamed from: j */
        public final C9813ah mo64348j() {
            return this.f24787j;
        }

        /* renamed from: k */
        public final C10084hg mo64349k() {
            return this.f24788k;
        }

        /* renamed from: l */
        public final C9856bf mo64350l() {
            return this.f24790m;
        }

        /* renamed from: a */
        public final void mo64339a(C10327q qVar) {
            C10263mq.m29882b(qVar, "<set-?>");
            this.f24791n = qVar;
        }

        /* renamed from: m */
        public final C10327q mo64351m() {
            return this.f24791n;
        }

        /* renamed from: n */
        public final C10008ez mo64352n() {
            return this.f24792o;
        }

        /* renamed from: o */
        public final C9810af mo64353o() {
            return this.f24793p;
        }

        /* renamed from: p */
        public final C9816aj mo64354p() {
            return new C9816aj(this, (byte) 0);
        }
    }

    /* renamed from: e */
    public final List<C9981eb> mo64317e() {
        return this.f24775x;
    }

    /* renamed from: f */
    public final C9981eb mo64318f() {
        return this.f24774w;
    }

    /* renamed from: g */
    public final void mo64319g() {
        m28302a(2);
    }

    /* renamed from: h */
    public final void mo64320h() {
        m28302a(3);
    }

    /* renamed from: i */
    public final boolean mo64321i() {
        if (this.f24747B == 3) {
            return false;
        }
        C10158jh jhVar = this.f24768q;
        if (jhVar == null) {
            C10263mq.m29880a("webView");
            jhVar = null;
        }
        return !C10263mq.m29881a((Object) jhVar.getAdState(), (Object) "expanded");
    }

    /* renamed from: z */
    private final boolean m28315z() {
        C10158jh jhVar = this.f24768q;
        if (jhVar == null) {
            C10263mq.m29880a("webView");
            jhVar = null;
        }
        return !C10263mq.m29881a((Object) jhVar.getAdState(), (Object) "resized");
    }

    /* renamed from: j */
    public final boolean mo64322j() {
        if (this.f24768q != null) {
            return m28315z() && (this.f24761j.getParent() instanceof C9805ac);
        }
        return true;
    }

    /* renamed from: a */
    public final void mo64306a(C9981eb ebVar, List<C9981eb> list) {
        C10263mq.m29882b(ebVar, "ad");
        C10263mq.m29882b(list, "notDisplayedAds");
        this.f24775x = list;
        this.f24774w = ebVar;
        m28305a(ebVar);
        m28300L();
        m28306a(ebVar, this.f24761j);
        C9829al alVar = null;
        C10141iv ivVar = new C10141iv(this.f24753b, this, (C10227lj<C10182ke>) null);
        C10093ho a = C10093ho.C10094a.m29363a(this.f24753b, ebVar, this.f24761j, ivVar);
        this.f24773v = a;
        a.mo64830a((C10227lj<C10182ke>) new C9819c(this));
        a.mo64834b((C10227lj<C10182ke>) new C9820d(this));
        C9829al a2 = C9829al.C9830a.m28393a(a, ivVar);
        this.f24769r = a2;
        if (a2 == null) {
            C10263mq.m29880a("webViewGateway");
        } else {
            alVar = a2;
        }
        C10158jh a3 = alVar.mo64359a(ebVar);
        if (a3 != null) {
            this.f24768q = a3;
            this.f24770s = a3.getMraidCommandExecutor();
            a.mo64832a(ebVar.mo64524j().length() > 0 ? ebVar.mo64524j() : "controller", a3, ebVar.mo64544v());
            C10028fm a4 = C10029fn.m29114a((Context) this.f24753b);
            if (a4 != null) {
                m28307a(a4);
                m28308a(a3);
                this.f24761j.addView(a3, new FrameLayout.LayoutParams(-1, -1));
                if (ebVar.mo64545w().mo64571d() && !this.f24764m) {
                    m28310b(ebVar);
                }
                this.f24757f.mo64358a(a4, ebVar, a3);
                m28290B();
                m28291C();
                this.f24761j.setOnWindowGainFocusListener(new C9821e(this));
                this.f24761j.setOnWindowLoseFocusListener(new C9822f(this));
                this.f24761j.setOnAttachToWindowListener(new C9823g(this));
                this.f24761j.setOnDetachFromWindowListener(new C9824h(this));
                return;
            }
            throw new IllegalStateException("Profig must not be null");
        }
        throw new IllegalStateException("WebView must not be null");
    }

    /* renamed from: com.ogury.ed.internal.aj$c */
    /* synthetic */ class C9819c extends C10262mp implements C10227lj<C10182ke> {
        C9819c(Object obj) {
            super(0, obj, C9816aj.class, "handleNewOguryBrowserWebViewCreated", "handleNewOguryBrowserWebViewCreated()V");
        }

        /* renamed from: h */
        private void m28369h() {
            ((C9816aj) this.f25588a).m28296H();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo64355a() {
            m28369h();
            return C10182ke.f25542a;
        }
    }

    /* renamed from: com.ogury.ed.internal.aj$d */
    /* synthetic */ class C9820d extends C10262mp implements C10227lj<C10182ke> {
        C9820d(Object obj) {
            super(0, obj, C9816aj.class, "closeAd", "closeAd()V");
        }

        /* renamed from: h */
        private void m28371h() {
            ((C9816aj) this.f25588a).mo64335w();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo64355a() {
            m28371h();
            return C10182ke.f25542a;
        }
    }

    /* renamed from: com.ogury.ed.internal.aj$e */
    /* synthetic */ class C9821e extends C10262mp implements C10227lj<C10182ke> {
        C9821e(Object obj) {
            super(0, obj, C9816aj.class, "resumeAd", "resumeAd()V");
        }

        /* renamed from: h */
        private void m28373h() {
            ((C9816aj) this.f25588a).mo64328p();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo64355a() {
            m28373h();
            return C10182ke.f25542a;
        }
    }

    /* renamed from: com.ogury.ed.internal.aj$f */
    /* synthetic */ class C9822f extends C10262mp implements C10227lj<C10182ke> {
        C9822f(Object obj) {
            super(0, obj, C9816aj.class, "pauseAd", "pauseAd()V");
        }

        /* renamed from: h */
        private void m28375h() {
            ((C9816aj) this.f25588a).mo64327o();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo64355a() {
            m28375h();
            return C10182ke.f25542a;
        }
    }

    /* renamed from: com.ogury.ed.internal.aj$g */
    /* synthetic */ class C9823g extends C10262mp implements C10227lj<C10182ke> {
        C9823g(Object obj) {
            super(0, obj, C9816aj.class, "onAttachToWindow", "onAttachToWindow()V");
        }

        /* renamed from: h */
        private void m28377h() {
            ((C9816aj) this.f25588a).m28289A();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo64355a() {
            m28377h();
            return C10182ke.f25542a;
        }
    }

    /* renamed from: com.ogury.ed.internal.aj$h */
    /* synthetic */ class C9824h extends C10262mp implements C10227lj<C10182ke> {
        C9824h(Object obj) {
            super(0, obj, C9816aj.class, "pauseAd", "pauseAd()V");
        }

        /* renamed from: h */
        private void m28379h() {
            ((C9816aj) this.f25588a).mo64327o();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo64355a() {
            m28379h();
            return C10182ke.f25542a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public final void m28289A() {
        if (this.f24761j.mo64744g()) {
            mo64328p();
        }
    }

    /* renamed from: a */
    private final void m28305a(C9981eb ebVar) {
        this.f24767p.mo64292a(ebVar);
        this.f24767p.mo64293a(this.f24765n);
    }

    /* renamed from: com.ogury.ed.internal.aj$i */
    static final class C9825i extends C10264mr implements C10228lk<C10044g, C10182ke> {

        /* renamed from: a */
        final /* synthetic */ C9816aj f24794a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9825i(C9816aj ajVar) {
            super(1);
            this.f24794a = ajVar;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo64242a(Object obj) {
            m28381a((C10044g) obj);
            return C10182ke.f25542a;
        }

        /* renamed from: a */
        private void m28381a(C10044g gVar) {
            C10263mq.m29882b(gVar, "adLayout");
            C10078hb c = this.f24794a.f24770s;
            if (c == null) {
                C10263mq.m29880a("mraidCommandExecutor");
                c = null;
            }
            c.mo64811b(C10054gi.m29195a(gVar.getWidth()), C10054gi.m29195a(gVar.getHeight()), C10054gi.m29194a(gVar.getX()), C10054gi.m29194a(gVar.getY()));
            this.f24794a.f24765n.mo64286a();
            this.f24794a.m28292D();
        }
    }

    /* renamed from: B */
    private final void m28290B() {
        this.f24761j.setAdLayoutChangeListener(new C9825i(this));
    }

    /* renamed from: com.ogury.ed.internal.aj$j */
    public static final class C9826j implements C10162jl {

        /* renamed from: a */
        final /* synthetic */ C9816aj f24795a;

        C9826j(C9816aj ajVar) {
            this.f24795a = ajVar;
        }

        /* renamed from: a */
        public final void mo64356a() {
            this.f24795a.f24765n.mo64286a();
        }
    }

    /* renamed from: C */
    private final void m28291C() {
        C10158jh jhVar = this.f24768q;
        if (jhVar == null) {
            C10263mq.m29880a("webView");
            jhVar = null;
        }
        jhVar.setVisibilityChangedListener(new C9826j(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public final void m28292D() {
        C10008ez ezVar = this.f24766o;
        C10158jh jhVar = this.f24768q;
        C10078hb hbVar = null;
        if (jhVar == null) {
            C10263mq.m29880a("webView");
            jhVar = null;
        }
        Rect a = ezVar.mo64618a((View) jhVar);
        C10078hb hbVar2 = this.f24770s;
        if (hbVar2 == null) {
            C10263mq.m29880a("mraidCommandExecutor");
        } else {
            hbVar = hbVar2;
        }
        hbVar.mo64810b(C10054gi.m29195a(a.width()), C10054gi.m29195a(a.height()));
    }

    /* renamed from: E */
    private final View.OnLayoutChangeListener m28293E() {
        return new View.OnLayoutChangeListener() {
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C9816aj.m28304a(C9816aj.this, view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        };
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m28304a(C9816aj ajVar, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C10263mq.m29882b(ajVar, "this$0");
        C10158jh jhVar = ajVar.f24768q;
        if (jhVar != null) {
            C10158jh jhVar2 = null;
            if (jhVar == null) {
                C10263mq.m29880a("webView");
                jhVar = null;
            }
            if (!C10263mq.m29881a((Object) jhVar.getAdState(), (Object) "hidden")) {
                C10158jh jhVar3 = ajVar.f24768q;
                if (jhVar3 == null) {
                    C10263mq.m29880a("webView");
                } else {
                    jhVar2 = jhVar3;
                }
                if (C10064gr.m29220e(jhVar2)) {
                    ajVar.f24765n.mo64286a();
                }
            }
        }
    }

    /* renamed from: F */
    private final void m28294F() {
        ViewGroup parentAsViewGroup = this.f24761j.getParentAsViewGroup();
        if (parentAsViewGroup != null) {
            parentAsViewGroup.addOnLayoutChangeListener(this.f24746A);
        }
    }

    /* renamed from: G */
    private final void m28295G() {
        ViewGroup parentAsViewGroup = this.f24761j.getParentAsViewGroup();
        if (parentAsViewGroup != null) {
            parentAsViewGroup.removeOnLayoutChangeListener(this.f24746A);
        }
    }

    /* renamed from: b */
    private final void m28310b(C9981eb ebVar) {
        this.f24777z.mo64944a(ebVar.mo64528l().mo64600b());
        this.f24777z.mo64948b(ebVar.mo64528l().mo64602c());
        this.f24761j.setInitialSize(this.f24777z);
        this.f24761j.setupDrag(ebVar.mo64528l().mo64599a());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m28296H() {
        /*
            r6 = this;
            boolean r0 = r6.f24764m
            r1 = 0
            r2 = 0
            java.lang.String r3 = "webView"
            r4 = 1
            if (r0 == 0) goto L_0x001f
            com.ogury.ed.internal.jh r0 = r6.f24768q
            if (r0 != 0) goto L_0x0011
            com.ogury.p377ed.internal.C10263mq.m29880a((java.lang.String) r3)
            r0 = r2
        L_0x0011:
            java.lang.String r0 = r0.getAdState()
            java.lang.String r5 = "default"
            boolean r0 = com.ogury.p377ed.internal.C10263mq.m29881a((java.lang.Object) r0, (java.lang.Object) r5)
            if (r0 != 0) goto L_0x001f
            r0 = r4
            goto L_0x0020
        L_0x001f:
            r0 = r1
        L_0x0020:
            if (r0 != 0) goto L_0x0026
            boolean r0 = r6.f24764m
            if (r0 != 0) goto L_0x0044
        L_0x0026:
            com.ogury.ed.internal.jh r0 = r6.f24768q
            if (r0 != 0) goto L_0x002e
            com.ogury.p377ed.internal.C10263mq.m29880a((java.lang.String) r3)
            r0 = r2
        L_0x002e:
            r0.setMultiBrowserOpened(r4)
            com.ogury.ed.internal.jh r0 = r6.f24768q
            if (r0 != 0) goto L_0x0039
            com.ogury.p377ed.internal.C10263mq.m29880a((java.lang.String) r3)
            goto L_0x003a
        L_0x0039:
            r2 = r0
        L_0x003a:
            r0 = 4
            r2.setVisibility(r0)
            r6.mo64327o()
            r6.m28297I()
        L_0x0044:
            com.ogury.ed.internal.eb r0 = r6.f24774w
            if (r0 == 0) goto L_0x004f
            boolean r0 = com.ogury.p377ed.internal.C9992el.m28925b(r0)
            if (r0 != r4) goto L_0x004f
            r1 = r4
        L_0x004f:
            if (r1 == 0) goto L_0x0053
            r6.f24764m = r4
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p377ed.internal.C9816aj.m28296H():void");
    }

    /* renamed from: I */
    private final void m28297I() {
        mo64332t();
    }

    /* renamed from: a */
    private final void m28307a(C10028fm fmVar) {
        this.f24771t = fmVar.mo64713g();
        this.f24772u = fmVar.mo64714h();
        C9812ag agVar = this.f24776y;
        if (agVar != null) {
            agVar.mo64295a(fmVar.mo64717k());
        }
    }

    /* renamed from: a */
    private final void m28308a(C10158jh jhVar) {
        C9812ag agVar;
        if (!jhVar.getShowSdkCloseButton() && (agVar = this.f24776y) != null) {
            agVar.mo64296b();
        }
    }

    /* renamed from: a */
    private final void m28306a(C9981eb ebVar, C10044g gVar) {
        if (C9992el.m28925b(ebVar)) {
            this.f24776y = C9813ah.m28286a(this, gVar, C9968dw.m28771a(this.f24753b), ebVar.mo64538q());
        }
    }

    /* renamed from: J */
    private final boolean m28298J() {
        C10093ho hoVar = this.f24773v;
        if (hoVar == null) {
            return true;
        }
        return hoVar.mo64836b();
    }

    /* renamed from: k */
    public final void mo64323k() {
        String b;
        if (this.f24747B != 4) {
            C10051gf.m29191a("destroying ad");
            m28302a(4);
            this.f24765n.mo64288b();
            C10093ho hoVar = this.f24773v;
            if (hoVar != null) {
                hoVar.mo64839d();
            }
            C9812ag agVar = this.f24776y;
            if (agVar != null) {
                agVar.mo64297c();
            }
            C9981eb ebVar = this.f24774w;
            String str = "";
            if (!(ebVar == null || (b = ebVar.mo64503b()) == null)) {
                str = b;
            }
            C10084hg.m29312a(new C10083hf(str, "adClosed"));
            this.f24757f.mo64357a();
            this.f24761j.mo64743f();
            this.f24748C = C9838as.f24816a;
            C10158jh jhVar = this.f24768q;
            if (jhVar != null) {
                if (jhVar == null) {
                    C10263mq.m29880a("webView");
                    jhVar = null;
                }
                jhVar.mo64985i();
            }
        }
    }

    /* renamed from: a */
    public final void mo64309a(boolean z) {
        if (m28299K() && m28298J() && this.f24772u) {
            mo64323k();
            this.f24750E.mo64282a(this.f24761j, this);
            if (!z) {
                mo64324l();
            }
        }
    }

    /* renamed from: l */
    public final void mo64324l() {
        String b;
        C9981eb ebVar = this.f24774w;
        String str = "";
        if (!(ebVar == null || (b = ebVar.mo64503b()) == null)) {
            str = b;
        }
        C10084hg.m29312a(new C10083hf(str, "closeWhithoutShowNextAd"));
    }

    /* renamed from: m */
    public final void mo64325m() {
        if (this.f24752G || m28299K()) {
            mo64323k();
        }
    }

    /* renamed from: K */
    private final boolean m28299K() {
        return this.f24764m && this.f24747B != 2;
    }

    /* renamed from: n */
    public final boolean mo64326n() {
        C10093ho hoVar = this.f24773v;
        if (hoVar != null) {
            hoVar.mo64837c();
        }
        return this.f24771t;
    }

    /* renamed from: o */
    public final void mo64327o() {
        C10158jh jhVar = this.f24768q;
        C10078hb hbVar = null;
        if (jhVar == null) {
            C10263mq.m29880a("webView");
            jhVar = null;
        }
        if (!jhVar.mo64968a()) {
            C10051gf.m29191a("ad already paused");
            return;
        }
        C10051gf.m29191a("pauseAd");
        C10158jh jhVar2 = this.f24768q;
        if (jhVar2 == null) {
            C10263mq.m29880a("webView");
            jhVar2 = null;
        }
        jhVar2.setResumed(false);
        m28295G();
        C10074gy gyVar = new C10074gy();
        gyVar.mo64794a(0.0f);
        C10078hb hbVar2 = this.f24770s;
        if (hbVar2 == null) {
            C10263mq.m29880a("mraidCommandExecutor");
        } else {
            hbVar = hbVar2;
        }
        hbVar.mo64803a(gyVar);
    }

    /* renamed from: p */
    public final void mo64328p() {
        C10158jh jhVar = this.f24768q;
        C10158jh jhVar2 = null;
        if (jhVar == null) {
            C10263mq.m29880a("webView");
            jhVar = null;
        }
        if (jhVar.mo64968a()) {
            C10051gf.m29191a("ad already resumed");
            return;
        }
        C10051gf.m29191a("resumeAd");
        C10158jh jhVar3 = this.f24768q;
        if (jhVar3 == null) {
            C10263mq.m29880a("webView");
        } else {
            jhVar2 = jhVar3;
        }
        jhVar2.setResumed(true);
        if (this.f24764m) {
            m28294F();
        }
        if (this.f24747B != 2) {
            m28302a(1);
        }
        this.f24765n.mo64286a();
    }

    /* renamed from: a */
    public final void mo64303a(int i, int i2) {
        this.f24777z.mo64950c(i);
        this.f24777z.mo64952d(i2);
    }

    /* renamed from: L */
    private final void m28300L() {
        this.f24751F.mo64282a(this.f24761j, this);
    }

    /* renamed from: q */
    public final void mo64329q() {
        C9812ag agVar = this.f24776y;
        if (agVar != null) {
            agVar.mo64294a();
        }
    }

    /* renamed from: r */
    public final void mo64330r() {
        C9812ag agVar = this.f24776y;
        if (agVar != null) {
            agVar.mo64296b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64308a(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = "adId"
            com.ogury.p377ed.internal.C10263mq.m29882b(r4, r0)
            boolean r0 = r3.f24764m
            r1 = 0
            if (r0 != 0) goto L_0x0023
            com.ogury.ed.internal.jh r0 = r3.f24768q
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = "webView"
            com.ogury.p377ed.internal.C10263mq.m29880a((java.lang.String) r0)
            r0 = 0
        L_0x0014:
            java.lang.String r0 = r0.getAdState()
            java.lang.String r2 = "hidden"
            boolean r0 = com.ogury.p377ed.internal.C10263mq.m29881a((java.lang.Object) r0, (java.lang.Object) r2)
            if (r0 == 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r0 = r1
            goto L_0x0024
        L_0x0023:
            r0 = 1
        L_0x0024:
            if (r0 == 0) goto L_0x0038
            com.ogury.ed.internal.au r0 = r3.f24749D
            if (r0 != 0) goto L_0x002b
            goto L_0x0033
        L_0x002b:
            android.app.Application r1 = r3.f24753b
            java.util.List<com.ogury.ed.internal.eb> r2 = r3.f24775x
            boolean r1 = r0.mo64285a(r1, r2, r4)
        L_0x0033:
            if (r1 != 0) goto L_0x0038
            r3.mo64324l()
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p377ed.internal.C9816aj.mo64308a(java.lang.String):void");
    }

    /* renamed from: s */
    public final void mo64331s() {
        mo64312b(false);
    }

    /* renamed from: a */
    public final void mo64307a(C10146iz izVar) {
        this.f24761j.setResizeProps(izVar);
    }

    /* renamed from: t */
    public final void mo64332t() {
        if (!mo64333u()) {
            this.f24762k.mo64282a(this.f24761j, this);
            m28311b(this.f24764m ? CoreLightModuleInterface.NAME_DEFAULT_HTTP_HANDLER : "expanded");
        }
    }

    /* renamed from: u */
    public final boolean mo64333u() {
        C10158jh jhVar = this.f24768q;
        C10158jh jhVar2 = null;
        if (jhVar == null) {
            C10263mq.m29880a("webView");
            jhVar = null;
        }
        if (C10263mq.m29881a((Object) jhVar.getAdState(), (Object) "expanded")) {
            return true;
        }
        if (!this.f24764m) {
            return false;
        }
        C10158jh jhVar3 = this.f24768q;
        if (jhVar3 == null) {
            C10263mq.m29880a("webView");
        } else {
            jhVar2 = jhVar3;
        }
        return C10263mq.m29881a((Object) jhVar2.getAdState(), (Object) CoreLightModuleInterface.NAME_DEFAULT_HTTP_HANDLER);
    }

    /* renamed from: v */
    public final void mo64334v() {
        C10146iz resizeProps = this.f24761j.getResizeProps();
        if (resizeProps == null) {
            throw new IllegalStateException("setResizeProperties must be called first");
        } else if (this.f24763l.mo64372a((ViewGroup) this.f24761j, resizeProps)) {
            m28311b("resized");
            this.f24748C.mo64282a(this.f24761j, this);
        } else {
            throw new IllegalArgumentException("Invalid resize command".toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if ((r0 == null ? true : com.ogury.p377ed.internal.C9992el.m28925b(r0)) != false) goto L_0x0021;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64312b(boolean r6) {
        /*
            r5 = this;
            com.ogury.ed.internal.jh r0 = r5.f24768q
            r1 = 0
            java.lang.String r2 = "webView"
            if (r0 != 0) goto L_0x000b
            com.ogury.p377ed.internal.C10263mq.m29880a((java.lang.String) r2)
            r0 = r1
        L_0x000b:
            boolean r0 = r0.mo64970b()
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0020
            com.ogury.ed.internal.eb r0 = r5.f24774w
            if (r0 != 0) goto L_0x0019
            r0 = r3
            goto L_0x001d
        L_0x0019:
            boolean r0 = com.ogury.p377ed.internal.C9992el.m28925b(r0)
        L_0x001d:
            if (r0 == 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r3 = r4
        L_0x0021:
            if (r3 != 0) goto L_0x005a
            com.ogury.ed.internal.jh r0 = r5.f24768q
            if (r0 != 0) goto L_0x002b
            com.ogury.p377ed.internal.C10263mq.m29880a((java.lang.String) r2)
            r0 = r1
        L_0x002b:
            java.lang.String r0 = r0.getAdState()
            java.lang.String r3 = "default"
            boolean r0 = com.ogury.p377ed.internal.C10263mq.m29881a((java.lang.Object) r0, (java.lang.Object) r3)
            if (r0 != 0) goto L_0x005a
            boolean r0 = r5.f24764m
            if (r0 == 0) goto L_0x003c
            goto L_0x005a
        L_0x003c:
            com.ogury.ed.internal.jh r6 = r5.f24768q
            if (r6 != 0) goto L_0x0044
            com.ogury.p377ed.internal.C10263mq.m29880a((java.lang.String) r2)
            r6 = r1
        L_0x0044:
            r6.setMultiBrowserOpened(r4)
            com.ogury.ed.internal.jh r6 = r5.f24768q
            if (r6 != 0) goto L_0x004f
            com.ogury.p377ed.internal.C10263mq.m29880a((java.lang.String) r2)
            goto L_0x0050
        L_0x004f:
            r1 = r6
        L_0x0050:
            r1.setVisibility(r4)
            r5.m28301M()
            r5.m28311b((java.lang.String) r3)
            return
        L_0x005a:
            r5.mo64314c((boolean) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p377ed.internal.C9816aj.mo64312b(boolean):void");
    }

    /* renamed from: c */
    public final void mo64314c(boolean z) {
        mo64335w();
        if (!z) {
            mo64324l();
        }
    }

    /* renamed from: w */
    public final void mo64335w() {
        this.f24750E.mo64282a(this.f24761j, this);
    }

    /* renamed from: b */
    private final void m28311b(String str) {
        C10078hb hbVar = this.f24770s;
        if (hbVar == null) {
            C10263mq.m29880a("mraidCommandExecutor");
            hbVar = null;
        }
        hbVar.mo64812b(str);
    }

    /* renamed from: M */
    private final void m28301M() {
        this.f24761j.mo64742e();
        this.f24748C.mo64282a(this.f24761j, this);
    }

    /* renamed from: x */
    public final boolean mo64336x() {
        C10158jh jhVar = this.f24768q;
        if (jhVar == null) {
            return false;
        }
        if (jhVar == null) {
            C10263mq.m29880a("webView");
            jhVar = null;
        }
        return jhVar.mo64970b();
    }

    /* renamed from: y */
    public final void mo64337y() {
        C9981eb ebVar = this.f24774w;
        String b = ebVar == null ? null : ebVar.mo64503b();
        if (b != null) {
            C10084hg.m29312a(new C10083hf(b, "adClosed"));
        }
    }
}
