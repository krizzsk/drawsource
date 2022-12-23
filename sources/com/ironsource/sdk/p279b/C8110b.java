package com.ironsource.sdk.p279b;

import android.os.Build;
import android.util.Log;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.ironsource.environment.p204e.C6385a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.b.b */
public class C8110b {

    /* renamed from: a */
    public C8109a f19654a;

    /* renamed from: b */
    public C8113d f19655b = new C8113d();

    /* renamed from: c */
    public WebView f19656c;

    /* renamed from: d */
    public String f19657d;

    /* renamed from: e */
    public String f19658e = C8110b.class.getSimpleName();

    /* renamed from: f */
    private String[] f19659f = {"handleGetViewVisibility"};

    /* renamed from: g */
    private final String[] f19660g = {"loadWithUrl", "updateAd", "isExternalAdViewInitiated", "handleGetViewVisibility", "sendMessage"};

    /* renamed from: d */
    private static String m23184d(String str) {
        return String.format("window.ssa.onMessageReceived(%1$s)", new Object[]{str});
    }

    /* renamed from: e */
    private void m23185e(final String str) {
        final String str2 = "javascript:try{" + str + "}catch(e){console.log(\"JS exception: \" + JSON.stringify(e));}";
        C6385a.f16166a.mo35891a(new Runnable() {
            public final void run() {
                try {
                    if (Build.VERSION.SDK_INT >= 19) {
                        C8110b.this.f19656c.evaluateJavascript(str2, (ValueCallback) null);
                    } else {
                        C8110b.this.f19656c.loadUrl(str2);
                    }
                } catch (Throwable unused) {
                    String a = C8110b.this.f19658e;
                    Log.e(a, "injectJavaScriptIntoWebView | Error while trying inject JS into external adUnit: " + str + "Android API level: " + Build.VERSION.SDK_INT);
                }
            }
        });
    }

    /* renamed from: a */
    public final JSONObject mo56311a() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("visibilityParams", this.f19655b.mo56325a());
            jSONObject.put("configs", jSONObject2);
            jSONObject.put("adViewId", this.f19657d);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    /* renamed from: a */
    public JSONObject mo56312a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("id", jSONObject.getString("id"));
            jSONObject2.put("data", this.f19655b.mo56325a());
        } catch (Exception e) {
            String str = this.f19658e;
            Log.e(str, "Error while trying execute method buildVisibilityMessageForAdUnit | params: " + jSONObject);
            e.printStackTrace();
        }
        return jSONObject2;
    }

    /* renamed from: a */
    public final void mo56313a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adViewId", this.f19657d);
            mo56317a(str, jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo56314a(String str, int i, boolean z) {
        C8113d dVar = this.f19655b;
        boolean z2 = true;
        if (dVar.f19666a.containsKey(str)) {
            dVar.f19666a.put(str, Boolean.valueOf(i == 0));
        }
        dVar.f19666a.put("isShown", Boolean.valueOf(z));
        if ((!dVar.f19666a.get("isWindowVisible").booleanValue() && !dVar.f19666a.get("isVisible").booleanValue()) || !dVar.f19666a.get("isShown").booleanValue()) {
            z2 = false;
        }
        dVar.f19666a.put("isViewVisible", Boolean.valueOf(z2));
        if ((Build.VERSION.SDK_INT <= 22 ? str.equalsIgnoreCase("isWindowVisible") : str.equalsIgnoreCase("isVisible")) && this.f19654a != null && this.f19655b != null) {
            mo56317a("containerIsVisible", mo56311a());
        }
    }

    /* renamed from: a */
    public final void mo56315a(String str, String str2) {
        C8109a aVar = this.f19654a;
        if (aVar != null) {
            aVar.mo56309a(str, str2, this.f19657d);
        }
    }

    /* renamed from: a */
    public final void mo56316a(String str, String str2, String str3) {
        if (this.f19656c == null) {
            String str4 = "No external adUnit attached to ISNAdView while trying to send message: " + str;
            Log.e(this.f19658e, str4);
            this.f19654a.mo56309a(str3, str4, this.f19657d);
            return;
        }
        try {
            new JSONObject(str);
        } catch (JSONException unused) {
            str = "\"" + str + "\"";
        }
        m23185e(m23184d(str));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adViewId", this.f19657d);
        mo56317a(str2, jSONObject);
    }

    /* renamed from: a */
    public final void mo56317a(String str, JSONObject jSONObject) {
        C8109a aVar = this.f19654a;
        if (aVar != null) {
            aVar.mo56310a(str, jSONObject);
        }
    }

    /* renamed from: b */
    public final void mo56318b(String str) {
        JSONObject a = this.f19655b.mo56325a();
        a.put("adViewId", this.f19657d);
        mo56317a(str, a);
    }

    /* renamed from: c */
    public boolean mo56319c(String str) {
        for (String equalsIgnoreCase : this.f19659f) {
            if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
