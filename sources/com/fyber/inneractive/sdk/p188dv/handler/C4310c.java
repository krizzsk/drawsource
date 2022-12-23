package com.fyber.inneractive.sdk.p188dv.handler;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.C4507o;
import com.fyber.inneractive.sdk.network.C4511q;
import com.fyber.inneractive.sdk.p188dv.C4306g;
import com.fyber.inneractive.sdk.p188dv.enums.C4304a;
import com.fyber.inneractive.sdk.response.C5233e;
import com.fyber.inneractive.sdk.util.C5299n;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.query.QueryInfo;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.dv.handler.c */
public class C4310c extends C4307a<QueryInfo> {

    /* renamed from: a */
    public final HashMap<AdFormat, QueryInfo> f10572a = new HashMap<>();

    /* renamed from: b */
    public boolean f10573b = false;

    /* renamed from: c */
    public final Object f10574c = new Object();

    /* renamed from: d */
    public int f10575d = 0;

    /* renamed from: com.fyber.inneractive.sdk.dv.handler.c$a */
    public static /* synthetic */ class C4311a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10576a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType[] r0 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10576a = r0
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.BANNER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10576a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.MRECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10576a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.p188dv.handler.C4310c.C4311a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo24326a() {
        for (AdFormat adFormat : AdFormat.values()) {
            if (adFormat != AdFormat.NATIVE) {
                C5299n.m16520a(new C4308b(this, adFormat));
            }
        }
    }

    /* renamed from: a */
    public C4306g mo24325a(UnitDisplayType unitDisplayType) {
        AdFormat adFormat;
        C4306g gVar;
        int i = C4311a.f10576a[unitDisplayType.ordinal()];
        if (i == 1 || i == 2) {
            adFormat = AdFormat.BANNER;
        } else if (i != 3) {
            adFormat = AdFormat.INTERSTITIAL;
        } else {
            adFormat = AdFormat.REWARDED;
        }
        QueryInfo queryInfo = this.f10572a.get(adFormat);
        if (queryInfo != null) {
            synchronized (this.f10574c) {
                this.f10572a.remove(adFormat);
            }
            gVar = new C4306g(queryInfo);
        } else {
            gVar = null;
        }
        IAlog.m16446a("DVHanlder - get query: %s", gVar);
        C5299n.m16520a(new C4308b(this, adFormat));
        return gVar;
    }

    /* renamed from: a */
    public static void m13358a(String str, C4304a aVar, InneractiveAdRequest inneractiveAdRequest, C5233e eVar, String str2) {
        String str3;
        IAlog.m16446a(String.format("Firing Event 1001 -Phase - %s  Fetch error DV - msg  %s", new Object[]{aVar.name(), str2}), new Object[0]);
        C4507o oVar = C4507o.DV_ERROR_PHASE;
        C4511q.C4512a aVar2 = new C4511q.C4512a(eVar);
        aVar2.f11163b = oVar;
        aVar2.f11162a = inneractiveAdRequest;
        aVar2.f11165d = null;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("spot_id", str);
        } catch (Exception unused) {
            IAlog.m16450e("Got exception adding param to json object: %s, %s", "spot_id", str);
        }
        String lowerCase = aVar.name().toLowerCase();
        try {
            jSONObject.put("phase", lowerCase);
        } catch (Exception unused2) {
            IAlog.m16450e("Got exception adding param to json object: %s, %s", "phase", lowerCase);
        }
        try {
            str3 = MobileAds.getVersionString();
        } catch (Exception unused3) {
            str3 = "na";
        }
        try {
            jSONObject.put("version", str3);
        } catch (Exception unused4) {
            IAlog.m16450e("Got exception adding param to json object: %s, %s", "version", str3);
        }
        try {
            jSONObject.put("message", str2);
        } catch (Exception unused5) {
            IAlog.m16450e("Got exception adding param to json object: %s, %s", "message", str2);
        }
        aVar2.f11167f.put(jSONObject);
        aVar2.mo24693a((String) null);
    }
}
