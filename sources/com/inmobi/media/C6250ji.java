package com.inmobi.media;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import android.telephony.CellInfo;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.inmobi.media.ji */
/* compiled from: CellularInfoUtil */
public class C6250ji {

    /* renamed from: a */
    private static final String f15748a = C6250ji.class.getSimpleName();

    /* renamed from: a */
    private static boolean m18586a(int i, int i2) {
        return (i & i2) == i2;
    }

    /* renamed from: a */
    public static Map<String, String> m18585a(String str) {
        String str2;
        HashMap hashMap = new HashMap();
        Context c = C6183hw.m18324c();
        if (c == null) {
            return hashMap;
        }
        C6246jf.m18571a();
        String m = C6183hw.m18341m();
        C6256jm c2 = C6258jo.m18615c();
        String str3 = null;
        String e = c2 != null ? c2.mo35486e() : null;
        if (!((m == null || C6246jf.m18570a(m).f15438c.f15437oe) && (e == null || c2.mo35484c()) && (!(c2 != null && c2.mo35485d()) || C6246jf.m18570a(e).f15438c.f15437oe))) {
            return hashMap;
        }
        String g = "InMobi".equals(str) ? C6183hw.m18334g() : C6183hw.m18336h();
        C6246jf.m18571a();
        int i = C6246jf.m18570a(g).f15438c.cof;
        boolean a = m18586a(i, 2);
        boolean a2 = m18586a(i, 1);
        C6248jg jgVar = new C6248jg();
        TelephonyManager telephonyManager = (TelephonyManager) c.getSystemService("phone");
        if (!a) {
            int[] b = m18588b(telephonyManager.getNetworkOperator());
            jgVar.f15739a = b[0];
            jgVar.f15740b = b[1];
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (networkCountryIso != null) {
                jgVar.f15743e = networkCountryIso.toLowerCase(Locale.ENGLISH);
            }
        }
        if (!a2) {
            int[] b2 = m18588b(telephonyManager.getSimOperator());
            jgVar.f15741c = b2[0];
            jgVar.f15742d = b2[1];
        }
        if (jgVar.f15741c == -1 && jgVar.f15742d == -1) {
            str2 = null;
        } else {
            str2 = jgVar.f15741c + "_" + jgVar.f15742d;
        }
        hashMap.put("s-ho", str2);
        if (!(jgVar.f15739a == -1 && jgVar.f15740b == -1)) {
            str3 = jgVar.f15739a + "_" + jgVar.f15740b;
        }
        hashMap.put("s-co", str3);
        hashMap.put("s-iso", jgVar.f15743e);
        hashMap.put("s-cn", C6210ik.m18424a(c));
        return hashMap;
    }

    /* renamed from: b */
    private static int[] m18588b(String str) {
        int[] iArr = {-1, -1};
        if (str != null && !"".equals(str)) {
            try {
                int parseInt = Integer.parseInt(str.substring(0, 3));
                int parseInt2 = Integer.parseInt(str.substring(3));
                iArr[0] = parseInt;
                iArr[1] = parseInt2;
            } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            }
        }
        return iArr;
    }

    /* renamed from: c */
    private static boolean m18589c() {
        if (Build.VERSION.SDK_INT < 28) {
            return true;
        }
        LocationManager locationManager = (LocationManager) C6183hw.m18324c().getSystemService(FirebaseAnalytics.Param.LOCATION);
        if (locationManager == null || !locationManager.isLocationEnabled()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m18590d() {
        if (!C6183hw.m18318a()) {
            return false;
        }
        boolean a = C6197ie.m18393a(C6183hw.m18324c(), "android.permission.READ_PHONE_STATE");
        boolean a2 = C6197ie.m18393a(C6183hw.m18324c(), "android.permission.ACCESS_FINE_LOCATION");
        if (Build.VERSION.SDK_INT == 29) {
            return a2;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (!a2 || !a) {
                return false;
            }
            return true;
        } else if (C6197ie.m18393a(C6183hw.m18324c(), "android.permission.ACCESS_COARSE_LOCATION") || a2) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private static int m18583a(TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT >= 30) {
            return telephonyManager.getDataNetworkType();
        }
        return telephonyManager.getNetworkType();
    }

    /* renamed from: a */
    public static Map<String, String> m18584a() {
        Context c;
        List<CellInfo> allCellInfo;
        C6246jf.m18571a();
        String m = C6183hw.m18341m();
        C6256jm c2 = C6258jo.m18615c();
        C6249jh jhVar = null;
        String e = c2 != null ? c2.mo35486e() : null;
        if (((m == null || C6246jf.m18570a(m).f15438c.cce) && (e == null || c2.mo35484c()) && (!(c2 != null && c2.mo35485d()) || C6246jf.m18570a(e).f15438c.cce)) && m18590d() && m18589c() && (c = C6183hw.m18324c()) != null) {
            TelephonyManager telephonyManager = (TelephonyManager) c.getSystemService("phone");
            int[] b = m18588b(telephonyManager.getNetworkOperator());
            String valueOf = String.valueOf(b[0]);
            String valueOf2 = String.valueOf(b[1]);
            if (Build.VERSION.SDK_INT >= 17 && (allCellInfo = telephonyManager.getAllCellInfo()) != null) {
                CellInfo cellInfo = null;
                for (int i = 0; i < allCellInfo.size(); i++) {
                    cellInfo = allCellInfo.get(i);
                    if (cellInfo.isRegistered()) {
                        break;
                    }
                }
                if (cellInfo != null) {
                    jhVar = new C6249jh(cellInfo, valueOf, valueOf2, m18583a(telephonyManager));
                }
            }
            CellLocation cellLocation = telephonyManager.getCellLocation();
            if (!(cellLocation == null || b[0] == -1)) {
                jhVar = new C6249jh();
                if (cellLocation instanceof CdmaCellLocation) {
                    CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) cellLocation;
                    jhVar.f15746b = Integer.MAX_VALUE;
                    jhVar.f15747c = m18583a(telephonyManager);
                    jhVar.f15745a = C6249jh.m18580a(valueOf, cdmaCellLocation.getSystemId(), cdmaCellLocation.getNetworkId(), cdmaCellLocation.getBaseStationId());
                } else {
                    GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                    jhVar.f15746b = Integer.MAX_VALUE;
                    jhVar.f15747c = m18583a(telephonyManager);
                    jhVar.f15745a = C6249jh.m18581a(valueOf, valueOf2, gsmCellLocation.getLac(), gsmCellLocation.getCid(), gsmCellLocation.getPsc(), Integer.MAX_VALUE);
                }
            }
        }
        HashMap hashMap = new HashMap();
        if (jhVar != null) {
            hashMap.put("c-sc", jhVar.mo35479a().toString());
        }
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d8  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map<java.lang.String, java.lang.String> m18587b() {
        /*
            boolean r0 = com.inmobi.media.C6183hw.m18318a()
            r1 = 1
            if (r0 == 0) goto L_0x00c8
            boolean r0 = m18590d()
            if (r0 == 0) goto L_0x00c8
            boolean r0 = m18589c()
            if (r0 == 0) goto L_0x00c8
            com.inmobi.media.C6246jf.m18571a()
            java.lang.String r0 = com.inmobi.media.C6183hw.m18341m()
            com.inmobi.media.jm r2 = com.inmobi.media.C6258jo.m18615c()
            if (r2 == 0) goto L_0x0025
            java.lang.String r3 = r2.mo35486e()
            goto L_0x0026
        L_0x0025:
            r3 = 0
        L_0x0026:
            r4 = 0
            if (r2 == 0) goto L_0x0031
            boolean r5 = r2.mo35485d()
            if (r5 == 0) goto L_0x0031
            r5 = r1
            goto L_0x0032
        L_0x0031:
            r5 = r4
        L_0x0032:
            if (r0 == 0) goto L_0x0041
            com.inmobi.media.gh$b r0 = com.inmobi.media.C6246jf.m18570a(r0)
            com.inmobi.media.gh$a r0 = r0.f15438c
            boolean r0 = r0.vce
            if (r0 == 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r0 = r4
            goto L_0x0042
        L_0x0041:
            r0 = r1
        L_0x0042:
            if (r3 == 0) goto L_0x004d
            boolean r2 = r2.mo35484c()
            if (r2 == 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r2 = r4
            goto L_0x004e
        L_0x004d:
            r2 = r1
        L_0x004e:
            if (r5 == 0) goto L_0x005d
            com.inmobi.media.gh$b r3 = com.inmobi.media.C6246jf.m18570a(r3)
            com.inmobi.media.gh$a r3 = r3.f15438c
            boolean r3 = r3.vce
            if (r3 == 0) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            r3 = r4
            goto L_0x005e
        L_0x005d:
            r3 = r1
        L_0x005e:
            if (r0 == 0) goto L_0x0066
            if (r2 == 0) goto L_0x0066
            if (r3 == 0) goto L_0x0066
            r0 = r1
            goto L_0x0067
        L_0x0066:
            r0 = r4
        L_0x0067:
            if (r0 != 0) goto L_0x006a
            goto L_0x00c8
        L_0x006a:
            android.content.Context r0 = com.inmobi.media.C6183hw.m18324c()
            if (r0 != 0) goto L_0x0076
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto L_0x00cd
        L_0x0076:
            java.lang.String r2 = "phone"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r3 = r0.getNetworkOperator()
            int[] r3 = m18588b(r3)
            r4 = r3[r4]
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r3 = r3[r1]
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 17
            if (r5 < r6) goto L_0x00c6
            java.util.List r5 = r0.getAllCellInfo()
            if (r5 == 0) goto L_0x00c6
            java.util.Iterator r5 = r5.iterator()
        L_0x00a7:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00c6
            java.lang.Object r6 = r5.next()
            android.telephony.CellInfo r6 = (android.telephony.CellInfo) r6
            boolean r7 = r6.isRegistered()
            if (r7 != 0) goto L_0x00a7
            com.inmobi.media.jh r7 = new com.inmobi.media.jh
            int r8 = m18583a((android.telephony.TelephonyManager) r0)
            r7.<init>(r6, r4, r3, r8)
            r2.add(r7)
            goto L_0x00a7
        L_0x00c6:
            r0 = r2
            goto L_0x00cd
        L_0x00c8:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x00cd:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L_0x00f8
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            int r4 = r0.size()
            int r4 = r4 - r1
            java.lang.Object r0 = r0.get(r4)
            com.inmobi.media.jh r0 = (com.inmobi.media.C6249jh) r0
            org.json.JSONObject r0 = r0.mo35479a()
            r3.put(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = "v-sc"
            r2.put(r1, r0)
        L_0x00f8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6250ji.m18587b():java.util.Map");
    }
}
