package com.unity3d.services.core.device.reader;

import android.webkit.WebSettings;
import com.adjust.sdk.Constants;
import com.tapjoy.TapjoyConstants;
import com.unity3d.services.core.device.C12014b;
import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.properties.C12084a;
import com.unity3d.services.core.properties.C12088d;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: com.unity3d.services.core.device.reader.d */
/* compiled from: DeviceInfoReaderExtended */
public class C12036d implements C12049p {

    /* renamed from: a */
    private final C12049p f29386a;

    public C12036d(C12049p pVar) {
        this.f29386a = pVar;
    }

    /* renamed from: a */
    public Map<String, Object> mo71178a() {
        Map<String, Object> a = this.f29386a.mo71178a();
        a.put("bundleId", C12084a.m32905b());
        a.put("encrypted", Boolean.valueOf(C12084a.m32910g()));
        a.put("rooted", Boolean.valueOf(C12014b.m32703Y()));
        a.put("osVersion", C12014b.m32685G());
        a.put("deviceModel", C12014b.m32741x());
        a.put("language", Locale.getDefault().toString());
        a.put("connectionType", C12014b.m32730m());
        a.put("screenHeight", Integer.valueOf(C12014b.m32691M()));
        a.put("screenWidth", Integer.valueOf(C12014b.m32693O()));
        a.put("deviceMake", C12014b.m32740w());
        a.put("screenDensity", Integer.valueOf(C12014b.m32690L()));
        a.put("screenSize", Integer.valueOf(C12014b.m32692N()));
        a.put("limitAdTracking", Boolean.valueOf(C12014b.m32701W()));
        a.put("networkOperator", C12014b.m32679A());
        a.put(TapjoyConstants.TJC_VOLUME, Integer.valueOf(C12014b.m32714b(1)));
        a.put("deviceFreeSpace", Long.valueOf(C12014b.m32707a(C12084a.m32908e().getCacheDir())));
        a.put("apiLevel", String.valueOf(C12014b.m32713b()));
        a.put("networkType", Integer.valueOf(C12014b.m32681C()));
        a.put("bundleVersion", C12084a.m32906c());
        a.put("timeZone", TimeZone.getDefault().getDisplayName(false, 0, Locale.US));
        a.put("timeZoneOffset", Integer.valueOf(TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 1000));
        a.put("webviewUa", WebSettings.getDefaultUserAgent(C12084a.m32908e()));
        a.put("networkOperatorName", C12014b.m32680B());
        a.put("wiredHeadset", Boolean.valueOf(C12014b.m32717b0()));
        a.put("versionCode", Integer.valueOf(C12088d.m32941n()));
        a.put("stores", Constants.REFERRER_API_GOOGLE);
        a.put("appStartTime", Long.valueOf(C12088d.m32936i() / 1000));
        a.put("sdkVersionName", C12088d.m32942o());
        a.put("eventTimeStamp", Long.valueOf(System.currentTimeMillis() / 1000));
        a.put("cpuCount", Long.valueOf(C12014b.m32728k()));
        a.put("usbConnected", Boolean.valueOf(C12014b.m32704Z()));
        try {
            a.put("apkHash", C12014b.m32718c());
        } catch (Exception unused) {
            C12065a.m32848c("Could not get APK Digest");
        }
        a.put("apkDeveloperSigningCertificateHash", C12014b.m32729l());
        a.put("deviceUpTime", Long.valueOf(C12014b.m32698T()));
        a.put("deviceElapsedRealtime", Long.valueOf(C12014b.m32733p()));
        a.put("adbEnabled", C12014b.m32700V());
        a.put("androidFingerprint", C12014b.m32734q());
        a.put("batteryStatus", Integer.valueOf(C12014b.m32722e()));
        a.put("batteryLevel", Float.valueOf(C12014b.m32720d()));
        a.put("networkMetered", Boolean.valueOf(C12014b.m32743z()));
        a.put("test", Boolean.valueOf(C12088d.m32946s()));
        a.put("callType", "token");
        return a;
    }
}
