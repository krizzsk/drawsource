package com.fyber.inneractive.sdk.player.exoplayer2;

import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4913b;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4943k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4981n;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.c */
public final class C4638c {

    /* renamed from: a */
    public final C4943k f11631a;

    /* renamed from: b */
    public final long f11632b;

    /* renamed from: c */
    public final long f11633c;

    /* renamed from: d */
    public final long f11634d;

    /* renamed from: e */
    public final long f11635e;

    /* renamed from: f */
    public int f11636f;

    /* renamed from: g */
    public boolean f11637g;

    public C4638c(C4943k kVar, int i, int i2, long j, long j2) {
        this(kVar, i, i2, j, j2, (C4981n) null);
    }

    /* renamed from: a */
    public C4913b mo25026a() {
        return this.f11631a;
    }

    public C4638c(C4943k kVar, int i, int i2, long j, long j2, C4981n nVar) {
        this.f11631a = kVar;
        this.f11632b = ((long) i) * 1000;
        this.f11633c = ((long) i2) * 1000;
        this.f11634d = j * 1000;
        this.f11635e = j2 * 1000;
    }

    /* renamed from: a */
    public boolean mo25028a(long j) {
        boolean z;
        int i;
        boolean z2 = false;
        if (j > this.f11633c) {
            z = false;
        } else {
            z = j < this.f11632b ? true : true;
        }
        C4943k kVar = this.f11631a;
        synchronized (kVar) {
            i = kVar.f13138f * kVar.f13134b;
        }
        boolean z3 = i >= this.f11636f;
        boolean z4 = this.f11637g;
        if (z || (z && z4 && !z3)) {
            z2 = true;
        }
        this.f11637g = z2;
        return z2;
    }

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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public final void mo25027a(boolean r3) {
        /*
            r2 = this;
            r0 = 0
            r2.f11636f = r0
            r2.f11637g = r0
            if (r3 == 0) goto L_0x0027
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.k r3 = r2.f11631a
            monitor-enter(r3)
            boolean r1 = r3.f13133a     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x0022
            monitor-enter(r3)     // Catch:{ all -> 0x0024 }
            int r1 = r3.f13137e     // Catch:{ all -> 0x001f }
            if (r1 <= 0) goto L_0x0015
            r1 = 1
            goto L_0x0016
        L_0x0015:
            r1 = r0
        L_0x0016:
            r3.f13137e = r0     // Catch:{ all -> 0x001f }
            if (r1 == 0) goto L_0x001d
            r3.mo25482b()     // Catch:{ all -> 0x001f }
        L_0x001d:
            monitor-exit(r3)     // Catch:{ all -> 0x0024 }
            goto L_0x0022
        L_0x001f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0024 }
            throw r0     // Catch:{ all -> 0x0024 }
        L_0x0022:
            monitor-exit(r3)
            goto L_0x0027
        L_0x0024:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.C4638c.mo25027a(boolean):void");
    }
}
