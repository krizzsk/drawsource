package com.fyber.inneractive.sdk.player.p190ui;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.C5309q0;

/* renamed from: com.fyber.inneractive.sdk.player.ui.d */
public class C5037d extends C5042i {
    public C5037d(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo25651a(C5309q0 q0Var, int i, int i2) {
        if (this.f13440d == UnitDisplayType.DEFAULT && this.f13467s) {
            mo25668a(q0Var, this.f13465q, this.f13466r, i, i2);
        }
        q0Var.f14037a = 0;
        q0Var.f14038b = 0;
    }

    /* renamed from: g */
    public void mo25660g() {
        C5309q0 q0Var = new C5309q0(0, 0);
        this.f13448B = q0Var;
        if (this.f13440d == UnitDisplayType.SQUARE) {
            int min = Math.min(this.f13447A.f14037a, this.f13438b);
            ViewGroup viewGroup = this.f13458j;
            if (viewGroup != null) {
                viewGroup.getLayoutParams().width = min;
                this.f13458j.getLayoutParams().height = min;
            }
            ImageView imageView = this.f13457i;
            if (imageView != null) {
                imageView.getLayoutParams().width = min;
                this.f13457i.getLayoutParams().height = min;
            }
            mo25668a(this.f13448B, this.f13465q, this.f13466r, min, min);
            return;
        }
        int i = this.f13465q;
        int i2 = this.f13466r;
        C5309q0 q0Var2 = this.f13447A;
        mo25668a(q0Var, i, i2, q0Var2.f14037a, q0Var2.f14038b);
        ImageView imageView2 = this.f13457i;
        if (imageView2 != null) {
            imageView2.getLayoutParams().width = this.f13448B.f14037a;
            this.f13457i.getLayoutParams().height = this.f13448B.f14038b;
        }
    }
}
