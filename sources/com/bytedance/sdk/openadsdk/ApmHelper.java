package com.bytedance.sdk.openadsdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.amazon.aps.shared.APSAnalytics;
import com.apm.insight.MonitorCrash;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.core.C3472j;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p153i.C3471f;
import com.tapjoy.TapjoyConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ApmHelper {

    /* renamed from: a */
    private static boolean f6620a = false;

    /* renamed from: b */
    private static String f6621b;

    /* renamed from: c */
    private static boolean f6622c;

    public static void initApm(Context context, TTAdConfig tTAdConfig) {
        if (!f6620a) {
            C3471f h = C3513m.m10973h();
            boolean B = h.mo19825B();
            f6622c = B;
            if (B && !TextUtils.isEmpty(h.mo19878r())) {
                f6621b = tTAdConfig.getAppId();
                String[] strArr = {"com.bytedance.sdk", "com.com.bytedance.overseas.sdk", "com.pgl.sys.ces", "com.bykv.vk"};
                String a = C3472j.m10774a(context);
                String r = h.mo19878r();
                try {
                    MonitorCrash initSDK = MonitorCrash.initSDK(context, "10000001", 4507, BuildConfig.VERSION_NAME, strArr);
                    initSDK.config().setDeviceId(a);
                    initSDK.setReportUrl(r);
                    initSDK.addTags("host_appid", f6621b);
                    initSDK.addTags("sdk_version", BuildConfig.VERSION_NAME);
                    f6620a = true;
                    m8259b(a, r);
                } catch (Throwable unused) {
                    C2905l.m8117d("ApmHelper", "init Apm fail or not include Apm module");
                    f6620a = false;
                }
            }
        }
    }

    /* renamed from: a */
    private static void m8258a(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            C3513m.m10971f().mo19987a(m8257a(str), "https://" + str2 + "/monitor/collect/c/session?version_code=" + BuildConfig.VERSION_CODE + "&device_platform=android&aid=" + "10000001");
        }
    }

    /* renamed from: b */
    private static void m8259b(String str, String str2) {
        m8258a(str, str2);
    }

    public static void reportPvFromBackGround() {
        if (f6622c) {
            m8258a(C3472j.m10774a(C3513m.m10963a()), C3513m.m10973h().mo19878r());
        }
    }

    /* renamed from: a */
    private static JSONObject m8257a(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject3.put("host_app_id", f6621b);
            jSONObject2.putOpt("custom", jSONObject3);
            jSONObject2.put("os", APSAnalytics.OS_NAME);
            jSONObject2.put(TapjoyConstants.TJC_DEVICE_OS_VERSION_NAME, Build.VERSION.RELEASE);
            jSONObject2.put("device_model", Build.MODEL);
            jSONObject2.put("device_brand", Build.BRAND);
            jSONObject2.put("sdk_version_name", "0.0.5");
            jSONObject2.put("channel", "release");
            jSONObject2.put("aid", "10000001");
            jSONObject2.put("update_version_code", BuildConfig.VERSION_CODE);
            jSONObject2.put("bd_did", str);
            jSONObject.putOpt("header", jSONObject2);
            jSONObject.putOpt("local_time", Long.valueOf(System.currentTimeMillis()));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject().put("local_time_ms", System.currentTimeMillis()));
            jSONObject.putOpt("launch", jSONArray);
        } catch (JSONException e) {
            C2905l.m8118e("ApmHelper", e.getMessage());
        }
        return jSONObject;
    }

    public static boolean isIsInit() {
        return f6620a;
    }
}
