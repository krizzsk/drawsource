package com.fyber.inneractive.sdk.p188dv;

import com.fyber.inneractive.sdk.config.C4288z;
import com.fyber.inneractive.sdk.config.global.C4251s;
import com.fyber.inneractive.sdk.flow.C4361j;
import com.fyber.inneractive.sdk.p188dv.banner.C4297b;
import com.fyber.inneractive.sdk.response.C5233e;
import com.google.android.gms.ads.AdRequest;

/* renamed from: com.fyber.inneractive.sdk.dv.a */
public abstract class C4292a<T> extends C4361j<C4305f> {

    /* renamed from: g */
    public C4302d f10553g;

    /* renamed from: h */
    public C4297b f10554h;

    /* renamed from: i */
    public T f10555i;

    public C4292a(C4288z zVar, C4251s sVar, C4305f fVar) {
        super(zVar, sVar);
        mo24517a(fVar);
    }

    /* renamed from: a */
    public void mo24291a() {
        this.f10553g = null;
        this.f10555i = null;
    }

    /* renamed from: c */
    public C5233e mo24293c() {
        return (C4305f) this.f10713b;
    }

    /* renamed from: e */
    public boolean mo24294e() {
        return false;
    }

    public boolean isVideoAd() {
        return false;
    }

    /* renamed from: a */
    public void mo24292a(AdRequest adRequest, C4302d dVar) {
        this.f10553g = dVar;
    }
}
