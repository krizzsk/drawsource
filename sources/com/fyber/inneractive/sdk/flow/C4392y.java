package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.C4287y;
import com.fyber.inneractive.sdk.config.C4288z;
import com.fyber.inneractive.sdk.config.global.C4251s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.model.vast.C4420b;
import com.fyber.inneractive.sdk.player.C5015i;
import com.fyber.inneractive.sdk.response.C5235g;
import com.fyber.inneractive.sdk.util.C5268e0;

/* renamed from: com.fyber.inneractive.sdk.flow.y */
public class C4392y extends C4361j<C5235g> {

    /* renamed from: g */
    public C5015i f10797g;

    /* renamed from: h */
    public boolean f10798h = false;

    public C4392y(C4288z zVar, C4251s sVar, C5235g gVar, InneractiveAdRequest inneractiveAdRequest) {
        super(zVar, sVar);
        mo24517a(gVar);
        mo24516a(inneractiveAdRequest);
    }

    /* renamed from: a */
    public void mo24291a() {
        C5015i iVar = this.f10797g;
        if (iVar != null) {
            iVar.mo25602a();
            this.f10797g = null;
        }
    }

    /* renamed from: d */
    public boolean mo24299d() {
        C4287y yVar = (C4287y) this.f10715d;
        if (yVar.f10549f == null) {
            return false;
        }
        return C5268e0.m16470a(yVar.f10549f.f10378j);
    }

    /* renamed from: e */
    public boolean mo24294e() {
        return this.f10797g != null;
    }

    /* renamed from: f */
    public String mo24573f() {
        C4420b bVar;
        T t = this.f10713b;
        if (t == null || (bVar = ((C5235g) t).f13893C) == null) {
            return null;
        }
        return bVar.f10860b;
    }

    public boolean isVideoAd() {
        return true;
    }
}
