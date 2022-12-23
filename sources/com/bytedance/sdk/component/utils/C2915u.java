package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;

/* renamed from: com.bytedance.sdk.component.utils.u */
/* compiled from: ShakeUtils */
public class C2915u implements SensorEventListener {

    /* renamed from: a */
    private long f6527a = 2000;

    /* renamed from: b */
    private volatile long f6528b;

    /* renamed from: c */
    private float f6529c;

    /* renamed from: d */
    private float f6530d;

    /* renamed from: e */
    private float f6531e;

    /* renamed from: f */
    private boolean f6532f = false;

    /* renamed from: g */
    private volatile long f6533g;

    /* renamed from: h */
    private float f6534h = 13.0f;

    /* renamed from: i */
    private float f6535i = 50.0f;

    /* renamed from: j */
    private boolean f6536j;

    /* renamed from: k */
    private int f6537k = 0;

    /* renamed from: l */
    private SensorManager f6538l = null;

    /* renamed from: m */
    private C2916a f6539m = null;

    /* renamed from: com.bytedance.sdk.component.utils.u$a */
    /* compiled from: ShakeUtils */
    public interface C2916a {
        /* renamed from: a */
        void mo17335a(int i);
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public C2915u(Context context) {
        this.f6538l = (SensorManager) context.getSystemService("sensor");
    }

    /* renamed from: a */
    public void mo17822a(C2916a aVar) {
        this.f6539m = aVar;
    }

    /* renamed from: a */
    public void mo17820a() {
        SensorManager sensorManager = this.f6538l;
        if (sensorManager != null && !this.f6536j) {
            try {
                this.f6532f = false;
                sensorManager.registerListener(this, sensorManager.getDefaultSensor(1), 3);
                if (Build.VERSION.SDK_INT > 18) {
                    this.f6538l.registerListener(this, this.f6538l.getDefaultSensor(15), 1);
                }
                this.f6536j = true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public void mo17823b() {
        SensorManager sensorManager = this.f6538l;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
            this.f6536j = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ba, code lost:
        if (r6 <= r12) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00da, code lost:
        if (java.lang.Math.sqrt((java.lang.Math.pow((double) r2, 2.0d) + java.lang.Math.pow((double) r4, 2.0d)) + java.lang.Math.pow((double) r6, 2.0d)) > ((double) r11.f6534h)) goto L_0x00bc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSensorChanged(android.hardware.SensorEvent r12) {
        /*
            r11 = this;
            android.hardware.Sensor r0 = r12.sensor
            int r0 = r0.getType()
            float[] r12 = r12.values
            r1 = 0
            r2 = r12[r1]
            float r2 = java.lang.Math.abs(r2)
            r3 = 1
            r4 = r12[r3]
            float r4 = java.lang.Math.abs(r4)
            r5 = 2
            r6 = r12[r5]
            float r6 = java.lang.Math.abs(r6)
            if (r0 == r3) goto L_0x0098
            r2 = 15
            if (r0 == r2) goto L_0x0025
            goto L_0x00ea
        L_0x0025:
            r0 = r12[r1]
            float r0 = java.lang.Math.abs(r0)
            r1 = r12[r3]
            float r1 = java.lang.Math.abs(r1)
            r12 = r12[r5]
            float r12 = java.lang.Math.abs(r12)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0045
            int r4 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0045
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x0045
            return
        L_0x0045:
            boolean r2 = r11.f6532f
            if (r2 != 0) goto L_0x0053
            r11.f6532f = r3
            r11.f6529c = r0
            r11.f6530d = r1
            r11.f6531e = r12
            goto L_0x00ea
        L_0x0053:
            float r2 = r11.f6529c
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            r2 = 1127481344(0x43340000, float:180.0)
            float r0 = r0 * r2
            float r3 = r11.f6530d
            float r1 = r1 - r3
            float r1 = java.lang.Math.abs(r1)
            float r1 = r1 * r2
            float r3 = r11.f6531e
            float r12 = r12 - r3
            float r12 = java.lang.Math.abs(r12)
            float r12 = r12 * r2
            float r2 = r11.f6535i
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x007b
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x007b
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 <= 0) goto L_0x00ea
        L_0x007b:
            com.bytedance.sdk.component.utils.u$a r12 = r11.f6539m
            if (r12 == 0) goto L_0x00ea
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r11.f6533g
            long r0 = r0 - r2
            long r2 = r11.f6527a
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 <= 0) goto L_0x00ea
            com.bytedance.sdk.component.utils.u$a r12 = r11.f6539m
            r12.mo17335a(r5)
            long r0 = java.lang.System.currentTimeMillis()
            r11.f6533g = r0
            goto L_0x00ea
        L_0x0098:
            com.bytedance.sdk.component.utils.u$a r12 = r11.f6539m
            if (r12 == 0) goto L_0x00ea
            long r7 = java.lang.System.currentTimeMillis()
            long r9 = r11.f6528b
            long r7 = r7 - r9
            long r9 = r11.f6527a
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 > 0) goto L_0x00aa
            goto L_0x00ea
        L_0x00aa:
            int r12 = r11.f6537k
            if (r12 == r3) goto L_0x00be
            float r12 = r11.f6534h
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x00bc
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x00bc
            int r12 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r12 <= 0) goto L_0x00dd
        L_0x00bc:
            r1 = r3
            goto L_0x00dd
        L_0x00be:
            double r7 = (double) r2
            r9 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r7 = java.lang.Math.pow(r7, r9)
            double r4 = (double) r4
            double r4 = java.lang.Math.pow(r4, r9)
            double r7 = r7 + r4
            double r4 = (double) r6
            double r4 = java.lang.Math.pow(r4, r9)
            double r7 = r7 + r4
            double r4 = java.lang.Math.sqrt(r7)
            float r12 = r11.f6534h
            double r6 = (double) r12
            int r12 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r12 <= 0) goto L_0x00dd
            goto L_0x00bc
        L_0x00dd:
            if (r1 == 0) goto L_0x00ea
            com.bytedance.sdk.component.utils.u$a r12 = r11.f6539m
            r12.mo17335a(r3)
            long r0 = java.lang.System.currentTimeMillis()
            r11.f6528b = r0
        L_0x00ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.utils.C2915u.onSensorChanged(android.hardware.SensorEvent):void");
    }

    /* renamed from: a */
    public void mo17821a(float f) {
        this.f6534h = f;
    }

    /* renamed from: b */
    public void mo17824b(float f) {
        this.f6535i = f;
    }
}
