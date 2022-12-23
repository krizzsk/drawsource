package com.bytedance.sdk.component.p088a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.p088a.C2493g;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.a.a */
/* compiled from: AbstractBridge */
public abstract class C2484a {

    /* renamed from: a */
    protected Context f5223a;

    /* renamed from: b */
    protected C2505m f5224b;

    /* renamed from: c */
    protected C2497h f5225c;

    /* renamed from: d */
    protected Handler f5226d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    protected String f5227e;

    /* renamed from: f */
    protected volatile boolean f5228f = false;

    /* renamed from: g */
    C2493g f5229g;

    /* renamed from: h */
    private final Map<String, C2493g> f5230h = new HashMap();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Context mo16460a(C2499j jVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo16461a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo16464a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo16467b(C2499j jVar);

    protected C2484a() {
    }

    /* access modifiers changed from: protected */
    public void invokeMethod(final String str) {
        if (!this.f5228f) {
            C2498i.m6251a("Received call: " + str);
            this.f5226d.post(new Runnable() {
                public void run() {
                    if (!C2484a.this.f5228f) {
                        C2509q qVar = null;
                        try {
                            qVar = C2484a.this.m6201a(new JSONObject(str));
                        } catch (JSONException e) {
                            C2498i.m6255b("Exception thrown while parsing function.", e);
                        }
                        if (C2509q.m6282a(qVar)) {
                            C2498i.m6251a("By pass invalid call: " + qVar);
                            if (qVar != null) {
                                C2484a.this.mo16468b(C2525y.m6327a((Throwable) new C2513s(qVar.f5278a, "Failed to parse invocation.")), qVar);
                                return;
                            }
                            return;
                        }
                        C2484a.this.mo16463a(qVar);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16465a(String str, C2509q qVar) {
        mo16464a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo16466b() {
        this.f5229g.mo16488a();
        for (C2493g a : this.f5230h.values()) {
            a.mo16488a();
        }
        this.f5226d.removeCallbacksAndMessages((Object) null);
        this.f5228f = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16463a(C2509q qVar) {
        String a;
        if (!this.f5228f && (a = mo16461a()) != null) {
            C2493g b = m6202b(qVar.f5284g);
            if (b == null) {
                C2498i.m6254b("Received call with unknown namespace, " + qVar);
                C2505m mVar = this.f5224b;
                if (mVar != null) {
                    mVar.mo16510a(mo16461a(), qVar.f5281d, 2);
                }
                mo16468b(C2525y.m6327a((Throwable) new C2513s(-4, "Namespace " + qVar.f5284g + " unknown.")), qVar);
                return;
            }
            C2492f fVar = new C2492f();
            fVar.f5239b = a;
            fVar.f5238a = this.f5223a;
            fVar.f5240c = b;
            try {
                C2493g.C2496a a2 = b.mo16487a(qVar, fVar);
                if (a2 == null) {
                    C2498i.m6254b("Received call but not registered, " + qVar);
                    if (this.f5224b != null) {
                        this.f5224b.mo16510a(mo16461a(), qVar.f5281d, 2);
                    }
                    mo16468b(C2525y.m6327a((Throwable) new C2513s(-2, "Function " + qVar.f5281d + " is not registered.")), qVar);
                    return;
                }
                if (a2.f5257a) {
                    mo16468b(a2.f5258b, qVar);
                }
                if (this.f5224b != null) {
                    this.f5224b.mo16509a(mo16461a(), qVar.f5281d);
                }
            } catch (Exception e) {
                C2498i.m6252a("call finished with error, " + qVar, e);
                mo16468b(C2525y.m6327a((Throwable) e), qVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo16462a(C2499j jVar, C2517v vVar) {
        this.f5223a = mo16460a(jVar);
        this.f5225c = jVar.f5264d;
        this.f5224b = jVar.f5269i;
        this.f5229g = new C2493g(jVar, this, vVar);
        this.f5227e = jVar.f5271k;
        mo16467b(jVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo16468b(String str, C2509q qVar) {
        JSONObject jSONObject;
        if (!this.f5228f) {
            if (TextUtils.isEmpty(qVar.f5283f)) {
                C2498i.m6251a("By passing js callback due to empty callback: " + str);
                return;
            }
            if (!str.startsWith("{") || !str.endsWith("}")) {
                C2498i.m6250a((RuntimeException) new IllegalArgumentException("Illegal callback data: " + str));
            }
            C2498i.m6251a("Invoking js callback: " + qVar.f5283f);
            try {
                jSONObject = new JSONObject(str);
            } catch (Exception unused) {
                jSONObject = new JSONObject();
            }
            mo16465a(C2508p.m6277a().mo16513a("__msg_type", "callback").mo16513a("__callback_id", qVar.f5283f).mo16513a("__params", jSONObject).mo16514b(), qVar);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r5 = r9.optString("params");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0049 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.sdk.component.p088a.C2509q m6201a(org.json.JSONObject r9) {
        /*
            r8 = this;
            java.lang.String r0 = "params"
            boolean r1 = r8.f5228f
            r2 = 0
            if (r1 == 0) goto L_0x0008
            return r2
        L_0x0008:
            java.lang.String r1 = "__callback_id"
            java.lang.String r1 = r9.optString(r1)
            java.lang.String r3 = "func"
            java.lang.String r3 = r9.optString(r3)
            java.lang.String r4 = r8.mo16461a()
            if (r4 != 0) goto L_0x0023
            com.bytedance.sdk.component.a.m r9 = r8.f5224b
            if (r9 == 0) goto L_0x0022
            r0 = 3
            r9.mo16510a(r2, r2, r0)
        L_0x0022:
            return r2
        L_0x0023:
            java.lang.String r2 = "__msg_type"
            java.lang.String r2 = r9.getString(r2)     // Catch:{ JSONException -> 0x0084 }
            java.lang.String r5 = ""
            java.lang.Object r6 = r9.opt(r0)     // Catch:{ all -> 0x0049 }
            if (r6 == 0) goto L_0x004d
            boolean r5 = r6 instanceof org.json.JSONObject     // Catch:{ all -> 0x0049 }
            if (r5 == 0) goto L_0x003c
            org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ all -> 0x0049 }
            java.lang.String r5 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0049 }
            goto L_0x004d
        L_0x003c:
            boolean r5 = r6 instanceof java.lang.String     // Catch:{ all -> 0x0049 }
            if (r5 == 0) goto L_0x0044
            r5 = r6
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0049 }
            goto L_0x004d
        L_0x0044:
            java.lang.String r5 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0049 }
            goto L_0x004d
        L_0x0049:
            java.lang.String r5 = r9.optString(r0)     // Catch:{ JSONException -> 0x0084 }
        L_0x004d:
            java.lang.String r0 = "JSSDK"
            java.lang.String r0 = r9.getString(r0)     // Catch:{ JSONException -> 0x0084 }
            java.lang.String r6 = "namespace"
            java.lang.String r6 = r9.optString(r6)     // Catch:{ JSONException -> 0x0084 }
            java.lang.String r7 = "__iframe_url"
            java.lang.String r9 = r9.optString(r7)     // Catch:{ JSONException -> 0x0084 }
            com.bytedance.sdk.component.a.q$a r7 = com.bytedance.sdk.component.p088a.C2509q.m6280a()     // Catch:{ JSONException -> 0x0084 }
            com.bytedance.sdk.component.a.q$a r0 = r7.mo16516a((java.lang.String) r0)     // Catch:{ JSONException -> 0x0084 }
            com.bytedance.sdk.component.a.q$a r0 = r0.mo16518b((java.lang.String) r2)     // Catch:{ JSONException -> 0x0084 }
            com.bytedance.sdk.component.a.q$a r0 = r0.mo16519c((java.lang.String) r3)     // Catch:{ JSONException -> 0x0084 }
            com.bytedance.sdk.component.a.q$a r0 = r0.mo16520d((java.lang.String) r5)     // Catch:{ JSONException -> 0x0084 }
            com.bytedance.sdk.component.a.q$a r0 = r0.mo16521e((java.lang.String) r1)     // Catch:{ JSONException -> 0x0084 }
            com.bytedance.sdk.component.a.q$a r0 = r0.mo16522f((java.lang.String) r6)     // Catch:{ JSONException -> 0x0084 }
            com.bytedance.sdk.component.a.q$a r9 = r0.mo16523g((java.lang.String) r9)     // Catch:{ JSONException -> 0x0084 }
            com.bytedance.sdk.component.a.q r9 = r9.mo16517a()     // Catch:{ JSONException -> 0x0084 }
            return r9
        L_0x0084:
            r9 = move-exception
            java.lang.String r0 = "Failed to create call."
            com.bytedance.sdk.component.p088a.C2498i.m6255b(r0, r9)
            com.bytedance.sdk.component.a.m r9 = r8.f5224b
            if (r9 == 0) goto L_0x0092
            r0 = 1
            r9.mo16510a(r4, r3, r0)
        L_0x0092:
            r9 = -1
            com.bytedance.sdk.component.a.q r9 = com.bytedance.sdk.component.p088a.C2509q.m6281a(r1, r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p088a.C2484a.m6201a(org.json.JSONObject):com.bytedance.sdk.component.a.q");
    }

    /* renamed from: b */
    private C2493g m6202b(String str) {
        if (TextUtils.equals(str, this.f5227e) || TextUtils.isEmpty(str)) {
            return this.f5229g;
        }
        return this.f5230h.get(str);
    }
}
