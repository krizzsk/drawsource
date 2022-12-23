package com.bytedance.sdk.openadsdk.p166e;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.video.p162c.C3622b;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import com.com.bytedance.overseas.sdk.p185a.C3968c;
import com.com.bytedance.overseas.sdk.p185a.C3969d;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.e.a */
/* compiled from: JsAppAdDownloadManager */
public class C3727a implements C3729c {

    /* renamed from: a */
    private final C3431n f9659a;

    /* renamed from: b */
    private final C3728b f9660b;

    /* renamed from: c */
    private final Map<String, C3968c> f9661c = new HashMap();

    /* renamed from: a */
    public void mo20515a() {
    }

    /* renamed from: b */
    public void mo20519b() {
    }

    /* renamed from: b */
    public void mo20520b(JSONObject jSONObject) {
    }

    private C3727a(C3728b bVar, C3431n nVar) {
        this.f9660b = bVar;
        this.f9659a = nVar;
    }

    /* renamed from: a */
    public static C3727a m12184a(C3728b bVar, C3431n nVar) {
        return new C3727a(bVar, nVar);
    }

    /* renamed from: c */
    public void mo20521c() {
        this.f9661c.clear();
    }

    /* renamed from: a */
    private C3431n m12183a(JSONObject jSONObject, String str) {
        String str2 = null;
        if (jSONObject == null) {
            return null;
        }
        C3431n nVar = new C3431n();
        nVar.mo19599b(jSONObject);
        if (!TextUtils.isEmpty(str)) {
            nVar.mo19639m(str);
        }
        if (this.f9659a == null) {
            return nVar;
        }
        if (nVar.mo19567aa() != null) {
            str2 = nVar.mo19567aa().mo19400a();
        }
        if (TextUtils.isEmpty(str2)) {
            return this.f9659a;
        }
        return (this.f9659a.mo19567aa() == null || !str2.equals(this.f9659a.mo19567aa().mo19400a())) ? nVar : this.f9659a;
    }

    /* renamed from: a */
    public void mo20517a(Context context, JSONObject jSONObject, String str, int i, boolean z) {
        JSONObject optJSONObject;
        if (context != null && jSONObject != null && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
            m12187a(context, m12183a(optJSONObject, str), optJSONObject, i, z);
        }
    }

    /* renamed from: a */
    private void m12187a(Context context, C3431n nVar, JSONObject jSONObject, int i, boolean z) {
        if (context != null && nVar != null && nVar.mo19567aa() != null && jSONObject != null && this.f9660b != null && this.f9661c.get(nVar.mo19567aa().mo19400a()) == null) {
            String a = C3898x.m12752a(i);
            if (!TextUtils.isEmpty(a)) {
                this.f9661c.put(nVar.mo19567aa().mo19400a(), m12185a(context, nVar, jSONObject, a, z));
            }
        }
    }

    /* renamed from: a */
    public void mo20516a(Context context, JSONObject jSONObject, String str) {
        JSONObject optJSONObject;
        if (context != null && jSONObject != null && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
            m12186a(context, m12183a(optJSONObject, (String) null), str);
        }
    }

    /* renamed from: a */
    private void m12186a(Context context, C3431n nVar, String str) {
        if (context != null && nVar != null) {
            if (nVar.mo19567aa() == null) {
                C3969d.m13089a(context, nVar, str).mo20860d();
            } else {
                C3968c cVar = this.f9661c.get(nVar.mo19567aa().mo19400a());
                if (cVar != null) {
                    cVar.mo20860d();
                }
            }
            if (context instanceof C3622b) {
                ((C3622b) context).mo18428L();
            }
        }
    }

    /* renamed from: a */
    public void mo20518a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
            m12188a(m12183a(optJSONObject, (String) null), optJSONObject);
        }
    }

    /* renamed from: a */
    private void m12188a(C3431n nVar, JSONObject jSONObject) {
        if (this.f9660b != null && nVar != null && nVar.mo19567aa() != null) {
            String a = nVar.mo19567aa().mo19400a();
            if (this.f9661c.containsKey(a)) {
                this.f9661c.remove(a);
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("message", "success");
                    jSONObject2.put("status", "unsubscribed");
                    jSONObject2.put("appad", jSONObject);
                    this.f9660b.mo20350a("app_ad_event", jSONObject2);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    private C3968c m12185a(Context context, C3431n nVar, JSONObject jSONObject, String str, boolean z) {
        C3968c a = C3969d.m13089a(context, nVar, str);
        a.mo20857a(true);
        return a;
    }
}
