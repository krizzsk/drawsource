package com.unity3d.services.banners.properties;

import java.util.HashMap;

/* renamed from: com.unity3d.services.banners.properties.a */
/* compiled from: BannerRefreshInfo */
public class C11963a {

    /* renamed from: a */
    private static C11963a f29077a;

    /* renamed from: b */
    private HashMap<String, Integer> f29078b = new HashMap<>();

    /* renamed from: a */
    public static C11963a m32558a() {
        if (f29077a == null) {
            f29077a = new C11963a();
        }
        return f29077a;
    }

    /* renamed from: a */
    public synchronized void mo70997a(String str, Integer num) {
        this.f29078b.put(str, num);
    }

    /* renamed from: a */
    public synchronized Integer mo70996a(String str) {
        return this.f29078b.get(str);
    }
}
