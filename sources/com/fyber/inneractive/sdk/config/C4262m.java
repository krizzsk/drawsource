package com.fyber.inneractive.sdk.config;

import android.content.Context;
import com.fyber.inneractive.sdk.measurement.C4403b;
import com.fyber.inneractive.sdk.measurement.C4405d;
import com.fyber.inneractive.sdk.util.C5299n;

/* renamed from: com.fyber.inneractive.sdk.config.m */
public class C4262m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ IAConfigManager f10472a;

    /* renamed from: b */
    public final /* synthetic */ Context f10473b;

    /* renamed from: c */
    public final /* synthetic */ IAConfigManager f10474c;

    /* renamed from: com.fyber.inneractive.sdk.config.m$a */
    public class C4263a implements Runnable {
        public C4263a() {
        }

        public void run() {
            C4262m mVar = C4262m.this;
            IAConfigManager iAConfigManager = mVar.f10474c;
            C4405d dVar = new C4405d();
            iAConfigManager.f10334I = dVar;
            IAConfigManager iAConfigManager2 = mVar.f10472a;
            Context context = mVar.f10473b;
            if (!dVar.f10799a) {
                dVar.f10799a = true;
                C5299n.f14024b.post(new C4403b(dVar, context));
            }
        }
    }

    public C4262m(IAConfigManager iAConfigManager, IAConfigManager iAConfigManager2, Context context) {
        this.f10474c = iAConfigManager;
        this.f10472a = iAConfigManager2;
        this.f10473b = context;
    }

    public void run() {
        try {
            Class.forName("com.iab.omid.library.fyber.Omid");
            C5299n.f14024b.post(new C4263a());
        } catch (Throwable unused) {
        }
    }
}
