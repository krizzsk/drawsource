package com.iab.omid.library.fyber.walking.p247a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.fyber.walking.a.b */
public abstract class C7809b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private C7810a f18880a;

    /* renamed from: d */
    protected final C7811b f18881d;

    /* renamed from: com.iab.omid.library.fyber.walking.a.b$a */
    public interface C7810a {
        /* renamed from: a */
        void mo55054a(C7809b bVar);
    }

    /* renamed from: com.iab.omid.library.fyber.walking.a.b$b */
    public interface C7811b {
        /* renamed from: a */
        void mo55055a(JSONObject jSONObject);

        /* renamed from: b */
        JSONObject mo55056b();
    }

    public C7809b(C7811b bVar) {
        this.f18881d = bVar;
    }

    /* renamed from: a */
    public void mo55050a(C7810a aVar) {
        this.f18880a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        C7810a aVar = this.f18880a;
        if (aVar != null) {
            aVar.mo55054a(this);
        }
    }

    /* renamed from: a */
    public void mo55052a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
