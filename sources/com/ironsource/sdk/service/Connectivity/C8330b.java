package com.ironsource.sdk.service.Connectivity;

import android.content.Context;
import android.os.Build;
import com.ironsource.environment.C6372c;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.service.Connectivity.b */
public abstract class C8330b implements C8332d {

    /* renamed from: a */
    public C8331c f20294a;

    protected C8330b(JSONObject jSONObject, Context context) {
        C8331c cVar;
        if (jSONObject.optInt("connectivityStrategy") == 1) {
            cVar = new C8329a(this);
        } else {
            cVar = (Build.VERSION.SDK_INT < 23 || !C6372c.m19031b(context, "android.permission.ACCESS_NETWORK_STATE")) ? new C8329a(this) : new C8333e(this);
        }
        this.f20294a = cVar;
        String simpleName = C8330b.class.getSimpleName();
        Logger.m23749i(simpleName, "created ConnectivityAdapter with strategy " + this.f20294a.getClass().getSimpleName());
    }

    /* renamed from: a */
    public void mo56518a() {
    }

    /* renamed from: a */
    public void mo56519a(String str) {
    }

    /* renamed from: a */
    public void mo56520a(String str, JSONObject jSONObject) {
    }
}
