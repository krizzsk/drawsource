package com.iab.omid.library.inmobi.walking;

import com.iab.omid.library.inmobi.walking.p253a.C7860b;
import com.iab.omid.library.inmobi.walking.p253a.C7863c;
import com.iab.omid.library.inmobi.walking.p253a.C7864d;
import com.iab.omid.library.inmobi.walking.p253a.C7865e;
import com.iab.omid.library.inmobi.walking.p253a.C7866f;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.inmobi.walking.b */
public class C7867b implements C7860b.C7862b {

    /* renamed from: a */
    private JSONObject f18999a;

    /* renamed from: b */
    private final C7863c f19000b;

    public C7867b(C7863c cVar) {
        this.f19000b = cVar;
    }

    /* renamed from: a */
    public void mo55258a() {
        this.f19000b.mo55251b(new C7864d(this));
    }

    /* renamed from: a */
    public void mo55249a(JSONObject jSONObject) {
        this.f18999a = jSONObject;
    }

    /* renamed from: a */
    public void mo55259a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f19000b.mo55251b(new C7866f(this, hashSet, jSONObject, j));
    }

    /* renamed from: b */
    public JSONObject mo55250b() {
        return this.f18999a;
    }

    /* renamed from: b */
    public void mo55260b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f19000b.mo55251b(new C7865e(this, hashSet, jSONObject, j));
    }
}
