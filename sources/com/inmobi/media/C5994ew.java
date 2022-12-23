package com.inmobi.media;

import android.graphics.Canvas;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import com.inmobi.media.C6000ey;
import java.io.File;
import java.io.IOException;

/* renamed from: com.inmobi.media.ew */
/* compiled from: AnimatedDrawable */
public final class C5994ew implements C6000ey {

    /* renamed from: a */
    AnimatedImageDrawable f15195a;

    /* renamed from: b */
    private C6000ey.C6001a f15196b;

    /* renamed from: a */
    public final void mo35127a(boolean z) {
    }

    /* renamed from: e */
    public final void mo35131e() {
    }

    public C5994ew(String str) throws IOException {
        this.f15195a = (AnimatedImageDrawable) ImageDecoder.decodeDrawable(ImageDecoder.createSource(new File(str)));
    }

    /* renamed from: a */
    public final void mo35124a() {
        this.f15195a.registerAnimationCallback(new Animatable2.AnimationCallback() {
            public final void onAnimationStart(Drawable drawable) {
                super.onAnimationStart(drawable);
            }

            public final void onAnimationEnd(Drawable drawable) {
                super.onAnimationEnd(drawable);
                C5994ew.this.f15195a.start();
            }
        });
        this.f15195a.start();
    }

    /* renamed from: b */
    public final int mo35128b() {
        return this.f15195a.getIntrinsicWidth();
    }

    /* renamed from: c */
    public final int mo35129c() {
        return this.f15195a.getIntrinsicHeight();
    }

    /* renamed from: a */
    public final void mo35125a(Canvas canvas, float f, float f2) {
        canvas.translate(f, f2);
        this.f15195a.draw(canvas);
    }

    /* renamed from: d */
    public final boolean mo35130d() {
        return this.f15195a.isRunning();
    }

    /* renamed from: a */
    public final void mo35126a(C6000ey.C6001a aVar) {
        this.f15196b = aVar;
    }
}
