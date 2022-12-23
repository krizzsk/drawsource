package com.ironsource.mediationsdk.model;

import com.ironsource.mediationsdk.utils.C6736c;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ironsource.mediationsdk.model.f */
public final class C6655f {

    /* renamed from: a */
    public C6652c f17343a;

    /* renamed from: b */
    public long f17344b;

    /* renamed from: c */
    public ArrayList<C6656g> f17345c;

    /* renamed from: d */
    public C6656g f17346d;

    /* renamed from: e */
    public int f17347e;

    /* renamed from: f */
    public int f17348f;

    /* renamed from: g */
    public C6736c f17349g;

    /* renamed from: h */
    public boolean f17350h;

    /* renamed from: i */
    private int f17351i;

    public C6655f() {
        this.f17343a = new C6652c();
        this.f17345c = new ArrayList<>();
    }

    public C6655f(int i, long j, C6652c cVar, int i2, C6736c cVar2, int i3, boolean z) {
        this.f17345c = new ArrayList<>();
        this.f17351i = i;
        this.f17344b = j;
        this.f17343a = cVar;
        this.f17347e = i2;
        this.f17348f = i3;
        this.f17349g = cVar2;
        this.f17350h = z;
    }

    /* renamed from: a */
    public final C6656g mo36776a() {
        Iterator<C6656g> it = this.f17345c.iterator();
        while (it.hasNext()) {
            C6656g next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        return this.f17346d;
    }

    /* renamed from: a */
    public final C6656g mo36777a(String str) {
        Iterator<C6656g> it = this.f17345c.iterator();
        while (it.hasNext()) {
            C6656g next = it.next();
            if (next.getPlacementName().equals(str)) {
                return next;
            }
        }
        return null;
    }
}
