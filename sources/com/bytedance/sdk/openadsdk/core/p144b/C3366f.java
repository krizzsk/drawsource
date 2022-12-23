package com.bytedance.sdk.openadsdk.core.p144b;

import android.util.SparseArray;
import android.view.ViewConfiguration;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p144b.C3362c;

/* renamed from: com.bytedance.sdk.openadsdk.core.b.f */
/* compiled from: TouchInfoHelper */
public class C3366f {

    /* renamed from: j */
    public static int f8087j = ViewConfiguration.get(C3513m.m10963a()).getScaledTouchSlop();

    /* renamed from: m */
    private static float f8088m = 0.0f;

    /* renamed from: n */
    private static float f8089n = 0.0f;

    /* renamed from: o */
    private static float f8090o = 0.0f;

    /* renamed from: p */
    private static float f8091p = 0.0f;

    /* renamed from: q */
    private static long f8092q = 0;

    /* renamed from: a */
    public float f8093a = -1.0f;

    /* renamed from: b */
    public float f8094b = -1.0f;

    /* renamed from: c */
    public float f8095c = -1.0f;

    /* renamed from: d */
    public float f8096d = -1.0f;

    /* renamed from: e */
    public long f8097e = -1;

    /* renamed from: f */
    public long f8098f = -1;

    /* renamed from: g */
    public int f8099g = -1;

    /* renamed from: h */
    public int f8100h = -1024;

    /* renamed from: i */
    public int f8101i = -1;

    /* renamed from: k */
    public boolean f8102k = true;

    /* renamed from: l */
    public SparseArray<C3362c.C3363a> f8103l = new SparseArray<>();

    /* renamed from: r */
    private int f8104r = 0;

    /* renamed from: s */
    private int f8105s = 0;

    static {
        if (ViewConfiguration.get(C3513m.m10963a()) != null) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006f, code lost:
        if (f8091p <= ((float) r2)) goto L_0x0072;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19326a(android.view.MotionEvent r13) {
        /*
            r12 = this;
            int r0 = r13.getDeviceId()
            r12.f8100h = r0
            r0 = 0
            int r1 = r13.getToolType(r0)
            r12.f8099g = r1
            int r1 = r13.getSource()
            r12.f8101i = r1
            int r1 = r13.getActionMasked()
            r2 = 3
            r3 = 1
            if (r1 == 0) goto L_0x00dd
            if (r1 == r3) goto L_0x00a5
            r4 = 2
            if (r1 == r4) goto L_0x0028
            if (r1 == r2) goto L_0x0026
            r0 = -1
        L_0x0023:
            r5 = r0
            goto L_0x0119
        L_0x0026:
            r0 = 4
            goto L_0x0023
        L_0x0028:
            float r1 = f8090o
            float r2 = r13.getX()
            float r5 = f8088m
            float r2 = r2 - r5
            float r2 = java.lang.Math.abs(r2)
            float r1 = r1 + r2
            f8090o = r1
            float r1 = f8091p
            float r2 = r13.getY()
            float r5 = f8089n
            float r2 = r2 - r5
            float r2 = java.lang.Math.abs(r2)
            float r1 = r1 + r2
            f8091p = r1
            float r1 = r13.getX()
            f8088m = r1
            float r1 = r13.getY()
            f8089n = r1
            long r1 = java.lang.System.currentTimeMillis()
            long r5 = f8092q
            long r1 = r1 - r5
            r5 = 200(0xc8, double:9.9E-322)
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x0072
            float r1 = f8090o
            int r2 = f8087j
            float r5 = (float) r2
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 > 0) goto L_0x0073
            float r1 = f8091p
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0072
            goto L_0x0073
        L_0x0072:
            r3 = r4
        L_0x0073:
            float r1 = r13.getRawX()
            r12.f8095c = r1
            float r1 = r13.getRawY()
            r12.f8096d = r1
            float r1 = r12.f8095c
            int r2 = r12.f8104r
            float r2 = (float) r2
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            int r2 = com.bytedance.sdk.openadsdk.core.C3513m.f8794a
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x00a1
            float r1 = r12.f8096d
            int r2 = r12.f8105s
            float r2 = (float) r2
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            int r2 = com.bytedance.sdk.openadsdk.core.C3513m.f8794a
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x00a3
        L_0x00a1:
            r12.f8102k = r0
        L_0x00a3:
            r5 = r3
            goto L_0x0119
        L_0x00a5:
            float r1 = r13.getRawX()
            r12.f8095c = r1
            float r1 = r13.getRawY()
            r12.f8096d = r1
            long r3 = java.lang.System.currentTimeMillis()
            r12.f8098f = r3
            float r1 = r12.f8095c
            int r3 = r12.f8104r
            float r3 = (float) r3
            float r1 = r1 - r3
            float r1 = java.lang.Math.abs(r1)
            int r3 = com.bytedance.sdk.openadsdk.core.C3513m.f8794a
            float r3 = (float) r3
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x00d9
            float r1 = r12.f8096d
            int r3 = r12.f8105s
            float r3 = (float) r3
            float r1 = r1 - r3
            float r1 = java.lang.Math.abs(r1)
            int r3 = com.bytedance.sdk.openadsdk.core.C3513m.f8794a
            float r3 = (float) r3
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L_0x00db
        L_0x00d9:
            r12.f8102k = r0
        L_0x00db:
            r5 = r2
            goto L_0x0119
        L_0x00dd:
            float r1 = r13.getRawX()
            int r1 = (int) r1
            r12.f8104r = r1
            float r1 = r13.getRawY()
            int r1 = (int) r1
            r12.f8105s = r1
            float r1 = r13.getRawX()
            r12.f8093a = r1
            float r1 = r13.getRawY()
            r12.f8094b = r1
            long r1 = java.lang.System.currentTimeMillis()
            r12.f8097e = r1
            int r1 = r13.getToolType(r0)
            r12.f8099g = r1
            int r1 = r13.getDeviceId()
            r12.f8100h = r1
            int r1 = r13.getSource()
            r12.f8101i = r1
            long r1 = java.lang.System.currentTimeMillis()
            f8092q = r1
            r12.f8102k = r3
            goto L_0x0023
        L_0x0119:
            android.util.SparseArray<com.bytedance.sdk.openadsdk.core.b.c$a> r0 = r12.f8103l
            int r1 = r13.getActionMasked()
            com.bytedance.sdk.openadsdk.core.b.c$a r2 = new com.bytedance.sdk.openadsdk.core.b.c$a
            float r3 = r13.getSize()
            double r6 = (double) r3
            float r13 = r13.getPressure()
            double r8 = (double) r13
            long r10 = java.lang.System.currentTimeMillis()
            r4 = r2
            r4.<init>(r5, r6, r8, r10)
            r0.put(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p144b.C3366f.mo19326a(android.view.MotionEvent):void");
    }
}
