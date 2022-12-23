package com.ironsource.sdk.controller;

import android.text.TextUtils;
import com.ironsource.sdk.p285g.C8292c;
import com.ironsource.sdk.p285g.C8293d;
import com.ironsource.sdk.p288j.C8310a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ironsource.sdk.controller.j */
public final class C8170j {

    /* renamed from: a */
    private final Map<String, C8292c> f19854a = new LinkedHashMap();

    /* renamed from: b */
    private final Map<String, C8292c> f19855b = new LinkedHashMap();

    /* renamed from: c */
    private final Map<String, C8292c> f19856c = new LinkedHashMap();

    /* renamed from: a */
    public final C8292c mo56461a(C8293d.C8298e eVar, String str) {
        Map<String, C8292c> a;
        if (TextUtils.isEmpty(str) || (a = mo56463a(eVar)) == null) {
            return null;
        }
        return a.get(str);
    }

    /* renamed from: a */
    public final C8292c mo56462a(C8293d.C8298e eVar, String str, Map<String, String> map, C8310a aVar) {
        C8292c cVar = new C8292c(str, str, map, aVar);
        mo56464a(eVar, str, cVar);
        return cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Map<String, C8292c> mo56463a(C8293d.C8298e eVar) {
        if (eVar.name().equalsIgnoreCase(C8293d.C8298e.RewardedVideo.name())) {
            return this.f19854a;
        }
        if (eVar.name().equalsIgnoreCase(C8293d.C8298e.Interstitial.name())) {
            return this.f19855b;
        }
        if (eVar.name().equalsIgnoreCase(C8293d.C8298e.Banner.name())) {
            return this.f19856c;
        }
        return null;
    }

    /* renamed from: a */
    public void mo56464a(C8293d.C8298e eVar, String str, C8292c cVar) {
        Map<String, C8292c> a;
        if (!TextUtils.isEmpty(str) && (a = mo56463a(eVar)) != null) {
            a.put(str, cVar);
        }
    }

    /* renamed from: b */
    public final Collection<C8292c> mo56465b(C8293d.C8298e eVar) {
        Map<String, C8292c> a = mo56463a(eVar);
        return a != null ? a.values() : new ArrayList();
    }
}
