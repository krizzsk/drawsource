package com.inmobi.media;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.core.view.ViewCompat;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* renamed from: com.inmobi.media.ch */
/* compiled from: NativeTimerView */
public class C5865ch extends View {

    /* renamed from: a */
    public long f14795a;

    /* renamed from: b */
    public long f14796b;

    /* renamed from: c */
    public ValueAnimator f14797c;

    /* renamed from: d */
    private Bitmap f14798d;

    /* renamed from: e */
    private Canvas f14799e;

    /* renamed from: f */
    private RectF f14800f;

    /* renamed from: g */
    private RectF f14801g;

    /* renamed from: h */
    private Rect f14802h;

    /* renamed from: i */
    private Paint f14803i;

    /* renamed from: j */
    private Paint f14804j;

    /* renamed from: k */
    private Paint f14805k;

    /* renamed from: l */
    private Paint f14806l;

    /* renamed from: m */
    private Paint f14807m;

    /* renamed from: n */
    private float f14808n;

    /* renamed from: o */
    private C5867b f14809o;

    /* renamed from: com.inmobi.media.ch$b */
    /* compiled from: NativeTimerView */
    public interface C5867b {
        /* renamed from: a */
        void mo34863a();
    }

    public C5865ch(Context context) {
        this(context, (byte) 0);
    }

    private C5865ch(Context context, byte b) {
        this(context, 0);
    }

    private C5865ch(Context context, char c) {
        super(context, (AttributeSet) null, 0);
        this.f14795a = 0;
        Paint paint = new Paint();
        this.f14803i = paint;
        paint.setAntiAlias(true);
        this.f14803i.setColor(-723724);
        Paint paint2 = new Paint();
        this.f14807m = paint2;
        paint2.setAntiAlias(true);
        this.f14807m.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.f14807m.setTextAlign(Paint.Align.CENTER);
        this.f14807m.setAntiAlias(true);
        this.f14802h = new Rect();
        Paint paint3 = new Paint();
        this.f14804j = paint3;
        paint3.setAntiAlias(true);
        this.f14804j.setColor(ViewCompat.MEASURED_STATE_MASK);
        Paint paint4 = new Paint();
        this.f14805k = paint4;
        paint4.setAntiAlias(true);
        this.f14805k.setColor(0);
        this.f14805k.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint5 = new Paint();
        this.f14806l = paint5;
        paint5.setStyle(Paint.Style.STROKE);
        this.f14806l.setAntiAlias(true);
        this.f14806l.setColor(ViewCompat.MEASURED_STATE_MASK);
    }

    public void setTimerEventsListener(C5867b bVar) {
        this.f14809o = bVar;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (!(i == i3 && i2 == i4)) {
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.f14798d = createBitmap;
            createBitmap.eraseColor(0);
            this.f14799e = new Canvas(this.f14798d);
        }
        super.onSizeChanged(i, i2, i3, i4);
        float a = (float) C6215il.m18443a((int) (((float) getWidth()) * 4.0f * 0.007f));
        float a2 = (float) C6215il.m18443a((int) (((float) getWidth()) * 5.0f * 0.007f));
        this.f14800f = new RectF(a2, a2, ((float) getWidth()) - a2, ((float) getHeight()) - a2);
        this.f14801g = new RectF(this.f14800f.left + a, this.f14800f.top + a, this.f14800f.right - a, this.f14800f.bottom - a);
        this.f14806l.setStrokeWidth((float) C6215il.m18443a((int) (((float) getWidth()) * 1.5f * 0.007f)));
        this.f14807m.setTextSize((float) C6215il.m18443a((int) (((float) getWidth()) * 14.0f * 0.007f)));
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.f14799e.drawColor(0, PorterDuff.Mode.CLEAR);
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        int min = Math.min(width, height);
        int a = C6215il.m18443a((int) (((float) getWidth()) * 7.0f * 0.007f));
        float f = (float) width;
        float f2 = (float) height;
        canvas.drawCircle(f, f2, (float) min, this.f14803i);
        canvas.drawCircle(f, f2, (float) (min - a), this.f14806l);
        ValueAnimator valueAnimator = this.f14797c;
        if (valueAnimator != null) {
            int currentPlayTime = (int) (this.f14795a - (valueAnimator.getCurrentPlayTime() / 1000));
            if (((double) ((Float) this.f14797c.getAnimatedValue()).floatValue()) >= 1.0d) {
                currentPlayTime = 0;
            }
            Paint paint = this.f14807m;
            Rect rect = this.f14802h;
            String valueOf = String.valueOf(currentPlayTime);
            paint.getTextBounds(valueOf, 0, valueOf.length(), rect);
            canvas.drawText(valueOf, (float) (getWidth() / 2), ((float) (getHeight() / 2)) + (((paint.descent() - paint.ascent()) / 2.0f) - paint.descent()), paint);
            if (((double) ((Float) this.f14797c.getAnimatedValue()).floatValue()) >= 1.0d) {
                m17482c();
            }
        }
        float f3 = this.f14808n;
        if (f3 > 0.0f) {
            this.f14799e.drawArc(this.f14800f, 270.0f, f3, true, this.f14804j);
            this.f14799e.drawOval(this.f14801g, this.f14805k);
        }
        canvas.drawBitmap(this.f14798d, 0.0f, 0.0f, (Paint) null);
    }

    public void setTimerValue(long j) {
        this.f14795a = j;
    }

    /* renamed from: com.inmobi.media.ch$a */
    /* compiled from: NativeTimerView */
    public static class C5866a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public WeakReference<C5865ch> f14810a;

        public C5866a(C5865ch chVar) {
            this.f14810a = new WeakReference<>(chVar);
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C5865ch chVar = (C5865ch) this.f14810a.get();
            if (chVar != null) {
                int visibility = chVar.getVisibility();
                if (visibility != 4 && visibility != 8) {
                    chVar.mo34855a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                } else if (((double) ((Float) valueAnimator.getAnimatedValue()).floatValue()) >= 1.0d) {
                    chVar.m17482c();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo34854a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f14797c = ofFloat;
        ofFloat.setDuration(TimeUnit.SECONDS.toMillis(this.f14795a));
        this.f14797c.setInterpolator(new LinearInterpolator());
        this.f14797c.addUpdateListener(new C5866a(this));
        this.f14797c.start();
    }

    /* renamed from: b */
    public final void mo34856b() {
        ValueAnimator valueAnimator = this.f14797c;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f14796b = this.f14797c.getCurrentPlayTime();
            this.f14797c.cancel();
        }
    }

    /* renamed from: a */
    public final void mo34855a(float f) {
        this.f14808n = f * 360.0f;
        invalidate();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m17482c() {
        C5867b bVar = this.f14809o;
        if (bVar != null) {
            bVar.mo34863a();
            this.f14797c.cancel();
            this.f14797c = null;
        }
    }
}
