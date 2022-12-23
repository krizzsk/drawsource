package p399g;

import com.iab.omid.library.smaato.adsession.C8021a;
import java.util.HashSet;
import org.json.JSONObject;
import p012c.C0689a;
import p399g.C12473b;

/* renamed from: g.e */
public class C12478e extends C12472a {
    public C12478e(C12473b.C12475b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m33338b(String str) {
        C0689a c = C0689a.m34c();
        if (c != null) {
            for (C8021a next : c.mo10263b()) {
                if (this.f29793c.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo55942a(str, this.f29795e);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f29794d.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        m33338b(str);
        super.onPostExecute(str);
    }
}
