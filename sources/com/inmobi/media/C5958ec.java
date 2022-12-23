package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.util.Map;

/* renamed from: com.inmobi.media.ec */
/* compiled from: ViewableNativeV2VideoAd */
public final class C5958ec extends C5953dz {

    /* renamed from: d */
    private final C6296o f15098d;

    /* renamed from: e */
    private boolean f15099e = false;

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

    public C5958ec(C6296o oVar) {
        super(oVar);
        this.f15098d = oVar;
    }

    /* renamed from: a */
    public final View mo35067a(View view, ViewGroup viewGroup, boolean z) {
        Context k;
        if (this.f15099e || (k = this.f15098d.mo35538k()) == null) {
            return null;
        }
        C6074ft ftVar = this.f15090c;
        C6296o oVar = this.f15098d;
        this.f15089b = new C6013fe(k, ftVar, oVar, oVar.mo35536i());
        View a = this.f15089b.mo35077a(view, viewGroup, false, (C6301q) null);
        mo35071a(a);
        this.f15098d.mo35554t();
        return a;
    }

    /* renamed from: e */
    public final void mo35076e() {
        if (!this.f15099e) {
            this.f15099e = true;
            if (this.f15089b != null) {
                this.f15089b.mo35078a();
                this.f15089b = null;
            }
            super.mo35076e();
        }
    }
}
