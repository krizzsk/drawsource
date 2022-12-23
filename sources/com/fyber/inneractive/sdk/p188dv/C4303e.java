package com.fyber.inneractive.sdk.p188dv;

import com.fyber.inneractive.sdk.config.C4287y;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.p188dv.enums.C4304a;
import com.fyber.inneractive.sdk.p188dv.handler.C4310c;
import com.fyber.inneractive.sdk.response.C5230b;
import com.fyber.inneractive.sdk.response.C5233e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.dv.e */
public class C4303e extends C5230b {
    /* renamed from: a */
    public void mo24320a(String str, C4287y yVar) {
        try {
            ((C4305f) this.f13854a).f10567B = new JSONObject(str).getString("adm");
        } catch (JSONException e) {
            C4310c.m13358a(yVar != null ? yVar.f10545b : null, C4304a.Parse, (InneractiveAdRequest) null, (C5233e) null, e.getLocalizedMessage());
        }
    }

    /* renamed from: b */
    public boolean mo24321b() {
        return true;
    }

    /* renamed from: a */
    public C5233e mo24319a() {
        return new C4305f();
    }
}
