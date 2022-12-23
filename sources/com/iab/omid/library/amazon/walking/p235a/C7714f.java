package com.iab.omid.library.amazon.walking.p235a;

import android.text.TextUtils;
import com.iab.omid.library.amazon.adsession.C7673a;
import com.iab.omid.library.amazon.p231b.C7675a;
import com.iab.omid.library.amazon.p233d.C7690b;
import com.iab.omid.library.amazon.walking.p235a.C7708b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.walking.a.f */
public class C7714f extends C7707a {
    public C7714f(C7708b.C7710b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m21424b(String str) {
        C7675a a = C7675a.m21236a();
        if (a != null) {
            for (C7673a next : a.mo54550b()) {
                if (this.f18643a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo54611a(str, this.f18645c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C7690b.m21318b(this.f18644b, this.f18647d.mo54658b())) {
            return null;
        }
        this.f18647d.mo54657a(this.f18644b);
        return this.f18644b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m21424b(str);
        }
        super.onPostExecute(str);
    }
}
