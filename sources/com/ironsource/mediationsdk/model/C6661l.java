package com.ironsource.mediationsdk.model;

/* renamed from: com.ironsource.mediationsdk.model.l */
public final class C6661l {

    /* renamed from: a */
    public boolean f17374a;

    /* renamed from: b */
    public boolean f17375b;

    /* renamed from: c */
    public boolean f17376c;

    /* renamed from: d */
    public C6663m f17377d;

    /* renamed from: e */
    public int f17378e;

    /* renamed from: f */
    public int f17379f;

    /* renamed from: com.ironsource.mediationsdk.model.l$a */
    public static class C6662a {

        /* renamed from: a */
        public boolean f17380a = true;

        /* renamed from: b */
        private boolean f17381b = false;

        /* renamed from: c */
        private boolean f17382c = false;

        /* renamed from: d */
        private C6663m f17383d = null;

        /* renamed from: e */
        private int f17384e = 0;

        /* renamed from: f */
        private int f17385f = 0;

        /* renamed from: a */
        public final C6662a mo36784a(boolean z, int i) {
            this.f17382c = z;
            this.f17385f = i;
            return this;
        }

        /* renamed from: a */
        public final C6662a mo36785a(boolean z, C6663m mVar, int i) {
            this.f17381b = z;
            if (mVar == null) {
                mVar = C6663m.PER_DAY;
            }
            this.f17383d = mVar;
            this.f17384e = i;
            return this;
        }

        /* renamed from: a */
        public final C6661l mo36786a() {
            return new C6661l(this.f17380a, this.f17381b, this.f17382c, this.f17383d, this.f17384e, this.f17385f, (byte) 0);
        }
    }

    private C6661l(boolean z, boolean z2, boolean z3, C6663m mVar, int i, int i2) {
        this.f17374a = z;
        this.f17375b = z2;
        this.f17376c = z3;
        this.f17377d = mVar;
        this.f17378e = i;
        this.f17379f = i2;
    }

    /* synthetic */ C6661l(boolean z, boolean z2, boolean z3, C6663m mVar, int i, int i2, byte b) {
        this(z, z2, z3, mVar, i, i2);
    }
}
