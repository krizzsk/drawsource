package com.tapjoy.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

/* renamed from: com.tapjoy.internal.ix */
public final class C11636ix extends View {

    /* renamed from: a */
    public boolean f28036a = false;

    /* renamed from: b */
    private Bitmap f28037b = null;

    /* renamed from: c */
    private Rect f28038c = null;

    /* renamed from: d */
    private Rect f28039d = null;

    /* renamed from: e */
    private Rect f28040e = null;

    /* renamed from: f */
    private Rect f28041f = new Rect();

    public C11636ix(Context context) {
        super(context);
    }

    public final void setImageBitmap(Bitmap bitmap) {
        this.f28037b = bitmap;
        int width = bitmap.getWidth();
        int height = this.f28037b.getHeight();
        int i = width / 2;
        this.f28039d = new Rect(0, 0, i, height);
        this.f28038c = new Rect(i, 0, width, height);
        mo70226a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo70226a() {
        if (this.f28036a) {
            this.f28040e = this.f28038c;
        } else {
            this.f28040e = this.f28039d;
        }
    }

    public final void onDraw(Canvas canvas) {
        if (this.f28040e != null && this.f28037b != null) {
            getDrawingRect(this.f28041f);
            canvas.drawBitmap(this.f28037b, this.f28040e, this.f28041f, (Paint) null);
        }
    }
}
