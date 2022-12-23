package com.ogury.p377ed.internal;

import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.fe */
public final class C10018fe {

    /* renamed from: a */
    private final boolean f25194a;

    /* renamed from: b */
    private final long f25195b;

    /* renamed from: c */
    private final JSONObject f25196c;

    /* renamed from: d */
    private final boolean f25197d;

    /* renamed from: e */
    private final String f25198e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10018fe)) {
            return false;
        }
        C10018fe feVar = (C10018fe) obj;
        return this.f25194a == feVar.f25194a && this.f25195b == feVar.f25195b && C10263mq.m29881a((Object) this.f25196c, (Object) feVar.f25196c) && this.f25197d == feVar.f25197d && C10263mq.m29881a((Object) this.f25198e, (Object) feVar.f25198e);
    }

    public final int hashCode() {
        boolean z = this.f25194a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode = (((((z ? 1 : 0) * true) + Long.hashCode(this.f25195b)) * 31) + this.f25196c.hashCode()) * 31;
        boolean z3 = this.f25197d;
        if (!z3) {
            z2 = z3;
        }
        int i = (hashCode + (z2 ? 1 : 0)) * 31;
        String str = this.f25198e;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ProfigRequest(allowRequest=" + this.f25194a + ", jobScheduleWindow=" + this.f25195b + ", request=" + this.f25196c + ", profigEnabled=" + this.f25197d + ", profigHash=" + this.f25198e + ')';
    }

    public /* synthetic */ C10018fe(long j, JSONObject jSONObject, boolean z) {
        this(false, j, jSONObject, z, (String) null);
    }

    public C10018fe(boolean z, long j, JSONObject jSONObject, boolean z2, String str) {
        C10263mq.m29882b(jSONObject, "request");
        this.f25194a = z;
        this.f25195b = j;
        this.f25196c = jSONObject;
        this.f25197d = z2;
        this.f25198e = str;
    }

    /* renamed from: a */
    public final boolean mo64650a() {
        return this.f25194a;
    }

    /* renamed from: b */
    public final JSONObject mo64651b() {
        return this.f25196c;
    }

    /* renamed from: c */
    public final String mo64652c() {
        return this.f25198e;
    }
}
