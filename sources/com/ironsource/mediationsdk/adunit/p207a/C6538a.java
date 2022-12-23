package com.ironsource.mediationsdk.adunit.p207a;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.ironsource.environment.C6363a;
import com.ironsource.environment.C6372c;
import com.ironsource.environment.C6393h;
import com.ironsource.environment.C6398k;
import com.ironsource.environment.p202c.C6373a;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.adunit.a.a */
public class C6538a {
    /* renamed from: a */
    public static int m19814a(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return IronSourceError.ERROR_IS_INIT_EXCEPTION;
        }
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return IronSourceError.ERROR_RV_INIT_EXCEPTION;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + ad_unit);
        return IronSourceError.ERROR_CODE_GENERIC;
    }

    /* renamed from: a */
    public static void m19815a(Context context) {
        C6373a aVar = C6373a.C6375a.f16146a;
        if (context != null) {
            try {
                if (!aVar.f16143c.getAndSet(true)) {
                    aVar.mo35884a("auid", C6393h.m19144y(context));
                    aVar.mo35884a(DeviceRequestsHelper.DEVICE_INFO_MODEL, C6393h.m19113g());
                    aVar.mo35884a("make", C6393h.m19115h());
                    aVar.mo35884a("os", C6393h.m19117i());
                    String e = C6393h.m19109e();
                    if (e != null) {
                        aVar.mo35884a("osv", e.replaceAll("[^0-9/.]", ""));
                        aVar.mo35884a("osvf", e);
                    }
                    aVar.mo35884a("apilvl", String.valueOf(C6393h.m19111f()));
                    String i = C6393h.m19118i(context);
                    if (!TextUtils.isEmpty(i)) {
                        aVar.mo35884a("carrier", i);
                    }
                    String d = C6372c.m19034d(context);
                    if (!TextUtils.isEmpty(d)) {
                        aVar.mo35884a("instlr", d);
                    }
                    String A = C6393h.m19088A(context);
                    if (!TextUtils.isEmpty(A)) {
                        aVar.mo35884a("dt", A);
                    }
                    aVar.mo35884a(BidResponsed.KEY_BID_ID, context.getPackageName());
                    aVar.mo35884a("mem", String.valueOf(C6393h.m19106d(context)));
                    aVar.mo35884a("tkv", "2.0");
                    aVar.mo35884a("tsu", Long.valueOf(C6372c.m19030b(context)));
                    aVar.mo35884a("tai", Long.valueOf(C6372c.m19027a(context)));
                    aVar.mo35884a("apv", C6372c.m19032c(context));
                    aVar.mo35884a("ptype", Integer.valueOf(C6363a.C63641.m19020f(context)));
                    aVar.mo35884a("simop", C6363a.C63641.m19019e(context));
                    aVar.mo35884a("stid", C6398k.m19150b(context));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        aVar.mo35885b(context);
    }

    /* renamed from: a */
    public static void m19816a(String str, Object obj) {
        C6373a.C6375a.f16146a.mo35884a(str, obj);
    }

    /* renamed from: a */
    public static void m19817a(String str, JSONObject jSONObject) {
        C6373a aVar = C6373a.C6375a.f16146a;
        if (jSONObject != null) {
            try {
                Object obj = aVar.f16141a.get(str);
                if (!(obj instanceof JSONObject)) {
                    aVar.mo35884a(str, jSONObject);
                    return;
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject2.putOpt(next, jSONObject.opt(next));
                }
                aVar.mo35884a(str, jSONObject2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m19818a(Map<String, Object> map) {
        C6373a aVar = C6373a.C6375a.f16146a;
        if (map != null) {
            try {
                for (String next : map.keySet()) {
                    if (map.containsKey(next)) {
                        aVar.mo35884a(next, map.get(next));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static int m19819b(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return 1037;
        }
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return 1027;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + ad_unit);
        return IronSourceError.ERROR_CODE_GENERIC;
    }
}
