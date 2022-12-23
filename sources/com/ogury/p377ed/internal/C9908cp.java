package com.ogury.p377ed.internal;

/* renamed from: com.ogury.ed.internal.cp */
public final class C9908cp implements C9911cr {

    /* renamed from: a */
    public static final C9909a f24951a = new C9909a((byte) 0);

    /* renamed from: b */
    private final C10227lj<C10182ke> f24952b;

    /* renamed from: c */
    private boolean f24953c;

    /* renamed from: d */
    private C10228lk<? super Throwable, C10182ke> f24954d;

    public /* synthetic */ C9908cp(C10227lj ljVar, byte b) {
        this(ljVar);
    }

    private C9908cp(C10227lj<C10182ke> ljVar) {
        this.f24952b = ljVar;
    }

    /* renamed from: a */
    public final void mo64446a() {
        this.f24954d = null;
        this.f24953c = true;
    }

    /* renamed from: com.ogury.ed.internal.cp$a */
    public static final class C9909a {
        public /* synthetic */ C9909a(byte b) {
            this();
        }

        private C9909a() {
        }

        /* renamed from: a */
        public static C9908cp m28615a(C10227lj<C10182ke> ljVar) {
            C10263mq.m29882b(ljVar, "action");
            return new C9908cp(ljVar, (byte) 0);
        }
    }

    /* renamed from: a */
    public final C9908cp mo64444a(C10228lk<? super Throwable, C10182ke> lkVar) {
        C10263mq.m29882b(lkVar, "consumer");
        this.f24954d = lkVar;
        return this;
    }

    /* renamed from: a */
    public final C9911cr mo64445a(C10227lj<C10182ke> ljVar) {
        C10263mq.m29882b(ljVar, "subscribedAction");
        C9914cu cuVar = C9914cu.f24957a;
        C9914cu.m28622b().mo64443a(new Runnable(ljVar) {
            public final /* synthetic */ C10227lj f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C9908cp.m28607a(C9908cp.this, this.f$1);
            }
        });
        return this;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m28607a(C9908cp cpVar, C10227lj ljVar) {
        C10263mq.m29882b(cpVar, "this$0");
        C10263mq.m29882b(ljVar, "$subscribedAction");
        try {
            cpVar.f24952b.mo64355a();
            cpVar.m28611b(ljVar);
        } catch (Throwable th) {
            C10228lk<? super Throwable, C10182ke> lkVar = cpVar.f24954d;
            if (lkVar != null) {
                cpVar.m28609a(lkVar, th);
            }
        }
    }

    /* renamed from: b */
    private final void m28611b(C10227lj<C10182ke> ljVar) {
        C9914cu cuVar = C9914cu.f24957a;
        C9914cu.m28623c().mo64443a(new Runnable(ljVar) {
            public final /* synthetic */ C10227lj f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C9908cp.m28610b(C9908cp.this, this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m28610b(C9908cp cpVar, C10227lj ljVar) {
        C10263mq.m29882b(cpVar, "this$0");
        C10263mq.m29882b(ljVar, "$action");
        if (!cpVar.f24953c) {
            ljVar.mo64355a();
        }
    }

    /* renamed from: a */
    private final <R> void m28609a(C10228lk<? super R, C10182ke> lkVar, R r) {
        C9914cu cuVar = C9914cu.f24957a;
        C9914cu.m28623c().mo64443a(new Runnable(lkVar, r) {
            public final /* synthetic */ C10228lk f$1;
            public final /* synthetic */ Object f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C9908cp.m28608a(C9908cp.this, this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m28608a(C9908cp cpVar, C10228lk lkVar, Object obj) {
        C10263mq.m29882b(cpVar, "this$0");
        C10263mq.m29882b(lkVar, "$consumer");
        if (!cpVar.f24953c) {
            lkVar.mo64242a(obj);
        }
    }
}
