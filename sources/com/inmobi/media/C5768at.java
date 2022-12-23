package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.ListIterator;

/* renamed from: com.inmobi.media.at */
/* compiled from: ParseAdResponseWorker */
final class C5768at extends C5769au<Boolean> {

    /* renamed from: a */
    private final WeakReference<C5706af> f14481a;

    /* renamed from: b */
    private final C5783aw f14482b;

    /* renamed from: c */
    private final C5794bd f14483c;

    /* renamed from: d */
    private final boolean f14484d;

    /* renamed from: e */
    private InMobiAdRequestStatus f14485e;

    C5768at(C5706af afVar, C5783aw awVar, C5794bd bdVar, boolean z, InMobiAdRequestStatus inMobiAdRequestStatus) {
        super(afVar, (byte) 1);
        this.f14481a = new WeakReference<>(afVar);
        this.f14482b = awVar;
        this.f14483c = bdVar;
        this.f14484d = z;
        this.f14485e = inMobiAdRequestStatus;
    }

    /* renamed from: b */
    public final void mo34373b() {
        super.mo34373b();
        this.f14485e = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY);
        mo34372a(Boolean.FALSE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo34372a(Boolean bool) {
        C5706af afVar = (C5706af) this.f14481a.get();
        if (afVar == null) {
            return;
        }
        if (this.f14484d) {
            afVar.mo34445b(bool.booleanValue(), this.f14485e);
        } else {
            afVar.mo34432a(bool.booleanValue(), this.f14485e);
        }
    }

    /* renamed from: a */
    public final void mo34371a() {
        C5706af afVar = (C5706af) this.f14481a.get();
        if (afVar == null) {
            mo34645b(Boolean.FALSE);
        } else if (this.f14483c.mo34758d()) {
            LinkedList<C5783aw> b = this.f14483c.mo34756b();
            if (afVar.mo34434a(b.getFirst(), 0)) {
                ListIterator<C5783aw> listIterator = b.listIterator(1);
                while (listIterator.hasNext()) {
                    C5783aw next = listIterator.next();
                    if (!afVar.mo34434a(next, b.indexOf(next))) {
                        listIterator.remove();
                    }
                }
                mo34645b(Boolean.TRUE);
                return;
            }
            mo34645b(Boolean.FALSE);
        } else {
            mo34645b(Boolean.valueOf(afVar.mo34434a(this.f14482b, 0)));
        }
    }
}
