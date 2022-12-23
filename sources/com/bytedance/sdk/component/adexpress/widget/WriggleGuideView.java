package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.sdk.component.utils.C2914t;
import java.util.ArrayList;
import java.util.List;

public class WriggleGuideView extends View {

    /* renamed from: a */
    private int f6022a;

    /* renamed from: b */
    private int f6023b;

    /* renamed from: c */
    private Bitmap f6024c;

    /* renamed from: d */
    private Bitmap f6025d;

    /* renamed from: e */
    private Paint f6026e;

    /* renamed from: f */
    private int f6027f;

    /* renamed from: g */
    private final List<C2709b> f6028g;

    /* renamed from: h */
    private boolean f6029h;

    /* renamed from: i */
    private boolean f6030i;

    /* renamed from: j */
    private C2708a f6031j;

    /* renamed from: com.bytedance.sdk.component.adexpress.widget.WriggleGuideView$a */
    public interface C2708a {
        /* renamed from: a */
        void mo17236a();
    }

    public WriggleGuideView(Context context) {
        this(context, (AttributeSet) null);
    }

    public WriggleGuideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WriggleGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6022a = 0;
        this.f6023b = 0;
        this.f6027f = 0;
        this.f6028g = new ArrayList();
        this.f6029h = true;
        this.f6030i = false;
        setLayerType(1, (Paint) null);
        this.f6026e = new Paint();
        this.f6026e = new Paint(1);
        this.f6028g.clear();
    }

    /* renamed from: a */
    private Bitmap m7310a(int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(BitmapFactory.decodeResource(getContext().getResources(), C2914t.m8157d(getContext(), "tt_wriggle_union")), (Rect) null, new RectF(0.0f, 0.0f, (float) i, (float) i2), this.f6026e);
        return createBitmap;
    }

    /* renamed from: b */
    private Bitmap m7311b(int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(BitmapFactory.decodeResource(getContext().getResources(), C2914t.m8157d(getContext(), "tt_wriggle_union_white")), (Rect) null, new RectF(0.0f, 0.0f, (float) i, (float) i2), new Paint(1));
        return createBitmap;
    }

    /* renamed from: c */
    private Bitmap m7312c(int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        paint.setColor(-1);
        float f = ((float) this.f6027f) / ((float) this.f6022a);
        if (f >= 0.5f) {
            f = Math.abs(f - 1.0f);
        }
        int i3 = this.f6023b;
        this.f6028g.add(new C2709b((float) (i - this.f6027f), ((float) i2) - ((f * 2.0f) * ((float) i3)), ((float) Math.min(this.f6022a, i3)) / 2.0f));
        for (C2709b next : this.f6028g) {
            canvas.drawCircle(next.f6032a, next.f6033b, next.f6034c, paint);
        }
        return createBitmap;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f6029h) {
            this.f6022a = getWidth();
            int height = getHeight();
            this.f6023b = height;
            this.f6024c = m7310a(this.f6022a, height);
            this.f6025d = m7311b(this.f6022a, this.f6023b);
            this.f6029h = false;
        }
        canvas.drawBitmap(this.f6024c, 0.0f, 0.0f, this.f6026e);
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), (Paint) null, 31);
        canvas.drawBitmap(this.f6025d, 0.0f, 0.0f, this.f6026e);
        this.f6026e.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(m7312c(this.f6022a, this.f6023b), 0.0f, 0.0f, this.f6026e);
        this.f6026e.setXfermode((Xfermode) null);
        canvas.restoreToCount(saveLayer);
        if (this.f6030i) {
            this.f6027f += 2;
            invalidate();
            if (this.f6027f >= this.f6022a) {
                C2708a aVar = this.f6031j;
                if (aVar != null) {
                    aVar.mo17236a();
                }
                this.f6030i = false;
            }
        }
    }

    /* renamed from: a */
    public void mo17383a(C2708a aVar) {
        this.f6031j = aVar;
        this.f6027f = 0;
        this.f6030i = true;
        invalidate();
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.widget.WriggleGuideView$b */
    private static class C2709b {

        /* renamed from: a */
        public float f6032a;

        /* renamed from: b */
        public float f6033b;

        /* renamed from: c */
        public float f6034c;

        C2709b(float f, float f2, float f3) {
            this.f6032a = f;
            this.f6033b = f2;
            this.f6034c = f3;
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f6031j != null) {
            this.f6031j = null;
        }
    }
}
