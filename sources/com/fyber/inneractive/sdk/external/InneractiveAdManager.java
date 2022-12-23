package com.fyber.inneractive.sdk.external;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.ViewTreeObserver;
import com.amazon.aps.shared.APSAnalytics;
import com.fyber.inneractive.sdk.C4125b;
import com.fyber.inneractive.sdk.bidder.C4151a;
import com.fyber.inneractive.sdk.bidder.C4174e;
import com.fyber.inneractive.sdk.cache.session.C4186b;
import com.fyber.inneractive.sdk.cache.session.C4189d;
import com.fyber.inneractive.sdk.config.C4205b;
import com.fyber.inneractive.sdk.config.C4210c;
import com.fyber.inneractive.sdk.config.C4212d;
import com.fyber.inneractive.sdk.config.C4213d0;
import com.fyber.inneractive.sdk.config.C4215e;
import com.fyber.inneractive.sdk.config.C4252h;
import com.fyber.inneractive.sdk.config.C4253i;
import com.fyber.inneractive.sdk.config.C4256j;
import com.fyber.inneractive.sdk.config.C4257k;
import com.fyber.inneractive.sdk.config.C4261l;
import com.fyber.inneractive.sdk.config.C4262m;
import com.fyber.inneractive.sdk.config.C4264n;
import com.fyber.inneractive.sdk.config.C4265o;
import com.fyber.inneractive.sdk.config.C4281s;
import com.fyber.inneractive.sdk.config.C4286x;
import com.fyber.inneractive.sdk.config.C4287y;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C4219a;
import com.fyber.inneractive.sdk.config.global.C4250r;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
import com.fyber.inneractive.sdk.factories.C4336a;
import com.fyber.inneractive.sdk.factories.C4339b;
import com.fyber.inneractive.sdk.factories.C4342c;
import com.fyber.inneractive.sdk.logger.FMPLogger;
import com.fyber.inneractive.sdk.mraid.IAMraidKit;
import com.fyber.inneractive.sdk.network.C4476c;
import com.fyber.inneractive.sdk.network.C4479d;
import com.fyber.inneractive.sdk.network.C4485f0;
import com.fyber.inneractive.sdk.network.C4507o;
import com.fyber.inneractive.sdk.network.C4509p;
import com.fyber.inneractive.sdk.network.C4511q;
import com.fyber.inneractive.sdk.network.C4523w;
import com.fyber.inneractive.sdk.p188dv.C4298c;
import com.fyber.inneractive.sdk.response.C5233e;
import com.fyber.inneractive.sdk.util.C5254a0;
import com.fyber.inneractive.sdk.util.C5256b0;
import com.fyber.inneractive.sdk.util.C5270f0;
import com.fyber.inneractive.sdk.util.C5284i;
import com.fyber.inneractive.sdk.util.C5292l;
import com.fyber.inneractive.sdk.util.C5299n;
import com.fyber.inneractive.sdk.util.C5302n0;
import com.fyber.inneractive.sdk.util.C5310r;
import com.fyber.inneractive.sdk.util.C5316t0;
import com.fyber.inneractive.sdk.util.C5318u0;
import com.fyber.inneractive.sdk.util.C5323v;
import com.fyber.inneractive.sdk.util.C5326w0;
import com.fyber.inneractive.sdk.util.C5332z;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.video.IAVideoKit;
import com.fyber.inneractive.sdk.web.C5375r;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

public final class InneractiveAdManager implements C4253i.C4255b {
    public static final String GLOBAL_CONFIG_PARAM_FIRST_INIT_EVENT = "sdk_first_init";

    /* renamed from: c */
    public static IAConfigManager.OnConfigurationReadyAndValidListener f10611c;

    /* renamed from: a */
    public volatile Context f10612a;

    /* renamed from: b */
    public String f10613b;

    public enum GdprConsentSource {
        Internal,
        External
    }

    /* renamed from: com.fyber.inneractive.sdk.external.InneractiveAdManager$a */
    public class C4329a implements IAConfigManager.OnConfigurationReadyAndValidListener {

        /* renamed from: a */
        public final /* synthetic */ Context f10615a;

        /* renamed from: b */
        public final /* synthetic */ OnFyberMarketplaceInitializedListener f10616b;

        public C4329a(Context context, OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener) {
            this.f10615a = context;
            this.f10616b = onFyberMarketplaceInitializedListener;
        }

        public void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z, Exception exc) {
            OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus;
            if (this.f10615a.getApplicationContext() != null) {
                IAConfigManager.removeListener(this);
                InneractiveAdManager.f10611c = null;
                if (z) {
                    InneractiveAdManager.m13413a(this.f10616b, OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY, (String) null);
                    return;
                }
                OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener = this.f10616b;
                if (exc instanceof InvalidAppIdException) {
                    fyberInitStatus = OnFyberMarketplaceInitializedListener.FyberInitStatus.INVALID_APP_ID;
                } else {
                    fyberInitStatus = OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED;
                }
                InneractiveAdManager.m13413a(onFyberMarketplaceInitializedListener, fyberInitStatus, exc.getLocalizedMessage());
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.external.InneractiveAdManager$b */
    public static class C4330b {

        /* renamed from: a */
        public static volatile InneractiveAdManager f10617a = new InneractiveAdManager();
    }

    /* renamed from: a */
    public static void m13413a(OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener, OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus, String str) {
        if (onFyberMarketplaceInitializedListener != null) {
            onFyberMarketplaceInitializedListener.onFyberMarketplaceInitialized(fyberInitStatus);
        }
        if (C4330b.f10617a.f10612a != null && fyberInitStatus != OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
            C4511q.C4512a aVar = new C4511q.C4512a(C4507o.FMP_SDK_INIT_FAILED, (InneractiveAdRequest) null, (C5233e) null, (JSONArray) null);
            if (!TextUtils.isEmpty(str)) {
                aVar.mo24692a("message", str);
            }
            aVar.mo24692a("init_status", fyberInitStatus.name());
            aVar.mo24693a((String) null);
        }
    }

    @Deprecated
    public static boolean areNativeAdsSupportedForOS() {
        return true;
    }

    public static void clearGdprConsentData() {
        C4212d dVar = IAConfigManager.f10324J.f10329D;
        if (dVar != null) {
            dVar.getClass();
            IAlog.m16446a("Clearing GDPR Consent String and status", new Object[0]);
            if (C5292l.f14015a == null) {
                IAlog.m16450e("ClearGdprConsent was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
                return;
            }
            dVar.mo24208b();
            dVar.f10393a = null;
            dVar.f10394b = null;
            SharedPreferences sharedPreferences = dVar.f10399g;
            if (sharedPreferences != null) {
                sharedPreferences.edit().remove("IAGdprConsentData").remove("IAGDPRBool").remove("IAGdprSource").apply();
                return;
            }
            return;
        }
        IAlog.m16450e("clearGdprConsentData() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
    }

    public static void clearImpressionDataListener() {
        IAConfigManager.f10324J.f10326A.f14006a = null;
    }

    public static void clearLgpdConsentData() {
        C4212d dVar = IAConfigManager.f10324J.f10329D;
        if (dVar != null) {
            dVar.getClass();
            IAlog.m16446a("Clearing LGPD consent status", new Object[0]);
            if (C5292l.f14015a == null) {
                IAlog.m16450e("clearLgpdConsentStatus was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
                return;
            }
            dVar.mo24208b();
            dVar.f10398f = null;
            SharedPreferences sharedPreferences = dVar.f10399g;
            if (sharedPreferences != null) {
                sharedPreferences.edit().remove("IALgpdConsentStatus").apply();
                return;
            }
            return;
        }
        IAlog.m16450e("clearLgpdConsentData was invoked, but Fyber SDK was not properly initialized", new Object[0]);
    }

    public static void clearUSPrivacyString() {
        C4212d dVar = IAConfigManager.f10324J.f10329D;
        dVar.getClass();
        IAlog.m16446a("Clearing CCPA Consent String", new Object[0]);
        if (C5292l.f14015a == null) {
            IAlog.m16450e("clearUSPrivacyString was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        dVar.mo24208b();
        dVar.f10397e = null;
        SharedPreferences sharedPreferences = dVar.f10399g;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("IACCPAConsentData").apply();
        }
    }

    public static void destroy() {
        IAlog.m16446a("InneractiveAdManager:destroy called", new Object[0]);
        if (C4330b.f10617a.f10612a == null) {
            IAlog.m16446a("InneractiveAdManager:destroy called, but manager is not initialized", new Object[0]);
            return;
        }
        C4330b.f10617a.f10612a = null;
        IAConfigManager.removeListener(f10611c);
        f10611c = null;
        IAConfigManager iAConfigManager = IAConfigManager.f10324J;
        iAConfigManager.f10326A.f14006a = null;
        iAConfigManager.f10342h = false;
        C5332z zVar = C5332z.C5333a.f14077a;
        IAlog.m16446a("%sdestroy called", "Location Manager: ");
        Runnable runnable = zVar.f14073d;
        if (runnable != null) {
            C5299n.f14024b.removeCallbacks(runnable);
        }
        zVar.mo26420a(zVar.f14074e);
        zVar.mo26420a(zVar.f14075f);
        zVar.f14074e = null;
        zVar.f14075f = null;
        zVar.f14070a = null;
        zVar.f14072c = null;
        C5270f0 f0Var = C5270f0.C5274d.f13984a;
        f0Var.f13979b.clear();
        for (Context context : f0Var.f13978a.keySet()) {
            Pair pair = f0Var.f13978a.get(context);
            if (pair != null && ((ViewTreeObserver) pair.first).isAlive()) {
                ((ViewTreeObserver) pair.first).removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) pair.second);
            }
        }
        f0Var.f13978a.clear();
        C5256b0 b0Var = C5256b0.C5257a.f13950a;
        synchronized (b0Var) {
            if (b0Var.f13948c != null) {
                IAlog.m16446a("%sremoving screen state receiver and destroying singleton", IAlog.m16443a((Object) b0Var));
                b0Var.f13948c.unregisterReceiver(b0Var.f13949d);
                b0Var.f13948c = null;
                b0Var.f13949d = null;
                b0Var.f13946a.clear();
            }
        }
        C4339b.C4340a.f10657a.f10656a.clear();
        C4336a.C4338b.f10655a.f10654a.clear();
        C4342c.C4344b.f10659a.f10658a.clear();
        InneractiveAdSpotManager.destroy();
        ((HashMap) C5292l.C5294b.f14017a).clear();
        C4151a aVar = C4151a.f10188h;
        C4174e eVar = aVar.f10192d;
        if (eVar != null) {
            try {
                C5292l.f14015a.unregisterReceiver(eVar);
            } catch (Exception unused) {
            }
        }
        aVar.f10192d = null;
    }

    public static String getAppId() {
        return IAConfigManager.f10324J.f10337c;
    }

    @Deprecated
    public static String getDevPlatform() {
        return C4330b.f10617a.f10613b;
    }

    public static Boolean getGdprConsent() {
        return IAConfigManager.f10324J.f10329D.mo24205a();
    }

    public static GdprConsentSource getGdprStatusSource() {
        C4212d dVar = IAConfigManager.f10324J.f10329D;
        if (dVar != null) {
            return dVar.f10395c;
        }
        IAlog.m16450e("getGdprStatusSource() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
        return null;
    }

    @Deprecated
    public static String getKeywords() {
        return IAConfigManager.f10324J.f10345k;
    }

    public static boolean getMuteVideo() {
        return IAConfigManager.f10324J.f10346l;
    }

    public static String getUserId() {
        return IAConfigManager.m13179e();
    }

    public static InneractiveUserConfig getUserParams() {
        return IAConfigManager.f10324J.f10344j;
    }

    public static String getVersion() {
        return "8.1.5";
    }

    public static void initialize(Context context, String str) {
        initialize(context, str, (OnFyberMarketplaceInitializedListener) null);
    }

    @Deprecated
    public static boolean isCurrentDeviceSupportsVideo() {
        return true;
    }

    @Deprecated
    public static void setDevPlatform(String str) {
        C4330b.f10617a.f10613b = str;
    }

    public static void setGdprConsent(boolean z) {
        setGdprConsent(z, GdprConsentSource.Internal);
    }

    public static void setGdprConsentString(String str) {
        C4212d dVar = IAConfigManager.f10324J.f10329D;
        if (dVar != null) {
            dVar.getClass();
            if (C5292l.f14015a == null) {
                IAlog.m16450e("SetGdprConsentString() was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
                return;
            }
            dVar.f10394b = str;
            if (!dVar.mo24206a("IAGdprConsentData", str)) {
                IAlog.m16450e("SetGdprConsentString() was invoked, but the Inneractive SDK was not properly initialized, destroyed, or data is empty.", new Object[0]);
                return;
            }
            return;
        }
        IAlog.m16450e("setGdprConsentString() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
    }

    public static void setImpressionDataListener(OnGlobalImpressionDataListener onGlobalImpressionDataListener) {
        IAConfigManager.f10324J.f10326A.f14006a = onGlobalImpressionDataListener;
    }

    @Deprecated
    public static void setKeywords(String str) {
        IAConfigManager.f10324J.f10345k = str;
    }

    public static void setLgpdConsent(boolean z) {
        C4212d dVar = IAConfigManager.f10324J.f10329D;
        if (dVar != null) {
            dVar.getClass();
            if (C5292l.f14015a == null) {
                IAlog.m16450e("setLgpdConsentStatus was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
                return;
            }
            dVar.f10398f = Boolean.valueOf(z);
            if (!dVar.mo24207a("IALgpdConsentStatus", z)) {
                IAlog.m16450e("setLgpdConsentStatus was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
                return;
            }
            return;
        }
        IAlog.m16450e("setLgpdConsent was invoked, but Fyber SDK was not properly initialized", new Object[0]);
    }

    public static void setLogLevel(int i) {
        IAlog.f13936a = i;
    }

    public static void setMediationName(String str) {
        IAConfigManager.f10324J.f10347m = str;
    }

    public static void setMediationVersion(String str) {
        if (str != null) {
            IAConfigManager.f10324J.f10349o = str;
        }
    }

    public static void setMuteVideo(boolean z) {
        IAConfigManager.f10324J.f10346l = z;
    }

    public static void setUSPrivacyString(String str) {
        C4212d dVar = IAConfigManager.f10324J.f10329D;
        if (dVar != null) {
            dVar.getClass();
            if (C5292l.f14015a == null) {
                IAlog.m16450e("setUSPrivacyString() was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
                return;
            }
            dVar.f10397e = str;
            if (!dVar.mo24206a("IACCPAConsentData", str)) {
                IAlog.m16450e("setUSPrivacyString() was invoked, but the Inneractive SDK was not properly initialized, destroyed, or data is empty.", new Object[0]);
                return;
            }
            return;
        }
        IAlog.m16450e("setUSPrivacyString() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
    }

    public static void setUseLocation(boolean z) {
        IAConfigManager.f10324J.f10353s = z;
    }

    public static void setUserId(String str) {
        IAConfigManager iAConfigManager = IAConfigManager.f10324J;
        if (C5292l.f14015a == null) {
            IAlog.m16450e("setUsedId() was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        C4212d dVar = IAConfigManager.f10324J.f10329D;
        dVar.getClass();
        if (C5292l.f14015a != null) {
            dVar.mo24208b();
            if (TextUtils.isEmpty(str)) {
                dVar.f10396d = str;
                SharedPreferences sharedPreferences = dVar.f10399g;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().remove("keyUserID").apply();
                    return;
                }
                return;
            }
            if (str.length() > 256) {
                str = str.substring(0, 256);
            }
            SharedPreferences sharedPreferences2 = dVar.f10399g;
            if (sharedPreferences2 != null) {
                dVar.f10396d = str;
                sharedPreferences2.edit().putString("keyUserID", str).apply();
            }
        }
    }

    public static void setUserParams(InneractiveUserConfig inneractiveUserConfig) {
        IAConfigManager.f10324J.f10344j = inneractiveUserConfig;
        IAlog.m16446a("config manager: setUserParams called with: age:" + inneractiveUserConfig.getAge() + " gender: " + inneractiveUserConfig.getGender() + " zip: " + inneractiveUserConfig.getZipCode(), new Object[0]);
    }

    public static void useSecureConnections(boolean z) {
        IAConfigManager.f10324J.f10352r = z;
        IAlog.m16446a("config manager: useSecureConnections called with: isSecured: + %s", Boolean.valueOf(z));
        if (!C5310r.m16527a() && !z) {
            IAlog.m16450e("************************************************************************************************************************", new Object[0]);
            IAlog.m16450e("*** useSecureConnections was set to false while secure traffic is enabled in the network security config", new Object[0]);
            IAlog.m16450e("***  The traffic will be Secured  ", new Object[0]);
            IAlog.m16450e("************************************************************************************************************************", new Object[0]);
        }
    }

    public static boolean wasInitialized() {
        return C4330b.f10617a.f10612a != null;
    }

    public Context getAppContext() {
        return this.f10612a;
    }

    public void onGlobalConfigChanged(C4253i iVar, C4252h hVar) {
        if (hVar != null && hVar.mo24273a(GLOBAL_CONFIG_PARAM_FIRST_INIT_EVENT, false)) {
            C5299n.f14024b.post(new C4335b(this));
        }
    }

    public static void initialize(Context context, String str, OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener) {
        OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus;
        String str2;
        int i;
        String str3;
        Context context2 = context;
        String str4 = str;
        OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener2 = onFyberMarketplaceInitializedListener;
        if (context2 == null || str4 == null) {
            IAlog.m16447b("InneractiveAdManager:initialize. No context or App Id given", new Object[0]);
            Object[] objArr = new Object[1];
            objArr[0] = str4 == null ? "appid" : "context";
            String format = String.format("%s is null", objArr);
            if (str4 == null || TextUtils.isEmpty(str.trim())) {
                fyberInitStatus = OnFyberMarketplaceInitializedListener.FyberInitStatus.INVALID_APP_ID;
            } else {
                fyberInitStatus = OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED;
            }
            m13413a(onFyberMarketplaceInitializedListener2, fyberInitStatus, format);
            return;
        }
        String str5 = IAConfigManager.f10324J.f10337c;
        boolean z = str5 != null && !str5.equalsIgnoreCase(str4);
        if (C4330b.f10617a.f10612a == null || z) {
            ((CopyOnWriteArrayList) IAlog.f13938c).retainAll(Collections.singleton(IAlog.f13937b));
            int i2 = C4215e.f10405a;
            String property = System.getProperty("ia.testEnvironmentConfiguration.logger");
            if (property != null) {
                for (String cls : property.split(",")) {
                    try {
                        FMPLogger fMPLogger = (FMPLogger) Class.forName(cls).newInstance();
                        fMPLogger.initialize(context2);
                        ((CopyOnWriteArrayList) IAlog.f13938c).add(fMPLogger);
                    } catch (Throwable unused) {
                    }
                }
            }
            C5292l.f14015a = (Application) context.getApplicationContext();
            C5256b0 b0Var = C5256b0.C5257a.f13950a;
            Context applicationContext = context.getApplicationContext();
            b0Var.getClass();
            IAlog.m16446a("%sinit called", IAlog.m16443a((Object) b0Var));
            b0Var.f13948c = applicationContext;
            b0Var.f13949d = new C5254a0(b0Var);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            b0Var.f13948c.registerReceiver(b0Var.f13949d, intentFilter);
            Intent intent = new Intent();
            intent.setAction("com.fyber.inneractive.sdk.intent.action.REGISTER_KIT");
            intent.setPackage(C5292l.f14015a.getPackageName());
            Context applicationContext2 = context.getApplicationContext();
            if (applicationContext2 != null) {
                List<BroadcastReceiver> asList = Arrays.asList(new BroadcastReceiver[]{new IAMraidKit(), new IAVideoKit(), new C4298c()});
                for (BroadcastReceiver broadcastReceiver : asList) {
                    try {
                        broadcastReceiver.onReceive(applicationContext2, intent);
                    } catch (Throwable unused2) {
                        IAlog.m16450e("%sCould not trigger receiver for %s", IAlog.m16442a((Class<?>) C4125b.class), broadcastReceiver);
                    }
                }
                if (C4339b.C4340a.f10657a.f10656a.size() == 0) {
                    Log.e("Inneractive_error", "Critical error raised while initializing SDK - please make sure you have added all the required fyber libraries (ia-mraid-kit, ia-video-kit) to your project");
                }
                if (asList.size() == 0) {
                    IAlog.m16447b("InneractiveAdManager:initialize. please make sure you have added all the required fyber libraries (ia-mraid-kit, ia-video-kit) to your project", new Object[0]);
                    m13413a(onFyberMarketplaceInitializedListener2, OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED_NO_KITS_DETECTED, (String) null);
                    return;
                }
                C4329a aVar = new C4329a(context2, onFyberMarketplaceInitializedListener2);
                f10611c = aVar;
                IAConfigManager.addListener(aVar);
                if (z) {
                    IAConfigManager iAConfigManager = IAConfigManager.f10324J;
                    iAConfigManager.f10337c = str4;
                    Map<String, C4286x> map = iAConfigManager.f10335a;
                    if (map != null) {
                        map.clear();
                    }
                    Map<String, C4287y> map2 = iAConfigManager.f10336b;
                    if (map2 != null) {
                        map2.clear();
                    }
                    iAConfigManager.f10339e = null;
                    iAConfigManager.f10338d = "";
                    IAConfigManager.m13175a();
                } else {
                    Context applicationContext3 = context.getApplicationContext();
                    IAConfigManager iAConfigManager2 = IAConfigManager.f10324J;
                    if (!iAConfigManager2.f10342h) {
                        C5318u0 u0Var = new C5318u0();
                        iAConfigManager2.f10359y = u0Var;
                        u0Var.f14051b = applicationContext3.getApplicationContext();
                        C5299n.m16520a(new C5316t0(u0Var));
                        C4523w wVar = iAConfigManager2.f10354t;
                        if (!wVar.f11187b) {
                            wVar.f11187b = true;
                            for (int i3 = 0; i3 < 6; i3++) {
                                wVar.f11189d.submit(wVar.f11190e);
                            }
                        }
                        C5299n.m16520a(new C4262m(iAConfigManager2, iAConfigManager2, applicationContext3));
                        C5375r.f14185c.getClass();
                        iAConfigManager2.f10329D = new C4212d();
                        C4253i iVar = new C4253i(applicationContext3);
                        iAConfigManager2.f10356v = iVar;
                        iAConfigManager2.f10357w = new C4256j(iVar);
                        iVar.mo24277b();
                        C4476c cVar = iAConfigManager2.f10332G;
                        Application application = (Application) applicationContext3.getApplicationContext();
                        if (!cVar.f11004g) {
                            cVar.f11004g = true;
                            cVar.f11000c.start();
                            cVar.f11001d = new C5302n0(cVar.f11000c.getLooper(), cVar);
                        }
                        application.registerActivityLifecycleCallbacks(new C4479d(cVar));
                        iAConfigManager2.f10356v.f10460c.add(new C4261l(iAConfigManager2));
                        iAConfigManager2.f10360z = new C4219a(new C4250r());
                        IAlog.m16446a("Initializing config manager", new Object[0]);
                        IAlog.m16446a("Config manager: lib name = %s", APSAnalytics.OS_NAME);
                        IAlog.m16446a("Config manager: app version = %s", "8.1.5");
                        C5332z zVar = C5332z.C5333a.f14077a;
                        Context applicationContext4 = applicationContext3.getApplicationContext();
                        zVar.f14070a = applicationContext4;
                        if (applicationContext4 != null && IAConfigManager.f10324J.f10353s) {
                            C5323v vVar = new C5323v(zVar);
                            zVar.f14072c = vVar;
                            C5284i.m16485a(applicationContext4, vVar);
                        }
                        C4257k kVar = C4257k.C4259b.f10467a;
                        if (kVar.f10465a == null) {
                            kVar.f10465a = applicationContext3;
                            new Thread(new C4281s(applicationContext3, kVar)).start();
                        }
                        if (!str4.matches("[0-9]+")) {
                            IAlog.m16447b("************************************************************************************************************************", new Object[0]);
                            IAlog.m16447b("*************************************** APP ID Must contain only numbers ***********************************************", new Object[0]);
                            IAlog.m16447b("*************************************** Are you sure that you are using the correct APP ID *****************************", new Object[0]);
                            IAlog.m16447b("************************************************************************************************************************", new Object[0]);
                        }
                        iAConfigManager2.f10340f = applicationContext3;
                        iAConfigManager2.f10337c = str4;
                        iAConfigManager2.f10344j = new InneractiveUserConfig();
                        iAConfigManager2.f10342h = true;
                        C4213d0 d0Var = iAConfigManager2.f10358x;
                        d0Var.getClass();
                        C4205b bVar = new C4205b(d0Var);
                        IAConfigManager iAConfigManager3 = IAConfigManager.f10324J;
                        C4253i iVar2 = iAConfigManager3.f10356v;
                        if (!iVar2.f10461d) {
                            iVar2.f10460c.add(bVar);
                        }
                        C5326w0 w0Var = new C5326w0(TimeUnit.MINUTES, (long) iAConfigManager3.f10356v.f10459b.mo24271a("session_duration", 30, 1));
                        bVar.f10382c = w0Var;
                        w0Var.f14065e = bVar.f10385f;
                        d0Var.f10402c.put("SESSION_STAMP", Long.toString(SystemClock.elapsedRealtime()));
                        C4189d dVar = new C4189d(25, (C4189d.C4190a) null);
                        d0Var.f10400a = dVar;
                        C5299n.m16520a(new C4186b(dVar));
                        iAConfigManager2.f10327B = new C4485f0(new C4264n(iAConfigManager2), iAConfigManager2.f10340f, new C4210c());
                        C5299n.m16520a(new C4265o(iAConfigManager2));
                        try {
                            str3 = Locale.getDefault().getLanguage();
                            try {
                                IAlog.m16446a("Available device language: %s", str3);
                            } catch (Exception unused3) {
                            }
                        } catch (Exception unused4) {
                            str3 = null;
                        }
                        iAConfigManager2.f10350p = str3;
                        iAConfigManager2.f10330E.mo24326a();
                    }
                }
                C4330b.f10617a.f10612a = context.getApplicationContext();
                SharedPreferences sharedPreferences = context2.getSharedPreferences("Fyber_Shared_File", 0);
                String string = sharedPreferences.getString("FyberExceptionKey", "empty");
                String string2 = sharedPreferences.getString("FyberDescriptionKey", "empty");
                String string3 = sharedPreferences.getString("FyberNameKey", "empty");
                String string4 = sharedPreferences.getString("FyberVersionKey", getVersion());
                IAlog.m16446a(" name- %s   description - %s exception - %s", string3, string2, string);
                if (!string.contains("OutOfMemoryError") && !string.equals("empty") && !string2.equals("empty") && !string3.equals("empty")) {
                    IAlog.m16446a("Firing Event 999 for %s", string);
                    C4509p pVar = C4509p.IA_UNCAUGHT_EXCEPTION;
                    C4511q.C4512a aVar2 = new C4511q.C4512a((C5233e) null);
                    aVar2.f11164c = pVar;
                    aVar2.f11162a = null;
                    aVar2.f11165d = null;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("exception_name", string3);
                        str2 = "FyberNameKey";
                        i = 2;
                    } catch (Exception unused5) {
                        str2 = "FyberNameKey";
                        i = 2;
                        IAlog.m16450e("Got exception adding param to json object: %s, %s", "exception_name", string3);
                    }
                    try {
                        jSONObject.put("description", string2);
                    } catch (Exception unused6) {
                        Object[] objArr2 = new Object[i];
                        objArr2[0] = "description";
                        objArr2[1] = string2;
                        IAlog.m16450e("Got exception adding param to json object: %s, %s", objArr2);
                    }
                    try {
                        jSONObject.put("stack_trace", string);
                    } catch (Exception unused7) {
                        Object[] objArr3 = new Object[i];
                        objArr3[0] = "stack_trace";
                        objArr3[1] = string;
                        IAlog.m16450e("Got exception adding param to json object: %s, %s", objArr3);
                    }
                    aVar2.f11167f.put(jSONObject);
                    aVar2.mo24693a(string4);
                    sharedPreferences.edit().remove("FyberExceptionKey").remove("FyberVersionKey").remove("FyberDescriptionKey").remove(str2).apply();
                }
                Thread.setDefaultUncaughtExceptionHandler(new C4334a(sharedPreferences, Thread.getDefaultUncaughtExceptionHandler()));
                IAConfigManager iAConfigManager4 = IAConfigManager.f10324J;
                iAConfigManager4.f10356v.f10460c.remove(C4330b.f10617a);
                iAConfigManager4.f10356v.f10460c.add(C4330b.f10617a);
                return;
            }
            throw new IllegalArgumentException("Context can't be null");
        }
        IAlog.m16446a("InneractiveAdManager:initialize called, but manager is already initialized. ignoring", new Object[0]);
        m13413a(onFyberMarketplaceInitializedListener2, OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY, (String) null);
    }

    public static void setGdprConsent(boolean z, GdprConsentSource gdprConsentSource) {
        C4212d dVar = IAConfigManager.f10324J.f10329D;
        if (dVar != null) {
            dVar.getClass();
            if (C5292l.f14015a == null) {
                IAlog.m16450e("SetGdprConsent(boolean) was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
                return;
            }
            dVar.f10393a = Boolean.valueOf(z);
            if (!dVar.mo24207a("IAGDPRBool", z)) {
                IAlog.m16450e("SetGdprConsent(boolean) was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            }
            dVar.f10395c = gdprConsentSource;
            if (!dVar.mo24206a("IAGdprSource", gdprConsentSource.name())) {
                IAlog.m16450e("SetGdprConsent(boolean) was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
                return;
            }
            return;
        }
        IAlog.m16450e("setGdprConsent() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
    }

    public static void setMediationName(InneractiveMediationName inneractiveMediationName) {
        if (inneractiveMediationName != null) {
            IAConfigManager iAConfigManager = IAConfigManager.f10324J;
            iAConfigManager.f10348n = inneractiveMediationName;
            iAConfigManager.f10347m = inneractiveMediationName.getKey();
        }
    }
}
