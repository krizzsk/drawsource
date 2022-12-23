package com.fyber.inneractive.sdk.bidder.adm;

import android.util.Base64;
import com.fyber.inneractive.sdk.bidder.adm.C4168e;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.flow.C4365m;
import com.fyber.inneractive.sdk.response.C5233e;
import com.fyber.inneractive.sdk.util.C5299n;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.bidder.adm.a */
public class C4163a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C4168e.C4169a f10224a;

    /* renamed from: b */
    public final /* synthetic */ C4168e f10225b;

    /* renamed from: com.fyber.inneractive.sdk.bidder.adm.a$a */
    public class C4164a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Exception f10226a;

        public C4164a(Exception exc) {
            this.f10226a = exc;
        }

        public void run() {
            C4168e.C4169a aVar = C4163a.this.f10224a;
            if (aVar != null) {
                ((C4365m.C4366a) aVar).mo24541a(this.f10226a, InneractiveErrorCode.INVALID_INPUT, new C5233e[0]);
            }
        }
    }

    public C4163a(C4168e eVar, C4168e.C4169a aVar) {
        this.f10225b = eVar;
        this.f10224a = aVar;
    }

    public void run() {
        try {
            byte[] decode = Base64.decode(this.f10225b.f10233b, 0);
            this.f10225b.f10232a = AdmParametersOuterClass$AdmParameters.parseFrom(decode);
            C4168e.m13130a(this.f10225b, this.f10224a);
        } catch (Exception e) {
            IAlog.m16450e("failed to parse ad markup payload %s", e.getMessage());
            C5299n.f14024b.post(new C4164a(e));
        }
    }
}
