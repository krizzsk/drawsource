package com.tapjoy;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.inmobi.unification.sdk.InitializationStatus;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.internal.C11287bb;
import com.tapjoy.internal.C11296bh;
import com.tapjoy.internal.C11325ce;
import com.tapjoy.internal.C11432ew;
import com.tapjoy.internal.C11450fc;
import com.tapjoy.internal.C11453fd;
import com.tapjoy.internal.C11471fj;
import com.tapjoy.internal.C11484fq;
import com.tapjoy.internal.C11491fu;
import com.tapjoy.internal.C11506gd;
import com.tapjoy.internal.C11519gh;
import com.tapjoy.internal.C11531gp;
import com.tapjoy.internal.C11534gs;
import com.tapjoy.internal.C11558hj;
import com.tapjoy.internal.C11685u;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.UUID;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import org.w3c.dom.Document;

public class TapjoyConnectCore {

    /* renamed from: A */
    private static String f26773A = "";

    /* renamed from: B */
    private static int f26774B = 1;

    /* renamed from: C */
    private static float f26775C = 1.0f;

    /* renamed from: D */
    private static int f26776D = 1;
    public static final float DEFAULT_CURRENCY_MULTIPLIER = 1.0f;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public static String f26777E = "";

    /* renamed from: F */
    private static String f26778F = "";

    /* renamed from: G */
    private static String f26779G = "";

    /* renamed from: H */
    private static String f26780H = "";

    /* renamed from: I */
    private static String f26781I = "";

    /* renamed from: J */
    private static String f26782J = "";

    /* renamed from: K */
    private static String f26783K = "";

    /* renamed from: L */
    private static String f26784L = "";

    /* renamed from: M */
    private static String f26785M = "";

    /* renamed from: N */
    private static String f26786N = "";

    /* renamed from: O */
    private static String f26787O = "";

    /* renamed from: P */
    private static String f26788P = "";

    /* renamed from: Q */
    private static String f26789Q = "native";

    /* renamed from: R */
    private static String f26790R = "";

    /* renamed from: S */
    private static String f26791S = "";

    /* renamed from: T */
    private static float f26792T = 1.0f;

    /* renamed from: U */
    private static boolean f26793U = false;

    /* renamed from: V */
    private static String f26794V = "";

    /* renamed from: W */
    private static String f26795W = "";

    /* renamed from: X */
    private static String f26796X = "";

    /* renamed from: Y */
    private static String f26797Y = "";

    /* renamed from: Z */
    private static Map<String, Object> f26798Z = new HashMap();

    /* renamed from: a */
    protected static int f26799a = 0;

    /* renamed from: aA */
    private static Set<String> f26800aA = null;

    /* renamed from: aB */
    private static Integer f26801aB = null;

    /* renamed from: aC */
    private static Integer f26802aC = null;

    /* renamed from: aD */
    private static Integer f26803aD = null;

    /* renamed from: aE */
    private static Long f26804aE = null;

    /* renamed from: aF */
    private static Long f26805aF = null;

    /* renamed from: aG */
    private static Long f26806aG = null;

    /* renamed from: aH */
    private static String f26807aH = null;

    /* renamed from: aI */
    private static Integer f26808aI = null;

    /* renamed from: aJ */
    private static Double f26809aJ = null;

    /* renamed from: aK */
    private static Double f26810aK = null;

    /* renamed from: aL */
    private static Long f26811aL = null;

    /* renamed from: aM */
    private static Integer f26812aM = null;

    /* renamed from: aN */
    private static Integer f26813aN = null;

    /* renamed from: aO */
    private static Integer f26814aO = null;

    /* renamed from: aP */
    private static String f26815aP = null;

    /* renamed from: aQ */
    private static String f26816aQ = null;

    /* renamed from: aR */
    private static String f26817aR = null;

    /* renamed from: aS */
    private static String f26818aS = "";

    /* renamed from: aT */
    private static String f26819aT = "";

    /* renamed from: aU */
    private static String f26820aU = "";

    /* renamed from: aV */
    private static boolean f26821aV = false;

    /* renamed from: aW */
    private static TJConnectListener f26822aW = null;

    /* renamed from: aX */
    private static boolean f26823aX = false;

    /* renamed from: aa */
    private static String f26824aa = null;

    /* renamed from: ad */
    private static long f26825ad = 0;

    /* renamed from: af */
    private static boolean f26826af = false;

    /* renamed from: ag */
    private static PackageManager f26827ag = null;

    /* renamed from: ah */
    private static TapjoyGpsHelper f26828ah = null;

    /* renamed from: ai */
    private static Hashtable<String, Object> f26829ai = TapjoyConnectFlag.CONNECT_FLAG_DEFAULTS;

    /* renamed from: aj */
    private static Map<String, Integer> f26830aj = new ConcurrentHashMap();

    /* renamed from: ak */
    private static String f26831ak = null;

    /* renamed from: al */
    private static String f26832al = null;

    /* renamed from: am */
    private static String f26833am = null;

    /* renamed from: an */
    private static String f26834an = null;

    /* renamed from: ao */
    private static Integer f26835ao = null;

    /* renamed from: ap */
    private static String f26836ap = null;

    /* renamed from: aq */
    private static String f26837aq = null;

    /* renamed from: ar */
    private static Long f26838ar = null;

    /* renamed from: as */
    private static String f26839as = null;

    /* renamed from: at */
    private static Integer f26840at = null;

    /* renamed from: au */
    private static Integer f26841au = null;

    /* renamed from: av */
    private static String f26842av = null;

    /* renamed from: aw */
    private static String f26843aw = null;

    /* renamed from: ax */
    private static String f26844ax = null;

    /* renamed from: ay */
    private static String f26845ay = null;

    /* renamed from: az */
    private static String f26846az = null;

    /* renamed from: b */
    protected static int f26847b = 0;

    /* renamed from: c */
    protected static String f26848c = "";

    /* renamed from: d */
    protected static boolean f26849d = false;

    /* renamed from: e */
    protected static String f26850e = "";

    /* renamed from: f */
    protected static String f26851f = "";

    /* renamed from: g */
    protected static String f26852g = "";
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static Context f26853h = null;

    /* renamed from: i */
    private static String f26854i = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static TapjoyConnectCore f26855j = null;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static TapjoyURLConnection f26856k = null;

    /* renamed from: l */
    private static TJConnectListener f26857l = null;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static TJSetUserIDListener f26858m = null;

    /* renamed from: n */
    private static boolean f26859n = false;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static boolean f26860o = false;

    /* renamed from: p */
    private static Vector<String> f26861p = new Vector<>(Arrays.asList(TapjoyConstants.dependencyClassNames));

    /* renamed from: q */
    private static String f26862q = "";

    /* renamed from: r */
    private static String f26863r = "";

    /* renamed from: s */
    private static String f26864s = "";

    /* renamed from: t */
    private static String f26865t = "";

    /* renamed from: u */
    private static String f26866u = "";

    /* renamed from: v */
    private static String f26867v = "";

    /* renamed from: w */
    private static String f26868w = "";

    /* renamed from: x */
    private static String f26869x = "";

    /* renamed from: y */
    private static String f26870y = "";

    /* renamed from: z */
    private static String f26871z = "";

    /* renamed from: ab */
    private long f26872ab = 0;

    /* renamed from: ac */
    private boolean f26873ac = false;

    /* renamed from: ae */
    private boolean f26874ae = false;

    public static String getConnectURL() {
        return TapjoyConfig.TJC_CONNECT_SERVICE_URL;
    }

    public static TapjoyConnectCore getInstance() {
        return f26855j;
    }

    public static void requestTapjoyConnect(Context context, String str) {
        requestTapjoyConnect(context, str, (Hashtable<String, ?>) null);
    }

    public static void requestTapjoyConnect(Context context, String str, Hashtable<String, ?> hashtable) {
        requestTapjoyConnect(context, str, hashtable, (TJConnectListener) null);
    }

    public static void requestTapjoyConnect(Context context, String str, Hashtable<String, ?> hashtable, TJConnectListener tJConnectListener) {
        try {
            C11484fq fqVar = new C11484fq(str);
            if (fqVar.f27565a == C11484fq.C11485a.SDK_ANDROID) {
                f26854i = str;
                f26869x = fqVar.f27566b;
                f26787O = fqVar.f27567c;
                f26788P = fqVar.f27568d;
                if (hashtable != null) {
                    f26829ai.putAll(hashtable);
                    C11506gd.m31493b().mo70033a(hashtable);
                }
                C11558hj.m31645a(context).f27748i = str;
                f26857l = tJConnectListener;
                if (f26855j == null) {
                    f26855j = new TapjoyConnectCore();
                }
                TapjoyConnectCore tapjoyConnectCore = f26855j;
                try {
                    m30803a(context);
                    new Thread(new Runnable() {
                        public final void run() {
                            TapjoyConnectCore.m30797a();
                            TapjoyConnectCore.m30799a(TapjoyConnectCore.this, TapjoyConnectCore.f26853h, new TJTaskHandler() {
                                public final void onComplete() {
                                    new Thread(new Runnable() {
                                        public final void run() {
                                            TapjoyConnectCore.this.completeConnectCall();
                                        }
                                    }).start();
                                }
                            });
                        }
                    }).start();
                    tapjoyConnectCore.f26874ae = true;
                } catch (TapjoyIntegrationException e) {
                    TapjoyLog.m30840e("TapjoyConnect", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, e.getMessage()));
                    m30818i();
                    C11491fu.f27585b.notifyObservers(Boolean.FALSE);
                } catch (TapjoyException e2) {
                    TapjoyLog.m30840e("TapjoyConnect", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, e2.getMessage()));
                    m30818i();
                    C11491fu.f27585b.notifyObservers(Boolean.FALSE);
                }
            } else {
                throw new IllegalArgumentException("The given API key was not for Android.");
            }
        } catch (IllegalArgumentException e3) {
            throw new TapjoyIntegrationException(e3.getMessage());
        }
    }

    public static void requestLimitedTapjoyConnect(Context context, String str, TJConnectListener tJConnectListener) {
        try {
            C11484fq fqVar = new C11484fq(str);
            if (fqVar.f27565a == C11484fq.C11485a.SDK_ANDROID) {
                f26818aS = fqVar.f27566b;
                f26819aT = fqVar.f27567c;
                if (f26855j == null) {
                    f26855j = new TapjoyConnectCore();
                }
                f26822aW = tJConnectListener;
                TapjoyConnectCore tapjoyConnectCore = f26855j;
                try {
                    m30803a(context);
                    new Thread(new Runnable() {
                        public final void run() {
                            TapjoyConnectCore.m30797a();
                            TapjoyConnectCore.m30799a(TapjoyConnectCore.this, TapjoyConnectCore.f26853h, new TJTaskHandler() {
                                public final void onComplete() {
                                    new Thread(new Runnable() {
                                        public final void run() {
                                            TapjoyConnectCore.this.completeLimitedConnectCall();
                                        }
                                    }).start();
                                }
                            });
                        }
                    }).start();
                } catch (TapjoyIntegrationException e) {
                    TapjoyLog.m30840e("TapjoyConnect", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, e.getMessage()));
                    m30819j();
                    C11491fu.f27585b.notifyObservers(Boolean.FALSE);
                } catch (TapjoyException e2) {
                    TapjoyLog.m30840e("TapjoyConnect", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, e2.getMessage()));
                    m30819j();
                    C11491fu.f27585b.notifyObservers(Boolean.FALSE);
                }
                TapjoyLog.m30839d("TapjoyConnect", "requestTapjoyConnect function complete");
                return;
            }
            throw new IllegalArgumentException("The given API key was not for Android.");
        } catch (IllegalArgumentException e3) {
            TapjoyLog.m30839d("TapjoyConnect", e3.getMessage());
            throw new TapjoyIntegrationException(e3.getMessage());
        }
    }

    /* renamed from: i */
    private static void m30818i() {
        if (!TextUtils.isEmpty(f26788P)) {
            C11558hj.m31644a().mo70112a(f26853h, f26854i, "12.10.0", TapjoyConfig.TJC_ANALYTICS_SERVICE_URL, f26788P, f26787O);
        }
        TJConnectListener tJConnectListener = f26857l;
        if (tJConnectListener != null) {
            tJConnectListener.onConnectFailure();
        }
    }

    /* renamed from: j */
    private static void m30819j() {
        TJConnectListener tJConnectListener = f26822aW;
        if (tJConnectListener != null) {
            tJConnectListener.onConnectFailure();
        }
    }

    public void appPause() {
        this.f26873ac = true;
    }

    public void appResume() {
        if (this.f26873ac) {
            m30793K();
            this.f26873ac = false;
        }
    }

    public static Map<String, String> getURLParams() {
        Map<String, String> genericURLParams = getGenericURLParams();
        genericURLParams.putAll(getTimeStampAndVerifierParams());
        return genericURLParams;
    }

    public static Map<String, String> getLimitedURLParams() {
        Map<String, String> limitedGenericURLParams = getLimitedGenericURLParams();
        limitedGenericURLParams.putAll(getLimitedTimeStampAndVerifierParams());
        return limitedGenericURLParams;
    }

    public static Map<String, String> getGenericURLParams() {
        Map<String, String> k = m30820k();
        TapjoyUtil.safePut(k, "app_id", f26869x, true);
        return k;
    }

    public static Map<String, String> getLimitedGenericURLParams() {
        Map<String, String> k = m30820k();
        TapjoyUtil.safePut(k, "app_id", f26818aS, true);
        TapjoyUtil.safePut(k, TapjoyConstants.TJC_APP_GROUP_ID, f26820aU, true);
        TapjoyUtil.safePut(k, TapjoyConstants.TJC_LIMITED, "true", true);
        return k;
    }

    /* renamed from: k */
    private static Map<String, String> m30820k() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(m30821l());
        hashMap.putAll(m30826q());
        return hashMap;
    }

    /* renamed from: l */
    private static Map<String, String> m30821l() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(m30822m());
        hashMap.putAll(m30823n());
        hashMap.putAll(m30824o());
        hashMap.putAll(m30825p());
        hashMap.putAll(C11519gh.m31513a().mo70056b());
        if (!(TapjoyCache.getInstance() == null || TapjoyCache.getInstance().getCachedOfferIDs() == null || TapjoyCache.getInstance().getCachedOfferIDs().length() <= 0)) {
            TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_CACHED_OFFERS, TapjoyCache.getInstance().getCachedOfferIDs(), true);
        }
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_CURRENCY_MULTIPLIER, Float.toString(f26792T), true);
        return hashMap;
    }

    public static Map<String, String> getTimeStampAndVerifierParams() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String a = m30796a(currentTimeMillis);
        HashMap hashMap = new HashMap();
        TapjoyUtil.safePut(hashMap, "timestamp", String.valueOf(currentTimeMillis), true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_VERIFIER, a, true);
        return hashMap;
    }

    public static Map<String, String> getLimitedTimeStampAndVerifierParams() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String b = m30807b(currentTimeMillis);
        HashMap hashMap = new HashMap();
        TapjoyUtil.safePut(hashMap, "timestamp", String.valueOf(currentTimeMillis), true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_VERIFIER, b, true);
        return hashMap;
    }

    /* renamed from: m */
    private static Map<String, String> m30822m() {
        HashMap hashMap = new HashMap();
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_PLUGIN, f26789Q, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_SDK_TYPE, f26790R, true);
        TapjoyUtil.safePut(hashMap, "app_id", f26869x, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_LIBRARY_VERSION, f26871z, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_LIBRARY_REVISION, TapjoyRevision.GIT_REVISION, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_BRIDGE_VERSION, f26773A, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_OMSDK_VERSION, C11325ce.m31030a(), true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_APP_VERSION_NAME, f26870y, true);
        return hashMap;
    }

    /* renamed from: n */
    private static Map<String, String> m30823n() {
        HashMap hashMap = new HashMap();
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_DEVICE_NAME, f26865t, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_PLATFORM, f26779G, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_DEVICE_OS_VERSION_NAME, f26868w, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_DEVICE_MANUFACTURER, f26866u, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_DEVICE_TYPE_NAME, f26867v, true);
        StringBuilder sb = new StringBuilder();
        sb.append(f26776D);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_DEVICE_SCREEN_LAYOUT_SIZE, sb.toString(), true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_STORE_NAME, f26786N, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_STORE_VIEW, String.valueOf(f26793U), true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_CARRIER_NAME, f26780H, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_CARRIER_COUNTRY_CODE, f26781I, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_MOBILE_NETWORK_CODE, f26783K, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_MOBILE_COUNTRY_CODE, f26782J, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_DEVICE_COUNTRY_CODE, Locale.getDefault().getCountry(), true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_DEVICE_LANGUAGE, Locale.getDefault().getLanguage(), true);
        String connectionType = getConnectionType();
        f26784L = connectionType;
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_CONNECTION_TYPE, connectionType, true);
        String connectionSubType = getConnectionSubType();
        f26785M = connectionSubType;
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_CONNECTION_SUBTYPE, connectionSubType, true);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f26774B);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_DEVICE_SCREEN_DENSITY, sb2.toString(), true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_VOLUME, TapjoyUtil.getVolume(f26853h));
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_DEVICE_THEME, TapjoyUtil.getTheme(f26853h), true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_DEVICE_SCREEN_BRIGHTNESS, TapjoyUtil.getScreenBrightness(f26853h));
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_AVAILABLE_DISK_SPACE, TapjoyUtil.getAvailableDiskSpace());
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_TOTAL_DISK_SPACE, TapjoyUtil.getTotalDiskSpace());
        return hashMap;
    }

    /* renamed from: o */
    private static Map<String, String> m30824o() {
        HashMap hashMap = new HashMap();
        if (m30790H()) {
            if (f26828ah.isAdvertisingIdAllowed()) {
                TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_ADVERTISING_ID, f26848c, true);
            }
            TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_AD_TRACKING_ENABLED, String.valueOf(f26849d), true);
        }
        if (!TextUtils.isEmpty(f26852g)) {
            TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_APP_SET_ID, f26852g, true);
        }
        if ((m30791I() && !m30790H()) || !m30792J()) {
            TapjoyUtil.safePut(hashMap, "android_id", f26862q, true);
        }
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_INSTALL_ID, f26864s, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_USER_ID, f26777E, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_ADVERTISING_ID_CHECK_DISABLED, f26850e, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_LEGACY_ID_FALLBACK_ALLOWED, f26851f, true);
        int i = f26799a;
        if (i != 0) {
            TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_PACKAGED_GOOGLE_PLAY_SERVICES_VERSION, Integer.toString(i), true);
        }
        int i2 = f26847b;
        if (i2 != 0) {
            TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_DEVICE_GOOGLE_PLAY_SERVICES_VERSION, Integer.toString(i2), true);
        }
        String str = f26863r;
        if (str == null || str.length() == 0 || System.currentTimeMillis() - f26825ad > TapjoyConstants.SESSION_ID_INACTIVITY_TIME) {
            f26863r = m30793K();
        } else {
            f26825ad = System.currentTimeMillis();
        }
        TapjoyUtil.safePut(hashMap, "session_id", f26863r, true);
        return hashMap;
    }

    /* renamed from: p */
    private static Map<String, String> m30825p() {
        HashMap hashMap = new HashMap();
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_APP_GROUP_ID, f26794V, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_STORE, f26795W, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_ANALYTICS_API_KEY, f26796X, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_MANAGED_DEVICE_ID, f26797Y, true);
        return hashMap;
    }

    /* renamed from: q */
    private static Map<String, String> m30826q() {
        HashMap hashMap = new HashMap();
        m30830u();
        hashMap.putAll(m30827r());
        hashMap.putAll(m30828s());
        hashMap.putAll(m30829t());
        return hashMap;
    }

    /* renamed from: r */
    private static Map<String, String> m30827r() {
        HashMap hashMap = new HashMap();
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_ANALYTICS_ID, f26831ak, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_PACKAGE_ID, f26832al, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_PACKAGE_SIGN, f26833am, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_DEVICE_DISPLAY_DENSITY, f26812aM);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_DEVICE_DISPLAY_WIDTH, f26813aN);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_DEVICE_DISPLAY_HEIGHT, f26814aO);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_DEVICE_COUNTRY_SIM, f26815aP, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_DEVICE_TIMEZONE, f26816aQ, true);
        return hashMap;
    }

    /* renamed from: s */
    private static Map<String, String> m30828s() {
        HashMap hashMap = new HashMap();
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_PACKAGE_VERSION, f26834an, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_PACKAGE_REVISION, f26835ao);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_PACKAGE_DATA_VERSION, f26836ap, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_INSTALLER, f26837aq, true);
        if (TextUtils.isEmpty(f26786N)) {
            TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_STORE_NAME, f26817aR, true);
        }
        return hashMap;
    }

    /* renamed from: t */
    private static Map<String, String> m30829t() {
        HashMap hashMap = new HashMap();
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_INSTALLED, f26838ar);
        TapjoyUtil.safePut(hashMap, "referrer", f26839as, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_USER_LEVEL, f26840at);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_USER_FRIEND_COUNT, f26841au);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_USER_VARIABLE_1, f26842av, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_USER_VARIABLE_2, f26843aw, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_USER_VARIABLE_3, f26844ax, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_USER_VARIABLE_4, f26845ay, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_USER_VARIABLE_5, f26846az, true);
        int i = 0;
        for (String safePut : f26800aA) {
            StringBuilder sb = new StringBuilder("user_tags[");
            int i2 = i + 1;
            sb.append(i);
            sb.append("]");
            TapjoyUtil.safePut(hashMap, sb.toString(), safePut, true);
            i = i2;
        }
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_USER_WEEKLY_FREQUENCY, f26801aB);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_USER_MONTHLY_FREQUENCY, f26802aC);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_SESSION_TOTAL_COUNT, f26803aD);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_SESSION_TOTAL_LENGTH, f26804aE);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_SESSION_LAST_AT, f26805aF);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_SESSION_LAST_LENGTH, f26806aG);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_PURCHASE_CURRENCY, f26807aH, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_PURCHASE_TOTAL_COUNT, f26808aI);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_PURCHASE_TOTAL_PRICE, f26809aJ);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_PURCHASE_LAST_PRICE, f26810aK);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_PURCHASE_LAST_AT, f26811aL);
        return hashMap;
    }

    /* renamed from: a */
    private static boolean m30803a(Context context) {
        f26853h = context;
        f26827ag = context.getPackageManager();
        C11519gh.m31513a().mo70053a(context);
        C11506gd.m31492a().mo70038a(context);
        f26828ah = new TapjoyGpsHelper(f26853h);
        if (f26856k == null) {
            f26856k = new TapjoyURLConnection();
        }
        m30784B();
        if (TextUtils.isEmpty(getConnectFlagValue("unit_test_mode"))) {
            m30787E();
        }
        m30832w();
        m30830u();
        if (getConnectFlagValue(TapjoyConnectFlag.ALLOW_LEGACY_ID_FALLBACK) != null && getConnectFlagValue(TapjoyConnectFlag.ALLOW_LEGACY_ID_FALLBACK).length() > 0) {
            f26851f = getConnectFlagValue(TapjoyConnectFlag.ALLOW_LEGACY_ID_FALLBACK);
        }
        if (getConnectFlagValue(TapjoyConnectFlag.DISABLE_ADVERTISING_ID_CHECK) != null && getConnectFlagValue(TapjoyConnectFlag.DISABLE_ADVERTISING_ID_CHECK).length() > 0) {
            f26850e = getConnectFlagValue(TapjoyConnectFlag.DISABLE_ADVERTISING_ID_CHECK);
        }
        if (getConnectFlagValue(TapjoyConnectFlag.USER_ID) != null && getConnectFlagValue(TapjoyConnectFlag.USER_ID).length() > 0) {
            TapjoyLog.m30842i("TapjoyConnect", "Setting userID to: " + getConnectFlagValue(TapjoyConnectFlag.USER_ID));
            setUserID(getConnectFlagValue(TapjoyConnectFlag.USER_ID), (TJSetUserIDListener) null);
        }
        f26791S = TapjoyUtil.getRedirectDomain(getConnectFlagValue(TapjoyConnectFlag.SERVICE_URL));
        if (f26829ai == null) {
            return true;
        }
        m30831v();
        return true;
    }

    /* renamed from: u */
    private static void m30830u() {
        C11453fd a = C11558hj.m31645a(f26853h).mo70110a(true);
        C11450fc fcVar = a.f27417d;
        f26831ak = fcVar.f27381h;
        f26832al = fcVar.f27391r;
        f26833am = fcVar.f27392s;
        f26812aM = fcVar.f27386m;
        f26813aN = fcVar.f27387n;
        f26814aO = fcVar.f27388o;
        f26815aP = fcVar.f27394u;
        f26816aQ = fcVar.f27390q;
        C11432ew ewVar = a.f27418e;
        f26834an = ewVar.f27278e;
        f26835ao = ewVar.f27279f;
        f26836ap = ewVar.f27280g;
        f26837aq = ewVar.f27281h;
        f26817aR = ewVar.f27282i;
        C11471fj fjVar = a.f27419f;
        f26838ar = fjVar.f27512s;
        f26839as = fjVar.f27513t;
        f26840at = fjVar.f27503J;
        f26841au = fjVar.f27504K;
        f26842av = fjVar.f27505L;
        f26843aw = fjVar.f27506M;
        f26844ax = fjVar.f27507N;
        f26845ay = fjVar.f27508O;
        f26846az = fjVar.f27509P;
        f26800aA = new HashSet(fjVar.f27510Q);
        f26801aB = fjVar.f27514u;
        f26802aC = fjVar.f27515v;
        f26803aD = fjVar.f27517x;
        f26804aE = fjVar.f27518y;
        f26805aF = fjVar.f27519z;
        f26806aG = fjVar.f27494A;
        f26807aH = fjVar.f27495B;
        f26808aI = fjVar.f27496C;
        f26809aJ = fjVar.f27497D;
        f26810aK = fjVar.f27499F;
        f26811aL = fjVar.f27498E;
    }

    /* renamed from: v */
    private static void m30831v() {
        TapjoyLog.m30842i("TapjoyConnect", "Connect Flags:");
        TapjoyLog.m30842i("TapjoyConnect", "--------------------");
        for (Map.Entry next : f26829ai.entrySet()) {
            TapjoyLog.m30842i("TapjoyConnect", "key: " + ((String) next.getKey()) + ", value: " + Uri.encode(next.getValue().toString()));
        }
        TapjoyLog.m30842i("TapjoyConnect", "hostURL: [" + getConnectFlagValue(TapjoyConnectFlag.SERVICE_URL) + "]");
        TapjoyLog.m30842i("TapjoyConnect", "redirectDomain: [" + f26791S + "]");
        TapjoyLog.m30842i("TapjoyConnect", "--------------------");
    }

    /* renamed from: w */
    private static void m30832w() {
        String string = Settings.Secure.getString(f26853h.getContentResolver(), "android_id");
        f26862q = string;
        if (string != null) {
            f26862q = string.toLowerCase();
        }
        try {
            f26870y = f26827ag.getPackageInfo(f26853h.getPackageName(), 0).versionName;
            f26867v = "android";
            f26779G = "android";
            f26865t = Build.MODEL;
            f26866u = Build.MANUFACTURER;
            f26868w = Build.VERSION.RELEASE;
            f26871z = "12.10.0";
            f26773A = TapjoyConstants.TJC_BRIDGE_VERSION_NUMBER;
            m30833x();
            m30834y();
            m30835z();
            m30783A();
        } catch (PackageManager.NameNotFoundException e) {
            throw new TapjoyException(e.getMessage());
        }
    }

    /* renamed from: x */
    private static void m30833x() {
        try {
            if (Build.VERSION.SDK_INT > 3) {
                TapjoyDisplayMetricsUtil tapjoyDisplayMetricsUtil = new TapjoyDisplayMetricsUtil(f26853h);
                f26774B = tapjoyDisplayMetricsUtil.getScreenDensityDPI();
                f26775C = tapjoyDisplayMetricsUtil.getScreenDensityScale();
                f26776D = tapjoyDisplayMetricsUtil.getScreenLayoutSize();
            }
        } catch (Exception e) {
            TapjoyLog.m30841e("TapjoyConnect", "Error getting screen density/dimensions/layout: " + e.toString());
        }
    }

    /* renamed from: y */
    private static void m30834y() {
        TelephonyManager telephonyManager = (TelephonyManager) f26853h.getSystemService("phone");
        if (telephonyManager != null) {
            try {
                f26780H = telephonyManager.getNetworkOperatorName();
                f26781I = telephonyManager.getNetworkCountryIso();
                String networkOperator = telephonyManager.getNetworkOperator();
                if (networkOperator == null) {
                    return;
                }
                if (networkOperator.length() == 5 || networkOperator.length() == 6) {
                    f26782J = networkOperator.substring(0, 3);
                    f26783K = networkOperator.substring(3);
                }
            } catch (SecurityException unused) {
                TapjoyLog.m30842i("TapjoyConnect", "Error accessing network operator info");
            }
        }
    }

    /* renamed from: z */
    private static void m30835z() {
        SharedPreferences sharedPreferences = f26853h.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0);
        String string = sharedPreferences.getString(TapjoyConstants.PREF_INSTALL_ID, "");
        f26864s = string;
        if (string == null || string.length() == 0) {
            try {
                f26864s = TapjoyUtil.SHA256(UUID.randomUUID().toString() + System.currentTimeMillis());
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString(TapjoyConstants.PREF_INSTALL_ID, f26864s);
                edit.apply();
            } catch (Exception e) {
                TapjoyLog.m30841e("TapjoyConnect", "Error generating install id: " + e.toString());
            }
        }
    }

    /* renamed from: A */
    private static void m30783A() {
        if (getConnectFlagValue(TapjoyConnectFlag.STORE_NAME) != null && getConnectFlagValue(TapjoyConnectFlag.STORE_NAME).length() > 0) {
            f26786N = getConnectFlagValue(TapjoyConnectFlag.STORE_NAME);
            if (!new ArrayList(Arrays.asList(TapjoyConnectFlag.STORE_ARRAY)).contains(f26786N)) {
                TapjoyLog.m30844w("TapjoyConnect", "Warning -- undefined STORE_NAME: " + f26786N);
            }
        }
        try {
            f26793U = m30814e(f26786N);
        } catch (Exception e) {
            TapjoyLog.m30841e("TapjoyConnect", "Error trying to detect store intent on devicee: " + e.toString());
        }
    }

    /* renamed from: B */
    private static void m30784B() {
        if (f26829ai == null) {
            f26829ai = new Hashtable<>();
        }
        m30785C();
        m30786D();
    }

    /* renamed from: C */
    private static void m30785C() {
        try {
            if (f26827ag != null) {
                ApplicationInfo applicationInfo = f26827ag.getApplicationInfo(f26853h.getPackageName(), 128);
                if (applicationInfo == null || applicationInfo.metaData == null) {
                    TapjoyLog.m30839d("TapjoyConnect", "No metadata present.");
                    return;
                }
                for (String str : TapjoyConnectFlag.FLAG_ARRAY) {
                    String string = applicationInfo.metaData.getString("tapjoy.".concat(String.valueOf(str)));
                    if (string != null) {
                        TapjoyLog.m30839d("TapjoyConnect", "Found manifest flag: " + str + ", " + string);
                        m30800a(str, string);
                    }
                }
                TapjoyLog.m30839d("TapjoyConnect", "Metadata successfully loaded");
            }
        } catch (Exception e) {
            TapjoyLog.m30840e("TapjoyConnect", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Error reading manifest meta-data -- " + e.toString()));
        }
    }

    /* renamed from: D */
    private static void m30786D() {
        int identifier = f26853h.getResources().getIdentifier("raw/tapjoy_config", (String) null, f26853h.getPackageName());
        Properties properties = new Properties();
        try {
            properties.load(f26853h.getResources().openRawResource(identifier));
            m30801a(properties);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static void m30801a(Properties properties) {
        Enumeration keys = properties.keys();
        while (keys.hasMoreElements()) {
            try {
                String str = (String) keys.nextElement();
                m30800a(str, (String) properties.get(str));
            } catch (ClassCastException unused) {
                TapjoyLog.m30841e("TapjoyConnect", "Error parsing configuration properties in tapjoy_config.txt");
            }
        }
    }

    /* renamed from: E */
    private static void m30787E() {
        try {
            List<ActivityInfo> asList = Arrays.asList(f26827ag.getPackageInfo(f26853h.getPackageName(), 1).activities);
            if (asList != null) {
                for (ActivityInfo a : asList) {
                    m30798a(a);
                }
            }
            if (f26861p.size() == 0) {
                m30788F();
                m30789G();
                if (getConnectFlagValue(TapjoyConnectFlag.DISABLE_ADVERTISING_ID_CHECK) == null || !getConnectFlagValue(TapjoyConnectFlag.DISABLE_ADVERTISING_ID_CHECK).equals("true")) {
                    f26828ah.checkGooglePlayIntegration();
                } else {
                    TapjoyLog.m30842i("TapjoyConnect", "Skipping integration check for Google Play Services and Advertising ID. Do this only if you do not have access to Google Play Services.");
                }
            } else if (f26861p.size() == 1) {
                throw new TapjoyIntegrationException("Missing " + f26861p.size() + " dependency class in manifest: " + f26861p.toString());
            } else {
                throw new TapjoyIntegrationException("Missing " + f26861p.size() + " dependency classes in manifest: " + f26861p.toString());
            }
        } catch (Exception unused) {
            throw new TapjoyIntegrationException("Error while getting package info.");
        }
    }

    /* renamed from: F */
    private static void m30788F() {
        Vector vector = new Vector();
        String[] strArr = TapjoyConstants.dependencyPermissions;
        int length = strArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                break;
            }
            String str = strArr[i];
            if (f26827ag.checkPermission(str, f26853h.getPackageName()) != 0) {
                z = false;
            }
            if (!z) {
                vector.add(str);
            }
            i++;
        }
        if (vector.size() == 0) {
            Vector vector2 = new Vector();
            if (vector2.size() == 0) {
                return;
            }
            if (vector2.size() == 1) {
                TapjoyLog.m30844w("TapjoyConnect", "WARNING -- " + vector2.toString() + " permission was not found in manifest. The exclusion of this permission could cause problems.");
                return;
            }
            TapjoyLog.m30844w("TapjoyConnect", "WARNING -- " + vector2.toString() + " permissions were not found in manifest. The exclusion of these permissions could cause problems.");
        } else if (vector.size() == 1) {
            throw new TapjoyIntegrationException("Missing 1 permission in manifest: " + vector.toString());
        } else {
            throw new TapjoyIntegrationException("Missing " + vector.size() + " permissions in manifest: " + vector.toString());
        }
    }

    /* renamed from: G */
    private static void m30789G() {
        try {
            try {
                Class.forName("com.tapjoy.TJAdUnitJSBridge").getMethod(TJAdUnitConstants.String.CLOSE_REQUESTED, new Class[]{Boolean.class});
            } catch (NoSuchMethodException unused) {
                throw new TapjoyIntegrationException("Try configuring Proguard or other code obfuscators to ignore com.tapjoy classes. Visit http://dev.tapjoy.comfor more information.");
            }
        } catch (ClassNotFoundException unused2) {
            throw new TapjoyIntegrationException("ClassNotFoundException: com.tapjoy.TJAdUnitJSBridge was not found.");
        }
    }

    /* renamed from: H */
    private static boolean m30790H() {
        String str = f26848c;
        return str != null && str.length() > 0;
    }

    /* renamed from: I */
    private static boolean m30791I() {
        return getConnectFlagValue(TapjoyConnectFlag.ALLOW_LEGACY_ID_FALLBACK) != null && getConnectFlagValue(TapjoyConnectFlag.ALLOW_LEGACY_ID_FALLBACK).equals("true");
    }

    /* renamed from: J */
    private static boolean m30792J() {
        return (f26828ah.isGooglePlayServicesAvailable() && f26828ah.isGooglePlayManifestConfigured()) || getConnectFlagValue(TapjoyConnectFlag.DISABLE_ADVERTISING_ID_CHECK) == null || !getConnectFlagValue(TapjoyConnectFlag.DISABLE_ADVERTISING_ID_CHECK).equals("true");
    }

    /* renamed from: a */
    private static void m30798a(ActivityInfo activityInfo) {
        if (f26861p.contains(activityInfo.name)) {
            int indexOf = f26861p.indexOf(activityInfo.name);
            try {
                Class.forName(f26861p.get(indexOf));
                Vector vector = new Vector();
                if ((activityInfo.configChanges & 128) != 128) {
                    vector.add(TJAdUnitConstants.String.ORIENTATION);
                }
                if ((activityInfo.configChanges & 32) != 32) {
                    vector.add("keyboardHidden");
                }
                if (vector.size() == 0) {
                    if (Build.VERSION.SDK_INT >= 13 && (activityInfo.configChanges & 1024) != 1024) {
                        TapjoyLog.m30844w("TapjoyConnect", "WARNING -- screenSize property is not specified in manifest configChanges for " + f26861p.get(indexOf));
                    }
                    if (Build.VERSION.SDK_INT >= 11 && activityInfo.name.equals("com.tapjoy.TJAdUnitActivity")) {
                        if ((activityInfo.flags & 512) != 512) {
                            throw new TapjoyIntegrationException("'hardwareAccelerated' property not specified in manifest for " + f26861p.get(indexOf));
                        }
                    }
                    f26861p.remove(indexOf);
                } else if (vector.size() == 1) {
                    throw new TapjoyIntegrationException(vector.toString() + " property is not specified in manifest configChanges for " + f26861p.get(indexOf));
                } else {
                    throw new TapjoyIntegrationException(vector.toString() + " properties are not specified in manifest configChanges for " + f26861p.get(indexOf));
                }
            } catch (ClassNotFoundException unused) {
                throw new TapjoyIntegrationException("[ClassNotFoundException] Could not find dependency class " + f26861p.get(indexOf));
            }
        }
    }

    /* renamed from: a */
    private static boolean m30805a(String str, boolean z) {
        C11296bh bhVar;
        C11296bh bhVar2;
        long j;
        try {
            C11296bh b = C11296bh.m30911b(str);
            try {
                Map<String, Object> d = b.mo69714d();
                String a = C11534gs.m31571a((String) d.get("override_service_url"));
                if (!TextUtils.isEmpty(a)) {
                    getInstance();
                    m30800a(TapjoyConnectFlag.SERVICE_URL, a);
                }
                String a2 = C11534gs.m31571a((String) d.get(TapjoyConstants.TJC_APP_GROUP_ID));
                String a3 = C11534gs.m31571a((String) d.get(TapjoyConstants.TJC_STORE));
                String a4 = C11534gs.m31571a((String) d.get(TapjoyConstants.TJC_ANALYTICS_API_KEY));
                Object obj = d.get("user_token_config");
                String a5 = C11534gs.m31571a((String) d.get(TapjoyConstants.TJC_MANAGED_DEVICE_ID));
                Object obj2 = d.get("cache_max_age");
                C11484fq fqVar = new C11484fq(a4);
                if (fqVar.f27565a == C11484fq.C11485a.RPC_ANALYTICS) {
                    String a6 = C11484fq.m31449a(fqVar.f27566b);
                    String str2 = fqVar.f27567c;
                    if (a2 == null) {
                        a2 = a6;
                    }
                    Object obj3 = obj2;
                    Object obj4 = obj;
                    C11558hj.m31644a().mo70112a(f26853h, a4, "12.10.0", TapjoyConfig.TJC_ANALYTICS_SERVICE_URL, a6, str2);
                    f26794V = a2;
                    f26795W = a3;
                    f26796X = a4;
                    f26797Y = a5;
                    if (obj4 instanceof Map) {
                        f26798Z = (Map) obj4;
                    }
                    if (!TextUtils.isEmpty(a) && f26859n) {
                        setUserID(f26777E, (TJSetUserIDListener) null);
                    }
                    b.close();
                    if (!z) {
                        Object obj5 = obj3;
                        if (obj5 instanceof String) {
                            try {
                                j = Long.parseLong(((String) obj5).trim());
                            } catch (NumberFormatException unused) {
                            }
                        } else {
                            if (obj5 instanceof Number) {
                                j = ((Number) obj5).longValue();
                            }
                            j = 0;
                        }
                        if (j <= 0) {
                            TapjoyAppSettings.getInstance().removeConnectResult();
                        } else {
                            TapjoyAppSettings.getInstance().saveConnectResultAndParams(str, m30795M(), (j * 1000) + C11685u.m32055b());
                        }
                        C11506gd a7 = C11506gd.m31492a();
                        Object obj6 = d.get(TapjoyConstants.PREF_SERVER_PROVIDED_CONFIGURATIONS);
                        if (obj6 instanceof Map) {
                            try {
                                a7.f27623a.mo70034a((Map) obj6);
                                a7.mo70039c().edit().putString(TapjoyConstants.PREF_SERVER_PROVIDED_CONFIGURATIONS, C11287bb.m30888a(obj6)).apply();
                            } catch (Exception unused2) {
                            }
                        } else if (obj6 == null) {
                            a7.f27623a.mo70034a((Map) null);
                            a7.mo70039c().edit().remove(TapjoyConstants.PREF_SERVER_PROVIDED_CONFIGURATIONS).apply();
                        }
                    }
                    C11531gp.m31567a((Closeable) null);
                    return true;
                }
                throw new IOException("Invalid analytics_api_key");
            } catch (IOException e) {
                e = e;
                bhVar2 = b;
                TapjoyLog.m30843v("TapjoyConnect", e.getMessage());
                C11531gp.m31567a(bhVar);
                return false;
            } catch (RuntimeException e2) {
                e = e2;
                bhVar = b;
                TapjoyLog.m30843v("TapjoyConnect", e.getMessage());
                C11531gp.m31567a(bhVar);
                return false;
            } catch (Throwable th) {
                th = th;
                bhVar = b;
                C11531gp.m31567a(bhVar);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            bhVar2 = null;
            TapjoyLog.m30843v("TapjoyConnect", e.getMessage());
            C11531gp.m31567a(bhVar);
            return false;
        } catch (RuntimeException e4) {
            e = e4;
            bhVar = null;
            TapjoyLog.m30843v("TapjoyConnect", e.getMessage());
            C11531gp.m31567a(bhVar);
            return false;
        } catch (Throwable th2) {
            th = th2;
            C11531gp.m31567a(bhVar);
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: com.tapjoy.internal.bh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r10v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r10v12 */
    /* JADX WARNING: type inference failed for: r10v14 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m30810c(java.lang.String r10) {
        /*
            java.lang.String r0 = "TapjoyConnect"
            r1 = 0
            com.tapjoy.internal.bh r10 = com.tapjoy.internal.C11296bh.m30911b(r10)     // Catch:{ IOException -> 0x00a2, RuntimeException -> 0x0096, all -> 0x0094 }
            java.util.Map r2 = r10.mo69714d()     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            java.lang.String r3 = "override_service_url"
            java.lang.Object r3 = r2.get(r3)     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            java.lang.String r3 = com.tapjoy.internal.C11534gs.m31571a(r3)     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            if (r4 != 0) goto L_0x0025
            getInstance()     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            java.lang.String r4 = "TJC_OPTION_SERVICE_URL"
            m30800a((java.lang.String) r4, (java.lang.String) r3)     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
        L_0x0025:
            java.lang.String r3 = "app_group_id"
            java.lang.Object r3 = r2.get(r3)     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            java.lang.String r3 = com.tapjoy.internal.C11534gs.m31571a(r3)     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            java.lang.String r4 = "store"
            java.lang.Object r4 = r2.get(r4)     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            java.lang.String r4 = com.tapjoy.internal.C11534gs.m31571a(r4)     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            java.lang.String r5 = "analytics_api_key"
            java.lang.Object r5 = r2.get(r5)     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            java.lang.String r5 = com.tapjoy.internal.C11534gs.m31571a(r5)     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            java.lang.String r6 = "user_token_config"
            java.lang.Object r6 = r2.get(r6)     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            java.lang.String r7 = "managed_device_id"
            java.lang.Object r2 = r2.get(r7)     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            java.lang.String r2 = com.tapjoy.internal.C11534gs.m31571a(r2)     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            com.tapjoy.internal.fq r7 = new com.tapjoy.internal.fq     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            r7.<init>(r5)     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            com.tapjoy.internal.fq$a r5 = r7.f27565a     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            com.tapjoy.internal.fq$a r8 = com.tapjoy.internal.C11484fq.C11485a.RPC_ANALYTICS     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            if (r5 != r8) goto L_0x0085
            java.lang.String r5 = r7.f27566b     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            java.lang.String r5 = com.tapjoy.internal.C11484fq.m31449a(r5)     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            if (r3 != 0) goto L_0x006f
            r3 = r5
        L_0x006f:
            f26820aU = r3     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            f26795W = r4     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            f26797Y = r2     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            boolean r2 = r6 instanceof java.util.Map     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            if (r2 == 0) goto L_0x007d
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            f26798Z = r6     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
        L_0x007d:
            r10.close()     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            com.tapjoy.internal.C11531gp.m31567a(r1)
            r10 = 1
            return r10
        L_0x0085:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            java.lang.String r2 = "Invalid analytics_api_key"
            r1.<init>(r2)     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
            throw r1     // Catch:{ IOException -> 0x0092, RuntimeException -> 0x0090 }
        L_0x008d:
            r0 = move-exception
            r1 = r10
            goto L_0x00b2
        L_0x0090:
            r1 = move-exception
            goto L_0x009a
        L_0x0092:
            r1 = move-exception
            goto L_0x00a6
        L_0x0094:
            r0 = move-exception
            goto L_0x00b2
        L_0x0096:
            r10 = move-exception
            r9 = r1
            r1 = r10
            r10 = r9
        L_0x009a:
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x008d }
            com.tapjoy.TapjoyLog.m30843v(r0, r1)     // Catch:{ all -> 0x008d }
            goto L_0x00ad
        L_0x00a2:
            r10 = move-exception
            r9 = r1
            r1 = r10
            r10 = r9
        L_0x00a6:
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x008d }
            com.tapjoy.TapjoyLog.m30843v(r0, r1)     // Catch:{ all -> 0x008d }
        L_0x00ad:
            com.tapjoy.internal.C11531gp.m31567a(r10)
            r10 = 0
            return r10
        L_0x00b2:
            com.tapjoy.internal.C11531gp.m31567a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.TapjoyConnectCore.m30810c(java.lang.String):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: com.tapjoy.internal.bh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m30812d(java.lang.String r4) {
        /*
            java.lang.String r0 = "TapjoyConnect"
            r1 = 0
            com.tapjoy.internal.bh r4 = com.tapjoy.internal.C11296bh.m30911b(r4)     // Catch:{ IOException -> 0x0039, RuntimeException -> 0x002d, all -> 0x002b }
            boolean r2 = r4.mo69710a()     // Catch:{ IOException -> 0x0029, RuntimeException -> 0x0027 }
            if (r2 == 0) goto L_0x001d
            r4.mo69733s()     // Catch:{ IOException -> 0x0029, RuntimeException -> 0x0027 }
            java.lang.String r2 = "Successfully sent completed Pay-Per-Action to Tapjoy server."
            com.tapjoy.TapjoyLog.m30839d(r0, r2)     // Catch:{ IOException -> 0x0029, RuntimeException -> 0x0027 }
            r4.close()     // Catch:{ IOException -> 0x0029, RuntimeException -> 0x0027 }
            com.tapjoy.internal.C11531gp.m31567a(r1)
            r4 = 1
            return r4
        L_0x001d:
            r4.close()     // Catch:{ IOException -> 0x0029, RuntimeException -> 0x0027 }
            com.tapjoy.internal.C11531gp.m31567a(r1)
            goto L_0x0047
        L_0x0024:
            r0 = move-exception
            r1 = r4
            goto L_0x0055
        L_0x0027:
            r1 = move-exception
            goto L_0x0031
        L_0x0029:
            r1 = move-exception
            goto L_0x003d
        L_0x002b:
            r0 = move-exception
            goto L_0x0055
        L_0x002d:
            r4 = move-exception
            r3 = r1
            r1 = r4
            r4 = r3
        L_0x0031:
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0024 }
            com.tapjoy.TapjoyLog.m30843v(r0, r1)     // Catch:{ all -> 0x0024 }
            goto L_0x0044
        L_0x0039:
            r4 = move-exception
            r3 = r1
            r1 = r4
            r4 = r3
        L_0x003d:
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0024 }
            com.tapjoy.TapjoyLog.m30843v(r0, r1)     // Catch:{ all -> 0x0024 }
        L_0x0044:
            com.tapjoy.internal.C11531gp.m31567a(r4)
        L_0x0047:
            com.tapjoy.TapjoyErrorMessage r4 = new com.tapjoy.TapjoyErrorMessage
            com.tapjoy.TapjoyErrorMessage$ErrorType r1 = com.tapjoy.TapjoyErrorMessage.ErrorType.SDK_ERROR
            java.lang.String r2 = "Completed Pay-Per-Action call failed."
            r4.<init>(r1, r2)
            com.tapjoy.TapjoyLog.m30840e((java.lang.String) r0, (com.tapjoy.TapjoyErrorMessage) r4)
            r4 = 0
            return r4
        L_0x0055:
            com.tapjoy.internal.C11531gp.m31567a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.TapjoyConnectCore.m30812d(java.lang.String):boolean");
    }

    public void release() {
        f26855j = null;
        f26856k = null;
        TapjoyLog.m30839d("TapjoyConnect", "Releasing core static instance.");
    }

    public static String getAppID() {
        return f26869x;
    }

    public static String getLimitedAppID() {
        return f26818aS;
    }

    public static String getUserID() {
        return f26777E;
    }

    public static String getHostURL() {
        return getConnectFlagValue(TapjoyConnectFlag.SERVICE_URL);
    }

    public static String getPlacementURL() {
        return getConnectFlagValue(TapjoyConnectFlag.PLACEMENT_URL);
    }

    public static String getRedirectDomain() {
        return f26791S;
    }

    public static String getCarrierName() {
        return f26780H;
    }

    public static String getConnectionType() {
        String str = "";
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) f26853h.getSystemService("connectivity");
            if (!(connectivityManager == null || connectivityManager.getActiveNetworkInfo() == null)) {
                int type = connectivityManager.getActiveNetworkInfo().getType();
                str = (type == 1 || type == 6) ? TapjoyConstants.TJC_CONNECTION_TYPE_WIFI : TapjoyConstants.TJC_CONNECTION_TYPE_MOBILE;
                TapjoyLog.m30839d("TapjoyConnect", "connectivity: " + connectivityManager.getActiveNetworkInfo().getType());
                TapjoyLog.m30839d("TapjoyConnect", "connection_type: ".concat(str));
            }
        } catch (Exception e) {
            TapjoyLog.m30841e("TapjoyConnect", "getConnectionType error: " + e.toString());
        }
        return str;
    }

    public static String getConnectionSubType() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) f26853h.getSystemService("connectivity");
            if (connectivityManager == null) {
                return "";
            }
            String subtypeName = connectivityManager.getActiveNetworkInfo().getSubtypeName();
            TapjoyLog.m30839d("TapjoyConnect", "connection_sub_type: ".concat(String.valueOf(subtypeName)));
            return subtypeName;
        } catch (Exception e) {
            TapjoyLog.m30841e("TapjoyConnect", "getConnectionSubType error: " + e.toString());
            return "";
        }
    }

    /* renamed from: e */
    private static boolean m30814e(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        if (str.length() > 0) {
            return false;
        }
        intent.setData(Uri.parse("market://details"));
        if (f26827ag.queryIntentActivities(intent, 0).size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    private static String m30793K() {
        TapjoyLog.m30842i("TapjoyConnect", "generating sessionID...");
        String str = null;
        try {
            str = TapjoyUtil.SHA256((System.currentTimeMillis() / 1000) + f26869x);
            f26825ad = System.currentTimeMillis();
            return str;
        } catch (Exception e) {
            TapjoyLog.m30841e("TapjoyConnect", "unable to generate session id: " + e.toString());
            return str;
        }
    }

    public static Context getContext() {
        return f26853h;
    }

    /* renamed from: L */
    private static String m30794L() {
        if (m30790H()) {
            return f26848c;
        }
        if (m30791I() || !m30792J()) {
            String str = f26862q;
            if (str != null && str.length() > 0) {
                return f26862q;
            }
        }
        TapjoyLog.m30841e("TapjoyConnect", "Error -- no valid device identifier");
        return null;
    }

    /* renamed from: a */
    private static String m30796a(long j) {
        try {
            return TapjoyUtil.SHA256(f26869x + CertificateUtil.DELIMITER + m30794L() + CertificateUtil.DELIMITER + j + CertificateUtil.DELIMITER + f26787O);
        } catch (Exception e) {
            TapjoyErrorMessage.ErrorType errorType = TapjoyErrorMessage.ErrorType.SDK_ERROR;
            TapjoyLog.m30840e("TapjoyConnect", new TapjoyErrorMessage(errorType, "Error in computing verifier value -- " + e.toString()));
            return "";
        }
    }

    /* renamed from: b */
    private static String m30807b(long j) {
        try {
            return TapjoyUtil.SHA256(f26818aS + CertificateUtil.DELIMITER + m30794L() + CertificateUtil.DELIMITER + j + CertificateUtil.DELIMITER + f26819aT);
        } catch (Exception e) {
            TapjoyErrorMessage.ErrorType errorType = TapjoyErrorMessage.ErrorType.SDK_ERROR;
            TapjoyLog.m30840e("TapjoyConnect", new TapjoyErrorMessage(errorType, "Error in computing verifier value -- " + e.toString()));
            return "";
        }
    }

    public static String getAwardCurrencyVerifier(long j, int i, String str) {
        try {
            return TapjoyUtil.SHA256(f26869x + CertificateUtil.DELIMITER + m30794L() + CertificateUtil.DELIMITER + j + CertificateUtil.DELIMITER + f26787O + CertificateUtil.DELIMITER + i + CertificateUtil.DELIMITER + str);
        } catch (Exception e) {
            TapjoyErrorMessage.ErrorType errorType = TapjoyErrorMessage.ErrorType.SDK_ERROR;
            TapjoyLog.m30840e("TapjoyConnect", new TapjoyErrorMessage(errorType, "Error in computing awardCurrencyVerifier -- " + e.toString()));
            return "";
        }
    }

    public boolean isInitialized() {
        return this.f26874ae;
    }

    public static void setPlugin(String str) {
        f26789Q = str;
    }

    public static void setSDKType(String str) {
        f26790R = str;
    }

    public static void setUserID(String str, TJSetUserIDListener tJSetUserIDListener) {
        f26777E = str;
        f26858m = tJSetUserIDListener;
        TapjoyLog.m30839d("TapjoyConnect", "URL parameters: " + getURLParams());
        new Thread(new Runnable() {
            public final void run() {
                TapjoyLog.m30842i("TapjoyConnect", "Setting userID to " + TapjoyConnectCore.f26777E);
                String hostURL = TapjoyConnectCore.getHostURL();
                TapjoyURLConnection d = TapjoyConnectCore.f26856k;
                TapjoyHttpURLResponse responseFromURL = d.getResponseFromURL(hostURL + TapjoyConstants.TJC_USER_ID_URL_PATH, TapjoyConnectCore.getURLParams());
                boolean a = responseFromURL.response != null ? TapjoyConnectCore.m30804a(responseFromURL.response) : false;
                if (a || TapjoyConnectCore.f26860o || hostURL.equalsIgnoreCase(TapjoyConnectCore.getHostURL())) {
                    TapjoyConnectCore.m30802a(a);
                    return;
                }
                boolean unused = TapjoyConnectCore.f26860o = true;
                TapjoyConnectCore.setUserID(TapjoyConnectCore.f26777E, TapjoyConnectCore.f26858m);
            }
        }).start();
    }

    public static void viewDidClose(String str) {
        TapjoyLog.m30839d("TapjoyConnect", "viewDidClose: ".concat(String.valueOf(str)));
        f26830aj.remove(str);
        C11491fu.f27588e.notifyObservers();
    }

    public static void viewWillOpen(String str, int i) {
        TapjoyLog.m30839d("TapjoyConnect", "viewWillOpen: ".concat(String.valueOf(str)));
        f26830aj.put(str, Integer.valueOf(i));
    }

    public static boolean isViewOpen() {
        TapjoyLog.m30839d("TapjoyConnect", "isViewOpen: " + f26830aj.size());
        return !f26830aj.isEmpty();
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0010  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isFullScreenViewOpen() {
        /*
            java.util.Map<java.lang.String, java.lang.Integer> r0 = f26830aj
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0022
            java.lang.Object r1 = r0.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = 1
            if (r1 == r2) goto L_0x0021
            r3 = 2
            if (r1 == r3) goto L_0x0021
            goto L_0x000a
        L_0x0021:
            return r2
        L_0x0022:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.TapjoyConnectCore.isFullScreenViewOpen():boolean");
    }

    public static void setViewShowing(boolean z) {
        if (z) {
            f26830aj.put("", 1);
        } else {
            f26830aj.clear();
        }
    }

    /* renamed from: a */
    private static void m30800a(String str, String str2) {
        if ((str.equals(TapjoyConnectFlag.SERVICE_URL) || str.equals(TapjoyConnectFlag.PLACEMENT_URL)) && !str2.endsWith("/")) {
            str2 = str2 + "/";
        }
        f26829ai.put(str, str2);
    }

    public void actionComplete(String str) {
        TapjoyLog.m30842i("TapjoyConnect", "actionComplete: ".concat(String.valueOf(str)));
        Map<String, String> k = m30820k();
        TapjoyUtil.safePut(k, "app_id", str, true);
        k.putAll(getTimeStampAndVerifierParams());
        TapjoyLog.m30839d("TapjoyConnect", "PPA URL parameters: ".concat(String.valueOf(k)));
        new Thread(new PPAThread(k)).start();
    }

    public void completeConnectCall() {
        boolean z;
        String connectResult;
        TapjoyLog.m30839d("TapjoyConnect", "starting connect call...");
        String hostURL = getHostURL() != TapjoyConfig.TJC_SERVICE_URL ? getHostURL() : TapjoyConfig.TJC_CONNECT_SERVICE_URL;
        if (isConnected() || (connectResult = TapjoyAppSettings.getInstance().getConnectResult(m30795M(), C11685u.m32055b())) == null || !m30805a(connectResult, true)) {
            z = false;
        } else {
            TapjoyLog.m30842i("TapjoyConnect", "Connect using stored connect result");
            f26826af = true;
            TJConnectListener tJConnectListener = f26857l;
            if (tJConnectListener != null) {
                tJConnectListener.onConnectSuccess();
            }
            C11491fu.f27584a.notifyObservers();
            z = true;
        }
        TapjoyHttpURLResponse responseFromURL = f26856k.getResponseFromURL(hostURL + TapjoyConstants.TJC_CONNECT_URL_PATH, (Map<String, String>) null, (Map<String, String>) null, getURLParams());
        if (responseFromURL == null || responseFromURL.statusCode != 200) {
            if (!z) {
                m30818i();
            }
            C11491fu.f27585b.notifyObservers(Boolean.FALSE);
        } else if (m30805a(responseFromURL.response, false)) {
            TapjoyLog.m30842i("TapjoyConnect", "Successfully connected to Tapjoy");
            f26826af = true;
            for (Map.Entry next : getGenericURLParams().entrySet()) {
                TapjoyLog.m30839d("TapjoyConnect", ((String) next.getKey()) + ": " + ((String) next.getValue()));
            }
            if (!z) {
                TJConnectListener tJConnectListener2 = f26857l;
                if (tJConnectListener2 != null) {
                    tJConnectListener2.onConnectSuccess();
                }
                C11491fu.f27584a.notifyObservers();
            }
            C11491fu.f27585b.notifyObservers(Boolean.TRUE);
        } else {
            if (!z) {
                m30818i();
            }
            C11491fu.f27585b.notifyObservers(Boolean.FALSE);
        }
    }

    public void completeLimitedConnectCall() {
        String hostURL = getHostURL() != TapjoyConfig.TJC_SERVICE_URL ? getHostURL() : TapjoyConfig.TJC_CONNECT_SERVICE_URL;
        Map<String, String> limitedURLParams = getLimitedURLParams();
        TapjoyURLConnection tapjoyURLConnection = f26856k;
        TapjoyHttpURLResponse responseFromURL = tapjoyURLConnection.getResponseFromURL(hostURL + TapjoyConstants.TJC_CONNECT_URL_PATH, (Map<String, String>) null, (Map<String, String>) null, limitedURLParams);
        if (responseFromURL == null || responseFromURL.statusCode != 200) {
            m30819j();
            C11491fu.f27585b.notifyObservers(Boolean.FALSE);
        } else if (m30810c(responseFromURL.response)) {
            TapjoyLog.m30842i("TapjoyConnect", "Successfully connected to Tapjoy");
            f26821aV = true;
            for (Map.Entry next : getLimitedGenericURLParams().entrySet()) {
                TapjoyLog.m30839d("TapjoyConnect", ((String) next.getKey()) + ": " + ((String) next.getValue()));
            }
            TJConnectListener tJConnectListener = f26822aW;
            if (tJConnectListener != null) {
                tJConnectListener.onConnectSuccess();
            }
            C11491fu.f27584a.notifyObservers();
            C11491fu.f27585b.notifyObservers(Boolean.TRUE);
        } else {
            m30819j();
            C11491fu.f27585b.notifyObservers(Boolean.FALSE);
        }
    }

    public class PPAThread implements Runnable {

        /* renamed from: b */
        private Map<String, String> f26884b;

        public PPAThread(Map<String, String> map) {
            this.f26884b = map;
        }

        public void run() {
            TapjoyURLConnection d = TapjoyConnectCore.f26856k;
            TapjoyHttpURLResponse responseFromURL = d.getResponseFromURL(TapjoyConnectCore.getHostURL() + TapjoyConstants.TJC_CONNECT_URL_PATH, (Map<String, String>) null, (Map<String, String>) null, this.f26884b);
            if (responseFromURL.response != null) {
                boolean unused = TapjoyConnectCore.m30812d(responseFromURL.response);
            }
        }
    }

    public void setCurrencyMultiplier(float f) {
        TapjoyLog.m30842i("TapjoyConnect", "setVirtualCurrencyMultiplier: ".concat(String.valueOf(f)));
        f26792T = f;
    }

    public float getCurrencyMultiplier() {
        return f26792T;
    }

    public static String getConnectFlagValue(String str) {
        Hashtable<String, Object> hashtable = f26829ai;
        return (hashtable == null || hashtable.get(str) == null) ? "" : f26829ai.get(str).toString();
    }

    public static String getSecretKey() {
        return f26787O;
    }

    public static String getAndroidID() {
        return f26862q;
    }

    public static float getDeviceScreenDensityScale() {
        return f26775C;
    }

    public static String getSupportURL(String str) {
        if (str == null) {
            str = f26869x;
        }
        return getHostURL() + "support_requests/new?currency_id=" + str + "&app_id=" + f26869x + "&udid=" + f26797Y + "&language_code=" + Locale.getDefault().getLanguage();
    }

    public static String getUserToken() {
        Map<String, Object> map = f26798Z;
        if (map != null && !map.isEmpty()) {
            Map<String, Object> map2 = f26798Z;
            HashMap hashMap = new HashMap();
            for (String next : map2.keySet()) {
                TapjoyUtil.safePut(hashMap, next, String.valueOf(map2.get(next)), true);
            }
            if (!TextUtils.isEmpty(f26777E)) {
                TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_TOKEN_PARAM_USER_ID, f26777E, true);
            }
            return Base64.encodeToString(TapjoyUtil.convertURLParams((Map<String, String>) hashMap, false).getBytes(), 2);
        } else if (TextUtils.isEmpty(f26777E)) {
            return f26797Y;
        } else {
            return f26797Y + CertificateUtil.DELIMITER + f26777E;
        }
    }

    public static boolean isConnected() {
        return f26826af;
    }

    public static boolean isLimitedConnected() {
        return f26821aV;
    }

    public static boolean isUnitTestMode() {
        return getConnectFlagValue("unit_test_mode") == "true";
    }

    /* renamed from: M */
    private static String m30795M() {
        String str = f26869x + f26870y + f26871z + f26848c + f26864s;
        try {
            return TapjoyUtil.SHA1(str);
        } catch (Exception unused) {
            return str;
        }
    }

    public static void optOutAdvertisingID(Context context, boolean z) {
        if (context != null) {
            SharedPreferences.Editor edit = context.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0).edit();
            edit.putBoolean(TapjoyConstants.PREF_OPTOUT_ADVERTISING_ID, z);
            edit.apply();
            if (z) {
                f26848c = "";
                TapjoyGpsHelper tapjoyGpsHelper = f26828ah;
                if (tapjoyGpsHelper != null) {
                    tapjoyGpsHelper.resetAdvertisingID();
                    C11558hj.m31644a().mo70117a(f26848c, true);
                }
            } else if (C11534gs.m31573c(f26848c) || f26848c.equals("00000000-0000-0000-0000-000000000000")) {
                if (f26855j == null) {
                    f26855j = new TapjoyConnectCore();
                }
                f26823aX = false;
                new Thread(new Runnable() {
                    public final void run() {
                        TapjoyConnectCore unused = TapjoyConnectCore.f26855j;
                        TapjoyConnectCore.m30797a();
                    }
                }).start();
            }
        }
    }

    public static void setCustomParameter(String str) {
        f26778F = str;
    }

    public static String getCustomParameter() {
        return f26778F;
    }

    /* renamed from: a */
    static /* synthetic */ void m30797a() {
        if (!f26823aX) {
            try {
                boolean z = false;
                f26828ah.loadAdvertisingId(!m30791I());
                if (f26828ah.isGooglePlayServicesAvailable() && f26828ah.isGooglePlayManifestConfigured()) {
                    f26847b = f26828ah.getDeviceGooglePlayServicesVersion();
                    f26799a = f26828ah.getPackagedGooglePlayServicesVersion();
                }
                if (f26828ah.isAdIdAvailable()) {
                    f26849d = f26828ah.isAdTrackingEnabled();
                    f26848c = f26828ah.getAdvertisingId();
                    C11558hj a = C11558hj.m31644a();
                    String str = f26848c;
                    if (!f26849d) {
                        z = true;
                    }
                    a.mo70117a(str, z);
                }
            } catch (Exception e) {
                TapjoyLog.m30842i("TapjoyConnect", "Error fetching advertising id: " + e.toString());
                e.printStackTrace();
            }
            f26823aX = true;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m30799a(TapjoyConnectCore tapjoyConnectCore, Context context, final TJTaskHandler tJTaskHandler) {
        try {
            Class.forName("com.google.android.gms.appset.AppSet");
            AppSet.getClient(context.getApplicationContext()).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener<AppSetIdInfo>() {
                public final /* synthetic */ void onSuccess(Object obj) {
                    AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                    int scope = appSetIdInfo.getScope();
                    TapjoyConnectCore.f26852g = appSetIdInfo.getId();
                    TapjoyLog.m30839d("TapjoyConnect", String.format(Locale.ENGLISH, "Scope: %d. AppSetId: %s", new Object[]{Integer.valueOf(scope), TapjoyConnectCore.f26852g}));
                    tJTaskHandler.onComplete();
                }
            });
        } catch (Exception e) {
            TapjoyLog.m30839d("TapjoyConnect", String.format(Locale.ENGLISH, "AppSetId class not found: %s", new Object[]{e.getMessage()}));
            tJTaskHandler.onComplete();
        }
    }

    /* renamed from: a */
    static /* synthetic */ boolean m30804a(String str) {
        Document buildDocument = TapjoyUtil.buildDocument(str);
        if (buildDocument == null) {
            return true;
        }
        String nodeTrimValue = TapjoyUtil.getNodeTrimValue(buildDocument.getElementsByTagName(InitializationStatus.SUCCESS));
        return nodeTrimValue != null && nodeTrimValue.equals("true");
    }

    /* renamed from: a */
    static /* synthetic */ void m30802a(boolean z) {
        if (z) {
            TapjoyLog.m30842i("TapjoyConnect", "Set userID is successful");
            TJSetUserIDListener tJSetUserIDListener = f26858m;
            if (tJSetUserIDListener != null) {
                tJSetUserIDListener.onSetUserIDSuccess();
                return;
            }
            return;
        }
        TapjoyLog.m30840e("TapjoyConnect", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Failed to set userID"));
        TJSetUserIDListener tJSetUserIDListener2 = f26858m;
        if (tJSetUserIDListener2 != null) {
            tJSetUserIDListener2.onSetUserIDFailure("Failed to set userID");
        }
        f26859n = true;
    }
}
