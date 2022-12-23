package com.tapjoy.internal;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.tapjoy.internal.ea */
public abstract class C11385ea extends AsyncTask<Object, Void, String> {

    /* renamed from: d */
    C11386a f27189d;

    /* renamed from: e */
    protected final C11387b f27190e;

    /* renamed from: com.tapjoy.internal.ea$a */
    public interface C11386a {
        /* renamed from: a */
        void mo69833a();
    }

    /* renamed from: com.tapjoy.internal.ea$b */
    public interface C11387b {
        /* renamed from: a */
        JSONObject mo69834a();

        /* renamed from: a */
        void mo69835a(JSONObject jSONObject);
    }

    public C11385ea(C11387b bVar) {
        this.f27190e = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        C11386a aVar = this.f27189d;
        if (aVar != null) {
            aVar.mo69833a();
        }
    }

    /* renamed from: a */
    public final void mo69831a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
