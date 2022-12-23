package com.ironsource.mediationsdk.model;

import com.ironsource.mediationsdk.utils.C6736c;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ironsource.mediationsdk.model.i */
public final class C6658i {

    /* renamed from: a */
    public ArrayList<InterstitialPlacement> f17357a;

    /* renamed from: b */
    public C6652c f17358b;

    /* renamed from: c */
    public int f17359c;

    /* renamed from: d */
    public boolean f17360d;

    /* renamed from: e */
    public int f17361e;

    /* renamed from: f */
    public int f17362f;

    /* renamed from: g */
    public String f17363g;

    /* renamed from: h */
    public String f17364h;

    /* renamed from: i */
    public C6736c f17365i;

    /* renamed from: j */
    public InterstitialPlacement f17366j;

    public C6658i() {
        this.f17357a = new ArrayList<>();
        this.f17358b = new C6652c();
    }

    public C6658i(int i, boolean z, int i2, C6652c cVar, C6736c cVar2, int i3) {
        this.f17357a = new ArrayList<>();
        this.f17359c = i;
        this.f17360d = z;
        this.f17361e = i2;
        this.f17358b = cVar;
        this.f17365i = cVar2;
        this.f17362f = i3;
    }

    /* renamed from: a */
    public final InterstitialPlacement mo36779a() {
        Iterator<InterstitialPlacement> it = this.f17357a.iterator();
        while (it.hasNext()) {
            InterstitialPlacement next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        return this.f17366j;
    }
}
