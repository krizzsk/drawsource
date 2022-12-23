package com.tapjoy.internal;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: com.tapjoy.internal.iz */
public final class C11641iz extends C11260ad {

    /* renamed from: a */
    private final C11604ie f28060a;

    /* renamed from: b */
    private final C11643ja f28061b;

    /* renamed from: c */
    private C11692z f28062c = null;

    public C11641iz(Context context, C11604ie ieVar, C11643ja jaVar) {
        super(context);
        this.f28060a = ieVar;
        this.f28061b = jaVar;
        addView(jaVar, new ViewGroup.LayoutParams(-1, -1));
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            com.tapjoy.internal.z r0 = com.tapjoy.internal.C11692z.m32068a(r0)
            com.tapjoy.internal.ie r1 = r6.f28060a
            boolean r1 = r1.mo70192a()
            r2 = 1
            r3 = 3
            r4 = 0
            if (r1 == 0) goto L_0x005b
            com.tapjoy.internal.ie r1 = r6.f28060a
            boolean r1 = r1.mo70193b()
            if (r1 == 0) goto L_0x0041
            boolean r1 = r0.mo70318a()
            if (r1 == 0) goto L_0x0024
            com.tapjoy.internal.z r0 = com.tapjoy.internal.C11692z.PORTRAIT
            goto L_0x003d
        L_0x0024:
            boolean r0 = r0.mo70319b()
            if (r0 != 0) goto L_0x003b
            android.content.Context r0 = r6.getContext()
            com.tapjoy.internal.z r0 = com.tapjoy.internal.C11692z.m32069b(r0)
            boolean r0 = r0.mo70318a()
            if (r0 == 0) goto L_0x003b
            com.tapjoy.internal.z r0 = com.tapjoy.internal.C11692z.PORTRAIT
            goto L_0x003d
        L_0x003b:
            com.tapjoy.internal.z r0 = com.tapjoy.internal.C11692z.LANDSCAPE
        L_0x003d:
            r6.setRotationCount(r4)
            goto L_0x0075
        L_0x0041:
            com.tapjoy.internal.z r1 = com.tapjoy.internal.C11692z.PORTRAIT
            boolean r5 = r0.mo70319b()
            if (r5 == 0) goto L_0x0057
            int r0 = r0.mo70320c()
            if (r0 != r3) goto L_0x0053
            r6.setRotationCount(r2)
            goto L_0x0074
        L_0x0053:
            r6.setRotationCount(r3)
            goto L_0x0074
        L_0x0057:
            r6.setRotationCount(r4)
            goto L_0x0074
        L_0x005b:
            com.tapjoy.internal.z r1 = com.tapjoy.internal.C11692z.LANDSCAPE
            boolean r5 = r0.mo70318a()
            if (r5 == 0) goto L_0x0071
            int r0 = r0.mo70320c()
            if (r0 != r3) goto L_0x006d
            r6.setRotationCount(r2)
            goto L_0x0074
        L_0x006d:
            r6.setRotationCount(r2)
            goto L_0x0074
        L_0x0071:
            r6.setRotationCount(r4)
        L_0x0074:
            r0 = r1
        L_0x0075:
            com.tapjoy.internal.z r1 = r6.f28062c
            if (r1 == r0) goto L_0x0084
            r6.f28062c = r0
            com.tapjoy.internal.ja r1 = r6.f28061b
            boolean r0 = r0.mo70319b()
            r1.setLandscape(r0)
        L_0x0084:
            super.onMeasure(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11641iz.onMeasure(int, int):void");
    }
}
