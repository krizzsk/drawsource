package com.applovin.impl.mediation.p034c;

import android.content.Context;
import com.applovin.impl.mediation.p031a.C1589g;
import com.applovin.impl.mediation.p031a.C1591h;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p051c.C1866a;
import com.applovin.impl.sdk.p051c.C1869d;
import com.applovin.impl.sdk.p053e.C1887a;
import com.applovin.impl.sdk.p053e.C1918o;
import com.applovin.impl.sdk.p053e.C1944z;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdkUtils;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.c.b */
public class C1633b extends C1887a {

    /* renamed from: a */
    private static String f2248a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final MaxAdFormat f2249c;

    /* renamed from: d */
    private final Map<String, Object> f2250d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Context f2251e;

    /* renamed from: f */
    private final C1635a f2252f;

    /* renamed from: com.applovin.impl.mediation.c.b$a */
    public interface C1635a {
        /* renamed from: a */
        void mo13582a(JSONArray jSONArray);
    }

    /* renamed from: com.applovin.impl.mediation.c.b$b */
    private static class C1636b implements C1589g.C1590a, Runnable {

        /* renamed from: a */
        private final C1635a f2256a;

        /* renamed from: b */
        private final Object f2257b;

        /* renamed from: c */
        private int f2258c;

        /* renamed from: d */
        private final AtomicBoolean f2259d;

        /* renamed from: e */
        private final Collection<C1589g> f2260e;

        /* renamed from: f */
        private final C2102v f2261f;

        private C1636b(int i, C1635a aVar, C2102v vVar) {
            this.f2258c = i;
            this.f2256a = aVar;
            this.f2261f = vVar;
            this.f2257b = new Object();
            this.f2260e = new ArrayList(i);
            this.f2259d = new AtomicBoolean();
        }

        /* renamed from: a */
        private void m3276a() {
            ArrayList<C1589g> arrayList;
            String str;
            String d;
            synchronized (this.f2257b) {
                arrayList = new ArrayList<>(this.f2260e);
            }
            JSONArray jSONArray = new JSONArray();
            for (C1589g gVar : arrayList) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    C1591h a = gVar.mo13470a();
                    jSONObject.put("name", a.mo13431L());
                    jSONObject.put("class", a.mo13430K());
                    jSONObject.put(TapjoyConstants.TJC_ADAPTER_VERSION, gVar.mo13472c());
                    jSONObject.put("sdk_version", gVar.mo13471b());
                    JSONObject jSONObject2 = new JSONObject();
                    if (StringUtils.isValidString(gVar.mo13474e())) {
                        str = "error_message";
                        d = gVar.mo13474e();
                    } else {
                        str = "signal";
                        d = gVar.mo13473d();
                    }
                    jSONObject2.put(str, d);
                    jSONObject.put("data", jSONObject2);
                    jSONArray.put(jSONObject);
                    if (C2102v.m5104a()) {
                        C2102v vVar = this.f2261f;
                        vVar.mo15012b("TaskCollectSignals", "Collected signal from " + a);
                    }
                } catch (JSONException e) {
                    if (C2102v.m5104a()) {
                        this.f2261f.mo15013b("TaskCollectSignals", "Failed to create signal data", e);
                    }
                }
            }
            m3277a(jSONArray);
        }

        /* renamed from: a */
        private void m3277a(JSONArray jSONArray) {
            C1635a aVar = this.f2256a;
            if (aVar != null) {
                aVar.mo13582a(jSONArray);
            }
        }

        /* renamed from: a */
        public void mo13476a(C1589g gVar) {
            boolean z;
            synchronized (this.f2257b) {
                this.f2260e.add(gVar);
                int i = this.f2258c - 1;
                this.f2258c = i;
                z = i < 1;
            }
            if (z && this.f2259d.compareAndSet(false, true)) {
                m3276a();
            }
        }

        public void run() {
            if (this.f2259d.compareAndSet(false, true)) {
                m3276a();
            }
        }
    }

    static {
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(m3269a("APPLOVIN_NETWORK", "com.applovin.mediation.adapters.AppLovinMediationAdapter"));
            m3269a("FACEBOOK_NETWORK", "com.applovin.mediation.adapters.FacebookMediationAdapter").put("run_on_ui_thread", false);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("signal_providers", jSONArray);
            f2248a = jSONObject.toString();
        } catch (JSONException unused) {
        }
    }

    public C1633b(MaxAdFormat maxAdFormat, Map<String, Object> map, Context context, C1969m mVar, C1635a aVar) {
        super("TaskCollectSignals", mVar);
        this.f2249c = maxAdFormat;
        this.f2250d = map;
        this.f2251e = context;
        this.f2252f = aVar;
    }

    /* renamed from: a */
    private static JSONObject m3269a(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", str);
        jSONObject.put("class", str2);
        jSONObject.put("adapter_timeout_ms", 30000);
        jSONObject.put("max_signal_length", 32768);
        jSONObject.put("scode", "");
        return jSONObject;
    }

    /* renamed from: a */
    private void m3270a(final C1591h hVar, final C1589g.C1590a aVar) {
        if (hVar.mo13438S()) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    C1633b.this.f3496b.mo14513E().collectSignal(C1633b.this.f2249c, hVar, C1633b.this.f2251e, aVar);
                }
            });
        } else {
            this.f3496b.mo14513E().collectSignal(this.f2249c, hVar, this.f2251e, aVar);
        }
    }

    /* renamed from: a */
    private void m3271a(JSONArray jSONArray, JSONObject jSONObject) throws JSONException, InterruptedException {
        C1636b bVar = new C1636b(jSONArray.length(), this.f2252f, this.f3496b.mo14509A());
        for (int i = 0; i < jSONArray.length(); i++) {
            m3270a(new C1591h(this.f2250d, jSONArray.getJSONObject(i), jSONObject, this.f3496b), (C1589g.C1590a) bVar);
        }
        this.f3496b.mo14526S().mo14430a((C1887a) new C1944z(this.f3496b, bVar), C1918o.C1920a.MAIN, ((Long) this.f3496b.mo14534a(C1866a.f3079k)).longValue());
    }

    /* renamed from: b */
    private void m3273b(String str, Throwable th) {
        if (C2102v.m5104a()) {
            mo14366a("No signals collected: " + str, th);
        }
        C1635a aVar = this.f2252f;
        if (aVar != null) {
            aVar.mo13582a(new JSONArray());
        }
    }

    public void run() {
        String str;
        try {
            JSONObject jSONObject = new JSONObject((String) this.f3496b.mo14565b(C1869d.f3392x, f2248a));
            JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "signal_providers", (JSONArray) null);
            if (jSONArray != null) {
                if (jSONArray.length() != 0) {
                    m3271a(jSONArray, jSONObject);
                    return;
                }
            }
            m3273b("No signal providers found", (Throwable) null);
        } catch (JSONException e) {
            th = e;
            str = "Failed to parse signals JSON";
            m3273b(str, th);
        } catch (InterruptedException e2) {
            th = e2;
            str = "Failed to wait for signals";
            m3273b(str, th);
        } catch (Throwable th) {
            th = th;
            str = "Failed to collect signals";
            m3273b(str, th);
        }
    }
}
