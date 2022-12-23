package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.mraid.C4450f;
import com.fyber.inneractive.sdk.util.C5299n;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C5349d;

/* renamed from: com.fyber.inneractive.sdk.web.j */
public class C5366j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C5349d.C5352c f14171a;

    public C5366j(C5349d.C5352c cVar) {
        this.f14171a = cVar;
    }

    public void run() {
        C5349d dVar = C5349d.this;
        dVar.getClass();
        C5299n.f14024b.post(new C5365i(dVar, "Image failed to download."));
        C5349d.this.mo26470a(C4450f.STORE_PICTURE, "Error downloading and saving image file.");
        IAlog.m16446a("failed to download and save the image file.", new Object[0]);
    }
}
