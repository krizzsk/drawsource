package com.bytedance.sdk.openadsdk.core.p149e;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.core.e.a */
/* compiled from: AdInfo */
public class C3402a {

    /* renamed from: a */
    private String f8192a;

    /* renamed from: b */
    private int f8193b;

    /* renamed from: c */
    private String f8194c;

    /* renamed from: d */
    private List<C3431n> f8195d = new ArrayList();

    /* renamed from: e */
    private String f8196e;

    /* renamed from: f */
    private long f8197f;

    /* renamed from: a */
    public static Map<String, C3431n> m10124a(C3402a aVar) {
        if (aVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (C3431n next : aVar.mo19386b()) {
            if (!TextUtils.isEmpty(next.mo19572af())) {
                hashMap.put(next.mo19572af(), next);
            }
        }
        if (hashMap.size() != 0) {
            return hashMap;
        }
        return null;
    }

    /* renamed from: a */
    public int mo19381a() {
        return this.f8193b;
    }

    /* renamed from: a */
    public void mo19382a(int i) {
        this.f8193b = i;
    }

    /* renamed from: a */
    public void mo19383a(long j) {
        this.f8197f = j;
    }

    /* renamed from: a */
    public void mo19384a(C3431n nVar) {
        this.f8195d.add(nVar);
    }

    /* renamed from: a */
    public void mo19385a(String str) {
        this.f8192a = str;
    }

    /* renamed from: b */
    public List<C3431n> mo19386b() {
        return this.f8195d;
    }

    /* renamed from: b */
    public void mo19387b(String str) {
        this.f8194c = str;
    }

    /* renamed from: c */
    public String mo19388c() {
        return this.f8196e;
    }

    /* renamed from: c */
    public void mo19389c(String str) {
        this.f8196e = str;
    }
}
