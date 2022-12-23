package com.ironsource.sdk.p280c;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.c.a */
public final class C8116a extends FrameLayout implements C8125e {

    /* renamed from: a */
    public C8119c f19677a;

    /* renamed from: b */
    private boolean f19678b = false;

    public C8116a(C8119c cVar, Context context) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(cVar.f19688e.f19610a, cVar.f19688e.f19611b));
        this.f19677a = cVar;
        addView(cVar.f19686c);
    }

    /* renamed from: a */
    public void mo56327a() {
        JSONObject jSONObject;
        try {
            jSONObject = this.f19677a.f19687d.mo56311a().getJSONObject("configs").getJSONObject("visibilityParams");
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("adViewId", this.f19677a.f19684a).put("isBNAutoRemove", false).put("isBannerDisplay", this.f19678b);
        this.f19677a.f19687d.mo56317a("destroyBanner", jSONObject);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo56328a(final java.lang.String r4, final java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.ironsource.sdk.c.c r0 = r3.f19677a     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0034
            com.ironsource.sdk.c.c r0 = r3.f19677a     // Catch:{ all -> 0x0036 }
            com.ironsource.sdk.b.b r0 = r0.f19687d     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0034
            com.ironsource.sdk.c.c r0 = r3.f19677a     // Catch:{ all -> 0x0036 }
            android.webkit.WebView r0 = r0.f19686c     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x0012
            goto L_0x0034
        L_0x0012:
            com.ironsource.sdk.c.c r0 = r3.f19677a     // Catch:{ all -> 0x0036 }
            com.ironsource.sdk.b.b r0 = r0.f19687d     // Catch:{ all -> 0x0036 }
            com.ironsource.sdk.b.a r1 = r0.f19654a     // Catch:{ all -> 0x0036 }
            if (r1 == 0) goto L_0x0028
            com.ironsource.sdk.b.d r1 = r0.f19655b     // Catch:{ all -> 0x0036 }
            if (r1 != 0) goto L_0x001f
            goto L_0x0028
        L_0x001f:
            org.json.JSONObject r1 = r0.mo56311a()     // Catch:{ all -> 0x0036 }
            java.lang.String r2 = "containerWasRemoved"
            r0.mo56317a((java.lang.String) r2, (org.json.JSONObject) r1)     // Catch:{ all -> 0x0036 }
        L_0x0028:
            com.ironsource.environment.e.a r0 = com.ironsource.environment.p204e.C6385a.f16166a     // Catch:{ all -> 0x0036 }
            com.ironsource.sdk.c.a$1 r1 = new com.ironsource.sdk.c.a$1     // Catch:{ all -> 0x0036 }
            r1.<init>(r4, r5)     // Catch:{ all -> 0x0036 }
            r0.mo35891a(r1)     // Catch:{ all -> 0x0036 }
            monitor-exit(r3)
            return
        L_0x0034:
            monitor-exit(r3)
            return
        L_0x0036:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.p280c.C8116a.mo56328a(java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo56329a(String str, String str2, String str3) {
        C8119c cVar = this.f19677a;
        if (cVar != null) {
            cVar.mo56329a(str, str2, str3);
        }
    }

    /* renamed from: a */
    public final void mo56330a(JSONObject jSONObject, String str, String str2) {
        this.f19677a.mo56330a(jSONObject, str, str2);
    }

    /* renamed from: b */
    public final WebView mo56331b() {
        return this.f19677a.f19686c;
    }

    /* renamed from: b */
    public final void mo56332b(JSONObject jSONObject, String str, String str2) {
        this.f19677a.mo56332b(jSONObject, str, str2);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Logger.m23749i("IronSourceAdContainer", "onAttachedToWindow:");
        this.f19678b = true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:7|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0052, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0053, code lost:
        r1 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r1 = new org.json.JSONObject();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDetachedFromWindow() {
        /*
            r5 = this;
            super.onDetachedFromWindow()
            java.lang.String r0 = "IronSourceAdContainer"
            java.lang.String r1 = "onDetachedFromWindow:"
            com.ironsource.sdk.utils.Logger.m23749i(r0, r1)
            com.ironsource.sdk.c.c r1 = r5.f19677a
            if (r1 == 0) goto L_0x005b
            com.ironsource.sdk.b.b r1 = r1.f19687d
            if (r1 != 0) goto L_0x0013
            goto L_0x005b
        L_0x0013:
            r1 = 0
            r5.f19678b = r1
            com.ironsource.sdk.c.c r1 = r5.f19677a     // Catch:{ Exception -> 0x002b }
            com.ironsource.sdk.b.b r1 = r1.f19687d     // Catch:{ Exception -> 0x002b }
            org.json.JSONObject r1 = r1.mo56311a()     // Catch:{ Exception -> 0x002b }
            java.lang.String r2 = "configs"
            org.json.JSONObject r1 = r1.getJSONObject(r2)     // Catch:{ Exception -> 0x002b }
            java.lang.String r2 = "visibilityParams"
            org.json.JSONObject r1 = r1.getJSONObject(r2)     // Catch:{ Exception -> 0x002b }
            goto L_0x0030
        L_0x002b:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0052 }
            r1.<init>()     // Catch:{ Exception -> 0x0052 }
        L_0x0030:
            java.lang.String r2 = "adViewId"
            com.ironsource.sdk.c.c r3 = r5.f19677a     // Catch:{ Exception -> 0x0052 }
            java.lang.String r3 = r3.f19684a     // Catch:{ Exception -> 0x0052 }
            org.json.JSONObject r2 = r1.put(r2, r3)     // Catch:{ Exception -> 0x0052 }
            java.lang.String r3 = "isBNAutoRemove"
            r4 = 1
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch:{ Exception -> 0x0052 }
            java.lang.String r3 = "isBannerDisplay"
            boolean r4 = r5.f19678b     // Catch:{ Exception -> 0x0052 }
            r2.put(r3, r4)     // Catch:{ Exception -> 0x0052 }
            com.ironsource.sdk.c.c r2 = r5.f19677a     // Catch:{ Exception -> 0x0052 }
            com.ironsource.sdk.b.b r2 = r2.f19687d     // Catch:{ Exception -> 0x0052 }
            java.lang.String r3 = "destroyBanner"
            r2.mo56317a((java.lang.String) r3, (org.json.JSONObject) r1)     // Catch:{ Exception -> 0x0052 }
            return
        L_0x0052:
            r1 = move-exception
            java.lang.String r1 = r1.toString()
        L_0x0057:
            com.ironsource.sdk.utils.Logger.m23749i(r0, r1)
            return
        L_0x005b:
            java.lang.String r1 = "in onDetachedFromWindow mAdPresenter or mAdPresenter.getLogic() are null"
            goto L_0x0057
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.p280c.C8116a.onDetachedFromWindow():void");
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        Logger.m23749i("IronSourceAdContainer", "onVisibilityChanged: " + i);
        C8119c cVar = this.f19677a;
        if (cVar != null) {
            try {
                cVar.f19687d.mo56314a("isVisible", i, isShown());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        Logger.m23749i("IronSourceAdContainer", "onWindowVisibilityChanged: " + i);
        C8119c cVar = this.f19677a;
        if (cVar != null) {
            try {
                cVar.f19687d.mo56314a("isWindowVisible", i, isShown());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
