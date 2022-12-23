package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.sdk.component.utils.x */
/* compiled from: WeakHandler */
public class C2923x extends Handler {

    /* renamed from: a */
    private final WeakReference<C2924a> f6553a;

    /* renamed from: com.bytedance.sdk.component.utils.x$a */
    /* compiled from: WeakHandler */
    public interface C2924a {
        /* renamed from: a */
        void mo17240a(Message message);
    }

    public C2923x(C2924a aVar) {
        this.f6553a = new WeakReference<>(aVar);
    }

    public C2923x(Looper looper, C2924a aVar) {
        super(looper);
        this.f6553a = new WeakReference<>(aVar);
    }

    public void handleMessage(Message message) {
        C2924a aVar = (C2924a) this.f6553a.get();
        if (aVar != null && message != null) {
            aVar.mo17240a(message);
        }
    }
}
