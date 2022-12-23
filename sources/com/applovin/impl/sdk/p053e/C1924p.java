package com.applovin.impl.sdk.p053e;

import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p049ad.C1835b;
import com.applovin.impl.sdk.p049ad.C1838d;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.p */
public class C1924p extends C1887a implements AppLovinAdLoadListener {

    /* renamed from: a */
    private final JSONObject f3579a;

    /* renamed from: c */
    private final C1838d f3580c;

    /* renamed from: d */
    private final C1835b f3581d;

    /* renamed from: e */
    private final AppLovinAdLoadListener f3582e;

    public C1924p(JSONObject jSONObject, C1838d dVar, C1835b bVar, AppLovinAdLoadListener appLovinAdLoadListener, C1969m mVar) {
        super("TaskProcessAdResponse", mVar);
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        } else if (dVar != null) {
            this.f3579a = jSONObject;
            this.f3580c = dVar;
            this.f3581d = bVar;
            this.f3582e = appLovinAdLoadListener;
        } else {
            throw new IllegalArgumentException("No zone specified");
        }
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [com.applovin.impl.sdk.e.a] */
    /* JADX WARNING: type inference failed for: r1v11, types: [com.applovin.impl.sdk.e.q] */
    /* JADX WARNING: type inference failed for: r1v12, types: [com.applovin.impl.sdk.e.s] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4321a(org.json.JSONObject r8) {
        /*
            r7 = this;
            java.lang.String r0 = "type"
            java.lang.String r1 = "undefined"
            java.lang.String r0 = com.applovin.impl.sdk.utils.JsonUtils.getString(r8, r0, r1)
            java.lang.String r1 = "applovin"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L_0x0033
            boolean r0 = com.applovin.impl.sdk.C2102v.m5104a()
            if (r0 == 0) goto L_0x001b
            java.lang.String r0 = "Starting task for AppLovin ad..."
            r7.mo14365a(r0)
        L_0x001b:
            com.applovin.impl.sdk.e.s r0 = new com.applovin.impl.sdk.e.s
            org.json.JSONObject r3 = r7.f3579a
            com.applovin.impl.sdk.ad.b r4 = r7.f3581d
            com.applovin.impl.sdk.m r6 = r7.f3496b
            r1 = r0
            r2 = r8
            r5 = r7
            r1.<init>(r2, r3, r4, r5, r6)
        L_0x0029:
            com.applovin.impl.sdk.m r8 = r7.f3496b
            com.applovin.impl.sdk.e.o r8 = r8.mo14526S()
            r8.mo14428a((com.applovin.impl.sdk.p053e.C1887a) r0)
            goto L_0x009b
        L_0x0033:
            java.lang.String r1 = "vast"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L_0x005a
            boolean r0 = com.applovin.impl.sdk.C2102v.m5104a()
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = "Starting task for VAST ad..."
            r7.mo14365a(r0)
        L_0x0046:
            org.json.JSONObject r0 = r7.f3579a
            com.applovin.impl.sdk.ad.b r1 = r7.f3581d
            com.applovin.impl.sdk.m r2 = r7.f3496b
            com.applovin.impl.sdk.e.r r8 = com.applovin.impl.sdk.p053e.C1928r.m4332a(r8, r0, r1, r7, r2)
            com.applovin.impl.sdk.m r0 = r7.f3496b
            com.applovin.impl.sdk.e.o r0 = r0.mo14526S()
            r0.mo14428a((com.applovin.impl.sdk.p053e.C1887a) r8)
            goto L_0x009b
        L_0x005a:
            java.lang.String r1 = "js_tag"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L_0x007c
            boolean r0 = com.applovin.impl.sdk.C2102v.m5104a()
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = "Starting task for JS tag ad..."
            r7.mo14365a(r0)
        L_0x006d:
            com.applovin.impl.sdk.e.q r0 = new com.applovin.impl.sdk.e.q
            org.json.JSONObject r3 = r7.f3579a
            com.applovin.impl.sdk.ad.b r4 = r7.f3581d
            com.applovin.impl.sdk.m r6 = r7.f3496b
            r1 = r0
            r2 = r8
            r5 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0029
        L_0x007c:
            boolean r8 = com.applovin.impl.sdk.C2102v.m5104a()
            if (r8 == 0) goto L_0x0096
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "Unable to process ad of unknown type: "
            r8.append(r1)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r7.mo14368c(r8)
        L_0x0096:
            r8 = -800(0xfffffffffffffce0, float:NaN)
            r7.failedToReceiveAd(r8)
        L_0x009b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.p053e.C1924p.m4321a(org.json.JSONObject):void");
    }

    public void adReceived(AppLovinAd appLovinAd) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f3582e;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(appLovinAd);
        }
    }

    public void failedToReceiveAd(int i) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f3582e;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.failedToReceiveAd(i);
        }
    }

    public void run() {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f3579a, CampaignUnit.JSON_KEY_ADS, new JSONArray());
        if (jSONArray.length() > 0) {
            if (C2102v.m5104a()) {
                mo14365a("Processing ad...");
            }
            m4321a(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()));
            return;
        }
        if (C2102v.m5104a()) {
            mo14368c("No ads were returned from the server");
        }
        Utils.maybeHandleNoFillResponseForPublisher(this.f3580c.mo14154a(), this.f3580c.mo14155b(), this.f3579a, this.f3496b);
        failedToReceiveAd(204);
    }
}
