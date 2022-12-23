package com.bytedance.sdk.component.p118e.p122d;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.sdk.component.e.d.g */
/* compiled from: WeakHandler */
public class C2872g extends Handler {

    /* renamed from: a */
    private final WeakReference<C2873a> f6456a;

    /* renamed from: com.bytedance.sdk.component.e.d.g$a */
    /* compiled from: WeakHandler */
    public interface C2873a {
        /* renamed from: a */
        void mo17723a(Message message);
    }

    public C2872g(Looper looper, C2873a aVar) {
        super(looper);
        this.f6456a = new WeakReference<>(aVar);
    }

    public void handleMessage(Message message) {
        C2873a aVar = (C2873a) this.f6456a.get();
        if (aVar != null && message != null) {
            aVar.mo17723a(message);
        }
    }
}
