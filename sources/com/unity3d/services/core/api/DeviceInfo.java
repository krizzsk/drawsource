package com.unity3d.services.core.api;

import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.util.SparseArray;
import com.smaato.sdk.video.vast.model.Verification;
import com.unity3d.services.core.device.C12014b;
import com.unity3d.services.core.device.C12017c;
import com.unity3d.services.core.device.C12018d;
import com.unity3d.services.core.device.C12031k;
import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.properties.C12084a;
import com.unity3d.services.core.webview.C12136a;
import com.unity3d.services.core.webview.C12143b;
import com.unity3d.services.core.webview.bridge.C12160l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DeviceInfo {

    /* renamed from: a */
    private static SparseArray<C12018d> f29103a;

    public enum DeviceInfoEvent {
        VOLUME_CHANGED
    }

    public enum StorageType {
        EXTERNAL,
        INTERNAL
    }

    /* renamed from: com.unity3d.services.core.api.DeviceInfo$a */
    static class C11971a implements C12018d {

        /* renamed from: a */
        private int f29106a;

        /* renamed from: b */
        final /* synthetic */ Integer f29107b;

        C11971a(Integer num) {
            this.f29107b = num;
            this.f29106a = num.intValue();
        }

        /* renamed from: a */
        public void mo71014a(int i) {
            C12136a.m33103c().mo71310a((Enum) C12143b.DEVICEINFO, (Enum) DeviceInfoEvent.VOLUME_CHANGED, Integer.valueOf(mo71013a()), Integer.valueOf(i), Integer.valueOf(C12014b.m32705a(this.f29106a)));
        }

        /* renamed from: a */
        public int mo71013a() {
            return this.f29106a;
        }
    }

    /* renamed from: com.unity3d.services.core.api.DeviceInfo$b */
    static /* synthetic */ class C11972b {

        /* renamed from: a */
        static final /* synthetic */ int[] f29108a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.unity3d.services.core.api.DeviceInfo$StorageType[] r0 = com.unity3d.services.core.api.DeviceInfo.StorageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f29108a = r0
                com.unity3d.services.core.api.DeviceInfo$StorageType r1 = com.unity3d.services.core.api.DeviceInfo.StorageType.INTERNAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29108a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.unity3d.services.core.api.DeviceInfo$StorageType r1 = com.unity3d.services.core.api.DeviceInfo.StorageType.EXTERNAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.api.DeviceInfo.C11972b.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static StorageType m32572a(String str) {
        try {
            return StorageType.valueOf(str);
        } catch (IllegalArgumentException e) {
            C12065a.m32842a("Illegal argument: " + str, (Exception) e);
            return null;
        }
    }

    @WebViewExposed
    public static void getAdvertisingTrackingId(C12160l lVar) {
        lVar.mo71347a(C12014b.m32709a());
    }

    @WebViewExposed
    public static void getApiLevel(C12160l lVar) {
        lVar.mo71347a(Integer.valueOf(C12014b.m32713b()));
    }

    @WebViewExposed
    public static void getApkDigest(C12160l lVar) {
        try {
            lVar.mo71347a(C12014b.m32718c());
        } catch (Exception e) {
            lVar.mo71346a(C12017c.COULDNT_GET_DIGEST, e.toString());
        }
    }

    @WebViewExposed
    public static void getBatteryLevel(C12160l lVar) {
        lVar.mo71347a(Float.valueOf(C12014b.m32720d()));
    }

    @WebViewExposed
    public static void getBatteryStatus(C12160l lVar) {
        lVar.mo71347a(Integer.valueOf(C12014b.m32722e()));
    }

    @WebViewExposed
    public static void getBoard(C12160l lVar) {
        lVar.mo71347a(C12014b.m32723f());
    }

    @WebViewExposed
    public static void getBootloader(C12160l lVar) {
        lVar.mo71347a(C12014b.m32724g());
    }

    @WebViewExposed
    public static void getBrand(C12160l lVar) {
        lVar.mo71347a(C12014b.m32725h());
    }

    @WebViewExposed
    public static void getBuildId(C12160l lVar) {
        lVar.mo71347a(C12014b.m32726i());
    }

    @WebViewExposed
    public static void getBuildVersionIncremental(C12160l lVar) {
        lVar.mo71347a(C12014b.m32727j());
    }

    @WebViewExposed
    public static void getCPUCount(C12160l lVar) {
        lVar.mo71347a(Long.valueOf(C12014b.m32728k()));
    }

    @WebViewExposed
    public static void getCertificateFingerprint(C12160l lVar) {
        String l = C12014b.m32729l();
        if (l != null) {
            lVar.mo71347a(l);
            return;
        }
        lVar.mo71346a(C12017c.COULDNT_GET_FINGERPRINT, new Object[0]);
    }

    @WebViewExposed
    public static void getConnectionType(C12160l lVar) {
        lVar.mo71347a(C12014b.m32730m());
    }

    @WebViewExposed
    public static void getDevice(C12160l lVar) {
        lVar.mo71347a(C12014b.m32731n());
    }

    @WebViewExposed
    public static void getDeviceMaxVolume(Integer num, C12160l lVar) {
        int a = C12014b.m32705a(num.intValue());
        if (a > -1) {
            lVar.mo71347a(Integer.valueOf(a));
        } else if (a == -2) {
            lVar.mo71346a(C12017c.AUDIOMANAGER_NULL, Integer.valueOf(a));
        } else if (a != -1) {
            C12065a.m32848c("Unhandled deviceMaxVolume error: " + a);
        } else {
            lVar.mo71346a(C12017c.APPLICATION_CONTEXT_NULL, Integer.valueOf(a));
        }
    }

    @WebViewExposed
    public static void getDeviceVolume(Integer num, C12160l lVar) {
        int b = C12014b.m32714b(num.intValue());
        if (b > -1) {
            lVar.mo71347a(Integer.valueOf(b));
        } else if (b == -2) {
            lVar.mo71346a(C12017c.AUDIOMANAGER_NULL, Integer.valueOf(b));
        } else if (b != -1) {
            C12065a.m32848c("Unhandled deviceVolume error: " + b);
        } else {
            lVar.mo71346a(C12017c.APPLICATION_CONTEXT_NULL, Integer.valueOf(b));
        }
    }

    @WebViewExposed
    public static void getDisplayMetricDensity(C12160l lVar) {
        lVar.mo71347a(Float.valueOf(C12014b.m32732o()));
    }

    @WebViewExposed
    public static void getElapsedRealtime(C12160l lVar) {
        lVar.mo71347a(Long.valueOf(C12014b.m32733p()));
    }

    @WebViewExposed
    public static void getFingerprint(C12160l lVar) {
        lVar.mo71347a(C12014b.m32734q());
    }

    @WebViewExposed
    public static void getFreeMemory(C12160l lVar) {
        lVar.mo71347a(Long.valueOf(C12014b.m32735r()));
    }

    @WebViewExposed
    public static void getFreeSpace(String str, C12160l lVar) {
        StorageType a = m32572a(str);
        if (a == null) {
            lVar.mo71346a(C12017c.INVALID_STORAGETYPE, str);
            return;
        }
        long a2 = C12014b.m32707a(m32573a(a));
        if (a2 > -1) {
            lVar.mo71347a(Long.valueOf(a2));
            return;
        }
        lVar.mo71346a(C12017c.COULDNT_GET_STORAGE_LOCATION, Long.valueOf(a2));
    }

    @WebViewExposed
    public static void getGLVersion(C12160l lVar) {
        String s = C12014b.m32736s();
        if (s != null) {
            lVar.mo71347a(s);
            return;
        }
        lVar.mo71346a(C12017c.COULDNT_GET_GL_VERSION, new Object[0]);
    }

    @WebViewExposed
    public static void getHardware(C12160l lVar) {
        lVar.mo71347a(C12014b.m32737t());
    }

    @WebViewExposed
    public static void getHeadset(C12160l lVar) {
        lVar.mo71347a(Boolean.valueOf(C12014b.m32717b0()));
    }

    @WebViewExposed
    public static void getHost(C12160l lVar) {
        lVar.mo71347a(C12014b.m32738u());
    }

    @WebViewExposed
    public static void getLimitAdTrackingFlag(C12160l lVar) {
        lVar.mo71347a(Boolean.valueOf(C12014b.m32701W()));
    }

    @WebViewExposed
    public static void getLimitOpenAdTrackingFlag(C12160l lVar) {
        lVar.mo71347a(Boolean.valueOf(C12014b.m32702X()));
    }

    @WebViewExposed
    public static void getManufacturer(C12160l lVar) {
        lVar.mo71347a(C12014b.m32740w());
    }

    @WebViewExposed
    public static void getModel(C12160l lVar) {
        lVar.mo71347a(C12014b.m32741x());
    }

    @WebViewExposed
    public static void getNetworkCountryISO(C12160l lVar) {
        lVar.mo71347a(C12014b.m32742y());
    }

    @WebViewExposed
    public static void getNetworkMetered(C12160l lVar) {
        lVar.mo71347a(Boolean.valueOf(C12014b.m32743z()));
    }

    @WebViewExposed
    public static void getNetworkOperator(C12160l lVar) {
        lVar.mo71347a(C12014b.m32679A());
    }

    @WebViewExposed
    public static void getNetworkOperatorName(C12160l lVar) {
        lVar.mo71347a(C12014b.m32680B());
    }

    @WebViewExposed
    public static void getNetworkType(C12160l lVar) {
        lVar.mo71347a(Integer.valueOf(C12014b.m32681C()));
    }

    @WebViewExposed
    public static void getOpenAdvertisingTrackingId(C12160l lVar) {
        lVar.mo71347a(C12014b.m32684F());
    }

    @WebViewExposed
    public static void getOsVersion(C12160l lVar) {
        lVar.mo71347a(C12014b.m32685G());
    }

    @WebViewExposed
    public static void getPackageInfo(C12160l lVar) {
        if (C12084a.m32908e() != null) {
            String b = C12084a.m32905b();
            try {
                lVar.mo71347a(C12014b.m32711a(C12084a.m32908e().getPackageManager()));
            } catch (PackageManager.NameNotFoundException unused) {
                lVar.mo71346a(C12017c.APPLICATION_INFO_NOT_AVAILABLE, b);
            } catch (JSONException e) {
                lVar.mo71346a(C12017c.JSON_ERROR, e.getMessage());
            }
        } else {
            lVar.mo71346a(C12017c.APPLICATION_CONTEXT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void getProcessInfo(C12160l lVar) {
        JSONObject jSONObject = new JSONObject();
        Map<String, String> H = C12014b.m32686H();
        if (H != null) {
            try {
                if (H.containsKey("stat")) {
                    jSONObject.put("stat", H.get("stat"));
                }
                if (H.containsKey("uptime")) {
                    jSONObject.put("uptime", H.get("uptime"));
                }
            } catch (Exception e) {
                C12065a.m32842a("Error while constructing process info", e);
            }
        }
        lVar.mo71347a(jSONObject);
    }

    @WebViewExposed
    public static void getProduct(C12160l lVar) {
        lVar.mo71347a(C12014b.m32687I());
    }

    @WebViewExposed
    public static void getRingerMode(C12160l lVar) {
        int J = C12014b.m32688J();
        if (J > -1) {
            lVar.mo71347a(Integer.valueOf(J));
        } else if (J == -2) {
            lVar.mo71346a(C12017c.AUDIOMANAGER_NULL, Integer.valueOf(J));
        } else if (J != -1) {
            C12065a.m32848c("Unhandled ringerMode error: " + J);
        } else {
            lVar.mo71346a(C12017c.APPLICATION_CONTEXT_NULL, Integer.valueOf(J));
        }
    }

    @WebViewExposed
    public static void getScreenBrightness(C12160l lVar) {
        int K = C12014b.m32689K();
        if (K > -1) {
            lVar.mo71347a(Integer.valueOf(K));
        } else if (K != -1) {
            C12065a.m32848c("Unhandled screenBrightness error: " + K);
        } else {
            lVar.mo71346a(C12017c.APPLICATION_CONTEXT_NULL, Integer.valueOf(K));
        }
    }

    @WebViewExposed
    public static void getScreenDensity(C12160l lVar) {
        lVar.mo71347a(Integer.valueOf(C12014b.m32690L()));
    }

    @WebViewExposed
    public static void getScreenHeight(C12160l lVar) {
        lVar.mo71347a(Integer.valueOf(C12014b.m32691M()));
    }

    @WebViewExposed
    public static void getScreenLayout(C12160l lVar) {
        lVar.mo71347a(Integer.valueOf(C12014b.m32692N()));
    }

    @WebViewExposed
    public static void getScreenWidth(C12160l lVar) {
        lVar.mo71347a(Integer.valueOf(C12014b.m32693O()));
    }

    @WebViewExposed
    public static void getSensorList(C12160l lVar) {
        JSONArray jSONArray = new JSONArray();
        List<Sensor> P = C12014b.m32694P();
        if (P != null) {
            for (Sensor next : P) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("name", next.getName());
                    jSONObject.put("type", next.getType());
                    jSONObject.put(Verification.VENDOR, next.getVendor());
                    jSONObject.put("maximumRange", (double) next.getMaximumRange());
                    jSONObject.put("power", (double) next.getPower());
                    jSONObject.put("version", next.getVersion());
                    jSONObject.put("resolution", (double) next.getResolution());
                    jSONObject.put("minDelay", next.getMinDelay());
                    jSONArray.put(jSONObject);
                } catch (JSONException e) {
                    lVar.mo71346a(C12017c.JSON_ERROR, e.getMessage());
                    return;
                }
            }
        }
        lVar.mo71347a(jSONArray);
    }

    @WebViewExposed
    public static void getSupportedAbis(C12160l lVar) {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = C12014b.m32695Q().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        lVar.mo71347a(jSONArray);
    }

    @WebViewExposed
    public static void getSystemLanguage(C12160l lVar) {
        lVar.mo71347a(Locale.getDefault().toString());
    }

    @WebViewExposed
    public static void getSystemProperty(String str, String str2, C12160l lVar) {
        lVar.mo71347a(C12014b.m32710a(str, str2));
    }

    @WebViewExposed
    public static void getTimeZone(Boolean bool, C12160l lVar) {
        lVar.mo71347a(TimeZone.getDefault().getDisplayName(bool.booleanValue(), 0, Locale.US));
    }

    @WebViewExposed
    public static void getTimeZoneOffset(C12160l lVar) {
        lVar.mo71347a(Integer.valueOf(TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 1000));
    }

    @WebViewExposed
    public static void getTotalMemory(C12160l lVar) {
        lVar.mo71347a(Long.valueOf(C12014b.m32696R()));
    }

    @WebViewExposed
    public static void getTotalSpace(String str, C12160l lVar) {
        StorageType a = m32572a(str);
        if (a == null) {
            lVar.mo71346a(C12017c.INVALID_STORAGETYPE, str);
            return;
        }
        long b = C12014b.m32715b(m32573a(a));
        if (b > -1) {
            lVar.mo71347a(Long.valueOf(b));
            return;
        }
        lVar.mo71346a(C12017c.COULDNT_GET_STORAGE_LOCATION, Long.valueOf(b));
    }

    @WebViewExposed
    public static void getUniqueEventId(C12160l lVar) {
        lVar.mo71347a(C12014b.m32697S());
    }

    @WebViewExposed
    public static void getUptime(C12160l lVar) {
        lVar.mo71347a(Long.valueOf(C12014b.m32698T()));
    }

    @WebViewExposed
    public static void isAdbEnabled(C12160l lVar) {
        Boolean V = C12014b.m32700V();
        if (V != null) {
            lVar.mo71347a(V);
            return;
        }
        lVar.mo71346a(C12017c.COULDNT_GET_ADB_STATUS, new Object[0]);
    }

    @WebViewExposed
    public static void isRooted(C12160l lVar) {
        lVar.mo71347a(Boolean.valueOf(C12014b.m32703Y()));
    }

    @WebViewExposed
    public static void isUSBConnected(C12160l lVar) {
        lVar.mo71347a(Boolean.valueOf(C12014b.m32704Z()));
    }

    @WebViewExposed
    public static void registerVolumeChangeListener(Integer num, C12160l lVar) {
        if (f29103a == null) {
            f29103a = new SparseArray<>();
        }
        if (f29103a.get(num.intValue()) == null) {
            C11971a aVar = new C11971a(num);
            f29103a.append(num.intValue(), aVar);
            C12031k.m32771a(aVar);
        }
        lVar.mo71347a(new Object[0]);
    }

    @WebViewExposed
    public static void unregisterVolumeChangeListener(Integer num, C12160l lVar) {
        SparseArray<C12018d> sparseArray = f29103a;
        if (!(sparseArray == null || sparseArray.get(num.intValue()) == null)) {
            C12031k.m32773b(f29103a.get(num.intValue()));
            f29103a.remove(num.intValue());
        }
        lVar.mo71347a(new Object[0]);
    }

    /* renamed from: a */
    private static File m32573a(StorageType storageType) {
        int i = C11972b.f29108a[storageType.ordinal()];
        if (i == 1) {
            return C12084a.m32908e().getCacheDir();
        }
        if (i == 2) {
            return C12084a.m32908e().getExternalCacheDir();
        }
        C12065a.m32848c("Unhandled storagetype: " + storageType);
        return null;
    }
}
