package com.bytedance.sdk.openadsdk.multipro.aidl.p181b;

import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.TTAppOpenAd;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.b.a */
/* compiled from: AppOpenAdListenerImpl */
public class C3926a extends IAppOpenAdInteractionListener.Stub {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public TTAppOpenAd.AppOpenAdInteractionListener f10020a;

    /* renamed from: b */
    private Handler f10021b = new Handler(Looper.getMainLooper());

    public C3926a(TTAppOpenAd.AppOpenAdInteractionListener appOpenAdInteractionListener) {
        this.f10020a = appOpenAdInteractionListener;
    }

    /* renamed from: a */
    private void m12946a() {
        this.f10020a = null;
        this.f10021b = null;
    }

    /* renamed from: b */
    private Handler m12947b() {
        Handler handler = this.f10021b;
        if (handler != null) {
            return handler;
        }
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.f10021b = handler2;
        return handler2;
    }

    public void onDestroy() throws RemoteException {
        m12946a();
    }

    public void onAdShow() throws RemoteException {
        m12947b().post(new Runnable() {
            public void run() {
                if (C3926a.this.f10020a != null) {
                    C3926a.this.f10020a.onAdShow();
                }
            }
        });
    }

    public void onAdClicked() throws RemoteException {
        m12947b().post(new Runnable() {
            public void run() {
                if (C3926a.this.f10020a != null) {
                    C3926a.this.f10020a.onAdClicked();
                }
            }
        });
    }

    public void onAdSkip() throws RemoteException {
        m12947b().post(new Runnable() {
            public void run() {
                if (C3926a.this.f10020a != null) {
                    C3926a.this.f10020a.onAdSkip();
                }
            }
        });
    }

    public void onAdTimeOver() throws RemoteException {
        m12947b().post(new Runnable() {
            public void run() {
                if (C3926a.this.f10020a != null) {
                    C3926a.this.f10020a.onAdCountdownToZero();
                }
            }
        });
    }
}
