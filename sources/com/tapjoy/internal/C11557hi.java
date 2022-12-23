package com.tapjoy.internal;

import android.os.SystemClock;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tapjoy.internal.C11435ex;
import com.tapjoy.internal.C11441ez;
import com.tapjoy.internal.C11459ff;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.hi */
public final class C11557hi {

    /* renamed from: a */
    final C11570hm f27731a;

    /* renamed from: b */
    final C11555hh f27732b;

    /* renamed from: c */
    long f27733c;

    /* renamed from: d */
    private int f27734d = 1;

    /* renamed from: e */
    private final C11441ez.C11442a f27735e = new C11441ez.C11442a();

    C11557hi(C11570hm hmVar, C11555hh hhVar) {
        this.f27731a = hmVar;
        this.f27732b = hhVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo70102a() {
        C11456fe d = this.f27731a.mo70154d();
        C11570hm hmVar = this.f27731a;
        synchronized (hmVar) {
            int b = hmVar.f27784c.f27833h.mo70238b() + 1;
            hmVar.f27784c.f27833h.mo70236a(b);
            hmVar.f27783b.f27527h = Integer.valueOf(b);
        }
        C11435ex.C11436a a = mo70101a(C11445fa.APP, "bootup");
        this.f27733c = SystemClock.elapsedRealtime();
        if (d != null) {
            a.f27341s = d;
        }
        mo70103a(a);
    }

    /* renamed from: a */
    public final void mo70104a(String str, String str2, double d, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.f27731a.mo70142a(str2, d);
        C11435ex.C11436a a = mo70101a(C11445fa.APP, FirebaseAnalytics.Event.PURCHASE);
        C11459ff.C11460a aVar = new C11459ff.C11460a();
        aVar.f27449c = str;
        if (str2 != null) {
            aVar.f27452f = str2;
        }
        aVar.f27451e = Double.valueOf(d);
        if (str5 != null) {
            aVar.f27459m = str5;
        }
        if (str3 != null) {
            aVar.f27461o = str3;
        }
        if (str4 != null) {
            aVar.f27462p = str4;
        }
        a.f27338p = aVar.mo69978b();
        mo70103a(a);
        this.f27731a.mo70141a(a.f27327e.longValue(), d);
    }

    /* renamed from: a */
    public final void mo70106a(String str, String str2, String str3, String str4, Map<String, Long> map) {
        C11435ex.C11436a a = mo70101a(C11445fa.CUSTOM, str2);
        a.f27342t = str;
        a.f27343u = str3;
        a.f27344v = str4;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                a.f27345w.add(new C11447fb((String) next.getKey(), (Long) next.getValue()));
            }
        }
        mo70103a(a);
    }

    /* renamed from: a */
    public final void mo70107a(Map<String, Object> map) {
        C11435ex.C11436a a = mo70101a(C11445fa.CAMPAIGN, "impression");
        if (map != null) {
            a.f27340r = C11287bb.m30888a((Object) map);
        }
        mo70103a(a);
    }

    /* renamed from: a */
    public final void mo70108a(Map<String, Object> map, long j) {
        C11435ex.C11436a a = mo70101a(C11445fa.CAMPAIGN, "view");
        a.f27331i = Long.valueOf(j);
        if (map != null) {
            a.f27340r = C11287bb.m30888a((Object) map);
        }
        mo70103a(a);
    }

    /* renamed from: a */
    public final void mo70109a(Map<String, Object> map, String str) {
        C11435ex.C11436a a = mo70101a(C11445fa.CAMPAIGN, "click");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put("region", str);
        a.f27340r = C11287bb.m30888a((Object) linkedHashMap);
        mo70103a(a);
    }

    /* renamed from: a */
    public final void mo70105a(String str, String str2, int i, long j, long j2, Map<String, Long> map) {
        C11435ex.C11436a a = mo70101a(C11445fa.USAGES, str);
        a.f27346x = str2;
        a.f27347y = Integer.valueOf(i);
        a.f27348z = Long.valueOf(j);
        a.f27324A = Long.valueOf(j2);
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                a.f27345w.add(new C11447fb((String) next.getKey(), (Long) next.getValue()));
            }
        }
        mo70103a(a);
    }

    /* renamed from: a */
    public final C11435ex.C11436a mo70101a(C11445fa faVar, String str) {
        C11453fd b = this.f27731a.mo70150b();
        C11435ex.C11436a aVar = new C11435ex.C11436a();
        aVar.f27329g = C11570hm.f27781a;
        aVar.f27325c = faVar;
        aVar.f27326d = str;
        if (C11685u.m32056c()) {
            aVar.f27327e = Long.valueOf(C11685u.m32055b());
            aVar.f27328f = Long.valueOf(System.currentTimeMillis());
        } else {
            aVar.f27327e = Long.valueOf(System.currentTimeMillis());
            aVar.f27330h = Long.valueOf(SystemClock.elapsedRealtime());
        }
        aVar.f27332j = b.f27417d;
        aVar.f27333k = b.f27418e;
        aVar.f27334l = b.f27419f;
        return aVar;
    }

    /* renamed from: a */
    public final synchronized void mo70103a(C11435ex.C11436a aVar) {
        if (aVar.f27325c != C11445fa.USAGES) {
            int i = this.f27734d;
            this.f27734d = i + 1;
            aVar.f27336n = Integer.valueOf(i);
            if (this.f27735e.f27357c != null) {
                aVar.f27337o = this.f27735e.mo69956b();
            }
            this.f27735e.f27357c = aVar.f27325c;
            this.f27735e.f27358d = aVar.f27326d;
            this.f27735e.f27359e = aVar.f27342t;
        }
        C11555hh hhVar = this.f27732b;
        C11435ex b = aVar.mo69950b();
        try {
            hhVar.f27725a.mo70171a(b);
            if (hhVar.f27726b != null) {
                if (!C11554hg.f27724a) {
                    if (b.f27311n == C11445fa.CUSTOM) {
                        hhVar.mo70098a(false);
                        return;
                    }
                }
                hhVar.mo70098a(true);
                return;
            }
            hhVar.f27725a.flush();
        } catch (Exception unused) {
        }
    }
}
