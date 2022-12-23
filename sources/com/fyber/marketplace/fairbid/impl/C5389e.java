package com.fyber.marketplace.fairbid.impl;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.C4361j;
import com.fyber.inneractive.sdk.flow.C4365m;
import com.fyber.inneractive.sdk.flow.C4371p;
import com.fyber.inneractive.sdk.flow.C4380v;
import com.fyber.inneractive.sdk.network.C4507o;
import com.fyber.inneractive.sdk.network.C4511q;
import com.fyber.inneractive.sdk.response.C5233e;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.marketplace.fairbid.impl.e */
public class C5389e implements C4371p, C4380v {

    /* renamed from: a */
    public InneractiveUnitController<?> f14243a;

    /* renamed from: b */
    public C4361j f14244b;

    /* renamed from: c */
    public final String f14245c;

    /* renamed from: d */
    public boolean f14246d = false;

    public C5389e(InneractiveUnitController<?> inneractiveUnitController, C4361j jVar) {
        this.f14243a = inneractiveUnitController;
        this.f14244b = jVar;
        this.f14245c = UUID.randomUUID().toString();
    }

    /* renamed from: a */
    public void mo24535a() {
        C4361j jVar = this.f14244b;
        if (jVar != null) {
            jVar.mo24291a();
        }
        this.f14244b = null;
        this.f14243a = null;
        InneractiveAdSpotManager.get().removeSpot(this);
    }

    /* renamed from: a */
    public void mo24537a(C4365m.C4368c cVar) {
    }

    public void addUnitController(InneractiveUnitController inneractiveUnitController) {
    }

    public void destroy() {
        InneractiveUnitController<?> inneractiveUnitController = this.f14243a;
        if (inneractiveUnitController != null) {
            inneractiveUnitController.destroy();
        }
        mo24535a();
    }

    public C4361j getAdContent() {
        return this.f14244b;
    }

    public InneractiveAdRequest getCurrentProcessedRequest() {
        return null;
    }

    public String getLocalUniqueId() {
        return this.f14245c;
    }

    public InneractiveMediationName getMediationName() {
        return null;
    }

    public String getMediationNameString() {
        return null;
    }

    public String getMediationVersion() {
        return "";
    }

    public String getRequestedSpotId() {
        return "";
    }

    public InneractiveUnitController getSelectedUnitController() {
        return this.f14243a;
    }

    public boolean isReady() {
        C4361j jVar = this.f14244b;
        if (jVar == null) {
            return false;
        }
        boolean z = jVar.mo24293c() != null && this.f14244b.mo24293c().mo26316d();
        if (z) {
            C4361j jVar2 = this.f14244b;
            C5233e c = jVar2.mo24293c();
            if (!this.f14246d && c != null && c.f13867c != 0 && c.mo26316d()) {
                long minutes = TimeUnit.MILLISECONDS.toMinutes(c.f13865a - System.currentTimeMillis());
                long j = c.f13866b;
                IAlog.m16446a(String.format("Firing Event 802 - AdExpired - time passed- %s, sessionTimeOut - %s", new Object[]{Long.valueOf(minutes), Long.valueOf(j)}), new Object[0]);
                C4507o oVar = C4507o.IA_AD_EXPIRED;
                InneractiveAdRequest inneractiveAdRequest = jVar2.f10712a;
                JSONArray c2 = jVar2.f10714c.mo24268c();
                C4511q.C4512a aVar = new C4511q.C4512a(c);
                aVar.f11163b = oVar;
                aVar.f11162a = inneractiveAdRequest;
                aVar.f11165d = c2;
                JSONObject jSONObject = new JSONObject();
                Long valueOf = Long.valueOf(minutes);
                try {
                    jSONObject.put("time_passed", valueOf);
                } catch (Exception unused) {
                    IAlog.m16450e("Got exception adding param to json object: %s, %s", "time_passed", valueOf);
                }
                Long valueOf2 = Long.valueOf(j);
                try {
                    jSONObject.put("timeout", valueOf2);
                } catch (Exception unused2) {
                    IAlog.m16450e("Got exception adding param to json object: %s, %s", "timeout", valueOf2);
                }
                aVar.f11167f.put(jSONObject);
                aVar.mo24693a((String) null);
                this.f14246d = true;
            }
        }
        return !z;
    }

    public void loadAd(String str) {
    }

    public void removeUnitController(InneractiveUnitController inneractiveUnitController) {
    }

    public void requestAd(InneractiveAdRequest inneractiveAdRequest) {
    }

    public void setMediationName(InneractiveMediationName inneractiveMediationName) {
    }

    public void setMediationName(String str) {
    }

    public void setMediationVersion(String str) {
    }

    public void setRequestListener(InneractiveAdSpot.RequestListener requestListener) {
    }
}
