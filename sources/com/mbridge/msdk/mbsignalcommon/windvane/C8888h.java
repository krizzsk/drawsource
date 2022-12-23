package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;

/* renamed from: com.mbridge.msdk.mbsignalcommon.windvane.h */
/* compiled from: WindVanePlugin */
public abstract class C8888h {
    /* access modifiers changed from: protected */

    /* renamed from: a */
    public Context f21907a;

    /* renamed from: b */
    protected Object f21908b;

    /* renamed from: c */
    protected WindVaneWebView f21909c;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        this.f21907a = context;
        this.f21909c = windVaneWebView;
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        this.f21908b = obj;
        this.f21909c = windVaneWebView;
    }
}
