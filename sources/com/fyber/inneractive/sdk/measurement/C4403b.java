package com.fyber.inneractive.sdk.measurement;

import android.content.Context;
import com.adcolony.sdk.AdColonyAppOptions;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.C4516r;
import com.fyber.inneractive.sdk.response.C5233e;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.Omid;
import com.iab.omid.library.fyber.adsession.Partner;

/* renamed from: com.fyber.inneractive.sdk.measurement.b */
public class C4403b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f10800a;

    /* renamed from: b */
    public final /* synthetic */ C4405d f10801b;

    public C4403b(C4405d dVar, Context context) {
        this.f10801b = dVar;
        this.f10800a = context;
    }

    public void run() {
        try {
            Omid.activate(this.f10800a);
            this.f10801b.f10804c = Partner.createPartner(AdColonyAppOptions.FYBER, InneractiveAdManager.getVersion());
            C4405d.m13561a(this.f10801b, this.f10800a);
            IAlog.m16446a("OMID SDK was activated - version %s", Omid.getVersion());
        } catch (Throwable th) {
            IAlog.m16446a("Failed starting omsdk with exception %s", th.getLocalizedMessage());
            this.f10801b.getClass();
            C4516r.m13797a(th.getClass().getSimpleName(), String.format("%s - %s", new Object[]{"OpenMeasurementMeasurer", th.getMessage()}), (InneractiveAdRequest) null, (C5233e) null);
        }
    }
}
