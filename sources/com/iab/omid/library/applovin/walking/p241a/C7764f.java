package com.iab.omid.library.applovin.walking.p241a;

import android.text.TextUtils;
import com.iab.omid.library.applovin.adsession.C7723a;
import com.iab.omid.library.applovin.p237b.C7725a;
import com.iab.omid.library.applovin.p239d.C7740b;
import com.iab.omid.library.applovin.walking.p241a.C7758b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.walking.a.f */
public class C7764f extends C7757a {
    public C7764f(C7758b.C7760b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m21654b(String str) {
        C7725a a = C7725a.m21466a();
        if (a != null) {
            for (C7723a next : a.mo54749b()) {
                if (this.f18760a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo54810a(str, this.f18762c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C7740b.m21548b(this.f18761b, this.f18764d.mo54857b())) {
            return null;
        }
        this.f18764d.mo54856a(this.f18761b);
        return this.f18761b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m21654b(str);
        }
        super.onPostExecute(str);
    }
}
