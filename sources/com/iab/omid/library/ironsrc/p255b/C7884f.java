package com.iab.omid.library.ironsrc.p255b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.ironsrc.adsession.C7875a;
import com.iab.omid.library.ironsrc.p254a.C7871b;
import com.iab.omid.library.ironsrc.p254a.C7872c;
import com.iab.omid.library.ironsrc.p254a.C7873d;
import com.iab.omid.library.ironsrc.p254a.C7874e;
import com.iab.omid.library.ironsrc.p255b.C7878b;
import com.iab.omid.library.ironsrc.walking.TreeWalker;

/* renamed from: com.iab.omid.library.ironsrc.b.f */
public class C7884f implements C7872c, C7878b.C7879a {

    /* renamed from: a */
    private static C7884f f19045a;

    /* renamed from: b */
    private float f19046b = 0.0f;

    /* renamed from: c */
    private final C7874e f19047c;

    /* renamed from: d */
    private final C7871b f19048d;

    /* renamed from: e */
    private C7873d f19049e;

    /* renamed from: f */
    private C7877a f19050f;

    public C7884f(C7874e eVar, C7871b bVar) {
        this.f19047c = eVar;
        this.f19048d = bVar;
    }

    /* renamed from: a */
    public static C7884f m22186a() {
        if (f19045a == null) {
            f19045a = new C7884f(new C7874e(), new C7871b());
        }
        return f19045a;
    }

    /* renamed from: e */
    private C7877a m22187e() {
        if (this.f19050f == null) {
            this.f19050f = C7877a.m22148a();
        }
        return this.f19050f;
    }

    /* renamed from: a */
    public void mo55263a(float f) {
        this.f19046b = f;
        for (C7875a adSessionStatePublisher : m22187e().mo55339c()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo55381a(f);
        }
    }

    /* renamed from: a */
    public void mo55370a(Context context) {
        this.f19049e = this.f19047c.mo55267a(new Handler(), context, this.f19048d.mo55262a(), this);
    }

    /* renamed from: b */
    public void mo55371b() {
        C7878b.m22155a().mo55343a((C7878b.C7879a) this);
        C7878b.m22155a().mo55344b();
        if (C7878b.m22155a().mo55346d()) {
            TreeWalker.getInstance().mo55406a();
        }
        this.f19049e.mo55264a();
    }

    /* renamed from: c */
    public void mo55372c() {
        TreeWalker.getInstance().mo55408b();
        C7878b.m22155a().mo55345c();
        this.f19049e.mo55265b();
    }

    /* renamed from: d */
    public float mo55373d() {
        return this.f19046b;
    }
}
