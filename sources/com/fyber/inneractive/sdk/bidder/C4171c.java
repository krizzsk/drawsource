package com.fyber.inneractive.sdk.bidder;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.fyber.inneractive.sdk.config.C4215e;
import com.fyber.inneractive.sdk.config.C4257k;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.serverapi.C5240a;
import com.fyber.inneractive.sdk.serverapi.C5242b;
import com.fyber.inneractive.sdk.util.C5290k;
import com.fyber.inneractive.sdk.util.C5291k0;
import com.fyber.inneractive.sdk.util.C5292l;
import com.fyber.inneractive.sdk.util.C5299n;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.bidder.c */
public class C4171c {

    /* renamed from: A */
    public int f10237A;

    /* renamed from: B */
    public String f10238B;

    /* renamed from: C */
    public Long f10239C;

    /* renamed from: D */
    public String f10240D;

    /* renamed from: E */
    public Boolean f10241E;

    /* renamed from: F */
    public String f10242F;

    /* renamed from: G */
    public String f10243G;

    /* renamed from: H */
    public int f10244H;

    /* renamed from: I */
    public InneractiveUserConfig.Gender f10245I;

    /* renamed from: J */
    public boolean f10246J;

    /* renamed from: K */
    public String f10247K;

    /* renamed from: L */
    public String f10248L;

    /* renamed from: a */
    public final C5242b f10249a;

    /* renamed from: b */
    public String f10250b;

    /* renamed from: c */
    public String f10251c;

    /* renamed from: d */
    public String f10252d;

    /* renamed from: e */
    public String f10253e;

    /* renamed from: f */
    public String f10254f;

    /* renamed from: g */
    public String f10255g;

    /* renamed from: h */
    public String f10256h;

    /* renamed from: i */
    public String f10257i;

    /* renamed from: j */
    public String f10258j;

    /* renamed from: k */
    public String f10259k;

    /* renamed from: l */
    public int f10260l;

    /* renamed from: m */
    public Long f10261m;

    /* renamed from: n */
    public int f10262n;

    /* renamed from: o */
    public int f10263o;

    /* renamed from: p */
    public TokenParametersOuterClass$TokenParameters.C4140d f10264p = C4175f.m13141b(C5240a.m16401c());

    /* renamed from: q */
    public String f10265q;

    /* renamed from: r */
    public String f10266r;

    /* renamed from: s */
    public TokenParametersOuterClass$TokenParameters.C4144h f10267s;

    /* renamed from: t */
    public Boolean f10268t;

    /* renamed from: u */
    public Boolean f10269u;

    /* renamed from: v */
    public Boolean f10270v;

    /* renamed from: w */
    public boolean f10271w;

    /* renamed from: x */
    public Boolean f10272x;

    /* renamed from: y */
    public Boolean f10273y;

    /* renamed from: z */
    public Boolean f10274z;

    /* renamed from: com.fyber.inneractive.sdk.bidder.c$a */
    public class C4172a implements Runnable {
        public C4172a() {
        }

        public void run() {
            C4171c.this.f10250b = C5292l.m16517f();
        }
    }

    public C4171c(C5242b bVar) {
        this.f10249a = bVar;
        mo24163c();
        this.f10251c = bVar.mo26323a("2.2.0");
        this.f10252d = bVar.mo26333j();
        this.f10253e = bVar.mo26325b();
        this.f10254f = bVar.mo26334k();
        this.f10262n = bVar.mo26336m();
        this.f10263o = bVar.mo26335l();
        this.f10267s = bVar.mo26338o() ? TokenParametersOuterClass$TokenParameters.C4144h.SECURE : TokenParametersOuterClass$TokenParameters.C4144h.UNSECURE;
        mo24162b();
        mo24160a();
        this.f10269u = C5240a.m16406h();
        this.f10241E = C5240a.m16408j();
        this.f10272x = C5240a.m16405g();
        this.f10273y = C5240a.m16410l();
        this.f10274z = C5240a.m16409k();
    }

    /* renamed from: a */
    public void mo24160a() {
        this.f10249a.getClass();
        IAConfigManager iAConfigManager = IAConfigManager.f10324J;
        this.f10255g = iAConfigManager.f10350p;
        this.f10249a.getClass();
        this.f10256h = C5290k.m16489g();
        this.f10257i = this.f10249a.mo26321a();
        this.f10258j = this.f10249a.mo26331h();
        this.f10259k = this.f10249a.mo26332i();
        this.f10260l = C5240a.m16404f().intValue();
        this.f10261m = C5240a.m16403e();
        this.f10249a.getClass();
        List<String> list = iAConfigManager.f10351q;
        if (list != null && !list.isEmpty()) {
            this.f10265q = C5292l.m16509b(",", list);
        }
        this.f10249a.getClass();
        this.f10266r = C5291k0.m16498f().f14014a;
        this.f10242F = C5240a.m16398a();
        this.f10271w = C5240a.m16407i().booleanValue();
        this.f10237A = C5240a.m16400b().intValue();
        this.f10238B = this.f10249a.mo26329f();
        this.f10239C = C5240a.m16402d();
        int i = C4215e.f10405a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.device");
        if (TextUtils.isEmpty(property)) {
            property = C4257k.m13293a();
        }
        this.f10240D = property;
        this.f10243G = iAConfigManager.f10345k;
        this.f10244H = iAConfigManager.f10344j.getAge();
        this.f10245I = iAConfigManager.f10344j.getGender();
        this.f10247K = iAConfigManager.f10344j.getZipCode();
        this.f10246J = iAConfigManager.f10346l;
        this.f10268t = C5240a.m16411m();
        mo24162b();
        this.f10270v = C5240a.m16412n();
    }

    /* renamed from: b */
    public final void mo24162b() {
        IAConfigManager iAConfigManager = IAConfigManager.f10324J;
        if (!TextUtils.isEmpty(iAConfigManager.f10349o)) {
            this.f10248L = String.format("%s_%s", new Object[]{iAConfigManager.f10347m, iAConfigManager.f10349o});
            return;
        }
        this.f10248L = iAConfigManager.f10347m;
    }

    /* renamed from: c */
    public final void mo24163c() {
        if (TextUtils.isEmpty(this.f10250b)) {
            C5299n.m16520a(new C4172a());
        }
    }

    /* renamed from: a */
    public void mo24161a(String str) {
        this.f10250b = str;
    }
}
