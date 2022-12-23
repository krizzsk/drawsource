package com.iab.omid.library.adcolony.walking.p229a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.walking.a.b */
public abstract class C7658b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private C7659a f18529a;

    /* renamed from: d */
    protected final C7660b f18530d;

    /* renamed from: com.iab.omid.library.adcolony.walking.a.b$a */
    public interface C7659a {
        /* renamed from: a */
        void mo54457a(C7658b bVar);
    }

    /* renamed from: com.iab.omid.library.adcolony.walking.a.b$b */
    public interface C7660b {
        /* renamed from: a */
        void mo54458a(JSONObject jSONObject);

        /* renamed from: b */
        JSONObject mo54459b();
    }

    public C7658b(C7660b bVar) {
        this.f18530d = bVar;
    }

    /* renamed from: a */
    public void mo54453a(C7659a aVar) {
        this.f18529a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        C7659a aVar = this.f18529a;
        if (aVar != null) {
            aVar.mo54457a(this);
        }
    }

    /* renamed from: a */
    public void mo54455a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
