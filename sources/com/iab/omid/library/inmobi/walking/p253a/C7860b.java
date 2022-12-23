package com.iab.omid.library.inmobi.walking.p253a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.inmobi.walking.a.b */
public abstract class C7860b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private C7861a f18993a;

    /* renamed from: d */
    protected final C7862b f18994d;

    /* renamed from: com.iab.omid.library.inmobi.walking.a.b$a */
    public interface C7861a {
        /* renamed from: a */
        void mo55248a(C7860b bVar);
    }

    /* renamed from: com.iab.omid.library.inmobi.walking.a.b$b */
    public interface C7862b {
        /* renamed from: a */
        void mo55249a(JSONObject jSONObject);

        /* renamed from: b */
        JSONObject mo55250b();
    }

    public C7860b(C7862b bVar) {
        this.f18994d = bVar;
    }

    /* renamed from: a */
    public void mo55244a(C7861a aVar) {
        this.f18993a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        C7861a aVar = this.f18993a;
        if (aVar != null) {
            aVar.mo55248a(this);
        }
    }

    /* renamed from: a */
    public void mo55246a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
