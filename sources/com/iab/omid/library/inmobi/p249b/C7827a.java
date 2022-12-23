package com.iab.omid.library.inmobi.p249b;

import com.iab.omid.library.inmobi.adsession.C7825a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.inmobi.b.a */
public class C7827a {

    /* renamed from: a */
    private static C7827a f18914a = new C7827a();

    /* renamed from: b */
    private final ArrayList<C7825a> f18915b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<C7825a> f18916c = new ArrayList<>();

    private C7827a() {
    }

    /* renamed from: a */
    public static C7827a m21924a() {
        return f18914a;
    }

    /* renamed from: a */
    public void mo55142a(C7825a aVar) {
        this.f18915b.add(aVar);
    }

    /* renamed from: b */
    public Collection<C7825a> mo55143b() {
        return Collections.unmodifiableCollection(this.f18915b);
    }

    /* renamed from: b */
    public void mo55144b(C7825a aVar) {
        boolean d = mo55147d();
        this.f18916c.add(aVar);
        if (!d) {
            C7834f.m21964a().mo55185b();
        }
    }

    /* renamed from: c */
    public Collection<C7825a> mo55145c() {
        return Collections.unmodifiableCollection(this.f18916c);
    }

    /* renamed from: c */
    public void mo55146c(C7825a aVar) {
        boolean d = mo55147d();
        this.f18915b.remove(aVar);
        this.f18916c.remove(aVar);
        if (d && !mo55147d()) {
            C7834f.m21964a().mo55186c();
        }
    }

    /* renamed from: d */
    public boolean mo55147d() {
        return this.f18916c.size() > 0;
    }
}
