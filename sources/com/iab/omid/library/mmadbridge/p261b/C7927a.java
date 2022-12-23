package com.iab.omid.library.mmadbridge.p261b;

import com.iab.omid.library.mmadbridge.adsession.C7925a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.mmadbridge.b.a */
public class C7927a {

    /* renamed from: a */
    private static C7927a f19142a = new C7927a();

    /* renamed from: b */
    private final ArrayList<C7925a> f19143b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<C7925a> f19144c = new ArrayList<>();

    private C7927a() {
    }

    /* renamed from: a */
    public static C7927a m22371a() {
        return f19142a;
    }

    /* renamed from: a */
    public void mo55526a(C7925a aVar) {
        this.f19143b.add(aVar);
    }

    /* renamed from: b */
    public Collection<C7925a> mo55527b() {
        return Collections.unmodifiableCollection(this.f19143b);
    }

    /* renamed from: b */
    public void mo55528b(C7925a aVar) {
        boolean d = mo55531d();
        this.f19144c.add(aVar);
        if (!d) {
            C7934f.m22411a().mo55569b();
        }
    }

    /* renamed from: c */
    public Collection<C7925a> mo55529c() {
        return Collections.unmodifiableCollection(this.f19144c);
    }

    /* renamed from: c */
    public void mo55530c(C7925a aVar) {
        boolean d = mo55531d();
        this.f19143b.remove(aVar);
        this.f19144c.remove(aVar);
        if (d && !mo55531d()) {
            C7934f.m22411a().mo55570c();
        }
    }

    /* renamed from: d */
    public boolean mo55531d() {
        return this.f19144c.size() > 0;
    }
}
