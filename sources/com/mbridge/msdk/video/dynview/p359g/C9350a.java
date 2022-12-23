package com.mbridge.msdk.video.dynview.p359g;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;

/* renamed from: com.mbridge.msdk.video.dynview.g.a */
/* compiled from: BackgroundDrawable */
public final class C9350a extends ShapeDrawable {

    /* renamed from: a */
    private int f22961a;

    /* renamed from: b */
    private float f22962b;

    /* renamed from: c */
    private float f22963c;

    /* renamed from: d */
    private int f22964d;

    /* renamed from: e */
    private int f22965e;

    /* renamed from: f */
    private Bitmap f22966f;

    /* renamed from: g */
    private Bitmap f22967g;

    /* renamed from: h */
    private boolean f22968h;

    /* renamed from: i */
    private Paint f22969i;

    /* renamed from: com.mbridge.msdk.video.dynview.g.a$b */
    /* compiled from: BackgroundDrawable */
    public interface C9353b {
        /* renamed from: a */
        C9353b mo62856a(Bitmap bitmap);

        /* renamed from: a */
        C9353b mo62857a(boolean z);

        /* renamed from: b */
        C9353b mo62859b(float f);

        /* renamed from: b */
        C9353b mo62860b(Bitmap bitmap);
    }

    public final int getOpacity() {
        return -3;
    }

    private C9350a(C9352a aVar) {
        super(aVar.f22970a);
        this.f22968h = false;
        this.f22966f = aVar.f22971b;
        this.f22967g = aVar.f22972c;
        this.f22968h = aVar.f22973d;
        this.f22961a = aVar.f22974e;
        this.f22964d = aVar.f22975f;
        this.f22965e = aVar.f22976g;
        this.f22962b = aVar.f22977h;
        this.f22963c = aVar.f22978i;
        Paint paint = new Paint();
        this.f22969i = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f22969i.setAntiAlias(true);
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f22961a == 1) {
            float f = this.f22963c / 2.0f;
            Path path = new Path();
            path.moveTo(0.0f, 0.0f);
            path.lineTo(0.0f, (((float) this.f22964d) + f) - ((float) this.f22965e));
            path.lineTo(this.f22962b, (f - ((float) this.f22964d)) - ((float) this.f22965e));
            path.lineTo(this.f22962b, 0.0f);
            if (this.f22968h) {
                try {
                    m26657a(canvas, path);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                Bitmap bitmap = this.f22966f;
                if (bitmap != null && !bitmap.isRecycled()) {
                    try {
                        m26658a(canvas, path, this.f22966f);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
            Path path2 = new Path();
            path2.moveTo(0.0f, ((float) this.f22964d) + f + ((float) this.f22965e));
            path2.lineTo(0.0f, this.f22963c);
            path2.lineTo(this.f22962b, this.f22963c);
            path2.lineTo(this.f22962b, (f - ((float) this.f22964d)) + ((float) this.f22965e));
            if (this.f22968h) {
                try {
                    m26657a(canvas, path2);
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            } else {
                Bitmap bitmap2 = this.f22967g;
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    try {
                        m26658a(canvas, path2, this.f22967g);
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                }
            }
        } else {
            float f2 = this.f22962b / 2.0f;
            Path path3 = new Path();
            path3.moveTo(0.0f, 0.0f);
            path3.lineTo(0.0f, this.f22963c);
            path3.lineTo((f2 - ((float) this.f22964d)) - ((float) this.f22965e), this.f22963c);
            path3.lineTo((((float) this.f22964d) + f2) - ((float) this.f22965e), 0.0f);
            if (this.f22968h) {
                try {
                    m26657a(canvas, path3);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            } else {
                Bitmap bitmap3 = this.f22966f;
                if (bitmap3 != null && !bitmap3.isRecycled()) {
                    try {
                        m26658a(canvas, path3, this.f22966f);
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                }
            }
            Path path4 = new Path();
            path4.moveTo(((float) this.f22964d) + f2 + ((float) this.f22965e), 0.0f);
            path4.lineTo(this.f22962b, 0.0f);
            path4.lineTo(this.f22962b, this.f22963c);
            path4.lineTo((f2 - ((float) this.f22964d)) + ((float) this.f22965e), this.f22963c);
            if (this.f22968h) {
                try {
                    m26657a(canvas, path4);
                } catch (Exception e7) {
                    e7.printStackTrace();
                }
            } else {
                Bitmap bitmap4 = this.f22967g;
                if (bitmap4 != null && !bitmap4.isRecycled()) {
                    try {
                        m26658a(canvas, path4, this.f22967g);
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m26658a(Canvas canvas, Path path, Bitmap bitmap) {
        this.f22969i.setShader(new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        canvas.drawPath(path, this.f22969i);
    }

    /* renamed from: a */
    private void m26657a(Canvas canvas, Path path) {
        this.f22969i.setColor(Color.parseColor("#40EAEAEA"));
        canvas.drawPath(path, this.f22969i);
    }

    /* renamed from: a */
    public static C9352a m26656a() {
        return new C9352a();
    }

    /* renamed from: com.mbridge.msdk.video.dynview.g.a$a */
    /* compiled from: BackgroundDrawable */
    public static class C9352a implements C9353b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public RectShape f22970a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Bitmap f22971b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public Bitmap f22972c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f22973d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f22974e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f22975f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f22976g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public float f22977h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public float f22978i;

        private C9352a() {
            this.f22975f = 100;
            this.f22976g = 10;
            this.f22970a = new RectShape();
        }

        /* renamed from: a */
        public final C9353b mo62856a(Bitmap bitmap) {
            this.f22971b = bitmap;
            return this;
        }

        /* renamed from: b */
        public final C9353b mo62860b(Bitmap bitmap) {
            this.f22972c = bitmap;
            return this;
        }

        /* renamed from: a */
        public final C9353b mo62857a(boolean z) {
            this.f22973d = z;
            return this;
        }

        /* renamed from: a */
        public final C9353b mo62855a(int i) {
            this.f22974e = i;
            return this;
        }

        /* renamed from: a */
        public final C9353b mo62854a(float f) {
            this.f22977h = f;
            return this;
        }

        /* renamed from: b */
        public final C9353b mo62859b(float f) {
            this.f22978i = f;
            return this;
        }

        /* renamed from: a */
        public final C9350a mo62858a() {
            return new C9350a(this);
        }
    }
}
