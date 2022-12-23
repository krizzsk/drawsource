package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.config.global.C4251s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.flow.C4361j;
import com.fyber.inneractive.sdk.network.C4509p;
import com.fyber.inneractive.sdk.network.C4511q;
import com.fyber.inneractive.sdk.response.C5233e;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.util.a */
public class C5253a {

    /* renamed from: a */
    public InneractiveAdSpot f13939a;

    /* renamed from: b */
    public boolean f13940b = false;

    /* renamed from: c */
    public boolean f13941c;

    /* renamed from: d */
    public long f13942d = 0;

    /* renamed from: e */
    public long f13943e = 0;

    /* renamed from: f */
    public long f13944f = 0;

    /* renamed from: a */
    public void mo26362a(boolean z) {
        String str = "skip";
        if (!this.f13940b) {
            Object[] objArr = new Object[2];
            objArr[0] = "AdExperienceLatency: ";
            if (!z) {
                str = "close";
            }
            objArr[1] = str;
            IAlog.m16446a("%s%s timer started", objArr);
            this.f13942d = System.currentTimeMillis();
            this.f13940b = true;
            this.f13941c = z;
            return;
        }
        Object[] objArr2 = new Object[2];
        objArr2[0] = "AdExperienceLatency: ";
        if (!z) {
            str = "close";
        }
        objArr2[1] = str;
        IAlog.m16446a("%s%s timer could not start. Timer is in action!", objArr2);
    }

    /* renamed from: b */
    public void mo26363b() {
        if (this.f13940b && this.f13943e > 0) {
            this.f13944f += System.currentTimeMillis() - this.f13943e;
            this.f13943e = 0;
        }
    }

    /* renamed from: c */
    public void mo26364c() {
        C4251s sVar;
        if (this.f13940b) {
            String a = C5260c0.m16459a(this.f13942d, this.f13944f);
            InneractiveAdSpot inneractiveAdSpot = this.f13939a;
            C4361j adContent = inneractiveAdSpot != null ? inneractiveAdSpot.getAdContent() : null;
            C4509p pVar = this.f13941c ? C4509p.USER_SKIP_ACTION_LATENCY : C4509p.USER_CLOSE_ACTION_LATENCY;
            InneractiveAdRequest inneractiveAdRequest = adContent != null ? adContent.f10712a : null;
            C5233e c = adContent != null ? adContent.mo24293c() : null;
            JSONArray c2 = (adContent == null || (sVar = adContent.f10714c) == null) ? null : sVar.mo24268c();
            C4511q.C4512a aVar = new C4511q.C4512a(c);
            aVar.f11164c = pVar;
            aVar.f11162a = inneractiveAdRequest;
            aVar.f11165d = c2;
            Object[] objArr = new Object[2];
            objArr[0] = this.f13941c ? "skip_action_latency" : "close_action_latency";
            objArr[1] = a;
            aVar.mo24692a(objArr);
            aVar.mo24693a((String) null);
            mo26361a();
        }
    }

    /* renamed from: a */
    public void mo26361a() {
        this.f13942d = 0;
        this.f13943e = 0;
        this.f13944f = 0;
        this.f13940b = false;
    }
}
