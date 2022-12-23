package com.fyber.inneractive.sdk;

import android.app.Activity;
import com.fyber.inneractive.sdk.config.C4288z;
import com.fyber.inneractive.sdk.config.global.C4251s;
import com.fyber.inneractive.sdk.network.C4509p;
import com.fyber.inneractive.sdk.network.C4511q;
import com.fyber.inneractive.sdk.p188dv.C4292a;
import com.fyber.inneractive.sdk.p188dv.C4305f;
import com.fyber.inneractive.sdk.p188dv.interstitial.C4313a;
import com.fyber.inneractive.sdk.response.C5233e;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.a */
public abstract class C4112a<T> extends C4292a<T> {

    /* renamed from: j */
    public C4313a f10116j = null;

    public C4112a(C4288z zVar, C4251s sVar, C4305f fVar) {
        super(zVar, sVar, fVar);
    }

    /* renamed from: a */
    public abstract void mo23757a(C4313a aVar, Activity activity);

    /* renamed from: f */
    public void mo23758f() {
        try {
            new C4511q.C4512a(C4509p.EVENT_READY_ON_CLIENT, this.f10712a, (C5233e) (C4305f) this.f10713b, (JSONArray) null).mo24693a((String) null);
        } catch (Exception unused) {
        }
    }
}
