package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.inmobi.media.au */
/* compiled from: UiRunnable */
abstract class C5769au<T> extends C5727ah<C5706af> {
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo34372a(T t);

    C5769au(C5706af afVar, byte b) {
        super(afVar, b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo34645b(final T t) {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public final void run() {
                C5769au.this.mo34372a(t);
            }
        });
    }
}
