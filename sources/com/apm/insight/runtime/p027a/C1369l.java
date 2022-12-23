package com.apm.insight.runtime.p027a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.C1227a;
import com.apm.insight.entity.Header;
import com.apm.insight.nativecrash.NativeCrashCollector;
import com.apm.insight.p026l.C1323s;

/* renamed from: com.apm.insight.runtime.a.l */
class C1369l extends C1356c {
    C1369l(Context context, C1353b bVar, C1358d dVar) {
        super(CrashType.NATIVE, context, bVar, dVar);
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
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo12671a() {
        return false;
    }

    /* renamed from: b */
    public int mo12687b() {
        return NativeCrashCollector.m1995a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo12692d() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo12696h(C1227a aVar) {
    }
}
