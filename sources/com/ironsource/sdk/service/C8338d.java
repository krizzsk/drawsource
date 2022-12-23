package com.ironsource.sdk.service;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.C6363a;
import com.ironsource.environment.C6393h;
import com.ironsource.sdk.p282e.p283a.C8283a;
import com.ironsource.sdk.utils.IronSourceQaProperties;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.service.d */
public final class C8338d {

    /* renamed from: b */
    private static C8338d f20305b;

    /* renamed from: a */
    private JSONObject f20306a = new JSONObject();

    private C8338d() {
    }

    /* renamed from: a */
    public static synchronized C8338d m23726a() {
        C8338d dVar;
        synchronized (C8338d.class) {
            if (f20305b == null) {
                f20305b = new C8338d();
            }
            dVar = f20305b;
        }
        return dVar;
    }

    /* renamed from: a */
    private void m23727a(Activity activity) {
        if (activity != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                mo56783a(SDKUtils.encodeString("immersiveMode"), Boolean.valueOf(C6393h.m19099a(activity)));
            }
            mo56783a("appOrientation", SDKUtils.translateRequestedOrientation(C6393h.m19126m(activity)));
        }
    }

    /* renamed from: a */
    private void m23728a(Map<String, String> map) {
        if (map == null) {
            Log.d("TokenService", "collectDataFromExternalParams params=null");
            return;
        }
        for (String next : map.keySet()) {
            mo56783a(next, SDKUtils.encodeString(map.get(next)));
        }
    }

    /* renamed from: c */
    private static void m23729c() {
        HashMap hashMap = new HashMap();
        hashMap.put("omidVersion", C8283a.f20173a);
        hashMap.put("omidPartnerVersion", "7");
        f20305b.m23728a((Map<String, String>) hashMap);
    }

    /* renamed from: c */
    private void m23730c(final Context context) {
        if (context != null) {
            try {
                new Thread(new Runnable() {
                    public final void run() {
                        try {
                            C8338d.this.mo56784a(C8336b.m23717a(context));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    private void m23731c(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                mo56783a("chinaCDN", new JSONObject(str).opt("chinaCDN"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    private static void m23732d() {
        if (IronSourceQaProperties.isInitialized()) {
            f20305b.m23728a(IronSourceQaProperties.getInstance().getParameters());
        }
    }

    /* renamed from: d */
    private void m23733d(Context context) {
        if (context != null) {
            mo56784a(C8336b.m23720c(context));
            mo56784a(C8336b.m23719b(context));
        }
    }

    /* renamed from: a */
    public final String mo56780a(Context context) {
        try {
            return C6363a.C63641.m19016c(mo56785b(context).toString());
        } catch (Exception unused) {
            return C6363a.C63641.m19016c(new JSONObject().toString());
        }
    }

    /* renamed from: a */
    public final void mo56781a(Context context, String str, String str2) {
        m23730c(context);
        if (context instanceof Activity) {
            m23727a((Activity) context);
        }
        m23733d(context);
        mo56782a(str2);
        mo56787b(str);
    }

    /* renamed from: a */
    public final void mo56782a(String str) {
        if (str != null) {
            mo56783a("applicationUserId", SDKUtils.encodeString(str));
        }
    }

    /* renamed from: a */
    public final synchronized void mo56783a(String str, Object obj) {
        try {
            this.f20306a.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo56784a(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            mo56783a(next, jSONObject.opt(next));
        }
    }

    /* renamed from: b */
    public final JSONObject mo56785b(Context context) {
        mo56786b();
        m23733d(context);
        try {
            return new JSONObject(this.f20306a.toString());
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    /* renamed from: b */
    public final void mo56786b() {
        m23731c(SDKUtils.getControllerConfig());
        m23728a(SDKUtils.getInitSDKParams());
        m23732d();
        m23729c();
    }

    /* renamed from: b */
    public final void mo56787b(String str) {
        if (str != null) {
            mo56783a("applicationKey", SDKUtils.encodeString(str));
        }
    }
}
