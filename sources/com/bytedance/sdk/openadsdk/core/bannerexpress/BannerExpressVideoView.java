package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressVideoView;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.multipro.p182b.C3949a;
import com.bytedance.sdk.openadsdk.p178l.C3904y;

public class BannerExpressVideoView extends BannerExpressView {
    public BannerExpressVideoView(Context context, C3431n nVar, AdSlot adSlot) {
        super(context, nVar, adSlot);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19337a() {
        this.f8123b = new NativeExpressVideoView(this.f8122a, this.f8125d, this.f8126e, this.f8131j);
        addView(this.f8123b, new ViewGroup.LayoutParams(-1, -1));
    }

    /* renamed from: a */
    public void mo19338a(C3431n nVar, AdSlot adSlot) {
        this.f8124c = new NativeExpressVideoView(this.f8122a, nVar, adSlot, this.f8131j);
        this.f8124c.setExpressInteractionListener(new TTNativeExpressAd.ExpressAdInteractionListener() {
            public void onAdShow(View view, int i) {
            }

            public void onRenderFail(View view, String str, int i) {
            }

            public void onAdClicked(View view, int i) {
                if (BannerExpressVideoView.this.f8127f != null) {
                    BannerExpressVideoView.this.f8127f.onAdClicked(BannerExpressVideoView.this, i);
                }
            }

            public void onRenderSuccess(View view, float f, float f2) {
                BannerExpressVideoView.this.mo19340a(f, f2);
                BannerExpressVideoView.this.mo19344e();
            }
        });
        C3904y.m12853a((View) this.f8124c, 8);
        addView(this.f8124c, new ViewGroup.LayoutParams(-1, -1));
    }

    public C3949a getVideoModel() {
        if (this.f8123b != null) {
            return ((NativeExpressVideoView) this.f8123b).getVideoModel();
        }
        return null;
    }
}
