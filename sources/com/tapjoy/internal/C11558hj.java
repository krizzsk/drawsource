package com.tapjoy.internal;

import android.app.Activity;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.hj */
public final class C11558hj {

    /* renamed from: p */
    private static final C11558hj f27736p;

    /* renamed from: q */
    private static C11558hj f27737q;

    /* renamed from: w */
    private static Handler f27738w;

    /* renamed from: x */
    private static File f27739x;

    /* renamed from: a */
    public final C11579hr f27740a = new C11579hr(this);

    /* renamed from: b */
    public C11580hs f27741b;

    /* renamed from: c */
    public boolean f27742c = false;

    /* renamed from: d */
    public String f27743d = null;

    /* renamed from: e */
    public Context f27744e;

    /* renamed from: f */
    public C11570hm f27745f;

    /* renamed from: g */
    public C11557hi f27746g;

    /* renamed from: h */
    public C11555hh f27747h;

    /* renamed from: i */
    public String f27748i;

    /* renamed from: j */
    public boolean f27749j;

    /* renamed from: k */
    public String f27750k;

    /* renamed from: l */
    public String f27751l;

    /* renamed from: m */
    public boolean f27752m = false;

    /* renamed from: n */
    public String f27753n;

    /* renamed from: o */
    public C11560hk f27754o = C11560hk.m31676a((C11540gy) null);

    /* renamed from: r */
    private boolean f27755r = false;

    /* renamed from: s */
    private boolean f27756s = false;

    /* renamed from: t */
    private C11586hw f27757t;

    /* renamed from: u */
    private String f27758u;

    /* renamed from: v */
    private String f27759v;

    static {
        C11558hj hjVar = new C11558hj();
        f27736p = hjVar;
        f27737q = hjVar;
    }

    /* renamed from: a */
    public static C11558hj m31644a() {
        return f27737q;
    }

    private C11558hj() {
    }

    /* renamed from: b */
    public final synchronized void mo70123b(Context context) {
        if (this.f27744e == null) {
            Context applicationContext = context.getApplicationContext();
            this.f27744e = applicationContext;
            C11506gd.m31492a().mo70038a(applicationContext);
            this.f27745f = C11570hm.m31698a(applicationContext);
            File file = new File(m31649c(applicationContext), "events2");
            if (this.f27747h == null) {
                this.f27747h = new C11555hh(file);
            }
            this.f27746g = new C11557hi(this.f27745f, this.f27747h);
            this.f27757t = new C11586hw(this.f27746g);
            this.f27741b = new C11580hs(applicationContext);
            C11520gi.m31524a(new C11524gk(new File(m31649c(applicationContext), "usages"), this.f27746g));
            C11600id idVar = C11600id.f27889a;
            idVar.f27890b = applicationContext.getApplicationContext();
            idVar.f27891c = applicationContext.getSharedPreferences("tapjoyCacheDataMMF2E", 0);
            idVar.f27892d = applicationContext.getSharedPreferences("tapjoyCacheDataMMF2U", 0);
            idVar.mo70185a();
        }
    }

    /* renamed from: a */
    public final void mo70117a(String str, boolean z) {
        this.f27745f.mo70143a(str, z);
    }

    /* renamed from: a */
    public final C11453fd mo70110a(boolean z) {
        if (z) {
            this.f27745f.mo70140a();
        }
        return this.f27745f.mo70150b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo70113a(@javax.annotation.Nullable final java.lang.String r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f27749j     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x003b
            if (r6 != 0) goto L_0x000d
            java.lang.String r0 = r5.f27753n     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x000d
            java.lang.String r6 = r5.f27753n     // Catch:{ all -> 0x0041 }
        L_0x000d:
            r0 = 0
            r5.f27753n = r0     // Catch:{ all -> 0x0041 }
            if (r6 == 0) goto L_0x003f
            com.tapjoy.internal.hm r0 = r5.f27745f     // Catch:{ all -> 0x0041 }
            com.tapjoy.internal.fd r0 = r0.mo70150b()     // Catch:{ all -> 0x0041 }
            java.lang.String r1 = "GCM registration id of device {} updated: {}"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0041 }
            r3 = 0
            com.tapjoy.internal.fc r4 = r0.f27417d     // Catch:{ all -> 0x0041 }
            java.lang.String r4 = r4.f27381h     // Catch:{ all -> 0x0041 }
            r2[r3] = r4     // Catch:{ all -> 0x0041 }
            r3 = 1
            r2[r3] = r6     // Catch:{ all -> 0x0041 }
            com.tapjoy.internal.C11554hg.m31622a((java.lang.String) r1, (java.lang.Object[]) r2)     // Catch:{ all -> 0x0041 }
            com.tapjoy.internal.iv r1 = new com.tapjoy.internal.iv     // Catch:{ all -> 0x0041 }
            r1.<init>(r0, r6)     // Catch:{ all -> 0x0041 }
            com.tapjoy.internal.hj$1 r0 = new com.tapjoy.internal.hj$1     // Catch:{ all -> 0x0041 }
            r0.<init>(r6)     // Catch:{ all -> 0x0041 }
            java.util.concurrent.ExecutorService r6 = com.tapjoy.internal.C11314bu.f27003a     // Catch:{ all -> 0x0041 }
            r1.mo69755a(r0, (java.util.concurrent.ExecutorService) r6)     // Catch:{ all -> 0x0041 }
            monitor-exit(r5)
            return
        L_0x003b:
            if (r6 == 0) goto L_0x003f
            r5.f27753n = r6     // Catch:{ all -> 0x0041 }
        L_0x003f:
            monitor-exit(r5)
            return
        L_0x0041:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11558hj.mo70113a(java.lang.String):void");
    }

    /* renamed from: b */
    public final boolean mo70124b() {
        try {
            this.f27744e.getClassLoader().loadClass("com.android.installreferrer.api.InstallReferrerStateListener");
            return true;
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static void m31647a(GLSurfaceView gLSurfaceView) {
        if (C11554hg.m31623a((Object) gLSurfaceView, "setGLSurfaceView: The given GLSurfaceView was null")) {
            C11544hb.m31600a(gLSurfaceView);
        }
    }

    /* renamed from: c */
    public final Set<String> mo70126c() {
        if (!mo70127c("getUserTags")) {
            return new HashSet();
        }
        return this.f27745f.mo70155e();
    }

    /* renamed from: a */
    public final void mo70121a(Set<String> set) {
        if (mo70127c("setUserTags")) {
            if (set != null && !set.isEmpty()) {
                HashSet hashSet = new HashSet();
                for (String next : set) {
                    if (next != null) {
                        String trim = next.trim();
                        if (!trim.isEmpty() && trim.length() <= 200) {
                            hashSet.add(trim);
                            if (hashSet.size() >= 200) {
                                break;
                            }
                        }
                    }
                }
                set = hashSet;
            }
            this.f27745f.mo70144a(set);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x010c, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x003d A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x005f A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0061 A[SYNTHETIC, Splitter:B:39:0x0061] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo70112a(android.content.Context r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f27749j     // Catch:{ all -> 0x0114 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)
            return
        L_0x0007:
            r3.mo70123b((android.content.Context) r4)     // Catch:{ all -> 0x0114 }
            android.content.Context r4 = r3.f27744e     // Catch:{ all -> 0x0114 }
            r0 = 0
            r1 = 1
            if (r4 == 0) goto L_0x0012
            r4 = r1
            goto L_0x0013
        L_0x0012:
            r4 = r0
        L_0x0013:
            java.lang.String r2 = "The given context was null"
            boolean r4 = com.tapjoy.internal.C11554hg.m31624a((boolean) r4, (java.lang.String) r2)     // Catch:{ all -> 0x0114 }
            if (r4 != 0) goto L_0x001d
            monitor-exit(r3)
            return
        L_0x001d:
            if (r8 == 0) goto L_0x0031
            int r4 = r8.length()     // Catch:{ all -> 0x0114 }
            r2 = 24
            if (r4 != r2) goto L_0x0031
            java.lang.String r4 = "[0-9a-f]{24}"
            boolean r4 = r8.matches(r4)     // Catch:{ all -> 0x0114 }
            if (r4 == 0) goto L_0x0031
            r4 = r1
            goto L_0x003b
        L_0x0031:
            java.lang.String r4 = "Invalid App ID: {}"
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x0114 }
            r2[r0] = r8     // Catch:{ all -> 0x0114 }
            com.tapjoy.internal.C11554hg.m31626b(r4, r2)     // Catch:{ all -> 0x0114 }
            r4 = r0
        L_0x003b:
            if (r4 != 0) goto L_0x003f
            monitor-exit(r3)
            return
        L_0x003f:
            if (r9 == 0) goto L_0x0053
            int r4 = r9.length()     // Catch:{ all -> 0x0114 }
            r2 = 20
            if (r4 != r2) goto L_0x0053
            java.lang.String r4 = "[0-9A-Za-z\\-_]{20}"
            boolean r4 = r9.matches(r4)     // Catch:{ all -> 0x0114 }
            if (r4 == 0) goto L_0x0053
            r4 = r1
            goto L_0x005d
        L_0x0053:
            java.lang.String r4 = "Invalid App Key: {}"
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x0114 }
            r2[r0] = r9     // Catch:{ all -> 0x0114 }
            com.tapjoy.internal.C11554hg.m31626b(r4, r2)     // Catch:{ all -> 0x0114 }
            r4 = r0
        L_0x005d:
            if (r4 != 0) goto L_0x0061
            monitor-exit(r3)
            return
        L_0x0061:
            r3.f27750k = r5     // Catch:{ all -> 0x0114 }
            r3.f27751l = r6     // Catch:{ all -> 0x0114 }
            r3.f27758u = r8     // Catch:{ all -> 0x0114 }
            r3.f27759v = r9     // Catch:{ all -> 0x0114 }
            java.net.URL r4 = new java.net.URL     // Catch:{ MalformedURLException -> 0x010d }
            r4.<init>(r7)     // Catch:{ MalformedURLException -> 0x010d }
            java.lang.String r5 = "TapjoySDK"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0114 }
            r7.<init>()     // Catch:{ all -> 0x0114 }
            r7.append(r5)     // Catch:{ all -> 0x0114 }
            java.lang.String r5 = " "
            r7.append(r5)     // Catch:{ all -> 0x0114 }
            r7.append(r6)     // Catch:{ all -> 0x0114 }
            java.lang.String r5 = " ("
            r7.append(r5)     // Catch:{ all -> 0x0114 }
            java.lang.String r5 = android.os.Build.MODEL     // Catch:{ all -> 0x0114 }
            r7.append(r5)     // Catch:{ all -> 0x0114 }
            java.lang.String r5 = "; Android "
            r7.append(r5)     // Catch:{ all -> 0x0114 }
            java.lang.String r5 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0114 }
            r7.append(r5)     // Catch:{ all -> 0x0114 }
            java.lang.String r5 = "; "
            r7.append(r5)     // Catch:{ all -> 0x0114 }
            java.util.Locale r5 = java.util.Locale.getDefault()     // Catch:{ all -> 0x0114 }
            r7.append(r5)     // Catch:{ all -> 0x0114 }
            java.lang.String r5 = ")"
            r7.append(r5)     // Catch:{ all -> 0x0114 }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x0114 }
            com.tapjoy.internal.by r6 = new com.tapjoy.internal.by     // Catch:{ all -> 0x0114 }
            r6.<init>(r5, r4)     // Catch:{ all -> 0x0114 }
            com.tapjoy.internal.C11314bu.f27004b = r6     // Catch:{ all -> 0x0114 }
            java.util.concurrent.ExecutorService r4 = java.util.concurrent.Executors.newCachedThreadPool()     // Catch:{ all -> 0x0114 }
            com.tapjoy.internal.C11314bu.f27003a = r4     // Catch:{ all -> 0x0114 }
            com.tapjoy.internal.hh r4 = r3.f27747h     // Catch:{ all -> 0x0114 }
            r4.f27726b = r6     // Catch:{ all -> 0x0114 }
            r4.mo70097a()     // Catch:{ all -> 0x0114 }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ all -> 0x0114 }
            r3.f27749j = r1     // Catch:{ all -> 0x0114 }
            com.tapjoy.internal.hn r4 = new com.tapjoy.internal.hn     // Catch:{ all -> 0x0114 }
            android.content.Context r5 = r3.f27744e     // Catch:{ all -> 0x0114 }
            java.io.File r5 = m31650d(r5)     // Catch:{ all -> 0x0114 }
            r4.<init>(r5)     // Catch:{ all -> 0x0114 }
            java.lang.String r5 = r4.mo70158b()     // Catch:{ all -> 0x0114 }
            if (r5 == 0) goto L_0x00d3
            goto L_0x00d4
        L_0x00d3:
            r1 = r0
        L_0x00d4:
            if (r1 != 0) goto L_0x00e9
            boolean r4 = r4.mo70157a()     // Catch:{ all -> 0x0114 }
            if (r4 == 0) goto L_0x00e9
            com.tapjoy.internal.hi r4 = r3.f27746g     // Catch:{ all -> 0x0114 }
            com.tapjoy.internal.fa r5 = com.tapjoy.internal.C11445fa.APP     // Catch:{ all -> 0x0114 }
            java.lang.String r6 = "install"
            com.tapjoy.internal.ex$a r5 = r4.mo70101a((com.tapjoy.internal.C11445fa) r5, (java.lang.String) r6)     // Catch:{ all -> 0x0114 }
            r4.mo70103a((com.tapjoy.internal.C11435ex.C11436a) r5)     // Catch:{ all -> 0x0114 }
        L_0x00e9:
            com.tapjoy.internal.hm r4 = r3.f27745f     // Catch:{ all -> 0x0114 }
            boolean r5 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0114 }
            if (r5 != 0) goto L_0x010b
            com.tapjoy.internal.ht r5 = r4.f27784c     // Catch:{ all -> 0x0114 }
            com.tapjoy.internal.n r5 = r5.f27825D     // Catch:{ all -> 0x0114 }
            java.lang.String r5 = r5.mo70312a()     // Catch:{ all -> 0x0114 }
            boolean r5 = r8.equals(r5)     // Catch:{ all -> 0x0114 }
            if (r5 != 0) goto L_0x010b
            com.tapjoy.internal.ht r5 = r4.f27784c     // Catch:{ all -> 0x0114 }
            com.tapjoy.internal.n r5 = r5.f27825D     // Catch:{ all -> 0x0114 }
            r5.mo70313a(r8)     // Catch:{ all -> 0x0114 }
            com.tapjoy.internal.ht r4 = r4.f27784c     // Catch:{ all -> 0x0114 }
            r4.mo70167a((boolean) r0)     // Catch:{ all -> 0x0114 }
        L_0x010b:
            monitor-exit(r3)
            return
        L_0x010d:
            r4 = move-exception
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0114 }
            r5.<init>(r4)     // Catch:{ all -> 0x0114 }
            throw r5     // Catch:{ all -> 0x0114 }
        L_0x0114:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11558hj.mo70112a(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: b */
    public final boolean mo70125b(String str) {
        if ((this.f27749j || this.f27748i != null) && this.f27744e != null) {
            return true;
        }
        C11554hg.m31629e(str);
        return false;
    }

    /* renamed from: c */
    public final boolean mo70127c(String str) {
        if (this.f27744e != null) {
            return true;
        }
        C11554hg.m31628d(str);
        return false;
    }

    /* renamed from: a */
    public final void mo70111a(Activity activity) {
        if (C11554hg.m31623a((Object) activity, "onActivityStart: The given activity was null")) {
            C11554hg.m31627c("onActivityStart");
            C11285b.m30881a(activity.getApplication());
            C11285b.m30882b(activity);
            if (mo70125b("onActivityStart") && m31651g()) {
                C11548hd.m31606b(activity);
            }
        }
    }

    /* renamed from: b */
    public final void mo70122b(Activity activity) {
        if (C11554hg.m31623a((Object) activity, "onActivityStop: The given activity was null")) {
            C11554hg.m31627c("onActivityStop");
            C11285b.m30885c(activity);
            if (mo70125b("onActivityStop") && !C11285b.m30883b()) {
                this.f27757t.mo70176b();
            }
        }
    }

    /* renamed from: d */
    public final boolean mo70128d() {
        C11586hw hwVar = this.f27757t;
        return hwVar != null && hwVar.f27862b.get();
    }

    /* renamed from: e */
    public final void mo70129e() {
        if (mo70125b("startSession") && m31651g()) {
            C11548hd.m31606b((Activity) null);
        }
    }

    /* renamed from: g */
    private boolean m31651g() {
        if (!this.f27757t.mo70175a()) {
            return false;
        }
        this.f27740a.mo70164a();
        C11600id.f27889a.mo70185a();
        return true;
    }

    /* renamed from: f */
    public final void mo70130f() {
        if (mo70125b("endSession")) {
            this.f27757t.mo70176b();
        }
    }

    /* renamed from: a */
    public final void mo70114a(String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        if (mo70125b("trackPurchase")) {
            try {
                C11347d dVar = new C11347d(str);
                String b = C11549he.m31610b(dVar.f27092a);
                String b2 = C11549he.m31610b(dVar.f27097f);
                if (b == null || b2 == null) {
                    C11554hg.m31621a("trackPurchase", "skuDetails", "insufficient fields");
                } else if (b2.length() != 3) {
                    C11554hg.m31621a("trackPurchase", "skuDetails", "invalid currency code");
                } else {
                    String b3 = C11549he.m31610b(str2);
                    String b4 = C11549he.m31610b(str3);
                    if (b3 != null) {
                        if (b4 != null) {
                            try {
                                C11384e eVar = new C11384e(b3);
                                if (TextUtils.isEmpty(eVar.f27182a) || TextUtils.isEmpty(eVar.f27183b) || TextUtils.isEmpty(eVar.f27184c) || eVar.f27185d == 0) {
                                    C11554hg.m31621a("trackPurchase", "purchaseData", "insufficient fields");
                                }
                            } catch (IOException unused) {
                                C11554hg.m31621a("trackPurchase", "purchaseData", "invalid PurchaseData JSON");
                            }
                        } else {
                            C11554hg.m31621a("trackPurchase", "dataSignature", "is null, skipping purchase validation");
                        }
                    } else if (b4 != null) {
                        C11554hg.m31621a("trackPurchase", "purchaseData", "is null. skipping purchase validation");
                    }
                    this.f27746g.mo70104a(b, b2.toUpperCase(Locale.US), ((double) dVar.f27098g) / 1000000.0d, b3, b4, C11549he.m31610b(str4));
                    if (b3 == null || b4 == null) {
                        C11554hg.m31620a("trackPurchase without purchaseData called");
                    } else {
                        C11554hg.m31620a("trackPurchase with purchaseData called");
                    }
                }
            } catch (IOException unused2) {
                C11554hg.m31621a("trackPurchase", "skuDetails", "invalid SkuDetails JSON");
            }
        }
    }

    /* renamed from: a */
    public final void mo70115a(@Nullable String str, String str2, @Nullable String str3, @Nullable String str4, long j) {
        if (mo70127c("trackEvent") && C11554hg.m31623a((Object) str2, "trackEvent: name was null")) {
            LinkedHashMap linkedHashMap = null;
            if (j != 0) {
                linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("value", Long.valueOf(j));
            }
            this.f27746g.mo70106a(str, str2, str3, str4, linkedHashMap);
            C11554hg.m31622a("trackEvent category:{}, name:{}, p1:{}, p2:{}, values:{} called", str, str2, str3, str4, linkedHashMap);
        }
    }

    /* renamed from: a */
    public final void mo70116a(@Nullable String str, String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, long j, @Nullable String str6, long j2, @Nullable String str7, long j3) {
        String str8 = str2;
        String str9 = str5;
        String str10 = str6;
        String str11 = str7;
        if (mo70127c("trackEvent") && C11554hg.m31623a((Object) str2, "trackEvent: name was null")) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (!(str9 == null || j == 0)) {
                linkedHashMap.put(str5, Long.valueOf(j));
            }
            if (!(str10 == null || j2 == 0)) {
                linkedHashMap.put(str10, Long.valueOf(j2));
            }
            if (!(str11 == null || j3 == 0)) {
                linkedHashMap.put(str11, Long.valueOf(j3));
            }
            if (linkedHashMap.isEmpty()) {
                linkedHashMap = null;
            }
            this.f27746g.mo70106a(str, str2, str3, str4, linkedHashMap);
            C11554hg.m31622a("trackEvent category:{}, name:{}, p1:{}, p2:{}, values:{} called", str, str8, str3, str4, linkedHashMap);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo70118a(Map<String, Object> map) {
        this.f27746g.mo70107a(map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo70119a(Map<String, Object> map, long j) {
        this.f27746g.mo70108a(map, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo70120a(Map<String, Object> map, String str) {
        this.f27746g.mo70109a(map, str);
    }

    /* renamed from: a */
    public static synchronized void m31648a(Runnable runnable) {
        synchronized (C11558hj.class) {
            if (f27738w == null) {
                f27738w = new Handler(Looper.getMainLooper());
            }
            f27738w.post(runnable);
        }
    }

    /* renamed from: c */
    public static synchronized File m31649c(Context context) {
        File file;
        synchronized (C11558hj.class) {
            if (f27739x == null) {
                f27739x = context.getDir("fiverocks", 0);
            }
            file = f27739x;
        }
        return file;
    }

    /* renamed from: d */
    static File m31650d(Context context) {
        return new File(m31649c(context), "install");
    }

    /* renamed from: a */
    public static C11558hj m31645a(Context context) {
        C11558hj hjVar = f27737q;
        hjVar.mo70123b(context);
        return hjVar;
    }

    /* renamed from: a */
    public static void m31646a(Context context, String str) {
        if (str != null) {
            C11558hj hjVar = f27737q;
            hjVar.mo70123b(context);
            if (TextUtils.isEmpty(hjVar.f27745f.mo70153c())) {
                C11570hm hmVar = hjVar.f27745f;
                synchronized (hmVar) {
                    hmVar.f27784c.f27829d.mo70313a(str);
                    hmVar.f27783b.f27523d = str;
                }
                if (str.length() > 0) {
                    C11557hi hiVar = hjVar.f27746g;
                    hiVar.mo70103a(hiVar.mo70101a(C11445fa.APP, "referrer"));
                }
            }
        }
    }
}
