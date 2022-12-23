package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C5706af;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ag */
/* compiled from: AuctionCloseWorker */
final class C5726ag extends C5769au<InMobiAdRequestStatus> {

    /* renamed from: a */
    private final WeakReference<C5706af> f14397a;

    /* renamed from: b */
    private final JSONObject f14398b;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo34372a(Object obj) {
        C5706af.C5724a p;
        InMobiAdRequestStatus inMobiAdRequestStatus = (InMobiAdRequestStatus) obj;
        C5706af afVar = (C5706af) this.f14397a.get();
        if (afVar != null && (p = afVar.mo34486p()) != null) {
            if (inMobiAdRequestStatus == null) {
                afVar.f14342b = 2;
                afVar.mo34439b(p);
                return;
            }
            p.mo34524a(inMobiAdRequestStatus);
        }
    }

    C5726ag(C5706af afVar, JSONObject jSONObject) {
        super(afVar, (byte) 4);
        this.f14397a = new WeakReference<>(afVar);
        this.f14398b = jSONObject;
    }

    /* renamed from: b */
    public final void mo34373b() {
        C5706af.C5724a p;
        super.mo34373b();
        C5706af afVar = (C5706af) this.f14397a.get();
        if (afVar != null && (p = afVar.mo34486p()) != null) {
            p.mo34524a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY));
        }
    }

    /* renamed from: a */
    public final void mo34371a() {
        C5706af afVar = (C5706af) this.f14397a.get();
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        if (afVar == null || afVar.f14356p == null) {
            mo34645b(inMobiAdRequestStatus);
            return;
        }
        try {
            afVar.f14356p.mo34755a(this.f14398b, afVar.f14343c);
            mo34645b(null);
        } catch (Exception unused) {
            String str = C5706af.f14331a;
            mo34645b(inMobiAdRequestStatus);
        }
    }
}
