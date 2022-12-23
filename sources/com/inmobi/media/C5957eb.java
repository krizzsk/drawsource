package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.util.Map;

/* renamed from: com.inmobi.media.eb */
/* compiled from: ViewableNativeV2DisplayAd */
public final class C5957eb extends C5953dz {

    /* renamed from: d */
    private final C6281n f15095d;

    /* renamed from: e */
    private boolean f15096e = false;

    /* renamed from: f */
    private C6301q f15097f;

    /* renamed from: a */
    public final void mo35069a(byte b) {
    }

    /* renamed from: a */
    public final void mo35070a(Context context, byte b) {
    }

    /* renamed from: a */
    public final void mo35072a(Map<View, FriendlyObstructionPurpose> map) {
    }

    /* renamed from: d */
    public final void mo35075d() {
    }

    public C5957eb(C6281n nVar, C6301q qVar) {
        super(nVar);
        this.f15095d = nVar;
        this.f15097f = qVar;
    }

    /* renamed from: a */
    public final View mo35067a(View view, ViewGroup viewGroup, boolean z) {
        Context k;
        if (this.f15096e || (k = this.f15095d.mo35538k()) == null) {
            return null;
        }
        C6074ft ftVar = this.f15090c;
        C6281n nVar = this.f15095d;
        this.f15089b = new C6013fe(k, ftVar, nVar, nVar.mo35536i());
        C6195ic.m18378a((byte) 2, "InMobi", "Ad markup loaded into the container will be inflated into a View.");
        View a = this.f15089b.mo35077a(view, viewGroup, z, this.f15097f);
        mo35071a(a);
        this.f15095d.mo35554t();
        return a;
    }

    /* renamed from: e */
    public final void mo35076e() {
        if (!this.f15096e) {
            this.f15096e = true;
            if (this.f15089b != null) {
                this.f15089b.mo35078a();
                this.f15089b = null;
            }
            C6301q qVar = this.f15097f;
            if (qVar != null) {
                qVar.destroy();
                this.f15097f = null;
            }
            super.mo35076e();
        }
    }
}
