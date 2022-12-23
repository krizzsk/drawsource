package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.C4285w;
import com.fyber.inneractive.sdk.config.C4287y;
import com.fyber.inneractive.sdk.config.C4288z;
import com.fyber.inneractive.sdk.config.global.C4251s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.response.C5233e;

/* renamed from: com.fyber.inneractive.sdk.flow.j */
public abstract class C4361j<T extends C5233e> {

    /* renamed from: a */
    public InneractiveAdRequest f10712a;

    /* renamed from: b */
    public T f10713b;

    /* renamed from: c */
    public C4251s f10714c;

    /* renamed from: d */
    public final C4288z f10715d;

    /* renamed from: e */
    public boolean f10716e = false;

    /* renamed from: f */
    public boolean f10717f = false;

    public C4361j(C4288z zVar, C4251s sVar) {
        this.f10715d = zVar;
        this.f10714c = sVar;
    }

    /* renamed from: a */
    public abstract void mo24291a();

    /* renamed from: a */
    public void mo24517a(T t) {
        this.f10713b = t;
    }

    /* renamed from: b */
    public C4251s mo24518b() {
        return this.f10714c;
    }

    /* renamed from: c */
    public T mo24293c() {
        return this.f10713b;
    }

    /* renamed from: d */
    public boolean mo24299d() {
        C4285w wVar = ((C4287y) this.f10715d).f10548e;
        return false;
    }

    /* renamed from: e */
    public abstract boolean mo24294e();

    public abstract boolean isVideoAd();

    /* renamed from: a */
    public void mo24516a(InneractiveAdRequest inneractiveAdRequest) {
        this.f10712a = inneractiveAdRequest;
    }
}
