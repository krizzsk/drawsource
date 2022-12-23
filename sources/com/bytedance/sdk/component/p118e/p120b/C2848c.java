package com.bytedance.sdk.component.p118e.p120b;

import android.text.TextUtils;
import com.bytedance.sdk.component.p102b.p103a.C2743i;
import com.bytedance.sdk.component.p102b.p103a.C2746k;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.bytedance.sdk.component.e.b.c */
/* compiled from: NetExecutor */
public abstract class C2848c {

    /* renamed from: a */
    private Map<String, Object> f6375a;

    /* renamed from: c */
    protected C2743i f6376c;

    /* renamed from: d */
    protected String f6377d = null;

    /* renamed from: e */
    protected final Map<String, String> f6378e = new HashMap();

    /* renamed from: f */
    protected String f6379f = null;

    public C2848c(C2743i iVar) {
        this.f6376c = iVar;
        mo17713b(UUID.randomUUID().toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17710a(C2746k.C2747a aVar) {
        if (aVar != null && this.f6378e.size() > 0) {
            for (Map.Entry next : this.f6378e.entrySet()) {
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
    }

    /* renamed from: a */
    public void mo17711a(String str) {
        this.f6379f = str;
    }

    /* renamed from: b */
    public String mo17712b() {
        return this.f6377d;
    }

    /* renamed from: b */
    public void mo17713b(String str) {
        this.f6377d = str;
    }

    /* renamed from: b */
    public void mo17714b(String str, String str2) {
        this.f6378e.put(str, str2);
    }

    /* renamed from: c */
    public Map<String, Object> mo17715c() {
        return this.f6375a;
    }

    /* renamed from: d */
    public void mo17716d(Map<String, String> map) {
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                this.f6378e.put(next.getKey(), next.getValue());
            }
        }
    }

    /* renamed from: e */
    public void mo17717e(Map<String, Object> map) {
        this.f6375a = map;
    }
}
