package com.applovin.impl.adview.activity.p029a;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.adview.C1433a;
import com.applovin.impl.adview.C1550m;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.p049ad.C1839e;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.adview.activity.a.d */
public class C1448d extends C1442a {
    public C1448d(C1839e eVar, Activity activity, C1969m mVar) {
        super(eVar, activity, mVar);
    }

    /* renamed from: a */
    public void mo12978a(ImageView imageView, C1550m mVar, C1550m mVar2, C1433a aVar, AppLovinAdView appLovinAdView, ViewGroup viewGroup) {
        this.f1693d.addView(appLovinAdView);
        int i = 3;
        if (mVar != null) {
            mo12971a(this.f1692c.mo14184X(), (this.f1692c.mo14206ac() ? 3 : 5) | 48, mVar);
        }
        if (mVar2 != null) {
            if (!this.f1692c.mo14205ab()) {
                i = 5;
            }
            mo12971a(this.f1692c.mo14184X(), i | 48, mVar2);
        }
        if (imageView != null) {
            int dpToPx = AppLovinSdkUtils.dpToPx(this.f1691b, ((Integer) this.f1690a.mo14534a(C1867b.f3252cv)).intValue());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPx, dpToPx, ((Integer) this.f1690a.mo14534a(C1867b.f3254cx)).intValue());
            int dpToPx2 = AppLovinSdkUtils.dpToPx(this.f1691b, ((Integer) this.f1690a.mo14534a(C1867b.f3253cw)).intValue());
            layoutParams.setMargins(dpToPx2, dpToPx2, dpToPx2, dpToPx2);
            this.f1693d.addView(imageView, layoutParams);
        }
        if (aVar != null) {
            this.f1693d.addView(aVar, this.f1694e);
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f1693d);
        } else {
            this.f1691b.setContentView(this.f1693d);
        }
    }
}
