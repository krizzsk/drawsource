package com.apm.insight.p021g;

import android.os.Looper;
import android.os.SystemClock;
import com.apm.insight.C1186b;
import com.apm.insight.C1250h;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.ICrashFilter;
import com.apm.insight.IOOMCallback;
import com.apm.insight.entity.C1227a;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.p025k.C1278d;
import com.apm.insight.p025k.C1289i;
import com.apm.insight.p026l.C1295a;
import com.apm.insight.p026l.C1303e;
import com.apm.insight.p026l.C1308i;
import com.apm.insight.p026l.C1310k;
import com.apm.insight.p026l.C1318o;
import com.apm.insight.p026l.C1321q;
import com.apm.insight.p026l.C1322r;
import com.apm.insight.p026l.C1326v;
import com.apm.insight.runtime.C1351a;
import com.apm.insight.runtime.C1389o;
import com.apm.insight.runtime.C1394p;
import com.apm.insight.runtime.p027a.C1362f;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.apm.insight.g.a */
public class C1241a implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private static C1241a f1152a = null;

    /* renamed from: i */
    private static volatile boolean f1153i = false;

    /* renamed from: j */
    private static volatile ThreadLocal<Boolean> f1154j = new ThreadLocal<>();

    /* renamed from: k */
    private static ArrayList<C1245b> f1155k = new ArrayList<>();

    /* renamed from: b */
    private Thread.UncaughtExceptionHandler f1156b;

    /* renamed from: c */
    private C1246c f1157c;

    /* renamed from: d */
    private C1246c f1158d;

    /* renamed from: e */
    private volatile int f1159e = 0;

    /* renamed from: f */
    private volatile int f1160f = 0;

    /* renamed from: g */
    private ConcurrentHashMap<String, Object> f1161g = new ConcurrentHashMap<>();

    /* renamed from: h */
    private ConcurrentHashMap<String, Object> f1162h = new ConcurrentHashMap<>();

    private C1241a() {
        m1577d();
    }

    /* renamed from: a */
    private static int m1564a(Throwable th, Thread thread) {
        int i = 0;
        int i2 = 0;
        while (i < f1155k.size()) {
            try {
                try {
                    i2 |= f1155k.get(i).mo12526a(th, thread);
                } catch (Throwable th2) {
                    C1186b.m1306a().mo12441a("NPTH_CATCH", th2);
                }
                i++;
            } catch (Throwable unused) {
            }
        }
        return i2;
    }

    /* renamed from: a */
    public static C1241a m1565a() {
        if (f1152a == null) {
            f1152a = new C1241a();
        }
        return f1152a;
    }

    /* renamed from: a */
    private String m1566a(File file, boolean z, Throwable th, String str, Thread thread, boolean z2) {
        String absolutePath = file.getAbsolutePath();
        this.f1162h.put(file.getName(), file);
        try {
            file.getParentFile().mkdirs();
            file.createNewFile();
            NativeImpl.m2015c(absolutePath);
        } catch (Throwable unused) {
        }
        String str2 = null;
        if (z2) {
            int h = NativeImpl.m2027h(absolutePath);
            if (h > 0) {
                try {
                    NativeImpl.m2004a(h, C1295a.m1782c(C1250h.m1615g()));
                    NativeImpl.m2004a(h, "\n");
                    NativeImpl.m2004a(h, th.getMessage());
                    NativeImpl.m2004a(h, "\n");
                    NativeImpl.m2004a(h, th.getClass().getName());
                    if (th.getMessage() != null) {
                        NativeImpl.m2004a(h, ": ");
                        NativeImpl.m2004a(h, th.getMessage());
                    }
                    NativeImpl.m2004a(h, "\n");
                    NativeImpl.m2004a(h, thread.getName());
                    NativeImpl.m2004a(h, "\n");
                } catch (Throwable unused2) {
                }
                try {
                    NativeImpl.m2004a(h, "stack:");
                    NativeImpl.m2004a(h, "\n");
                } catch (Throwable unused3) {
                }
                C1326v.m1969a(th, h);
                NativeImpl.m2012b(h);
            }
        } else {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                try {
                    if (!C1322r.m1939a(32768)) {
                        fileOutputStream.write((C1295a.m1782c(C1250h.m1615g()) + "\n").getBytes());
                        fileOutputStream.write((th.getMessage() + "\n").getBytes());
                        fileOutputStream.write((th + "\n").getBytes());
                        fileOutputStream.write((thread.getName() + "\n").getBytes());
                        try {
                            fileOutputStream.write("stack:\n".getBytes());
                        } catch (Throwable unused4) {
                        }
                        try {
                            if (!C1322r.m1939a(8192)) {
                                str2 = C1326v.m1961a(th, thread, new PrintStream(fileOutputStream), Looper.getMainLooper() == Looper.myLooper() ? new C1303e.C1304a() {

                                    /* renamed from: a */
                                    boolean f1163a = false;

                                    /* renamed from: a */
                                    public boolean mo12523a(String str) {
                                        if (!this.f1163a && str.contains("android.os.Looper.loop")) {
                                            this.f1163a = true;
                                        }
                                        return !this.f1163a;
                                    }
                                } : new C1303e.C1304a());
                                C1310k.m1852a((Closeable) fileOutputStream);
                                C1310k.m1852a((Closeable) fileOutputStream);
                            } else {
                                throw new RuntimeException("test exception npth write stack");
                            }
                        } catch (Throwable th2) {
                            try {
                                fileOutputStream.write("err:\n".getBytes());
                                fileOutputStream.write((th + "\n").getBytes());
                                fileOutputStream.write((th2 + "\n").getBytes());
                            } catch (Throwable unused5) {
                            }
                        }
                    } else {
                        throw new RuntimeException("test exception before write stack");
                    }
                } catch (Throwable unused6) {
                }
            } catch (Throwable unused7) {
            }
        }
        return str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01fb A[Catch:{ all -> 0x0226, all -> 0x023f }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0200 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0050 A[SYNTHETIC, Splitter:B:23:0x0050] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005f A[SYNTHETIC, Splitter:B:29:0x005f] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0094 A[ADDED_TO_REGION, Catch:{ all -> 0x01eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ac A[Catch:{ all -> 0x01e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ae A[Catch:{ all -> 0x01e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b1 A[Catch:{ all -> 0x01e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b9 A[Catch:{ all -> 0x01e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00bc A[Catch:{ all -> 0x01e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00fe A[Catch:{ all -> 0x01df }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0105 A[Catch:{ all -> 0x01df }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0108 A[Catch:{ all -> 0x01df }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x016a A[SYNTHETIC, Splitter:B:76:0x016a] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01b0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Throwable m1567a(java.lang.Thread r23, java.lang.Throwable r24) {
        /*
            r22 = this;
            r8 = r22
            r15 = r23
            r14 = r24
            int r0 = r8.f1159e
            r18 = 0
            r1 = 3
            if (r0 < r1) goto L_0x0016
            r0 = 65536(0x10000, float:9.18355E-41)
            boolean r0 = com.apm.insight.p026l.C1322r.m1939a((int) r0)
            if (r0 != 0) goto L_0x0016
            return r18
        L_0x0016:
            int r0 = r8.f1159e
            r13 = 1
            int r0 = r0 + r13
            r8.f1159e = r0
            int r0 = r8.f1160f
            int r0 = r0 + r13
            r8.f1160f = r0
            boolean r0 = f1153i
            if (r0 == 0) goto L_0x002e
            java.lang.ThreadLocal<java.lang.Boolean> r0 = f1154j
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r13)
            r0.set(r1)
        L_0x002e:
            f1153i = r13
            long r10 = java.lang.System.currentTimeMillis()
            boolean r12 = m1570a((long) r10)
            r9 = 0
            boolean r0 = com.apm.insight.p026l.C1326v.m1981c((java.lang.Throwable) r24)     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x0047
            boolean r1 = com.apm.insight.p026l.C1326v.m1982d(r24)     // Catch:{ all -> 0x004c }
            if (r1 == 0) goto L_0x0047
            r1 = r13
            goto L_0x0048
        L_0x0047:
            r1 = r9
        L_0x0048:
            r19 = r1
            goto L_0x004e
        L_0x004b:
            r0 = r9
        L_0x004c:
            r19 = r9
        L_0x004e:
            if (r12 == 0) goto L_0x005f
            com.apm.insight.CrashType r1 = com.apm.insight.CrashType.LAUNCH     // Catch:{ all -> 0x0053 }
            goto L_0x0061
        L_0x0053:
            r0 = move-exception
            r20 = r9
            r21 = r20
        L_0x0058:
            r5 = r10
            r4 = r12
            r2 = r13
            r9 = r14
        L_0x005c:
            r7 = r15
            goto L_0x01f5
        L_0x005f:
            com.apm.insight.CrashType r1 = com.apm.insight.CrashType.JAVA     // Catch:{ all -> 0x01eb }
        L_0x0061:
            java.lang.String r7 = com.apm.insight.C1250h.m1600a(r10, r1, r0, r9)     // Catch:{ all -> 0x01eb }
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x01eb }
            android.content.Context r1 = com.apm.insight.C1250h.m1615g()     // Catch:{ all -> 0x01eb }
            java.io.File r1 = com.apm.insight.p026l.C1318o.m1887a((android.content.Context) r1)     // Catch:{ all -> 0x01eb }
            r6.<init>(r1, r7)     // Catch:{ all -> 0x01eb }
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x01eb }
            java.lang.String r1 = "logEventStack"
            r5.<init>(r6, r1)     // Catch:{ all -> 0x01eb }
            r1 = r22
            r2 = r5
            r3 = r0
            r4 = r24
            r16 = r5
            r5 = r7
            r9 = r6
            r6 = r23
            r20 = r7
            r7 = r19
            java.lang.String r7 = r1.m1566a(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x01eb }
            int r1 = m1564a((java.lang.Throwable) r14, (java.lang.Thread) r15)     // Catch:{ all -> 0x01eb }
            r1 = r1 & r13
            if (r1 != 0) goto L_0x00a4
            if (r7 == 0) goto L_0x00a1
            com.apm.insight.runtime.ConfigManager r1 = com.apm.insight.C1250h.m1617i()     // Catch:{ all -> 0x01eb }
            boolean r1 = r1.isCrashIgnored(r7)     // Catch:{ all -> 0x01eb }
            if (r1 == 0) goto L_0x00a1
            goto L_0x00a4
        L_0x00a1:
            r21 = 0
            goto L_0x00a6
        L_0x00a4:
            r21 = r13
        L_0x00a6:
            org.json.JSONArray r1 = com.apm.insight.entity.C1228b.m1506a((java.lang.Throwable) r14, (java.lang.Thread) r15, (java.io.File) r9)     // Catch:{ all -> 0x01e2 }
            if (r1 != 0) goto L_0x00ae
            r1 = r13
            goto L_0x00af
        L_0x00ae:
            r1 = 0
        L_0x00af:
            if (r1 != 0) goto L_0x00b7
            if (r21 == 0) goto L_0x00b4
            goto L_0x00b7
        L_0x00b4:
            r0 = r20
            goto L_0x00db
        L_0x00b7:
            if (r12 == 0) goto L_0x00bc
            com.apm.insight.CrashType r1 = com.apm.insight.CrashType.LAUNCH     // Catch:{ all -> 0x01e2 }
            goto L_0x00be
        L_0x00bc:
            com.apm.insight.CrashType r1 = com.apm.insight.CrashType.JAVA     // Catch:{ all -> 0x01e2 }
        L_0x00be:
            java.lang.String r0 = com.apm.insight.C1250h.m1600a(r10, r1, r0, r13)     // Catch:{ all -> 0x01e2 }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x01e2 }
            android.content.Context r2 = com.apm.insight.C1250h.m1615g()     // Catch:{ all -> 0x01e2 }
            java.io.File r2 = com.apm.insight.p026l.C1318o.m1887a((android.content.Context) r2)     // Catch:{ all -> 0x01e2 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x01e2 }
            r9.renameTo(r1)     // Catch:{ all -> 0x01e2 }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x01e2 }
            java.lang.String r3 = "logEventStack"
            r2.<init>(r1, r3)     // Catch:{ all -> 0x01e2 }
            r16 = r2
        L_0x00db:
            com.apm.insight.p026l.C1305f.m1809a()     // Catch:{ all -> 0x01e2 }
            com.apm.insight.k.b r1 = com.apm.insight.p025k.C1268b.m1674a()     // Catch:{ all -> 0x01e2 }
            r1.mo12545b()     // Catch:{ all -> 0x01e2 }
            boolean r20 = r22.m1580g()     // Catch:{ all -> 0x01e2 }
            if (r19 == 0) goto L_0x00f8
            if (r20 == 0) goto L_0x00f8
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r12
            r5 = r10
            r1.m1568a((java.lang.Thread) r2, (java.lang.Throwable) r3, (boolean) r4, (long) r5)     // Catch:{ all -> 0x01df }
        L_0x00f8:
            boolean r1 = com.apm.insight.p026l.C1322r.m1939a((int) r13)     // Catch:{ all -> 0x01df }
            if (r1 == 0) goto L_0x0103
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r1 = r8.f1162h     // Catch:{ all -> 0x01df }
            r1.clear()     // Catch:{ all -> 0x01df }
        L_0x0103:
            if (r12 == 0) goto L_0x0108
            com.apm.insight.CrashType r1 = com.apm.insight.CrashType.LAUNCH     // Catch:{ all -> 0x01df }
            goto L_0x010a
        L_0x0108:
            com.apm.insight.CrashType r1 = com.apm.insight.CrashType.JAVA     // Catch:{ all -> 0x01df }
        L_0x010a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01df }
            r2.<init>()     // Catch:{ all -> 0x01df }
            java.lang.String r3 = "[uncaughtException] isLaunchCrash="
            r2.append(r3)     // Catch:{ all -> 0x01df }
            r2.append(r12)     // Catch:{ all -> 0x01df }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01df }
            com.apm.insight.p026l.C1321q.m1927a((java.lang.Object) r2)     // Catch:{ all -> 0x01df }
            com.apm.insight.a.a r2 = com.apm.insight.p013a.C1182a.m1301a()     // Catch:{ all -> 0x01df }
            r2.mo12398a((com.apm.insight.CrashType) r1, (long) r10, (java.lang.String) r0)     // Catch:{ all -> 0x01df }
            boolean r1 = r22.m1573b((java.lang.Thread) r23, (java.lang.Throwable) r24)     // Catch:{ all -> 0x01df }
            if (r1 == 0) goto L_0x0164
            com.apm.insight.g.c r2 = r8.f1157c     // Catch:{ all -> 0x01df }
            if (r2 == 0) goto L_0x0164
            if (r12 == 0) goto L_0x0164
            com.apm.insight.g.c r2 = r8.f1157c     // Catch:{ all -> 0x01df }
            boolean r2 = r2.mo12529a(r14)     // Catch:{ all -> 0x01df }
            if (r2 == 0) goto L_0x0164
            com.apm.insight.g.c r9 = r8.f1157c     // Catch:{ all -> 0x01df }
            r5 = r10
            r4 = r12
            r12 = r23
            r2 = r13
            r13 = r24
            r3 = r14
            r14 = r0
            r1 = r15
            r15 = r16
            r16 = r7
            r17 = r21
            r9.mo12528a(r10, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x01a2 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a2 }
            r0.<init>()     // Catch:{ all -> 0x01a2 }
            java.lang.String r7 = "[uncaughtException] mLaunchCrashDisposer "
            r0.append(r7)     // Catch:{ all -> 0x01a2 }
            java.lang.String r7 = r24.toString()     // Catch:{ all -> 0x01a2 }
            r0.append(r7)     // Catch:{ all -> 0x01a2 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01a2 }
            goto L_0x019d
        L_0x0164:
            r5 = r10
            r4 = r12
            r2 = r13
            r3 = r14
            if (r1 == 0) goto L_0x01ad
            com.apm.insight.g.c r9 = r8.f1158d     // Catch:{ all -> 0x01a9 }
            if (r9 == 0) goto L_0x01ad
            com.apm.insight.g.c r9 = r8.f1158d     // Catch:{ all -> 0x01a9 }
            boolean r9 = r9.mo12529a(r3)     // Catch:{ all -> 0x01a9 }
            if (r9 == 0) goto L_0x01ad
            com.apm.insight.g.c r9 = r8.f1158d     // Catch:{ all -> 0x01a5 }
            r10 = r5
            r12 = r23
            r13 = r24
            r14 = r0
            r1 = r15
            r15 = r16
            r16 = r7
            r17 = r21
            r9.mo12528a(r10, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x01a2 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a2 }
            r0.<init>()     // Catch:{ all -> 0x01a2 }
            java.lang.String r7 = "[uncaughtException] mLaunchCrashDisposer "
            r0.append(r7)     // Catch:{ all -> 0x01a2 }
            java.lang.String r7 = r24.toString()     // Catch:{ all -> 0x01a2 }
            r0.append(r7)     // Catch:{ all -> 0x01a2 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01a2 }
        L_0x019d:
            com.apm.insight.p026l.C1321q.m1927a((java.lang.Object) r0)     // Catch:{ all -> 0x01a2 }
            r7 = r1
            goto L_0x01ae
        L_0x01a2:
            r0 = move-exception
            r7 = r1
            goto L_0x01ab
        L_0x01a5:
            r0 = move-exception
            r9 = r3
            goto L_0x005c
        L_0x01a9:
            r0 = move-exception
            r7 = r15
        L_0x01ab:
            r9 = r3
            goto L_0x01f5
        L_0x01ad:
            r7 = r15
        L_0x01ae:
            if (r21 != 0) goto L_0x01ca
            if (r19 == 0) goto L_0x01bf
            if (r20 != 0) goto L_0x01bf
            r1 = r22
            r2 = r23
            r9 = r3
            r3 = r24
            r1.m1568a((java.lang.Thread) r2, (java.lang.Throwable) r3, (boolean) r4, (long) r5)     // Catch:{ all -> 0x0211 }
            goto L_0x01c0
        L_0x01bf:
            r9 = r3
        L_0x01c0:
            r22.m1579f()     // Catch:{ all -> 0x0211 }
        L_0x01c3:
            r22.m1578e()     // Catch:{ all -> 0x0211 }
            r22.m1575c(r23, r24)     // Catch:{ all -> 0x0211 }
            goto L_0x0211
        L_0x01ca:
            r9 = r3
            monitor-enter(r22)
            int r0 = r8.f1160f     // Catch:{ all -> 0x01dc }
            int r0 = r0 - r2
            r8.f1160f = r0     // Catch:{ all -> 0x01dc }
            int r0 = r8.f1159e     // Catch:{ all -> 0x01dc }
            int r0 = r0 - r2
            r8.f1159e = r0     // Catch:{ all -> 0x01dc }
            monitor-exit(r22)     // Catch:{ all -> 0x01dc }
            java.lang.Throwable r0 = m1571b((java.lang.Throwable) r9, (java.lang.Thread) r7)
            return r0
        L_0x01dc:
            r0 = move-exception
            monitor-exit(r22)     // Catch:{ all -> 0x01dc }
            throw r0
        L_0x01df:
            r0 = move-exception
            goto L_0x0058
        L_0x01e2:
            r0 = move-exception
            r5 = r10
            r4 = r12
            r2 = r13
            r9 = r14
            r7 = r15
            r20 = 0
            goto L_0x01f5
        L_0x01eb:
            r0 = move-exception
            r5 = r10
            r4 = r12
            r2 = r13
            r9 = r14
            r7 = r15
            r20 = 0
            r21 = 0
        L_0x01f5:
            boolean r1 = com.apm.insight.p026l.C1326v.m1981c((java.lang.Throwable) r0)     // Catch:{ all -> 0x0226 }
            if (r1 != 0) goto L_0x01fe
            com.apm.insight.p026l.C1321q.m1932a((java.lang.Throwable) r0)     // Catch:{ all -> 0x0226 }
        L_0x01fe:
            if (r21 != 0) goto L_0x0212
            if (r19 == 0) goto L_0x020d
            if (r20 != 0) goto L_0x020d
            r1 = r22
            r2 = r23
            r3 = r24
            r1.m1568a((java.lang.Thread) r2, (java.lang.Throwable) r3, (boolean) r4, (long) r5)     // Catch:{ all -> 0x0211 }
        L_0x020d:
            r22.m1579f()     // Catch:{ all -> 0x0211 }
            goto L_0x01c3
        L_0x0211:
            return r18
        L_0x0212:
            monitor-enter(r22)
            int r0 = r8.f1160f     // Catch:{ all -> 0x0223 }
            int r0 = r0 - r2
            r8.f1160f = r0     // Catch:{ all -> 0x0223 }
            int r0 = r8.f1159e     // Catch:{ all -> 0x0223 }
            int r0 = r0 - r2
            r8.f1159e = r0     // Catch:{ all -> 0x0223 }
            monitor-exit(r22)     // Catch:{ all -> 0x0223 }
            java.lang.Throwable r0 = m1571b((java.lang.Throwable) r9, (java.lang.Thread) r7)
            return r0
        L_0x0223:
            r0 = move-exception
            monitor-exit(r22)     // Catch:{ all -> 0x0223 }
            throw r0
        L_0x0226:
            r0 = move-exception
            if (r21 != 0) goto L_0x0240
            if (r19 == 0) goto L_0x0236
            if (r20 != 0) goto L_0x0236
            r1 = r22
            r2 = r23
            r3 = r24
            r1.m1568a((java.lang.Thread) r2, (java.lang.Throwable) r3, (boolean) r4, (long) r5)     // Catch:{ all -> 0x023f }
        L_0x0236:
            r22.m1579f()     // Catch:{ all -> 0x023f }
            r22.m1578e()     // Catch:{ all -> 0x023f }
            r22.m1575c(r23, r24)     // Catch:{ all -> 0x023f }
        L_0x023f:
            throw r0
        L_0x0240:
            monitor-enter(r22)
            int r0 = r8.f1160f     // Catch:{ all -> 0x0251 }
            int r0 = r0 - r2
            r8.f1160f = r0     // Catch:{ all -> 0x0251 }
            int r0 = r8.f1159e     // Catch:{ all -> 0x0251 }
            int r0 = r0 - r2
            r8.f1159e = r0     // Catch:{ all -> 0x0251 }
            monitor-exit(r22)     // Catch:{ all -> 0x0251 }
            java.lang.Throwable r0 = m1571b((java.lang.Throwable) r9, (java.lang.Thread) r7)
            return r0
        L_0x0251:
            r0 = move-exception
            monitor-exit(r22)     // Catch:{ all -> 0x0251 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p021g.C1241a.m1567a(java.lang.Thread, java.lang.Throwable):java.lang.Throwable");
    }

    /* renamed from: a */
    private void m1568a(Thread thread, Throwable th, boolean z, long j) {
        List<IOOMCallback> a = C1389o.m2279a().mo12703a();
        CrashType crashType = z ? CrashType.LAUNCH : CrashType.JAVA;
        for (IOOMCallback onCrash : a) {
            try {
                onCrash.onCrash(crashType, th, thread, j);
            } catch (Throwable th2) {
                C1321q.m1934b(th2);
            }
        }
    }

    /* renamed from: a */
    public static void m1569a(final Throwable th) {
        if (th != null) {
            try {
                C1394p.m2321b().mo12749a((Runnable) new Runnable() {
                    public void run() {
                        try {
                            C1227a a = C1227a.m1465a(System.currentTimeMillis(), C1250h.m1615g(), (Thread) null, th);
                            a.mo12474a("userdefine", (Object) 1);
                            C1227a a2 = C1362f.m2195a().mo12700a(CrashType.CUSTOM_JAVA, a);
                            if (a2 != null) {
                                C1278d.m1705a().mo12557b(a2.mo12488h());
                            }
                        } catch (Throwable unused) {
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m1570a(long j) {
        return C1249e.m1598a(j);
    }

    /* renamed from: b */
    private static Throwable m1571b(Throwable th, Thread thread) {
        int i = 0;
        while (i < f1155k.size()) {
            try {
                try {
                    f1155k.get(i).mo12527b(th, thread);
                    i++;
                } catch (Throwable th2) {
                    return th2;
                }
            } catch (Throwable unused) {
            }
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return null;
        }
        try {
            Looper.loop();
            return null;
        } catch (Throwable th3) {
            return th3;
        }
    }

    /* renamed from: b */
    public static boolean m1572b() {
        return f1153i;
    }

    /* renamed from: b */
    private boolean m1573b(Thread thread, Throwable th) {
        ICrashFilter b = C1250h.m1609b().mo12394b();
        if (b == null) {
            return true;
        }
        try {
            return b.onJavaCrashFilter(th, thread);
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: c */
    public static void m1574c(final String str) {
        if (str != null) {
            try {
                C1394p.m2321b().mo12749a((Runnable) new Runnable() {
                    public void run() {
                        try {
                            C1227a aVar = new C1227a();
                            aVar.mo12474a("data", (Object) str);
                            aVar.mo12474a("userdefine", (Object) 1);
                            C1227a a = C1362f.m2195a().mo12700a(CrashType.CUSTOM_JAVA, aVar);
                            if (a != null) {
                                C1278d.m1705a().mo12557b(a.mo12488h());
                            }
                        } catch (Throwable unused) {
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: c */
    private void m1575c(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f1156b;
        if (uncaughtExceptionHandler != null && uncaughtExceptionHandler != this && !C1322r.m1939a(512)) {
            this.f1156b.uncaughtException(thread, th);
        }
    }

    /* renamed from: c */
    public static boolean m1576c() {
        Boolean bool = f1154j.get();
        return bool != null && bool.booleanValue();
    }

    /* renamed from: d */
    private void m1577d() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != this) {
            this.f1156b = defaultUncaughtExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    /* renamed from: e */
    private void m1578e() {
        synchronized (this) {
            this.f1160f--;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        while (this.f1160f != 0 && SystemClock.uptimeMillis() - uptimeMillis < 10000) {
            SystemClock.sleep(50);
        }
    }

    /* renamed from: f */
    private void m1579f() {
        File a = C1318o.m1887a(C1250h.m1615g());
        File a2 = C1318o.m1886a();
        if (!C1308i.m1840b(a) || !C1308i.m1840b(a2)) {
            long uptimeMillis = SystemClock.uptimeMillis();
            while (!C1289i.m1753a() && SystemClock.uptimeMillis() - uptimeMillis < 10000) {
                try {
                    SystemClock.sleep(500);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: g */
    private boolean m1580g() {
        return C1351a.m2092a("exception_modules", "oom_callback") == 1;
    }

    /* renamed from: a */
    public void mo12517a(C1246c cVar) {
        this.f1157c = cVar;
    }

    /* renamed from: a */
    public void mo12518a(String str) {
        this.f1161g.put(str, new Object());
    }

    /* renamed from: a */
    public void mo12519a(Thread thread, Throwable th, boolean z, C1227a aVar) {
        List<ICrashCallback> list;
        CrashType crashType;
        if (z) {
            list = C1389o.m2279a().mo12706b();
            crashType = CrashType.LAUNCH;
        } else {
            list = C1389o.m2279a().mo12709c();
            crashType = CrashType.JAVA;
        }
        for (ICrashCallback next : list) {
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                next.onCrash(crashType, C1326v.m1960a(th), thread);
                aVar.mo12476b("callback_cost_" + next.getClass().getName(), String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            } catch (Throwable th2) {
                C1321q.m1934b(th2);
                aVar.mo12476b("callback_err_" + next.getClass().getName(), String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            }
        }
    }

    /* renamed from: b */
    public void mo12520b(C1246c cVar) {
        this.f1158d = cVar;
    }

    /* renamed from: b */
    public boolean mo12521b(String str) {
        return this.f1161g.containsKey(str);
    }

    public void uncaughtException(Thread thread, Throwable th) {
        do {
            th = m1567a(thread, th);
        } while (th != null);
    }
}
