package com.iab.omid.library.vungle.walking.p277a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.walking.a.b */
public abstract class C8074b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private C8075a f19526a;

    /* renamed from: d */
    protected final C8076b f19527d;

    /* renamed from: com.iab.omid.library.vungle.walking.a.b$a */
    public interface C8075a {
        /* renamed from: a */
        void mo56165a(C8074b bVar);
    }

    /* renamed from: com.iab.omid.library.vungle.walking.a.b$b */
    public interface C8076b {
        /* renamed from: a */
        void mo56166a(JSONObject jSONObject);

        /* renamed from: b */
        JSONObject mo56167b();
    }

    public C8074b(C8076b bVar) {
        this.f19527d = bVar;
    }

    /* renamed from: a */
    public void mo56161a(C8075a aVar) {
        this.f19526a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        C8075a aVar = this.f19526a;
        if (aVar != null) {
            aVar.mo56165a(this);
        }
    }

    /* renamed from: a */
    public void mo56163a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
