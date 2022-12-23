package com.ironsource.sdk.p286h;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.h.d */
public final class C8306d {

    /* renamed from: a */
    private String f20268a;

    public C8306d(String str) {
        this.f20268a = str;
    }

    /* renamed from: a */
    private boolean m23658a(JSONObject jSONObject) {
        return IronSourceStorageUtils.saveFile(jSONObject.toString().getBytes(), m23659b().getPath()) != 0;
    }

    /* renamed from: b */
    private C8305c m23659b() {
        C8305c cVar = new C8305c(this.f20268a, "metadata.json");
        if (!cVar.exists()) {
            IronSourceStorageUtils.saveFile(new JSONObject().toString().getBytes(), cVar.getPath());
        }
        return cVar;
    }

    /* renamed from: a */
    public final synchronized JSONObject mo56752a() {
        return new JSONObject(IronSourceStorageUtils.readFile(m23659b()));
    }

    /* renamed from: a */
    public final synchronized boolean mo56753a(String str) {
        JSONObject a = mo56752a();
        if (!a.has(str)) {
            return true;
        }
        a.remove(str);
        return m23658a(a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized boolean mo56754a(String str, JSONObject jSONObject) {
        JSONObject a;
        a = mo56752a();
        a.put(str, jSONObject);
        return m23658a(a);
    }

    /* renamed from: a */
    public final boolean mo56755a(ArrayList<C8305c> arrayList) {
        Iterator<C8305c> it = arrayList.iterator();
        boolean z = true;
        while (it.hasNext()) {
            if (!mo56753a(it.next().getName())) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    public final synchronized boolean mo56756b(String str, JSONObject jSONObject) {
        JSONObject a;
        a = mo56752a();
        JSONObject optJSONObject = a.optJSONObject(str);
        if (optJSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                optJSONObject.putOpt(next, jSONObject.opt(next));
            }
        } else {
            a.putOpt(str, jSONObject);
        }
        return m23658a(a);
    }
}
