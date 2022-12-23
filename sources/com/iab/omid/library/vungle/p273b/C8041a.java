package com.iab.omid.library.vungle.p273b;

import com.iab.omid.library.vungle.adsession.C8039a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.vungle.b.a */
public class C8041a {

    /* renamed from: a */
    private static C8041a f19447a = new C8041a();

    /* renamed from: b */
    private final ArrayList<C8039a> f19448b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<C8039a> f19449c = new ArrayList<>();

    private C8041a() {
    }

    /* renamed from: a */
    public static C8041a m22925a() {
        return f19447a;
    }

    /* renamed from: a */
    public void mo56059a(C8039a aVar) {
        this.f19448b.add(aVar);
    }

    /* renamed from: b */
    public Collection<C8039a> mo56060b() {
        return Collections.unmodifiableCollection(this.f19448b);
    }

    /* renamed from: b */
    public void mo56061b(C8039a aVar) {
        boolean d = mo56064d();
        this.f19449c.add(aVar);
        if (!d) {
            C8048f.m22965a().mo56102b();
        }
    }

    /* renamed from: c */
    public Collection<C8039a> mo56062c() {
        return Collections.unmodifiableCollection(this.f19449c);
    }

    /* renamed from: c */
    public void mo56063c(C8039a aVar) {
        boolean d = mo56064d();
        this.f19448b.remove(aVar);
        this.f19449c.remove(aVar);
        if (d && !mo56064d()) {
            C8048f.m22965a().mo56103c();
        }
    }

    /* renamed from: d */
    public boolean mo56064d() {
        return this.f19449c.size() > 0;
    }
}
