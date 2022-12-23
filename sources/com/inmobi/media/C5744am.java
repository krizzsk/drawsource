package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C5706af;
import java.lang.ref.WeakReference;

/* renamed from: com.inmobi.media.am */
/* compiled from: IntLoadMarkupInContainerNative */
final class C5744am extends C5769au<Boolean> {

    /* renamed from: a */
    private final WeakReference<C5745an> f14432a;

    /* renamed from: b */
    private final WeakReference<C5706af.C5724a> f14433b;

    /* renamed from: c */
    private byte f14434c;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo34372a(Object obj) {
        C5706af.C5724a aVar;
        Boolean bool = (Boolean) obj;
        C5745an anVar = (C5745an) this.f14432a.get();
        if (anVar != null && (aVar = (C5706af.C5724a) this.f14433b.get()) != null) {
            if (bool.booleanValue()) {
                C6234j s = anVar.mo34489s();
                C6301q M = anVar.mo34389M();
                if (M != null) {
                    if (s instanceof C6281n) {
                        C6281n nVar = (C6281n) s;
                        nVar.f15856t = M;
                        nVar.f15858v = anVar.f14348h;
                    } else {
                        anVar.mo34602b(aVar, (byte) 84);
                        return;
                    }
                }
                anVar.mo34604i(aVar);
                return;
            }
            byte b = this.f14434c;
            if (b != 0) {
                anVar.mo34427a(this.f14433b, b, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            } else {
                anVar.mo34602b(aVar, (byte) 85);
            }
        }
    }

    C5744am(C5745an anVar, C5706af.C5724a aVar) {
        super(anVar, (byte) 5);
        this.f14432a = new WeakReference<>(anVar);
        this.f14433b = new WeakReference<>(aVar);
    }

    /* renamed from: b */
    public final void mo34373b() {
        super.mo34373b();
        C5745an anVar = (C5745an) this.f14432a.get();
        if (anVar != null && ((C5706af.C5724a) this.f14433b.get()) != null) {
            anVar.mo34427a(this.f14433b, (byte) 40, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY));
        }
    }

    /* renamed from: a */
    public final void mo34371a() {
        C5745an anVar = (C5745an) this.f14432a.get();
        if (anVar == null) {
            mo34645b(Boolean.FALSE);
            return;
        }
        C5706af.C5724a aVar = (C5706af.C5724a) this.f14433b.get();
        if (aVar == null) {
            mo34645b(Boolean.FALSE);
            return;
        }
        C5783aw u = anVar.mo34491u();
        boolean z = true;
        if (u != null && !u.mo34669a(anVar.f14343c.mo35277a(anVar.mo34479k()).timeToLive)) {
            byte e = anVar.mo34461e(aVar);
            this.f14434c = e;
            if (e != 0) {
                z = false;
            }
            mo34645b(Boolean.valueOf(z));
            return;
        }
        mo34645b(Boolean.FALSE);
    }
}
