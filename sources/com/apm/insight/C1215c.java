package com.apm.insight;

import com.apm.insight.p020f.C1234a;
import com.apm.insight.p020f.C1235b;
import com.apm.insight.p026l.C1309j;
import com.apm.insight.runtime.C1387m;
import java.util.Map;

/* renamed from: com.apm.insight.c */
public class C1215c {
    public C1215c() {
        C1234a.m1535a();
    }

    /* renamed from: a */
    public void mo12439a(String str) {
        mo12440a(str, "EnsureNotReachHere", (Map<String, String>) null);
    }

    /* renamed from: a */
    public void mo12440a(String str, String str2, Map<String, String> map) {
        if (C1250h.m1617i().isEnsureEnable()) {
            C1235b.m1544a(Thread.currentThread().getStackTrace(), 5, str, str2, map);
        }
    }

    /* renamed from: a */
    public void mo12441a(String str, Throwable th) {
        C1387m.m2270a(th, str);
    }

    /* renamed from: a */
    public void mo12442a(Throwable th, String str) {
        if (mo12443a(th)) {
            C1235b.m1539a(th, str, true);
        }
    }

    /* renamed from: a */
    public boolean mo12443a(Throwable th) {
        return C1250h.m1617i().isEnsureEnable() && !C1309j.m1851a(th);
    }
}
