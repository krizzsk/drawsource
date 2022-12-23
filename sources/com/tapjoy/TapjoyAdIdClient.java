package com.tapjoy;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.lang.reflect.Method;

public class TapjoyAdIdClient {

    /* renamed from: a */
    private Context f26743a;

    /* renamed from: b */
    private String f26744b;

    /* renamed from: c */
    private boolean f26745c;

    public TapjoyAdIdClient(Context context) {
        this.f26743a = context;
    }

    public boolean setupAdIdInfo() {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f26743a);
            this.f26744b = advertisingIdInfo.getId();
            this.f26745c = !advertisingIdInfo.isLimitAdTrackingEnabled();
            return true;
        } catch (Error | Exception unused) {
            return false;
        }
    }

    public boolean setupAdIdInfoReflection() {
        try {
            Class<?> cls = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
            Method method = cls.getMethod("getAdvertisingIdInfo", new Class[]{Context.class});
            TapjoyLog.m30839d("TapjoyAdIdClient", "Found method: ".concat(String.valueOf(method)));
            Object invoke = method.invoke(cls, new Object[]{this.f26743a});
            Method method2 = invoke.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]);
            Method method3 = invoke.getClass().getMethod("getId", new Class[0]);
            this.f26745c = !((Boolean) method2.invoke(invoke, new Object[0])).booleanValue();
            this.f26744b = (String) method3.invoke(invoke, new Object[0]);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public String getAdvertisingId() {
        return this.f26744b;
    }

    public boolean isAdTrackingEnabled() {
        return this.f26745c;
    }
}
