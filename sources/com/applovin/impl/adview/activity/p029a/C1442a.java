package com.applovin.impl.adview.activity.p029a;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.applovin.impl.adview.C1550m;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.p049ad.C1839e;

/* renamed from: com.applovin.impl.adview.activity.a.a */
abstract class C1442a {

    /* renamed from: a */
    final C1969m f1690a;

    /* renamed from: b */
    final Activity f1691b;

    /* renamed from: c */
    final C1839e f1692c;

    /* renamed from: d */
    final ViewGroup f1693d;

    /* renamed from: e */
    final FrameLayout.LayoutParams f1694e = new FrameLayout.LayoutParams(-1, -1, 17);

    C1442a(C1839e eVar, Activity activity, C1969m mVar) {
        this.f1692c = eVar;
        this.f1690a = mVar;
        this.f1691b = activity;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f1693d = frameLayout;
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.f1693d.setLayoutParams(this.f1694e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12971a(C1839e.C1843c cVar, int i, C1550m mVar) {
        mVar.mo13209a(cVar.f2988a, cVar.f2992e, cVar.f2991d, i);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(mVar.getLayoutParams());
        layoutParams.setMargins(cVar.f2990c, cVar.f2989b, cVar.f2990c, 0);
        layoutParams.gravity = i;
        this.f1693d.addView(mVar, layoutParams);
    }
}
