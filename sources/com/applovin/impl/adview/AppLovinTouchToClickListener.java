package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.impl.sdk.utils.C2049g;

public class AppLovinTouchToClickListener implements View.OnTouchListener {

    /* renamed from: a */
    private final long f1659a;

    /* renamed from: b */
    private final int f1660b;

    /* renamed from: c */
    private final int f1661c;

    /* renamed from: d */
    private final ClickRecognitionState f1662d;

    /* renamed from: e */
    private long f1663e;

    /* renamed from: f */
    private PointF f1664f;

    /* renamed from: g */
    private boolean f1665g;

    /* renamed from: h */
    private final Context f1666h;

    /* renamed from: i */
    private final OnClickListener f1667i;

    public enum ClickRecognitionState {
        DISABLED,
        ACTION_DOWN,
        ACTION_POINTER_UP,
        ACTION_UP
    }

    public interface OnClickListener {
        void onClick(View view, PointF pointF);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.applovin.impl.sdk.c.b, com.applovin.impl.sdk.c.b<java.lang.Integer>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppLovinTouchToClickListener(com.applovin.impl.sdk.C1969m r3, com.applovin.impl.sdk.p051c.C1867b<java.lang.Integer> r4, android.content.Context r5, com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener r6) {
        /*
            r2 = this;
            r2.<init>()
            com.applovin.impl.sdk.c.b<java.lang.Long> r0 = com.applovin.impl.sdk.p051c.C1867b.f3110aK
            java.lang.Object r0 = r3.mo14534a(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r2.f1659a = r0
            com.applovin.impl.sdk.c.b<java.lang.Integer> r0 = com.applovin.impl.sdk.p051c.C1867b.f3111aL
            java.lang.Object r0 = r3.mo14534a(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2.f1660b = r0
            com.applovin.impl.sdk.c.b<java.lang.Integer> r0 = com.applovin.impl.sdk.p051c.C1867b.f3113aN
            java.lang.Object r0 = r3.mo14534a(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r0 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(r5, r0)
            r2.f1661c = r0
            java.lang.Object r3 = r3.mo14534a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            com.applovin.impl.adview.AppLovinTouchToClickListener$ClickRecognitionState[] r4 = com.applovin.impl.adview.AppLovinTouchToClickListener.ClickRecognitionState.values()
            r3 = r4[r3]
            r2.f1662d = r3
            r2.f1666h = r5
            r2.f1667i = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.AppLovinTouchToClickListener.<init>(com.applovin.impl.sdk.m, com.applovin.impl.sdk.c.b, android.content.Context, com.applovin.impl.adview.AppLovinTouchToClickListener$OnClickListener):void");
    }

    /* renamed from: a */
    private float m2519a(float f) {
        return f / this.f1666h.getResources().getDisplayMetrics().density;
    }

    /* renamed from: a */
    private float m2520a(PointF pointF, PointF pointF2) {
        float f = pointF.x - pointF2.x;
        float f2 = pointF.y - pointF2.y;
        return m2519a((float) Math.sqrt((double) ((f * f) + (f2 * f2))));
    }

    /* renamed from: a */
    private void m2521a(View view, MotionEvent motionEvent) {
        this.f1667i.onClick(view, new PointF(motionEvent.getRawX(), motionEvent.getRawY()));
        this.f1665g = true;
    }

    /* renamed from: a */
    private boolean m2522a(MotionEvent motionEvent) {
        if (this.f1661c <= 0) {
            return true;
        }
        Point a = C2049g.m4937a(this.f1666h);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int i = this.f1661c;
        return rawX >= ((float) i) && rawY >= ((float) i) && rawX <= ((float) (a.x - this.f1661c)) && rawY <= ((float) (a.y - this.f1661c));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        if (r2 >= r4) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005b, code lost:
        if (r0 >= ((float) r2)) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0068, code lost:
        if (m2522a(r10) != false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        if (r8.f1662d != com.applovin.impl.adview.AppLovinTouchToClickListener.ClickRecognitionState.ACTION_POINTER_UP) goto L_0x0086;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            int r0 = r10.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L_0x005e
            if (r0 == r1) goto L_0x0019
            r2 = 6
            if (r0 == r2) goto L_0x000e
            goto L_0x0086
        L_0x000e:
            boolean r0 = r8.f1665g
            if (r0 != 0) goto L_0x0086
            com.applovin.impl.adview.AppLovinTouchToClickListener$ClickRecognitionState r0 = r8.f1662d
            com.applovin.impl.adview.AppLovinTouchToClickListener$ClickRecognitionState r2 = com.applovin.impl.adview.AppLovinTouchToClickListener.ClickRecognitionState.ACTION_POINTER_UP
            if (r0 != r2) goto L_0x0086
            goto L_0x006a
        L_0x0019:
            boolean r0 = r8.f1665g
            if (r0 != 0) goto L_0x0024
            com.applovin.impl.adview.AppLovinTouchToClickListener$ClickRecognitionState r0 = r8.f1662d
            com.applovin.impl.adview.AppLovinTouchToClickListener$ClickRecognitionState r2 = com.applovin.impl.adview.AppLovinTouchToClickListener.ClickRecognitionState.ACTION_UP
            if (r0 != r2) goto L_0x0024
            goto L_0x006a
        L_0x0024:
            com.applovin.impl.adview.AppLovinTouchToClickListener$ClickRecognitionState r0 = r8.f1662d
            com.applovin.impl.adview.AppLovinTouchToClickListener$ClickRecognitionState r2 = com.applovin.impl.adview.AppLovinTouchToClickListener.ClickRecognitionState.DISABLED
            if (r0 != r2) goto L_0x0086
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r8.f1663e
            long r2 = r2 - r4
            android.graphics.PointF r0 = r8.f1664f
            android.graphics.PointF r4 = new android.graphics.PointF
            float r5 = r10.getX()
            float r6 = r10.getY()
            r4.<init>(r5, r6)
            float r0 = r8.m2520a((android.graphics.PointF) r0, (android.graphics.PointF) r4)
            boolean r4 = r8.f1665g
            if (r4 != 0) goto L_0x0086
            long r4 = r8.f1659a
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x0054
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x0086
        L_0x0054:
            int r2 = r8.f1660b
            if (r2 < 0) goto L_0x006a
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0086
            goto L_0x006a
        L_0x005e:
            com.applovin.impl.adview.AppLovinTouchToClickListener$ClickRecognitionState r0 = r8.f1662d
            com.applovin.impl.adview.AppLovinTouchToClickListener$ClickRecognitionState r2 = com.applovin.impl.adview.AppLovinTouchToClickListener.ClickRecognitionState.ACTION_DOWN
            if (r0 != r2) goto L_0x006e
            boolean r0 = r8.m2522a((android.view.MotionEvent) r10)
            if (r0 == 0) goto L_0x0086
        L_0x006a:
            r8.m2521a((android.view.View) r9, (android.view.MotionEvent) r10)
            goto L_0x0086
        L_0x006e:
            long r2 = android.os.SystemClock.elapsedRealtime()
            r8.f1663e = r2
            android.graphics.PointF r9 = new android.graphics.PointF
            float r0 = r10.getX()
            float r10 = r10.getY()
            r9.<init>(r0, r10)
            r8.f1664f = r9
            r9 = 0
            r8.f1665g = r9
        L_0x0086:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.AppLovinTouchToClickListener.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
