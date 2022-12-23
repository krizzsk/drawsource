package com.ironsource.mediationsdk;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ironsource.environment.p204e.C6387c;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerListener;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;

public class IronSourceBannerLayout extends FrameLayout {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public View f16336a;

    /* renamed from: b */
    private ISBannerSize f16337b;

    /* renamed from: c */
    private String f16338c;

    /* renamed from: d */
    private Activity f16339d;

    /* renamed from: e */
    private boolean f16340e = false;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f16341f = false;

    public IronSourceBannerLayout(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.f16339d = activity;
        this.f16337b = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final IronSourceBannerLayout mo36064a() {
        IronSourceBannerLayout ironSourceBannerLayout = new IronSourceBannerLayout(this.f16339d, this.f16337b);
        ironSourceBannerLayout.setBannerListener(C6668n.m20237a().f17415a);
        ironSourceBannerLayout.setLevelPlayBannerListener(C6668n.m20237a().f17416b);
        ironSourceBannerLayout.setPlacementName(this.f16338c);
        return ironSourceBannerLayout;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36065a(final View view, final FrameLayout.LayoutParams layoutParams) {
        C6387c.f16171a.mo35896a(new Runnable() {
            public final void run() {
                IronSourceBannerLayout.this.removeAllViews();
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(view);
                }
                View unused = IronSourceBannerLayout.this.f16336a = view;
                IronSourceBannerLayout.this.addView(view, 0, layoutParams);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36066a(AdInfo adInfo, boolean z) {
        C6668n.m20237a().mo36794a(adInfo, z);
        this.f16341f = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36067a(final IronSourceError ironSourceError, final boolean z) {
        C6387c.f16171a.mo35896a(new Runnable() {
            public final void run() {
                C6668n a;
                IronSourceError ironSourceError;
                boolean z;
                if (IronSourceBannerLayout.this.f16341f) {
                    a = C6668n.m20237a();
                    ironSourceError = ironSourceError;
                    z = true;
                } else {
                    try {
                        if (IronSourceBannerLayout.this.f16336a != null) {
                            IronSourceBannerLayout.this.removeView(IronSourceBannerLayout.this.f16336a);
                            View unused = IronSourceBannerLayout.this.f16336a = null;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    a = C6668n.m20237a();
                    ironSourceError = ironSourceError;
                    z = z;
                }
                a.mo36795a(ironSourceError, z);
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo36068b() {
        this.f16340e = true;
        this.f16339d = null;
        this.f16337b = null;
        this.f16338c = null;
        this.f16336a = null;
        removeBannerListener();
    }

    public Activity getActivity() {
        return this.f16339d;
    }

    public BannerListener getBannerListener() {
        return C6668n.m20237a().f17415a;
    }

    public View getBannerView() {
        return this.f16336a;
    }

    public LevelPlayBannerListener getLevelPlayBannerListener() {
        return C6668n.m20237a().f17416b;
    }

    public String getPlacementName() {
        return this.f16338c;
    }

    public ISBannerSize getSize() {
        return this.f16337b;
    }

    public boolean isDestroyed() {
        return this.f16340e;
    }

    public void removeBannerListener() {
        IronLog.API.info("");
        C6668n.m20237a().f17415a = null;
        C6668n.m20237a().f17416b = null;
    }

    public void setBannerListener(BannerListener bannerListener) {
        IronLog.API.info("");
        C6668n.m20237a().f17415a = bannerListener;
    }

    public void setLevelPlayBannerListener(LevelPlayBannerListener levelPlayBannerListener) {
        IronLog.API.info("");
        C6668n.m20237a().f17416b = levelPlayBannerListener;
    }

    public void setPlacementName(String str) {
        this.f16338c = str;
    }
}
