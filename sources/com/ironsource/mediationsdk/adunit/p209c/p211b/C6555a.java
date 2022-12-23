package com.ironsource.mediationsdk.adunit.p209c.p211b;

/* renamed from: com.ironsource.mediationsdk.adunit.c.b.a */
public final class C6555a {

    /* renamed from: a */
    public C6556a f16952a;

    /* renamed from: b */
    public long f16953b;

    /* renamed from: c */
    public long f16954c;

    /* renamed from: com.ironsource.mediationsdk.adunit.c.b.a$a */
    public enum C6556a {
        MANUAL,
        MANUAL_WITH_AUTOMATIC_RELOAD,
        AUTOMATIC_LOAD_AFTER_CLOSE,
        AUTOMATIC_LOAD_WHILE_SHOW
    }

    public C6555a(C6556a aVar, long j, long j2) {
        this.f16952a = aVar;
        this.f16953b = j;
        this.f16954c = j2;
    }

    /* renamed from: a */
    public final boolean mo36507a() {
        return this.f16952a == C6556a.MANUAL || this.f16952a == C6556a.MANUAL_WITH_AUTOMATIC_RELOAD;
    }

    /* renamed from: b */
    public final boolean mo36508b() {
        return this.f16952a == C6556a.AUTOMATIC_LOAD_AFTER_CLOSE || this.f16952a == C6556a.AUTOMATIC_LOAD_WHILE_SHOW;
    }
}
