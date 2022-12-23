package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.environment.C6363a;
import com.ironsource.environment.p205f.C6391b;
import com.ironsource.sdk.service.C8337c;
import com.ironsource.sdk.service.C8338d;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.v */
public class C8199v {

    /* renamed from: a */
    static final String f19932a = C8199v.class.getSimpleName();

    /* renamed from: b */
    C8338d f19933b;

    /* renamed from: c */
    C8337c f19934c;

    /* renamed from: d */
    Context f19935d;

    /* renamed from: e */
    private final String f19936e = "oneToken";

    /* renamed from: f */
    private C6391b f19937f;

    /* renamed from: com.ironsource.sdk.controller.v$a */
    static class C8200a {

        /* renamed from: a */
        String f19938a;

        /* renamed from: b */
        JSONObject f19939b;

        /* renamed from: c */
        String f19940c;

        /* renamed from: d */
        String f19941d;

        private C8200a() {
        }

        /* synthetic */ C8200a(byte b) {
            this();
        }
    }

    public C8199v(Context context, C8338d dVar) {
        this.f19933b = dVar;
        this.f19935d = context;
        this.f19934c = new C8337c();
        this.f19937f = new C6391b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONObject mo56496a() {
        JSONObject a = this.f19937f.mo35900a();
        Iterator<String> keys = a.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = a.get(next);
            if (obj instanceof String) {
                a.put(next, C6363a.C63641.m19004a((String) obj));
            }
        }
        return a;
    }
}
