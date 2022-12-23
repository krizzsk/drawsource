package com.apm.insight.runtime.p027a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.C1227a;
import com.apm.insight.entity.Header;
import com.apm.insight.p023i.C1257a;
import com.apm.insight.p026l.C1323s;

/* renamed from: com.apm.insight.runtime.a.k */
class C1368k extends C1356c {
    C1368k(Context context, C1353b bVar, C1358d dVar) {
        super(CrashType.LAUNCH, context, bVar, dVar);
    }

    /* renamed from: a */
    public C1227a mo12685a(int i, C1227a aVar) {
        C1227a a = super.mo12685a(i, aVar);
        if (i == 0) {
            Header a2 = Header.m1440a(this.f1423b);
            a2.mo12461c();
            a.mo12467a(a2);
            C1323s.m1941a(a, a2, this.f1422a);
        } else if (i == 1) {
            Header i2 = a.mo12489i();
            i2.mo12462d();
            i2.mo12463e();
        } else if (i == 2) {
            Header.m1442a(a.mo12489i());
            try {
                a.mo12489i().mo12464f().put("launch_did", C1257a.m1646a(this.f1423b));
            } catch (Throwable unused) {
            }
        } else if (i == 5) {
            Header.m1445b(a.mo12489i());
        }
        return a;
    }
}
