package com.iab.omid.library.ironsrc.walking;

import com.iab.omid.library.ironsrc.walking.p259a.C7910b;
import com.iab.omid.library.ironsrc.walking.p259a.C7913c;
import com.iab.omid.library.ironsrc.walking.p259a.C7914d;
import com.iab.omid.library.ironsrc.walking.p259a.C7915e;
import com.iab.omid.library.ironsrc.walking.p259a.C7916f;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.walking.b */
public class C7917b implements C7910b.C7912b {

    /* renamed from: a */
    private JSONObject f19113a;

    /* renamed from: b */
    private final C7913c f19114b;

    public C7917b(C7913c cVar) {
        this.f19114b = cVar;
    }

    /* renamed from: a */
    public void mo55444a() {
        this.f19114b.mo55437b(new C7914d(this));
    }

    /* renamed from: a */
    public void mo55435a(JSONObject jSONObject) {
        this.f19113a = jSONObject;
    }

    /* renamed from: a */
    public void mo55445a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f19114b.mo55437b(new C7916f(this, hashSet, jSONObject, j));
    }

    /* renamed from: b */
    public JSONObject mo55436b() {
        return this.f19113a;
    }

    /* renamed from: b */
    public void mo55446b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f19114b.mo55437b(new C7915e(this, hashSet, jSONObject, j));
    }
}
