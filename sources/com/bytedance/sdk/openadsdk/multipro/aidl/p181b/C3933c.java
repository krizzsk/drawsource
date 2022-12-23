package com.bytedance.sdk.openadsdk.multipro.aidl.p181b;

import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener;
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.b.c */
/* compiled from: FullScreenVideoListenerImpl */
public class C3933c extends IFullScreenVideoAdInteractionListener.Stub {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public TTFullScreenVideoAd.FullScreenVideoAdInteractionListener f10030a;

    /* renamed from: b */
    private Handler f10031b = new Handler(Looper.getMainLooper());

    public C3933c(TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener) {
        this.f10030a = fullScreenVideoAdInteractionListener;
    }

    /* renamed from: a */
    private void m12952a() {
        this.f10030a = null;
        this.f10031b = null;
    }

    /* renamed from: b */
    private Handler m12953b() {
        Handler handler = this.f10031b;
        if (handler != null) {
            return handler;
        }
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.f10031b = handler2;
        return handler2;
    }

    public void onDestroy() throws RemoteException {
        m12952a();
    }

    public void onAdShow() throws RemoteException {
        m12953b().post(new Runnable() {
            public void run() {
                if (C3933c.this.f10030a != null) {
                    C3933c.this.f10030a.onAdShow();
                }
            }
        });
    }

    public void onAdVideoBarClick() throws RemoteException {
        m12953b().post(new Runnable() {
            public void run() {
                if (C3933c.this.f10030a != null) {
                    C3933c.this.f10030a.onAdVideoBarClick();
                }
            }
        });
    }

    public void onAdClose() throws RemoteException {
        m12953b().post(new Runnable() {
            public void run() {
                if (C3933c.this.f10030a != null) {
                    C3933c.this.f10030a.onAdClose();
                }
            }
        });
    }

    public void onVideoComplete() throws RemoteException {
        m12953b().post(new Runnable() {
            public void run() {
                if (C3933c.this.f10030a != null) {
                    C3933c.this.f10030a.onVideoComplete();
                }
            }
        });
    }

    public void onSkippedVideo() throws RemoteException {
        m12953b().post(new Runnable() {
            public void run() {
                if (C3933c.this.f10030a != null) {
                    C3933c.this.f10030a.onSkippedVideo();
                }
            }
        });
    }
}
