package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.C4287y;
import com.fyber.inneractive.sdk.config.C4288z;
import com.fyber.inneractive.sdk.config.global.C4251s;
import com.fyber.inneractive.sdk.p191ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.response.C5234f;

/* renamed from: com.fyber.inneractive.sdk.flow.u */
public class C4379u extends C4361j<C5234f> {

    /* renamed from: g */
    public IAmraidWebViewController f10770g;

    public C4379u(C4288z zVar, C4251s sVar) {
        super(zVar, sVar);
    }

    /* renamed from: a */
    public void mo24291a() {
        IAmraidWebViewController iAmraidWebViewController = this.f10770g;
        if (iAmraidWebViewController != null) {
            iAmraidWebViewController.mo26483k();
            this.f10770g.mo26345l();
            this.f10770g = null;
        }
    }

    /* renamed from: d */
    public boolean mo24299d() {
        C4288z zVar = this.f10715d;
        if (zVar == null) {
            return false;
        }
        C4287y yVar = (C4287y) zVar;
        if (yVar.f10546c == null || yVar.f10546c.f10490b == null) {
            return false;
        }
        return yVar.f10546c.f10490b.isFullscreenUnit();
    }

    /* renamed from: e */
    public boolean mo24294e() {
        IAmraidWebViewController iAmraidWebViewController = this.f10770g;
        if (iAmraidWebViewController != null) {
            if (iAmraidWebViewController.f14079b != null) {
                return true;
            }
        }
        return false;
    }

    public boolean isVideoAd() {
        return false;
    }
}
