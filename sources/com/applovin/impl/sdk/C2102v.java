package com.applovin.impl.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.utils.AppKilledService;
import com.applovin.impl.sdk.utils.C2088k;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.v */
public class C2102v {

    /* renamed from: a */
    private final C1969m f4129a;

    C2102v(final C1969m mVar) {
        this.f4129a = mVar;
        if (!mVar.mo14575e()) {
            m5102a("SDK Session Begin");
            mVar.mo14560aj().registerReceiver(new AppLovinBroadcastManager.Receiver() {
                public void onReceive(Context context, Intent intent, Map<String, Object> map) {
                    C2102v.this.m5102a("SDK Session End");
                    mVar.mo14560aj().unregisterReceiver(this);
                }
            }, new IntentFilter(AppKilledService.ACTION_APP_KILLED));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5102a(String str) {
        C2088k kVar = new C2088k();
        kVar.mo14935a().mo14941a(str).mo14935a();
        m5107f("AppLovinSdk", kVar.toString());
    }

    /* renamed from: a */
    private void m5103a(String str, String str2, boolean z) {
        int intValue;
        if (StringUtils.isValidString(str2) && (intValue = ((Integer) this.f4129a.mo14534a(C1867b.f3137al)).intValue()) > 0) {
            int length = str2.length();
            int i = ((length + intValue) - 1) / intValue;
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * intValue;
                String substring = str2.substring(i3, Math.min(length, i3 + intValue));
                if (z) {
                    Log.d(str, substring);
                } else {
                    mo15012b(str, substring);
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m5104a() {
        List<AppLovinSdk> a = AppLovinSdk.m5176a();
        if (a.isEmpty()) {
            return false;
        }
        AppLovinSdk appLovinSdk = a.get(0);
        return appLovinSdk == null || m5105a(appLovinSdk.coreSdk);
    }

    /* renamed from: a */
    public static boolean m5105a(C1969m mVar) {
        return mVar != null && mVar.mo14519K().mo14292d();
    }

    /* renamed from: c */
    public static void m5106c(String str, String str2, Throwable th) {
        Log.e("AppLovinSdk", "[" + str + "] " + str2, th);
    }

    /* renamed from: f */
    public static void m5107f(String str, String str2) {
        Log.d("AppLovinSdk", "[" + str + "] " + str2);
    }

    /* renamed from: g */
    public static void m5108g(String str, String str2) {
        Log.i("AppLovinSdk", "[" + str + "] " + str2);
    }

    /* renamed from: h */
    public static void m5109h(String str, String str2) {
        Log.w("AppLovinSdk", "[" + str + "] " + str2);
    }

    /* renamed from: i */
    public static void m5110i(String str, String str2) {
        m5106c(str, str2, (Throwable) null);
    }

    /* renamed from: j */
    private void m5111j(String str, String str2) {
    }

    /* renamed from: a */
    public void mo15010a(String str, String str2) {
        if (m5105a(this.f4129a)) {
            m5103a(str, str2, false);
        }
    }

    /* renamed from: a */
    public void mo15011a(String str, String str2, Throwable th) {
        if (m5105a(this.f4129a)) {
            String str3 = "[" + str + "] " + str2;
            Log.w("AppLovinSdk", str3, th);
            m5111j("WARN", str3);
        }
    }

    /* renamed from: b */
    public void mo15012b(String str, String str2) {
        if (m5105a(this.f4129a)) {
            String str3 = "[" + str + "] " + str2;
            Log.d("AppLovinSdk", str3);
            m5111j("DEBUG", str3);
        }
    }

    /* renamed from: b */
    public void mo15013b(String str, String str2, Throwable th) {
        if (m5105a(this.f4129a)) {
            String str3 = "[" + str + "] " + str2;
            Log.e("AppLovinSdk", str3, th);
            m5111j("ERROR", str3 + " : " + th);
        }
    }

    /* renamed from: c */
    public void mo15014c(String str, String str2) {
        if (m5105a(this.f4129a)) {
            String str3 = "[" + str + "] " + str2;
            Log.i("AppLovinSdk", str3);
            m5111j("INFO", str3);
        }
    }

    /* renamed from: d */
    public void mo15015d(String str, String str2) {
        mo15011a(str, str2, (Throwable) null);
    }

    /* renamed from: e */
    public void mo15016e(String str, String str2) {
        mo15013b(str, str2, (Throwable) null);
    }
}
