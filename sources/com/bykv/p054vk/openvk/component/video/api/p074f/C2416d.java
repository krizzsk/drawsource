package com.bykv.p054vk.openvk.component.video.api.p074f;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.bykv.vk.openvk.component.video.api.f.d */
/* compiled from: WeakHandler */
public class C2416d extends Handler {

    /* renamed from: a */
    private final WeakReference<C2417a> f4923a;

    /* renamed from: com.bykv.vk.openvk.component.video.api.f.d$a */
    /* compiled from: WeakHandler */
    public interface C2417a {
        /* renamed from: a */
        void mo15868a(Message message);
    }

    public C2416d(Looper looper, C2417a aVar) {
        super(looper);
        this.f4923a = new WeakReference<>(aVar);
    }

    public void handleMessage(Message message) {
        C2417a aVar = (C2417a) this.f4923a.get();
        if (aVar != null && message != null) {
            aVar.mo15868a(message);
        }
    }
}
