package com.inmobi.media;

import com.google.common.base.Ascii;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C5706af;
import java.lang.ref.WeakReference;

/* renamed from: com.inmobi.media.ar */
/* compiled from: NativeLoadMarkupInContainerNative */
final class C5760ar extends C5769au<Byte> {

    /* renamed from: a */
    private final WeakReference<C5758aq> f14468a;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo34372a(Object obj) {
        Byte b = (Byte) obj;
        C5758aq aqVar = (C5758aq) this.f14468a.get();
        if (aqVar != null) {
            if (b.byteValue() != 0) {
                aqVar.mo34427a((WeakReference<C5706af.C5724a>) new WeakReference(aqVar.mo34486p()), b.byteValue(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            } else if (2 == aqVar.mo34477j()) {
                aqVar.f14342b = 4;
                C6234j s = aqVar.mo34489s();
                C6301q M = aqVar.mo34389M();
                C5706af.C5724a p = aqVar.mo34486p();
                if (s instanceof C6281n) {
                    C6281n nVar = (C6281n) s;
                    nVar.f15856t = M;
                    nVar.f15858v = aqVar.f14348h;
                    aqVar.mo34385I();
                    if (p != null) {
                        String str = C5758aq.f14462y;
                        aqVar.mo34451c(p);
                    }
                } else if (p != null) {
                    String str2 = C5758aq.f14462y;
                    p.mo34525a((C5706af) aqVar, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                }
            }
        }
    }

    C5760ar(C5758aq aqVar) {
        super(aqVar, (byte) 6);
        this.f14468a = new WeakReference<>(aqVar);
    }

    /* renamed from: b */
    public final void mo34373b() {
        C5706af.C5724a p;
        super.mo34373b();
        C5758aq aqVar = (C5758aq) this.f14468a.get();
        if (aqVar != null && (p = aqVar.mo34486p()) != null) {
            p.mo34525a((C5706af) aqVar, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY));
        }
    }

    /* renamed from: a */
    public final void mo34371a() {
        C5758aq aqVar = (C5758aq) this.f14468a.get();
        if (aqVar == null) {
            mo34645b(Byte.valueOf(Ascii.f18296CR));
        } else {
            mo34645b(Byte.valueOf(aqVar.mo34461e(aqVar.mo34486p())));
        }
    }
}
