package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.C4203a;
import com.fyber.inneractive.sdk.config.C4288z;
import com.fyber.inneractive.sdk.config.global.C4251s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveError;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.C4361j;
import com.fyber.inneractive.sdk.interfaces.C4394a;
import com.fyber.inneractive.sdk.metrics.C4415c;
import com.fyber.inneractive.sdk.network.C4507o;
import com.fyber.inneractive.sdk.network.C4511q;
import com.fyber.inneractive.sdk.network.C4516r;
import com.fyber.inneractive.sdk.response.C5233e;
import com.fyber.inneractive.sdk.util.C5299n;
import com.fyber.inneractive.sdk.util.C5312s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.flow.c */
public abstract class C4348c<Response extends C5233e, Content extends C4361j> implements C4394a {

    /* renamed from: a */
    public InneractiveAdRequest f10669a;

    /* renamed from: b */
    public Response f10670b;

    /* renamed from: c */
    public Content f10671c;

    /* renamed from: d */
    public C4394a.C4395a f10672d;

    /* renamed from: e */
    public C4288z f10673e;

    /* renamed from: f */
    public C4251s f10674f;

    /* renamed from: g */
    public boolean f10675g = false;

    /* renamed from: a */
    public void mo24491a() {
        this.f10669a = null;
        this.f10670b = null;
        this.f10671c = null;
        this.f10672d = null;
        this.f10673e = null;
    }

    /* renamed from: b */
    public abstract String mo24296b();

    /* renamed from: c */
    public C4288z mo24495c() {
        InneractiveAdRequest inneractiveAdRequest = this.f10669a;
        return inneractiveAdRequest == null ? this.f10673e : inneractiveAdRequest.getSelectedUnitConfig();
    }

    /* renamed from: d */
    public void mo24496d() {
        String str;
        InneractiveAdRequest inneractiveAdRequest = this.f10669a;
        if (inneractiveAdRequest != null) {
            C4415c.f10844c.mo24596a(inneractiveAdRequest.f10663b).mo24605i();
        } else {
            Response response = this.f10670b;
            if (!(response == null || (str = response.f13890z) == null)) {
                C4415c.f10844c.mo24596a(str).mo24605i();
            }
        }
        C4394a.C4395a aVar = this.f10672d;
        if (aVar != null) {
            aVar.mo24503a();
        }
    }

    /* renamed from: e */
    public abstract void mo24297e();

    /* renamed from: a */
    public void mo24492a(InneractiveAdRequest inneractiveAdRequest, C5233e eVar, C4251s sVar, C4394a.C4395a aVar) {
        this.f10669a = inneractiveAdRequest;
        this.f10670b = eVar;
        this.f10672d = aVar;
        this.f10674f = sVar;
        if (inneractiveAdRequest == null) {
            this.f10673e = C4203a.m13186b(eVar.f13877m);
        }
        try {
            mo24297e();
        } catch (Throwable th) {
            IAlog.m16450e("Failed to start ContentLoader", IAlog.m16443a((Object) this));
            C4516r.m13798a(th, inneractiveAdRequest, eVar);
            mo24494a(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR));
        }
    }

    /* renamed from: a */
    public void mo24493a(InneractiveError inneractiveError) {
        C5299n.m16520a(new C4345a(new C4347b(this.f10670b, this.f10669a, mo24296b(), this.f10674f.mo24268c()), inneractiveError));
    }

    /* renamed from: a */
    public void mo24494a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        Content content;
        String str;
        if (this.f10672d != null) {
            InneractiveAdRequest inneractiveAdRequest = this.f10669a;
            Response response = this.f10670b;
            if (inneractiveInfrastructureError.getErrorCode().getMetricable() == InneractiveErrorCode.Metricable.INCLUDED_IN_FAILED_METRICS && ((content = this.f10671c) == null || content.mo24299d() || this.f10671c.isVideoAd())) {
                IAlog.m16446a("Firing Event 801 - AdLoadFailed - errorCode - %s", inneractiveInfrastructureError.getErrorCode());
                if (inneractiveInfrastructureError.getCause() != null) {
                    str = Arrays.toString(inneractiveInfrastructureError.getCause().getStackTrace());
                } else {
                    str = C5312s.m16532a(7, 6);
                }
                C4251s sVar = this.f10674f;
                JSONArray c = sVar == null ? null : sVar.mo24268c();
                C4507o oVar = C4507o.IA_AD_LOAD_FAILED;
                C4511q.C4512a aVar = new C4511q.C4512a(response);
                aVar.f11163b = oVar;
                aVar.f11162a = inneractiveAdRequest;
                aVar.f11165d = c;
                JSONObject jSONObject = new JSONObject();
                String inneractiveErrorCode = inneractiveInfrastructureError.getErrorCode().toString();
                try {
                    jSONObject.put("message", inneractiveErrorCode);
                } catch (Exception unused) {
                    IAlog.m16450e("Got exception adding param to json object: %s, %s", "message", inneractiveErrorCode);
                }
                try {
                    jSONObject.put("description", str);
                } catch (Exception unused2) {
                    IAlog.m16450e("Got exception adding param to json object: %s, %s", "description", str);
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
            this.f10672d.mo24505a(inneractiveInfrastructureError);
        }
    }
}
