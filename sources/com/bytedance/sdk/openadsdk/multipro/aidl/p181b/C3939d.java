package com.bytedance.sdk.openadsdk.multipro.aidl.p181b;

import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IRewardAdInteractionListener;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.b.d */
/* compiled from: RewardVideoListenerImpl */
public class C3939d extends IRewardAdInteractionListener.Stub {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public TTRewardVideoAd.RewardAdInteractionListener f10037a;

    /* renamed from: b */
    private Handler f10038b = new Handler(Looper.getMainLooper());

    public C3939d(TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener) {
        this.f10037a = rewardAdInteractionListener;
    }

    /* renamed from: a */
    private void m12955a() {
        this.f10037a = null;
        this.f10038b = null;
    }

    /* renamed from: b */
    private Handler m12956b() {
        Handler handler = this.f10038b;
        if (handler != null) {
            return handler;
        }
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.f10038b = handler2;
        return handler2;
    }

    public void onDestroy() throws RemoteException {
        m12955a();
    }

    public void onAdShow() throws RemoteException {
        m12956b().post(new Runnable() {
            public void run() {
                if (C3939d.this.f10037a != null) {
                    C3939d.this.f10037a.onAdShow();
                }
            }
        });
    }

    public void onAdVideoBarClick() throws RemoteException {
        m12956b().post(new Runnable() {
            public void run() {
                if (C3939d.this.f10037a != null) {
                    C3939d.this.f10037a.onAdVideoBarClick();
                }
            }
        });
    }

    public void onAdClose() throws RemoteException {
        m12956b().post(new Runnable() {
            public void run() {
                if (C3939d.this.f10037a != null) {
                    C3939d.this.f10037a.onAdClose();
                }
            }
        });
    }

    public void onVideoComplete() throws RemoteException {
        m12956b().post(new Runnable() {
            public void run() {
                if (C3939d.this.f10037a != null) {
                    C3939d.this.f10037a.onVideoComplete();
                }
            }
        });
    }

    public void onVideoError() throws RemoteException {
        m12956b().post(new Runnable() {
            public void run() {
                if (C3939d.this.f10037a != null) {
                    C3939d.this.f10037a.onVideoError();
                }
            }
        });
    }

    public void onSkippedVideo() throws RemoteException {
        m12956b().post(new Runnable() {
            public void run() {
                if (C3939d.this.f10037a != null) {
                    C3939d.this.f10037a.onSkippedVideo();
                }
            }
        });
    }

    public void onRewardVerify(boolean z, int i, String str, int i2, String str2) throws RemoteException {
        final boolean z2 = z;
        final int i3 = i;
        final String str3 = str;
        final int i4 = i2;
        final String str4 = str2;
        m12956b().post(new Runnable() {
            public void run() {
                if (C3939d.this.f10037a != null) {
                    C3939d.this.f10037a.onRewardVerify(z2, i3, str3, i4, str4);
                }
            }
        });
    }
}
