package com.tapjoy.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.tapjoy.internal.iy */
public final class C11637iy extends RelativeLayout {

    /* renamed from: a */
    private C11596ib f28042a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C11640a f28043b;

    /* renamed from: c */
    private C11692z f28044c = C11692z.UNSPECIFIED;

    /* renamed from: d */
    private int f28045d = 0;

    /* renamed from: e */
    private int f28046e = 0;

    /* renamed from: f */
    private C11616ik f28047f = null;

    /* renamed from: g */
    private ArrayList<WeakReference<C11624iq>> f28048g = null;

    /* renamed from: h */
    private ArrayList<WeakReference<C11624iq>> f28049h = null;

    /* renamed from: com.tapjoy.internal.iy$a */
    public interface C11640a {
        /* renamed from: a */
        void mo70094a();

        /* renamed from: a */
        void mo70095a(C11614ij ijVar);
    }

    public C11637iy(Context context, C11596ib ibVar, C11640a aVar) {
        super(context);
        this.f28042a = ibVar;
        this.f28043b = aVar;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28043b.mo70094a();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r18, int r19) {
        /*
            r17 = this;
            r0 = r17
            int r1 = android.view.View.MeasureSpec.getSize(r18)
            int r2 = android.view.View.MeasureSpec.getSize(r19)
            if (r1 < r2) goto L_0x001a
            com.tapjoy.internal.z r3 = r0.f28044c
            com.tapjoy.internal.z r4 = com.tapjoy.internal.C11692z.LANDSCAPE
            if (r3 == r4) goto L_0x0027
            com.tapjoy.internal.z r3 = com.tapjoy.internal.C11692z.LANDSCAPE
            r0.f28044c = r3
            r17.m31884a()
            goto L_0x0027
        L_0x001a:
            com.tapjoy.internal.z r3 = r0.f28044c
            com.tapjoy.internal.z r4 = com.tapjoy.internal.C11692z.PORTRAIT
            if (r3 == r4) goto L_0x0027
            com.tapjoy.internal.z r3 = com.tapjoy.internal.C11692z.PORTRAIT
            r0.f28044c = r3
            r17.m31884a()
        L_0x0027:
            int r3 = r0.f28045d
            if (r3 != r1) goto L_0x002f
            int r3 = r0.f28046e
            if (r3 == r2) goto L_0x0119
        L_0x002f:
            r0.f28045d = r1
            r0.f28046e = r2
            float r1 = (float) r1
            float r2 = (float) r2
            com.tapjoy.internal.ik r3 = r0.f28047f
            r4 = 0
            r5 = 1073741824(0x40000000, float:2.0)
            if (r3 == 0) goto L_0x0086
            android.graphics.PointF r3 = r3.f27949b
            if (r3 == 0) goto L_0x0086
            com.tapjoy.internal.ik r3 = r0.f28047f
            android.graphics.PointF r3 = r3.f27949b
            float r3 = r3.y
            float r3 = r3 * r1
            com.tapjoy.internal.ik r6 = r0.f28047f
            android.graphics.PointF r6 = r6.f27949b
            float r6 = r6.x
            float r3 = r3 / r6
            float r3 = r3 / r2
            r6 = 1065353216(0x3f800000, float:1.0)
            int r7 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x006b
            com.tapjoy.internal.ik r3 = r0.f28047f
            android.graphics.PointF r3 = r3.f27949b
            float r3 = r3.y
            float r3 = r3 * r1
            com.tapjoy.internal.ik r6 = r0.f28047f
            android.graphics.PointF r6 = r6.f27949b
            float r6 = r6.x
            float r3 = r3 / r6
            float r2 = r2 - r3
            float r2 = r2 / r5
            r16 = r3
            r3 = r2
            r2 = r16
            goto L_0x0087
        L_0x006b:
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x0086
            com.tapjoy.internal.ik r3 = r0.f28047f
            android.graphics.PointF r3 = r3.f27949b
            float r3 = r3.x
            float r3 = r3 * r2
            com.tapjoy.internal.ik r6 = r0.f28047f
            android.graphics.PointF r6 = r6.f27949b
            float r6 = r6.y
            float r3 = r3 / r6
            float r1 = r1 - r3
            float r1 = r1 / r5
            r16 = r4
            r4 = r1
            r1 = r3
            r3 = r16
            goto L_0x0087
        L_0x0086:
            r3 = r4
        L_0x0087:
            java.lang.Iterable r6 = com.tapjoy.internal.C11256ab.m30848a(r17)
            java.util.Iterator r6 = r6.iterator()
        L_0x008f:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0119
            java.lang.Object r7 = r6.next()
            android.view.View r7 = (android.view.View) r7
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r8 = (android.widget.RelativeLayout.LayoutParams) r8
            java.lang.Object r7 = r7.getTag()
            com.tapjoy.internal.ij r7 = (com.tapjoy.internal.C11614ij) r7
            com.tapjoy.internal.il r9 = r7.f27934a
            float r9 = r9.mo70196a(r1, r2)
            com.tapjoy.internal.il r10 = r7.f27935b
            float r10 = r10.mo70196a(r1, r2)
            com.tapjoy.internal.il r11 = r7.f27936c
            float r11 = r11.mo70196a(r1, r2)
            com.tapjoy.internal.il r12 = r7.f27937d
            float r12 = r12.mo70196a(r1, r2)
            int r13 = r7.f27938e
            int r7 = r7.f27939f
            r14 = 14
            if (r13 != r14) goto L_0x00cd
            float r13 = r1 - r11
            float r13 = r13 / r5
            float r9 = r9 + r13
            r13 = 9
        L_0x00cd:
            r14 = 15
            r15 = 10
            if (r7 != r14) goto L_0x00d8
            float r7 = r2 - r12
            float r7 = r7 / r5
            float r10 = r10 + r7
            r7 = r15
        L_0x00d8:
            r14 = -1
            r8.addRule(r13, r14)
            r8.addRule(r7, r14)
            int r11 = java.lang.Math.round(r11)
            r8.width = r11
            int r11 = java.lang.Math.round(r12)
            r8.height = r11
            r11 = 9
            if (r13 != r11) goto L_0x00f7
            float r9 = r9 + r4
            int r9 = java.lang.Math.round(r9)
            r8.leftMargin = r9
            goto L_0x0102
        L_0x00f7:
            r11 = 11
            if (r13 != r11) goto L_0x0102
            float r9 = r9 + r4
            int r9 = java.lang.Math.round(r9)
            r8.rightMargin = r9
        L_0x0102:
            if (r7 != r15) goto L_0x010c
            float r10 = r10 + r3
            int r7 = java.lang.Math.round(r10)
            r8.topMargin = r7
            goto L_0x008f
        L_0x010c:
            r9 = 12
            if (r7 != r9) goto L_0x008f
            float r10 = r10 + r3
            int r7 = java.lang.Math.round(r10)
            r8.bottomMargin = r7
            goto L_0x008f
        L_0x0119:
            super.onMeasure(r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11637iy.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            ArrayList<WeakReference<C11624iq>> arrayList = this.f28049h;
            if (arrayList != null) {
                Iterator<WeakReference<C11624iq>> it = arrayList.iterator();
                while (it.hasNext()) {
                    C11624iq iqVar = (C11624iq) it.next().get();
                    if (iqVar != null) {
                        iqVar.setVisibility(4);
                        iqVar.mo70207b();
                    }
                }
            }
            ArrayList<WeakReference<C11624iq>> arrayList2 = this.f28048g;
            if (arrayList2 != null) {
                Iterator<WeakReference<C11624iq>> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    C11624iq iqVar2 = (C11624iq) it2.next().get();
                    if (iqVar2 != null) {
                        iqVar2.setVisibility(0);
                        iqVar2.mo70205a();
                    }
                }
                return;
            }
            return;
        }
        ArrayList<WeakReference<C11624iq>> arrayList3 = this.f28048g;
        if (arrayList3 != null) {
            Iterator<WeakReference<C11624iq>> it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                C11624iq iqVar3 = (C11624iq) it3.next().get();
                if (iqVar3 != null) {
                    iqVar3.mo70207b();
                }
            }
        }
        ArrayList<WeakReference<C11624iq>> arrayList4 = this.f28049h;
        if (arrayList4 != null) {
            Iterator<WeakReference<C11624iq>> it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                C11624iq iqVar4 = (C11624iq) it4.next().get();
                if (iqVar4 != null) {
                    iqVar4.mo70207b();
                }
            }
        }
    }

    /* renamed from: a */
    private void m31884a() {
        Iterator<C11616ik> it = this.f28042a.f27878a.iterator();
        C11616ik ikVar = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C11616ik next = it.next();
            if (next.f27948a == this.f28044c) {
                ikVar = next;
                break;
            } else if (next.f27948a == C11692z.UNSPECIFIED) {
                ikVar = next;
            }
        }
        removeAllViews();
        ArrayList<WeakReference<C11624iq>> arrayList = this.f28048g;
        if (arrayList != null) {
            Iterator<WeakReference<C11624iq>> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C11624iq iqVar = (C11624iq) it2.next().get();
                if (iqVar != null) {
                    iqVar.mo70208c();
                }
            }
            this.f28048g.clear();
        }
        ArrayList<WeakReference<C11624iq>> arrayList2 = this.f28049h;
        if (arrayList2 != null) {
            Iterator<WeakReference<C11624iq>> it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                C11624iq iqVar2 = (C11624iq) it3.next().get();
                if (iqVar2 != null) {
                    iqVar2.mo70208c();
                }
            }
            this.f28049h.clear();
        }
        if (ikVar != null) {
            m31885a(ikVar);
        }
    }

    /* renamed from: a */
    private void m31885a(C11616ik ikVar) {
        C11624iq iqVar;
        C11624iq iqVar2;
        Bitmap bitmap;
        C11616ik ikVar2 = ikVar;
        this.f28047f = ikVar2;
        Context context = getContext();
        Iterator<C11614ij> it = ikVar2.f27950c.iterator();
        while (it.hasNext()) {
            C11614ij next = it.next();
            RelativeLayout relativeLayout = new RelativeLayout(context);
            if (next.f27945l.f27926c != null) {
                C11624iq iqVar3 = new C11624iq(context);
                iqVar3.setScaleType(ImageView.ScaleType.FIT_XY);
                iqVar3.mo70206a(next.f27945l.f27927d, next.f27945l.f27926c);
                if (this.f28048g == null) {
                    this.f28048g = new ArrayList<>();
                }
                this.f28048g.add(new WeakReference(iqVar3));
                iqVar = iqVar3;
            } else {
                iqVar = null;
            }
            if (next.f27946m == null || next.f27946m.f27926c == null) {
                iqVar2 = null;
            } else {
                C11624iq iqVar4 = new C11624iq(context);
                iqVar4.setScaleType(ImageView.ScaleType.FIT_XY);
                iqVar4.mo70206a(next.f27946m.f27927d, next.f27946m.f27926c);
                if (this.f28049h == null) {
                    this.f28049h = new ArrayList<>();
                }
                this.f28049h.add(new WeakReference(iqVar4));
                iqVar2 = iqVar4;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            Bitmap bitmap2 = next.f27945l.f27925b;
            if (next.f27946m != null) {
                bitmap = next.f27946m.f27925b;
            } else {
                bitmap = null;
            }
            final BitmapDrawable bitmapDrawable = bitmap2 != null ? new BitmapDrawable((Resources) null, bitmap2) : null;
            final BitmapDrawable bitmapDrawable2 = bitmap != null ? new BitmapDrawable((Resources) null, bitmap) : null;
            if (bitmapDrawable != null) {
                C11255aa.m30847a(relativeLayout, bitmapDrawable);
            }
            if (iqVar != null) {
                relativeLayout.addView(iqVar, layoutParams2);
                iqVar.mo70205a();
            }
            if (iqVar2 != null) {
                relativeLayout.addView(iqVar2, layoutParams2);
                iqVar2.setVisibility(4);
            }
            final C11624iq iqVar5 = iqVar2;
            final C11624iq iqVar6 = iqVar;
            relativeLayout.setOnTouchListener(new View.OnTouchListener() {
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    C11624iq iqVar;
                    if (motionEvent.getAction() == 0) {
                        if (!(iqVar5 == null && bitmapDrawable2 == null)) {
                            C11624iq iqVar2 = iqVar6;
                            if (iqVar2 != null) {
                                iqVar2.mo70207b();
                                iqVar6.setVisibility(4);
                            }
                            C11255aa.m30847a(view, (Drawable) null);
                        }
                        BitmapDrawable bitmapDrawable = bitmapDrawable2;
                        if (bitmapDrawable != null) {
                            C11255aa.m30847a(view, bitmapDrawable);
                        } else {
                            C11624iq iqVar3 = iqVar5;
                            if (iqVar3 != null) {
                                iqVar3.setVisibility(0);
                                iqVar5.mo70205a();
                            }
                        }
                    } else {
                        boolean z = true;
                        if (motionEvent.getAction() == 1) {
                            float x = motionEvent.getX();
                            float y = motionEvent.getY();
                            if (x >= 0.0f && x < ((float) view.getWidth()) && y >= 0.0f && y < ((float) view.getHeight())) {
                                z = false;
                            }
                            if (z) {
                                BitmapDrawable bitmapDrawable2 = bitmapDrawable;
                                if (bitmapDrawable2 != null) {
                                    C11255aa.m30847a(view, bitmapDrawable2);
                                } else if (bitmapDrawable2 != null) {
                                    C11255aa.m30847a(view, (Drawable) null);
                                }
                            }
                            C11624iq iqVar4 = iqVar5;
                            if (iqVar4 != null) {
                                iqVar4.mo70207b();
                                iqVar5.setVisibility(4);
                            }
                            if (!((iqVar5 == null && bitmapDrawable2 == null) || (iqVar = iqVar6) == null || !z)) {
                                iqVar.setVisibility(0);
                                iqVar6.mo70205a();
                            }
                        }
                    }
                    return false;
                }
            });
            final RelativeLayout relativeLayout2 = relativeLayout;
            final C11614ij ijVar = next;
            relativeLayout.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    C11624iq iqVar = iqVar5;
                    if (iqVar != null) {
                        iqVar.mo70207b();
                        relativeLayout2.removeView(iqVar5);
                    }
                    C11624iq iqVar2 = iqVar6;
                    if (iqVar2 != null) {
                        iqVar2.mo70207b();
                        relativeLayout2.removeView(iqVar6);
                    }
                    C11637iy.this.f28043b.mo70095a(ijVar);
                }
            });
            relativeLayout.setTag(next);
            addView(relativeLayout, layoutParams);
        }
    }
}
