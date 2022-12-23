package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters;
import com.fyber.inneractive.sdk.bidder.adm.C4168e;
import com.fyber.inneractive.sdk.p188dv.C4306g;
import com.fyber.inneractive.sdk.response.C5233e;
import com.fyber.inneractive.sdk.util.C5312s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.network.k0 */
public class C4497k0 extends C4482e0<C5233e> {

    /* renamed from: g */
    public final String f11053g;

    /* renamed from: h */
    public final C4168e f11054h;

    public C4497k0(C4521u<C5233e> uVar, String str, C4168e eVar) {
        super(uVar, C4522v.m13803b().mo24698a());
        this.f11053g = str;
        this.f11054h = eVar;
    }

    /* renamed from: a */
    public String mo24640a() {
        return this.f11053g;
    }

    /* renamed from: f */
    public C4499l0 mo24647f() {
        return C4499l0.HIGH;
    }

    /* renamed from: j */
    public boolean mo24651j() {
        return false;
    }

    /* renamed from: n */
    public C4528y mo24655n() {
        return C4528y.f11197d;
    }

    /* renamed from: p */
    public int mo24656p() {
        return 0;
    }

    /* renamed from: a */
    public C4472a0 mo24638a(InputStream inputStream, Map<String, List<String>> map, int i) throws Exception {
        int i2;
        C4472a0 a0Var = new C4472a0();
        if (inputStream != null) {
            try {
                String stringBuffer = C5312s.m16535a(inputStream, false).toString();
                AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = this.f11054h.f10232a;
                if (admParametersOuterClass$AdmParameters != null) {
                    i2 = admParametersOuterClass$AdmParameters.getAdType().mo24014a();
                } else {
                    i2 = AdmParametersOuterClass$AdmParameters.C4157a.UNRECOGNIZED.mo24014a();
                }
                C4168e eVar = this.f11054h;
                eVar.f10234c = stringBuffer;
                T a = mo24671a(i2, (C4500m) null, eVar, (C4306g) null);
                a.f13872h = stringBuffer;
                a0Var.f10996a = a;
            } catch (Exception e) {
                IAlog.m16445a("failed parse adm network request", e, new Object[0]);
                throw new C4529z(e);
            }
        }
        return a0Var;
    }
}
