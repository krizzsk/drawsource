package com.iab.omid.library.applovin.p237b;

import com.iab.omid.library.applovin.adsession.C7723a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.applovin.b.a */
public class C7725a {

    /* renamed from: a */
    private static C7725a f18681a = new C7725a();

    /* renamed from: b */
    private final ArrayList<C7723a> f18682b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<C7723a> f18683c = new ArrayList<>();

    private C7725a() {
    }

    /* renamed from: a */
    public static C7725a m21466a() {
        return f18681a;
    }

    /* renamed from: a */
    public void mo54748a(C7723a aVar) {
        this.f18682b.add(aVar);
    }

    /* renamed from: b */
    public Collection<C7723a> mo54749b() {
        return Collections.unmodifiableCollection(this.f18682b);
    }

    /* renamed from: b */
    public void mo54750b(C7723a aVar) {
        boolean d = mo54753d();
        this.f18683c.add(aVar);
        if (!d) {
            C7732f.m21506a().mo54791b();
        }
    }

    /* renamed from: c */
    public Collection<C7723a> mo54751c() {
        return Collections.unmodifiableCollection(this.f18683c);
    }

    /* renamed from: c */
    public void mo54752c(C7723a aVar) {
        boolean d = mo54753d();
        this.f18682b.remove(aVar);
        this.f18683c.remove(aVar);
        if (d && !mo54753d()) {
            C7732f.m21506a().mo54792c();
        }
    }

    /* renamed from: d */
    public boolean mo54753d() {
        return this.f18683c.size() > 0;
    }
}
