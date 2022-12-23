package com.iab.omid.library.amazon.walking.p235a;

import com.iab.omid.library.amazon.adsession.C7673a;
import com.iab.omid.library.amazon.p231b.C7675a;
import com.iab.omid.library.amazon.walking.p235a.C7708b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.walking.a.e */
public class C7713e extends C7707a {
    public C7713e(C7708b.C7710b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m21421b(String str) {
        C7675a a = C7675a.m21236a();
        if (a != null) {
            for (C7673a next : a.mo54550b()) {
                if (this.f18643a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo54616b(str, this.f18645c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f18644b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        m21421b(str);
        super.onPostExecute(str);
    }
}
