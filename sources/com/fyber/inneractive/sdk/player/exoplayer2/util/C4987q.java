package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.C4637b;
import com.fyber.inneractive.sdk.player.exoplayer2.C4816m;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.q */
public final class C4987q implements C4972g {

    /* renamed from: a */
    public boolean f13263a;

    /* renamed from: b */
    public long f13264b;

    /* renamed from: c */
    public long f13265c;

    /* renamed from: d */
    public C4816m f13266d = C4816m.f12777d;

    /* renamed from: a */
    public void mo25556a(long j) {
        this.f13264b = j;
        if (this.f13263a) {
            this.f13265c = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: i */
    public C4816m mo24982i() {
        return this.f13266d;
    }

    /* renamed from: o */
    public long mo24984o() {
        long j;
        long j2 = this.f13264b;
        if (!this.f13263a) {
            return j2;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f13265c;
        C4816m mVar = this.f13266d;
        if (mVar.f12778a == 1.0f) {
            j = C4637b.m14201a(elapsedRealtime);
        } else {
            j = elapsedRealtime * ((long) mVar.f12780c);
        }
        return j2 + j;
    }

    /* renamed from: a */
    public void mo25557a(C4972g gVar) {
        mo25556a(gVar.mo24984o());
        this.f13266d = gVar.mo24982i();
    }

    /* renamed from: a */
    public C4816m mo24973a(C4816m mVar) {
        if (this.f13263a) {
            mo25556a(mo24984o());
        }
        this.f13266d = mVar;
        return mVar;
    }
}
