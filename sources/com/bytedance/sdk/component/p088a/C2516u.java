package com.bytedance.sdk.component.p088a;

import android.net.Uri;
import com.bytedance.sdk.component.p088a.C2500k;
import com.bytedance.sdk.component.p088a.C2517v;
import com.bytedance.sdk.component.p088a.C2522w;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.bytedance.sdk.component.a.u */
/* compiled from: PermissionChecker */
class C2516u {

    /* renamed from: a */
    private final Set<String> f5305a;

    /* renamed from: b */
    private final Set<String> f5306b;

    /* renamed from: c */
    private final C2522w f5307c = C2512r.f5293a;

    /* renamed from: d */
    private final C2517v f5308d;

    /* renamed from: e */
    private C2500k.C2503b f5309e;

    C2516u(C2517v vVar, Set<String> set, Set<String> set2) {
        this.f5308d = vVar;
        if (set == null || set.isEmpty()) {
            this.f5305a = new LinkedHashSet();
        } else {
            this.f5305a = new LinkedHashSet(set);
        }
        if (set2 == null || set2.isEmpty()) {
            this.f5306b = new LinkedHashSet();
        } else {
            this.f5306b = new LinkedHashSet(set2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized C2524x mo16530a(boolean z, String str, C2486b bVar) throws C2517v.C2519a {
        C2524x xVar;
        Uri parse = Uri.parse(str);
        String host = parse.getHost();
        if (host == null) {
            return null;
        }
        C2524x xVar2 = this.f5306b.contains(bVar.mo16471a()) ? C2524x.PUBLIC : null;
        Iterator<String> it = this.f5305a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (parse.getHost().equals(next)) {
                break;
            }
            if (host.endsWith("." + next)) {
                break;
            }
        }
        xVar2 = C2524x.PRIVATE;
        if (xVar2 == null && this.f5309e != null && this.f5309e.mo16505a(str)) {
            if (this.f5309e.mo16506a(str, bVar.mo16471a())) {
                return null;
            }
            xVar2 = C2524x.PRIVATE;
        }
        if (z) {
            xVar = mo16529a(str, bVar);
        } else {
            xVar = mo16533b(str, bVar);
        }
        if (xVar != null) {
            return xVar;
        }
        return xVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized C2524x mo16529a(String str, C2486b bVar) throws C2517v.C2519a {
        return m6305a(str, bVar, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized C2524x mo16533b(String str, C2486b bVar) {
        return m6305a(str, bVar, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16531a(C2500k.C2503b bVar) {
        this.f5309e = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16532a(C2522w.C2523a aVar) {
        C2522w wVar = this.f5307c;
        if (wVar != null) {
            wVar.mo16538a(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo16534b(C2522w.C2523a aVar) {
        C2522w wVar = this.f5307c;
        if (wVar != null) {
            wVar.mo16539b(aVar);
        }
    }

    /* renamed from: a */
    private C2524x m6305a(String str, C2486b bVar, boolean z) {
        C2517v vVar;
        if (!z || (vVar = this.f5308d) == null) {
            return null;
        }
        C2517v.C2521c a = vVar.mo16535a(str, this.f5305a);
        if (a.f5323c.contains(bVar.mo16471a())) {
            return null;
        }
        if (a.f5322b.contains(bVar.mo16471a())) {
            return C2524x.PRIVATE;
        }
        if (a.f5321a.compareTo(bVar.mo16473b()) < 0) {
            return null;
        }
        return a.f5321a;
    }
}
