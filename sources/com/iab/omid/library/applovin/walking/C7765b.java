package com.iab.omid.library.applovin.walking;

import com.iab.omid.library.applovin.walking.p241a.C7758b;
import com.iab.omid.library.applovin.walking.p241a.C7761c;
import com.iab.omid.library.applovin.walking.p241a.C7762d;
import com.iab.omid.library.applovin.walking.p241a.C7763e;
import com.iab.omid.library.applovin.walking.p241a.C7764f;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.walking.b */
public class C7765b implements C7758b.C7760b {

    /* renamed from: a */
    private JSONObject f18769a;

    /* renamed from: b */
    private final C7761c f18770b;

    public C7765b(C7761c cVar) {
        this.f18770b = cVar;
    }

    /* renamed from: a */
    public void mo54865a() {
        this.f18770b.mo54858b(new C7762d(this));
    }

    /* renamed from: a */
    public void mo54856a(JSONObject jSONObject) {
        this.f18769a = jSONObject;
    }

    /* renamed from: a */
    public void mo54866a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f18770b.mo54858b(new C7764f(this, hashSet, jSONObject, j));
    }

    /* renamed from: b */
    public JSONObject mo54857b() {
        return this.f18769a;
    }

    /* renamed from: b */
    public void mo54867b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f18770b.mo54858b(new C7763e(this, hashSet, jSONObject, j));
    }
}
