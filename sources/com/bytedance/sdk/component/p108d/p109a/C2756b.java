package com.bytedance.sdk.component.p108d.p109a;

import com.bytedance.sdk.component.p108d.C2826h;
import com.bytedance.sdk.component.p108d.C2829k;
import com.bytedance.sdk.component.p108d.p111c.p116c.C2799c;
import java.util.WeakHashMap;

/* renamed from: com.bytedance.sdk.component.d.a.b */
/* compiled from: KeyGeneratorFactory */
public class C2756b {
    /* renamed from: a */
    public static C2829k m7512a() {
        return new C2829k() {

            /* renamed from: a */
            private WeakHashMap<String, String> f6142a = new WeakHashMap<>();

            /* renamed from: b */
            public String mo17526b(C2826h hVar) {
                return m7513a(hVar.mo17603a());
            }

            /* renamed from: a */
            public String mo17525a(C2826h hVar) {
                return m7513a(hVar.mo17603a() + "#width=" + hVar.mo17610b() + "#height=" + hVar.mo17612c() + "#scaletype=" + hVar.mo17613d());
            }

            /* renamed from: a */
            private String m7513a(String str) {
                String str2 = this.f6142a.get(str);
                if (str2 != null) {
                    return str2;
                }
                String a = C2799c.m7728a(str);
                this.f6142a.put(str, a);
                return a;
            }
        };
    }
}
