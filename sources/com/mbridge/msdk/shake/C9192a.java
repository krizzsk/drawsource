package com.mbridge.msdk.shake;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.same.C8469a;
import com.mbridge.msdk.foundation.same.report.C8574b;
import com.mbridge.msdk.foundation.same.report.C8598e;

/* renamed from: com.mbridge.msdk.shake.a */
/* compiled from: NativeShakeManager */
public final class C9192a {

    /* renamed from: a */
    private SensorManager f22573a;

    /* renamed from: com.mbridge.msdk.shake.a$a */
    /* compiled from: NativeShakeManager */
    private static class C9194a {

        /* renamed from: a */
        static C9192a f22574a = new C9192a();
    }

    private C9192a() {
    }

    /* renamed from: a */
    public static C9192a m26189a() {
        return C9194a.f22574a;
    }

    /* renamed from: b */
    public final void mo61405b(SensorEventListener sensorEventListener) {
        SensorManager sensorManager = this.f22573a;
        if (sensorManager != null) {
            try {
                sensorManager.unregisterListener(sensorEventListener);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo61404a(SensorEventListener sensorEventListener) {
        Context g = C8388a.m23845e().mo56913g();
        if (g != null) {
            try {
                if (this.f22573a == null) {
                    this.f22573a = (SensorManager) g.getSystemService("sensor");
                }
                this.f22573a.registerListener(sensorEventListener, this.f22573a.getDefaultSensor(1), 2);
            } catch (Exception e) {
                e.printStackTrace();
                String message = e.getMessage();
                if (g == null) {
                    return;
                }
                if (!TextUtils.isEmpty(message)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000106&");
                    if (!TextUtils.isEmpty(C8469a.f20750k)) {
                        stringBuffer.append("b=" + C8469a.f20750k + "&");
                    }
                    if (!TextUtils.isEmpty(C8469a.f20751l)) {
                        stringBuffer.append("c=" + C8469a.f20751l + "&");
                    }
                    stringBuffer.append("reason=" + message);
                    if (C8574b.m24577a().mo58054c()) {
                        C8574b.m24577a().mo58052a(stringBuffer.toString());
                    } else {
                        C8598e.m24682b(g, stringBuffer.toString());
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
