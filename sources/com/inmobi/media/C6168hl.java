package com.inmobi.media;

import android.content.ContentValues;
import com.inmobi.media.C6094fv;
import com.smaato.sdk.core.injections.CoreLightModuleInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.hl */
/* compiled from: TelemetryComponent */
public class C6168hl implements C6145gt {

    /* renamed from: a */
    public static AtomicBoolean f15571a = new AtomicBoolean(false);

    /* renamed from: b */
    public static double f15572b = Math.random();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final String f15573d = C6168hl.class.getSimpleName();

    /* renamed from: h */
    private static final ArrayList<String> f15574h = new ArrayList<>(Arrays.asList(new String[]{"AdLoadCalled", "AdLoadDroppedAtSDK", "AdLoadSuccessful", "AdLoadFailed", "ServerFill", "ServerNoFill", "ServerError", "AssetDownloaded", "AdShowCalled", "AdShowSuccessful", "AdShowFailed", "AdGetSignalsCalled", "AdGetSignalsSucceeded", "AdGetSignalsFailed", "UnifiedIdNetworkCallRequested", "UnifiedIdNetworkResponseFailure", "FetchApiInvoked", "FetchCallbackFailure ", "AdImpressionSuccessful"}));

    /* renamed from: c */
    public C6139gq f15575c;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C6126gi f15576e;

    /* renamed from: f */
    private C6171hm f15577f;

    /* renamed from: g */
    private String f15578g;

    /* renamed from: com.inmobi.media.hl$a */
    /* compiled from: TelemetryComponent */
    static class C6170a {

        /* renamed from: a */
        static final C6168hl f15582a = new C6168hl((byte) 0);
    }

    /* synthetic */ C6168hl(byte b) {
        this();
    }

    /* renamed from: a */
    public static C6168hl m18270a() {
        return C6170a.f15582a;
    }

    /* renamed from: b */
    public final void mo35378b() {
        f15571a.set(false);
        C6126gi giVar = (C6126gi) C6094fv.m18084a("telemetry", C6183hw.m18332f(), (C6094fv.C6097c) null);
        this.f15576e = giVar;
        this.f15578g = giVar.telemetryUrl;
        if (this.f15577f.mo35314a() > 0) {
            m18275e();
        }
    }

    private C6168hl() {
        this.f15577f = new C6171hm();
        C6126gi giVar = (C6126gi) C6093fu.m18077a("telemetry", (String) null);
        this.f15576e = giVar;
        this.f15578g = giVar.telemetryUrl;
    }

    /* renamed from: a */
    public final void mo35377a(final String str, final Map<String, Object> map) {
        C6183hw.m18316a((Runnable) new Runnable() {
            public final void run() {
                String unused = C6168hl.f15573d;
                try {
                    C6172hn hnVar = new C6172hn(str);
                    if (!map.isEmpty() && str.equals("AssetDownloaded")) {
                        for (Map.Entry entry : map.entrySet()) {
                            if ("assetType".equals(entry.getKey())) {
                                if ("image".equals(entry.getKey()) && !C6168hl.this.f15576e.assetReporting.image) {
                                    String unused2 = C6168hl.f15573d;
                                    return;
                                } else if ("gif".equals(entry.getKey()) && !C6168hl.this.f15576e.assetReporting.gif) {
                                    String unused3 = C6168hl.f15573d;
                                    return;
                                } else if ("video".equals(entry.getKey()) && !C6168hl.this.f15576e.assetReporting.video) {
                                    String unused4 = C6168hl.f15573d;
                                    return;
                                }
                            }
                        }
                    }
                    map.put("eventType", hnVar.f15585b);
                    map.put("eventId", UUID.randomUUID().toString());
                    hnVar.f15587d = map.toString();
                    C6168hl.m18272a(C6168hl.this, hnVar);
                } catch (Exception unused5) {
                    String unused6 = C6168hl.f15573d;
                }
            }
        });
    }

    /* renamed from: a */
    private void m18273a(C6172hn hnVar) {
        if (this.f15576e.base.enabled) {
            int a = (this.f15577f.mo35314a() + 1) - this.f15576e.maxEventsToPersist;
            if (a > 0) {
                C6171hm hmVar = this.f15577f;
                C6164hh a2 = C6164hh.m18246a();
                List<ContentValues> a3 = a2.mo35360a("telemetry", (String[]) null, (String) null, (String[]) null, (String) null, (String) null, "ts ASC", String.valueOf(a));
                ArrayList arrayList = new ArrayList();
                for (ContentValues next : a3) {
                    next.getAsString("id");
                    arrayList.add(Integer.valueOf(Integer.parseInt(next.getAsString("id"))));
                }
                hmVar.mo35315a((List<Integer>) arrayList);
                a2.mo35365b();
            }
            C6171hm.m18280a(hnVar);
        }
    }

    /* renamed from: e */
    private void m18275e() {
        if (!f15571a.get()) {
            C6136gn e = this.f15576e.mo35308e();
            e.f15464e = this.f15578g;
            e.f15461b = CoreLightModuleInterface.NAME_DEFAULT_HTTP_HANDLER;
            C6139gq gqVar = this.f15575c;
            if (gqVar == null) {
                this.f15575c = new C6139gq(this.f15577f, this, e);
            } else {
                gqVar.mo35324a(e);
            }
            this.f15575c.mo35327a(CoreLightModuleInterface.NAME_DEFAULT_HTTP_HANDLER, true);
        }
    }

    /* renamed from: c */
    public final C6138gp mo35312c() {
        List<C6172hn> list;
        if (C6210ik.m18422a() != 1) {
            list = C6171hm.m18279a(this.f15576e.networkType.others.maxBatchSize);
        } else {
            list = C6171hm.m18279a(this.f15576e.networkType.wifi.maxBatchSize);
        }
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (C6172hn hnVar : list) {
                arrayList.add(Integer.valueOf(hnVar.f15584a));
            }
            String a = m18271a(list);
            if (a != null) {
                return new C6138gp(arrayList, a);
            }
        }
        return null;
    }

    /* renamed from: a */
    private static String m18271a(List<C6172hn> list) {
        try {
            HashMap hashMap = new HashMap();
            String str = "";
            hashMap.put("im-accid", C6183hw.m18334g() != null ? C6183hw.m18334g() : str);
            if (C6183hw.m18336h() != null) {
                str = C6183hw.m18336h();
            }
            hashMap.put("as-accid", str);
            hashMap.put("version", "4.0.0");
            hashMap.put("mk-version", C6184hx.m18342a());
            hashMap.put("u-appbid", C6205ii.m18418a().f15654a);
            hashMap.put("tp", C6184hx.m18354g());
            if (C6184hx.m18353f() != null) {
                hashMap.put("tp-ver", C6184hx.m18353f());
            }
            JSONObject jSONObject = new JSONObject(hashMap);
            JSONArray jSONArray = new JSONArray();
            for (C6172hn next : list) {
                if (!next.mo35380a().trim().isEmpty()) {
                    jSONArray.put(new JSONObject(next.mo35380a()));
                }
            }
            jSONObject.put("payload", jSONArray);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m18272a(C6168hl hlVar, C6172hn hnVar) {
        if (!hlVar.f15576e.base.enabled) {
            return;
        }
        if (hlVar.f15576e.disableAllGeneralEvents && !hlVar.f15576e.priorityEvents.contains(hnVar.f15585b)) {
            return;
        }
        if (f15574h.contains(hnVar.f15585b) && f15572b < hlVar.f15576e.samplingFactor) {
            return;
        }
        if ("CrashEventOccurred".equals(hnVar.f15585b)) {
            hlVar.m18273a(hnVar);
            return;
        }
        hlVar.m18273a(hnVar);
        hlVar.m18275e();
    }
}
