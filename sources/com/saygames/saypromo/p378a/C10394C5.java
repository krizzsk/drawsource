package com.saygames.saypromo.p378a;

import kotlin.Unit;
import kotlin.time.Duration;

/* renamed from: com.saygames.saypromo.a.C5 */
public final class C10394C5 {

    /* renamed from: a */
    private final C10529W1 f25762a;

    /* renamed from: b */
    private boolean f25763b;

    /* renamed from: c */
    private final C10717u4 f25764c = new C10717u4();

    /* renamed from: d */
    private long f25765d = Duration.Companion.m35246getZEROUwyO8pc();

    /* renamed from: e */
    private long f25766e;

    public C10394C5(C10529W1 w1, boolean z) {
        this.f25762a = w1;
        this.f25763b = z;
        this.f25766e = ((C10536X1) w1).mo65397b();
    }

    /* renamed from: a */
    public final void mo65266a() {
        synchronized (this.f25764c.f26352a) {
            this.f25765d = Duration.Companion.m35246getZEROUwyO8pc();
            this.f25766e = ((C10536X1) this.f25762a).mo65397b();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: b */
    public final long mo65267b() {
        long r1;
        synchronized (this.f25764c.f26352a) {
            r1 = this.f25763b ? this.f25765d : Duration.m35179minusLRDsOJo(Duration.m35180plusLRDsOJo(this.f25765d, ((C10536X1) this.f25762a).mo65397b()), this.f25766e);
        }
        return r1;
    }

    /* renamed from: c */
    public final void mo65268c() {
        synchronized (this.f25764c.f26352a) {
            if (!this.f25763b) {
                this.f25763b = true;
                this.f25765d = Duration.m35179minusLRDsOJo(Duration.m35180plusLRDsOJo(this.f25765d, ((C10536X1) this.f25762a).mo65397b()), this.f25766e);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: d */
    public final void mo65269d() {
        synchronized (this.f25764c.f26352a) {
            if (this.f25763b) {
                this.f25763b = false;
                this.f25766e = ((C10536X1) this.f25762a).mo65397b();
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
