package com.apm.insight.p014b;

import android.os.SystemClock;
import com.apm.insight.runtime.C1370b;
import com.apm.insight.runtime.C1394p;

/* renamed from: com.apm.insight.b.c */
public class C1191c {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static long f993b;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1188b f994a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f995c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Runnable f996d = new Runnable() {
        public void run() {
            if (!C1191c.this.f995c) {
                C1191c.this.f994a.mo12407d();
                long unused = C1191c.f993b = SystemClock.uptimeMillis();
                boolean a = C1196f.m1354a();
                C1394p.m2321b().mo12750a(C1191c.this.f996d, 500);
                C1370b.m2214a(C1191c.f993b);
            }
        }
    };

    C1191c(C1188b bVar) {
        this.f994a = bVar;
        C1394p.m2321b().mo12750a(this.f996d, 5000);
    }

    /* renamed from: c */
    public static boolean m1340c() {
        return SystemClock.uptimeMillis() - f993b <= 15000;
    }

    /* renamed from: a */
    public void mo12412a() {
        if (!this.f995c) {
            C1394p.m2321b().mo12750a(this.f996d, 5000);
        }
    }

    /* renamed from: b */
    public void mo12413b() {
        this.f995c = true;
    }
}
