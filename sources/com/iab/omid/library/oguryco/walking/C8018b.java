package com.iab.omid.library.oguryco.walking;

import com.iab.omid.library.oguryco.walking.p271a.C8011b;
import com.iab.omid.library.oguryco.walking.p271a.C8014c;
import com.iab.omid.library.oguryco.walking.p271a.C8015d;
import com.iab.omid.library.oguryco.walking.p271a.C8016e;
import com.iab.omid.library.oguryco.walking.p271a.C8017f;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.oguryco.walking.b */
public class C8018b implements C8011b.C8013b {

    /* renamed from: a */
    private JSONObject f19351a;

    /* renamed from: b */
    private final C8014c f19352b;

    public C8018b(C8014c cVar) {
        this.f19352b = cVar;
    }

    /* renamed from: a */
    public void mo55857a() {
        this.f19352b.mo55850b(new C8015d(this));
    }

    /* renamed from: a */
    public void mo55848a(JSONObject jSONObject) {
        this.f19351a = jSONObject;
    }

    /* renamed from: a */
    public void mo55858a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f19352b.mo55850b(new C8017f(this, hashSet, jSONObject, j));
    }

    /* renamed from: b */
    public JSONObject mo55849b() {
        return this.f19351a;
    }

    /* renamed from: b */
    public void mo55859b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f19352b.mo55850b(new C8016e(this, hashSet, jSONObject, j));
    }
}
