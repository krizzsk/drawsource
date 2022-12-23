package com.ogury.p377ed.internal;

/* renamed from: com.ogury.ed.internal.cw */
public final class C9918cw<T> implements C9911cr {

    /* renamed from: a */
    public static final C9919a f24963a = new C9919a((byte) 0);

    /* renamed from: b */
    private final C10227lj<T> f24964b;

    /* renamed from: c */
    private boolean f24965c;

    /* renamed from: d */
    private C10228lk<? super Throwable, C10182ke> f24966d;

    public /* synthetic */ C9918cw(C10227lj ljVar, byte b) {
        this(ljVar);
    }

    private C9918cw(C10227lj<? extends T> ljVar) {
        this.f24964b = ljVar;
    }

    /* renamed from: a */
    public final void mo64446a() {
        this.f24966d = null;
        this.f24965c = true;
    }

    /* renamed from: com.ogury.ed.internal.cw$a */
    public static final class C9919a {
        public /* synthetic */ C9919a(byte b) {
            this();
        }

        private C9919a() {
        }

        /* renamed from: a */
        public static <T> C9918cw<T> m28640a(C10227lj<? extends T> ljVar) {
            C10263mq.m29882b(ljVar, "callable");
            return new C9918cw<>(ljVar, (byte) 0);
        }
    }

    /* renamed from: a */
    public final C9918cw<T> mo64450a(C10228lk<? super Throwable, C10182ke> lkVar) {
        C10263mq.m29882b(lkVar, "consumer");
        this.f24966d = lkVar;
        return this;
    }

    /* renamed from: b */
    public final C9911cr mo64451b(C10228lk<? super T, C10182ke> lkVar) {
        C10263mq.m29882b(lkVar, "consumer");
        C9914cu cuVar = C9914cu.f24957a;
        C9914cu.m28622b().mo64443a(new Runnable(lkVar) {
            public final /* synthetic */ C10228lk f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C9918cw.m28634a(C9918cw.this, this.f$1);
            }
        });
        return this;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m28634a(C9918cw cwVar, C10228lk lkVar) {
        C10263mq.m29882b(cwVar, "this$0");
        C10263mq.m29882b(lkVar, "$consumer");
        try {
            cwVar.m28636a(lkVar, cwVar.f24964b.mo64355a());
        } catch (Throwable th) {
            C10228lk<? super Throwable, C10182ke> lkVar2 = cwVar.f24966d;
            if (lkVar2 != null) {
                cwVar.m28636a(lkVar2, th);
            }
        }
    }

    /* renamed from: a */
    private final <R> void m28636a(C10228lk<? super R, C10182ke> lkVar, R r) {
        C9914cu cuVar = C9914cu.f24957a;
        C9914cu.m28623c().mo64443a(new Runnable(lkVar, r) {
            public final /* synthetic */ C10228lk f$1;
            public final /* synthetic */ Object f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C9918cw.m28635a(C9918cw.this, this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m28635a(C9918cw cwVar, C10228lk lkVar, Object obj) {
        C10263mq.m29882b(cwVar, "this$0");
        C10263mq.m29882b(lkVar, "$consumer");
        if (!cwVar.f24965c) {
            lkVar.mo64242a(obj);
        }
    }
}
