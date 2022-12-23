package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.smaato.sdk.video.vast.model.C11130Ad;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.inmobi.media.ho */
/* compiled from: TelemetryOnAdImpression */
public final class C6173ho {

    /* renamed from: a */
    C6166hj f15588a;

    /* renamed from: b */
    String f15589b;

    /* renamed from: c */
    String f15590c;

    /* renamed from: d */
    public String f15591d;

    public C6173ho(C6166hj hjVar, String str, String str2) {
        this.f15588a = hjVar;
        this.f15589b = str;
        this.f15590c = str2;
    }

    /* renamed from: e */
    private Map<String, Object> m18290e() {
        HashMap hashMap = new HashMap();
        C6166hj hjVar = this.f15588a;
        if (hjVar != null) {
            hashMap.put(C11130Ad.AD_TYPE, hjVar.f15568a.mo34479k());
            hashMap.put("plId", Long.valueOf(this.f15588a.f15568a.mo34475i().mo34723e()));
            hashMap.put("plType", this.f15588a.f15568a.mo34475i().mo34736p());
        }
        String str = this.f15589b;
        if (str != null) {
            hashMap.put("creativeId", str);
        }
        hashMap.put("markupType", this.f15590c);
        hashMap.put("trigger", this.f15591d);
        return hashMap;
    }

    /* renamed from: a */
    public final void mo35382a() {
        C6166hj hjVar = this.f15588a;
        if (hjVar != null && !hjVar.f15569b.f15592a.getAndSet(true)) {
            Map<String, Object> e = m18290e();
            e.put("networkType", C6210ik.m18428b());
            e.put(IronSourceConstants.EVENTS_ERROR_CODE, (byte) 0);
            C6168hl.m18270a().mo35377a("AdImpressionSuccessful", e);
        }
    }

    /* renamed from: b */
    public final void mo35384b() {
        C6166hj hjVar = this.f15588a;
        if (hjVar != null && !hjVar.f15569b.f15592a.getAndSet(true)) {
            Map<String, Object> e = m18290e();
            e.put("networkType", C6210ik.m18428b());
            e.put(IronSourceConstants.EVENTS_ERROR_CODE, (byte) 96);
            C6168hl.m18270a().mo35377a("AdImpressionSuccessful", e);
        }
    }

    /* renamed from: c */
    public final void mo35385c() {
        C6166hj hjVar = this.f15588a;
        if (hjVar != null && !hjVar.f15569b.f15592a.getAndSet(true)) {
            Map<String, Object> e = m18290e();
            e.put("networkType", C6210ik.m18428b());
            e.put(IronSourceConstants.EVENTS_ERROR_CODE, (byte) 99);
            C6168hl.m18270a().mo35377a("AdImpressionSuccessful", e);
        }
    }

    /* renamed from: d */
    public final void mo35386d() {
        C6166hj hjVar = this.f15588a;
        if (hjVar != null && !hjVar.f15569b.f15592a.getAndSet(true)) {
            Map<String, Object> e = m18290e();
            e.put("networkType", C6210ik.m18428b());
            e.put(IronSourceConstants.EVENTS_ERROR_CODE, (byte) 98);
            C6168hl.m18270a().mo35377a("AdImpressionSuccessful", e);
        }
    }

    /* renamed from: a */
    public final void mo35383a(String str) {
        Map<String, Object> e = m18290e();
        e.put("networkType", Integer.valueOf(C6210ik.m18422a()));
        e.put(IronSourceConstants.EVENTS_ERROR_CODE, (byte) 97);
        e.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        C6168hl.m18270a().mo35377a("AdImpressionSuccessful", e);
    }
}
