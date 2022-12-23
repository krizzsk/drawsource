package com.bytedance.sdk.component.adexpress.p093b;

import com.bytedance.sdk.component.adexpress.p093b.C2559i;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.component.adexpress.b.k */
/* compiled from: RenderRealChain */
public class C2562k implements C2559i.C2560a {

    /* renamed from: a */
    C2566n f5405a;

    /* renamed from: b */
    private List<C2559i> f5406b;

    /* renamed from: c */
    private C2558h f5407c;

    /* renamed from: d */
    private AtomicBoolean f5408d = new AtomicBoolean(false);

    public C2562k(List<C2559i> list, C2558h hVar) {
        this.f5406b = list;
        this.f5407c = hVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x000b A[LOOP:0: B:1:0x000b->B:4:0x001b, LOOP_START] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16662a() {
        /*
            r2 = this;
            com.bytedance.sdk.component.adexpress.b.h r0 = r2.f5407c
            r0.mo16645a()
            java.util.List<com.bytedance.sdk.component.adexpress.b.i> r0 = r2.f5406b
            java.util.Iterator r0 = r0.iterator()
        L_0x000b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x001d
            java.lang.Object r1 = r0.next()
            com.bytedance.sdk.component.adexpress.b.i r1 = (com.bytedance.sdk.component.adexpress.p093b.C2559i) r1
            boolean r1 = r1.mo16634a(r2)
            if (r1 == 0) goto L_0x000b
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.p093b.C2562k.mo16662a():void");
    }

    /* renamed from: a */
    public void mo16663a(C2559i iVar) {
        int indexOf = this.f5406b.indexOf(iVar);
        if (indexOf >= 0) {
            do {
                indexOf++;
                if (indexOf >= this.f5406b.size() || this.f5406b.get(indexOf).mo16634a(this)) {
                }
                indexOf++;
                return;
            } while (this.f5406b.get(indexOf).mo16634a(this));
        }
    }

    /* renamed from: b */
    public boolean mo16667b(C2559i iVar) {
        int indexOf = this.f5406b.indexOf(iVar);
        return indexOf < this.f5406b.size() - 1 && indexOf >= 0;
    }

    /* renamed from: b */
    public C2566n mo16666b() {
        return this.f5405a;
    }

    /* renamed from: a */
    public void mo16664a(C2566n nVar) {
        this.f5405a = nVar;
    }

    /* renamed from: a */
    public void mo16665a(boolean z) {
        this.f5408d.getAndSet(z);
    }

    /* renamed from: c */
    public boolean mo16668c() {
        return this.f5408d.get();
    }
}
