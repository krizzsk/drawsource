package com.unity3d.services.core.configuration;

import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.request.metrics.C12113d;
import com.unity3d.services.core.request.metrics.C12120i;
import com.unity3d.services.core.request.metrics.C12122j;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class InitializeEventsMetricSender implements IInitializeEventsMetricSender, IInitializationListener {

    /* renamed from: a */
    private static InitializeEventsMetricSender f29233a;

    /* renamed from: b */
    private long f29234b = 0;

    /* renamed from: c */
    private long f29235c = 0;

    /* renamed from: d */
    private long f29236d = 0;

    /* renamed from: e */
    private long f29237e = 0;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f29238f = 0;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f29239g = 0;

    /* renamed from: h */
    private boolean f29240h = false;

    /* renamed from: i */
    private boolean f29241i = false;

    /* renamed from: com.unity3d.services.core.configuration.InitializeEventsMetricSender$a */
    class C11995a extends HashMap<String, String> {
        C11995a() {
            put("c_retry", String.valueOf(InitializeEventsMetricSender.this.f29238f));
            put("wv_retry", String.valueOf(InitializeEventsMetricSender.this.f29239g));
        }
    }

    private InitializeEventsMetricSender() {
        InitializationNotificationCenter.getInstance().addListener(this);
    }

    public static IInitializeEventsMetricSender getInstance() {
        if (f29233a == null) {
            f29233a = new InitializeEventsMetricSender();
        }
        return f29233a;
    }

    public void didConfigRequestStart() {
        this.f29237e = System.nanoTime();
    }

    public void didInitStart() {
        this.f29234b = System.nanoTime();
        this.f29238f = 0;
        this.f29239g = 0;
        sendMetric(C12122j.m33058b());
    }

    public void didPrivacyConfigRequestEnd(boolean z) {
        this.f29236d = System.nanoTime();
        m32633a(z);
    }

    public void didPrivacyConfigRequestStart() {
        this.f29235c = System.nanoTime();
    }

    public Long duration() {
        return Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.f29234b));
    }

    public Map<String, String> getErrorStateTags(ErrorState errorState) {
        Map<String, String> retryTags = getRetryTags();
        retryTags.put("stt", errorState.getMetricName());
        return retryTags;
    }

    public Map<String, String> getRetryTags() {
        return new C11995a();
    }

    public Long initializationStartTimeStamp() {
        return Long.valueOf(this.f29234b);
    }

    public void onRetryConfig() {
        this.f29238f++;
    }

    public void onRetryWebview() {
        this.f29239g++;
    }

    public void onSdkInitializationFailed(String str, ErrorState errorState, int i) {
        sdkInitializeFailed(str, errorState);
    }

    public void onSdkInitialized() {
        sdkDidInitialize();
    }

    public Long privacyConfigDuration() {
        return Long.valueOf(TimeUnit.NANOSECONDS.toMillis(this.f29236d - this.f29235c));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void sdkDidInitialize() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.Long r0 = r4.initializationStartTimeStamp()     // Catch:{ all -> 0x002e }
            long r0 = r0.longValue()     // Catch:{ all -> 0x002e }
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0016
            java.lang.String r0 = "sdkDidInitialize called before didInitStart, skipping metric"
            com.unity3d.services.core.log.C12065a.m32845b(r0)     // Catch:{ all -> 0x002e }
            monitor-exit(r4)
            return
        L_0x0016:
            boolean r0 = r4.f29240h     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x002c
            java.lang.Long r0 = r4.duration()     // Catch:{ all -> 0x002e }
            java.util.Map r1 = r4.getRetryTags()     // Catch:{ all -> 0x002e }
            com.unity3d.services.core.request.metrics.d r0 = com.unity3d.services.core.request.metrics.C12122j.m33060b(r0, r1)     // Catch:{ all -> 0x002e }
            r4.sendMetric(r0)     // Catch:{ all -> 0x002e }
            r0 = 1
            r4.f29240h = r0     // Catch:{ all -> 0x002e }
        L_0x002c:
            monitor-exit(r4)
            return
        L_0x002e:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.configuration.InitializeEventsMetricSender.sdkDidInitialize():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void sdkInitializeFailed(java.lang.String r5, com.unity3d.services.core.configuration.ErrorState r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            long r0 = r4.f29234b     // Catch:{ all -> 0x0028 }
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x0010
            java.lang.String r5 = "sdkInitializeFailed called before didInitStart, skipping metric"
            com.unity3d.services.core.log.C12065a.m32845b(r5)     // Catch:{ all -> 0x0028 }
            monitor-exit(r4)
            return
        L_0x0010:
            boolean r5 = r4.f29240h     // Catch:{ all -> 0x0028 }
            if (r5 != 0) goto L_0x0026
            java.lang.Long r5 = r4.duration()     // Catch:{ all -> 0x0028 }
            java.util.Map r6 = r4.getErrorStateTags(r6)     // Catch:{ all -> 0x0028 }
            com.unity3d.services.core.request.metrics.d r5 = com.unity3d.services.core.request.metrics.C12122j.m33056a(r5, r6)     // Catch:{ all -> 0x0028 }
            r4.sendMetric(r5)     // Catch:{ all -> 0x0028 }
            r5 = 1
            r4.f29240h = r5     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r4)
            return
        L_0x0028:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.configuration.InitializeEventsMetricSender.sdkInitializeFailed(java.lang.String, com.unity3d.services.core.configuration.ErrorState):void");
    }

    public synchronized void sdkTokenDidBecomeAvailableWithConfig(boolean z) {
        if (!this.f29241i) {
            m32635b(z);
            if (z) {
                m32632a();
            }
            this.f29241i = true;
        }
    }

    public void sendMetric(C12113d dVar) {
        C12120i.m33045a().sendMetric(dVar);
    }

    public Long tokenDuration() {
        return Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.f29237e));
    }

    /* renamed from: a */
    private void m32632a() {
        if (this.f29237e == 0) {
            C12065a.m32845b("sendTokenResolutionRequestMetricIfNeeded called before didInitStart, skipping metric");
        } else {
            sendMetric(C12122j.m33071e(tokenDuration(), getRetryTags()));
        }
    }

    /* renamed from: b */
    private void m32635b(boolean z) {
        C12113d dVar;
        if (this.f29234b == 0) {
            C12065a.m32845b("sendTokenAvailabilityMetricWithConfig called before didInitStart, skipping metric");
            return;
        }
        Long valueOf = Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.f29234b));
        Map<String, String> retryTags = getRetryTags();
        if (z) {
            dVar = C12122j.m33064c(valueOf, retryTags);
        } else {
            dVar = C12122j.m33068d(valueOf, retryTags);
        }
        sendMetric(dVar);
    }

    /* renamed from: a */
    private void m32633a(boolean z) {
        if (this.f29235c == 0 || this.f29236d == 0) {
            C12065a.m32845b("sendTokenResolutionRequestMetricIfNeeded called before didInitStart, skipping metric");
        } else if (z) {
            sendMetric(C12122j.m33067d(privacyConfigDuration()));
        } else {
            sendMetric(C12122j.m33063c(privacyConfigDuration()));
        }
    }
}
