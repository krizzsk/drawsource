package com.unity3d.services.ads.webplayer;

import java.util.HashMap;

/* renamed from: com.unity3d.services.ads.webplayer.g */
/* compiled from: WebPlayerViewCache */
public class C11937g {

    /* renamed from: a */
    private static C11937g f28988a;

    /* renamed from: b */
    private HashMap<String, C11929f> f28989b = new HashMap<>();

    /* renamed from: a */
    public static C11937g m32510a() {
        if (f28988a == null) {
            f28988a = new C11937g();
        }
        return f28988a;
    }

    /* renamed from: b */
    public synchronized void mo70945b(String str) {
        if (this.f28989b.containsKey(str)) {
            this.f28989b.remove(str);
        }
    }

    /* renamed from: a */
    public synchronized void mo70944a(String str, C11929f fVar) {
        this.f28989b.put(str, fVar);
    }

    /* renamed from: a */
    public synchronized C11929f mo70943a(String str) {
        if (!this.f28989b.containsKey(str)) {
            return null;
        }
        return this.f28989b.get(str);
    }
}
