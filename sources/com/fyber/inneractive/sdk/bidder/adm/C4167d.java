package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.bidder.adm.C4168e;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.flow.C4365m;
import com.fyber.inneractive.sdk.response.C5233e;

/* renamed from: com.fyber.inneractive.sdk.bidder.adm.d */
public class C4167d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C4168e.C4169a f10231a;

    public C4167d(C4168e eVar, C4168e.C4169a aVar) {
        this.f10231a = aVar;
    }

    public void run() {
        C4168e.C4169a aVar = this.f10231a;
        if (aVar != null) {
            ((C4365m.C4366a) aVar).mo24541a(new Exception("adm payload must contain ad url"), InneractiveErrorCode.INVALID_INPUT, new C5233e[0]);
        }
    }
}
