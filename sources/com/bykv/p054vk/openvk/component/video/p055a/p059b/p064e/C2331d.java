package com.bykv.p054vk.openvk.component.video.p055a.p059b.p064e;

import android.text.TextUtils;
import com.bykv.p054vk.openvk.component.video.api.C2397b;
import com.bykv.p054vk.openvk.component.video.api.p074f.C2415c;
import com.bytedance.sdk.component.p102b.p103a.C2743i;
import com.bytedance.sdk.component.p102b.p103a.C2746k;
import com.bytedance.sdk.component.p102b.p103a.C2750m;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.e.d */
/* compiled from: NetworkSoureVolleyImpl */
public class C2331d implements C2328b {

    /* renamed from: a */
    private C2743i f4697a;

    public C2331d() {
        this.f4697a = null;
        this.f4697a = C2397b.m5672e();
    }

    /* renamed from: a */
    public C2327a mo15769a(C2332e eVar) throws IOException {
        C2746k.C2747a aVar = new C2746k.C2747a();
        try {
            if (eVar.f4702e != null) {
                for (Map.Entry next : eVar.f4702e.entrySet()) {
                    String str = (String) next.getKey();
                    if (!TextUtils.isEmpty(str)) {
                        String str2 = (String) next.getValue();
                        if (str2 == null) {
                            str2 = "";
                        }
                        aVar.mo17518b(str, str2);
                    }
                }
            }
            C2750m a = this.f4697a.mo17398a(aVar.mo17516a(eVar.f4699b).mo17511a().mo17519b()).mo17389a();
            C2415c.m5833b("NetworkSoureVolleyImpl", "response code = ", Integer.valueOf(a.mo17419c()));
            return new C2333f(a, eVar);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
