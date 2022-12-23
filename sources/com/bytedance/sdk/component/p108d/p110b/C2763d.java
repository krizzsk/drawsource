package com.bytedance.sdk.component.p108d.p110b;

import com.bytedance.sdk.component.p108d.C2824f;
import com.bytedance.sdk.component.p108d.C2825g;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.d.b.d */
/* compiled from: HttpResponse */
public class C2763d<T> implements C2824f {

    /* renamed from: a */
    Map<String, String> f6147a;

    /* renamed from: b */
    private int f6148b;

    /* renamed from: c */
    private T f6149c;

    /* renamed from: d */
    private String f6150d;

    /* renamed from: e */
    private C2825g f6151e;

    public C2763d(int i, T t, String str) {
        this.f6148b = i;
        this.f6149c = t;
        this.f6150d = str;
    }

    public C2763d(int i, T t, String str, Map<String, String> map) {
        this(i, t, str);
        this.f6147a = map;
    }

    /* renamed from: a */
    public C2825g mo17537a() {
        return this.f6151e;
    }

    /* renamed from: a */
    public void mo17538a(C2825g gVar) {
        this.f6151e = gVar;
    }

    /* renamed from: b */
    public int mo17539b() {
        return this.f6148b;
    }

    /* renamed from: c */
    public T mo17540c() {
        return this.f6149c;
    }

    /* renamed from: d */
    public String mo17541d() {
        return this.f6150d;
    }

    /* renamed from: e */
    public Map<String, String> mo17542e() {
        return this.f6147a;
    }
}
