package com.inmobi.media;

import com.google.common.base.Ascii;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C5706af;
import com.inmobi.media.C6094fv;
import com.smaato.sdk.video.vast.model.C11130Ad;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: com.inmobi.media.al */
/* compiled from: GetSignalsWorker */
final class C5743al extends C5769au<byte[]> {

    /* renamed from: a */
    private final WeakReference<C5706af> f14429a;

    /* renamed from: b */
    private C5843bs f14430b;

    /* renamed from: c */
    private final long f14431c;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo34372a(Object obj) {
        byte[] bArr = (byte[]) obj;
        C5706af afVar = (C5706af) this.f14429a.get();
        if (afVar != null) {
            if (this.f14430b != null) {
                afVar.f14342b = 3;
            }
            C5706af.C5724a p = afVar.mo34486p();
            if (p != null) {
                C5843bs bsVar = this.f14430b;
                if (bsVar != null) {
                    afVar.mo34405a((int) bsVar.f14699b, this.f14431c);
                    p.mo34534b(new InMobiAdRequestStatus(this.f14430b.f14698a.getStatusCode()));
                } else if (bArr == null) {
                    afVar.f14342b = 3;
                    afVar.mo34405a(13, this.f14431c);
                    p.mo34534b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                } else {
                    long j = this.f14431c;
                    afVar.f14353m = false;
                    HashMap hashMap = new HashMap();
                    hashMap.put(C11130Ad.AD_TYPE, afVar.mo34479k());
                    hashMap.put("latency", Long.valueOf(System.currentTimeMillis() - j));
                    hashMap.put("networkType", C6210ik.m18428b());
                    afVar.mo34454c("AdGetSignalsSucceeded", hashMap);
                    p.mo34531a(bArr);
                }
            }
        }
    }

    C5743al(C5706af afVar, long j) {
        super(afVar, (byte) 2);
        this.f14429a = new WeakReference<>(afVar);
        this.f14431c = j;
    }

    /* renamed from: b */
    public final void mo34373b() {
        C5706af.C5724a p;
        super.mo34373b();
        C5706af afVar = (C5706af) this.f14429a.get();
        if (afVar != null && (p = afVar.mo34486p()) != null) {
            p.mo34534b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY));
        }
    }

    /* renamed from: a */
    public final void mo34371a() {
        C5706af afVar = (C5706af) this.f14429a.get();
        if (afVar == null || afVar.f14354n == null) {
            mo34645b(null);
        } else if (afVar.mo34486p() == null) {
            mo34645b(null);
        } else {
            try {
                C5873cm cmVar = afVar.f14354n;
                cmVar.f14833b = new C5874cn(cmVar.f14832a);
                C5876cp C = cmVar.f14833b.f14834a.mo34379C();
                HashMap hashMap = new HashMap();
                hashMap.put("h-user-agent", C6183hw.m18337i());
                C.mo35341c(hashMap);
                C.mo34869a();
                if (((C6115gg) C6094fv.m18084a("root", C6183hw.m18332f(), (C6094fv.C6097c) null)).mo35305i()) {
                    throw new C5843bs(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MONETIZATION_DISABLED), (byte) 9);
                } else if (C.f15536q) {
                    mo34645b(C.mo35346f().getBytes());
                } else {
                    throw new C5843bs(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED), Ascii.NAK);
                }
            } catch (C5843bs e) {
                this.f14430b = e;
                mo34645b(null);
            }
        }
    }
}
