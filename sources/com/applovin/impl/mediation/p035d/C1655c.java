package com.applovin.impl.mediation.p035d;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.adcolony.sdk.AdColonyAppOptions;
import com.applovin.impl.mediation.p031a.C1583a;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p049ad.C1839e;
import com.applovin.impl.sdk.p053e.C1918o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.vungle.warren.BuildConfig;
import com.vungle.warren.utility.platform.Platform;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.d.c */
public class C1655c {

    /* renamed from: a */
    private static final TreeMap<String, String> f2327a;

    /* renamed from: b */
    private static final List<String> f2328b = new ArrayList(f2327a.keySet());

    /* renamed from: c */
    private static JSONArray f2329c;

    /* renamed from: d */
    private static final Object f2330d = new Object();

    static {
        TreeMap<String, String> treeMap = new TreeMap<>();
        f2327a = treeMap;
        treeMap.put("com.applovin.mediation.adapters.AdColonyMediationAdapter", "AdColony");
        f2327a.put("com.applovin.mediation.adapters.AmazonMediationAdapter", Platform.MANUFACTURER_AMAZON);
        f2327a.put("com.applovin.mediation.adapters.AmazonPublisherServicesMediationAdapter", "Amazon Publisher Services");
        f2327a.put("com.applovin.mediation.adapters.AmazonAdMarketplaceMediationAdapter", "Amazon Publisher Services");
        f2327a.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", "AppLovin");
        f2327a.put("com.applovin.mediation.adapters.BidMachineMediationAdapter", "BidMachine");
        f2327a.put("com.applovin.mediation.adapters.ByteDanceMediationAdapter", "Pangle");
        f2327a.put("com.applovin.mediation.adapters.ChartboostMediationAdapter", "Chartboost");
        f2327a.put("com.applovin.mediation.adapters.CriteoMediationAdapter", "Criteo");
        f2327a.put("com.applovin.mediation.adapters.DataseatMediationAdapter", "Dataseat");
        f2327a.put("com.applovin.mediation.adapters.FacebookMediationAdapter", "Facebook");
        f2327a.put("com.applovin.mediation.adapters.GoogleMediationAdapter", AdColonyAppOptions.ADMOB);
        f2327a.put("com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter", "Google Ad Manager");
        f2327a.put("com.applovin.mediation.adapters.HyprMXMediationAdapter", "HyprMX");
        f2327a.put("com.applovin.mediation.adapters.InMobiMediationAdapter", "InMobi");
        f2327a.put("com.applovin.mediation.adapters.InneractiveMediationAdapter", AdColonyAppOptions.FYBER);
        f2327a.put("com.applovin.mediation.adapters.IronSourceMediationAdapter", AdColonyAppOptions.IRONSOURCE);
        f2327a.put("com.applovin.mediation.adapters.LineMediationAdapter", "LINE");
        f2327a.put("com.applovin.mediation.adapters.MaioMediationAdapter", "Maio");
        f2327a.put("com.applovin.mediation.adapters.MintegralMediationAdapter", "Mintegral");
        f2327a.put("com.applovin.mediation.adapters.MyTargetMediationAdapter", "myTarget");
        f2327a.put("com.applovin.mediation.adapters.NendMediationAdapter", "Nend");
        f2327a.put("com.applovin.mediation.adapters.OguryMediationAdapter", "Ogury");
        f2327a.put("com.applovin.mediation.adapters.OguryPresageMediationAdapter", "Ogury Presage");
        f2327a.put("com.applovin.mediation.adapters.SayGamesMediationAdapter", "SayGames");
        f2327a.put("com.applovin.mediation.adapters.SmaatoMediationAdapter", "Smaato");
        f2327a.put("com.applovin.mediation.adapters.SnapMediationAdapter", "Snap");
        f2327a.put("com.applovin.mediation.adapters.TapjoyMediationAdapter", "Tapjoy");
        f2327a.put("com.applovin.mediation.adapters.TencentMediationAdapter", "Tencent");
        f2327a.put("com.applovin.mediation.adapters.UnityAdsMediationAdapter", "Unity Ads");
        f2327a.put("com.applovin.mediation.adapters.VerizonAdsMediationAdapter", "Verizon");
        f2327a.put("com.applovin.mediation.adapters.VerveMediationAdapter", "Verve");
        f2327a.put("com.applovin.mediation.adapters.VungleMediationAdapter", BuildConfig.OMSDK_PARTNER_NAME);
        f2327a.put("com.applovin.mediation.adapters.YandexMediationAdapter", "Yandex");
    }

    /* renamed from: a */
    public static C1918o.C1920a m3369a(MaxAdFormat maxAdFormat) {
        return maxAdFormat == MaxAdFormat.INTERSTITIAL ? C1918o.C1920a.MEDIATION_INTERSTITIAL : maxAdFormat == MaxAdFormat.REWARDED ? C1918o.C1920a.MEDIATION_INCENTIVIZED : maxAdFormat == MaxAdFormat.REWARDED_INTERSTITIAL ? C1918o.C1920a.MEDIATION_REWARDED_INTERSTITIAL : C1918o.C1920a.MEDIATION_BANNER;
    }

    /* renamed from: a */
    public static AppLovinSdkUtils.Size m3370a(int i, MaxAdFormat maxAdFormat, Context context) {
        if (i < 0) {
            try {
                Display defaultDisplay = (context instanceof Activity ? ((Activity) context).getWindowManager() : (WindowManager) context.getSystemService("window")).getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                i = AppLovinSdkUtils.pxToDp(context, displayMetrics.widthPixels);
            } catch (Throwable unused) {
                return maxAdFormat.getSize();
            }
        }
        Class<?> cls = Class.forName("com.google.android.gms.ads.AdSize");
        Method method = cls.getMethod("getCurrentOrientationAnchoredAdaptiveBannerAdSize", new Class[]{Context.class, Integer.TYPE});
        Method method2 = cls.getMethod("getWidth", new Class[0]);
        Method method3 = cls.getMethod("getHeight", new Class[0]);
        Object invoke = method.invoke((Object) null, new Object[]{context, Integer.valueOf(i)});
        return new AppLovinSdkUtils.Size(((Integer) method2.invoke(invoke, new Object[0])).intValue(), ((Integer) method3.invoke(invoke, new Object[0])).intValue());
    }

    /* renamed from: a */
    public static JSONArray m3371a(C1969m mVar) {
        if (f2329c != null) {
            m3375b(mVar);
            return f2329c;
        }
        f2329c = new JSONArray();
        for (String next : f2328b) {
            MaxAdapter b = m3374b(next, mVar);
            if (b != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("name", f2327a.get(next));
                    jSONObject.put("class", next);
                    jSONObject.put("sdk_version", b.getSdkVersion());
                    jSONObject.put("version", b.getAdapterVersion());
                } catch (Throwable unused) {
                }
                synchronized (f2330d) {
                    f2329c.put(jSONObject);
                }
            }
        }
        return f2329c;
    }

    /* renamed from: a */
    public static JSONObject m3372a(String str, C1969m mVar) {
        JSONArray a = m3371a(mVar);
        for (int i = 0; i < a.length(); i++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(a, i, (JSONObject) null);
            if (jSONObject != null && str.equals(JsonUtils.getString(jSONObject, "class", (String) null))) {
                return jSONObject;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m3373a(Object obj) {
        return (obj instanceof C1839e) && StringUtils.isValidString(((C1839e) obj).mo14174N());
    }

    /* renamed from: b */
    public static MaxAdapter m3374b(String str, C1969m mVar) {
        if (TextUtils.isEmpty(str)) {
            if (C2102v.m5104a()) {
                mVar.mo14509A().mo15016e("AppLovinSdk", "Failed to create adapter instance. No class name provided");
            }
            return null;
        }
        try {
            Class<?> cls = Class.forName(str);
            if (MaxAdapter.class.isAssignableFrom(cls)) {
                return (MaxAdapter) cls.getConstructor(new Class[]{AppLovinSdk.class}).newInstance(new Object[]{mVar.mo14532Y()});
            }
            if (C2102v.m5104a()) {
                C2102v A = mVar.mo14509A();
                A.mo15016e("AppLovinSdk", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
            }
            return null;
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            if (C2102v.m5104a()) {
                C2102v A2 = mVar.mo14509A();
                A2.mo15013b("AppLovinSdk", "Failed to load: " + str, th);
            }
        }
    }

    /* renamed from: b */
    private static void m3375b(C1969m mVar) {
        MaxAdapter b;
        for (int i = 0; i < f2329c.length(); i++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(f2329c, i, (JSONObject) null);
            String string = JsonUtils.getString(jSONObject, "class", "");
            if (!StringUtils.isValidString(JsonUtils.getString(jSONObject, "sdk_version", "")) && (b = m3374b(string, mVar)) != null) {
                String sdkVersion = b.getSdkVersion();
                if (StringUtils.isValidString(sdkVersion)) {
                    synchronized (f2330d) {
                        JsonUtils.putString(jSONObject, "sdk_version", sdkVersion);
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* renamed from: b */
    public static boolean m3376b(Object obj) {
        return (obj instanceof C1583a) && "APPLOVIN".equals(((C1583a) obj).mo13432M());
    }
}
