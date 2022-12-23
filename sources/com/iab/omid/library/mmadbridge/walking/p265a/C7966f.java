package com.iab.omid.library.mmadbridge.walking.p265a;

import android.text.TextUtils;
import com.iab.omid.library.mmadbridge.adsession.C7925a;
import com.iab.omid.library.mmadbridge.p261b.C7927a;
import com.iab.omid.library.mmadbridge.p263d.C7942b;
import com.iab.omid.library.mmadbridge.walking.p265a.C7960b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mmadbridge.walking.a.f */
public class C7966f extends C7959a {
    public C7966f(C7960b.C7962b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m22559b(String str) {
        C7927a a = C7927a.m22371a();
        if (a != null) {
            for (C7925a next : a.mo55527b()) {
                if (this.f19221a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo55588a(str, this.f19223c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C7942b.m22453b(this.f19222b, this.f19225d.mo55635b())) {
            return null;
        }
        this.f19225d.mo55634a(this.f19222b);
        return this.f19222b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m22559b(str);
        }
        super.onPostExecute(str);
    }
}
