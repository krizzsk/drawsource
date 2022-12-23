package com.tapjoy.internal;

/* renamed from: com.tapjoy.internal.fa */
public enum C11445fa implements C11418eo {
    APP(0),
    CAMPAIGN(1),
    CUSTOM(2),
    USAGES(3);
    

    /* renamed from: e */
    public static final C11400el<C11445fa> f27367e = null;

    /* renamed from: f */
    private final int f27369f;

    static {
        f27367e = new C11446a();
    }

    private C11445fa(int i) {
        this.f27369f = i;
    }

    /* renamed from: a */
    public static C11445fa m31393a(int i) {
        if (i == 0) {
            return APP;
        }
        if (i == 1) {
            return CAMPAIGN;
        }
        if (i == 2) {
            return CUSTOM;
        }
        if (i != 3) {
            return null;
        }
        return USAGES;
    }

    /* renamed from: a */
    public final int mo69871a() {
        return this.f27369f;
    }

    /* renamed from: com.tapjoy.internal.fa$a */
    static final class C11446a extends C11394eh<C11445fa> {
        C11446a() {
            super(C11445fa.class);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C11418eo mo69842a(int i) {
            return C11445fa.m31393a(i);
        }
    }
}
