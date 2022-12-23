package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.internal.view.SupportMenu;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2617g;
import com.bytedance.sdk.component.adexpress.p089a.p090a.C2529a;
import com.bytedance.sdk.component.adexpress.p094c.C2572b;
import com.bytedance.sdk.component.utils.C2914t;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.view.a */
/* compiled from: AnimationWrapper */
public class C2607a {

    /* renamed from: a */
    Paint f5546a;

    /* renamed from: b */
    Path f5547b = new Path();

    /* renamed from: c */
    private int f5548c;

    /* renamed from: d */
    private int f5549d;

    public C2607a() {
        Paint paint = new Paint();
        this.f5546a = paint;
        paint.setAntiAlias(true);
    }

    /* renamed from: a */
    public void mo16830a(Canvas canvas, C2608b bVar, View view) {
        int i;
        int i2;
        Canvas canvas2 = canvas;
        View view2 = view;
        if (bVar.getRippleValue() != 0.0f) {
            if (C2529a.m6339a().mo16550c() != null) {
                float[] fArr = null;
                try {
                    fArr = C2617g.m6918b((String) view2.getTag(C2914t.m8158e(C2529a.m6339a().mo16550c().mo16558b(), "tt_id_ripple_bg")));
                } catch (Exception unused) {
                }
                if (fArr != null) {
                    this.f5546a.setColor(C2572b.m6623a(fArr[3] * (1.0f - bVar.getRippleValue()), fArr[0] / 256.0f, fArr[1] / 256.0f, fArr[2] / 256.0f));
                }
            }
            ((ViewGroup) view.getParent()).setClipChildren(true);
            int i3 = this.f5548c;
            int i4 = this.f5549d;
            canvas2.drawCircle((float) i3, (float) i4, ((float) (Math.min(i3, i4) * 2)) * bVar.getRippleValue(), this.f5546a);
        }
        if (bVar.getShineValue() != 0.0f) {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).setClipChildren(true);
            }
            if (view.getParent().getParent() != null) {
                ((ViewGroup) view.getParent().getParent()).setClipChildren(true);
            }
            this.f5547b.reset();
            try {
                i2 = ((Integer) view2.getTag(C2914t.m8158e(view.getContext(), "tt_id_shine_width"))).intValue();
            } catch (Exception unused2) {
                i2 = 0;
            }
            if (i2 >= 0) {
                int a = (int) C2572b.m6622a(view.getContext(), (float) i2);
                Path path = this.f5547b;
                float shineValue = ((float) ((this.f5548c * 2) + a + (this.f5549d * 2))) * bVar.getShineValue();
                int i5 = this.f5549d;
                path.moveTo((shineValue - ((float) ((i5 * 2) + a))) + ((float) (i5 * 2)), 0.0f);
                Path path2 = this.f5547b;
                float shineValue2 = ((float) ((this.f5548c * 2) + a + (this.f5549d * 2))) * bVar.getShineValue();
                int i6 = this.f5549d;
                float f = (float) a;
                path2.lineTo((shineValue2 - ((float) ((i6 * 2) + a))) + f + ((float) (i6 * 2)), 0.0f);
                Path path3 = this.f5547b;
                float shineValue3 = ((float) ((this.f5548c * 2) + a + (this.f5549d * 2))) * bVar.getShineValue();
                int i7 = this.f5549d;
                path3.lineTo((shineValue3 - ((float) ((i7 * 2) + a))) + f, (float) (i7 * 2));
                Path path4 = this.f5547b;
                float shineValue4 = ((float) ((this.f5548c * 2) + a + (this.f5549d * 2))) * bVar.getShineValue();
                int i8 = this.f5549d;
                path4.lineTo(shineValue4 - ((float) ((i8 * 2) + a)), (float) (i8 * 2));
                this.f5547b.close();
                float shineValue5 = ((float) ((this.f5548c * 2) + a + (this.f5549d * 2))) * bVar.getShineValue();
                int i9 = this.f5549d;
                float f2 = ((float) i9) + (shineValue5 - ((float) ((i9 * 2) + a)));
                float shineValue6 = ((float) ((this.f5548c * 2) + a + (i9 * 2))) * bVar.getShineValue();
                int i10 = this.f5549d;
                this.f5546a.setShader(new LinearGradient(f2, 0.0f, ((float) (a / 2)) + (shineValue6 - ((float) ((i10 * 2) + a))) + ((float) i10), (float) i10, Color.parseColor("#10ffffff"), Color.parseColor("#50ffffff"), Shader.TileMode.MIRROR));
                canvas2.drawPath(this.f5547b, this.f5546a);
            }
        }
        if (bVar.getMarqueeValue() != 0.0f) {
            try {
                i = ((Integer) view2.getTag(C2914t.m8158e(view.getContext(), "tt_id_width"))).intValue();
            } catch (Exception unused3) {
                i = 0;
            }
            if (i >= 0) {
                this.f5547b.reset();
                this.f5547b.moveTo(0.0f, 0.0f);
                this.f5547b.lineTo((float) (this.f5548c * 2), 0.0f);
                this.f5547b.lineTo((float) (this.f5548c * 2), (float) (this.f5549d * 2));
                this.f5547b.lineTo(0.0f, (float) (this.f5549d * 2));
                this.f5547b.lineTo(0.0f, 0.0f);
                this.f5546a.setShader(new LinearGradient(0.0f, 0.0f, (float) (this.f5548c * 2), (float) (this.f5549d * 2), new int[]{(int) (bVar.getMarqueeValue() * -65536.0f), (int) ((1.0f - bVar.getMarqueeValue()) * -65536.0f)}, (float[]) null, Shader.TileMode.CLAMP));
                this.f5546a.setColor(SupportMenu.CATEGORY_MASK);
                this.f5546a.setStyle(Paint.Style.STROKE);
                this.f5546a.setStrokeWidth((float) i);
                canvas2.drawPath(this.f5547b, this.f5546a);
            }
        }
    }

    /* renamed from: a */
    public void mo16831a(View view, int i, int i2) {
        String str;
        this.f5548c = i / 2;
        this.f5549d = i2 / 2;
        try {
            str = (String) view.getTag(C2914t.m8158e(view.getContext(), "tt_id_direction"));
        } catch (Exception unused) {
            str = "";
        }
        if ("right".equals(str)) {
            view.setPivotX((float) (this.f5548c * 2));
            view.setPivotY((float) this.f5549d);
        } else if ("left".equals(str)) {
            view.setPivotX(0.0f);
            view.setPivotY((float) this.f5549d);
        } else {
            view.setPivotX((float) this.f5548c);
            view.setPivotY((float) this.f5549d);
        }
    }
}
