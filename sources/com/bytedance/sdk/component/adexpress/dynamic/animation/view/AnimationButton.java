package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.TextView;

public class AnimationButton extends TextView implements C2608b {

    /* renamed from: a */
    C2607a f5542a = new C2607a();

    /* renamed from: b */
    private float f5543b;

    /* renamed from: c */
    private float f5544c;

    /* renamed from: d */
    private float f5545d;

    public float getShineValue() {
        return this.f5544c;
    }

    public void setShineValue(float f) {
        this.f5544c = f;
        postInvalidate();
    }

    public float getRippleValue() {
        return this.f5543b;
    }

    public void setRippleValue(float f) {
        this.f5543b = f;
        postInvalidate();
    }

    public float getMarqueeValue() {
        return this.f5545d;
    }

    public void setMarqueeValue(float f) {
        this.f5545d = f;
        postInvalidate();
    }

    public AnimationButton(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f5542a.mo16830a(canvas, (C2608b) this, (View) this);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f5542a.mo16831a((View) this, i, i2);
    }
}
