package com.fyber.inneractive.sdk.config.global.features;

import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.config.global.features.h */
public class C4232h extends C4229e {
    public C4232h() {
        super("omsdk");
    }

    /* renamed from: b */
    public C4229e mo24234b() {
        C4232h hVar = new C4232h();
        mo24238a((C4229e) hVar);
        return hVar;
    }

    /* renamed from: c */
    public boolean mo24244c() {
        boolean a = mo24239a("enable", false);
        IAlog.m16446a("OMSDK AB %s", String.valueOf(a));
        return a;
    }
}
