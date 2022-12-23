package com.iab.omid.library.amazon.walking.p235a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.walking.a.b */
public abstract class C7708b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private C7709a f18646a;

    /* renamed from: d */
    protected final C7710b f18647d;

    /* renamed from: com.iab.omid.library.amazon.walking.a.b$a */
    public interface C7709a {
        /* renamed from: a */
        void mo54656a(C7708b bVar);
    }

    /* renamed from: com.iab.omid.library.amazon.walking.a.b$b */
    public interface C7710b {
        /* renamed from: a */
        void mo54657a(JSONObject jSONObject);

        /* renamed from: b */
        JSONObject mo54658b();
    }

    public C7708b(C7710b bVar) {
        this.f18647d = bVar;
    }

    /* renamed from: a */
    public void mo54652a(C7709a aVar) {
        this.f18646a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        C7709a aVar = this.f18646a;
        if (aVar != null) {
            aVar.mo54656a(this);
        }
    }

    /* renamed from: a */
    public void mo54654a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
