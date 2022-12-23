package com.bytedance.sdk.openadsdk.p176j;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.j.e */
/* compiled from: PlayableJsBridge */
public class C3799e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f9783a;

    /* renamed from: b */
    private WeakReference<C3828g> f9784b;

    /* renamed from: c */
    private Map<String, C3825a> f9785c = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public SensorEventListener f9786d = new SensorEventListener() {
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            C3828g a;
            if (sensorEvent.sensor.getType() == 1 && (a = C3799e.this.m12425d()) != null) {
                float f = sensorEvent.values[0];
                float f2 = sensorEvent.values[1];
                float f3 = sensorEvent.values[2];
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("x", (double) f);
                    jSONObject.put("y", (double) f2);
                    jSONObject.put("z", (double) f3);
                    a.mo20644a("accelerometer_callback", jSONObject);
                } catch (Throwable unused) {
                }
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: e */
    public SensorEventListener f9787e = new SensorEventListener() {
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            C3828g a;
            if (sensorEvent.sensor.getType() == 4 && (a = C3799e.this.m12425d()) != null) {
                float degrees = (float) Math.toDegrees((double) sensorEvent.values[0]);
                float degrees2 = (float) Math.toDegrees((double) sensorEvent.values[1]);
                float degrees3 = (float) Math.toDegrees((double) sensorEvent.values[2]);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("x", (double) degrees);
                    jSONObject.put("y", (double) degrees2);
                    jSONObject.put("z", (double) degrees3);
                    a.mo20644a("gyro_callback", jSONObject);
                } catch (Throwable unused) {
                }
            }
        }
    };

    /* renamed from: com.bytedance.sdk.openadsdk.j.e$a */
    /* compiled from: PlayableJsBridge */
    interface C3825a {
        /* renamed from: a */
        JSONObject mo20633a(JSONObject jSONObject) throws Throwable;
    }

    public C3799e(C3828g gVar) {
        this.f9783a = gVar.mo20636a();
        this.f9784b = new WeakReference<>(gVar);
        m12423c();
    }

    /* renamed from: a */
    public Set<String> mo20628a() {
        return this.f9785c.keySet();
    }

    /* renamed from: c */
    private void m12423c() {
        this.f9785c.put("adInfo", new C3825a() {
            /* renamed from: a */
            public JSONObject mo20633a(JSONObject jSONObject) {
                C3828g a = C3799e.this.m12425d();
                if (a != null) {
                    return a.mo20674n();
                }
                return null;
            }
        });
        this.f9785c.put("appInfo", new C3825a() {
            /* renamed from: a */
            public JSONObject mo20633a(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "5.2.2");
                JSONArray jSONArray = new JSONArray();
                for (String put : C3799e.this.mo20628a()) {
                    jSONArray.put(put);
                }
                jSONObject2.put("supportList", jSONArray);
                C3828g a = C3799e.this.m12425d();
                if (a != null) {
                    jSONObject2.put("deviceId", a.mo20664g());
                    jSONObject2.put("netType", a.mo20671k());
                    jSONObject2.put("innerAppName", a.mo20657d());
                    jSONObject2.put("appName", a.mo20660e());
                    jSONObject2.put("appVersion", a.mo20663f());
                    Map<String, String> b = a.mo20648b();
                    for (String next : b.keySet()) {
                        jSONObject2.put(next, b.get(next));
                    }
                }
                return jSONObject2;
            }
        });
        this.f9785c.put("playableSDKInfo", new C3825a() {
            /* renamed from: a */
            public JSONObject mo20633a(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "5.2.2");
                jSONObject2.put("os", "android");
                return jSONObject2;
            }
        });
        this.f9785c.put("subscribe_app_ad", new C3825a() {
            /* renamed from: a */
            public JSONObject mo20633a(JSONObject jSONObject) {
                C3793a b = C3799e.this.m12427e();
                if (b == null) {
                    return null;
                }
                b.mo18481a(jSONObject);
                return null;
            }
        });
        this.f9785c.put("download_app_ad", new C3825a() {
            /* renamed from: a */
            public JSONObject mo20633a(JSONObject jSONObject) {
                C3793a b = C3799e.this.m12427e();
                if (b == null) {
                    return null;
                }
                b.mo18483b(jSONObject);
                return null;
            }
        });
        this.f9785c.put("isViewable", new C3825a() {
            /* renamed from: a */
            public JSONObject mo20633a(JSONObject jSONObject) throws Throwable {
                C3828g a = C3799e.this.m12425d();
                if (a == null) {
                    return new JSONObject();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("viewStatus", a.mo20669i());
                return jSONObject2;
            }
        });
        this.f9785c.put("getVolume", new C3825a() {
            /* renamed from: a */
            public JSONObject mo20633a(JSONObject jSONObject) throws Throwable {
                C3828g a = C3799e.this.m12425d();
                if (a == null) {
                    return new JSONObject();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("endcard_mute", a.mo20667h());
                return jSONObject2;
            }
        });
        this.f9785c.put("getScreenSize", new C3825a() {
            /* renamed from: a */
            public JSONObject mo20633a(JSONObject jSONObject) throws Throwable {
                C3828g a = C3799e.this.m12425d();
                if (a == null) {
                    return new JSONObject();
                }
                return a.mo20673m();
            }
        });
        this.f9785c.put("start_accelerometer_observer", new C3825a() {
            /* renamed from: a */
            public JSONObject mo20633a(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int i = 2;
                if (jSONObject != null) {
                    try {
                        i = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        C3826f.m12457a("PlayableJsBridge", "invoke start_accelerometer_observer error", th);
                        jSONObject2.put("code", -2);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                C3839i.m12535a(C3799e.this.f9783a, C3799e.this.f9786d, i);
                jSONObject2.put("code", 0);
                return jSONObject2;
            }
        });
        this.f9785c.put("close_accelerometer_observer", new C3825a() {
            /* renamed from: a */
            public JSONObject mo20633a(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    C3839i.m12534a(C3799e.this.f9783a, C3799e.this.f9786d);
                    jSONObject2.put("code", 0);
                    return jSONObject2;
                } catch (Throwable th) {
                    C3826f.m12457a("PlayableJsBridge", "invoke close_accelerometer_observer error", th);
                    jSONObject2.put("code", -2);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.f9785c.put("start_gyro_observer", new C3825a() {
            /* renamed from: a */
            public JSONObject mo20633a(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int i = 2;
                if (jSONObject != null) {
                    try {
                        i = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        C3826f.m12457a("PlayableJsBridge", "invoke start_gyro_observer error", th);
                        jSONObject2.put("code", -2);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                C3839i.m12537b(C3799e.this.f9783a, C3799e.this.f9787e, i);
                jSONObject2.put("code", 0);
                return jSONObject2;
            }
        });
        this.f9785c.put("close_gyro_observer", new C3825a() {
            /* renamed from: a */
            public JSONObject mo20633a(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    C3839i.m12534a(C3799e.this.f9783a, C3799e.this.f9787e);
                    jSONObject2.put("code", 0);
                    return jSONObject2;
                } catch (Throwable th) {
                    C3826f.m12457a("PlayableJsBridge", "invoke close_gyro_observer error", th);
                    jSONObject2.put("code", -2);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.f9785c.put("device_shake", new C3825a() {
            /* renamed from: a */
            public JSONObject mo20633a(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    C3839i.m12533a(C3799e.this.f9783a);
                    jSONObject2.put("code", 0);
                    return jSONObject2;
                } catch (Throwable th) {
                    C3826f.m12457a("PlayableJsBridge", "invoke device_shake error", th);
                    jSONObject2.put("code", -2);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.f9785c.put("playable_style", new C3825a() {
            /* renamed from: a */
            public JSONObject mo20633a(JSONObject jSONObject) throws Throwable {
                C3828g a = C3799e.this.m12425d();
                if (a != null) {
                    return a.mo20653c();
                }
                return null;
            }
        });
        this.f9785c.put("sendReward", new C3825a() {
            /* renamed from: a */
            public JSONObject mo20633a(JSONObject jSONObject) throws Throwable {
                C3828g a = C3799e.this.m12425d();
                if (a == null) {
                    return null;
                }
                a.mo20676p();
                return null;
            }
        });
        this.f9785c.put("webview_time_track", new C3825a() {
            /* renamed from: a */
            public JSONObject mo20633a(JSONObject jSONObject) throws Throwable {
                return null;
            }
        });
        this.f9785c.put("playable_event", new C3825a() {
            /* renamed from: a */
            public JSONObject mo20633a(JSONObject jSONObject) throws Throwable {
                C3828g a = C3799e.this.m12425d();
                if (a == null || jSONObject == null) {
                    return null;
                }
                a.mo20649b(jSONObject.optString("event", (String) null), jSONObject.optJSONObject("params"));
                return null;
            }
        });
        this.f9785c.put("reportAd", new C3825a() {
            /* renamed from: a */
            public JSONObject mo20633a(JSONObject jSONObject) throws Throwable {
                C3828g a = C3799e.this.m12425d();
                if (a == null) {
                    return null;
                }
                a.mo20655c(jSONObject);
                return null;
            }
        });
        this.f9785c.put("close", new C3825a() {
            /* renamed from: a */
            public JSONObject mo20633a(JSONObject jSONObject) throws Throwable {
                C3828g a = C3799e.this.m12425d();
                if (a == null) {
                    return null;
                }
                a.mo20658d(jSONObject);
                return null;
            }
        });
        this.f9785c.put("openAdLandPageLinks", new C3825a() {
            /* renamed from: a */
            public JSONObject mo20633a(JSONObject jSONObject) throws Throwable {
                C3828g a = C3799e.this.m12425d();
                if (a == null) {
                    return null;
                }
                a.mo20661e(jSONObject);
                return null;
            }
        });
        this.f9785c.put("get_viewport", new C3825a() {
            /* renamed from: a */
            public JSONObject mo20633a(JSONObject jSONObject) throws Throwable {
                C3828g a = C3799e.this.m12425d();
                if (a == null) {
                    return null;
                }
                return a.mo20675o();
            }
        });
        this.f9785c.put("jssdk_load_finish", new C3825a() {
            /* renamed from: a */
            public JSONObject mo20633a(JSONObject jSONObject) throws Throwable {
                C3828g a = C3799e.this.m12425d();
                if (a == null) {
                    return null;
                }
                a.mo20679s();
                return null;
            }
        });
        this.f9785c.put("material_render_result", new C3825a() {
            /* renamed from: a */
            public JSONObject mo20633a(JSONObject jSONObject) throws Throwable {
                C3828g a = C3799e.this.m12425d();
                if (a == null) {
                    return null;
                }
                a.mo20650b(jSONObject);
                return null;
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public C3828g m12425d() {
        WeakReference<C3828g> weakReference = this.f9784b;
        if (weakReference == null) {
            return null;
        }
        return (C3828g) weakReference.get();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public C3793a m12427e() {
        C3828g d = m12425d();
        if (d == null) {
            return null;
        }
        return d.mo20672l();
    }

    /* renamed from: a */
    public JSONObject mo20629a(String str, JSONObject jSONObject) {
        try {
            C3825a aVar = this.f9785c.get(str);
            if (aVar == null) {
                return null;
            }
            return aVar.mo20633a(jSONObject);
        } catch (Throwable th) {
            C3826f.m12457a("PlayableJsBridge", "invoke error", th);
            return null;
        }
    }

    /* renamed from: b */
    public void mo20630b() {
        C3839i.m12534a(this.f9783a, this.f9786d);
        C3839i.m12534a(this.f9783a, this.f9787e);
    }
}
