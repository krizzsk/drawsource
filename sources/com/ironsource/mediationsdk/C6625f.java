package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import com.ironsource.environment.C6372c;
import com.ironsource.environment.C6393h;
import com.ironsource.environment.C6402l;
import com.ironsource.environment.p200a.C6368b;
import com.ironsource.environment.p204e.C6387c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.p206a.C6517c;
import com.ironsource.mediationsdk.p206a.C6522h;
import com.ironsource.mediationsdk.p216c.C6621b;
import com.ironsource.mediationsdk.server.C6729b;
import com.ironsource.mediationsdk.utils.C6736c;
import com.ironsource.mediationsdk.utils.C6741g;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.p199d.C6356a;
import com.tapjoy.TapjoyConstants;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.f */
public final class C6625f {

    /* renamed from: b */
    private static C6625f f17173b = new C6625f();

    /* renamed from: a */
    private final AtomicBoolean f17174a = new AtomicBoolean(false);

    /* renamed from: com.ironsource.mediationsdk.f$a */
    public static class C6626a {

        /* renamed from: a */
        String f17175a;

        /* renamed from: b */
        List<C6729b> f17176b;

        /* renamed from: c */
        C6729b f17177c;

        /* renamed from: d */
        JSONObject f17178d;

        /* renamed from: e */
        JSONObject f17179e;

        /* renamed from: f */
        int f17180f;

        /* renamed from: g */
        String f17181g;
    }

    /* renamed from: com.ironsource.mediationsdk.f$b */
    static class C6627b implements Runnable {

        /* renamed from: a */
        private String f17182a;

        /* renamed from: b */
        private String f17183b;

        /* renamed from: c */
        private String f17184c;

        public C6627b(String str, String str2, String str3) {
            this.f17182a = str;
            this.f17183b = str2;
            this.f17184c = str3;
        }

        public final void run() {
            boolean z = false;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f17184c).openConnection();
                httpURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                httpURLConnection.disconnect();
                if (responseCode == 200 || responseCode == 204) {
                    z = true;
                }
            } catch (Exception unused) {
                IronLog.INTERNAL.error("exception - e");
            }
            if (!z) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
                    jSONObject.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
                    jSONObject.put(IronSourceConstants.EVENTS_EXT1, this.f17182a + ";" + this.f17183b + ";" + this.f17184c);
                } catch (JSONException e) {
                    e.printStackTrace();
                    IronLog.INTERNAL.error("Send auction failure exception " + e.getMessage());
                }
                C6522h.m19751d().mo36349b(new C6517c(IronSourceConstants.TROUBLESHOOTING_FAILED_TO_SEND_AUCTION_URL, jSONObject));
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.f$c */
    enum C6628c {
        ;
        

        /* renamed from: a */
        public static final int f17185a = 1;

        /* renamed from: b */
        public static final int f17186b = 2;

        static {
            f17187c = new int[]{1, 2};
        }
    }

    /* renamed from: a */
    static C6626a m20162a(JSONObject jSONObject) {
        String optString = jSONObject.optString("auctionId");
        if (!TextUtils.isEmpty(optString)) {
            C6626a aVar = new C6626a();
            aVar.f17175a = optString;
            JSONObject jSONObject2 = null;
            if (jSONObject.has("settings")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("settings");
                aVar.f17177c = new C6729b(jSONObject3);
                if (jSONObject3.has("armData")) {
                    jSONObject2 = jSONObject3.optJSONObject("armData");
                }
                if (jSONObject3.has(IronSourceConstants.EVENTS_GENERIC_PARAMS)) {
                    aVar.f17178d = jSONObject3.optJSONObject(IronSourceConstants.EVENTS_GENERIC_PARAMS);
                }
                if (jSONObject3.has(TapjoyConstants.PREF_SERVER_PROVIDED_CONFIGURATIONS)) {
                    aVar.f17179e = jSONObject3.optJSONObject(TapjoyConstants.PREF_SERVER_PROVIDED_CONFIGURATIONS);
                }
            }
            aVar.f17176b = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("waterfall");
            int i = 0;
            while (i < jSONArray.length()) {
                C6729b bVar = new C6729b(jSONArray.getJSONObject(i), jSONObject2);
                if (bVar.mo36948g()) {
                    aVar.f17176b.add(bVar);
                    i++;
                } else {
                    aVar.f17180f = 1002;
                    aVar.f17181g = "waterfall " + i;
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("AuctionResponseItem " + i + " not valid - parsing error");
                    throw new JSONException("invalid response");
                }
            }
            return aVar;
        }
        throw new JSONException("Invalid auction response - auction id is missing");
    }

    /* renamed from: a */
    public static C6625f m20163a() {
        return f17173b;
    }

    /* renamed from: a */
    public static C6729b m20164a(String str, List<C6729b> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).mo36942a().equals(str)) {
                return list.get(i);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m20165a(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7) {
        return str.replace("${AUCTION_PRICE}", str4).replace("${AUCTION_LOSS}", str6).replace("${AUCTION_MBR}", str5).replace("${INSTANCE}", str2).replace("${INSTANCE_TYPE}", Integer.toString(i)).replace("${DYNAMIC_DEMAND_SOURCE}", str3).replace("${PLACEMENT_NAME}", str7);
    }

    /* renamed from: a */
    static JSONObject m20166a(String str) {
        try {
            return new JSONObject(IronSourceAES.decode(C6741g.m20413a().mo36969b(), str));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static JSONObject m20167a(JSONObject jSONObject, List<String> list) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    if (list.contains(next)) {
                        jSONObject2.put(next, jSONObject.opt(next));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return jSONObject2;
    }

    /* renamed from: a */
    static void m20168a(String str, String str2, String str3) {
        C6387c.f16171a.mo35897c(new C6627b(str, str2, str3));
    }

    /* renamed from: a */
    private void m20169a(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        if (jSONObject2 != null) {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (jSONObject.has(next)) {
                    int i = 0;
                    str = next;
                    while (jSONObject.has(str)) {
                        i++;
                        str = next + "_" + i;
                    }
                } else {
                    str = next;
                }
                try {
                    jSONObject.put(str, jSONObject2.opt(next));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (((com.ironsource.environment.ContextProvider.getInstance().getApplicationContext().getApplicationInfo().flags & 134217728) != 0) != false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (android.security.NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() != false) goto L_0x0034;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m20170b() {
        /*
            int r0 = com.ironsource.mediationsdk.C6625f.C6628c.f17186b
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x0016
            android.security.NetworkSecurityPolicy r0 = android.security.NetworkSecurityPolicy.getInstance()
            boolean r0 = r0.isCleartextTrafficPermitted()
            if (r0 == 0) goto L_0x0013
            goto L_0x0034
        L_0x0013:
            int r0 = com.ironsource.mediationsdk.C6625f.C6628c.f17186b
            goto L_0x0036
        L_0x0016:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x0034
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()
            android.content.Context r0 = r0.getApplicationContext()
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r0 = r0.flags
            r1 = 134217728(0x8000000, float:3.85186E-34)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0031
            r0 = 1
            goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            if (r0 == 0) goto L_0x0013
        L_0x0034:
            int r0 = com.ironsource.mediationsdk.C6625f.C6628c.f17185a
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6625f.m20170b():int");
    }

    /* renamed from: b */
    public static Map<String, String> m20171b(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("params")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = jSONObject2.get(next);
                    if (obj instanceof String) {
                        hashMap.put(next, (String) obj);
                    }
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("exception " + e.getMessage());
        }
        return hashMap;
    }

    /* renamed from: b */
    private JSONObject m20172b(JSONObject jSONObject, List<String> list) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    HashMap<String, String> hashMap = C6402l.f16201b;
                    String str = hashMap.containsKey(next) ? hashMap.get(next) : next;
                    if ((list.isEmpty() && !C6402l.f16200a.contains(str) && !str.startsWith("metadata_")) || list.contains(str)) {
                        jSONObject2.put(str, jSONObject.opt(next));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return jSONObject2;
    }

    /* renamed from: c */
    public static String m20173c(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            JSONObject jSONObject = new JSONObject(str);
            return jSONObject.has("adMarkup") ? jSONObject.getString("adMarkup") : str;
        } catch (JSONException e) {
            e.printStackTrace();
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("exception " + e.getMessage());
            return str;
        }
    }

    /* renamed from: d */
    public static String m20174d(String str) {
        try {
            if (TextUtils.isEmpty(str) || !C6621b.m20127a(str)) {
                return "";
            }
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("params")) {
                return "";
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("parameters = " + jSONObject2);
            if (!jSONObject2.has(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID)) {
                return "";
            }
            String string = jSONObject2.getString(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID);
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.verbose("demand source = " + string);
            return string;
        } catch (JSONException e) {
            e.printStackTrace();
            IronLog ironLog3 = IronLog.INTERNAL;
            ironLog3.error("exception " + e.getMessage());
            return "";
        }
    }

    /* renamed from: a */
    public final String mo36656a(String str, int i, C6729b bVar, String str2, String str3, String str4) {
        String str5;
        String c = bVar.mo36944c();
        if (!TextUtils.isEmpty(c) && !TextUtils.isEmpty(str2)) {
            double parseDouble = Double.parseDouble(c);
            double parseDouble2 = Double.parseDouble(str2);
            if (parseDouble2 != 0.0d) {
                str5 = String.valueOf(((double) Math.round((parseDouble / parseDouble2) * 1000.0d)) / 1000.0d);
                return m20165a(str, bVar.mo36942a(), i, m20174d(bVar.mo36943b()), c, str5, str3, str4);
            }
        }
        str5 = "";
        return m20165a(str, bVar.mo36942a(), i, m20174d(bVar.mo36943b()), c, str5, str3, str4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final JSONObject mo36657a(Context context, Map<String, Object> map, List<String> list, C6636j jVar, int i, String str, C6736c cVar, ISBannerSize iSBannerSize, JSONObject jSONObject) {
        String str2;
        String str3;
        boolean z;
        C6636j jVar2 = jVar;
        JSONObject jSONObject2 = jSONObject;
        JSONObject jSONObject3 = new JSONObject();
        Iterator<String> it = map.keySet().iterator();
        while (true) {
            str2 = "";
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("instanceType", 2);
            Map<String, Object> map2 = map;
            jSONObject4.put("biddingAdditionalData", new JSONObject((Map) map.get(next)));
            if (jVar2 != null) {
                str2 = jVar2.mo36686a(next);
            }
            jSONObject4.put("performance", str2);
            jSONObject3.put(next, jSONObject4);
        }
        if (list != null) {
            for (String next2 : list) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("instanceType", 1);
                jSONObject5.put("performance", jVar2 != null ? jVar2.mo36686a(next2) : str2);
                jSONObject3.put(next2, jSONObject5);
            }
        }
        ConcurrentHashMap<String, List<String>> concurrentHashMap = C6622d.m20139a().f17162c;
        concurrentHashMap.putAll(C6356a.m18973a().mo35850d());
        JSONObject jSONObject6 = new JSONObject();
        for (Map.Entry next3 : concurrentHashMap.entrySet()) {
            jSONObject6.put((String) next3.getKey(), TextUtils.join(",", (Iterable) next3.getValue()));
        }
        mo36660a(new C6368b().mo35878a(), false);
        JSONObject jSONObject7 = new JSONObject();
        jSONObject7.put("applicationUserId", C6459L.m19304a().f16421k);
        Boolean bool = C6459L.m19304a().f16435y;
        if (bool != null) {
            jSONObject7.put("consent", bool.booleanValue() ? 1 : 0);
        }
        jSONObject7.put("mobileCarrier", C6393h.m19118i(context));
        jSONObject7.put("connectionType", IronSourceUtils.getConnectionType(context));
        jSONObject7.put("deviceOS", "android");
        jSONObject7.put("deviceWidth", context.getResources().getConfiguration().screenWidthDp);
        jSONObject7.put("deviceHeight", context.getResources().getConfiguration().screenHeightDp);
        jSONObject7.put("deviceOSVersion", Build.VERSION.SDK_INT + "(" + Build.VERSION.RELEASE + ")");
        jSONObject7.put("deviceModel", Build.MODEL);
        jSONObject7.put("deviceMake", Build.MANUFACTURER);
        jSONObject7.put("bundleId", context.getPackageName());
        Context context2 = context;
        jSONObject7.put("appVersion", C6372c.m19033c(context, context.getPackageName()));
        jSONObject7.put("clientTimestamp", new Date().getTime());
        jSONObject7.put("fs", IronSourceUtils.getFirstSession(context) ? 1 : 0);
        jSONObject7.put("browserUserAgent", C6393h.m19136r());
        jSONObject7.put("deviceType", IronSourceUtils.getDeviceType(context));
        jSONObject7.put("deviceLang", Locale.getDefault().getLanguage());
        jSONObject7.put("secure", m20170b() - 1);
        if (iSBannerSize != null) {
            jSONObject7.put("bannerSize", iSBannerSize.getDescription());
            jSONObject7.put("bannerWidth", iSBannerSize.getWidth());
            jSONObject7.put("bannerHeight", iSBannerSize.getHeight());
        }
        String[] C = C6393h.m19090C(context);
        if (C == null || C.length != 2) {
            z = false;
            str3 = str2;
        } else {
            str3 = !TextUtils.isEmpty(C[0]) ? C[0] : str2;
            z = Boolean.valueOf(C[1]).booleanValue();
        }
        if (!TextUtils.isEmpty(str3)) {
            str2 = IronSourceConstants.TYPE_GAID;
        } else {
            str3 = C6393h.m19143x(context);
            if (!TextUtils.isEmpty(str3)) {
                str2 = IronSourceConstants.TYPE_UUID;
            }
        }
        if (!TextUtils.isEmpty(str3)) {
            jSONObject7.put("advId", str3);
            jSONObject7.put("advIdType", str2);
            jSONObject7.put("isLimitAdTrackingEnabled", z ? "true" : "false");
        }
        String B = C6393h.m19089B(context);
        if (!TextUtils.isEmpty(B)) {
            jSONObject7.put("asid", B);
        }
        String y = C6393h.m19144y(context);
        if (!TextUtils.isEmpty(y)) {
            jSONObject7.put("auid", y);
        }
        JSONObject jSONObject8 = new JSONObject();
        jSONObject8.put("applicationKey", C6459L.m19304a().f16420j);
        jSONObject8.put("SDKVersion", IronSourceUtils.getSDKVersion());
        jSONObject8.put("clientParams", jSONObject7);
        jSONObject8.put(IronSourceConstants.KEY_SESSION_DEPTH, i);
        jSONObject8.put("sessionId", str);
        jSONObject8.put("instances", jSONObject3);
        jSONObject8.put("auctionData", cVar.f17570c);
        jSONObject8.put("metaData", jSONObject6);
        if (jSONObject2 != null) {
            jSONObject8.put("sg", jSONObject2);
        }
        return jSONObject8;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final JSONObject mo36658a(String str, boolean z, Map<String, Object> map, List<String> list, C6636j jVar, int i, ISBannerSize iSBannerSize, JSONObject jSONObject) {
        String str2;
        C6636j jVar2 = jVar;
        JSONObject jSONObject2 = jSONObject;
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        Iterator<String> it = map.keySet().iterator();
        while (true) {
            str2 = "";
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("instp", 2);
            Map<String, Object> map2 = map;
            jSONObject5.put("badt", new JSONObject((Map) map.get(next)));
            if (jVar2 != null) {
                str2 = jVar2.mo36686a(next);
            }
            jSONObject5.put("prfm", str2);
            jSONObject4.put(next, jSONObject5);
        }
        if (list != null) {
            for (String next2 : list) {
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("instp", 1);
                jSONObject6.put("prfm", jVar2 != null ? jVar2.mo36686a(next2) : str2);
                jSONObject4.put(next2, jSONObject6);
            }
        }
        jSONObject3.put("inst", jSONObject4);
        JSONObject a = new C6368b().mo35878a();
        mo36660a(a, false);
        a.put("sd", i);
        a.put("scr", m20170b() - 1);
        if (jSONObject2 != null) {
            a.put("sg", jSONObject2);
        }
        jSONObject3.put("ctdt", a);
        if (iSBannerSize != null) {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("bns", iSBannerSize.getDescription());
            jSONObject7.put("bnw", iSBannerSize.getWidth());
            jSONObject7.put("bnh", iSBannerSize.getHeight());
            jSONObject3.put("bndt", jSONObject7);
        }
        String str3 = str;
        jSONObject3.put("adu", str);
        jSONObject3.put("dner", z ^ true ? 1 : 0);
        return jSONObject3;
    }

    /* renamed from: a */
    public final JSONObject mo36659a(JSONObject jSONObject, JSONObject jSONObject2, List<String> list) {
        C6608al a = C6608al.m20084a();
        a.mo36612a(C6608al.m20089c());
        a.mo36612a(C6608al.m20088b());
        JSONObject a2 = m20167a(a.f17114a, list.isEmpty() ? C6402l.f16200a : list);
        m20169a(a2, m20172b(jSONObject, list));
        if (!list.isEmpty()) {
            jSONObject2 = m20167a(jSONObject2, list);
        }
        m20169a(a2, jSONObject2);
        return a2;
    }

    /* renamed from: a */
    public final void mo36660a(JSONObject jSONObject, boolean z) {
        if (jSONObject != null && jSONObject.length() > 0 && !TextUtils.isEmpty(jSONObject.optString("tcs")) && this.f17174a.compareAndSet(false, true)) {
            C6522h.m19751d().mo36349b(new C6517c(IronSourceConstants.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED, IronSourceUtils.getMediationAdditionalData(z, true, -1)));
        }
    }
}
