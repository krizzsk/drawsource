package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.model.j */
public final class C6659j {

    /* renamed from: a */
    public ArrayList<C6660k> f17367a = new ArrayList<>();

    /* renamed from: b */
    public C6660k f17368b;

    /* renamed from: c */
    public C6652c f17369c;

    /* renamed from: d */
    public JSONObject f17370d;

    public C6659j(C6652c cVar) {
        this.f17369c = cVar;
    }

    /* renamed from: a */
    public final C6660k mo36780a() {
        Iterator<C6660k> it = this.f17367a.iterator();
        while (it.hasNext()) {
            C6660k next = it.next();
            if (next.f17373c) {
                return next;
            }
        }
        return this.f17368b;
    }

    /* renamed from: a */
    public final C6660k mo36781a(String str) {
        Iterator<C6660k> it = this.f17367a.iterator();
        while (it.hasNext()) {
            C6660k next = it.next();
            if (next.f17372b.equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final String mo36782b() {
        JSONObject jSONObject = this.f17370d;
        return (jSONObject == null || TextUtils.isEmpty(jSONObject.optString("adapterName"))) ? IronSourceConstants.SUPERSONIC_CONFIG_NAME : this.f17370d.optString("adapterName");
    }
}
