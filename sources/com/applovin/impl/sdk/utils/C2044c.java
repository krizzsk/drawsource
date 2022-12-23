package com.applovin.impl.sdk.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.applovin.impl.sdk.C2022o;
import com.applovin.impl.sdk.C2102v;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.tapjoy.TapjoyConstants;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.applovin.impl.sdk.utils.c */
public class C2044c {

    /* renamed from: a */
    private static boolean f3980a = true;

    /* renamed from: b */
    private static final Object f3981b = new Object();

    /* renamed from: c */
    private static final Collection<CountDownLatch> f3982c = new HashSet();

    /* renamed from: d */
    private static boolean f3983d = false;

    /* renamed from: e */
    private static C2022o.C2028a f3984e = null;

    /* renamed from: a */
    public static C2022o.C2028a m4922a(Context context) {
        return m4924b(context);
    }

    /* renamed from: a */
    public static boolean m4923a() {
        return Utils.checkClassExistence("com.google.android.gms.ads.identifier.AdvertisingIdClient");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r1 == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        r5 = m4925c(r5);
        r0 = f3981b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        f3983d = true;
        f3984e = r5;
        r5 = new java.util.HashSet(f3982c);
        f3982c.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        r5 = r5.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        if (r5.hasNext() == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        ((java.util.concurrent.CountDownLatch) r5.next()).countDown();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0056, code lost:
        if (r2.await(60, java.util.concurrent.TimeUnit.SECONDS) != false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005c, code lost:
        if (com.applovin.impl.sdk.C2102v.m5104a() == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005e, code lost:
        com.applovin.impl.sdk.C2102v.m5110i("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }: collection timeout");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0066, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006b, code lost:
        if (com.applovin.impl.sdk.C2102v.m5104a() != false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006d, code lost:
        com.applovin.impl.sdk.C2102v.m5106c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0074, code lost:
        r5 = f3981b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0076, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r0 = f3984e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0079, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007a, code lost:
        return r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.applovin.impl.sdk.C2022o.C2028a m4924b(android.content.Context r5) {
        /*
            java.lang.Object r0 = f3981b
            monitor-enter(r0)
            boolean r1 = f3983d     // Catch:{ all -> 0x007e }
            if (r1 == 0) goto L_0x000b
            com.applovin.impl.sdk.o$a r5 = f3984e     // Catch:{ all -> 0x007e }
            monitor-exit(r0)     // Catch:{ all -> 0x007e }
            return r5
        L_0x000b:
            java.util.Collection<java.util.concurrent.CountDownLatch> r1 = f3982c     // Catch:{ all -> 0x007e }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x007e }
            java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x007e }
            r3 = 1
            r2.<init>(r3)     // Catch:{ all -> 0x007e }
            java.util.Collection<java.util.concurrent.CountDownLatch> r4 = f3982c     // Catch:{ all -> 0x007e }
            r4.add(r2)     // Catch:{ all -> 0x007e }
            monitor-exit(r0)     // Catch:{ all -> 0x007e }
            if (r1 == 0) goto L_0x004e
            com.applovin.impl.sdk.o$a r5 = m4925c(r5)
            java.lang.Object r0 = f3981b
            monitor-enter(r0)
            f3983d = r3     // Catch:{ all -> 0x004b }
            f3984e = r5     // Catch:{ all -> 0x004b }
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ all -> 0x004b }
            java.util.Collection<java.util.concurrent.CountDownLatch> r1 = f3982c     // Catch:{ all -> 0x004b }
            r5.<init>(r1)     // Catch:{ all -> 0x004b }
            java.util.Collection<java.util.concurrent.CountDownLatch> r1 = f3982c     // Catch:{ all -> 0x004b }
            r1.clear()     // Catch:{ all -> 0x004b }
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            java.util.Iterator r5 = r5.iterator()
        L_0x003b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x004e
            java.lang.Object r0 = r5.next()
            java.util.concurrent.CountDownLatch r0 = (java.util.concurrent.CountDownLatch) r0
            r0.countDown()
            goto L_0x003b
        L_0x004b:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            throw r5
        L_0x004e:
            r0 = 60
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0066 }
            boolean r5 = r2.await(r0, r5)     // Catch:{ InterruptedException -> 0x0066 }
            if (r5 != 0) goto L_0x0074
            boolean r5 = com.applovin.impl.sdk.C2102v.m5104a()     // Catch:{ InterruptedException -> 0x0066 }
            if (r5 == 0) goto L_0x0074
            java.lang.String r5 = "DataCollector"
            java.lang.String r0 = "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }: collection timeout"
            com.applovin.impl.sdk.C2102v.m5110i(r5, r0)     // Catch:{ InterruptedException -> 0x0066 }
            goto L_0x0074
        L_0x0066:
            r5 = move-exception
            boolean r0 = com.applovin.impl.sdk.C2102v.m5104a()
            if (r0 == 0) goto L_0x0074
            java.lang.String r0 = "DataCollector"
            java.lang.String r1 = "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }"
            com.applovin.impl.sdk.C2102v.m5106c(r0, r1, r5)
        L_0x0074:
            java.lang.Object r5 = f3981b
            monitor-enter(r5)
            com.applovin.impl.sdk.o$a r0 = f3984e     // Catch:{ all -> 0x007b }
            monitor-exit(r5)     // Catch:{ all -> 0x007b }
            return r0
        L_0x007b:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x007b }
            throw r0
        L_0x007e:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007e }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.utils.C2044c.m4924b(android.content.Context):com.applovin.impl.sdk.o$a");
    }

    /* renamed from: c */
    private static C2022o.C2028a m4925c(Context context) {
        C2022o.C2028a d = m4926d(context);
        if (d == null) {
            d = m4927e(context);
        }
        return d == null ? new C2022o.C2028a() : d;
    }

    /* renamed from: d */
    private static C2022o.C2028a m4926d(Context context) {
        if (m4923a()) {
            try {
                C2022o.C2028a aVar = new C2022o.C2028a();
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                aVar.f3940a = advertisingIdInfo.isLimitAdTrackingEnabled();
                aVar.f3941b = advertisingIdInfo.getId();
                return aVar;
            } catch (Throwable th) {
                if (AppLovinSdkUtils.isFireOS(context) || !C2102v.m5104a()) {
                    return null;
                }
                C2102v.m5106c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", th);
                return null;
            }
        } else if (AppLovinSdkUtils.isFireOS(context) || !C2102v.m5104a()) {
            return null;
        } else {
            C2102v.m5110i("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }");
            return null;
        }
    }

    /* renamed from: e */
    private static C2022o.C2028a m4927e(Context context) {
        String str;
        if (f3980a) {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                C2022o.C2028a aVar = new C2022o.C2028a();
                aVar.f3941b = StringUtils.emptyIfNull(Settings.Secure.getString(contentResolver, TapjoyConstants.TJC_ADVERTISING_ID));
                aVar.f3940a = Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0;
                return aVar;
            } catch (Settings.SettingNotFoundException e) {
                th = e;
                if (C2102v.m5104a()) {
                    str = "Unable to determine if Fire OS limited ad tracking is turned on";
                    C2102v.m5106c("DataCollector", str, th);
                }
            } catch (Throwable th) {
                th = th;
                if (C2102v.m5104a()) {
                    str = "Unable to collect Fire OS IDFA";
                    C2102v.m5106c("DataCollector", str, th);
                }
            }
        }
        f3980a = false;
        return null;
    }
}
