package com.iab.omid.library.ironsrc.walking.p259a;

import com.iab.omid.library.ironsrc.adsession.C7875a;
import com.iab.omid.library.ironsrc.p255b.C7877a;
import com.iab.omid.library.ironsrc.walking.p259a.C7910b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.walking.a.e */
public class C7915e extends C7909a {
    public C7915e(C7910b.C7912b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m22326b(String str) {
        C7877a a = C7877a.m22148a();
        if (a != null) {
            for (C7875a next : a.mo55337b()) {
                if (this.f19104a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo55395b(str, this.f19106c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f19105b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        m22326b(str);
        super.onPostExecute(str);
    }
}
