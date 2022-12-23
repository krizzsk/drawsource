package com.inmobi.media;

import com.google.android.gms.measurement.AppMeasurement;
import com.inmobi.media.C6094fv;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.smaato.sdk.core.injections.CoreLightModuleInterface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.gj */
/* compiled from: CrashComponent */
public class C6130gj implements C6094fv.C6097c, C6145gt {

    /* renamed from: a */
    public static AtomicBoolean f15441a = new AtomicBoolean(false);

    /* renamed from: e */
    private static final String f15442e = C6130gj.class.getSimpleName();

    /* renamed from: b */
    public C6111gd f15443b;

    /* renamed from: c */
    public C6133gk f15444c;

    /* renamed from: d */
    public String f15445d;

    /* renamed from: f */
    private C6139gq f15446f;

    /* renamed from: com.inmobi.media.gj$a */
    /* compiled from: CrashComponent */
    static class C6132a {

        /* renamed from: a */
        static final C6130gj f15449a = new C6130gj((byte) 0);
    }

    /* synthetic */ C6130gj(byte b) {
        this();
    }

    /* renamed from: a */
    public static C6130gj m18161a() {
        return C6132a.f15449a;
    }

    private C6130gj() {
        Thread.setDefaultUncaughtExceptionHandler(new C6135gm(Thread.getDefaultUncaughtExceptionHandler()));
        this.f15444c = new C6133gk();
        this.f15443b = (C6111gd) C6093fu.m18077a("crashReporting", (String) null);
    }

    /* renamed from: a */
    public void mo34420a(C6093fu fuVar) {
        C6111gd gdVar = (C6111gd) fuVar;
        this.f15443b = gdVar;
        this.f15445d = gdVar.url;
    }

    /* renamed from: a */
    public final void mo35310a(final C6167hk hkVar) {
        if (this.f15443b.catchEnabled) {
            C6183hw.m18316a((Runnable) new Runnable() {
                public final void run() {
                    C6130gj.this.mo35309a((C6134gl) hkVar);
                    C6130gj.this.mo35311b();
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo35309a(C6134gl glVar) {
        if (!(glVar instanceof C6167hk)) {
            if (this.f15443b.crashEnabled) {
                C6168hl.m18270a().mo35377a("CrashEventOccurred", (Map<String, Object>) new HashMap());
            } else {
                return;
            }
        }
        this.f15444c.mo35318b(this.f15443b.eventTTL);
        if ((this.f15444c.mo35314a() + 1) - this.f15443b.maxEventsToPersist >= 0) {
            C6133gk.m18171b();
        }
        C6133gk.m18170a(glVar);
    }

    /* renamed from: b */
    public final void mo35311b() {
        if (!f15441a.get()) {
            C6111gd gdVar = this.f15443b;
            int i = gdVar.maxRetryCount;
            long j = gdVar.eventTTL;
            long j2 = gdVar.processingInterval;
            long j3 = gdVar.txLatency;
            int i2 = gdVar.networkType.wifi.minBatchSize;
            int i3 = gdVar.networkType.wifi.maxBatchSize;
            int i4 = gdVar.networkType.others.minBatchSize;
            int i5 = gdVar.networkType.others.maxBatchSize;
            int i6 = i4;
            long j4 = gdVar.networkType.wifi.retryInterval;
            long j5 = gdVar.networkType.others.retryInterval;
            C6136gn gnVar = r2;
            C6136gn gnVar2 = new C6136gn(i, j, j2, j3, i2, i3, i6, i5, j4, j5);
            gnVar.f15464e = this.f15445d;
            gnVar.f15461b = CoreLightModuleInterface.NAME_DEFAULT_HTTP_HANDLER;
            C6139gq gqVar = this.f15446f;
            if (gqVar == null) {
                this.f15446f = new C6139gq(this.f15444c, this, gnVar);
            } else {
                gqVar.mo35324a(gnVar);
            }
            this.f15446f.mo35327a(CoreLightModuleInterface.NAME_DEFAULT_HTTP_HANDLER, false);
        }
    }

    /* renamed from: c */
    public final C6138gp mo35312c() {
        int i;
        if (C6210ik.m18422a() != 1) {
            i = this.f15443b.networkType.others.maxBatchSize;
        } else {
            i = this.f15443b.networkType.wifi.maxBatchSize;
        }
        List<C6134gl> a = C6133gk.m18169a(i);
        if (!a.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (C6134gl glVar : a) {
                arrayList.add(Integer.valueOf(glVar.f15452a));
            }
            String a2 = m18162a(a);
            if (a2 != null) {
                return new C6138gp(arrayList, a2);
            }
        }
        return null;
    }

    /* renamed from: a */
    private static String m18162a(List<C6134gl> list) {
        try {
            HashMap hashMap = new HashMap(C6210ik.m18426a(false));
            hashMap.put("im-accid", C6183hw.m18332f());
            hashMap.put("version", "2.0.0");
            hashMap.put("component", AppMeasurement.CRASH_ORIGIN);
            hashMap.put("mk-version", C6184hx.m18342a());
            hashMap.putAll(C6205ii.m18418a().f15656c);
            JSONObject jSONObject = new JSONObject(hashMap);
            JSONArray jSONArray = new JSONArray();
            for (C6134gl next : list) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("eventId", next.f15453b);
                jSONObject2.put("eventType", next.f15454c);
                if (!next.mo35321a().trim().isEmpty()) {
                    jSONObject2.put("crash_report", next.mo35321a());
                }
                jSONObject2.put(CampaignEx.JSON_KEY_ST_TS, next.f15456e);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put(AppMeasurement.CRASH_ORIGIN, jSONArray);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }
}
