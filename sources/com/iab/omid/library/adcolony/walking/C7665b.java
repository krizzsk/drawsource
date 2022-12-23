package com.iab.omid.library.adcolony.walking;

import com.iab.omid.library.adcolony.walking.p229a.C7658b;
import com.iab.omid.library.adcolony.walking.p229a.C7661c;
import com.iab.omid.library.adcolony.walking.p229a.C7662d;
import com.iab.omid.library.adcolony.walking.p229a.C7663e;
import com.iab.omid.library.adcolony.walking.p229a.C7664f;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.walking.b */
public class C7665b implements C7658b.C7660b {

    /* renamed from: a */
    private JSONObject f18535a;

    /* renamed from: b */
    private final C7661c f18536b;

    public C7665b(C7661c cVar) {
        this.f18536b = cVar;
    }

    /* renamed from: a */
    public void mo54467a() {
        this.f18536b.mo54460b(new C7662d(this));
    }

    /* renamed from: a */
    public void mo54458a(JSONObject jSONObject) {
        this.f18535a = jSONObject;
    }

    /* renamed from: a */
    public void mo54468a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f18536b.mo54460b(new C7664f(this, hashSet, jSONObject, j));
    }

    /* renamed from: b */
    public JSONObject mo54459b() {
        return this.f18535a;
    }

    /* renamed from: b */
    public void mo54469b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f18536b.mo54460b(new C7663e(this, hashSet, jSONObject, j));
    }
}
