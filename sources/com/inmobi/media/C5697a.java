package com.inmobi.media;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: com.inmobi.media.a */
/* compiled from: AnimationController */
final class C5697a {

    /* renamed from: com.inmobi.media.a$a */
    /* compiled from: AnimationController */
    static class C5698a extends Animation {

        /* renamed from: a */
        private final float f14304a = 0.0f;

        /* renamed from: b */
        private final float f14305b = 90.0f;

        /* renamed from: c */
        private final float f14306c;

        /* renamed from: d */
        private final float f14307d;

        /* renamed from: e */
        private final float f14308e;

        /* renamed from: f */
        private final boolean f14309f;

        /* renamed from: g */
        private Camera f14310g;

        C5698a(float f, float f2) {
            this.f14306c = f;
            this.f14307d = f2;
            this.f14308e = 0.0f;
            this.f14309f = true;
        }

        public final void initialize(int i, int i2, int i3, int i4) {
            super.initialize(i, i2, i3, i4);
            this.f14310g = new Camera();
        }

        /* access modifiers changed from: protected */
        public final void applyTransformation(float f, Transformation transformation) {
            float f2 = this.f14304a;
            float f3 = f2 + ((this.f14305b - f2) * f);
            float f4 = this.f14306c;
            float f5 = this.f14307d;
            Camera camera = this.f14310g;
            Matrix matrix = transformation.getMatrix();
            camera.save();
            if (this.f14309f) {
                camera.translate(0.0f, 0.0f, this.f14308e * f);
            } else {
                camera.translate(0.0f, 0.0f, this.f14308e * (1.0f - f));
            }
            camera.rotateX(f3);
            camera.getMatrix(matrix);
            camera.restore();
            matrix.preTranslate(-f4, -f5);
            matrix.postTranslate(f4, f5);
        }
    }

    /* renamed from: com.inmobi.media.a$b */
    /* compiled from: AnimationController */
    static class C5699b extends Animation {

        /* renamed from: a */
        private final float f14311a = 0.0f;

        /* renamed from: b */
        private final float f14312b = 90.0f;

        /* renamed from: c */
        private final float f14313c;

        /* renamed from: d */
        private final float f14314d;

        /* renamed from: e */
        private final float f14315e;

        /* renamed from: f */
        private final boolean f14316f;

        /* renamed from: g */
        private Camera f14317g;

        C5699b(float f, float f2) {
            this.f14313c = f;
            this.f14314d = f2;
            this.f14315e = 0.0f;
            this.f14316f = true;
        }

        public final void initialize(int i, int i2, int i3, int i4) {
            super.initialize(i, i2, i3, i4);
            this.f14317g = new Camera();
        }

        /* access modifiers changed from: protected */
        public final void applyTransformation(float f, Transformation transformation) {
            float f2 = this.f14311a;
            float f3 = f2 + ((this.f14312b - f2) * f);
            float f4 = this.f14313c;
            float f5 = this.f14314d;
            Camera camera = this.f14317g;
            Matrix matrix = transformation.getMatrix();
            camera.save();
            if (this.f14316f) {
                camera.translate(0.0f, 0.0f, this.f14315e * f);
            } else {
                camera.translate(0.0f, 0.0f, this.f14315e * (1.0f - f));
            }
            camera.rotateY(f3);
            camera.getMatrix(matrix);
            camera.restore();
            matrix.preTranslate(-f4, -f5);
            matrix.postTranslate(f4, f5);
        }
    }
}
