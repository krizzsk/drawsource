package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.ironsource.environment.C6372c;
import com.ironsource.environment.C6393h;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.C6753o;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.p199d.C6356a;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.al */
final class C6608al {

    /* renamed from: b */
    private static C6608al f17113b;

    /* renamed from: a */
    JSONObject f17114a = new JSONObject();

    private C6608al() {
    }

    /* renamed from: a */
    public static synchronized C6608al m20084a() {
        C6608al alVar;
        synchronized (C6608al.class) {
            if (f17113b == null) {
                f17113b = new C6608al();
            }
            alVar = f17113b;
        }
        return alVar;
    }

    /* renamed from: a */
    private synchronized void m20087a(String str, Object obj) {
        try {
            this.f17114a.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    static JSONObject m20088b() {
        JSONObject jSONObject = new JSONObject();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        int k = C6393h.m19121k();
        int l = C6393h.m19124l();
        float o = C6393h.m19129o();
        if (applicationContext != null) {
            try {
                ConcurrentHashMap<String, List<String>> concurrentHashMap = C6622d.m20139a().f17162c;
                concurrentHashMap.putAll(C6356a.m18973a().mo35850d());
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry next : concurrentHashMap.entrySet()) {
                    jSONObject2.put((String) next.getKey(), next.getValue());
                }
                Boolean bool = C6459L.m19304a().f16435y;
                if (bool != null) {
                    jSONObject.put("consent", bool.booleanValue());
                }
                String B = C6393h.m19089B(applicationContext);
                if (!TextUtils.isEmpty(B)) {
                    jSONObject.put("asid", B);
                }
                jSONObject.put("connT", IronSourceUtils.getConnectionType(applicationContext));
                jSONObject.put("dVol", (double) C6393h.m19123l(applicationContext));
                jSONObject.put("root", C6393h.m19120j());
                jSONObject.put("bat", C6393h.m19141v(applicationContext));
                jSONObject.put("diskFS", C6393h.m19131p());
                jSONObject.put("MD", jSONObject2);
                jSONObject.put("cTime", new Date().getTime());
                jSONObject.put("dWidth", k);
                jSONObject.put("dHeight", l);
                jSONObject.put("dScrenScle", String.valueOf(o));
                jSONObject.put("sDepIS", C6753o.m20481a().mo36990b(2));
                jSONObject.put("sDepRV", C6753o.m20481a().mo36990b(1));
                jSONObject.put("UA", C6393h.m19136r());
            } catch (JSONException e) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("got the following error " + e.getMessage());
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    /* renamed from: c */
    static JSONObject m20089c() {
        JSONObject jSONObject = new JSONObject();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        if (applicationContext != null) {
            try {
                String language = applicationContext.getResources().getConfiguration().locale.getLanguage();
                if (!TextUtils.isEmpty(language)) {
                    jSONObject.put("dLang", language.toUpperCase(Locale.ENGLISH));
                }
                String pluginType = ConfigFile.getConfigFile().getPluginType();
                if (!TextUtils.isEmpty(pluginType)) {
                    jSONObject.put("plType", pluginType);
                }
                String e = C6393h.m19109e();
                if (e != null) {
                    jSONObject.put("dOSVF", e);
                    jSONObject.put("dOSV", e.replaceAll("[^0-9/.]", ""));
                }
                String y = C6393h.m19144y(applicationContext);
                if (y != null) {
                    jSONObject.put("auid", y);
                }
                jSONObject.put("sId", IronSourceUtils.getSessionId());
                jSONObject.put("appKey", C6459L.m19304a().f16420j);
                jSONObject.put("mCar", C6393h.m19118i(applicationContext));
                jSONObject.put("medV", IronSourceUtils.getSDKVersion());
                jSONObject.put("dModel", Build.MODEL);
                jSONObject.put("dOS", "android");
                jSONObject.put("dMake", Build.MANUFACTURER);
                jSONObject.put("dAPI", String.valueOf(Build.VERSION.SDK_INT));
                jSONObject.put("bId", applicationContext.getPackageName());
                jSONObject.put("appV", C6372c.m19033c(applicationContext, applicationContext.getPackageName()));
                jSONObject.put("usId", C6459L.m19304a().f16421k);
            } catch (JSONException e2) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("got the following error " + e2.getMessage());
                e2.printStackTrace();
            }
        }
        return jSONObject;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static JSONObject m20090d() {
        String str;
        boolean z;
        JSONObject jSONObject = new JSONObject();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        if (applicationContext != null) {
            String[] C = C6393h.m19090C(applicationContext);
            String str2 = "";
            if (C == null || C.length != 2) {
                z = false;
                str = str2;
            } else {
                str = !TextUtils.isEmpty(C[0]) ? C[0] : str2;
                z = Boolean.valueOf(C[1]).booleanValue();
            }
            if (!TextUtils.isEmpty(str)) {
                str2 = IronSourceConstants.TYPE_GAID;
            } else {
                str = C6393h.m19143x(applicationContext);
                if (!TextUtils.isEmpty(str)) {
                    str2 = IronSourceConstants.TYPE_UUID;
                }
            }
            try {
                jSONObject.put("advId", str);
                jSONObject.put("advType", str2);
                jSONObject.put("isLAT", z);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36612a(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            m20087a(next, jSONObject.opt(next));
        }
    }
}
