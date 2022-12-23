package com.apm.insight.p014b;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Printer;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.apm.insight.b.i */
public class C1208i {

    /* renamed from: a */
    private static volatile boolean f1073a;

    /* renamed from: b */
    private static Printer f1074b;

    /* renamed from: c */
    private static final CopyOnWriteArrayList<C1195e> f1075c = new CopyOnWriteArrayList<>();

    /* renamed from: d */
    private static C1195e f1076d;

    /* renamed from: e */
    private static volatile C1210a f1077e;

    /* renamed from: f */
    private static volatile boolean f1078f = false;

    /* renamed from: g */
    private static long f1079g = 0;

    /* renamed from: h */
    private static int f1080h = 0;

    /* renamed from: com.apm.insight.b.i$a */
    public interface C1210a {
        /* renamed from: a */
        void mo12436a(long j);
    }

    /* renamed from: a */
    public static void m1395a() {
        if (!f1073a) {
            f1073a = true;
            f1074b = new Printer() {
                public void println(String str) {
                    if (!TextUtils.isEmpty(str)) {
                        boolean z = false;
                        if (str.charAt(0) == '>') {
                            z = true;
                        } else if (str.charAt(0) != '<') {
                            return;
                        }
                        C1208i.m1397a(z, str);
                    }
                }
            };
            C1211j.m1399a();
            C1211j.m1400a(f1074b);
        }
    }

    /* renamed from: a */
    public static void m1396a(C1195e eVar) {
        synchronized (f1075c) {
            f1075c.add(eVar);
        }
    }

    /* renamed from: a */
    public static void m1397a(boolean z, String str) {
        C1195e eVar;
        C1195e eVar2;
        long nanoTime = System.nanoTime();
        C1195e.f1005a = nanoTime / 1000000;
        C1195e.f1006b = SystemClock.currentThreadTimeMillis();
        if (z && (eVar2 = f1076d) != null && eVar2.mo12417a()) {
            f1076d.mo12416a(str);
        }
        CopyOnWriteArrayList<C1195e> copyOnWriteArrayList = f1075c;
        for (int i = 0; i < copyOnWriteArrayList.size(); i++) {
            C1195e eVar3 = copyOnWriteArrayList.get(i);
            if (eVar3 != null && eVar3.mo12417a()) {
                boolean z2 = eVar3.f1007c;
                if (z) {
                    if (!z2) {
                        eVar3.mo12416a(str);
                    }
                } else if (z2) {
                    eVar3.mo12418b(str);
                }
            } else if (!z && eVar3.f1007c) {
                eVar3.mo12418b("");
            }
        }
        if (!z && (eVar = f1076d) != null && eVar.mo12417a()) {
            f1076d.mo12418b("");
        }
        if (f1078f) {
            f1079g += System.nanoTime() - nanoTime;
            int i2 = f1080h;
            f1080h = i2 + 1;
            if (i2 >= 1000) {
                if (f1077e != null) {
                    f1077e.mo12436a(f1079g);
                }
                f1080h = 0;
                f1079g = 0;
                f1078f = false;
            }
        }
    }
}
