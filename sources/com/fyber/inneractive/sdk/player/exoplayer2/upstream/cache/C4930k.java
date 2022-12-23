package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.os.ConditionVariable;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C4916a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4966b;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.k */
public final class C4930k implements C4916a {

    /* renamed from: a */
    public final File f13100a;

    /* renamed from: b */
    public final C4925f f13101b;

    /* renamed from: c */
    public final HashMap<String, C4926g> f13102c;

    /* renamed from: d */
    public final C4928i f13103d;

    /* renamed from: e */
    public final HashMap<String, ArrayList<C4916a.C4918b>> f13104e;

    /* renamed from: f */
    public long f13105f = 0;

    /* renamed from: g */
    public C4916a.C4917a f13106g;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.k$a */
    public class C4931a extends Thread {

        /* renamed from: a */
        public final /* synthetic */ ConditionVariable f13107a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4931a(String str, ConditionVariable conditionVariable) {
            super(str);
            this.f13107a = conditionVariable;
        }

        public void run() {
            synchronized (C4930k.this) {
                this.f13107a.open();
                try {
                    C4930k.m14980a(C4930k.this);
                } catch (C4916a.C4917a e) {
                    C4930k.this.f13106g = e;
                }
                C4930k.this.f13101b.getClass();
            }
        }
    }

    public C4930k(File file, C4925f fVar, byte[] bArr) {
        this.f13100a = file;
        this.f13101b = fVar;
        this.f13102c = new HashMap<>();
        this.f13103d = new C4928i(file, (byte[]) null);
        this.f13104e = new HashMap<>();
        ConditionVariable conditionVariable = new ConditionVariable();
        new C4931a("SimpleCache.initialize()", conditionVariable).start();
        conditionVariable.block();
    }

    /* renamed from: a */
    public synchronized long mo25436a() {
        return this.f13105f;
    }

    /* renamed from: b */
    public C4926g mo25442b(String str, long j) throws InterruptedException, C4916a.C4917a {
        C4932l d;
        synchronized (this) {
            while (true) {
                d = mo25444c(str, j);
                if (d == null) {
                    wait();
                }
            }
        }
        return d;
    }

    /* renamed from: d */
    public synchronized C4932l mo25444c(String str, long j) throws C4916a.C4917a {
        C4932l lVar;
        C4932l floor;
        C4916a.C4917a aVar = this.f13106g;
        if (aVar == null) {
            C4927h hVar = this.f13103d.f13091a.get(str);
            if (hVar == null) {
                lVar = new C4932l(str, j, -1, -9223372036854775807L, (File) null);
            } else {
                while (true) {
                    C4932l lVar2 = new C4932l(hVar.f13088b, j, -1, -9223372036854775807L, (File) null);
                    floor = hVar.f13089c.floor(lVar2);
                    if (floor == null || floor.f13082b + floor.f13083c <= j) {
                        C4932l ceiling = hVar.f13089c.ceiling(lVar2);
                        if (ceiling == null) {
                            floor = new C4932l(hVar.f13088b, j, -1, -9223372036854775807L, (File) null);
                        } else {
                            floor = new C4932l(hVar.f13088b, j, ceiling.f13082b - j, -9223372036854775807L, (File) null);
                        }
                    }
                    if (!floor.f13084d || floor.f13085e.length() == floor.f13083c) {
                        lVar = floor;
                    } else {
                        mo25471b();
                    }
                }
                lVar = floor;
            }
            if (lVar.f13084d) {
                C4927h hVar2 = this.f13103d.f13091a.get(str);
                C4965a.m15051b(hVar2.f13089c.remove(lVar));
                int i = hVar2.f13087a;
                C4965a.m15051b(lVar.f13084d);
                long currentTimeMillis = System.currentTimeMillis();
                File a = C4932l.m14995a(lVar.f13085e.getParentFile(), i, lVar.f13082b, currentTimeMillis);
                C4932l lVar3 = new C4932l(lVar.f13081a, lVar.f13082b, lVar.f13083c, currentTimeMillis, a);
                if (lVar.f13085e.renameTo(a)) {
                    hVar2.f13089c.add(lVar3);
                    ArrayList arrayList = this.f13104e.get(lVar.f13081a);
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ((C4916a.C4918b) arrayList.get(size)).mo25446a(this, lVar, lVar3);
                        }
                    }
                    C4929j jVar = (C4929j) this.f13101b;
                    jVar.f13098a.remove(lVar);
                    jVar.f13099b -= lVar.f13083c;
                    jVar.mo25447b(this, lVar3);
                    return lVar3;
                }
                throw new C4916a.C4917a("Renaming of " + lVar.f13085e + " to " + a + " failed.");
            } else if (this.f13102c.containsKey(str)) {
                return null;
            } else {
                this.f13102c.put(str, lVar);
                return lVar;
            }
        } else {
            throw aVar;
        }
    }

    /* renamed from: a */
    public synchronized File mo25438a(String str, long j, long j2) throws C4916a.C4917a {
        File file;
        C4927h hVar;
        C4965a.m15051b(this.f13102c.containsKey(str));
        if (!this.f13100a.exists()) {
            mo25471b();
            this.f13100a.mkdirs();
        }
        ((C4929j) this.f13101b).mo25467a((C4916a) this, j2);
        file = this.f13100a;
        C4928i iVar = this.f13103d;
        hVar = iVar.f13091a.get(str);
        if (hVar == null) {
            hVar = iVar.mo25461a(str, -1);
        }
        return C4932l.m14995a(file, hVar.f13087a, j, System.currentTimeMillis());
    }

    /* renamed from: b */
    public synchronized void mo25443b(C4926g gVar) {
        C4965a.m15051b(gVar == this.f13102c.remove(gVar.f13081a));
        notifyAll();
    }

    /* renamed from: b */
    public final void mo25471b() throws C4916a.C4917a {
        LinkedList linkedList = new LinkedList();
        for (C4927h hVar : this.f13103d.f13091a.values()) {
            Iterator<C4932l> it = hVar.f13089c.iterator();
            while (it.hasNext()) {
                C4926g next = it.next();
                if (next.f13085e.length() != next.f13083c) {
                    linkedList.add(next);
                }
            }
        }
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            mo25469a((C4926g) it2.next(), false);
        }
        this.f13103d.mo25464b();
        this.f13103d.mo25466c();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public synchronized void mo25440a(java.io.File r8) throws com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C4916a.C4917a {
        /*
            r7 = this;
            monitor-enter(r7)
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.i r0 = r7.f13103d     // Catch:{ all -> 0x0077 }
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.l r0 = com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C4932l.m14994a(r8, r0)     // Catch:{ all -> 0x0077 }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000d
            r3 = r1
            goto L_0x000e
        L_0x000d:
            r3 = r2
        L_0x000e:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a.m15051b(r3)     // Catch:{ all -> 0x0077 }
            java.util.HashMap<java.lang.String, com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.g> r3 = r7.f13102c     // Catch:{ all -> 0x0077 }
            java.lang.String r4 = r0.f13081a     // Catch:{ all -> 0x0077 }
            boolean r3 = r3.containsKey(r4)     // Catch:{ all -> 0x0077 }
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a.m15051b(r3)     // Catch:{ all -> 0x0077 }
            boolean r3 = r8.exists()     // Catch:{ all -> 0x0077 }
            if (r3 != 0) goto L_0x0024
            monitor-exit(r7)
            return
        L_0x0024:
            long r3 = r8.length()     // Catch:{ all -> 0x0077 }
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0033
            r8.delete()     // Catch:{ all -> 0x0077 }
            monitor-exit(r7)
            return
        L_0x0033:
            java.lang.String r8 = r0.f13081a     // Catch:{ all -> 0x0077 }
            monitor-enter(r7)     // Catch:{ all -> 0x0077 }
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.i r3 = r7.f13103d     // Catch:{ all -> 0x0074 }
            java.util.HashMap<java.lang.String, com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h> r3 = r3.f13091a     // Catch:{ all -> 0x0074 }
            java.lang.Object r8 = r3.get(r8)     // Catch:{ all -> 0x0074 }
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h r8 = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C4927h) r8     // Catch:{ all -> 0x0074 }
            r3 = -1
            if (r8 != 0) goto L_0x0046
            r5 = r3
            goto L_0x0048
        L_0x0046:
            long r5 = r8.f13090d     // Catch:{ all -> 0x0074 }
        L_0x0048:
            monitor-exit(r7)     // Catch:{ all -> 0x0077 }
            java.lang.Long r8 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0077 }
            long r5 = r8.longValue()     // Catch:{ all -> 0x0077 }
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x0067
            long r3 = r0.f13082b     // Catch:{ all -> 0x0077 }
            long r5 = r0.f13083c     // Catch:{ all -> 0x0077 }
            long r3 = r3 + r5
            long r5 = r8.longValue()     // Catch:{ all -> 0x0077 }
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 > 0) goto L_0x0063
            goto L_0x0064
        L_0x0063:
            r1 = r2
        L_0x0064:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a.m15051b(r1)     // Catch:{ all -> 0x0077 }
        L_0x0067:
            r7.mo25470a((com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C4932l) r0)     // Catch:{ all -> 0x0077 }
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.i r8 = r7.f13103d     // Catch:{ all -> 0x0077 }
            r8.mo25466c()     // Catch:{ all -> 0x0077 }
            r7.notifyAll()     // Catch:{ all -> 0x0077 }
            monitor-exit(r7)
            return
        L_0x0074:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0077 }
            throw r8     // Catch:{ all -> 0x0077 }
        L_0x0077:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C4930k.mo25440a(java.io.File):void");
    }

    /* renamed from: a */
    public static void m14980a(C4930k kVar) throws C4916a.C4917a {
        if (!kVar.f13100a.exists()) {
            kVar.f13100a.mkdirs();
            return;
        }
        C4928i iVar = kVar.f13103d;
        C4965a.m15051b(!iVar.f13096f);
        if (!iVar.mo25463a()) {
            C4966b bVar = iVar.f13093c;
            bVar.f13208a.delete();
            bVar.f13209b.delete();
            iVar.f13091a.clear();
            iVar.f13092b.clear();
        }
        File[] listFiles = kVar.f13100a.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!file.getName().equals(CachedContentIndex.FILE_NAME)) {
                    C4932l a = file.length() > 0 ? C4932l.m14994a(file, kVar.f13103d) : null;
                    if (a != null) {
                        kVar.mo25470a(a);
                    } else {
                        file.delete();
                    }
                }
            }
            kVar.f13103d.mo25464b();
            kVar.f13103d.mo25466c();
        }
    }

    /* renamed from: a */
    public final void mo25470a(C4932l lVar) {
        C4928i iVar = this.f13103d;
        String str = lVar.f13081a;
        C4927h hVar = iVar.f13091a.get(str);
        if (hVar == null) {
            hVar = iVar.mo25461a(str, -1);
        }
        hVar.f13089c.add(lVar);
        this.f13105f += lVar.f13083c;
        ArrayList arrayList = this.f13104e.get(lVar.f13081a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C4916a.C4918b) arrayList.get(size)).mo25447b(this, lVar);
            }
        }
        ((C4929j) this.f13101b).mo25447b(this, lVar);
    }

    /* renamed from: a */
    public final void mo25469a(C4926g gVar, boolean z) throws C4916a.C4917a {
        boolean z2;
        C4927h a = this.f13103d.mo25460a(gVar.f13081a);
        if (a != null) {
            if (a.f13089c.remove(gVar)) {
                gVar.f13085e.delete();
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                this.f13105f -= gVar.f13083c;
                if (z && a.f13089c.isEmpty()) {
                    this.f13103d.mo25465b(a.f13088b);
                    this.f13103d.mo25466c();
                }
                ArrayList arrayList = this.f13104e.get(gVar.f13081a);
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ((C4916a.C4918b) arrayList.get(size)).mo25445a(this, gVar);
                    }
                }
                C4929j jVar = (C4929j) this.f13101b;
                jVar.f13098a.remove(gVar);
                jVar.f13099b -= gVar.f13083c;
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo25439a(C4926g gVar) throws C4916a.C4917a {
        mo25469a(gVar, true);
    }

    /* renamed from: a */
    public synchronized void mo25441a(String str, long j) throws C4916a.C4917a {
        C4928i iVar = this.f13103d;
        C4927h hVar = iVar.f13091a.get(str);
        if (hVar == null) {
            iVar.mo25461a(str, j);
        } else if (hVar.f13090d != j) {
            hVar.f13090d = j;
            iVar.f13096f = true;
        }
        this.f13103d.mo25466c();
    }

    /* renamed from: a */
    public synchronized long mo25437a(String str) {
        long j;
        C4927h hVar = this.f13103d.f13091a.get(str);
        if (hVar == null) {
            j = -1;
        } else {
            j = hVar.f13090d;
        }
        return j;
    }
}
