package com.adcolony.sdk;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.f1 */
class C0832f1 {

    /* renamed from: a */
    private final JSONObject f474a;

    C0832f1() {
        this(new JSONObject());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10782a(C0832f1 f1Var) {
        if (f1Var != null) {
            synchronized (this.f474a) {
                synchronized (f1Var.f474a) {
                    Iterator<String> c = f1Var.m538c();
                    while (c.hasNext()) {
                        String next = c.next();
                        try {
                            this.f474a.put(next, f1Var.f474a.get(next));
                        } catch (JSONException unused) {
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo10786b(String str) throws JSONException {
        int i;
        synchronized (this.f474a) {
            i = this.f474a.getInt(str);
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0828e1 mo10792c(String str) throws JSONException {
        C0828e1 e1Var;
        synchronized (this.f474a) {
            e1Var = new C0828e1(this.f474a.getJSONArray(str));
        }
        return e1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public long mo10795d(String str) throws JSONException {
        long j;
        synchronized (this.f474a) {
            j = this.f474a.getLong(str);
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo10796e(String str) throws JSONException {
        String string;
        synchronized (this.f474a) {
            string = this.f474a.getString(str);
        }
        return string;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo10799f(String str) {
        boolean optBoolean;
        synchronized (this.f474a) {
            optBoolean = this.f474a.optBoolean(str);
        }
        return optBoolean;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Boolean mo10800g(String str) {
        Boolean valueOf;
        try {
            synchronized (this.f474a) {
                valueOf = Boolean.valueOf(this.f474a.getBoolean(str));
            }
            return valueOf;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public double mo10801h(String str) {
        double optDouble;
        synchronized (this.f474a) {
            optDouble = this.f474a.optDouble(str);
        }
        return optDouble;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Integer mo10802i(String str) {
        Integer valueOf;
        try {
            synchronized (this.f474a) {
                valueOf = Integer.valueOf(this.f474a.getInt(str));
            }
            return valueOf;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo10803j(String str) {
        int optInt;
        synchronized (this.f474a) {
            optInt = this.f474a.optInt(str);
        }
        return optInt;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C0828e1 mo10804k(String str) {
        C0828e1 e1Var;
        synchronized (this.f474a) {
            JSONArray optJSONArray = this.f474a.optJSONArray(str);
            e1Var = optJSONArray != null ? new C0828e1(optJSONArray) : new C0828e1();
        }
        return e1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C0828e1 mo10805l(String str) {
        C0828e1 e1Var;
        synchronized (this.f474a) {
            JSONArray optJSONArray = this.f474a.optJSONArray(str);
            e1Var = optJSONArray != null ? new C0828e1(optJSONArray) : null;
        }
        return e1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public C0832f1 mo10806m(String str) {
        C0832f1 f1Var;
        synchronized (this.f474a) {
            JSONObject optJSONObject = this.f474a.optJSONObject(str);
            f1Var = optJSONObject != null ? new C0832f1(optJSONObject) : new C0832f1();
        }
        return f1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C0832f1 mo10807n(String str) {
        C0832f1 f1Var;
        synchronized (this.f474a) {
            JSONObject optJSONObject = this.f474a.optJSONObject(str);
            f1Var = optJSONObject != null ? new C0832f1(optJSONObject) : null;
        }
        return f1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public Object mo10808o(String str) {
        Object opt;
        synchronized (this.f474a) {
            opt = this.f474a.isNull(str) ? null : this.f474a.opt(str);
        }
        return opt;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public String mo10809p(String str) {
        String optString;
        synchronized (this.f474a) {
            optString = this.f474a.optString(str);
        }
        return optString;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0022, code lost:
        return null;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo10810q(java.lang.String r3) {
        /*
            r2 = this;
            org.json.JSONObject r0 = r2.f474a
            monitor-enter(r0)
            org.json.JSONObject r1 = r2.f474a     // Catch:{ all -> 0x0024 }
            boolean r1 = r1.isNull(r3)     // Catch:{ all -> 0x0024 }
            if (r1 != 0) goto L_0x0021
            org.json.JSONObject r1 = r2.f474a     // Catch:{ all -> 0x0024 }
            java.lang.Object r3 = r1.opt(r3)     // Catch:{ all -> 0x0024 }
            boolean r1 = r3 instanceof java.lang.String     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x0019
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0024 }
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            return r3
        L_0x0019:
            if (r3 == 0) goto L_0x0021
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0024 }
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            return r3
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            r3 = 0
            return r3
        L_0x0024:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0832f1.mo10810q(java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo10811r(String str) {
        synchronized (this.f474a) {
            this.f474a.remove(str);
        }
    }

    public String toString() {
        String jSONObject;
        synchronized (this.f474a) {
            jSONObject = this.f474a.toString();
        }
        return jSONObject;
    }

    C0832f1(String str) throws JSONException {
        this(new JSONObject(str));
    }

    C0832f1(Map<?, ?> map) {
        this(new JSONObject(map));
    }

    C0832f1(JSONObject jSONObject) throws NullPointerException {
        jSONObject.getClass();
        this.f474a = jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0832f1 mo10790b(String str, boolean z) throws JSONException {
        synchronized (this.f474a) {
            this.f474a.put(str, z);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo10793c(String str, int i) throws JSONException {
        synchronized (this.f474a) {
            if (this.f474a.has(str)) {
                return false;
            }
            this.f474a.put(str, i);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo10794d() {
        return this.f474a.length();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo10797e() {
        synchronized (this.f474a) {
            Iterator<String> c = m538c();
            while (c.hasNext()) {
                Object o = mo10808o(c.next());
                if (o == null || (((o instanceof JSONArray) && ((JSONArray) o).length() == 0) || (((o instanceof JSONObject) && ((JSONObject) o).length() == 0) || o.equals("")))) {
                    c.remove();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Map<String, String> mo10798f() {
        HashMap hashMap = new HashMap();
        synchronized (this.f474a) {
            Iterator<String> c = m538c();
            while (c.hasNext()) {
                String next = c.next();
                hashMap.put(next, mo10809p(next));
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0832f1 mo10788b(String str, int i) throws JSONException {
        synchronized (this.f474a) {
            this.f474a.put(str, i);
        }
        return this;
    }

    /* renamed from: c */
    private Iterator<String> m538c() {
        return this.f474a.keys();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0832f1 mo10789b(String str, long j) throws JSONException {
        synchronized (this.f474a) {
            this.f474a.put(str, j);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0832f1 mo10787b(String str, double d) throws JSONException {
        synchronized (this.f474a) {
            this.f474a.put(str, d);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo10784a(String str) {
        boolean z;
        synchronized (this.f474a) {
            Iterator<String> c = m538c();
            while (true) {
                if (c.hasNext()) {
                    if (str.equals(c.next())) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo10791b() {
        return mo10794d() == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo10785a(String str, boolean z) {
        boolean optBoolean;
        synchronized (this.f474a) {
            optBoolean = this.f474a.optBoolean(str, z);
        }
        return optBoolean;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo10775a(String str, int i) {
        int optInt;
        synchronized (this.f474a) {
            optInt = this.f474a.optInt(str, i);
        }
        return optInt;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo10776a(String str, long j) {
        long optLong;
        synchronized (this.f474a) {
            optLong = this.f474a.optLong(str, j);
        }
        return optLong;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public double mo10774a(String str, double d) {
        double optDouble;
        synchronized (this.f474a) {
            optDouble = this.f474a.optDouble(str, d);
        }
        return optDouble;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0832f1 mo10779a(String str, String str2) throws JSONException {
        synchronized (this.f474a) {
            this.f474a.put(str, str2);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0832f1 mo10778a(String str, C0832f1 f1Var) throws JSONException {
        synchronized (this.f474a) {
            this.f474a.put(str, f1Var.mo10780a());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0832f1 mo10777a(String str, C0828e1 e1Var) throws JSONException {
        synchronized (this.f474a) {
            this.f474a.put(str, e1Var.mo10750a());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10783a(String[] strArr) {
        synchronized (this.f474a) {
            for (String remove : strArr) {
                this.f474a.remove(remove);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10781a(C0828e1 e1Var) {
        synchronized (this.f474a) {
            Iterator<String> c = m538c();
            while (c.hasNext()) {
                if (!e1Var.mo10751a(c.next())) {
                    c.remove();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONObject mo10780a() {
        return this.f474a;
    }
}
