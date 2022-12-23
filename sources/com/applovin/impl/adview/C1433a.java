package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.adview.a */
public class C1433a extends RelativeLayout {

    /* renamed from: a */
    private final ProgressBar f1669a;

    public C1433a(Context context, int i, int i2) {
        super(context);
        RelativeLayout.LayoutParams layoutParams;
        setClickable(false);
        ProgressBar progressBar = new ProgressBar(context, (AttributeSet) null, i2);
        this.f1669a = progressBar;
        progressBar.setIndeterminate(true);
        this.f1669a.setClickable(false);
        if (i == -2 || i == -1) {
            layoutParams = new RelativeLayout.LayoutParams(i, i);
        } else {
            int dpToPx = AppLovinSdkUtils.dpToPx(context, i);
            layoutParams = new RelativeLayout.LayoutParams(dpToPx, dpToPx);
        }
        layoutParams.addRule(13);
        this.f1669a.setLayoutParams(layoutParams);
        addView(this.f1669a);
    }

    /* renamed from: a */
    public void mo12955a() {
        setVisibility(0);
    }

    /* renamed from: b */
    public void mo12956b() {
        setVisibility(8);
    }

    public void setColor(int i) {
        this.f1669a.getIndeterminateDrawable().setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }
}
