package com.bytedance.sdk.component.p108d.p111c;

import com.bytedance.sdk.component.p108d.C2825g;
import com.bytedance.sdk.component.p108d.C2828j;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.d.c.d */
/* compiled from: ImageResponse */
public class C2800d<T> implements C2828j {

    /* renamed from: a */
    private String f6289a;

    /* renamed from: b */
    private String f6290b;

    /* renamed from: c */
    private T f6291c;

    /* renamed from: d */
    private int f6292d;

    /* renamed from: e */
    private int f6293e;

    /* renamed from: f */
    private Map<String, String> f6294f;

    /* renamed from: g */
    private boolean f6295g;

    /* renamed from: h */
    private boolean f6296h;

    /* renamed from: i */
    private C2825g f6297i;

    /* renamed from: j */
    private int f6298j;

    /* renamed from: a */
    public C2800d mo17644a(C2790c cVar, T t) {
        this.f6291c = t;
        this.f6289a = cVar.mo17614e();
        this.f6290b = cVar.mo17603a();
        this.f6292d = cVar.mo17610b();
        this.f6293e = cVar.mo17612c();
        this.f6296h = cVar.mo17621l();
        this.f6297i = cVar.mo17622m();
        this.f6298j = cVar.mo17623n();
        return this;
    }

    /* renamed from: a */
    public C2800d mo17645a(C2790c cVar, T t, Map<String, String> map, boolean z) {
        this.f6294f = map;
        this.f6295g = z;
        return mo17644a(cVar, t);
    }

    /* renamed from: a */
    public String mo17646a() {
        return this.f6290b;
    }

    /* renamed from: b */
    public T mo17647b() {
        return this.f6291c;
    }

    /* renamed from: c */
    public Map<String, String> mo17648c() {
        return this.f6294f;
    }

    /* renamed from: d */
    public boolean mo17649d() {
        return this.f6296h;
    }

    /* renamed from: e */
    public C2825g mo17650e() {
        return this.f6297i;
    }

    /* renamed from: f */
    public int mo17651f() {
        return this.f6298j;
    }
}
