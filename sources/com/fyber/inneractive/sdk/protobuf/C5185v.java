package com.fyber.inneractive.sdk.protobuf;

/* renamed from: com.fyber.inneractive.sdk.protobuf.v */
public enum C5185v {
    DOUBLE_LIST_PACKED(35, r4, r8),
    SINT64_LIST_PACKED(48, r4, r12);
    

    /* renamed from: e */
    public static final C5185v[] f13743e = null;

    /* renamed from: a */
    public final int f13745a;

    /* renamed from: b */
    public final C5186a f13746b;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.v$a */
    public enum C5186a {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);
        

        /* renamed from: a */
        public final boolean f13752a;

        /* access modifiers changed from: public */
        C5186a(boolean z) {
            this.f13752a = z;
        }
    }

    /* access modifiers changed from: public */
    static {
        int i;
        C5185v[] values = values();
        f13743e = new C5185v[values.length];
        for (C5185v vVar : values) {
            f13743e[vVar.f13745a] = vVar;
        }
    }

    /* access modifiers changed from: public */
    C5185v(int i, C5186a aVar, C5065b0 b0Var) {
        this.f13745a = i;
        this.f13746b = aVar;
        int ordinal = aVar.ordinal();
        if (ordinal == 1) {
            b0Var.getClass();
        } else if (ordinal == 3) {
            b0Var.getClass();
        }
        if (aVar == C5186a.SCALAR) {
            b0Var.ordinal();
        }
    }
}
