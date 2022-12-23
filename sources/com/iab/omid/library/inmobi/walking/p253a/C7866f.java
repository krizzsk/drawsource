package com.iab.omid.library.inmobi.walking.p253a;

import android.text.TextUtils;
import com.iab.omid.library.inmobi.adsession.C7825a;
import com.iab.omid.library.inmobi.p249b.C7827a;
import com.iab.omid.library.inmobi.p251d.C7842b;
import com.iab.omid.library.inmobi.walking.p253a.C7860b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.inmobi.walking.a.f */
public class C7866f extends C7859a {
    public C7866f(C7860b.C7862b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m22108b(String str) {
        C7827a a = C7827a.m21924a();
        if (a != null) {
            for (C7825a next : a.mo55143b()) {
                if (this.f18990a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo55204a(str, this.f18992c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C7842b.m22005b(this.f18991b, this.f18994d.mo55250b())) {
            return null;
        }
        this.f18994d.mo55249a(this.f18991b);
        return this.f18991b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m22108b(str);
        }
        super.onPostExecute(str);
    }
}
