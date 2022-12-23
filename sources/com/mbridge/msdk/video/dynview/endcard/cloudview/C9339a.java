package com.mbridge.msdk.video.dynview.endcard.cloudview;

import android.graphics.Color;
import android.graphics.PointF;
import android.view.View;
import com.mbridge.msdk.video.dynview.endcard.cloudview.p356a.C9340a;

/* renamed from: com.mbridge.msdk.video.dynview.endcard.cloudview.a */
/* compiled from: CTag */
public final class C9339a implements Comparable<C9339a> {

    /* renamed from: a */
    private int f22928a;

    /* renamed from: b */
    private float f22929b;

    /* renamed from: c */
    private float[] f22930c;

    /* renamed from: d */
    private View f22931d;

    /* renamed from: e */
    private PointF f22932e;

    /* renamed from: f */
    private C9340a f22933f;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f22929b > ((C9339a) obj).f22929b ? 1 : -1;
    }

    public C9339a() {
        this(0.0f, 0.0f, 0.0f, 1.0f, 0);
    }

    public C9339a(int i) {
        this(0.0f, 0.0f, 0.0f, 1.0f, i);
    }

    private C9339a(float f, float f2, float f3, float f4, int i) {
        this.f22933f = new C9340a(f, f2, f3);
        this.f22932e = new PointF(0.0f, 0.0f);
        this.f22930c = new float[]{1.0f, 0.5f, 0.5f, 0.5f};
        this.f22929b = f4;
        this.f22928a = i;
    }

    /* renamed from: a */
    public final float mo62812a() {
        return this.f22933f.f22934a;
    }

    /* renamed from: a */
    public final void mo62813a(float f) {
        this.f22933f.f22934a = f;
    }

    /* renamed from: b */
    public final float mo62816b() {
        return this.f22933f.f22935b;
    }

    /* renamed from: b */
    public final void mo62817b(float f) {
        this.f22933f.f22935b = f;
    }

    /* renamed from: c */
    public final float mo62818c() {
        return this.f22933f.f22936c;
    }

    /* renamed from: c */
    public final void mo62819c(float f) {
        this.f22933f.f22936c = f;
    }

    /* renamed from: d */
    public final float mo62821d() {
        return this.f22929b;
    }

    /* renamed from: d */
    public final void mo62822d(float f) {
        this.f22929b = f;
    }

    /* renamed from: e */
    public final View mo62823e() {
        return this.f22931d;
    }

    /* renamed from: a */
    public final void mo62814a(View view) {
        this.f22931d = view;
    }

    /* renamed from: e */
    public final void mo62824e(float f) {
        this.f22930c[0] = f;
    }

    /* renamed from: f */
    public final int mo62825f() {
        return this.f22928a;
    }

    /* renamed from: g */
    public final float mo62827g() {
        return this.f22932e.x;
    }

    /* renamed from: f */
    public final void mo62826f(float f) {
        this.f22932e.x = f;
    }

    /* renamed from: h */
    public final float mo62829h() {
        return this.f22932e.y;
    }

    /* renamed from: g */
    public final void mo62828g(float f) {
        this.f22932e.y = f;
    }

    /* renamed from: a */
    public final void mo62815a(float[] fArr) {
        if (fArr != null) {
            float[] fArr2 = this.f22930c;
            System.arraycopy(fArr, 0, fArr2, fArr2.length - fArr.length, fArr.length);
        }
    }

    /* renamed from: i */
    public final float mo62830i() {
        return this.f22930c[0];
    }

    /* renamed from: j */
    public final int mo62831j() {
        int[] iArr = new int[4];
        for (int i = 0; i < 4; i++) {
            iArr[i] = (int) (this.f22930c[i] * 255.0f);
        }
        return Color.argb(iArr[0], iArr[1], iArr[2], iArr[3]);
    }
}
