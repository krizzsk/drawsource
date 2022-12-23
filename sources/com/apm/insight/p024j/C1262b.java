package com.apm.insight.p024j;

import android.content.Context;
import android.os.Handler;
import com.apm.insight.C1250h;
import com.apm.insight.entity.C1228b;
import com.apm.insight.runtime.C1373d;
import com.apm.insight.runtime.C1394p;
import com.apm.insight.runtime.C1399s;
import java.util.Map;

/* renamed from: com.apm.insight.j.b */
public class C1262b extends C1261a {

    /* renamed from: b */
    private static Runnable f1216b = new Runnable() {
        public void run() {
            C1394p.m2321b().mo12747a().removeCallbacks(this);
            C1394p.m2321b().mo12749a((Runnable) new C1262b(C1394p.m2321b().mo12747a(), 0, 30000, C1250h.m1615g()));
        }
    };

    /* renamed from: a */
    private Context f1217a;

    public C1262b(Handler handler, long j, long j2, Context context) {
        super(handler, j, j2);
        this.f1217a = context;
    }

    /* renamed from: d */
    public static void m1661d() {
        C1394p.m2321b().mo12750a(f1216b, 100);
    }

    public void run() {
        Map<String, Object> map;
        try {
            map = C1250h.m1599a().mo12714c().getCommonParams();
        } catch (Throwable unused) {
            map = null;
        }
        if (map != null) {
            try {
                if (C1373d.m2226a(map)) {
                    mo12536a(mo12538c());
                    return;
                }
            } catch (Throwable unused2) {
                return;
            }
        }
        C1399s.m2333a().mo12738a(map, C1228b.m1510b());
    }
}
