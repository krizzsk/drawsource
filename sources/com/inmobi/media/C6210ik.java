package com.inmobi.media;

import android.app.NotificationManager;
import android.app.usage.StorageStatsManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.provider.Settings;
import android.support.p003v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import androidx.core.util.Pair;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;

/* renamed from: com.inmobi.media.ik */
/* compiled from: DeviceInfo */
public class C6210ik {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static String f15664a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static String f15665b;

    /* renamed from: o */
    private static String m18442o() {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        Context c = C6183hw.m18324c();
        if (c == null || !C6197ie.m18393a(c, "android.permission.ACCESS_NETWORK_STATE") || (connectivityManager = (ConnectivityManager) c.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return "";
        }
        if (Build.VERSION.SDK_INT < 28) {
            int type = activeNetworkInfo.getType();
            int subtype = activeNetworkInfo.getSubtype();
            if (type == 0) {
                return type + "|" + subtype;
            } else if (type != 1) {
                return Integer.toString(type);
            }
        } else {
            NetworkCapabilities networkCapabilities = null;
            try {
                networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            } catch (SecurityException e) {
                C6130gj.m18161a().mo35310a(new C6167hk(e));
            }
            if (networkCapabilities == null) {
                return "";
            }
            if (networkCapabilities.hasTransport(0)) {
                return "0|" + activeNetworkInfo.getSubtype();
            } else if (!networkCapabilities.hasTransport(1)) {
                if (networkCapabilities.hasTransport(2)) {
                    return "7";
                }
                if (networkCapabilities.hasTransport(3)) {
                    return "9";
                }
                if (networkCapabilities.hasTransport(4)) {
                    return "17";
                }
                if (networkCapabilities.hasTransport(5)) {
                    return "10";
                }
                return networkCapabilities.hasTransport(6) ? "11" : "8";
            }
        }
        return "1";
    }

    /* renamed from: a */
    public static String m18424a(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        return telephonyManager != null ? telephonyManager.getNetworkOperatorName() : "";
    }

    /* renamed from: a */
    public static Map<String, String> m18426a(boolean z) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("os-v", Build.VERSION.RELEASE);
            hashMap.put("d-brand-name", Build.BRAND);
            hashMap.put("d-manufacturer-name", Build.MANUFACTURER);
            hashMap.put("d-model-name", Build.MODEL);
            hashMap.put("d-nettype-raw", m18442o());
            hashMap.put("d-localization", Locale.getDefault().toString());
            hashMap.put("d-language", Locale.getDefault().getLanguage());
            hashMap.put("d-media-volume", String.valueOf(m18423a(C6183hw.m18324c(), z)));
        } catch (Exception unused) {
            C6210ik.class.getSimpleName();
        }
        return hashMap;
    }

    /* renamed from: a */
    public static int m18422a() {
        String o = m18442o();
        if (o.startsWith("0")) {
            return 0;
        }
        return o.startsWith("1") ? 1 : 2;
    }

    /* renamed from: b */
    public static String m18428b() {
        int a = m18422a();
        if (a != 0) {
            return a != 1 ? "NIL" : TapjoyConstants.TJC_CONNECTION_TYPE_WIFI;
        }
        return "carrier";
    }

    /* renamed from: b */
    public static int m18427b(Context context) {
        return ((AudioManager) context.getSystemService("audio")).getStreamVolume(3);
    }

    /* renamed from: a */
    public static int m18423a(Context context, boolean z) {
        if (context == null || z) {
            return 0;
        }
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        if (streamMaxVolume != 0) {
            return (streamVolume * 100) / streamMaxVolume;
        }
        C6210ik.class.getSimpleName();
        return 0;
    }

    /* renamed from: c */
    public static Pair<String, String> m18430c() {
        String str;
        Context c = C6183hw.m18324c();
        if (c == null) {
            return null;
        }
        int i = c.getResources().getConfiguration().uiMode & 48;
        if (i == 16) {
            str = "0";
        } else if (i != 32) {
            return null;
        } else {
            str = "1";
        }
        return new Pair<>("d-drk-m", str);
    }

    /* renamed from: d */
    public static Pair<String, String> m18431d() {
        String str;
        ArrayList arrayList = new ArrayList();
        Context c = C6183hw.m18324c();
        if (c == null) {
            return null;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) c.getSystemService("input_method");
        for (InputMethodInfo enabledInputMethodSubtypeList : inputMethodManager.getEnabledInputMethodList()) {
            for (InputMethodSubtype next : inputMethodManager.getEnabledInputMethodSubtypeList(enabledInputMethodSubtypeList, true)) {
                if (next.getMode().equals("keyboard")) {
                    if (Build.VERSION.SDK_INT < 24 || next.getLanguageTag().isEmpty()) {
                        str = new Locale(next.getLocale()).getLanguage();
                    } else {
                        str = Locale.forLanguageTag(next.getLanguageTag()).getLanguage();
                    }
                    if (!str.isEmpty()) {
                        arrayList.add(str);
                    }
                }
            }
        }
        return new Pair<>("d-key-lang", new JSONArray(arrayList).toString());
    }

    /* renamed from: e */
    public static Pair<String, String> m18432e() {
        StringBuilder sb = new StringBuilder();
        sb.append(Build.VERSION.SDK_INT);
        return new Pair<>("d-api-lev", sb.toString());
    }

    /* renamed from: f */
    public static Pair<String, String> m18433f() {
        Intent registerReceiver;
        Context c = C6183hw.m18324c();
        if (c == null || (registerReceiver = c.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null) {
            return null;
        }
        return new Pair<>("d-bat-chrg", registerReceiver.getIntExtra("status", -1) == 2 ? "1" : "0");
    }

    /* renamed from: g */
    public static Pair<String, String> m18434g() {
        if (Build.VERSION.SDK_INT >= 26) {
            C6183hw.m18316a((Runnable) new Runnable() {
                public final void run() {
                    UUID uuid;
                    Context c = C6183hw.m18324c();
                    if (c != null) {
                        StorageStatsManager storageStatsManager = (StorageStatsManager) c.getSystemService("storagestats");
                        long j = 0;
                        for (StorageVolume next : ((StorageManager) c.getSystemService("storage")).getStorageVolumes()) {
                            String uuid2 = next.getUuid();
                            if (uuid2 == null) {
                                uuid = StorageManager.UUID_DEFAULT;
                            } else if (uuid2.length() == 34) {
                                uuid = UUID.fromString(uuid2);
                            }
                            if (next.getState().equals("mounted")) {
                                try {
                                    j += storageStatsManager.getTotalBytes(uuid);
                                } catch (Exception e) {
                                    C6130gj.m18161a().mo35310a(new C6167hk(e));
                                }
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(j / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
                        String unused = C6210ik.f15665b = sb.toString();
                    }
                }
            });
        } else {
            C6183hw.m18316a((Runnable) new Runnable() {
                public final void run() {
                    float f;
                    float f2;
                    try {
                        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
                        StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
                        if (Build.VERSION.SDK_INT >= 18) {
                            f2 = (float) (statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                            f = (float) (statFs2.getBlockCountLong() * statFs2.getBlockSizeLong());
                        } else {
                            f2 = (float) (statFs.getBlockCount() * statFs.getBlockSize());
                            f = (float) (statFs2.getBlockCount() * statFs2.getBlockSize());
                        }
                        float f3 = f + f2;
                        if (Environment.getExternalStorageState().equals("mounted")) {
                            f2 = f3;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(f2 / 1048576.0f);
                        String unused = C6210ik.f15665b = sb.toString();
                    } catch (Exception e) {
                        C6130gj.m18161a().mo35310a(new C6167hk(e));
                    }
                }
            });
        }
        if (f15665b == null) {
            return null;
        }
        return new Pair<>("d-tot-disk", f15665b);
    }

    /* renamed from: h */
    public static Pair<String, String> m18435h() {
        if (Build.VERSION.SDK_INT >= 26) {
            C6183hw.m18316a((Runnable) new Runnable() {
                public final void run() {
                    UUID uuid;
                    Context c = C6183hw.m18324c();
                    if (c != null) {
                        StorageStatsManager storageStatsManager = (StorageStatsManager) c.getSystemService("storagestats");
                        long j = 0;
                        for (StorageVolume next : ((StorageManager) c.getSystemService("storage")).getStorageVolumes()) {
                            String uuid2 = next.getUuid();
                            if (uuid2 == null) {
                                uuid = StorageManager.UUID_DEFAULT;
                            } else if (uuid2.length() == 34) {
                                uuid = UUID.fromString(uuid2);
                            }
                            if (next.getState().equals("mounted")) {
                                try {
                                    j += storageStatsManager.getFreeBytes(uuid);
                                } catch (Exception unused) {
                                }
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(j / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
                        String unused2 = C6210ik.f15664a = sb.toString();
                    }
                }
            });
        } else {
            C6183hw.m18316a((Runnable) new Runnable() {
                public final void run() {
                    long j;
                    long j2;
                    try {
                        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
                        StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
                        if (Build.VERSION.SDK_INT >= 18) {
                            j = statFs.getAvailableBytes();
                            j2 = statFs2.getAvailableBytes();
                        } else {
                            j = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
                            j2 = ((long) statFs2.getBlockSize()) * ((long) statFs2.getAvailableBlocks());
                        }
                        long j3 = j2 + j;
                        if (Environment.getExternalStorageState().equals("mounted")) {
                            j = j3;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(j / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
                        String unused = C6210ik.f15664a = sb.toString();
                    } catch (Exception e) {
                        C6130gj.m18161a().mo35310a(new C6167hk(e));
                    }
                }
            });
        }
        if (f15664a == null) {
            return null;
        }
        return new Pair<>("d-av-disk", f15664a);
    }

    /* renamed from: i */
    public static Pair<String, String> m18436i() {
        Context c = C6183hw.m18324c();
        if (c == null) {
            return null;
        }
        Intent registerReceiver = c.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.HEADSET_PLUG"));
        if (registerReceiver == null) {
            return new Pair<>("d-w-h", "0");
        }
        boolean z = false;
        if (registerReceiver.getIntExtra("state", 0) == 1) {
            z = true;
        }
        if (z) {
            return new Pair<>("d-w-h", "1");
        }
        return new Pair<>("d-w-h", "0");
    }

    /* renamed from: j */
    public static Pair<String, String> m18437j() {
        Intent registerReceiver;
        Context c = C6183hw.m18324c();
        if (c == null || (registerReceiver = c.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null) {
            return null;
        }
        return new Pair<>("d-bat-lev", String.valueOf((int) (((float) (registerReceiver.getIntExtra("level", -1) * 100)) / ((float) registerReceiver.getIntExtra("scale", -1)))));
    }

    /* renamed from: k */
    public static Pair<String, String> m18438k() {
        Context c = C6183hw.m18324c();
        if (c == null) {
            return null;
        }
        PowerManager powerManager = (PowerManager) c.getSystemService("power");
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        if (powerManager.isPowerSaveMode()) {
            return new Pair<>("d-bat-sav", "1");
        }
        return new Pair<>("d-bat-sav", "0");
    }

    /* renamed from: l */
    public static Pair<String, String> m18439l() {
        Context c = C6183hw.m18324c();
        if (c == null) {
            return null;
        }
        boolean z = true;
        if (Build.VERSION.SDK_INT < 17 ? Settings.System.getInt(c.getContentResolver(), "airplane_mode_on", 0) == 0 : Settings.Global.getInt(c.getContentResolver(), "airplane_mode_on", 0) == 0) {
            z = false;
        }
        if (z) {
            return new Pair<>("d-airplane-m", "1");
        }
        return new Pair<>("d-airplane-m", "0");
    }

    /* renamed from: m */
    public static Pair<String, String> m18440m() {
        Context c = C6183hw.m18324c();
        if (c == null) {
            return null;
        }
        NotificationManager notificationManager = (NotificationManager) c.getSystemService("notification");
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                int currentInterruptionFilter = notificationManager.getCurrentInterruptionFilter();
                return new Pair<>("d-dnd", (currentInterruptionFilter == 2 || currentInterruptionFilter == 3 || currentInterruptionFilter == 4) ? "1" : "0");
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: n */
    public static void m18441n() {
        m18435h();
        m18434g();
    }
}
