package com.applovin.impl.mediation;

import com.applovin.impl.mediation.p031a.C1583a;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import java.util.List;

public class MaxAdWaterfallInfoImpl implements MaxAdWaterfallInfo {

    /* renamed from: a */
    private final C1583a f2024a;

    /* renamed from: b */
    private final String f2025b;

    /* renamed from: c */
    private final String f2026c;

    /* renamed from: d */
    private final List<MaxNetworkResponseInfo> f2027d;

    /* renamed from: e */
    private final long f2028e;

    public MaxAdWaterfallInfoImpl(C1583a aVar, long j, List<MaxNetworkResponseInfo> list) {
        this(aVar, aVar.mo13386m(), aVar.mo13387n(), j, list);
    }

    public MaxAdWaterfallInfoImpl(C1583a aVar, String str, String str2, long j, List<MaxNetworkResponseInfo> list) {
        this.f2024a = aVar;
        this.f2025b = str;
        this.f2026c = str2;
        this.f2027d = list;
        this.f2028e = j;
    }

    public long getLatencyMillis() {
        return this.f2028e;
    }

    public MaxAd getLoadedAd() {
        return this.f2024a;
    }

    public String getName() {
        return this.f2025b;
    }

    public List<MaxNetworkResponseInfo> getNetworkResponses() {
        return this.f2027d;
    }

    public String getTestName() {
        return this.f2026c;
    }

    public String toString() {
        return "MaxAdWaterfallInfo{name=" + this.f2025b + ", testName=" + this.f2026c + ", networkResponses=" + this.f2027d + ", latencyMillis=" + this.f2028e + '}';
    }
}
