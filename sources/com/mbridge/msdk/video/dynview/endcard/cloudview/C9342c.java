package com.mbridge.msdk.video.dynview.endcard.cloudview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.mbridge.msdk.video.dynview.endcard.cloudview.c */
/* compiled from: TagCloud */
public final class C9342c {

    /* renamed from: c */
    private static final float[] f22937c = {0.886f, 0.725f, 0.188f, 1.0f};

    /* renamed from: d */
    private static final float[] f22938d = {0.3f, 0.3f, 0.3f, 1.0f};

    /* renamed from: a */
    private List<C9339a> f22939a;

    /* renamed from: b */
    private int f22940b;

    /* renamed from: e */
    private float[] f22941e;

    /* renamed from: f */
    private float[] f22942f;

    /* renamed from: g */
    private float f22943g;

    /* renamed from: h */
    private float f22944h;

    /* renamed from: i */
    private float f22945i;

    /* renamed from: j */
    private float f22946j;

    /* renamed from: k */
    private float f22947k;

    /* renamed from: l */
    private float f22948l;

    /* renamed from: m */
    private float f22949m;

    /* renamed from: n */
    private float f22950n;

    /* renamed from: o */
    private float f22951o;

    /* renamed from: p */
    private int f22952p;

    /* renamed from: q */
    private int f22953q;

    /* renamed from: r */
    private boolean f22954r;

    /* renamed from: s */
    private float f22955s;

    /* renamed from: t */
    private float f22956t;

    public C9342c() {
        this(3);
    }

    private C9342c(int i) {
        this(new ArrayList(), i);
    }

    private C9342c(List<C9339a> list, int i) {
        this(list, i, f22937c, f22938d);
    }

    private C9342c(List<C9339a> list, int i, float[] fArr, float[] fArr2) {
        this.f22949m = 0.0f;
        this.f22950n = 0.0f;
        this.f22951o = 0.0f;
        this.f22954r = true;
        this.f22939a = list;
        this.f22940b = i;
        this.f22941e = fArr;
        this.f22942f = fArr2;
    }

    /* renamed from: a */
    public final void mo62837a(boolean z) {
        double d;
        double d2;
        this.f22954r = z;
        try {
            int size = this.f22939a.size();
            for (int i = 1; i < size + 1; i++) {
                if (z) {
                    double d3 = (double) size;
                    d = Math.acos((((((double) i) * 2.0d) - 1.0d) / d3) - 4.0d);
                    d2 = Math.sqrt(d3 * 3.141592653589793d) * d;
                } else {
                    d = Math.random() * 3.141592653589793d;
                    d2 = Math.random() * 6.283185307179586d;
                }
                int i2 = i - 1;
                this.f22939a.get(i2).mo62813a((float) ((int) (((double) this.f22940b) * Math.cos(d2) * Math.sin(d))));
                this.f22939a.get(i2).mo62817b((float) ((int) (((double) this.f22940b) * Math.sin(d2) * Math.sin(d))));
                this.f22939a.get(i2).mo62819c((float) ((int) (((double) this.f22940b) * Math.cos(d))));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        int i3 = 0;
        while (i3 < this.f22939a.size()) {
            try {
                int f = this.f22939a.get(i3).mo62825f();
                this.f22953q = Math.max(this.f22953q, f);
                this.f22952p = Math.min(this.f22952p, f);
                i3++;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        for (C9339a b : this.f22939a) {
            m26624b(b);
        }
        m26627f();
        m26626e();
    }

    /* renamed from: a */
    public final void mo62834a() {
        this.f22939a.clear();
    }

    /* renamed from: b */
    public final List<C9339a> mo62839b() {
        return this.f22939a;
    }

    /* renamed from: a */
    public final C9339a mo62833a(int i) {
        return this.f22939a.get(i);
    }

    /* renamed from: c */
    public final void mo62842c() {
        mo62837a(this.f22954r);
    }

    /* renamed from: d */
    public final void mo62843d() {
        if (Math.abs(this.f22950n) > 0.1f || Math.abs(this.f22951o) > 0.1f) {
            m26627f();
            m26626e();
        }
    }

    /* renamed from: b */
    private void m26624b(C9339a aVar) {
        aVar.mo62815a(m26623a(m26625c(aVar)));
    }

    /* renamed from: c */
    private float m26625c(C9339a aVar) {
        int f = aVar.mo62825f();
        int i = this.f22952p;
        int i2 = this.f22953q;
        if (i == i2) {
            return 1.0f;
        }
        return (((float) f) - ((float) i)) / (((float) i2) - ((float) i));
    }

    /* renamed from: a */
    public final void mo62836a(C9339a aVar) {
        m26624b(aVar);
        double random = Math.random() * 3.141592653589793d;
        double random2 = Math.random() * 6.283185307179586d;
        aVar.mo62813a((float) ((int) (((double) this.f22940b) * Math.cos(random2) * Math.sin(random))));
        aVar.mo62817b((float) ((int) (((double) this.f22940b) * Math.sin(random2) * Math.sin(random))));
        aVar.mo62819c((float) ((int) (((double) this.f22940b) * Math.cos(random))));
        this.f22939a.add(aVar);
        m26626e();
    }

    /* renamed from: e */
    private void m26626e() {
        int i = 0;
        while (i < this.f22939a.size()) {
            try {
                C9339a aVar = this.f22939a.get(i);
                float a = aVar.mo62812a();
                float b = aVar.mo62816b();
                float c = aVar.mo62818c();
                float f = (this.f22944h * b) + ((-this.f22943g) * c);
                float f2 = (b * this.f22943g) + (c * this.f22944h);
                float f3 = (this.f22946j * a) + (this.f22945i * f2);
                float f4 = (a * (-this.f22945i)) + (f2 * this.f22946j);
                float f5 = (this.f22948l * f3) + ((-this.f22947k) * f);
                float f6 = (f3 * this.f22947k) + (f * this.f22948l);
                aVar.mo62813a(f5);
                aVar.mo62817b(f6);
                aVar.mo62819c(f4);
                float f7 = (float) (this.f22940b * 2);
                float f8 = f7 / 1.0f;
                float f9 = f7 + f4;
                float f10 = f8 / f9;
                aVar.mo62826f((float) ((int) (f5 * f10)));
                aVar.mo62828g((float) ((int) (f6 * f10)));
                aVar.mo62822d(f10);
                this.f22955s = Math.max(this.f22955s, f9);
                float min = Math.min(this.f22956t, f9);
                this.f22956t = min;
                aVar.mo62824e(1.0f - ((f9 - min) / (this.f22955s - min)));
                i++;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        Collections.sort(this.f22939a);
    }

    /* renamed from: a */
    private float[] m26623a(float f) {
        float[] fArr = this.f22942f;
        float f2 = 1.0f - f;
        float[] fArr2 = this.f22941e;
        return new float[]{1.0f, (fArr[0] * f) + (fArr2[0] * f2), (fArr[1] * f) + (fArr2[1] * f2), (f * fArr[2]) + (f2 * fArr2[2])};
    }

    /* renamed from: f */
    private void m26627f() {
        this.f22943g = (float) Math.sin(((double) this.f22950n) * 0.017453292519943295d);
        this.f22944h = (float) Math.cos(((double) this.f22950n) * 0.017453292519943295d);
        this.f22945i = (float) Math.sin(((double) this.f22951o) * 0.017453292519943295d);
        this.f22946j = (float) Math.cos(((double) this.f22951o) * 0.017453292519943295d);
        this.f22947k = (float) Math.sin(((double) this.f22949m) * 0.017453292519943295d);
        this.f22948l = (float) Math.cos(((double) this.f22949m) * 0.017453292519943295d);
    }

    /* renamed from: b */
    public final void mo62840b(int i) {
        this.f22940b = i;
    }

    /* renamed from: a */
    public final void mo62838a(float[] fArr) {
        this.f22941e = fArr;
    }

    /* renamed from: b */
    public final void mo62841b(float[] fArr) {
        this.f22942f = fArr;
    }

    /* renamed from: a */
    public final void mo62835a(float f, float f2) {
        this.f22950n = f;
        this.f22951o = f2;
    }
}
