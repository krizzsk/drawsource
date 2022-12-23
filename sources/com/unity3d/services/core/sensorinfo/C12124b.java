package com.unity3d.services.core.sensorinfo;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.properties.C12084a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.unity3d.services.core.sensorinfo.b */
/* compiled from: SensorInfoListener */
public class C12124b implements SensorEventListener {

    /* renamed from: a */
    private static C12124b f29595a;

    /* renamed from: b */
    private static Sensor f29596b;

    /* renamed from: c */
    private static SensorEvent f29597c;

    /* renamed from: a */
    public static boolean m33073a(int i) {
        if (f29595a == null) {
            f29595a = new C12124b();
        }
        SensorManager sensorManager = (SensorManager) C12084a.m32908e().getSystemService("sensor");
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        f29596b = defaultSensor;
        return sensorManager.registerListener(f29595a, defaultSensor, i);
    }

    /* renamed from: b */
    public static boolean m33074b() {
        return f29595a != null;
    }

    /* renamed from: c */
    public static void m33075c() {
        if (f29595a != null) {
            ((SensorManager) C12084a.m32908e().getSystemService("sensor")).unregisterListener(f29595a);
            f29595a = null;
        }
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            f29597c = sensorEvent;
        }
    }

    /* renamed from: a */
    public static JSONObject m33072a() {
        if (f29597c == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) f29597c.values[0]);
            jSONObject.put("y", (double) f29597c.values[1]);
            jSONObject.put("z", (double) f29597c.values[2]);
            return jSONObject;
        } catch (JSONException e) {
            C12065a.m32842a("JSON error while constructing accelerometer data", (Exception) e);
            return jSONObject;
        }
    }
}
