package com.applovin.impl.mediation.debugger;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.applovin.impl.mediation.debugger.p037b.p038a.C1665a;
import com.applovin.impl.mediation.debugger.p037b.p039b.C1671b;
import com.applovin.impl.mediation.debugger.p040c.C1676a;
import com.applovin.impl.mediation.debugger.p041ui.p043b.C1706b;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.network.C1995b;
import com.applovin.impl.sdk.p053e.C1887a;
import com.applovin.impl.sdk.p053e.C1918o;
import com.applovin.impl.sdk.utils.C2042a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxDebuggerActivity;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.a */
public class C1656a implements C1995b.C1999c<JSONObject> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static WeakReference<MaxDebuggerActivity> f2331a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final AtomicBoolean f2332b = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1969m f2333c;

    /* renamed from: d */
    private final C2102v f2334d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1706b f2335e;

    /* renamed from: f */
    private final Map<String, C1671b> f2336f = new HashMap();

    /* renamed from: g */
    private final AtomicBoolean f2337g = new AtomicBoolean();

    /* renamed from: h */
    private boolean f2338h;

    /* renamed from: i */
    private int f2339i = 2;

    /* renamed from: j */
    private boolean f2340j;

    /* renamed from: k */
    private final Context f2341k;

    public C1656a(C1969m mVar) {
        this.f2333c = mVar;
        this.f2334d = mVar.mo14509A();
        this.f2341k = mVar.mo14520L();
        this.f2335e = new C1706b(this.f2341k);
    }

    /* renamed from: a */
    private List<C1671b> m3378a(JSONObject jSONObject, C1969m mVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "networks", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null) {
                C1671b bVar = new C1671b(jSONObject2, mVar);
                arrayList.add(bVar);
                this.f2336f.put(bVar.mo13664m(), bVar);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: a */
    private List<C1665a> m3379a(JSONObject jSONObject, List<C1671b> list, C1969m mVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ad_units", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new C1665a(jSONObject2, this.f2336f, mVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: a */
    private void m3380a(List<C1671b> list) {
        boolean z;
        Iterator<C1671b> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            C1671b next = it.next();
            if (next.mo13656e() && next.mo13651a() == C1671b.C1672a.INVALID_INTEGRATION) {
                z = true;
                break;
            }
        }
        if (z) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                public void run() {
                    new AlertDialog.Builder(C1656a.this.f2333c.mo14556af().mo14045a()).setTitle("Review Integration Errors").setMessage("Looks like MAX Mediation Debugger flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this prompt will only be shown in your development builds. Live apps will not be affected.").setPositiveButton("Show Mediation Debugger", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                            C1656a.this.mo13612c();
                        }
                    }).setNegativeButton("DISMISS", (DialogInterface.OnClickListener) null).create().show();
                }
            }, TimeUnit.SECONDS.toMillis(2));
        }
    }

    /* renamed from: f */
    private void m3386f() {
        this.f2333c.mo14556af().mo14046a(new C2042a() {
            public void onActivityCreated(Activity activity, Bundle bundle) {
                if (activity instanceof MaxDebuggerActivity) {
                    C2102v.m5107f("AppLovinSdk", "Started mediation debugger");
                    if (!C1656a.this.m3387g() || C1656a.f2331a.get() != activity) {
                        MaxDebuggerActivity maxDebuggerActivity = (MaxDebuggerActivity) activity;
                        WeakReference unused = C1656a.f2331a = new WeakReference(maxDebuggerActivity);
                        maxDebuggerActivity.setListAdapter(C1656a.this.f2335e, C1656a.this.f2333c.mo14556af());
                    }
                    C1656a.f2332b.set(false);
                }
            }

            public void onActivityDestroyed(Activity activity) {
                if (activity instanceof MaxDebuggerActivity) {
                    C2102v.m5107f("AppLovinSdk", "Mediation debugger destroyed");
                    WeakReference unused = C1656a.f2331a = null;
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m3387g() {
        WeakReference<MaxDebuggerActivity> weakReference = f2331a;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* renamed from: a */
    public void mo13607a() {
        if (this.f2337g.compareAndSet(false, true)) {
            this.f2333c.mo14526S().mo14429a((C1887a) new C1676a(this, this.f2333c), C1918o.C1920a.MEDIATION_MAIN);
        }
    }

    /* renamed from: a */
    public void mo13585a(int i, String str, JSONObject jSONObject) {
        C2102v vVar = this.f2334d;
        vVar.mo15016e("MediationDebuggerService", "Unable to fetch mediation debugger info: server returned " + i);
        C2102v.m5110i("AppLovinSdk", "Unable to show mediation debugger.");
        this.f2335e.mo13733a((List<C1671b>) null, (List<C1665a>) null, (String) null, (String) null, (String) null, this.f2333c);
        this.f2337g.set(false);
    }

    /* renamed from: a */
    public void mo13587a(JSONObject jSONObject, int i) {
        List<C1671b> a = m3378a(jSONObject, this.f2333c);
        List<C1665a> a2 = m3379a(jSONObject, a, this.f2333c);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "alert", (JSONObject) null);
        List<C1671b> list = a;
        this.f2335e.mo13733a(list, a2, JsonUtils.getString(jSONObject2, "title", (String) null), JsonUtils.getString(jSONObject2, "message", (String) null), JsonUtils.getString(jSONObject, "account_id", (String) null), this.f2333c);
        if (mo13611b()) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                public void run() {
                    C1656a.this.mo13612c();
                }
            }, TimeUnit.SECONDS.toMillis((long) this.f2339i));
        } else {
            m3380a(a);
        }
    }

    /* renamed from: a */
    public void mo13610a(boolean z, int i) {
        this.f2338h = z;
        this.f2339i = i;
    }

    /* renamed from: b */
    public boolean mo13611b() {
        return this.f2338h;
    }

    /* renamed from: c */
    public void mo13612c() {
        mo13607a();
        if (m3387g() || !f2332b.compareAndSet(false, true)) {
            C2102v.m5110i("AppLovinSdk", "Mediation debugger is already showing");
            return;
        }
        if (!this.f2340j) {
            m3386f();
            this.f2340j = true;
        }
        Intent intent = new Intent(this.f2341k, MaxDebuggerActivity.class);
        intent.setFlags(268435456);
        C2102v.m5107f("AppLovinSdk", "Starting mediation debugger...");
        this.f2341k.startActivity(intent);
    }

    public String toString() {
        return "MediationDebuggerService{, listAdapter=" + this.f2335e + "}";
    }
}
