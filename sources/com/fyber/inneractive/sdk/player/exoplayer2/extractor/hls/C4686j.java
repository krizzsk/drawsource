package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.C4806h;
import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4659d;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4673h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4709m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4746n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C4676c;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4691a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4698e;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4860b;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4861c;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4868f;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4886o;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4887p;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4889r;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4890s;
import com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.C4862a;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4906e;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4913b;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4942j;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4957x;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4973h;
import java.io.IOException;
import java.util.LinkedList;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j */
public final class C4686j implements C4957x.C4958a<C4862a>, C4887p, C4673h, C4659d.C4663d {

    /* renamed from: a */
    public final int f11810a;

    /* renamed from: b */
    public final C4688b f11811b;

    /* renamed from: c */
    public final C4676c f11812c;

    /* renamed from: d */
    public final C4913b f11813d;

    /* renamed from: e */
    public final C4811i f11814e;

    /* renamed from: f */
    public final int f11815f;

    /* renamed from: g */
    public final C4957x f11816g = new C4957x("Loader:HlsSampleStreamWrapper");

    /* renamed from: h */
    public final C4868f.C4869a f11817h;

    /* renamed from: i */
    public final C4676c.C4678b f11818i = new C4676c.C4678b();

    /* renamed from: j */
    public final SparseArray<C4659d> f11819j = new SparseArray<>();

    /* renamed from: k */
    public final LinkedList<C4682f> f11820k = new LinkedList<>();

    /* renamed from: l */
    public final Runnable f11821l = new C4687a();

    /* renamed from: m */
    public final Handler f11822m = new Handler();

    /* renamed from: n */
    public boolean f11823n;

    /* renamed from: o */
    public boolean f11824o;

    /* renamed from: p */
    public int f11825p;

    /* renamed from: q */
    public C4811i f11826q;

    /* renamed from: r */
    public int f11827r;

    /* renamed from: s */
    public boolean f11828s;

    /* renamed from: t */
    public C4890s f11829t;

    /* renamed from: u */
    public int f11830u;

    /* renamed from: v */
    public boolean[] f11831v;

    /* renamed from: w */
    public long f11832w;

    /* renamed from: x */
    public long f11833x;

    /* renamed from: y */
    public boolean f11834y;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j$a */
    public class C4687a implements Runnable {
        public C4687a() {
        }

        public void run() {
            C4686j.this.mo25147i();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j$b */
    public interface C4688b {
    }

    public C4686j(int i, C4688b bVar, C4676c cVar, C4913b bVar2, long j, C4811i iVar, int i2, C4868f.C4869a aVar) {
        this.f11810a = i;
        this.f11811b = bVar;
        this.f11812c = cVar;
        this.f11813d = bVar2;
        this.f11814e = iVar;
        this.f11815f = i2;
        this.f11817h = aVar;
        this.f11832w = j;
        this.f11833x = j;
    }

    /* renamed from: a */
    public void mo25099a(C4709m mVar) {
    }

    /* renamed from: a */
    public void mo25142a(C4957x.C4960c cVar, long j, long j2, boolean z) {
        C4862a aVar = (C4862a) cVar;
        C4868f.C4869a aVar2 = this.f11817h;
        C4942j jVar = aVar.f12900a;
        int i = aVar.f12901b;
        int i2 = this.f11810a;
        C4811i iVar = aVar.f12902c;
        int i3 = aVar.f12903d;
        Object obj = aVar.f12904e;
        long j3 = aVar.f12905f;
        long j4 = aVar.f12906g;
        long c = aVar.mo25112c();
        if (aVar2.f12921b != null) {
            Handler handler = aVar2.f12920a;
            C4861c cVar2 = r2;
            C4861c cVar3 = new C4861c(aVar2, jVar, i, i2, iVar, i3, obj, j3, j4, j, j2, c);
            handler.post(cVar2);
        }
        if (!z) {
            int size = this.f11819j.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.f11819j.valueAt(i4).mo25076a(this.f11831v[i4]);
            }
            ((C4683g) this.f11811b).mo25119a((C4887p) this);
        }
    }

    /* renamed from: c */
    public void mo25100c() {
        this.f11823n = true;
        this.f11822m.post(this.f11821l);
    }

    /* renamed from: d */
    public void mo25144d(long j) {
        this.f11832w = j;
        this.f11833x = j;
        this.f11834y = false;
        this.f11820k.clear();
        if (this.f11816g.mo25492b()) {
            this.f11816g.mo25491a();
            return;
        }
        int size = this.f11819j.size();
        for (int i = 0; i < size; i++) {
            this.f11819j.valueAt(i).mo25076a(this.f11831v[i]);
        }
    }

    /* renamed from: g */
    public void mo25145g() {
        if (!this.f11824o) {
            mo25120a(this.f11832w);
        }
    }

    /* renamed from: h */
    public final boolean mo25146h() {
        return this.f11833x != -9223372036854775807L;
    }

    /* renamed from: i */
    public final void mo25147i() {
        if (!this.f11828s && !this.f11824o && this.f11823n) {
            int size = this.f11819j.size();
            int i = 0;
            while (i < size) {
                if (this.f11819j.valueAt(i).mo25081e() != null) {
                    i++;
                } else {
                    return;
                }
            }
            int size2 = this.f11819j.size();
            int i2 = 0;
            char c = 0;
            int i3 = -1;
            while (true) {
                char c2 = 3;
                if (i2 >= size2) {
                    break;
                }
                String str = this.f11819j.valueAt(i2).mo25081e().f12755f;
                if (!C4973h.m15066e(str)) {
                    if (C4973h.m15065d(str)) {
                        c2 = 2;
                    } else {
                        c2 = "text".equals(C4973h.m15063b(str)) ? (char) 1 : 0;
                    }
                }
                if (c2 > c) {
                    i3 = i2;
                    c = c2;
                } else if (c2 == c && i3 != -1) {
                    i3 = -1;
                }
                i2++;
            }
            C4889r rVar = this.f11812c.f11746f;
            int i4 = rVar.f12993a;
            this.f11830u = -1;
            this.f11831v = new boolean[size2];
            C4889r[] rVarArr = new C4889r[size2];
            for (int i5 = 0; i5 < size2; i5++) {
                C4811i e = this.f11819j.valueAt(i5).mo25081e();
                if (i5 == i3) {
                    C4811i[] iVarArr = new C4811i[i4];
                    for (int i6 = 0; i6 < i4; i6++) {
                        iVarArr[i6] = m14334a(rVar.f12994b[i6], e);
                    }
                    rVarArr[i5] = new C4889r(iVarArr);
                    this.f11830u = i5;
                } else {
                    rVarArr[i5] = new C4889r(m14334a((c != 3 || !C4973h.m15065d(e.f12755f)) ? null : this.f11814e, e));
                }
            }
            this.f11829t = new C4890s(rVarArr);
            this.f11824o = true;
            C4683g gVar = (C4683g) this.f11811b;
            int i7 = gVar.f11797k - 1;
            gVar.f11797k = i7;
            if (i7 <= 0) {
                int i8 = 0;
                for (C4686j jVar : gVar.f11800n) {
                    i8 += jVar.f11829t.f12997a;
                }
                C4889r[] rVarArr2 = new C4889r[i8];
                int i9 = 0;
                for (C4686j jVar2 : gVar.f11800n) {
                    int i10 = jVar2.f11829t.f12997a;
                    int i11 = 0;
                    while (i11 < i10) {
                        rVarArr2[i9] = jVar2.f11829t.f12998b[i11];
                        i11++;
                        i9++;
                    }
                }
                gVar.f11799m = new C4890s(rVarArr2);
                ((C4806h) gVar.f11796j).f12698f.obtainMessage(8, gVar).sendToTarget();
            }
        }
    }

    /* renamed from: j */
    public void mo25148j() throws IOException {
        this.f11816g.mo25493c();
        C4676c cVar = this.f11812c;
        IOException iOException = cVar.f11750j;
        if (iOException == null) {
            C4691a.C4692a aVar = cVar.f11751k;
            if (aVar != null) {
                C4698e.C4699a aVar2 = cVar.f11745e.f11905e.get(aVar);
                aVar2.f11916b.mo25493c();
                IOException iOException2 = aVar2.f11924j;
                if (iOException2 != null) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: a */
    public void mo25141a(C4957x.C4960c cVar, long j, long j2) {
        C4862a aVar = (C4862a) cVar;
        C4676c cVar2 = this.f11812c;
        cVar2.getClass();
        if (aVar instanceof C4676c.C4677a) {
            C4676c.C4677a aVar2 = (C4676c.C4677a) aVar;
            cVar2.f11749i = aVar2.f12908i;
            cVar2.mo25102a(aVar2.f12900a.f13126a, aVar2.f11757l, aVar2.f11758m);
        }
        C4868f.C4869a aVar3 = this.f11817h;
        C4942j jVar = aVar.f12900a;
        int i = aVar.f12901b;
        int i2 = this.f11810a;
        C4811i iVar = aVar.f12902c;
        int i3 = aVar.f12903d;
        Object obj = aVar.f12904e;
        long j3 = aVar.f12905f;
        long j4 = aVar.f12906g;
        long c = aVar.mo25112c();
        if (aVar3.f12921b != null) {
            aVar3.f12920a.post(new C4860b(aVar3, jVar, i, i2, iVar, i3, obj, j3, j4, j, j2, c));
        }
        if (!this.f11824o) {
            mo25120a(this.f11832w);
        } else {
            ((C4683g) this.f11811b).mo25119a((C4887p) this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a9 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo25138a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4957x.C4960c r30, long r31, long r33, java.io.IOException r35) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a r1 = (com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.C4862a) r1
            long r2 = r1.mo25112c()
            boolean r4 = r1 instanceof com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C4682f
            r5 = 1
            if (r4 == 0) goto L_0x0018
            r7 = 0
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            r2 = 0
            goto L_0x0019
        L_0x0018:
            r2 = r5
        L_0x0019:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c r3 = r0.f11812c
            r3.getClass()
            if (r2 == 0) goto L_0x003b
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e r2 = r3.f11756p
            com.fyber.inneractive.sdk.player.exoplayer2.source.r r3 = r3.f11746f
            com.fyber.inneractive.sdk.player.exoplayer2.i r7 = r1.f12902c
            int r3 = r3.mo25406a((com.fyber.inneractive.sdk.player.exoplayer2.C4811i) r7)
            int r3 = r2.mo25420c(r3)
            r7 = 60000(0xea60, double:2.9644E-319)
            r15 = r35
            boolean r2 = com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.C4863b.m14827a(r2, r3, r15, r7)
            if (r2 == 0) goto L_0x003d
            r2 = r5
            goto L_0x003e
        L_0x003b:
            r15 = r35
        L_0x003d:
            r2 = 0
        L_0x003e:
            if (r2 == 0) goto L_0x005f
            if (r4 == 0) goto L_0x0060
            java.util.LinkedList<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f> r2 = r0.f11820k
            java.lang.Object r2 = r2.removeLast()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C4682f) r2
            if (r2 != r1) goto L_0x004e
            r2 = r5
            goto L_0x004f
        L_0x004e:
            r2 = 0
        L_0x004f:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a.m15051b(r2)
            java.util.LinkedList<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f> r2 = r0.f11820k
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0060
            long r2 = r0.f11832w
            r0.f11833x = r2
            goto L_0x0060
        L_0x005f:
            r5 = 0
        L_0x0060:
            com.fyber.inneractive.sdk.player.exoplayer2.source.f$a r10 = r0.f11817h
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r11 = r1.f12900a
            int r12 = r1.f12901b
            int r13 = r0.f11810a
            com.fyber.inneractive.sdk.player.exoplayer2.i r14 = r1.f12902c
            int r2 = r1.f12903d
            java.lang.Object r3 = r1.f12904e
            long r7 = r1.f12905f
            r17 = r7
            long r6 = r1.f12906g
            long r25 = r1.mo25112c()
            com.fyber.inneractive.sdk.player.exoplayer2.source.f r1 = r10.f12921b
            if (r1 == 0) goto L_0x0094
            android.os.Handler r1 = r10.f12920a
            com.fyber.inneractive.sdk.player.exoplayer2.source.d r4 = new com.fyber.inneractive.sdk.player.exoplayer2.source.d
            r9 = r4
            r15 = r2
            r16 = r3
            r19 = r6
            r21 = r31
            r23 = r33
            r27 = r35
            r28 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r19, r21, r23, r25, r27, r28)
            r1.post(r4)
        L_0x0094:
            if (r5 == 0) goto L_0x00a9
            boolean r1 = r0.f11824o
            if (r1 != 0) goto L_0x00a0
            long r1 = r0.f11832w
            r0.mo25120a((long) r1)
            goto L_0x00a7
        L_0x00a0:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j$b r1 = r0.f11811b
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.g r1 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C4683g) r1
            r1.mo25119a((com.fyber.inneractive.sdk.player.exoplayer2.source.C4887p) r0)
        L_0x00a7:
            r6 = 2
            goto L_0x00aa
        L_0x00a9:
            r6 = 0
        L_0x00aa:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C4686j.mo25138a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.x$c, long, long, java.io.IOException):int");
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ C4746n mo25098a(int i, int i2) {
        return mo25139a(i);
    }

    /* renamed from: a */
    public boolean mo25143a(C4906e[] eVarArr, boolean[] zArr, C4886o[] oVarArr, boolean[] zArr2, boolean z) {
        C4965a.m15051b(this.f11824o);
        for (int i = 0; i < eVarArr.length; i++) {
            if (oVarArr[i] != null && (eVarArr[i] == null || !zArr[i])) {
                int i2 = oVarArr[i].f11808a;
                mo25140a(i2, false);
                this.f11819j.valueAt(i2).mo25078b();
                oVarArr[i] = null;
            }
        }
        boolean z2 = false;
        C4906e eVar = null;
        for (int i3 = 0; i3 < eVarArr.length; i3++) {
            if (oVarArr[i3] == null && eVarArr[i3] != null) {
                C4906e eVar2 = eVarArr[i3];
                int a = this.f11829t.mo25410a(eVar2.mo25418b());
                mo25140a(a, true);
                if (a == this.f11830u) {
                    this.f11812c.f11756p = eVar2;
                    eVar = eVar2;
                }
                oVarArr[i3] = new C4685i(this, a);
                zArr2[i3] = true;
                z2 = true;
            }
        }
        if (z) {
            int size = this.f11819j.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (!this.f11831v[i4]) {
                    this.f11819j.valueAt(i4).mo25078b();
                }
            }
            if (eVar != null && !this.f11820k.isEmpty()) {
                eVar.mo25104a(0);
                if (eVar.mo25413a() != this.f11812c.f11746f.mo25406a(this.f11820k.getLast().f12902c)) {
                    mo25144d(this.f11832w);
                }
            }
        }
        if (this.f11825p == 0) {
            this.f11812c.f11750j = null;
            this.f11826q = null;
            this.f11820k.clear();
            if (this.f11816g.mo25492b()) {
                this.f11816g.mo25491a();
            }
        }
        return z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0112  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo25120a(long r37) {
        /*
            r36 = this;
            r0 = r36
            boolean r1 = r0.f11834y
            if (r1 != 0) goto L_0x02fd
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.x r1 = r0.f11816g
            boolean r1 = r1.mo25492b()
            if (r1 == 0) goto L_0x0010
            goto L_0x02fd
        L_0x0010:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c r1 = r0.f11812c
            java.util.LinkedList<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f> r3 = r0.f11820k
            boolean r3 = r3.isEmpty()
            r4 = 0
            if (r3 == 0) goto L_0x001d
            r3 = r4
            goto L_0x0025
        L_0x001d:
            java.util.LinkedList<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f> r3 = r0.f11820k
            java.lang.Object r3 = r3.getLast()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f r3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C4682f) r3
        L_0x0025:
            long r5 = r0.f11833x
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r5 = r37
        L_0x0033:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c$b r9 = r0.f11818i
            if (r3 != 0) goto L_0x0039
            r8 = -1
            goto L_0x0041
        L_0x0039:
            com.fyber.inneractive.sdk.player.exoplayer2.source.r r8 = r1.f11746f
            com.fyber.inneractive.sdk.player.exoplayer2.i r10 = r3.f12902c
            int r8 = r8.mo25406a((com.fyber.inneractive.sdk.player.exoplayer2.C4811i) r10)
        L_0x0041:
            r1.f11751k = r4
            r10 = 0
            if (r3 != 0) goto L_0x0048
            goto L_0x004f
        L_0x0048:
            long r13 = r3.f12905f
            long r13 = r13 - r5
            long r10 = java.lang.Math.max(r10, r13)
        L_0x004f:
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e r12 = r1.f11756p
            r12.mo25104a((long) r10)
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e r10 = r1.f11756p
            int r10 = r10.mo25413a()
            r13 = 1
            if (r8 == r10) goto L_0x005f
            r11 = r13
            goto L_0x0060
        L_0x005f:
            r11 = 0
        L_0x0060:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a[] r12 = r1.f11744d
            r12 = r12[r10]
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e r14 = r1.f11745e
            boolean r14 = r14.mo25156b((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4691a.C4692a) r12)
            if (r14 != 0) goto L_0x0072
            r9.f11761c = r12
            r1.f11751k = r12
            goto L_0x0257
        L_0x0072:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e r14 = r1.f11745e
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b r14 = r14.mo25155a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4691a.C4692a) r12)
            if (r3 == 0) goto L_0x0085
            if (r11 == 0) goto L_0x007d
            goto L_0x0085
        L_0x007d:
            int r5 = r3.f12911i
            int r5 = r5 + r13
            r15 = r5
        L_0x0081:
            r8 = r10
            r2 = r12
            goto L_0x0105
        L_0x0085:
            if (r3 != 0) goto L_0x0088
            goto L_0x008a
        L_0x0088:
            long r5 = r3.f12905f
        L_0x008a:
            boolean r11 = r14.f11860j
            if (r11 != 0) goto L_0x00a9
            r11 = r8
            long r7 = r14.f11854d
            r21 = r3
            long r2 = r14.f11865o
            long r7 = r7 + r2
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x00ac
            int r2 = r14.f11857g
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a> r3 = r14.f11863m
            int r3 = r3.size()
            int r2 = r2 + r3
            r15 = r2
            r8 = r10
            r2 = r12
            r3 = r21
            goto L_0x0105
        L_0x00a9:
            r21 = r3
            r11 = r8
        L_0x00ac:
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a> r2 = r14.f11863m
            long r7 = r14.f11854d
            long r5 = r5 - r7
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e r5 = r1.f11745e
            boolean r5 = r5.f11914n
            if (r5 == 0) goto L_0x00c0
            if (r21 != 0) goto L_0x00be
            goto L_0x00c0
        L_0x00be:
            r5 = 0
            goto L_0x00c1
        L_0x00c0:
            r5 = r13
        L_0x00c1:
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.f13270a
            int r6 = java.util.Collections.binarySearch(r2, r3)
            if (r6 >= 0) goto L_0x00cd
            int r6 = r6 + 2
            int r2 = -r6
            goto L_0x00e0
        L_0x00cd:
            r7 = -1
        L_0x00ce:
            int r6 = r6 + r7
            if (r6 < 0) goto L_0x00de
            java.lang.Object r8 = r2.get(r6)
            java.lang.Comparable r8 = (java.lang.Comparable) r8
            int r8 = r8.compareTo(r3)
            if (r8 != 0) goto L_0x00de
            goto L_0x00ce
        L_0x00de:
            int r2 = r6 + 1
        L_0x00e0:
            if (r5 == 0) goto L_0x00e7
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
        L_0x00e7:
            int r3 = r14.f11857g
            int r2 = r2 + r3
            if (r2 >= r3) goto L_0x0100
            if (r21 == 0) goto L_0x0100
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a[] r2 = r1.f11744d
            r2 = r2[r11]
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e r3 = r1.f11745e
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b r14 = r3.mo25155a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4691a.C4692a) r2)
            r3 = r21
            int r5 = r3.f12911i
            int r5 = r5 + r13
            r15 = r5
            r8 = r11
            goto L_0x0105
        L_0x0100:
            r3 = r21
            r15 = r2
            goto L_0x0081
        L_0x0105:
            int r5 = r14.f11857g
            if (r15 >= r5) goto L_0x0112
            com.fyber.inneractive.sdk.player.exoplayer2.source.g r2 = new com.fyber.inneractive.sdk.player.exoplayer2.source.g
            r2.<init>()
            r1.f11750j = r2
            goto L_0x0257
        L_0x0112:
            int r5 = r15 - r5
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a> r6 = r14.f11863m
            int r6 = r6.size()
            if (r5 < r6) goto L_0x012a
            boolean r3 = r14.f11860j
            if (r3 == 0) goto L_0x0124
            r9.f11760b = r13
            goto L_0x0257
        L_0x0124:
            r9.f11761c = r2
            r1.f11751k = r2
            goto L_0x0257
        L_0x012a:
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a> r6 = r14.f11863m
            java.lang.Object r5 = r6.get(r5)
            r12 = r5
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a r12 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4693b.C4694a) r12
            boolean r5 = r12.f11870e
            if (r5 == 0) goto L_0x019f
            java.lang.String r5 = r14.f11875a
            java.lang.String r6 = r12.f11871f
            android.net.Uri r5 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4990t.m15128a(r5, r6)
            android.net.Uri r6 = r1.f11752l
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x018d
            java.lang.String r2 = r12.f11872g
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e r3 = r1.f11756p
            int r3 = r3.mo25105d()
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e r6 = r1.f11756p
            java.lang.Object r6 = r6.mo25107g()
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r7 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.j
            r27 = 0
            r29 = 0
            r31 = -1
            r33 = 0
            r34 = 1
            r26 = 0
            r24 = r7
            r25 = r5
            r24.<init>(r25, r26, r27, r29, r31, r33, r34)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c$a r5 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c$a
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.g r10 = r1.f11742b
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a[] r11 = r1.f11744d
            r8 = r11[r8]
            com.fyber.inneractive.sdk.player.exoplayer2.i r8 = r8.f11851b
            byte[] r1 = r1.f11749i
            r24 = r5
            r25 = r10
            r26 = r7
            r27 = r8
            r28 = r3
            r29 = r6
            r30 = r1
            r31 = r2
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            r9.f11759a = r5
            goto L_0x0257
        L_0x018d:
            java.lang.String r6 = r12.f11872g
            java.lang.String r7 = r1.f11754n
            boolean r6 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15140a((java.lang.Object) r6, (java.lang.Object) r7)
            if (r6 != 0) goto L_0x01a7
            java.lang.String r6 = r12.f11872g
            byte[] r7 = r1.f11753m
            r1.mo25102a(r5, r6, r7)
            goto L_0x01a7
        L_0x019f:
            r1.f11752l = r4
            r1.f11753m = r4
            r1.f11754n = r4
            r1.f11755o = r4
        L_0x01a7:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a r5 = r14.f11862l
            if (r5 == 0) goto L_0x01cc
            java.lang.String r6 = r14.f11875a
            java.lang.String r7 = r5.f11866a
            android.net.Uri r25 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4990t.m15128a(r6, r7)
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r6 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.j
            long r7 = r5.f11873h
            long r10 = r5.f11874i
            r33 = 0
            r34 = 0
            r26 = 0
            r24 = r6
            r27 = r7
            r29 = r7
            r31 = r10
            r24.<init>(r25, r26, r27, r29, r31, r33, r34)
            r8 = r6
            goto L_0x01cd
        L_0x01cc:
            r8 = r4
        L_0x01cd:
            long r5 = r14.f11854d
            long r10 = r12.f11869d
            long r20 = r5 + r10
            int r5 = r14.f11856f
            int r6 = r12.f11868c
            int r11 = r5 + r6
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.k r5 = r1.f11743c
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.util.r> r6 = r5.f11836a
            java.lang.Object r6 = r6.get(r11)
            com.fyber.inneractive.sdk.player.exoplayer2.util.r r6 = (com.fyber.inneractive.sdk.player.exoplayer2.util.C4988r) r6
            if (r6 != 0) goto L_0x01f6
            com.fyber.inneractive.sdk.player.exoplayer2.util.r r6 = new com.fyber.inneractive.sdk.player.exoplayer2.util.r
            r7 = r14
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6.<init>(r13)
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.util.r> r5 = r5.f11836a
            r5.put(r11, r6)
            goto L_0x01f7
        L_0x01f6:
            r7 = r14
        L_0x01f7:
            r24 = r6
            java.lang.String r5 = r7.f11875a
            java.lang.String r6 = r12.f11866a
            android.net.Uri r26 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4990t.m15128a(r5, r6)
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r25 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.j
            r7 = r25
            long r5 = r12.f11873h
            long r13 = r12.f11874i
            r34 = 0
            r35 = 0
            r27 = 0
            r28 = r5
            r30 = r5
            r32 = r13
            r25.<init>(r26, r27, r28, r30, r32, r34, r35)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f r13 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f
            r5 = r13
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.g r6 = r1.f11741a
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.i> r10 = r1.f11747g
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e r14 = r1.f11756p
            int r14 = r14.mo25105d()
            r25 = r11
            r11 = r14
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e r14 = r1.f11756p
            java.lang.Object r14 = r14.mo25107g()
            r4 = r12
            r12 = r14
            r38 = r13
            long r13 = r4.f11867b
            long r13 = r20 + r13
            r4 = r15
            r15 = r13
            boolean r13 = r1.f11748h
            r19 = r13
            byte[] r13 = r1.f11753m
            r22 = r13
            byte[] r1 = r1.f11755o
            r23 = r1
            r1 = r9
            r9 = r2
            r2 = r38
            r13 = r20
            r17 = r4
            r18 = r25
            r20 = r24
            r21 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r15, r17, r18, r19, r20, r21, r22, r23)
            r1.f11759a = r2
        L_0x0257:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c$b r1 = r0.f11818i
            boolean r2 = r1.f11760b
            com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a r3 = r1.f11759a
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a r4 = r1.f11761c
            r5 = 0
            r1.f11759a = r5
            r6 = 0
            r1.f11760b = r6
            r1.f11761c = r5
            if (r2 == 0) goto L_0x026d
            r1 = 1
            r0.f11834y = r1
            return r1
        L_0x026d:
            r1 = 1
            if (r3 != 0) goto L_0x0285
            if (r4 == 0) goto L_0x0283
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j$b r1 = r0.f11811b
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.g r1 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C4683g) r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e r1 = r1.f11787a
            java.util.IdentityHashMap<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e$a> r1 = r1.f11905e
            java.lang.Object r1 = r1.get(r4)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e$a r1 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4698e.C4699a) r1
            r1.mo25159b()
        L_0x0283:
            r1 = 0
            return r1
        L_0x0285:
            boolean r2 = r3 instanceof com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C4682f
            if (r2 == 0) goto L_0x02d0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f11833x = r4
            r2 = r3
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C4682f) r2
            r2.f11767D = r0
            int r4 = r2.f11770j
            boolean r5 = r2.f11780t
            r0.f11827r = r4
            r6 = 0
        L_0x029c:
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.d> r7 = r0.f11819j
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x02b3
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.d> r7 = r0.f11819j
            java.lang.Object r7 = r7.valueAt(r6)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.d r7 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4659d) r7
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.d$c r7 = r7.f11677c
            r7.f11710r = r4
            int r6 = r6 + 1
            goto L_0x029c
        L_0x02b3:
            if (r5 == 0) goto L_0x02cb
            r4 = 0
        L_0x02b6:
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.d> r5 = r0.f11819j
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x02cb
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.d> r5 = r0.f11819j
            java.lang.Object r5 = r5.valueAt(r4)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.d r5 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4659d) r5
            r5.f11687m = r1
            int r4 = r4 + 1
            goto L_0x02b6
        L_0x02cb:
            java.util.LinkedList<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f> r4 = r0.f11820k
            r4.add(r2)
        L_0x02d0:
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.x r2 = r0.f11816g
            int r4 = r0.f11815f
            long r17 = r2.mo25490a(r3, r0, r4)
            com.fyber.inneractive.sdk.player.exoplayer2.source.f$a r6 = r0.f11817h
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r7 = r3.f12900a
            int r8 = r3.f12901b
            int r9 = r0.f11810a
            com.fyber.inneractive.sdk.player.exoplayer2.i r10 = r3.f12902c
            int r11 = r3.f12903d
            java.lang.Object r12 = r3.f12904e
            long r13 = r3.f12905f
            long r2 = r3.f12906g
            com.fyber.inneractive.sdk.player.exoplayer2.source.f r4 = r6.f12921b
            if (r4 == 0) goto L_0x02fc
            android.os.Handler r4 = r6.f12920a
            com.fyber.inneractive.sdk.player.exoplayer2.source.a r15 = new com.fyber.inneractive.sdk.player.exoplayer2.source.a
            r5 = r15
            r1 = r15
            r15 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r15, r17)
            r4.post(r1)
            r1 = 1
        L_0x02fc:
            return r1
        L_0x02fd:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C4686j.mo25120a(long):boolean");
    }

    /* renamed from: a */
    public long mo25114a() {
        if (mo25146h()) {
            return this.f11833x;
        }
        if (this.f11834y) {
            return Long.MIN_VALUE;
        }
        return this.f11820k.getLast().f12906g;
    }

    /* renamed from: a */
    public C4659d mo25139a(int i) {
        if (this.f11819j.indexOfKey(i) >= 0) {
            return this.f11819j.get(i);
        }
        C4659d dVar = new C4659d(this.f11813d);
        dVar.f11688n = this;
        dVar.f11677c.f11710r = this.f11827r;
        this.f11819j.put(i, dVar);
        return dVar;
    }

    /* renamed from: a */
    public void mo25087a(C4811i iVar) {
        this.f11822m.post(this.f11821l);
    }

    /* renamed from: a */
    public final void mo25140a(int i, boolean z) {
        int i2 = 1;
        C4965a.m15051b(this.f11831v[i] != z);
        this.f11831v[i] = z;
        int i3 = this.f11825p;
        if (!z) {
            i2 = -1;
        }
        this.f11825p = i3 + i2;
    }

    /* renamed from: a */
    public static C4811i m14334a(C4811i iVar, C4811i iVar2) {
        C4811i iVar3 = iVar;
        C4811i iVar4 = iVar2;
        if (iVar3 == null) {
            return iVar4;
        }
        String str = null;
        int c = C4973h.m15064c(iVar4.f12755f);
        if (c == 1) {
            str = m14335a(iVar3.f12752c, 1);
        } else if (c == 2) {
            str = m14335a(iVar3.f12752c, 2);
        }
        return new C4811i(iVar3.f12750a, iVar4.f12754e, iVar4.f12755f, str, iVar3.f12751b, iVar4.f12756g, iVar3.f12759j, iVar3.f12760k, iVar4.f12761l, iVar4.f12762m, iVar4.f12763n, iVar4.f12765p, iVar4.f12764o, iVar4.f12766q, iVar4.f12767r, iVar4.f12768s, iVar4.f12769t, iVar4.f12770u, iVar4.f12771v, iVar3.f12773x, iVar3.f12774y, iVar4.f12775z, iVar4.f12772w, iVar4.f12757h, iVar4.f12758i, iVar4.f12753d);
    }

    /* renamed from: a */
    public static String m14335a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("(\\s*,\\s*)|(\\s*$)");
        StringBuilder sb = new StringBuilder();
        for (String str2 : split) {
            if (i == C4973h.m15064c(C4973h.m15062a(str2))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }
}
