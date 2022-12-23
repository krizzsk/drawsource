package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import com.bytedance.sdk.component.p123f.C2882e;
import com.bytedance.sdk.component.p123f.C2885g;
import com.bytedance.sdk.openadsdk.multipro.p184d.C3961a;
import com.bytedance.sdk.openadsdk.p170h.C3753b;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.d */
/* compiled from: AppEnvironment */
public class C3393d {

    /* renamed from: a */
    private static volatile C3393d f8178a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public long f8179b = C3961a.m13021a("tt_sp_app_env", "last_app_env_time", 0);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f8180c = false;

    private C3393d() {
    }

    /* renamed from: a */
    public static C3393d m10099a() {
        if (f8178a == null) {
            synchronized (C3393d.class) {
                if (f8178a == null) {
                    f8178a = new C3393d();
                }
            }
        }
        return f8178a;
    }

    /* renamed from: b */
    public void mo19374b() {
        if (!this.f8180c && !C3898x.m12764a(this.f8179b, System.currentTimeMillis())) {
            this.f8180c = true;
            C2882e.m8036a(new C2885g("trySendAppManifestInfo") {
                public void run() {
                    JSONObject a = C3393d.this.m10102c();
                    if (a != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        long unused = C3393d.this.f8179b = currentTimeMillis;
                        C3961a.m13028a("tt_sp_app_env", "last_app_env_time", Long.valueOf(currentTimeMillis));
                        C3753b.m12287a().mo20574a(a);
                    }
                    boolean unused2 = C3393d.this.f8180c = false;
                }
            }, 1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public JSONObject m10102c() {
        JSONObject jSONObject = new JSONObject();
        try {
            Context a = C3513m.m10963a();
            if (a == null) {
                return null;
            }
            PackageInfo packageInfo = a.getPackageManager().getPackageInfo(a.getPackageName(), 4111);
            ApplicationInfo applicationInfo = a.getApplicationInfo();
            if (applicationInfo != null) {
                jSONObject.put("application_name", applicationInfo.name);
            }
            if (packageInfo != null) {
                ActivityInfo[] activityInfoArr = packageInfo.activities;
                ActivityInfo[] activityInfoArr2 = packageInfo.receivers;
                ServiceInfo[] serviceInfoArr = packageInfo.services;
                ProviderInfo[] providerInfoArr = packageInfo.providers;
                String[] strArr = packageInfo.requestedPermissions;
                if (activityInfoArr != null) {
                    JSONArray jSONArray = new JSONArray();
                    for (ActivityInfo activityInfo : activityInfoArr) {
                        jSONArray.put(activityInfo.name);
                    }
                    jSONObject.put("activities", jSONArray);
                }
                if (activityInfoArr2 != null) {
                    JSONArray jSONArray2 = new JSONArray();
                    for (ActivityInfo activityInfo2 : activityInfoArr2) {
                        jSONArray2.put(activityInfo2.name);
                    }
                    jSONObject.put("receivers", jSONArray2);
                }
                if (serviceInfoArr != null) {
                    JSONArray jSONArray3 = new JSONArray();
                    for (ServiceInfo serviceInfo : serviceInfoArr) {
                        jSONArray3.put(serviceInfo.name);
                    }
                    jSONObject.put("services", jSONArray3);
                }
                if (providerInfoArr != null) {
                    JSONArray jSONArray4 = new JSONArray();
                    for (ProviderInfo providerInfo : providerInfoArr) {
                        jSONArray4.put(providerInfo.name);
                    }
                    jSONObject.put("providers", jSONArray4);
                }
                if (strArr != null) {
                    JSONArray jSONArray5 = new JSONArray();
                    for (String put : strArr) {
                        jSONArray5.put(put);
                    }
                    jSONObject.put("permissions", jSONArray5);
                }
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }
}
