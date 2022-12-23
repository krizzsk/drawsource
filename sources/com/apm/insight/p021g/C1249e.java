package com.apm.insight.p021g;

import com.apm.insight.C1250h;
import com.apm.insight.p026l.C1322r;
import com.apm.insight.runtime.p027a.C1353b;

/* renamed from: com.apm.insight.g.e */
public class C1249e {
    /* renamed from: a */
    public static boolean m1598a(long j) {
        if (C1322r.m1939a(2)) {
            return true;
        }
        if (C1322r.m1939a(1024)) {
            return false;
        }
        return (C1353b.m2131c() == -1 || j - C1353b.m2131c() <= C1250h.m1617i().getLaunchCrashInterval()) && (!C1250h.m1621m() || C1250h.m1624p() != 0);
    }
}
