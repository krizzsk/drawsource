package com.iab.omid.library.vungle.walking.p277a;

import android.text.TextUtils;
import com.iab.omid.library.vungle.adsession.C8039a;
import com.iab.omid.library.vungle.p273b.C8041a;
import com.iab.omid.library.vungle.p275d.C8056b;
import com.iab.omid.library.vungle.walking.p277a.C8074b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.walking.a.f */
public class C8080f extends C8073a {
    public C8080f(C8074b.C8076b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m23109b(String str) {
        C8041a a = C8041a.m22925a();
        if (a != null) {
            for (C8039a next : a.mo56060b()) {
                if (this.f19523a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo56121a(str, this.f19525c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C8056b.m23006b(this.f19524b, this.f19527d.mo56167b())) {
            return null;
        }
        this.f19527d.mo56166a(this.f19524b);
        return this.f19524b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m23109b(str);
        }
        super.onPostExecute(str);
    }
}
