package com.fyber.inneractive.sdk.measurement;

import android.webkit.WebView;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.C4361j;
import com.fyber.inneractive.sdk.measurement.C4401a;
import com.fyber.inneractive.sdk.network.C4516r;
import com.fyber.inneractive.sdk.response.C5233e;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.Partner;

/* renamed from: com.fyber.inneractive.sdk.measurement.f */
public class C4407f implements C4401a.C4402a {

    /* renamed from: a */
    public final Partner f10806a;

    /* renamed from: b */
    public AdSession f10807b;

    /* renamed from: c */
    public AdEvents f10808c;

    /* renamed from: d */
    public boolean f10809d = false;

    /* renamed from: e */
    public WebView f10810e;

    /* renamed from: f */
    public C4361j f10811f;

    public C4407f(Partner partner, WebView webView, C4361j jVar) {
        this.f10806a = partner;
        this.f10810e = webView;
        this.f10811f = jVar;
    }

    /* renamed from: a */
    public final void mo24586a(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        String format = String.format("%s - %s", new Object[]{"OpenMeasurementMraidTracker", th.getMessage()});
        C4361j jVar = this.f10811f;
        C5233e eVar = null;
        InneractiveAdRequest inneractiveAdRequest = jVar != null ? jVar.f10712a : null;
        if (jVar != null) {
            eVar = jVar.mo24293c();
        }
        C4516r.m13797a(simpleName, format, inneractiveAdRequest, eVar);
    }
}
