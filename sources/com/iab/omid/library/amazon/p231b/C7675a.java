package com.iab.omid.library.amazon.p231b;

import com.iab.omid.library.amazon.adsession.C7673a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.amazon.b.a */
public class C7675a {

    /* renamed from: a */
    private static C7675a f18564a = new C7675a();

    /* renamed from: b */
    private final ArrayList<C7673a> f18565b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<C7673a> f18566c = new ArrayList<>();

    private C7675a() {
    }

    /* renamed from: a */
    public static C7675a m21236a() {
        return f18564a;
    }

    /* renamed from: a */
    public void mo54549a(C7673a aVar) {
        this.f18565b.add(aVar);
    }

    /* renamed from: b */
    public Collection<C7673a> mo54550b() {
        return Collections.unmodifiableCollection(this.f18565b);
    }

    /* renamed from: b */
    public void mo54551b(C7673a aVar) {
        boolean d = mo54554d();
        this.f18566c.add(aVar);
        if (!d) {
            C7682f.m21276a().mo54592b();
        }
    }

    /* renamed from: c */
    public Collection<C7673a> mo54552c() {
        return Collections.unmodifiableCollection(this.f18566c);
    }

    /* renamed from: c */
    public void mo54553c(C7673a aVar) {
        boolean d = mo54554d();
        this.f18565b.remove(aVar);
        this.f18566c.remove(aVar);
        if (d && !mo54554d()) {
            C7682f.m21276a().mo54593c();
        }
    }

    /* renamed from: d */
    public boolean mo54554d() {
        return this.f18566c.size() > 0;
    }
}
