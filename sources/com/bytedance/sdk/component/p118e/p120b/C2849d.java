package com.bytedance.sdk.component.p118e.p120b;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.bytedance.sdk.component.p102b.p103a.C2724b;
import com.bytedance.sdk.component.p102b.p103a.C2734c;
import com.bytedance.sdk.component.p102b.p103a.C2736e;
import com.bytedance.sdk.component.p102b.p103a.C2742h;
import com.bytedance.sdk.component.p102b.p103a.C2743i;
import com.bytedance.sdk.component.p102b.p103a.C2746k;
import com.bytedance.sdk.component.p102b.p103a.C2749l;
import com.bytedance.sdk.component.p102b.p103a.C2750m;
import com.bytedance.sdk.component.p118e.C2843b;
import com.bytedance.sdk.component.p118e.p119a.C2842a;
import com.bytedance.sdk.component.p118e.p122d.C2869d;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.e.b.d */
/* compiled from: PostExecutor */
public class C2849d extends C2848c {

    /* renamed from: a */
    C2749l f6380a = null;

    public C2849d(C2743i iVar) {
        super(iVar);
    }

    /* renamed from: c */
    public void mo17721c(String str) {
        if (TextUtils.isEmpty(str)) {
            str = JsonUtils.EMPTY_JSON;
        }
        this.f6380a = C2749l.m7490a(C2742h.m7456a("application/json; charset=utf-8"), str);
    }

    /* renamed from: a */
    public void mo17720a(JSONObject jSONObject) {
        this.f6380a = C2749l.m7490a(C2742h.m7456a("application/json; charset=utf-8"), jSONObject != null ? jSONObject.toString() : JsonUtils.EMPTY_JSON);
    }

    /* renamed from: a */
    public void mo17719a(final C2842a aVar) {
        try {
            C2746k.C2747a aVar2 = new C2746k.C2747a();
            if (TextUtils.isEmpty(this.f6379f)) {
                aVar.mo17694a((C2848c) this, new IOException("Url is Empty"));
                return;
            }
            aVar2.mo17516a(this.f6379f);
            if (this.f6380a != null) {
                mo17710a(aVar2);
                aVar2.mo17515a((Object) mo17712b());
                this.f6376c.mo17398a(aVar2.mo17514a(this.f6380a).mo17519b()).mo17391a(new C2734c() {
                    /* renamed from: a */
                    public void mo15674a(C2724b bVar, IOException iOException) {
                        C2842a aVar = aVar;
                        if (aVar != null) {
                            aVar.mo17694a((C2848c) C2849d.this, iOException);
                        }
                    }

                    /* renamed from: a */
                    public void mo15673a(C2724b bVar, C2750m mVar) throws IOException {
                        if (aVar != null) {
                            HashMap hashMap = new HashMap();
                            if (mVar != null) {
                                C2736e g = mVar.mo17424g();
                                if (g != null) {
                                    for (int i = 0; i < g.mo17475a(); i++) {
                                        hashMap.put(g.mo17476a(i), g.mo17477b(i));
                                    }
                                }
                                aVar.mo17693a((C2848c) C2849d.this, new C2843b(mVar.mo17421d(), mVar.mo17419c(), mVar.mo17422e(), hashMap, mVar.mo17423f().mo17428b(), mVar.mo17418b(), mVar.mo17415a()));
                            }
                        }
                    }
                });
            } else if (aVar != null) {
                aVar.mo17694a((C2848c) this, new IOException("RequestBody is null, content type is not support!!"));
            }
        } catch (Throwable th) {
            th.printStackTrace();
            aVar.mo17694a((C2848c) this, new IOException(th.getMessage()));
        }
    }

    /* renamed from: a */
    public C2843b mo17718a() {
        try {
            C2746k.C2747a aVar = new C2746k.C2747a();
            if (TextUtils.isEmpty(this.f6379f)) {
                C2869d.m8004b("PostExecutor", "execute: Url is Empty");
                return new C2843b(false, 5000, "URL_NULL_MSG", (Map<String, String>) null, "URL_NULL_BODY", 1, 1);
            }
            aVar.mo17516a(this.f6379f);
            if (this.f6380a == null) {
                C2869d.m8004b("PostExecutor", "RequestBody is null, content type is not support!!");
                return new C2843b(false, 5000, "BODY_NULL_MSG", (Map<String, String>) null, "BODY_NULL_BODY", 1, 1);
            }
            mo17710a(aVar);
            aVar.mo17515a((Object) mo17712b());
            C2750m a = this.f6376c.mo17398a(aVar.mo17514a(this.f6380a).mo17519b()).mo17389a();
            if (a == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            C2736e g = a.mo17424g();
            if (g != null) {
                for (int i = 0; i < g.mo17475a(); i++) {
                    hashMap.put(g.mo17476a(i), g.mo17477b(i));
                }
            }
            return new C2843b(a.mo17421d(), a.mo17419c(), a.mo17422e(), hashMap, a.mo17423f().mo17428b(), a.mo17418b(), a.mo17415a());
        } catch (Throwable th) {
            return new C2843b(false, 5001, th.getMessage() + "|" + th.getStackTrace()[0].toString(), (Map<String, String>) null, "BODY_NULL_BODY", 1, 1);
        }
    }
}
