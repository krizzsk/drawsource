package com.fyber.inneractive.sdk.player.exoplayer2;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.C4652e;
import com.fyber.inneractive.sdk.player.exoplayer2.C4806h;
import com.fyber.inneractive.sdk.player.exoplayer2.C4855p;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4890s;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4906e;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4908f;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4909g;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.g */
public final class C4805g implements C4652e {

    /* renamed from: a */
    public final C4853n[] f12665a;

    /* renamed from: b */
    public final C4909g f12666b;

    /* renamed from: c */
    public final C4908f f12667c;

    /* renamed from: d */
    public final Handler f12668d;

    /* renamed from: e */
    public final C4806h f12669e;

    /* renamed from: f */
    public final CopyOnWriteArraySet<C4652e.C4653a> f12670f;

    /* renamed from: g */
    public final C4855p.C4858c f12671g;

    /* renamed from: h */
    public final C4855p.C4857b f12672h;

    /* renamed from: i */
    public boolean f12673i;

    /* renamed from: j */
    public boolean f12674j;

    /* renamed from: k */
    public int f12675k;

    /* renamed from: l */
    public int f12676l;

    /* renamed from: m */
    public int f12677m;

    /* renamed from: n */
    public boolean f12678n;

    /* renamed from: o */
    public C4855p f12679o;

    /* renamed from: p */
    public Object f12680p;

    /* renamed from: q */
    public C4890s f12681q;

    /* renamed from: r */
    public C4908f f12682r;

    /* renamed from: s */
    public C4816m f12683s;

    /* renamed from: t */
    public C4806h.C4808b f12684t;

    /* renamed from: u */
    public int f12685u;

    /* renamed from: v */
    public long f12686v;

    public C4805g(C4853n[] nVarArr, C4909g gVar, C4638c cVar) {
        Log.i("ExoPlayerImpl", "Init ExoPlayerLib/2.4.4 [" + C4991u.f13274e + "]");
        C4965a.m15051b(nVarArr.length > 0);
        this.f12665a = (C4853n[]) C4965a.m15047a(nVarArr);
        this.f12666b = (C4909g) C4965a.m15047a(gVar);
        this.f12674j = false;
        this.f12675k = 1;
        this.f12670f = new CopyOnWriteArraySet<>();
        C4908f fVar = new C4908f(new C4906e[nVarArr.length]);
        this.f12667c = fVar;
        this.f12679o = C4855p.f12875a;
        this.f12671g = new C4855p.C4858c();
        this.f12672h = new C4855p.C4857b();
        this.f12681q = C4890s.f12996d;
        this.f12682r = fVar;
        this.f12683s = C4816m.f12777d;
        C4804f fVar2 = new C4804f(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.f12668d = fVar2;
        C4806h.C4808b bVar = new C4806h.C4808b(0, 0);
        this.f12684t = bVar;
        this.f12669e = new C4806h(nVarArr, gVar, cVar, this.f12674j, fVar2, bVar, this);
    }

    /* renamed from: a */
    public void mo25253a(boolean z) {
        if (this.f12674j != z) {
            this.f12674j = z;
            this.f12669e.f12698f.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
            Iterator<C4652e.C4653a> it = this.f12670f.iterator();
            while (it.hasNext()) {
                it.next().mo24905a(z, this.f12675k);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:10|11|12|13|24|21|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x000f, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0017 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25255b() {
        /*
            r3 = this;
            com.fyber.inneractive.sdk.player.exoplayer2.h r0 = r3.f12669e
            monitor-enter(r0)
            boolean r1 = r0.f12710r     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)
            goto L_0x0025
        L_0x0009:
            android.os.Handler r1 = r0.f12698f     // Catch:{ all -> 0x002c }
            r2 = 6
            r1.sendEmptyMessage(r2)     // Catch:{ all -> 0x002c }
        L_0x000f:
            boolean r1 = r0.f12710r     // Catch:{ all -> 0x002c }
            if (r1 != 0) goto L_0x001f
            r0.wait()     // Catch:{ InterruptedException -> 0x0017 }
            goto L_0x000f
        L_0x0017:
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x002c }
            r1.interrupt()     // Catch:{ all -> 0x002c }
            goto L_0x000f
        L_0x001f:
            android.os.HandlerThread r1 = r0.f12699g     // Catch:{ all -> 0x002c }
            r1.quit()     // Catch:{ all -> 0x002c }
            monitor-exit(r0)
        L_0x0025:
            android.os.Handler r0 = r3.f12668d
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            return
        L_0x002c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.C4805g.mo25255b():void");
    }

    /* renamed from: a */
    public void mo25252a(int i, long j) {
        if (i < 0 || (!this.f12679o.mo25388c() && i >= this.f12679o.mo25387b())) {
            throw new C4814k(this.f12679o, i, j);
        }
        this.f12676l++;
        this.f12685u = i;
        if (!this.f12679o.mo25388c()) {
            this.f12679o.mo25386a(i, this.f12671g, false, 0);
            long j2 = j == -9223372036854775807L ? this.f12671g.f12885e : j;
            C4855p.C4858c cVar = this.f12671g;
            int i2 = cVar.f12883c;
            long a = cVar.f12887g + C4637b.m14201a(j2);
            long j3 = this.f12679o.mo25384a(i2, this.f12672h, false).f12879d;
            while (j3 != -9223372036854775807L && a >= j3 && i2 < this.f12671g.f12884d) {
                a -= j3;
                i2++;
                j3 = this.f12679o.mo25384a(i2, this.f12672h, false).f12879d;
            }
        }
        if (j == -9223372036854775807L) {
            this.f12686v = 0;
            this.f12669e.f12698f.obtainMessage(3, new C4806h.C4809c(this.f12679o, i, -9223372036854775807L)).sendToTarget();
            return;
        }
        this.f12686v = j;
        this.f12669e.f12698f.obtainMessage(3, new C4806h.C4809c(this.f12679o, i, C4637b.m14201a(j))).sendToTarget();
        Iterator<C4652e.C4653a> it = this.f12670f.iterator();
        while (it.hasNext()) {
            it.next().mo24899a();
        }
    }

    /* renamed from: a */
    public void mo25254a(C4652e.C4655c... cVarArr) {
        C4806h hVar = this.f12669e;
        if (hVar.f12710r) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            return;
        }
        hVar.f12715w++;
        hVar.f12698f.obtainMessage(11, cVarArr).sendToTarget();
    }

    /* renamed from: a */
    public int mo25251a() {
        if (this.f12679o.mo25388c() || this.f12676l > 0) {
            return this.f12685u;
        }
        return this.f12679o.mo25384a(this.f12684t.f12738a, this.f12672h, false).f12878c;
    }
}
