package com.ironsource.environment;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.browser.trusted.sharing.ShareTarget;
import com.ironsource.mediationsdk.config.VersionInfo;
import com.tapjoy.TapjoyConstants;
import java.io.DataOutputStream;
import java.lang.Thread;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.environment.e */
public final class C6380e {

    /* renamed from: c */
    public static String f16151c = "";

    /* renamed from: a */
    Context f16152a;

    /* renamed from: b */
    String f16153b;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public JSONObject f16154d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f16155e;

    /* renamed from: f */
    private String f16156f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f16157g;

    /* renamed from: h */
    private Thread.UncaughtExceptionHandler f16158h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f16159i;

    /* renamed from: com.ironsource.environment.e$a */
    static class C6384a {

        /* renamed from: a */
        static volatile C6380e f16165a = new C6380e((byte) 0);
    }

    private C6380e() {
        this.f16157g = false;
        this.f16154d = new JSONObject();
        this.f16158h = Thread.getDefaultUncaughtExceptionHandler();
        this.f16153b = " ";
        this.f16159i = "https://outcome-crash-report.supersonicads.com/reporter";
        Thread.setDefaultUncaughtExceptionHandler(new C6377d(this.f16158h));
    }

    /* synthetic */ C6380e(byte b) {
        this();
    }

    /* renamed from: a */
    public static C6380e m19051a() {
        return C6384a.f16165a;
    }

    /* renamed from: a */
    private static String m19052a(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return "none";
        }
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities == null) {
                    return "none";
                }
                if (networkCapabilities.hasTransport(1)) {
                    return TapjoyConstants.TJC_CONNECTION_TYPE_WIFI;
                }
                if (networkCapabilities.hasTransport(0)) {
                    return "cellular";
                }
            } else {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    if (activeNetworkInfo.getTypeName().equalsIgnoreCase("WIFI")) {
                        return TapjoyConstants.TJC_CONNECTION_TYPE_WIFI;
                    }
                    if (activeNetworkInfo.getTypeName().equalsIgnoreCase("MOBILE")) {
                        return "cellular";
                    }
                }
            }
            return "none";
        } catch (Exception e) {
            e.printStackTrace();
            return "none";
        }
    }

    /* renamed from: a */
    public final void mo35888a(final Context context, HashSet<String> hashSet, String str, String str2, boolean z, final String str3, int i, boolean z2) {
        if (context != null) {
            Log.d("automation_log", "init ISCrashReporter");
            this.f16152a = context;
            if (!TextUtils.isEmpty(str2)) {
                this.f16153b = str2;
            }
            if (!TextUtils.isEmpty(str)) {
                this.f16159i = str;
            }
            this.f16156f = str3;
            if (z) {
                C6363a aVar = new C6363a(i);
                aVar.f16121c = z2;
                aVar.f16120b = true;
                aVar.f16119a = new C6369b() {
                    /* renamed from: a */
                    public final void mo35874a() {
                        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
                        StringBuilder sb = new StringBuilder(128);
                        for (Thread next : allStackTraces.keySet()) {
                            StackTraceElement[] stackTrace = next.getStackTrace();
                            if (stackTrace != null && stackTrace.length > 0) {
                                sb.append("*** Thread Name ");
                                sb.append(next.getName());
                                sb.append(" Thread ID ");
                                sb.append(next.getId());
                                sb.append(" (");
                                sb.append(next.getState().toString());
                                sb.append(") ***\n");
                                for (StackTraceElement stackTraceElement : stackTrace) {
                                    sb.append(stackTraceElement.toString());
                                    sb.append(" ");
                                    sb.append(next.getState().toString());
                                    sb.append("\n");
                                }
                            }
                        }
                        C6380e.f16151c = sb.toString();
                    }

                    /* renamed from: b */
                    public final void mo35875b() {
                    }
                };
                aVar.start();
            }
            String a = m19052a(this.f16152a);
            if (!a.equals("none")) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("CRep", 0);
                String string = sharedPreferences.getString("String1", this.f16155e);
                String string2 = sharedPreferences.getString("sId", this.f16156f);
                new StringBuilder();
                for (C6372c next : C6388f.m19075a()) {
                    String b = next.mo35880b();
                    String a2 = next.mo35879a();
                    String c = next.mo35881c();
                    String packageName = context.getPackageName();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("crashDate", b);
                        jSONObject.put("stacktraceCrash", a2);
                        jSONObject.put("crashType", c);
                        jSONObject.put("CrashReporterVersion", "1.0.5");
                        jSONObject.put("SDKVersion", VersionInfo.VERSION);
                        jSONObject.put("deviceLanguage", C6393h.m19097a(context));
                        jSONObject.put("appVersion", C6372c.m19033c(context, packageName));
                        jSONObject.put("deviceOSVersion", C6393h.m19109e());
                        jSONObject.put("network", a);
                        jSONObject.put("deviceApiLevel", C6393h.m19111f());
                        jSONObject.put("deviceModel", C6393h.m19113g());
                        jSONObject.put("deviceOS", C6393h.m19117i());
                        jSONObject.put("advertisingId", string);
                        jSONObject.put("isLimitAdTrackingEnabled", this.f16157g);
                        jSONObject.put("deviceOEM", C6393h.m19115h());
                        jSONObject.put("systemProperties", System.getProperties());
                        jSONObject.put("bundleId", packageName);
                        jSONObject.put("sId", string2);
                        JSONObject jSONObject2 = new JSONObject();
                        if (hashSet != null && !hashSet.isEmpty()) {
                            Iterator<String> it = hashSet.iterator();
                            while (it.hasNext()) {
                                String next2 = it.next();
                                try {
                                    if (jSONObject.has(next2)) {
                                        jSONObject2.put(next2, jSONObject.opt(next2));
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                            jSONObject = jSONObject2;
                        }
                        this.f16154d = jSONObject;
                    } catch (Exception unused) {
                    }
                    if (this.f16154d.length() == 0) {
                        Log.d("ISCrashReport", " Is Empty");
                    } else {
                        new Thread(new Runnable() {
                            public final void run() {
                                try {
                                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(C6380e.m19051a().f16159i).openConnection();
                                    httpURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
                                    httpURLConnection.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
                                    httpURLConnection.setRequestProperty("Accept", "application/json");
                                    httpURLConnection.setDoOutput(true);
                                    httpURLConnection.setDoInput(true);
                                    Log.i("JSON", C6380e.this.f16154d.toString());
                                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                                    dataOutputStream.writeBytes(C6380e.this.f16154d.toString());
                                    dataOutputStream.flush();
                                    dataOutputStream.close();
                                    Log.i("STATUS", String.valueOf(httpURLConnection.getResponseCode()));
                                    Log.i("MSG", httpURLConnection.getResponseMessage());
                                    httpURLConnection.disconnect();
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }).start();
                        C6388f.m19078c();
                    }
                }
            }
            new Thread(new Runnable() {
                public final void run() {
                    try {
                        String[] C = C6393h.m19090C(context);
                        if (C != null && C.length == 2) {
                            if (!TextUtils.isEmpty(C[0])) {
                                String unused = C6380e.this.f16155e = C[0];
                            }
                            boolean unused2 = C6380e.this.f16157g = Boolean.parseBoolean(C[1]);
                            SharedPreferences.Editor edit = context.getSharedPreferences("CRep", 0).edit();
                            edit.putString("String1", C6380e.this.f16155e);
                            edit.putString("sId", str3);
                            edit.apply();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
