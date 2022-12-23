package com.iab.omid.library.mmadbridge.walking;

import com.iab.omid.library.mmadbridge.walking.p265a.C7960b;
import com.iab.omid.library.mmadbridge.walking.p265a.C7963c;
import com.iab.omid.library.mmadbridge.walking.p265a.C7964d;
import com.iab.omid.library.mmadbridge.walking.p265a.C7965e;
import com.iab.omid.library.mmadbridge.walking.p265a.C7966f;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mmadbridge.walking.b */
public class C7967b implements C7960b.C7962b {

    /* renamed from: a */
    private JSONObject f19230a;

    /* renamed from: b */
    private final C7963c f19231b;

    public C7967b(C7963c cVar) {
        this.f19231b = cVar;
    }

    /* renamed from: a */
    public void mo55643a() {
        this.f19231b.mo55636b(new C7964d(this));
    }

    /* renamed from: a */
    public void mo55634a(JSONObject jSONObject) {
        this.f19230a = jSONObject;
    }

    /* renamed from: a */
    public void mo55644a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f19231b.mo55636b(new C7966f(this, hashSet, jSONObject, j));
    }

    /* renamed from: b */
    public JSONObject mo55635b() {
        return this.f19230a;
    }

    /* renamed from: b */
    public void mo55645b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f19231b.mo55636b(new C7965e(this, hashSet, jSONObject, j));
    }
}
