package com.bytedance.sdk.component.p088a;

import android.webkit.WebView;
import com.bytedance.sdk.component.p088a.C2488d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.a.r */
/* compiled from: JsBridge2 */
public class C2512r {

    /* renamed from: a */
    static C2522w f5293a;

    /* renamed from: b */
    private final C2484a f5294b;

    /* renamed from: c */
    private final WebView f5295c;

    /* renamed from: d */
    private final C2499j f5296d;

    /* renamed from: e */
    private final List<C2506n> f5297e = new ArrayList();

    /* renamed from: f */
    private C2507o f5298f;

    /* renamed from: g */
    private volatile boolean f5299g = false;

    /* renamed from: a */
    public static C2499j m6298a(WebView webView) {
        return new C2499j(webView);
    }

    /* renamed from: a */
    public C2512r mo16525a(String str, C2491e<?, ?> eVar) {
        return mo16527a(str, (String) null, eVar);
    }

    /* renamed from: a */
    public C2512r mo16527a(String str, String str2, C2491e<?, ?> eVar) {
        m6299b();
        this.f5294b.f5229g.mo16490a(str, eVar);
        C2507o oVar = this.f5298f;
        if (oVar != null) {
            oVar.mo16512a(str);
        }
        return this;
    }

    /* renamed from: a */
    public C2512r mo16524a(String str, C2488d.C2490b bVar) {
        return mo16526a(str, (String) null, bVar);
    }

    /* renamed from: a */
    public C2512r mo16526a(String str, String str2, C2488d.C2490b bVar) {
        m6299b();
        this.f5294b.f5229g.mo16489a(str, bVar);
        C2507o oVar = this.f5298f;
        if (oVar != null) {
            oVar.mo16512a(str);
        }
        return this;
    }

    /* renamed from: a */
    public void mo16528a() {
        if (!this.f5299g) {
            this.f5294b.mo16466b();
            this.f5299g = true;
            for (C2506n next : this.f5297e) {
                if (next != null) {
                    next.mo16511a();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        r0 = f5293a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C2512r(com.bytedance.sdk.component.p088a.C2499j r3) {
        /*
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f5297e = r0
            r0 = 0
            r2.f5299g = r0
            r2.f5296d = r3
            boolean r0 = r3.f5268h
            if (r0 == 0) goto L_0x001e
            com.bytedance.sdk.component.a.w r0 = f5293a
            if (r0 == 0) goto L_0x001e
            java.lang.String r1 = r3.f5271k
            com.bytedance.sdk.component.a.v r0 = r0.mo16537a((java.lang.String) r1)
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            android.webkit.WebView r1 = r3.f5261a
            if (r1 == 0) goto L_0x0034
            com.bytedance.sdk.component.a.a r1 = r3.f5262b
            if (r1 != 0) goto L_0x002f
            com.bytedance.sdk.component.a.z r1 = new com.bytedance.sdk.component.a.z
            r1.<init>()
            r2.f5294b = r1
            goto L_0x0038
        L_0x002f:
            com.bytedance.sdk.component.a.a r1 = r3.f5262b
            r2.f5294b = r1
            goto L_0x0038
        L_0x0034:
            com.bytedance.sdk.component.a.a r1 = r3.f5262b
            r2.f5294b = r1
        L_0x0038:
            com.bytedance.sdk.component.a.a r1 = r2.f5294b
            r1.mo16462a((com.bytedance.sdk.component.p088a.C2499j) r3, (com.bytedance.sdk.component.p088a.C2517v) r0)
            android.webkit.WebView r0 = r3.f5261a
            r2.f5295c = r0
            java.util.List<com.bytedance.sdk.component.a.n> r0 = r2.f5297e
            com.bytedance.sdk.component.a.n r1 = r3.f5270j
            r0.add(r1)
            boolean r0 = r3.f5266f
            com.bytedance.sdk.component.p088a.C2498i.m6253a((boolean) r0)
            boolean r3 = r3.f5267g
            com.bytedance.sdk.component.p088a.C2525y.m6328a((boolean) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p088a.C2512r.<init>(com.bytedance.sdk.component.a.j):void");
    }

    /* renamed from: b */
    private void m6299b() {
        if (this.f5299g) {
            C2498i.m6250a((RuntimeException) new IllegalStateException("JsBridge2 is already released!!!"));
        }
    }
}
