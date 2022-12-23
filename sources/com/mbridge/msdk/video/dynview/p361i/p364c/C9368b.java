package com.mbridge.msdk.video.dynview.p361i.p364c;

import android.os.CountDownTimer;

/* renamed from: com.mbridge.msdk.video.dynview.i.c.b */
/* compiled from: MBCountDownTimer */
public final class C9368b {

    /* renamed from: a */
    private long f22999a = 0;

    /* renamed from: b */
    private long f23000b;

    /* renamed from: c */
    private C9367a f23001c;

    /* renamed from: d */
    private C9369a f23002d;

    /* renamed from: a */
    public final C9368b mo62883a(long j) {
        if (j < 0) {
            j = 1000;
        }
        this.f23000b = j;
        return this;
    }

    /* renamed from: a */
    public final C9368b mo62884a(C9367a aVar) {
        this.f23001c = aVar;
        return this;
    }

    /* renamed from: b */
    public final C9368b mo62886b(long j) {
        this.f22999a = j;
        return this;
    }

    /* renamed from: a */
    public final void mo62885a() {
        C9369a aVar = this.f23002d;
        if (aVar == null) {
            if (aVar != null) {
                aVar.cancel();
                this.f23002d = null;
            }
            if (this.f23000b <= 0) {
                this.f23000b = this.f22999a + 1000;
            }
            C9369a aVar2 = new C9369a(this.f22999a, this.f23000b);
            this.f23002d = aVar2;
            aVar2.mo62888a(this.f23001c);
        }
        this.f23002d.start();
    }

    /* renamed from: b */
    public final void mo62887b() {
        C9369a aVar = this.f23002d;
        if (aVar != null) {
            aVar.cancel();
            this.f23002d = null;
        }
    }

    /* renamed from: com.mbridge.msdk.video.dynview.i.c.b$a */
    /* compiled from: MBCountDownTimer */
    private static class C9369a extends CountDownTimer {

        /* renamed from: a */
        private C9367a f23003a;

        public C9369a(long j, long j2) {
            super(j, j2);
        }

        public final void onTick(long j) {
            C9367a aVar = this.f23003a;
            if (aVar != null) {
                aVar.mo62882a(j);
            }
        }

        public final void onFinish() {
            C9367a aVar = this.f23003a;
            if (aVar != null) {
                aVar.mo62881a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo62888a(C9367a aVar) {
            this.f23003a = aVar;
        }
    }
}
