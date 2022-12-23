package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.multipro.p182b.C3949a;

/* renamed from: com.bytedance.sdk.openadsdk.core.bannerexpress.b */
/* compiled from: TTBannerExpressVideoAdImpl */
public class C3387b extends C3378a {
    public C3387b(Context context, C3431n nVar, AdSlot adSlot) {
        super(context, nVar, adSlot);
    }

    /* renamed from: a */
    public void mo19356a(Context context, C3431n nVar, AdSlot adSlot) {
        this.f8135a = new BannerExpressVideoView(context, nVar, adSlot);
        mo19357a(this.f8135a.getCurView(), this.f8137c);
    }

    public void setVideoAdListener(TTNativeExpressAd.ExpressVideoAdListener expressVideoAdListener) {
        if (this.f8135a != null) {
            this.f8135a.setVideoAdListener(expressVideoAdListener);
        }
    }

    public C3949a getVideoModel() {
        if (this.f8135a != null) {
            return ((BannerExpressVideoView) this.f8135a).getVideoModel();
        }
        return null;
    }
}
