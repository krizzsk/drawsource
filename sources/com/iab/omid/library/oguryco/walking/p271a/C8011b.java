package com.iab.omid.library.oguryco.walking.p271a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.oguryco.walking.a.b */
public abstract class C8011b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private C8012a f19345a;

    /* renamed from: d */
    protected final C8013b f19346d;

    /* renamed from: com.iab.omid.library.oguryco.walking.a.b$a */
    public interface C8012a {
        /* renamed from: a */
        void mo55847a(C8011b bVar);
    }

    /* renamed from: com.iab.omid.library.oguryco.walking.a.b$b */
    public interface C8013b {
        /* renamed from: a */
        void mo55848a(JSONObject jSONObject);

        /* renamed from: b */
        JSONObject mo55849b();
    }

    public C8011b(C8013b bVar) {
        this.f19346d = bVar;
    }

    /* renamed from: a */
    public void mo55843a(C8012a aVar) {
        this.f19345a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        C8012a aVar = this.f19345a;
        if (aVar != null) {
            aVar.mo55847a(this);
        }
    }

    /* renamed from: a */
    public void mo55845a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
