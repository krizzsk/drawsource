package com.fyber.inneractive.sdk.player.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.C4652e;
import com.fyber.inneractive.sdk.player.exoplayer2.C4855p;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4882m;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4884n;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4886o;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4887p;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4890s;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4906e;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4908f;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4909g;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4910h;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4943k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4972g;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4987q;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;
import com.mbridge.msdk.playercommon.exoplayer2.C8975C;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.h */
public final class C4806h implements Handler.Callback, C4882m.C4883a, C4884n.C4885a {

    /* renamed from: A */
    public C4809c f12687A;

    /* renamed from: B */
    public long f12688B;

    /* renamed from: C */
    public C4807a f12689C;

    /* renamed from: D */
    public C4807a f12690D;

    /* renamed from: E */
    public C4807a f12691E;

    /* renamed from: F */
    public C4855p f12692F;

    /* renamed from: a */
    public final C4853n[] f12693a;

    /* renamed from: b */
    public final C4611a[] f12694b;

    /* renamed from: c */
    public final C4909g f12695c;

    /* renamed from: d */
    public final C4638c f12696d;

    /* renamed from: e */
    public final C4987q f12697e;

    /* renamed from: f */
    public final Handler f12698f;

    /* renamed from: g */
    public final HandlerThread f12699g;

    /* renamed from: h */
    public final Handler f12700h;

    /* renamed from: i */
    public final C4652e f12701i;

    /* renamed from: j */
    public final C4855p.C4858c f12702j;

    /* renamed from: k */
    public final C4855p.C4857b f12703k;

    /* renamed from: l */
    public C4808b f12704l;

    /* renamed from: m */
    public C4816m f12705m;

    /* renamed from: n */
    public C4853n f12706n;

    /* renamed from: o */
    public C4972g f12707o;

    /* renamed from: p */
    public C4884n f12708p;

    /* renamed from: q */
    public C4853n[] f12709q;

    /* renamed from: r */
    public boolean f12710r;

    /* renamed from: s */
    public boolean f12711s;

    /* renamed from: t */
    public boolean f12712t;

    /* renamed from: u */
    public boolean f12713u;

    /* renamed from: v */
    public int f12714v = 1;

    /* renamed from: w */
    public int f12715w;

    /* renamed from: x */
    public int f12716x;

    /* renamed from: y */
    public long f12717y;

    /* renamed from: z */
    public int f12718z;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.h$a */
    public static final class C4807a {

        /* renamed from: a */
        public final C4882m f12719a;

        /* renamed from: b */
        public final Object f12720b;

        /* renamed from: c */
        public final C4886o[] f12721c;

        /* renamed from: d */
        public final boolean[] f12722d;

        /* renamed from: e */
        public final long f12723e;

        /* renamed from: f */
        public int f12724f;

        /* renamed from: g */
        public long f12725g;

        /* renamed from: h */
        public boolean f12726h;

        /* renamed from: i */
        public boolean f12727i;

        /* renamed from: j */
        public boolean f12728j;

        /* renamed from: k */
        public C4807a f12729k;

        /* renamed from: l */
        public boolean f12730l;

        /* renamed from: m */
        public C4910h f12731m;

        /* renamed from: n */
        public final C4853n[] f12732n;

        /* renamed from: o */
        public final C4611a[] f12733o;

        /* renamed from: p */
        public final C4909g f12734p;

        /* renamed from: q */
        public final C4638c f12735q;

        /* renamed from: r */
        public final C4884n f12736r;

        /* renamed from: s */
        public C4910h f12737s;

        public C4807a(C4853n[] nVarArr, C4611a[] aVarArr, long j, C4909g gVar, C4638c cVar, C4884n nVar, Object obj, int i, boolean z, long j2) {
            this.f12732n = nVarArr;
            this.f12733o = aVarArr;
            this.f12723e = j;
            this.f12734p = gVar;
            this.f12735q = cVar;
            this.f12736r = nVar;
            this.f12720b = C4965a.m15047a(obj);
            this.f12724f = i;
            this.f12726h = z;
            this.f12725g = j2;
            this.f12721c = new C4886o[nVarArr.length];
            this.f12722d = new boolean[nVarArr.length];
            this.f12719a = nVar.mo25129a(i, cVar.mo25026a(), j2);
        }

        /* renamed from: a */
        public long mo25293a() {
            return this.f12723e - this.f12725g;
        }

        /* renamed from: b */
        public boolean mo25295b() {
            return this.f12727i && (!this.f12728j || this.f12719a.mo25125d() == Long.MIN_VALUE);
        }

        /* renamed from: c */
        public void mo25296c() {
            try {
                this.f12736r.mo25132a(this.f12719a);
            } catch (RuntimeException e) {
                Log.e("ExoPlayerImplInternal", "Period release failed.", e);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x002d A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo25297d() throws com.fyber.inneractive.sdk.player.exoplayer2.C4639d {
            /*
                r6 = this;
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.g r0 = r6.f12734p
                com.fyber.inneractive.sdk.player.exoplayer2.a[] r1 = r6.f12733o
                com.fyber.inneractive.sdk.player.exoplayer2.source.m r2 = r6.f12719a
                com.fyber.inneractive.sdk.player.exoplayer2.source.s r2 = r2.mo25122b()
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h r0 = r0.mo25430a(r1, r2)
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h r1 = r6.f12737s
                r0.getClass()
                r2 = 1
                r3 = 0
                if (r1 != 0) goto L_0x0018
                goto L_0x0025
            L_0x0018:
                r4 = r3
            L_0x0019:
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.f r5 = r0.f13035b
                int r5 = r5.f13031a
                if (r4 >= r5) goto L_0x002a
                boolean r5 = r0.mo25435a(r1, r4)
                if (r5 != 0) goto L_0x0027
            L_0x0025:
                r1 = r3
                goto L_0x002b
            L_0x0027:
                int r4 = r4 + 1
                goto L_0x0019
            L_0x002a:
                r1 = r2
            L_0x002b:
                if (r1 == 0) goto L_0x002e
                return r3
            L_0x002e:
                r6.f12731m = r0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.C4806h.C4807a.mo25297d():boolean");
        }

        /* renamed from: a */
        public long mo25294a(long j, boolean z, boolean[] zArr) {
            int i;
            C4908f fVar = this.f12731m.f13035b;
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                boolean z3 = true;
                if (i2 >= fVar.f13031a) {
                    break;
                }
                boolean[] zArr2 = this.f12722d;
                if (z || !this.f12731m.mo25435a(this.f12737s, i2)) {
                    z3 = false;
                }
                zArr2[i2] = z3;
                i2++;
            }
            long a = this.f12719a.mo25115a((C4906e[]) fVar.f13032b.clone(), this.f12722d, this.f12721c, zArr, j);
            this.f12737s = this.f12731m;
            this.f12728j = false;
            int i3 = 0;
            while (true) {
                C4886o[] oVarArr = this.f12721c;
                if (i3 >= oVarArr.length) {
                    break;
                }
                if (oVarArr[i3] != null) {
                    C4965a.m15051b(fVar.f13032b[i3] != null);
                    this.f12728j = true;
                } else {
                    C4965a.m15051b(fVar.f13032b[i3] == null);
                }
                i3++;
            }
            C4638c cVar = this.f12735q;
            C4853n[] nVarArr = this.f12732n;
            C4890s sVar = this.f12731m.f13034a;
            cVar.f11636f = 0;
            for (int i4 = 0; i4 < nVarArr.length; i4++) {
                if (fVar.f13032b[i4] != null) {
                    int i5 = cVar.f11636f;
                    int k = nVarArr[i4].mo24947k();
                    int i6 = C4991u.f13270a;
                    if (k == 0) {
                        i = 16777216;
                    } else if (k == 1) {
                        i = C8975C.DEFAULT_AUDIO_BUFFER_SIZE;
                    } else if (k == 2) {
                        i = 13107200;
                    } else if (k == 3 || k == 4) {
                        i = 131072;
                    } else {
                        throw new IllegalStateException();
                    }
                    cVar.f11636f = i5 + i;
                }
            }
            C4943k kVar = cVar.f11631a;
            int i7 = cVar.f11636f;
            synchronized (kVar) {
                if (i7 < kVar.f13137e) {
                    z2 = true;
                }
                kVar.f13137e = i7;
                if (z2) {
                    kVar.mo25482b();
                }
            }
            return a;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.h$b */
    public static final class C4808b {

        /* renamed from: a */
        public final int f12738a;

        /* renamed from: b */
        public final long f12739b;

        /* renamed from: c */
        public volatile long f12740c;

        /* renamed from: d */
        public volatile long f12741d;

        public C4808b(int i, long j) {
            this.f12738a = i;
            this.f12739b = j;
            this.f12740c = j;
            this.f12741d = j;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.h$c */
    public static final class C4809c {

        /* renamed from: a */
        public final C4855p f12742a;

        /* renamed from: b */
        public final int f12743b;

        /* renamed from: c */
        public final long f12744c;

        public C4809c(C4855p pVar, int i, long j) {
            this.f12742a = pVar;
            this.f12743b = i;
            this.f12744c = j;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.h$d */
    public static final class C4810d {

        /* renamed from: a */
        public final C4855p f12745a;

        /* renamed from: b */
        public final Object f12746b;

        /* renamed from: c */
        public final C4808b f12747c;

        /* renamed from: d */
        public final int f12748d;

        public C4810d(C4855p pVar, Object obj, C4808b bVar, int i) {
            this.f12745a = pVar;
            this.f12746b = obj;
            this.f12747c = bVar;
            this.f12748d = i;
        }
    }

    public C4806h(C4853n[] nVarArr, C4909g gVar, C4638c cVar, boolean z, Handler handler, C4808b bVar, C4652e eVar) {
        this.f12693a = nVarArr;
        this.f12695c = gVar;
        this.f12696d = cVar;
        this.f12711s = z;
        this.f12700h = handler;
        this.f12704l = bVar;
        this.f12701i = eVar;
        this.f12694b = new C4611a[nVarArr.length];
        for (int i = 0; i < nVarArr.length; i++) {
            nVarArr[i].mo24933a(i);
            this.f12694b[i] = nVarArr[i].mo24949m();
        }
        this.f12697e = new C4987q();
        this.f12709q = new C4853n[0];
        this.f12702j = new C4855p.C4858c();
        this.f12703k = new C4855p.C4857b();
        this.f12705m = C4816m.f12777d;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f12699g = handlerThread;
        handlerThread.start();
        this.f12698f = new Handler(handlerThread.getLooper(), this);
    }

    /* renamed from: a */
    public void mo25270a(C4887p pVar) {
        this.f12698f.obtainMessage(9, (C4882m) pVar).sendToTarget();
    }

    /* renamed from: b */
    public final void mo25280b(C4809c cVar) throws C4639d {
        int i = 1;
        if (this.f12692F == null) {
            this.f12718z++;
            this.f12687A = cVar;
            return;
        }
        Pair<Integer, Long> a = mo25258a(cVar);
        if (a == null) {
            C4808b bVar = new C4808b(0, 0);
            this.f12704l = bVar;
            this.f12700h.obtainMessage(4, 1, 0, bVar).sendToTarget();
            this.f12704l = new C4808b(0, -9223372036854775807L);
            mo25261a(4);
            mo25282b(false);
            return;
        }
        int i2 = cVar.f12744c == -9223372036854775807L ? 1 : 0;
        int intValue = ((Integer) a.first).intValue();
        long longValue = ((Long) a.second).longValue();
        try {
            C4808b bVar2 = this.f12704l;
            if (intValue != bVar2.f12738a || longValue / 1000 != bVar2.f12740c / 1000) {
                long b = mo25276b(intValue, longValue);
                if (longValue == b) {
                    i = 0;
                }
                C4808b bVar3 = new C4808b(intValue, b);
                this.f12704l = bVar3;
                this.f12700h.obtainMessage(4, i2 | i, 0, bVar3).sendToTarget();
            }
        } finally {
            C4808b bVar4 = new C4808b(intValue, longValue);
            this.f12704l = bVar4;
            this.f12700h.obtainMessage(4, i2, 0, bVar4).sendToTarget();
        }
    }

    /* renamed from: c */
    public final void mo25284c(boolean z) {
        if (this.f12713u != z) {
            this.f12713u = z;
            this.f12700h.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
        }
    }

    /* renamed from: d */
    public final void mo25286d(boolean z) throws C4639d {
        this.f12712t = false;
        this.f12711s = z;
        if (!z) {
            mo25290h();
            mo25292i();
            mo25282b(false);
            return;
        }
        int i = this.f12714v;
        if (i == 3) {
            mo25288f();
            this.f12698f.sendEmptyMessage(2);
        } else if (i == 2) {
            this.f12698f.sendEmptyMessage(2);
        }
    }

    /* renamed from: e */
    public final void mo25287e() throws C4639d {
        C4807a aVar = this.f12691E;
        if (aVar != null) {
            boolean z = true;
            while (aVar != null && aVar.f12727i) {
                if (aVar.mo25297d()) {
                    if (z) {
                        C4807a aVar2 = this.f12690D;
                        C4807a aVar3 = this.f12691E;
                        boolean z2 = aVar2 != aVar3;
                        mo25264a(aVar3.f12729k);
                        C4807a aVar4 = this.f12691E;
                        aVar4.f12729k = null;
                        this.f12689C = aVar4;
                        this.f12690D = aVar4;
                        boolean[] zArr = new boolean[this.f12693a.length];
                        long a = aVar4.mo25294a(this.f12704l.f12740c, z2, zArr);
                        if (a != this.f12704l.f12740c) {
                            this.f12704l.f12740c = a;
                            mo25278b(a);
                        }
                        boolean[] zArr2 = new boolean[this.f12693a.length];
                        int i = 0;
                        int i2 = 0;
                        while (true) {
                            C4853n[] nVarArr = this.f12693a;
                            if (i >= nVarArr.length) {
                                break;
                            }
                            C4853n nVar = nVarArr[i];
                            zArr2[i] = nVar.mo24931a() != 0;
                            C4886o oVar = this.f12691E.f12721c[i];
                            if (oVar != null) {
                                i2++;
                            }
                            if (zArr2[i]) {
                                if (oVar != nVar.mo24950n()) {
                                    if (nVar == this.f12706n) {
                                        if (oVar == null) {
                                            this.f12697e.mo25557a(this.f12707o);
                                        }
                                        this.f12707o = null;
                                        this.f12706n = null;
                                    }
                                    mo25266a(nVar);
                                    nVar.mo24948l();
                                } else if (zArr[i]) {
                                    nVar.mo24934a(this.f12688B);
                                }
                            }
                            i++;
                        }
                        this.f12700h.obtainMessage(3, aVar.f12731m).sendToTarget();
                        mo25273a(zArr2, i2);
                    } else {
                        this.f12689C = aVar;
                        for (C4807a aVar5 = aVar.f12729k; aVar5 != null; aVar5 = aVar5.f12729k) {
                            aVar5.mo25296c();
                        }
                        C4807a aVar6 = this.f12689C;
                        aVar6.f12729k = null;
                        if (aVar6.f12727i) {
                            long max = Math.max(aVar6.f12725g, this.f12688B - aVar6.mo25293a());
                            C4807a aVar7 = this.f12689C;
                            aVar7.mo25294a(max, false, new boolean[aVar7.f12732n.length]);
                        }
                    }
                    mo25277b();
                    mo25292i();
                    this.f12698f.sendEmptyMessage(2);
                    return;
                }
                if (aVar == this.f12690D) {
                    z = false;
                }
                aVar = aVar.f12729k;
            }
        }
    }

    /* renamed from: f */
    public final void mo25288f() throws C4639d {
        this.f12712t = false;
        C4987q qVar = this.f12697e;
        if (!qVar.f13263a) {
            qVar.f13265c = SystemClock.elapsedRealtime();
            qVar.f13263a = true;
        }
        for (C4853n f : this.f12709q) {
            f.mo24943f();
        }
    }

    /* renamed from: g */
    public final void mo25289g() {
        mo25282b(true);
        this.f12696d.mo25027a(true);
        mo25261a(1);
    }

    /* renamed from: h */
    public final void mo25290h() throws C4639d {
        C4987q qVar = this.f12697e;
        if (qVar.f13263a) {
            qVar.mo25556a(qVar.mo24984o());
            qVar.f13263a = false;
        }
        for (C4853n a : this.f12709q) {
            mo25266a(a);
        }
    }

    public boolean handleMessage(Message message) {
        try {
            switch (message.what) {
                case 0:
                    mo25269a((C4884n) message.obj, message.arg1 != 0);
                    return true;
                case 1:
                    mo25286d(message.arg1 != 0);
                    return true;
                case 2:
                    mo25260a();
                    return true;
                case 3:
                    mo25280b((C4809c) message.obj);
                    return true;
                case 4:
                    mo25265a((C4816m) message.obj);
                    return true;
                case 5:
                    mo25289g();
                    return true;
                case 6:
                    mo25285d();
                    return true;
                case 7:
                    mo25263a((Pair<C4855p, Object>) (Pair) message.obj);
                    return true;
                case 8:
                    mo25268a((C4882m) message.obj);
                    return true;
                case 9:
                    C4882m mVar = (C4882m) message.obj;
                    C4807a aVar = this.f12689C;
                    if (aVar != null) {
                        if (aVar.f12719a == mVar) {
                            mo25277b();
                        }
                    }
                    return true;
                case 10:
                    mo25287e();
                    return true;
                case 11:
                    mo25272a((C4652e.C4655c[]) message.obj);
                    return true;
                default:
                    return false;
            }
        } catch (C4639d e) {
            Log.e("ExoPlayerImplInternal", "Renderer error.", e);
            this.f12700h.obtainMessage(8, e).sendToTarget();
            mo25289g();
            return true;
        } catch (IOException e2) {
            Log.e("ExoPlayerImplInternal", "Source error.", e2);
            this.f12700h.obtainMessage(8, new C4639d(0, (String) null, e2, -1)).sendToTarget();
            mo25289g();
            return true;
        } catch (RuntimeException e3) {
            Log.e("ExoPlayerImplInternal", "Internal runtime error.", e3);
            this.f12700h.obtainMessage(8, new C4639d(2, (String) null, e3, -1)).sendToTarget();
            mo25289g();
            return true;
        }
    }

    /* renamed from: i */
    public final void mo25292i() throws C4639d {
        long j;
        C4807a aVar = this.f12691E;
        if (aVar != null) {
            long f = aVar.f12719a.mo25127f();
            if (f != -9223372036854775807L) {
                mo25278b(f);
            } else {
                C4853n nVar = this.f12706n;
                if (nVar == null || nVar.mo24981b()) {
                    this.f12688B = this.f12697e.mo24984o();
                } else {
                    long o = this.f12707o.mo24984o();
                    this.f12688B = o;
                    this.f12697e.mo25556a(o);
                }
                f = this.f12688B - this.f12691E.mo25293a();
            }
            this.f12704l.f12740c = f;
            this.f12717y = SystemClock.elapsedRealtime() * 1000;
            if (this.f12709q.length == 0) {
                j = Long.MIN_VALUE;
            } else {
                j = this.f12691E.f12719a.mo25125d();
            }
            C4808b bVar = this.f12704l;
            if (j == Long.MIN_VALUE) {
                j = this.f12692F.mo25384a(this.f12691E.f12724f, this.f12703k, false).f12879d;
            }
            bVar.f12741d = j;
        }
    }

    /* renamed from: a */
    public void mo25267a(C4855p pVar, Object obj) {
        this.f12698f.obtainMessage(7, Pair.create(pVar, obj)).sendToTarget();
    }

    /* renamed from: a */
    public final void mo25261a(int i) {
        if (this.f12714v != i) {
            this.f12714v = i;
            this.f12700h.obtainMessage(1, i, 0).sendToTarget();
        }
    }

    /* renamed from: c */
    public final void mo25283c() throws IOException {
        C4807a aVar = this.f12689C;
        if (aVar != null && !aVar.f12727i) {
            C4807a aVar2 = this.f12690D;
            if (aVar2 == null || aVar2.f12729k == aVar) {
                C4853n[] nVarArr = this.f12709q;
                int length = nVarArr.length;
                int i = 0;
                while (i < length) {
                    if (nVarArr[i].mo24944g()) {
                        i++;
                    } else {
                        return;
                    }
                }
                this.f12689C.f12719a.mo25126e();
            }
        }
    }

    /* renamed from: a */
    public final void mo25269a(C4884n nVar, boolean z) {
        this.f12700h.sendEmptyMessage(0);
        mo25282b(true);
        this.f12696d.mo25027a(false);
        if (z) {
            this.f12704l = new C4808b(0, -9223372036854775807L);
        }
        this.f12708p = nVar;
        nVar.mo25131a(this.f12701i, true, (C4884n.C4885a) this);
        mo25261a(2);
        this.f12698f.sendEmptyMessage(2);
    }

    /* renamed from: d */
    public final void mo25285d() {
        mo25282b(true);
        this.f12696d.mo25027a(true);
        mo25261a(1);
        synchronized (this) {
            this.f12710r = true;
            notifyAll();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x015a A[LOOP:0: B:55:0x015a->B:59:0x016a, LOOP_START] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25260a() throws com.fyber.inneractive.sdk.player.exoplayer2.C4639d, java.io.IOException {
        /*
            r27 = this;
            r7 = r27
            long r8 = android.os.SystemClock.elapsedRealtime()
            com.fyber.inneractive.sdk.player.exoplayer2.p r0 = r7.f12692F
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12 = 0
            r13 = 1
            if (r0 != 0) goto L_0x0018
            com.fyber.inneractive.sdk.player.exoplayer2.source.n r0 = r7.f12708p
            r0.mo25130a()
            goto L_0x0253
        L_0x0018:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r7.f12689C
            if (r0 != 0) goto L_0x0021
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r0 = r7.f12704l
            int r0 = r0.f12738a
            goto L_0x004f
        L_0x0021:
            int r1 = r0.f12724f
            boolean r2 = r0.f12726h
            if (r2 != 0) goto L_0x013a
            boolean r0 = r0.mo25295b()
            if (r0 == 0) goto L_0x013a
            com.fyber.inneractive.sdk.player.exoplayer2.p r0 = r7.f12692F
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r2 = r7.f12703k
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r0 = r0.mo25384a(r1, r2, r12)
            long r2 = r0.f12879d
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x003d
            goto L_0x013a
        L_0x003d:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r7.f12691E
            if (r0 == 0) goto L_0x004a
            int r0 = r0.f12724f
            int r1 = r1 - r0
            r0 = 100
            if (r1 != r0) goto L_0x004a
            goto L_0x013a
        L_0x004a:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r7.f12689C
            int r0 = r0.f12724f
            int r0 = r0 + r13
        L_0x004f:
            com.fyber.inneractive.sdk.player.exoplayer2.p r1 = r7.f12692F
            int r1 = r1.mo25382a()
            if (r0 < r1) goto L_0x005e
            com.fyber.inneractive.sdk.player.exoplayer2.source.n r0 = r7.f12708p
            r0.mo25130a()
            goto L_0x013a
        L_0x005e:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r1 = r7.f12689C
            r2 = 0
            if (r1 != 0) goto L_0x006b
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r1 = r7.f12704l
            long r2 = r1.f12740c
        L_0x0068:
            r25 = r2
            goto L_0x00c6
        L_0x006b:
            com.fyber.inneractive.sdk.player.exoplayer2.p r1 = r7.f12692F
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r4 = r7.f12703k
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r1 = r1.mo25384a(r0, r4, r12)
            int r4 = r1.f12878c
            com.fyber.inneractive.sdk.player.exoplayer2.p r1 = r7.f12692F
            com.fyber.inneractive.sdk.player.exoplayer2.p$c r5 = r7.f12702j
            com.fyber.inneractive.sdk.player.exoplayer2.p$c r1 = r1.mo25385a(r4, r5)
            int r1 = r1.f12883c
            if (r0 == r1) goto L_0x0082
            goto L_0x0068
        L_0x0082:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r7.f12689C
            long r0 = r0.mo25293a()
            com.fyber.inneractive.sdk.player.exoplayer2.p r5 = r7.f12692F
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r6 = r7.f12689C
            int r6 = r6.f12724f
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r14 = r7.f12703k
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r5 = r5.mo25384a(r6, r14, r12)
            long r5 = r5.f12879d
            long r0 = r0 + r5
            long r5 = r7.f12688B
            long r0 = r0 - r5
            com.fyber.inneractive.sdk.player.exoplayer2.p r5 = r7.f12692F
            long r14 = java.lang.Math.max(r2, r0)
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r27
            r1 = r5
            r2 = r4
            r3 = r16
            r5 = r14
            android.util.Pair r0 = r0.mo25259a(r1, r2, r3, r5)
            if (r0 != 0) goto L_0x00b4
            goto L_0x013a
        L_0x00b4:
            java.lang.Object r1 = r0.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            r0 = r1
            goto L_0x0068
        L_0x00c6:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r1 = r7.f12689C
            if (r1 != 0) goto L_0x00d0
            r1 = 60000000(0x3938700, double:2.96439388E-316)
            long r1 = r25 + r1
            goto L_0x00e3
        L_0x00d0:
            long r1 = r1.mo25293a()
            com.fyber.inneractive.sdk.player.exoplayer2.p r3 = r7.f12692F
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r4 = r7.f12689C
            int r4 = r4.f12724f
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r5 = r7.f12703k
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r3 = r3.mo25384a(r4, r5, r12)
            long r3 = r3.f12879d
            long r1 = r1 + r3
        L_0x00e3:
            r17 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.p r1 = r7.f12692F
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r2 = r7.f12703k
            r1.mo25384a(r0, r2, r13)
            com.fyber.inneractive.sdk.player.exoplayer2.p r1 = r7.f12692F
            int r1 = r1.mo25382a()
            int r1 = r1 - r13
            if (r0 != r1) goto L_0x0108
            com.fyber.inneractive.sdk.player.exoplayer2.p r1 = r7.f12692F
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r2 = r7.f12703k
            int r2 = r2.f12878c
            com.fyber.inneractive.sdk.player.exoplayer2.p$c r3 = r7.f12702j
            com.fyber.inneractive.sdk.player.exoplayer2.p$c r1 = r1.mo25385a(r2, r3)
            boolean r1 = r1.f12882b
            if (r1 != 0) goto L_0x0108
            r24 = r13
            goto L_0x010a
        L_0x0108:
            r24 = r12
        L_0x010a:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r1 = new com.fyber.inneractive.sdk.player.exoplayer2.h$a
            com.fyber.inneractive.sdk.player.exoplayer2.n[] r15 = r7.f12693a
            com.fyber.inneractive.sdk.player.exoplayer2.a[] r2 = r7.f12694b
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.g r3 = r7.f12695c
            com.fyber.inneractive.sdk.player.exoplayer2.c r4 = r7.f12696d
            com.fyber.inneractive.sdk.player.exoplayer2.source.n r5 = r7.f12708p
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r6 = r7.f12703k
            java.lang.Object r6 = r6.f12877b
            r14 = r1
            r16 = r2
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r0
            r14.<init>(r15, r16, r17, r19, r20, r21, r22, r23, r24, r25)
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r7.f12689C
            if (r0 == 0) goto L_0x0130
            r0.f12729k = r1
        L_0x0130:
            r7.f12689C = r1
            com.fyber.inneractive.sdk.player.exoplayer2.source.m r0 = r1.f12719a
            r0.mo25118a((com.fyber.inneractive.sdk.player.exoplayer2.source.C4882m.C4883a) r7)
            r7.mo25284c(r13)
        L_0x013a:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r7.f12689C
            if (r0 == 0) goto L_0x0151
            boolean r0 = r0.mo25295b()
            if (r0 == 0) goto L_0x0145
            goto L_0x0151
        L_0x0145:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r7.f12689C
            if (r0 == 0) goto L_0x0154
            boolean r0 = r0.f12730l
            if (r0 == 0) goto L_0x0154
            r27.mo25277b()
            goto L_0x0154
        L_0x0151:
            r7.mo25284c(r12)
        L_0x0154:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r7.f12691E
            if (r0 != 0) goto L_0x015a
            goto L_0x0253
        L_0x015a:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r7.f12691E
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r1 = r7.f12690D
            if (r0 == r1) goto L_0x0191
            long r2 = r7.f12688B
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r4 = r0.f12729k
            long r4 = r4.f12723e
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x0191
            r0.mo25296c()
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r7.f12691E
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r0.f12729k
            r7.mo25279b((com.fyber.inneractive.sdk.player.exoplayer2.C4806h.C4807a) r0)
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r0 = new com.fyber.inneractive.sdk.player.exoplayer2.h$b
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r1 = r7.f12691E
            int r2 = r1.f12724f
            long r3 = r1.f12725g
            r0.<init>(r2, r3)
            r7.f12704l = r0
            r27.mo25292i()
            android.os.Handler r0 = r7.f12700h
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r1 = r7.f12704l
            r2 = 5
            android.os.Message r0 = r0.obtainMessage(r2, r1)
            r0.sendToTarget()
            goto L_0x015a
        L_0x0191:
            boolean r0 = r1.f12726h
            if (r0 == 0) goto L_0x01b7
            r0 = r12
        L_0x0196:
            com.fyber.inneractive.sdk.player.exoplayer2.n[] r1 = r7.f12693a
            int r2 = r1.length
            if (r0 >= r2) goto L_0x0253
            r1 = r1[r0]
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r2 = r7.f12690D
            com.fyber.inneractive.sdk.player.exoplayer2.source.o[] r2 = r2.f12721c
            r2 = r2[r0]
            if (r2 == 0) goto L_0x01b4
            com.fyber.inneractive.sdk.player.exoplayer2.source.o r3 = r1.mo24950n()
            if (r3 != r2) goto L_0x01b4
            boolean r2 = r1.mo24944g()
            if (r2 == 0) goto L_0x01b4
            r1.mo24940c()
        L_0x01b4:
            int r0 = r0 + 1
            goto L_0x0196
        L_0x01b7:
            r0 = r12
        L_0x01b8:
            com.fyber.inneractive.sdk.player.exoplayer2.n[] r1 = r7.f12693a
            int r2 = r1.length
            if (r0 >= r2) goto L_0x01d8
            r1 = r1[r0]
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r2 = r7.f12690D
            com.fyber.inneractive.sdk.player.exoplayer2.source.o[] r2 = r2.f12721c
            r2 = r2[r0]
            com.fyber.inneractive.sdk.player.exoplayer2.source.o r3 = r1.mo24950n()
            if (r3 != r2) goto L_0x0253
            if (r2 == 0) goto L_0x01d5
            boolean r1 = r1.mo24944g()
            if (r1 != 0) goto L_0x01d5
            goto L_0x0253
        L_0x01d5:
            int r0 = r0 + 1
            goto L_0x01b8
        L_0x01d8:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r7.f12690D
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r1 = r0.f12729k
            if (r1 == 0) goto L_0x0253
            boolean r2 = r1.f12727i
            if (r2 == 0) goto L_0x0253
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h r0 = r0.f12731m
            r7.f12690D = r1
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h r2 = r1.f12731m
            com.fyber.inneractive.sdk.player.exoplayer2.source.m r1 = r1.f12719a
            long r3 = r1.mo25127f()
            int r1 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r1 == 0) goto L_0x01f4
            r1 = r13
            goto L_0x01f5
        L_0x01f4:
            r1 = r12
        L_0x01f5:
            r3 = r12
        L_0x01f6:
            com.fyber.inneractive.sdk.player.exoplayer2.n[] r4 = r7.f12693a
            int r5 = r4.length
            if (r3 >= r5) goto L_0x0253
            r4 = r4[r3]
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.f r5 = r0.f13035b
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e[] r5 = r5.f13032b
            r5 = r5[r3]
            if (r5 != 0) goto L_0x0206
            goto L_0x024b
        L_0x0206:
            if (r1 == 0) goto L_0x020c
            r4.mo24940c()
            goto L_0x024b
        L_0x020c:
            boolean r5 = r4.mo24945h()
            if (r5 != 0) goto L_0x024b
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.f r5 = r2.f13035b
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e[] r5 = r5.f13032b
            r5 = r5[r3]
            com.fyber.inneractive.sdk.player.exoplayer2.o[] r6 = r0.f13037d
            r6 = r6[r3]
            com.fyber.inneractive.sdk.player.exoplayer2.o[] r14 = r2.f13037d
            r14 = r14[r3]
            if (r5 == 0) goto L_0x0248
            boolean r6 = r14.equals(r6)
            if (r6 == 0) goto L_0x0248
            int r6 = r5.mo25423f()
            com.fyber.inneractive.sdk.player.exoplayer2.i[] r14 = new com.fyber.inneractive.sdk.player.exoplayer2.C4811i[r6]
            r15 = r12
        L_0x022f:
            if (r15 >= r6) goto L_0x023a
            com.fyber.inneractive.sdk.player.exoplayer2.i r16 = r5.mo25415a((int) r15)
            r14[r15] = r16
            int r15 = r15 + 1
            goto L_0x022f
        L_0x023a:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r5 = r7.f12690D
            com.fyber.inneractive.sdk.player.exoplayer2.source.o[] r6 = r5.f12721c
            r6 = r6[r3]
            long r10 = r5.mo25293a()
            r4.mo24939a(r14, r6, r10)
            goto L_0x024b
        L_0x0248:
            r4.mo24940c()
        L_0x024b:
            int r3 = r3 + 1
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x01f6
        L_0x0253:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r7.f12691E
            r1 = 10
            if (r0 != 0) goto L_0x0260
            r27.mo25283c()
            r7.mo25262a((long) r8, (long) r1)
            return
        L_0x0260:
            java.lang.String r0 = "doSomeWork"
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4989s.m15127a(r0)
            r27.mo25292i()
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r7.f12691E
            com.fyber.inneractive.sdk.player.exoplayer2.source.m r0 = r0.f12719a
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r3 = r7.f12704l
            long r3 = r3.f12740c
            r0.mo25124c(r3)
            com.fyber.inneractive.sdk.player.exoplayer2.n[] r0 = r7.f12709q
            int r3 = r0.length
            r4 = r12
            r5 = r13
            r6 = r5
        L_0x0279:
            if (r4 >= r3) goto L_0x02b1
            r10 = r0[r4]
            long r13 = r7.f12688B
            long r1 = r7.f12717y
            r10.mo25312a(r13, r1)
            if (r6 == 0) goto L_0x028e
            boolean r1 = r10.mo24981b()
            if (r1 == 0) goto L_0x028e
            r6 = 1
            goto L_0x028f
        L_0x028e:
            r6 = r12
        L_0x028f:
            boolean r1 = r10.isReady()
            if (r1 != 0) goto L_0x029e
            boolean r1 = r10.mo24981b()
            if (r1 == 0) goto L_0x029c
            goto L_0x029e
        L_0x029c:
            r1 = r12
            goto L_0x029f
        L_0x029e:
            r1 = 1
        L_0x029f:
            if (r1 != 0) goto L_0x02a4
            r10.mo24942e()
        L_0x02a4:
            if (r5 == 0) goto L_0x02aa
            if (r1 == 0) goto L_0x02aa
            r5 = 1
            goto L_0x02ab
        L_0x02aa:
            r5 = r12
        L_0x02ab:
            int r4 = r4 + 1
            r1 = 10
            r13 = 1
            goto L_0x0279
        L_0x02b1:
            if (r5 != 0) goto L_0x02b6
            r27.mo25283c()
        L_0x02b6:
            com.fyber.inneractive.sdk.player.exoplayer2.util.g r0 = r7.f12707o
            if (r0 == 0) goto L_0x02d9
            com.fyber.inneractive.sdk.player.exoplayer2.m r0 = r0.mo24982i()
            com.fyber.inneractive.sdk.player.exoplayer2.m r1 = r7.f12705m
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x02d9
            r7.f12705m = r0
            com.fyber.inneractive.sdk.player.exoplayer2.util.q r1 = r7.f12697e
            com.fyber.inneractive.sdk.player.exoplayer2.util.g r2 = r7.f12707o
            r1.mo25557a((com.fyber.inneractive.sdk.player.exoplayer2.util.C4972g) r2)
            android.os.Handler r1 = r7.f12700h
            r2 = 7
            android.os.Message r0 = r1.obtainMessage(r2, r0)
            r0.sendToTarget()
        L_0x02d9:
            com.fyber.inneractive.sdk.player.exoplayer2.p r0 = r7.f12692F
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r1 = r7.f12691E
            int r1 = r1.f12724f
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r2 = r7.f12703k
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r0 = r0.mo25384a(r1, r2, r12)
            long r0 = r0.f12879d
            r2 = 3
            r3 = 2
            if (r6 == 0) goto L_0x030a
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x02fc
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r4 = r7.f12704l
            long r13 = r4.f12740c
            int r4 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r4 > 0) goto L_0x030a
        L_0x02fc:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r4 = r7.f12691E
            boolean r4 = r4.f12726h
            if (r4 == 0) goto L_0x030a
            r0 = 4
            r7.mo25261a((int) r0)
            r27.mo25290h()
            goto L_0x034a
        L_0x030a:
            int r4 = r7.f12714v
            if (r4 != r3) goto L_0x0332
            com.fyber.inneractive.sdk.player.exoplayer2.n[] r4 = r7.f12709q
            int r4 = r4.length
            if (r4 <= 0) goto L_0x0321
            if (r5 == 0) goto L_0x031f
            boolean r0 = r7.f12712t
            boolean r0 = r7.mo25275a((boolean) r0)
            if (r0 == 0) goto L_0x031f
            r13 = 1
            goto L_0x0325
        L_0x031f:
            r13 = r12
            goto L_0x0325
        L_0x0321:
            boolean r13 = r7.mo25274a((long) r0)
        L_0x0325:
            if (r13 == 0) goto L_0x034a
            r7.mo25261a((int) r2)
            boolean r0 = r7.f12711s
            if (r0 == 0) goto L_0x034a
            r27.mo25288f()
            goto L_0x034a
        L_0x0332:
            if (r4 != r2) goto L_0x034a
            com.fyber.inneractive.sdk.player.exoplayer2.n[] r4 = r7.f12709q
            int r4 = r4.length
            if (r4 <= 0) goto L_0x033a
            goto L_0x033e
        L_0x033a:
            boolean r5 = r7.mo25274a((long) r0)
        L_0x033e:
            if (r5 != 0) goto L_0x034a
            boolean r0 = r7.f12711s
            r7.f12712t = r0
            r7.mo25261a((int) r3)
            r27.mo25290h()
        L_0x034a:
            int r0 = r7.f12714v
            if (r0 != r3) goto L_0x035b
            com.fyber.inneractive.sdk.player.exoplayer2.n[] r0 = r7.f12709q
            int r1 = r0.length
        L_0x0351:
            if (r12 >= r1) goto L_0x035b
            r4 = r0[r12]
            r4.mo24942e()
            int r12 = r12 + 1
            goto L_0x0351
        L_0x035b:
            boolean r0 = r7.f12711s
            if (r0 == 0) goto L_0x0363
            int r0 = r7.f12714v
            if (r0 == r2) goto L_0x0367
        L_0x0363:
            int r0 = r7.f12714v
            if (r0 != r3) goto L_0x036d
        L_0x0367:
            r0 = 10
            r7.mo25262a((long) r8, (long) r0)
            goto L_0x037d
        L_0x036d:
            com.fyber.inneractive.sdk.player.exoplayer2.n[] r0 = r7.f12709q
            int r0 = r0.length
            if (r0 == 0) goto L_0x0378
            r0 = 1000(0x3e8, double:4.94E-321)
            r7.mo25262a((long) r8, (long) r0)
            goto L_0x037d
        L_0x0378:
            android.os.Handler r0 = r7.f12698f
            r0.removeMessages(r3)
        L_0x037d:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4989s.m15126a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.C4806h.mo25260a():void");
    }

    /* renamed from: b */
    public final long mo25276b(int i, long j) throws C4639d {
        C4807a aVar;
        mo25290h();
        this.f12712t = false;
        mo25261a(2);
        C4807a aVar2 = this.f12691E;
        if (aVar2 == null) {
            C4807a aVar3 = this.f12689C;
            if (aVar3 != null) {
                aVar3.mo25296c();
            }
            aVar = null;
        } else {
            aVar = null;
            while (aVar2 != null) {
                if (aVar2.f12724f != i || !aVar2.f12727i) {
                    aVar2.mo25296c();
                } else {
                    aVar = aVar2;
                }
                aVar2 = aVar2.f12729k;
            }
        }
        C4807a aVar4 = this.f12691E;
        if (!(aVar4 == aVar && aVar4 == this.f12690D)) {
            for (C4853n l : this.f12709q) {
                l.mo24948l();
            }
            this.f12709q = new C4853n[0];
            this.f12707o = null;
            this.f12706n = null;
            this.f12691E = null;
        }
        if (aVar != null) {
            aVar.f12729k = null;
            this.f12689C = aVar;
            this.f12690D = aVar;
            mo25279b(aVar);
            C4807a aVar5 = this.f12691E;
            if (aVar5.f12728j) {
                j = aVar5.f12719a.mo25121b(j);
            }
            mo25278b(j);
            mo25277b();
        } else {
            this.f12689C = null;
            this.f12690D = null;
            this.f12691E = null;
            mo25278b(j);
        }
        this.f12698f.sendEmptyMessage(2);
        return j;
    }

    /* renamed from: b */
    public final void mo25278b(long j) throws C4639d {
        long j2;
        C4807a aVar = this.f12691E;
        if (aVar == null) {
            j2 = 60000000;
        } else {
            j2 = aVar.mo25293a();
        }
        long j3 = j + j2;
        this.f12688B = j3;
        this.f12697e.mo25556a(j3);
        for (C4853n a : this.f12709q) {
            a.mo24934a(this.f12688B);
        }
    }

    /* renamed from: b */
    public final void mo25282b(boolean z) {
        this.f12698f.removeMessages(2);
        this.f12712t = false;
        C4987q qVar = this.f12697e;
        if (qVar.f13263a) {
            qVar.mo25556a(qVar.mo24984o());
            qVar.f13263a = false;
        }
        this.f12707o = null;
        this.f12706n = null;
        this.f12688B = 60000000;
        for (C4853n nVar : this.f12709q) {
            try {
                mo25266a(nVar);
                nVar.mo24948l();
            } catch (C4639d | RuntimeException e) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e);
            }
        }
        this.f12709q = new C4853n[0];
        C4807a aVar = this.f12691E;
        if (aVar == null) {
            aVar = this.f12689C;
        }
        mo25264a(aVar);
        this.f12689C = null;
        this.f12690D = null;
        this.f12691E = null;
        mo25284c(false);
        if (z) {
            C4884n nVar2 = this.f12708p;
            if (nVar2 != null) {
                nVar2.mo25133b();
                this.f12708p = null;
            }
            this.f12692F = null;
        }
    }

    /* renamed from: b */
    public final void mo25281b(Object obj, int i) {
        this.f12700h.obtainMessage(6, new C4810d(this.f12692F, obj, this.f12704l, i)).sendToTarget();
    }

    /* renamed from: b */
    public final void mo25277b() {
        long j;
        C4807a aVar = this.f12689C;
        if (!aVar.f12727i) {
            j = 0;
        } else {
            j = aVar.f12719a.mo25114a();
        }
        if (j == Long.MIN_VALUE) {
            mo25284c(false);
            return;
        }
        long a = this.f12688B - this.f12689C.mo25293a();
        boolean a2 = this.f12696d.mo25028a(j - a);
        mo25284c(a2);
        if (a2) {
            C4807a aVar2 = this.f12689C;
            aVar2.f12730l = false;
            aVar2.f12719a.mo25120a(a);
            return;
        }
        this.f12689C.f12730l = true;
    }

    /* renamed from: b */
    public final void mo25279b(C4807a aVar) throws C4639d {
        if (this.f12691E != aVar) {
            boolean[] zArr = new boolean[this.f12693a.length];
            int i = 0;
            int i2 = 0;
            while (true) {
                C4853n[] nVarArr = this.f12693a;
                if (i < nVarArr.length) {
                    C4853n nVar = nVarArr[i];
                    zArr[i] = nVar.mo24931a() != 0;
                    C4906e eVar = aVar.f12731m.f13035b.f13032b[i];
                    if (eVar != null) {
                        i2++;
                    }
                    if (zArr[i] && (eVar == null || (nVar.mo24945h() && nVar.mo24950n() == this.f12691E.f12721c[i]))) {
                        if (nVar == this.f12706n) {
                            this.f12697e.mo25557a(this.f12707o);
                            this.f12707o = null;
                            this.f12706n = null;
                        }
                        mo25266a(nVar);
                        nVar.mo24948l();
                    }
                    i++;
                } else {
                    this.f12691E = aVar;
                    this.f12700h.obtainMessage(3, aVar.f12731m).sendToTarget();
                    mo25273a(zArr, i2);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo25262a(long j, long j2) {
        this.f12698f.removeMessages(2);
        long elapsedRealtime = (j + j2) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.f12698f.sendEmptyMessage(2);
        } else {
            this.f12698f.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    /* renamed from: a */
    public final void mo25265a(C4816m mVar) {
        C4972g gVar = this.f12707o;
        if (gVar != null) {
            mVar = gVar.mo24973a(mVar);
        } else {
            C4987q qVar = this.f12697e;
            if (qVar.f13263a) {
                qVar.mo25556a(qVar.mo24984o());
            }
            qVar.f13266d = mVar;
        }
        this.f12705m = mVar;
        this.f12700h.obtainMessage(7, mVar).sendToTarget();
    }

    /* renamed from: a */
    public final void mo25272a(C4652e.C4655c[] cVarArr) throws C4639d {
        try {
            for (C4652e.C4655c cVar : cVarArr) {
                cVar.f11661a.mo24975a(cVar.f11662b, cVar.f11663c);
            }
            if (this.f12708p != null) {
                this.f12698f.sendEmptyMessage(2);
            }
            synchronized (this) {
                this.f12716x++;
                notifyAll();
            }
        } catch (Throwable th) {
            synchronized (this) {
                this.f12716x++;
                notifyAll();
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void mo25266a(C4853n nVar) throws C4639d {
        if (nVar.mo24931a() == 2) {
            nVar.mo24941d();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r3 = r2.f12691E.f12729k;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo25274a(long r3) {
        /*
            r2 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x001e
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r0 = r2.f12704l
            long r0 = r0.f12740c
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x001e
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r3 = r2.f12691E
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r3 = r3.f12729k
            if (r3 == 0) goto L_0x001c
            boolean r3 = r3.f12727i
            if (r3 == 0) goto L_0x001c
            goto L_0x001e
        L_0x001c:
            r3 = 0
            goto L_0x001f
        L_0x001e:
            r3 = 1
        L_0x001f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.C4806h.mo25274a(long):boolean");
    }

    /* renamed from: a */
    public final boolean mo25275a(boolean z) {
        long j;
        C4807a aVar = this.f12689C;
        if (!aVar.f12727i) {
            j = aVar.f12725g;
        } else {
            j = aVar.f12719a.mo25125d();
        }
        if (j == Long.MIN_VALUE) {
            C4807a aVar2 = this.f12689C;
            if (aVar2.f12726h) {
                return true;
            }
            j = this.f12692F.mo25384a(aVar2.f12724f, this.f12703k, false).f12879d;
        }
        C4638c cVar = this.f12696d;
        long a = j - (this.f12688B - this.f12689C.mo25293a());
        long j2 = z ? cVar.f11635e : cVar.f11634d;
        if (j2 <= 0 || a >= j2) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25263a(android.util.Pair<com.fyber.inneractive.sdk.player.exoplayer2.C4855p, java.lang.Object> r13) throws com.fyber.inneractive.sdk.player.exoplayer2.C4639d {
        /*
            r12 = this;
            com.fyber.inneractive.sdk.player.exoplayer2.p r0 = r12.f12692F
            java.lang.Object r1 = r13.first
            com.fyber.inneractive.sdk.player.exoplayer2.p r1 = (com.fyber.inneractive.sdk.player.exoplayer2.C4855p) r1
            r12.f12692F = r1
            java.lang.Object r13 = r13.second
            r2 = 0
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            if (r0 != 0) goto L_0x006e
            int r6 = r12.f12718z
            if (r6 <= 0) goto L_0x0041
            com.fyber.inneractive.sdk.player.exoplayer2.h$c r1 = r12.f12687A
            android.util.Pair r1 = r12.mo25258a((com.fyber.inneractive.sdk.player.exoplayer2.C4806h.C4809c) r1)
            int r6 = r12.f12718z
            r12.f12718z = r5
            r12.f12687A = r2
            if (r1 != 0) goto L_0x0029
            r12.mo25271a((java.lang.Object) r13, (int) r6)
            return
        L_0x0029:
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r7 = new com.fyber.inneractive.sdk.player.exoplayer2.h$b
            java.lang.Object r8 = r1.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r9 = r1.longValue()
            r7.<init>(r8, r9)
            r12.f12704l = r7
            goto L_0x006f
        L_0x0041:
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r6 = r12.f12704l
            long r6 = r6.f12739b
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 != 0) goto L_0x006e
            boolean r1 = r1.mo25388c()
            if (r1 == 0) goto L_0x0053
            r12.mo25271a((java.lang.Object) r13, (int) r5)
            return
        L_0x0053:
            android.util.Pair r1 = r12.mo25257a((int) r5, (long) r3)
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r6 = new com.fyber.inneractive.sdk.player.exoplayer2.h$b
            java.lang.Object r7 = r1.first
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r8 = r1.longValue()
            r6.<init>(r7, r8)
            r12.f12704l = r6
        L_0x006e:
            r6 = r5
        L_0x006f:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r1 = r12.f12691E
            if (r1 == 0) goto L_0x0074
            goto L_0x0076
        L_0x0074:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r1 = r12.f12689C
        L_0x0076:
            if (r1 != 0) goto L_0x007c
            r12.mo25281b((java.lang.Object) r13, (int) r6)
            return
        L_0x007c:
            com.fyber.inneractive.sdk.player.exoplayer2.p r7 = r12.f12692F
            java.lang.Object r8 = r1.f12720b
            int r7 = r7.mo25383a(r8)
            r8 = -1
            r9 = 1
            if (r7 != r8) goto L_0x00e2
            int r2 = r1.f12724f
            com.fyber.inneractive.sdk.player.exoplayer2.p r7 = r12.f12692F
            int r0 = r12.mo25256a(r2, r0, r7)
            if (r0 != r8) goto L_0x0096
            r12.mo25271a((java.lang.Object) r13, (int) r6)
            return
        L_0x0096:
            com.fyber.inneractive.sdk.player.exoplayer2.p r2 = r12.f12692F
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r7 = r12.f12703k
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r0 = r2.mo25384a(r0, r7, r5)
            int r0 = r0.f12878c
            android.util.Pair r0 = r12.mo25257a((int) r0, (long) r3)
            java.lang.Object r2 = r0.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r3 = r0.longValue()
            com.fyber.inneractive.sdk.player.exoplayer2.p r0 = r12.f12692F
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r5 = r12.f12703k
            r0.mo25384a(r2, r5, r9)
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r0 = r12.f12703k
            java.lang.Object r0 = r0.f12877b
            r1.f12724f = r8
        L_0x00c1:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r1 = r1.f12729k
            if (r1 == 0) goto L_0x00d3
            java.lang.Object r5 = r1.f12720b
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x00cf
            r5 = r2
            goto L_0x00d0
        L_0x00cf:
            r5 = r8
        L_0x00d0:
            r1.f12724f = r5
            goto L_0x00c1
        L_0x00d3:
            long r0 = r12.mo25276b((int) r2, (long) r3)
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r3 = new com.fyber.inneractive.sdk.player.exoplayer2.h$b
            r3.<init>(r2, r0)
            r12.f12704l = r3
            r12.mo25281b((java.lang.Object) r13, (int) r6)
            return
        L_0x00e2:
            com.fyber.inneractive.sdk.player.exoplayer2.p r0 = r12.f12692F
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r3 = r12.f12703k
            r0.mo25384a(r7, r3, r5)
            com.fyber.inneractive.sdk.player.exoplayer2.p r0 = r12.f12692F
            int r0 = r0.mo25382a()
            int r0 = r0 - r9
            if (r7 != r0) goto L_0x0104
            com.fyber.inneractive.sdk.player.exoplayer2.p r0 = r12.f12692F
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r3 = r12.f12703k
            int r3 = r3.f12878c
            com.fyber.inneractive.sdk.player.exoplayer2.p$c r4 = r12.f12702j
            com.fyber.inneractive.sdk.player.exoplayer2.p$c r0 = r0.mo25385a(r3, r4)
            boolean r0 = r0.f12882b
            if (r0 != 0) goto L_0x0104
            r0 = r9
            goto L_0x0105
        L_0x0104:
            r0 = r5
        L_0x0105:
            r1.f12724f = r7
            r1.f12726h = r0
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r12.f12690D
            if (r1 != r0) goto L_0x010f
            r0 = r9
            goto L_0x0110
        L_0x010f:
            r0 = r5
        L_0x0110:
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r3 = r12.f12704l
            int r4 = r3.f12738a
            if (r7 == r4) goto L_0x0127
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r4 = new com.fyber.inneractive.sdk.player.exoplayer2.h$b
            long r10 = r3.f12739b
            r4.<init>(r7, r10)
            long r10 = r3.f12740c
            r4.f12740c = r10
            long r10 = r3.f12741d
            r4.f12741d = r10
            r12.f12704l = r4
        L_0x0127:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r3 = r1.f12729k
            if (r3 == 0) goto L_0x0186
            int r7 = r7 + r9
            com.fyber.inneractive.sdk.player.exoplayer2.p r4 = r12.f12692F
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r8 = r12.f12703k
            r4.mo25384a(r7, r8, r9)
            com.fyber.inneractive.sdk.player.exoplayer2.p r4 = r12.f12692F
            int r4 = r4.mo25382a()
            int r4 = r4 - r9
            if (r7 != r4) goto L_0x014e
            com.fyber.inneractive.sdk.player.exoplayer2.p r4 = r12.f12692F
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r8 = r12.f12703k
            int r8 = r8.f12878c
            com.fyber.inneractive.sdk.player.exoplayer2.p$c r10 = r12.f12702j
            com.fyber.inneractive.sdk.player.exoplayer2.p$c r4 = r4.mo25385a(r8, r10)
            boolean r4 = r4.f12882b
            if (r4 != 0) goto L_0x014e
            r4 = r9
            goto L_0x014f
        L_0x014e:
            r4 = r5
        L_0x014f:
            java.lang.Object r8 = r3.f12720b
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r10 = r12.f12703k
            java.lang.Object r10 = r10.f12877b
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L_0x0169
            r3.f12724f = r7
            r3.f12726h = r4
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r1 = r12.f12690D
            if (r3 != r1) goto L_0x0165
            r1 = r9
            goto L_0x0166
        L_0x0165:
            r1 = r5
        L_0x0166:
            r0 = r0 | r1
            r1 = r3
            goto L_0x0127
        L_0x0169:
            if (r0 != 0) goto L_0x017f
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r12.f12691E
            int r0 = r0.f12724f
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r1 = r12.f12704l
            long r1 = r1.f12740c
            long r1 = r12.mo25276b((int) r0, (long) r1)
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r3 = new com.fyber.inneractive.sdk.player.exoplayer2.h$b
            r3.<init>(r0, r1)
            r12.f12704l = r3
            goto L_0x0186
        L_0x017f:
            r12.f12689C = r1
            r1.f12729k = r2
            r12.mo25264a((com.fyber.inneractive.sdk.player.exoplayer2.C4806h.C4807a) r3)
        L_0x0186:
            r12.mo25281b((java.lang.Object) r13, (int) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.C4806h.mo25263a(android.util.Pair):void");
    }

    /* renamed from: a */
    public final void mo25271a(Object obj, int i) {
        this.f12704l = new C4808b(0, 0);
        mo25281b(obj, i);
        this.f12704l = new C4808b(0, -9223372036854775807L);
        mo25261a(4);
        mo25282b(false);
    }

    /* renamed from: a */
    public final int mo25256a(int i, C4855p pVar, C4855p pVar2) {
        int i2 = -1;
        while (i2 == -1 && i < pVar.mo25382a() - 1) {
            i++;
            i2 = pVar2.mo25383a(pVar.mo25384a(i, this.f12703k, true).f12877b);
        }
        return i2;
    }

    /* renamed from: a */
    public final Pair<Integer, Long> mo25258a(C4809c cVar) {
        C4855p pVar = cVar.f12742a;
        if (pVar.mo25388c()) {
            pVar = this.f12692F;
        }
        try {
            Pair<Integer, Long> a = mo25259a(pVar, cVar.f12743b, cVar.f12744c, 0);
            C4855p pVar2 = this.f12692F;
            if (pVar2 == pVar) {
                return a;
            }
            int a2 = pVar2.mo25383a(pVar.mo25384a(((Integer) a.first).intValue(), this.f12703k, true).f12877b);
            if (a2 != -1) {
                return Pair.create(Integer.valueOf(a2), a.second);
            }
            int a3 = mo25256a(((Integer) a.first).intValue(), pVar, this.f12692F);
            if (a3 != -1) {
                return mo25257a(this.f12692F.mo25384a(a3, this.f12703k, false).f12878c, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
            throw new C4814k(this.f12692F, cVar.f12743b, cVar.f12744c);
        }
    }

    /* renamed from: a */
    public final Pair<Integer, Long> mo25257a(int i, long j) {
        return mo25259a(this.f12692F, i, j, 0);
    }

    /* renamed from: a */
    public final Pair<Integer, Long> mo25259a(C4855p pVar, int i, long j, long j2) {
        C4965a.m15046a(i, 0, pVar.mo25387b());
        pVar.mo25386a(i, this.f12702j, false, j2);
        if (j == -9223372036854775807L) {
            j = this.f12702j.f12885e;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        C4855p.C4858c cVar = this.f12702j;
        int i2 = cVar.f12883c;
        long j3 = cVar.f12887g + j;
        long j4 = pVar.mo25384a(i2, this.f12703k, false).f12879d;
        while (j4 != -9223372036854775807L && j3 >= j4 && i2 < this.f12702j.f12884d) {
            j3 -= j4;
            i2++;
            j4 = pVar.mo25384a(i2, this.f12703k, false).f12879d;
        }
        return Pair.create(Integer.valueOf(i2), Long.valueOf(j3));
    }

    /* renamed from: a */
    public final void mo25268a(C4882m mVar) throws C4639d {
        C4807a aVar = this.f12689C;
        if (aVar != null && aVar.f12719a == mVar) {
            aVar.f12727i = true;
            aVar.mo25297d();
            aVar.f12725g = aVar.mo25294a(aVar.f12725g, false, new boolean[aVar.f12732n.length]);
            if (this.f12691E == null) {
                C4807a aVar2 = this.f12689C;
                this.f12690D = aVar2;
                mo25278b(aVar2.f12725g);
                mo25279b(this.f12690D);
            }
            mo25277b();
        }
    }

    /* renamed from: a */
    public final void mo25264a(C4807a aVar) {
        while (aVar != null) {
            aVar.mo25296c();
            aVar = aVar.f12729k;
        }
    }

    /* renamed from: a */
    public final void mo25273a(boolean[] zArr, int i) throws C4639d {
        this.f12709q = new C4853n[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            C4853n[] nVarArr = this.f12693a;
            if (i2 < nVarArr.length) {
                C4853n nVar = nVarArr[i2];
                C4906e eVar = this.f12691E.f12731m.f13035b.f13032b[i2];
                if (eVar != null) {
                    int i4 = i3 + 1;
                    this.f12709q[i3] = nVar;
                    if (nVar.mo24931a() == 0) {
                        C4854o oVar = this.f12691E.f12731m.f13037d[i2];
                        boolean z = this.f12711s && this.f12714v == 3;
                        boolean z2 = !zArr[i2] && z;
                        int f = eVar.mo25423f();
                        C4811i[] iVarArr = new C4811i[f];
                        for (int i5 = 0; i5 < f; i5++) {
                            iVarArr[i5] = eVar.mo25415a(i5);
                        }
                        C4807a aVar = this.f12691E;
                        nVar.mo24936a(oVar, iVarArr, aVar.f12721c[i2], this.f12688B, z2, aVar.mo25293a());
                        C4972g j = nVar.mo24946j();
                        if (j != null) {
                            if (this.f12707o == null) {
                                this.f12707o = j;
                                this.f12706n = nVar;
                                j.mo24973a(this.f12705m);
                            } else {
                                throw new C4639d(2, (String) null, new IllegalStateException("Multiple renderer media clocks enabled."), -1);
                            }
                        }
                        if (z) {
                            nVar.mo24943f();
                        }
                    }
                    i3 = i4;
                }
                i2++;
            } else {
                return;
            }
        }
    }
}
