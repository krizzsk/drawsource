package com.mbridge.msdk.videocommon.p375d;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.p083a.p084a.C2461a;
import com.mbridge.msdk.foundation.same.report.C8598e;
import com.mbridge.msdk.videocommon.download.C9652g;
import com.mbridge.msdk.videocommon.p373b.C9628a;
import com.mbridge.msdk.videocommon.p373b.C9629b;
import com.mbridge.msdk.videocommon.p373b.C9630c;
import com.mbridge.msdk.videocommon.p374c.C9631a;
import com.mbridge.msdk.videocommon.p374c.C9636c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.videocommon.d.b */
/* compiled from: RewardSettingManager */
public class C9638b {

    /* renamed from: a */
    public static C9637a f23937a = null;

    /* renamed from: b */
    private static ConcurrentHashMap<String, C9640c> f23938b = new ConcurrentHashMap<>();

    /* renamed from: d */
    private static volatile C9638b f23939d;

    /* renamed from: c */
    private volatile boolean f23940c = false;

    /* renamed from: e */
    private CopyOnWriteArrayList<String> f23941e = new CopyOnWriteArrayList<>();

    private C9638b() {
    }

    /* renamed from: a */
    public static C9638b m27377a() {
        if (f23939d == null) {
            synchronized (C9638b.class) {
                if (f23939d == null) {
                    f23939d = new C9638b();
                }
            }
        }
        return f23939d;
    }

    /* renamed from: a */
    public final void mo63552a(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                this.f23941e.remove(str);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0047 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.mbridge.msdk.videocommon.p375d.C9637a mo63556b() {
        /*
            r7 = this;
            com.mbridge.msdk.videocommon.d.a r0 = f23937a
            if (r0 != 0) goto L_0x0077
            com.mbridge.msdk.foundation.a.a.a r0 = com.mbridge.msdk.foundation.p083a.p084a.C2461a.m6124a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "reward_"
            r1.append(r2)
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            java.lang.String r2 = r2.mo56914h()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = r0.mo16390b(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0060
            com.mbridge.msdk.videocommon.d.a r0 = com.mbridge.msdk.videocommon.p375d.C9637a.m27358a((java.lang.String) r0)
            if (r0 == 0) goto L_0x0044
            long r1 = r0.mo63536b()
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r0.mo63546g()
            long r5 = r5 + r1
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0044
            r1 = 0
            goto L_0x0045
        L_0x0044:
            r1 = 1
        L_0x0045:
            if (r1 != 0) goto L_0x0048
            return r0
        L_0x0048:
            com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            java.lang.String r0 = r0.mo56914h()
            com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            java.lang.String r1 = r1.mo56916j()
            r7.m27380b(r0, r1)
            com.mbridge.msdk.videocommon.d.a r0 = r7.mo63558c()
            return r0
        L_0x0060:
            com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            java.lang.String r0 = r0.mo56914h()
            com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            java.lang.String r1 = r1.mo56916j()
            r7.m27380b(r0, r1)
            com.mbridge.msdk.videocommon.d.a r0 = r7.mo63558c()
        L_0x0077:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.p375d.C9638b.mo63556b():com.mbridge.msdk.videocommon.d.a");
    }

    /* renamed from: b */
    private void m27380b(String str, String str2) {
        if (!this.f23940c) {
            this.f23940c = true;
            new C9631a().mo63529a(C8388a.m23845e().mo56913g(), str, str2);
        }
    }

    /* renamed from: a */
    public final void mo63554a(String str, String str2, String str3, C9636c cVar) {
        try {
            if (TextUtils.isEmpty(str3) || !this.f23941e.contains(str3)) {
                if (!TextUtils.isEmpty(str3)) {
                    this.f23941e.add(str3);
                }
                new C9631a().mo63530a(C8388a.m23845e().mo56913g(), str, str2, str3, cVar);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final C9640c mo63550a(String str, String str2) {
        C9640c cVar;
        String str3 = "reward" + "_" + str + "_" + str2;
        if (f23938b.containsKey(str3)) {
            boolean z = false;
            try {
                cVar = f23938b.get(str3);
                try {
                    z = m27378a(cVar);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                cVar = null;
            }
            if (z) {
                mo63554a(str, C8388a.m23845e().mo56916j(), str2, (C9636c) null);
            }
            return cVar;
        }
        C9640c c = C9640c.m27395c(C2461a.m6124a().mo16390b(str3));
        if (m27378a(c)) {
            mo63554a(str, C8388a.m23845e().mo56916j(), str2, (C9636c) null);
            return null;
        }
        f23938b.put(str3, c);
        return c;
    }

    /* renamed from: a */
    public final C9640c mo63551a(String str, String str2, boolean z) {
        C9640c cVar;
        String str3 = "reward_" + str + "_" + str2;
        if (f23938b.containsKey(str3)) {
            boolean z2 = false;
            try {
                cVar = f23938b.get(str3);
                try {
                    z2 = m27378a(cVar);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                cVar = null;
            }
            if (z2) {
                mo63554a(str, C8388a.m23845e().mo56916j(), str2, (C9636c) null);
            }
            return cVar;
        }
        C9640c c = C9640c.m27395c(C2461a.m6124a().mo16390b(str3));
        if (!m27378a(c)) {
            f23938b.put(str3, c);
            return c;
        } else if (c != null) {
            return c;
        } else {
            mo63554a(str, C8388a.m23845e().mo56916j(), str2, (C9636c) null);
            return m27379b(z);
        }
    }

    /* renamed from: c */
    public final C9637a mo63558c() {
        C9637a aVar = new C9637a();
        HashMap hashMap = new HashMap(5);
        hashMap.put("1", 1000);
        hashMap.put("9", 1000);
        hashMap.put("8", 1000);
        HashMap hashMap2 = new HashMap(3);
        hashMap2.put("1", new C9630c("Virtual Item", 1));
        aVar.mo63535a((Map<String, Integer>) hashMap);
        aVar.mo63538b((Map<String, C9630c>) hashMap2);
        aVar.mo63534a(43200);
        aVar.mo63537b(5400);
        aVar.mo63540c(3600);
        aVar.mo63542d(3600);
        aVar.mo63544e(5);
        aVar.mo63533a(1);
        return aVar;
    }

    /* renamed from: a */
    private final boolean m27378a(C9640c cVar) {
        C9637a b = mo63556b();
        if (b == null || cVar == null) {
            return true;
        }
        return cVar.mo63610v() + b.mo63539c() <= System.currentTimeMillis();
    }

    /* renamed from: a */
    public final void mo63553a(String str, String str2, String str3) {
        String str4 = "reward_" + str + "_" + str2;
        C2461a.m6124a().mo16388a(str4, str3);
        f23938b.put(str4, C9640c.m27395c(str3));
        if (!TextUtils.isEmpty(C9640c.f23946a)) {
            m27381c(C9640c.f23946a, str2);
        }
    }

    /* renamed from: b */
    public final void mo63557b(String str) {
        if (!TextUtils.isEmpty(str)) {
            m27377a().mo63551a(C8388a.m23845e().mo56914h(), str, false);
            String str2 = C9640c.f23946a;
            if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(C9652g.m27539a().mo63670b(str2))) {
                m27381c(str2, str);
            }
        }
    }

    /* renamed from: c */
    private void m27381c(final String str, final String str2) {
        if (TextUtils.isEmpty(str)) {
            Context g = C8388a.m23845e().mo56913g();
            C8598e.m24673a(g, str, str2, 2, "alert url is exception ,url:" + str);
            return;
        }
        C9652g.m27539a().mo63671b(str, new C9652g.C9660d() {
            /* renamed from: a */
            public final void mo58372a(String str) {
                C8598e.m24673a(C8388a.m23845e().mo56913g(), str, str2, 1, "");
            }

            /* renamed from: a */
            public final void mo58373a(String str, String str2) {
                C8598e.m24673a(C8388a.m23845e().mo56913g(), str, str2, 2, str2);
            }
        });
    }

    /* renamed from: a */
    public final void mo63555a(boolean z) {
        this.f23940c = z;
    }

    /* renamed from: c */
    public static boolean m27382c(String str) {
        JSONArray optJSONArray;
        try {
            if (!TextUtils.isEmpty(str) && (optJSONArray = new JSONObject(str).optJSONArray("unitSetting")) != null) {
                String optString = optJSONArray.optJSONObject(0).optString("unitId");
                if (optJSONArray == null || optJSONArray.length() <= 0 || TextUtils.isEmpty(optString)) {
                    return false;
                }
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    private static C9640c m27379b(boolean z) {
        C9640c cVar = new C9640c();
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C9629b(1, 15, (C9628a) null));
            cVar.mo63568a((List<C9629b>) arrayList);
            cVar.mo63593m(1);
            cVar.mo63591l(1);
            cVar.mo63595n(1);
            cVar.mo63601q(1);
            cVar.mo63597o(1);
            cVar.mo63599p(1);
            cVar.mo63583h(3);
            cVar.mo63585i(80);
            cVar.mo63587j(100);
            cVar.mo63589k(0);
            cVar.mo63581g(2);
            cVar.mo63577e(-1);
            cVar.mo63615x(70);
            cVar.mo63575d(2);
            if (z) {
                cVar.mo63573c(5);
            } else {
                cVar.mo63573c(-1);
            }
            cVar.mo63570b(0);
            cVar.mo63565a(0);
            cVar.mo63579f(1);
            cVar.mo63603r(1);
            cVar.mo63607t(3);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(4);
            arrayList2.add(6);
            cVar.mo63567a((ArrayList<Integer>) arrayList2);
            cVar.mo63609u(1);
            cVar.mo63611v(1);
            cVar.mo63613w(60);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cVar;
    }
}
