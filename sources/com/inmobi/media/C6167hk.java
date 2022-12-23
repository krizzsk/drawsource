package com.inmobi.media;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.hk */
/* compiled from: CatchEvent */
public final class C6167hk extends C6134gl {

    /* renamed from: g */
    private static final String f15570g = C6172hn.class.getSimpleName();

    public C6167hk(Throwable th) {
        super("crashReporting", "catchEvent");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", th.getClass().getSimpleName());
            jSONObject.put("message", th.getMessage());
            jSONObject.put("stack", Log.getStackTraceString(th));
            jSONObject.put("thread", Thread.currentThread().getName());
            this.f15457f = jSONObject.toString();
        } catch (JSONException unused) {
        }
    }
}
