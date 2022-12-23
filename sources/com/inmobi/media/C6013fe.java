package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.inmobi.media.C5953dz;
import com.inmobi.media.C6016ff;

/* renamed from: com.inmobi.media.fe */
/* compiled from: NativeInflater */
public class C6013fe extends C5953dz.C5954a implements C6016ff.C6027b {

    /* renamed from: c */
    private static final String f15244c = C6013fe.class.getSimpleName();

    /* renamed from: b */
    public final C6016ff f15245b;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C6281n f15246d;

    public C6013fe(Context context, C6074ft ftVar, C6281n nVar, C5854ca caVar) {
        this.f15246d = nVar;
        Context context2 = context;
        C6074ft ftVar2 = ftVar;
        this.f15245b = new C6016ff(context2, ftVar2, this.f15246d, caVar, new C6016ff.C6028c() {
            /* renamed from: a */
            public final void mo35170a(int i, C5847bw bwVar) {
                if (!C6013fe.this.f15092a) {
                    C6013fe.this.f15246d.mo35520a(i, bwVar);
                }
            }
        }, new C6016ff.C6026a() {
            /* renamed from: a */
            public final void mo35171a(View view, C5847bw bwVar) {
                if (!C6013fe.this.f15092a) {
                    C6013fe.this.f15246d.mo35523a(view, bwVar);
                    C6013fe.this.f15246d.mo35524a(bwVar, false);
                }
            }
        }, this);
        C6052fo.m17999a(nVar.f15853q);
    }

    /* renamed from: a */
    public final View mo35077a(View view, ViewGroup viewGroup, boolean z, C6301q qVar) {
        C6030fh fhVar;
        if (view != null) {
            View findViewWithTag = view.findViewWithTag("InMobiAdView");
            if (findViewWithTag != null) {
                C6030fh fhVar2 = (C6030fh) findViewWithTag;
                if (z) {
                    fhVar = this.f15245b.mo35177b(fhVar2, viewGroup, qVar);
                } else {
                    fhVar = this.f15245b.mo35174a(fhVar2, viewGroup, qVar);
                }
            } else if (z) {
                fhVar = this.f15245b.mo35177b((C6030fh) null, viewGroup, qVar);
            } else {
                fhVar = this.f15245b.mo35174a((C6030fh) null, viewGroup, qVar);
            }
        } else if (z) {
            fhVar = this.f15245b.mo35177b((C6030fh) null, viewGroup, qVar);
        } else {
            fhVar = this.f15245b.mo35174a((C6030fh) null, viewGroup, qVar);
        }
        fhVar.setNativeStrandAd(this.f15246d);
        fhVar.setTag("InMobiAdView");
        return fhVar;
    }

    /* renamed from: a */
    public final void mo35078a() {
        this.f15245b.mo35175a();
        super.mo35078a();
    }

    /* renamed from: a */
    public final void mo35169a(C5864cg cgVar) {
        if (cgVar.f14713k == 1) {
            this.f15246d.mo35450b();
        }
    }
}
