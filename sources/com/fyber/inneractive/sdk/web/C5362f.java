package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.content.IntentFilter;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C5349d;

/* renamed from: com.fyber.inneractive.sdk.web.f */
public class C5362f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C5349d f14167a;

    public C5362f(C5349d dVar) {
        this.f14167a = dVar;
    }

    public void run() {
        C5349d dVar = this.f14167a;
        if (dVar.f14125G == null) {
            try {
                IAlog.m16446a("%sregistering orientation broadcast receiver", IAlog.m16443a((Object) dVar));
                this.f14167a.f14125G = new C5349d.C5358i();
                if (this.f14167a.mo26479g() != null) {
                    C5349d dVar2 = this.f14167a;
                    C5349d<T>.i iVar = dVar2.f14125G;
                    Context g = dVar2.mo26479g();
                    C5349d dVar3 = C5349d.this;
                    dVar3.getClass();
                    IAlog.m16446a("%sregister screen broadcast receiver", IAlog.m16443a((Object) dVar3));
                    iVar.f14161a = g;
                    g.registerReceiver(iVar, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
                }
            } catch (Exception e) {
                C5349d dVar4 = this.f14167a;
                dVar4.getClass();
                IAlog.m16450e("%sfailed registering orientation broadcast recevier", IAlog.m16443a((Object) dVar4));
                if (IAlog.f13936a >= 3) {
                    e.printStackTrace();
                }
            }
        }
    }
}
