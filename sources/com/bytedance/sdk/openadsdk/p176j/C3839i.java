package com.bytedance.sdk.openadsdk.p176j;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Vibrator;

/* renamed from: com.bytedance.sdk.openadsdk.j.i */
/* compiled from: SensorHub */
public class C3839i {

    /* renamed from: a */
    private static SensorManager f9885a;

    /* renamed from: a */
    private static int m12532a(int i) {
        if (i == 0 || i == 1 || i == 2 || i == 3) {
            return i;
        }
        return 2;
    }

    /* renamed from: b */
    private static SensorManager m12536b(Context context) {
        if (f9885a == null) {
            synchronized (C3839i.class) {
                if (f9885a == null) {
                    f9885a = (SensorManager) context.getSystemService("sensor");
                }
            }
        }
        return f9885a;
    }

    /* renamed from: a */
    public static void m12535a(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener != null && context != null) {
            try {
                SensorManager b = m12536b(context);
                b.registerListener(sensorEventListener, b.getDefaultSensor(1), m12532a(i));
            } catch (Throwable th) {
                C3826f.m12457a("SensorHub", "startListenAccelerometer error", th);
            }
        }
    }

    /* renamed from: b */
    public static void m12537b(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener != null && context != null) {
            try {
                SensorManager b = m12536b(context);
                b.registerListener(sensorEventListener, b.getDefaultSensor(4), m12532a(i));
            } catch (Throwable th) {
                C3826f.m12457a("SensorHub", "startListenGyroscope error", th);
            }
        }
    }

    /* renamed from: a */
    public static void m12534a(Context context, SensorEventListener sensorEventListener) {
        if (sensorEventListener != null && context != null) {
            try {
                m12536b(context).unregisterListener(sensorEventListener);
            } catch (Throwable th) {
                C3826f.m12457a("SensorHub", "stopListen error", th);
            }
        }
    }

    /* renamed from: a */
    public static void m12533a(Context context) {
        if (context != null) {
            ((Vibrator) context.getSystemService("vibrator")).vibrate(300);
        }
    }
}
