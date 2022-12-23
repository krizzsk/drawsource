package com.applovin.impl.sdk;

import android.os.Bundle;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.p051c.C1869d;
import com.applovin.impl.sdk.p053e.C1887a;
import com.applovin.impl.sdk.p053e.C1912m;
import com.applovin.impl.sdk.p053e.C1918o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinVariableService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class VariableServiceImpl implements AppLovinVariableService {

    /* renamed from: a */
    private final C1969m f2858a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final AtomicBoolean f2859b = new AtomicBoolean();

    /* renamed from: c */
    private final AtomicBoolean f2860c = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public AppLovinVariableService.OnVariablesUpdateListener f2861d;

    /* renamed from: e */
    private Bundle f2862e;

    /* renamed from: f */
    private final Object f2863f = new Object();

    VariableServiceImpl(C1969m mVar) {
        this.f2858a = mVar;
        String str = (String) mVar.mo14535a(C1869d.f3378j);
        if (StringUtils.isValidString(str)) {
            updateVariables(JsonUtils.deserialize(str));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        return r5;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Object m3803a(java.lang.String r4, java.lang.Object r5, java.lang.Class<?> r6) {
        /*
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x0014
            boolean r4 = com.applovin.impl.sdk.C2102v.m5104a()
            if (r4 == 0) goto L_0x0013
            java.lang.String r4 = "AppLovinVariableService"
            java.lang.String r6 = "Unable to retrieve variable value for empty name"
            com.applovin.impl.sdk.C2102v.m5110i(r4, r6)
        L_0x0013:
            return r5
        L_0x0014:
            boolean r0 = com.applovin.impl.sdk.C2102v.m5104a()
            if (r0 == 0) goto L_0x0029
            com.applovin.impl.sdk.m r0 = r3.f2858a
            boolean r0 = r0.mo14574d()
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = "AppLovinSdk"
            java.lang.String r1 = "Attempted to retrieve variable before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener)."
            com.applovin.impl.sdk.C2102v.m5109h(r0, r1)
        L_0x0029:
            java.lang.Object r0 = r3.f2863f
            monitor-enter(r0)
            android.os.Bundle r1 = r3.f2862e     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x0053
            boolean r6 = com.applovin.impl.sdk.C2102v.m5104a()     // Catch:{ all -> 0x0096 }
            if (r6 == 0) goto L_0x0051
            java.lang.String r6 = "AppLovinVariableService"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0096 }
            r1.<init>()     // Catch:{ all -> 0x0096 }
            java.lang.String r2 = "Unable to retrieve variable value for name \""
            r1.append(r2)     // Catch:{ all -> 0x0096 }
            r1.append(r4)     // Catch:{ all -> 0x0096 }
            java.lang.String r4 = "\". No variables returned by the server."
            r1.append(r4)     // Catch:{ all -> 0x0096 }
            java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x0096 }
            com.applovin.impl.sdk.C2102v.m5110i(r6, r4)     // Catch:{ all -> 0x0096 }
        L_0x0051:
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            return r5
        L_0x0053:
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            boolean r1 = r6.equals(r1)     // Catch:{ all -> 0x0096 }
            if (r1 == 0) goto L_0x0065
            android.os.Bundle r6 = r3.f2862e     // Catch:{ all -> 0x0096 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0096 }
            java.lang.String r4 = r6.getString(r4, r5)     // Catch:{ all -> 0x0096 }
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            return r4
        L_0x0065:
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            boolean r6 = r6.equals(r1)     // Catch:{ all -> 0x0096 }
            if (r6 == 0) goto L_0x007f
            android.os.Bundle r6 = r3.f2862e     // Catch:{ all -> 0x0096 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x0096 }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x0096 }
            boolean r4 = r6.getBoolean(r4, r5)     // Catch:{ all -> 0x0096 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0096 }
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            return r4
        L_0x007f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0096 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0096 }
            r6.<init>()     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = "Unable to retrieve variable value for "
            r6.append(r1)     // Catch:{ all -> 0x0096 }
            r6.append(r4)     // Catch:{ all -> 0x0096 }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x0096 }
            r5.<init>(r4)     // Catch:{ all -> 0x0096 }
            throw r5     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.VariableServiceImpl.m3803a(java.lang.String, java.lang.Object, java.lang.Class):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3805a() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f2863f
            monitor-enter(r0)
            com.applovin.sdk.AppLovinVariableService$OnVariablesUpdateListener r1 = r4.f2861d     // Catch:{ all -> 0x0021 }
            if (r1 == 0) goto L_0x001f
            android.os.Bundle r1 = r4.f2862e     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x000c
            goto L_0x001f
        L_0x000c:
            android.os.Bundle r1 = r4.f2862e     // Catch:{ all -> 0x0021 }
            java.lang.Object r1 = r1.clone()     // Catch:{ all -> 0x0021 }
            android.os.Bundle r1 = (android.os.Bundle) r1     // Catch:{ all -> 0x0021 }
            r2 = 1
            com.applovin.impl.sdk.VariableServiceImpl$2 r3 = new com.applovin.impl.sdk.VariableServiceImpl$2     // Catch:{ all -> 0x0021 }
            r3.<init>(r1)     // Catch:{ all -> 0x0021 }
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(r2, r3)     // Catch:{ all -> 0x0021 }
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            return
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            return
        L_0x0021:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.VariableServiceImpl.m3805a():void");
    }

    public boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    public boolean getBoolean(String str, boolean z) {
        return ((Boolean) m3803a(str, Boolean.valueOf(z), Boolean.class)).booleanValue();
    }

    public String getString(String str) {
        return getString(str, (String) null);
    }

    public String getString(String str, String str2) {
        return (String) m3803a(str, str2, String.class);
    }

    @Deprecated
    public void loadVariables() {
        String str;
        if (this.f2858a.mo14574d()) {
            if (this.f2859b.compareAndSet(false, true)) {
                this.f2858a.mo14526S().mo14429a((C1887a) new C1912m(this.f2858a, new C1912m.C1914a() {
                    /* renamed from: a */
                    public void mo14043a() {
                        VariableServiceImpl.this.f2859b.set(false);
                    }
                }), C1918o.C1920a.BACKGROUND);
                return;
            } else if (C2102v.m5104a()) {
                str = "Ignored explicit variables load. Service is already in the process of retrieving the latest set of variables.";
            } else {
                return;
            }
        } else if (C2102v.m5104a()) {
            str = "The AppLovin SDK is waiting for the initial variables to be returned upon completing initialization.";
        } else {
            return;
        }
        C2102v.m5110i("AppLovinVariableService", str);
    }

    @Deprecated
    public void setOnVariablesUpdateListener(AppLovinVariableService.OnVariablesUpdateListener onVariablesUpdateListener) {
        this.f2861d = onVariablesUpdateListener;
        synchronized (this.f2863f) {
            if (onVariablesUpdateListener != null) {
                if (this.f2862e != null && this.f2860c.compareAndSet(false, true)) {
                    if (C2102v.m5104a()) {
                        this.f2858a.mo14509A().mo15012b("AppLovinVariableService", "Setting initial listener");
                    }
                    m3805a();
                }
            }
        }
    }

    public String toString() {
        return "VariableService{variables=" + this.f2862e + ", listener=" + this.f2861d + '}';
    }

    public void updateVariables(JSONObject jSONObject) {
        if (C2102v.m5104a()) {
            C2102v A = this.f2858a.mo14509A();
            A.mo15012b("AppLovinVariableService", "Updating variables: " + jSONObject + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        synchronized (this.f2863f) {
            this.f2862e = JsonUtils.toBundle(jSONObject);
            m3805a();
            this.f2858a.mo14541a(C1869d.f3378j, jSONObject.toString());
        }
    }
}
