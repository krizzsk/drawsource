package com.tapjoy.internal;

import android.webkit.WebView;
import com.tapjoy.TapjoyConstants;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.tapjoy.internal.du */
public abstract class C11372du {

    /* renamed from: a */
    public C11332cl f27142a;

    /* renamed from: b */
    public C11346cz f27143b;

    /* renamed from: c */
    public int f27144c;

    /* renamed from: d */
    public long f27145d;

    /* renamed from: e */
    private C11371dt f27146e = new C11371dt((WebView) null);

    /* renamed from: com.tapjoy.internal.du$a */
    public enum C11373a {
        ;
        

        /* renamed from: a */
        public static final int f27147a = 1;

        /* renamed from: b */
        public static final int f27148b = 2;

        /* renamed from: c */
        public static final int f27149c = 3;

        static {
            f27150d = new int[]{1, 2, 3};
        }
    }

    public C11372du() {
        mo69823d();
    }

    /* renamed from: e */
    private boolean m31098e() {
        return this.f27146e.get() != null;
    }

    /* renamed from: a */
    public void mo69813a() {
    }

    /* renamed from: a */
    public final void mo69814a(float f) {
        C11356dh.m31057a().mo69803a(mo69822c(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo69815a(WebView webView) {
        this.f27146e = new C11371dt(webView);
    }

    /* renamed from: a */
    public void mo69816a(C11344cx cxVar, C11335co coVar) {
        mo69817a(cxVar, coVar, (JSONObject) null);
    }

    /* renamed from: a */
    public final void mo69818a(String str) {
        C11356dh.m31057a().mo69804a(mo69822c(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public final void mo69819a(String str, JSONObject jSONObject) {
        C11356dh.m31057a().mo69804a(mo69822c(), str, jSONObject);
    }

    /* renamed from: a */
    public final void mo69820a(boolean z) {
        if (m31098e()) {
            C11356dh.m31057a().mo69808c(mo69822c(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: b */
    public void mo69821b() {
        this.f27146e.clear();
    }

    /* renamed from: c */
    public final WebView mo69822c() {
        return (WebView) this.f27146e.get();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69817a(C11344cx cxVar, C11335co coVar, JSONObject jSONObject) {
        String str = cxVar.f27082f;
        JSONObject jSONObject2 = new JSONObject();
        C11365do.m31083a(jSONObject2, "environment", TapjoyConstants.TJC_APP_PLACEMENT);
        C11365do.m31083a(jSONObject2, "adSessionType", coVar.f27034h);
        C11365do.m31083a(jSONObject2, "deviceInfo", C11364dn.m31077a());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C11365do.m31083a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C11365do.m31083a(jSONObject3, "partnerName", coVar.f27027a.f27071a);
        C11365do.m31083a(jSONObject3, "partnerVersion", coVar.f27027a.f27072b);
        C11365do.m31083a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C11365do.m31083a(jSONObject4, "libraryVersion", "1.3.16-tapjoy");
        C11365do.m31083a(jSONObject4, "appId", C11355dg.m31056a().f27122a.getApplicationContext().getPackageName());
        C11365do.m31083a(jSONObject2, TapjoyConstants.TJC_APP_PLACEMENT, jSONObject4);
        if (coVar.f27033g != null) {
            C11365do.m31083a(jSONObject2, "contentUrl", coVar.f27033g);
        }
        if (coVar.f27032f != null) {
            C11365do.m31083a(jSONObject2, "customReferenceData", coVar.f27032f);
        }
        JSONObject jSONObject5 = new JSONObject();
        for (T t : Collections.unmodifiableList(coVar.f27029c)) {
            C11365do.m31083a(jSONObject5, t.f27073a, t.f27075c);
        }
        C11356dh.m31057a().mo69805a(mo69822c(), str, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: d */
    public final void mo69823d() {
        this.f27145d = System.nanoTime();
        this.f27144c = C11373a.f27147a;
    }
}
