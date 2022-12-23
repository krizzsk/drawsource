package com.bytedance.sdk.openadsdk.p128b;

import android.text.TextUtils;
import com.bytedance.sdk.component.p123f.C2885g;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.utils.C2909o;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.multipro.C3948b;
import com.bytedance.sdk.openadsdk.p128b.p129a.C3063a;
import com.bytedance.sdk.openadsdk.p128b.p129a.C3064b;
import com.bytedance.sdk.openadsdk.p128b.p129a.C3065c;
import com.bytedance.sdk.openadsdk.p178l.C3885n;
import com.bytedance.sdk.openadsdk.p178l.C3897w;
import com.google.firebase.messaging.Constants;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.a */
/* compiled from: AdEvent */
public class C3060a implements C3101k {

    /* renamed from: a */
    public final String f7137a;

    /* renamed from: b */
    protected final JSONObject f7138b;

    /* renamed from: c */
    private AtomicBoolean f7139c = new AtomicBoolean(false);

    /* renamed from: d */
    private JSONObject f7140d = new JSONObject();

    /* renamed from: e */
    private String f7141e;

    /* renamed from: f */
    private String f7142f;

    /* renamed from: g */
    private String f7143g;

    /* renamed from: h */
    private String f7144h;

    /* renamed from: i */
    private String f7145i;

    /* renamed from: j */
    private C3063a f7146j;

    /* renamed from: k */
    private String f7147k;

    /* renamed from: l */
    private String f7148l;

    /* renamed from: m */
    private String f7149m;

    /* renamed from: n */
    private String f7150n;

    C3060a(C3061a aVar) {
        this.f7137a = TextUtils.isEmpty(aVar.f7151a) ? C3885n.m12675a() : aVar.f7151a;
        this.f7146j = aVar.f7163m;
        this.f7148l = aVar.f7155e;
        this.f7141e = aVar.f7152b;
        this.f7142f = aVar.f7153c;
        this.f7143g = TextUtils.isEmpty(aVar.f7154d) ? "app_union" : aVar.f7154d;
        this.f7147k = aVar.f7159i;
        this.f7144h = aVar.f7156f;
        this.f7145i = aVar.f7157g;
        this.f7149m = aVar.f7160j;
        this.f7150n = aVar.f7161k;
        this.f7140d = aVar.f7158h = aVar.f7158h != null ? aVar.f7158h : new JSONObject();
        this.f7138b = new JSONObject();
        if (!TextUtils.isEmpty(aVar.f7161k)) {
            try {
                this.f7138b.put("app_log_url", aVar.f7161k);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    C3060a(String str, JSONObject jSONObject) {
        this.f7137a = str;
        this.f7138b = jSONObject;
    }

    /* renamed from: a */
    public static C3060a m8730a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("localId", (String) null);
            JSONObject optJSONObject = jSONObject.optJSONObject("event");
            if (!TextUtils.isEmpty(optString) && optJSONObject != null) {
                return new C3060a(optString, optJSONObject);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: f */
    private void m8731f() throws JSONException {
        this.f7138b.putOpt("app_log_url", this.f7150n);
        this.f7138b.putOpt("tag", this.f7141e);
        this.f7138b.putOpt(Constants.ScionAnalytics.PARAM_LABEL, this.f7142f);
        this.f7138b.putOpt("category", this.f7143g);
        if (!TextUtils.isEmpty(this.f7144h)) {
            try {
                this.f7138b.putOpt("value", Long.valueOf(Long.parseLong(this.f7144h)));
            } catch (NumberFormatException unused) {
                this.f7138b.putOpt("value", 0L);
            }
        }
        if (!TextUtils.isEmpty(this.f7145i)) {
            try {
                this.f7138b.putOpt("ext_value", Long.valueOf(Long.parseLong(this.f7145i)));
            } catch (Exception unused2) {
            }
        }
        if (!TextUtils.isEmpty(this.f7148l)) {
            this.f7138b.putOpt("log_extra", this.f7148l);
        }
        if (!TextUtils.isEmpty(this.f7147k)) {
            try {
                this.f7138b.putOpt("ua_policy", Integer.valueOf(Integer.parseInt(this.f7147k)));
            } catch (NumberFormatException unused3) {
            }
        }
        this.f7138b.putOpt("is_ad_event", "1");
        try {
            this.f7138b.putOpt("nt", this.f7149m);
        } catch (Exception unused4) {
        }
        Iterator<String> keys = this.f7140d.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            this.f7138b.putOpt(next, this.f7140d.opt(next));
        }
    }

    /* renamed from: a */
    public String mo18565a() {
        if (TextUtils.isEmpty(this.f7137a) || this.f7138b == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("localId", this.f7137a);
            jSONObject.put("event", mo18566b());
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: b */
    public JSONObject mo18566b() {
        if (this.f7139c.get()) {
            return this.f7138b;
        }
        try {
            m8731f();
            if (this.f7146j != null) {
                this.f7146j.mo18580a(this.f7138b);
            }
            this.f7139c.set(true);
        } catch (Throwable th) {
            C2905l.m8113b("AdEvent", th);
        }
        return this.f7138b;
    }

    /* renamed from: c */
    public JSONObject mo18567c() {
        JSONObject b = mo18566b();
        try {
            JSONObject jSONObject = new JSONObject(b.toString());
            jSONObject.remove("app_log_url");
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return b;
        }
    }

    /* renamed from: d */
    public String mo18568d() {
        return this.f7137a;
    }

    /* renamed from: e */
    public boolean mo18569e() {
        JSONObject jSONObject = this.f7138b;
        if (jSONObject == null) {
            return false;
        }
        String optString = jSONObject.optString(Constants.ScionAnalytics.PARAM_LABEL);
        if (!TextUtils.isEmpty(optString)) {
            return C3066b.f7167a.contains(optString);
        }
        if (TextUtils.isEmpty(this.f7142f)) {
            return false;
        }
        return C3066b.f7167a.contains(this.f7142f);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.b.a$a */
    /* compiled from: AdEvent */
    public static final class C3061a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f7151a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f7152b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f7153c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f7154d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public String f7155e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public String f7156f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public String f7157g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public JSONObject f7158h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public String f7159i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public final String f7160j = String.valueOf(C2909o.m8136c(C3513m.m10963a()));
        /* access modifiers changed from: private */

        /* renamed from: k */
        public String f7161k;

        /* renamed from: l */
        private C3064b f7162l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public C3063a f7163m;

        /* renamed from: a */
        public C3061a mo18570a(String str) {
            this.f7161k = str;
            return this;
        }

        /* renamed from: b */
        public C3061a mo18573b(String str) {
            this.f7152b = str;
            return this;
        }

        /* renamed from: c */
        public C3061a mo18574c(String str) {
            this.f7153c = str;
            return this;
        }

        /* renamed from: d */
        public C3061a mo18575d(String str) {
            this.f7154d = str;
            return this;
        }

        /* renamed from: e */
        public C3061a mo18576e(String str) {
            this.f7155e = str;
            return this;
        }

        /* renamed from: f */
        public C3061a mo18577f(String str) {
            this.f7156f = str;
            return this;
        }

        /* renamed from: g */
        public C3061a mo18578g(String str) {
            this.f7157g = str;
            return this;
        }

        /* renamed from: a */
        public C3061a mo18571a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return this;
            }
            this.f7158h = jSONObject;
            return this;
        }

        /* renamed from: a */
        public void mo18572a(C3063a aVar) {
            this.f7163m = aVar;
            final C3060a aVar2 = new C3060a(this);
            try {
                if (this.f7162l != null) {
                    this.f7162l.mo18581a(aVar2.f7138b);
                } else {
                    new C3065c().mo18581a(aVar2.f7138b);
                }
            } catch (Throwable th) {
                C2905l.m8113b("AdEvent", th);
            }
            if (C3948b.m12959c()) {
                C3897w.m12745a(new C2885g("dispatchEvent") {
                    public void run() {
                        C3513m.m10968c().mo18654a(aVar2);
                    }
                });
            } else {
                C3513m.m10968c().mo18654a(aVar2);
            }
        }
    }
}
