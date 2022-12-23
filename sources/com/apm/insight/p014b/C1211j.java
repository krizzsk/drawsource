package com.apm.insight.p014b;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Printer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.apm.insight.b.j */
public final class C1211j {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static int f1081a = 5;

    /* renamed from: b */
    private static C1213b f1082b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static C1212a f1083c;

    /* renamed from: d */
    private static boolean f1084d;

    /* renamed from: e */
    private static Printer f1085e;

    /* renamed from: com.apm.insight.b.j$a */
    public interface C1212a {
        /* renamed from: a */
        void mo12437a(long j);
    }

    /* renamed from: com.apm.insight.b.j$b */
    static class C1213b implements Printer {

        /* renamed from: a */
        List<Printer> f1086a = new ArrayList();

        /* renamed from: b */
        List<Printer> f1087b = new ArrayList();

        /* renamed from: c */
        List<Printer> f1088c = new ArrayList();

        /* renamed from: d */
        boolean f1089d = false;

        /* renamed from: e */
        boolean f1090e = false;

        C1213b() {
        }

        public void println(String str) {
            if (!TextUtils.isEmpty(str)) {
                long currentTimeMillis = C1211j.f1083c != null ? System.currentTimeMillis() : 0;
                if (str.charAt(0) == '>' && this.f1090e) {
                    for (Printer next : this.f1088c) {
                        if (!this.f1086a.contains(next)) {
                            this.f1086a.add(next);
                        }
                    }
                    this.f1088c.clear();
                    this.f1090e = false;
                }
                if (this.f1086a.size() > C1211j.f1081a) {
                    Log.e("LooperPrinterUtils", "wrapper contains too many printer,please check if the useless printer have been removed");
                }
                for (Printer next2 : this.f1086a) {
                    if (next2 != null) {
                        next2.println(str);
                    }
                }
                if (str.charAt(0) == '<' && this.f1089d) {
                    for (Printer next3 : this.f1087b) {
                        this.f1086a.remove(next3);
                        this.f1088c.remove(next3);
                    }
                    this.f1087b.clear();
                    this.f1089d = false;
                }
                if (C1211j.f1083c != null && currentTimeMillis > 0) {
                    C1211j.f1083c.mo12437a(System.currentTimeMillis() - currentTimeMillis);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m1399a() {
        if (!f1084d) {
            f1084d = true;
            f1082b = new C1213b();
            Printer d = m1403d();
            f1085e = d;
            if (d != null) {
                f1082b.f1086a.add(f1085e);
            }
            Looper.getMainLooper().setMessageLogging(f1082b);
        }
    }

    /* renamed from: a */
    public static void m1400a(Printer printer) {
        if (printer != null && !f1082b.f1088c.contains(printer)) {
            f1082b.f1088c.add(printer);
            f1082b.f1090e = true;
        }
    }

    /* renamed from: d */
    private static Printer m1403d() {
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            return (Printer) declaredField.get(Looper.getMainLooper());
        } catch (Exception unused) {
            return null;
        }
    }
}
