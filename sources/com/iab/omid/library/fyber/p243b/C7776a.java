package com.iab.omid.library.fyber.p243b;

import com.iab.omid.library.fyber.adsession.C7774a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.fyber.b.a */
public class C7776a {

    /* renamed from: a */
    private static C7776a f18798a = new C7776a();

    /* renamed from: b */
    private final ArrayList<C7774a> f18799b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<C7774a> f18800c = new ArrayList<>();

    private C7776a() {
    }

    /* renamed from: a */
    public static C7776a m21696a() {
        return f18798a;
    }

    /* renamed from: a */
    public void mo54947a(C7774a aVar) {
        this.f18799b.add(aVar);
    }

    /* renamed from: b */
    public Collection<C7774a> mo54948b() {
        return Collections.unmodifiableCollection(this.f18799b);
    }

    /* renamed from: b */
    public void mo54949b(C7774a aVar) {
        boolean d = mo54952d();
        this.f18800c.add(aVar);
        if (!d) {
            C7783f.m21736a().mo54990b();
        }
    }

    /* renamed from: c */
    public Collection<C7774a> mo54950c() {
        return Collections.unmodifiableCollection(this.f18800c);
    }

    /* renamed from: c */
    public void mo54951c(C7774a aVar) {
        boolean d = mo54952d();
        this.f18799b.remove(aVar);
        this.f18800c.remove(aVar);
        if (d && !mo54952d()) {
            C7783f.m21736a().mo54991c();
        }
    }

    /* renamed from: d */
    public boolean mo54952d() {
        return this.f18800c.size() > 0;
    }
}
