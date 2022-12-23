package com.iab.omid.library.applovin.walking.p241a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.walking.a.b */
public abstract class C7758b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private C7759a f18763a;

    /* renamed from: d */
    protected final C7760b f18764d;

    /* renamed from: com.iab.omid.library.applovin.walking.a.b$a */
    public interface C7759a {
        /* renamed from: a */
        void mo54855a(C7758b bVar);
    }

    /* renamed from: com.iab.omid.library.applovin.walking.a.b$b */
    public interface C7760b {
        /* renamed from: a */
        void mo54856a(JSONObject jSONObject);

        /* renamed from: b */
        JSONObject mo54857b();
    }

    public C7758b(C7760b bVar) {
        this.f18764d = bVar;
    }

    /* renamed from: a */
    public void mo54851a(C7759a aVar) {
        this.f18763a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        C7759a aVar = this.f18763a;
        if (aVar != null) {
            aVar.mo54855a(this);
        }
    }

    /* renamed from: a */
    public void mo54853a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
