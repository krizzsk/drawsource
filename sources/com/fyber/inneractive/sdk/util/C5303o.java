package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.network.C4521u;

/* renamed from: com.fyber.inneractive.sdk.util.o */
public class C5303o implements C4521u<String> {

    /* renamed from: a */
    public final /* synthetic */ String f14027a;

    /* renamed from: b */
    public final /* synthetic */ long f14028b;

    public C5303o(String str, long j) {
        this.f14027a = str;
        this.f14028b = j;
    }

    /* renamed from: a */
    public void mo24154a(Object obj, Exception exc, boolean z) {
        String str = (String) obj;
        IAlog.m16446a("Hit Request: Hitting URL finished: %s", this.f14027a);
        if (exc == null) {
            IAlog.m16446a("Hit Request: Hitting URL response code: %s", str);
        } else {
            IAlog.m16446a("Hit Request: Hitting URL failed: %s", exc);
        }
        IAlog.m16446a("Hit Request: Url hit took %s millis", Long.valueOf(System.currentTimeMillis() - this.f14028b));
    }
}
