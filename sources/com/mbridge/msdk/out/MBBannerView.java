package com.mbridge.msdk.out;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.p085b.C2470b;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.mbbanner.p322a.C8726a;

public class MBBannerView extends RelativeLayout {
    private String bidToken;
    /* access modifiers changed from: private */
    public C8726a controller;
    private boolean hadAttached;
    private boolean isVisible;
    private BannerAdListener mBannerAdListener;
    private MBridgeIds mBridgeIds;

    public MBBannerView(Context context) {
        this(context, (AttributeSet) null);
    }

    public MBBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MBBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.hadAttached = false;
        this.isVisible = false;
        C8388a.m23845e().mo56898a(context);
    }

    public void init(BannerSize bannerSize, String str, String str2) {
        this.mBridgeIds = new MBridgeIds(str, str2);
        String f = C8677z.m24944f(str2);
        if (!TextUtils.isEmpty(f)) {
            C8677z.m24918a(str2, f);
        }
        C8726a aVar = new C8726a(this, bannerSize, str, str2);
        this.controller = aVar;
        aVar.mo58328c(this.isVisible);
        this.controller.mo58326b(this.hadAttached);
    }

    public String getRequestId() {
        C8726a aVar = this.controller;
        return aVar != null ? aVar.mo58318a() : "";
    }

    public void updateBannerSize(BannerSize bannerSize) {
        C8726a aVar = this.controller;
        if (aVar != null) {
            aVar.mo58322a(bannerSize);
        }
    }

    public void setRefreshTime(int i) {
        C8726a aVar = this.controller;
        if (aVar != null && i >= 0) {
            aVar.mo58319a(i);
        }
    }

    public void setAllowShowCloseBtn(boolean z) {
        C8726a aVar = this.controller;
        if (aVar != null) {
            aVar.mo58324a(z);
        }
    }

    public void load() {
        C8726a aVar = this.controller;
        if (aVar != null) {
            aVar.mo58326b(this.hadAttached);
            this.controller.mo58323a("");
            return;
        }
        BannerAdListener bannerAdListener = this.mBannerAdListener;
        if (bannerAdListener != null) {
            bannerAdListener.onLoadFailed(this.mBridgeIds, "banner controler init error，please check it");
        }
    }

    public void loadFromBid(String str) {
        this.bidToken = str;
        if (this.controller == null) {
            BannerAdListener bannerAdListener = this.mBannerAdListener;
            if (bannerAdListener != null) {
                bannerAdListener.onLoadFailed(this.mBridgeIds, "banner controler init error，please check it");
            }
        } else if (!TextUtils.isEmpty(str)) {
            this.controller.mo58326b(this.hadAttached);
            this.controller.mo58319a(0);
            this.controller.mo58323a(str);
        } else {
            BannerAdListener bannerAdListener2 = this.mBannerAdListener;
            if (bannerAdListener2 != null) {
                bannerAdListener2.onLoadFailed(this.mBridgeIds, "banner token is null or empty，please check it");
            }
        }
    }

    public void setBannerAdListener(BannerAdListener bannerAdListener) {
        this.mBannerAdListener = bannerAdListener;
        C8726a aVar = this.controller;
        if (aVar != null) {
            aVar.mo58321a(bannerAdListener);
        }
    }

    public void release() {
        if (this.mBannerAdListener != null) {
            this.mBannerAdListener = null;
        }
        C8726a aVar = this.controller;
        if (aVar != null) {
            aVar.mo58321a((BannerAdListener) null);
            this.controller.mo58325b();
        }
        removeAllViews();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateAttachedState(true);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        updateAttachedState(false);
    }

    private void updateAttachedState(boolean z) {
        this.hadAttached = z;
        C8726a aVar = this.controller;
        if (aVar != null) {
            aVar.mo58326b(z);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.isVisible = i == 0;
        if (this.controller == null) {
            return;
        }
        if (i == 0) {
            delayedNotify();
        } else if (!C2470b.f5205c) {
            this.controller.mo58328c(false);
        }
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        this.isVisible = i == 0;
        if (this.controller == null) {
            return;
        }
        if (i == 0) {
            delayedNotify();
        } else if (!C2470b.f5205c) {
            this.controller.mo58328c(false);
        }
    }

    private void delayedNotify() {
        postDelayed(new Runnable() {
            public void run() {
                if (MBBannerView.this.controller != null && !C2470b.f5205c) {
                    MBBannerView.this.controller.mo58328c(true);
                }
            }
        }, 200);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C8726a aVar = this.controller;
        if (aVar != null) {
            aVar.mo58320a(i, i2, i3, i4);
        }
    }

    public void onPause() {
        if (this.controller != null && TextUtils.isEmpty(this.bidToken)) {
            this.controller.mo58329d();
        }
    }

    public void onResume() {
        if (this.controller != null && TextUtils.isEmpty(this.bidToken) && !C2470b.f5205c) {
            this.controller.mo58330e();
        }
    }
}
