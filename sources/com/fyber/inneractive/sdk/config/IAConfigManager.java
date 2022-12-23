package com.fyber.inneractive.sdk.config;

import android.content.Context;
import com.fyber.inneractive.sdk.cache.C4183g;
import com.fyber.inneractive.sdk.config.enums.Vendor;
import com.fyber.inneractive.sdk.config.global.C4219a;
import com.fyber.inneractive.sdk.config.global.C4244l;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.measurement.C4401a;
import com.fyber.inneractive.sdk.network.C4474b0;
import com.fyber.inneractive.sdk.network.C4476c;
import com.fyber.inneractive.sdk.network.C4501m0;
import com.fyber.inneractive.sdk.network.C4523w;
import com.fyber.inneractive.sdk.p188dv.handler.C4307a;
import com.fyber.inneractive.sdk.p188dv.handler.C4310c;
import com.fyber.inneractive.sdk.p188dv.handler.C4312d;
import com.fyber.inneractive.sdk.util.C5289j0;
import com.fyber.inneractive.sdk.util.C5292l;
import com.fyber.inneractive.sdk.util.C5315t;
import com.fyber.inneractive.sdk.util.C5317u;
import com.fyber.inneractive.sdk.util.C5318u0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class IAConfigManager {

    /* renamed from: J */
    public static final IAConfigManager f10324J = new IAConfigManager();

    /* renamed from: K */
    public static long f10325K;

    /* renamed from: A */
    public final C5289j0 f10326A;

    /* renamed from: B */
    public C4474b0<C4200a> f10327B;

    /* renamed from: C */
    public C4474b0<C4244l> f10328C;

    /* renamed from: D */
    public C4212d f10329D;

    /* renamed from: E */
    public final C4307a f10330E;

    /* renamed from: F */
    public final C4183g f10331F;

    /* renamed from: G */
    public final C4476c f10332G;

    /* renamed from: H */
    public final Map<C5317u, C5315t> f10333H;

    /* renamed from: I */
    public C4401a f10334I;

    /* renamed from: a */
    public Map<String, C4286x> f10335a = new HashMap();

    /* renamed from: b */
    public Map<String, C4287y> f10336b = new HashMap();

    /* renamed from: c */
    public String f10337c;

    /* renamed from: d */
    public String f10338d;

    /* renamed from: e */
    public String f10339e;

    /* renamed from: f */
    public Context f10340f;

    /* renamed from: g */
    public List<OnConfigurationReadyAndValidListener> f10341g;

    /* renamed from: h */
    public boolean f10342h;

    /* renamed from: i */
    public final C4268q f10343i;

    /* renamed from: j */
    public InneractiveUserConfig f10344j;

    /* renamed from: k */
    public String f10345k;

    /* renamed from: l */
    public boolean f10346l;

    /* renamed from: m */
    public String f10347m;

    /* renamed from: n */
    public InneractiveMediationName f10348n;

    /* renamed from: o */
    public String f10349o;

    /* renamed from: p */
    public String f10350p;

    /* renamed from: q */
    public List<String> f10351q;

    /* renamed from: r */
    public boolean f10352r;

    /* renamed from: s */
    public boolean f10353s;

    /* renamed from: t */
    public final C4523w f10354t;

    /* renamed from: u */
    public String f10355u;

    /* renamed from: v */
    public C4253i f10356v;

    /* renamed from: w */
    public C4256j f10357w;

    /* renamed from: x */
    public final C4213d0 f10358x;

    /* renamed from: y */
    public C5318u0 f10359y;

    /* renamed from: z */
    public C4219a f10360z;

    public interface OnConfigurationReadyAndValidListener {
        void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z, Exception exc);
    }

    /* renamed from: com.fyber.inneractive.sdk.config.IAConfigManager$a */
    public static class C4200a {

        /* renamed from: a */
        public String f10361a;

        /* renamed from: b */
        public String f10362b;

        /* renamed from: c */
        public String f10363c;

        /* renamed from: d */
        public String f10364d;

        /* renamed from: e */
        public Map<String, C4286x> f10365e = new HashMap();

        /* renamed from: f */
        public Map<String, C4287y> f10366f = new HashMap();

        /* renamed from: g */
        public C4202c f10367g = new C4202c();
    }

    /* renamed from: com.fyber.inneractive.sdk.config.IAConfigManager$b */
    public static class C4201b extends Exception {
    }

    /* renamed from: com.fyber.inneractive.sdk.config.IAConfigManager$c */
    public static class C4202c {

        /* renamed from: a */
        public Set<Vendor> f10368a = new HashSet();
    }

    public IAConfigManager() {
        C4307a aVar;
        new HashSet();
        this.f10342h = false;
        this.f10343i = new C4268q();
        this.f10346l = false;
        this.f10352r = false;
        this.f10353s = true;
        this.f10354t = new C4523w();
        this.f10355u = "";
        this.f10358x = new C4213d0();
        this.f10326A = new C5289j0();
        if (C5292l.m16506a("com.google.android.gms.ads.MobileAds", "com.google.android.gms.ads.query.QueryInfoGenerationCallback")) {
            aVar = new C4310c();
        } else {
            aVar = new C4312d();
        }
        this.f10330E = aVar;
        this.f10331F = new C4183g();
        this.f10332G = new C4476c();
        this.f10333H = new HashMap();
        this.f10341g = new CopyOnWriteArrayList();
    }

    public static void addListener(OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener) {
        f10324J.f10341g.add(onConfigurationReadyAndValidListener);
    }

    /* renamed from: b */
    public static C4253i m13176b() {
        return f10324J.f10356v;
    }

    /* renamed from: c */
    public static C4213d0 m13177c() {
        return f10324J.f10358x;
    }

    /* renamed from: d */
    public static C5318u0 m13178d() {
        return f10324J.f10359y;
    }

    /* renamed from: e */
    public static String m13179e() {
        return f10324J.f10329D.f10396d;
    }

    /* renamed from: f */
    public static boolean m13180f() {
        return f10324J.f10339e != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
        m13175a();
        f10324J.f10331F.mo24172a();
        r1 = com.fyber.inneractive.sdk.web.C5375r.f14185c;
        r1.getClass();
        com.fyber.inneractive.sdk.util.C5299n.m16520a(new com.fyber.inneractive.sdk.web.C5374q(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0059, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002c, code lost:
        if ((java.lang.System.currentTimeMillis() - f10325K <= 3600000) != false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
        if (r2 != false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        if (r2 == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        r2 = f10324J.f10356v;
        r2.f10461d = false;
        com.fyber.inneractive.sdk.util.C5299n.m16520a(new com.fyber.inneractive.sdk.util.C5296m(r2.f10462e));
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m13181g() {
        /*
            boolean r0 = m13180f()
            int r1 = com.fyber.inneractive.sdk.config.C4215e.f10405a
            r1 = 0
            java.lang.String r2 = java.lang.Boolean.toString(r1)
            java.lang.String r3 = "ia.testEnvironmentConfiguration.forceConfigRefresh"
            java.lang.String r2 = java.lang.System.getProperty(r3, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r2.booleanValue()
            if (r0 == 0) goto L_0x002e
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = f10325K
            long r3 = r3 - r5
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x002b
            r3 = 1
            goto L_0x002c
        L_0x002b:
            r3 = r1
        L_0x002c:
            if (r3 == 0) goto L_0x0030
        L_0x002e:
            if (r2 == 0) goto L_0x0059
        L_0x0030:
            if (r2 == 0) goto L_0x0042
            com.fyber.inneractive.sdk.config.IAConfigManager r2 = f10324J
            com.fyber.inneractive.sdk.config.i r2 = r2.f10356v
            r2.f10461d = r1
            com.fyber.inneractive.sdk.cache.b r1 = r2.f10462e
            com.fyber.inneractive.sdk.util.m r2 = new com.fyber.inneractive.sdk.util.m
            r2.<init>(r1)
            com.fyber.inneractive.sdk.util.C5299n.m16520a(r2)
        L_0x0042:
            m13175a()
            com.fyber.inneractive.sdk.config.IAConfigManager r1 = f10324J
            com.fyber.inneractive.sdk.cache.g r1 = r1.f10331F
            r1.mo24172a()
            com.fyber.inneractive.sdk.web.r r1 = com.fyber.inneractive.sdk.web.C5375r.f14185c
            r1.getClass()
            com.fyber.inneractive.sdk.web.q r2 = new com.fyber.inneractive.sdk.web.q
            r2.<init>(r1)
            com.fyber.inneractive.sdk.util.C5299n.m16520a(r2)
        L_0x0059:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.config.IAConfigManager.m13181g():boolean");
    }

    public static void removeListener(OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener) {
        f10324J.f10341g.remove(onConfigurationReadyAndValidListener);
    }

    /* renamed from: a */
    public final void mo24187a(Exception exc) {
        for (OnConfigurationReadyAndValidListener next : this.f10341g) {
            if (next != null) {
                boolean f = m13180f();
                IAlog.m16449d("notifying listener configuration state has been resolved", new Object[0]);
                next.onConfigurationReadyAndValid(this, f, !f ? exc : null);
            }
        }
    }

    /* renamed from: a */
    public static void m13175a() {
        IAConfigManager iAConfigManager = f10324J;
        C4474b0<C4200a> b0Var = iAConfigManager.f10327B;
        if (b0Var != null) {
            iAConfigManager.f10354t.f11186a.offer(b0Var);
            b0Var.mo24642a(C4501m0.QUEUED);
        }
        C4253i iVar = iAConfigManager.f10356v;
        if (!iVar.f10461d) {
            iVar.mo24277b();
        }
    }
}
