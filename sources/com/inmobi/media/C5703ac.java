package com.inmobi.media;

import android.os.SystemClock;
import com.google.common.base.Ascii;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C5706af;
import com.inmobi.media.C6094fv;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.inmobi.media.ac */
/* compiled from: AdFetcherTask */
final class C5703ac extends C5769au<C5794bd> {

    /* renamed from: a */
    private final WeakReference<C5706af> f14323a;

    /* renamed from: b */
    private C5843bs f14324b;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo34372a(Object obj) {
        C5794bd bdVar = (C5794bd) obj;
        C5706af afVar = (C5706af) this.f14323a.get();
        if (afVar != null) {
            afVar.mo34467f((byte) 0);
            if (this.f14324b != null) {
                afVar.mo34416a(afVar.mo34475i(), this.f14324b.f14698a, this.f14324b.f14699b);
            } else if (bdVar == null) {
                afVar.mo34416a(afVar.mo34475i(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (byte) 0);
            } else if (bdVar.mo34757c()) {
                afVar.mo34419a(bdVar);
            } else if (!afVar.f14352l && afVar.mo34473h() != null && afVar.mo34477j() == 1) {
                afVar.f14356p = bdVar;
                afVar.f14362v = afVar.f14356p.mo34758d();
                C5706af.C5724a p = afVar.mo34486p();
                if (p != null) {
                    p.mo34527a(afVar.f14355o, bdVar);
                }
            }
        }
    }

    C5703ac(C5706af afVar) {
        super(afVar, (byte) 0);
        this.f14323a = new WeakReference<>(afVar);
    }

    /* renamed from: b */
    public final void mo34373b() {
        super.mo34373b();
        C5706af afVar = (C5706af) this.f14323a.get();
        if (afVar != null) {
            afVar.mo34416a(afVar.mo34475i(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY), (byte) 56);
        }
    }

    /* renamed from: a */
    public final void mo34371a() {
        C5706af afVar = (C5706af) this.f14323a.get();
        if (afVar == null) {
            this.f14324b = new C5843bs(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (byte) 0);
            mo34645b(null);
            return;
        }
        boolean z = true;
        if (!((C6115gg) C6094fv.m18084a("root", C6183hw.m18332f(), (C6094fv.C6097c) null)).mo35305i()) {
            afVar.f14345e = System.currentTimeMillis();
            try {
                C5796be r = afVar.mo34488r();
                C5876cp C = afVar.mo34379C();
                Integer w = afVar.mo34493w();
                if (w != null) {
                    if (SystemClock.elapsedRealtime() - r.f14584c >= ((long) (w.intValue() * 1000))) {
                        z = false;
                    }
                    if (z) {
                        throw new C5843bs(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST), Ascii.DLE);
                    }
                }
                C5796be.m17271a(C);
                r.f14584c = SystemClock.elapsedRealtime();
                C5877cq a = new C5875co(C).mo34868a();
                if (a == null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, (byte) 7);
                    r.mo34771a((Map<String, Object>) hashMap);
                    throw new C5843bs(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (byte) 0);
                } else if (a.f14846a.f15541a == null) {
                    mo34645b(r.mo34769a(a));
                } else {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(IronSourceConstants.EVENTS_ERROR_CODE, String.valueOf(a.f14846a.f15541a.f15517a));
                    r.mo34771a((Map<String, Object>) hashMap2);
                    throw new C5843bs(a.f14847b, (byte) 0);
                }
            } catch (C5843bs e) {
                String str = C5706af.f14331a;
                this.f14324b = e;
                mo34645b(null);
            }
        } else {
            C6195ic.m18378a((byte) 1, C5706af.f14331a, "SDK will not perform this load operation as monetization has been disabled. Please contact InMobi for further info.");
            this.f14324b = new C5843bs(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MONETIZATION_DISABLED), (byte) 9);
            mo34645b(null);
        }
    }
}
