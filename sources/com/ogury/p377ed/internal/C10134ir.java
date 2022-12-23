package com.ogury.p377ed.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ogury.ed.internal.ir */
public final class C10134ir {

    /* renamed from: a */
    private final C10131io f25445a;

    /* renamed from: b */
    private final List<C10133iq> f25446b;

    /* renamed from: c */
    private final C10127il f25447c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f25448d;

    /* renamed from: e */
    private int f25449e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f25450f;

    /* renamed from: g */
    private Handler f25451g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C10130in f25452h;

    /* renamed from: i */
    private C10119if f25453i;

    private C10134ir(C10131io ioVar) {
        C10263mq.m29882b(ioVar, "loadStrategyFactory");
        this.f25445a = ioVar;
        this.f25446b = new LinkedList();
        this.f25447c = m29550c();
        this.f25451g = new Handler(Looper.getMainLooper());
    }

    public /* synthetic */ C10134ir() {
        this(new C10131io());
    }

    /* renamed from: a */
    public final C10119if mo64917a() {
        return this.f25453i;
    }

    /* renamed from: a */
    public final void mo64918a(C10119if ifVar) {
        this.f25453i = ifVar;
    }

    /* renamed from: com.ogury.ed.internal.ir$a */
    public static final class C10135a implements C10127il {

        /* renamed from: a */
        final /* synthetic */ C10134ir f25454a;

        C10135a(C10134ir irVar) {
            this.f25454a = irVar;
        }

        /* renamed from: a */
        public final void mo64915a(C9981eb ebVar) {
            C10263mq.m29882b(ebVar, "ad");
            C10119if a = this.f25454a.mo64917a();
            if (a != null) {
                a.mo64900a(ebVar);
            }
            C10134ir irVar = this.f25454a;
            irVar.f25448d = irVar.f25448d + 1;
            C10130in b = this.f25454a.f25452h;
            if (b != null) {
                b.mo64907a();
            }
            this.f25454a.m29552d();
        }

        /* renamed from: a */
        public final void mo64914a() {
            C10134ir irVar = this.f25454a;
            irVar.f25448d = irVar.f25448d + 1;
            C10130in b = this.f25454a.f25452h;
            if (b != null) {
                b.mo64907a();
            }
            if (this.f25454a.m29554e() && !this.f25454a.f25450f) {
                this.f25454a.m29558g();
            }
        }

        /* renamed from: b */
        public final void mo64916b() {
            this.f25454a.m29560h();
        }
    }

    /* renamed from: c */
    private final C10127il m29550c() {
        return new C10135a(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m29552d() {
        if (m29557f()) {
            m29560h();
        } else if (m29554e()) {
            m29558g();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final boolean m29554e() {
        return this.f25448d == this.f25446b.size();
    }

    /* renamed from: f */
    private final boolean m29557f() {
        return this.f25449e == 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m29558g() {
        this.f25446b.clear();
        m29562i();
        C10119if ifVar = this.f25453i;
        if (ifVar != null) {
            ifVar.mo64899a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m29560h() {
        m29562i();
        this.f25450f = true;
        C10119if ifVar = this.f25453i;
        if (ifVar != null) {
            ifVar.mo64901b();
        }
    }

    /* renamed from: a */
    public final void mo64920a(C10133iq iqVar) {
        C10263mq.m29882b(iqVar, "command");
        this.f25446b.add(iqVar);
    }

    /* renamed from: a */
    public final void mo64919a(C10122ii iiVar, long j, int i) {
        C10263mq.m29882b(iiVar, "chromeVersionHelper");
        this.f25449e = i;
        C10130in a = C10131io.m29539a(this.f25447c, iiVar);
        this.f25452h = a;
        if (a != null) {
            a.mo64908a(this.f25446b);
        }
        m29547a(j);
    }

    /* renamed from: i */
    private final void m29562i() {
        this.f25451g.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: a */
    private final void m29547a(long j) {
        C10263mq.m29874a("load timeout ", (Object) Long.valueOf(j));
        this.f25451g.postDelayed(new Runnable() {
            public final void run() {
                C10134ir.m29561h(C10134ir.this);
            }
        }, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final void m29561h(C10134ir irVar) {
        C10263mq.m29882b(irVar, "this$0");
        irVar.m29563j();
    }

    /* renamed from: j */
    private final void m29563j() {
        if (m29565l()) {
            m29564k();
            m29558g();
            return;
        }
        m29566m();
        C10119if ifVar = this.f25453i;
        if (ifVar != null) {
            ifVar.mo64901b();
        }
    }

    /* renamed from: k */
    private final void m29564k() {
        for (C10133iq next : this.f25446b) {
            if (next instanceof C10128im) {
                next.mo64911b();
            }
        }
    }

    /* renamed from: l */
    private final boolean m29565l() {
        for (C10133iq next : this.f25446b) {
            if (!next.mo64910a() && !(next instanceof C10128im)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    private final void m29566m() {
        for (C10133iq b : this.f25446b) {
            b.mo64911b();
        }
    }

    /* renamed from: b */
    public final void mo64921b() {
        m29562i();
        m29566m();
        this.f25446b.clear();
        this.f25448d = 0;
        this.f25450f = false;
    }
}
