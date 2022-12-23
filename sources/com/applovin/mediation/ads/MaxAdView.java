package com.applovin.mediation.ads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.mediation.ads.C1614a;
import com.applovin.impl.mediation.ads.MaxAdViewImpl;
import com.applovin.impl.sdk.utils.C2043b;
import com.applovin.impl.sdk.utils.C2095q;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.sdk.AppLovinSdk;

public class MaxAdView extends RelativeLayout {

    /* renamed from: a */
    private MaxAdViewImpl f4424a;

    /* renamed from: b */
    private View f4425b;

    /* renamed from: c */
    private int f4426c;

    public MaxAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaxAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String a = C2043b.m4918a(context, attributeSet, AppLovinAdView.NAMESPACE, "adUnitId");
        String a2 = C2043b.m4918a(context, attributeSet, AppLovinAdView.NAMESPACE, "adFormat");
        MaxAdFormat formatFromString = StringUtils.isValidString(a2) ? MaxAdFormat.formatFromString(a2) : C2043b.m4916a(context);
        int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 49);
        if (a == null) {
            throw new IllegalArgumentException("No ad unit ID specified");
        } else if (!TextUtils.isEmpty(a)) {
            m5151a(a, formatFromString, attributeIntValue, AppLovinSdk.getInstance(context), context);
        } else {
            throw new IllegalArgumentException("Empty ad unit ID specified");
        }
    }

    public MaxAdView(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat, Context context) {
        this(str, maxAdFormat, AppLovinSdk.getInstance(context), context);
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat, AppLovinSdk appLovinSdk, Context context) {
        super(context.getApplicationContext());
        C1614a.logApiCall("MaxAdView", "MaxAdView(adUnitId=" + str + ", adFormat=" + maxAdFormat + ", sdk=" + appLovinSdk + ")");
        m5151a(str, maxAdFormat, 49, appLovinSdk, context);
    }

    public MaxAdView(String str, AppLovinSdk appLovinSdk, Context context) {
        this(str, C2043b.m4916a(context), appLovinSdk, context);
    }

    /* renamed from: a */
    private void m5150a(MaxAdFormat maxAdFormat, Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int applyDimension = maxAdFormat == MaxAdFormat.MREC ? (int) TypedValue.applyDimension(1, (float) maxAdFormat.getSize().getWidth(), displayMetrics) : displayMetrics.widthPixels;
        TextView textView = new TextView(context);
        textView.setBackgroundColor(Color.rgb(220, 220, 220));
        textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setText("AppLovin MAX Ad");
        textView.setGravity(17);
        addView(textView, applyDimension, (int) TypedValue.applyDimension(1, (float) maxAdFormat.getSize().getHeight(), displayMetrics));
    }

    /* renamed from: a */
    private void m5151a(String str, MaxAdFormat maxAdFormat, int i, AppLovinSdk appLovinSdk, Context context) {
        if (!isInEditMode()) {
            View view = new View(context.getApplicationContext());
            this.f4425b = view;
            view.setBackgroundColor(0);
            addView(this.f4425b);
            this.f4425b.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.f4426c = getVisibility();
            this.f4424a = new MaxAdViewImpl(str.trim(), maxAdFormat, this, this.f4425b, appLovinSdk.coreSdk, context);
            setGravity(i);
            if (getBackground() instanceof ColorDrawable) {
                setBackgroundColor(((ColorDrawable) getBackground()).getColor());
            }
            super.setBackgroundColor(0);
            return;
        }
        m5150a(maxAdFormat, context);
    }

    public void destroy() {
        this.f4424a.destroy();
    }

    public MaxAdFormat getAdFormat() {
        return this.f4424a.getAdFormat();
    }

    public String getAdUnitId() {
        return this.f4424a.getAdUnitId();
    }

    public String getPlacement() {
        return this.f4424a.getPlacement();
    }

    public void loadAd() {
        this.f4424a.loadAd();
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        MaxAdViewImpl maxAdViewImpl = this.f4424a;
        maxAdViewImpl.logApiCall("onWindowVisibilityChanged(visibility=" + i + ")");
        if (this.f4424a != null && C2095q.m5077a(this.f4426c, i)) {
            this.f4424a.onWindowVisibilityChanged(i);
        }
        this.f4426c = i;
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        MaxAdViewImpl maxAdViewImpl = this.f4424a;
        maxAdViewImpl.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f4424a.setAdReviewListener(maxAdReviewListener);
    }

    public void setAlpha(float f) {
        MaxAdViewImpl maxAdViewImpl = this.f4424a;
        maxAdViewImpl.logApiCall("setAlpha(alpha=" + f + ")");
        View view = this.f4425b;
        if (view != null) {
            view.setAlpha(f);
        }
    }

    public void setBackgroundColor(int i) {
        MaxAdViewImpl maxAdViewImpl = this.f4424a;
        maxAdViewImpl.logApiCall("setBackgroundColor(color=" + i + ")");
        MaxAdViewImpl maxAdViewImpl2 = this.f4424a;
        if (maxAdViewImpl2 != null) {
            maxAdViewImpl2.setPublisherBackgroundColor(i);
        }
        View view = this.f4425b;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setCustomData(String str) {
        MaxAdViewImpl maxAdViewImpl = this.f4424a;
        maxAdViewImpl.logApiCall("setCustomData(value=" + str + ")");
        this.f4424a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        MaxAdViewImpl maxAdViewImpl = this.f4424a;
        maxAdViewImpl.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f4424a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdViewAdListener maxAdViewAdListener) {
        MaxAdViewImpl maxAdViewImpl = this.f4424a;
        maxAdViewImpl.logApiCall("setListener(listener=" + maxAdViewAdListener + ")");
        this.f4424a.setListener(maxAdViewAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        MaxAdViewImpl maxAdViewImpl = this.f4424a;
        maxAdViewImpl.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f4424a.setLocalExtraParameter(str, obj);
    }

    public void setPlacement(String str) {
        this.f4424a.setPlacement(str);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        MaxAdViewImpl maxAdViewImpl = this.f4424a;
        maxAdViewImpl.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f4424a.setRevenueListener(maxAdRevenueListener);
    }

    public void startAutoRefresh() {
        this.f4424a.startAutoRefresh();
    }

    public void stopAutoRefresh() {
        this.f4424a.stopAutoRefresh();
    }

    public String toString() {
        MaxAdViewImpl maxAdViewImpl = this.f4424a;
        return maxAdViewImpl != null ? maxAdViewImpl.toString() : "MaxAdView";
    }
}
