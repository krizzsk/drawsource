package com.ogury.p377ed.internal;

import android.content.Context;
import android.util.Log;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p377ed.internal.C10015fc;
import com.ogury.p377ed.internal.C10025fk;
import com.ogury.p377ed.internal.C9908cp;
import com.ogury.p377ed.internal.C9918cw;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import p401io.presage.common.PresageSdkInitCallback;

/* renamed from: com.ogury.ed.internal.de */
public final class C9930de {

    /* renamed from: a */
    public static final C9931a f24981a = new C9931a((byte) 0);

    /* renamed from: b */
    private final C9908cp.C9909a f24982b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C10025fk.C10026a f24983c;

    /* renamed from: d */
    private final C10015fc.C10016a f24984d;

    /* renamed from: e */
    private final C9943di f24985e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C10029fn f24986f;

    /* renamed from: g */
    private final C10166jp f24987g;

    /* renamed from: h */
    private final C9940df f24988h;

    /* renamed from: i */
    private final C10058gm f24989i;

    /* renamed from: j */
    private final C9926db f24990j;

    /* renamed from: k */
    private final C9922cz f24991k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f24992l;

    /* renamed from: m */
    private List<PresageSdkInitCallback> f24993m;

    /* renamed from: d */
    public static String m28680d() {
        return "4.2.0";
    }

    private C9930de(C9908cp.C9909a aVar, C10025fk.C10026a aVar2, C10015fc.C10016a aVar3, C9943di diVar, C10029fn fnVar, C10166jp jpVar, C9940df dfVar, C10058gm gmVar, C9926db dbVar, C9922cz czVar) {
        C10263mq.m29882b(aVar, "completableFactory");
        C10263mq.m29882b(aVar2, "profigDaoFactory");
        C10263mq.m29882b(aVar3, "profigFactory");
        C10263mq.m29882b(diVar, "measurementsEventsLogger");
        C10263mq.m29882b(fnVar, "profigGateway");
        C10263mq.m29882b(jpVar, "omidSdk");
        C10263mq.m29882b(dfVar, "sdkIntegrationChecker");
        C10263mq.m29882b(gmVar, "topActivityMonitor");
        C10263mq.m29882b(dbVar, "crashReportWrapper");
        C10263mq.m29882b(czVar, "consentEventBus");
        this.f24982b = aVar;
        this.f24983c = aVar2;
        this.f24984d = aVar3;
        this.f24985e = diVar;
        this.f24986f = fnVar;
        this.f24987g = jpVar;
        this.f24988h = dfVar;
        this.f24989i = gmVar;
        this.f24990j = dbVar;
        this.f24991k = czVar;
        List<PresageSdkInitCallback> synchronizedList = Collections.synchronizedList(new LinkedList());
        C10263mq.m29879a((Object) synchronizedList, "synchronizedList(LinkedList())");
        this.f24993m = synchronizedList;
    }

    public /* synthetic */ C9930de() {
        this(C9908cp.f24951a, C10025fk.f25214a, C10015fc.f25180a, C9943di.f25015a, C10029fn.f25239a, C10166jp.f25530a, C9940df.f25008a, C10058gm.f25283a, new C9926db(), C9922cz.f24969a);
    }

    /* renamed from: com.ogury.ed.internal.de$a */
    public static final class C9931a {
        public /* synthetic */ C9931a(byte b) {
            this();
        }

        private C9931a() {
        }
    }

    /* renamed from: a */
    public final void mo64459a(C9921cy cyVar) {
        C10263mq.m29882b(cyVar, "adsConfig");
        OguryIntegrationLogger.m28105d("[Ads][setup] Starting...");
        Context a = cyVar.mo64457a();
        m28664a(a);
        C9940df.m28705a(a);
        int i = this.f24992l;
        if (i == 0 || i == 3) {
            this.f24992l = 2;
            CharSequence b = cyVar.mo64458b();
            if (!(b == null || b.length() == 0)) {
                C9908cp.C9909a.m28615a(new C9934d(this, a, cyVar)).mo64444a((C10228lk<? super Throwable, C10182ke>) new C9935e(this)).mo64445a((C10227lj<C10182ke>) new C9936f(this, a));
                return;
            }
            OguryIntegrationLogger.m28106e("[Ads][setup] Failed to set up (invalid asset key: \"" + cyVar.mo64458b() + "\")");
            Log.e("Presage", "PresageSdk.init() error", new IllegalArgumentException("The api key is null empty. Please provide a valid api key"));
            this.f24992l = 0;
            return;
        }
        OguryIntegrationLogger.m28105d("[Ads][setup] Already setting up or set up");
    }

    /* renamed from: com.ogury.ed.internal.de$d */
    static final class C9934d extends C10264mr implements C10227lj<C10182ke> {

        /* renamed from: a */
        final /* synthetic */ C9930de f24996a;

        /* renamed from: b */
        final /* synthetic */ Context f24997b;

        /* renamed from: c */
        final /* synthetic */ C9921cy f24998c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9934d(C9930de deVar, Context context, C9921cy cyVar) {
            super(0);
            this.f24996a = deVar;
            this.f24997b = context;
            this.f24998c = cyVar;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo64355a() {
            m28693b();
            return C10182ke.f25542a;
        }

        /* renamed from: b */
        private void m28693b() {
            C10025fk.C10026a unused = this.f24996a.f24983c;
            C10025fk a = C10025fk.C10026a.m29075a(this.f24997b);
            C9930de.m28675b(a, this.f24998c);
            this.f24996a.m28665a(this.f24997b, a);
        }
    }

    /* renamed from: com.ogury.ed.internal.de$e */
    static final class C9935e extends C10264mr implements C10228lk<Throwable, C10182ke> {

        /* renamed from: a */
        final /* synthetic */ C9930de f24999a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9935e(C9930de deVar) {
            super(1);
            this.f24999a = deVar;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo64242a(Object obj) {
            m28695a((Throwable) obj);
            return C10182ke.f25542a;
        }

        /* renamed from: a */
        private void m28695a(Throwable th) {
            C10263mq.m29882b(th, "it");
            this.f24999a.f24992l = 3;
            OguryIntegrationLogger.m28106e(C10263mq.m29874a("[Ads][setup] Failed to set up ", (Object) th.getMessage()));
            this.f24999a.m28683g();
        }
    }

    /* renamed from: com.ogury.ed.internal.de$f */
    static final class C9936f extends C10264mr implements C10227lj<C10182ke> {

        /* renamed from: a */
        final /* synthetic */ C9930de f25000a;

        /* renamed from: b */
        final /* synthetic */ Context f25001b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9936f(C9930de deVar, Context context) {
            super(0);
            this.f25000a = deVar;
            this.f25001b = context;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo64355a() {
            m28697b();
            return C10182ke.f25542a;
        }

        /* renamed from: b */
        private void m28697b() {
            OguryIntegrationLogger.m28105d("[Ads][setup] Completed!");
            this.f25000a.f24992l = 1;
            this.f25000a.m28682f();
            this.f25000a.m28672b(this.f25001b);
        }
    }

    /* renamed from: a */
    private final void m28664a(Context context) {
        try {
            this.f24989i.mo64777a(context);
        } catch (Throwable th) {
            C10057gl.m29202a(th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m28675b(C10025fk fkVar, C9921cy cyVar) {
        String b = cyVar.mo64458b();
        C10263mq.m29878a((Object) b);
        fkVar.mo64682e(b);
    }

    /* renamed from: a */
    public final boolean mo64461a() {
        return this.f24992l == 2;
    }

    /* renamed from: b */
    public final boolean mo64462b() {
        return this.f24992l == 1;
    }

    /* renamed from: e */
    private boolean m28681e() {
        return this.f24992l == 0;
    }

    /* renamed from: c */
    public final boolean mo64463c() {
        return this.f24992l == 3;
    }

    /* renamed from: a */
    public final void mo64460a(PresageSdkInitCallback presageSdkInitCallback) {
        C10263mq.m29882b(presageSdkInitCallback, "presageSdkInitCallback");
        if (mo64462b()) {
            presageSdkInitCallback.onSdkInitialized();
        } else if (mo64461a()) {
            this.f24993m.add(presageSdkInitCallback);
        } else if (m28681e()) {
            presageSdkInitCallback.onSdkNotInitialized();
        } else if (mo64463c()) {
            presageSdkInitCallback.onSdkInitFailed();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m28665a(Context context, C10025fk fkVar) {
        if (!m28678c(context)) {
            Context applicationContext = context.getApplicationContext();
            String i = fkVar.mo64686i();
            if (!C10263mq.m29881a((Object) i, (Object) "")) {
                C10015fc.C10016a aVar = this.f24984d;
                C10263mq.m29879a((Object) applicationContext, "appContext");
                C10015fc a = aVar.mo64648a(applicationContext);
                a.mo64647b();
                C9922cz.m28649b((C10227lj<C10182ke>) new C9937g(this, a));
                C9943di.m28716a(applicationContext);
                C9926db.m28654a(applicationContext, i);
                return;
            }
            OguryIntegrationLogger.m28106e("[Ads][setup] Failed to set up (invalid asset key: \"" + i + "\")");
            IllegalStateException illegalStateException = new IllegalStateException("There is no api key. Please call PresageSdk.init(context, apiKey) before trying to load or display an ad");
            Log.e("Presage", "Init Error", illegalStateException);
            throw illegalStateException;
        }
        OguryIntegrationLogger.m28106e("[Ads][setup] The app is not in main application process");
        throw new IllegalStateException("The app is not in main application process");
    }

    /* renamed from: com.ogury.ed.internal.de$g */
    static final class C9937g extends C10264mr implements C10227lj<C10182ke> {

        /* renamed from: a */
        final /* synthetic */ C9930de f25002a;

        /* renamed from: b */
        final /* synthetic */ C10015fc f25003b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9937g(C9930de deVar, C10015fc fcVar) {
            super(0);
            this.f25002a = deVar;
            this.f25003b = fcVar;
        }

        /* renamed from: b */
        private void m28699b() {
            C9930de.m28674b(this.f25003b);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo64355a() {
            m28699b();
            return C10182ke.f25542a;
        }
    }

    /* renamed from: com.ogury.ed.internal.de$b */
    static final class C9932b extends C10264mr implements C10227lj<C10182ke> {

        /* renamed from: a */
        final /* synthetic */ C10015fc f24994a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9932b(C10015fc fcVar) {
            super(0);
            this.f24994a = fcVar;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo64355a() {
            m28689b();
            return C10182ke.f25542a;
        }

        /* renamed from: b */
        private void m28689b() {
            this.f24994a.mo64646a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m28674b(C10015fc fcVar) {
        C9918cw.C9919a aVar = C9918cw.f24963a;
        C9918cw.C9919a.m28640a(new C9932b(fcVar)).mo64451b(C9933c.f24995a);
    }

    /* renamed from: com.ogury.ed.internal.de$c */
    static final class C9933c extends C10264mr implements C10228lk<C10182ke, C10182ke> {

        /* renamed from: a */
        public static final C9933c f24995a = new C9933c();

        C9933c() {
            super(1);
        }

        /* renamed from: a */
        private static void m28691a(C10182ke keVar) {
            C10263mq.m29882b(keVar, "it");
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo64242a(Object obj) {
            m28691a((C10182ke) obj);
            return C10182ke.f25542a;
        }
    }

    /* renamed from: com.ogury.ed.internal.de$h */
    static final class C9938h extends C10264mr implements C10227lj<C10028fm> {

        /* renamed from: a */
        final /* synthetic */ C9930de f25004a;

        /* renamed from: b */
        final /* synthetic */ Context f25005b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9938h(C9930de deVar, Context context) {
            super(0);
            this.f25004a = deVar;
            this.f25005b = context;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C10028fm mo64355a() {
            C10029fn unused = this.f25004a.f24986f;
            return C10029fn.m29114a(this.f25005b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m28672b(Context context) {
        C9918cw.C9919a aVar = C9918cw.f24963a;
        C9918cw.C9919a.m28640a(new C9938h(this, context)).mo64451b(new C9939i(this, context));
    }

    /* renamed from: com.ogury.ed.internal.de$i */
    static final class C9939i extends C10264mr implements C10228lk<C10028fm, C10182ke> {

        /* renamed from: a */
        final /* synthetic */ C9930de f25006a;

        /* renamed from: b */
        final /* synthetic */ Context f25007b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9939i(C9930de deVar, Context context) {
            super(1);
            this.f25006a = deVar;
            this.f25007b = context;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo64242a(Object obj) {
            m28703a((C10028fm) obj);
            return C10182ke.f25542a;
        }

        /* renamed from: a */
        private void m28703a(C10028fm fmVar) {
            C9930de.m28676b(fmVar, this.f25007b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m28676b(C10028fm fmVar, Context context) {
        if (fmVar != null && fmVar.mo64701c()) {
            C10166jp.m29726a(context);
        }
    }

    /* renamed from: c */
    private final boolean m28678c(Context context) {
        return !mo64462b() && !C10055gj.m29198a(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m28682f() {
        for (PresageSdkInitCallback onSdkInitialized : this.f24993m) {
            onSdkInitialized.onSdkInitialized();
        }
        this.f24993m.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m28683g() {
        for (PresageSdkInitCallback onSdkInitFailed : this.f24993m) {
            onSdkInitFailed.onSdkInitFailed();
        }
        this.f24993m.clear();
    }
}
