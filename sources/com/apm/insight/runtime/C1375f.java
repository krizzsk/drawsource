package com.apm.insight.runtime;

import com.apm.insight.C1250h;
import com.apm.insight.entity.Header;

/* renamed from: com.apm.insight.runtime.f */
public class C1375f {

    /* renamed from: b */
    private static final C1375f f1453b = new C1375f() {

        /* renamed from: a */
        Header f1455a = null;

        /* renamed from: b */
        public Object mo12723b(String str) {
            if (this.f1455a == null) {
                this.f1455a = Header.m1444b(C1250h.m1615g());
            }
            return this.f1455a.mo12464f().opt(str);
        }
    };

    /* renamed from: a */
    private C1375f f1454a;

    C1375f() {
        this(f1453b);
    }

    C1375f(C1375f fVar) {
        this.f1454a = null;
        this.f1454a = fVar;
    }

    /* renamed from: a */
    public Object mo12669a(String str) {
        C1375f fVar = this.f1454a;
        if (fVar != null) {
            return fVar.mo12669a(str);
        }
        return null;
    }

    /* renamed from: b */
    public Object mo12723b(String str) {
        C1375f fVar = this.f1454a;
        if (fVar != null) {
            return fVar.mo12723b(str);
        }
        return null;
    }
}
