package com.inmobi.media;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: com.inmobi.media.fh */
/* compiled from: NativeRootContainerLayout */
public final class C6030fh extends C6008fc {

    /* renamed from: a */
    private WeakReference<C6281n> f15290a;

    public C6030fh(Context context) {
        super(context);
    }

    public final void setNativeStrandAd(C6281n nVar) {
        this.f15290a = new WeakReference<>(nVar);
    }

    public final C6281n getNativeStrandAd() {
        return (C6281n) this.f15290a.get();
    }
}
