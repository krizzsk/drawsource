package com.fyber.inneractive.sdk.player.p190ui;

import android.view.TextureView;
import android.view.View;
import com.fyber.inneractive.sdk.util.C5312s;
import java.lang.ref.WeakReference;

/* renamed from: com.fyber.inneractive.sdk.player.ui.e */
public class C5038e extends TextureView {

    /* renamed from: a */
    public WeakReference<C5042i> f13445a;

    public C5038e(C5042i iVar) {
        super(iVar.getContext());
        this.f13445a = new WeakReference<>(iVar);
    }

    public void onMeasure(int i, int i2) {
        C5042i iVar = (C5042i) C5312s.m16531a(this.f13445a);
        if (iVar != null) {
            i = View.MeasureSpec.makeMeasureSpec(iVar.f13448B.f14037a, 1073741824);
            i2 = View.MeasureSpec.makeMeasureSpec(iVar.f13448B.f14038b, 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
