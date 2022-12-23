package com.applovin.impl.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.hardware.SensorManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.LocaleList;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.p051c.C1869d;
import com.applovin.impl.sdk.p052d.C1881f;
import com.applovin.impl.sdk.p052d.C1882g;
import com.applovin.impl.sdk.p053e.C1887a;
import com.applovin.impl.sdk.p053e.C1898f;
import com.applovin.impl.sdk.p053e.C1918o;
import com.applovin.impl.sdk.p053e.C1944z;
import com.applovin.impl.sdk.utils.C2044c;
import com.applovin.impl.sdk.utils.C2049g;
import com.applovin.impl.sdk.utils.C2090m;
import com.applovin.impl.sdk.utils.C2094p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.smaato.sdk.core.gdpr.CmpApiConstants;
import com.tapjoy.TapjoyConstants;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.o */
public class C2022o {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final AtomicReference<C2028a> f3925h = new AtomicReference<>();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final AtomicReference<C2029b> f3926j = new AtomicReference<>();

    /* renamed from: a */
    private final C1969m f3927a;

    /* renamed from: b */
    private final C2102v f3928b;

    /* renamed from: c */
    private final Context f3929c;

    /* renamed from: d */
    private final Map<String, Object> f3930d;

    /* renamed from: e */
    private final Object f3931e = new Object();

    /* renamed from: f */
    private final Map<String, Object> f3932f;

    /* renamed from: g */
    private boolean f3933g;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final AtomicReference<Integer> f3934i = new AtomicReference<>();

    /* renamed from: com.applovin.impl.sdk.o$a */
    public static class C2028a {

        /* renamed from: a */
        public boolean f3940a;

        /* renamed from: b */
        public String f3941b = "";
    }

    /* renamed from: com.applovin.impl.sdk.o$b */
    public static class C2029b {

        /* renamed from: a */
        public final String f3942a;

        /* renamed from: b */
        public final int f3943b;

        public C2029b(String str, int i) {
            this.f3942a = str;
            this.f3943b = i;
        }
    }

    /* renamed from: com.applovin.impl.sdk.o$c */
    public static class C2030c {

        /* renamed from: a */
        public int f3944a = -1;

        /* renamed from: b */
        public int f3945b = -1;
    }

    protected C2022o(C1969m mVar) {
        if (mVar != null) {
            this.f3927a = mVar;
            this.f3928b = mVar.mo14509A();
            this.f3929c = mVar.mo14520L();
            this.f3930d = m4827q();
            this.f3932f = m4829s();
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public Integer m4805A() {
        AudioManager audioManager = (AudioManager) this.f3929c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return Integer.valueOf((int) (((float) audioManager.getStreamVolume(3)) * ((Float) this.f3927a.mo14534a(C1867b.f3268dL)).floatValue()));
    }

    /* renamed from: B */
    private double m4806B() {
        return ((double) Math.round((((double) TimeZone.getDefault().getOffset(new Date().getTime())) * 10.0d) / 3600000.0d)) / 10.0d;
    }

    /* renamed from: C */
    private boolean m4807C() {
        SensorManager sensorManager = (SensorManager) this.f3929c.getSystemService("sensor");
        return (sensorManager == null || sensorManager.getDefaultSensor(4) == null) ? false : true;
    }

    /* renamed from: D */
    private String m4808D() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f3929c.getSystemService("phone");
        return telephonyManager != null ? telephonyManager.getSimCountryIso().toUpperCase(Locale.ENGLISH) : "";
    }

    /* renamed from: E */
    private String m4809E() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f3929c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            String networkOperator = telephonyManager.getNetworkOperator();
            return networkOperator.substring(0, Math.min(3, networkOperator.length()));
        } catch (Throwable th) {
            if (!C2102v.m5104a()) {
                return "";
            }
            this.f3928b.mo15013b("DataCollector", "Unable to collect mobile country code", th);
            return "";
        }
    }

    /* renamed from: F */
    private String m4810F() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f3929c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            String networkOperator = telephonyManager.getNetworkOperator();
            return networkOperator.substring(Math.min(3, networkOperator.length()));
        } catch (Throwable th) {
            if (!C2102v.m5104a()) {
                return "";
            }
            this.f3928b.mo15013b("DataCollector", "Unable to collect mobile network code", th);
            return "";
        }
    }

    /* renamed from: G */
    private String m4811G() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f3929c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            return telephonyManager.getNetworkOperatorName();
        } catch (Throwable th) {
            if (!C2102v.m5104a()) {
                return "";
            }
            this.f3928b.mo15013b("DataCollector", "Unable to collect carrier", th);
            return "";
        }
    }

    /* renamed from: H */
    private boolean m4812H() {
        try {
            return m4813I() || m4814J();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: I */
    private boolean m4813I() {
        String str = Build.TAGS;
        return str != null && str.contains(m4821b("lz}$blpz"));
    }

    /* renamed from: J */
    private boolean m4814J() {
        String[] strArr = {"&zpz}ld&hyy&Z|yl{|zl{'hyb", "&zk`g&z|", "&zpz}ld&k`g&z|", "&zpz}ld&qk`g&z|", "&mh}h&efjhe&qk`g&z|", "&mh}h&efjhe&k`g&z|", "&zpz}ld&zm&qk`g&z|", "&zpz}ld&k`g&oh`ezhol&z|", "&mh}h&efjhe&z|"};
        for (int i = 0; i < 9; i++) {
            if (new File(m4821b(strArr[i])).exists()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private String m4816a(int i) {
        if (i == 1) {
            return "receiver";
        }
        if (i == 2) {
            return "speaker";
        }
        if (i == 4 || i == 3) {
            return "headphones";
        }
        if (i == 8) {
            return "bluetootha2dpoutput";
        }
        if (i == 13 || i == 19 || i == 5 || i == 6 || i == 12 || i == 11) {
            return "lineout";
        }
        if (i == 9 || i == 10) {
            return "hdmioutput";
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x037f  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01bd A[SYNTHETIC, Splitter:B:54:0x01bd] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x02d5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Map<java.lang.String, java.lang.Object> m4817a(java.util.Map<java.lang.String, java.lang.Object> r10, boolean r11) {
        /*
            r9 = this;
            java.lang.String r0 = "lmt"
            java.lang.String r1 = "tm"
            java.lang.String r2 = "fm"
            java.lang.String r3 = "tds"
            java.lang.String r4 = "fs"
            java.lang.String r5 = "DataCollector"
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>(r10)
            android.content.Context r10 = r9.f3929c
            android.graphics.Point r10 = com.applovin.impl.sdk.utils.C2049g.m4937a(r10)
            int r7 = r10.x
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r8 = "dx"
            r6.put(r8, r7)
            int r10 = r10.y
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.String r7 = "dy"
            r6.put(r7, r10)
            if (r11 == 0) goto L_0x0053
            java.util.concurrent.atomic.AtomicReference<com.applovin.impl.sdk.o$a> r10 = f3925h
            java.lang.Object r10 = r10.get()
            com.applovin.impl.sdk.o$a r10 = (com.applovin.impl.sdk.C2022o.C2028a) r10
            if (r10 == 0) goto L_0x003d
            r9.mo14834m()
            goto L_0x005d
        L_0x003d:
            boolean r10 = com.applovin.impl.sdk.utils.Utils.isMainThread()
            if (r10 == 0) goto L_0x0053
            com.applovin.impl.sdk.o$a r10 = new com.applovin.impl.sdk.o$a
            r10.<init>()
            r7 = 1
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            java.lang.String r8 = "inc"
            r6.put(r8, r7)
            goto L_0x005d
        L_0x0053:
            com.applovin.impl.sdk.m r10 = r9.f3927a
            com.applovin.impl.sdk.o r10 = r10.mo14529V()
            com.applovin.impl.sdk.o$a r10 = r10.mo14832k()
        L_0x005d:
            java.lang.String r7 = r10.f3941b
            boolean r8 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r7)
            if (r8 == 0) goto L_0x006a
            java.lang.String r8 = "idfa"
            r6.put(r8, r7)
        L_0x006a:
            boolean r10 = r10.f3940a
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            java.lang.String r7 = "dnt"
            r6.put(r7, r10)
            java.util.concurrent.atomic.AtomicReference<com.applovin.impl.sdk.o$b> r10 = f3926j
            java.lang.Object r10 = r10.get()
            com.applovin.impl.sdk.o$b r10 = (com.applovin.impl.sdk.C2022o.C2029b) r10
            com.applovin.impl.sdk.m r7 = r9.f3927a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r8 = com.applovin.impl.sdk.p051c.C1867b.f3299dq
            java.lang.Object r7 = r7.mo14534a(r8)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x00a1
            if (r10 == 0) goto L_0x00a1
            java.lang.String r7 = r10.f3942a
            java.lang.String r8 = "idfv"
            r6.put(r8, r7)
            int r10 = r10.f3943b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.String r7 = "idfv_scope"
            r6.put(r7, r10)
        L_0x00a1:
            com.applovin.impl.sdk.j$a r10 = com.applovin.impl.sdk.C1954j.m4423b()
            android.content.Context r7 = r9.f3929c
            java.lang.Boolean r10 = r10.mo14489a((android.content.Context) r7)
            if (r10 == 0) goto L_0x00b2
            java.lang.String r7 = "huc"
            r6.put(r7, r10)
        L_0x00b2:
            com.applovin.impl.sdk.j$a r10 = com.applovin.impl.sdk.C1954j.m4418a()
            android.content.Context r7 = r9.f3929c
            java.lang.Boolean r10 = r10.mo14489a((android.content.Context) r7)
            if (r10 == 0) goto L_0x00c3
            java.lang.String r7 = "aru"
            r6.put(r7, r10)
        L_0x00c3:
            com.applovin.impl.sdk.j$a r10 = com.applovin.impl.sdk.C1954j.m4425c()
            android.content.Context r7 = r9.f3929c
            java.lang.Boolean r10 = r10.mo14489a((android.content.Context) r7)
            if (r10 == 0) goto L_0x00d4
            java.lang.String r7 = "dns"
            r6.put(r7, r10)
        L_0x00d4:
            com.applovin.impl.sdk.m r10 = r9.f3927a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r7 = com.applovin.impl.sdk.p051c.C1867b.f3257dA
            java.lang.Object r10 = r10.mo14534a(r7)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x00fe
            com.applovin.impl.sdk.o$c r10 = r9.m4832v()
            int r7 = r10.f3944a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r8 = "act"
            r6.put(r8, r7)
            int r10 = r10.f3945b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.String r7 = "acm"
            r6.put(r7, r10)
        L_0x00fe:
            com.applovin.impl.sdk.m r10 = r9.f3927a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r7 = com.applovin.impl.sdk.p051c.C1867b.f3265dI
            java.lang.Object r10 = r10.mo14534a(r7)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x0121
            com.applovin.impl.sdk.m r10 = r9.f3927a
            com.applovin.impl.sdk.y r10 = r10.mo14554ad()
            int r10 = r10.mo15026b()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.String r7 = "mtl"
            r6.put(r7, r10)
        L_0x0121:
            com.applovin.impl.sdk.m r10 = r9.f3927a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r7 = com.applovin.impl.sdk.p051c.C1867b.f3267dK
            java.lang.Object r10 = r10.mo14534a(r7)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x013e
            boolean r10 = r9.m4812H()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            java.lang.String r7 = "adr"
            r6.put(r7, r10)
        L_0x013e:
            if (r11 == 0) goto L_0x0149
            java.util.concurrent.atomic.AtomicReference<java.lang.Integer> r10 = r9.f3934i
            java.lang.Object r10 = r10.get()
            java.lang.Integer r10 = (java.lang.Integer) r10
            goto L_0x014d
        L_0x0149:
            java.lang.Integer r10 = r9.m4805A()
        L_0x014d:
            if (r10 == 0) goto L_0x0154
            java.lang.String r11 = "volume"
            r6.put(r11, r10)
        L_0x0154:
            android.content.Context r10 = r9.f3929c     // Catch:{ SettingNotFoundException -> 0x0172 }
            android.content.ContentResolver r10 = r10.getContentResolver()     // Catch:{ SettingNotFoundException -> 0x0172 }
            java.lang.String r11 = "screen_brightness"
            int r10 = android.provider.Settings.System.getInt(r10, r11)     // Catch:{ SettingNotFoundException -> 0x0172 }
            float r10 = (float) r10     // Catch:{ SettingNotFoundException -> 0x0172 }
            r11 = 1132396544(0x437f0000, float:255.0)
            float r10 = r10 / r11
            java.lang.String r11 = "sb"
            r7 = 1120403456(0x42c80000, float:100.0)
            float r10 = r10 * r7
            int r10 = (int) r10     // Catch:{ SettingNotFoundException -> 0x0172 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ SettingNotFoundException -> 0x0172 }
            r6.put(r11, r10)     // Catch:{ SettingNotFoundException -> 0x0172 }
            goto L_0x0180
        L_0x0172:
            r10 = move-exception
            boolean r11 = com.applovin.impl.sdk.C2102v.m5104a()
            if (r11 == 0) goto L_0x0180
            com.applovin.impl.sdk.v r11 = r9.f3928b
            java.lang.String r7 = "Unable to collect screen brightness"
            r11.mo15013b(r5, r7, r10)
        L_0x0180:
            com.applovin.impl.sdk.m r10 = r9.f3927a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r11 = com.applovin.impl.sdk.p051c.C1867b.f3270dN
            java.lang.Object r10 = r10.mo14534a(r11)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x01ac
            com.applovin.impl.sdk.m r10 = r9.f3927a
            boolean r10 = com.applovin.impl.sdk.utils.Utils.isUserAgentCollectionEnabled(r10)
            if (r10 == 0) goto L_0x01ac
            com.applovin.impl.sdk.m r10 = r9.f3927a
            com.applovin.impl.sdk.C1831ab.m3875b(r10)
            java.lang.String r10 = com.applovin.impl.sdk.C1831ab.m3871a()
            boolean r11 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r10)
            if (r11 == 0) goto L_0x01ac
            java.lang.String r11 = "ua"
            r6.put(r11, r10)
        L_0x01ac:
            com.applovin.impl.sdk.m r10 = r9.f3927a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r11 = com.applovin.impl.sdk.p051c.C1867b.f3259dC
            java.lang.Object r10 = r10.mo14534a(r11)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            r11 = -1
            if (r10 == 0) goto L_0x01f8
            java.io.File r10 = android.os.Environment.getDataDirectory()     // Catch:{ all -> 0x01dc }
            long r7 = r10.getFreeSpace()     // Catch:{ all -> 0x01dc }
            java.lang.Long r10 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x01dc }
            r6.put(r4, r10)     // Catch:{ all -> 0x01dc }
            java.io.File r10 = android.os.Environment.getDataDirectory()     // Catch:{ all -> 0x01dc }
            long r7 = r10.getTotalSpace()     // Catch:{ all -> 0x01dc }
            java.lang.Long r10 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x01dc }
            r6.put(r3, r10)     // Catch:{ all -> 0x01dc }
            goto L_0x01f8
        L_0x01dc:
            r10 = move-exception
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
            r6.put(r4, r7)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            r6.put(r3, r4)
            boolean r3 = com.applovin.impl.sdk.C2102v.m5104a()
            if (r3 == 0) goto L_0x01f8
            com.applovin.impl.sdk.v r3 = r9.f3928b
            java.lang.String r4 = "Unable to collect total & free space."
            r3.mo15013b(r5, r4, r10)
        L_0x01f8:
            com.applovin.impl.sdk.m r10 = r9.f3927a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r3 = com.applovin.impl.sdk.p051c.C1867b.f3260dD
            java.lang.Object r10 = r10.mo14534a(r3)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x0266
            android.content.Context r10 = r9.f3929c
            java.lang.String r3 = "activity"
            java.lang.Object r10 = r10.getSystemService(r3)
            android.app.ActivityManager r10 = (android.app.ActivityManager) r10
            android.app.ActivityManager$MemoryInfo r3 = new android.app.ActivityManager$MemoryInfo
            r3.<init>()
            if (r10 == 0) goto L_0x0266
            r10.getMemoryInfo(r3)     // Catch:{ all -> 0x0243 }
            long r7 = r3.availMem     // Catch:{ all -> 0x0243 }
            java.lang.Long r10 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0243 }
            r6.put(r2, r10)     // Catch:{ all -> 0x0243 }
            long r7 = r3.totalMem     // Catch:{ all -> 0x0243 }
            java.lang.Long r10 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0243 }
            r6.put(r1, r10)     // Catch:{ all -> 0x0243 }
            long r7 = r3.threshold     // Catch:{ all -> 0x0243 }
            java.lang.Long r10 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0243 }
            r6.put(r0, r10)     // Catch:{ all -> 0x0243 }
            java.lang.String r10 = "lm"
            boolean r3 = r3.lowMemory     // Catch:{ all -> 0x0243 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0243 }
            r6.put(r10, r3)     // Catch:{ all -> 0x0243 }
            goto L_0x0266
        L_0x0243:
            r10 = move-exception
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r6.put(r2, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r6.put(r1, r2)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r6.put(r0, r11)
            boolean r11 = com.applovin.impl.sdk.C2102v.m5104a()
            if (r11 == 0) goto L_0x0266
            com.applovin.impl.sdk.v r11 = r9.f3928b
            java.lang.String r0 = "Unable to collect memory info."
            r11.mo15013b(r5, r0, r10)
        L_0x0266:
            com.applovin.impl.sdk.m r10 = r9.f3927a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r11 = com.applovin.impl.sdk.p051c.C1867b.f3261dE
            java.lang.Object r10 = r10.mo14534a(r11)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x029d
            android.content.Context r10 = r9.f3929c
            java.lang.String r11 = "android.permission.READ_PHONE_STATE"
            boolean r10 = com.applovin.impl.sdk.utils.C2049g.m4939a(r11, r10)
            if (r10 == 0) goto L_0x029d
            boolean r10 = com.applovin.impl.sdk.utils.C2049g.m4944f()
            if (r10 == 0) goto L_0x029d
            android.content.Context r10 = r9.f3929c
            java.lang.String r11 = "phone"
            java.lang.Object r10 = r10.getSystemService(r11)
            android.telephony.TelephonyManager r10 = (android.telephony.TelephonyManager) r10
            int r10 = r10.getDataNetworkType()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.String r11 = "rat"
            r6.put(r11, r10)
        L_0x029d:
            com.applovin.impl.sdk.m r10 = r9.f3927a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r11 = com.applovin.impl.sdk.p051c.C1867b.f3258dB
            java.lang.Object r10 = r10.mo14534a(r11)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x02bc
            java.lang.String r10 = r9.m4835y()
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L_0x02bc
            java.lang.String r11 = "so"
            r6.put(r11, r10)
        L_0x02bc:
            java.lang.String r10 = r9.m4828r()
            java.lang.String r11 = "orientation_lock"
            r6.put(r11, r10)
            com.applovin.impl.sdk.m r10 = r9.f3927a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r11 = com.applovin.impl.sdk.p051c.C1867b.f3262dF
            java.lang.Object r10 = r10.mo14534a(r11)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x02e2
            boolean r10 = com.applovin.impl.sdk.utils.Utils.isVPNConnected()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            java.lang.String r11 = "vs"
            r6.put(r11, r10)
        L_0x02e2:
            boolean r10 = com.applovin.impl.sdk.utils.C2049g.m4942d()
            if (r10 == 0) goto L_0x0301
            android.content.Context r10 = r9.f3929c
            java.lang.String r11 = "power"
            java.lang.Object r10 = r10.getSystemService(r11)
            android.os.PowerManager r10 = (android.os.PowerManager) r10
            if (r10 == 0) goto L_0x0301
            boolean r10 = r10.isPowerSaveMode()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.String r11 = "lpm"
            r6.put(r11, r10)
        L_0x0301:
            com.applovin.impl.sdk.m r10 = r9.f3927a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r11 = com.applovin.impl.sdk.p051c.C1867b.f3271dO
            java.lang.Object r10 = r10.mo14534a(r11)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x032c
            com.applovin.impl.sdk.m r10 = r9.f3927a
            com.applovin.impl.sdk.utils.n r10 = r10.mo14558ah()
            if (r10 == 0) goto L_0x032c
            com.applovin.impl.sdk.m r10 = r9.f3927a
            com.applovin.impl.sdk.utils.n r10 = r10.mo14558ah()
            float r10 = r10.mo14970c()
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
            java.lang.String r11 = "da"
            r6.put(r11, r10)
        L_0x032c:
            com.applovin.impl.sdk.m r10 = r9.f3927a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r11 = com.applovin.impl.sdk.p051c.C1867b.f3272dP
            java.lang.Object r10 = r10.mo14534a(r11)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x0357
            com.applovin.impl.sdk.m r10 = r9.f3927a
            com.applovin.impl.sdk.utils.n r10 = r10.mo14558ah()
            if (r10 == 0) goto L_0x0357
            com.applovin.impl.sdk.m r10 = r9.f3927a
            com.applovin.impl.sdk.utils.n r10 = r10.mo14558ah()
            float r10 = r10.mo14969b()
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
            java.lang.String r11 = "dm"
            r6.put(r11, r10)
        L_0x0357:
            com.applovin.impl.sdk.m r10 = r9.f3927a
            com.applovin.impl.sdk.h r10 = r10.mo14559ai()
            int r10 = r10.mo14474a()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.String r11 = "mute_switch"
            r6.put(r11, r10)
            com.applovin.impl.sdk.m r10 = r9.f3927a
            java.lang.String r10 = com.applovin.impl.sdk.utils.C2050h.m4965f(r10)
            java.lang.String r11 = "network"
            r6.put(r11, r10)
            java.lang.String r10 = r9.m4836z()
            boolean r11 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r10)
            if (r11 == 0) goto L_0x0384
            java.lang.String r11 = "kb"
            r6.put(r11, r10)
        L_0x0384:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C2022o.m4817a(java.util.Map, boolean):java.util.Map");
    }

    /* renamed from: a */
    public static void m4818a(final Context context) {
        new Thread(new Runnable() {
            public void run() {
                C2022o.f3925h.set(C2044c.m4922a(context));
            }
        }).start();
    }

    /* renamed from: a */
    private void m4819a(Map<String, Object> map) {
        if (((Boolean) this.f3927a.mo14534a(C1867b.f3263dG)).booleanValue() && !map.containsKey("af")) {
            map.put("af", Long.valueOf(m4833w()));
        }
        if (((Boolean) this.f3927a.mo14534a(C1867b.f3264dH)).booleanValue() && !map.containsKey("font")) {
            map.put("font", Float.valueOf(m4834x()));
        }
        if (((Boolean) this.f3927a.mo14534a(C1867b.f3270dN)).booleanValue() && Utils.isUserAgentCollectionEnabled(this.f3927a)) {
            C1831ab.m3875b(this.f3927a);
        }
        if (((Boolean) this.f3927a.mo14534a(C1867b.f3269dM)).booleanValue() && !map.containsKey("sua")) {
            map.put("sua", System.getProperty("http.agent"));
        }
        if (((Boolean) this.f3927a.mo14534a(C1867b.f3266dJ)).booleanValue() && !map.containsKey("network_restricted")) {
            map.put("network_restricted", Boolean.valueOf(m4831u()));
        }
    }

    /* renamed from: a */
    private boolean m4820a(String str) {
        try {
            return Settings.Secure.getInt(this.f3929c.getContentResolver(), str) == 1;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    private String m4821b(String str) {
        int length = str.length();
        int[] iArr = {11, 12, 10, 3, 2, 1, 15, 10, 15, 14};
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = str.charAt(i);
            for (int i2 = 9; i2 >= 0; i2--) {
                cArr[i] = (char) (cArr[i] ^ iArr[i2]);
            }
        }
        return new String(cArr);
    }

    /* renamed from: b */
    public static void m4823b(final Context context) {
        if (Utils.checkClassExistence("com.google.android.gms.appset.AppSet")) {
            new Thread(new Runnable() {
                public void run() {
                    try {
                        AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener<AppSetIdInfo>() {
                            /* renamed from: a */
                            public void onSuccess(AppSetIdInfo appSetIdInfo) {
                                C2022o.f3926j.set(new C2029b(appSetIdInfo.getId(), appSetIdInfo.getScope()));
                            }
                        });
                    } catch (Throwable unused) {
                        if (C2102v.m5104a()) {
                            C2102v.m5107f("DataCollector", "Could not collect AppSet ID.");
                        }
                    }
                }
            }).start();
        } else if (C2102v.m5104a()) {
            C2102v.m5107f("DataCollector", "Could not collect AppSet ID.");
        }
    }

    /* renamed from: p */
    private Map<String, String> m4826p() {
        return Utils.stringifyObjectMap(mo14821a((Map<String, String>) null, true, false));
    }

    /* renamed from: q */
    private Map<String, Object> m4827q() {
        HashMap hashMap = new HashMap(32);
        hashMap.put("api_level", Integer.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("brand", Build.MANUFACTURER);
        hashMap.put("brand_name", Build.BRAND);
        hashMap.put("hardware", Build.HARDWARE);
        hashMap.put("sim", Boolean.valueOf(AppLovinSdkUtils.isEmulator()));
        hashMap.put("aida", Boolean.valueOf(C2044c.m4923a()));
        hashMap.put("locale", Locale.getDefault().toString());
        hashMap.put(DeviceRequestsHelper.DEVICE_INFO_MODEL, Build.MODEL);
        hashMap.put("os", Build.VERSION.RELEASE);
        hashMap.put(TapjoyConstants.TJC_PLATFORM, mo14827f());
        hashMap.put("revision", Build.DEVICE);
        hashMap.put("tz_offset", Double.valueOf(m4806B()));
        hashMap.put("gy", Boolean.valueOf(m4807C()));
        hashMap.put(TapjoyConstants.TJC_DEVICE_COUNTRY_CODE, m4808D());
        hashMap.put("mcc", m4809E());
        hashMap.put("mnc", m4810F());
        hashMap.put("carrier", m4811G());
        hashMap.put("is_tablet", Boolean.valueOf(AppLovinSdkUtils.isTablet(this.f3929c)));
        hashMap.put("tv", Boolean.valueOf(AppLovinSdkUtils.isTv(this.f3929c)));
        DisplayMetrics displayMetrics = this.f3929c.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            hashMap.put("adns", Float.valueOf(displayMetrics.density));
            hashMap.put("adnsd", Integer.valueOf(displayMetrics.densityDpi));
            hashMap.put("xdpi", Float.valueOf(displayMetrics.xdpi));
            hashMap.put("ydpi", Float.valueOf(displayMetrics.ydpi));
            Point a = C2049g.m4937a(this.f3929c);
            hashMap.put("screen_size_in", Double.valueOf(Math.sqrt(Math.pow((double) a.x, 2.0d) + Math.pow((double) a.y, 2.0d)) / ((double) displayMetrics.xdpi)));
        }
        hashMap.put("bt_ms", Long.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
        m4819a((Map<String, Object>) hashMap);
        return hashMap;
    }

    /* renamed from: r */
    private String m4828r() {
        int orientation = Utils.getOrientation(this.f3929c);
        return orientation == 1 ? "portrait" : orientation == 2 ? "landscape" : "none";
    }

    /* renamed from: s */
    private Map<String, Object> m4829s() {
        PackageInfo packageInfo;
        HashMap hashMap = new HashMap(20);
        PackageManager packageManager = this.f3929c.getPackageManager();
        ApplicationInfo applicationInfo = this.f3929c.getApplicationInfo();
        long lastModified = new File(applicationInfo.sourceDir).lastModified();
        String str = null;
        try {
            packageInfo = packageManager.getPackageInfo(this.f3929c.getPackageName(), 0);
            try {
                str = packageManager.getInstallerPackageName(applicationInfo.packageName);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            packageInfo = null;
        }
        hashMap.put(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, packageManager.getApplicationLabel(applicationInfo));
        Object obj = "";
        hashMap.put(TapjoyConstants.TJC_APP_VERSION_NAME, packageInfo != null ? packageInfo.versionName : obj);
        hashMap.put("app_version_code", Integer.valueOf(packageInfo != null ? packageInfo.versionCode : -1));
        hashMap.put(CampaignEx.JSON_KEY_PACKAGE_NAME, applicationInfo.packageName);
        hashMap.put("vz", StringUtils.toShortSHA1Hash(applicationInfo.packageName));
        if (str == null) {
            str = obj;
        }
        hashMap.put("installer_name", str);
        hashMap.put("tg", C2094p.m5069a(this.f3927a));
        hashMap.put("debug", Boolean.valueOf(Utils.isPubInDebugMode(this.f3927a.mo14520L(), this.f3927a)));
        hashMap.put("ia", Long.valueOf(lastModified));
        Long l = (Long) this.f3927a.mo14535a(C1869d.f3372d);
        if (l != null) {
            hashMap.put("ia_v2", l);
        } else {
            this.f3927a.mo14541a(C1869d.f3372d, Long.valueOf(lastModified));
        }
        hashMap.put("sdk_version", AppLovinSdk.VERSION);
        hashMap.put("omid_sdk_version", this.f3927a.mo14562al().mo14086c());
        String userEngagementSdkVersion = Utils.getUserEngagementSdkVersion();
        if (StringUtils.isValidString(userEngagementSdkVersion)) {
            hashMap.put("ue_sdk_version", userEngagementSdkVersion);
        }
        hashMap.put("api_did", this.f3927a.mo14534a(C1867b.f3096X));
        if (packageInfo != null) {
            obj = Long.valueOf(packageInfo.firstInstallTime);
        }
        hashMap.put("first_install_v3_ms", obj);
        hashMap.put("target_sdk", Integer.valueOf(applicationInfo.targetSdkVersion));
        hashMap.put("epv", Integer.valueOf(Utils.tryToGetExoPlayerVersionCode()));
        return hashMap;
    }

    /* renamed from: t */
    private Map<String, Object> m4830t() {
        HashMap hashMap = new HashMap(2);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f3929c);
        String str = (String) this.f3927a.mo14566b(C1869d.f3382n, null, defaultSharedPreferences);
        if (StringUtils.isValidString(str)) {
            hashMap.put(CmpApiConstants.IABTCF_TC_STRING, str);
        }
        Object obj = defaultSharedPreferences.getAll().get(C1869d.f3383o.mo14293a());
        if ((obj instanceof String) || (obj instanceof Number) || (obj instanceof Boolean)) {
            hashMap.put(CmpApiConstants.IABTCF_GDPR_APPLIES, obj);
        }
        return hashMap;
    }

    /* renamed from: u */
    private boolean m4831u() {
        ConnectivityManager connectivityManager;
        if (C2049g.m4944f() && (connectivityManager = (ConnectivityManager) this.f3929c.getSystemService("connectivity")) != null) {
            try {
                return connectivityManager.getRestrictBackgroundStatus() == 3;
            } catch (Throwable th) {
                if (C2102v.m5104a()) {
                    this.f3927a.mo14509A().mo15013b("DataCollector", "Unable to collect constrained network info.", th);
                }
            }
        }
        return false;
    }

    /* renamed from: v */
    private C2030c m4832v() {
        C2030c cVar = new C2030c();
        Intent registerReceiver = this.f3929c.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int i = -1;
        int intExtra = registerReceiver != null ? registerReceiver.getIntExtra("level", -1) : -1;
        int intExtra2 = registerReceiver != null ? registerReceiver.getIntExtra("scale", -1) : -1;
        if (intExtra <= 0 || intExtra2 <= 0) {
            cVar.f3945b = -1;
        } else {
            cVar.f3945b = (int) ((((float) intExtra) / ((float) intExtra2)) * 100.0f);
        }
        if (registerReceiver != null) {
            i = registerReceiver.getIntExtra("status", -1);
        }
        cVar.f3944a = i;
        return cVar;
    }

    /* renamed from: w */
    private long m4833w() {
        List asList = Arrays.asList(StringUtils.emptyIfNull(Settings.Secure.getString(this.f3929c.getContentResolver(), "enabled_accessibility_services")).split(CertificateUtil.DELIMITER));
        long j = asList.contains("AccessibilityMenuService") ? 256 : 0;
        if (asList.contains("SelectToSpeakService")) {
            j |= 512;
        }
        if (asList.contains("SoundAmplifierService")) {
            j |= 2;
        }
        if (asList.contains("SpeechToTextAccessibilityService")) {
            j |= 128;
        }
        if (asList.contains("SwitchAccessService")) {
            j |= 4;
        }
        if ((this.f3929c.getResources().getConfiguration().uiMode & 48) == 32) {
            j |= 1024;
        }
        if (m4820a("accessibility_enabled")) {
            j |= 8;
        }
        if (m4820a("touch_exploration_enabled")) {
            j |= 16;
        }
        if (!C2049g.m4942d()) {
            return j;
        }
        if (m4820a("accessibility_display_inversion_enabled")) {
            j |= 32;
        }
        return m4820a("skip_first_use_hints") ? j | 64 : j;
    }

    /* renamed from: x */
    private float m4834x() {
        try {
            return Settings.System.getFloat(this.f3929c.getContentResolver(), "font_scale");
        } catch (Settings.SettingNotFoundException e) {
            if (!C2102v.m5104a()) {
                return -1.0f;
            }
            this.f3928b.mo15013b("DataCollector", "Error collecting font scale", e);
            return -1.0f;
        }
    }

    /* renamed from: y */
    private String m4835y() {
        AudioManager audioManager = (AudioManager) this.f3929c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (C2049g.m4943e()) {
            for (AudioDeviceInfo type : audioManager.getDevices(2)) {
                String a = m4816a(type.getType());
                if (!TextUtils.isEmpty(a)) {
                    sb.append(a);
                    sb.append(",");
                }
            }
        } else {
            if (audioManager.isWiredHeadsetOn()) {
                sb.append("headphones");
                sb.append(",");
            }
            if (audioManager.isBluetoothA2dpOn()) {
                sb.append("bluetootha2dpoutput");
            }
        }
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1);
        }
        String sb2 = sb.toString();
        if (C2102v.m5104a() && TextUtils.isEmpty(sb2)) {
            this.f3928b.mo15012b("DataCollector", "No sound outputs detected");
        }
        return sb2;
    }

    /* renamed from: z */
    private String m4836z() {
        if (!C2049g.m4944f()) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            LocaleList locales = this.f3929c.getResources().getConfiguration().getLocales();
            for (int i = 0; i < locales.size(); i++) {
                sb.append(locales.get(i));
                sb.append(",");
            }
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
                sb.deleteCharAt(sb.length() - 1);
            }
            return sb.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo14820a() {
        String encodeToString = Base64.encodeToString(new JSONObject(m4826p()).toString().getBytes(Charset.defaultCharset()), 2);
        if (!((Boolean) this.f3927a.mo14534a(C1867b.f3349eq)).booleanValue()) {
            return encodeToString;
        }
        return C2090m.m5046a(encodeToString, this.f3927a.mo14597z(), Utils.getServerAdjustedUnixTimestampMillis(this.f3927a));
    }

    /* renamed from: a */
    public Map<String, Object> mo14821a(Map<String, String> map, boolean z, boolean z2) {
        HashMap hashMap = new HashMap(64);
        Map<String, Object> a = mo14822a(z);
        Map<String, Object> h = mo14829h();
        Map<String, Object> j = mo14831j();
        Map<String, String> allData = this.f3927a.mo14588r().getAllData();
        if (z2) {
            hashMap.put(DeviceRequestsHelper.DEVICE_INFO_PARAM, a);
            hashMap.put("app_info", h);
            if (map != null) {
                hashMap.put("ad_info", map);
            }
            if (j != null) {
                hashMap.put("location_info", j);
            }
            if (!allData.isEmpty()) {
                hashMap.put("targeting_data", allData);
            }
        } else {
            hashMap.putAll(a);
            hashMap.putAll(h);
            if (map != null) {
                hashMap.putAll(map);
            }
            if (j != null) {
                hashMap.putAll(j);
            }
            if (!allData.isEmpty()) {
                hashMap.putAll(allData);
            }
        }
        hashMap.put("accept", "custom_size,launch_app,video");
        hashMap.put("format", "json");
        Utils.putObjectForStringIfValid("mediation_provider", this.f3927a.mo14590t(), hashMap);
        Utils.putObjectForStringIfValid("plugin_version", (String) this.f3927a.mo14534a(C1867b.f3308dz), hashMap);
        if (!((Boolean) this.f3927a.mo14534a(C1867b.f3348ep)).booleanValue()) {
            hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f3927a.mo14597z());
        }
        hashMap.putAll(mo14830i());
        if (((Boolean) this.f3927a.mo14534a(C1867b.f3282dZ)).booleanValue()) {
            C1882g T = this.f3927a.mo14527T();
            hashMap.put("li", Long.valueOf(T.mo14354b(C1881f.f3466b)));
            hashMap.put("si", Long.valueOf(T.mo14354b(C1881f.f3468d)));
            hashMap.put("pf", Long.valueOf(T.mo14354b(C1881f.f3472h)));
            hashMap.put("mpf", Long.valueOf(T.mo14354b(C1881f.f3479o)));
            hashMap.put("gpf", Long.valueOf(T.mo14354b(C1881f.f3473i)));
            hashMap.put("asoac", Long.valueOf(T.mo14354b(C1881f.f3477m)));
        }
        hashMap.put("rid", UUID.randomUUID().toString());
        return hashMap;
    }

    /* renamed from: a */
    public Map<String, Object> mo14822a(boolean z) {
        HashMap hashMap;
        synchronized (this.f3931e) {
            hashMap = new HashMap(this.f3930d);
        }
        return m4817a(hashMap, z);
    }

    /* renamed from: b */
    public Map<String, Object> mo14823b() {
        return new HashMap(this.f3930d);
    }

    /* renamed from: c */
    public Map<String, Object> mo14824c() {
        return new HashMap(this.f3932f);
    }

    /* renamed from: d */
    public Map<String, Object> mo14825d() {
        return mo14822a(false);
    }

    /* renamed from: e */
    public void mo14826e() {
        synchronized (this.f3931e) {
            m4819a(this.f3930d);
        }
    }

    /* renamed from: f */
    public String mo14827f() {
        return AppLovinSdkUtils.isFireOS(this.f3929c) ? "fireos" : "android";
    }

    /* renamed from: g */
    public boolean mo14828g() {
        return this.f3933g;
    }

    /* renamed from: h */
    public Map<String, Object> mo14829h() {
        HashMap hashMap = new HashMap(this.f3932f);
        hashMap.put("first_install", Boolean.valueOf(this.f3927a.mo14523P()));
        hashMap.put("first_install_v2", Boolean.valueOf(!this.f3927a.mo14524Q()));
        hashMap.put("test_ads", Boolean.valueOf(this.f3933g));
        if (((Boolean) this.f3927a.mo14534a(C1867b.f3300dr)).booleanValue()) {
            Utils.putObjectForStringIfValid("cuid", this.f3927a.mo14583m(), hashMap);
        }
        if (((Boolean) this.f3927a.mo14534a(C1867b.f3303du)).booleanValue()) {
            hashMap.put("compass_random_token", this.f3927a.mo14584n());
        }
        if (((Boolean) this.f3927a.mo14534a(C1867b.f3305dw)).booleanValue()) {
            hashMap.put("applovin_random_token", this.f3927a.mo14585o());
        }
        String name = this.f3927a.mo14587q().getName();
        if (StringUtils.isValidString(name)) {
            hashMap.put("user_segment_name", name);
        }
        hashMap.putAll(m4830t());
        return hashMap;
    }

    /* renamed from: i */
    public Map<String, Object> mo14830i() {
        HashMap hashMap = new HashMap(5);
        hashMap.put("sc", this.f3927a.mo14534a(C1867b.f3128ac));
        hashMap.put("sc2", this.f3927a.mo14534a(C1867b.f3129ad));
        hashMap.put("sc3", this.f3927a.mo14534a(C1867b.f3130ae));
        hashMap.put("server_installed_at", this.f3927a.mo14534a(C1867b.f3131af));
        Utils.putObjectForStringIfValid("persisted_data", (String) this.f3927a.mo14535a(C1869d.f3394z), hashMap);
        return hashMap;
    }

    /* renamed from: j */
    public Map<String, Object> mo14831j() {
        if (!this.f3927a.mo14586p().isLocationCollectionEnabled() || !((Boolean) this.f3927a.mo14534a(C1867b.f3279dW)).booleanValue()) {
            return null;
        }
        HashMap hashMap = new HashMap(4);
        C2038u am = this.f3927a.mo14563am();
        boolean b = am.mo14878b();
        hashMap.put("loc_services_enabled", Boolean.valueOf(b));
        if (!b) {
            return hashMap;
        }
        hashMap.put("loc_auth", Boolean.valueOf(am.mo14877a()));
        C2037t c = am.mo14879c();
        if (c != null) {
            hashMap.put("loc_lat", Utils.formatDoubleValue(c.mo14874a(), ((Integer) this.f3927a.mo14534a(C1867b.f3281dY)).intValue()));
            hashMap.put("loc_long", Utils.formatDoubleValue(c.mo14875b(), ((Integer) this.f3927a.mo14534a(C1867b.f3281dY)).intValue()));
        }
        return hashMap;
    }

    /* renamed from: k */
    public C2028a mo14832k() {
        List<String> testDeviceAdvertisingIds;
        C2028a a = C2044c.m4922a(this.f3929c);
        if (a == null) {
            return new C2028a();
        }
        if (((Boolean) this.f3927a.mo14534a(C1867b.f3298dp)).booleanValue()) {
            if (a.f3940a && !((Boolean) this.f3927a.mo14534a(C1867b.f3297do)).booleanValue()) {
                a.f3941b = "";
            }
            f3925h.set(a);
        } else {
            a = new C2028a();
        }
        boolean z = false;
        if (StringUtils.isValidString(a.f3941b) && (testDeviceAdvertisingIds = this.f3927a.mo14586p().getTestDeviceAdvertisingIds()) != null && testDeviceAdvertisingIds.contains(a.f3941b)) {
            z = true;
        }
        this.f3933g = z;
        return a;
    }

    /* renamed from: l */
    public C2029b mo14833l() {
        return f3926j.get();
    }

    /* renamed from: m */
    public void mo14834m() {
        this.f3927a.mo14526S().mo14429a((C1887a) new C1898f(this.f3927a, new C1898f.C1899a() {
            /* renamed from: a */
            public void mo14403a(C2028a aVar) {
                C2022o.f3925h.set(aVar);
            }
        }), C1918o.C1920a.ADVERTISING_INFO_COLLECTION);
        this.f3927a.mo14526S().mo14429a((C1887a) new C1944z(this.f3927a, true, new Runnable() {
            public void run() {
                C2022o.this.f3934i.set(C2022o.this.m4805A());
            }
        }), C1918o.C1920a.CACHING_OTHER);
    }
}
