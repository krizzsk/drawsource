package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import android.media.MediaCodec;
import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import com.fyber.inneractive.sdk.player.exoplayer2.C4813j;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.C4640a;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.C4643b;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4911a;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4913b;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4943k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.d */
public final class C4659d implements C4746n {

    /* renamed from: a */
    public final C4913b f11675a;

    /* renamed from: b */
    public final int f11676b;

    /* renamed from: c */
    public final C4662c f11677c = new C4662c();

    /* renamed from: d */
    public final LinkedBlockingDeque<C4911a> f11678d = new LinkedBlockingDeque<>();

    /* renamed from: e */
    public final C4661b f11679e = new C4661b();

    /* renamed from: f */
    public final C4978k f11680f = new C4978k(32);

    /* renamed from: g */
    public final AtomicInteger f11681g = new AtomicInteger();

    /* renamed from: h */
    public long f11682h;

    /* renamed from: i */
    public C4811i f11683i;

    /* renamed from: j */
    public long f11684j;

    /* renamed from: k */
    public C4911a f11685k;

    /* renamed from: l */
    public int f11686l;

    /* renamed from: m */
    public boolean f11687m;

    /* renamed from: n */
    public C4663d f11688n;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.d$b */
    public static final class C4661b {

        /* renamed from: a */
        public int f11689a;

        /* renamed from: b */
        public long f11690b;

        /* renamed from: c */
        public long f11691c;

        /* renamed from: d */
        public byte[] f11692d;

        public C4661b() {
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.d$d */
    public interface C4663d {
        /* renamed from: a */
        void mo25087a(C4811i iVar);
    }

    public C4659d(C4913b bVar) {
        this.f11675a = bVar;
        int a = ((C4943k) bVar).mo25480a();
        this.f11676b = a;
        this.f11686l = a;
    }

    /* renamed from: a */
    public void mo25076a(boolean z) {
        int andSet = this.f11681g.getAndSet(z ? 0 : 2);
        mo25070a();
        C4662c cVar = this.f11677c;
        cVar.f11705m = Long.MIN_VALUE;
        cVar.f11706n = Long.MIN_VALUE;
        if (andSet == 2) {
            this.f11683i = null;
        }
    }

    /* renamed from: b */
    public void mo25078b() {
        if (this.f11681g.getAndSet(2) == 0) {
            mo25070a();
        }
    }

    /* renamed from: c */
    public final void mo25079c() {
        if (!this.f11681g.compareAndSet(1, 0)) {
            mo25070a();
        }
    }

    /* renamed from: d */
    public long mo25080d() {
        long max;
        C4662c cVar = this.f11677c;
        synchronized (cVar) {
            max = Math.max(cVar.f11705m, cVar.f11706n);
        }
        return max;
    }

    /* renamed from: e */
    public C4811i mo25081e() {
        C4811i iVar;
        C4662c cVar = this.f11677c;
        synchronized (cVar) {
            iVar = cVar.f11708p ? null : cVar.f11709q;
        }
        return iVar;
    }

    /* renamed from: f */
    public boolean mo25082f() {
        boolean z;
        C4662c cVar = this.f11677c;
        synchronized (cVar) {
            z = cVar.f11701i == 0;
        }
        return z;
    }

    /* renamed from: g */
    public void mo25083g() {
        long j;
        C4662c cVar = this.f11677c;
        synchronized (cVar) {
            int i = cVar.f11701i;
            if (i == 0) {
                j = -1;
            } else {
                int i2 = cVar.f11703k + i;
                int i3 = cVar.f11693a;
                int i4 = (i2 - 1) % i3;
                cVar.f11703k = i2 % i3;
                cVar.f11702j += i;
                cVar.f11701i = 0;
                j = cVar.f11695c[i4] + ((long) cVar.f11696d[i4]);
            }
        }
        if (j != -1) {
            mo25071a(j);
        }
    }

    /* renamed from: h */
    public final boolean mo25084h() {
        return this.f11681g.compareAndSet(0, 1);
    }

    /* renamed from: a */
    public boolean mo25077a(long j, boolean z) {
        long j2;
        C4662c cVar = this.f11677c;
        synchronized (cVar) {
            if (cVar.f11701i != 0) {
                long[] jArr = cVar.f11698f;
                int i = cVar.f11703k;
                if (j >= jArr[i]) {
                    if (j <= cVar.f11706n || z) {
                        int i2 = -1;
                        int i3 = 0;
                        while (true) {
                            if (i == cVar.f11704l) {
                                break;
                            } else if (cVar.f11698f[i] > j) {
                                break;
                            } else {
                                if ((cVar.f11697e[i] & 1) != 0) {
                                    i2 = i3;
                                }
                                i = (i + 1) % cVar.f11693a;
                                i3++;
                            }
                        }
                        if (i2 != -1) {
                            int i4 = (cVar.f11703k + i2) % cVar.f11693a;
                            cVar.f11703k = i4;
                            cVar.f11702j += i2;
                            cVar.f11701i -= i2;
                            j2 = cVar.f11695c[i4];
                        }
                    }
                }
            }
            j2 = -1;
        }
        if (j2 == -1) {
            return false;
        }
        mo25071a(j2);
        return true;
    }

    /* renamed from: a */
    public int mo25069a(C4813j jVar, C4643b bVar, boolean z, boolean z2, long j) {
        char c;
        int i;
        long j2;
        C4813j jVar2 = jVar;
        C4643b bVar2 = bVar;
        C4662c cVar = this.f11677c;
        C4811i iVar = this.f11683i;
        C4661b bVar3 = this.f11679e;
        synchronized (cVar) {
            if (cVar.f11701i != 0) {
                if (!z) {
                    C4811i[] iVarArr = cVar.f11700h;
                    int i2 = cVar.f11703k;
                    if (iVarArr[i2] == iVar) {
                        if (!(bVar2.f11650c == null && bVar2.f11652e == 0)) {
                            long j3 = cVar.f11698f[i2];
                            bVar2.f11651d = j3;
                            bVar2.f11648a = cVar.f11697e[i2];
                            bVar3.f11689a = cVar.f11696d[i2];
                            bVar3.f11690b = cVar.f11695c[i2];
                            bVar3.f11692d = cVar.f11699g[i2];
                            cVar.f11705m = Math.max(cVar.f11705m, j3);
                            int i3 = cVar.f11701i - 1;
                            cVar.f11701i = i3;
                            int i4 = cVar.f11703k + 1;
                            cVar.f11703k = i4;
                            cVar.f11702j++;
                            if (i4 == cVar.f11693a) {
                                cVar.f11703k = 0;
                            }
                            if (i3 > 0) {
                                j2 = cVar.f11695c[cVar.f11703k];
                            } else {
                                j2 = bVar3.f11690b + ((long) bVar3.f11689a);
                            }
                            bVar3.f11691c = j2;
                            c = 65532;
                        }
                    }
                }
                jVar2.f12776a = cVar.f11700h[cVar.f11703k];
                c = 65531;
            } else if (z2) {
                bVar2.f11648a = 4;
                c = 65532;
            } else {
                C4811i iVar2 = cVar.f11709q;
                if (iVar2 != null && (z || iVar2 != iVar)) {
                    jVar2.f12776a = iVar2;
                    c = 65531;
                }
            }
            c = 65533;
        }
        if (c == 65531) {
            this.f11683i = jVar2.f12776a;
            return -5;
        } else if (c != 65532) {
            if (c == 65533) {
                return -3;
            }
            throw new IllegalStateException();
        } else if (bVar2.mo25034b(4)) {
            return -4;
        } else {
            if (bVar2.f11651d < j) {
                bVar2.f11648a |= Integer.MIN_VALUE;
            }
            if (bVar2.mo25034b(1073741824)) {
                C4661b bVar4 = this.f11679e;
                long j4 = bVar4.f11690b;
                this.f11680f.mo25521c(1);
                mo25073a(j4, this.f11680f.f13243a, 1);
                long j5 = j4 + 1;
                byte b = this.f11680f.f13243a[0];
                boolean z3 = (b & 128) != 0;
                byte b2 = b & Byte.MAX_VALUE;
                C4640a aVar = bVar2.f11649b;
                if (aVar.f11638a == null) {
                    aVar.f11638a = new byte[16];
                }
                mo25073a(j5, aVar.f11638a, (int) b2);
                long j6 = j5 + ((long) b2);
                if (z3) {
                    this.f11680f.mo25521c(2);
                    mo25073a(j6, this.f11680f.f13243a, 2);
                    j6 += 2;
                    i = this.f11680f.mo25538q();
                } else {
                    i = 1;
                }
                C4640a aVar2 = bVar2.f11649b;
                int[] iArr = aVar2.f11641d;
                if (iArr == null || iArr.length < i) {
                    iArr = new int[i];
                }
                int[] iArr2 = aVar2.f11642e;
                if (iArr2 == null || iArr2.length < i) {
                    iArr2 = new int[i];
                }
                if (z3) {
                    int i5 = i * 6;
                    this.f11680f.mo25521c(i5);
                    mo25073a(j6, this.f11680f.f13243a, i5);
                    j6 += (long) i5;
                    this.f11680f.mo25525e(0);
                    for (int i6 = 0; i6 < i; i6++) {
                        iArr[i6] = this.f11680f.mo25538q();
                        iArr2[i6] = this.f11680f.mo25536o();
                    }
                } else {
                    iArr[0] = 0;
                    iArr2[0] = bVar4.f11689a - ((int) (j6 - bVar4.f11690b));
                }
                C4640a aVar3 = bVar2.f11649b;
                byte[] bArr = bVar4.f11692d;
                byte[] bArr2 = aVar3.f11638a;
                aVar3.f11643f = i;
                aVar3.f11641d = iArr;
                aVar3.f11642e = iArr2;
                aVar3.f11639b = bArr;
                aVar3.f11638a = bArr2;
                aVar3.f11640c = 1;
                int i7 = C4991u.f13270a;
                if (i7 >= 16) {
                    MediaCodec.CryptoInfo cryptoInfo = aVar3.f11644g;
                    cryptoInfo.numSubSamples = i;
                    cryptoInfo.numBytesOfClearData = iArr;
                    cryptoInfo.numBytesOfEncryptedData = iArr2;
                    cryptoInfo.key = bArr;
                    cryptoInfo.iv = bArr2;
                    cryptoInfo.mode = 1;
                    if (i7 >= 24) {
                        C4640a.C4642b bVar5 = aVar3.f11645h;
                        bVar5.f11647b.set(0, 0);
                        bVar5.f11646a.setPattern(bVar5.f11647b);
                    }
                }
                long j7 = bVar4.f11690b;
                int i8 = (int) (j6 - j7);
                bVar4.f11690b = j7 + ((long) i8);
                bVar4.f11689a -= i8;
            }
            int i9 = this.f11679e.f11689a;
            ByteBuffer byteBuffer = bVar2.f11650c;
            if (byteBuffer == null) {
                bVar2.f11650c = bVar2.mo25032a(i9);
            } else {
                int capacity = byteBuffer.capacity();
                int position = bVar2.f11650c.position();
                int i10 = i9 + position;
                if (capacity < i10) {
                    ByteBuffer a = bVar2.mo25032a(i10);
                    if (position > 0) {
                        bVar2.f11650c.position(0);
                        bVar2.f11650c.limit(position);
                        a.put(bVar2.f11650c);
                    }
                    bVar2.f11650c = a;
                }
            }
            C4661b bVar6 = this.f11679e;
            long j8 = bVar6.f11690b;
            ByteBuffer byteBuffer2 = bVar2.f11650c;
            int i11 = bVar6.f11689a;
            while (i11 > 0) {
                mo25071a(j8);
                int i12 = (int) (j8 - this.f11682h);
                int min = Math.min(i11, this.f11676b - i12);
                C4911a peek = this.f11678d.peek();
                byteBuffer2.put(peek.f13038a, peek.f13039b + i12, min);
                j8 += (long) min;
                i11 -= min;
            }
            mo25071a(this.f11679e.f11691c);
            return -4;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.d$c */
    public static final class C4662c {

        /* renamed from: a */
        public int f11693a = 1000;

        /* renamed from: b */
        public int[] f11694b = new int[1000];

        /* renamed from: c */
        public long[] f11695c = new long[1000];

        /* renamed from: d */
        public int[] f11696d = new int[1000];

        /* renamed from: e */
        public int[] f11697e = new int[1000];

        /* renamed from: f */
        public long[] f11698f = new long[1000];

        /* renamed from: g */
        public byte[][] f11699g = new byte[1000][];

        /* renamed from: h */
        public C4811i[] f11700h = new C4811i[1000];

        /* renamed from: i */
        public int f11701i;

        /* renamed from: j */
        public int f11702j;

        /* renamed from: k */
        public int f11703k;

        /* renamed from: l */
        public int f11704l;

        /* renamed from: m */
        public long f11705m = Long.MIN_VALUE;

        /* renamed from: n */
        public long f11706n = Long.MIN_VALUE;

        /* renamed from: o */
        public boolean f11707o = true;

        /* renamed from: p */
        public boolean f11708p = true;

        /* renamed from: q */
        public C4811i f11709q;

        /* renamed from: r */
        public int f11710r;

        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
            	at java.base/java.util.Objects.checkIndex(Objects.java:372)
            	at java.base/java.util.ArrayList.get(ArrayList.java:458)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        /* renamed from: a */
        public synchronized void mo25085a(long r6, int r8, long r9, int r11, byte[] r12) {
            /*
                r5 = this;
                monitor-enter(r5)
                boolean r0 = r5.f11707o     // Catch:{ all -> 0x00d6 }
                r1 = 0
                if (r0 == 0) goto L_0x000e
                r0 = r8 & 1
                if (r0 != 0) goto L_0x000c
                monitor-exit(r5)
                return
            L_0x000c:
                r5.f11707o = r1     // Catch:{ all -> 0x00d6 }
            L_0x000e:
                boolean r0 = r5.f11708p     // Catch:{ all -> 0x00d6 }
                r0 = r0 ^ 1
                com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a.m15051b(r0)     // Catch:{ all -> 0x00d6 }
                monitor-enter(r5)     // Catch:{ all -> 0x00d6 }
                long r2 = r5.f11706n     // Catch:{ all -> 0x00d3 }
                long r2 = java.lang.Math.max(r2, r6)     // Catch:{ all -> 0x00d3 }
                r5.f11706n = r2     // Catch:{ all -> 0x00d3 }
                monitor-exit(r5)     // Catch:{ all -> 0x00d6 }
                long[] r0 = r5.f11698f     // Catch:{ all -> 0x00d6 }
                int r2 = r5.f11704l     // Catch:{ all -> 0x00d6 }
                r0[r2] = r6     // Catch:{ all -> 0x00d6 }
                long[] r6 = r5.f11695c     // Catch:{ all -> 0x00d6 }
                r6[r2] = r9     // Catch:{ all -> 0x00d6 }
                int[] r7 = r5.f11696d     // Catch:{ all -> 0x00d6 }
                r7[r2] = r11     // Catch:{ all -> 0x00d6 }
                int[] r7 = r5.f11697e     // Catch:{ all -> 0x00d6 }
                r7[r2] = r8     // Catch:{ all -> 0x00d6 }
                byte[][] r7 = r5.f11699g     // Catch:{ all -> 0x00d6 }
                r7[r2] = r12     // Catch:{ all -> 0x00d6 }
                com.fyber.inneractive.sdk.player.exoplayer2.i[] r7 = r5.f11700h     // Catch:{ all -> 0x00d6 }
                com.fyber.inneractive.sdk.player.exoplayer2.i r8 = r5.f11709q     // Catch:{ all -> 0x00d6 }
                r7[r2] = r8     // Catch:{ all -> 0x00d6 }
                int[] r7 = r5.f11694b     // Catch:{ all -> 0x00d6 }
                int r8 = r5.f11710r     // Catch:{ all -> 0x00d6 }
                r7[r2] = r8     // Catch:{ all -> 0x00d6 }
                int r7 = r5.f11701i     // Catch:{ all -> 0x00d6 }
                int r7 = r7 + 1
                r5.f11701i = r7     // Catch:{ all -> 0x00d6 }
                int r8 = r5.f11693a     // Catch:{ all -> 0x00d6 }
                if (r7 != r8) goto L_0x00c9
                int r7 = r8 + 1000
                int[] r9 = new int[r7]     // Catch:{ all -> 0x00d6 }
                long[] r10 = new long[r7]     // Catch:{ all -> 0x00d6 }
                long[] r11 = new long[r7]     // Catch:{ all -> 0x00d6 }
                int[] r12 = new int[r7]     // Catch:{ all -> 0x00d6 }
                int[] r0 = new int[r7]     // Catch:{ all -> 0x00d6 }
                byte[][] r2 = new byte[r7][]     // Catch:{ all -> 0x00d6 }
                com.fyber.inneractive.sdk.player.exoplayer2.i[] r3 = new com.fyber.inneractive.sdk.player.exoplayer2.C4811i[r7]     // Catch:{ all -> 0x00d6 }
                int r4 = r5.f11703k     // Catch:{ all -> 0x00d6 }
                int r8 = r8 - r4
                java.lang.System.arraycopy(r6, r4, r10, r1, r8)     // Catch:{ all -> 0x00d6 }
                long[] r6 = r5.f11698f     // Catch:{ all -> 0x00d6 }
                int r4 = r5.f11703k     // Catch:{ all -> 0x00d6 }
                java.lang.System.arraycopy(r6, r4, r11, r1, r8)     // Catch:{ all -> 0x00d6 }
                int[] r6 = r5.f11697e     // Catch:{ all -> 0x00d6 }
                int r4 = r5.f11703k     // Catch:{ all -> 0x00d6 }
                java.lang.System.arraycopy(r6, r4, r12, r1, r8)     // Catch:{ all -> 0x00d6 }
                int[] r6 = r5.f11696d     // Catch:{ all -> 0x00d6 }
                int r4 = r5.f11703k     // Catch:{ all -> 0x00d6 }
                java.lang.System.arraycopy(r6, r4, r0, r1, r8)     // Catch:{ all -> 0x00d6 }
                byte[][] r6 = r5.f11699g     // Catch:{ all -> 0x00d6 }
                int r4 = r5.f11703k     // Catch:{ all -> 0x00d6 }
                java.lang.System.arraycopy(r6, r4, r2, r1, r8)     // Catch:{ all -> 0x00d6 }
                com.fyber.inneractive.sdk.player.exoplayer2.i[] r6 = r5.f11700h     // Catch:{ all -> 0x00d6 }
                int r4 = r5.f11703k     // Catch:{ all -> 0x00d6 }
                java.lang.System.arraycopy(r6, r4, r3, r1, r8)     // Catch:{ all -> 0x00d6 }
                int[] r6 = r5.f11694b     // Catch:{ all -> 0x00d6 }
                int r4 = r5.f11703k     // Catch:{ all -> 0x00d6 }
                java.lang.System.arraycopy(r6, r4, r9, r1, r8)     // Catch:{ all -> 0x00d6 }
                int r6 = r5.f11703k     // Catch:{ all -> 0x00d6 }
                long[] r4 = r5.f11695c     // Catch:{ all -> 0x00d6 }
                java.lang.System.arraycopy(r4, r1, r10, r8, r6)     // Catch:{ all -> 0x00d6 }
                long[] r4 = r5.f11698f     // Catch:{ all -> 0x00d6 }
                java.lang.System.arraycopy(r4, r1, r11, r8, r6)     // Catch:{ all -> 0x00d6 }
                int[] r4 = r5.f11697e     // Catch:{ all -> 0x00d6 }
                java.lang.System.arraycopy(r4, r1, r12, r8, r6)     // Catch:{ all -> 0x00d6 }
                int[] r4 = r5.f11696d     // Catch:{ all -> 0x00d6 }
                java.lang.System.arraycopy(r4, r1, r0, r8, r6)     // Catch:{ all -> 0x00d6 }
                byte[][] r4 = r5.f11699g     // Catch:{ all -> 0x00d6 }
                java.lang.System.arraycopy(r4, r1, r2, r8, r6)     // Catch:{ all -> 0x00d6 }
                com.fyber.inneractive.sdk.player.exoplayer2.i[] r4 = r5.f11700h     // Catch:{ all -> 0x00d6 }
                java.lang.System.arraycopy(r4, r1, r3, r8, r6)     // Catch:{ all -> 0x00d6 }
                int[] r4 = r5.f11694b     // Catch:{ all -> 0x00d6 }
                java.lang.System.arraycopy(r4, r1, r9, r8, r6)     // Catch:{ all -> 0x00d6 }
                r5.f11695c = r10     // Catch:{ all -> 0x00d6 }
                r5.f11698f = r11     // Catch:{ all -> 0x00d6 }
                r5.f11697e = r12     // Catch:{ all -> 0x00d6 }
                r5.f11696d = r0     // Catch:{ all -> 0x00d6 }
                r5.f11699g = r2     // Catch:{ all -> 0x00d6 }
                r5.f11700h = r3     // Catch:{ all -> 0x00d6 }
                r5.f11694b = r9     // Catch:{ all -> 0x00d6 }
                r5.f11703k = r1     // Catch:{ all -> 0x00d6 }
                int r6 = r5.f11693a     // Catch:{ all -> 0x00d6 }
                r5.f11704l = r6     // Catch:{ all -> 0x00d6 }
                r5.f11701i = r6     // Catch:{ all -> 0x00d6 }
                r5.f11693a = r7     // Catch:{ all -> 0x00d6 }
                goto L_0x00d1
            L_0x00c9:
                int r2 = r2 + 1
                r5.f11704l = r2     // Catch:{ all -> 0x00d6 }
                if (r2 != r8) goto L_0x00d1
                r5.f11704l = r1     // Catch:{ all -> 0x00d6 }
            L_0x00d1:
                monitor-exit(r5)
                return
            L_0x00d3:
                r6 = move-exception
                monitor-exit(r5)     // Catch:{ all -> 0x00d6 }
                throw r6     // Catch:{ all -> 0x00d6 }
            L_0x00d6:
                r6 = move-exception
                monitor-exit(r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4659d.C4662c.mo25085a(long, int, long, int, byte[]):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0080, code lost:
            return true;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized boolean mo25086a(long r7) {
            /*
                r6 = this;
                monitor-enter(r6)
                long r0 = r6.f11705m     // Catch:{ all -> 0x0081 }
                int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                r1 = 0
                if (r0 < 0) goto L_0x000a
                monitor-exit(r6)
                return r1
            L_0x000a:
                int r0 = r6.f11701i     // Catch:{ all -> 0x0081 }
            L_0x000c:
                r2 = 1
                if (r0 <= 0) goto L_0x0021
                long[] r3 = r6.f11698f     // Catch:{ all -> 0x0081 }
                int r4 = r6.f11703k     // Catch:{ all -> 0x0081 }
                int r4 = r4 + r0
                int r4 = r4 - r2
                int r5 = r6.f11693a     // Catch:{ all -> 0x0081 }
                int r4 = r4 % r5
                r4 = r3[r4]     // Catch:{ all -> 0x0081 }
                int r3 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r3 < 0) goto L_0x0021
                int r0 = r0 + -1
                goto L_0x000c
            L_0x0021:
                int r7 = r6.f11702j     // Catch:{ all -> 0x0081 }
                int r0 = r0 + r7
                int r8 = r6.f11701i     // Catch:{ all -> 0x0081 }
                int r7 = r7 + r8
                int r7 = r7 - r0
                if (r7 < 0) goto L_0x002d
                if (r7 > r8) goto L_0x002d
                r1 = r2
            L_0x002d:
                com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a.m15049a((boolean) r1)     // Catch:{ all -> 0x0081 }
                if (r7 != 0) goto L_0x0047
                int r7 = r6.f11702j     // Catch:{ all -> 0x0081 }
                if (r7 != 0) goto L_0x0037
                goto L_0x007f
            L_0x0037:
                int r7 = r6.f11704l     // Catch:{ all -> 0x0081 }
                if (r7 != 0) goto L_0x003d
                int r7 = r6.f11693a     // Catch:{ all -> 0x0081 }
            L_0x003d:
                int r7 = r7 - r2
                long[] r8 = r6.f11695c     // Catch:{ all -> 0x0081 }
                r0 = r8[r7]     // Catch:{ all -> 0x0081 }
                int[] r8 = r6.f11696d     // Catch:{ all -> 0x0081 }
                r7 = r8[r7]     // Catch:{ all -> 0x0081 }
                goto L_0x007f
            L_0x0047:
                int r8 = r6.f11701i     // Catch:{ all -> 0x0081 }
                int r8 = r8 - r7
                r6.f11701i = r8     // Catch:{ all -> 0x0081 }
                int r0 = r6.f11704l     // Catch:{ all -> 0x0081 }
                int r1 = r6.f11693a     // Catch:{ all -> 0x0081 }
                int r0 = r0 + r1
                int r0 = r0 - r7
                int r0 = r0 % r1
                r6.f11704l = r0     // Catch:{ all -> 0x0081 }
                r0 = -9223372036854775808
                r6.f11706n = r0     // Catch:{ all -> 0x0081 }
                int r8 = r8 - r2
            L_0x005a:
                if (r8 < 0) goto L_0x0079
                int r7 = r6.f11703k     // Catch:{ all -> 0x0081 }
                int r7 = r7 + r8
                int r0 = r6.f11693a     // Catch:{ all -> 0x0081 }
                int r7 = r7 % r0
                long r0 = r6.f11706n     // Catch:{ all -> 0x0081 }
                long[] r3 = r6.f11698f     // Catch:{ all -> 0x0081 }
                r4 = r3[r7]     // Catch:{ all -> 0x0081 }
                long r0 = java.lang.Math.max(r0, r4)     // Catch:{ all -> 0x0081 }
                r6.f11706n = r0     // Catch:{ all -> 0x0081 }
                int[] r0 = r6.f11697e     // Catch:{ all -> 0x0081 }
                r7 = r0[r7]     // Catch:{ all -> 0x0081 }
                r7 = r7 & r2
                if (r7 == 0) goto L_0x0076
                goto L_0x0079
            L_0x0076:
                int r8 = r8 + -1
                goto L_0x005a
            L_0x0079:
                long[] r7 = r6.f11695c     // Catch:{ all -> 0x0081 }
                int r8 = r6.f11704l     // Catch:{ all -> 0x0081 }
                r0 = r7[r8]     // Catch:{ all -> 0x0081 }
            L_0x007f:
                monitor-exit(r6)
                return r2
            L_0x0081:
                r7 = move-exception
                monitor-exit(r6)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4659d.C4662c.mo25086a(long):boolean");
        }
    }

    /* renamed from: a */
    public final void mo25073a(long j, byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            mo25071a(j);
            int i3 = (int) (j - this.f11682h);
            int min = Math.min(i - i2, this.f11676b - i3);
            C4911a peek = this.f11678d.peek();
            System.arraycopy(peek.f13038a, peek.f13039b + i3, bArr, i2, min);
            j += (long) min;
            i2 += min;
        }
    }

    /* renamed from: a */
    public final void mo25071a(long j) {
        int i = ((int) (j - this.f11682h)) / this.f11676b;
        for (int i2 = 0; i2 < i; i2++) {
            C4913b bVar = this.f11675a;
            C4911a remove = this.f11678d.remove();
            C4943k kVar = (C4943k) bVar;
            synchronized (kVar) {
                C4911a[] aVarArr = kVar.f13136d;
                aVarArr[0] = remove;
                kVar.mo25481a(aVarArr);
            }
            this.f11682h += (long) this.f11676b;
        }
    }

    /* renamed from: a */
    public void mo25074a(C4811i iVar) {
        boolean z;
        if (iVar == null) {
            iVar = null;
        }
        C4662c cVar = this.f11677c;
        synchronized (cVar) {
            z = true;
            if (iVar == null) {
                cVar.f11708p = true;
            } else {
                cVar.f11708p = false;
                if (!C4991u.m15140a((Object) iVar, (Object) cVar.f11709q)) {
                    cVar.f11709q = iVar;
                }
            }
            z = false;
        }
        C4663d dVar = this.f11688n;
        if (dVar != null && z) {
            dVar.mo25087a(iVar);
        }
    }

    /* renamed from: a */
    public int mo25068a(C4672g gVar, int i, boolean z) throws IOException, InterruptedException {
        if (!mo25084h()) {
            int b = ((C4657b) gVar).mo25062b(i);
            if (b != -1) {
                return b;
            }
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        try {
            int a = mo25067a(i);
            C4911a aVar = this.f11685k;
            int a2 = ((C4657b) gVar).mo25057a(aVar.f13038a, aVar.f13039b + this.f11686l, a);
            if (a2 != -1) {
                this.f11686l += a2;
                this.f11684j += (long) a2;
                mo25079c();
                return a2;
            } else if (z) {
                return -1;
            } else {
                throw new EOFException();
            }
        } finally {
            mo25079c();
        }
    }

    /* renamed from: a */
    public void mo25075a(C4978k kVar, int i) {
        if (!mo25084h()) {
            kVar.mo25525e(kVar.f13244b + i);
            return;
        }
        while (i > 0) {
            int a = mo25067a(i);
            C4911a aVar = this.f11685k;
            kVar.mo25517a(aVar.f13038a, aVar.f13039b + this.f11686l, a);
            this.f11686l += a;
            this.f11684j += (long) a;
            i -= a;
        }
        mo25079c();
    }

    /* renamed from: a */
    public void mo25072a(long j, int i, int i2, int i3, byte[] bArr) {
        long j2 = j;
        if (!mo25084h()) {
            C4662c cVar = this.f11677c;
            synchronized (cVar) {
                cVar.f11706n = Math.max(cVar.f11706n, j);
            }
            return;
        }
        try {
            if (this.f11687m) {
                if ((i & 1) != 0) {
                    if (this.f11677c.mo25086a(j)) {
                        this.f11687m = false;
                    }
                }
                return;
            }
            long j3 = j2 + 0;
            this.f11677c.mo25085a(j3, i, (this.f11684j - ((long) i2)) - ((long) i3), i2, bArr);
            mo25079c();
        } finally {
            mo25079c();
        }
    }

    /* renamed from: a */
    public final void mo25070a() {
        C4662c cVar = this.f11677c;
        cVar.f11702j = 0;
        cVar.f11703k = 0;
        cVar.f11704l = 0;
        cVar.f11701i = 0;
        cVar.f11707o = true;
        C4913b bVar = this.f11675a;
        LinkedBlockingDeque<C4911a> linkedBlockingDeque = this.f11678d;
        ((C4943k) bVar).mo25481a((C4911a[]) linkedBlockingDeque.toArray(new C4911a[linkedBlockingDeque.size()]));
        this.f11678d.clear();
        ((C4943k) this.f11675a).mo25482b();
        this.f11682h = 0;
        this.f11684j = 0;
        this.f11685k = null;
        this.f11686l = this.f11676b;
    }

    /* renamed from: a */
    public final int mo25067a(int i) {
        C4911a aVar;
        if (this.f11686l == this.f11676b) {
            this.f11686l = 0;
            C4943k kVar = (C4943k) this.f11675a;
            synchronized (kVar) {
                kVar.f13138f++;
                int i2 = kVar.f13139g;
                if (i2 > 0) {
                    C4911a[] aVarArr = kVar.f13140h;
                    int i3 = i2 - 1;
                    kVar.f13139g = i3;
                    aVar = aVarArr[i3];
                    aVarArr[i3] = null;
                } else {
                    aVar = new C4911a(new byte[kVar.f13134b], 0);
                }
            }
            this.f11685k = aVar;
            this.f11678d.add(aVar);
        }
        return Math.min(i, this.f11676b - this.f11686l);
    }
}
