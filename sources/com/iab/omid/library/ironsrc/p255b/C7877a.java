package com.iab.omid.library.ironsrc.p255b;

import com.iab.omid.library.ironsrc.adsession.C7875a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.ironsrc.b.a */
public class C7877a {

    /* renamed from: a */
    private static C7877a f19027a = new C7877a();

    /* renamed from: b */
    private final ArrayList<C7875a> f19028b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<C7875a> f19029c = new ArrayList<>();

    private C7877a() {
    }

    /* renamed from: a */
    public static C7877a m22148a() {
        return f19027a;
    }

    /* renamed from: a */
    public void mo55336a(C7875a aVar) {
        this.f19028b.add(aVar);
    }

    /* renamed from: b */
    public Collection<C7875a> mo55337b() {
        return Collections.unmodifiableCollection(this.f19028b);
    }

    /* renamed from: b */
    public void mo55338b(C7875a aVar) {
        boolean d = mo55341d();
        this.f19029c.add(aVar);
        if (!d) {
            C7884f.m22186a().mo55371b();
        }
    }

    /* renamed from: c */
    public Collection<C7875a> mo55339c() {
        return Collections.unmodifiableCollection(this.f19029c);
    }

    /* renamed from: c */
    public void mo55340c(C7875a aVar) {
        boolean d = mo55341d();
        this.f19028b.remove(aVar);
        this.f19029c.remove(aVar);
        if (d && !mo55341d()) {
            C7884f.m22186a().mo55372c();
        }
    }

    /* renamed from: d */
    public boolean mo55341d() {
        return this.f19029c.size() > 0;
    }
}
