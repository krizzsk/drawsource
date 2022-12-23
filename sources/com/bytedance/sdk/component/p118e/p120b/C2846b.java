package com.bytedance.sdk.component.p118e.p120b;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.p102b.p103a.C2711a;
import com.bytedance.sdk.component.p102b.p103a.C2724b;
import com.bytedance.sdk.component.p102b.p103a.C2734c;
import com.bytedance.sdk.component.p102b.p103a.C2736e;
import com.bytedance.sdk.component.p102b.p103a.C2737f;
import com.bytedance.sdk.component.p102b.p103a.C2743i;
import com.bytedance.sdk.component.p102b.p103a.C2746k;
import com.bytedance.sdk.component.p102b.p103a.C2750m;
import com.bytedance.sdk.component.p118e.C2843b;
import com.bytedance.sdk.component.p118e.p119a.C2842a;
import com.bytedance.sdk.component.p118e.p122d.C2869d;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.sdk.component.e.b.b */
/* compiled from: GetExecutor */
public class C2846b extends C2848c {

    /* renamed from: a */
    public static final C2711a f6369a = new C2711a.C2712a().mo17387a().mo17388b();

    /* renamed from: b */
    public static final C2711a f6370b = new C2711a.C2712a().mo17388b();

    /* renamed from: g */
    private C2711a f6371g = f6369a;

    /* renamed from: h */
    private Map<String, String> f6372h = new HashMap();

    public C2846b(C2743i iVar) {
        super(iVar);
    }

    /* renamed from: a */
    public void mo17709a(String str, String str2) {
        if (str == null) {
            C2869d.m8004b("GetExecutor", "name cannot be null !!!");
        } else {
            this.f6372h.put(str, str2);
        }
    }

    /* renamed from: a */
    public void mo17708a(final C2842a aVar) {
        try {
            C2746k.C2747a aVar2 = new C2746k.C2747a();
            C2737f.C2738a aVar3 = new C2737f.C2738a();
            Uri parse = Uri.parse(this.f6379f);
            aVar3.mo17488a(parse.getScheme());
            aVar3.mo17490b(parse.getHost());
            String encodedPath = parse.getEncodedPath();
            if (!TextUtils.isEmpty(encodedPath)) {
                if (encodedPath.startsWith("/")) {
                    encodedPath = encodedPath.substring(1);
                }
                aVar3.mo17492c(encodedPath);
            }
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames != null && queryParameterNames.size() > 0) {
                for (String next : queryParameterNames) {
                    this.f6372h.put(next, parse.getQueryParameter(next));
                }
            }
            for (Map.Entry next2 : this.f6372h.entrySet()) {
                String str = (String) next2.getKey();
                String str2 = (String) next2.getValue();
                if (!TextUtils.isEmpty(str)) {
                    String encode = URLEncoder.encode(str, "UTF-8");
                    if (str2 == null) {
                        str2 = "";
                    }
                    aVar3.mo17489a(encode, URLEncoder.encode(str2, "UTF-8"));
                }
            }
            mo17710a(aVar2);
            aVar2.mo17512a(this.f6371g);
            aVar2.mo17515a((Object) mo17712b());
            this.f6376c.mo17398a(aVar2.mo17513a(aVar3.mo17491b()).mo17511a().mo17519b()).mo17391a(new C2734c() {
                /* renamed from: a */
                public void mo15674a(C2724b bVar, IOException iOException) {
                    C2842a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo17694a((C2848c) C2846b.this, iOException);
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
                            aVar.mo17693a((C2848c) C2846b.this, new C2843b(mVar.mo17421d(), mVar.mo17419c(), mVar.mo17422e(), hashMap, mVar.mo17423f().mo17428b(), mVar.mo17418b(), mVar.mo17415a()));
                        }
                    }
                }
            });
        } catch (Throwable th) {
            if (C2869d.m8003a()) {
                th.printStackTrace();
            }
            if (aVar != null) {
                aVar.mo17694a((C2848c) this, new IOException(th.getMessage()));
            }
        }
    }

    /* renamed from: a */
    public C2843b mo17707a() {
        try {
            C2746k.C2747a aVar = new C2746k.C2747a();
            C2737f.C2738a aVar2 = new C2737f.C2738a();
            Uri parse = Uri.parse(this.f6379f);
            aVar2.mo17488a(parse.getScheme());
            aVar2.mo17490b(parse.getHost());
            String encodedPath = parse.getEncodedPath();
            if (!TextUtils.isEmpty(encodedPath)) {
                if (encodedPath.startsWith("/")) {
                    encodedPath = encodedPath.substring(1);
                }
                aVar2.mo17492c(encodedPath);
            }
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames != null && queryParameterNames.size() > 0) {
                for (String next : queryParameterNames) {
                    this.f6372h.put(next, parse.getQueryParameter(next));
                }
            }
            for (Map.Entry next2 : this.f6372h.entrySet()) {
                String str = (String) next2.getKey();
                String str2 = (String) next2.getValue();
                if (!TextUtils.isEmpty(str)) {
                    String encode = URLEncoder.encode(str, "UTF-8");
                    if (str2 == null) {
                        str2 = "";
                    }
                    aVar2.mo17489a(encode, URLEncoder.encode(str2, "UTF-8"));
                }
            }
            mo17710a(aVar);
            aVar.mo17512a(this.f6371g);
            aVar.mo17515a((Object) mo17712b());
            C2750m a = this.f6376c.mo17398a(aVar.mo17513a(aVar2.mo17491b()).mo17511a().mo17519b()).mo17389a();
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
            th.printStackTrace();
            return null;
        }
    }
}
