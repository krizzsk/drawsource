package com.mbridge.msdk.foundation.same.p304e;

/* renamed from: com.mbridge.msdk.foundation.same.e.a */
/* compiled from: CommonTask */
public abstract class C8490a implements Runnable {

    /* renamed from: b */
    public static long f20824b;

    /* renamed from: c */
    public C8491a f20825c = C8491a.READY;

    /* renamed from: d */
    public C8492b f20826d;

    /* renamed from: com.mbridge.msdk.foundation.same.e.a$a */
    /* compiled from: CommonTask */
    public enum C8491a {
        READY,
        RUNNING,
        PAUSE,
        CANCEL,
        FINISH
    }

    /* renamed from: com.mbridge.msdk.foundation.same.e.a$b */
    /* compiled from: CommonTask */
    public interface C8492b {
        /* renamed from: a */
        void mo37107a(C8491a aVar);
    }

    /* renamed from: a */
    public abstract void mo37110a();

    /* renamed from: b */
    public abstract void mo37111b();

    public final void run() {
        try {
            if (this.f20825c == C8491a.READY) {
                m24346a(C8491a.RUNNING);
                mo37110a();
                m24346a(C8491a.FINISH);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public C8490a() {
        f20824b++;
    }

    /* renamed from: d */
    public final void mo57900d() {
        if (this.f20825c != C8491a.CANCEL) {
            m24346a(C8491a.CANCEL);
            mo37111b();
        }
    }

    /* renamed from: a */
    private void m24346a(C8491a aVar) {
        this.f20825c = aVar;
        C8492b bVar = this.f20826d;
        if (bVar != null) {
            bVar.mo37107a(aVar);
        }
    }
}
