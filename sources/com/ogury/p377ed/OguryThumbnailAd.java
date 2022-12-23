package com.ogury.p377ed;

import android.app.Activity;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p377ed.internal.C10010f;
import com.ogury.p377ed.internal.C10066gs;
import com.ogury.p377ed.internal.C10076h;
import com.ogury.p377ed.internal.C10177k;
import com.ogury.p377ed.internal.C10263mq;
import com.ogury.p377ed.internal.C9877bv;
import com.ogury.p377ed.internal.C9885bz;
import com.ogury.p377ed.internal.C9978e;
import p401io.presage.interstitial.PresageInterstitialCallback;

/* renamed from: com.ogury.ed.OguryThumbnailAd */
public final class OguryThumbnailAd {

    /* renamed from: a */
    private final C9877bv f24708a;

    /* renamed from: b */
    private final C10066gs f24709b;

    private OguryThumbnailAd(C9877bv bvVar) {
        this.f24708a = bvVar;
        this.f24709b = new C10066gs();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OguryThumbnailAd(android.content.Context r3, p401io.presage.common.AdConfig r4) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            com.ogury.p377ed.internal.C10263mq.m29882b(r3, r0)
            java.lang.String r0 = "adConfig"
            com.ogury.p377ed.internal.C10263mq.m29882b(r4, r0)
            com.ogury.ed.internal.bv r0 = new com.ogury.ed.internal.bv
            android.content.Context r3 = r3.getApplicationContext()
            java.lang.String r1 = "context.applicationContext"
            com.ogury.p377ed.internal.C10263mq.m29879a((java.lang.Object) r3, (java.lang.String) r1)
            r0.<init>(r3, r4)
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p377ed.OguryThumbnailAd.<init>(android.content.Context, io.presage.common.AdConfig):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OguryThumbnailAd(android.content.Context r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            com.ogury.p377ed.internal.C10263mq.m29882b(r3, r0)
            java.lang.String r0 = "adUnitId"
            com.ogury.p377ed.internal.C10263mq.m29882b(r4, r0)
            com.ogury.ed.internal.bv r0 = new com.ogury.ed.internal.bv
            android.content.Context r3 = r3.getApplicationContext()
            java.lang.String r1 = "context.applicationContext"
            com.ogury.p377ed.internal.C10263mq.m29879a((java.lang.Object) r3, (java.lang.String) r1)
            io.presage.common.AdConfig r1 = new io.presage.common.AdConfig
            r1.<init>(r4)
            r0.<init>(r3, r1)
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p377ed.OguryThumbnailAd.<init>(android.content.Context, java.lang.String):void");
    }

    private final void setCampaignId(String str) {
        this.f24708a.mo64407a(str);
    }

    private final void setCreativeId(String str) {
        this.f24708a.mo64413b(str);
    }

    @Deprecated
    public final void setCallback(OguryThumbnailAdCallback oguryThumbnailAdCallback) {
        this.f24708a.mo64405a((C10076h) this.f24709b.mo64788a((PresageInterstitialCallback) oguryThumbnailAdCallback));
    }

    @Deprecated
    public final void setOnAdClickedCallback(OguryAdClickCallback oguryAdClickCallback) {
        this.f24709b.mo64789a(oguryAdClickCallback);
    }

    public final void setListener(OguryThumbnailAdListener oguryThumbnailAdListener) {
        OguryIntegrationLogger.m28105d("[Ads] Thumbnail Ad - setListener() called");
        C9877bv bvVar = this.f24708a;
        C10010f.C10011a aVar = C10010f.f25174a;
        bvVar.mo64405a((C10076h) C10010f.C10011a.m28994a(oguryThumbnailAdListener));
    }

    public final void setAdImpressionListener(OguryAdImpressionListener oguryAdImpressionListener) {
        C9877bv bvVar = this.f24708a;
        C9978e.C9979a aVar = C9978e.f25079a;
        bvVar.mo64406a((C10177k) C9978e.C9979a.m28794a(oguryAdImpressionListener));
    }

    public final void load(int i, int i2) {
        OguryIntegrationLogger.m28105d("[Ads] Thumbnail Ad - load() called with maxWidth: " + i + " maxHeight: " + i2);
        this.f24708a.mo64402a(i, i2);
    }

    public final void load() {
        OguryIntegrationLogger.m28105d("[Ads] Thumbnail Ad - load() called");
        this.f24708a.mo64411b();
    }

    public final void show(Activity activity, int i, int i2) {
        C10263mq.m29882b(activity, "activity");
        OguryIntegrationLogger.m28105d("[Ads] Thumbnail Ad - show() called with activity: " + activity.getClass().getName() + " leftMargin: " + i + " topMargin: " + i2);
        this.f24708a.mo64404a(activity, new C9885bz(OguryThumbnailGravity.TOP_LEFT.getValue(), i, i2));
    }

    public final void show(Activity activity) {
        C10263mq.m29882b(activity, "activity");
        OguryIntegrationLogger.m28105d(C10263mq.m29874a("[Ads] Thumbnail Ad - show() called with activity: ", (Object) activity.getClass().getName()));
        this.f24708a.mo64403a(activity);
    }

    public final void show(Activity activity, OguryThumbnailGravity oguryThumbnailGravity, int i, int i2) {
        C10263mq.m29882b(activity, "activity");
        C10263mq.m29882b(oguryThumbnailGravity, "gravity");
        OguryIntegrationLogger.m28105d("[Ads] Thumbnail Ad - show() called with activity: " + activity.getClass().getName() + " gravity: " + oguryThumbnailGravity.ordinal() + " xMargin: " + i + " yMargin: " + i2);
        this.f24708a.mo64404a(activity, new C9885bz(oguryThumbnailGravity.getValue(), i, i2));
    }

    public final boolean isLoaded() {
        return this.f24708a.mo64410a();
    }

    public final void setWhiteListPackages(String... strArr) {
        C10263mq.m29882b(strArr, "packages");
        this.f24708a.mo64409a(strArr);
    }

    @SafeVarargs
    public final void setBlackListActivities(Class<? extends Activity>... clsArr) {
        C10263mq.m29882b(clsArr, "activities");
        this.f24708a.mo64408a(clsArr);
    }

    public final void setWhiteListFragmentPackages(String... strArr) {
        C10263mq.m29882b(strArr, "packages");
        this.f24708a.mo64415b(strArr);
    }

    @SafeVarargs
    public final void setBlackListFragments(Class<? extends Object>... clsArr) {
        C10263mq.m29882b(clsArr, "fragments");
        this.f24708a.mo64414b(clsArr);
    }

    public final void logWhiteListedActivities(Activity activity) {
        C10263mq.m29882b(activity, "activity");
        this.f24708a.mo64412b(activity);
    }
}
