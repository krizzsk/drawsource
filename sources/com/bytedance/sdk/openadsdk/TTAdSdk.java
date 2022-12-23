package com.bytedance.sdk.openadsdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ShortcutManager;
import android.os.Build;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.bykv.p054vk.openvk.component.video.api.C2397b;
import com.bykv.p054vk.openvk.component.video.api.p074f.C2415c;
import com.bykv.p054vk.openvk.component.video.p055a.C2276a;
import com.bytedance.sdk.component.adexpress.p089a.p090a.C2529a;
import com.bytedance.sdk.component.p118e.p121c.C2851a;
import com.bytedance.sdk.component.p123f.C2879c;
import com.bytedance.sdk.component.p123f.C2882e;
import com.bytedance.sdk.component.p123f.C2885g;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.utils.C2912r;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.openadsdk.core.C3457h;
import com.bytedance.sdk.openadsdk.core.C3502k;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.C3576r;
import com.bytedance.sdk.openadsdk.core.C3582u;
import com.bytedance.sdk.openadsdk.core.p153i.C3465b;
import com.bytedance.sdk.openadsdk.core.p153i.C3467d;
import com.bytedance.sdk.openadsdk.core.p153i.C3470e;
import com.bytedance.sdk.openadsdk.core.p153i.C3471f;
import com.bytedance.sdk.openadsdk.multipro.C3948b;
import com.bytedance.sdk.openadsdk.multipro.C3960d;
import com.bytedance.sdk.openadsdk.multipro.aidl.C3912a;
import com.bytedance.sdk.openadsdk.multipro.aidl.C3925b;
import com.bytedance.sdk.openadsdk.p165d.C3707a;
import com.bytedance.sdk.openadsdk.p170h.C3753b;
import com.bytedance.sdk.openadsdk.p170h.p172b.C3771a;
import com.bytedance.sdk.openadsdk.p174i.C3792d;
import com.bytedance.sdk.openadsdk.p178l.C3858c;
import com.bytedance.sdk.openadsdk.p178l.C3869f;
import com.bytedance.sdk.openadsdk.p178l.C3880i;
import com.bytedance.sdk.openadsdk.p178l.C3886o;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public final class TTAdSdk {
    public static final int INIT_LOCAL_FAIL_CODE = 4000;
    public static final long INIT_TIME = System.currentTimeMillis();

    /* renamed from: a */
    private static AtomicBoolean f6683a = new AtomicBoolean(false);

    /* renamed from: b */
    private static SharedPreferences.OnSharedPreferenceChangeListener f6684b;

    /* renamed from: c */
    private static final TTAdManager f6685c = new C3582u();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static long f6686d = 0;

    public interface InitCallback {
        void fail(int i, String str);

        void success();
    }

    public static boolean isInitSuccess() {
        return C3502k.m10923e() == 1;
    }

    public static void init(final Context context, final TTAdConfig tTAdConfig, final InitCallback initCallback) {
        f6686d = SystemClock.elapsedRealtime();
        if (initCallback != null && !C3502k.f8769d.contains(initCallback)) {
            C3502k.f8769d.add(initCallback);
        }
        C3502k.m10917a(3);
        if (isInitSuccess()) {
            m8276e();
        } else if (context == null && initCallback != null) {
            m8268b((int) INIT_LOCAL_FAIL_CODE, "Context is null, please check. ");
        } else if (tTAdConfig != null || initCallback == null) {
            m8275d(context, tTAdConfig);
            try {
                C3457h.m10578a(initCallback);
                try {
                    C2914t.m8151a(C3513m.m10963a(), "tt_ad_logo_txt");
                    if (isInitSuccess()) {
                        if (initCallback != null) {
                            m8276e();
                        }
                    } else if (!tTAdConfig.isSupportMultiProcess()) {
                        m8271b(context, tTAdConfig, initCallback);
                    } else {
                        C3912a.m12925a((C3925b) new C3925b() {
                            /* renamed from: a */
                            public void mo18159a() {
                                TTAdSdk.m8271b(context, tTAdConfig, initCallback);
                            }
                        });
                        C3912a.m12924a(context).mo20783a();
                    }
                } catch (Throwable unused) {
                    if (initCallback != null) {
                        m8268b((int) INIT_LOCAL_FAIL_CODE, "resources not found, if you use aab please call TTAdConfig.setPackageName");
                    }
                }
            } catch (Throwable unused2) {
                if (initCallback != null) {
                    m8268b((int) INIT_LOCAL_FAIL_CODE, "Internal Error, setting exception. ");
                }
            }
        } else {
            m8268b((int) INIT_LOCAL_FAIL_CODE, "TTAdConfig is null, please check.");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m8271b(final Context context, final TTAdConfig tTAdConfig, final InitCallback initCallback) {
        C3502k.m10921c().post(new Runnable() {
            public void run() {
                boolean z;
                try {
                    if (!TTAdSdk.isInitSuccess()) {
                        TTAdSdk.m8277e(context, tTAdConfig);
                        TTAdSdk.m8278f(context, tTAdConfig);
                        if (initCallback != null) {
                            TTAdSdk.m8276e();
                        }
                        z = true;
                        TTAdSdk.m8269b(context, SystemClock.elapsedRealtime() - TTAdSdk.f6686d, z, tTAdConfig);
                    } else if (initCallback != null) {
                        TTAdSdk.m8276e();
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                    if (initCallback != null) {
                        TTAdSdk.m8268b((int) TTAdSdk.INIT_LOCAL_FAIL_CODE, th.getMessage());
                    }
                    z = false;
                }
            }
        });
    }

    public static TTAdManager getAdManager() {
        C3898x.m12823m("getAdManager");
        return f6685c;
    }

    /* renamed from: c */
    private static void m8273c(final Context context, TTAdConfig tTAdConfig) {
        m8272c();
        C3502k.f8766a = tTAdConfig.isAsyncInit();
        f6685c.setAppId(tTAdConfig.getAppId()).setCoppa(tTAdConfig.getCoppa()).setGdpr(tTAdConfig.getGDPR()).setCcpa(tTAdConfig.getCcpa()).setName(tTAdConfig.getAppName()).setIconId(tTAdConfig.getAppIconId()).setPaid(tTAdConfig.isPaid()).setKeywords(tTAdConfig.getKeywords()).setData(tTAdConfig.getData()).setTitleBarTheme(tTAdConfig.getTitleBarTheme()).setAllowShowNotifiFromSDK(tTAdConfig.isAllowShowNotify()).isUseTextureView(tTAdConfig.isUseTextureView()).setNeedClearTaskReset(tTAdConfig.getNeedClearTaskReset()).debugLog(tTAdConfig.getDebugLog());
        try {
            if (tTAdConfig.isDebug()) {
                C2905l.m8109b();
                f6685c.openDebugMode();
                C3880i.m12664a();
                C2415c.m5825a();
            }
        } catch (Throwable unused) {
        }
        C3471f.f8591a = C3467d.m10684b(context);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        C29443 r0 = new SharedPreferences.OnSharedPreferenceChangeListener() {
            public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                if (C3471f.f8592b.equals(str)) {
                    C2882e.m8035a((C2885g) new C2885g("onSharedPreferenceChanged") {
                        public void run() {
                            String b = C3467d.m10684b(context);
                            if ((TextUtils.isEmpty(b) && !TextUtils.isEmpty(C3471f.f8591a)) || !b.equals(C3471f.f8591a)) {
                                C3467d.m10678a((C3465b) C3513m.m10973h()).mo19820a(true);
                                C3471f.f8591a = b;
                            }
                        }
                    });
                }
            }
        };
        f6684b = r0;
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(r0);
    }

    /* renamed from: c */
    private static void m8272c() {
        ShortcutManager shortcutManager;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Context a = C3513m.m10963a();
                if (a != null && (shortcutManager = (ShortcutManager) a.getSystemService(ShortcutManager.class)) != null) {
                    C3457h.m10580d().mo19746a(shortcutManager.isRequestPinShortcutSupported());
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: d */
    private static void m8275d(Context context, TTAdConfig tTAdConfig) {
        if (!TextUtils.isEmpty(tTAdConfig.getPackageName())) {
            C2914t.m8153a(tTAdConfig.getPackageName());
        }
        C3513m.m10965a(context);
        if (!tTAdConfig.isSupportMultiProcess()) {
            C3948b.m12958b();
        }
        C3502k.m10919b();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m8277e(Context context, TTAdConfig tTAdConfig) {
        if (C3470e.m10697a()) {
            C2882e.m8040b(-1);
            C3960d.m13014a(context);
            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) C2882e.m8032a();
            C2851a.m7918a(context).mo17724a(threadPoolExecutor);
            C3502k.f8767b.set(true);
            if (tTAdConfig.isSupportMultiProcess()) {
                C3948b.m12957a();
            }
            try {
                C2529a.m6339a().mo16548a(C3707a.m12124a());
            } catch (Exception e) {
                e.printStackTrace();
            }
            updateAdConfig(tTAdConfig);
            m8273c(context, tTAdConfig);
            C3502k.m10916a();
            C2397b.m5666a(context, (String) null, threadPoolExecutor, C3502k.m10921c());
            C2397b.m5668a(tTAdConfig.isSupportMultiProcess());
            C2397b.m5667a(C3792d.m12395a().mo20615b().mo17686e());
            if (Build.VERSION.SDK_INT < 23) {
                C2276a.m5179a(context);
            }
            if (C3513m.m10973h().mo19826C()) {
                C3576r.m11309a();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static void m8278f(final Context context, final TTAdConfig tTAdConfig) {
        C2882e.m8037a(new C2885g("init sync") {
            public void run() {
                C3471f h = C3513m.m10973h();
                if (!h.mo19828E()) {
                    synchronized (h) {
                        if (!h.mo19828E()) {
                            h.mo19818a();
                            h.mo19836a((Boolean) false);
                        }
                    }
                }
                C3869f.m12625f();
                C3502k.m10918a(context);
                C2882e.m8038a(true);
                C2882e.m8034a((C2879c) new C3771a());
                if (Build.VERSION.SDK_INT != 29 || !C3886o.m12697r()) {
                    C3869f.m12608a(context);
                }
                C3858c.m12583a(context);
                C3869f.m12631i(context);
                C3869f.m12632j(context);
            }
        }, 10, 5);
        C3502k.m10921c().post(new Runnable() {
            public void run() {
                if (!tTAdConfig.isSupportMultiProcess()) {
                    C3467d.m10678a((C3465b) C3513m.m10973h()).mo19820a(true);
                } else if (C2912r.m8145a(context)) {
                    C3467d.m10678a((C3465b) C3513m.m10973h()).mo19820a(true);
                    C2905l.m8114c("TTAdSdk", "Load setting in main process");
                }
                C3513m.m10968c().mo18653a();
                C3513m.m10970e().mo18653a();
                C3513m.m10969d().mo18653a();
            }
        });
        m8274d();
    }

    /* renamed from: d */
    private static void m8274d() {
        C2882e.m8042b(new C2885g("Disk Event") {
            public void run() {
                C3753b.m12291b();
            }
        }, 5);
    }

    public static void updateAdConfig(TTAdConfig tTAdConfig) {
        if (tTAdConfig != null) {
            if (!TextUtils.isEmpty(tTAdConfig.getData())) {
                C3457h.m10580d().mo19758d(tTAdConfig.getData());
            }
            if (!TextUtils.isEmpty(tTAdConfig.getKeywords())) {
                C3457h.m10580d().mo19755c(tTAdConfig.getKeywords());
            }
        }
    }

    public static void setCoppa(int i) {
        C3898x.m12823m("setCoppa");
        if (i != getCoppa()) {
            f6685c.setCoppa(i);
            C3467d.m10678a((C3465b) C3513m.m10973h()).mo19820a(true);
        }
    }

    public static int getCoppa() {
        C3898x.m12823m("getCoppa");
        return f6685c.getCoppa();
    }

    public static void setGdpr(int i) {
        C3898x.m12823m("setGdpr");
        if (i != getGdpr()) {
            f6685c.setGdpr(i);
            C3467d.m10678a((C3465b) C3513m.m10973h()).mo19820a(true);
        }
    }

    public static int getGdpr() {
        C3898x.m12823m("getGdpr");
        return f6685c.getGdpr();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m8269b(Context context, long j, boolean z, TTAdConfig tTAdConfig) {
        final Context context2 = context;
        final TTAdConfig tTAdConfig2 = tTAdConfig;
        final long j2 = j;
        final boolean z2 = z;
        C2882e.m8036a(new C2885g("initMustBeCall") {
            public void run() {
                ApmHelper.initApm(context2, tTAdConfig2);
                if (C3513m.m10973h().mo19829F()) {
                    try {
                        boolean e = C3457h.m10580d().mo19763e();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("duration", j2);
                        jSONObject.put("is_async", true);
                        jSONObject.put("is_multi_process", tTAdConfig2.isSupportMultiProcess());
                        jSONObject.put("is_debug", tTAdConfig2.isDebug());
                        jSONObject.put("is_use_texture_view", tTAdConfig2.isUseTextureView());
                        jSONObject.put("is_activate_init", e);
                        jSONObject.put("minSdkVersion", C3898x.m12829o(context2));
                        jSONObject.put("targetSdkVersion", C3898x.m12825n(context2));
                        jSONObject.put("apm_is_init", ApmHelper.isIsInit());
                        jSONObject.put("is_success", z2);
                        C3457h.m10580d().mo19751b(false);
                        C3753b.m12287a().mo20573a("pangle_sdk_init", jSONObject);
                        C2905l.m8107a("TTAdSdk", "pangle_sdk_init = ", jSONObject);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }, 5);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m8276e() {
        synchronized (C3502k.f8769d) {
            C3502k.m10917a(1);
            for (InitCallback success : C3502k.f8769d) {
                try {
                    success.success();
                } catch (Throwable unused) {
                }
            }
            C3502k.f8769d.clear();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m8268b(int i, String str) {
        synchronized (C3502k.f8769d) {
            C3502k.m10917a(2);
            for (InitCallback fail : C3502k.f8769d) {
                try {
                    fail.fail(i, str);
                } catch (Throwable unused) {
                }
            }
            C3502k.f8769d.clear();
        }
    }

    public static void setCCPA(int i) {
        C3898x.m12823m("setCCPA");
        if (i != getCCPA()) {
            C3457h.m10580d().mo19765f(i);
            C3467d.m10678a((C3465b) C3513m.m10973h()).mo19820a(true);
        }
    }

    public static int getCCPA() {
        C3898x.m12823m("getCCPA");
        return C3457h.m10580d().mo19782v();
    }

    public static void addInitCallback(InitCallback initCallback) {
        if (initCallback != null) {
            synchronized (C3502k.f8769d) {
                if (isInitSuccess()) {
                    initCallback.success();
                } else if (C3502k.m10923e() == 2) {
                    initCallback.fail(INIT_LOCAL_FAIL_CODE, "Pangle Sdk initialization has failed before addPAGInitCallback");
                } else {
                    C3502k.f8769d.add(initCallback);
                }
            }
        }
    }
}
