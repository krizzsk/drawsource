package com.apm.insight.runtime;

import android.content.Context;
import android.text.TextUtils;
import com.apm.insight.C1250h;

/* renamed from: com.apm.insight.runtime.t */
public final class C1402t {

    /* renamed from: a */
    private String f1509a = null;

    /* renamed from: b */
    private int f1510b = -1;

    public C1402t(Context context) {
    }

    /* renamed from: a */
    public String mo12744a() {
        if (!TextUtils.isEmpty(this.f1509a) && !"0".equals(this.f1509a)) {
            return this.f1509a;
        }
        String d = C1250h.m1599a().mo12715d();
        this.f1509a = d;
        if (!TextUtils.isEmpty(d) && !"0".equals(this.f1509a)) {
            return this.f1509a;
        }
        String b = C1399s.m2333a().mo12739b();
        this.f1509a = b;
        return b;
    }

    /* renamed from: a */
    public void mo12745a(String str) {
        this.f1509a = str;
        C1399s.m2333a().mo12741b(str);
    }

    /* renamed from: b */
    public boolean mo12746b() {
        return this.f1509a != null;
    }
}
