package com.ironsource.mediationsdk.model;

import com.ironsource.mediationsdk.utils.C6736c;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ironsource.mediationsdk.model.p */
public final class C6666p {

    /* renamed from: a */
    public ArrayList<Placement> f17399a;

    /* renamed from: b */
    public C6652c f17400b;

    /* renamed from: c */
    public int f17401c;

    /* renamed from: d */
    public boolean f17402d;

    /* renamed from: e */
    public int f17403e;

    /* renamed from: f */
    public String f17404f;

    /* renamed from: g */
    public String f17405g;

    /* renamed from: h */
    public int f17406h;

    /* renamed from: i */
    public int f17407i;

    /* renamed from: j */
    public int f17408j;

    /* renamed from: k */
    public Placement f17409k;

    /* renamed from: l */
    public C6736c f17410l;

    public C6666p() {
        this.f17399a = new ArrayList<>();
        this.f17400b = new C6652c();
    }

    public C6666p(int i, boolean z, int i2, int i3, int i4, C6652c cVar, C6736c cVar2, int i5) {
        this.f17399a = new ArrayList<>();
        this.f17401c = i;
        this.f17402d = z;
        this.f17403e = i2;
        this.f17406h = i3;
        this.f17400b = cVar;
        this.f17407i = i4;
        this.f17410l = cVar2;
        this.f17408j = i5;
    }

    /* renamed from: a */
    public final Placement mo36792a() {
        Iterator<Placement> it = this.f17399a.iterator();
        while (it.hasNext()) {
            Placement next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        return this.f17409k;
    }
}
