package com.apm.insight.p025k;

import org.json.JSONObject;

/* renamed from: com.apm.insight.k.l */
public class C1293l {

    /* renamed from: a */
    private final int f1303a;

    /* renamed from: b */
    private String f1304b;

    /* renamed from: c */
    private JSONObject f1305c;

    /* renamed from: d */
    private byte[] f1306d;

    public C1293l(int i) {
        this.f1303a = i;
    }

    public C1293l(int i, String str) {
        this.f1303a = i;
        this.f1304b = str;
    }

    public C1293l(int i, Throwable th) {
        this.f1303a = i;
        if (th != null) {
            this.f1304b = th.getMessage();
        }
    }

    public C1293l(int i, JSONObject jSONObject) {
        this.f1303a = i;
        this.f1305c = jSONObject;
    }

    public C1293l(int i, byte[] bArr) {
        this.f1303a = i;
        this.f1306d = bArr;
    }

    /* renamed from: a */
    public boolean mo12574a() {
        return this.f1303a != 207;
    }

    /* renamed from: b */
    public byte[] mo12575b() {
        return this.f1306d;
    }
}
