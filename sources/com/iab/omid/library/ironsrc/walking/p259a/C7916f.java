package com.iab.omid.library.ironsrc.walking.p259a;

import android.text.TextUtils;
import com.iab.omid.library.ironsrc.adsession.C7875a;
import com.iab.omid.library.ironsrc.p255b.C7877a;
import com.iab.omid.library.ironsrc.p257d.C7892b;
import com.iab.omid.library.ironsrc.walking.p259a.C7910b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.walking.a.f */
public class C7916f extends C7909a {
    public C7916f(C7910b.C7912b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m22329b(String str) {
        C7877a a = C7877a.m22148a();
        if (a != null) {
            for (C7875a next : a.mo55337b()) {
                if (this.f19104a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo55390a(str, this.f19106c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C7892b.m22226b(this.f19105b, this.f19108d.mo55436b())) {
            return null;
        }
        this.f19108d.mo55435a(this.f19105b);
        return this.f19105b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m22329b(str);
        }
        super.onPostExecute(str);
    }
}
