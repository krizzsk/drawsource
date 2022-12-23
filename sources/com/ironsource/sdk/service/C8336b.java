package com.ironsource.sdk.service;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.ironsource.environment.C6363a;
import com.ironsource.environment.C6372c;
import com.ironsource.environment.C6393h;
import com.ironsource.environment.C6398k;
import com.ironsource.p199d.C6356a;
import com.ironsource.sdk.utils.C8341a;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.service.b */
public class C8336b {

    /* renamed from: a */
    private static final String f20303a = C8336b.class.getSimpleName();

    /* renamed from: a */
    public static JSONObject m23717a(Context context) {
        SDKUtils.loadGoogleAdvertiserInfo(context);
        String advertiserId = SDKUtils.getAdvertiserId();
        Boolean valueOf = Boolean.valueOf(SDKUtils.isLimitAdTrackingEnabled());
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(advertiserId)) {
            try {
                Logger.m23749i(f20303a, "add AID and LAT");
                jSONObject.put("isLimitAdTrackingEnabled", valueOf);
                jSONObject.put("deviceIds" + "[AID" + "]", SDKUtils.encodeString(advertiserId));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static void m23718a(JSONObject jSONObject, String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put(str, SDKUtils.encodeString(str2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public static JSONObject m23719b(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            m23718a(jSONObject, "displaySizeWidth", String.valueOf(C6393h.m19121k()));
            m23718a(jSONObject, "displaySizeHeight", String.valueOf(C6393h.m19124l()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            String a = C6356a.m18974a(context);
            if (!TextUtils.isEmpty(a) && !a.equals("none")) {
                jSONObject.put(SDKUtils.encodeString("connectionType"), SDKUtils.encodeString(a));
            }
            if (Build.VERSION.SDK_INT >= 23) {
                jSONObject.put(SDKUtils.encodeString("hasVPN"), C6356a.m18979c(context));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            jSONObject.put(SDKUtils.encodeString("diskFreeSize"), SDKUtils.encodeString(String.valueOf(C6393h.m19131p())));
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        try {
            jSONObject.put(SDKUtils.encodeString("batteryLevel"), C6393h.m19141v(context));
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        try {
            jSONObject.put(SDKUtils.encodeString("lpm"), C6393h.m19142w(context));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        try {
            C8341a.m23755a(context);
            jSONObject.put(SDKUtils.encodeString("deviceVolume"), (double) C8341a.m23757b(context));
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        try {
            if (SDKUtils.getControllerConfigAsJSONObject().optBoolean("sdCardAvailable")) {
                jSONObject.put(SDKUtils.encodeString("sdCardAvailable"), C6393h.m19107d());
            }
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        try {
            if (SDKUtils.getControllerConfigAsJSONObject().optBoolean("isCharging")) {
                jSONObject.put(SDKUtils.encodeString("isCharging"), C6393h.m19110e(context));
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        try {
            if (SDKUtils.getControllerConfigAsJSONObject().optBoolean("chargingType")) {
                jSONObject.put(SDKUtils.encodeString("chargingType"), C6393h.m19112f(context));
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        try {
            if (SDKUtils.getControllerConfigAsJSONObject().optBoolean("airplaneMode")) {
                jSONObject.put(SDKUtils.encodeString("airplaneMode"), C6393h.m19114g(context));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        try {
            if (SDKUtils.getControllerConfigAsJSONObject().optBoolean("stayOnWhenPluggedIn")) {
                jSONObject.put(SDKUtils.encodeString("stayOnWhenPluggedIn"), C6393h.m19116h(context));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: c */
    public static JSONObject m23720c(Context context) {
        C8341a a = C8341a.m23755a(context);
        JSONObject jSONObject = new JSONObject();
        try {
            String str = a.f20323a;
            if (str != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOEM"), SDKUtils.encodeString(str));
            }
            String str2 = a.f20324b;
            if (str2 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceModel"), SDKUtils.encodeString(str2));
            }
            String str3 = a.f20325c;
            if (str3 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOs"), SDKUtils.encodeString(str3));
            }
            String str4 = a.f20326d;
            if (str4 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOSVersion"), str4.replaceAll("[^0-9/.]", ""));
            }
            String str5 = a.f20326d;
            if (str5 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOSVersionFull"), SDKUtils.encodeString(str5));
            }
            jSONObject.put(SDKUtils.encodeString("deviceApiLevel"), String.valueOf(a.f20327e));
            jSONObject.put(SDKUtils.encodeString("SDKVersion"), SDKUtils.encodeString(SDKUtils.getSDKVersion()));
            if (a.f20328f != null && a.f20328f.length() > 0) {
                jSONObject.put(SDKUtils.encodeString("mobileCarrier"), SDKUtils.encodeString(a.f20328f));
            }
            String language = context.getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put(SDKUtils.encodeString("deviceLanguage"), SDKUtils.encodeString(language.toUpperCase()));
            }
            if (SDKUtils.getControllerConfigAsJSONObject().optBoolean("totalDeviceRAM")) {
                jSONObject.put(SDKUtils.encodeString("totalDeviceRAM"), SDKUtils.encodeString(String.valueOf(C6393h.m19106d(context))));
            }
            String packageName = context.getPackageName();
            if (!TextUtils.isEmpty(packageName)) {
                jSONObject.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(packageName));
            }
            String valueOf = String.valueOf(C6393h.m19129o());
            if (!TextUtils.isEmpty(valueOf)) {
                jSONObject.put(SDKUtils.encodeString("deviceScreenScale"), SDKUtils.encodeString(valueOf));
            }
            String valueOf2 = String.valueOf(C6393h.m19120j());
            if (!TextUtils.isEmpty(valueOf2)) {
                jSONObject.put(SDKUtils.encodeString("unLocked"), SDKUtils.encodeString(valueOf2));
            }
            jSONObject.put(SDKUtils.encodeString("gpi"), C6398k.m19149a(context));
            jSONObject.put("mcc", C6363a.C63641.m19014c(context));
            jSONObject.put("mnc", C6363a.C63641.m19017d(context));
            jSONObject.put(SDKUtils.encodeString("phoneType"), C6363a.C63641.m19020f(context));
            jSONObject.put(SDKUtils.encodeString("simOperator"), SDKUtils.encodeString(C6363a.C63641.m19019e(context)));
            jSONObject.put(SDKUtils.encodeString("lastUpdateTime"), C6372c.m19030b(context));
            jSONObject.put(SDKUtils.encodeString("firstInstallTime"), C6372c.m19027a(context));
            jSONObject.put(SDKUtils.encodeString("appVersion"), SDKUtils.encodeString(C6372c.m19032c(context)));
            jSONObject.put(SDKUtils.encodeString("stid"), C6398k.m19150b(context));
            String d = C6372c.m19034d(context);
            if (!TextUtils.isEmpty(d)) {
                jSONObject.put(SDKUtils.encodeString("installerPackageName"), SDKUtils.encodeString(d));
            }
            jSONObject.put("localTime", SDKUtils.encodeString(String.valueOf(C6393h.m19094a())));
            jSONObject.put("timezoneOffset", SDKUtils.encodeString(String.valueOf(C6393h.m19100b())));
            String j = C6393h.m19119j(context);
            if (!TextUtils.isEmpty(j)) {
                jSONObject.put("icc", j);
            }
            String c = C6393h.m19103c();
            if (!TextUtils.isEmpty(c)) {
                jSONObject.put("tz", SDKUtils.encodeString(c));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
