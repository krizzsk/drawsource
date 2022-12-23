package com.bytedance.sdk.component.p088a;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.component.p088a.C2500k;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.bytedance.sdk.component.a.j */
/* compiled from: Environment */
public class C2499j {

    /* renamed from: a */
    WebView f5261a;

    /* renamed from: b */
    C2484a f5262b;

    /* renamed from: c */
    String f5263c = "IESJSBridge";

    /* renamed from: d */
    C2497h f5264d;

    /* renamed from: e */
    Context f5265e;

    /* renamed from: f */
    boolean f5266f;

    /* renamed from: g */
    boolean f5267g;

    /* renamed from: h */
    boolean f5268h;

    /* renamed from: i */
    C2505m f5269i;

    /* renamed from: j */
    C2506n f5270j;

    /* renamed from: k */
    String f5271k = "host";

    /* renamed from: l */
    final Set<String> f5272l = new LinkedHashSet();

    /* renamed from: m */
    final Set<String> f5273m = new LinkedHashSet();

    /* renamed from: n */
    boolean f5274n;

    /* renamed from: o */
    boolean f5275o;

    /* renamed from: p */
    C2500k.C2503b f5276p;

    C2499j(WebView webView) {
        this.f5261a = webView;
    }

    C2499j() {
    }

    /* renamed from: a */
    public C2499j mo16494a(C2484a aVar) {
        this.f5262b = aVar;
        return this;
    }

    /* renamed from: a */
    public C2499j mo16496a(String str) {
        this.f5263c = str;
        return this;
    }

    /* renamed from: a */
    public C2499j mo16495a(C2504l lVar) {
        this.f5264d = C2497h.m6246a(lVar);
        return this;
    }

    /* renamed from: a */
    public C2499j mo16497a(boolean z) {
        this.f5266f = z;
        return this;
    }

    /* renamed from: b */
    public C2499j mo16498b(boolean z) {
        this.f5267g = z;
        return this;
    }

    /* renamed from: a */
    public C2499j mo16493a() {
        this.f5275o = true;
        return this;
    }

    /* renamed from: b */
    public C2512r mo16499b() {
        m6256c();
        return new C2512r(this);
    }

    /* renamed from: c */
    private void m6256c() {
        if ((this.f5261a == null && !this.f5274n && this.f5262b == null) || ((TextUtils.isEmpty(this.f5263c) && this.f5261a != null) || this.f5264d == null)) {
            throw new IllegalArgumentException("Requested arguments aren't set properly when building JsBridge.");
        }
    }
}
