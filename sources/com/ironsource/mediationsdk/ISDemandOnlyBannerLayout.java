package com.ironsource.mediationsdk;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.p204e.C6387c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyBannerListener;

public class ISDemandOnlyBannerLayout extends FrameLayout {
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public View f16322a;

    /* renamed from: b */
    ISBannerSize f16323b;

    /* renamed from: c */
    String f16324c;

    /* renamed from: d */
    Activity f16325d;

    /* renamed from: e */
    boolean f16326e = false;
    /* access modifiers changed from: package-private */

    /* renamed from: f */
    public boolean f16327f = false;

    public ISDemandOnlyBannerLayout(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.f16325d = activity;
        this.f16323b = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    public Activity getActivity() {
        return this.f16325d;
    }

    public ISDemandOnlyBannerListener getBannerDemandOnlyListener() {
        return C6644m.m20216a().f17280a;
    }

    public View getBannerView() {
        return this.f16322a;
    }

    public String getPlacementName() {
        return this.f16324c;
    }

    public ISBannerSize getSize() {
        return this.f16323b;
    }

    public boolean isDestroyed() {
        return this.f16326e;
    }

    public void removeBannerListener() {
        IronLog.API.info("");
        C6644m.m20216a().f17280a = null;
    }

    public final void sendBannerAdLoadFailed(final String str, final IronSourceError ironSourceError) {
        C6387c.f16171a.mo35896a(new Runnable() {
            public final void run() {
                if (ISDemandOnlyBannerLayout.this.f16327f) {
                    IronLog ironLog = IronLog.CALLBACK;
                    ironLog.info("onBannerAdLoadFailed error=" + ironSourceError + ". instanceId: " + str);
                } else {
                    try {
                        if (ISDemandOnlyBannerLayout.this.f16322a != null) {
                            ISDemandOnlyBannerLayout.this.removeView(ISDemandOnlyBannerLayout.this.f16322a);
                            View unused = ISDemandOnlyBannerLayout.this.f16322a = null;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                C6644m.m20216a().mo36714a(str, ironSourceError);
            }
        });
    }

    public void setBannerDemandOnlyListener(ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
        IronLog.API.info("");
        C6644m.m20216a().f17280a = iSDemandOnlyBannerListener;
    }

    public void setPlacementName(String str) {
        this.f16324c = str;
    }
}
