package com.applovin.impl.adview.activity.p029a;

import android.app.Activity;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.adview.C1550m;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.p049ad.C1839e;

/* renamed from: com.applovin.impl.adview.activity.a.b */
public class C1443b extends C1442a {
    public C1443b(C1839e eVar, Activity activity, C1969m mVar) {
        super(eVar, activity, mVar);
    }

    /* renamed from: a */
    public void mo12972a(C1550m mVar, AppLovinAdView appLovinAdView, ViewGroup viewGroup) {
        this.f1693d.addView(appLovinAdView);
        if (mVar != null) {
            mo12971a(this.f1692c.mo14184X(), (this.f1692c.mo14205ab() ? 3 : 5) | 48, mVar);
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f1693d);
        } else {
            this.f1691b.setContentView(this.f1693d);
        }
    }
}
