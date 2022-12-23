package com.inmobi.media;

import android.widget.RelativeLayout;
import com.inmobi.media.C6215il;

/* renamed from: com.inmobi.media.cu */
/* compiled from: AdMarkupViewHandler */
public abstract class C5894cu {

    /* renamed from: a */
    private final String f14902a = C5894cu.class.getSimpleName();

    /* renamed from: b */
    private C5923di f14903b = C5923di.PORTRAIT;

    /* renamed from: c */
    private float f14904c = 1.0f;

    /* renamed from: d */
    private RelativeLayout f14905d;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo34968a();

    /* renamed from: b */
    public abstract void mo34971b();

    /* renamed from: c */
    public abstract void mo34972c();

    /* renamed from: d */
    public abstract void mo34973d();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo34974e();

    /* renamed from: f */
    public abstract void mo34975f();

    public C5894cu(RelativeLayout relativeLayout) {
        this.f14905d = relativeLayout;
    }

    /* renamed from: a */
    public void mo34970a(C5923di diVar) {
        this.f14903b = diVar;
    }

    /* renamed from: a */
    public void mo34969a(float f) {
        this.f14904c = f;
    }

    /* renamed from: g */
    public void mo34976g() {
        RelativeLayout.LayoutParams layoutParams;
        if (this.f14904c == 1.0f) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(10);
            this.f14905d.setLayoutParams(layoutParams2);
            return;
        }
        C6215il.C6217a b = C6215il.m18450b(this.f14905d.getContext());
        if (this.f14903b.mo35029a()) {
            layoutParams = new RelativeLayout.LayoutParams((int) (((float) b.f15670a) * this.f14904c), -1);
            layoutParams.addRule(9);
        } else {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, (int) (((float) b.f15671b) * this.f14904c));
            layoutParams3.addRule(10);
            layoutParams = layoutParams3;
        }
        this.f14905d.setLayoutParams(layoutParams);
    }
}
