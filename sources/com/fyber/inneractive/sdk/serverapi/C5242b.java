package com.fyber.inneractive.sdk.serverapi;

import android.content.Intent;
import android.location.Location;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.amazon.aps.shared.APSAnalytics;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C4251s;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.C5290k;
import com.fyber.inneractive.sdk.util.C5292l;
import com.fyber.inneractive.sdk.util.C5310r;
import com.fyber.inneractive.sdk.util.C5312s;
import com.fyber.inneractive.sdk.util.C5332z;
import com.tapjoy.TapjoyConstants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.serverapi.b */
public class C5242b implements C5243c {

    /* renamed from: d */
    public static final List<Integer> f13903d = Arrays.asList(new Integer[]{5});

    /* renamed from: e */
    public static final List<Integer> f13904e = Arrays.asList(new Integer[]{2, 5});

    /* renamed from: f */
    public static final List<String> f13905f = Arrays.asList(new String[]{"video/mp4", "video/webm", "video/3gpp", "application/x-mpegURL"});

    /* renamed from: a */
    public C4251s f13906a;

    /* renamed from: b */
    public Location f13907b = C5332z.C5333a.f14077a.mo26418a();

    /* renamed from: c */
    public String f13908c = C5290k.m16492j();

    public C5242b(C4251s sVar) {
        this.f13906a = sVar;
    }

    /* renamed from: a */
    public String mo26321a() {
        try {
            return ((TelephonyManager) C5292l.f14015a.getSystemService("phone")).getNetworkOperatorName();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public String mo26325b() {
        int i = C5290k.f14007c;
        return Build.MANUFACTURER + " " + Build.MODEL;
    }

    /* renamed from: c */
    public String mo26326c() {
        if (!mo26337n() || ((double) this.f13907b.getAccuracy()) == 0.0d) {
            return null;
        }
        return String.valueOf(this.f13907b.getAccuracy());
    }

    /* renamed from: d */
    public String mo26327d() {
        if (mo26337n()) {
            return String.valueOf(this.f13907b.getLatitude());
        }
        return null;
    }

    /* renamed from: e */
    public String mo26328e() {
        if (mo26337n()) {
            return String.valueOf(this.f13907b.getLongitude());
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo26329f() {
        /*
            r9 = this;
            boolean r0 = r9.mo26337n()
            if (r0 == 0) goto L_0x005b
            android.location.Location r0 = r9.f13907b
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 17
            r3 = 0
            r5 = 0
            if (r1 >= r2) goto L_0x002a
            long r1 = java.lang.System.currentTimeMillis()
            long r7 = r0.getTime()
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0043
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0043
            long r1 = r1 - r7
            double r0 = (double) r1
            r5 = 4652007308841189376(0x408f400000000000, double:1000.0)
            goto L_0x0041
        L_0x002a:
            long r1 = android.os.SystemClock.elapsedRealtimeNanos()
            long r7 = r0.getElapsedRealtimeNanos()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0043
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0043
            long r1 = r1 - r7
            double r0 = (double) r1
            r5 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
        L_0x0041:
            double r0 = r0 / r5
            goto L_0x0044
        L_0x0043:
            r0 = r3
        L_0x0044:
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x005b
            java.util.Locale r2 = java.util.Locale.ENGLISH
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r1 = 0
            r3[r1] = r0
            java.lang.String r0 = "%.2f"
            java.lang.String r0 = java.lang.String.format(r2, r0, r3)
            return r0
        L_0x005b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.serverapi.C5242b.mo26329f():java.lang.String");
    }

    /* renamed from: g */
    public String mo26330g() {
        if (mo26337n()) {
            Location location = this.f13907b;
            float f = 0.0f;
            if (Build.VERSION.SDK_INT >= 26) {
                f = location.getVerticalAccuracyMeters();
            }
            if (((double) f) != 0.0d) {
                return String.valueOf(f);
            }
        }
        return null;
    }

    /* renamed from: h */
    public String mo26331h() {
        String str = this.f13908c;
        if (str == null) {
            return "";
        }
        return str.substring(0, Math.min(3, str.length()));
    }

    /* renamed from: i */
    public String mo26332i() {
        String str = this.f13908c;
        if (str == null) {
            return "";
        }
        return str.substring(Math.min(3, str.length()));
    }

    /* renamed from: j */
    public String mo26333j() {
        return C5292l.f14015a.getPackageName();
    }

    /* renamed from: k */
    public String mo26334k() {
        try {
            return C5292l.f14015a.getPackageManager().getPackageInfo(C5292l.f14015a.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: l */
    public int mo26335l() {
        return C5292l.m16512c(C5292l.m16514d());
    }

    /* renamed from: m */
    public int mo26336m() {
        return C5292l.m16512c(C5292l.m16516e());
    }

    /* renamed from: n */
    public boolean mo26337n() {
        return this.f13907b != null;
    }

    /* renamed from: o */
    public boolean mo26338o() {
        if ((!C5310r.m16527a()) || IAConfigManager.f10324J.f10352r) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public String mo26323a(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append('-');
        sb.append(APSAnalytics.OS_NAME);
        sb.append('-');
        sb.append("8.1.5");
        if (!TextUtils.isEmpty(InneractiveAdManager.getDevPlatform())) {
            sb.append('-');
            sb.append(InneractiveAdManager.getDevPlatform());
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void mo26324a(Map<String, String> map, String str) {
        String str2;
        HashMap<String, Integer> hashMap = C5240a.f13901a;
        try {
            Class.forName("com.unity3d.player.UnityPlayer");
            str2 = "unity3d";
        } catch (Throwable unused) {
            str2 = "native";
        }
        map.put("frmn", str2);
        map.put("dsk_t", C5312s.m16533a(C5240a.m16404f()));
        map.put("dsk_a", C5312s.m16533a(C5240a.m16402d()));
        map.put("headset", m16413a(C5240a.m16411m()));
        map.put("is_muted", m16413a(C5240a.m16409k()));
        map.put("btry_c", m16413a(C5240a.m16408j()));
        map.put("btry_l", C5240a.m16398a());
        map.put("bt_con", m16413a(C5240a.m16406h()));
        map.put("tod", C5312s.m16533a(C5240a.m16403e()));
        map.put("apnm", m16413a(C5240a.m16405g()));
        map.put("dnd", m16413a(C5240a.m16410l()));
        IAConfigManager iAConfigManager = IAConfigManager.f10324J;
        map.put("lng", iAConfigManager.f10350p);
        String a = iAConfigManager.f10358x.mo24209a(C5240a.m16396a(str), "LAST_DOMAIN_SHOWED");
        if (!TextUtils.isEmpty(a) && a.contains(",")) {
            a = a.split(",")[0];
        }
        map.put("ldomain", a);
        map.put("lbundle", iAConfigManager.f10358x.mo24209a(C5240a.m16396a(str), "LAST_APP_BUNDLE_ID"));
        String a2 = iAConfigManager.f10358x.mo24209a(C5240a.m16396a(str), "LAST_CLICKED");
        String str3 = "";
        if (TextUtils.equals(a2, "0")) {
            a2 = str3;
        }
        map.put("lclick", a2);
        String a3 = iAConfigManager.f10358x.mo24209a(C5240a.m16396a(str), "LAST_VAST_SKIPED");
        if (TextUtils.equals(a3, "0")) {
            a3 = str3;
        }
        map.put("v_lskip", a3);
        UnitDisplayType a4 = C5240a.m16396a(str);
        if (a4.isFullscreenUnit()) {
            str3 = iAConfigManager.f10358x.mo24209a(a4, "LAST_VAST_CLICKED_TYPE");
        }
        map.put("v_lclicktype", str3);
        map.put("sdur", C5312s.m16533a(C5240a.m16400b()));
        map.put(TapjoyConstants.TJC_TOKEN_PARAM_USER_ID, IAConfigManager.m13179e());
        map.put("low_power_mode", m16413a(C5240a.m16412n()));
        map.put("dark_mode", m16413a(C5240a.m16407i()));
        map.put("d_api", String.valueOf(Build.VERSION.SDK_INT));
    }

    /* renamed from: a */
    public static String m16413a(Boolean bool) {
        if (bool == null) {
            return "";
        }
        return bool.booleanValue() ? "1" : "0";
    }

    /* renamed from: a */
    public String mo26322a(Intent intent) {
        return C5240a.m16399a(((float) (intent.getIntExtra("level", -1) * 100)) / ((float) intent.getIntExtra("scale", -1)));
    }
}
