package com.ogury.p377ed.internal;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.tapjoy.TapjoyConstants;
import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.fd */
public final class C10017fd {

    /* renamed from: a */
    private final C10008ez f25191a;

    /* renamed from: b */
    private final C10012fa f25192b;

    /* renamed from: c */
    private final C10040fx f25193c;

    public C10017fd(C10008ez ezVar, C10012fa faVar, C10040fx fxVar) {
        C10263mq.m29882b(ezVar, "device");
        C10263mq.m29882b(faVar, TapjoyConstants.TJC_APP_PLACEMENT);
        C10263mq.m29882b(fxVar, "coreWrapper");
        this.f25191a = ezVar;
        this.f25192b = faVar;
        this.f25193c = fxVar;
    }

    /* renamed from: a */
    public final JSONObject mo64649a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TapjoyConstants.TJC_DEVICE_TIMEZONE, C10008ez.m28974f());
        jSONObject.put("aaid", "00000000-0000-0000-0000-000000000000");
        jSONObject.put(TapjoyConstants.TJC_DEVICE_LANGUAGE, this.f25192b.mo64639c());
        jSONObject.put(TapjoyConstants.TJC_DEVICE_COUNTRY_CODE, this.f25192b.mo64640d());
        jSONObject.put("install_unknown_sources", this.f25191a.mo64620h());
        jSONObject.put("aaid_optin", this.f25193c.mo64731a().isAdTrackingEnabled());
        jSONObject.put("privacy_compliancy", m29025a(this.f25193c.mo64733c()));
        jSONObject.put("instance_token", this.f25193c.mo64734d());
        jSONObject.put("device", m29026b());
        jSONObject.put("permissions", m29028d());
        return jSONObject;
    }

    /* renamed from: b */
    private final JSONObject m29026b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", this.f25191a.mo64621i());
        jSONObject.put("screen", m29027c());
        jSONObject.put(TapjoyConstants.TJC_DEVICE_OS_VERSION_NAME, C10008ez.m28967a());
        jSONObject.put("vm_name", C10008ez.m28972d());
        jSONObject.put("phone_arch", C10008ez.m28973e());
        jSONObject.put("vm_version", C10008ez.m28971c());
        return jSONObject;
    }

    /* renamed from: c */
    private static JSONObject m29027c() {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("density", Float.valueOf(displayMetrics.density));
        jSONObject.put("height", displayMetrics.heightPixels);
        jSONObject.put("width", displayMetrics.widthPixels);
        return jSONObject;
    }

    /* renamed from: d */
    private final JSONObject m29028d() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ACCESS_NETWORK_STATE", this.f25192b.mo64637a("android.permission.ACCESS_NETWORK_STATE"));
        jSONObject.put("RECEIVE_BOOT_COMPLETED", this.f25192b.mo64637a("android.permission.RECEIVE_BOOT_COMPLETED"));
        jSONObject.put("SYSTEM_ALERT_WINDOW", this.f25192b.mo64637a("android.permission.SYSTEM_ALERT_WINDOW"));
        jSONObject.put("GET_ACCOUNTS", this.f25192b.mo64637a("android.permission.GET_ACCOUNTS"));
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m29025a(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("consent_token", str);
        return jSONObject;
    }
}
