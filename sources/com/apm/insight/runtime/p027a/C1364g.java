package com.apm.insight.runtime.p027a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.C1227a;
import com.apm.insight.entity.Header;

@Deprecated
/* renamed from: com.apm.insight.runtime.a.g */
class C1364g extends C1356c {
    C1364g(Context context, C1353b bVar, C1358d dVar) {
        super(CrashType.CUSTOM_JAVA, context, bVar, dVar);
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
        return a;
    }
}
