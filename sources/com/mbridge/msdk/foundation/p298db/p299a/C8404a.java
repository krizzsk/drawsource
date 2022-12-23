package com.mbridge.msdk.foundation.p298db.p299a;

import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.p298db.C8412f;
import com.mbridge.msdk.foundation.p298db.C8414g;
import com.mbridge.msdk.foundation.p298db.C8419l;
import com.mbridge.msdk.foundation.same.p300a.C8471b;
import com.mbridge.msdk.foundation.same.p305f.C8498b;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.db.a.a */
/* compiled from: ReplaceTempDaoMiddle */
public final class C8404a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C8419l f20521a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C8471b f20522b;

    /* renamed from: com.mbridge.msdk.foundation.db.a.a$a */
    /* compiled from: ReplaceTempDaoMiddle */
    private static class C8406a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static C8404a f20526a = new C8404a();
    }

    private C8404a() {
        this.f20522b = new C8471b(1000);
        try {
            C8419l a = C8419l.m23997a((C8412f) C8414g.m23969a(C8388a.m23845e().mo56913g()));
            this.f20521a = a;
            mo56964a(a.mo57036a(), false);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static C8404a m23901a() {
        return C8406a.f20526a;
    }

    /* renamed from: a */
    public final JSONObject mo56963a(String str) {
        C8419l lVar;
        JSONObject a = this.f20522b.mo37079b(str);
        if (a != null || (lVar = this.f20521a) == null) {
            return a;
        }
        JSONObject a2 = lVar.mo57037a(str);
        if (a2 != null) {
            this.f20522b.mo37077a(str, a2);
        }
        return a2;
    }

    /* renamed from: a */
    public final void mo56964a(JSONObject jSONObject, final boolean z) {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            final C8471b bVar = new C8471b(100);
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                this.f20522b.mo37077a(next, optJSONObject);
                bVar.mo37077a(next, optJSONObject);
            }
            C8498b.m24359a().execute(new Runnable() {
                public final void run() {
                    if (z && C8404a.this.f20521a != null) {
                        for (String next : bVar.mo37075a()) {
                            C8404a.this.f20521a.mo57038a(next, C8404a.this.f20522b.mo37079b(next));
                        }
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public final JSONArray mo56965b() {
        return new JSONArray(this.f20522b.mo37075a());
    }
}
