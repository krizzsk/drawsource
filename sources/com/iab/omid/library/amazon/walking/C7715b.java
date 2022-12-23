package com.iab.omid.library.amazon.walking;

import com.iab.omid.library.amazon.walking.p235a.C7708b;
import com.iab.omid.library.amazon.walking.p235a.C7711c;
import com.iab.omid.library.amazon.walking.p235a.C7712d;
import com.iab.omid.library.amazon.walking.p235a.C7713e;
import com.iab.omid.library.amazon.walking.p235a.C7714f;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.walking.b */
public class C7715b implements C7708b.C7710b {

    /* renamed from: a */
    private JSONObject f18652a;

    /* renamed from: b */
    private final C7711c f18653b;

    public C7715b(C7711c cVar) {
        this.f18653b = cVar;
    }

    /* renamed from: a */
    public void mo54666a() {
        this.f18653b.mo54659b(new C7712d(this));
    }

    /* renamed from: a */
    public void mo54657a(JSONObject jSONObject) {
        this.f18652a = jSONObject;
    }

    /* renamed from: a */
    public void mo54667a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f18653b.mo54659b(new C7714f(this, hashSet, jSONObject, j));
    }

    /* renamed from: b */
    public JSONObject mo54658b() {
        return this.f18652a;
    }

    /* renamed from: b */
    public void mo54668b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f18653b.mo54659b(new C7713e(this, hashSet, jSONObject, j));
    }
}
