package com.applovin.adview;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.applovin.impl.adview.C1507b;
import com.applovin.impl.sdk.C2102v;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;

public class AppLovinAdView extends RelativeLayout {
    public static final String NAMESPACE = "http://schemas.applovin.com/android/1.0";

    /* renamed from: a */
    private C1507b f1524a;

    public AppLovinAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppLovinAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2380a((AppLovinAdSize) null, (String) null, (AppLovinSdk) null, context, attributeSet);
    }

    public AppLovinAdView(AppLovinAdSize appLovinAdSize, Context context) {
        this(appLovinAdSize, (String) null, context);
    }

    public AppLovinAdView(AppLovinAdSize appLovinAdSize, String str, Context context) {
        super(context);
        m2380a(appLovinAdSize, str, (AppLovinSdk) null, context, (AttributeSet) null);
    }

    public AppLovinAdView(AppLovinSdk appLovinSdk, AppLovinAdSize appLovinAdSize, Context context) {
        this(appLovinSdk, appLovinAdSize, (String) null, context);
    }

    public AppLovinAdView(AppLovinSdk appLovinSdk, AppLovinAdSize appLovinAdSize, String str, Context context) {
        super(context.getApplicationContext());
        m2380a(appLovinAdSize, str, appLovinSdk, context, (AttributeSet) null);
    }

    /* renamed from: a */
    private void m2379a(AttributeSet attributeSet, Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        TextView textView = new TextView(context);
        textView.setBackgroundColor(Color.rgb(220, 220, 220));
        textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setText("AppLovin Ad");
        textView.setGravity(17);
        addView(textView, displayMetrics.widthPixels, (int) TypedValue.applyDimension(1, 50.0f, displayMetrics));
    }

    /* renamed from: a */
    private void m2380a(AppLovinAdSize appLovinAdSize, String str, AppLovinSdk appLovinSdk, Context context, AttributeSet attributeSet) {
        if (!isInEditMode()) {
            C1507b bVar = new C1507b();
            this.f1524a = bVar;
            bVar.mo13100a(this, context, appLovinAdSize, str, appLovinSdk, attributeSet);
            return;
        }
        m2379a(attributeSet, context);
    }

    public void destroy() {
        C1507b bVar = this.f1524a;
        if (bVar != null) {
            bVar.mo13116f();
        }
    }

    public C1507b getController() {
        return this.f1524a;
    }

    public AppLovinAdSize getSize() {
        C1507b bVar = this.f1524a;
        if (bVar != null) {
            return bVar.mo13111b();
        }
        return null;
    }

    public String getZoneId() {
        C1507b bVar = this.f1524a;
        if (bVar != null) {
            return bVar.mo13113c();
        }
        return null;
    }

    public void loadNextAd() {
        C1507b bVar = this.f1524a;
        if (bVar != null) {
            bVar.mo13096a();
        } else {
            C2102v.m5108g("AppLovinSdk", "Unable to load next ad: AppLovinAdView is not initialized.");
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1507b bVar = this.f1524a;
        if (bVar != null) {
            bVar.mo13119i();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        C1507b bVar = this.f1524a;
        if (bVar != null) {
            bVar.mo13120j();
        }
        super.onDetachedFromWindow();
    }

    public void pause() {
        C1507b bVar = this.f1524a;
        if (bVar != null) {
            bVar.mo13114d();
        }
    }

    public void renderAd(AppLovinAd appLovinAd) {
        C1507b bVar = this.f1524a;
        if (bVar != null) {
            bVar.mo13105a(appLovinAd);
        }
    }

    public void resume() {
        C1507b bVar = this.f1524a;
        if (bVar != null) {
            bVar.mo13115e();
        }
    }

    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        C1507b bVar = this.f1524a;
        if (bVar != null) {
            bVar.mo13107a(appLovinAdClickListener);
        }
    }

    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        C1507b bVar = this.f1524a;
        if (bVar != null) {
            bVar.mo13108a(appLovinAdDisplayListener);
        }
    }

    public void setAdLoadListener(AppLovinAdLoadListener appLovinAdLoadListener) {
        C1507b bVar = this.f1524a;
        if (bVar != null) {
            bVar.mo13109a(appLovinAdLoadListener);
        }
    }

    public void setAdViewEventListener(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        C1507b bVar = this.f1524a;
        if (bVar != null) {
            bVar.mo13101a(appLovinAdViewEventListener);
        }
    }

    public String toString() {
        return "AppLovinAdView{zoneId='" + getZoneId() + "\", size=" + getSize() + '}';
    }
}
