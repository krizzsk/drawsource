package com.ogury.p377ed;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p377ed.internal.C10010f;
import com.ogury.p377ed.internal.C10035ft;
import com.ogury.p377ed.internal.C10076h;
import com.ogury.p377ed.internal.C10177k;
import com.ogury.p377ed.internal.C10259mm;
import com.ogury.p377ed.internal.C10263mq;
import com.ogury.p377ed.internal.C10336w;
import com.ogury.p377ed.internal.C9801a;
import com.ogury.p377ed.internal.C9805ac;
import com.ogury.p377ed.internal.C9886c;
import com.ogury.p377ed.internal.C9978e;
import com.ogury.p377ed.internal.C9989ej;
import p401io.presage.C12482R;
import p401io.presage.common.AdConfig;

/* renamed from: com.ogury.ed.OguryBannerAdView */
public final class OguryBannerAdView extends FrameLayout implements C9805ac {

    /* renamed from: a */
    private C10336w f24700a;

    /* renamed from: b */
    private OguryBannerAdSize f24701b;

    /* renamed from: c */
    private AdConfig f24702c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public OguryBannerAdView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (C10259mm) null);
        C10263mq.m29882b(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public OguryBannerAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (C10259mm) null);
        C10263mq.m29882b(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OguryBannerAdView(Context context, AttributeSet attributeSet, int i, int i2, C10259mm mmVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OguryBannerAdView(Context context, AttributeSet attributeSet, int i) {
        super(context.getApplicationContext(), attributeSet, i);
        C10263mq.m29882b(context, "context");
        Context applicationContext = context.getApplicationContext();
        C10263mq.m29879a((Object) applicationContext, "context.applicationContext");
        this.f24700a = new C10336w(applicationContext, this);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, C12482R.styleable.BannerLayout, 0, 0);
        String string = obtainStyledAttributes.getString(C12482R.styleable.BannerLayout_adUnit);
        this.f24702c = new AdConfig(string == null ? "" : string);
        int i2 = obtainStyledAttributes.getInt(C12482R.styleable.BannerLayout_bannerAdSize, 0);
        if (i2 == OguryBannerAdSize.SMALL_BANNER_320x50.getHeight()) {
            setAdSize(OguryBannerAdSize.SMALL_BANNER_320x50);
        } else if (i2 == OguryBannerAdSize.MPU_300x250.getHeight()) {
            setAdSize(OguryBannerAdSize.MPU_300x250);
        }
        obtainStyledAttributes.recycle();
    }

    public final void setAdUnit(String str) {
        C10263mq.m29882b(str, "adUnitId");
        this.f24702c = new AdConfig(str);
    }

    public final void setAdSize(OguryBannerAdSize oguryBannerAdSize) {
        C10263mq.m29882b(oguryBannerAdSize, "adSize");
        OguryIntegrationLogger.m28105d(C10263mq.m29874a("[Ads] Banner Ad View - setAdSize() called with adSize: ", (Object) oguryBannerAdSize.name()));
        this.f24701b = oguryBannerAdSize;
    }

    private final void setCampaignId(String str) {
        C10035ft.m29150a(this.f24702c, str);
    }

    private final void setCreativeId(String str) {
        C10035ft.m29151b(this.f24702c, str);
    }

    @Deprecated
    public final void setCallback(OguryBannerCallback oguryBannerCallback) {
        this.f24700a.mo65173a((C10076h) C9886c.m28558a(oguryBannerCallback));
    }

    public final void setListener(OguryBannerAdListener oguryBannerAdListener) {
        OguryIntegrationLogger.m28105d("[Ads] Banner Ad View - setListener() called");
        C10336w wVar = this.f24700a;
        C10010f.C10011a aVar = C10010f.f25174a;
        wVar.mo65173a((C10076h) C10010f.C10011a.m28994a(oguryBannerAdListener));
    }

    public final void setAdImpressionListener(OguryAdImpressionListener oguryAdImpressionListener) {
        C10336w wVar = this.f24700a;
        C9978e.C9979a aVar = C9978e.f25079a;
        wVar.mo65174a((C10177k) C9978e.C9979a.m28794a(oguryAdImpressionListener));
    }

    public final void loadAd() {
        OguryIntegrationLogger.m28105d("[Ads] Banner Ad View - load() called");
        C9801a aVar = C9801a.f24713a;
        C9989ej a = C9801a.m28256a(this.f24701b);
        C9801a aVar2 = C9801a.f24713a;
        this.f24700a.mo65175a(this.f24702c, a, C9801a.m28257b(this.f24701b));
    }

    public final boolean isBannerExpanded() {
        return this.f24700a.mo65177c();
    }

    public final void destroy() {
        ViewGroup container = getContainer();
        if (container != null) {
            container.removeView(this);
        }
        removeAllViews();
        this.f24700a.mo65176b();
    }

    /* access modifiers changed from: protected */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (m28252a()) {
            this.f24700a.mo65172a();
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        this.f24700a.mo65172a();
    }

    /* renamed from: a */
    private final boolean m28252a() {
        return getChildCount() > 0;
    }

    private final ViewGroup getContainer() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            return (ViewGroup) parent;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24700a.mo65172a();
    }
}
