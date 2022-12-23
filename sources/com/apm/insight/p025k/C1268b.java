package com.apm.insight.p025k;

import android.content.Context;
import android.text.TextUtils;
import com.apm.insight.C1186b;
import com.apm.insight.C1250h;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.entity.C1227a;
import com.apm.insight.entity.C1228b;
import com.apm.insight.entity.C1232e;
import com.apm.insight.nativecrash.C1333b;
import com.apm.insight.nativecrash.C1340c;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.p013a.C1182a;
import com.apm.insight.p015c.C1216a;
import com.apm.insight.p017e.C1222a;
import com.apm.insight.p021g.C1241a;
import com.apm.insight.p025k.C1275c;
import com.apm.insight.p026l.C1295a;
import com.apm.insight.p026l.C1308i;
import com.apm.insight.p026l.C1318o;
import com.apm.insight.p026l.C1319p;
import com.apm.insight.runtime.C1351a;
import com.apm.insight.runtime.C1370b;
import com.apm.insight.runtime.C1380h;
import com.apm.insight.runtime.C1394p;
import com.apm.insight.runtime.C1399s;
import com.ogury.p377ed.OguryAdFormatErrorCode;
import com.smaato.sdk.core.injections.CoreLightModuleInterface;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.apm.insight.k.b */
public final class C1268b {

    /* renamed from: d */
    private static volatile C1268b f1221d;

    /* renamed from: a */
    List<File> f1222a = new ArrayList();

    /* renamed from: b */
    List<File> f1223b = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Context f1224c;

    /* renamed from: e */
    private int f1225e = -1;

    /* renamed from: f */
    private C1274b f1226f;

    /* renamed from: g */
    private HashMap<String, C1274b> f1227g;

    /* renamed from: h */
    private volatile boolean f1228h = false;

    /* renamed from: i */
    private Runnable f1229i = new Runnable() {
        public void run() {
            C1268b.this.m1692g();
        }
    };

    /* renamed from: j */
    private Runnable f1230j = new Runnable() {
        public void run() {
            C1268b.this.m1690e();
        }
    };

    /* renamed from: com.apm.insight.k.b$a */
    static class C1273a {

        /* renamed from: a */
        File f1240a;

        /* renamed from: b */
        long f1241b = -1;

        /* renamed from: c */
        long f1242c = -1;

        /* renamed from: d */
        CrashType f1243d;

        /* renamed from: e */
        String f1244e;

        C1273a(File file, long j, CrashType crashType) {
            this.f1240a = file;
            this.f1241b = j;
            this.f1243d = crashType;
            this.f1244e = file.getName();
        }

        C1273a(File file, CrashType crashType) {
            this.f1240a = file;
            this.f1243d = crashType;
            this.f1244e = file.getName();
        }
    }

    /* renamed from: com.apm.insight.k.b$b */
    static class C1274b {

        /* renamed from: a */
        String f1245a;

        /* renamed from: b */
        List<C1273a> f1246b = new ArrayList();

        /* renamed from: c */
        List<C1273a> f1247c = new ArrayList();

        /* renamed from: d */
        C1273a f1248d;

        /* renamed from: e */
        C1273a f1249e;

        /* renamed from: f */
        boolean f1250f = false;

        /* renamed from: g */
        int f1251g = 0;

        C1274b(String str) {
            this.f1245a = str;
        }
    }

    private C1268b(Context context) {
        this.f1224c = context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:54|55) */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r13.put("lastAliveTime", "unknown");
        com.apm.insight.entity.C1227a.m1466a(r13, "filters", "lastAliveTime", "unknown");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x0168 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.apm.insight.entity.C1232e m1673a(java.io.File r20, com.apm.insight.CrashType r21, java.lang.String r22, long r23, long r25) {
        /*
            r19 = this;
            r1 = r19
            r0 = r21
            r2 = r23
            java.lang.String r4 = "data"
            java.lang.String r5 = "unauthentic_version"
            java.lang.String r6 = "unknown"
            java.lang.String r7 = "true"
            java.lang.String r8 = "has_dump"
            java.lang.String r9 = "logcat"
            java.lang.String r10 = "header"
            java.lang.String r11 = "lastAliveTime"
            java.lang.String r12 = "filters"
            boolean r14 = r20.isFile()     // Catch:{ all -> 0x01da }
            if (r14 == 0) goto L_0x0028
            com.apm.insight.p026l.C1308i.m1834a((java.io.File) r20)     // Catch:{ all -> 0x0024 }
            r13 = 0
            goto L_0x01e9
        L_0x0024:
            r0 = move-exception
        L_0x0025:
            r13 = 0
            goto L_0x01dd
        L_0x0028:
            com.apm.insight.CrashType r14 = com.apm.insight.CrashType.LAUNCH     // Catch:{ all -> 0x01da }
            if (r0 != r14) goto L_0x002e
            r14 = 1
            goto L_0x002f
        L_0x002e:
            r14 = 0
        L_0x002f:
            if (r0 != 0) goto L_0x0049
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0045 }
            java.lang.String r2 = r20.getName()     // Catch:{ all -> 0x0045 }
            r3 = r20
            r0.<init>(r3, r2)     // Catch:{ all -> 0x0024 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x0024 }
            com.apm.insight.entity.e r0 = com.apm.insight.p026l.C1308i.m1845d((java.lang.String) r0)     // Catch:{ all -> 0x0024 }
            return r0
        L_0x0045:
            r0 = move-exception
            r3 = r20
            goto L_0x0025
        L_0x0049:
            com.apm.insight.entity.e r15 = com.apm.insight.p026l.C1308i.m1818a((java.io.File) r20, (com.apm.insight.CrashType) r21)     // Catch:{ all -> 0x01da }
            org.json.JSONObject r13 = r15.mo12495b()     // Catch:{ all -> 0x01d7 }
            org.json.JSONObject r17 = r15.mo12495b()     // Catch:{ all -> 0x01d7 }
            if (r17 == 0) goto L_0x01d2
            r17 = r4
            com.apm.insight.CrashType r4 = com.apm.insight.CrashType.ANR     // Catch:{ all -> 0x01d7 }
            if (r0 != r4) goto L_0x005e
            return r15
        L_0x005e:
            java.lang.String r0 = "crash_time"
            r13.put(r0, r2)     // Catch:{ all -> 0x01d7 }
            java.lang.String r0 = "app_start_time"
            r18 = r5
            r4 = r25
            r13.put(r0, r4)     // Catch:{ all -> 0x01d7 }
            org.json.JSONObject r0 = r13.optJSONObject(r10)     // Catch:{ all -> 0x01d7 }
            if (r0 != 0) goto L_0x007d
            android.content.Context r0 = r1.f1224c     // Catch:{ all -> 0x01d7 }
            com.apm.insight.entity.Header r0 = com.apm.insight.entity.Header.m1441a(r0, r2)     // Catch:{ all -> 0x01d7 }
            org.json.JSONObject r0 = r0.mo12464f()     // Catch:{ all -> 0x01d7 }
            goto L_0x0082
        L_0x007d:
            if (r14 == 0) goto L_0x0082
            r13.remove(r10)     // Catch:{ all -> 0x01d7 }
        L_0x0082:
            java.lang.String r4 = "sdk_version_name"
            r5 = 0
            java.lang.String r4 = r0.optString(r4, r5)     // Catch:{ all -> 0x01d7 }
            java.lang.String r5 = "sdk_version"
            if (r4 != 0) goto L_0x008f
            java.lang.String r4 = "1.3.8.nourl-alpha.0"
        L_0x008f:
            com.apm.insight.entity.C1227a.m1466a((org.json.JSONObject) r13, (java.lang.String) r12, (java.lang.String) r5, (java.lang.String) r4)     // Catch:{ all -> 0x01d7 }
            org.json.JSONArray r4 = r13.optJSONArray(r9)     // Catch:{ all -> 0x01d7 }
            boolean r4 = com.apm.insight.p026l.C1308i.m1836a((org.json.JSONArray) r4)     // Catch:{ all -> 0x01d7 }
            if (r4 == 0) goto L_0x00a3
            org.json.JSONArray r4 = com.apm.insight.runtime.C1384k.m2261b(r22)     // Catch:{ all -> 0x01d7 }
            r13.put(r9, r4)     // Catch:{ all -> 0x01d7 }
        L_0x00a3:
            com.apm.insight.entity.C1227a.m1466a((org.json.JSONObject) r13, (java.lang.String) r12, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x01d7 }
            java.lang.String r4 = "has_logcat"
            boolean r5 = com.apm.insight.p026l.C1311l.m1862a((org.json.JSONObject) r13, (java.lang.String) r9)     // Catch:{ all -> 0x01d7 }
            if (r5 != 0) goto L_0x00b1
            r16 = 1
            goto L_0x00b3
        L_0x00b1:
            r16 = 0
        L_0x00b3:
            java.lang.String r5 = java.lang.String.valueOf(r16)     // Catch:{ all -> 0x01d7 }
            com.apm.insight.entity.C1227a.m1466a((org.json.JSONObject) r13, (java.lang.String) r12, (java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x01d7 }
            java.lang.String r4 = "memory_leak"
            boolean r5 = com.apm.insight.entity.C1227a.m1472b((java.lang.String) r22)     // Catch:{ all -> 0x01d7 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x01d7 }
            com.apm.insight.entity.C1227a.m1466a((org.json.JSONObject) r13, (java.lang.String) r12, (java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x01d7 }
            java.lang.String r4 = "fd_leak"
            boolean r5 = com.apm.insight.entity.C1227a.m1473c((java.lang.String) r22)     // Catch:{ all -> 0x01d7 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x01d7 }
            com.apm.insight.entity.C1227a.m1466a((org.json.JSONObject) r13, (java.lang.String) r12, (java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x01d7 }
            java.lang.String r4 = "threads_leak"
            boolean r5 = com.apm.insight.entity.C1227a.m1474d(r22)     // Catch:{ all -> 0x01d7 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x01d7 }
            com.apm.insight.entity.C1227a.m1466a((org.json.JSONObject) r13, (java.lang.String) r12, (java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x01d7 }
            java.lang.String r4 = "is_64_devices"
            boolean r5 = com.apm.insight.entity.Header.m1443a()     // Catch:{ all -> 0x01d7 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x01d7 }
            com.apm.insight.entity.C1227a.m1466a((org.json.JSONObject) r13, (java.lang.String) r12, (java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x01d7 }
            java.lang.String r4 = "is_64_runtime"
            boolean r5 = com.apm.insight.nativecrash.NativeImpl.m2022e()     // Catch:{ all -> 0x01d7 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x01d7 }
            com.apm.insight.entity.C1227a.m1466a((org.json.JSONObject) r13, (java.lang.String) r12, (java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x01d7 }
            java.lang.String r4 = "is_x86_devices"
            boolean r5 = com.apm.insight.entity.Header.m1446b()     // Catch:{ all -> 0x01d7 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x01d7 }
            com.apm.insight.entity.C1227a.m1466a((org.json.JSONObject) r13, (java.lang.String) r12, (java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x01d7 }
            java.lang.String r4 = "has_meminfo_file"
            boolean r5 = com.apm.insight.entity.C1227a.m1470a((java.lang.String) r22)     // Catch:{ all -> 0x01d7 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x01d7 }
            com.apm.insight.entity.C1227a.m1466a((org.json.JSONObject) r13, (java.lang.String) r12, (java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x01d7 }
            java.lang.String r4 = "is_root"
            boolean r5 = com.apm.insight.nativecrash.C1333b.m2049m()     // Catch:{ all -> 0x01d7 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x01d7 }
            com.apm.insight.entity.C1227a.m1466a((org.json.JSONObject) r13, (java.lang.String) r12, (java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x01d7 }
            java.lang.String r4 = "launch_did"
            android.content.Context r5 = r1.f1224c     // Catch:{ all -> 0x01d7 }
            java.lang.String r5 = com.apm.insight.p023i.C1257a.m1646a(r5)     // Catch:{ all -> 0x01d7 }
            r13.put(r4, r5)     // Catch:{ all -> 0x01d7 }
            java.lang.String r4 = "crash_uuid"
            java.lang.String r5 = r20.getName()     // Catch:{ all -> 0x01d7 }
            r13.put(r4, r5)     // Catch:{ all -> 0x01d7 }
            java.lang.String r4 = "jiffy"
            r16 = r10
            long r9 = com.apm.insight.runtime.C1395q.C1396a.m2324a()     // Catch:{ all -> 0x01d7 }
            r13.put(r4, r9)     // Catch:{ all -> 0x01d7 }
            r4 = r22
            java.lang.String r4 = com.apm.insight.runtime.C1370b.m2212a(r2, r4)     // Catch:{ all -> 0x0168 }
            long r4 = java.lang.Long.parseLong(r4)     // Catch:{ all -> 0x0168 }
            long r2 = r4 - r2
            long r2 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x0168 }
            r9 = 60000(0xea60, double:2.9644E-319)
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x015b
            java.lang.String r2 = "< 60s"
            goto L_0x015d
        L_0x015b:
            java.lang.String r2 = "> 60s"
        L_0x015d:
            com.apm.insight.entity.C1227a.m1466a((org.json.JSONObject) r13, (java.lang.String) r12, (java.lang.String) r11, (java.lang.String) r2)     // Catch:{ all -> 0x0168 }
            java.lang.String r2 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0168 }
            r13.put(r11, r2)     // Catch:{ all -> 0x0168 }
            goto L_0x016e
        L_0x0168:
            r13.put(r11, r6)     // Catch:{ all -> 0x01d7 }
            com.apm.insight.entity.C1227a.m1466a((org.json.JSONObject) r13, (java.lang.String) r12, (java.lang.String) r11, (java.lang.String) r6)     // Catch:{ all -> 0x01d7 }
        L_0x016e:
            r13.put(r8, r7)     // Catch:{ all -> 0x01d7 }
            java.lang.String r2 = "storage"
            java.lang.Object r2 = r13.opt(r2)     // Catch:{ all -> 0x01d7 }
            if (r2 != 0) goto L_0x0184
            android.content.Context r2 = com.apm.insight.C1250h.m1615g()     // Catch:{ all -> 0x01d7 }
            org.json.JSONObject r2 = com.apm.insight.p026l.C1328w.m1985a((android.content.Context) r2)     // Catch:{ all -> 0x01d7 }
            com.apm.insight.entity.C1227a.m1469a((org.json.JSONObject) r13, (org.json.JSONObject) r2)     // Catch:{ all -> 0x01d7 }
        L_0x0184:
            boolean r2 = com.apm.insight.entity.Header.m1447b((org.json.JSONObject) r0)     // Catch:{ all -> 0x01d7 }
            if (r2 == 0) goto L_0x018f
            r2 = r18
            com.apm.insight.entity.C1227a.m1466a((org.json.JSONObject) r13, (java.lang.String) r12, (java.lang.String) r2, (java.lang.String) r2)     // Catch:{ all -> 0x01d7 }
        L_0x018f:
            com.apm.insight.entity.C1231d.m1516b(r13)     // Catch:{ all -> 0x01d7 }
            org.json.JSONObject r2 = r15.mo12495b()     // Catch:{ all -> 0x01d7 }
            java.lang.String r3 = "upload_scene"
            java.lang.String r4 = "launch_scan"
            r2.put(r3, r4)     // Catch:{ all -> 0x01d7 }
            if (r14 == 0) goto L_0x01cb
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x01d7 }
            r2.<init>()     // Catch:{ all -> 0x01d7 }
            java.lang.String r3 = "event_type"
            java.lang.String r4 = "start_crash"
            r13.put(r3, r4)     // Catch:{ all -> 0x01d7 }
            java.lang.String r3 = "stack"
            r4 = r17
            java.lang.Object r5 = r13.remove(r4)     // Catch:{ all -> 0x01d7 }
            r13.put(r3, r5)     // Catch:{ all -> 0x01d7 }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ all -> 0x01d7 }
            r3.<init>()     // Catch:{ all -> 0x01d7 }
            org.json.JSONArray r3 = r3.put(r13)     // Catch:{ all -> 0x01d7 }
            r2.put(r4, r3)     // Catch:{ all -> 0x01d7 }
            r3 = r16
            r2.put(r3, r0)     // Catch:{ all -> 0x01d7 }
            r15.mo12493a((org.json.JSONObject) r2)     // Catch:{ all -> 0x01d7 }
            goto L_0x01d5
        L_0x01cb:
            java.lang.String r0 = "isJava"
            r2 = 1
            r13.put(r0, r2)     // Catch:{ all -> 0x01d7 }
            goto L_0x01d5
        L_0x01d2:
            com.apm.insight.p026l.C1308i.m1834a((java.io.File) r20)     // Catch:{ all -> 0x01d7 }
        L_0x01d5:
            r13 = r15
            goto L_0x01e9
        L_0x01d7:
            r0 = move-exception
            r13 = r15
            goto L_0x01dd
        L_0x01da:
            r0 = move-exception
            r5 = 0
            r13 = r5
        L_0x01dd:
            com.apm.insight.p026l.C1308i.m1834a((java.io.File) r20)
            com.apm.insight.c r2 = com.apm.insight.C1186b.m1306a()
            java.lang.String r3 = "NPTH_CATCH"
            r2.mo12441a((java.lang.String) r3, (java.lang.Throwable) r0)
        L_0x01e9:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p025k.C1268b.m1673a(java.io.File, com.apm.insight.CrashType, java.lang.String, long, long):com.apm.insight.entity.e");
    }

    /* renamed from: a */
    public static C1268b m1674a() {
        if (f1221d == null) {
            synchronized (C1268b.class) {
                if (f1221d == null) {
                    f1221d = new C1268b(C1250h.m1615g());
                }
            }
        }
        return f1221d;
    }

    /* renamed from: a */
    private JSONObject m1675a(C1333b bVar) {
        JSONObject d = bVar.mo12606d();
        if (d != null && d.length() != 0) {
            return d;
        }
        if (C1250h.m1612d()) {
            bVar.mo12613l();
        }
        if (!bVar.mo12605c()) {
            bVar.mo12612k();
            return null;
        } else if (!bVar.mo12608f()) {
            bVar.mo12612k();
            return null;
        } else if (bVar.mo12609g()) {
            bVar.mo12612k();
            return null;
        } else {
            bVar.mo12607e();
            return bVar.mo12611j();
        }
    }

    /* renamed from: a */
    private void m1676a(C1274b bVar) {
        C1308i.m1834a(C1318o.m1888a(this.f1224c, bVar.f1245a));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c9, code lost:
        if (r1.f1249e == r7) goto L_0x00cb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5 A[SYNTHETIC, Splitter:B:34:0x00a5] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x014c A[Catch:{ all -> 0x0161 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1677a(com.apm.insight.p025k.C1268b.C1274b r21, boolean r22, com.apm.insight.runtime.C1380h r23) {
        /*
            r20 = this;
            r1 = r21
            r2 = r23
            java.lang.String r3 = "crash_thread_name"
            java.lang.String r4 = "NPTH_CATCH"
            java.lang.String r5 = "aid"
            java.util.List<com.apm.insight.k.b$a> r0 = r1.f1246b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0013
            return
        L_0x0013:
            com.apm.insight.k.b$a r0 = r1.f1249e
            if (r0 != 0) goto L_0x001b
            com.apm.insight.k.b$a r0 = r1.f1248d
            r1.f1249e = r0
        L_0x001b:
            java.util.List<com.apm.insight.k.b$a> r0 = r1.f1246b
            java.util.Iterator r6 = r0.iterator()
        L_0x0021:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x017d
            java.lang.Object r0 = r6.next()
            r7 = r0
            com.apm.insight.k.b$a r7 = (com.apm.insight.p025k.C1268b.C1273a) r7
            java.io.File r14 = r7.f1240a     // Catch:{ all -> 0x0168 }
            com.apm.insight.CrashType r15 = r7.f1243d     // Catch:{ all -> 0x0168 }
            java.lang.String r11 = r1.f1245a     // Catch:{ all -> 0x0168 }
            long r12 = r7.f1241b     // Catch:{ all -> 0x0168 }
            long r9 = r7.f1242c     // Catch:{ all -> 0x0168 }
            r8 = r20
            r16 = r9
            r9 = r14
            r10 = r15
            r19 = r6
            r18 = r14
            r6 = r15
            r14 = r16
            com.apm.insight.entity.e r8 = r8.m1673a(r9, r10, r11, r12, r14)     // Catch:{ all -> 0x0166 }
            if (r8 != 0) goto L_0x0050
        L_0x004b:
            com.apm.insight.p026l.C1308i.m1834a((java.io.File) r18)     // Catch:{ all -> 0x0166 }
            goto L_0x0179
        L_0x0050:
            org.json.JSONObject r9 = r8.mo12495b()     // Catch:{ all -> 0x0166 }
            if (r9 != 0) goto L_0x0057
            goto L_0x004b
        L_0x0057:
            java.lang.String r0 = "header"
            org.json.JSONObject r0 = r9.optJSONObject(r0)     // Catch:{ all -> 0x0166 }
            if (r0 != 0) goto L_0x0060
            goto L_0x004b
        L_0x0060:
            if (r6 != 0) goto L_0x0098
            java.io.File r10 = new java.io.File     // Catch:{ all -> 0x0166 }
            java.lang.String r11 = r18.getName()     // Catch:{ all -> 0x0166 }
            r12 = r18
            r10.<init>(r12, r11)     // Catch:{ all -> 0x0166 }
            boolean r10 = r10.exists()     // Catch:{ all -> 0x0166 }
            if (r10 != 0) goto L_0x0081
            java.lang.String r10 = r12.getName()     // Catch:{ all -> 0x0166 }
            java.lang.String r11 = "_"
            java.lang.String[] r10 = r10.split(r11)     // Catch:{ all -> 0x0166 }
            int r10 = r10.length     // Catch:{ all -> 0x0166 }
            r11 = 5
            if (r10 >= r11) goto L_0x009a
        L_0x0081:
            java.lang.String r0 = r8.mo12490a()     // Catch:{ all -> 0x0166 }
            java.lang.String r6 = r9.toString()     // Catch:{ all -> 0x0166 }
            com.apm.insight.k.l r0 = com.apm.insight.p025k.C1280e.m1723b(r0, r6)     // Catch:{ all -> 0x0166 }
            boolean r0 = r0.mo12574a()     // Catch:{ all -> 0x0166 }
            if (r0 == 0) goto L_0x0179
        L_0x0093:
            com.apm.insight.p026l.C1308i.m1834a((java.io.File) r12)     // Catch:{ all -> 0x0166 }
            goto L_0x0179
        L_0x0098:
            r12 = r18
        L_0x009a:
            java.io.File r10 = com.apm.insight.entity.C1228b.m1500a((java.io.File) r12)     // Catch:{ all -> 0x0166 }
            boolean r11 = r10.exists()     // Catch:{ all -> 0x0166 }
            if (r11 != 0) goto L_0x00a5
            goto L_0x0093
        L_0x00a5:
            org.json.JSONArray r11 = new org.json.JSONArray     // Catch:{ all -> 0x0163 }
            java.lang.String r10 = com.apm.insight.p026l.C1308i.m1841c((java.io.File) r10)     // Catch:{ all -> 0x0163 }
            r11.<init>(r10)     // Catch:{ all -> 0x0163 }
            com.apm.insight.CrashType r10 = com.apm.insight.CrashType.LAUNCH     // Catch:{ all -> 0x0166 }
            if (r6 != r10) goto L_0x00c0
            java.lang.String r10 = "data"
            java.lang.Object r10 = r9.opt(r10)     // Catch:{ all -> 0x0166 }
            org.json.JSONArray r10 = (org.json.JSONArray) r10     // Catch:{ all -> 0x0166 }
            r13 = 0
            org.json.JSONObject r10 = r10.optJSONObject(r13)     // Catch:{ all -> 0x0166 }
            goto L_0x00c1
        L_0x00c0:
            r10 = r9
        L_0x00c1:
            java.lang.String r13 = "ignore"
            java.lang.String r14 = "filters"
            if (r22 != 0) goto L_0x00cb
            com.apm.insight.k.b$a r15 = r1.f1249e     // Catch:{ all -> 0x0166 }
            if (r15 != r7) goto L_0x00d3
        L_0x00cb:
            java.lang.String r15 = r7.f1244e     // Catch:{ all -> 0x0166 }
            boolean r15 = r15.contains(r13)     // Catch:{ all -> 0x0166 }
            if (r15 == 0) goto L_0x0106
        L_0x00d3:
            java.lang.Object r15 = r0.opt(r5)     // Catch:{ all -> 0x00fb }
            java.lang.String r15 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x00fb }
            java.lang.String r15 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x00fb }
            com.apm.insight.entity.C1227a.m1466a((org.json.JSONObject) r10, (java.lang.String) r14, (java.lang.String) r5, (java.lang.String) r15)     // Catch:{ all -> 0x00fb }
            java.lang.String r15 = "has_ignore"
            r16 = r6
            java.lang.String r6 = r7.f1244e     // Catch:{ all -> 0x00f9 }
            boolean r6 = r6.contains(r13)     // Catch:{ all -> 0x00f9 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00f9 }
            com.apm.insight.entity.C1227a.m1466a((org.json.JSONObject) r10, (java.lang.String) r14, (java.lang.String) r15, (java.lang.String) r6)     // Catch:{ all -> 0x00f9 }
            r6 = 2010(0x7da, float:2.817E-42)
            r0.put(r5, r6)     // Catch:{ all -> 0x00f9 }
            goto L_0x011e
        L_0x00f9:
            r0 = move-exception
            goto L_0x00fe
        L_0x00fb:
            r0 = move-exception
            r16 = r6
        L_0x00fe:
            com.apm.insight.c r6 = com.apm.insight.C1186b.m1306a()     // Catch:{ all -> 0x0166 }
            r6.mo12441a((java.lang.String) r4, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0166 }
            goto L_0x011e
        L_0x0106:
            r16 = r6
            if (r2 == 0) goto L_0x011e
            java.lang.String r0 = "crash_md5"
            java.lang.String r6 = "default"
            java.lang.String r0 = r10.optString(r0, r6)     // Catch:{ all -> 0x0166 }
            boolean r0 = r2.mo12727a((java.lang.String) r0)     // Catch:{ all -> 0x0166 }
            if (r0 != 0) goto L_0x011e
            java.io.File r0 = r7.f1240a     // Catch:{ all -> 0x0166 }
            com.apm.insight.p026l.C1308i.m1834a((java.io.File) r0)     // Catch:{ all -> 0x0166 }
            goto L_0x0179
        L_0x011e:
            java.lang.String r0 = "start_uuid"
            java.lang.String r6 = r1.f1245a     // Catch:{ all -> 0x0166 }
            com.apm.insight.entity.C1227a.m1466a((org.json.JSONObject) r10, (java.lang.String) r14, (java.lang.String) r0, (java.lang.String) r6)     // Catch:{ all -> 0x0166 }
            java.lang.String r0 = "leak_threads_count"
            int r6 = r1.f1251g     // Catch:{ all -> 0x0166 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0166 }
            com.apm.insight.entity.C1227a.m1466a((org.json.JSONObject) r10, (java.lang.String) r14, (java.lang.String) r0, (java.lang.String) r6)     // Catch:{ all -> 0x0166 }
            java.lang.String r0 = "unknown"
            java.lang.String r0 = r10.optString(r3, r0)     // Catch:{ all -> 0x0166 }
            com.apm.insight.entity.C1227a.m1466a((org.json.JSONObject) r10, (java.lang.String) r14, (java.lang.String) r3, (java.lang.String) r0)     // Catch:{ all -> 0x0166 }
            com.apm.insight.p026l.C1322r.m1938a((org.json.JSONObject) r9)     // Catch:{ all -> 0x0166 }
            com.apm.insight.k.b$3 r0 = new com.apm.insight.k.b$3     // Catch:{ all -> 0x0166 }
            r6 = r20
            r0.<init>(r8, r12, r1)     // Catch:{ all -> 0x0161 }
            com.apm.insight.entity.C1228b.m1508a((org.json.JSONObject) r9, (org.json.JSONArray) r11, (com.apm.insight.entity.C1228b.C1229a) r0)     // Catch:{ all -> 0x0161 }
            boolean r0 = com.apm.insight.p026l.C1308i.m1834a((java.io.File) r12)     // Catch:{ all -> 0x0161 }
            if (r0 != 0) goto L_0x015b
            com.apm.insight.e.a r0 = com.apm.insight.p017e.C1222a.m1424a()     // Catch:{ all -> 0x0161 }
            java.lang.String r8 = r12.getAbsolutePath()     // Catch:{ all -> 0x0161 }
            com.apm.insight.e.a.a r8 = com.apm.insight.p017e.p018a.C1223a.m1429a(r8)     // Catch:{ all -> 0x0161 }
            r0.mo12448a((com.apm.insight.p017e.p018a.C1223a) r8)     // Catch:{ all -> 0x0161 }
        L_0x015b:
            r8 = r16
            com.apm.insight.p025k.C1275c.m1700a((com.apm.insight.CrashType) r8, (org.json.JSONObject) r9)     // Catch:{ all -> 0x0161 }
            goto L_0x0179
        L_0x0161:
            r0 = move-exception
            goto L_0x016d
        L_0x0163:
            r6 = r20
            goto L_0x0179
        L_0x0166:
            r0 = move-exception
            goto L_0x016b
        L_0x0168:
            r0 = move-exception
            r19 = r6
        L_0x016b:
            r6 = r20
        L_0x016d:
            com.apm.insight.c r8 = com.apm.insight.C1186b.m1306a()
            r8.mo12441a((java.lang.String) r4, (java.lang.Throwable) r0)
            java.io.File r0 = r7.f1240a
            com.apm.insight.p026l.C1308i.m1834a((java.io.File) r0)
        L_0x0179:
            r6 = r19
            goto L_0x0021
        L_0x017d:
            r6 = r20
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p025k.C1268b.m1677a(com.apm.insight.k.b$b, boolean, com.apm.insight.runtime.h):void");
    }

    /* renamed from: a */
    private void m1679a(File file, C1274b bVar) {
    }

    /* renamed from: a */
    private void m1680a(HashMap<String, C1274b> hashMap) {
        File[] listFiles = C1318o.m1906f(this.f1224c).listFiles();
        if (listFiles != null && listFiles.length != 0) {
            int i = 0;
            while (i < listFiles.length && i < 5) {
                File file = listFiles[i];
                try {
                    if (file.isDirectory() && file.getName().endsWith("G")) {
                        String name = file.getName();
                        C1274b bVar = hashMap.get(name);
                        if (bVar == null) {
                            bVar = new C1274b(name);
                            hashMap.put(name, bVar);
                        }
                        JSONArray a = C1340c.m2077a(C1318o.m1919l(file), C1318o.m1920m(file));
                        bVar.f1251g = a.length();
                        if (bVar.f1251g > 0) {
                            try {
                                C1308i.m1828a(C1318o.m1921n(file), a, false);
                            } catch (Throwable unused) {
                            }
                        }
                        i++;
                    } else {
                        C1308i.m1834a(file);
                        i++;
                    }
                } catch (Throwable th) {
                    C1186b.m1306a().mo12441a("NPTH_CATCH", th);
                    C1308i.m1834a(file);
                }
            }
        }
    }

    /* renamed from: a */
    private void m1681a(HashMap<String, C1274b> hashMap, C1274b bVar) {
        File[] listFiles = C1318o.m1900d(this.f1224c).listFiles();
        if (listFiles != null && listFiles.length != 0) {
            int i = 0;
            while (i < listFiles.length && i < 5) {
                File file = listFiles[i];
                try {
                    if (file.isDirectory() && file.getName().endsWith("G")) {
                        String name = file.getName();
                        C1274b bVar2 = hashMap.get(name);
                        if (bVar2 == null) {
                            bVar2 = new C1274b(name);
                            hashMap.put(name, bVar2);
                        }
                        bVar2.f1247c.add(new C1273a(file, CrashType.NATIVE));
                        i++;
                    } else {
                        C1308i.m1834a(file);
                        i++;
                    }
                } catch (Throwable th) {
                    C1186b.m1306a().mo12441a("NPTH_CATCH", th);
                    C1308i.m1834a(file);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        if (r4.equals("launch") != false) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0084  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1682a(java.util.HashMap<java.lang.String, com.apm.insight.p025k.C1268b.C1274b> r17, com.apm.insight.p025k.C1268b.C1274b r18, java.io.File r19, java.lang.String r20) {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            java.lang.String r4 = "G"
            boolean r4 = r3.endsWith(r4)
            if (r4 == 0) goto L_0x00e1
            java.lang.String r4 = "_"
            java.lang.String[] r4 = r3.split(r4)
            int r5 = r4.length
            r6 = 5
            r7 = 0
            if (r5 >= r6) goto L_0x0026
            java.util.List<com.apm.insight.k.b$a> r0 = r1.f1246b
            com.apm.insight.k.b$a r1 = new com.apm.insight.k.b$a
            r1.<init>(r2, r7)
            r0.add(r1)
            return
        L_0x0026:
            r5 = 0
            r6 = r4[r5]     // Catch:{ all -> 0x00b7 }
            long r8 = java.lang.Long.parseLong(r6)     // Catch:{ all -> 0x00b7 }
            r6 = 4
            r6 = r4[r6]     // Catch:{ all -> 0x00b7 }
            long r10 = java.lang.Long.parseLong(r6)     // Catch:{ all -> 0x00b7 }
            r1 = 2
            r6 = r4[r1]
            r12 = 1
            r4 = r4[r12]
            r13 = -1
            int r14 = r4.hashCode()
            r15 = -1109843021(0xffffffffbdd923b3, float:-0.10602512)
            if (r14 == r15) goto L_0x0063
            r5 = 96741(0x179e5, float:1.35563E-40)
            if (r14 == r5) goto L_0x0059
            r5 = 3254818(0x31aa22, float:4.560971E-39)
            if (r14 == r5) goto L_0x004f
            goto L_0x006c
        L_0x004f:
            java.lang.String r5 = "java"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x006c
            r5 = r12
            goto L_0x006d
        L_0x0059:
            java.lang.String r5 = "anr"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x006c
            r5 = r1
            goto L_0x006d
        L_0x0063:
            java.lang.String r14 = "launch"
            boolean r4 = r4.equals(r14)
            if (r4 == 0) goto L_0x006c
            goto L_0x006d
        L_0x006c:
            r5 = r13
        L_0x006d:
            if (r5 == 0) goto L_0x007a
            if (r5 == r12) goto L_0x0077
            if (r5 == r1) goto L_0x0074
            goto L_0x007c
        L_0x0074:
            com.apm.insight.CrashType r7 = com.apm.insight.CrashType.ANR
            goto L_0x007c
        L_0x0077:
            com.apm.insight.CrashType r7 = com.apm.insight.CrashType.JAVA
            goto L_0x007c
        L_0x007a:
            com.apm.insight.CrashType r7 = com.apm.insight.CrashType.LAUNCH
        L_0x007c:
            java.lang.Object r1 = r0.get(r6)
            com.apm.insight.k.b$b r1 = (com.apm.insight.p025k.C1268b.C1274b) r1
            if (r1 != 0) goto L_0x008c
            com.apm.insight.k.b$b r1 = new com.apm.insight.k.b$b
            r1.<init>(r6)
            r0.put(r6, r1)
        L_0x008c:
            com.apm.insight.k.b$a r0 = new com.apm.insight.k.b$a
            r0.<init>(r2, r8, r7)
            r0.f1242c = r10
            com.apm.insight.k.b$a r2 = r1.f1248d
            if (r2 == 0) goto L_0x00a1
            com.apm.insight.k.b$a r2 = r1.f1248d
            long r4 = r2.f1241b
            long r8 = r0.f1241b
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x00b1
        L_0x00a1:
            if (r7 == 0) goto L_0x00b1
            com.apm.insight.CrashType r2 = com.apm.insight.CrashType.ANR
            if (r7 == r2) goto L_0x00b1
            java.lang.String r2 = "ignore"
            boolean r2 = r3.contains(r2)
            if (r2 != 0) goto L_0x00b1
            r1.f1248d = r0
        L_0x00b1:
            java.util.List<com.apm.insight.k.b$a> r1 = r1.f1246b
            r1.add(r0)
            goto L_0x00e4
        L_0x00b7:
            java.util.List<com.apm.insight.k.b$a> r0 = r1.f1246b
            com.apm.insight.k.b$a r1 = new com.apm.insight.k.b$a
            r1.<init>(r2, r7)
            r0.add(r1)
            com.apm.insight.c r0 = com.apm.insight.C1186b.m1306a()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "err format crashTime:"
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            java.lang.String r2 = "NPTH_CATCH"
            r0.mo12441a((java.lang.String) r2, (java.lang.Throwable) r1)
            return
        L_0x00e1:
            com.apm.insight.p026l.C1308i.m1834a((java.io.File) r19)
        L_0x00e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p025k.C1268b.m1682a(java.util.HashMap, com.apm.insight.k.b$b, java.io.File, java.lang.String):void");
    }

    /* renamed from: a */
    private boolean m1683a(File file) {
        String[] list = file.list();
        if (list == null) {
            return false;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str) && str.endsWith("")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m1684b(C1274b bVar, boolean z, C1380h hVar) {
        boolean z2;
        final C1274b bVar2 = bVar;
        C1380h hVar2 = hVar;
        if (bVar2.f1247c.size() <= 1 && bVar2.f1247c.isEmpty()) {
            bVar2.f1249e = bVar2.f1248d;
            return;
        }
        boolean b = C1319p.m1925b(this.f1224c);
        bVar2.f1249e = bVar2.f1248d;
        C1333b bVar3 = new C1333b(this.f1224c);
        for (C1273a next : bVar2.f1247c) {
            final File file = next.f1240a;
            try {
                bVar3.mo12603a(file);
                JSONObject a = m1675a(bVar3);
                if (a != null) {
                    if (a.length() != 0) {
                        if (a.length() != 0) {
                            if (!z) {
                                long optLong = a.optLong("crash_time");
                                try {
                                    if (bVar2.f1249e == null) {
                                        bVar2.f1249e = next;
                                        bVar2.f1250f = true;
                                        if (hVar2 != null) {
                                            if (!hVar2.mo12727a(CoreLightModuleInterface.NAME_DEFAULT_HTTP_HANDLER)) {
                                                bVar3.mo12612k();
                                            }
                                        }
                                        z2 = b;
                                    } else {
                                        if (!bVar2.f1250f) {
                                            z2 = b;
                                            try {
                                                if (optLong < bVar2.f1249e.f1241b) {
                                                    bVar2.f1249e = next;
                                                    if (hVar2 == null || hVar2.mo12727a(CoreLightModuleInterface.NAME_DEFAULT_HTTP_HANDLER)) {
                                                        if (!m1683a(file)) {
                                                            m1679a(file, bVar2);
                                                        }
                                                        bVar2.f1250f = true;
                                                    } else {
                                                        bVar3.mo12612k();
                                                        b = z2;
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                C1186b.m1306a().mo12441a("NPTH_CATCH", th);
                                                C1308i.m1834a(file);
                                                b = z2;
                                            }
                                        } else {
                                            z2 = b;
                                        }
                                        C1227a.m1466a(a, "filters", "aid", String.valueOf(a.optJSONObject("header").opt("aid")));
                                        a.optJSONObject("header").put("aid", OguryAdFormatErrorCode.SHOW_FAILED);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    z2 = b;
                                    C1186b.m1306a().mo12441a("NPTH_CATCH", th);
                                    C1308i.m1834a(file);
                                    b = z2;
                                }
                            } else {
                                z2 = b;
                                if (hVar2 != null && !hVar2.mo12727a(CoreLightModuleInterface.NAME_DEFAULT_HTTP_HANDLER)) {
                                    bVar3.mo12612k();
                                }
                            }
                            C1227a.m1466a(a, "filters", "start_uuid", bVar2.f1245a);
                            C1227a.m1466a(a, "filters", "crash_thread_name", a.optString("crash_thread_name", "unknown"));
                            if (z2) {
                                C1275c.C1277a aVar = new C1275c.C1277a(a, CrashType.NATIVE);
                                C1228b.m1508a(a, C1228b.m1505a(aVar.mo12552c(), aVar.mo12550a(), C1399s.m2333a().mo12740b(aVar.mo12551b() == -1 ? System.currentTimeMillis() : aVar.mo12551b())), (C1228b.C1229a) new C1228b.C1229a() {
                                    /* renamed from: a */
                                    public void mo12411a(JSONObject jSONObject) {
                                        C1278d.m1705a().mo12556a(jSONObject, file, C1318o.m1888a(C1268b.this.f1224c, bVar2.f1245a));
                                    }
                                });
                                if (!bVar3.mo12612k()) {
                                    bVar3.mo12610h();
                                }
                            }
                            C1275c.m1700a(CrashType.NATIVE, a);
                        } else {
                            z2 = b;
                        }
                        b = z2;
                    }
                }
                z2 = b;
                bVar3.mo12612k();
            } catch (Throwable th3) {
                th = th3;
                z2 = b;
                C1186b.m1306a().mo12441a("NPTH_CATCH", th);
                C1308i.m1834a(file);
                b = z2;
            }
            b = z2;
        }
    }

    /* renamed from: b */
    private void m1686b(HashMap<String, C1274b> hashMap, C1274b bVar) {
        File[] listFiles = C1318o.m1887a(this.f1224c).listFiles();
        if (listFiles != null) {
            Arrays.sort(listFiles, Collections.reverseOrder());
            for (File file : listFiles) {
                try {
                    if (!C1222a.m1424a().mo12449a(file.getAbsolutePath())) {
                        if (!C1308i.m1849g(file)) {
                            if (!C1241a.m1565a().mo12521b(file.getName())) {
                                if (!file.isFile()) {
                                    m1682a(hashMap, bVar, file, file.getName());
                                }
                            }
                        }
                    }
                    C1308i.m1834a(file);
                } catch (Throwable th) {
                    C1186b.m1306a().mo12441a("NPTH_CATCH", th);
                }
            }
        }
    }

    /* renamed from: c */
    private void m1688c(HashMap<String, C1274b> hashMap, C1274b bVar) {
        C1308i.m1834a(C1318o.m1892b(this.f1224c));
    }

    /* renamed from: d */
    private void m1689d() {
        if (this.f1226f == null) {
            this.f1226f = new C1274b("old_uuid");
            HashMap<String, C1274b> hashMap = new HashMap<>();
            this.f1227g = hashMap;
            m1680a(hashMap);
            m1686b(this.f1227g, this.f1226f);
            m1688c(this.f1227g, this.f1226f);
            m1681a(this.f1227g, this.f1226f);
            m1684b(this.f1226f, true, (C1380h) null);
            m1677a(this.f1226f, true, (C1380h) null);
            this.f1226f = null;
            if (this.f1227g.isEmpty()) {
                m1691f();
            } else {
                m1692g();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m1690e() {
        if (!this.f1228h && this.f1227g != null) {
            if (!C1319p.m1925b(this.f1224c)) {
                m1691f();
            }
            boolean h = m1693h();
            C1380h hVar = new C1380h(this.f1224c);
            for (C1274b b : this.f1227g.values()) {
                m1684b(b, h, hVar);
            }
            for (C1274b a : this.f1227g.values()) {
                m1677a(a, h, hVar);
            }
            for (C1274b a2 : this.f1227g.values()) {
                m1676a(a2);
            }
            hVar.mo12726a();
            C1370b.m2213a();
            m1691f();
        }
    }

    /* renamed from: f */
    private void m1691f() {
        this.f1228h = true;
        this.f1227g = null;
        NativeImpl.m2029i();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m1692g() {
        if (!this.f1228h) {
            if (!C1319p.m1925b(this.f1224c) || (System.currentTimeMillis() - C1250h.m1618j() <= 5000 && C1250h.m1617i().isApmExists() && !Npth.hasCrash())) {
                C1394p.m2321b().mo12750a(this.f1229i, 5000);
            } else {
                m1690e();
            }
        }
    }

    /* renamed from: h */
    private boolean m1693h() {
        if (this.f1225e == -1) {
            if (C1351a.m2100b() && C1351a.m2107g()) {
                this.f1225e = 1;
            } else {
                this.f1225e = 0;
            }
        }
        return this.f1225e == 1;
    }

    /* renamed from: i */
    private void m1694i() {
        File[] listFiles = C1318o.m1914i(this.f1224c).listFiles();
        if (listFiles != null) {
            int i = 0;
            while (i < listFiles.length && i < 5) {
                File file = listFiles[i];
                if (file.getName().endsWith(".atmp")) {
                    C1182a.m1301a().mo12399a(file.getAbsolutePath());
                } else {
                    try {
                        C1232e e = C1308i.m1846e(file.getAbsolutePath());
                        if (e != null) {
                            if (e.mo12495b() != null) {
                                e.mo12495b().put("upload_scene", "launch_scan");
                            }
                            if (C1280e.m1719a(C1280e.m1731d(), e.mo12501e(), e.mo12499d(), e.mo12503f(), e.mo12504g())) {
                                C1308i.m1834a(file);
                                C1308i.m1835a(e.mo12497c());
                            }
                        } else {
                            C1308i.m1834a(file);
                        }
                    } catch (Throwable th) {
                        C1186b.m1306a().mo12441a("NPTH_CATCH", th);
                    }
                }
                i++;
            }
        }
    }

    /* renamed from: a */
    public void mo12544a(boolean z) {
        if (!Npth.isStopUpload() && z) {
            m1689d();
            m1694i();
            C1216a.m1415a();
        }
    }

    /* renamed from: b */
    public void mo12545b() {
        try {
            if (this.f1228h) {
                return;
            }
            if (C1295a.m1781b(C1250h.m1615g())) {
                C1394p.m2321b().mo12749a(this.f1230j);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public boolean mo12546c() {
        return this.f1228h;
    }
}
