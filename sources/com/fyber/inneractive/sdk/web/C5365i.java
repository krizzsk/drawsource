package com.fyber.inneractive.sdk.web;

import android.widget.Toast;
import com.fyber.inneractive.sdk.util.C5292l;

/* renamed from: com.fyber.inneractive.sdk.web.i */
public class C5365i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f14170a;

    public C5365i(C5349d dVar, String str) {
        this.f14170a = str;
    }

    public void run() {
        Toast.makeText(C5292l.f14015a, this.f14170a, 0).show();
    }
}
