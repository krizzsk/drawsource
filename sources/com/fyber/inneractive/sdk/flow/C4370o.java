package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.global.C4251s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.C4507o;
import com.fyber.inneractive.sdk.network.C4511q;
import com.fyber.inneractive.sdk.response.C5233e;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.flow.o */
public class C4370o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f10748a;

    /* renamed from: b */
    public final /* synthetic */ InneractiveAdRequest f10749b;

    /* renamed from: c */
    public final /* synthetic */ C5233e f10750c;

    /* renamed from: d */
    public final /* synthetic */ C4365m f10751d;

    public C4370o(C4365m mVar, String str, InneractiveAdRequest inneractiveAdRequest, C5233e eVar) {
        this.f10751d = mVar;
        this.f10748a = str;
        this.f10749b = inneractiveAdRequest;
        this.f10750c = eVar;
    }

    public void run() {
        IAlog.m16446a("Firing Event 803 - Stack trace - %s", this.f10748a);
        C4507o oVar = C4507o.IA_AD_DESTROYED_WITHOUT_SHOW;
        InneractiveAdRequest inneractiveAdRequest = this.f10749b;
        C5233e eVar = this.f10750c;
        C4365m mVar = this.f10751d;
        JSONArray a = C4251s.m13277a(mVar.f10738h, mVar.f10735e);
        C4511q.C4512a aVar = new C4511q.C4512a(eVar);
        aVar.f11163b = oVar;
        aVar.f11162a = inneractiveAdRequest;
        aVar.f11165d = a;
        JSONObject jSONObject = new JSONObject();
        String str = this.f10748a;
        try {
            jSONObject.put("stack_trace", str);
        } catch (Exception unused) {
            IAlog.m16450e("Got exception adding param to json object: %s, %s", "stack_trace", str);
        }
        aVar.f11167f.put(jSONObject);
        aVar.mo24693a((String) null);
    }
}
