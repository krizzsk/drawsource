package com.unity3d.services.core.timer;

import com.unity3d.services.core.lifecycle.C12059a;
import com.unity3d.services.core.lifecycle.C12060b;
import com.unity3d.services.core.lifecycle.C12061c;
import com.unity3d.services.core.lifecycle.C12063e;
import com.unity3d.services.core.log.C12065a;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.unity3d.services.core.timer.a */
/* compiled from: BaseTimer */
public class C12125a implements C12129c, C12060b {

    /* renamed from: a */
    private final C12061c f29598a;

    /* renamed from: b */
    final Integer f29599b;

    /* renamed from: c */
    final Integer f29600c;

    /* renamed from: d */
    Integer f29601d;

    /* renamed from: e */
    private C12133g f29602e;

    /* renamed from: f */
    private ScheduledFuture<?> f29603f;

    /* renamed from: g */
    private ScheduledExecutorService f29604g;

    /* renamed from: h */
    private final AtomicBoolean f29605h;

    /* renamed from: i */
    private final AtomicBoolean f29606i;

    /* renamed from: com.unity3d.services.core.timer.a$a */
    /* compiled from: BaseTimer */
    class C12126a implements Runnable {
        C12126a() {
        }

        public void run() {
            C12125a aVar = C12125a.this;
            aVar.f29601d = Integer.valueOf(aVar.f29601d.intValue() - C12125a.this.f29600c.intValue());
            C12125a.this.mo71294d();
        }
    }

    /* renamed from: com.unity3d.services.core.timer.a$b */
    /* compiled from: BaseTimer */
    static /* synthetic */ class C12127b {

        /* renamed from: a */
        static final /* synthetic */ int[] f29608a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.unity3d.services.core.lifecycle.e[] r0 = com.unity3d.services.core.lifecycle.C12063e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f29608a = r0
                com.unity3d.services.core.lifecycle.e r1 = com.unity3d.services.core.lifecycle.C12063e.PAUSED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29608a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.unity3d.services.core.lifecycle.e r1 = com.unity3d.services.core.lifecycle.C12063e.RESUMED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.timer.C12125a.C12127b.<clinit>():void");
        }
    }

    public C12125a(Integer num, C12133g gVar, C12061c cVar) {
        this.f29600c = 1000;
        this.f29605h = new AtomicBoolean(false);
        this.f29606i = new AtomicBoolean(false);
        this.f29599b = num;
        this.f29601d = num;
        this.f29602e = gVar;
        this.f29598a = cVar;
        if (cVar != null) {
            cVar.mo71189a(this);
        }
    }

    /* renamed from: c */
    private void m33076c() {
        C12133g gVar = this.f29602e;
        if (gVar != null) {
            gVar.mo70829a();
        }
    }

    /* renamed from: g */
    private void m33077g() {
        try {
            this.f29603f = this.f29604g.scheduleAtFixedRate(new C12126a(), (long) this.f29600c.intValue(), (long) this.f29600c.intValue(), TimeUnit.MILLISECONDS);
        } catch (IllegalArgumentException | IllegalStateException | NullPointerException | RejectedExecutionException e) {
            C12065a.m32845b("ERROR: IntervalTimer failed to start due to exception " + e.getLocalizedMessage());
        }
    }

    /* renamed from: a */
    public void mo71292a(ScheduledExecutorService scheduledExecutorService) {
        if (this.f29605h.compareAndSet(false, true)) {
            this.f29604g = scheduledExecutorService;
            m33077g();
        }
    }

    /* renamed from: b */
    public boolean mo71293b() {
        return this.f29605h.get();
    }

    /* renamed from: d */
    public void mo71294d() {
        if (this.f29601d.intValue() <= 0) {
            m33076c();
            mo71291a();
        }
    }

    /* renamed from: e */
    public boolean mo71295e() {
        ScheduledFuture<?> scheduledFuture = this.f29603f;
        boolean z = true;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            z = false;
        } else {
            this.f29603f.cancel(true);
            this.f29603f = null;
        }
        this.f29605h.getAndSet(false);
        return z;
    }

    /* renamed from: f */
    public boolean mo71296f() {
        boolean z;
        ScheduledExecutorService scheduledExecutorService = this.f29604g;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
            z = false;
        } else {
            z = true;
            m33077g();
        }
        this.f29605h.getAndSet(z);
        return z;
    }

    /* renamed from: h */
    public void mo71297h() {
        ScheduledExecutorService scheduledExecutorService = this.f29604g;
        if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
            this.f29604g.shutdown();
            this.f29604g = null;
        }
        this.f29605h.getAndSet(false);
    }

    /* renamed from: a */
    public void mo71291a() {
        mo71297h();
        C12061c cVar = this.f29598a;
        if (cVar != null) {
            cVar.mo71192b(this);
        }
        this.f29602e = null;
    }

    /* renamed from: a */
    public void mo71188a(C12063e eVar) {
        int i = C12127b.f29608a[eVar.ordinal()];
        if (i != 1) {
            if (i == 2 && this.f29606i.get()) {
                this.f29606i.getAndSet(false);
                mo71296f();
            }
        } else if (mo71293b()) {
            mo71295e();
            this.f29606i.getAndSet(true);
        }
    }

    public C12125a(Integer num, C12133g gVar) {
        this(num, gVar, C12059a.m32828a());
    }
}
