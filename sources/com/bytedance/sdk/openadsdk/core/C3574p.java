package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.sdk.openadsdk.core.p */
/* compiled from: RitInfo */
public class C3574p {

    /* renamed from: a */
    public static ConcurrentHashMap<Integer, C3574p> f9031a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private String f9032b = "";

    /* renamed from: c */
    private String f9033c = "";

    /* renamed from: d */
    private int f9034d;

    /* renamed from: e */
    private int f9035e;

    /* renamed from: f */
    private String f9036f;

    /* renamed from: a */
    public String mo20114a() {
        return this.f9036f;
    }

    /* renamed from: b */
    public String mo20117b() {
        return this.f9032b;
    }

    /* renamed from: c */
    public String mo20119c() {
        return this.f9033c;
    }

    /* renamed from: d */
    public int mo20120d() {
        return this.f9034d;
    }

    /* renamed from: a */
    public void mo20115a(int i) {
        this.f9034d = i;
    }

    /* renamed from: e */
    public int mo20121e() {
        return this.f9035e;
    }

    /* renamed from: b */
    public void mo20118b(int i) {
        this.f9035e = i;
    }

    /* renamed from: f */
    private void m11299f() {
        this.f9032b = "";
        this.f9033c = "";
        this.f9034d = 0;
        this.f9035e = 0;
    }

    /* renamed from: a */
    public void mo20116a(C3431n nVar) {
        if (nVar != null) {
            String h = C3898x.m12806h(nVar);
            if (!TextUtils.isEmpty(h)) {
                this.f9036f = h;
            }
            String[] split = nVar.mo19522O().split("/");
            if (split.length >= 3) {
                this.f9032b = split[2];
            }
            if (nVar.mo19567aa() != null && !TextUtils.isEmpty(nVar.mo19567aa().mo19407c())) {
                this.f9033c = nVar.mo19567aa().mo19407c();
            }
        }
    }

    /* renamed from: b */
    public static void m11296b(C3431n nVar) {
        if (nVar != null && !TextUtils.isEmpty(nVar.mo19569ac())) {
            Integer valueOf = Integer.valueOf(C3898x.m12794f(nVar));
            if (valueOf.intValue() != 0) {
                C3574p pVar = null;
                if (f9031a == null) {
                    f9031a = new ConcurrentHashMap<>();
                }
                if (f9031a.containsKey(valueOf)) {
                    pVar = f9031a.get(valueOf);
                }
                if (pVar == null) {
                    pVar = new C3574p();
                }
                String h = C3898x.m12806h(nVar);
                if (TextUtils.isEmpty(h) || !h.equals(pVar.mo20114a())) {
                    pVar.m11299f();
                    pVar.mo20116a(nVar);
                    f9031a.put(valueOf, pVar);
                }
            }
        }
    }

    /* renamed from: c */
    public static void m11297c(int i) {
        C3574p pVar;
        if (i != 0) {
            if (f9031a == null) {
                f9031a = new ConcurrentHashMap<>();
            }
            if (f9031a.containsKey(Integer.valueOf(i)) && (pVar = f9031a.get(Integer.valueOf(i))) != null) {
                pVar.mo20118b(1);
            }
        }
    }

    /* renamed from: c */
    public static void m11298c(C3431n nVar) {
        C3574p pVar;
        if (nVar != null) {
            Integer valueOf = Integer.valueOf(C3898x.m12794f(nVar));
            if (valueOf.intValue() != 0) {
                if (f9031a == null) {
                    f9031a = new ConcurrentHashMap<>();
                }
                if (f9031a.containsKey(valueOf) && (pVar = f9031a.get(valueOf)) != null) {
                    pVar.mo20115a(1);
                }
            }
        }
    }
}
