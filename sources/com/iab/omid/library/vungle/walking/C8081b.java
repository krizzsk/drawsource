package com.iab.omid.library.vungle.walking;

import com.iab.omid.library.vungle.walking.p277a.C8074b;
import com.iab.omid.library.vungle.walking.p277a.C8077c;
import com.iab.omid.library.vungle.walking.p277a.C8078d;
import com.iab.omid.library.vungle.walking.p277a.C8079e;
import com.iab.omid.library.vungle.walking.p277a.C8080f;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.walking.b */
public class C8081b implements C8074b.C8076b {

    /* renamed from: a */
    private JSONObject f19532a;

    /* renamed from: b */
    private final C8077c f19533b;

    public C8081b(C8077c cVar) {
        this.f19533b = cVar;
    }

    /* renamed from: a */
    public void mo56175a() {
        this.f19533b.mo56168b(new C8078d(this));
    }

    /* renamed from: a */
    public void mo56166a(JSONObject jSONObject) {
        this.f19532a = jSONObject;
    }

    /* renamed from: a */
    public void mo56176a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f19533b.mo56168b(new C8080f(this, hashSet, jSONObject, j));
    }

    /* renamed from: b */
    public JSONObject mo56167b() {
        return this.f19532a;
    }

    /* renamed from: b */
    public void mo56177b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f19533b.mo56168b(new C8079e(this, hashSet, jSONObject, j));
    }
}
