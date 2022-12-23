package com.fyber.inneractive.sdk.player.p190ui;

import android.content.Context;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.config.C4287y;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.C5292l;
import com.fyber.inneractive.sdk.util.C5309q0;

/* renamed from: com.fyber.inneractive.sdk.player.ui.f */
public class C5039f extends C5042i {
    public C5039f(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo25651a(C5309q0 q0Var, int i, int i2) {
        if (q0Var != null) {
            UnitDisplayType unitDisplayType = this.f13440d;
            if (unitDisplayType == UnitDisplayType.SQUARE) {
                int min = Math.min(i, this.f13438b) - C5292l.m16507b(((C4287y) this.f13439c).f10549f.f10374f.intValue() * 2);
                q0Var.f14037a = min;
                q0Var.f14038b = min;
            } else if (unitDisplayType == UnitDisplayType.LANDSCAPE) {
                int min2 = Math.min(i, this.f13438b) - C5292l.m16507b(((C4287y) this.f13439c).f10549f.f10374f.intValue() * 2);
                q0Var.f14037a = min2;
                q0Var.f14038b = (min2 * 9) / 16;
            } else if (unitDisplayType == UnitDisplayType.MRECT) {
                q0Var.f14037a = C5292l.m16507b(300);
                q0Var.f14038b = C5292l.m16507b(250);
            } else if (unitDisplayType != UnitDisplayType.DEFAULT || !this.f13467s) {
                q0Var.f14037a = 0;
                q0Var.f14038b = 0;
            } else {
                mo25668a(q0Var, this.f13465q, this.f13466r, i, i2);
            }
        }
    }

    /* renamed from: g */
    public void mo25660g() {
        C5309q0 q0Var = new C5309q0(0, 0);
        this.f13448B = q0Var;
        if (this.f13440d == UnitDisplayType.SQUARE) {
            ImageView imageView = this.f13457i;
            if (imageView != null) {
                imageView.getLayoutParams().width = this.f13447A.f14037a;
                this.f13457i.getLayoutParams().height = this.f13447A.f14037a;
            }
            C5309q0 q0Var2 = this.f13448B;
            int i = this.f13465q;
            int i2 = this.f13466r;
            int i3 = this.f13447A.f14037a;
            mo25668a(q0Var2, i, i2, i3, i3);
            return;
        }
        int i4 = this.f13465q;
        int i5 = this.f13466r;
        C5309q0 q0Var3 = this.f13447A;
        mo25668a(q0Var, i4, i5, q0Var3.f14037a, q0Var3.f14038b);
        ImageView imageView2 = this.f13457i;
        if (imageView2 != null) {
            imageView2.getLayoutParams().width = this.f13448B.f14037a;
            this.f13457i.getLayoutParams().height = this.f13448B.f14038b;
        }
    }
}
