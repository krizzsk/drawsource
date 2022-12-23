package com.applovin.impl.sdk.p052d;

import android.app.Activity;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.p049ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p052d.C1877c;
import com.applovin.impl.sdk.utils.C2049g;
import com.applovin.impl.sdk.utils.C2050h;

/* renamed from: com.applovin.impl.sdk.d.d */
public class C1879d {

    /* renamed from: a */
    private final C1969m f3450a;

    /* renamed from: b */
    private final C1882g f3451b;

    /* renamed from: c */
    private final C1877c.C1878a f3452c;

    /* renamed from: d */
    private final Object f3453d = new Object();

    /* renamed from: e */
    private final long f3454e;

    /* renamed from: f */
    private long f3455f;

    /* renamed from: g */
    private long f3456g;

    /* renamed from: h */
    private long f3457h;

    public C1879d(AppLovinAdImpl appLovinAdImpl, C1969m mVar) {
        if (appLovinAdImpl == null) {
            throw new IllegalArgumentException("No ad specified");
        } else if (mVar != null) {
            this.f3450a = mVar;
            this.f3451b = mVar.mo14527T();
            C1877c.C1878a a = mVar.mo14553ac().mo14320a(appLovinAdImpl);
            this.f3452c = a;
            a.mo14322a(C1876b.f3418a, (long) appLovinAdImpl.getSource().ordinal()).mo14324a();
            this.f3454e = appLovinAdImpl.getCreatedAtMillis();
        } else {
            throw new IllegalArgumentException("No sdk specified");
        }
    }

    /* renamed from: a */
    public static void m4138a(long j, AppLovinAdBase appLovinAdBase, C1969m mVar) {
        if (appLovinAdBase != null && mVar != null) {
            mVar.mo14553ac().mo14320a(appLovinAdBase).mo14322a(C1876b.f3419b, j).mo14324a();
        }
    }

    /* renamed from: a */
    public static void m4139a(AppLovinAdBase appLovinAdBase, C1969m mVar) {
        if (appLovinAdBase != null && mVar != null) {
            mVar.mo14553ac().mo14320a(appLovinAdBase).mo14322a(C1876b.f3420c, appLovinAdBase.getFetchLatencyMillis()).mo14322a(C1876b.f3421d, appLovinAdBase.getFetchResponseSize()).mo14324a();
        }
    }

    /* renamed from: a */
    private void m4140a(C1876b bVar) {
        synchronized (this.f3453d) {
            if (this.f3455f > 0) {
                this.f3452c.mo14322a(bVar, System.currentTimeMillis() - this.f3455f).mo14324a();
            }
        }
    }

    /* renamed from: a */
    public static void m4141a(C1880e eVar, AppLovinAdBase appLovinAdBase, C1969m mVar) {
        if (appLovinAdBase != null && mVar != null && eVar != null) {
            mVar.mo14553ac().mo14320a(appLovinAdBase).mo14322a(C1876b.f3422e, eVar.mo14342c()).mo14322a(C1876b.f3423f, eVar.mo14343d()).mo14322a(C1876b.f3438u, eVar.mo14346g()).mo14322a(C1876b.f3439v, eVar.mo14347h()).mo14322a(C1876b.f3440w, eVar.mo14341b() ? 1 : 0).mo14324a();
        }
    }

    /* renamed from: a */
    public void mo14325a() {
        this.f3452c.mo14322a(C1876b.f3427j, this.f3451b.mo14351a(C1881f.f3466b)).mo14322a(C1876b.f3426i, this.f3451b.mo14351a(C1881f.f3468d));
        synchronized (this.f3453d) {
            long j = 0;
            if (this.f3454e > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                this.f3455f = currentTimeMillis;
                long O = currentTimeMillis - this.f3450a.mo14522O();
                long j2 = this.f3455f - this.f3454e;
                long j3 = C2050h.m4957a(this.f3450a.mo14520L()) ? 1 : 0;
                Activity a = this.f3450a.mo14556af().mo14045a();
                if (C2049g.m4944f() && a != null && a.isInMultiWindowMode()) {
                    j = 1;
                }
                this.f3452c.mo14322a(C1876b.f3425h, O).mo14322a(C1876b.f3424g, j2).mo14322a(C1876b.f3433p, j3).mo14322a(C1876b.f3441x, j);
            }
        }
        this.f3452c.mo14324a();
    }

    /* renamed from: a */
    public void mo14326a(long j) {
        this.f3452c.mo14322a(C1876b.f3435r, j).mo14324a();
    }

    /* renamed from: b */
    public void mo14327b() {
        synchronized (this.f3453d) {
            if (this.f3456g < 1) {
                long currentTimeMillis = System.currentTimeMillis();
                this.f3456g = currentTimeMillis;
                if (this.f3455f > 0) {
                    this.f3452c.mo14322a(C1876b.f3430m, currentTimeMillis - this.f3455f).mo14324a();
                }
            }
        }
    }

    /* renamed from: b */
    public void mo14328b(long j) {
        this.f3452c.mo14322a(C1876b.f3434q, j).mo14324a();
    }

    /* renamed from: c */
    public void mo14329c() {
        m4140a(C1876b.f3428k);
    }

    /* renamed from: c */
    public void mo14330c(long j) {
        this.f3452c.mo14322a(C1876b.f3436s, j).mo14324a();
    }

    /* renamed from: d */
    public void mo14331d() {
        m4140a(C1876b.f3431n);
    }

    /* renamed from: d */
    public void mo14332d(long j) {
        synchronized (this.f3453d) {
            if (this.f3457h < 1) {
                this.f3457h = j;
                this.f3452c.mo14322a(C1876b.f3437t, j).mo14324a();
            }
        }
    }

    /* renamed from: e */
    public void mo14333e() {
        m4140a(C1876b.f3432o);
    }

    /* renamed from: f */
    public void mo14334f() {
        m4140a(C1876b.f3429l);
    }

    /* renamed from: g */
    public void mo14335g() {
        this.f3452c.mo14321a(C1876b.f3442y).mo14324a();
    }
}
