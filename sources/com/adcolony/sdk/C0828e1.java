package com.adcolony.sdk;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.e1 */
class C0828e1 {

    /* renamed from: a */
    private final JSONArray f466a;

    C0828e1() {
        this(new JSONArray());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Object mo10749a(int i) throws JSONException {
        return this.f466a.get(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo10753b(int i) throws JSONException {
        return this.f466a.getInt(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0832f1 mo10755c(int i) {
        C0832f1 f1Var;
        synchronized (this.f466a) {
            JSONObject optJSONObject = this.f466a.optJSONObject(i);
            f1Var = optJSONObject != null ? new C0832f1(optJSONObject) : new C0832f1();
        }
        return f1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo10757d(int i) {
        String optString;
        synchronized (this.f466a) {
            optString = this.f466a.optString(i);
        }
        return optString;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo10759e(int i) {
        synchronized (this.f466a) {
            if (!this.f466a.isNull(i)) {
                Object opt = this.f466a.opt(i);
                if (opt instanceof String) {
                    String str = (String) opt;
                    return str;
                } else if (opt != null) {
                    String valueOf = String.valueOf(opt);
                    return valueOf;
                }
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C0828e1 mo10760f(int i) {
        synchronized (this.f466a) {
            this.f466a.put(i);
        }
        return this;
    }

    public String toString() {
        String jSONArray;
        synchronized (this.f466a) {
            jSONArray = this.f466a.toString();
        }
        return jSONArray;
    }

    C0828e1(String str) throws JSONException {
        this(new JSONArray(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0828e1 mo10748a(C0832f1 f1Var) {
        synchronized (this.f466a) {
            this.f466a.put(f1Var.mo10780a());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0828e1 mo10754b(String str) {
        synchronized (this.f466a) {
            this.f466a.put(str);
        }
        return this;
    }

    C0828e1(JSONArray jSONArray) throws NullPointerException {
        jSONArray.getClass();
        this.f466a = jSONArray;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String[] mo10758d() {
        String[] strArr;
        synchronized (this.f466a) {
            strArr = new String[this.f466a.length()];
            for (int i = 0; i < this.f466a.length(); i++) {
                strArr[i] = mo10757d(i);
            }
        }
        return strArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo10751a(String str) {
        boolean z;
        synchronized (this.f466a) {
            z = false;
            int i = 0;
            while (true) {
                if (i >= this.f466a.length()) {
                    break;
                } else if (mo10757d(i).equals(str)) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo10752b() {
        return this.f466a.length();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0832f1[] mo10756c() {
        C0832f1[] f1VarArr;
        synchronized (this.f466a) {
            f1VarArr = new C0832f1[this.f466a.length()];
            for (int i = 0; i < this.f466a.length(); i++) {
                f1VarArr[i] = mo10755c(i);
            }
        }
        return f1VarArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONArray mo10750a() {
        return this.f466a;
    }
}
