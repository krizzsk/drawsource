package com.tapjoy.internal;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tapjoy.TapjoyLog;
import com.tapjoy.internal.C11520gi;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tapjoy.internal.fs */
public abstract class C11488fs {

    /* renamed from: b */
    private static final String f27580b = C11488fs.class.getSimpleName();

    /* renamed from: a */
    public final Map<String, Object> f27581a = new HashMap();

    /* renamed from: c */
    private final Map<String, C11520gi.C11522a> f27582c = new HashMap();

    protected C11488fs(String str, String str2, String str3) {
        this.f27581a.put("placement", str);
        this.f27581a.put("placement_type", str2);
        this.f27581a.put(FirebaseAnalytics.Param.CONTENT_TYPE, str3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C11520gi.C11522a mo70013a(String str, Map<String, Object> map, Map<String, Long> map2) {
        C11520gi.C11522a b = C11520gi.m31534e(str).mo70063a().mo70067a(this.f27581a).mo70067a(map).mo70070b(map2);
        this.f27582c.put(str, b);
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C11520gi.C11522a mo70016b(String str, Map<String, Object> map, Map<String, Long> map2) {
        C11520gi.C11522a a = m31456a(str);
        if (a == null) {
            String str2 = f27580b;
            TapjoyLog.m30841e(str2, "Error when calling endTrackingEvent -- " + str + " tracking has not been started.");
        } else {
            a.mo70067a(this.f27581a).mo70067a(map).mo70070b(map2).mo70068b().mo70071c();
        }
        return a;
    }

    /* renamed from: a */
    private C11520gi.C11522a m31456a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.f27582c.remove(str);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo70014a(String str, Object obj) {
        this.f27581a.put(str, obj);
    }

    /* renamed from: c */
    public final void mo70017c() {
        this.f27582c.clear();
    }

    /* renamed from: a */
    public final C11520gi.C11522a mo70012a() {
        return mo70013a("Content.rendered", (Map<String, Object>) null, (Map<String, Long>) null);
    }

    /* renamed from: b */
    public final C11520gi.C11522a mo70015b() {
        return mo70016b("Content.rendered", (Map<String, Object>) null, (Map<String, Long>) null);
    }
}
