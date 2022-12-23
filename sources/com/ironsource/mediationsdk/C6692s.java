package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.server.C6729b;
import com.ironsource.mediationsdk.utils.C6734a;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.s */
public abstract class C6692s {

    /* renamed from: a */
    protected C6734a f17484a;

    /* renamed from: b */
    protected IronSourceSegment f17485b;

    /* renamed from: c */
    protected AdInfo f17486c;

    /* renamed from: d */
    private HashSet<ImpressionDataListener> f17487d = new HashSet<>();

    public C6692s(HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        this.f17487d = hashSet;
        this.f17484a = new C6734a();
        this.f17485b = ironSourceSegment;
    }

    /* renamed from: d */
    protected static String m20309d() {
        return "fallback_" + System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo36835a(IronSource.AD_UNIT ad_unit) {
        this.f17484a.mo36957a(ad_unit, false);
    }

    /* renamed from: a */
    public final void mo36836a(IronSourceSegment ironSourceSegment) {
        this.f17485b = ironSourceSegment;
    }

    /* renamed from: a */
    public final void mo36837a(ImpressionData impressionData) {
        if (impressionData != null) {
            this.f17486c = new AdInfo(impressionData);
        }
    }

    /* renamed from: a */
    public final void mo36838a(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f17487d.add(impressionDataListener);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo36839a(C6729b bVar, String str) {
        if (bVar != null) {
            ImpressionData a = bVar.mo36941a(str);
            if (a != null) {
                Iterator<ImpressionDataListener> it = this.f17487d.iterator();
                while (it.hasNext()) {
                    ImpressionDataListener next = it.next();
                    IronLog ironLog = IronLog.CALLBACK;
                    ironLog.info("onImpressionSuccess " + next.getClass().getSimpleName() + ": " + a);
                    next.onImpressionSuccess(a);
                }
                return;
            }
            return;
        }
        IronLog.INTERNAL.verbose("no auctionResponseItem or listener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo36840a(JSONObject jSONObject, IronSource.AD_UNIT ad_unit) {
        boolean z = false;
        if (jSONObject != null) {
            z = jSONObject.optBoolean("isAdUnitCapped", false);
        }
        this.f17484a.mo36957a(ad_unit, z);
    }

    /* renamed from: a_ */
    public final void mo36841a_() {
        this.f17486c = null;
    }

    /* renamed from: b */
    public final void mo36842b() {
        synchronized (this) {
            this.f17487d.clear();
        }
    }

    /* renamed from: b */
    public final void mo36843b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f17487d.remove(impressionDataListener);
        }
    }
}
