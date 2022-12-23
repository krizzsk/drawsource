package p399g;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: g.b */
public abstract class C12473b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private C12474a f29796a;

    /* renamed from: b */
    protected final C12475b f29797b;

    /* renamed from: g.b$a */
    public interface C12474a {
        /* renamed from: a */
        void mo72498a(C12473b bVar);
    }

    /* renamed from: g.b$b */
    public interface C12475b {
        /* renamed from: a */
        JSONObject mo72489a();

        /* renamed from: a */
        void mo72490a(JSONObject jSONObject);
    }

    public C12473b(C12475b bVar) {
        this.f29797b = bVar;
    }

    /* renamed from: a */
    public void mo72494a(C12474a aVar) {
        this.f29796a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        C12474a aVar = this.f29796a;
        if (aVar != null) {
            aVar.mo72498a(this);
        }
    }

    /* renamed from: a */
    public void mo72496a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
