package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.impl.mediation.p031a.C1588f;
import com.applovin.impl.mediation.p034c.C1629a;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p051c.C1869d;
import com.applovin.impl.sdk.p053e.C1887a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.e */
public class C1737e {

    /* renamed from: a */
    private final C1969m f2661a;

    /* renamed from: b */
    private final C2102v f2662b;

    /* renamed from: c */
    private final AtomicBoolean f2663c = new AtomicBoolean();

    /* renamed from: d */
    private final JSONArray f2664d = new JSONArray();

    /* renamed from: e */
    private final LinkedHashSet<String> f2665e = new LinkedHashSet<>();

    /* renamed from: f */
    private final Object f2666f = new Object();

    /* renamed from: g */
    private List<C1588f> f2667g;

    public C1737e(C1969m mVar) {
        this.f2661a = mVar;
        this.f2662b = mVar.mo14509A();
    }

    /* renamed from: a */
    private List<C1588f> m3686a(JSONArray jSONArray, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(new C1588f(Collections.EMPTY_MAP, JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), jSONObject, this.f2661a));
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo13811a(Activity activity) {
        if (this.f2663c.compareAndSet(false, true)) {
            String str = (String) this.f2661a.mo14535a(C1869d.f3393y);
            if (StringUtils.isValidString(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    List<C1588f> a = m3686a(JsonUtils.getJSONArray(jSONObject, this.f2661a.mo14518J().mo13806a() ? "test_mode_auto_init_adapters" : "auto_init_adapters", new JSONArray()), jSONObject);
                    this.f2667g = a;
                    this.f2661a.mo14526S().mo14428a((C1887a) new C1629a(a, activity, this.f2661a));
                } catch (JSONException e) {
                    if (C2102v.m5104a()) {
                        this.f2662b.mo15013b("MediationAdapterInitializationManager", "Failed to parse auto-init adapters JSON", e);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo13812a(C1588f fVar, long j, MaxAdapter.InitializationStatus initializationStatus, String str) {
        boolean z;
        if (initializationStatus != null && initializationStatus != MaxAdapter.InitializationStatus.INITIALIZING) {
            synchronized (this.f2666f) {
                z = !mo13817a(fVar);
                if (z) {
                    this.f2665e.add(fVar.mo13430K());
                    JSONObject jSONObject = new JSONObject();
                    JsonUtils.putString(jSONObject, "class", fVar.mo13430K());
                    JsonUtils.putString(jSONObject, "init_status", String.valueOf(initializationStatus.getCode()));
                    JsonUtils.putString(jSONObject, "error_message", JSONObject.quote(str));
                    this.f2664d.put(jSONObject);
                }
            }
            if (z) {
                this.f2661a.mo14540a(fVar);
                this.f2661a.mo14513E().processAdapterInitializationPostback(fVar, j, initializationStatus, str);
                this.f2661a.mo14557ag().mo14483a(initializationStatus, fVar.mo13430K());
            }
        }
    }

    /* renamed from: a */
    public void mo13813a(C1588f fVar, Activity activity) {
        mo13814a(fVar, activity, (Runnable) null);
    }

    /* renamed from: a */
    public void mo13814a(C1588f fVar, Activity activity, Runnable runnable) {
        List<C1588f> list;
        if (this.f2661a.mo14518J().mo13806a() && (list = this.f2667g) != null) {
            Iterator<C1588f> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    fVar = null;
                    break;
                }
                C1588f next = it.next();
                if (next.mo13430K().equals(fVar.mo13430K())) {
                    fVar = next;
                    break;
                }
            }
        }
        if (fVar != null) {
            C1740g a = this.f2661a.mo14511C().mo13820a(fVar);
            if (a != null) {
                if (C2102v.m5104a()) {
                    C2102v vVar = this.f2662b;
                    vVar.mo15014c("MediationAdapterInitializationManager", "Initializing adapter " + fVar);
                }
                a.mo13833a((MaxAdapterInitializationParameters) MaxAdapterParametersImpl.m2967a(fVar), activity, runnable);
            } else if (runnable != null) {
                runnable.run();
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public void mo13815a(MaxAdapter.InitializationStatus initializationStatus) {
        this.f2661a.mo14557ag().mo14483a(initializationStatus, "com.applovin.mediation.adapters.AppLovinMediationAdapter");
    }

    /* renamed from: a */
    public boolean mo13816a() {
        return this.f2663c.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo13817a(C1588f fVar) {
        boolean contains;
        synchronized (this.f2666f) {
            contains = this.f2665e.contains(fVar.mo13430K());
        }
        return contains;
    }

    /* renamed from: b */
    public LinkedHashSet<String> mo13818b() {
        LinkedHashSet<String> linkedHashSet;
        synchronized (this.f2666f) {
            linkedHashSet = this.f2665e;
        }
        return linkedHashSet;
    }

    /* renamed from: c */
    public JSONArray mo13819c() {
        JSONArray jSONArray;
        synchronized (this.f2666f) {
            jSONArray = this.f2664d;
        }
        return jSONArray;
    }
}
