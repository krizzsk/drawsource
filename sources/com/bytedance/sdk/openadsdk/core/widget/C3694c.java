package com.bytedance.sdk.openadsdk.core.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.openadsdk.core.C3513m;

/* renamed from: com.bytedance.sdk.openadsdk.core.widget.c */
/* compiled from: TTCustomShadowBackground */
public class C3694c extends Drawable {

    /* renamed from: a */
    private int f9554a;

    /* renamed from: b */
    private int f9555b;

    /* renamed from: c */
    private int[] f9556c;

    /* renamed from: d */
    private float[] f9557d;

    /* renamed from: e */
    private LinearGradient f9558e;

    /* renamed from: f */
    private int f9559f;

    /* renamed from: g */
    private int f9560g;

    /* renamed from: h */
    private int f9561h;

    /* renamed from: i */
    private int f9562i;

    /* renamed from: j */
    private RectF f9563j;

    /* renamed from: k */
    private Paint f9564k;

    public int getOpacity() {
        return -3;
    }

    public C3694c(int i, int[] iArr, float[] fArr, int i2, LinearGradient linearGradient, int i3, int i4, int i5, int i6) {
        this.f9554a = i;
        this.f9556c = iArr;
        this.f9557d = fArr;
        this.f9555b = i2;
        this.f9558e = linearGradient;
        this.f9559f = i3;
        this.f9560g = i4;
        this.f9561h = i5;
        this.f9562i = i6;
    }

    public void draw(Canvas canvas) {
        if (this.f9563j == null) {
            Rect bounds = getBounds();
            this.f9563j = new RectF((float) ((bounds.left + this.f9560g) - this.f9561h), (float) ((bounds.top + this.f9560g) - this.f9562i), (float) ((bounds.right - this.f9560g) - this.f9561h), (float) ((bounds.bottom - this.f9560g) - this.f9562i));
        }
        if (this.f9564k == null) {
            m12055a();
        }
        RectF rectF = this.f9563j;
        int i = this.f9559f;
        canvas.drawRoundRect(rectF, (float) i, (float) i, this.f9564k);
    }

    public void setAlpha(int i) {
        Paint paint = this.f9564k;
        if (paint != null) {
            paint.setAlpha(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Paint paint = this.f9564k;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
    }

    /* renamed from: a */
    private void m12055a() {
        int[] iArr;
        Paint paint = new Paint();
        this.f9564k = paint;
        boolean z = true;
        paint.setAntiAlias(true);
        this.f9564k.setShadowLayer((float) this.f9560g, (float) this.f9561h, (float) this.f9562i, this.f9555b);
        if (this.f9563j == null || (iArr = this.f9556c) == null || iArr.length <= 1) {
            this.f9564k.setColor(this.f9554a);
            return;
        }
        float[] fArr = this.f9557d;
        if (fArr == null || fArr.length <= 0 || fArr.length != iArr.length) {
            z = false;
        }
        Paint paint2 = this.f9564k;
        LinearGradient linearGradient = this.f9558e;
        if (linearGradient == null) {
            linearGradient = new LinearGradient(this.f9563j.left, 0.0f, this.f9563j.right, 0.0f, this.f9556c, z ? this.f9557d : null, Shader.TileMode.CLAMP);
        }
        paint2.setShader(linearGradient);
    }

    /* renamed from: a */
    public static void m12056a(View view, C3695a aVar) {
        if (view != null && aVar != null) {
            view.setLayerType(1, (Paint) null);
            ViewCompat.setBackground(view, aVar.mo20469a());
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.c$a */
    /* compiled from: TTCustomShadowBackground */
    public static class C3695a {

        /* renamed from: a */
        private int f9565a;

        /* renamed from: b */
        private int f9566b;

        /* renamed from: c */
        private int[] f9567c;

        /* renamed from: d */
        private float[] f9568d;

        /* renamed from: e */
        private LinearGradient f9569e;

        /* renamed from: f */
        private int f9570f;

        /* renamed from: g */
        private int f9571g;

        /* renamed from: h */
        private int f9572h;

        /* renamed from: i */
        private int f9573i;

        public C3695a() {
            this.f9572h = 0;
            this.f9573i = 0;
            this.f9565a = C2914t.m8164k(C3513m.m10963a(), "tt_ssxinmian8");
            this.f9566b = C2914t.m8164k(C3513m.m10963a(), "tt_ssxinxian3");
            this.f9570f = 10;
            this.f9571g = 16;
            this.f9572h = 0;
            this.f9573i = 0;
        }

        /* renamed from: a */
        public C3695a mo20467a(int i) {
            this.f9565a = i;
            return this;
        }

        /* renamed from: b */
        public C3695a mo20470b(int i) {
            this.f9566b = i;
            return this;
        }

        /* renamed from: a */
        public C3695a mo20468a(int[] iArr) {
            this.f9567c = iArr;
            return this;
        }

        /* renamed from: c */
        public C3695a mo20471c(int i) {
            this.f9570f = i;
            return this;
        }

        /* renamed from: d */
        public C3695a mo20472d(int i) {
            this.f9572h = i;
            return this;
        }

        /* renamed from: e */
        public C3695a mo20473e(int i) {
            this.f9573i = i;
            return this;
        }

        /* renamed from: a */
        public C3694c mo20469a() {
            return new C3694c(this.f9565a, this.f9567c, this.f9568d, this.f9566b, this.f9569e, this.f9570f, this.f9571g, this.f9572h, this.f9573i);
        }
    }
}
