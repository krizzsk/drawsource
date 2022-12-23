package com.fyber.inneractive.sdk.player.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import android.support.p003v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.C4806h;
import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import com.fyber.inneractive.sdk.player.exoplayer2.C4813j;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.C4643b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4659d;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4665f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4673h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4708l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4709m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4746n;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4880l;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4882m;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4884n;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4906e;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4913b;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4938g;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4942j;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4953t;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4955v;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4957x;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4969d;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;
import java.io.EOFException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.UnknownHostException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.i */
public final class C4872i implements C4882m, C4673h, C4957x.C4958a<C4875c>, C4659d.C4663d {

    /* renamed from: A */
    public boolean f12924A;

    /* renamed from: B */
    public long f12925B;

    /* renamed from: C */
    public long f12926C;

    /* renamed from: D */
    public long f12927D;

    /* renamed from: E */
    public int f12928E;

    /* renamed from: F */
    public boolean f12929F;

    /* renamed from: G */
    public boolean f12930G;

    /* renamed from: a */
    public final Uri f12931a;

    /* renamed from: b */
    public final C4938g f12932b;

    /* renamed from: c */
    public final int f12933c;

    /* renamed from: d */
    public final Handler f12934d;

    /* renamed from: e */
    public final C4880l.C4881a f12935e;

    /* renamed from: f */
    public final C4884n.C4885a f12936f;

    /* renamed from: g */
    public final C4913b f12937g;

    /* renamed from: h */
    public final String f12938h;

    /* renamed from: i */
    public final C4957x f12939i = new C4957x("Loader:ExtractorMediaPeriod");

    /* renamed from: j */
    public final C4876d f12940j;

    /* renamed from: k */
    public final C4969d f12941k;

    /* renamed from: l */
    public final Runnable f12942l;

    /* renamed from: m */
    public final Runnable f12943m;

    /* renamed from: n */
    public final Handler f12944n;

    /* renamed from: o */
    public final SparseArray<C4659d> f12945o;

    /* renamed from: p */
    public C4882m.C4883a f12946p;

    /* renamed from: q */
    public C4709m f12947q;

    /* renamed from: r */
    public boolean f12948r;

    /* renamed from: s */
    public boolean f12949s;

    /* renamed from: t */
    public boolean f12950t;

    /* renamed from: u */
    public boolean f12951u;

    /* renamed from: v */
    public int f12952v;

    /* renamed from: w */
    public C4890s f12953w;

    /* renamed from: x */
    public long f12954x;

    /* renamed from: y */
    public boolean[] f12955y;

    /* renamed from: z */
    public boolean[] f12956z;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.i$a */
    public class C4873a implements Runnable {
        public C4873a() {
        }

        /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, boolean], vars: [r5v0 ?, r5v3 ?, r5v5 ?]
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
            	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
            */
        public void run() {
            /*
                r9 = this;
                com.fyber.inneractive.sdk.player.exoplayer2.source.i r0 = com.fyber.inneractive.sdk.player.exoplayer2.source.C4872i.this
                boolean r1 = r0.f12930G
                if (r1 != 0) goto L_0x00af
                boolean r1 = r0.f12949s
                if (r1 != 0) goto L_0x00af
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.m r1 = r0.f12947q
                if (r1 == 0) goto L_0x00af
                boolean r1 = r0.f12948r
                if (r1 != 0) goto L_0x0014
                goto L_0x00af
            L_0x0014:
                android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.d> r1 = r0.f12945o
                int r1 = r1.size()
                r2 = 0
                r3 = r2
            L_0x001c:
                if (r3 >= r1) goto L_0x0031
                android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.d> r4 = r0.f12945o
                java.lang.Object r4 = r4.valueAt(r3)
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.d r4 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4659d) r4
                com.fyber.inneractive.sdk.player.exoplayer2.i r4 = r4.mo25081e()
                if (r4 != 0) goto L_0x002e
                goto L_0x00af
            L_0x002e:
                int r3 = r3 + 1
                goto L_0x001c
            L_0x0031:
                com.fyber.inneractive.sdk.player.exoplayer2.util.d r3 = r0.f12941k
                monitor-enter(r3)
                r3.f13215a = r2     // Catch:{ all -> 0x00ac }
                monitor-exit(r3)
                com.fyber.inneractive.sdk.player.exoplayer2.source.r[] r3 = new com.fyber.inneractive.sdk.player.exoplayer2.source.C4889r[r1]
                boolean[] r4 = new boolean[r1]
                r0.f12956z = r4
                boolean[] r4 = new boolean[r1]
                r0.f12955y = r4
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.m r4 = r0.f12947q
                long r4 = r4.mo25056c()
                r0.f12954x = r4
                r4 = r2
            L_0x004a:
                r5 = 1
                if (r4 >= r1) goto L_0x0080
                android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.d> r6 = r0.f12945o
                java.lang.Object r6 = r6.valueAt(r4)
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.d r6 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4659d) r6
                com.fyber.inneractive.sdk.player.exoplayer2.i r6 = r6.mo25081e()
                com.fyber.inneractive.sdk.player.exoplayer2.source.r r7 = new com.fyber.inneractive.sdk.player.exoplayer2.source.r
                com.fyber.inneractive.sdk.player.exoplayer2.i[] r8 = new com.fyber.inneractive.sdk.player.exoplayer2.C4811i[r5]
                r8[r2] = r6
                r7.<init>(r8)
                r3[r4] = r7
                java.lang.String r6 = r6.f12755f
                boolean r7 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4973h.m15066e(r6)
                if (r7 != 0) goto L_0x0074
                boolean r6 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4973h.m15065d(r6)
                if (r6 == 0) goto L_0x0073
                goto L_0x0074
            L_0x0073:
                r5 = r2
            L_0x0074:
                boolean[] r6 = r0.f12956z
                r6[r4] = r5
                boolean r6 = r0.f12924A
                r5 = r5 | r6
                r0.f12924A = r5
                int r4 = r4 + 1
                goto L_0x004a
            L_0x0080:
                com.fyber.inneractive.sdk.player.exoplayer2.source.s r1 = new com.fyber.inneractive.sdk.player.exoplayer2.source.s
                r1.<init>(r3)
                r0.f12953w = r1
                r0.f12949s = r5
                com.fyber.inneractive.sdk.player.exoplayer2.source.n$a r1 = r0.f12936f
                com.fyber.inneractive.sdk.player.exoplayer2.source.q r2 = new com.fyber.inneractive.sdk.player.exoplayer2.source.q
                long r3 = r0.f12954x
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.m r5 = r0.f12947q
                boolean r5 = r5.mo25055a()
                r2.<init>(r3, r5)
                r3 = 0
                r1.mo25267a(r2, r3)
                com.fyber.inneractive.sdk.player.exoplayer2.source.m$a r1 = r0.f12946p
                com.fyber.inneractive.sdk.player.exoplayer2.h r1 = (com.fyber.inneractive.sdk.player.exoplayer2.C4806h) r1
                android.os.Handler r1 = r1.f12698f
                r2 = 8
                android.os.Message r0 = r1.obtainMessage(r2, r0)
                r0.sendToTarget()
                goto L_0x00af
            L_0x00ac:
                r0 = move-exception
                monitor-exit(r3)
                throw r0
            L_0x00af:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.source.C4872i.C4873a.run():void");
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.i$b */
    public class C4874b implements Runnable {
        public C4874b() {
        }

        public void run() {
            C4872i iVar = C4872i.this;
            if (!iVar.f12930G) {
                ((C4806h) iVar.f12946p).mo25270a((C4887p) iVar);
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.i$c */
    public final class C4875c implements C4957x.C4960c {

        /* renamed from: a */
        public final Uri f12959a;

        /* renamed from: b */
        public final C4938g f12960b;

        /* renamed from: c */
        public final C4876d f12961c;

        /* renamed from: d */
        public final C4969d f12962d;

        /* renamed from: e */
        public final C4708l f12963e = new C4708l();

        /* renamed from: f */
        public volatile boolean f12964f;

        /* renamed from: g */
        public boolean f12965g = true;

        /* renamed from: h */
        public long f12966h;

        /* renamed from: i */
        public long f12967i = -1;

        public C4875c(Uri uri, C4938g gVar, C4876d dVar, C4969d dVar2) {
            this.f12959a = (Uri) C4965a.m15047a(uri);
            this.f12960b = (C4938g) C4965a.m15047a(gVar);
            this.f12961c = (C4876d) C4965a.m15047a(dVar);
            this.f12962d = dVar2;
        }

        /* renamed from: a */
        public boolean mo25110a() {
            return this.f12964f;
        }

        /* renamed from: b */
        public void mo25111b() {
            this.f12964f = true;
        }

        public void load() throws IOException, InterruptedException {
            C4657b bVar;
            int i = 0;
            while (i == 0 && !this.f12964f) {
                try {
                    long j = this.f12963e.f11944a;
                    C4938g gVar = this.f12960b;
                    long j2 = j;
                    C4942j jVar = r6;
                    C4942j jVar2 = new C4942j(this.f12959a, (byte[]) null, j, j, -1, C4872i.this.f12938h, 0);
                    long a = gVar.mo24756a(jVar);
                    this.f12967i = a;
                    if (a != -1) {
                        this.f12967i = a + j2;
                    }
                    C4938g gVar2 = this.f12960b;
                    C4657b bVar2 = new C4657b(gVar2, j2, this.f12967i);
                    C4665f a2 = this.f12961c.mo25403a(bVar2, gVar2.mo24757a());
                    if (this.f12965g) {
                        a2.mo25089a(j2, this.f12966h);
                        this.f12965g = false;
                    }
                    while (true) {
                        long j3 = j2;
                        while (i == 0 && !this.f12964f) {
                            C4969d dVar = this.f12962d;
                            synchronized (dVar) {
                                while (!dVar.f13215a) {
                                    dVar.wait();
                                }
                            }
                            i = a2.mo25088a((C4672g) bVar2, this.f12963e);
                            j2 = bVar2.f11670c;
                            if (j2 > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED + j3) {
                                C4969d dVar2 = this.f12962d;
                                synchronized (dVar2) {
                                    try {
                                        dVar2.f13215a = false;
                                    } catch (Throwable th) {
                                        th = th;
                                        bVar = bVar2;
                                        if (!(i == 1 || bVar == null)) {
                                            this.f12963e.f11944a = bVar.f11670c;
                                        }
                                        C4991u.m15137a(this.f12960b);
                                        throw th;
                                    }
                                }
                                C4872i iVar = C4872i.this;
                                iVar.f12944n.post(iVar.f12943m);
                            }
                        }
                    }
                    if (i == 1) {
                        i = 0;
                    } else {
                        this.f12963e.f11944a = bVar2.f11670c;
                    }
                    C4991u.m15137a(this.f12960b);
                } catch (Throwable th2) {
                    th = th2;
                    bVar = null;
                    this.f12963e.f11944a = bVar.f11670c;
                    C4991u.m15137a(this.f12960b);
                    throw th;
                }
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.i$d */
    public static final class C4876d {

        /* renamed from: a */
        public final C4665f[] f12969a;

        /* renamed from: b */
        public final C4673h f12970b;

        /* renamed from: c */
        public C4665f f12971c;

        public C4876d(C4665f[] fVarArr, C4673h hVar) {
            this.f12969a = fVarArr;
            this.f12970b = hVar;
        }

        /* renamed from: a */
        public C4665f mo25403a(C4672g gVar, Uri uri) throws IOException, InterruptedException {
            C4665f fVar = this.f12971c;
            if (fVar != null) {
                return fVar;
            }
            C4665f[] fVarArr = this.f12969a;
            int length = fVarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                C4665f fVar2 = fVarArr[i];
                try {
                    if (fVar2.mo25091a(gVar)) {
                        this.f12971c = fVar2;
                        ((C4657b) gVar).f11672e = 0;
                        break;
                    }
                    ((C4657b) gVar).f11672e = 0;
                    i++;
                } catch (EOFException unused) {
                } catch (Throwable th) {
                    ((C4657b) gVar).f11672e = 0;
                    throw th;
                }
            }
            C4665f fVar3 = this.f12971c;
            if (fVar3 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("None of the available extractors (");
                C4665f[] fVarArr2 = this.f12969a;
                int i2 = C4991u.f13270a;
                StringBuilder sb2 = new StringBuilder();
                for (int i3 = 0; i3 < fVarArr2.length; i3++) {
                    sb2.append(fVarArr2[i3].getClass().getSimpleName());
                    if (i3 < fVarArr2.length - 1) {
                        sb2.append(", ");
                    }
                }
                sb.append(sb2.toString());
                sb.append(") could read the stream.");
                throw new C4891t(sb.toString(), uri);
            }
            fVar3.mo25090a(this.f12970b);
            return this.f12971c;
        }
    }

    public C4872i(Uri uri, C4938g gVar, C4665f[] fVarArr, int i, Handler handler, C4880l.C4881a aVar, C4884n.C4885a aVar2, C4913b bVar, String str) {
        this.f12931a = uri;
        this.f12932b = gVar;
        this.f12933c = i;
        this.f12934d = handler;
        this.f12935e = aVar;
        this.f12936f = aVar2;
        this.f12937g = bVar;
        this.f12938h = str;
        this.f12940j = new C4876d(fVarArr, this);
        this.f12941k = new C4969d();
        this.f12942l = new C4873a();
        this.f12943m = new C4874b();
        this.f12944n = new Handler();
        this.f12927D = -9223372036854775807L;
        this.f12945o = new SparseArray<>();
        this.f12925B = -1;
    }

    /* renamed from: a */
    public void mo25142a(C4957x.C4960c cVar, long j, long j2, boolean z) {
        C4875c cVar2 = (C4875c) cVar;
        if (this.f12925B == -1) {
            this.f12925B = cVar2.f12967i;
        }
        if (!z && this.f12952v > 0) {
            int size = this.f12945o.size();
            for (int i = 0; i < size; i++) {
                this.f12945o.valueAt(i).mo25076a(this.f12955y[i]);
            }
            ((C4806h) this.f12946p).mo25270a((C4887p) this);
        }
    }

    /* renamed from: b */
    public C4890s mo25122b() {
        return this.f12953w;
    }

    /* renamed from: c */
    public void mo25100c() {
        this.f12948r = true;
        this.f12944n.post(this.f12942l);
    }

    /* renamed from: c */
    public void mo25124c(long j) {
    }

    /* renamed from: d */
    public long mo25125d() {
        long j;
        if (this.f12929F) {
            return Long.MIN_VALUE;
        }
        if (mo25399i()) {
            return this.f12927D;
        }
        if (this.f12924A) {
            j = Long.MAX_VALUE;
            int size = this.f12945o.size();
            for (int i = 0; i < size; i++) {
                if (this.f12956z[i]) {
                    j = Math.min(j, this.f12945o.valueAt(i).mo25080d());
                }
            }
        } else {
            j = mo25398h();
        }
        return j == Long.MIN_VALUE ? this.f12926C : j;
    }

    /* renamed from: e */
    public void mo25126e() throws IOException {
        this.f12939i.mo25493c();
    }

    /* renamed from: f */
    public long mo25127f() {
        if (!this.f12951u) {
            return -9223372036854775807L;
        }
        this.f12951u = false;
        return this.f12926C;
    }

    /* renamed from: g */
    public final int mo25397g() {
        int size = this.f12945o.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C4659d.C4662c cVar = this.f12945o.valueAt(i2).f11677c;
            i += cVar.f11702j + cVar.f11701i;
        }
        return i;
    }

    /* renamed from: h */
    public final long mo25398h() {
        int size = this.f12945o.size();
        long j = Long.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, this.f12945o.valueAt(i).mo25080d());
        }
        return j;
    }

    /* renamed from: i */
    public final boolean mo25399i() {
        return this.f12927D != -9223372036854775807L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005c, code lost:
        r0 = r9.f12947q;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25400j() {
        /*
            r9 = this;
            com.fyber.inneractive.sdk.player.exoplayer2.source.i$c r6 = new com.fyber.inneractive.sdk.player.exoplayer2.source.i$c
            android.net.Uri r2 = r9.f12931a
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.g r3 = r9.f12932b
            com.fyber.inneractive.sdk.player.exoplayer2.source.i$d r4 = r9.f12940j
            com.fyber.inneractive.sdk.player.exoplayer2.util.d r5 = r9.f12941k
            r0 = r6
            r1 = r9
            r0.<init>(r2, r3, r4, r5)
            boolean r0 = r9.f12949s
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L_0x0045
            boolean r0 = r9.mo25399i()
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a.m15051b(r0)
            long r3 = r9.f12954x
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r5 = 1
            if (r0 == 0) goto L_0x0031
            long r7 = r9.f12927D
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0031
            r9.f12929F = r5
            r9.f12927D = r1
            return
        L_0x0031:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.m r0 = r9.f12947q
            long r3 = r9.f12927D
            long r3 = r0.mo25054a(r3)
            long r7 = r9.f12927D
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.l r0 = r6.f12963e
            r0.f11944a = r3
            r6.f12966h = r7
            r6.f12965g = r5
            r9.f12927D = r1
        L_0x0045:
            int r0 = r9.mo25397g()
            r9.f12928E = r0
            int r0 = r9.f12933c
            r3 = -1
            if (r0 != r3) goto L_0x006c
            boolean r0 = r9.f12949s
            if (r0 == 0) goto L_0x006b
            long r3 = r9.f12925B
            r7 = -1
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x006b
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.m r0 = r9.f12947q
            if (r0 == 0) goto L_0x0069
            long r3 = r0.mo25056c()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            r0 = 6
            goto L_0x006c
        L_0x006b:
            r0 = 3
        L_0x006c:
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.x r1 = r9.f12939i
            r1.mo25490a(r6, r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.source.C4872i.mo25400j():void");
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.i$e */
    public final class C4877e implements C4886o {

        /* renamed from: a */
        public final int f12972a;

        public C4877e(int i) {
            this.f12972a = i;
        }

        /* renamed from: a */
        public void mo25135a() throws IOException {
            C4872i.this.f12939i.mo25493c();
        }

        public boolean isReady() {
            C4872i iVar = C4872i.this;
            return iVar.f12929F || (!iVar.mo25399i() && !iVar.f12945o.valueAt(this.f12972a).mo25082f());
        }

        /* renamed from: a */
        public int mo25134a(C4813j jVar, C4643b bVar, boolean z) {
            C4872i iVar = C4872i.this;
            int i = this.f12972a;
            if (iVar.f12951u || iVar.mo25399i()) {
                return -3;
            }
            return iVar.f12945o.valueAt(i).mo25069a(jVar, bVar, z, iVar.f12929F, iVar.f12926C);
        }

        /* renamed from: a */
        public void mo25136a(long j) {
            C4872i iVar = C4872i.this;
            C4659d valueAt = iVar.f12945o.valueAt(this.f12972a);
            if (!iVar.f12929F || j <= valueAt.mo25080d()) {
                valueAt.mo25077a(j, true);
            } else {
                valueAt.mo25083g();
            }
        }
    }

    /* renamed from: b */
    public long mo25121b(long j) {
        if (!this.f12947q.mo25055a()) {
            j = 0;
        }
        this.f12926C = j;
        int size = this.f12945o.size();
        boolean z = !mo25399i();
        int i = 0;
        while (z && i < size) {
            if (this.f12955y[i]) {
                z = this.f12945o.valueAt(i).mo25077a(j, false);
            }
            i++;
        }
        if (!z) {
            this.f12927D = j;
            this.f12929F = false;
            if (this.f12939i.mo25492b()) {
                this.f12939i.mo25491a();
            } else {
                for (int i2 = 0; i2 < size; i2++) {
                    this.f12945o.valueAt(i2).mo25076a(this.f12955y[i2]);
                }
            }
        }
        this.f12951u = false;
        return j;
    }

    /* renamed from: a */
    public void mo25141a(C4957x.C4960c cVar, long j, long j2) {
        C4875c cVar2 = (C4875c) cVar;
        if (this.f12925B == -1) {
            this.f12925B = cVar2.f12967i;
        }
        this.f12929F = true;
        if (this.f12954x == -9223372036854775807L) {
            long h = mo25398h();
            this.f12954x = h == Long.MIN_VALUE ? 0 : h + 10000;
            this.f12936f.mo25267a(new C4888q(this.f12954x, this.f12947q.mo25055a()), (Object) null);
        }
        ((C4806h) this.f12946p).mo25270a((C4887p) this);
    }

    /* renamed from: a */
    public int mo25138a(C4957x.C4960c cVar, long j, long j2, IOException iOException) {
        C4709m mVar;
        C4875c cVar2 = (C4875c) cVar;
        if (this.f12925B == -1) {
            this.f12925B = cVar2.f12967i;
        }
        Handler handler = this.f12934d;
        if (!(handler == null || this.f12935e == null)) {
            handler.post(new C4879k(this, iOException));
        }
        if ((iOException instanceof C4891t) || (iOException instanceof C4955v) || ((iOException instanceof C4953t) && iOException.getCause() != null && ((iOException.getCause() instanceof MalformedURLException) || (iOException.getCause() instanceof UnknownHostException)))) {
            return 3;
        }
        int i = mo25397g() > this.f12928E ? 1 : 0;
        if (this.f12925B == -1 && ((mVar = this.f12947q) == null || mVar.mo25056c() == -9223372036854775807L)) {
            this.f12926C = 0;
            this.f12951u = this.f12949s;
            int size = this.f12945o.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f12945o.valueAt(i2).mo25076a(!this.f12949s || this.f12955y[i2]);
            }
            cVar2.f12963e.f11944a = 0;
            cVar2.f12966h = 0;
            cVar2.f12965g = true;
        }
        this.f12928E = mo25397g();
        return i;
    }

    /* renamed from: a */
    public void mo25118a(C4882m.C4883a aVar) {
        this.f12946p = aVar;
        C4969d dVar = this.f12941k;
        synchronized (dVar) {
            if (!dVar.f13215a) {
                dVar.f13215a = true;
                dVar.notifyAll();
            }
        }
        mo25400j();
    }

    /* renamed from: a */
    public long mo25115a(C4906e[] eVarArr, boolean[] zArr, C4886o[] oVarArr, boolean[] zArr2, long j) {
        C4965a.m15051b(this.f12949s);
        for (int i = 0; i < eVarArr.length; i++) {
            if (oVarArr[i] != null && (eVarArr[i] == null || !zArr[i])) {
                int i2 = oVarArr[i].f12972a;
                C4965a.m15051b(this.f12955y[i2]);
                this.f12952v--;
                this.f12955y[i2] = false;
                this.f12945o.valueAt(i2).mo25078b();
                oVarArr[i] = null;
            }
        }
        boolean z = false;
        for (int i3 = 0; i3 < eVarArr.length; i3++) {
            if (oVarArr[i3] == null && eVarArr[i3] != null) {
                C4906e eVar = eVarArr[i3];
                C4965a.m15051b(eVar.mo25423f() == 1);
                C4965a.m15051b(eVar.mo25417b(0) == 0);
                int a = this.f12953w.mo25410a(eVar.mo25418b());
                C4965a.m15051b(!this.f12955y[a]);
                this.f12952v++;
                this.f12955y[a] = true;
                oVarArr[i3] = new C4877e(a);
                zArr2[i3] = true;
                z = true;
            }
        }
        if (!this.f12950t) {
            int size = this.f12945o.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (!this.f12955y[i4]) {
                    this.f12945o.valueAt(i4).mo25078b();
                }
            }
        }
        if (this.f12952v == 0) {
            this.f12951u = false;
            if (this.f12939i.mo25492b()) {
                this.f12939i.mo25491a();
            }
        } else if (!this.f12950t ? j != 0 : z) {
            j = mo25121b(j);
            for (int i5 = 0; i5 < oVarArr.length; i5++) {
                if (oVarArr[i5] != null) {
                    zArr2[i5] = true;
                }
            }
        }
        this.f12950t = true;
        return j;
    }

    /* renamed from: a */
    public boolean mo25120a(long j) {
        boolean z = false;
        if (this.f12929F || (this.f12949s && this.f12952v == 0)) {
            return false;
        }
        C4969d dVar = this.f12941k;
        synchronized (dVar) {
            if (!dVar.f13215a) {
                dVar.f13215a = true;
                dVar.notifyAll();
                z = true;
            }
        }
        if (this.f12939i.mo25492b()) {
            return z;
        }
        mo25400j();
        return true;
    }

    /* renamed from: a */
    public long mo25114a() {
        if (this.f12952v == 0) {
            return Long.MIN_VALUE;
        }
        return mo25125d();
    }

    /* renamed from: a */
    public C4746n mo25098a(int i, int i2) {
        C4659d dVar = this.f12945o.get(i);
        if (dVar != null) {
            return dVar;
        }
        C4659d dVar2 = new C4659d(this.f12937g);
        dVar2.f11688n = this;
        this.f12945o.put(i, dVar2);
        return dVar2;
    }

    /* renamed from: a */
    public void mo25099a(C4709m mVar) {
        this.f12947q = mVar;
        this.f12944n.post(this.f12942l);
    }

    /* renamed from: a */
    public void mo25087a(C4811i iVar) {
        this.f12944n.post(this.f12942l);
    }
}
