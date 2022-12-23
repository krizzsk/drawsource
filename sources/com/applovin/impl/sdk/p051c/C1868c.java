package com.applovin.impl.sdk.p051c;

import android.content.Context;
import android.content.SharedPreferences;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.c.c */
public class C1868c {

    /* renamed from: a */
    protected final C1969m f3361a;

    /* renamed from: b */
    protected final Context f3362b;

    /* renamed from: c */
    protected final SharedPreferences f3363c;

    /* renamed from: d */
    private final Map<String, Object> f3364d = new HashMap();

    /* renamed from: e */
    private final Object f3365e = new Object();

    public C1868c(C1969m mVar) {
        this.f3361a = mVar;
        Context L = mVar.mo14520L();
        this.f3362b = L;
        this.f3363c = L.getSharedPreferences("com.applovin.sdk.1", 0);
        try {
            Class.forName(C1867b.class.getName());
            Class.forName(C1866a.class.getName());
        } catch (Throwable unused) {
        }
        mo14289b();
    }

    /* renamed from: a */
    private static Object m4084a(String str, JSONObject jSONObject, Object obj) throws JSONException {
        if (obj instanceof Boolean) {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        }
        if (obj instanceof Float) {
            return Float.valueOf((float) jSONObject.getDouble(str));
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(jSONObject.getInt(str));
        }
        if (obj instanceof Long) {
            return Long.valueOf(jSONObject.getLong(str));
        }
        if (obj instanceof String) {
            return jSONObject.getString(str);
        }
        throw new RuntimeException("SDK Error: unknown value type: " + obj.getClass());
    }

    /* renamed from: e */
    private String m4085e() {
        return "com.applovin.sdk." + Utils.shortenKey(this.f3361a.mo14597z()) + ".";
    }

    /* renamed from: a */
    public <T> C1867b<T> mo14283a(String str, C1867b<T> bVar) {
        synchronized (this.f3365e) {
            for (C1867b<T> next : C1867b.m4080c()) {
                if (next.mo14280a().equals(str)) {
                    return next;
                }
            }
            return bVar;
        }
    }

    /* renamed from: a */
    public <T> T mo14284a(C1867b<T> bVar) {
        if (bVar != null) {
            synchronized (this.f3365e) {
                Object obj = this.f3364d.get(bVar.mo14280a());
                if (obj == null) {
                    T b = bVar.mo14281b();
                    return b;
                }
                T a = bVar.mo14279a(obj);
                return a;
            }
        }
        throw new IllegalArgumentException("No setting type specified");
    }

    /* renamed from: a */
    public void mo14285a() {
        String e = m4085e();
        synchronized (this.f3365e) {
            SharedPreferences.Editor edit = this.f3363c.edit();
            for (C1867b next : C1867b.m4080c()) {
                Object obj = this.f3364d.get(next.mo14280a());
                if (obj != null) {
                    this.f3361a.mo14547a(e + next.mo14280a(), obj, edit);
                }
            }
            edit.apply();
        }
    }

    /* renamed from: a */
    public <T> void mo14286a(C1867b<?> bVar, Object obj) {
        if (bVar == null) {
            throw new IllegalArgumentException("No setting type specified");
        } else if (obj != null) {
            synchronized (this.f3365e) {
                this.f3364d.put(bVar.mo14280a(), obj);
            }
        } else {
            throw new IllegalArgumentException("No new value specified");
        }
    }

    /* renamed from: a */
    public void mo14287a(JSONObject jSONObject) {
        C2102v A;
        String str;
        String str2;
        synchronized (this.f3365e) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && next.length() > 0) {
                    try {
                        C1867b<Long> a = mo14283a(next, (C1867b) null);
                        if (a != null) {
                            this.f3364d.put(a.mo14280a(), m4084a(next, jSONObject, a.mo14281b()));
                            if (a == C1867b.f3350er) {
                                this.f3364d.put(C1867b.f3351es.mo14280a(), Long.valueOf(System.currentTimeMillis()));
                            }
                        }
                    } catch (JSONException e) {
                        th = e;
                        if (C2102v.m5104a()) {
                            A = this.f3361a.mo14509A();
                            str = "SettingsManager";
                            str2 = "Unable to parse JSON settingsValues array";
                            A.mo15013b(str, str2, th);
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (C2102v.m5104a()) {
                            A = this.f3361a.mo14509A();
                            str = "SettingsManager";
                            str2 = "Unable to convert setting object ";
                            A.mo15013b(str, str2, th);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.applovin.impl.sdk.c.b<java.lang.String>, com.applovin.impl.sdk.c.b] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<java.lang.String> mo14288b(com.applovin.impl.sdk.p051c.C1867b<java.lang.String> r1) {
        /*
            r0 = this;
            java.lang.Object r1 = r0.mo14284a(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.util.List r1 = com.applovin.impl.sdk.utils.CollectionUtils.explode(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.p051c.C1868c.mo14288b(com.applovin.impl.sdk.c.b):java.util.List");
    }

    /* renamed from: b */
    public void mo14289b() {
        String e = m4085e();
        synchronized (this.f3365e) {
            for (C1867b next : C1867b.m4080c()) {
                try {
                    Object a = this.f3361a.mo14536a(e + next.mo14280a(), null, next.mo14281b().getClass(), this.f3363c);
                    if (a != null) {
                        this.f3364d.put(next.mo14280a(), a);
                    }
                } catch (Exception e2) {
                    if (C2102v.m5104a()) {
                        C2102v A = this.f3361a.mo14509A();
                        A.mo15013b("SettingsManager", "Unable to load \"" + next.mo14280a() + "\"", e2);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public List<MaxAdFormat> mo14290c(C1867b<String> bVar) {
        ArrayList arrayList = new ArrayList(6);
        for (String formatFromString : mo14288b(bVar)) {
            arrayList.add(MaxAdFormat.formatFromString(formatFromString));
        }
        return arrayList;
    }

    /* renamed from: c */
    public void mo14291c() {
        synchronized (this.f3365e) {
            this.f3364d.clear();
        }
        this.f3361a.mo14539a(this.f3363c);
    }

    /* renamed from: d */
    public boolean mo14292d() {
        return this.f3361a.mo14586p().isVerboseLoggingEnabled() || ((Boolean) mo14284a(C1867b.f3127ab)).booleanValue();
    }
}
