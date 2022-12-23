package com.bytedance.sdk.openadsdk.core.p144b;

import android.graphics.Point;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p153i.C3470e;

/* renamed from: com.bytedance.sdk.openadsdk.core.b.c */
/* compiled from: InteractionListener */
public abstract class C3362c implements View.OnClickListener, View.OnTouchListener {

    /* renamed from: B */
    protected static int f8063B = ViewConfiguration.get(C3513m.m10963a()).getScaledTouchSlop();

    /* renamed from: a */
    private static float f8064a = 0.0f;

    /* renamed from: b */
    private static float f8065b = 0.0f;

    /* renamed from: c */
    private static float f8066c = 0.0f;

    /* renamed from: d */
    private static float f8067d = 0.0f;

    /* renamed from: e */
    private static long f8068e = 0;

    /* renamed from: A */
    protected int f8069A = -1;

    /* renamed from: C */
    protected boolean f8070C = true;

    /* renamed from: D */
    protected View f8071D;

    /* renamed from: E */
    public SparseArray<C3363a> f8072E = new SparseArray<>();

    /* renamed from: f */
    private int f8073f = 0;

    /* renamed from: g */
    private int f8074g = 0;

    /* renamed from: s */
    protected float f8075s = -1.0f;

    /* renamed from: t */
    protected float f8076t = -1.0f;

    /* renamed from: u */
    protected float f8077u = -1.0f;

    /* renamed from: v */
    protected float f8078v = -1.0f;

    /* renamed from: w */
    protected long f8079w = -1;

    /* renamed from: x */
    protected long f8080x = -1;

    /* renamed from: y */
    protected int f8081y = -1;

    /* renamed from: z */
    protected int f8082z = -1024;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo18383a(View view, float f, float f2, float f3, float f4, SparseArray<C3363a> sparseArray, boolean z);

    static {
        if (ViewConfiguration.get(C3513m.m10963a()) != null) {
        }
    }

    public void onClick(View view) {
        if (C3470e.m10697a()) {
            mo18383a(view, this.f8075s, this.f8076t, this.f8077u, this.f8078v, this.f8072E, this.f8070C);
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        this.f8082z = motionEvent.getDeviceId();
        this.f8081y = motionEvent.getToolType(0);
        this.f8069A = motionEvent.getSource();
        int actionMasked = motionEvent.getActionMasked();
        int i2 = 3;
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.f8077u = motionEvent.getRawX();
                this.f8078v = motionEvent.getRawY();
                this.f8080x = System.currentTimeMillis();
                if (Math.abs(this.f8077u - ((float) this.f8073f)) >= ((float) C3513m.f8794a) || Math.abs(this.f8078v - ((float) this.f8074g)) >= ((float) C3513m.f8794a)) {
                    this.f8070C = false;
                }
                Point point = new Point((int) this.f8077u, (int) this.f8078v);
                if (view != null && !C3360b.m9976c(view) && m10001a((View) view.getParent(), point)) {
                    return true;
                }
            } else if (actionMasked != 2) {
                i2 = actionMasked != 3 ? -1 : 4;
            } else {
                f8066c += Math.abs(motionEvent.getX() - f8064a);
                f8067d += Math.abs(motionEvent.getY() - f8065b);
                f8064a = motionEvent.getX();
                f8065b = motionEvent.getY();
                if (System.currentTimeMillis() - f8068e > 200) {
                    float f = f8066c;
                    int i3 = f8063B;
                    if (f > ((float) i3) || f8067d > ((float) i3)) {
                        i2 = 1;
                        this.f8077u = motionEvent.getRawX();
                        this.f8078v = motionEvent.getRawY();
                        if (Math.abs(this.f8077u - ((float) this.f8073f)) >= ((float) C3513m.f8794a) || Math.abs(this.f8078v - ((float) this.f8074g)) >= ((float) C3513m.f8794a)) {
                            this.f8070C = false;
                        }
                    }
                }
                i2 = 2;
                this.f8077u = motionEvent.getRawX();
                this.f8078v = motionEvent.getRawY();
                this.f8070C = false;
            }
            i = i2;
        } else {
            this.f8073f = (int) motionEvent.getRawX();
            this.f8074g = (int) motionEvent.getRawY();
            this.f8075s = motionEvent.getRawX();
            this.f8076t = motionEvent.getRawY();
            this.f8079w = System.currentTimeMillis();
            this.f8081y = motionEvent.getToolType(0);
            this.f8082z = motionEvent.getDeviceId();
            this.f8069A = motionEvent.getSource();
            f8068e = System.currentTimeMillis();
            this.f8070C = true;
            this.f8071D = view;
            i = 0;
        }
        this.f8072E.put(motionEvent.getActionMasked(), new C3363a(i, (double) motionEvent.getSize(), (double) motionEvent.getPressure(), System.currentTimeMillis()));
        return false;
    }

    /* renamed from: a */
    private boolean m10001a(View view, Point point) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            while (i < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i);
                if (C3360b.m9976c(childAt)) {
                    int[] iArr = new int[2];
                    childAt.getLocationOnScreen(iArr);
                    if (!view.isShown() || point.x < iArr[0] || point.x > iArr[0] + childAt.getWidth() || point.y < iArr[1] || point.y > iArr[1] + childAt.getHeight()) {
                        return false;
                    }
                    return true;
                } else if (m10001a(childAt, point)) {
                    return true;
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.b.c$a */
    /* compiled from: InteractionListener */
    public static class C3363a {

        /* renamed from: a */
        public int f8083a = -1;

        /* renamed from: b */
        public double f8084b = -1.0d;

        /* renamed from: c */
        public double f8085c = -1.0d;

        /* renamed from: d */
        public long f8086d = -1;

        public C3363a(int i, double d, double d2, long j) {
            this.f8083a = i;
            this.f8084b = d;
            this.f8085c = d2;
            this.f8086d = j;
        }
    }
}
