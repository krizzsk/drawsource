package com.iab.omid.library.oguryco.p267b;

import com.iab.omid.library.oguryco.adsession.C7975a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.oguryco.b.a */
public class C7977a {

    /* renamed from: a */
    private static C7977a f19263a = new C7977a();

    /* renamed from: b */
    private final ArrayList<C7975a> f19264b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<C7975a> f19265c = new ArrayList<>();

    private C7977a() {
    }

    /* renamed from: a */
    public static C7977a m22601a() {
        return f19263a;
    }

    /* renamed from: a */
    public void mo55747a(C7975a aVar) {
        this.f19264b.add(aVar);
    }

    /* renamed from: b */
    public Collection<C7975a> mo55748b() {
        return Collections.unmodifiableCollection(this.f19264b);
    }

    /* renamed from: b */
    public void mo55749b(C7975a aVar) {
        boolean d = mo55752d();
        this.f19265c.add(aVar);
        if (!d) {
            C7985f.m22644a().mo55784b();
        }
    }

    /* renamed from: c */
    public Collection<C7975a> mo55750c() {
        return Collections.unmodifiableCollection(this.f19265c);
    }

    /* renamed from: c */
    public void mo55751c(C7975a aVar) {
        boolean d = mo55752d();
        this.f19264b.remove(aVar);
        this.f19265c.remove(aVar);
        if (d && !mo55752d()) {
            C7985f.m22644a().mo55785c();
        }
    }

    /* renamed from: d */
    public boolean mo55752d() {
        return this.f19265c.size() > 0;
    }
}
