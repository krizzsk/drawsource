package com.ironsource.sdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import com.ironsource.environment.C6393h;
import com.ironsource.sdk.controller.ControllerActivity;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.p285g.C8293d;
import com.ironsource.sdk.p285g.C8300f;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.tapjoy.TJAdUnitConstants;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SDKUtils {

    /* renamed from: a */
    private static final String f20313a = SDKUtils.class.getSimpleName();

    /* renamed from: b */
    private static String f20314b;

    /* renamed from: c */
    private static boolean f20315c = true;

    /* renamed from: d */
    private static String f20316d;

    /* renamed from: e */
    private static int f20317e = 0;

    /* renamed from: f */
    private static String f20318f;

    /* renamed from: g */
    private static Map<String, String> f20319g;

    /* renamed from: h */
    private static String f20320h = "";

    /* renamed from: i */
    private static final AtomicInteger f20321i = new AtomicInteger(1);

    public static int convertDpToPx(int i) {
        return (int) TypedValue.applyDimension(0, (float) i, Resources.getSystem().getDisplayMetrics());
    }

    public static int convertPxToDp(int i) {
        return (int) TypedValue.applyDimension(1, (float) i, Resources.getSystem().getDisplayMetrics());
    }

    public static String decodeString(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            String str2 = f20313a;
            Logger.m23745d(str2, "Failed decoding string " + e.getMessage());
            return "";
        }
    }

    public static int dpToPx(long j) {
        return (int) ((((float) j) * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static String encodeString(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replace("+", "%20");
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] encrypt(java.lang.String r3) {
        /*
            r0 = 0
            java.lang.String r1 = "SHA-1"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch:{ NoSuchAlgorithmException -> 0x001e, UnsupportedEncodingException -> 0x0018 }
            r1.reset()     // Catch:{ NoSuchAlgorithmException -> 0x0016, UnsupportedEncodingException -> 0x0014 }
            java.lang.String r2 = "UTF-8"
            byte[] r3 = r3.getBytes(r2)     // Catch:{ NoSuchAlgorithmException -> 0x0016, UnsupportedEncodingException -> 0x0014 }
            r1.update(r3)     // Catch:{ NoSuchAlgorithmException -> 0x0016, UnsupportedEncodingException -> 0x0014 }
            goto L_0x0023
        L_0x0014:
            r3 = move-exception
            goto L_0x001a
        L_0x0016:
            r3 = move-exception
            goto L_0x0020
        L_0x0018:
            r3 = move-exception
            r1 = r0
        L_0x001a:
            r3.printStackTrace()
            goto L_0x0023
        L_0x001e:
            r3 = move-exception
            r1 = r0
        L_0x0020:
            r3.printStackTrace()
        L_0x0023:
            if (r1 == 0) goto L_0x002a
            byte[] r3 = r1.digest()
            return r3
        L_0x002a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.utils.SDKUtils.encrypt(java.lang.String):byte[]");
    }

    public static String fetchDemandSourceId(C8300f fVar) {
        return fetchDemandSourceId(fVar.f20259d);
    }

    public static String fetchDemandSourceId(JSONObject jSONObject) {
        String optString = jSONObject.optString("demandSourceId");
        return !TextUtils.isEmpty(optString) ? optString : jSONObject.optString("demandSourceName");
    }

    public static String flatMapToJsonAsString(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                try {
                    jSONObject.putOpt((String) next.getKey(), encodeString((String) next.getValue()));
                } catch (JSONException e) {
                    String str = f20313a;
                    Logger.m23749i(str, "flatMapToJsonAsStringfailed " + e.toString());
                }
                it.remove();
            }
        }
        return jSONObject.toString();
    }

    public static int generateViewId() {
        int i;
        int i2;
        if (Build.VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }
        do {
            i = f20321i.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!f20321i.compareAndSet(i, i2));
        return i;
    }

    public static int getActivityUIFlags(boolean z) {
        int i = Build.VERSION.SDK_INT >= 14 ? 2 : 0;
        if (Build.VERSION.SDK_INT >= 16) {
            i |= 1796;
        }
        return (Build.VERSION.SDK_INT < 19 || !z) ? i : i | 4096;
    }

    public static String getAdvertiserId() {
        return f20314b;
    }

    public static String getControllerConfig() {
        return f20318f;
    }

    public static JSONObject getControllerConfigAsJSONObject() {
        try {
            return new JSONObject(getControllerConfig());
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    public static String getControllerUrl() {
        return !TextUtils.isEmpty(f20316d) ? f20316d : "";
    }

    public static int getDebugMode() {
        return f20317e;
    }

    public static String getFileName(String str) {
        String[] split = str.split(File.separator);
        try {
            return URLEncoder.encode(split[split.length - 1].split("\\?")[0], "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Map<String, String> getInitSDKParams() {
        return f20319g;
    }

    public static String getMD5(String str) {
        try {
            String bigInteger = new BigInteger(1, MessageDigest.getInstance(SameMD5.TAG).digest(str.getBytes())).toString(16);
            while (bigInteger.length() < 32) {
                bigInteger = "0" + bigInteger;
            }
            return bigInteger;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static int getMinOSVersionSupport() {
        return getControllerConfigAsJSONObject().optInt("minOSVersionSupport");
    }

    public static JSONObject getNetworkConfiguration() {
        JSONObject jSONObject = new JSONObject();
        try {
            return getControllerConfigAsJSONObject().getJSONObject("networkConfig");
        } catch (Exception e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    public static JSONObject getOrientation(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(TJAdUnitConstants.String.ORIENTATION, translateOrientation(C6393h.m19130o(context)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public static C8293d.C8298e getProductType(String str) {
        if (str.equalsIgnoreCase(C8293d.C8298e.RewardedVideo.toString())) {
            return C8293d.C8298e.RewardedVideo;
        }
        if (str.equalsIgnoreCase(C8293d.C8298e.Interstitial.toString())) {
            return C8293d.C8298e.Interstitial;
        }
        if (str.equalsIgnoreCase(C8293d.C8298e.OfferWall.toString())) {
            return C8293d.C8298e.OfferWall;
        }
        return null;
    }

    public static String getSDKVersion() {
        return "5.117";
    }

    public static String getTesterParameters() {
        return f20320h;
    }

    public static String getValueFromJsonObject(String str, String str2) {
        try {
            return new JSONObject(str).getString(str2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean isApplicationVisible(Context context) {
        String packageName = context.getPackageName();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo next : activityManager.getRunningAppProcesses()) {
            if (next.processName.equalsIgnoreCase(packageName) && next.importance == 100) {
                return true;
            }
        }
        return false;
    }

    public static boolean isExternalStorageAvailable() {
        String externalStorageState = Environment.getExternalStorageState();
        return "mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState);
    }

    public static boolean isIronSourceActivity(Activity activity) {
        return (activity instanceof ControllerActivity) || (activity instanceof OpenUrlActivity);
    }

    public static boolean isLimitAdTrackingEnabled() {
        return f20315c;
    }

    public static void loadGoogleAdvertiserInfo(Context context) {
        String[] C = C6393h.m19090C(context);
        if (C != null && C.length == 2) {
            f20314b = C[0];
            f20315c = Boolean.parseBoolean(C[1]);
        }
    }

    public static Map<String, String> mergeHashMaps(Map<String, String>[] mapArr) {
        HashMap hashMap = new HashMap();
        if (mapArr == null) {
            return hashMap;
        }
        for (Map<String, String> map : mapArr) {
            if (map != null) {
                hashMap.putAll(map);
            }
        }
        return hashMap;
    }

    public static JSONObject mergeJSONObjects(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject != null) {
            jSONObject3 = new JSONObject(jSONObject.toString());
        }
        if (jSONObject2 != null) {
            jSONArray = jSONObject2.names();
        }
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getString(i);
                jSONObject3.putOpt(string, jSONObject2.opt(string));
            }
        }
        return jSONObject3;
    }

    public static int pxToDp(long j) {
        return (int) ((((float) j) / Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static String requireNonEmptyOrNull(String str, String str2) {
        if (str != null) {
            return str;
        }
        throw new NullPointerException(str2);
    }

    public static <T> T requireNonNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static void setControllerConfig(String str) {
        f20318f = str;
    }

    public static void setControllerUrl(String str) {
        f20316d = str;
    }

    public static void setDebugMode(int i) {
        f20317e = i;
    }

    public static void setInitSDKParams(Map<String, String> map) {
        f20319g = map;
    }

    public static void setTesterParameters(String str) {
        f20320h = str;
    }

    public static void showNoInternetDialog(Context context) {
        new AlertDialog.Builder(context).setMessage("No Internet Connection").setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).show();
    }

    public static String translateDeviceOrientation(int i) {
        return i != 1 ? i != 2 ? "none" : "landscape" : "portrait";
    }

    public static String translateOrientation(int i) {
        return i != 1 ? i != 2 ? "none" : "landscape" : "portrait";
    }

    public static String translateRequestedOrientation(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 11) {
                    if (i != 12) {
                        switch (i) {
                            case 6:
                            case 8:
                                break;
                            case 7:
                            case 9:
                                break;
                            default:
                                return "none";
                        }
                    }
                }
            }
            return "portrait";
        }
        return "landscape";
    }
}
