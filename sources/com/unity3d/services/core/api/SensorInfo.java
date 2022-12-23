package com.unity3d.services.core.api;

import com.unity3d.services.core.sensorinfo.C12123a;
import com.unity3d.services.core.sensorinfo.C12124b;
import com.unity3d.services.core.webview.bridge.C12160l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import org.json.JSONObject;

public class SensorInfo {
    @WebViewExposed
    public static void getAccelerometerData(C12160l lVar) {
        JSONObject a = C12124b.m33072a();
        if (a != null) {
            lVar.mo71347a(a);
            return;
        }
        lVar.mo71346a(C12123a.ACCELEROMETER_DATA_NOT_AVAILABLE, new Object[0]);
    }

    @WebViewExposed
    public static void isAccelerometerActive(C12160l lVar) {
        lVar.mo71347a(Boolean.valueOf(C12124b.m33074b()));
    }

    @WebViewExposed
    public static void startAccelerometerUpdates(Integer num, C12160l lVar) {
        lVar.mo71347a(Boolean.valueOf(C12124b.m33073a(num.intValue())));
    }

    @WebViewExposed
    public static void stopAccelerometerUpdates(C12160l lVar) {
        C12124b.m33075c();
        lVar.mo71347a(new Object[0]);
    }
}
