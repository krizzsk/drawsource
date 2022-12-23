package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.C4392y;
import com.fyber.inneractive.sdk.network.C4516r;
import com.fyber.inneractive.sdk.response.C5235g;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.VerificationScriptResource;
import com.iab.omid.library.fyber.adsession.media.MediaEvents;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.measurement.g */
public class C4408g {

    /* renamed from: a */
    public AdSession f10812a;

    /* renamed from: b */
    public AdEvents f10813b;

    /* renamed from: c */
    public MediaEvents f10814c;

    /* renamed from: d */
    public boolean f10815d = false;

    /* renamed from: e */
    public boolean f10816e = false;

    /* renamed from: f */
    public C4392y f10817f;

    /* renamed from: a */
    public final void mo24588a(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        String format = String.format("%s - %s", new Object[]{"OpenMeasurementNativeVideoTracker", th.getMessage()});
        C4392y yVar = this.f10817f;
        C5235g gVar = null;
        InneractiveAdRequest inneractiveAdRequest = yVar != null ? yVar.f10712a : null;
        if (yVar != null) {
            gVar = (C5235g) yVar.f10713b;
        }
        C4516r.m13797a(simpleName, format, inneractiveAdRequest, gVar);
    }

    /* renamed from: a */
    public final List<VerificationScriptResource> mo24587a(List<C4410i> list) {
        VerificationScriptResource verificationScriptResource;
        ArrayList arrayList = new ArrayList();
        for (C4410i next : list) {
            VerificationScriptResource verificationScriptResource2 = null;
            try {
                if (next.f10820a != null) {
                    if (TextUtils.isEmpty(next.f10824e) || TextUtils.isEmpty(next.f10823d)) {
                        verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(next.f10820a);
                    } else {
                        verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithParameters(next.f10824e, next.f10820a, next.f10823d);
                    }
                    verificationScriptResource2 = verificationScriptResource;
                }
            } catch (Throwable th) {
                mo24588a(th);
            }
            if (verificationScriptResource2 != null) {
                arrayList.add(verificationScriptResource2);
            }
        }
        return arrayList;
    }
}
