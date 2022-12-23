package com.iab.omid.library.mmadbridge.walking.p265a;

import com.iab.omid.library.mmadbridge.adsession.C7925a;
import com.iab.omid.library.mmadbridge.p261b.C7927a;
import com.iab.omid.library.mmadbridge.walking.p265a.C7960b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mmadbridge.walking.a.e */
public class C7965e extends C7959a {
    public C7965e(C7960b.C7962b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m22556b(String str) {
        C7927a a = C7927a.m22371a();
        if (a != null) {
            for (C7925a next : a.mo55527b()) {
                if (this.f19221a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo55593b(str, this.f19223c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f19222b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        m22556b(str);
        super.onPostExecute(str);
    }
}
