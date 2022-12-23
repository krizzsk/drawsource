package com.ironsource.mediationsdk;

import android.content.Context;
import android.util.Log;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.p202c.C6373a;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.C6745k;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.r */
public class C6689r {

    /* renamed from: com.ironsource.mediationsdk.r$a */
    interface C6690a {
        /* renamed from: a */
        void mo36269a(Map<String, Object> map, List<String> list, StringBuilder sb);
    }

    /* renamed from: com.ironsource.mediationsdk.r$b */
    interface C6691b {
        /* renamed from: a */
        void mo36266a();

        /* renamed from: a */
        void mo36267a(String str);
    }

    /* renamed from: a */
    public static JSONObject m20300a(Context context, String[] strArr) {
        JSONObject jSONObject = new JSONObject();
        JSONObject a = C6373a.C6375a.f16146a.mo35883a(context);
        for (String str : strArr) {
            if (a.has(str)) {
                jSONObject.put(str, a.opt(str));
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static JSONObject m20301a(String[] strArr) {
        JSONObject jSONObject = new JSONObject();
        JSONObject a = C6373a.C6375a.f16146a.mo35883a(ContextProvider.getInstance().getApplicationContext());
        for (String str : strArr) {
            if (a.has(str)) {
                jSONObject.put(str, a.opt(str));
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    static void m20302a(String str, ConcurrentHashMap<String, C6492V> concurrentHashMap, C6690a aVar) {
        StringBuilder sb;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        if (!C6745k.m20449b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), str)) {
            for (C6492V next : concurrentHashMap.values()) {
                if (next.mo36385h()) {
                    Map<String, Object> c = next.mo36274c();
                    if (c != null) {
                        hashMap.put(next.mo36388k(), c);
                        sb = new StringBuilder("2");
                    } else {
                        next.mo36271a((int) IronSourceConstants.TROUBLESHOOTING_BN_BIDDING_DATA_MISSING, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Missing bidding data"}});
                    }
                } else if (!next.mo36385h()) {
                    arrayList.add(next.mo36388k());
                    sb = new StringBuilder("1");
                }
                sb.append(next.mo36388k());
                sb.append(",");
                sb2.append(sb.toString());
            }
        }
        aVar.mo36269a(hashMap, arrayList, sb2);
    }

    /* renamed from: a */
    public static void m20303a(Map<String, Object> map, ISBannerSize iSBannerSize) {
        int i;
        try {
            String description = iSBannerSize.getDescription();
            char c = 65535;
            switch (description.hashCode()) {
                case -387072689:
                    if (description.equals("RECTANGLE")) {
                        c = 2;
                        break;
                    }
                    break;
                case 72205083:
                    if (description.equals("LARGE")) {
                        c = 1;
                        break;
                    }
                    break;
                case 79011241:
                    if (description.equals("SMART")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1951953708:
                    if (description.equals("BANNER")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1999208305:
                    if (description.equals("CUSTOM")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                i = 1;
            } else if (c == 1) {
                i = 2;
            } else if (c == 2) {
                i = 3;
            } else if (c == 3) {
                i = 5;
            } else if (c == 4) {
                map.put("bannerAdSize", 6);
                map.put("custom_banner_size", iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight());
                return;
            } else {
                return;
            }
            map.put("bannerAdSize", i);
        } catch (Exception e) {
            IronLog.INTERNAL.error(Log.getStackTraceString(e));
        }
    }

    /* renamed from: a */
    static boolean m20304a(IronSourceBannerLayout ironSourceBannerLayout) {
        return ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed();
    }

    /* renamed from: a */
    public JSONObject mo36834a(ArrayList<String> arrayList) {
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        JSONObject jSONObject = new JSONObject();
        JSONObject a = C6373a.C6375a.f16146a.mo35883a(applicationContext);
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (a.has(next)) {
                jSONObject.put(next, a.opt(next));
            }
        }
        return jSONObject;
    }
}
