package com.tapjoy.internal;

import android.text.TextUtils;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyURLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.tapjoy.internal.ga */
public final class C11500ga {

    /* renamed from: a */
    String f27599a;

    /* renamed from: b */
    String f27600b;

    /* renamed from: c */
    String f27601c;

    /* renamed from: d */
    TapjoyURLConnection f27602d;

    /* renamed from: e */
    private Map<String, String> f27603e = new HashMap();

    /* renamed from: f */
    private boolean f27604f;

    public C11500ga(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f27599a = str;
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            this.f27603e.put(next, jSONObject.optString(next));
        }
        this.f27600b = jSONObject2.optString(TJAdUnitConstants.String.BEACON_SHOW_PATH);
        this.f27601c = jSONObject2.optString("error");
        this.f27602d = new TapjoyURLConnection();
    }

    /* renamed from: a */
    public final void mo70029a() {
        if (!TextUtils.isEmpty(this.f27600b) && !this.f27604f) {
            this.f27604f = true;
            final HashMap hashMap = new HashMap(this.f27603e);
            new Thread() {
                public final void run() {
                    super.run();
                    TapjoyURLConnection tapjoyURLConnection = C11500ga.this.f27602d;
                    tapjoyURLConnection.getResponseFromURL(C11500ga.this.f27599a + C11500ga.this.f27600b, (Map<String, String>) null, (Map<String, String>) null, (Map<String, String>) hashMap);
                }
            }.start();
        }
    }

    /* renamed from: a */
    public final void mo70030a(String str) {
        if (!TextUtils.isEmpty(this.f27601c)) {
            final HashMap hashMap = new HashMap(this.f27603e);
            hashMap.put("error", str);
            new Thread() {
                public final void run() {
                    TapjoyURLConnection tapjoyURLConnection = C11500ga.this.f27602d;
                    tapjoyURLConnection.getResponseFromURL(C11500ga.this.f27599a + C11500ga.this.f27601c, (Map<String, String>) null, (Map<String, String>) null, (Map<String, String>) hashMap);
                }
            }.start();
        }
    }
}
