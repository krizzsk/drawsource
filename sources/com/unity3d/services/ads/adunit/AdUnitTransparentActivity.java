package com.unity3d.services.ads.adunit;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.unity3d.services.core.misc.C12081k;

public class AdUnitTransparentActivity extends AdUnitActivity {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo70702a() {
        super.mo70702a();
        C12081k.m32886a((View) this.f28651a, (Drawable) new ColorDrawable(0));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C12081k.m32886a((View) this.f28651a, (Drawable) new ColorDrawable(0));
    }
}
