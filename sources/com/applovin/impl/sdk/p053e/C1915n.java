package com.applovin.impl.sdk.p053e;

import android.app.Activity;
import androidx.exifinterface.media.ExifInterface;
import com.applovin.impl.sdk.C1883e;
import com.applovin.impl.sdk.C1954j;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.p053e.C1918o;
import com.applovin.impl.sdk.utils.C2088k;
import com.applovin.impl.sdk.utils.C2094p;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdk;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.e.n */
public class C1915n extends C1887a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1969m f3539a;

    public C1915n(C1969m mVar) {
        super("TaskInitializeSdk", mVar);
        this.f3539a = mVar;
    }

    /* renamed from: a */
    private void m4302a() {
        if (!this.f3539a.mo14512D().mo13816a()) {
            Activity an = this.f3539a.mo14564an();
            if (an != null) {
                this.f3539a.mo14512D().mo13811a(an);
            } else {
                this.f3539a.mo14526S().mo14430a((C1887a) new C1944z(this.f3539a, true, new Runnable() {
                    public void run() {
                        C1915n.this.f3539a.mo14512D().mo13811a(C1915n.this.f3539a.mo14556af().mo14045a());
                    }
                }), C1918o.C1920a.MAIN, TimeUnit.SECONDS.toMillis(1));
            }
        }
    }

    /* renamed from: b */
    private void m4303b() {
        String str;
        if (!this.f3539a.mo14575e()) {
            boolean d = this.f3539a.mo14519K().mo14292d();
            if (d) {
                str = this.f3539a.mo14529V().mo14832k().f3941b + " (use this for test devices)";
            } else {
                str = "<Enable verbose logging to see the GAID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
            }
            Map<String, Object> d2 = this.f3539a.mo14529V().mo14825d();
            Map<String, Object> c = this.f3539a.mo14529V().mo14824c();
            C2088k kVar = new C2088k();
            kVar.mo14935a().mo14941a("=====AppLovin SDK=====");
            kVar.mo14941a("===SDK Versions===").mo14942a("Version", AppLovinSdk.VERSION).mo14942a("Plugin Version", this.f3539a.mo14534a(C1867b.f3308dz)).mo14942a("Ad Review Version", C1883e.m4176a()).mo14942a("OM SDK Version", this.f3539a.mo14562al().mo14086c());
            kVar.mo14941a("===Device Info===").mo14942a("OS", Utils.getAndroidOSInfo()).mo14942a(IronSourceConstants.TYPE_GAID, str).mo14942a(ExifInterface.TAG_MODEL, d2.get(DeviceRequestsHelper.DEVICE_INFO_MODEL)).mo14942a("Locale", d2.get("locale")).mo14942a("Emulator", d2.get("sim")).mo14942a("Tablet", d2.get("is_tablet"));
            kVar.mo14941a("===App Info===").mo14942a("Application ID", c.get(CampaignEx.JSON_KEY_PACKAGE_NAME)).mo14942a("Target SDK", c.get("target_sdk")).mo14942a("ExoPlayer Version", Integer.valueOf(Utils.tryToGetExoPlayerVersionCode()));
            kVar.mo14941a("===SDK Settings===").mo14942a("SDK Key", this.f3539a.mo14597z()).mo14942a("Mediation Provider", this.f3539a.mo14590t()).mo14942a("TG", C2094p.m5069a(this.f3539a)).mo14942a("Test Mode On", Boolean.valueOf(this.f3539a.mo14518J().mo13806a())).mo14942a("Verbose Logging On", Boolean.valueOf(d));
            kVar.mo14941a("===Privacy States===\nPlease review AppLovin MAX documentation to be compliant with regional privacy policies.").mo14941a(C1954j.m4419a(mo14372f()));
            kVar.mo14935a();
            C2102v.m5107f("AppLovinSdk", kVar.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x014e, code lost:
        if (r12.f3539a.mo14574d() != false) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01ad, code lost:
        if (r12.f3539a.mo14574d() != false) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01b0, code lost:
        r2 = "failed";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01b1, code lost:
        r8.append(r2);
        r8.append(" in ");
        r8.append(java.lang.System.currentTimeMillis() - r6);
        r8.append("ms");
        mo14365a(r8.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r12 = this;
            java.lang.String r0 = "ms"
            java.lang.String r1 = " in "
            java.lang.String r2 = "succeeded"
            java.lang.String r3 = "failed"
            java.lang.String r4 = " initialization "
            java.lang.String r5 = "AppLovin SDK "
            long r6 = java.lang.System.currentTimeMillis()
            boolean r8 = com.applovin.impl.sdk.C2102v.m5104a()
            if (r8 == 0) goto L_0x0031
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Initializing AppLovin SDK v"
            r8.append(r9)
            java.lang.String r9 = com.applovin.sdk.AppLovinSdk.VERSION
            r8.append(r9)
            java.lang.String r9 = "..."
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r12.mo14365a(r8)
        L_0x0031:
            com.applovin.impl.sdk.m r8 = r12.f3539a     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.d.g r8 = r8.mo14527T()     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.d.f r9 = com.applovin.impl.sdk.p052d.C1881f.f3466b     // Catch:{ all -> 0x0151 }
            r8.mo14357c(r9)     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.m r8 = r12.f3539a     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.q r8 = r8.mo14552ab()     // Catch:{ all -> 0x0151 }
            android.content.Context r9 = r12.mo14372f()     // Catch:{ all -> 0x0151 }
            r8.mo14852a((android.content.Context) r9)     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.m r8 = r12.f3539a     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.q r8 = r8.mo14552ab()     // Catch:{ all -> 0x0151 }
            android.content.Context r9 = r12.mo14372f()     // Catch:{ all -> 0x0151 }
            r8.mo14855b((android.content.Context) r9)     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.m r8 = r12.f3539a     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.e.o r8 = r8.mo14526S()     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.e.b r9 = new com.applovin.impl.sdk.e.b     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.m r10 = r12.f3539a     // Catch:{ all -> 0x0151 }
            r9.<init>(r10)     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.e.o$a r10 = com.applovin.impl.sdk.p053e.C1918o.C1920a.MAIN     // Catch:{ all -> 0x0151 }
            r8.mo14429a((com.applovin.impl.sdk.p053e.C1887a) r9, (com.applovin.impl.sdk.p053e.C1918o.C1920a) r10)     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.m r8 = r12.f3539a     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.o r8 = r8.mo14529V()     // Catch:{ all -> 0x0151 }
            r8.mo14826e()     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.m r8 = r12.f3539a     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.utils.n r8 = r8.mo14558ah()     // Catch:{ all -> 0x0151 }
            r8.mo14968a()     // Catch:{ all -> 0x0151 }
            android.content.Context r8 = r12.mo14372f()     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.m r9 = r12.f3539a     // Catch:{ all -> 0x0151 }
            boolean r8 = com.applovin.impl.sdk.utils.Utils.isPubInDebugMode(r8, r9)     // Catch:{ all -> 0x0151 }
            if (r8 == 0) goto L_0x008b
            com.applovin.impl.sdk.m r8 = r12.f3539a     // Catch:{ all -> 0x0151 }
            r8.mo14578h()     // Catch:{ all -> 0x0151 }
        L_0x008b:
            r12.m4303b()     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.m r8 = r12.f3539a     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r9 = com.applovin.impl.sdk.p051c.C1867b.f3276dT     // Catch:{ all -> 0x0151 }
            java.lang.Object r8 = r8.mo14534a(r9)     // Catch:{ all -> 0x0151 }
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0151 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0151 }
            if (r8 == 0) goto L_0x00a6
            com.applovin.impl.sdk.e.n$1 r8 = new com.applovin.impl.sdk.e.n$1     // Catch:{ all -> 0x0151 }
            r8.<init>()     // Catch:{ all -> 0x0151 }
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(r8)     // Catch:{ all -> 0x0151 }
        L_0x00a6:
            r12.m4302a()     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.m r8 = r12.f3539a     // Catch:{ all -> 0x0151 }
            r9 = 1
            r8.mo14548a((boolean) r9)     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.m r8 = r12.f3539a     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.network.f r8 = r8.mo14528U()     // Catch:{ all -> 0x0151 }
            r8.mo14768c()     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.m r8 = r12.f3539a     // Catch:{ all -> 0x0151 }
            com.applovin.sdk.AppLovinEventService r8 = r8.mo14594w()     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.EventServiceImpl r8 = (com.applovin.impl.sdk.EventServiceImpl) r8     // Catch:{ all -> 0x0151 }
            r8.maybeTrackAppOpenEvent()     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.m r8 = r12.f3539a     // Catch:{ all -> 0x0151 }
            com.applovin.impl.mediation.debugger.a r8 = r8.mo14515G()     // Catch:{ all -> 0x0151 }
            boolean r8 = r8.mo13611b()     // Catch:{ all -> 0x0151 }
            if (r8 == 0) goto L_0x00d7
            com.applovin.impl.sdk.m r8 = r12.f3539a     // Catch:{ all -> 0x0151 }
            boolean r8 = r8.mo14575e()     // Catch:{ all -> 0x0151 }
            if (r8 == 0) goto L_0x00fd
        L_0x00d7:
            com.applovin.impl.sdk.m r8 = r12.f3539a     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r9 = com.applovin.impl.sdk.p051c.C1866a.f3076h     // Catch:{ all -> 0x0151 }
            java.lang.Object r8 = r8.mo14534a(r9)     // Catch:{ all -> 0x0151 }
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0151 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0151 }
            if (r8 == 0) goto L_0x0106
            com.applovin.impl.sdk.m r8 = r12.f3539a     // Catch:{ all -> 0x0151 }
            android.content.Context r8 = r8.mo14520L()     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.m r9 = r12.f3539a     // Catch:{ all -> 0x0151 }
            boolean r8 = com.applovin.impl.sdk.utils.Utils.isPubInDebugMode(r8, r9)     // Catch:{ all -> 0x0151 }
            if (r8 == 0) goto L_0x0106
            com.applovin.impl.sdk.m r8 = r12.f3539a     // Catch:{ all -> 0x0151 }
            boolean r8 = r8.mo14576f()     // Catch:{ all -> 0x0151 }
            if (r8 == 0) goto L_0x0106
        L_0x00fd:
            com.applovin.impl.sdk.m r8 = r12.f3539a     // Catch:{ all -> 0x0151 }
            com.applovin.impl.mediation.debugger.a r8 = r8.mo14515G()     // Catch:{ all -> 0x0151 }
            r8.mo13607a()     // Catch:{ all -> 0x0151 }
        L_0x0106:
            com.applovin.impl.sdk.m r8 = r12.f3539a
            com.applovin.impl.sdk.a.f r8 = r8.mo14562al()
            r8.mo14084a()
            com.applovin.impl.sdk.m r8 = r12.f3539a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r9 = com.applovin.impl.sdk.p051c.C1867b.f3151az
            java.lang.Object r8 = r8.mo14534a(r9)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0132
            com.applovin.impl.sdk.m r8 = r12.f3539a
            com.applovin.impl.sdk.c.b<java.lang.Long> r9 = com.applovin.impl.sdk.p051c.C1867b.f3100aA
            java.lang.Object r8 = r8.mo14534a(r9)
            java.lang.Long r8 = (java.lang.Long) r8
            long r8 = r8.longValue()
            com.applovin.impl.sdk.m r10 = r12.f3539a
            r10.mo14538a((long) r8)
        L_0x0132:
            boolean r8 = com.applovin.impl.sdk.C2102v.m5104a()
            if (r8 == 0) goto L_0x01c9
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            java.lang.String r5 = com.applovin.sdk.AppLovinSdk.VERSION
            r8.append(r5)
            r8.append(r4)
            com.applovin.impl.sdk.m r4 = r12.f3539a
            boolean r4 = r4.mo14574d()
            if (r4 == 0) goto L_0x01b0
            goto L_0x01b1
        L_0x0151:
            r8 = move-exception
            boolean r9 = com.applovin.impl.sdk.C2102v.m5104a()     // Catch:{ all -> 0x01ca }
            if (r9 == 0) goto L_0x015f
            java.lang.String r9 = "AppLovinSdk"
            java.lang.String r10 = "Failed to initialize SDK!"
            com.applovin.impl.sdk.C2102v.m5106c(r9, r10, r8)     // Catch:{ all -> 0x01ca }
        L_0x015f:
            com.applovin.impl.sdk.m r8 = r12.f3539a     // Catch:{ all -> 0x01ca }
            r9 = 0
            r8.mo14548a((boolean) r9)     // Catch:{ all -> 0x01ca }
            com.applovin.impl.sdk.m r8 = r12.f3539a
            com.applovin.impl.sdk.a.f r8 = r8.mo14562al()
            r8.mo14084a()
            com.applovin.impl.sdk.m r8 = r12.f3539a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r9 = com.applovin.impl.sdk.p051c.C1867b.f3151az
            java.lang.Object r8 = r8.mo14534a(r9)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0191
            com.applovin.impl.sdk.m r8 = r12.f3539a
            com.applovin.impl.sdk.c.b<java.lang.Long> r9 = com.applovin.impl.sdk.p051c.C1867b.f3100aA
            java.lang.Object r8 = r8.mo14534a(r9)
            java.lang.Long r8 = (java.lang.Long) r8
            long r8 = r8.longValue()
            com.applovin.impl.sdk.m r10 = r12.f3539a
            r10.mo14538a((long) r8)
        L_0x0191:
            boolean r8 = com.applovin.impl.sdk.C2102v.m5104a()
            if (r8 == 0) goto L_0x01c9
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            java.lang.String r5 = com.applovin.sdk.AppLovinSdk.VERSION
            r8.append(r5)
            r8.append(r4)
            com.applovin.impl.sdk.m r4 = r12.f3539a
            boolean r4 = r4.mo14574d()
            if (r4 == 0) goto L_0x01b0
            goto L_0x01b1
        L_0x01b0:
            r2 = r3
        L_0x01b1:
            r8.append(r2)
            r8.append(r1)
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r6
            r8.append(r1)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            r12.mo14365a(r0)
        L_0x01c9:
            return
        L_0x01ca:
            r8 = move-exception
            com.applovin.impl.sdk.m r9 = r12.f3539a
            com.applovin.impl.sdk.a.f r9 = r9.mo14562al()
            r9.mo14084a()
            com.applovin.impl.sdk.m r9 = r12.f3539a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r10 = com.applovin.impl.sdk.p051c.C1867b.f3151az
            java.lang.Object r9 = r9.mo14534a(r10)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x01f7
            com.applovin.impl.sdk.m r9 = r12.f3539a
            com.applovin.impl.sdk.c.b<java.lang.Long> r10 = com.applovin.impl.sdk.p051c.C1867b.f3100aA
            java.lang.Object r9 = r9.mo14534a(r10)
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            com.applovin.impl.sdk.m r11 = r12.f3539a
            r11.mo14538a((long) r9)
        L_0x01f7:
            boolean r9 = com.applovin.impl.sdk.C2102v.m5104a()
            if (r9 == 0) goto L_0x022f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            java.lang.String r5 = com.applovin.sdk.AppLovinSdk.VERSION
            r9.append(r5)
            r9.append(r4)
            com.applovin.impl.sdk.m r4 = r12.f3539a
            boolean r4 = r4.mo14574d()
            if (r4 == 0) goto L_0x0216
            goto L_0x0217
        L_0x0216:
            r2 = r3
        L_0x0217:
            r9.append(r2)
            r9.append(r1)
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r6
            r9.append(r1)
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            r12.mo14365a(r0)
        L_0x022f:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.p053e.C1915n.run():void");
    }
}
