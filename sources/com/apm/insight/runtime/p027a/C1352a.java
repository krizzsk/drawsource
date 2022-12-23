package com.apm.insight.runtime.p027a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.C1227a;
import com.apm.insight.entity.Header;
import com.apm.insight.p026l.C1295a;
import com.apm.insight.p026l.C1323s;

/* renamed from: com.apm.insight.runtime.a.a */
class C1352a extends C1356c {
    C1352a(Context context, C1353b bVar, C1358d dVar) {
        super(CrashType.ANR, context, bVar, dVar);
    }

    /* renamed from: a */
    public C1227a mo12670a(C1227a aVar) {
        C1227a a = super.mo12670a(aVar);
        Header a2 = Header.m1440a(this.f1423b);
        Header.m1442a(a2);
        Header.m1445b(a2);
        a2.mo12461c();
        a2.mo12462d();
        a2.mo12463e();
        a.mo12467a(a2);
        a.mo12474a("process_name", (Object) C1295a.m1782c(this.f1423b));
        C1323s.m1941a(a, a2, this.f1422a);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo12671a() {
        return true;
    }
}
