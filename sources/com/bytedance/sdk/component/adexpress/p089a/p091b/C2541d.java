package com.bytedance.sdk.component.adexpress.p089a.p091b;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.p089a.p090a.C2529a;
import com.bytedance.sdk.component.adexpress.p089a.p092c.C2546b;
import com.bytedance.sdk.component.adexpress.p089a.p092c.C2547c;
import com.bytedance.sdk.component.p118e.C2843b;
import com.bytedance.sdk.component.p118e.p120b.C2846b;
import com.bytedance.sdk.component.p123f.C2882e;
import com.bytedance.sdk.component.p123f.C2885g;
import com.bytedance.sdk.component.utils.C2905l;
import com.vungle.warren.model.AdvertisementDBAdapter;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.a.b.d */
/* compiled from: TmplDiffManager */
public class C2541d {

    /* renamed from: a */
    private static volatile C2541d f5361a;

    /* renamed from: b */
    private AtomicBoolean f5362b = new AtomicBoolean(false);

    /* renamed from: a */
    public static C2541d m6403a() {
        if (f5361a == null) {
            synchronized (C2541d.class) {
                if (f5361a == null) {
                    f5361a = new C2541d();
                }
            }
        }
        return f5361a;
    }

    private C2541d() {
    }

    /* renamed from: a */
    public C2546b mo16587a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return C2539c.m6394a().mo16580a(str);
    }

    /* renamed from: b */
    public Set<String> mo16590b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return C2539c.m6394a().mo16584b(str);
    }

    /* renamed from: b */
    private void m6407b() {
        if (C2529a.m6339a().mo16550c() != null) {
            int a = C2529a.m6339a().mo16550c().mo16557a();
            if (a <= 0) {
                a = 100;
            }
            List<C2546b> b = C2539c.m6394a().mo16583b();
            if (b.isEmpty() || a >= b.size()) {
                C2905l.m8111b("TmplDiffManager", "end doCheckAndDeleteTask maxTplCnt,local size" + a + ", 目前存储的模版的个数 " + b.size());
                return;
            }
            TreeMap treeMap = new TreeMap();
            for (C2546b next : b) {
                treeMap.put(next.mo16624g(), next);
            }
            HashSet hashSet = new HashSet();
            int size = (int) (((float) b.size()) - (((float) a) * 0.75f));
            int i = 0;
            for (Map.Entry entry : treeMap.entrySet()) {
                if (entry != null && i < size) {
                    i++;
                    ((Long) entry.getKey()).longValue();
                    C2546b bVar = (C2546b) entry.getValue();
                    if (bVar != null) {
                        hashSet.add(bVar.mo16615b());
                    }
                }
            }
            mo16589a((Set<String>) hashSet);
            this.f5362b.set(false);
        }
    }

    /* renamed from: c */
    private JSONObject m6409c(String str) {
        if (C2529a.m6339a().mo16550c() == null) {
            return null;
        }
        C2846b g = C2529a.m6339a().mo16550c().mo16563g();
        g.mo17711a(str);
        C2843b a = g.mo17707a();
        if (a != null) {
            try {
                if (a.mo17701f() && a.mo17699d() != null) {
                    return new JSONObject(a.mo17699d());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo16588a(C2547c cVar, String str) {
        if (cVar == null) {
            C2905l.m8118e("TmplDiffManager", "saveTemplate error: tplInfo == null");
            return;
        }
        final String str2 = cVar.f5386a;
        final String str3 = cVar.f5388c;
        final String str4 = cVar.f5387b;
        final String str5 = cVar.f5389d;
        final String str6 = cVar.f5390e;
        final String h = TextUtils.isEmpty(str) ? C2529a.m6339a().mo16550c() != null ? C2529a.m6339a().mo16550c().mo16564h() : "" : str;
        if (TextUtils.isEmpty(str2)) {
            C2905l.m8118e("TmplDiffManager", "saveTemplate error:tmpId is empty");
        } else {
            C2882e.m8036a(new C2885g("saveTemplate") {
                public void run() {
                    C2541d.this.m6406a(str2, str3, str4, str5, str6, h);
                }
            }, 10);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0054, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m6406a(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.bytedance.sdk.component.adexpress.a.c.b r0 = r7.mo16587a((java.lang.String) r8)     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x0021
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0055 }
            if (r0 != 0) goto L_0x001f
            boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x0014
            goto L_0x001f
        L_0x0014:
            r0 = r7
            r1 = r13
            r2 = r8
            r3 = r10
            r4 = r9
            r5 = r11
            r6 = r12
            r0.m6408b(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0055 }
            goto L_0x003f
        L_0x001f:
            monitor-exit(r7)
            return
        L_0x0021:
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x002b
            r7.m6405a(r9, r13, r8)     // Catch:{ all -> 0x0055 }
            goto L_0x003f
        L_0x002b:
            boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x0035
            r7.m6405a(r9, r13, r8)     // Catch:{ all -> 0x0055 }
            goto L_0x003f
        L_0x0035:
            r0 = r7
            r1 = r13
            r2 = r8
            r3 = r10
            r4 = r9
            r5 = r11
            r6 = r12
            r0.m6408b(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0055 }
        L_0x003f:
            boolean r8 = com.bytedance.sdk.component.adexpress.p089a.p091b.C2543e.m6418b(r12)     // Catch:{ all -> 0x0055 }
            boolean r9 = com.bytedance.sdk.component.adexpress.p089a.p091b.C2533a.m6376f()     // Catch:{ all -> 0x0055 }
            if (r9 == 0) goto L_0x004b
            if (r8 == 0) goto L_0x0053
        L_0x004b:
            com.bytedance.sdk.component.adexpress.a.b.b r8 = com.bytedance.sdk.component.adexpress.p089a.p091b.C2535b.m6377a()     // Catch:{ all -> 0x0055 }
            r9 = 1
            r8.mo16570a((boolean) r9)     // Catch:{ all -> 0x0055 }
        L_0x0053:
            monitor-exit(r7)
            return
        L_0x0055:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.p089a.p091b.C2541d.m6406a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: b */
    private void m6408b(String str, String str2, String str3, String str4, String str5, String str6) {
        C2539c.m6394a().mo16581a(new C2546b().mo16612a(str).mo16614b(str2).mo16616c(str3).mo16618d(str4).mo16620e(str5).mo16622f(str6).mo16611a(Long.valueOf(System.currentTimeMillis())));
        m6407b();
    }

    /* renamed from: a */
    private void m6405a(String str, String str2, String str3) {
        JSONObject c;
        if (!TextUtils.isEmpty(str) && (c = m6409c(str)) != null) {
            String optString = c.optString(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_MD5);
            String optString2 = c.optString("version");
            String optString3 = c.optString("data");
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString3)) {
                C2546b a = new C2546b().mo16612a(str2).mo16614b(str3).mo16616c(optString).mo16618d(str).mo16620e(optString3).mo16622f(optString2).mo16611a(Long.valueOf(System.currentTimeMillis()));
                C2539c.m6394a().mo16581a(a);
                m6407b();
                if (C2543e.m6418b(optString2)) {
                    a.mo16622f(optString2);
                    C2535b.m6377a().mo16570a(true);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo16589a(Set<String> set) {
        try {
            C2539c.m6394a().mo16582a(set);
        } catch (Throwable th) {
            C2905l.m8111b("TmplDiffManager", th.getMessage());
        }
    }
}
