package com.bytedance.sdk.openadsdk.core.p153i;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.bytedance.sdk.openadsdk.core.i.a */
/* compiled from: AdSlotSetter */
public class C3464a {

    /* renamed from: A */
    public int f8552A = 5;

    /* renamed from: a */
    public String f8553a;

    /* renamed from: b */
    public int f8554b = 1;

    /* renamed from: c */
    public int f8555c = 1;

    /* renamed from: d */
    public int f8556d = 2;

    /* renamed from: e */
    public int f8557e = 1;

    /* renamed from: f */
    public int f8558f = 100;

    /* renamed from: g */
    public int f8559g = 0;

    /* renamed from: h */
    public int f8560h = 2;

    /* renamed from: i */
    public int f8561i = 1;

    /* renamed from: j */
    public int f8562j = 3;

    /* renamed from: k */
    public int f8563k = -1;

    /* renamed from: l */
    public int f8564l = 1;

    /* renamed from: m */
    public int f8565m = 1;

    /* renamed from: n */
    public int f8566n = 2;

    /* renamed from: o */
    public int f8567o = 1500;

    /* renamed from: p */
    public int f8568p = 2;

    /* renamed from: q */
    public int f8569q = -1;

    /* renamed from: r */
    public int f8570r = 0;

    /* renamed from: s */
    public int f8571s = 5;

    /* renamed from: t */
    public boolean f8572t = false;

    /* renamed from: u */
    public int f8573u = 0;

    /* renamed from: v */
    public List<String> f8574v;

    /* renamed from: w */
    public int f8575w = 2;

    /* renamed from: x */
    public int f8576x = -1;

    /* renamed from: y */
    public int f8577y = 0;

    /* renamed from: z */
    public int f8578z = 0;

    /* renamed from: a */
    public static C3464a m10646a() {
        return new C3464a();
    }

    private C3464a() {
    }

    /* renamed from: a */
    public C3464a mo19791a(int i) {
        this.f8576x = i;
        return this;
    }

    /* renamed from: b */
    public C3464a mo19795b(int i) {
        this.f8570r = i;
        return this;
    }

    /* renamed from: c */
    public C3464a mo19796c(int i) {
        this.f8573u = i;
        return this;
    }

    /* renamed from: d */
    public C3464a mo19797d(int i) {
        this.f8569q = i;
        return this;
    }

    /* renamed from: e */
    public C3464a mo19798e(int i) {
        this.f8566n = i;
        return this;
    }

    /* renamed from: f */
    public C3464a mo19799f(int i) {
        this.f8567o = i;
        return this;
    }

    /* renamed from: g */
    public C3464a mo19800g(int i) {
        this.f8568p = i;
        return this;
    }

    /* renamed from: h */
    public C3464a mo19801h(int i) {
        this.f8564l = i;
        return this;
    }

    /* renamed from: i */
    public C3464a mo19802i(int i) {
        this.f8563k = i;
        return this;
    }

    /* renamed from: j */
    public C3464a mo19803j(int i) {
        this.f8562j = i;
        return this;
    }

    /* renamed from: a */
    public C3464a mo19792a(String str) {
        this.f8553a = str;
        return this;
    }

    /* renamed from: k */
    public C3464a mo19804k(int i) {
        this.f8554b = i;
        return this;
    }

    /* renamed from: l */
    public C3464a mo19805l(int i) {
        this.f8555c = i;
        return this;
    }

    /* renamed from: m */
    public C3464a mo19806m(int i) {
        this.f8556d = i;
        return this;
    }

    /* renamed from: n */
    public C3464a mo19807n(int i) {
        this.f8557e = i;
        return this;
    }

    /* renamed from: o */
    public C3464a mo19808o(int i) {
        this.f8558f = i;
        return this;
    }

    /* renamed from: p */
    public C3464a mo19809p(int i) {
        this.f8559g = i;
        return this;
    }

    /* renamed from: q */
    public C3464a mo19810q(int i) {
        this.f8560h = i;
        return this;
    }

    /* renamed from: r */
    public C3464a mo19811r(int i) {
        this.f8561i = i;
        return this;
    }

    /* renamed from: s */
    public C3464a mo19812s(int i) {
        this.f8565m = i;
        return this;
    }

    /* renamed from: t */
    public C3464a mo19813t(int i) {
        this.f8575w = i;
        return this;
    }

    /* renamed from: a */
    public C3464a mo19793a(JSONArray jSONArray) {
        if (!(jSONArray == null || jSONArray.length() == 0)) {
            this.f8574v = new ArrayList();
            int i = 0;
            while (i < jSONArray.length()) {
                try {
                    this.f8574v.add(jSONArray.get(i).toString());
                    i++;
                } catch (Exception unused) {
                }
            }
        }
        return this;
    }

    /* renamed from: u */
    public C3464a mo19814u(int i) {
        this.f8571s = i;
        return this;
    }

    /* renamed from: a */
    public C3464a mo19794a(boolean z) {
        this.f8572t = z;
        return this;
    }

    /* renamed from: v */
    public C3464a mo19815v(int i) {
        this.f8577y = i;
        return this;
    }

    /* renamed from: w */
    public C3464a mo19816w(int i) {
        this.f8578z = i;
        return this;
    }

    /* renamed from: x */
    public C3464a mo19817x(int i) {
        this.f8552A = i;
        return this;
    }
}
