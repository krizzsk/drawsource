package p399g;

import android.text.TextUtils;
import com.iab.omid.library.smaato.adsession.C8021a;
import java.util.HashSet;
import org.json.JSONObject;
import p012c.C0689a;
import p397e.C12465b;
import p399g.C12473b;

/* renamed from: g.f */
public class C12479f extends C12472a {
    public C12479f(C12473b.C12475b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m33341b(String str) {
        C0689a c = C0689a.m34c();
        if (c != null) {
            for (C8021a next : c.mo10263b()) {
                if (this.f29793c.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo55947b(str, this.f29795e);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C12465b.m33301g(this.f29794d, this.f29797b.mo72489a())) {
            return null;
        }
        this.f29797b.mo72490a(this.f29794d);
        return this.f29794d.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m33341b(str);
        }
        super.onPostExecute(str);
    }
}
