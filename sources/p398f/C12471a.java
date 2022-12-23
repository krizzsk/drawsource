package p398f;

import java.util.HashSet;
import org.json.JSONObject;
import p399g.C12473b;
import p399g.C12476c;
import p399g.C12477d;
import p399g.C12478e;
import p399g.C12479f;

/* renamed from: f.a */
public class C12471a implements C12473b.C12475b {

    /* renamed from: a */
    private JSONObject f29791a;

    /* renamed from: b */
    private final C12476c f29792b;

    public C12471a(C12476c cVar) {
        this.f29792b = cVar;
    }

    /* renamed from: a */
    public JSONObject mo72489a() {
        return this.f29791a;
    }

    /* renamed from: a */
    public void mo72490a(JSONObject jSONObject) {
        this.f29791a = jSONObject;
    }

    /* renamed from: a */
    public void mo72491a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f29792b.mo72499b(new C12478e(this, hashSet, jSONObject, j));
    }

    /* renamed from: b */
    public void mo72492b() {
        this.f29792b.mo72499b(new C12477d(this));
    }

    /* renamed from: b */
    public void mo72493b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f29792b.mo72499b(new C12479f(this, hashSet, jSONObject, j));
    }
}
