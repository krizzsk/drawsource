package com.inmobi.media;

import com.inmobi.media.C5706af;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.inmobi.media.ae */
/* compiled from: AdImpressionCallbackHandler */
public class C5705ae {

    /* renamed from: a */
    WeakReference<C5706af.C5724a> f14327a;

    /* renamed from: b */
    private AtomicBoolean f14328b = new AtomicBoolean();

    /* renamed from: c */
    private final String f14329c = C5705ae.class.getSimpleName();

    public C5705ae(WeakReference<C5706af.C5724a> weakReference) {
        this.f14327a = weakReference;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34376a(C6173ho hoVar) {
        if (!this.f14328b.getAndSet(true)) {
            C5706af.C5724a aVar = (C5706af.C5724a) this.f14327a.get();
            if (aVar != null) {
                aVar.mo34528a(hoVar);
            } else if (hoVar != null) {
                hoVar.mo35384b();
            }
        } else if (hoVar != null) {
            hoVar.mo35386d();
        }
    }
}
