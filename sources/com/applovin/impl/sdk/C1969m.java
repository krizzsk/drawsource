package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.adview.C1523d;
import com.applovin.impl.mediation.C1648d;
import com.applovin.impl.mediation.C1737e;
import com.applovin.impl.mediation.C1738f;
import com.applovin.impl.mediation.C1785h;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.debugger.C1656a;
import com.applovin.impl.mediation.debugger.p041ui.testmode.C1736b;
import com.applovin.impl.mediation.p031a.C1588f;
import com.applovin.impl.mediation.p035d.C1654b;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdService;
import com.applovin.impl.sdk.network.C1995b;
import com.applovin.impl.sdk.network.C2002d;
import com.applovin.impl.sdk.network.C2012f;
import com.applovin.impl.sdk.network.PostbackServiceImpl;
import com.applovin.impl.sdk.p048a.C1811f;
import com.applovin.impl.sdk.p051c.C1866a;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.p051c.C1868c;
import com.applovin.impl.sdk.p051c.C1869d;
import com.applovin.impl.sdk.p051c.C1870e;
import com.applovin.impl.sdk.p052d.C1877c;
import com.applovin.impl.sdk.p052d.C1881f;
import com.applovin.impl.sdk.p052d.C1882g;
import com.applovin.impl.sdk.p053e.C1887a;
import com.applovin.impl.sdk.p053e.C1905i;
import com.applovin.impl.sdk.p053e.C1915n;
import com.applovin.impl.sdk.p053e.C1918o;
import com.applovin.impl.sdk.p053e.C1944z;
import com.applovin.impl.sdk.utils.C2050h;
import com.applovin.impl.sdk.utils.C2091n;
import com.applovin.impl.sdk.utils.C2094p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinEventService;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinTargetingData;
import com.applovin.sdk.AppLovinUserSegment;
import com.applovin.sdk.AppLovinUserService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.m */
public class C1969m {

    /* renamed from: a */
    protected static Context f3680a;

    /* renamed from: c */
    private static C1798a f3681c;

    /* renamed from: A */
    private C2032q f3682A;

    /* renamed from: B */
    private C1877c f3683B;

    /* renamed from: C */
    private C2106y f3684C;

    /* renamed from: D */
    private C2034s f3685D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public C2002d f3686E;

    /* renamed from: F */
    private C1953i f3687F;

    /* renamed from: G */
    private C2091n f3688G;

    /* renamed from: H */
    private C1950h f3689H;

    /* renamed from: I */
    private C1975n f3690I;

    /* renamed from: J */
    private C1811f f3691J;

    /* renamed from: K */
    private C2038u f3692K;

    /* renamed from: L */
    private PostbackServiceImpl f3693L;

    /* renamed from: M */
    private C2012f f3694M;

    /* renamed from: N */
    private C1883e f3695N;

    /* renamed from: O */
    private C1738f f3696O;

    /* renamed from: P */
    private C1737e f3697P;

    /* renamed from: Q */
    private MediationServiceImpl f3698Q;

    /* renamed from: R */
    private C1785h f3699R;

    /* renamed from: S */
    private C1656a f3700S;

    /* renamed from: T */
    private C2104w f3701T;

    /* renamed from: U */
    private C1648d f3702U;

    /* renamed from: V */
    private C1736b f3703V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public List<MaxAdFormat> f3704W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public final Object f3705X = new Object();

    /* renamed from: Y */
    private final AtomicBoolean f3706Y = new AtomicBoolean(true);
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public boolean f3707Z = false;

    /* renamed from: aa */
    private boolean f3708aa = false;

    /* renamed from: ab */
    private boolean f3709ab = false;

    /* renamed from: ac */
    private boolean f3710ac = false;

    /* renamed from: ad */
    private int f3711ad = 0;

    /* renamed from: ae */
    private AppLovinSdk.SdkInitializationListener f3712ae;

    /* renamed from: af */
    private AppLovinSdk.SdkInitializationListener f3713af;
    /* access modifiers changed from: private */

    /* renamed from: ag */
    public AppLovinSdkConfiguration f3714ag;

    /* renamed from: b */
    protected C1868c f3715b;

    /* renamed from: d */
    private String f3716d;

    /* renamed from: e */
    private WeakReference<Activity> f3717e;

    /* renamed from: f */
    private long f3718f;

    /* renamed from: g */
    private AppLovinSdkSettings f3719g;

    /* renamed from: h */
    private AppLovinUserSegment f3720h;

    /* renamed from: i */
    private AppLovinTargetingData f3721i;

    /* renamed from: j */
    private String f3722j;

    /* renamed from: k */
    private AppLovinAdServiceImpl f3723k;

    /* renamed from: l */
    private AppLovinNativeAdService f3724l;

    /* renamed from: m */
    private EventServiceImpl f3725m;

    /* renamed from: n */
    private UserServiceImpl f3726n;

    /* renamed from: o */
    private VariableServiceImpl f3727o;

    /* renamed from: p */
    private AppLovinSdk f3728p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C2102v f3729q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C1918o f3730r;

    /* renamed from: s */
    private C1995b f3731s;

    /* renamed from: t */
    private C1882g f3732t;

    /* renamed from: u */
    private C2022o f3733u;

    /* renamed from: v */
    private C1870e f3734v;

    /* renamed from: w */
    private C1962l f3735w;

    /* renamed from: x */
    private C2094p f3736x;

    /* renamed from: y */
    private C1865c f3737y;

    /* renamed from: z */
    private C2033r f3738z;

    /* renamed from: M */
    public static Context m4458M() {
        return f3680a;
    }

    /* renamed from: a */
    public static C1798a m4459a(Context context) {
        if (f3681c == null) {
            f3681c = new C1798a(context);
        }
        return f3681c;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m4463a(JSONObject jSONObject) {
        if (C2102v.m5104a()) {
            for (String i : JsonUtils.getList(jSONObject, "error_messages", Collections.emptyList())) {
                C2102v.m5110i("AppLovinSdk", i);
            }
        }
    }

    /* renamed from: ao */
    private void m4464ao() {
        this.f3686E.mo14737a((C2002d.C2003a) new C2002d.C2003a() {
            /* renamed from: a */
            public void mo14601a() {
                if (C2102v.m5104a()) {
                    C1969m.this.f3729q.mo15014c("AppLovinSdk", "Connected to internet - re-initializing SDK");
                }
                synchronized (C1969m.this.f3705X) {
                    if (!C1969m.this.f3707Z) {
                        C1969m.this.mo14568b();
                    }
                }
                C1969m.this.f3686E.mo14738b(this);
            }

            /* renamed from: b */
            public void mo14602b() {
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public List<MaxAdFormat> m4466b(JSONObject jSONObject) {
        List<String> asList = Arrays.asList(JsonUtils.getString(jSONObject, "eaf", "").split(","));
        ArrayList arrayList = new ArrayList(asList.size());
        for (String formatFromString : asList) {
            MaxAdFormat formatFromString2 = MaxAdFormat.formatFromString(formatFromString);
            if (formatFromString2 != null) {
                arrayList.add(formatFromString2);
            }
        }
        return arrayList;
    }

    /* renamed from: A */
    public C2102v mo14509A() {
        return this.f3729q;
    }

    /* renamed from: B */
    public C1883e mo14510B() {
        return this.f3695N;
    }

    /* renamed from: C */
    public C1738f mo14511C() {
        return this.f3696O;
    }

    /* renamed from: D */
    public C1737e mo14512D() {
        return this.f3697P;
    }

    /* renamed from: E */
    public MediationServiceImpl mo14513E() {
        return this.f3698Q;
    }

    /* renamed from: F */
    public C2104w mo14514F() {
        return this.f3701T;
    }

    /* renamed from: G */
    public C1656a mo14515G() {
        return this.f3700S;
    }

    /* renamed from: H */
    public C1785h mo14516H() {
        return this.f3699R;
    }

    /* renamed from: I */
    public C1648d mo14517I() {
        return this.f3702U;
    }

    /* renamed from: J */
    public C1736b mo14518J() {
        return this.f3703V;
    }

    /* renamed from: K */
    public C1868c mo14519K() {
        return this.f3715b;
    }

    /* renamed from: L */
    public Context mo14520L() {
        return f3680a;
    }

    /* renamed from: N */
    public Activity mo14521N() {
        WeakReference<Activity> weakReference = this.f3717e;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    /* renamed from: O */
    public long mo14522O() {
        return this.f3718f;
    }

    /* renamed from: P */
    public boolean mo14523P() {
        return this.f3709ab;
    }

    /* renamed from: Q */
    public boolean mo14524Q() {
        return this.f3710ac;
    }

    /* renamed from: R */
    public C1995b mo14525R() {
        return this.f3731s;
    }

    /* renamed from: S */
    public C1918o mo14526S() {
        return this.f3730r;
    }

    /* renamed from: T */
    public C1882g mo14527T() {
        return this.f3732t;
    }

    /* renamed from: U */
    public C2012f mo14528U() {
        return this.f3694M;
    }

    /* renamed from: V */
    public C2022o mo14529V() {
        return this.f3733u;
    }

    /* renamed from: W */
    public C1962l mo14530W() {
        return this.f3735w;
    }

    /* renamed from: X */
    public PostbackServiceImpl mo14531X() {
        return this.f3693L;
    }

    /* renamed from: Y */
    public AppLovinSdk mo14532Y() {
        return this.f3728p;
    }

    /* renamed from: Z */
    public C1865c mo14533Z() {
        return this.f3737y;
    }

    /* renamed from: a */
    public <T> T mo14534a(C1867b<T> bVar) {
        return this.f3715b.mo14284a(bVar);
    }

    /* renamed from: a */
    public <T> T mo14535a(C1869d<T> dVar) {
        return mo14565b(dVar, (Object) null);
    }

    /* renamed from: a */
    public <T> T mo14536a(String str, T t, Class<?> cls, SharedPreferences sharedPreferences) {
        return C1870e.m4099a(str, t, (Class) cls, sharedPreferences);
    }

    /* renamed from: a */
    public void mo14537a() {
        synchronized (this.f3705X) {
            if (!this.f3707Z && !this.f3708aa) {
                mo14568b();
            }
        }
    }

    /* renamed from: a */
    public void mo14538a(long j) {
        this.f3735w.mo14499a(j);
    }

    /* renamed from: a */
    public void mo14539a(SharedPreferences sharedPreferences) {
        this.f3734v.mo14296a(sharedPreferences);
    }

    /* renamed from: a */
    public void mo14540a(C1588f fVar) {
        if (!this.f3730r.mo14433a()) {
            List<String> b = mo14567b(C1866a.f3069a);
            if (b.size() > 0 && this.f3697P.mo13818b().containsAll(b)) {
                if (C2102v.m5104a()) {
                    this.f3729q.mo15012b("AppLovinSdk", "All required adapters initialized");
                }
                this.f3730r.mo14436d();
                mo14580j();
            }
        }
    }

    /* renamed from: a */
    public <T> void mo14541a(C1869d<T> dVar, T t) {
        this.f3734v.mo14298a(dVar, t);
    }

    /* renamed from: a */
    public <T> void mo14542a(C1869d<T> dVar, T t, SharedPreferences sharedPreferences) {
        this.f3734v.mo14299a(dVar, t, sharedPreferences);
    }

    /* renamed from: a */
    public void mo14543a(final AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        if (!mo14574d()) {
            this.f3712ae = sdkInitializationListener;
        } else if (sdkInitializationListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    sdkInitializationListener.onSdkInitialized(C1969m.this.f3714ag);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo14544a(AppLovinSdk appLovinSdk) {
        this.f3728p = appLovinSdk;
    }

    /* renamed from: a */
    public void mo14545a(String str) {
        if (C2102v.m5104a()) {
            C2102v.m5107f("AppLovinSdk", "Setting plugin version: " + str);
        }
        this.f3715b.mo14286a((C1867b<?>) C1867b.f3308dz, (Object) str);
    }

    /* renamed from: a */
    public void mo14546a(String str, AppLovinSdkSettings appLovinSdkSettings, Context context) {
        C1870e eVar;
        String str2;
        C1869d<String> dVar;
        this.f3716d = str;
        this.f3718f = System.currentTimeMillis();
        this.f3719g = appLovinSdkSettings;
        this.f3720h = new C1949g();
        this.f3721i = new AppLovinTargetingDataImpl();
        this.f3714ag = new SdkConfigurationImpl(this);
        f3680a = context.getApplicationContext();
        if (context instanceof Activity) {
            this.f3717e = new WeakReference<>((Activity) context);
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        this.f3734v = new C1870e(this);
        this.f3715b = new C1868c(this);
        this.f3729q = new C2102v(this);
        if (((Boolean) mo14534a(C1867b.f3196br)).booleanValue()) {
            this.f3738z = new C2033r(this);
        }
        this.f3682A = new C2032q(this);
        this.f3737y = new C1865c(this);
        this.f3725m = new EventServiceImpl(this);
        this.f3726n = new UserServiceImpl(this);
        this.f3727o = new VariableServiceImpl(this);
        this.f3683B = new C1877c(this);
        this.f3730r = new C1918o(this);
        this.f3731s = new C1995b(this);
        this.f3732t = new C1882g(this);
        this.f3691J = new C1811f(this);
        this.f3733u = new C2022o(this);
        this.f3723k = new AppLovinAdServiceImpl(this);
        this.f3724l = new AppLovinNativeAdService(this);
        this.f3684C = new C2106y(this);
        this.f3685D = new C2034s(this);
        this.f3693L = new PostbackServiceImpl(this);
        this.f3694M = new C2012f(this);
        this.f3695N = new C1883e(this);
        this.f3696O = new C1738f(this);
        this.f3697P = new C1737e(this);
        this.f3698Q = new MediationServiceImpl(this);
        this.f3701T = new C2104w(this);
        this.f3700S = new C1656a(this);
        this.f3699R = new C1785h();
        this.f3702U = new C1648d(this);
        this.f3735w = new C1962l(this);
        this.f3688G = new C2091n(this);
        this.f3689H = new C1950h(this);
        this.f3703V = new C1736b(this);
        this.f3690I = new C1975n(this);
        this.f3692K = new C2038u(this);
        this.f3687F = new C1953i(this);
        this.f3736x = new C2094p(this);
        this.f3697P.mo13815a(MaxAdapter.InitializationStatus.INITIALIZING);
        if (((Boolean) mo14534a(C1867b.f3230cZ)).booleanValue()) {
            this.f3686E = new C2002d(context);
        }
        if (C2102v.m5104a() && TextUtils.isEmpty(str)) {
            C2102v.m5110i("AppLovinSdk", "Unable to find AppLovin SDK key. Please add  meta-data android:name=\"applovin.sdk.key\" android:value=\"YOUR_SDK_KEY_HERE\" into AndroidManifest.xml.");
            C2102v.m5110i("AppLovinSdk", "Called with an invalid SDK key from: " + Log.getStackTraceString(new Throwable("")));
        }
        if (str.length() != 86 && Utils.isPubInDebugMode(context, this) && C2102v.m5104a()) {
            C2102v.m5110i("AppLovinSdk", "Please double-check that you entered your SDK key correctly (" + str + ") : " + Log.getStackTraceString(new Throwable("")));
        }
        if (Utils.isProguardRulesOmitted() && C2102v.m5104a()) {
            C2102v.m5110i("AppLovinSdk", "Failed to find class for name: com.applovin.sdk.AppLovinSdk. Please ensure proguard rules have not been omitted from the build.");
        }
        if (!Utils.hasAndroidCoreJsonLibrary(this) && C2102v.m5104a()) {
            C2102v.m5110i("AppLovinSdk", "Detected non-Android core JSON library. Please double-check that none of your third party libraries include custom implementation of org.json.JSONObject.");
        }
        if (Utils.isVerboseLoggingEnabled(context)) {
            appLovinSdkSettings.setVerboseLogging(true);
        }
        mo14519K().mo14286a((C1867b<?>) C1867b.f3127ab, (Object) Boolean.valueOf(appLovinSdkSettings.isVerboseLoggingEnabled()));
        C1523d.class.getName();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        if (TextUtils.isEmpty((String) this.f3734v.mo14303b(C1869d.f3369a, null, defaultSharedPreferences))) {
            this.f3709ab = true;
            eVar = this.f3734v;
            dVar = C1869d.f3369a;
            str2 = Boolean.toString(true);
        } else {
            eVar = this.f3734v;
            dVar = C1869d.f3369a;
            str2 = Boolean.toString(false);
        }
        eVar.mo14299a(dVar, str2, defaultSharedPreferences);
        if (((Boolean) this.f3734v.mo14302b(C1869d.f3370b, false)).booleanValue()) {
            if (C2102v.m5104a()) {
                this.f3729q.mo15012b("AppLovinSdk", "Initializing SDK for non-maiden launch");
            }
            this.f3710ac = true;
        } else {
            if (C2102v.m5104a()) {
                this.f3729q.mo15012b("AppLovinSdk", "Initializing SDK for maiden launch");
            }
            this.f3734v.mo14298a(C1869d.f3370b, true);
        }
        String str3 = (String) this.f3734v.mo14302b(C1869d.f3371c, null);
        if (!StringUtils.isValidString(str3) || AppLovinSdk.VERSION_CODE > Utils.toVersionCode(str3)) {
            this.f3734v.mo14298a(C1869d.f3371c, AppLovinSdk.VERSION);
        }
        boolean a = C2050h.m4957a(mo14520L());
        if (!((Boolean) mo14534a(C1867b.f3283da)).booleanValue() || a) {
            mo14568b();
        }
        if (((Boolean) mo14534a(C1867b.f3230cZ)).booleanValue() && !a) {
            if (C2102v.m5104a()) {
                this.f3729q.mo15014c("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
            }
            m4464ao();
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    /* renamed from: a */
    public <T> void mo14547a(String str, T t, SharedPreferences.Editor editor) {
        this.f3734v.mo14300a(str, t, editor);
    }

    /* renamed from: a */
    public void mo14548a(boolean z) {
        synchronized (this.f3705X) {
            this.f3707Z = false;
            this.f3708aa = z;
        }
        if (this.f3715b != null && this.f3730r != null) {
            List<String> b = mo14567b(C1866a.f3069a);
            if (b.isEmpty()) {
                this.f3730r.mo14436d();
                mo14580j();
                return;
            }
            long longValue = ((Long) mo14534a(C1866a.f3070b)).longValue();
            C1944z zVar = new C1944z(this, true, new Runnable() {
                public void run() {
                    if (!C1969m.this.f3730r.mo14433a()) {
                        if (C2102v.m5104a()) {
                            C1969m.this.f3729q.mo15012b("AppLovinSdk", "Timing out adapters init...");
                        }
                        C1969m.this.f3730r.mo14436d();
                        C1969m.this.mo14580j();
                    }
                }
            });
            if (C2102v.m5104a()) {
                C2102v vVar = this.f3729q;
                vVar.mo15012b("AppLovinSdk", "Waiting for required adapters to init: " + b + " - timing out in " + longValue + "ms...");
            }
            this.f3730r.mo14431a(zVar, C1918o.C1920a.MEDIATION_TIMEOUT, longValue, true);
        }
    }

    /* renamed from: a */
    public boolean mo14549a(C1867b<String> bVar, MaxAdFormat maxAdFormat) {
        return mo14571c(bVar).contains(maxAdFormat);
    }

    /* renamed from: a */
    public boolean mo14550a(MaxAdFormat maxAdFormat) {
        List<MaxAdFormat> list = this.f3704W;
        return list != null && list.size() > 0 && !this.f3704W.contains(maxAdFormat);
    }

    /* renamed from: aa */
    public C2033r mo14551aa() {
        return this.f3738z;
    }

    /* renamed from: ab */
    public C2032q mo14552ab() {
        return this.f3682A;
    }

    /* renamed from: ac */
    public C1877c mo14553ac() {
        return this.f3683B;
    }

    /* renamed from: ad */
    public C2106y mo14554ad() {
        return this.f3684C;
    }

    /* renamed from: ae */
    public C2034s mo14555ae() {
        return this.f3685D;
    }

    /* renamed from: af */
    public C1798a mo14556af() {
        return f3681c;
    }

    /* renamed from: ag */
    public C1953i mo14557ag() {
        return this.f3687F;
    }

    /* renamed from: ah */
    public C2091n mo14558ah() {
        return this.f3688G;
    }

    /* renamed from: ai */
    public C1950h mo14559ai() {
        return this.f3689H;
    }

    /* renamed from: aj */
    public AppLovinBroadcastManager mo14560aj() {
        return AppLovinBroadcastManager.getInstance(f3680a);
    }

    /* renamed from: ak */
    public C1975n mo14561ak() {
        return this.f3690I;
    }

    /* renamed from: al */
    public C1811f mo14562al() {
        return this.f3691J;
    }

    /* renamed from: am */
    public C2038u mo14563am() {
        return this.f3692K;
    }

    /* renamed from: an */
    public Activity mo14564an() {
        Activity a = m4459a(f3680a).mo14045a();
        if (a != null) {
            return a;
        }
        Activity N = mo14521N();
        if (N != null) {
            return N;
        }
        return null;
    }

    /* renamed from: b */
    public <T> T mo14565b(C1869d<T> dVar, T t) {
        return this.f3734v.mo14302b(dVar, t);
    }

    /* renamed from: b */
    public <T> T mo14566b(C1869d<T> dVar, T t, SharedPreferences sharedPreferences) {
        return this.f3734v.mo14303b(dVar, t, sharedPreferences);
    }

    /* renamed from: b */
    public List<String> mo14567b(C1867b<String> bVar) {
        return this.f3715b.mo14288b(bVar);
    }

    /* renamed from: b */
    public void mo14568b() {
        synchronized (this.f3705X) {
            this.f3707Z = true;
            mo14526S().mo14435c();
            int i = this.f3711ad + 1;
            this.f3711ad = i;
            mo14526S().mo14430a((C1887a) new C1905i(i, this, new C1905i.C1907a() {
                /* renamed from: a */
                public void mo14420a(JSONObject jSONObject) {
                    boolean z = jSONObject.length() > 0;
                    C2050h.m4962d(jSONObject, C1969m.this);
                    C2050h.m4961c(jSONObject, C1969m.this);
                    C1945f.m4387a(C1969m.this);
                    C2050h.m4964e(jSONObject, C1969m.this);
                    C2050h.m4954a(jSONObject, z, C1969m.this);
                    C1654b.m3364a(jSONObject, C1969m.this);
                    C1654b.m3366b(jSONObject, C1969m.this);
                    C1969m.this.mo14515G().mo13610a(JsonUtils.getBoolean(jSONObject, "smd", false).booleanValue(), JsonUtils.getInt(jSONObject, "smd_delay_sec", 2));
                    C1969m mVar = C1969m.this;
                    List unused = mVar.f3704W = mVar.m4466b(jSONObject);
                    C2050h.m4966f(jSONObject, C1969m.this);
                    C1969m.this.mo14518J().mo13804a(jSONObject);
                    C1969m.this.m4463a(jSONObject);
                    C1969m.this.mo14526S().mo14428a((C1887a) new C1915n(C1969m.this));
                }
            }), C1918o.C1920a.MAIN, (long) ((Integer) mo14534a(C1867b.f3278dV)).intValue());
        }
    }

    /* renamed from: b */
    public <T> void mo14569b(C1869d<T> dVar) {
        this.f3734v.mo14297a(dVar);
    }

    /* renamed from: b */
    public void mo14570b(String str) {
        if (C2102v.m5104a()) {
            C2102v vVar = this.f3729q;
            vVar.mo15012b("AppLovinSdk", "Setting user id: " + str);
        }
        if (StringUtils.isValidString(str) && str.length() > Utils.kilobytesToByes(8)) {
            C2102v.m5110i("AppLovinSdk", "Provided user id longer than supported (" + str.length() + " bytes, " + Utils.kilobytesToByes(8) + " maximum)");
        }
        this.f3736x.mo14979a(str);
    }

    /* renamed from: c */
    public List<MaxAdFormat> mo14571c(C1867b<String> bVar) {
        return this.f3715b.mo14290c(bVar);
    }

    /* renamed from: c */
    public void mo14572c(String str) {
        this.f3722j = str;
        mo14569b(C1869d.f3366A);
    }

    /* renamed from: c */
    public boolean mo14573c() {
        boolean z;
        synchronized (this.f3705X) {
            z = this.f3707Z;
        }
        return z;
    }

    /* renamed from: d */
    public boolean mo14574d() {
        boolean z;
        synchronized (this.f3705X) {
            z = this.f3708aa;
        }
        return z;
    }

    /* renamed from: e */
    public boolean mo14575e() {
        return "HSrCHRtOan6wp2kwOIGJC1RDtuSrF2mWVbio2aBcMHX9KF3iTJ1lLSzCKP1ZSo5yNolPNw1kCTtWpxELFF4ah1".equalsIgnoreCase(mo14597z());
    }

    /* renamed from: f */
    public boolean mo14576f() {
        return StringUtils.containsIgnoreCase(mo14590t(), "max");
    }

    /* renamed from: g */
    public boolean mo14577g() {
        return Utils.checkClassExistence("com.unity3d.player.UnityPlayerActivity");
    }

    /* renamed from: h */
    public void mo14578h() {
        String str = (String) this.f3734v.mo14302b(C1869d.f3371c, null);
        if (StringUtils.isValidString(str) && AppLovinSdk.VERSION_CODE < Utils.toVersionCode(str) && C2102v.m5104a()) {
            C2102v.m5110i("AppLovinSdk", "Current version (" + AppLovinSdk.VERSION + ") is older than earlier installed version (" + str + "), which may cause compatibility issues.");
        }
    }

    /* renamed from: i */
    public void mo14579i() {
        this.f3687F.mo14479a();
    }

    /* renamed from: j */
    public void mo14580j() {
        final AppLovinSdk.SdkInitializationListener sdkInitializationListener = this.f3712ae;
        if (sdkInitializationListener != null) {
            if (mo14574d()) {
                this.f3712ae = null;
                this.f3713af = null;
                this.f3697P.mo13815a(MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS);
            } else if (this.f3713af != sdkInitializationListener) {
                this.f3697P.mo13815a(MaxAdapter.InitializationStatus.INITIALIZED_FAILURE);
                if (((Boolean) mo14534a(C1867b.f3135aj)).booleanValue()) {
                    this.f3712ae = null;
                } else {
                    this.f3713af = sdkInitializationListener;
                }
            } else {
                return;
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                public void run() {
                    if (C2102v.m5104a()) {
                        C1969m.this.f3729q.mo15012b("AppLovinSdk", "Calling back publisher's initialization completion handler...");
                    }
                    sdkInitializationListener.onSdkInitialized(C1969m.this.f3714ag);
                }
            }, Math.max(0, ((Long) mo14534a(C1867b.f3136ak)).longValue()));
        }
    }

    /* renamed from: k */
    public void mo14581k() {
        if (C2102v.m5104a()) {
            C2102v.m5110i("AppLovinSdk", "Resetting SDK state...");
        }
        long b = this.f3732t.mo14354b(C1881f.f3471g);
        this.f3715b.mo14291c();
        this.f3715b.mo14285a();
        this.f3732t.mo14353a();
        this.f3732t.mo14356b(C1881f.f3471g, b + 1);
        if (this.f3706Y.compareAndSet(true, false)) {
            mo14568b();
        } else {
            this.f3706Y.set(true);
        }
    }

    /* renamed from: l */
    public void mo14582l() {
        this.f3700S.mo13612c();
    }

    /* renamed from: m */
    public String mo14583m() {
        return this.f3736x.mo14978a();
    }

    /* renamed from: n */
    public String mo14584n() {
        return this.f3736x.mo14980b();
    }

    /* renamed from: o */
    public String mo14585o() {
        return this.f3736x.mo14981c();
    }

    /* renamed from: p */
    public AppLovinSdkSettings mo14586p() {
        return this.f3719g;
    }

    /* renamed from: q */
    public AppLovinUserSegment mo14587q() {
        return this.f3720h;
    }

    /* renamed from: r */
    public AppLovinTargetingDataImpl mo14588r() {
        return (AppLovinTargetingDataImpl) this.f3721i;
    }

    /* renamed from: s */
    public AppLovinSdkConfiguration mo14589s() {
        return this.f3714ag;
    }

    /* renamed from: t */
    public String mo14590t() {
        String str = (String) mo14535a(C1869d.f3366A);
        return StringUtils.isValidString(str) ? str : this.f3722j;
    }

    public String toString() {
        return "CoreSdk{sdkKey='" + this.f3716d + '\'' + ", enabled=" + this.f3708aa + ", isFirstSession=" + this.f3709ab + '}';
    }

    /* renamed from: u */
    public AppLovinAdServiceImpl mo14592u() {
        return this.f3723k;
    }

    /* renamed from: v */
    public AppLovinNativeAdService mo14593v() {
        return this.f3724l;
    }

    /* renamed from: w */
    public AppLovinEventService mo14594w() {
        return this.f3725m;
    }

    /* renamed from: x */
    public AppLovinUserService mo14595x() {
        return this.f3726n;
    }

    /* renamed from: y */
    public VariableServiceImpl mo14596y() {
        return this.f3727o;
    }

    /* renamed from: z */
    public String mo14597z() {
        return this.f3716d;
    }
}
