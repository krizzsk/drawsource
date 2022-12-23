package com.ogury.p377ed.internal;

import android.content.Context;
import com.ogury.core.internal.OguryEventCallback;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p377ed.internal.C9918cw;
import java.util.ArrayList;
import java.util.List;
import p401io.presage.common.AdConfig;
import p401io.presage.common.PresageSdk;
import p401io.presage.common.PresageSdkInitCallback;
import p401io.presage.common.network.models.RewardItem;

/* renamed from: com.ogury.ed.internal.l */
public final class C10204l implements C10120ig {

    /* renamed from: a */
    public static final C10205a f25548a = new C10205a((byte) 0);

    /* renamed from: b */
    private final Context f25549b;

    /* renamed from: c */
    private final AdConfig f25550c;

    /* renamed from: d */
    private final C10116id f25551d;

    /* renamed from: e */
    private final C10029fn f25552e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C9943di f25553f;

    /* renamed from: g */
    private final C10084hg f25554g;

    /* renamed from: h */
    private final C10117ie f25555h;

    /* renamed from: i */
    private final C9954dm f25556i;

    /* renamed from: j */
    private final C10148j f25557j;

    /* renamed from: k */
    private final C10025fk f25558k;

    /* renamed from: l */
    private final C9989ej f25559l;

    /* renamed from: m */
    private final C9922cz f25560m;

    /* renamed from: n */
    private final C10112i f25561n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f25562o;

    /* renamed from: p */
    private String f25563p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public List<C9981eb> f25564q;

    /* renamed from: r */
    private C10076h f25565r;

    /* renamed from: s */
    private C10177k f25566s;

    /* renamed from: t */
    private PresageSdk f25567t;

    /* renamed from: u */
    private C10228lk<? super RewardItem, C10182ke> f25568u;

    /* renamed from: v */
    private C9999es f25569v;

    /* renamed from: w */
    private boolean f25570w;

    /* renamed from: x */
    private boolean f25571x;

    /* renamed from: y */
    private OguryEventCallback f25572y;

    private C10204l(Context context, AdConfig adConfig, C10116id idVar, C10029fn fnVar, C9943di diVar, C10084hg hgVar, C10117ie ieVar, C9954dm dmVar, C10148j jVar, C10025fk fkVar, C9989ej ejVar, C9922cz czVar, C10112i iVar) {
        this.f25549b = context;
        this.f25550c = adConfig;
        this.f25551d = idVar;
        this.f25552e = fnVar;
        this.f25553f = diVar;
        this.f25554g = hgVar;
        this.f25555h = ieVar;
        this.f25556i = dmVar;
        this.f25557j = jVar;
        this.f25558k = fkVar;
        this.f25559l = ejVar;
        this.f25560m = czVar;
        this.f25561n = iVar;
        this.f25563p = "";
        this.f25564q = new ArrayList();
        this.f25567t = PresageSdk.f29803a;
        this.f25571x = true;
    }

    /* renamed from: a */
    public final boolean mo65096a() {
        return this.f25562o;
    }

    /* renamed from: a */
    public final void mo65095a(String str) {
        C10263mq.m29882b(str, "<set-?>");
        this.f25563p = str;
    }

    /* renamed from: a */
    public final void mo65091a(C10076h hVar) {
        this.f25565r = hVar;
    }

    /* renamed from: b */
    public final C10076h mo65097b() {
        return this.f25565r;
    }

    /* renamed from: a */
    public final void mo65092a(C10177k kVar) {
        this.f25566s = kVar;
    }

    /* renamed from: a */
    public final void mo65093a(C10228lk<? super RewardItem, C10182ke> lkVar) {
        this.f25568u = lkVar;
    }

    /* renamed from: a */
    public final void mo65090a(C9999es esVar) {
        this.f25569v = esVar;
    }

    /* renamed from: c */
    public final boolean mo65099c() {
        return this.f25571x;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C10204l(android.content.Context r5, p401io.presage.common.AdConfig r6, com.ogury.p377ed.internal.C9989ej r7) {
        /*
            r4 = this;
            com.ogury.ed.internal.j r0 = new com.ogury.ed.internal.j
            android.content.Context r1 = r5.getApplicationContext()
            java.lang.String r2 = "constructor(\n        con…AdsCallbackFilter()\n    )"
            com.ogury.p377ed.internal.C10263mq.m29879a((java.lang.Object) r1, (java.lang.String) r2)
            com.ogury.ed.internal.fu r2 = new com.ogury.ed.internal.fu
            r2.<init>()
            com.ogury.ed.internal.gc r3 = new com.ogury.ed.internal.gc
            r3.<init>()
            com.ogury.ed.internal.gb r3 = (com.ogury.p377ed.internal.C10047gb) r3
            r0.<init>(r1, r2, r3, r7)
            r4.<init>(r5, r6, r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p377ed.internal.C10204l.<init>(android.content.Context, io.presage.common.AdConfig, com.ogury.ed.internal.ej):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C10204l(android.content.Context r17, p401io.presage.common.AdConfig r18, com.ogury.p377ed.internal.C9989ej r19, com.ogury.p377ed.internal.C10148j r20) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = "context"
            com.ogury.p377ed.internal.C10263mq.m29882b(r0, r1)
            java.lang.String r1 = "adType"
            r13 = r19
            com.ogury.p377ed.internal.C10263mq.m29882b(r13, r1)
            java.lang.String r1 = "adsConditionsChecker"
            r11 = r20
            com.ogury.p377ed.internal.C10263mq.m29882b(r11, r1)
            android.content.Context r3 = r17.getApplicationContext()
            java.lang.String r1 = "context.applicationContext"
            com.ogury.p377ed.internal.C10263mq.m29879a((java.lang.Object) r3, (java.lang.String) r1)
            com.ogury.ed.internal.id r5 = com.ogury.p377ed.internal.C10116id.f25410a
            com.ogury.ed.internal.fn r6 = com.ogury.p377ed.internal.C10029fn.f25239a
            com.ogury.ed.internal.di r7 = com.ogury.p377ed.internal.C9943di.f25015a
            com.ogury.ed.internal.hg r8 = com.ogury.p377ed.internal.C10084hg.f25316a
            com.ogury.ed.internal.ie$a r1 = com.ogury.p377ed.internal.C10117ie.f25416a
            com.ogury.ed.internal.ie r9 = com.ogury.p377ed.internal.C10117ie.C10118a.m29489a(r17)
            com.ogury.ed.internal.dm r10 = new com.ogury.ed.internal.dm
            r10.<init>(r0)
            com.ogury.ed.internal.fk$a r1 = com.ogury.p377ed.internal.C10025fk.f25214a
            com.ogury.ed.internal.fk r12 = com.ogury.p377ed.internal.C10025fk.C10026a.m29075a(r17)
            com.ogury.ed.internal.cz r14 = com.ogury.p377ed.internal.C9922cz.f24969a
            com.ogury.ed.internal.i r15 = new com.ogury.ed.internal.i
            r15.<init>()
            r2 = r16
            r4 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p377ed.internal.C10204l.<init>(android.content.Context, io.presage.common.AdConfig, com.ogury.ed.internal.ej, com.ogury.ed.internal.j):void");
    }

    /* renamed from: com.ogury.ed.internal.l$a */
    public static final class C10205a {
        public /* synthetic */ C10205a(byte b) {
            this();
        }

        private C10205a() {
        }
    }

    /* renamed from: a */
    public final void mo64902a(C9981eb ebVar) {
        C10263mq.m29882b(ebVar, "ad");
        m29791c("Ad " + ebVar.mo64515f() + " expired");
        m29779a(4);
        this.f25564q.remove(ebVar);
    }

    /* renamed from: d */
    public final void mo65100d() {
        StringBuilder sb = new StringBuilder("Loading ad unit [");
        AdConfig adConfig = this.f25550c;
        sb.append(adConfig == null ? null : adConfig.getAdUnitId());
        sb.append("]...");
        m29791c(sb.toString());
        if (this.f25557j.mo64961b()) {
            m29791c("Impossible to join Ogury servers. No Internet connection");
            m29779a(1);
        } else if (PresageSdk.m33347c()) {
            m29791c("Module setup issue");
            m29779a(6);
        } else if (PresageSdk.m33345a()) {
            m29791c("Module setup is still in progress");
            m29797g();
        } else if (C10148j.m29659a()) {
            m29791c("Module not set up");
            m29794f();
        } else {
            m29798h();
        }
    }

    /* renamed from: b */
    public final void mo65098b(String str) {
        C10263mq.m29882b(str, "adMarkup");
        StringBuilder sb = new StringBuilder("Loading ad unit [");
        AdConfig adConfig = this.f25550c;
        sb.append(adConfig == null ? null : adConfig.getAdUnitId());
        sb.append("]...");
        m29791c(sb.toString());
        this.f25556i.mo64474a(str, this.f25559l).mo64450a(new C10212h(this)).mo64451b(new C10213i(this));
    }

    /* renamed from: com.ogury.ed.internal.l$h */
    static final class C10212h extends C10264mr implements C10228lk<Throwable, C10182ke> {

        /* renamed from: a */
        final /* synthetic */ C10204l f25578a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10212h(C10204l lVar) {
            super(1);
            this.f25578a = lVar;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo64242a(Object obj) {
            m29829a((Throwable) obj);
            return C10182ke.f25542a;
        }

        /* renamed from: a */
        private void m29829a(Throwable th) {
            C10263mq.m29882b(th, "errorThrowable");
            this.f25578a.m29791c(C10263mq.m29874a("Failed to load (", (Object) th.getMessage()));
            this.f25578a.m29779a(0);
        }
    }

    /* renamed from: com.ogury.ed.internal.l$i */
    static final class C10213i extends C10264mr implements C10228lk<C9988ei, C10182ke> {

        /* renamed from: a */
        final /* synthetic */ C10204l f25579a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10213i(C10204l lVar) {
            super(1);
            this.f25579a = lVar;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo64242a(Object obj) {
            m29831a((C9988ei) obj);
            return C10182ke.f25542a;
        }

        /* renamed from: a */
        private void m29831a(C9988ei eiVar) {
            C10263mq.m29882b(eiVar, "adResponse");
            C9943di unused = this.f25579a.f25553f;
            C9981eb ebVar = (C9981eb) C10190km.m29765b(eiVar.mo64567a());
            C9943di.m28717a((C9942dh) new C9952dk("LOAD", ebVar == null ? null : ebVar.mo64493A()));
            this.f25579a.m29791c("LOAD event");
            this.f25579a.m29780a(eiVar);
        }
    }

    /* renamed from: f */
    private final void m29794f() {
        m29791c("Trying to set up module...");
        String i = this.f25558k.mo64686i();
        if (i.length() == 0) {
            m29791c("Impossible to set up module (no asset key found)");
            m29779a(5);
            return;
        }
        PresageSdk.init(this.f25549b, i);
        m29797g();
    }

    /* renamed from: com.ogury.ed.internal.l$b */
    public static final class C10206b implements PresageSdkInitCallback {

        /* renamed from: a */
        final /* synthetic */ C10204l f25573a;

        C10206b(C10204l lVar) {
            this.f25573a = lVar;
        }

        public final void onSdkNotInitialized() {
            this.f25573a.m29791c("Failed to set up module");
            this.f25573a.m29779a(5);
        }

        public final void onSdkInitialized() {
            this.f25573a.m29798h();
        }

        public final void onSdkInitFailed() {
            this.f25573a.m29779a(6);
        }
    }

    /* renamed from: g */
    private final void m29797g() {
        m29791c("Waiting for module setup...");
        this.f25567t.addSdkInitCallback(new C10206b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m29798h() {
        m29791c("Syncing with consent...");
        C9922cz.m28646a(this.f25572y);
        this.f25572y = C9922cz.m28643a((C10227lj<C10182ke>) new C10217m(this));
    }

    /* renamed from: com.ogury.ed.internal.l$m */
    /* synthetic */ class C10217m extends C10262mp implements C10227lj<C10182ke> {
        C10217m(Object obj) {
            super(0, obj, C10204l.class, "checkProfig", "checkProfig()V");
        }

        /* renamed from: h */
        private void m29840h() {
            ((C10204l) this.f25588a).m29800i();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo64355a() {
            m29840h();
            return C10182ke.f25542a;
        }
    }

    /* renamed from: com.ogury.ed.internal.l$c */
    /* synthetic */ class C10207c extends C10262mp implements C10227lj<C10028fm> {
        C10207c(Object obj) {
            super(0, obj, C10204l.class, "getProfigAndSyncIfNeeded", "getProfigAndSyncIfNeeded()Lio/presage/common/profig/data/ProfigFullResponse;");
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public C10028fm mo64355a() {
            return ((C10204l) this.f25588a).m29801j();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final void m29800i() {
        m29791c("Retrieving configuration...");
        C9918cw.C9919a aVar = C9918cw.f24963a;
        C9918cw.C9919a.m28640a(new C10207c(this)).mo64450a(new C10208d(this)).mo64451b(new C10209e(this));
    }

    /* renamed from: com.ogury.ed.internal.l$d */
    static final class C10208d extends C10264mr implements C10228lk<Throwable, C10182ke> {

        /* renamed from: a */
        final /* synthetic */ C10204l f25574a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10208d(C10204l lVar) {
            super(1);
            this.f25574a = lVar;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo64242a(Object obj) {
            m29821a((Throwable) obj);
            return C10182ke.f25542a;
        }

        /* renamed from: a */
        private void m29821a(Throwable th) {
            C10263mq.m29882b(th, "it");
            this.f25574a.m29791c("Failed. Configuration not synced");
            this.f25574a.m29779a(3);
        }
    }

    /* renamed from: com.ogury.ed.internal.l$e */
    static final class C10209e extends C10264mr implements C10228lk<C10028fm, C10182ke> {

        /* renamed from: a */
        final /* synthetic */ C10204l f25575a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10209e(C10204l lVar) {
            super(1);
            this.f25575a = lVar;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo64242a(Object obj) {
            m29823a((C10028fm) obj);
            return C10182ke.f25542a;
        }

        /* renamed from: a */
        private void m29823a(C10028fm fmVar) {
            this.f25575a.m29781a(fmVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final C10028fm m29801j() {
        C10028fm a = C10029fn.m29114a(this.f25549b);
        if (!this.f25558k.mo64688k() && a != null) {
            return a;
        }
        m29791c("Configuration need to be synced");
        C10029fn.m29116b(this.f25549b);
        return C10029fn.m29114a(this.f25549b);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m29781a(C10028fm fmVar) {
        if (fmVar == null) {
            m29791c("Failed. Configuration not synced");
            m29779a(3);
        } else if (!fmVar.mo64697b()) {
            m29791c("Failed. Ad serving has been disabled");
            m29779a(2);
        } else {
            m29791c("Configuration successfully retrieved");
            C9943di.m28717a((C9942dh) new C9952dk("LOAD"));
            m29791c("LOAD event");
            m29791c("Loading ads from servers...");
            this.f25556i.mo64473a(this.f25559l, this.f25550c, this.f25563p, this.f25569v).mo64450a(new C10210f(this)).mo64451b(new C10211g(this));
        }
    }

    /* renamed from: com.ogury.ed.internal.l$f */
    static final class C10210f extends C10264mr implements C10228lk<Throwable, C10182ke> {

        /* renamed from: a */
        final /* synthetic */ C10204l f25576a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10210f(C10204l lVar) {
            super(1);
            this.f25576a = lVar;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo64242a(Object obj) {
            m29825a((Throwable) obj);
            return C10182ke.f25542a;
        }

        /* renamed from: a */
        private void m29825a(Throwable th) {
            C10263mq.m29882b(th, "errorThrowable");
            C10204l lVar = this.f25576a;
            lVar.m29791c("Failed to load (" + th.getMessage() + ')');
            this.f25576a.m29779a(0);
        }
    }

    /* renamed from: com.ogury.ed.internal.l$g */
    static final class C10211g extends C10264mr implements C10228lk<C9988ei, C10182ke> {

        /* renamed from: a */
        final /* synthetic */ C10204l f25577a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10211g(C10204l lVar) {
            super(1);
            this.f25577a = lVar;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo64242a(Object obj) {
            m29827a((C9988ei) obj);
            return C10182ke.f25542a;
        }

        /* renamed from: a */
        private void m29827a(C9988ei eiVar) {
            C10263mq.m29882b(eiVar, "adResponse");
            this.f25577a.m29780a(eiVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m29780a(C9988ei eiVar) {
        if (!this.f25570w) {
            if (!eiVar.mo64567a().isEmpty()) {
                m29791c("Ads available");
                C10076h hVar = this.f25565r;
                if (hVar != null) {
                    hVar.mo64630b();
                }
                m29788a((List<C9981eb>) C10190km.m29764a(eiVar.mo64567a()));
                return;
            }
            m29791c("Failed to load (no ad available)");
            m29791c("Triggering onAdError() callback");
            m29804m();
            C10076h hVar2 = this.f25565r;
            if (hVar2 != null) {
                hVar2.mo64631c();
            }
        }
    }

    /* renamed from: a */
    private final void m29788a(List<C9981eb> list) {
        boolean z;
        m29791c("Precaching available ads...");
        for (C9981eb c : list) {
            if (c.mo64506c().length() == 0) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                m29791c("Failed to load (invalid ad)");
                m29791c("Triggering onAdError() callback");
                m29804m();
                C10076h b = mo65097b();
                if (b != null) {
                    b.mo64633e();
                    return;
                }
                return;
            }
        }
        this.f25564q = C10190km.m29764a(list);
        this.f25555h.mo64898a(this, list, new C10214j(this));
    }

    /* renamed from: com.ogury.ed.internal.l$j */
    public static final class C10214j implements C10119if {

        /* renamed from: a */
        final /* synthetic */ C10204l f25580a;

        C10214j(C10204l lVar) {
            this.f25580a = lVar;
        }

        /* renamed from: a */
        public final void mo64899a() {
            this.f25580a.f25562o = true;
            this.f25580a.m29791c("Ads successfully loaded!");
            this.f25580a.m29791c("Triggering onAdLoaded() callback");
            this.f25580a.m29804m();
            C10076h b = this.f25580a.mo65097b();
            if (b != null) {
                b.mo64632d();
            }
        }

        /* renamed from: b */
        public final void mo64901b() {
            this.f25580a.m29791c("Failed to load (precaching failed)");
            this.f25580a.m29779a(0);
        }

        /* renamed from: a */
        public final void mo64900a(C9981eb ebVar) {
            C10263mq.m29882b(ebVar, "ad");
            this.f25580a.m29791c(C10263mq.m29874a("Do not precache ad ", (Object) ebVar.mo64515f()));
            this.f25580a.f25564q.remove(ebVar);
        }
    }

    /* renamed from: b */
    public final void mo64903b(C9981eb ebVar) {
        C10263mq.m29882b(ebVar, "ad");
        m29791c(C10263mq.m29874a("Unload ad ", (Object) ebVar.mo64515f()));
        this.f25562o = false;
        this.f25564q.remove(ebVar);
    }

    /* renamed from: a */
    public final void mo65094a(C10330t tVar) {
        C10263mq.m29882b(tVar, "showAction");
        StringBuilder sb = new StringBuilder("[Ads][");
        sb.append(this.f25559l.mo64569b());
        sb.append("][show] Showing ad unit [");
        AdConfig adConfig = this.f25550c;
        String str = null;
        sb.append(adConfig == null ? null : adConfig.getAdUnitId());
        sb.append("]...");
        OguryIntegrationLogger.m28105d(sb.toString());
        C10116id.m29473a();
        if (this.f25557j.mo64960a(this.f25565r, this.f25562o, this.f25564q)) {
            this.f25571x = false;
            StringBuilder sb2 = new StringBuilder("[Ads][");
            sb2.append(this.f25559l.mo64569b());
            sb2.append("][show][");
            AdConfig adConfig2 = this.f25550c;
            sb2.append(adConfig2 == null ? null : adConfig2.getAdUnitId());
            sb2.append("] SHOW event");
            OguryIntegrationLogger.m28105d(sb2.toString());
            C9981eb ebVar = (C9981eb) C10190km.m29765b(this.f25564q);
            if (ebVar != null) {
                str = ebVar.mo64493A();
            }
            C9943di.m28717a((C9942dh) new C9952dk("SHOW", str));
            this.f25562o = false;
            List<C9981eb> list = this.f25564q;
            this.f25561n.mo64889a(list.size());
            this.f25561n.mo64891a((C10227lj<C10182ke>) new C10215k(this));
            for (C9981eb b : list) {
                C10084hg.m29314a(b.mo64503b(), new C10216l(this));
            }
            tVar.mo64416a(this.f25549b, C10190km.m29764a(list));
        }
    }

    /* renamed from: com.ogury.ed.internal.l$k */
    /* synthetic */ class C10215k extends C10262mp implements C10227lj<C10182ke> {
        C10215k(Object obj) {
            super(0, obj, C10204l.class, "onAdClosed", "onAdClosed()V");
        }

        /* renamed from: h */
        private void m29836h() {
            ((C10204l) this.f25588a).m29802k();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo64355a() {
            m29836h();
            return C10182ke.f25542a;
        }
    }

    /* renamed from: com.ogury.ed.internal.l$l */
    /* synthetic */ class C10216l extends C10262mp implements C10228lk<C10083hf, C10182ke> {
        C10216l(Object obj) {
            super(1, obj, C10204l.class, "sendShowEvent", "sendShowEvent(Lio/presage/mraid/MraidEvent;)V");
        }

        /* renamed from: a */
        private void m29838a(C10083hf hfVar) {
            C10263mq.m29882b(hfVar, "p0");
            ((C10204l) this.f25588a).m29782a(hfVar);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo64242a(Object obj) {
            m29838a((C10083hf) obj);
            return C10182ke.f25542a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m29782a(C10083hf hfVar) {
        this.f25561n.mo64890a(hfVar, this.f25559l, this.f25550c, this.f25565r, this.f25568u, this.f25566s);
    }

    /* renamed from: e */
    public final void mo65101e() {
        m29791c("Reset existing cache");
        this.f25570w = true;
        m29803l();
        this.f25555h.mo64897a((C10120ig) this);
        C9922cz.m28646a(this.f25572y);
        this.f25565r = null;
        this.f25568u = null;
        this.f25572y = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final void m29802k() {
        m29803l();
        this.f25565r = null;
        this.f25568u = null;
    }

    /* renamed from: l */
    private final void m29803l() {
        for (C9981eb b : this.f25564q) {
            C10084hg.m29313a(b.mo64503b());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m29779a(int i) {
        m29791c("Triggering onAdError() callback");
        m29804m();
        C10076h hVar = this.f25565r;
        if (hVar != null) {
            hVar.mo64629a(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final void m29804m() {
        if (this.f25565r == null) {
            m29791c("No ad listener registered");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m29791c(String str) {
        StringBuilder sb = new StringBuilder("[Ads][");
        sb.append(this.f25559l.mo64569b());
        sb.append("][load][");
        AdConfig adConfig = this.f25550c;
        sb.append(adConfig == null ? null : adConfig.getAdUnitId());
        sb.append("] ");
        sb.append(str);
        OguryIntegrationLogger.m28105d(sb.toString());
    }
}
