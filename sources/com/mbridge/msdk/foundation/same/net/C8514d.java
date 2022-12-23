package com.mbridge.msdk.foundation.same.net;

import android.os.Handler;
import com.mbridge.msdk.foundation.same.net.p306a.C8508a;
import java.util.concurrent.Executor;

/* renamed from: com.mbridge.msdk.foundation.same.net.d */
/* compiled from: ExecutorDelivery */
public class C8514d implements C8511c {

    /* renamed from: a */
    private final String f20865a = C8514d.class.getSimpleName();

    /* renamed from: b */
    private final Executor f20866b;

    public C8514d(final Handler handler) {
        this.f20866b = new Executor() {
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    /* renamed from: a */
    public final void mo57927a(C8554i<?> iVar, C8557k<?> kVar) {
        Executor executor = this.f20866b;
        if (executor != null) {
            executor.execute(new C8522a(iVar, kVar));
        }
    }

    /* renamed from: a */
    public final void mo57926a(C8554i<?> iVar, C8508a aVar) {
        if (this.f20866b != null) {
            this.f20866b.execute(new C8522a(iVar, C8557k.m24540a(aVar)));
        }
    }

    /* renamed from: a */
    public final void mo57924a(final C8554i<?> iVar) {
        Executor executor = this.f20866b;
        if (executor != null) {
            executor.execute(new Runnable() {
                public final void run() {
                    iVar.mo58009p();
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo57928b(final C8554i<?> iVar) {
        Executor executor = this.f20866b;
        if (executor != null) {
            executor.execute(new Runnable() {
                public final void run() {
                    iVar.mo58007n();
                }
            });
        }
    }

    /* renamed from: c */
    public final void mo57929c(final C8554i<?> iVar) {
        Executor executor = this.f20866b;
        if (executor != null) {
            executor.execute(new Runnable() {
                public final void run() {
                    iVar.mo58008o();
                }
            });
        }
    }

    /* renamed from: d */
    public final void mo57930d(final C8554i<?> iVar) {
        Executor executor = this.f20866b;
        if (executor != null) {
            executor.execute(new Runnable() {
                public final void run() {
                    iVar.mo58011r();
                }
            });
        }
    }

    /* renamed from: e */
    public final void mo57931e(final C8554i<?> iVar) {
        Executor executor = this.f20866b;
        if (executor != null) {
            executor.execute(new Runnable() {
                public final void run() {
                    iVar.mo58010q();
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo57925a(C8554i<?> iVar, long j, long j2) {
        Executor executor = this.f20866b;
        if (executor != null) {
            final C8554i<?> iVar2 = iVar;
            final long j3 = j;
            final long j4 = j2;
            executor.execute(new Runnable() {
                public final void run() {
                    iVar2.mo57989a(j3, j4);
                }
            });
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.same.net.d$a */
    /* compiled from: ExecutorDelivery */
    private class C8522a implements Runnable {

        /* renamed from: b */
        private final C8554i f20884b;

        /* renamed from: c */
        private final C8557k f20885c;

        public C8522a(C8554i iVar, C8557k kVar) {
            this.f20884b = iVar;
            this.f20885c = kVar;
        }

        public final void run() {
            if (this.f20884b.mo57997c()) {
                this.f20884b.mo57993a("canceled-at-delivery");
                this.f20884b.mo58007n();
                return;
            }
            if (this.f20885c.f21016b == null) {
                this.f20884b.mo57992a(this.f20885c);
            } else {
                this.f20884b.mo57990a(this.f20885c.f21016b);
            }
            this.f20884b.mo57993a("done");
            this.f20884b.mo58009p();
        }
    }
}
