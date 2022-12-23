package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.p051c.C1867b;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.utils.n */
public class C2091n implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    private final int f4093a;

    /* renamed from: b */
    private final float f4094b;

    /* renamed from: c */
    private final SensorManager f4095c;

    /* renamed from: d */
    private final Sensor f4096d;

    /* renamed from: e */
    private final Sensor f4097e = this.f4095c.getDefaultSensor(4);

    /* renamed from: f */
    private final C1969m f4098f;

    /* renamed from: g */
    private float[] f4099g;

    /* renamed from: h */
    private float f4100h;

    public C2091n(C1969m mVar) {
        this.f4098f = mVar;
        SensorManager sensorManager = (SensorManager) mVar.mo14520L().getSystemService("sensor");
        this.f4095c = sensorManager;
        this.f4096d = sensorManager.getDefaultSensor(9);
        this.f4093a = ((Integer) mVar.mo14534a(C1867b.f3274dR)).intValue();
        this.f4094b = ((Float) mVar.mo14534a(C1867b.f3273dQ)).floatValue();
        mVar.mo14560aj().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
        mVar.mo14560aj().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
    }

    /* renamed from: a */
    public void mo14968a() {
        this.f4095c.unregisterListener(this);
        if (((Boolean) this.f4098f.mo14519K().mo14284a(C1867b.f3271dO)).booleanValue()) {
            this.f4095c.registerListener(this, this.f4096d, (int) TimeUnit.MILLISECONDS.toMicros((long) this.f4093a));
        }
        if (((Boolean) this.f4098f.mo14519K().mo14284a(C1867b.f3272dP)).booleanValue()) {
            this.f4095c.registerListener(this, this.f4097e, (int) TimeUnit.MILLISECONDS.toMicros((long) this.f4093a));
        }
    }

    /* renamed from: b */
    public float mo14969b() {
        return this.f4100h;
    }

    /* renamed from: c */
    public float mo14970c() {
        float[] fArr = this.f4099g;
        if (fArr == null) {
            return 0.0f;
        }
        return (float) Math.toDegrees(Math.acos((double) (fArr[2] / 9.81f)));
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            this.f4095c.unregisterListener(this);
        } else if ("com.applovin.application_resumed".equals(action)) {
            mo14968a();
        }
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 9) {
            this.f4099g = sensorEvent.values;
        } else if (sensorEvent.sensor.getType() == 4) {
            float f = this.f4100h * this.f4094b;
            this.f4100h = f;
            this.f4100h = f + Math.abs(sensorEvent.values[0]) + Math.abs(sensorEvent.values[1]) + Math.abs(sensorEvent.values[2]);
        }
    }
}
