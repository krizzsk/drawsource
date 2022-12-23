package com.iab.omid.library.vungle.walking.p277a;

import com.iab.omid.library.vungle.adsession.C8039a;
import com.iab.omid.library.vungle.p273b.C8041a;
import com.iab.omid.library.vungle.walking.p277a.C8074b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.walking.a.e */
public class C8079e extends C8073a {
    public C8079e(C8074b.C8076b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m23106b(String str) {
        C8041a a = C8041a.m22925a();
        if (a != null) {
            for (C8039a next : a.mo56060b()) {
                if (this.f19523a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo56126b(str, this.f19525c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f19524b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        m23106b(str);
        super.onPostExecute(str);
    }
}
