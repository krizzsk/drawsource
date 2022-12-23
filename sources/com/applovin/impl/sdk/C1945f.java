package com.applovin.impl.sdk;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.sdk.AppLovinSdkUtils;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.applovin.impl.sdk.f */
public class C1945f {

    /* renamed from: a */
    private static final int f3615a = ((int) TimeUnit.SECONDS.toMillis(30));

    /* renamed from: m */
    private static final C1945f f3616m = new C1945f();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final AtomicLong f3617b = new AtomicLong(0);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Handler f3618c;

    /* renamed from: d */
    private final HandlerThread f3619d = new HandlerThread("applovin-anr-detector");
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Handler f3620e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final AtomicBoolean f3621f = new AtomicBoolean();

    /* renamed from: g */
    private final AtomicBoolean f3622g = new AtomicBoolean();

    /* renamed from: h */
    private C1969m f3623h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Thread f3624i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public long f3625j = TimeUnit.SECONDS.toMillis(4);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public long f3626k = TimeUnit.SECONDS.toMillis(3);
    /* access modifiers changed from: private */

    /* renamed from: l */
    public long f3627l = TimeUnit.SECONDS.toMillis(3);

    /* renamed from: com.applovin.impl.sdk.f$a */
    private class C1947a implements Runnable {
        private C1947a() {
        }

        public void run() {
            if (!C1945f.this.f3621f.get()) {
                long currentTimeMillis = System.currentTimeMillis() - C1945f.this.f3617b.get();
                if (currentTimeMillis < 0 || currentTimeMillis > C1945f.this.f3625j) {
                    C1945f.this.m4386a();
                    C1945f.this.m4389b();
                }
                C1945f.this.f3620e.postDelayed(this, C1945f.this.f3627l);
            }
        }
    }

    /* renamed from: com.applovin.impl.sdk.f$b */
    private class C1948b implements Runnable {
        private C1948b() {
        }

        public void run() {
            if (!C1945f.this.f3621f.get()) {
                C1945f.this.f3617b.set(System.currentTimeMillis());
                C1945f.this.f3618c.postDelayed(this, C1945f.this.f3626k);
            }
        }
    }

    private C1945f() {
    }

    /* renamed from: a */
    private static String m4383a(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Throwable unused) {
            return "";
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m4386a() {
        if (this.f3622g.get()) {
            this.f3621f.set(true);
        }
    }

    /* renamed from: a */
    public static void m4387a(C1969m mVar) {
        if (mVar == null) {
            return;
        }
        if (((Boolean) mVar.mo14534a(C1867b.f3324eP)).booleanValue()) {
            f3616m.m4390b(mVar);
        } else {
            f3616m.m4386a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m4389b() {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) m4392c().openConnection();
            httpURLConnection.setConnectTimeout(f3615a);
            httpURLConnection.setReadTimeout(f3615a);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoOutput(false);
            int responseCode = httpURLConnection.getResponseCode();
            Log.d("applovin-anr-detector", "ANR reported with code " + responseCode);
        } catch (Throwable th) {
            Log.w("applovin-anr-detector", "Failed to report ANR", th);
        }
    }

    /* renamed from: b */
    private void m4390b(C1969m mVar) {
        if (this.f3622g.compareAndSet(false, true)) {
            this.f3623h = mVar;
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    Thread unused = C1945f.this.f3624i = Thread.currentThread();
                }
            });
            this.f3625j = ((Long) mVar.mo14534a(C1867b.f3325eQ)).longValue();
            this.f3626k = ((Long) mVar.mo14534a(C1867b.f3326eR)).longValue();
            this.f3627l = ((Long) mVar.mo14534a(C1867b.f3327eS)).longValue();
            this.f3618c = new Handler(mVar.mo14520L().getMainLooper());
            this.f3619d.start();
            this.f3618c.post(new C1948b());
            Handler handler = new Handler(this.f3619d.getLooper());
            this.f3620e = handler;
            handler.postDelayed(new C1947a(), this.f3627l / 2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0029 A[SYNTHETIC, Splitter:B:13:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036 A[Catch:{ MalformedURLException -> 0x0170 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0107 A[Catch:{ MalformedURLException -> 0x0170 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0117 A[Catch:{ MalformedURLException -> 0x0170 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.net.URL m4392c() {
        /*
            r11 = this;
            java.lang.String r0 = ""
            com.applovin.impl.sdk.m r1 = r11.f3623h
            android.content.Context r1 = r1.mo14520L()
            r2 = 0
            r3 = 0
            android.content.pm.PackageManager r4 = r1.getPackageManager()     // Catch:{ all -> 0x0017 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ all -> 0x0017 }
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r1, r3)     // Catch:{ all -> 0x0018 }
            goto L_0x0019
        L_0x0017:
            r1 = r0
        L_0x0018:
            r4 = r2
        L_0x0019:
            com.applovin.impl.sdk.m r5 = r11.f3623h     // Catch:{ MalformedURLException -> 0x0170 }
            com.applovin.impl.sdk.s r5 = r5.mo14555ae()     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.Object r5 = r5.mo14871c()     // Catch:{ MalformedURLException -> 0x0170 }
            boolean r6 = r5 instanceof com.applovin.impl.sdk.p049ad.C1839e     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r7 = "None"
            if (r6 == 0) goto L_0x0036
            com.applovin.impl.sdk.ad.e r5 = (com.applovin.impl.sdk.p049ad.C1839e) r5     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r6 = "AppLovin"
            long r8 = r5.getAdIdNumber()     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r5 = java.lang.Long.toString(r8)     // Catch:{ MalformedURLException -> 0x0170 }
            goto L_0x0047
        L_0x0036:
            boolean r6 = r5 instanceof com.applovin.impl.mediation.p031a.C1583a     // Catch:{ MalformedURLException -> 0x0170 }
            if (r6 == 0) goto L_0x0045
            com.applovin.impl.mediation.a.a r5 = (com.applovin.impl.mediation.p031a.C1583a) r5     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r6 = r5.getNetworkName()     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r5 = r5.getCreativeId()     // Catch:{ MalformedURLException -> 0x0170 }
            goto L_0x0047
        L_0x0045:
            r5 = r7
            r6 = r5
        L_0x0047:
            java.lang.Thread r8 = r11.f3624i     // Catch:{ MalformedURLException -> 0x0170 }
            if (r8 == 0) goto L_0x0078
            java.lang.Thread r8 = r11.f3624i     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.StackTraceElement[] r8 = r8.getStackTrace()     // Catch:{ MalformedURLException -> 0x0170 }
            int r8 = r8.length     // Catch:{ MalformedURLException -> 0x0170 }
            if (r8 <= 0) goto L_0x0078
            java.lang.Thread r7 = r11.f3624i     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.StackTraceElement[] r7 = r7.getStackTrace()     // Catch:{ MalformedURLException -> 0x0170 }
            r7 = r7[r3]     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x0170 }
            r8.<init>()     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r9 = r7.getClassName()     // Catch:{ MalformedURLException -> 0x0170 }
            r8.append(r9)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r9 = "."
            r8.append(r9)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r7 = r7.getMethodName()     // Catch:{ MalformedURLException -> 0x0170 }
            r8.append(r7)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r7 = r8.toString()     // Catch:{ MalformedURLException -> 0x0170 }
        L_0x0078:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x0170 }
            r8.<init>()     // Catch:{ MalformedURLException -> 0x0170 }
            com.applovin.impl.sdk.m r9 = r11.f3623h     // Catch:{ MalformedURLException -> 0x0170 }
            com.applovin.impl.sdk.c.b<java.lang.String> r10 = com.applovin.impl.sdk.p051c.C1867b.f3125aZ     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.Object r9 = r9.mo14534a(r10)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ MalformedURLException -> 0x0170 }
            r8.append(r9)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r9 = "?type=anr&platform=android&package_name="
            r8.append(r9)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = m4383a((java.lang.String) r1)     // Catch:{ MalformedURLException -> 0x0170 }
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = "&applovin_random_token="
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0170 }
            com.applovin.impl.sdk.m r1 = r11.f3623h     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = r1.mo14585o()     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = m4383a((java.lang.String) r1)     // Catch:{ MalformedURLException -> 0x0170 }
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = "&compass_random_token="
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0170 }
            com.applovin.impl.sdk.m r1 = r11.f3623h     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = r1.mo14584n()     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = m4383a((java.lang.String) r1)     // Catch:{ MalformedURLException -> 0x0170 }
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = "&model="
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = android.os.Build.MODEL     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = m4383a((java.lang.String) r1)     // Catch:{ MalformedURLException -> 0x0170 }
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = "&brand="
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = m4383a((java.lang.String) r1)     // Catch:{ MalformedURLException -> 0x0170 }
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = "&brand_name="
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = android.os.Build.BRAND     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = m4383a((java.lang.String) r1)     // Catch:{ MalformedURLException -> 0x0170 }
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = "&hardware="
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = android.os.Build.HARDWARE     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = m4383a((java.lang.String) r1)     // Catch:{ MalformedURLException -> 0x0170 }
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = "&revision="
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = android.os.Build.DEVICE     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = m4383a((java.lang.String) r1)     // Catch:{ MalformedURLException -> 0x0170 }
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = "&app_version="
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0170 }
            if (r4 == 0) goto L_0x0109
            java.lang.String r0 = r4.versionName     // Catch:{ MalformedURLException -> 0x0170 }
        L_0x0109:
            java.lang.String r0 = m4383a((java.lang.String) r0)     // Catch:{ MalformedURLException -> 0x0170 }
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r0 = "&app_version_code="
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0170 }
            if (r4 == 0) goto L_0x0119
            int r3 = r4.versionCode     // Catch:{ MalformedURLException -> 0x0170 }
        L_0x0119:
            r8.append(r3)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r0 = "&os="
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r0 = android.os.Build.VERSION.RELEASE     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r0 = m4383a((java.lang.String) r0)     // Catch:{ MalformedURLException -> 0x0170 }
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r0 = "&api_level="
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0170 }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ MalformedURLException -> 0x0170 }
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r0 = "&sdk_version="
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r0 = com.applovin.sdk.AppLovinSdk.VERSION     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r0 = m4383a((java.lang.String) r0)     // Catch:{ MalformedURLException -> 0x0170 }
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r0 = "&fs_ad_network="
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r0 = m4383a((java.lang.String) r6)     // Catch:{ MalformedURLException -> 0x0170 }
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r0 = "&fs_ad_creative_id="
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r0 = m4383a((java.lang.String) r5)     // Catch:{ MalformedURLException -> 0x0170 }
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r0 = "&top_main_method="
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r0 = m4383a((java.lang.String) r7)     // Catch:{ MalformedURLException -> 0x0170 }
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r0 = r8.toString()     // Catch:{ MalformedURLException -> 0x0170 }
            java.net.URL r1 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0170 }
            r1.<init>(r0)     // Catch:{ MalformedURLException -> 0x0170 }
            return r1
        L_0x0170:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C1945f.m4392c():java.net.URL");
    }
}
