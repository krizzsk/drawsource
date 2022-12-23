package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.p118e.C2839a;
import com.bytedance.sdk.component.utils.C2888a;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.utils.C2922w;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.TTAdManager;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.core.C3562o;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.p149e.C3433o;
import com.bytedance.sdk.openadsdk.core.p153i.C3471f;
import com.bytedance.sdk.openadsdk.p128b.C3090e;
import com.bytedance.sdk.openadsdk.p178l.C3886o;
import com.bytedance.sdk.openadsdk.p178l.C3889p;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import com.bytedance.sdk.openadsdk.p178l.C3904y;
import com.com.bytedance.overseas.sdk.p186b.C3970a;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.smaato.sdk.video.vast.model.Verification;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.VungleApiClient;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.u */
/* compiled from: TTAdManagerImpl */
public class C3582u implements TTAdManager {

    /* renamed from: f */
    private static final Map<Integer, String> f9050f = new HashMap<Integer, String>(12) {
        {
            put(1, "abtest");
            put(2, "user_data");
            put(3, VungleApiClient.GAID);
            put(4, "apk-sign");
            put(5, "app_running_time");
            put(6, Verification.VENDOR);
            put(7, DeviceRequestsHelper.DEVICE_INFO_MODEL);
            put(8, "user_agent_device");
            put(9, "user_agent_webview");
            put(10, "sys_compiling_time");
            put(11, "sec_did");
            put(12, "url");
            put(13, "X-Argus");
            put(14, "X-Ladon");
            put(15, "X-Khronos");
            put(16, "X-Gorgon");
            put(17, "pangle_m");
            put(18, "screen_height");
            put(19, "screen_width");
            put(20, "rom_version");
            put(21, TapjoyConstants.TJC_CARRIER_NAME);
            put(22, TapjoyConstants.TJC_DEVICE_OS_VERSION_NAME);
            put(23, "conn_type");
            put(24, "boot");
        }
    };

    /* renamed from: a */
    String f9051a;

    /* renamed from: b */
    boolean f9052b = false;

    /* renamed from: c */
    boolean f9053c = false;

    /* renamed from: d */
    String f9054d = "com.union_test.internationad";

    /* renamed from: e */
    String f9055e = "5001121";

    /* renamed from: g */
    private int f9056g = 0;

    /* renamed from: e */
    private void m11338e(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.f9051a)) {
            this.f9051a = str;
            try {
                JSONObject a = C3513m.m10971f().mo19982a(new JSONObject(str));
                if (a != null) {
                    C3562o.C3572a a2 = C3562o.C3572a.m11294a(a, (AdSlot) null, (C3433o) null);
                    if (a2.f9021d == 20000 && a2.f9025h != null && a2.f9025h.mo19386b().size() > 0) {
                        boolean z = false;
                        C3431n nVar = a2.f9025h.mo19386b().get(0);
                        this.f9052b = C3898x.m12787d(nVar);
                        if (nVar.mo19514G() != null) {
                            z = true;
                        }
                        this.f9053c = z;
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public C3582u setAppId(String str) {
        C3457h.m10580d().mo19744a(str);
        return this;
    }

    /* renamed from: a */
    public C3582u setPaid(boolean z) {
        C3457h.m10580d().mo19756c(z);
        return this;
    }

    /* renamed from: b */
    public C3582u setName(String str) {
        C3457h.m10580d().mo19750b(str);
        return this;
    }

    /* renamed from: c */
    public C3582u setKeywords(String str) {
        C3457h.m10580d().mo19755c(str);
        return this;
    }

    public TTAdNative createAdNative(Context context) {
        return new C3584v(context);
    }

    /* renamed from: d */
    public C3582u setData(String str) {
        C3457h.m10580d().mo19758d(str);
        return this;
    }

    public TTAdManager debugLog(int i) {
        this.f9056g = i;
        return this;
    }

    public String getBiddingToken() {
        return getBiddingToken((String) null);
    }

    public String getBiddingToken(String str) {
        int i;
        String str2 = str;
        C3898x.m12827n("getBiddingToken");
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("is_init", TTAdSdk.isInitSuccess() ? 1 : 0);
            String e = C3513m.m10973h().mo19849e();
            String f = C3513m.m10973h().mo19852f();
            if (!(e == null || f == null)) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("version", e);
                jSONObject3.put("param", f);
                jSONObject2.put("abtest", jSONObject3);
            }
            jSONObject2.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject2.put(CampaignEx.JSON_KEY_PACKAGE_NAME, C3898x.m12785d());
            jSONObject2.put("user_data", C3562o.m11231a(TextUtils.isEmpty(str2) ? null : new AdSlot.Builder().setCodeId(str2).build()));
            jSONObject2.put(CampaignEx.JSON_KEY_ST_TS, System.currentTimeMillis() / 1000);
            if (jSONObject2.toString().getBytes().length <= 2680) {
                C3471f h = C3513m.m10973h();
                if (h.mo19876p(VungleApiClient.GAID)) {
                    jSONObject2.put(VungleApiClient.GAID, C3970a.m13090a().mo20862b());
                }
                Context a = C3513m.m10963a();
                jSONObject2.put("apk-sign", C3579s.m11317a());
                jSONObject2.put("app_running_time", (System.currentTimeMillis() - TTAdSdk.INIT_TIME) / 1000);
                jSONObject2.put(Verification.VENDOR, Build.MANUFACTURER);
                jSONObject2.put(DeviceRequestsHelper.DEVICE_INFO_MODEL, Build.MODEL);
                jSONObject2.put("user_agent_device", C3898x.m12751a());
                jSONObject2.put("user_agent_webview", C3898x.m12768b());
                jSONObject2.put("sys_compiling_time", C3472j.m10777b(a));
                jSONObject2.put("screen_height", C3904y.m12881d(a));
                jSONObject2.put("screen_width", C3904y.m12877c(a));
                jSONObject2.put("rom_version", C3886o.m12676a());
                jSONObject2.put(TapjoyConstants.TJC_CARRIER_NAME, C3889p.m12703a());
                jSONObject2.put(TapjoyConstants.TJC_DEVICE_OS_VERSION_NAME, Build.VERSION.RELEASE);
                jSONObject2.put("conn_type", C3898x.m12832p(a));
                if (h.mo19876p("boot")) {
                    jSONObject2.put("boot", (System.currentTimeMillis() - SystemClock.elapsedRealtime()) + "");
                }
                C3579s.m11320a(jSONObject2);
                i = f9050f.size();
            } else {
                i = 2;
            }
            while (i >= 1 && jSONObject2.toString().getBytes().length > 2680) {
                jSONObject2.remove(f9050f.get(Integer.valueOf(i)));
                i--;
            }
            jSONObject = C2888a.m8062a(jSONObject2);
            while (i >= 1 && jSONObject.toString().getBytes().length > 4096) {
                jSONObject2.remove(f9050f.get(Integer.valueOf(i)));
                jSONObject = C2888a.m8062a(jSONObject2);
                i--;
            }
            if (C2905l.m8116c()) {
                C2905l.m8114c("mssdk", "bidding token: " + jSONObject.toString() + "\nbidding token length: " + jSONObject.toString().getBytes().length);
            }
            C3090e.m8912a(str);
        } catch (Throwable unused) {
        }
        C2905l.m8111b("TTAdManagerImpl", "bidding token: " + jSONObject.toString());
        return jSONObject.toString();
    }

    public int getCcpa() {
        return C3457h.m10580d().mo19782v();
    }

    public int getCoppa() {
        return C3457h.m10580d().mo19769i();
    }

    public int getDebugLog() {
        return this.f9056g;
    }

    public int getGdpr() {
        return C3457h.m10580d().mo19770j();
    }

    public String getSDKVersion() {
        return BuildConfig.VERSION_NAME;
    }

    public String getSupportRegion() {
        return "VA";
    }

    public boolean isExpressAd(String str, String str2) {
        if (C3513m.m10973h().mo19858h(str)) {
            return true;
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        m11338e(str2);
        return this.f9053c;
    }

    public boolean isFullScreenVideoAd(String str, String str2) {
        if (C3513m.m10973h().mo19861i(str)) {
            return true;
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        m11338e(str2);
        return this.f9052b;
    }

    public TTAdManager isUseTextureView(boolean z) {
        C3457h.m10580d().mo19762e(z);
        return this;
    }

    public boolean onlyVerityPlayable(String str, int i, String str2, String str3, String str4) {
        if (!this.f9054d.equals(C3513m.m10963a().getPackageName()) || !this.f9055e.equals(C3457h.m10580d().mo19764f()) || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Method a = C2922w.m8186a("com.bytedance.sdk.openadsdk.TTC3Proxy", "verityPlayable", String.class, Integer.TYPE, String.class, String.class, String.class);
            if (a != null) {
                a.invoke((Object) null, new Object[]{str, Integer.valueOf(i), str2, str3, str4});
            }
        } catch (Throwable th) {
            C2905l.m8112b("TTAdManagerImpl", "reward component maybe not exist, pls check", th);
        }
        return true;
    }

    public TTAdManager openDebugMode() {
        C2905l.m8109b();
        C2839a.m7860a();
        return this;
    }

    public void requestPermissionIfNecessary(Context context) {
    }

    public TTAdManager setAllowShowNotifiFromSDK(boolean z) {
        C3457h.m10580d().mo19759d(z);
        return this;
    }

    public TTAdManager setCcpa(int i) {
        C3457h.m10580d().mo19765f(i);
        return this;
    }

    public TTAdManager setCoppa(int i) {
        C3457h.m10580d().mo19749b(i);
        return this;
    }

    public TTAdManager setGdpr(int i) {
        C3457h.m10580d().mo19754c(i);
        return this;
    }

    public TTAdManager setIconId(int i) {
        C3457h.m10580d().mo19743a(i);
        return this;
    }

    public TTAdManager setNeedClearTaskReset(String[] strArr) {
        C3457h.m10580d().mo19747a(strArr);
        return this;
    }

    public TTAdManager setTitleBarTheme(int i) {
        C3457h.m10580d().mo19761e(i);
        return this;
    }

    public void showPrivacyProtection() {
        TTDelegateActivity.m8478a();
    }
}
