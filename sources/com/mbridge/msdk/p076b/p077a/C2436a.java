package com.mbridge.msdk.p076b.p077a;

import com.mbridge.msdk.out.PreloadListener;
import java.lang.ref.WeakReference;

/* renamed from: com.mbridge.msdk.b.a.a */
/* compiled from: PreloadListenerEx */
public final class C2436a implements PreloadListener {

    /* renamed from: a */
    WeakReference<PreloadListener> f4946a;

    /* renamed from: b */
    private boolean f4947b = false;

    /* renamed from: c */
    private int f4948c = 0;

    /* renamed from: a */
    public final boolean mo16143a() {
        return this.f4947b;
    }

    /* renamed from: a */
    public final void mo16142a(boolean z) {
        this.f4947b = z;
    }

    public C2436a(PreloadListener preloadListener) {
        if (preloadListener != null) {
            this.f4946a = new WeakReference<>(preloadListener);
        }
    }

    public final void onPreloadSucceed() {
        WeakReference<PreloadListener> weakReference = this.f4946a;
        if (weakReference != null && weakReference.get() != null) {
            ((PreloadListener) this.f4946a.get()).onPreloadSucceed();
        }
    }

    public final void onPreloadFaild(String str) {
        WeakReference<PreloadListener> weakReference = this.f4946a;
        if (weakReference != null && weakReference.get() != null) {
            ((PreloadListener) this.f4946a.get()).onPreloadFaild(str);
        }
    }
}
