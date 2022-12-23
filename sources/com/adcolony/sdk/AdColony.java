package com.adcolony.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Base64;
import com.adcolony.adcolonysdk.BuildConfig;
import com.adcolony.sdk.C0826e0;
import com.adcolony.sdk.C0928o;
import com.adcolony.sdk.C1047z0;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.smaato.sdk.core.SmaatoSdk;
import com.tapjoy.TapjoyConstants;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;

public class AdColony {

    /* renamed from: a */
    private static ExecutorService f76a = C1047z0.m1276h();

    /* renamed from: com.adcolony.sdk.AdColony$a */
    class C0701a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0866k f77a;

        /* renamed from: b */
        final /* synthetic */ C0969t0 f78b;

        /* renamed from: c */
        final /* synthetic */ AdColonySignalsListener f79c;

        /* renamed from: com.adcolony.sdk.AdColony$a$a */
        class C0702a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f80a;

            C0702a(String str) {
                this.f80a = str;
            }

            public void run() {
                if (!this.f80a.isEmpty()) {
                    C0701a.this.f79c.onSuccess(this.f80a);
                } else {
                    C0701a.this.f79c.onFailure();
                }
            }
        }

        C0701a(C0866k kVar, C0969t0 t0Var, AdColonySignalsListener adColonySignalsListener) {
            this.f77a = kVar;
            this.f78b = t0Var;
            this.f79c = adColonySignalsListener;
        }

        public void run() {
            C0866k kVar = this.f77a;
            C1047z0.m1259b((Runnable) new C0702a(AdColony.m94b(kVar, this.f78b, kVar.mo10916y())));
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$b */
    class C0703b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdColonyAdViewListener f82a;

        /* renamed from: b */
        final /* synthetic */ String f83b;

        C0703b(AdColonyAdViewListener adColonyAdViewListener, String str) {
            this.f82a = adColonyAdViewListener;
            this.f83b = str;
        }

        public void run() {
            this.f82a.onRequestNotFilled(AdColony.m82a(this.f83b));
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$c */
    class C0704c implements Callable<C0832f1> {

        /* renamed from: a */
        final /* synthetic */ long f84a;

        C0704c(long j) {
            this.f84a = j;
        }

        /* renamed from: b */
        public C0832f1 call() {
            return AdColony.m93b(this.f84a);
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$d */
    class C0705d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ double f85a;

        /* renamed from: b */
        final /* synthetic */ String f86b;

        /* renamed from: c */
        final /* synthetic */ String f87c;

        /* renamed from: d */
        final /* synthetic */ String f88d;

        C0705d(double d, String str, String str2, String str3) {
            this.f85a = d;
            this.f86b = str;
            this.f87c = str2;
            this.f88d = str3;
        }

        public void run() {
            AdColony.m95b();
            C0832f1 b = C0773c0.m379b();
            double d = this.f85a;
            if (d >= 0.0d) {
                C0773c0.m373a(b, "price", d);
            }
            String str = this.f86b;
            if (str != null && str.length() <= 3) {
                C0773c0.m376a(b, "currency_code", this.f86b);
            }
            C0773c0.m376a(b, "product_id", this.f87c);
            C0773c0.m376a(b, "transaction_id", this.f88d);
            new C0850h0("AdColony.on_iap_report", 1, b).mo10838c();
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$e */
    class C0706e implements C1047z0.C1049b {

        /* renamed from: a */
        private boolean f89a;

        /* renamed from: b */
        final /* synthetic */ AdColonyAdViewListener f90b;

        /* renamed from: c */
        final /* synthetic */ String f91c;

        /* renamed from: d */
        final /* synthetic */ C1047z0.C1050c f92d;

        C0706e(AdColonyAdViewListener adColonyAdViewListener, String str, C1047z0.C1050c cVar) {
            this.f90b = adColonyAdViewListener;
            this.f91c = str;
            this.f92d = cVar;
        }

        /* renamed from: a */
        public boolean mo10313a() {
            return this.f89a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
            r0 = new com.adcolony.sdk.C0826e0.C0827a().mo10746a("RequestNotFilled called due to a native timeout. ");
            r0 = r0.mo10746a("Timeout set to: " + r6.f92d.mo11217b() + " ms. ");
            r0.mo10746a("Execution took: " + (java.lang.System.currentTimeMillis() - r6.f92d.mo11218c()) + " ms. ").mo10746a("AdView request not yet started.").mo10747a(com.adcolony.sdk.C0826e0.f462i);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x000b, code lost:
            com.adcolony.sdk.AdColony.m89a(r6.f90b, r6.f91c);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
            if (r6.f92d.mo11216a() == false) goto L_?;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                monitor-enter(r6)
                boolean r0 = r6.f89a     // Catch:{ all -> 0x0076 }
                if (r0 == 0) goto L_0x0007
                monitor-exit(r6)     // Catch:{ all -> 0x0076 }
                return
            L_0x0007:
                r0 = 1
                r6.f89a = r0     // Catch:{ all -> 0x0076 }
                monitor-exit(r6)     // Catch:{ all -> 0x0076 }
                com.adcolony.sdk.AdColonyAdViewListener r0 = r6.f90b
                java.lang.String r1 = r6.f91c
                com.adcolony.sdk.AdColony.m89a((com.adcolony.sdk.AdColonyAdViewListener) r0, (java.lang.String) r1)
                com.adcolony.sdk.z0$c r0 = r6.f92d
                boolean r0 = r0.mo11216a()
                if (r0 == 0) goto L_0x0075
                com.adcolony.sdk.e0$a r0 = new com.adcolony.sdk.e0$a
                r0.<init>()
                java.lang.String r1 = "RequestNotFilled called due to a native timeout. "
                com.adcolony.sdk.e0$a r0 = r0.mo10746a((java.lang.String) r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Timeout set to: "
                r1.append(r2)
                com.adcolony.sdk.z0$c r2 = r6.f92d
                long r2 = r2.mo11217b()
                r1.append(r2)
                java.lang.String r2 = " ms. "
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.adcolony.sdk.e0$a r0 = r0.mo10746a((java.lang.String) r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Execution took: "
                r1.append(r2)
                long r2 = java.lang.System.currentTimeMillis()
                com.adcolony.sdk.z0$c r4 = r6.f92d
                long r4 = r4.mo11218c()
                long r2 = r2 - r4
                r1.append(r2)
                java.lang.String r2 = " ms. "
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.adcolony.sdk.e0$a r0 = r0.mo10746a((java.lang.String) r1)
                java.lang.String r1 = "AdView request not yet started."
                com.adcolony.sdk.e0$a r0 = r0.mo10746a((java.lang.String) r1)
                com.adcolony.sdk.e0 r1 = com.adcolony.sdk.C0826e0.f462i
                r0.mo10747a((com.adcolony.sdk.C0826e0) r1)
            L_0x0075:
                return
            L_0x0076:
                r0 = move-exception
                monitor-exit(r6)     // Catch:{ all -> 0x0076 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.AdColony.C0706e.run():void");
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$f */
    class C0707f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C1047z0.C1049b f93a;

        /* renamed from: b */
        final /* synthetic */ String f94b;

        /* renamed from: c */
        final /* synthetic */ AdColonyAdViewListener f95c;

        /* renamed from: d */
        final /* synthetic */ AdColonyAdSize f96d;

        /* renamed from: e */
        final /* synthetic */ AdColonyAdOptions f97e;

        /* renamed from: f */
        final /* synthetic */ C1047z0.C1050c f98f;

        C0707f(C1047z0.C1049b bVar, String str, AdColonyAdViewListener adColonyAdViewListener, AdColonyAdSize adColonyAdSize, AdColonyAdOptions adColonyAdOptions, C1047z0.C1050c cVar) {
            this.f93a = bVar;
            this.f94b = str;
            this.f95c = adColonyAdViewListener;
            this.f96d = adColonyAdSize;
            this.f97e = adColonyAdOptions;
            this.f98f = cVar;
        }

        public void run() {
            C0866k b = C0723a.m193b();
            if (b.mo10867E() || b.mo10868F()) {
                AdColony.m99f();
                C1047z0.m1242a(this.f93a);
            } else if (AdColony.m95b() || !C0723a.m195c()) {
                C1047z0.m1263c((Runnable) this.f93a);
                if (!this.f93a.mo10313a()) {
                    b.mo10889c().mo10712a(this.f94b, this.f95c, this.f96d, this.f97e, this.f98f.mo11219d());
                }
            } else {
                C1047z0.m1242a(this.f93a);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$g */
    class C0708g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdColonyAppOptions f99a;

        C0708g(AdColonyAppOptions adColonyAppOptions) {
            this.f99a = adColonyAppOptions;
        }

        public void run() {
            AdColony.m95b();
            C0832f1 b = C0773c0.m379b();
            C0773c0.m375a(b, SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, this.f99a.mo10383b());
            new C0850h0("Options.set_options", 1, b).mo10838c();
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$h */
    class C0709h implements C1047z0.C1049b {

        /* renamed from: a */
        private boolean f100a;

        /* renamed from: b */
        final /* synthetic */ AdColonyInterstitialListener f101b;

        /* renamed from: c */
        final /* synthetic */ String f102c;

        /* renamed from: d */
        final /* synthetic */ C1047z0.C1050c f103d;

        C0709h(AdColonyInterstitialListener adColonyInterstitialListener, String str, C1047z0.C1050c cVar) {
            this.f101b = adColonyInterstitialListener;
            this.f102c = str;
            this.f103d = cVar;
        }

        /* renamed from: a */
        public boolean mo10313a() {
            return this.f100a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
            r0 = new com.adcolony.sdk.C0826e0.C0827a().mo10746a("RequestNotFilled called due to a native timeout. ");
            r0 = r0.mo10746a("Timeout set to: " + r6.f103d.mo11217b() + " ms. ");
            r0.mo10746a("Execution took: " + (java.lang.System.currentTimeMillis() - r6.f103d.mo11218c()) + " ms. ").mo10746a("Interstitial request not yet started.").mo10747a(com.adcolony.sdk.C0826e0.f462i);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x000b, code lost:
            com.adcolony.sdk.AdColony.m90a(r6.f101b, r6.f102c);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
            if (r6.f103d.mo11216a() == false) goto L_?;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                monitor-enter(r6)
                boolean r0 = r6.f100a     // Catch:{ all -> 0x0076 }
                if (r0 == 0) goto L_0x0007
                monitor-exit(r6)     // Catch:{ all -> 0x0076 }
                return
            L_0x0007:
                r0 = 1
                r6.f100a = r0     // Catch:{ all -> 0x0076 }
                monitor-exit(r6)     // Catch:{ all -> 0x0076 }
                com.adcolony.sdk.AdColonyInterstitialListener r0 = r6.f101b
                java.lang.String r1 = r6.f102c
                com.adcolony.sdk.AdColony.m90a((com.adcolony.sdk.AdColonyInterstitialListener) r0, (java.lang.String) r1)
                com.adcolony.sdk.z0$c r0 = r6.f103d
                boolean r0 = r0.mo11216a()
                if (r0 == 0) goto L_0x0075
                com.adcolony.sdk.e0$a r0 = new com.adcolony.sdk.e0$a
                r0.<init>()
                java.lang.String r1 = "RequestNotFilled called due to a native timeout. "
                com.adcolony.sdk.e0$a r0 = r0.mo10746a((java.lang.String) r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Timeout set to: "
                r1.append(r2)
                com.adcolony.sdk.z0$c r2 = r6.f103d
                long r2 = r2.mo11217b()
                r1.append(r2)
                java.lang.String r2 = " ms. "
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.adcolony.sdk.e0$a r0 = r0.mo10746a((java.lang.String) r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Execution took: "
                r1.append(r2)
                long r2 = java.lang.System.currentTimeMillis()
                com.adcolony.sdk.z0$c r4 = r6.f103d
                long r4 = r4.mo11218c()
                long r2 = r2 - r4
                r1.append(r2)
                java.lang.String r2 = " ms. "
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.adcolony.sdk.e0$a r0 = r0.mo10746a((java.lang.String) r1)
                java.lang.String r1 = "Interstitial request not yet started."
                com.adcolony.sdk.e0$a r0 = r0.mo10746a((java.lang.String) r1)
                com.adcolony.sdk.e0 r1 = com.adcolony.sdk.C0826e0.f462i
                r0.mo10747a((com.adcolony.sdk.C0826e0) r1)
            L_0x0075:
                return
            L_0x0076:
                r0 = move-exception
                monitor-exit(r6)     // Catch:{ all -> 0x0076 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.AdColony.C0709h.run():void");
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$i */
    class C0710i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C1047z0.C1049b f104a;

        /* renamed from: b */
        final /* synthetic */ String f105b;

        /* renamed from: c */
        final /* synthetic */ AdColonyInterstitialListener f106c;

        /* renamed from: d */
        final /* synthetic */ AdColonyAdOptions f107d;

        /* renamed from: e */
        final /* synthetic */ C1047z0.C1050c f108e;

        C0710i(C1047z0.C1049b bVar, String str, AdColonyInterstitialListener adColonyInterstitialListener, AdColonyAdOptions adColonyAdOptions, C1047z0.C1050c cVar) {
            this.f104a = bVar;
            this.f105b = str;
            this.f106c = adColonyInterstitialListener;
            this.f107d = adColonyAdOptions;
            this.f108e = cVar;
        }

        public void run() {
            C0866k b = C0723a.m193b();
            if (b.mo10867E() || b.mo10868F()) {
                AdColony.m99f();
                C1047z0.m1242a(this.f104a);
            } else if (AdColony.m95b() || !C0723a.m195c()) {
                AdColonyZone adColonyZone = b.mo10865C().get(this.f105b);
                if (adColonyZone == null) {
                    adColonyZone = new AdColonyZone(this.f105b);
                }
                if (adColonyZone.getZoneType() == 2 || adColonyZone.getZoneType() == 1) {
                    C1047z0.m1242a(this.f104a);
                    return;
                }
                C1047z0.m1263c((Runnable) this.f104a);
                if (!this.f104a.mo10313a()) {
                    b.mo10889c().mo10713a(this.f105b, this.f106c, this.f107d, this.f108e.mo11219d());
                }
            } else {
                C1047z0.m1242a(this.f104a);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$j */
    class C0711j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdColonyInterstitialListener f109a;

        /* renamed from: b */
        final /* synthetic */ String f110b;

        C0711j(AdColonyInterstitialListener adColonyInterstitialListener, String str) {
            this.f109a = adColonyInterstitialListener;
            this.f110b = str;
        }

        public void run() {
            this.f109a.onRequestNotFilled(AdColony.m82a(this.f110b));
        }
    }

    public static boolean addCustomMessageListener(AdColonyCustomMessageListener adColonyCustomMessageListener, String str) {
        if (!C0723a.m197e()) {
            new C0826e0.C0827a().mo10746a("Ignoring call to AdColony.addCustomMessageListener as AdColony ").mo10746a("has not yet been configured.").mo10747a(C0826e0.f459f);
            return false;
        } else if (!C1047z0.m1270e(str)) {
            new C0826e0.C0827a().mo10746a("Ignoring call to AdColony.addCustomMessageListener.").mo10747a(C0826e0.f459f);
            return false;
        } else {
            C0723a.m193b().mo10904m().put(str, adColonyCustomMessageListener);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static String m94b(C0866k kVar, C0969t0 t0Var, long j) {
        C0943q n = kVar.mo10905n();
        ArrayList arrayList = new ArrayList(Arrays.asList(new C0832f1[]{C1047z0.m1261c(kVar.mo10912u().mo10383b()), C1047z0.m1234a(n.mo11043d())}));
        if (j > 0) {
            C0951q0 q0Var = new C0951q0();
            if (n.mo11023N()) {
                arrayList.add(n.mo11033b());
            } else {
                q0Var.mo11075a(n.mo11027a(j));
            }
            if (n.mo11024O()) {
                arrayList.add(n.mo11039c());
            } else {
                q0Var.mo11075a(n.mo11034b(j));
            }
            if (kVar.mo10869G()) {
                q0Var.mo11075a(new C0704c(j));
            } else {
                arrayList.add(m97d());
            }
            if (!q0Var.mo11076b()) {
                arrayList.addAll(q0Var.mo11073a());
            }
        } else {
            arrayList.add(n.mo11033b());
            arrayList.add(n.mo11039c());
            arrayList.add(m97d());
        }
        arrayList.add(kVar.mo10894e());
        C0832f1 a = C0773c0.m370a((C0832f1[]) arrayList.toArray(new C0832f1[0]));
        t0Var.mo11112c();
        C0773c0.m383b(a, "signals_count", t0Var.mo11110b());
        C0773c0.m385b(a, "device_audio", m98e());
        a.mo10797e();
        byte[] bytes = a.toString().getBytes(C0849h.f506a);
        if (kVar.mo10870H()) {
            return m86a(bytes);
        }
        return Base64.encodeToString(bytes, 0);
    }

    /* renamed from: c */
    static void m96c() {
        if (f76a.isShutdown()) {
            f76a = Executors.newSingleThreadExecutor();
        }
    }

    public static boolean clearCustomMessageListeners() {
        if (!C0723a.m197e()) {
            new C0826e0.C0827a().mo10746a("Ignoring call to AdColony.clearCustomMessageListeners as AdColony").mo10746a(" has not yet been configured.").mo10747a(C0826e0.f459f);
            return false;
        }
        C0723a.m193b().mo10904m().clear();
        return true;
    }

    public static void collectSignals(AdColonySignalsListener adColonySignalsListener) {
        if (!C0723a.m197e()) {
            new C0826e0.C0827a().mo10746a("Ignoring call to AdColony.collectSignals() as AdColony has not yet been configured.").mo10747a(C0826e0.f459f);
            adColonySignalsListener.onFailure();
            return;
        }
        C0866k b = C0723a.m193b();
        if (!m92a((Runnable) new C0701a(b, b.mo10915x(), adColonySignalsListener))) {
            adColonySignalsListener.onFailure();
        }
    }

    @Deprecated
    public static boolean configure(Activity activity, String str, String... strArr) {
        return m91a((Context) activity, (AdColonyAppOptions) null, str);
    }

    /* renamed from: d */
    private static C0832f1 m97d() {
        return m93b(-1);
    }

    public static boolean disable() {
        if (!C0723a.m197e()) {
            return false;
        }
        Context a = C0723a.m186a();
        if (a != null && (a instanceof C0739b)) {
            ((Activity) a).finish();
        }
        C0866k b = C0723a.m193b();
        b.mo10889c().mo10716b();
        b.mo10875R();
        b.mo10876T();
        b.mo10888b(true);
        return true;
    }

    /* renamed from: e */
    private static boolean m98e() {
        Context a = C0723a.m186a();
        if (a == null) {
            return false;
        }
        return C1047z0.m1258b(C1047z0.m1232a(a));
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static void m99f() {
        new C0826e0.C0827a().mo10746a("The AdColony API is not available while AdColony is disabled.").mo10747a(C0826e0.f461h);
    }

    /* renamed from: g */
    static void m100g() {
        f76a.shutdown();
    }

    public static AdColonyAppOptions getAppOptions() {
        if (!C0723a.m197e()) {
            return null;
        }
        return C0723a.m193b().mo10912u();
    }

    public static AdColonyCustomMessageListener getCustomMessageListener(String str) {
        if (!C0723a.m197e()) {
            return null;
        }
        return C0723a.m193b().mo10904m().get(str);
    }

    public static AdColonyRewardListener getRewardListener() {
        if (!C0723a.m197e()) {
            return null;
        }
        return C0723a.m193b().mo10914w();
    }

    public static String getSDKVersion() {
        if (!C0723a.m197e()) {
            return "";
        }
        return C0723a.m193b().mo10905n().mo11018I();
    }

    public static AdColonyZone getZone(String str) {
        if (!C0723a.m197e()) {
            new C0826e0.C0827a().mo10746a("Ignoring call to AdColony.getZone() as AdColony has not yet been ").mo10746a("configured.").mo10747a(C0826e0.f459f);
            return null;
        }
        HashMap<String, AdColonyZone> C = C0723a.m193b().mo10865C();
        if (C.containsKey(str)) {
            return C.get(str);
        }
        AdColonyZone adColonyZone = new AdColonyZone(str);
        C0723a.m193b().mo10865C().put(str, adColonyZone);
        return adColonyZone;
    }

    public static boolean notifyIAPComplete(String str, String str2) {
        return notifyIAPComplete(str, str2, (String) null, 0.0d);
    }

    public static boolean removeCustomMessageListener(String str) {
        if (!C0723a.m197e()) {
            new C0826e0.C0827a().mo10746a("Ignoring call to AdColony.removeCustomMessageListener as AdColony").mo10746a(" has not yet been configured.").mo10747a(C0826e0.f459f);
            return false;
        }
        C0723a.m193b().mo10904m().remove(str);
        return true;
    }

    public static boolean removeRewardListener() {
        if (!C0723a.m197e()) {
            new C0826e0.C0827a().mo10746a("Ignoring call to AdColony.removeRewardListener() as AdColony has ").mo10746a("not yet been configured.").mo10747a(C0826e0.f459f);
            return false;
        }
        C0723a.m193b().mo10883a((AdColonyRewardListener) null);
        return true;
    }

    public static boolean requestAdView(String str, AdColonyAdViewListener adColonyAdViewListener, AdColonyAdSize adColonyAdSize) {
        return requestAdView(str, adColonyAdViewListener, adColonyAdSize, (AdColonyAdOptions) null);
    }

    public static boolean requestInterstitial(String str, AdColonyInterstitialListener adColonyInterstitialListener) {
        return requestInterstitial(str, adColonyInterstitialListener, (AdColonyAdOptions) null);
    }

    public static boolean setAppOptions(AdColonyAppOptions adColonyAppOptions) {
        if (!C0723a.m197e()) {
            new C0826e0.C0827a().mo10746a("Ignoring call to AdColony.setAppOptions() as AdColony has not yet").mo10746a(" been configured.").mo10747a(C0826e0.f459f);
            return false;
        }
        if (adColonyAppOptions == null) {
            adColonyAppOptions = new AdColonyAppOptions();
        }
        C0723a.m190a(adColonyAppOptions);
        if (C0723a.m196d()) {
            C0866k b = C0723a.m193b();
            if (b.mo10866D()) {
                adColonyAppOptions.mo10381a(b.mo10912u().mo10382a());
            }
        }
        C0723a.m193b().mo10887b(adColonyAppOptions);
        Context a = C0723a.m186a();
        if (a != null) {
            adColonyAppOptions.mo10384b(a);
        }
        return m92a((Runnable) new C0708g(adColonyAppOptions));
    }

    public static boolean setRewardListener(AdColonyRewardListener adColonyRewardListener) {
        if (!C0723a.m197e()) {
            new C0826e0.C0827a().mo10746a("Ignoring call to AdColony.setRewardListener() as AdColony has not").mo10746a(" yet been configured.").mo10747a(C0826e0.f459f);
            return false;
        }
        C0723a.m193b().mo10883a(adColonyRewardListener);
        return true;
    }

    @Deprecated
    public static boolean configure(Activity activity, AdColonyAppOptions adColonyAppOptions, String str, String... strArr) {
        return m91a((Context) activity, adColonyAppOptions, str);
    }

    public static boolean notifyIAPComplete(String str, String str2, String str3, double d) {
        if (!C0723a.m197e()) {
            new C0826e0.C0827a().mo10746a("Ignoring call to notifyIAPComplete as AdColony has not yet been ").mo10746a("configured.").mo10747a(C0826e0.f459f);
            return false;
        } else if (!C1047z0.m1270e(str) || !C1047z0.m1270e(str2)) {
            new C0826e0.C0827a().mo10746a("Ignoring call to notifyIAPComplete as one of the passed Strings ").mo10746a("is greater than ").mo10744a(128).mo10746a(" characters.").mo10747a(C0826e0.f459f);
            return false;
        } else {
            if (str3 != null && str3.length() > 3) {
                new C0826e0.C0827a().mo10746a("You are trying to report an IAP event with a currency String ").mo10746a("containing more than 3 characters.").mo10747a(C0826e0.f459f);
            }
            if (m92a((Runnable) new C0705d(d, str3, str, str2))) {
                return true;
            }
            new C0826e0.C0827a().mo10746a("Executing AdColony.notifyIAPComplete failed").mo10747a(C0826e0.f462i);
            return false;
        }
    }

    public static boolean requestAdView(String str, AdColonyAdViewListener adColonyAdViewListener, AdColonyAdSize adColonyAdSize, AdColonyAdOptions adColonyAdOptions) {
        if (adColonyAdViewListener == null) {
            new C0826e0.C0827a().mo10746a("AdColonyAdViewListener is set to null. ").mo10746a("It is required to be non null.").mo10747a(C0826e0.f459f);
        }
        if (!C0723a.m197e()) {
            new C0826e0.C0827a().mo10746a("Ignoring call to requestAdView as AdColony has not yet been").mo10746a(" configured.").mo10747a(C0826e0.f459f);
            m89a(adColonyAdViewListener, str);
            return false;
        } else if (adColonyAdSize.getHeight() <= 0 || adColonyAdSize.getWidth() <= 0) {
            new C0826e0.C0827a().mo10746a("Ignoring call to requestAdView as you've provided an AdColonyAdSize").mo10746a(" object with an invalid width or height.").mo10747a(C0826e0.f459f);
            m89a(adColonyAdViewListener, str);
            return false;
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("zone_id", str);
            if (C0959r0.m1004a(1, bundle)) {
                m89a(adColonyAdViewListener, str);
                return false;
            }
            C1047z0.C1050c cVar = new C1047z0.C1050c(C0723a.m193b().mo10891d());
            C0706e eVar = new C0706e(adColonyAdViewListener, str, cVar);
            C1047z0.m1244a((Runnable) eVar, cVar.mo11219d());
            if (m92a((Runnable) new C0707f(eVar, str, adColonyAdViewListener, adColonyAdSize, adColonyAdOptions, cVar))) {
                return true;
            }
            C1047z0.m1242a((C1047z0.C1049b) eVar);
            return false;
        }
    }

    public static boolean requestInterstitial(String str, AdColonyInterstitialListener adColonyInterstitialListener, AdColonyAdOptions adColonyAdOptions) {
        if (adColonyInterstitialListener == null) {
            new C0826e0.C0827a().mo10746a("AdColonyInterstitialListener is set to null. ").mo10746a("It is required to be non null.").mo10747a(C0826e0.f459f);
        }
        if (!C0723a.m197e()) {
            new C0826e0.C0827a().mo10746a("Ignoring call to AdColony.requestInterstitial as AdColony has not").mo10746a(" yet been configured.").mo10747a(C0826e0.f459f);
            m90a(adColonyInterstitialListener, str);
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putString("zone_id", str);
        if (C0959r0.m1004a(1, bundle)) {
            m90a(adColonyInterstitialListener, str);
            return false;
        }
        C1047z0.C1050c cVar = new C1047z0.C1050c(C0723a.m193b().mo10891d());
        C0709h hVar = new C0709h(adColonyInterstitialListener, str, cVar);
        C1047z0.m1244a((Runnable) hVar, cVar.mo11219d());
        if (m92a((Runnable) new C0710i(hVar, str, adColonyInterstitialListener, adColonyAdOptions, cVar))) {
            return true;
        }
        C1047z0.m1242a((C1047z0.C1049b) hVar);
        return false;
    }

    @Deprecated
    public static boolean configure(Application application, String str, String... strArr) {
        return configure(application, (AdColonyAppOptions) null, str);
    }

    /* renamed from: a */
    static boolean m92a(Runnable runnable) {
        return C1047z0.m1247a(f76a, runnable);
    }

    @Deprecated
    public static boolean configure(Application application, AdColonyAppOptions adColonyAppOptions, String str, String... strArr) {
        return m91a((Context) application, adColonyAppOptions, str);
    }

    /* renamed from: a */
    private static String m84a(C0866k kVar, C0969t0 t0Var) {
        return m94b(kVar, t0Var, -1);
    }

    public static boolean configure(Activity activity, String str) {
        return m91a((Context) activity, (AdColonyAppOptions) null, str);
    }

    /* renamed from: a */
    static String m86a(byte[] bArr) {
        C0833g gVar = new C0833g(BuildConfig.COLLECT_SIGNALS_DICT_ID, "", BuildConfig.COLLECT_SIGNALS_DICT, "");
        try {
            byte[] a = gVar.mo10814a(bArr);
            C0832f1 b = C0773c0.m379b();
            b.mo10779a("a", gVar.mo10815b());
            b.mo10779a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, Base64.encodeToString(a, 0));
            return b.toString();
        } catch (UnsupportedEncodingException | JSONException unused) {
            return Base64.encodeToString(bArr, 0);
        }
    }

    public static boolean configure(Activity activity, AdColonyAppOptions adColonyAppOptions, String str) {
        return m91a((Context) activity, adColonyAppOptions, str);
    }

    public static boolean configure(Application application, String str) {
        return configure(application, (AdColonyAppOptions) null, str);
    }

    public static boolean configure(Application application, AdColonyAppOptions adColonyAppOptions, String str) {
        return m91a((Context) application, adColonyAppOptions, str);
    }

    /* renamed from: a */
    private static boolean m91a(Context context, AdColonyAppOptions adColonyAppOptions, String str) {
        if (C0959r0.m1004a(0, (Bundle) null)) {
            new C0826e0.C0827a().mo10746a("Cannot configure AdColony; configuration mechanism requires 5 ").mo10746a("seconds between attempts.").mo10747a(C0826e0.f459f);
            return false;
        }
        if (context == null) {
            context = C0723a.m186a();
        }
        if (context == null) {
            new C0826e0.C0827a().mo10746a("Ignoring call to AdColony.configure() as the provided Activity or ").mo10746a("Application context is null and we do not currently hold a ").mo10746a("reference to either for our use.").mo10747a(C0826e0.f459f);
            return false;
        }
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        if (adColonyAppOptions == null) {
            adColonyAppOptions = new AdColonyAppOptions();
        }
        if (C0723a.m196d() && !C0773c0.m382b(C0723a.m193b().mo10912u().mo10383b(), "reconfigurable") && !C0723a.m193b().mo10912u().mo10382a().equals(str)) {
            new C0826e0.C0827a().mo10746a("Ignoring call to AdColony.configure() as the app id does not ").mo10746a("match what was used during the initial configuration.").mo10747a(C0826e0.f459f);
            return false;
        } else if (str.equals("")) {
            new C0826e0.C0827a().mo10746a("AdColony.configure() called with an empty app id String.").mo10747a(C0826e0.f461h);
            return false;
        } else {
            C0723a.f206c = true;
            adColonyAppOptions.mo10381a(str);
            if (Build.VERSION.SDK_INT < 21) {
                new C0826e0.C0827a().mo10746a("The minimum API level for the AdColony SDK is ").mo10744a(21).mo10746a(".").mo10747a(C0826e0.f459f);
                C0723a.m189a(context, adColonyAppOptions, true);
            } else {
                C0723a.m189a(context, adColonyAppOptions, false);
            }
            C0832f1 b = C0773c0.m379b();
            C0773c0.m376a(b, "appId", str);
            C0773c0.m395j(b, C0723a.m193b().mo10917z().mo11159f() + "/adc3/AppInfo");
            return true;
        }
    }

    @Deprecated
    public static String collectSignals() {
        if (!C0723a.m197e()) {
            new C0826e0.C0827a().mo10746a("Ignoring call to AdColony.collectSignals() as AdColony has not yet been configured.").mo10747a(C0826e0.f459f);
            return "";
        }
        C0866k b = C0723a.m193b();
        return m84a(b, b.mo10915x());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C0832f1 m93b(long j) {
        C0928o.C0930b bVar;
        C0832f1 b = C0773c0.m379b();
        if (j > 0) {
            bVar = C0934o0.m895c().mo10987a(j);
        } else {
            bVar = C0934o0.m895c().mo10994b();
        }
        if (bVar != null) {
            C0773c0.m375a(b, "odt_payload", bVar.mo10976b());
        }
        return b;
    }

    /* renamed from: b */
    static boolean m95b() {
        C0866k b = C0723a.m193b();
        b.mo10878a(15000);
        return b.mo10871I();
    }

    /* renamed from: a */
    static AdColonyZone m82a(String str) {
        AdColonyZone adColonyZone;
        if (C0723a.m195c()) {
            adColonyZone = C0723a.m193b().mo10865C().get(str);
        } else {
            adColonyZone = C0723a.m196d() ? C0723a.m193b().mo10865C().get(str) : null;
        }
        if (adColonyZone != null) {
            return adColonyZone;
        }
        AdColonyZone adColonyZone2 = new AdColonyZone(str);
        adColonyZone2.mo10519c(6);
        return adColonyZone2;
    }

    /* renamed from: a */
    static void m90a(AdColonyInterstitialListener adColonyInterstitialListener, String str) {
        if (adColonyInterstitialListener != null) {
            C1047z0.m1259b((Runnable) new C0711j(adColonyInterstitialListener, str));
        }
    }

    /* renamed from: a */
    static void m89a(AdColonyAdViewListener adColonyAdViewListener, String str) {
        if (adColonyAdViewListener != null) {
            C1047z0.m1259b((Runnable) new C0703b(adColonyAdViewListener, str));
        }
    }

    /* renamed from: a */
    static void m88a(Context context, AdColonyAppOptions adColonyAppOptions) {
        C0866k b = C0723a.m193b();
        C0943q n = b.mo10905n();
        if (adColonyAppOptions != null && context != null) {
            String d = C1047z0.m1267d(context);
            String c = C1047z0.m1262c();
            int d2 = C1047z0.m1265d();
            String m = n.mo11052m();
            String e = b.mo10910s().mo10946e();
            HashMap hashMap = new HashMap();
            hashMap.put("sessionId", "unknown");
            hashMap.put("countryLocale", Locale.getDefault().getDisplayLanguage() + " (" + Locale.getDefault().getDisplayCountry() + ")");
            hashMap.put("countryLocaleShort", C0723a.m193b().mo10905n().mo11055p());
            hashMap.put("manufacturer", C0723a.m193b().mo10905n().mo11012C());
            hashMap.put(DeviceRequestsHelper.DEVICE_INFO_MODEL, C0723a.m193b().mo10905n().mo11015F());
            hashMap.put("osVersion", C0723a.m193b().mo10905n().mo11017H());
            hashMap.put("carrierName", m);
            hashMap.put("networkType", e);
            hashMap.put(TapjoyConstants.TJC_PLATFORM, "android");
            hashMap.put("appName", d);
            hashMap.put("appVersion", c);
            hashMap.put("appBuildNumber", Integer.valueOf(d2));
            hashMap.put("appId", "" + adColonyAppOptions.mo10382a());
            hashMap.put("apiLevel", Integer.valueOf(Build.VERSION.SDK_INT));
            hashMap.put(SmaatoSdk.KEY_SDK_VERSION, C0723a.m193b().mo10905n().mo11018I());
            hashMap.put("controllerVersion", "unknown");
            C0832f1 f1Var = new C0832f1(adColonyAppOptions.getMediationInfo());
            C0832f1 f1Var2 = new C0832f1(adColonyAppOptions.getPluginInfo());
            if (!C0773c0.m393h(f1Var, "mediation_network").equals("")) {
                hashMap.put("mediationNetwork", C0773c0.m393h(f1Var, "mediation_network"));
                hashMap.put("mediationNetworkVersion", C0773c0.m393h(f1Var, "mediation_network_version"));
            }
            if (!C0773c0.m393h(f1Var2, TapjoyConstants.TJC_PLUGIN).equals("")) {
                hashMap.put(TapjoyConstants.TJC_PLUGIN, C0773c0.m393h(f1Var2, TapjoyConstants.TJC_PLUGIN));
                hashMap.put("pluginVersion", C0773c0.m393h(f1Var2, "plugin_version"));
            }
            b.mo10908q().mo10824a((HashMap<String, Object>) hashMap);
        }
    }
}
