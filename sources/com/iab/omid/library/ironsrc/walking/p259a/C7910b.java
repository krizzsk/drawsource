package com.iab.omid.library.ironsrc.walking.p259a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.walking.a.b */
public abstract class C7910b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private C7911a f19107a;

    /* renamed from: d */
    protected final C7912b f19108d;

    /* renamed from: com.iab.omid.library.ironsrc.walking.a.b$a */
    public interface C7911a {
        /* renamed from: a */
        void mo55434a(C7910b bVar);
    }

    /* renamed from: com.iab.omid.library.ironsrc.walking.a.b$b */
    public interface C7912b {
        /* renamed from: a */
        void mo55435a(JSONObject jSONObject);

        /* renamed from: b */
        JSONObject mo55436b();
    }

    public C7910b(C7912b bVar) {
        this.f19108d = bVar;
    }

    /* renamed from: a */
    public void mo55430a(C7911a aVar) {
        this.f19107a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        C7911a aVar = this.f19107a;
        if (aVar != null) {
            aVar.mo55434a(this);
        }
    }

    /* renamed from: a */
    public void mo55432a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
