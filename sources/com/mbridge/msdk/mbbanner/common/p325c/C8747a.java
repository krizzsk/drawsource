package com.mbridge.msdk.mbbanner.common.p325c;

import android.content.Context;
import android.os.Handler;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.mbbanner.common.p323a.C8730b;
import com.mbridge.msdk.mbbanner.common.p323a.C8731c;
import com.mbridge.msdk.mbbanner.common.p324b.C8734b;
import com.mbridge.msdk.mbbanner.common.p324b.C8736d;
import com.mbridge.msdk.mbbanner.common.util.C8773a;
import com.mbridge.msdk.p078c.C2445b;
import com.mbridge.msdk.p078c.C2456d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.mbridge.msdk.mbbanner.common.c.a */
/* compiled from: BannerLoadManager */
public class C8747a {

    /* renamed from: a */
    private static final String f21474a = C8747a.class.getSimpleName();

    /* renamed from: h */
    private static volatile C8747a f21475h;

    /* renamed from: b */
    private Context f21476b = C8388a.m23845e().mo56913g();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C8773a f21477c = new C8773a();

    /* renamed from: d */
    private Map<String, C8731c> f21478d = new ConcurrentHashMap();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Map<String, Boolean> f21479e = new ConcurrentHashMap();

    /* renamed from: f */
    private Map<String, Handler> f21480f = new ConcurrentHashMap();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Map<String, Integer> f21481g = new ConcurrentHashMap();

    /* renamed from: a */
    public static C8747a m25208a() {
        if (f21475h == null) {
            synchronized (C8747a.class) {
                if (f21475h == null) {
                    f21475h = new C8747a();
                }
            }
        }
        return f21475h;
    }

    private C8747a() {
    }

    /* renamed from: a */
    public final void mo58393a(String str, String str2, final C8730b bVar, C8734b bVar2) {
        C8731c cVar;
        if (this.f21476b == null) {
            this.f21477c.mo58423a(bVar2, "Banner Context == null!", str2);
        } else if (bVar == null || bVar2 == null) {
            this.f21477c.mo58423a(bVar2, "Banner request parameters or callback empty!", str2);
        } else {
            Map<String, Boolean> map = this.f21479e;
            if (map == null || !map.containsKey(str2) || !this.f21479e.get(str2).booleanValue()) {
                this.f21479e.put(str2, true);
                if (this.f21478d.containsKey(str2)) {
                    cVar = this.f21478d.get(str2);
                } else {
                    C2456d e = C2445b.m6020a().mo16292e(C8388a.m23845e().mo56914h(), str2);
                    if (e == null) {
                        e = C2456d.m6070d(str2);
                    }
                    C8731c cVar2 = new C8731c(str2, "", 0, e.mo16331u() * 1);
                    this.f21478d.put(str2, cVar2);
                    cVar = cVar2;
                }
                new C8750b(this.f21476b, cVar, bVar2, this.f21477c).mo58398a(str, str2, bVar, (C8736d) new C8736d() {
                    /* renamed from: a */
                    public final void mo58371a(String str) {
                        synchronized (C8747a.m25208a()) {
                            bVar.mo58354a("");
                            C8747a.this.f21479e.put(str, false);
                        }
                    }
                });
                return;
            }
            this.f21477c.mo58423a(bVar2, "Current unit is loading!", str2);
        }
    }

    /* renamed from: b */
    public final void mo58395b(String str, String str2, C8730b bVar, C8734b bVar2) {
        Handler handler;
        if (bVar != null && bVar.mo58355b() > 0) {
            if (this.f21480f.containsKey(str2)) {
                handler = this.f21480f.get(str2);
            } else {
                handler = new Handler();
                this.f21480f.put(str2, handler);
            }
            final String str3 = str2;
            final C8734b bVar3 = bVar2;
            final String str4 = str;
            final C8730b bVar4 = bVar;
            C87492 r1 = new Runnable() {
                public final void run() {
                    int intValue;
                    if (C8747a.this.f21479e != null && C8747a.this.f21479e.containsKey(str3) && ((Boolean) C8747a.this.f21479e.get(str3)).booleanValue()) {
                        return;
                    }
                    if (!C8747a.this.f21481g.containsKey(str3) || !((intValue = ((Integer) C8747a.this.f21481g.get(str3)).intValue()) == 2 || intValue == 4)) {
                        C8747a.this.mo58393a(str4, str3, bVar4, bVar3);
                    } else if (C8747a.this.f21477c != null) {
                        C8747a.this.f21477c.mo58423a(bVar3, "banner load failed because env is exception", str3);
                    }
                }
            };
            handler.removeCallbacksAndMessages((Object) null);
            handler.postDelayed(r1, (long) bVar.mo58355b());
        }
    }

    /* renamed from: a */
    public final void mo58392a(String str) {
        if (this.f21480f.containsKey(str)) {
            this.f21480f.get(str).removeCallbacksAndMessages((Object) null);
            this.f21480f.remove(str);
        }
    }

    /* renamed from: a */
    public final void mo58391a(int i, String str, String str2, C8730b bVar, C8734b bVar2) {
        int intValue = this.f21481g.containsKey(str2) ? this.f21481g.get(str2).intValue() : 0;
        if (i == 1) {
            if (this.f21480f.containsKey(str2)) {
                this.f21480f.get(str2).removeCallbacksAndMessages((Object) null);
            }
            this.f21481g.put(str2, Integer.valueOf(i));
        } else if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    if (intValue == 0) {
                        this.f21481g.put(str2, 0);
                        return;
                    }
                    if (this.f21480f.containsKey(str2)) {
                        this.f21480f.get(str2).removeCallbacksAndMessages((Object) null);
                    }
                    this.f21481g.put(str2, Integer.valueOf(i));
                }
            } else if (intValue == 2 || intValue == 4) {
                this.f21481g.put(str2, 1);
                mo58395b(str, str2, bVar, bVar2);
            }
        } else if (intValue == 1) {
            if (this.f21480f.containsKey(str2)) {
                this.f21480f.get(str2).removeCallbacksAndMessages((Object) null);
            }
            this.f21481g.put(str2, Integer.valueOf(i));
        }
    }

    /* renamed from: b */
    public final void mo58394b() {
        Map<String, C8731c> map = this.f21478d;
        if (map != null) {
            map.clear();
        }
        Map<String, Boolean> map2 = this.f21479e;
        if (map2 != null) {
            map2.clear();
        }
        Map<String, Handler> map3 = this.f21480f;
        if (map3 != null) {
            for (Map.Entry next : map3.entrySet()) {
                if (next.getValue() != null) {
                    ((Handler) next.getValue()).removeCallbacksAndMessages((Object) null);
                }
            }
            this.f21480f.clear();
        }
        Map<String, Integer> map4 = this.f21481g;
        if (map4 != null) {
            map4.clear();
        }
    }
}
