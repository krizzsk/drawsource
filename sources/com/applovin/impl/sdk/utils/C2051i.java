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
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.utils.i */
public class C2051i implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    private final C1969m f3999a;

    /* renamed from: b */
    private final SensorManager f4000b;

    /* renamed from: c */
    private final Sensor f4001c;

    /* renamed from: d */
    private final C2052a f4002d;

    /* renamed from: e */
    private float f4003e;

    /* renamed from: com.applovin.impl.sdk.utils.i$a */
    public interface C2052a {
        /* renamed from: b */
        void mo14605b();

        /* renamed from: c */
        void mo14606c();
    }

    public C2051i(C1969m mVar, C2052a aVar) {
        this.f3999a = mVar;
        SensorManager sensorManager = (SensorManager) mVar.mo14520L().getSystemService("sensor");
        this.f4000b = sensorManager;
        this.f4001c = sensorManager.getDefaultSensor(1);
        this.f4002d = aVar;
    }

    /* renamed from: a */
    public void mo14897a() {
        this.f4000b.unregisterListener(this);
        this.f4000b.registerListener(this, this.f4001c, (int) TimeUnit.MILLISECONDS.toMicros(50));
        this.f3999a.mo14560aj().unregisterReceiver(this);
        this.f3999a.mo14560aj().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
        this.f3999a.mo14560aj().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
    }

    /* renamed from: b */
    public void mo14898b() {
        this.f3999a.mo14560aj().unregisterReceiver(this);
        this.f4000b.unregisterListener(this);
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            this.f4000b.unregisterListener(this);
        } else if ("com.applovin.application_resumed".equals(action)) {
            mo14897a();
        }
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            float max = Math.max(Math.min(sensorEvent.values[2] / 9.81f, 1.0f), -1.0f);
            float f = this.f4003e;
            float f2 = (f * 0.5f) + (max * 0.5f);
            this.f4003e = f2;
            if (f < 0.8f && f2 > 0.8f) {
                this.f4002d.mo14606c();
            } else if (f > -0.8f && this.f4003e < -0.8f) {
                this.f4002d.mo14605b();
            }
        }
    }
}
