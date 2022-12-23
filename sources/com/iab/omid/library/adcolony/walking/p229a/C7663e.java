package com.iab.omid.library.adcolony.walking.p229a;

import com.iab.omid.library.adcolony.adsession.C7623a;
import com.iab.omid.library.adcolony.p225b.C7625a;
import com.iab.omid.library.adcolony.walking.p229a.C7658b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.walking.a.e */
public class C7663e extends C7657a {
    public C7663e(C7658b.C7660b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m21191b(String str) {
        C7625a a = C7625a.m21006a();
        if (a != null) {
            for (C7623a next : a.mo54351b()) {
                if (this.f18526a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo54417b(str, this.f18528c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f18527b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        m21191b(str);
        super.onPostExecute(str);
    }
}
