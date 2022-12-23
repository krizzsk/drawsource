package com.iab.omid.library.mmadbridge.walking.p265a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mmadbridge.walking.a.b */
public abstract class C7960b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private C7961a f19224a;

    /* renamed from: d */
    protected final C7962b f19225d;

    /* renamed from: com.iab.omid.library.mmadbridge.walking.a.b$a */
    public interface C7961a {
        /* renamed from: a */
        void mo55633a(C7960b bVar);
    }

    /* renamed from: com.iab.omid.library.mmadbridge.walking.a.b$b */
    public interface C7962b {
        /* renamed from: a */
        void mo55634a(JSONObject jSONObject);

        /* renamed from: b */
        JSONObject mo55635b();
    }

    public C7960b(C7962b bVar) {
        this.f19225d = bVar;
    }

    /* renamed from: a */
    public void mo55629a(C7961a aVar) {
        this.f19224a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        C7961a aVar = this.f19224a;
        if (aVar != null) {
            aVar.mo55633a(this);
        }
    }

    /* renamed from: a */
    public void mo55631a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
