package com.bytedance.sdk.openadsdk.component;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import com.bykv.p054vk.openvk.component.video.api.C2397b;
import com.bykv.p054vk.openvk.component.video.api.p071c.C2400b;
import com.bykv.p054vk.openvk.component.video.api.p071c.C2401c;
import com.bykv.p054vk.openvk.component.video.api.p073e.C2410a;
import com.bytedance.sdk.component.p108d.C2828j;
import com.bytedance.sdk.component.p108d.C2832n;
import com.bytedance.sdk.component.p108d.C2838t;
import com.bytedance.sdk.component.p123f.C2882e;
import com.bytedance.sdk.component.p123f.C2885g;
import com.bytedance.sdk.component.utils.C2888a;
import com.bytedance.sdk.component.utils.C2893e;
import com.bytedance.sdk.component.utils.C2894f;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.utils.C2909o;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.component.p136c.C3205a;
import com.bytedance.sdk.openadsdk.component.p137d.C3207a;
import com.bytedance.sdk.openadsdk.component.p139f.C3214a;
import com.bytedance.sdk.openadsdk.core.C3356b;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.C3516n;
import com.bytedance.sdk.openadsdk.core.p149e.C3402a;
import com.bytedance.sdk.openadsdk.core.p149e.C3403b;
import com.bytedance.sdk.openadsdk.core.p149e.C3417k;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.p149e.C3433o;
import com.bytedance.sdk.openadsdk.core.p149e.C3436r;
import com.bytedance.sdk.openadsdk.core.video.p163d.C3624a;
import com.bytedance.sdk.openadsdk.multipro.C3948b;
import com.bytedance.sdk.openadsdk.multipro.p184d.C3961a;
import com.bytedance.sdk.openadsdk.p127a.C2953b;
import com.bytedance.sdk.openadsdk.p128b.C3060a;
import com.bytedance.sdk.openadsdk.p165d.C3707a;
import com.bytedance.sdk.openadsdk.p174i.C3783a;
import com.bytedance.sdk.openadsdk.p174i.p175a.C3788b;
import com.bytedance.sdk.openadsdk.p178l.C3877h;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.component.a */
/* compiled from: TTAppOpenAdCacheManager */
public class C3178a {

    /* renamed from: a */
    private static volatile C3178a f7464a;

    /* renamed from: b */
    private final C2953b f7465b;

    /* renamed from: c */
    private final C3516n<C3060a> f7466c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Context f7467d;

    /* renamed from: com.bytedance.sdk.openadsdk.component.a$b */
    /* compiled from: TTAppOpenAdCacheManager */
    public interface C3187b {
        /* renamed from: a */
        void mo18846a();

        /* renamed from: a */
        void mo18847a(C3788b bVar);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.component.a$c */
    /* compiled from: TTAppOpenAdCacheManager */
    interface C3188c {
        /* renamed from: a */
        void mo18844a();

        /* renamed from: a */
        void mo18845a(int i, String str);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.component.a$d */
    /* compiled from: TTAppOpenAdCacheManager */
    public interface C3189d {
        /* renamed from: a */
        void mo18313a();

        /* renamed from: a */
        void mo18314a(Bitmap bitmap);
    }

    private C3178a(Context context) {
        if (context != null) {
            this.f7467d = context.getApplicationContext();
        } else {
            this.f7467d = C3513m.m10963a();
        }
        this.f7465b = new C2953b(10, 8, true);
        this.f7466c = C3513m.m10971f();
    }

    /* renamed from: a */
    public static C3178a m9178a(Context context) {
        if (f7464a == null) {
            synchronized (C3178a.class) {
                if (f7464a == null) {
                    f7464a = new C3178a(context);
                }
            }
        }
        return f7464a;
    }

    /* renamed from: a */
    public void mo18830a(final AdSlot adSlot) {
        long currentTimeMillis = System.currentTimeMillis();
        final C3436r rVar = new C3436r();
        rVar.mo19695a(currentTimeMillis);
        C3433o oVar = new C3433o();
        oVar.f8446g = currentTimeMillis;
        oVar.f8448i = rVar;
        oVar.f8443d = 2;
        this.f7466c.mo19983a(adSlot, oVar, 3, new C3516n.C3517a() {
            /* renamed from: a */
            public void mo18456a(int i, String str) {
                C2905l.m8111b("TTAppOpenAdCacheManager", "cache Load App OpenAd From Network fail");
            }

            /* renamed from: a */
            public void mo18457a(C3402a aVar, C3403b bVar) {
                C2905l.m8111b("TTAppOpenAdCacheManager", "cache Load App Open Ad From Network success");
                if (aVar == null || aVar.mo19386b() == null || aVar.mo19386b().size() == 0) {
                    C2905l.m8111b("TTAppOpenAdCacheManager", "material is null");
                    bVar.mo19391a(-3);
                    C3403b.m10134a(bVar);
                    return;
                }
                C3431n nVar = aVar.mo19386b().get(0);
                if (C3431n.m10311c(nVar)) {
                    C3178a.this.m9181a(nVar, adSlot, rVar);
                } else {
                    C3178a.this.m9183a(nVar, rVar);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9181a(final C3431n nVar, AdSlot adSlot, final C3436r rVar) {
        final int f = C3898x.m12794f(nVar);
        mo18832a(nVar, adSlot, rVar, (C3188c) new C3188c() {
            /* renamed from: a */
            public void mo18845a(int i, String str) {
            }

            /* renamed from: a */
            public void mo18844a() {
                C3207a aVar = new C3207a(f, nVar);
                C3178a.this.mo18831a(aVar);
                C3205a.m9277a(aVar.mo18863b(), 1, rVar);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9183a(final C3431n nVar, final C3436r rVar) {
        final int f = C3898x.m12794f(nVar);
        mo18833a(nVar, rVar, (C3187b) new C3187b() {
            /* renamed from: a */
            public void mo18846a() {
            }

            /* renamed from: a */
            public void mo18847a(C3788b bVar) {
                C3207a aVar = new C3207a(f, nVar);
                C3178a.this.mo18831a(aVar);
                C3205a.m9277a(aVar.mo18863b(), 1, rVar);
            }
        });
    }

    /* renamed from: a */
    public void mo18832a(C3431n nVar, AdSlot adSlot, C3436r rVar, C3188c cVar) {
        C3431n nVar2 = nVar;
        C3436r rVar2 = rVar;
        long currentTimeMillis = System.currentTimeMillis();
        int f = C3898x.m12794f(nVar);
        C2400b J = nVar.mo19517J();
        String i = J.mo15953i();
        String l = J.mo15957l();
        if (TextUtils.isEmpty(l)) {
            l = C2893e.m8077a(i);
        }
        final File a = C3214a.m9309a(l, f);
        if (a.exists()) {
            C2905l.m8111b("TTAppOpenAdCacheManager", "The video cache exists locally, use the cache directly");
            C3214a.m9313a(a);
            mo18829a(f);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (rVar2 != null) {
                rVar2.mo19700c(currentTimeMillis2);
                rVar2.mo19694a(1);
            }
            cVar.mo18844a();
            m9182a(nVar2, (C3189d) null);
        } else if (!C3513m.m10973h().mo19870m(String.valueOf(f)) || C2909o.m8137d(C3513m.m10963a())) {
            C3188c cVar2 = cVar;
            C2401c a2 = C3431n.m10306a(a.getParent(), nVar2);
            a2.mo15970a("material_meta", nVar2);
            a2.mo15970a("ad_slot", adSlot);
            final int i2 = f;
            C31824 r15 = r0;
            final long j = currentTimeMillis;
            C2401c cVar3 = a2;
            final C3431n nVar3 = nVar;
            final C3436r rVar3 = rVar;
            final C3188c cVar4 = cVar;
            C31824 r0 = new C2410a.C2411a() {
                /* renamed from: b */
                public void mo16069b(C2401c cVar, int i) {
                }

                /* renamed from: a */
                public void mo16067a(C2401c cVar, int i) {
                    C2905l.m8111b("TTAppOpenAdCacheManager", "Video file caching success");
                    C3178a.this.mo18834a(a);
                    C3178a.this.mo18829a(i2);
                    long currentTimeMillis = System.currentTimeMillis() - j;
                    C3205a.m9282b(nVar3, currentTimeMillis, true);
                    C3436r rVar = rVar3;
                    if (rVar != null) {
                        rVar.mo19700c(currentTimeMillis);
                        rVar3.mo19694a(2);
                    }
                    cVar4.mo18844a();
                    C3178a.m9182a(nVar3, (C3189d) null);
                }

                /* renamed from: a */
                public void mo16068a(C2401c cVar, int i, String str) {
                    C2905l.m8111b("TTAppOpenAdCacheManager", "Video file caching failed");
                    long currentTimeMillis = System.currentTimeMillis() - j;
                    C3205a.m9282b(nVar3, currentTimeMillis, false);
                    C3436r rVar = rVar3;
                    if (rVar != null) {
                        rVar.mo19700c(currentTimeMillis);
                    }
                    cVar4.mo18845a(i, str);
                    try {
                        if (a.exists() && a.isFile()) {
                            C2894f.m8086c(a);
                        }
                    } catch (Throwable unused) {
                    }
                }
            };
            C3624a.m11584a(cVar3, r15);
            if (Build.VERSION.SDK_INT < 23) {
                mo18834a(new File(C2397b.m5665a().getCacheDir(), "proxy_cache"));
                mo18829a(f);
                long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
                C3205a.m9282b(nVar2, currentTimeMillis3, true);
                C3436r rVar4 = rVar;
                if (rVar4 != null) {
                    rVar4.mo19700c(currentTimeMillis3);
                    rVar4.mo19694a(2);
                }
                cVar.mo18844a();
                m9182a(nVar2, (C3189d) null);
            }
        } else {
            cVar.mo18845a(100, "OnlyWifi");
        }
    }

    /* renamed from: a */
    public void mo18833a(C3431n nVar, C3436r rVar, C3187b bVar) {
        C3436r rVar2 = rVar;
        final long currentTimeMillis = System.currentTimeMillis();
        final int f = C3898x.m12794f(nVar);
        C3417k kVar = nVar.mo19523P().get(0);
        String g = kVar.mo19479g();
        String a = kVar.mo19468a();
        int b = kVar.mo19472b();
        int c = kVar.mo19475c();
        File b2 = C3214a.m9314b(TextUtils.isEmpty(g) ? C2893e.m8077a(a) : g, f);
        if (mo18835a(a, g)) {
            C2905l.m8111b("TTAppOpenAdCacheManager", "The image cache exists locally, directly use the cache");
            mo18838c(f);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (rVar2 != null) {
                rVar2.mo19700c(currentTimeMillis2);
                rVar2.mo19694a(1);
            }
            bVar.mo18847a((C3788b) null);
            return;
        }
        final C3187b bVar2 = bVar;
        C3783a aVar = new C3783a(a, kVar.mo19479g());
        final C3431n nVar2 = nVar;
        final C3436r rVar3 = rVar;
        C3877h.m12656a(aVar, b, c, new C3877h.C3879a() {
            /* renamed from: a */
            public void mo18311a(C3788b bVar) {
                if (bVar.mo20607c()) {
                    C2905l.m8111b("TTAppOpenAdCacheManager", "Image loaded successfully");
                    C3178a.this.mo18838c(f);
                    long currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
                    C3205a.m9280a(nVar2, currentTimeMillis, true);
                    C3436r rVar = rVar3;
                    if (rVar != null) {
                        rVar.mo19700c(currentTimeMillis);
                        rVar3.mo19694a(2);
                    }
                    bVar2.mo18847a(bVar);
                    return;
                }
                C3205a.m9280a(nVar2, System.currentTimeMillis() - currentTimeMillis, false);
                bVar2.mo18846a();
            }

            /* renamed from: a */
            public void mo18310a() {
                C2905l.m8111b("TTAppOpenAdCacheManager", "Image loading failed");
                C3205a.m9280a(nVar2, System.currentTimeMillis() - currentTimeMillis, false);
                bVar2.mo18846a();
            }

            /* renamed from: b */
            public void mo18312b() {
                C2905l.m8111b("TTAppOpenAdCacheManager", "Image caching success");
            }
        }, b2.getParent());
    }

    /* renamed from: a */
    public static void m9182a(C3431n nVar, final C3189d dVar) {
        C3707a.m12123a(nVar.mo19517J().mo15951h()).mo17638a(C2838t.BITMAP).mo17633a((C2832n) new C2832n<Bitmap>() {
            /* renamed from: a */
            public void mo17179a(C2828j<Bitmap> jVar) {
                if (jVar == null || jVar.mo17647b() == null) {
                    C3189d dVar = dVar;
                    if (dVar != null) {
                        dVar.mo18313a();
                        return;
                    }
                    return;
                }
                C3189d dVar2 = dVar;
                if (dVar2 != null) {
                    dVar2.mo18314a(jVar.mo17647b());
                }
            }

            /* renamed from: a */
            public void mo17178a(int i, String str, Throwable th) {
                C3189d dVar = dVar;
                if (dVar != null) {
                    dVar.mo18313a();
                }
            }
        });
    }

    /* renamed from: a */
    public void mo18829a(int i) {
        if (C3948b.m12959c()) {
            C3961a.m13025a("tt_openad", "video_has_cached" + i, (Boolean) true);
            return;
        }
        SharedPreferences.Editor edit = this.f7467d.getSharedPreferences("tt_openad", 0).edit();
        edit.putBoolean("video_has_cached" + i, true).apply();
    }

    /* renamed from: b */
    public boolean mo18836b(int i) {
        if (C3948b.m12959c()) {
            return C3961a.m13032a("tt_openad", "video_has_cached" + i, false);
        }
        SharedPreferences sharedPreferences = this.f7467d.getSharedPreferences("tt_openad", 0);
        return sharedPreferences.getBoolean("video_has_cached" + i, false);
    }

    /* renamed from: c */
    public void mo18838c(int i) {
        if (C3948b.m12959c()) {
            C3961a.m13025a("tt_openad", "image_has_cached" + i, (Boolean) true);
            return;
        }
        SharedPreferences.Editor edit = this.f7467d.getSharedPreferences("tt_openad", 0).edit();
        edit.putBoolean("image_has_cached" + i, true).apply();
    }

    /* renamed from: d */
    public boolean mo18839d(int i) {
        if (C3948b.m12959c()) {
            return C3961a.m13032a("tt_openad", "image_has_cached" + i, false);
        }
        SharedPreferences sharedPreferences = this.f7467d.getSharedPreferences("tt_openad", 0);
        return sharedPreferences.getBoolean("image_has_cached" + i, false);
    }

    /* renamed from: a */
    public void mo18831a(C3207a aVar) {
        if (aVar.mo18863b() != null && aVar.mo18862a() != 0) {
            long ag = aVar.mo18863b().mo19573ag();
            if (C3948b.m12959c()) {
                C3961a.m13028a("tt_openad", "material_expiration_time" + aVar.mo18862a(), Long.valueOf(ag));
            } else {
                SharedPreferences.Editor edit = this.f7467d.getSharedPreferences("tt_openad", 0).edit();
                edit.putLong("material_expiration_time" + aVar.mo18862a(), ag).apply();
            }
            m9184b(aVar);
        }
    }

    /* renamed from: e */
    public boolean mo18840e(int i) {
        long j;
        if (C3948b.m12959c()) {
            j = C3961a.m13021a("tt_openad", "material_expiration_time" + i, -1);
        } else {
            SharedPreferences sharedPreferences = this.f7467d.getSharedPreferences("tt_openad", 0);
            j = sharedPreferences.getLong("material_expiration_time" + i, -1);
        }
        if (System.currentTimeMillis() / 1000 < j) {
            return true;
        }
        if (j != -1) {
            C3431n f = mo18841f(i);
            if (f != null) {
                C3205a.m9275a(f);
            }
            mo18842g(i);
        }
        return false;
    }

    /* renamed from: f */
    public C3431n mo18841f(int i) {
        String str;
        String str2;
        if (C3948b.m12959c()) {
            str = C3961a.m13035b("tt_openad_materialMeta", "material" + i, (String) null);
        } else {
            str = this.f7467d.getSharedPreferences("tt_openad_materialMeta", 0).getString("material" + i, (String) null);
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.optInt("cypher", -1);
                str2 = C2888a.m8064b(jSONObject.optString("message"));
            } catch (JSONException e) {
                e.printStackTrace();
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                try {
                    C3431n a = C3356b.m9935a(new JSONObject(str2));
                    if (a != null) {
                        return a;
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    private void m9184b(C3207a aVar) {
        C2882e.m8037a(new C3186a(aVar), 10, 5);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.component.a$a */
    /* compiled from: TTAppOpenAdCacheManager */
    private class C3186a extends C2885g {

        /* renamed from: b */
        private final C3207a f7495b;

        public C3186a(C3207a aVar) {
            super("App Open Ad Write Cache");
            this.f7495b = aVar;
        }

        public void run() {
            try {
                String jSONObject = C2888a.m8062a(this.f7495b.mo18863b().mo19584ar()).toString();
                if (C3948b.m12959c()) {
                    C3961a.m13029a("tt_openad_materialMeta", "material" + this.f7495b.mo18862a(), jSONObject);
                    return;
                }
                SharedPreferences.Editor edit = C3178a.this.f7467d.getSharedPreferences("tt_openad_materialMeta", 0).edit();
                edit.putString("material" + this.f7495b.mo18862a(), jSONObject).apply();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public String mo18826a(C3431n nVar) {
        if (!(nVar == null || nVar.mo19517J() == null || TextUtils.isEmpty(nVar.mo19517J().mo15953i()))) {
            String i = nVar.mo19517J().mo15953i();
            String l = nVar.mo19517J().mo15957l();
            String valueOf = String.valueOf(C3898x.m12794f(nVar));
            if (TextUtils.isEmpty(l)) {
                l = C2893e.m8077a(i);
            }
            File a = C3214a.m9308a(this.f7467d, mo18827a(valueOf), l);
            if (a.exists() && a.isFile()) {
                return a.getAbsolutePath();
            }
        }
        return null;
    }

    /* renamed from: b */
    public boolean mo18837b(C3431n nVar) {
        if (nVar == null || nVar.mo19523P() == null || nVar.mo19523P().size() == 0 || TextUtils.isEmpty(nVar.mo19523P().get(0).mo19468a())) {
            return false;
        }
        C3417k kVar = nVar.mo19523P().get(0);
        return mo18835a(kVar.mo19468a(), kVar.mo19479g());
    }

    /* renamed from: a */
    public boolean mo18835a(String str, String str2) {
        boolean z;
        try {
            if (TextUtils.isEmpty(str2)) {
                str2 = C2893e.m8077a(str);
            }
            File b = C3214a.m9314b(str2, 0);
            InputStream a = C3707a.m12125a(str, str2);
            if (a != null) {
                try {
                    a.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (C3707a.m12126a(str, str2, b.getParent())) {
                    return true;
                }
                if (new File(b.getPath() + ".0").exists()) {
                    return true;
                }
            }
            return z;
        } catch (Exception e2) {
            C2905l.m8118e("TTAppOpenAdCacheManager", e2.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    public void mo18834a(File file) {
        try {
            this.f7465b.mo18276a(file);
        } catch (IOException e) {
            C2905l.m8118e("TTAppOpenAdCacheManager", "trimFileCache IOException:" + e.toString());
        }
    }

    /* renamed from: g */
    public void mo18842g(int i) {
        if (C3948b.m12959c()) {
            C3961a.m13037b("tt_openad_materialMeta", "material" + i);
            C3961a.m13037b("tt_openad", "material_expiration_time" + i);
            C3961a.m13037b("tt_openad", "video_has_cached" + i);
            C3961a.m13037b("tt_openad", "image_has_cached" + i);
            return;
        }
        SharedPreferences.Editor edit = this.f7467d.getSharedPreferences("tt_openad_materialMeta", 0).edit();
        edit.remove("material" + i).apply();
        SharedPreferences.Editor edit2 = this.f7467d.getSharedPreferences("tt_openad", 0).edit();
        SharedPreferences.Editor remove = edit2.remove("material_expiration_time" + i);
        SharedPreferences.Editor remove2 = remove.remove("video_has_cached" + i);
        remove2.remove("image_has_cached" + i).apply();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|(2:5|6)(1:7)|8|9|(1:34)(4:19|(5:21|22|23|28|24)|27|35)) */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0034 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056 A[Catch:{ all -> 0x0061 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18828a() {
        /*
            r4 = this;
            r0 = 0
            boolean r1 = com.bytedance.sdk.openadsdk.multipro.C3948b.m12959c()     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = "tt_openad"
            java.lang.String r3 = "tt_openad_materialMeta"
            if (r1 == 0) goto L_0x0012
            com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13023a((java.lang.String) r3)     // Catch:{ all -> 0x0034 }
            com.bytedance.sdk.openadsdk.multipro.p184d.C3961a.m13023a((java.lang.String) r2)     // Catch:{ all -> 0x0034 }
            goto L_0x0034
        L_0x0012:
            android.content.Context r1 = r4.f7467d     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r3, r0)     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences$Editor r1 = r1.clear()     // Catch:{ all -> 0x0034 }
            r1.apply()     // Catch:{ all -> 0x0034 }
            android.content.Context r1 = r4.f7467d     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences$Editor r1 = r1.clear()     // Catch:{ all -> 0x0034 }
            r1.apply()     // Catch:{ all -> 0x0034 }
        L_0x0034:
            android.content.Context r1 = r4.f7467d     // Catch:{ all -> 0x0061 }
            java.io.File r1 = r1.getCacheDir()     // Catch:{ all -> 0x0061 }
            if (r1 == 0) goto L_0x0061
            boolean r2 = r1.exists()     // Catch:{ all -> 0x0061 }
            if (r2 == 0) goto L_0x0061
            boolean r2 = r1.isDirectory()     // Catch:{ all -> 0x0061 }
            if (r2 == 0) goto L_0x0061
            com.bytedance.sdk.openadsdk.component.a$7 r2 = new com.bytedance.sdk.openadsdk.component.a$7     // Catch:{ all -> 0x0061 }
            r2.<init>()     // Catch:{ all -> 0x0061 }
            java.io.File[] r1 = r1.listFiles(r2)     // Catch:{ all -> 0x0061 }
            if (r1 == 0) goto L_0x0061
            int r2 = r1.length     // Catch:{ all -> 0x0061 }
            if (r2 <= 0) goto L_0x0061
            int r2 = r1.length     // Catch:{ all -> 0x0061 }
        L_0x0057:
            if (r0 >= r2) goto L_0x0061
            r3 = r1[r0]     // Catch:{ all -> 0x0061 }
            com.bytedance.sdk.component.utils.C2894f.m8086c(r3)     // Catch:{ all -> 0x005e }
        L_0x005e:
            int r0 = r0 + 1
            goto L_0x0057
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.C3178a.mo18828a():void");
    }

    /* renamed from: a */
    public String mo18827a(String str) {
        return C3948b.m12959c() ? "openad_video_cache/" : "/openad_video_cache/";
    }

    /* renamed from: h */
    public String mo18843h(int i) {
        return C3948b.m12959c() ? "openad_image_cache/" : "/openad_image_cache/";
    }
}
