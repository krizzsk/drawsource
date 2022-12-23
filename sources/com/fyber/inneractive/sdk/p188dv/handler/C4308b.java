package com.fyber.inneractive.sdk.p188dv.handler;

import android.os.Bundle;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.C4507o;
import com.fyber.inneractive.sdk.network.C4511q;
import com.fyber.inneractive.sdk.response.C5233e;
import com.fyber.inneractive.sdk.util.C5292l;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.dv.handler.b */
public class C4308b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AdFormat f10569a;

    /* renamed from: b */
    public final /* synthetic */ C4310c f10570b;

    /* renamed from: com.fyber.inneractive.sdk.dv.handler.b$a */
    public class C4309a extends QueryInfoGenerationCallback {
        public C4309a() {
        }

        public void onFailure(String str) {
            String str2;
            C4308b bVar = C4308b.this;
            C4310c cVar = bVar.f10570b;
            if (!cVar.f10573b) {
                AdFormat adFormat = bVar.f10569a;
                cVar.getClass();
                IAlog.m16446a(String.format("Firing Event 1000 - Fetch error DV - msg  %s", new Object[]{str}), new Object[0]);
                C4511q.C4512a aVar = new C4511q.C4512a(C4507o.FETCH_TOKEN_DV_ERROR, (InneractiveAdRequest) null, (C5233e) null, (JSONArray) null);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("message", str);
                } catch (Exception unused) {
                    IAlog.m16450e("Got exception adding param to json object: %s, %s", "message", str);
                }
                try {
                    str2 = MobileAds.getVersionString();
                } catch (Exception unused2) {
                    str2 = "na";
                }
                try {
                    jSONObject.put("version", str2);
                } catch (Exception unused3) {
                    IAlog.m16450e("Got exception adding param to json object: %s, %s", "version", str2);
                }
                String name = adFormat.name();
                try {
                    jSONObject.put("adFormat", name);
                } catch (Exception unused4) {
                    IAlog.m16450e("Got exception adding param to json object: %s, %s", "adFormat", name);
                }
                Integer valueOf = Integer.valueOf(cVar.f10575d);
                try {
                    jSONObject.put("success_count", valueOf);
                } catch (Exception unused5) {
                    IAlog.m16450e("Got exception adding param to json object: %s, %s", "success_count", valueOf);
                }
                aVar.f11167f.put(jSONObject);
                aVar.mo24693a((String) null);
                boolean unused6 = C4308b.this.f10570b.f10573b = true;
            }
        }

        public void onSuccess(QueryInfo queryInfo) {
            IAlog.m16446a("DVHanlder - %s - put query: %s", C4308b.this.f10569a.toString(), queryInfo.getQuery());
            synchronized (C4308b.this.f10570b.f10574c) {
                C4308b bVar = C4308b.this;
                C4310c cVar = bVar.f10570b;
                cVar.f10575d++;
                cVar.f10572a.put(bVar.f10569a, queryInfo);
            }
        }
    }

    public C4308b(C4310c cVar, AdFormat adFormat) {
        this.f10570b = cVar;
        this.f10569a = adFormat;
    }

    public void run() {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_3");
            QueryInfo.generate(C5292l.f14015a, this.f10569a, new AdRequest.Builder().setRequestAgent(String.format("FyberMarketplace-v%s", new Object[]{"8.1.5"})).addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), new C4309a());
        } catch (Throwable unused) {
        }
    }
}
