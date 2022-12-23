package com.bytedance.sdk.component.p118e.p121c;

import android.content.Context;
import java.util.HashMap;

/* renamed from: com.bytedance.sdk.component.e.c.g */
/* compiled from: TncInstanceManager */
public class C2861g {

    /* renamed from: a */
    private static volatile C2861g f6442a;

    /* renamed from: b */
    private static HashMap<Integer, C2858e> f6443b;

    /* renamed from: c */
    private static HashMap<Integer, C2851a> f6444c;

    private C2861g() {
        f6443b = new HashMap<>();
        f6444c = new HashMap<>();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public static synchronized com.bytedance.sdk.component.p118e.p121c.C2861g m7987a() {
        /*
            java.lang.Class<com.bytedance.sdk.component.e.c.g> r0 = com.bytedance.sdk.component.p118e.p121c.C2861g.class
            monitor-enter(r0)
            com.bytedance.sdk.component.e.c.g r1 = f6442a     // Catch:{ all -> 0x001c }
            if (r1 != 0) goto L_0x0018
            monitor-enter(r0)     // Catch:{ all -> 0x001c }
            com.bytedance.sdk.component.e.c.g r1 = f6442a     // Catch:{ all -> 0x0015 }
            if (r1 != 0) goto L_0x0013
            com.bytedance.sdk.component.e.c.g r1 = new com.bytedance.sdk.component.e.c.g     // Catch:{ all -> 0x0015 }
            r1.<init>()     // Catch:{ all -> 0x0015 }
            f6442a = r1     // Catch:{ all -> 0x0015 }
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            goto L_0x0018
        L_0x0015:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            throw r1     // Catch:{ all -> 0x001c }
        L_0x0018:
            com.bytedance.sdk.component.e.c.g r1 = f6442a     // Catch:{ all -> 0x001c }
            monitor-exit(r0)
            return r1
        L_0x001c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p118e.p121c.C2861g.m7987a():com.bytedance.sdk.component.e.c.g");
    }

    /* renamed from: a */
    public C2858e mo17766a(int i) {
        C2858e eVar = f6443b.get(Integer.valueOf(i));
        if (eVar != null) {
            return eVar;
        }
        C2858e eVar2 = new C2858e(i);
        f6443b.put(Integer.valueOf(i), eVar2);
        return eVar2;
    }

    /* renamed from: a */
    public C2851a mo17765a(int i, Context context) {
        C2851a aVar = f6444c.get(Integer.valueOf(i));
        if (aVar != null) {
            return aVar;
        }
        C2851a aVar2 = new C2851a(context, i);
        f6444c.put(Integer.valueOf(i), aVar2);
        return aVar2;
    }
}
