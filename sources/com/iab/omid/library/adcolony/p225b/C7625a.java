package com.iab.omid.library.adcolony.p225b;

import com.iab.omid.library.adcolony.adsession.C7623a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.adcolony.b.a */
public class C7625a {

    /* renamed from: a */
    private static C7625a f18447a = new C7625a();

    /* renamed from: b */
    private final ArrayList<C7623a> f18448b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<C7623a> f18449c = new ArrayList<>();

    private C7625a() {
    }

    /* renamed from: a */
    public static C7625a m21006a() {
        return f18447a;
    }

    /* renamed from: a */
    public void mo54350a(C7623a aVar) {
        this.f18448b.add(aVar);
    }

    /* renamed from: b */
    public Collection<C7623a> mo54351b() {
        return Collections.unmodifiableCollection(this.f18448b);
    }

    /* renamed from: b */
    public void mo54352b(C7623a aVar) {
        boolean d = mo54355d();
        this.f18449c.add(aVar);
        if (!d) {
            C7632f.m21046a().mo54393b();
        }
    }

    /* renamed from: c */
    public Collection<C7623a> mo54353c() {
        return Collections.unmodifiableCollection(this.f18449c);
    }

    /* renamed from: c */
    public void mo54354c(C7623a aVar) {
        boolean d = mo54355d();
        this.f18448b.remove(aVar);
        this.f18449c.remove(aVar);
        if (d && !mo54355d()) {
            C7632f.m21046a().mo54394c();
        }
    }

    /* renamed from: d */
    public boolean mo54355d() {
        return this.f18449c.size() > 0;
    }
}
