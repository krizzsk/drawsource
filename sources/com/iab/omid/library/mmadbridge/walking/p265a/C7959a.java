package com.iab.omid.library.mmadbridge.walking.p265a;

import com.iab.omid.library.mmadbridge.walking.p265a.C7960b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mmadbridge.walking.a.a */
public abstract class C7959a extends C7960b {

    /* renamed from: a */
    protected final HashSet<String> f19221a;

    /* renamed from: b */
    protected final JSONObject f19222b;

    /* renamed from: c */
    protected final long f19223c;

    public C7959a(C7960b.C7962b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar);
        this.f19221a = new HashSet<>(hashSet);
        this.f19222b = jSONObject;
        this.f19223c = j;
    }
}
