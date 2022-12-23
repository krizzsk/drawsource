package com.mbridge.msdk.p081e.p082a;

import android.os.CountDownTimer;

/* renamed from: com.mbridge.msdk.e.a.b */
/* compiled from: MBCountDownTimer */
public final class C2459b {

    /* renamed from: a */
    private long f5161a = 0;

    /* renamed from: b */
    private long f5162b;

    /* renamed from: c */
    private C2458a f5163c;

    /* renamed from: d */
    private C2460a f5164d;

    /* renamed from: a */
    public final C2459b mo16377a(long j) {
        if (j < 0) {
            j = 1000;
        }
        this.f5162b = j;
        return this;
    }

    /* renamed from: a */
    public final C2459b mo16378a(C2458a aVar) {
        this.f5163c = aVar;
        return this;
    }

    /* renamed from: b */
    public final C2459b mo16380b(long j) {
        this.f5161a = j;
        return this;
    }

    /* renamed from: a */
    public final void mo16379a() {
        C2460a aVar = this.f5164d;
        if (aVar == null) {
            if (aVar != null) {
                aVar.cancel();
                this.f5164d = null;
            }
            if (this.f5162b <= 0) {
                this.f5162b = this.f5161a + 1000;
            }
            C2460a aVar2 = new C2460a(this.f5161a, this.f5162b);
            this.f5164d = aVar2;
            aVar2.mo16382a(this.f5163c);
        }
        this.f5164d.start();
    }

    /* renamed from: b */
    public final void mo16381b() {
        C2460a aVar = this.f5164d;
        if (aVar != null) {
            aVar.cancel();
            this.f5164d = null;
        }
    }

    /* renamed from: com.mbridge.msdk.e.a.b$a */
    /* compiled from: MBCountDownTimer */
    private static class C2460a extends CountDownTimer {

        /* renamed from: a */
        private C2458a f5165a;

        public C2460a(long j, long j2) {
            super(j, j2);
        }

        public final void onTick(long j) {
            C2458a aVar = this.f5165a;
            if (aVar != null) {
                aVar.onTick(j);
            }
        }

        public final void onFinish() {
            C2458a aVar = this.f5165a;
            if (aVar != null) {
                aVar.onFinish();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo16382a(C2458a aVar) {
            this.f5165a = aVar;
        }
    }
}
