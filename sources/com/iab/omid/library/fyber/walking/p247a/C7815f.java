package com.iab.omid.library.fyber.walking.p247a;

import android.text.TextUtils;
import com.iab.omid.library.fyber.adsession.C7774a;
import com.iab.omid.library.fyber.p243b.C7776a;
import com.iab.omid.library.fyber.p245d.C7791b;
import com.iab.omid.library.fyber.walking.p247a.C7809b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.fyber.walking.a.f */
public class C7815f extends C7808a {
    public C7815f(C7809b.C7811b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m21884b(String str) {
        C7776a a = C7776a.m21696a();
        if (a != null) {
            for (C7774a next : a.mo54948b()) {
                if (this.f18877a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo55009a(str, this.f18879c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C7791b.m21778b(this.f18878b, this.f18881d.mo55056b())) {
            return null;
        }
        this.f18881d.mo55055a(this.f18878b);
        return this.f18878b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m21884b(str);
        }
        super.onPostExecute(str);
    }
}
