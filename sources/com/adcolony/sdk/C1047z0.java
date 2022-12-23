package com.adcolony.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import androidx.preference.PreferenceManager;
import com.adcolony.sdk.C0826e0;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.CRC32;
import org.json.JSONException;

/* renamed from: com.adcolony.sdk.z0 */
class C1047z0 {

    /* renamed from: a */
    private static ExecutorService f936a = m1276h();

    /* renamed from: b */
    static Handler f937b;

    /* renamed from: com.adcolony.sdk.z0$a */
    class C1048a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f938a;

        /* renamed from: b */
        final /* synthetic */ String f939b;

        /* renamed from: c */
        final /* synthetic */ int f940c;

        C1048a(Context context, String str, int i) {
            this.f938a = context;
            this.f939b = str;
            this.f940c = i;
        }

        public void run() {
            Toast.makeText(this.f938a, this.f939b, this.f940c).show();
        }
    }

    /* renamed from: com.adcolony.sdk.z0$b */
    interface C1049b extends Runnable {
        /* renamed from: a */
        boolean mo10313a();
    }

    /* renamed from: a */
    static boolean m1247a(ExecutorService executorService, Runnable runnable) {
        try {
            executorService.execute(runnable);
            return true;
        } catch (RejectedExecutionException unused) {
            return false;
        }
    }

    /* renamed from: b */
    static String m1253b(Context context, String str) {
        return m1254b(m1260c(context), str);
    }

    /* renamed from: c */
    static SharedPreferences m1260c(Context context) {
        try {
            Class.forName("androidx.preference.PreferenceManager");
            return PreferenceManager.getDefaultSharedPreferences(context);
        } catch (ClassNotFoundException unused) {
            return context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
        }
    }

    @Deprecated
    /* renamed from: d */
    static int m1265d() {
        Context a = C0723a.m186a();
        if (a == null) {
            return 0;
        }
        try {
            return a.getPackageManager().getPackageInfo(a.getPackageName(), 0).versionCode;
        } catch (Exception unused) {
            new C0826e0.C0827a().mo10746a("Failed to retrieve package info.").mo10747a(C0826e0.f462i);
            return 0;
        }
    }

    /* renamed from: e */
    private static Handler m1268e() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            return null;
        }
        if (f937b == null) {
            f937b = new Handler(mainLooper);
        }
        return f937b;
    }

    /* renamed from: f */
    static int m1272f(String str) {
        try {
            return (int) Long.parseLong(str, 16);
        } catch (NumberFormatException unused) {
            new C0826e0.C0827a().mo10746a("Unable to parse '").mo10746a(str).mo10746a("' as a color.").mo10747a(C0826e0.f460g);
            return ViewCompat.MEASURED_STATE_MASK;
        }
    }

    /* renamed from: g */
    static boolean m1275g() {
        Context a = C0723a.m186a();
        return a != null && Build.VERSION.SDK_INT >= 24 && (a instanceof Activity) && ((Activity) a).isInMultiWindowMode();
    }

    /* renamed from: h */
    static ExecutorService m1276h() {
        return new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    /* renamed from: com.adcolony.sdk.z0$c */
    static class C1050c {

        /* renamed from: a */
        private long f941a;

        /* renamed from: b */
        private long f942b = System.currentTimeMillis();

        C1050c(long j) {
            mo11215a(j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo11215a(long j) {
            this.f941a = j;
            this.f942b = System.currentTimeMillis() + this.f941a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public long mo11217b() {
            return this.f941a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public long mo11218c() {
            return this.f942b - this.f941a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public long mo11219d() {
            long currentTimeMillis = this.f942b - System.currentTimeMillis();
            if (currentTimeMillis <= 0) {
                return 0;
            }
            return currentTimeMillis;
        }

        public String toString() {
            return String.valueOf(((double) mo11219d()) / 1000.0d);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo11216a() {
            return mo11219d() == 0;
        }
    }

    /* renamed from: a */
    static boolean m1243a(Runnable runnable) {
        return m1247a(f936a, runnable);
    }

    /* renamed from: b */
    static String m1254b(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, (String) null);
        } catch (ClassCastException unused) {
            C0826e0.C0827a aVar = new C0826e0.C0827a();
            aVar.mo10746a("Key " + str + " in SharedPreferences ").mo10746a("does not have a String value.").mo10747a(C0826e0.f460g);
            return null;
        }
    }

    /* renamed from: a */
    static int m1228a(Context context, String str) {
        return m1229a(m1260c(context), str);
    }

    /* renamed from: a */
    static int m1229a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            C0826e0.C0827a aVar = new C0826e0.C0827a();
            aVar.mo10746a("Key " + str + " in SharedPreferences ").mo10746a("does not have an int value.").mo10747a(C0826e0.f460g);
            return -1;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:4|5|6) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        return new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", r1).parse(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        return new java.text.SimpleDateFormat("yyyy-MM-dd", r1).parse(r5);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x001c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0021 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.util.Date m1274g(java.lang.String r5) {
        /*
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r2 = "yyyy-MM-dd'T'HH:mmZ"
            r0.<init>(r2, r1)
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.lang.String r3 = "yyyy-MM-dd'T'HH:mm:ssZ"
            r2.<init>(r3, r1)
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            java.lang.String r4 = "yyyy-MM-dd"
            r3.<init>(r4, r1)
            java.util.Date r5 = r0.parse(r5)     // Catch:{ Exception -> 0x001c }
            return r5
        L_0x001c:
            java.util.Date r5 = r2.parse(r5)     // Catch:{ Exception -> 0x0021 }
            return r5
        L_0x0021:
            java.util.Date r5 = r3.parse(r5)     // Catch:{ Exception -> 0x0026 }
            return r5
        L_0x0026:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C1047z0.m1274g(java.lang.String):java.util.Date");
    }

    /* renamed from: c */
    static C0832f1 m1261c(C0832f1 f1Var) {
        f1Var.mo10783a(new String[]{"ads_to_restore"});
        return f1Var;
    }

    /* renamed from: f */
    static int m1271f(Context context) {
        int identifier;
        if (context != null && (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: b */
    static C0832f1 m1251b(C0832f1 f1Var) {
        f1Var.mo10811r("launch_metadata");
        return f1Var;
    }

    /* renamed from: e */
    static boolean m1270e(String str) {
        if (str != null && str.length() <= 128) {
            return true;
        }
        new C0826e0.C0827a().mo10746a("String must be non-null and the max length is 128 characters.").mo10747a(C0826e0.f459f);
        return false;
    }

    /* renamed from: b */
    static String m1252b() {
        Application application;
        Context a = C0723a.m186a();
        if (a == null) {
            return "";
        }
        if (a instanceof Application) {
            application = (Application) a;
        } else {
            application = ((Activity) a).getApplication();
        }
        PackageManager packageManager = application.getPackageManager();
        try {
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(a.getPackageName(), 0)).toString();
        } catch (Exception unused) {
            new C0826e0.C0827a().mo10746a("Failed to retrieve application label.").mo10747a(C0826e0.f462i);
            return "";
        }
    }

    /* renamed from: c */
    static boolean m1264c(String str) {
        Application application;
        Context a = C0723a.m186a();
        if (a == null) {
            return false;
        }
        try {
            if (a instanceof Application) {
                application = (Application) a;
            } else {
                application = ((Activity) a).getApplication();
            }
            application.getPackageManager().getApplicationInfo(str, 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    static C0832f1 m1234a(C0832f1 f1Var) {
        C0832f1 f1Var2 = f1Var;
        f1Var2.mo10783a(new String[]{"data_path", "media_path", "temp_storage_path", "device_api", "display_dpi", "mac_address", "memory_class", "memory_used_mb", DeviceRequestsHelper.DEVICE_INFO_MODEL, "arch", "timezone_ietf", "timezone_gmt_m", "timezone_dst_m", "density", "dark_mode", "launch_metadata"});
        return f1Var2;
    }

    /* renamed from: d */
    static String m1267d(Context context) {
        try {
            return context.getPackageName();
        } catch (Exception unused) {
            return "unknown";
        }
    }

    /* renamed from: f */
    static String m1273f() {
        Context a = C0723a.m186a();
        return (!(a instanceof Activity) || a.getResources().getConfiguration().orientation != 1) ? "landscape" : "portrait";
    }

    /* renamed from: d */
    static int m1266d(String str) {
        str.hashCode();
        if (!str.equals("portrait")) {
            return !str.equals("landscape") ? -1 : 1;
        }
        return 0;
    }

    /* renamed from: e */
    static C0828e1 m1269e(Context context) {
        C0828e1 a = C0773c0.m365a();
        if (context != null) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
                if (packageInfo.requestedPermissions != null) {
                    a = C0773c0.m365a();
                    int i = 0;
                    while (true) {
                        String[] strArr = packageInfo.requestedPermissions;
                        if (i >= strArr.length) {
                            break;
                        }
                        a.mo10754b(strArr[i]);
                        i++;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return a;
    }

    /* renamed from: c */
    static String m1262c() {
        Context a = C0723a.m186a();
        if (a == null) {
            return "1.0";
        }
        try {
            return a.getPackageManager().getPackageInfo(a.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            new C0826e0.C0827a().mo10746a("Failed to retrieve package info.").mo10747a(C0826e0.f462i);
            return "1.0";
        }
    }

    /* renamed from: a */
    static int m1231a(String str) {
        CRC32 crc32 = new CRC32();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            crc32.update(str.charAt(i));
        }
        return (int) crc32.getValue();
    }

    /* renamed from: c */
    static boolean m1263c(Runnable runnable) {
        Handler e;
        if (runnable == null || (e = m1268e()) == null) {
            return false;
        }
        e.removeCallbacks(runnable);
        return true;
    }

    /* renamed from: b */
    static String m1256b(String str) {
        try {
            return C0823d1.m493a(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    static boolean m1259b(Runnable runnable) {
        Handler e;
        if (runnable == null || (e = m1268e()) == null) {
            return false;
        }
        if (e.getLooper() != Looper.myLooper()) {
            return e.post(runnable);
        }
        runnable.run();
        return true;
    }

    /* renamed from: a */
    static String m1235a() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: a */
    static C0828e1 m1233a(int i) {
        C0828e1 a = C0773c0.m365a();
        for (int i2 = 0; i2 < i; i2++) {
            C0773c0.m372a(a, m1235a());
        }
        return a;
    }

    /* renamed from: a */
    static boolean m1244a(Runnable runnable, long j) {
        if (runnable == null) {
            return false;
        }
        if (j <= 0) {
            return m1259b(runnable);
        }
        Handler e = m1268e();
        if (e != null) {
            return e.postDelayed(runnable, j);
        }
        return false;
    }

    /* renamed from: b */
    static boolean m1258b(AudioManager audioManager) {
        if (audioManager == null) {
            new C0826e0.C0827a().mo10746a("isAudioEnabled() called with a null AudioManager").mo10747a(C0826e0.f462i);
            return false;
        }
        try {
            if (audioManager.getStreamVolume(3) > 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            new C0826e0.C0827a().mo10746a("Exception occurred when accessing AudioManager.getStreamVolume: ").mo10746a(e.toString()).mo10747a(C0826e0.f462i);
            return false;
        }
    }

    /* renamed from: a */
    static boolean m1242a(C1049b bVar) {
        Handler e;
        if (bVar == null || (e = m1268e()) == null) {
            return false;
        }
        e.removeCallbacks(bVar);
        if (bVar.mo10313a()) {
            return true;
        }
        if (e.getLooper() == Looper.myLooper()) {
            bVar.run();
            return true;
        }
        e.post(bVar);
        return true;
    }

    /* renamed from: a */
    static double m1227a(AudioManager audioManager) {
        if (audioManager == null) {
            new C0826e0.C0827a().mo10746a("getAudioVolume() called with a null AudioManager").mo10747a(C0826e0.f462i);
            return 0.0d;
        }
        try {
            double streamVolume = (double) audioManager.getStreamVolume(3);
            double streamMaxVolume = (double) audioManager.getStreamMaxVolume(3);
            if (streamMaxVolume == 0.0d) {
                return 0.0d;
            }
            return streamVolume / streamMaxVolume;
        } catch (Exception e) {
            new C0826e0.C0827a().mo10746a("Exception occurred when accessing AudioManager: ").mo10746a(e.toString()).mo10747a(C0826e0.f462i);
            return 0.0d;
        }
    }

    /* renamed from: b */
    static int m1248b(Context context) {
        int i;
        if (context == null) {
            return 0;
        }
        if (context.getResources().getConfiguration().orientation == 1) {
            i = context.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        } else {
            i = context.getResources().getIdentifier("navigation_bar_height_landscape", "dimen", "android");
        }
        if (i > 0) {
            return context.getResources().getDimensionPixelSize(i);
        }
        return 0;
    }

    /* renamed from: b */
    static String m1255b(C0828e1 e1Var) throws JSONException {
        String str = "";
        for (int i = 0; i < e1Var.mo10752b(); i++) {
            if (i > 0) {
                str = str + ",";
            }
            str = str + e1Var.mo10753b(i);
        }
        return str;
    }

    /* renamed from: b */
    static int m1250b(C0992v0 v0Var) {
        boolean z = false;
        try {
            Context a = C0723a.m186a();
            if (a == null) {
                return 0;
            }
            int i = (int) (a.getPackageManager().getPackageInfo(a.getPackageName(), 0).lastUpdateTime / 1000);
            C0832f1 g = v0Var.mo11160g();
            int i2 = 1;
            if (!g.mo10784a("last_update")) {
                i2 = 2;
                z = true;
            } else if (C0773c0.m389d(g, "last_update") != i) {
                z = true;
            } else {
                i2 = 0;
            }
            if (z) {
                try {
                    C0773c0.m383b(g, "last_update", i);
                    v0Var.mo11154a(g);
                } catch (Exception unused) {
                    return i2;
                }
            }
            return i2;
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: a */
    static AudioManager m1232a(Context context) {
        if (context != null) {
            return (AudioManager) context.getSystemService("audio");
        }
        new C0826e0.C0827a().mo10746a("getAudioManager called with a null Context").mo10747a(C0826e0.f462i);
        return null;
    }

    /* renamed from: a */
    static boolean m1246a(String str, File file) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA1");
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[8192];
                while (true) {
                    try {
                        int read = fileInputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        instance.update(bArr, 0, read);
                    } catch (IOException e) {
                        throw new RuntimeException("Unable to process file for MD5", e);
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused) {
                            new C0826e0.C0827a().mo10746a("Exception on closing MD5 input stream").mo10747a(C0826e0.f462i);
                        }
                        throw th;
                    }
                }
                boolean equals = str.equals(String.format("%40s", new Object[]{new BigInteger(1, instance.digest()).toString(16)}).replace(' ', '0'));
                try {
                    fileInputStream.close();
                } catch (IOException unused2) {
                    new C0826e0.C0827a().mo10746a("Exception on closing MD5 input stream").mo10747a(C0826e0.f462i);
                }
                return equals;
            } catch (FileNotFoundException unused3) {
                new C0826e0.C0827a().mo10746a("Exception while getting FileInputStream").mo10747a(C0826e0.f462i);
                return false;
            }
        } catch (NoSuchAlgorithmException unused4) {
            new C0826e0.C0827a().mo10746a("Exception while getting Digest").mo10747a(C0826e0.f462i);
            return false;
        }
    }

    /* renamed from: b */
    static int m1249b(View view) {
        if (view == null) {
            return 0;
        }
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        return (int) (((float) iArr[1]) / C0723a.m193b().mo10905n().mo11058s());
    }

    /* renamed from: b */
    private static void m1257b(Vibrator vibrator, long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            m1238a(vibrator, j);
        } else {
            vibrator.vibrate(j);
        }
    }

    /* renamed from: a */
    static String m1236a(C0828e1 e1Var) throws JSONException {
        String str = "";
        for (int i = 0; i < e1Var.mo10752b(); i++) {
            if (i > 0) {
                str = str + ",";
            }
            switch (e1Var.mo10753b(i)) {
                case 1:
                    str = str + "MO";
                    break;
                case 2:
                    str = str + "TU";
                    break;
                case 3:
                    str = str + "WE";
                    break;
                case 4:
                    str = str + "TH";
                    break;
                case 5:
                    str = str + "FR";
                    break;
                case 6:
                    str = str + "SA";
                    break;
                case 7:
                    str = str + "SU";
                    break;
            }
        }
        return str;
    }

    /* renamed from: a */
    static boolean m1241a(Intent intent, boolean z) {
        try {
            Context a = C0723a.m186a();
            if (a == null) {
                return false;
            }
            if (!(a instanceof Activity)) {
                intent.addFlags(268435456);
            }
            AdColonyInterstitial j = C0723a.m193b().mo10901j();
            if (j != null && j.mo10454i()) {
                j.mo10446e().mo11007f();
            }
            if (z) {
                a.startActivity(Intent.createChooser(intent, "Handle this via..."));
                return true;
            }
            a.startActivity(intent);
            return true;
        } catch (Exception e) {
            new C0826e0.C0827a().mo10746a(e.toString()).mo10747a(C0826e0.f460g);
            return false;
        }
    }

    /* renamed from: a */
    static boolean m1240a(Intent intent) {
        return m1241a(intent, false);
    }

    /* renamed from: a */
    static boolean m1245a(String str, int i) {
        Context a = C0723a.m186a();
        if (a == null) {
            return false;
        }
        m1259b((Runnable) new C1048a(a, str, i));
        return true;
    }

    /* renamed from: a */
    static String m1237a(C0992v0 v0Var) {
        C0832f1 g = v0Var.mo11160g();
        String h = C0773c0.m393h(g, "adc_alt_id");
        if (!h.isEmpty()) {
            return h;
        }
        String a = m1235a();
        C0773c0.m376a(g, "adc_alt_id", a);
        v0Var.mo11154a(g);
        return a;
    }

    /* renamed from: a */
    static int m1230a(View view) {
        if (view == null) {
            return 0;
        }
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        return (int) (((float) iArr[0]) / C0723a.m193b().mo10905n().mo11058s());
    }

    /* renamed from: a */
    static boolean m1239a(Context context, long j) {
        try {
            Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
            if (vibrator == null || !vibrator.hasVibrator()) {
                return false;
            }
            m1257b(vibrator, j);
            return true;
        } catch (Exception unused) {
            new C0826e0.C0827a().mo10746a("Vibrate command failed.").mo10747a(C0826e0.f459f);
            return false;
        }
    }

    /* renamed from: a */
    private static void m1238a(Vibrator vibrator, long j) {
        vibrator.vibrate(VibrationEffect.createOneShot(j, -1));
    }
}
