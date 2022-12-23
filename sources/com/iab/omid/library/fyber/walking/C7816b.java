package com.iab.omid.library.fyber.walking;

import com.iab.omid.library.fyber.walking.p247a.C7809b;
import com.iab.omid.library.fyber.walking.p247a.C7812c;
import com.iab.omid.library.fyber.walking.p247a.C7813d;
import com.iab.omid.library.fyber.walking.p247a.C7814e;
import com.iab.omid.library.fyber.walking.p247a.C7815f;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.fyber.walking.b */
public class C7816b implements C7809b.C7811b {

    /* renamed from: a */
    private JSONObject f18886a;

    /* renamed from: b */
    private final C7812c f18887b;

    public C7816b(C7812c cVar) {
        this.f18887b = cVar;
    }

    /* renamed from: a */
    public void mo55064a() {
        this.f18887b.mo55057b(new C7813d(this));
    }

    /* renamed from: a */
    public void mo55055a(JSONObject jSONObject) {
        this.f18886a = jSONObject;
    }

    /* renamed from: a */
    public void mo55065a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f18887b.mo55057b(new C7815f(this, hashSet, jSONObject, j));
    }

    /* renamed from: b */
    public JSONObject mo55056b() {
        return this.f18886a;
    }

    /* renamed from: b */
    public void mo55066b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f18887b.mo55057b(new C7814e(this, hashSet, jSONObject, j));
    }
}
