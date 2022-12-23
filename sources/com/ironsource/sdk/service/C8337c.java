package com.ironsource.sdk.service;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.ironsource.environment.C6393h;
import com.ironsource.environment.C6398k;
import com.ironsource.mediationsdk.adunit.p207a.C6538a;
import com.ironsource.sdk.p282e.p283a.C8283a;
import com.ironsource.sdk.utils.IronSourceQaProperties;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.service.c */
public final class C8337c {

    /* renamed from: a */
    private C6538a f20304a = new C6538a();

    /* renamed from: a */
    public final void mo56775a() {
        HashMap hashMap = new HashMap();
        hashMap.put("omv", C8283a.f20173a);
        hashMap.put("ompv", "7");
        C6538a.m19818a((Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    public final void mo56776a(Context context) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (Build.VERSION.SDK_INT >= 19) {
                C6538a.m19816a("imm", (Object) Boolean.valueOf(C6393h.m19099a(activity)));
            }
        }
    }

    /* renamed from: b */
    public final void mo56777b() {
        String controllerConfig = SDKUtils.getControllerConfig();
        if (!TextUtils.isEmpty(controllerConfig)) {
            try {
                C6538a.m19816a("cncdn", new JSONObject(controllerConfig).opt("chinaCDN"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public final void mo56778b(Context context) {
        C6538a.m19816a("gpi", (Object) Boolean.valueOf(C6398k.m19149a(context)));
    }

    /* renamed from: c */
    public final void mo56779c() {
        JSONObject jSONObject = new JSONObject(IronSourceQaProperties.getInstance().getParameters());
        if (jSONObject.length() > 0) {
            C6538a.m19817a("debug", jSONObject);
        }
    }
}
