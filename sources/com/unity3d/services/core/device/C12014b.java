package com.unity3d.services.core.device;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ConfigurationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.facebook.internal.security.CertificateUtil;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TapjoyConstants;
import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.misc.C12080j;
import com.unity3d.services.core.preferences.C12082a;
import com.unity3d.services.core.properties.C12084a;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.unity3d.services.core.device.b */
/* compiled from: Device */
public class C12014b {

    /* renamed from: com.unity3d.services.core.device.b$a */
    /* compiled from: Device */
    static /* synthetic */ class C12015a {

        /* renamed from: a */
        static final /* synthetic */ int[] f29331a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.unity3d.services.core.device.b$b[] r0 = com.unity3d.services.core.device.C12014b.C12016b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f29331a = r0
                com.unity3d.services.core.device.b$b r1 = com.unity3d.services.core.device.C12014b.C12016b.TOTAL_MEMORY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29331a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.unity3d.services.core.device.b$b r1 = com.unity3d.services.core.device.C12014b.C12016b.FREE_MEMORY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.C12014b.C12015a.<clinit>():void");
        }
    }

    /* renamed from: com.unity3d.services.core.device.b$b */
    /* compiled from: Device */
    public enum C12016b {
        TOTAL_MEMORY,
        FREE_MEMORY
    }

    /* renamed from: A */
    public static String m32679A() {
        return C12084a.m32908e() != null ? ((TelephonyManager) C12084a.m32908e().getSystemService("phone")).getNetworkOperator() : "";
    }

    /* renamed from: B */
    public static String m32680B() {
        return C12084a.m32908e() != null ? ((TelephonyManager) C12084a.m32908e().getSystemService("phone")).getNetworkOperatorName() : "";
    }

    /* renamed from: C */
    public static int m32681C() {
        if (C12084a.m32908e() == null) {
            return -1;
        }
        try {
            return ((TelephonyManager) C12084a.m32908e().getSystemService("phone")).getNetworkType();
        } catch (SecurityException unused) {
            C12065a.m32851e("Unity Ads was not able to get current network type due to missing permission");
            return -1;
        }
    }

    /* renamed from: D */
    private static ArrayList<String> m32682D() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(Build.SUPPORTED_ABIS));
        return arrayList;
    }

    /* renamed from: E */
    private static ArrayList<String> m32683E() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(Build.CPU_ABI);
        arrayList.add(Build.CPU_ABI2);
        return arrayList;
    }

    /* renamed from: F */
    public static String m32684F() {
        return C12019e.m32750c();
    }

    /* renamed from: G */
    public static String m32685G() {
        return Build.VERSION.RELEASE;
    }

    /* renamed from: H */
    public static Map<String, String> m32686H() {
        HashMap hashMap = new HashMap();
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile("/proc/self/stat", CampaignEx.JSON_KEY_AD_R);
            try {
                hashMap.put("stat", randomAccessFile2.readLine());
                try {
                    randomAccessFile2.close();
                } catch (IOException e) {
                    C12065a.m32842a("Error closing RandomAccessFile", (Exception) e);
                }
            } catch (IOException e2) {
                RandomAccessFile randomAccessFile3 = randomAccessFile2;
                e = e2;
                randomAccessFile = randomAccessFile3;
                try {
                    C12065a.m32842a("Error while reading processor info: ", (Exception) e);
                    randomAccessFile.close();
                    return hashMap;
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile2 = randomAccessFile;
                    try {
                        randomAccessFile2.close();
                    } catch (IOException e3) {
                        C12065a.m32842a("Error closing RandomAccessFile", (Exception) e3);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile2.close();
                throw th;
            }
        } catch (IOException e4) {
            e = e4;
            C12065a.m32842a("Error while reading processor info: ", (Exception) e);
            randomAccessFile.close();
            return hashMap;
        }
        return hashMap;
    }

    /* renamed from: I */
    public static String m32687I() {
        return Build.PRODUCT;
    }

    /* renamed from: J */
    public static int m32688J() {
        if (C12084a.m32908e() == null) {
            return -1;
        }
        AudioManager audioManager = (AudioManager) C12084a.m32908e().getSystemService("audio");
        if (audioManager != null) {
            return audioManager.getRingerMode();
        }
        return -2;
    }

    /* renamed from: K */
    public static int m32689K() {
        if (C12084a.m32908e() != null) {
            return Settings.System.getInt(C12084a.m32908e().getContentResolver(), "screen_brightness", -1);
        }
        return -1;
    }

    /* renamed from: L */
    public static int m32690L() {
        if (C12084a.m32908e() != null) {
            return C12084a.m32908e().getResources().getDisplayMetrics().densityDpi;
        }
        return -1;
    }

    /* renamed from: M */
    public static int m32691M() {
        if (C12084a.m32908e() != null) {
            return C12084a.m32908e().getResources().getDisplayMetrics().heightPixels;
        }
        return -1;
    }

    /* renamed from: N */
    public static int m32692N() {
        if (C12084a.m32908e() != null) {
            return C12084a.m32908e().getResources().getConfiguration().screenLayout;
        }
        return -1;
    }

    /* renamed from: O */
    public static int m32693O() {
        if (C12084a.m32908e() != null) {
            return C12084a.m32908e().getResources().getDisplayMetrics().widthPixels;
        }
        return -1;
    }

    /* renamed from: P */
    public static List<Sensor> m32694P() {
        if (C12084a.m32908e() != null) {
            return ((SensorManager) C12084a.m32908e().getSystemService("sensor")).getSensorList(-1);
        }
        return null;
    }

    /* renamed from: Q */
    public static ArrayList<String> m32695Q() {
        if (m32713b() < 21) {
            return m32683E();
        }
        return m32682D();
    }

    /* renamed from: R */
    public static long m32696R() {
        return m32706a(C12016b.TOTAL_MEMORY);
    }

    /* renamed from: S */
    public static String m32697S() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: T */
    public static long m32698T() {
        return SystemClock.uptimeMillis();
    }

    /* renamed from: U */
    public static boolean m32699U() {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (C12084a.m32908e() == null || (connectivityManager = (ConnectivityManager) C12084a.m32908e().getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    /* renamed from: V */
    public static Boolean m32700V() {
        if (m32713b() < 17) {
            return m32721d0();
        }
        return m32719c0();
    }

    /* renamed from: W */
    public static boolean m32701W() {
        return C12008a.m32672c();
    }

    /* renamed from: X */
    public static boolean m32702X() {
        return C12019e.m32749b();
    }

    /* renamed from: Y */
    public static boolean m32703Y() {
        try {
            return m32716b(DownloadCommon.DOWNLOAD_REPORT_SUCCESS);
        } catch (Exception e) {
            C12065a.m32842a("Rooted check failed", e);
            return false;
        }
    }

    /* renamed from: Z */
    public static boolean m32704Z() {
        Intent registerReceiver;
        if (C12084a.m32908e() == null || (registerReceiver = C12084a.m32908e().registerReceiver((BroadcastReceiver) null, new IntentFilter("android.hardware.usb.action.USB_STATE"))) == null) {
            return false;
        }
        return registerReceiver.getBooleanExtra("connected", false);
    }

    /* renamed from: a */
    public static String m32709a() {
        return C12008a.m32668a();
    }

    /* renamed from: a0 */
    public static boolean m32712a0() {
        ConnectivityManager connectivityManager;
        if (C12084a.m32908e() == null || (connectivityManager = (ConnectivityManager) C12084a.m32908e().getSystemService("connectivity")) == null) {
            return false;
        }
        TelephonyManager telephonyManager = (TelephonyManager) C12084a.m32908e().getSystemService("phone");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !connectivityManager.getBackgroundDataSetting() || !connectivityManager.getActiveNetworkInfo().isConnected() || telephonyManager == null || activeNetworkInfo.getType() != 1 || !activeNetworkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static int m32713b() {
        return Build.VERSION.SDK_INT;
    }

    /* renamed from: b0 */
    public static boolean m32717b0() {
        if (C12084a.m32908e() != null) {
            return ((AudioManager) C12084a.m32908e().getSystemService("audio")).isWiredHeadsetOn();
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0020 A[SYNTHETIC, Splitter:B:13:0x0020] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m32718c() throws java.lang.Exception {
        /*
            android.content.Context r0 = com.unity3d.services.core.properties.C12084a.m32908e()
            java.lang.String r0 = r0.getPackageCodePath()
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x001c }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x001c }
            r2.<init>(r0)     // Catch:{ all -> 0x001c }
            r1.<init>(r2)     // Catch:{ all -> 0x001c }
            java.lang.String r0 = com.unity3d.services.core.misc.C12080j.m32873a((java.io.InputStream) r1)     // Catch:{ all -> 0x001a }
            r1.close()     // Catch:{ IOException -> 0x0019 }
        L_0x0019:
            return r0
        L_0x001a:
            r0 = move-exception
            goto L_0x001e
        L_0x001c:
            r0 = move-exception
            r1 = 0
        L_0x001e:
            if (r1 == 0) goto L_0x0023
            r1.close()     // Catch:{ IOException -> 0x0023 }
        L_0x0023:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.C12014b.m32718c():java.lang.String");
    }

    /* renamed from: c0 */
    private static Boolean m32719c0() {
        try {
            boolean z = false;
            if (1 == Settings.Global.getInt(C12084a.m32908e().getContentResolver(), "adb_enabled", 0)) {
                z = true;
            }
            return Boolean.valueOf(z);
        } catch (Exception e) {
            C12065a.m32842a("Problems fetching adb enabled status", e);
            return null;
        }
    }

    /* renamed from: d */
    public static float m32720d() {
        Intent registerReceiver;
        if (C12084a.m32908e() == null || (registerReceiver = C12084a.m32908e().registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null) {
            return -1.0f;
        }
        return ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
    }

    /* renamed from: d0 */
    private static Boolean m32721d0() {
        try {
            boolean z = false;
            if (1 == Settings.Secure.getInt(C12084a.m32908e().getContentResolver(), "adb_enabled", 0)) {
                z = true;
            }
            return Boolean.valueOf(z);
        } catch (Exception e) {
            C12065a.m32842a("Problems fetching adb enabled status", e);
            return null;
        }
    }

    /* renamed from: e */
    public static int m32722e() {
        Intent registerReceiver;
        if (C12084a.m32908e() == null || (registerReceiver = C12084a.m32908e().registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null) {
            return -1;
        }
        return registerReceiver.getIntExtra("status", -1);
    }

    /* renamed from: f */
    public static String m32723f() {
        return Build.BOARD;
    }

    /* renamed from: g */
    public static String m32724g() {
        return Build.BOOTLOADER;
    }

    /* renamed from: h */
    public static String m32725h() {
        return Build.BRAND;
    }

    /* renamed from: i */
    public static String m32726i() {
        return Build.ID;
    }

    /* renamed from: j */
    public static String m32727j() {
        return Build.VERSION.INCREMENTAL;
    }

    /* renamed from: k */
    public static long m32728k() {
        return (long) Runtime.getRuntime().availableProcessors();
    }

    /* renamed from: l */
    public static String m32729l() {
        try {
            Signature[] signatureArr = C12084a.m32908e().getPackageManager().getPackageInfo(C12084a.m32908e().getPackageName(), 64).signatures;
            if (signatureArr != null && signatureArr.length >= 1) {
                return C12080j.m32883b(MessageDigest.getInstance("SHA-1").digest(((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getEncoded()));
            }
        } catch (Exception e) {
            C12065a.m32842a("Exception when signing certificate fingerprint", e);
        }
        return null;
    }

    /* renamed from: m */
    public static String m32730m() {
        if (m32712a0()) {
            return TapjoyConstants.TJC_CONNECTION_TYPE_WIFI;
        }
        return m32699U() ? "cellular" : "none";
    }

    /* renamed from: n */
    public static String m32731n() {
        return Build.DEVICE;
    }

    /* renamed from: o */
    public static float m32732o() {
        if (C12084a.m32908e() != null) {
            return C12084a.m32908e().getResources().getDisplayMetrics().density;
        }
        return -1.0f;
    }

    /* renamed from: p */
    public static long m32733p() {
        return SystemClock.elapsedRealtime();
    }

    /* renamed from: q */
    public static String m32734q() {
        return Build.FINGERPRINT;
    }

    /* renamed from: r */
    public static long m32735r() {
        return m32706a(C12016b.FREE_MEMORY);
    }

    /* renamed from: s */
    public static String m32736s() {
        ActivityManager activityManager;
        ConfigurationInfo deviceConfigurationInfo;
        if (C12084a.m32908e() == null || (activityManager = (ActivityManager) C12084a.m32908e().getSystemService("activity")) == null || (deviceConfigurationInfo = activityManager.getDeviceConfigurationInfo()) == null) {
            return null;
        }
        return deviceConfigurationInfo.getGlEsVersion();
    }

    /* renamed from: t */
    public static String m32737t() {
        return Build.HARDWARE;
    }

    /* renamed from: u */
    public static String m32738u() {
        return Build.HOST;
    }

    /* renamed from: v */
    public static String m32739v() {
        String e = C12082a.m32897e("unityads-installinfo", "unityads-idfi");
        if (e != null) {
            return e;
        }
        String S = m32697S();
        C12082a.m32893a("unityads-installinfo", "unityads-idfi", S);
        return S;
    }

    /* renamed from: w */
    public static String m32740w() {
        return Build.MANUFACTURER;
    }

    /* renamed from: x */
    public static String m32741x() {
        return Build.MODEL;
    }

    /* renamed from: y */
    public static String m32742y() {
        return C12084a.m32908e() != null ? ((TelephonyManager) C12084a.m32908e().getSystemService("phone")).getNetworkCountryIso() : "";
    }

    /* renamed from: z */
    public static boolean m32743z() {
        ConnectivityManager connectivityManager;
        if (C12084a.m32908e() == null || Build.VERSION.SDK_INT < 16 || (connectivityManager = (ConnectivityManager) C12084a.m32908e().getSystemService("connectivity")) == null) {
            return false;
        }
        return connectivityManager.isActiveNetworkMetered();
    }

    /* renamed from: a */
    public static String m32710a(String str, String str2) {
        if (str2 != null) {
            return System.getProperty(str, str2);
        }
        return System.getProperty(str);
    }

    /* renamed from: b */
    public static int m32714b(int i) {
        if (C12084a.m32908e() == null) {
            return -1;
        }
        AudioManager audioManager = (AudioManager) C12084a.m32908e().getSystemService("audio");
        if (audioManager != null) {
            return audioManager.getStreamVolume(i);
        }
        return -2;
    }

    /* renamed from: a */
    public static int m32705a(int i) {
        if (C12084a.m32908e() == null) {
            return -1;
        }
        AudioManager audioManager = (AudioManager) C12084a.m32908e().getSystemService("audio");
        if (audioManager != null) {
            return audioManager.getStreamMaxVolume(i);
        }
        return -2;
    }

    /* renamed from: b */
    public static long m32715b(File file) {
        if (file == null || !file.exists()) {
            return -1;
        }
        return (long) Math.round((float) (file.getTotalSpace() / 1024));
    }

    /* renamed from: b */
    private static boolean m32716b(String str) {
        File[] listFiles;
        for (String file : System.getenv("PATH").split(CertificateUtil.DELIMITER)) {
            File file2 = new File(file);
            if (file2.exists() && file2.isDirectory() && (listFiles = file2.listFiles()) != null) {
                for (File name : listFiles) {
                    if (name.getName().equals(str)) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static long m32707a(File file) {
        if (file == null || !file.exists()) {
            return -1;
        }
        return (long) Math.round((float) (file.getFreeSpace() / 1024));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long m32706a(com.unity3d.services.core.device.C12014b.C12016b r6) {
        /*
            java.lang.String r0 = "Error closing RandomAccessFile"
            int[] r1 = com.unity3d.services.core.device.C12014b.C12015a.f29331a
            int r2 = r6.ordinal()
            r1 = r1[r2]
            r2 = 2
            r3 = 1
            if (r1 == r3) goto L_0x0012
            if (r1 == r2) goto L_0x0013
            r2 = -1
            goto L_0x0013
        L_0x0012:
            r2 = r3
        L_0x0013:
            r1 = 0
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x003d }
            java.lang.String r4 = "/proc/meminfo"
            java.lang.String r5 = "r"
            r3.<init>(r4, r5)     // Catch:{ IOException -> 0x003d }
            r4 = 0
        L_0x001e:
            if (r4 >= r2) goto L_0x0027
            java.lang.String r1 = r3.readLine()     // Catch:{ IOException -> 0x0037, all -> 0x0034 }
            int r4 = r4 + 1
            goto L_0x001e
        L_0x0027:
            long r1 = m32708a((java.lang.String) r1)     // Catch:{ IOException -> 0x0037, all -> 0x0034 }
            r3.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x0033
        L_0x002f:
            r6 = move-exception
            com.unity3d.services.core.log.C12065a.m32842a((java.lang.String) r0, (java.lang.Exception) r6)
        L_0x0033:
            return r1
        L_0x0034:
            r6 = move-exception
            r1 = r3
            goto L_0x005d
        L_0x0037:
            r1 = move-exception
            r2 = r1
            r1 = r3
            goto L_0x003e
        L_0x003b:
            r6 = move-exception
            goto L_0x005d
        L_0x003d:
            r2 = move-exception
        L_0x003e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x003b }
            r3.<init>()     // Catch:{ all -> 0x003b }
            java.lang.String r4 = "Error while reading memory info: "
            r3.append(r4)     // Catch:{ all -> 0x003b }
            r3.append(r6)     // Catch:{ all -> 0x003b }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x003b }
            com.unity3d.services.core.log.C12065a.m32842a((java.lang.String) r6, (java.lang.Exception) r2)     // Catch:{ all -> 0x003b }
            r1.close()     // Catch:{ IOException -> 0x0056 }
            goto L_0x005a
        L_0x0056:
            r6 = move-exception
            com.unity3d.services.core.log.C12065a.m32842a((java.lang.String) r0, (java.lang.Exception) r6)
        L_0x005a:
            r0 = -1
            return r0
        L_0x005d:
            r1.close()     // Catch:{ IOException -> 0x0061 }
            goto L_0x0065
        L_0x0061:
            r1 = move-exception
            com.unity3d.services.core.log.C12065a.m32842a((java.lang.String) r0, (java.lang.Exception) r1)
        L_0x0065:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.C12014b.m32706a(com.unity3d.services.core.device.b$b):long");
    }

    /* renamed from: a */
    private static long m32708a(String str) {
        if (str == null) {
            return -1;
        }
        Matcher matcher = Pattern.compile("(\\d+)").matcher(str);
        String str2 = "";
        while (matcher.find()) {
            str2 = matcher.group(1);
        }
        return Long.parseLong(str2);
    }

    /* renamed from: a */
    public static JSONObject m32711a(PackageManager packageManager) throws PackageManager.NameNotFoundException, JSONException {
        String b = C12084a.m32905b();
        PackageInfo packageInfo = packageManager.getPackageInfo(b, 0);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TapjoyConstants.TJC_INSTALLER, packageManager.getInstallerPackageName(b));
        jSONObject.put("firstInstallTime", packageInfo.firstInstallTime);
        jSONObject.put("lastUpdateTime", packageInfo.lastUpdateTime);
        jSONObject.put("versionCode", packageInfo.versionCode);
        jSONObject.put("versionName", packageInfo.versionName);
        jSONObject.put("packageName", packageInfo.packageName);
        return jSONObject;
    }
}
