package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.global.C4251s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.C4350e;
import com.fyber.inneractive.sdk.flow.C4365m;
import com.fyber.inneractive.sdk.network.C4507o;
import com.fyber.inneractive.sdk.network.C4511q;
import com.fyber.inneractive.sdk.response.C5233e;
import com.fyber.inneractive.sdk.util.C5312s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.flow.n */
public class C4369n implements C4350e.C4352b {

    /* renamed from: a */
    public final /* synthetic */ C4365m f10747a;

    public C4369n(C4365m mVar) {
        this.f10747a = mVar;
    }

    /* renamed from: a */
    public void mo24543a(InneractiveAdRequest inneractiveAdRequest, C5233e eVar, InneractiveInfrastructureError inneractiveInfrastructureError) {
        C4361j jVar;
        if (this.f10747a.f10732b != null) {
            if (inneractiveInfrastructureError.getErrorCode().shouldSendTimeMetric()) {
                this.f10747a.mo24536a(inneractiveAdRequest, eVar);
            }
            C4365m mVar = this.f10747a;
            if (mVar.f10740j) {
                if (eVar == null && inneractiveInfrastructureError.getErrorCode().getMetricable() == InneractiveErrorCode.Metricable.INCLUDED_IN_FAILED_METRICS && ((jVar = mVar.f10735e) == null || jVar.mo24299d() || mVar.f10735e.isVideoAd())) {
                    IAlog.m16446a("Firing Event 801 - AdLoadFailed - errorCode - %s", inneractiveInfrastructureError.getErrorCode());
                    String arrays = inneractiveInfrastructureError.getCause() != null ? Arrays.toString(inneractiveInfrastructureError.getCause().getStackTrace()) : C5312s.m16532a(7, 6);
                    C4507o oVar = C4507o.IA_AD_LOAD_FAILED;
                    JSONArray a = C4251s.m13277a(mVar.f10738h, mVar.f10735e);
                    C4511q.C4512a aVar = new C4511q.C4512a((C5233e) null);
                    aVar.f11163b = oVar;
                    aVar.f11162a = inneractiveAdRequest;
                    aVar.f11165d = a;
                    JSONObject jSONObject = new JSONObject();
                    String inneractiveErrorCode = inneractiveInfrastructureError.getErrorCode().toString();
                    try {
                        jSONObject.put("message", inneractiveErrorCode);
                    } catch (Exception unused) {
                        IAlog.m16450e("Got exception adding param to json object: %s, %s", "message", inneractiveErrorCode);
                    }
                    try {
                        jSONObject.put("description", arrays);
                    } catch (Exception unused2) {
                        IAlog.m16450e("Got exception adding param to json object: %s, %s", "description", arrays);
                    }
                    String description = inneractiveInfrastructureError.description();
                    try {
                        jSONObject.put("extra_description", description);
                    } catch (Exception unused3) {
                        IAlog.m16450e("Got exception adding param to json object: %s, %s", "extra_description", description);
                    }
                    aVar.f11167f.put(jSONObject);
                    aVar.mo24693a((String) null);
                }
                C4365m mVar2 = this.f10747a;
                mVar2.f10732b.onInneractiveFailedAdRequest(mVar2, inneractiveInfrastructureError.getErrorCode());
                return;
            }
            C4365m.C4368c cVar = mVar.f10739i;
            if (cVar != null) {
                cVar.onAdRefreshFailed(mVar, inneractiveInfrastructureError.getErrorCode());
            }
        }
    }
}
