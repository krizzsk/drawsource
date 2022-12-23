package com.ironsource.sdk.p285g;

import com.ironsource.sdk.p288j.C8310a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.sdk.g.c */
public final class C8292c {

    /* renamed from: a */
    public String f20217a;

    /* renamed from: b */
    public String f20218b;

    /* renamed from: c */
    public int f20219c = -1;

    /* renamed from: d */
    public Map<String, String> f20220d;

    /* renamed from: e */
    public int f20221e;

    /* renamed from: f */
    public boolean f20222f;

    /* renamed from: g */
    public C8310a f20223g;

    public C8292c(String str, String str2, Map<String, String> map, C8310a aVar) {
        this.f20218b = str;
        this.f20217a = str2;
        this.f20220d = map;
        this.f20223g = aVar;
        this.f20221e = 0;
        this.f20222f = false;
    }

    /* renamed from: a */
    public final Map<String, String> mo56723a() {
        HashMap hashMap = new HashMap();
        hashMap.put("demandSourceId", this.f20218b);
        hashMap.put("demandSourceName", this.f20217a);
        Map<String, String> map = this.f20220d;
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    /* renamed from: a */
    public final synchronized void mo56724a(int i) {
        this.f20221e = i;
    }
}
