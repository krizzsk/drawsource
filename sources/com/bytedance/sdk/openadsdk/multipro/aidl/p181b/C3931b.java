package com.bytedance.sdk.openadsdk.multipro.aidl.p181b;

import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IDislikeClosedListener;
import com.bytedance.sdk.openadsdk.core.bannerexpress.C3378a;
import com.bytedance.sdk.openadsdk.dislike.TTDislikeListView;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.b.b */
/* compiled from: DislikeClosedListenerImpl */
public class C3931b extends IDislikeClosedListener.Stub {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C3378a.C3385a f10026a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f10027b;

    /* renamed from: c */
    private Handler f10028c = new Handler(Looper.getMainLooper());

    public C3931b(String str, C3378a.C3385a aVar) {
        this.f10027b = str;
        this.f10026a = aVar;
    }

    /* renamed from: a */
    private Handler m12948a() {
        Handler handler = this.f10028c;
        if (handler != null) {
            return handler;
        }
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.f10028c = handler2;
        return handler2;
    }

    public void onItemClickClosed() throws RemoteException {
        m12948a().post(new Runnable() {
            public void run() {
                if (C3931b.this.f10026a != null) {
                    C3931b.this.f10026a.mo19360a();
                    TTDislikeListView.m12147a(6, C3931b.this.f10027b);
                }
            }
        });
    }
}
