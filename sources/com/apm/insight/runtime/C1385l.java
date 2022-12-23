package com.apm.insight.runtime;

import android.os.SystemClock;
import android.util.Printer;
import com.apm.insight.p014b.C1196f;
import com.apm.insight.p026l.C1321q;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.apm.insight.runtime.l */
public class C1385l {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static Printer f1466a;

    /* renamed from: b */
    private static C1385l f1467b;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Printer f1468f = new Printer() {
        public void println(String str) {
            if (str != null) {
                if (str.charAt(0) == '>') {
                    C1385l.m2262a().mo12729a(str);
                } else if (str.charAt(0) == '<') {
                    C1385l.m2262a().mo12730b(str);
                }
                if (C1385l.f1466a != null && C1385l.f1466a != C1385l.f1468f) {
                    C1385l.f1466a.println(str);
                }
            }
        }
    };

    /* renamed from: c */
    private long f1469c = -1;

    /* renamed from: d */
    private final List<Printer> f1470d = new ArrayList();

    /* renamed from: e */
    private final List<Printer> f1471e = new ArrayList();

    /* renamed from: g */
    private boolean f1472g = false;

    private C1385l() {
    }

    /* renamed from: a */
    public static C1385l m2262a() {
        if (f1467b == null) {
            synchronized (C1385l.class) {
                if (f1467b == null) {
                    f1467b = new C1385l();
                }
            }
        }
        return f1467b;
    }

    /* renamed from: a */
    private static void m2263a(List<? extends Printer> list, String str) {
        if (list != null && !list.isEmpty()) {
            try {
                int size = list.size();
                int i = 0;
                while (i < size) {
                    Printer printer = (Printer) list.get(i);
                    if (printer != null) {
                        printer.println(str);
                        i++;
                    } else {
                        return;
                    }
                }
            } catch (Throwable th) {
                C1321q.m1932a(th);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12729a(String str) {
        C1196f.m1353a(false);
        this.f1469c = -1;
        try {
            m2263a(this.f1470d, str);
        } catch (Exception e) {
            C1321q.m1932a((Throwable) e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo12730b(String str) {
        this.f1469c = SystemClock.uptimeMillis();
        try {
            m2263a(this.f1471e, str);
        } catch (Exception e) {
            C1321q.m1934b((Throwable) e);
        }
    }

    /* renamed from: b */
    public boolean mo12731b() {
        return this.f1469c != -1 && SystemClock.uptimeMillis() - this.f1469c > 5000;
    }
}
