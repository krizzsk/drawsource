package com.iab.omid.library.oguryco.walking.p271a;

import com.iab.omid.library.oguryco.adsession.C7975a;
import com.iab.omid.library.oguryco.p267b.C7977a;
import com.iab.omid.library.oguryco.walking.p271a.C8011b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.oguryco.walking.a.e */
public class C8016e extends C8010a {
    public C8016e(C8011b.C8013b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m22785b(String str) {
        C7977a a = C7977a.m22601a();
        if (a != null) {
            for (C7975a next : a.mo55748b()) {
                if (this.f19342a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo55808b(str, this.f19344c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f19343b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        m22785b(str);
        super.onPostExecute(str);
    }
}
