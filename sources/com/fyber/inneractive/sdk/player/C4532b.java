package com.fyber.inneractive.sdk.player;

import com.fyber.inneractive.sdk.network.C4521u;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.b */
public class C4532b implements C4521u<String> {

    /* renamed from: a */
    public final /* synthetic */ String f11202a;

    /* renamed from: b */
    public final /* synthetic */ long f11203b;

    public C4532b(String str, long j) {
        this.f11202a = str;
        this.f11203b = j;
    }

    /* renamed from: a */
    public void mo24154a(Object obj, Exception exc, boolean z) {
        String str = (String) obj;
        IAlog.m16446a("Hit Request: Hitting URL finished: %s", this.f11202a);
        if (exc == null) {
            IAlog.m16446a("Hit Request: Hitting URL response code: %s", str);
        } else {
            IAlog.m16446a("Hit Request: Hitting URL failed: %s", exc);
        }
        IAlog.m16446a("Hit Request: Url hit took %s millis", Long.valueOf(System.currentTimeMillis() - this.f11203b));
    }
}
