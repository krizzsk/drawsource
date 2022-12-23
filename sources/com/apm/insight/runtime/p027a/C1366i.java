package com.apm.insight.runtime.p027a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.C1227a;
import com.apm.insight.entity.Header;
import com.apm.insight.p026l.C1323s;

/* renamed from: com.apm.insight.runtime.a.i */
public class C1366i extends C1356c {
    C1366i(Context context, C1353b bVar, C1358d dVar) {
        super(CrashType.ENSURE, context, bVar, dVar);
    }

    /* renamed from: a */
    public C1227a mo12670a(C1227a aVar) {
        C1227a a = super.mo12670a(aVar);
        mo12695g(a);
        C1323s.m1941a(a, (Header) null, this.f1422a);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo12671a() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo12690c() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo12692d() {
        return false;
    }
}
