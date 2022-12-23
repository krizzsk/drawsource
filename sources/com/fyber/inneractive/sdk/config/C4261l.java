package com.fyber.inneractive.sdk.config;

import android.os.Handler;
import com.fyber.inneractive.sdk.config.C4253i;
import com.fyber.inneractive.sdk.network.C4476c;

/* renamed from: com.fyber.inneractive.sdk.config.l */
public class C4261l implements C4253i.C4255b {

    /* renamed from: a */
    public final /* synthetic */ IAConfigManager f10471a;

    public C4261l(IAConfigManager iAConfigManager) {
        this.f10471a = iAConfigManager;
    }

    public void onGlobalConfigChanged(C4253i iVar, C4252h hVar) {
        this.f10471a.f10331F.mo24172a();
        C4476c cVar = this.f10471a.f10332G;
        cVar.getClass();
        int i = 30;
        int a = IAConfigManager.f10324J.f10356v.f10459b.mo24271a("send_events_batch_interval", 30, -1);
        if (a >= 0) {
            i = a;
        }
        cVar.f11003f = true;
        cVar.f11002e = i;
        Handler handler = cVar.f11001d;
        if (handler != null && handler.hasMessages(12312329)) {
            cVar.f11001d.removeMessages(12312329);
        }
        cVar.mo24658a(12312329, (long) (cVar.f11002e * 1000));
    }
}
