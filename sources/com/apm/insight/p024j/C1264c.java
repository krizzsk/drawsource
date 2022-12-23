package com.apm.insight.p024j;

import android.os.Handler;
import android.text.TextUtils;
import com.apm.insight.C1250h;
import com.apm.insight.p026l.C1321q;

/* renamed from: com.apm.insight.j.c */
public class C1264c extends C1261a {
    C1264c(Handler handler, long j, long j2) {
        super(handler, j, j2);
    }

    public void run() {
        String str;
        if (!C1250h.m1611c().mo12746b()) {
            String d = C1250h.m1599a().mo12715d();
            if (TextUtils.isEmpty(d) || "0".equals(d)) {
                mo12536a(mo12538c());
                str = "[DeviceIdTask] did is null, continue check.";
            } else {
                C1250h.m1611c().mo12745a(d);
                str = "[DeviceIdTask] did is " + d;
            }
            C1321q.m1927a((Object) str);
        }
    }
}
