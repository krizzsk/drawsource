package com.bytedance.sdk.openadsdk.p128b.p130b.p132b;

import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.p128b.p130b.p132b.C3072c;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.b.a */
/* compiled from: BaseEventModel */
public class C3070a<T extends C3072c> {

    /* renamed from: a */
    private C3431n f7175a;

    /* renamed from: b */
    private String f7176b;

    /* renamed from: c */
    private JSONObject f7177c;

    /* renamed from: d */
    private T f7178d = null;

    /* renamed from: e */
    private boolean f7179e = false;

    public C3070a(C3431n nVar, String str, JSONObject jSONObject, T t) {
        this.f7175a = nVar;
        this.f7176b = str;
        this.f7177c = jSONObject;
        this.f7178d = t;
    }

    /* renamed from: a */
    public C3431n mo18583a() {
        return this.f7175a;
    }

    /* renamed from: b */
    public String mo18585b() {
        return this.f7176b;
    }

    /* renamed from: c */
    public JSONObject mo18586c() {
        if (this.f7177c == null) {
            this.f7177c = new JSONObject();
        }
        return this.f7177c;
    }

    /* renamed from: d */
    public T mo18587d() {
        return this.f7178d;
    }

    /* renamed from: e */
    public boolean mo18588e() {
        return this.f7179e;
    }

    /* renamed from: a */
    public void mo18584a(boolean z) {
        this.f7179e = z;
    }
}
