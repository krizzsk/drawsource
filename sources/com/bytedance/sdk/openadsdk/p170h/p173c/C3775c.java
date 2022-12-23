package com.bytedance.sdk.openadsdk.p170h.p173c;

import android.text.TextUtils;
import com.bytedance.sdk.component.p123f.C2885g;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p153i.C3470e;
import com.bytedance.sdk.openadsdk.p128b.C3101k;
import com.bytedance.sdk.openadsdk.p170h.C3750a;
import com.bytedance.sdk.openadsdk.p178l.C3885n;
import com.bytedance.sdk.openadsdk.p178l.C3897w;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.h.c.c */
/* compiled from: LogUploaderImpl */
public class C3775c implements C3773a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3774b f9736a = C3774b.m12328a();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final List<C3778a> f9737b = Collections.synchronizedList(new LinkedList());

    /* renamed from: c */
    private final ExecutorService f9738c = Executors.newSingleThreadExecutor();

    /* renamed from: a */
    public void mo20585a() {
        this.f9738c.execute(new Runnable() {
            public void run() {
                List<C3778a> d = C3775c.this.f9736a.mo20591d();
                if (d != null) {
                    C3775c.this.f9737b.addAll(d);
                }
                C3775c.this.f9736a.mo20590c();
            }
        });
    }

    /* renamed from: a */
    public void mo20586a(C3750a aVar) {
        mo20587a(aVar, false);
    }

    /* renamed from: a */
    public void mo20587a(final C3750a aVar, final boolean z) {
        if (aVar != null && C3470e.m10697a()) {
            C3897w.m12745a(new C2885g("uploadLogEvent") {
                public void run() {
                    try {
                        C3778a aVar = new C3778a(C3885n.m12675a(), aVar.mo18582a().mo20541a());
                        if (z) {
                            C3513m.m10970e().mo18654a(aVar);
                        } else {
                            C3513m.m10969d().mo18654a(aVar);
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public void mo20588b() {
        ExecutorService executorService = this.f9738c;
        if (executorService != null) {
            executorService.shutdownNow();
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.h.c.c$a */
    /* compiled from: LogUploaderImpl */
    public static class C3778a implements C3101k {

        /* renamed from: a */
        public final String f9743a;

        /* renamed from: b */
        public final JSONObject f9744b;

        /* renamed from: e */
        public boolean mo18569e() {
            return false;
        }

        public C3778a(String str, JSONObject jSONObject) {
            this.f9743a = str;
            this.f9744b = jSONObject;
        }

        /* renamed from: a */
        public static C3778a m12339a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("localId", (String) null);
                JSONObject optJSONObject = jSONObject.optJSONObject("event");
                if (!TextUtils.isEmpty(optString) && optJSONObject != null) {
                    return new C3778a(optString, optJSONObject);
                }
            } catch (Throwable unused) {
            }
            return null;
        }

        /* renamed from: a */
        public String mo20594a() {
            if (TextUtils.isEmpty(this.f9743a) || this.f9744b == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("localId", this.f9743a);
                jSONObject.put("event", this.f9744b);
            } catch (Throwable unused) {
            }
            return jSONObject.toString();
        }

        /* renamed from: d */
        public String mo18568d() {
            return this.f9743a;
        }
    }

    /* renamed from: c */
    public static C3773a m12334c() {
        return C3782e.m12349c();
    }
}
