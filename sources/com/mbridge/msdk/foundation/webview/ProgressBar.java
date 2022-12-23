package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.webview.C8687a;

public class ProgressBar extends View implements C8687a {

    /* renamed from: a */
    Runnable f21286a = new Runnable() {
        public final void run() {
            ProgressBar.this.invalidate();
        }
    };

    /* renamed from: b */
    private Rect f21287b = new Rect();

    /* renamed from: c */
    private float f21288c;

    /* renamed from: d */
    private float f21289d = 0.95f;

    /* renamed from: e */
    private long f21290e;

    /* renamed from: f */
    private float f21291f;

    /* renamed from: g */
    private boolean f21292g;

    /* renamed from: h */
    private float f21293h;

    /* renamed from: i */
    private float f21294i;

    /* renamed from: j */
    private float f21295j;

    /* renamed from: k */
    private long f21296k;

    /* renamed from: l */
    private int f21297l;

    /* renamed from: m */
    private int f21298m;

    /* renamed from: n */
    private int f21299n;

    /* renamed from: o */
    private int f21300o;

    /* renamed from: p */
    private long f21301p = 25;

    /* renamed from: q */
    private Drawable f21302q;

    /* renamed from: r */
    private Drawable f21303r;

    /* renamed from: s */
    private Drawable f21304s;

    /* renamed from: t */
    private Drawable f21305t;

    /* renamed from: u */
    private boolean f21306u = false;

    /* renamed from: v */
    private C8687a.C8688a f21307v;

    /* renamed from: w */
    private Handler f21308w = new Handler(Looper.getMainLooper());

    /* renamed from: x */
    private boolean f21309x;

    /* renamed from: y */
    private boolean f21310y = false;

    public Bitmap getDrawingCache(boolean z) {
        return null;
    }

    public ProgressBar(Context context) {
        super(context);
        setWillNotDraw(false);
    }

    public ProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r10.f21309x != false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (r10.f21309x != false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        if (r10.f21309x != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        if (r10.f21309x != false) goto L_0x005b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r11) {
        /*
            r10 = this;
            boolean r0 = r10.f21306u
            r1 = 1
            if (r0 != 0) goto L_0x0007
            r10.f21306u = r1
        L_0x0007:
            long r2 = java.lang.System.currentTimeMillis()
            boolean r0 = r10.f21310y
            if (r0 == 0) goto L_0x0012
            r4 = 0
            goto L_0x0016
        L_0x0012:
            long r4 = r10.f21290e
            long r4 = r2 - r4
        L_0x0016:
            float r0 = (float) r4
            r6 = 1148846080(0x447a0000, float:1000.0)
            float r0 = r0 / r6
            float r0 = java.lang.Math.abs(r0)
            r10.f21291f = r0
            r10.f21290e = r2
            long r2 = r10.f21296k
            long r2 = r2 + r4
            r10.f21296k = r2
            boolean r0 = r10.f21292g
            r4 = 1045220557(0x3e4ccccd, float:0.2)
            r5 = 1028443341(0x3d4ccccd, float:0.05)
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = 1053609165(0x3ecccccd, float:0.4)
            if (r0 != 0) goto L_0x0057
            r8 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0055
            int r0 = r10.f21299n
            if (r0 != r1) goto L_0x0045
            boolean r0 = r10.f21309x
            if (r0 == 0) goto L_0x005c
            goto L_0x005b
        L_0x0045:
            int r0 = r10.f21298m
            if (r0 != r1) goto L_0x0050
            boolean r0 = r10.f21309x
            if (r0 == 0) goto L_0x004e
            goto L_0x005c
        L_0x004e:
            r7 = r4
            goto L_0x005c
        L_0x0050:
            boolean r0 = r10.f21309x
            if (r0 == 0) goto L_0x0055
            goto L_0x004e
        L_0x0055:
            r7 = r5
            goto L_0x005c
        L_0x0057:
            boolean r0 = r10.f21309x
            if (r0 == 0) goto L_0x005c
        L_0x005b:
            r7 = r6
        L_0x005c:
            r10.f21295j = r7
            float r0 = r10.f21294i
            float r1 = r10.f21291f
            float r7 = r7 * r1
            float r0 = r0 + r7
            r10.f21294i = r0
            boolean r1 = r10.f21292g
            if (r1 != 0) goto L_0x0072
            float r1 = r10.f21289d
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0072
            r10.f21294i = r1
        L_0x0072:
            android.graphics.Rect r0 = r10.f21287b
            float r1 = r10.f21294i
            float r2 = r10.f21288c
            float r1 = r1 * r2
            int r1 = (int) r1
            r0.right = r1
            android.os.Handler r0 = r10.f21308w
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            android.os.Handler r0 = r10.f21308w
            java.lang.Runnable r1 = r10.f21286a
            long r2 = r10.f21301p
            r0.postDelayed(r1, r2)
            super.draw(r11)
            float r0 = r10.f21291f
            boolean r1 = r10.f21292g
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x00cf
            float r1 = r10.f21293h
            float r7 = r10.f21288c
            r8 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 * r8
            float r1 = r1 / r7
            float r6 = r6 - r1
            r1 = 1132396544(0x437f0000, float:255.0)
            float r6 = r6 * r1
            int r1 = (int) r6
            if (r1 >= 0) goto L_0x00a6
            r1 = r3
        L_0x00a6:
            float r6 = r10.f21293h
            float r7 = r10.f21288c
            float r7 = r7 * r8
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x00b2
            r10.setVisible(r3)
        L_0x00b2:
            android.graphics.drawable.Drawable r6 = r10.f21303r
            if (r6 == 0) goto L_0x00b9
            r6.setAlpha(r1)
        L_0x00b9:
            android.graphics.drawable.Drawable r6 = r10.f21304s
            if (r6 == 0) goto L_0x00c0
            r6.setAlpha(r1)
        L_0x00c0:
            android.graphics.drawable.Drawable r6 = r10.f21302q
            if (r6 == 0) goto L_0x00c7
            r6.setAlpha(r1)
        L_0x00c7:
            r11.save()
            float r1 = r10.f21293h
            r11.translate(r1, r2)
        L_0x00cf:
            android.graphics.drawable.Drawable r1 = r10.f21303r
            if (r1 == 0) goto L_0x00f6
            android.graphics.drawable.Drawable r1 = r10.f21302q
            if (r1 == 0) goto L_0x00f6
            android.graphics.Rect r1 = r10.f21287b
            int r1 = r1.width()
            float r1 = (float) r1
            android.graphics.drawable.Drawable r6 = r10.f21302q
            int r6 = r6.getIntrinsicWidth()
            float r6 = (float) r6
            float r6 = r6 * r5
            float r1 = r1 - r6
            int r1 = (int) r1
            android.graphics.drawable.Drawable r5 = r10.f21303r
            int r6 = r5.getIntrinsicHeight()
            r5.setBounds(r3, r3, r1, r6)
            android.graphics.drawable.Drawable r1 = r10.f21303r
            r1.draw(r11)
        L_0x00f6:
            boolean r1 = r10.f21292g
            if (r1 == 0) goto L_0x011f
            android.graphics.drawable.Drawable r1 = r10.f21304s
            if (r1 == 0) goto L_0x011f
            android.graphics.drawable.Drawable r5 = r10.f21302q
            if (r5 == 0) goto L_0x011f
            int r1 = r1.getIntrinsicWidth()
            android.graphics.drawable.Drawable r5 = r10.f21304s
            int r6 = r5.getIntrinsicHeight()
            r5.setBounds(r3, r3, r1, r6)
            r11.save()
            int r1 = -r1
            float r1 = (float) r1
            r11.translate(r1, r2)
            android.graphics.drawable.Drawable r1 = r10.f21304s
            r1.draw(r11)
            r11.restore()
        L_0x011f:
            android.graphics.drawable.Drawable r1 = r10.f21302q
            if (r1 == 0) goto L_0x013d
            r11.save()
            android.graphics.Rect r1 = r10.f21287b
            int r1 = r1.width()
            int r3 = r10.getWidth()
            int r1 = r1 - r3
            float r1 = (float) r1
            r11.translate(r1, r2)
            android.graphics.drawable.Drawable r1 = r10.f21302q
            r1.draw(r11)
            r11.restore()
        L_0x013d:
            boolean r1 = r10.f21292g
            if (r1 != 0) goto L_0x0187
            float r1 = r10.f21294i
            float r3 = r10.f21289d
            float r1 = r1 - r3
            float r1 = java.lang.Math.abs(r1)
            r3 = 925353388(0x3727c5ac, float:1.0E-5)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x0187
            android.graphics.drawable.Drawable r1 = r10.f21305t
            if (r1 == 0) goto L_0x0187
            int r3 = r10.f21297l
            float r3 = (float) r3
            float r0 = r0 * r4
            float r4 = r10.f21288c
            float r0 = r0 * r4
            float r3 = r3 + r0
            int r0 = (int) r3
            r10.f21297l = r0
            int r1 = r1.getIntrinsicWidth()
            int r0 = r0 + r1
            android.graphics.Rect r1 = r10.f21287b
            int r1 = r1.width()
            if (r0 < r1) goto L_0x0176
            android.graphics.drawable.Drawable r0 = r10.f21305t
            int r0 = r0.getIntrinsicWidth()
            int r0 = -r0
            r10.f21297l = r0
        L_0x0176:
            r11.save()
            int r0 = r10.f21297l
            float r0 = (float) r0
            r11.translate(r0, r2)
            android.graphics.drawable.Drawable r0 = r10.f21305t
            r0.draw(r11)
            r11.restore()
        L_0x0187:
            boolean r0 = r10.f21292g
            if (r0 == 0) goto L_0x018e
            r11.restore()
        L_0x018e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.webview.ProgressBar.draw(android.graphics.Canvas):void");
    }

    public void onThemeChange() {
        if (this.f21306u) {
            initResource(true);
        }
    }

    public void initResource(boolean z) {
        if (z || (this.f21305t == null && this.f21302q == null && this.f21303r == null && this.f21304s == null)) {
            Drawable drawable = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_highlight", "drawable", C8388a.m23845e().mo56903b()));
            this.f21305t = drawable;
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f21305t.getIntrinsicHeight());
            }
            Drawable drawable2 = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_head", "drawable", C8388a.m23845e().mo56903b()));
            this.f21302q = drawable2;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.f21302q.getIntrinsicHeight());
            }
            this.f21303r = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_tail", "drawable", C8388a.m23845e().mo56903b()));
            this.f21304s = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_end_animation", "drawable", C8388a.m23845e().mo56903b()));
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        Drawable drawable = this.f21305t;
        if (drawable != null) {
            drawable.setBounds(0, 0, (int) (((double) drawable.getIntrinsicWidth()) * 1.5d), getHeight());
        }
        Drawable drawable2 = this.f21302q;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, getWidth(), getHeight());
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public void startEndAnimation() {
        if (!this.f21292g) {
            this.f21292g = true;
            this.f21293h = 0.0f;
        }
    }

    public void setProgress(float f, boolean z) {
        if (z && f >= 1.0f) {
            startEndAnimation();
        }
    }

    public void setVisible(boolean z) {
        if (z) {
            this.f21309x = true;
            this.f21290e = System.currentTimeMillis();
            this.f21291f = 0.0f;
            this.f21296k = 0;
            this.f21292g = false;
            this.f21293h = 0.0f;
            this.f21294i = 0.0f;
            this.f21288c = (float) getMeasuredWidth();
            this.f21310y = false;
            this.f21298m = 0;
            this.f21299n = 0;
            this.f21300o = 0;
            Drawable drawable = this.f21305t;
            if (drawable != null) {
                this.f21297l = -drawable.getIntrinsicWidth();
            } else {
                this.f21297l = 0;
            }
            Drawable drawable2 = this.f21303r;
            if (drawable2 != null) {
                drawable2.setAlpha(255);
            }
            Drawable drawable3 = this.f21304s;
            if (drawable3 != null) {
                drawable3.setAlpha(255);
            }
            Drawable drawable4 = this.f21302q;
            if (drawable4 != null) {
                drawable4.setAlpha(255);
            }
            setVisibility(0);
            invalidate();
            return;
        }
        setVisibility(4);
    }

    public float getProgress() {
        return this.f21294i;
    }

    public void setProgressBarListener(C8687a.C8688a aVar) {
        this.f21307v = aVar;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            C8687a.C8688a aVar = this.f21307v;
            if (aVar != null) {
                aVar.mo58203a(true);
                return;
            }
            return;
        }
        C8687a.C8688a aVar2 = this.f21307v;
        if (aVar2 != null) {
            aVar2.mo58203a(false);
        }
    }

    public void setProgressState(int i) {
        if (i == 5) {
            this.f21298m = 1;
            this.f21299n = 0;
            this.f21300o = 0;
            this.f21296k = 0;
        } else if (i == 6) {
            this.f21299n = 1;
            if (this.f21300o == 1) {
                startEndAnimation();
            }
            this.f21296k = 0;
        } else if (i == 7) {
            startEndAnimation();
        } else if (i == 8) {
            this.f21300o = 1;
            if (this.f21299n == 1) {
                startEndAnimation();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f21288c = (float) getMeasuredWidth();
    }

    public void setPaused(boolean z) {
        this.f21310y = z;
        if (!z) {
            this.f21290e = System.currentTimeMillis();
        }
    }
}
