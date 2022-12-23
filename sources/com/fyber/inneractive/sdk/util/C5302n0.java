package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.fyber.inneractive.sdk.util.n0 */
public class C5302n0 extends Handler {

    /* renamed from: a */
    public final WeakReference<C5304o0> f14026a;

    public C5302n0(Looper looper, C5304o0 o0Var) {
        super(looper);
        this.f14026a = new WeakReference<>(o0Var);
    }

    public void handleMessage(Message message) {
        super.handleMessage(message);
        C5304o0 o0Var = (C5304o0) C5312s.m16531a(this.f14026a);
        if (o0Var != null) {
            o0Var.handleMessage(message);
        }
    }
}
