package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.p054vk.openvk.component.video.api.p071c.C2400b;
import com.bytedance.sdk.component.p118e.C2843b;
import com.bytedance.sdk.component.p118e.p119a.C2842a;
import com.bytedance.sdk.component.p118e.p120b.C2844a;
import com.bytedance.sdk.component.p118e.p120b.C2848c;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.C3356b;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.p149e.C3434p;
import com.bytedance.sdk.openadsdk.p128b.C3090e;
import com.bytedance.sdk.openadsdk.p174i.C3792d;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.g */
/* compiled from: RewardVideoCache */
public class C3284g {

    /* renamed from: a */
    private static volatile C3284g f7790a;

    /* renamed from: b */
    private final Context f7791b;

    /* renamed from: c */
    private final C3301j f7792c;

    /* renamed from: d */
    private Map<C3431n, Long> f7793d = Collections.synchronizedMap(new HashMap());

    /* renamed from: com.bytedance.sdk.openadsdk.component.reward.g$a */
    /* compiled from: RewardVideoCache */
    interface C3288a<T> {
        /* renamed from: a */
        void mo19126a(boolean z, T t);
    }

    /* renamed from: a */
    public void mo19119a(String str) {
        this.f7792c.mo19143d(str);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|(2:5|6)(1:7)|8|(2:14|(5:16|17|18|(2:20|44)(2:21|43)|22))|24|25|(1:52)(4:35|(5:37|38|39|46|40)|45|53)) */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0075 */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0097 A[Catch:{ all -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19115a() {
        /*
            r9 = this;
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0075 }
            java.lang.String r2 = "shared_prefs"
            r3 = 24
            if (r1 < r3) goto L_0x0015
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0075 }
            android.content.Context r4 = r9.f7791b     // Catch:{ all -> 0x0075 }
            java.io.File r4 = r4.getDataDir()     // Catch:{ all -> 0x0075 }
            r1.<init>(r4, r2)     // Catch:{ all -> 0x0075 }
            goto L_0x002b
        L_0x0015:
            android.content.Context r1 = r9.f7791b     // Catch:{ all -> 0x0075 }
            java.lang.String r4 = "1"
            java.io.File r1 = r1.getDatabasePath(r4)     // Catch:{ all -> 0x0075 }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0075 }
            java.io.File r1 = r1.getParentFile()     // Catch:{ all -> 0x0075 }
            java.io.File r1 = r1.getParentFile()     // Catch:{ all -> 0x0075 }
            r4.<init>(r1, r2)     // Catch:{ all -> 0x0075 }
            r1 = r4
        L_0x002b:
            boolean r2 = r1.exists()     // Catch:{ all -> 0x0075 }
            if (r2 == 0) goto L_0x0075
            boolean r2 = r1.isDirectory()     // Catch:{ all -> 0x0075 }
            if (r2 == 0) goto L_0x0075
            com.bytedance.sdk.openadsdk.component.reward.g$1 r2 = new com.bytedance.sdk.openadsdk.component.reward.g$1     // Catch:{ all -> 0x0075 }
            r2.<init>()     // Catch:{ all -> 0x0075 }
            java.io.File[] r1 = r1.listFiles(r2)     // Catch:{ all -> 0x0075 }
            if (r1 == 0) goto L_0x0075
            int r2 = r1.length     // Catch:{ all -> 0x0075 }
            r4 = r0
        L_0x0044:
            if (r4 >= r2) goto L_0x0075
            r5 = r1[r4]     // Catch:{ all -> 0x0075 }
            java.lang.String r6 = r5.getName()     // Catch:{ all -> 0x0072 }
            java.lang.String r7 = ".xml"
            java.lang.String r8 = ""
            java.lang.String r6 = r6.replace(r7, r8)     // Catch:{ all -> 0x0072 }
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0072 }
            if (r7 < r3) goto L_0x005e
            android.content.Context r5 = r9.f7791b     // Catch:{ all -> 0x0072 }
            r5.deleteSharedPreferences(r6)     // Catch:{ all -> 0x0072 }
            goto L_0x0072
        L_0x005e:
            android.content.Context r7 = r9.f7791b     // Catch:{ all -> 0x0072 }
            android.content.SharedPreferences r6 = r7.getSharedPreferences(r6, r0)     // Catch:{ all -> 0x0072 }
            android.content.SharedPreferences$Editor r6 = r6.edit()     // Catch:{ all -> 0x0072 }
            android.content.SharedPreferences$Editor r6 = r6.clear()     // Catch:{ all -> 0x0072 }
            r6.apply()     // Catch:{ all -> 0x0072 }
            com.bytedance.sdk.component.utils.C2894f.m8086c(r5)     // Catch:{ all -> 0x0072 }
        L_0x0072:
            int r4 = r4 + 1
            goto L_0x0044
        L_0x0075:
            android.content.Context r1 = r9.f7791b     // Catch:{ all -> 0x00a2 }
            java.io.File r1 = r1.getCacheDir()     // Catch:{ all -> 0x00a2 }
            if (r1 == 0) goto L_0x00a2
            boolean r2 = r1.exists()     // Catch:{ all -> 0x00a2 }
            if (r2 == 0) goto L_0x00a2
            boolean r2 = r1.isDirectory()     // Catch:{ all -> 0x00a2 }
            if (r2 == 0) goto L_0x00a2
            com.bytedance.sdk.openadsdk.component.reward.g$2 r2 = new com.bytedance.sdk.openadsdk.component.reward.g$2     // Catch:{ all -> 0x00a2 }
            r2.<init>()     // Catch:{ all -> 0x00a2 }
            java.io.File[] r1 = r1.listFiles(r2)     // Catch:{ all -> 0x00a2 }
            if (r1 == 0) goto L_0x00a2
            int r2 = r1.length     // Catch:{ all -> 0x00a2 }
            if (r2 <= 0) goto L_0x00a2
            int r2 = r1.length     // Catch:{ all -> 0x00a2 }
        L_0x0098:
            if (r0 >= r2) goto L_0x00a2
            r3 = r1[r0]     // Catch:{ all -> 0x00a2 }
            com.bytedance.sdk.component.utils.C2894f.m8086c(r3)     // Catch:{ all -> 0x009f }
        L_0x009f:
            int r0 = r0 + 1
            goto L_0x0098
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.C3284g.mo19115a():void");
    }

    /* renamed from: a */
    public void mo19117a(AdSlot adSlot, C3431n nVar) {
        mo19116a(adSlot);
        if (nVar != null) {
            try {
                this.f7792c.mo19139a(adSlot.getCodeId(), nVar.mo19584ar().toString());
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public AdSlot mo19121b(String str) {
        return this.f7792c.mo19144e(str);
    }

    /* renamed from: a */
    public void mo19116a(AdSlot adSlot) {
        this.f7792c.mo19138a(adSlot);
    }

    /* renamed from: b */
    public void mo19122b(AdSlot adSlot) {
        this.f7792c.mo19141b(adSlot);
    }

    /* renamed from: b */
    public AdSlot mo19120b() {
        return this.f7792c.mo19136a();
    }

    /* renamed from: a */
    public static C3284g m9671a(Context context) {
        if (f7790a == null) {
            synchronized (C3284g.class) {
                if (f7790a == null) {
                    f7790a = new C3284g(context);
                }
            }
        }
        return f7790a;
    }

    private C3284g(Context context) {
        this.f7791b = context == null ? C3513m.m10963a() : context.getApplicationContext();
        this.f7792c = new C3301j(this.f7791b, "sp_reward_video");
    }

    /* renamed from: a */
    public String mo19113a(C3431n nVar) {
        if (nVar == null || nVar.mo19517J() == null || TextUtils.isEmpty(nVar.mo19517J().mo15953i())) {
            return null;
        }
        return mo19114a(nVar.mo19517J().mo15953i(), nVar.mo19517J().mo15957l(), nVar.mo19560aD());
    }

    /* renamed from: a */
    public String mo19114a(String str, String str2, int i) {
        File a;
        if (!TextUtils.isEmpty(str) && (a = m9672a(str2, i)) != null && a.exists() && a.isFile() && a.length() > 0) {
            return a.getAbsolutePath();
        }
        return null;
    }

    /* renamed from: c */
    public C3431n mo19123c(String str) {
        C3431n a;
        long b = this.f7792c.mo19140b(str);
        boolean c = this.f7792c.mo19142c(str);
        if (!(System.currentTimeMillis() - b < 10500000) || c) {
            return null;
        }
        try {
            String a2 = this.f7792c.mo19137a(str);
            if (TextUtils.isEmpty(a2) || (a = C3356b.m9935a(new JSONObject(a2))) == null) {
                return null;
            }
            if (C3434p.m10497i(a)) {
                return a;
            }
            C2400b J = a.mo19517J();
            if (J == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 23 || !TextUtils.isEmpty(mo19114a(J.mo15953i(), J.mo15957l(), a.mo19560aD()))) {
                return a;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9674a(boolean z, C3431n nVar, long j, String str) {
        long j2;
        Long remove = this.f7793d.remove(nVar);
        if (remove == null) {
            j2 = 0;
        } else {
            j2 = SystemClock.elapsedRealtime() - remove.longValue();
        }
        C3090e.m8896a(this.f7791b, nVar, "rewarded_video", z ? "load_video_success" : "load_video_error", C3898x.m12758a(z, nVar, j2, j, (z || str == null) ? null : str));
    }

    /* renamed from: a */
    public void mo19118a(final C3431n nVar, final C3288a<Object> aVar) {
        this.f7793d.put(nVar, Long.valueOf(SystemClock.elapsedRealtime()));
        if (nVar == null || nVar.mo19517J() == null || TextUtils.isEmpty(nVar.mo19517J().mo15953i())) {
            if (aVar != null) {
                aVar.mo19126a(false, null);
            }
            m9674a(false, nVar, -1, (String) null);
            return;
        }
        String i = nVar.mo19517J().mo15953i();
        File a = m9672a(nVar.mo19517J().mo15957l(), nVar.mo19560aD());
        C2844a d = C3792d.m12395a().mo20615b().mo17685d();
        d.mo17711a(i);
        d.mo17706a(a.getParent(), a.getName());
        d.mo17705a((C2842a) new C2842a() {
            /* renamed from: a */
            public void mo17693a(C2848c cVar, C2843b bVar) {
                if (!bVar.mo17701f() || bVar.mo17700e() == null || !bVar.mo17700e().exists()) {
                    C3288a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo19126a(false, null);
                    }
                    C2905l.m8114c("RewardVideoCache", "onFailure: RewardVideo preload fail ");
                    C3284g.this.m9674a(false, nVar, (long) bVar.mo17695a(), bVar.mo17697b());
                    return;
                }
                C3288a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.mo19126a(true, null);
                }
                C2905l.m8114c("RewardVideoCache", "onFailure: RewardVideo preload success ");
                C3284g.this.m9674a(true, nVar, (long) bVar.mo17695a(), bVar.mo17697b());
            }

            /* renamed from: a */
            public void mo17694a(C2848c cVar, IOException iOException) {
                C3288a aVar = aVar;
                if (aVar != null) {
                    aVar.mo19126a(false, null);
                }
                C2905l.m8114c("RewardVideoCache", "onFailure: RewardVideo preload fail ");
                C3284g.this.m9674a(false, nVar, -2, iOException.getMessage());
            }
        });
    }

    /* renamed from: a */
    private File m9672a(String str, int i) {
        return new File(CacheDirFactory.getICacheDir(i).mo15665b(), str);
    }
}
