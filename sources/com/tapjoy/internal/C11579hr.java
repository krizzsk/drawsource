package com.tapjoy.internal;

import com.tapjoy.internal.C11631it;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tapjoy.internal.hr */
public final class C11579hr implements C11319bz<C11631it.C11632a> {

    /* renamed from: a */
    public final C11558hj f27815a;

    /* renamed from: b */
    private final Map<String, C11578hq> f27816b = Collections.synchronizedMap(new HashMap());

    /* renamed from: c */
    private final Map<String, C11631it> f27817c = new HashMap();

    /* renamed from: d */
    private Set<String> f27818d = null;

    public C11579hr(C11558hj hjVar) {
        this.f27815a = hjVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo70164a() {
        synchronized (this) {
            this.f27818d = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo69764a(C11314bu<C11631it.C11632a> buVar, C11631it.C11632a aVar) {
        if (buVar instanceof C11631it) {
            if (aVar.f28028b != null) {
                List<String> list = aVar.f28028b;
                synchronized (this) {
                    this.f27818d = new HashSet(list);
                }
            }
            C11631it itVar = (C11631it) buVar;
            String str = itVar.f28020c;
            boolean z = itVar.f28021d;
            this.f27817c.remove(str);
            if (!z) {
                this.f27816b.put(str, aVar.f28027a);
            }
            C11578hq hqVar = aVar.f28027a;
            C11560hk hkVar = this.f27815a.f27754o;
            if (hqVar instanceof C11577hp) {
                C11554hg.m31622a("No content for \"{}\"", str);
                hkVar.mo69155a(str);
                return;
            }
            C11554hg.m31622a("New content for \"{}\" is ready", str);
            if (z) {
                hqVar.mo70090a(hkVar, new C11496fy());
            } else {
                hkVar.mo69158b(str);
            }
        } else {
            throw new IllegalStateException(buVar.getClass().getName());
        }
    }

    /* renamed from: a */
    public final void mo69763a(C11314bu<C11631it.C11632a> buVar) {
        mo69764a(buVar, new C11631it.C11632a(new C11577hp(), (List<String>) null));
    }
}
