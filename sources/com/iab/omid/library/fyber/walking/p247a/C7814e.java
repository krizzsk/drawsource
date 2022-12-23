package com.iab.omid.library.fyber.walking.p247a;

import com.iab.omid.library.fyber.adsession.C7774a;
import com.iab.omid.library.fyber.p243b.C7776a;
import com.iab.omid.library.fyber.walking.p247a.C7809b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.fyber.walking.a.e */
public class C7814e extends C7808a {
    public C7814e(C7809b.C7811b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m21881b(String str) {
        C7776a a = C7776a.m21696a();
        if (a != null) {
            for (C7774a next : a.mo54948b()) {
                if (this.f18877a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo55014b(str, this.f18879c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f18878b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        m21881b(str);
        super.onPostExecute(str);
    }
}
