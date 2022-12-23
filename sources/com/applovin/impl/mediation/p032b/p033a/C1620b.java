package com.applovin.impl.mediation.p032b.p033a;

import android.content.Context;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.applovin.impl.mediation.b.a.b */
public class C1620b extends MaxNativeAdListener implements MaxAdRevenueListener {

    /* renamed from: a */
    private final int f2219a;

    /* renamed from: b */
    private final MaxNativeAdLoader f2220b;

    /* renamed from: c */
    private final Queue<MaxAd> f2221c = new LinkedList();

    /* renamed from: d */
    private boolean f2222d = false;

    /* renamed from: e */
    private final Object f2223e = new Object();

    /* renamed from: f */
    private C1621a f2224f;

    /* renamed from: com.applovin.impl.mediation.b.a.b$a */
    public interface C1621a {
        void onAdRevenuePaid(MaxAd maxAd);

        void onNativeAdClicked(MaxAd maxAd);

        void onNativeAdLoadFailed(String str, MaxError maxError);

        void onNativeAdLoaded();
    }

    public C1620b(String str, int i, Context context, C1621a aVar) {
        this.f2219a = i;
        this.f2224f = aVar;
        MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(str, context);
        this.f2220b = maxNativeAdLoader;
        maxNativeAdLoader.setNativeAdListener(this);
        this.f2220b.setRevenueListener(this);
    }

    /* renamed from: a */
    public void mo13552a() {
        this.f2224f = null;
        mo13558e();
        this.f2220b.destroy();
    }

    /* renamed from: a */
    public void mo13553a(MaxAd maxAd) {
        this.f2220b.destroy(maxAd);
    }

    /* renamed from: a */
    public boolean mo13554a(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        return this.f2220b.render(maxNativeAdView, maxAd);
    }

    /* renamed from: b */
    public boolean mo13555b() {
        boolean z;
        synchronized (this.f2223e) {
            z = !this.f2221c.isEmpty();
        }
        return z;
    }

    /* renamed from: c */
    public void mo13556c() {
        synchronized (this.f2223e) {
            if (!this.f2222d && this.f2221c.size() < this.f2219a) {
                this.f2222d = true;
                this.f2220b.loadAd();
            }
        }
    }

    /* renamed from: d */
    public MaxAd mo13557d() {
        MaxAd remove;
        synchronized (this.f2223e) {
            remove = this.f2221c.remove();
            mo13556c();
        }
        return remove;
    }

    /* renamed from: e */
    public void mo13558e() {
        synchronized (this.f2223e) {
            for (MaxAd a : this.f2221c) {
                mo13553a(a);
            }
            this.f2221c.clear();
        }
    }

    public void onAdRevenuePaid(MaxAd maxAd) {
        C1621a aVar = this.f2224f;
        if (aVar != null) {
            aVar.onAdRevenuePaid(maxAd);
        }
    }

    public void onNativeAdClicked(MaxAd maxAd) {
        C1621a aVar = this.f2224f;
        if (aVar != null) {
            aVar.onNativeAdClicked(maxAd);
        }
    }

    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        C1621a aVar = this.f2224f;
        if (aVar != null) {
            aVar.onNativeAdLoadFailed(str, maxError);
        }
    }

    public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        synchronized (this.f2223e) {
            this.f2221c.add(maxAd);
            this.f2222d = false;
            mo13556c();
        }
        C1621a aVar = this.f2224f;
        if (aVar != null) {
            aVar.onNativeAdLoaded();
        }
    }
}
