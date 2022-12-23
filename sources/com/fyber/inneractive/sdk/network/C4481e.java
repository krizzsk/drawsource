package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.network.e */
public class C4481e implements C4521u<String> {

    /* renamed from: a */
    public final /* synthetic */ String f11019a;

    /* renamed from: b */
    public final /* synthetic */ JSONArray f11020b;

    /* renamed from: c */
    public final /* synthetic */ long f11021c;

    public C4481e(C4476c cVar, String str, JSONArray jSONArray, long j) {
        this.f11019a = str;
        this.f11020b = jSONArray;
        this.f11021c = j;
    }

    /* renamed from: a */
    public void mo24154a(Object obj, Exception exc, boolean z) {
        String str = (String) obj;
        IAlog.m16446a("Event Request: Hitting URL finished: %s, body: %s", this.f11019a, this.f11020b);
        if (exc == null) {
            IAlog.m16446a("Event Request: Hitting URL response code: %s", str);
        } else {
            IAlog.m16446a("Event Request: Hitting URL failed: %s", exc);
        }
        IAlog.m16446a("Event Request: Url hit took %s millis", Long.valueOf(System.currentTimeMillis() - this.f11021c));
    }
}
