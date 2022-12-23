package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.ironsource.environment.C6397j;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.p204e.C6387c;
import com.ironsource.mediationsdk.C6459L;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.SegmentListener;
import com.ironsource.mediationsdk.utils.C6743i;
import com.ironsource.mediationsdk.utils.C6748l;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.sdk.controller.C8196u;
import com.ironsource.sdk.p278a.C8105e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ironsource.mediationsdk.Q */
final class C6473Q implements C6397j {

    /* renamed from: u */
    private static C6473Q f16509u;

    /* renamed from: A */
    private NetworkStateReceiver f16510A;

    /* renamed from: B */
    private C6478a f16511B = C6478a.NOT_INIT;

    /* renamed from: C */
    private C6480c f16512C = new C6480c() {
        /* JADX WARNING: Removed duplicated region for block: B:101:0x02f4 A[Catch:{ Exception -> 0x03a3 }] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x003f A[Catch:{ Exception -> 0x03a3 }] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0054 A[Catch:{ Exception -> 0x03a3 }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005b A[Catch:{ Exception -> 0x03a3 }] */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00bf A[Catch:{ Exception -> 0x03a3 }] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00d4 A[Catch:{ Exception -> 0x03a3 }] */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0115 A[Catch:{ Exception -> 0x03a3 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r11 = this;
                com.ironsource.mediationsdk.L r0 = com.ironsource.mediationsdk.C6459L.m19304a()     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.al r1 = com.ironsource.mediationsdk.C6608al.m20084a()     // Catch:{ Exception -> 0x03a3 }
                java.lang.Thread r2 = new java.lang.Thread     // Catch:{ Exception -> 0x0016 }
                com.ironsource.mediationsdk.al$1 r3 = new com.ironsource.mediationsdk.al$1     // Catch:{ Exception -> 0x0016 }
                r3.<init>()     // Catch:{ Exception -> 0x0016 }
                r2.<init>(r3)     // Catch:{ Exception -> 0x0016 }
                r2.start()     // Catch:{ Exception -> 0x0016 }
                goto L_0x001a
            L_0x0016:
                r1 = move-exception
                r1.printStackTrace()     // Catch:{ Exception -> 0x03a3 }
            L_0x001a:
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                java.lang.String r1 = r1.f16524l     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.d.b r2 = new com.ironsource.d.b     // Catch:{ Exception -> 0x03a3 }
                r2.<init>()     // Catch:{ Exception -> 0x03a3 }
                r3 = 0
                r4 = 0
                java.lang.String r5 = "userId"
                r6 = 1
                if (r1 == 0) goto L_0x0047
                if (r1 == 0) goto L_0x003c
                int r7 = r1.length()     // Catch:{ Exception -> 0x03a3 }
                if (r7 <= 0) goto L_0x003c
                int r7 = r1.length()     // Catch:{ Exception -> 0x03a3 }
                r8 = 64
                if (r7 > r8) goto L_0x003c
                r7 = r6
                goto L_0x003d
            L_0x003c:
                r7 = r4
            L_0x003d:
                if (r7 != 0) goto L_0x004e
                com.ironsource.mediationsdk.logger.IronSourceError r1 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInvalidCredentialsError(r5, r1, r3)     // Catch:{ Exception -> 0x03a3 }
            L_0x0043:
                r2.mo35851a((com.ironsource.mediationsdk.logger.IronSourceError) r1)     // Catch:{ Exception -> 0x03a3 }
                goto L_0x004e
            L_0x0047:
                java.lang.String r7 = "it's missing"
                com.ironsource.mediationsdk.logger.IronSourceError r1 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInvalidCredentialsError(r5, r1, r7)     // Catch:{ Exception -> 0x03a3 }
                goto L_0x0043
            L_0x004e:
                boolean r1 = r2.mo35852a()     // Catch:{ Exception -> 0x03a3 }
                if (r1 == 0) goto L_0x005b
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                java.lang.String r2 = "userGenerated"
                r1.f16527o = r2     // Catch:{ Exception -> 0x03a3 }
                goto L_0x00a8
            L_0x005b:
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x03a3 }
                android.content.Context r2 = r2.getApplicationContext()     // Catch:{ Exception -> 0x03a3 }
                java.lang.String r2 = com.ironsource.mediationsdk.C6459L.m19307a((android.content.Context) r2)     // Catch:{ Exception -> 0x03a3 }
                r1.f16524l = r2     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                java.lang.String r1 = r1.f16524l     // Catch:{ Exception -> 0x03a3 }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x03a3 }
                if (r1 != 0) goto L_0x007c
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                java.lang.String r2 = "GAID"
            L_0x0079:
                r1.f16527o = r2     // Catch:{ Exception -> 0x03a3 }
                goto L_0x00a1
            L_0x007c:
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x03a3 }
                android.content.Context r2 = r2.getApplicationContext()     // Catch:{ Exception -> 0x03a3 }
                java.lang.String r2 = com.ironsource.environment.C6393h.m19143x(r2)     // Catch:{ Exception -> 0x03a3 }
                r1.f16524l = r2     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                java.lang.String r1 = r1.f16524l     // Catch:{ Exception -> 0x03a3 }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x03a3 }
                if (r1 != 0) goto L_0x009b
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                java.lang.String r2 = "UUID"
                goto L_0x0079
            L_0x009b:
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                java.lang.String r2 = ""
                r1.f16524l = r2     // Catch:{ Exception -> 0x03a3 }
            L_0x00a1:
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                java.lang.String r1 = r1.f16524l     // Catch:{ Exception -> 0x03a3 }
                r0.mo36128a((java.lang.String) r1, (boolean) r4)     // Catch:{ Exception -> 0x03a3 }
            L_0x00a8:
                com.ironsource.mediationsdk.sdk.e r1 = com.ironsource.mediationsdk.sdk.C6697e.m20344a()     // Catch:{ Exception -> 0x03a3 }
                java.lang.String r2 = "userIdType"
                com.ironsource.mediationsdk.Q r4 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                java.lang.String r4 = r4.f16527o     // Catch:{ Exception -> 0x03a3 }
                r1.mo36913a(r2, r4)     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                java.lang.String r1 = r1.f16524l     // Catch:{ Exception -> 0x03a3 }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x03a3 }
                if (r1 != 0) goto L_0x00ca
                com.ironsource.mediationsdk.sdk.e r1 = com.ironsource.mediationsdk.sdk.C6697e.m20344a()     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.Q r2 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                java.lang.String r2 = r2.f16524l     // Catch:{ Exception -> 0x03a3 }
                r1.mo36913a(r5, r2)     // Catch:{ Exception -> 0x03a3 }
            L_0x00ca:
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                java.lang.String r1 = r1.f16525m     // Catch:{ Exception -> 0x03a3 }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x03a3 }
                if (r1 != 0) goto L_0x00e1
                com.ironsource.mediationsdk.sdk.e r1 = com.ironsource.mediationsdk.sdk.C6697e.m20344a()     // Catch:{ Exception -> 0x03a3 }
                java.lang.String r2 = "appKey"
                com.ironsource.mediationsdk.Q r4 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                java.lang.String r4 = r4.f16525m     // Catch:{ Exception -> 0x03a3 }
                r1.mo36913a(r2, r4)     // Catch:{ Exception -> 0x03a3 }
            L_0x00e1:
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.sdk.a.e r1 = r1.f16531s     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.Q r2 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                java.lang.String r2 = r2.f16524l     // Catch:{ Exception -> 0x03a3 }
                r1.mo56306e(r2)     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                java.util.Date r2 = new java.util.Date     // Catch:{ Exception -> 0x03a3 }
                r2.<init>()     // Catch:{ Exception -> 0x03a3 }
                long r4 = r2.getTime()     // Catch:{ Exception -> 0x03a3 }
                r1.f16530r = r4     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x03a3 }
                android.content.Context r2 = r2.getApplicationContext()     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.Q r4 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                java.lang.String r4 = r4.f16524l     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.L$a r5 = r11.f16554c     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.utils.l r2 = r0.mo36117a((android.content.Context) r2, (java.lang.String) r4, (com.ironsource.mediationsdk.C6459L.C6461a) r5)     // Catch:{ Exception -> 0x03a3 }
                r1.f16526n = r2     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.utils.l r1 = r1.f16526n     // Catch:{ Exception -> 0x03a3 }
                if (r1 == 0) goto L_0x02f4
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                android.os.Handler r1 = r1.f16521i     // Catch:{ Exception -> 0x03a3 }
                r1.removeCallbacks(r11)     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.utils.l r1 = r1.f16526n     // Catch:{ Exception -> 0x03a3 }
                boolean r1 = r1.mo36981b()     // Catch:{ Exception -> 0x03a3 }
                if (r1 == 0) goto L_0x02c9
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.Q$a r2 = com.ironsource.mediationsdk.C6473Q.C6478a.INITIATED     // Catch:{ Exception -> 0x03a3 }
                r1.mo36216a((com.ironsource.mediationsdk.C6473Q.C6478a) r2)     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.Q r2 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.utils.l r2 = r2.f16526n     // Catch:{ Exception -> 0x03a3 }
                r1.mo36218a((com.ironsource.mediationsdk.utils.C6748l) r2)     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                boolean r2 = r0.mo36160o()     // Catch:{ Exception -> 0x03a3 }
                r1.mo36220b(r2)     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.environment.g r1 = com.ironsource.environment.C6392g.f16178a     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.utils.l r1 = r1.f16526n     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.model.h r1 = r1.f17750c     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.sdk.controller.u r1 = r1.f17356e     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.utils.b r1 = r1.mo56490f()     // Catch:{ Exception -> 0x03a3 }
                boolean r1 = r1.f17566c     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.environment.C6392g.m19082a(r1)     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.environment.g r1 = com.ironsource.environment.C6392g.f16178a     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.utils.l r1 = r1.f16526n     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.model.h r1 = r1.f17750c     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.sdk.controller.u r1 = r1.f17356e     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.utils.b r1 = r1.mo56490f()     // Catch:{ Exception -> 0x03a3 }
                boolean r1 = r1.f17567d     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.environment.C6392g.m19086c(r1)     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x03a3 }
                android.content.Context r2 = r2.getApplicationContext()     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.Q r4 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.utils.l r4 = r4.f16526n     // Catch:{ Exception -> 0x03a3 }
                r1.mo36214a(r2, r4)     // Catch:{ Exception -> 0x03a3 }
                java.util.Date r1 = new java.util.Date     // Catch:{ Exception -> 0x03a3 }
                r1.<init>()     // Catch:{ Exception -> 0x03a3 }
                long r1 = r1.getTime()     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.Q r4 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                long r4 = r4.f16530r     // Catch:{ Exception -> 0x03a3 }
                long r1 = r1 - r4
                boolean r4 = r0.mo36160o()     // Catch:{ Exception -> 0x03a3 }
                org.json.JSONObject r4 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r4)     // Catch:{ Exception -> 0x03a3 }
                java.lang.String r5 = "duration"
                r4.put(r5, r1)     // Catch:{ Exception -> 0x0199 }
                java.lang.String r1 = "sessionDepth"
                int r0 = r0.f16430t     // Catch:{ Exception -> 0x0199 }
                r4.put(r1, r0)     // Catch:{ Exception -> 0x0199 }
                goto L_0x019d
            L_0x0199:
                r0 = move-exception
                r0.printStackTrace()     // Catch:{ Exception -> 0x03a3 }
            L_0x019d:
                com.ironsource.mediationsdk.a.c r0 = new com.ironsource.mediationsdk.a.c     // Catch:{ Exception -> 0x03a3 }
                r1 = 514(0x202, float:7.2E-43)
                r0.<init>(r1, r4)     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.a.h r1 = com.ironsource.mediationsdk.p206a.C6522h.m19751d()     // Catch:{ Exception -> 0x03a3 }
                r1.mo36349b((com.ironsource.mediationsdk.p206a.C6517c) r0)     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.aj r1 = new com.ironsource.mediationsdk.aj     // Catch:{ Exception -> 0x03a3 }
                r1.<init>()     // Catch:{ Exception -> 0x03a3 }
                r0.f16513a = r1     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.aj r0 = r0.f16513a     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.aj$a r1 = new com.ironsource.mediationsdk.aj$a     // Catch:{ Exception -> 0x03a3 }
                r1.<init>()     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.lifecycle.a r2 = new com.ironsource.lifecycle.a     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.lifecycle.g r1 = (com.ironsource.lifecycle.C6418g) r1     // Catch:{ Exception -> 0x03a3 }
                r2.<init>(r1)     // Catch:{ Exception -> 0x03a3 }
                r0.f17111a = r2     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.utils.l r0 = r0.f16526n     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.model.h r0 = r0.f17750c     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.sdk.controller.u r0 = r0.f17356e     // Catch:{ Exception -> 0x03a3 }
                boolean r0 = r0.mo56488d()     // Catch:{ Exception -> 0x03a3 }
                if (r0 == 0) goto L_0x01e9
                com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x03a3 }
                android.app.Activity r0 = r0.getCurrentActiveActivity()     // Catch:{ Exception -> 0x03a3 }
                if (r0 == 0) goto L_0x01e9
                com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x03a3 }
                android.app.Activity r0 = r0.getCurrentActiveActivity()     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.integration.IntegrationHelper.validateIntegration(r0)     // Catch:{ Exception -> 0x03a3 }
            L_0x01e9:
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.utils.l r0 = r0.f16526n     // Catch:{ Exception -> 0x03a3 }
                org.json.JSONObject r1 = r0.f17751d     // Catch:{ Exception -> 0x03a3 }
                if (r1 == 0) goto L_0x0243
                com.ironsource.mediationsdk.model.h r1 = r0.f17750c     // Catch:{ Exception -> 0x03a3 }
                if (r1 != 0) goto L_0x01f6
                goto L_0x0243
            L_0x01f6:
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x03a3 }
                r3.<init>()     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.model.h r1 = r0.f17750c     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.model.p r1 = r1.f17352a     // Catch:{ Exception -> 0x03a3 }
                if (r1 == 0) goto L_0x0214
                com.ironsource.mediationsdk.model.n r1 = r0.f17671a     // Catch:{ Exception -> 0x03a3 }
                if (r1 == 0) goto L_0x0214
                com.ironsource.mediationsdk.model.n r1 = r0.f17671a     // Catch:{ Exception -> 0x03a3 }
                java.util.ArrayList<java.lang.String> r1 = r1.f17390a     // Catch:{ Exception -> 0x03a3 }
                int r1 = r1.size()     // Catch:{ Exception -> 0x03a3 }
                if (r1 <= 0) goto L_0x0214
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ Exception -> 0x03a3 }
                r3.add(r1)     // Catch:{ Exception -> 0x03a3 }
            L_0x0214:
                com.ironsource.mediationsdk.model.h r1 = r0.f17750c     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.model.i r1 = r1.f17353b     // Catch:{ Exception -> 0x03a3 }
                if (r1 == 0) goto L_0x022d
                com.ironsource.mediationsdk.model.n r1 = r0.f17671a     // Catch:{ Exception -> 0x03a3 }
                if (r1 == 0) goto L_0x022d
                com.ironsource.mediationsdk.model.n r1 = r0.f17671a     // Catch:{ Exception -> 0x03a3 }
                java.util.ArrayList<java.lang.String> r1 = r1.f17393d     // Catch:{ Exception -> 0x03a3 }
                int r1 = r1.size()     // Catch:{ Exception -> 0x03a3 }
                if (r1 <= 0) goto L_0x022d
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ Exception -> 0x03a3 }
                r3.add(r1)     // Catch:{ Exception -> 0x03a3 }
            L_0x022d:
                com.ironsource.mediationsdk.model.h r1 = r0.f17750c     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.model.j r1 = r1.f17354c     // Catch:{ Exception -> 0x03a3 }
                if (r1 == 0) goto L_0x0238
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.OFFERWALL     // Catch:{ Exception -> 0x03a3 }
                r3.add(r1)     // Catch:{ Exception -> 0x03a3 }
            L_0x0238:
                com.ironsource.mediationsdk.model.h r0 = r0.f17750c     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.model.f r0 = r0.f17355d     // Catch:{ Exception -> 0x03a3 }
                if (r0 == 0) goto L_0x0243
                com.ironsource.mediationsdk.IronSource$AD_UNIT r0 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ Exception -> 0x03a3 }
                r3.add(r0)     // Catch:{ Exception -> 0x03a3 }
            L_0x0243:
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                java.util.List<com.ironsource.mediationsdk.utils.i> r0 = r0.f16523k     // Catch:{ Exception -> 0x03a3 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x03a3 }
            L_0x024b:
                boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x03a3 }
                if (r1 == 0) goto L_0x0265
                java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.utils.i r1 = (com.ironsource.mediationsdk.utils.C6743i) r1     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.Q r2 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                boolean r2 = r2.f16519g     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.Q r4 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.utils.l r4 = r4.f16526n     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.model.h r4 = r4.f17750c     // Catch:{ Exception -> 0x03a3 }
                r1.mo36030a(r3, r2, r4)     // Catch:{ Exception -> 0x03a3 }
                goto L_0x024b
            L_0x0265:
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.sdk.SegmentListener r0 = r0.f16528p     // Catch:{ Exception -> 0x03a3 }
                if (r0 == 0) goto L_0x028a
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.utils.l r0 = r0.f16526n     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.model.h r0 = r0.f17750c     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.sdk.controller.u r0 = r0.f17356e     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.model.q r0 = r0.mo56486b()     // Catch:{ Exception -> 0x03a3 }
                if (r0 == 0) goto L_0x028a
                java.lang.String r1 = r0.f17411a     // Catch:{ Exception -> 0x03a3 }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x03a3 }
                if (r1 != 0) goto L_0x028a
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.sdk.SegmentListener r1 = r1.f16528p     // Catch:{ Exception -> 0x03a3 }
                java.lang.String r0 = r0.f17411a     // Catch:{ Exception -> 0x03a3 }
                r1.onSegmentReceived(r0)     // Catch:{ Exception -> 0x03a3 }
            L_0x028a:
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.utils.l r0 = r0.f16526n     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.model.h r0 = r0.f17750c     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.sdk.controller.u r0 = r0.f17356e     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.sdk.g.d r0 = r0.mo56489e()     // Catch:{ Exception -> 0x03a3 }
                boolean r1 = r0.mo56731b()     // Catch:{ Exception -> 0x03a3 }
                if (r1 == 0) goto L_0x03a7
                java.lang.String r8 = com.ironsource.mediationsdk.utils.IronSourceUtils.getSessionId()     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.environment.e r2 = com.ironsource.environment.C6380e.m19051a()     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.environment.ContextProvider r1 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x03a3 }
                android.content.Context r3 = r1.getApplicationContext()     // Catch:{ Exception -> 0x03a3 }
                java.util.HashSet r4 = r0.mo56725a()     // Catch:{ Exception -> 0x03a3 }
                java.lang.String r5 = r0.mo56732c()     // Catch:{ Exception -> 0x03a3 }
                java.lang.String r6 = r0.mo56735d()     // Catch:{ Exception -> 0x03a3 }
                boolean r7 = r0.mo56736e()     // Catch:{ Exception -> 0x03a3 }
                int r9 = r0.mo56737f()     // Catch:{ Exception -> 0x03a3 }
                boolean r10 = r0.mo56738g()     // Catch:{ Exception -> 0x03a3 }
                r2.mo35888a(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x03a3 }
                goto L_0x03a7
            L_0x02c9:
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                boolean r0 = r0.f16520h     // Catch:{ Exception -> 0x03a3 }
                if (r0 != 0) goto L_0x03a2
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.Q$a r1 = com.ironsource.mediationsdk.C6473Q.C6478a.INIT_FAILED     // Catch:{ Exception -> 0x03a3 }
                r0.mo36216a((com.ironsource.mediationsdk.C6473Q.C6478a) r1)     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                r0.f16520h = r6     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                java.util.List<com.ironsource.mediationsdk.utils.i> r0 = r0.f16523k     // Catch:{ Exception -> 0x03a3 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x03a3 }
            L_0x02e2:
                boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x03a3 }
                if (r1 == 0) goto L_0x03a7
                java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.utils.i r1 = (com.ironsource.mediationsdk.utils.C6743i) r1     // Catch:{ Exception -> 0x03a3 }
                java.lang.String r2 = "serverResponseIsNotValid"
                r1.mo36028a(r2)     // Catch:{ Exception -> 0x03a3 }
                goto L_0x02e2
            L_0x02f4:
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                int r0 = r0.f16515c     // Catch:{ Exception -> 0x03a3 }
                r1 = 3
                if (r0 != r1) goto L_0x0317
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                r0.f16529q = r6     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                java.util.List<com.ironsource.mediationsdk.utils.i> r0 = r0.f16523k     // Catch:{ Exception -> 0x03a3 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x03a3 }
            L_0x0307:
                boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x03a3 }
                if (r1 == 0) goto L_0x0317
                java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.utils.i r1 = (com.ironsource.mediationsdk.utils.C6743i) r1     // Catch:{ Exception -> 0x03a3 }
                r1.mo36039f()     // Catch:{ Exception -> 0x03a3 }
                goto L_0x0307
            L_0x0317:
                boolean r0 = r11.f16552a     // Catch:{ Exception -> 0x03a3 }
                if (r0 == 0) goto L_0x034b
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                int r0 = r0.f16515c     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                int r1 = r1.f16516d     // Catch:{ Exception -> 0x03a3 }
                if (r0 >= r1) goto L_0x034b
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                r0.f16519g = r6     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                android.os.Handler r0 = r0.f16521i     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                int r1 = r1.f16514b     // Catch:{ Exception -> 0x03a3 }
                int r1 = r1 * 1000
                long r1 = (long) r1     // Catch:{ Exception -> 0x03a3 }
                r0.postDelayed(r11, r1)     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                int r0 = r0.f16515c     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                int r1 = r1.f16517e     // Catch:{ Exception -> 0x03a3 }
                if (r0 >= r1) goto L_0x034b
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                int r1 = r1.f16514b     // Catch:{ Exception -> 0x03a3 }
                int r1 = r1 * 2
                r0.f16514b = r1     // Catch:{ Exception -> 0x03a3 }
            L_0x034b:
                boolean r0 = r11.f16552a     // Catch:{ Exception -> 0x03a3 }
                if (r0 == 0) goto L_0x0359
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                int r0 = r0.f16515c     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.Q r1 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                int r1 = r1.f16518f     // Catch:{ Exception -> 0x03a3 }
                if (r0 != r1) goto L_0x039b
            L_0x0359:
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                boolean r0 = r0.f16520h     // Catch:{ Exception -> 0x03a3 }
                if (r0 != 0) goto L_0x039b
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                r0.f16520h = r6     // Catch:{ Exception -> 0x03a3 }
                java.lang.String r0 = r11.f16553b     // Catch:{ Exception -> 0x03a3 }
                boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x03a3 }
                if (r0 == 0) goto L_0x036f
                java.lang.String r0 = "noServerResponse"
                r11.f16553b = r0     // Catch:{ Exception -> 0x03a3 }
            L_0x036f:
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                java.util.List<com.ironsource.mediationsdk.utils.i> r0 = r0.f16523k     // Catch:{ Exception -> 0x03a3 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x03a3 }
            L_0x0377:
                boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x03a3 }
                if (r1 == 0) goto L_0x0389
                java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.utils.i r1 = (com.ironsource.mediationsdk.utils.C6743i) r1     // Catch:{ Exception -> 0x03a3 }
                java.lang.String r2 = r11.f16553b     // Catch:{ Exception -> 0x03a3 }
                r1.mo36028a(r2)     // Catch:{ Exception -> 0x03a3 }
                goto L_0x0377
            L_0x0389:
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.Q$a r1 = com.ironsource.mediationsdk.C6473Q.C6478a.INIT_FAILED     // Catch:{ Exception -> 0x03a3 }
                r0.mo36216a((com.ironsource.mediationsdk.C6473Q.C6478a) r1)     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ Exception -> 0x03a3 }
                com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ Exception -> 0x03a3 }
                java.lang.String r2 = "Mediation availability false reason: No server response"
                r0.log(r1, r2, r6)     // Catch:{ Exception -> 0x03a3 }
            L_0x039b:
                com.ironsource.mediationsdk.Q r0 = com.ironsource.mediationsdk.C6473Q.this     // Catch:{ Exception -> 0x03a3 }
                int r1 = r0.f16515c     // Catch:{ Exception -> 0x03a3 }
                int r1 = r1 + r6
                r0.f16515c = r1     // Catch:{ Exception -> 0x03a3 }
            L_0x03a2:
                return
            L_0x03a3:
                r0 = move-exception
                r0.printStackTrace()
            L_0x03a7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6473Q.C64741.run():void");
        }
    };

    /* renamed from: a */
    C6605aj f16513a;

    /* renamed from: b */
    int f16514b;

    /* renamed from: c */
    int f16515c;

    /* renamed from: d */
    int f16516d;

    /* renamed from: e */
    int f16517e;

    /* renamed from: f */
    int f16518f;

    /* renamed from: g */
    boolean f16519g;

    /* renamed from: h */
    boolean f16520h = false;

    /* renamed from: i */
    Handler f16521i;

    /* renamed from: j */
    CountDownTimer f16522j;

    /* renamed from: k */
    List<C6743i> f16523k = new ArrayList();

    /* renamed from: l */
    String f16524l;

    /* renamed from: m */
    String f16525m;

    /* renamed from: n */
    C6748l f16526n;

    /* renamed from: o */
    String f16527o;

    /* renamed from: p */
    SegmentListener f16528p;

    /* renamed from: q */
    boolean f16529q;

    /* renamed from: r */
    long f16530r;

    /* renamed from: s */
    C8105e f16531s;

    /* renamed from: t */
    private int f16532t = C6479b.f16551e;

    /* renamed from: v */
    private final String f16533v = "appKey";

    /* renamed from: w */
    private final String f16534w = getClass().getSimpleName();

    /* renamed from: x */
    private HandlerThread f16535x = null;

    /* renamed from: y */
    private boolean f16536y = false;

    /* renamed from: z */
    private AtomicBoolean f16537z;

    /* renamed from: com.ironsource.mediationsdk.Q$3 */
    static /* synthetic */ class C64773 {

        /* renamed from: a */
        static final /* synthetic */ int[] f16541a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ironsource.mediationsdk.Q$a[] r0 = com.ironsource.mediationsdk.C6473Q.C6478a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16541a = r0
                com.ironsource.mediationsdk.Q$a r1 = com.ironsource.mediationsdk.C6473Q.C6478a.INIT_IN_PROGRESS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16541a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ironsource.mediationsdk.Q$a r1 = com.ironsource.mediationsdk.C6473Q.C6478a.NOT_INIT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f16541a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ironsource.mediationsdk.Q$a r1 = com.ironsource.mediationsdk.C6473Q.C6478a.INITIATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6473Q.C64773.<clinit>():void");
        }
    }

    /* renamed from: com.ironsource.mediationsdk.Q$a */
    enum C6478a {
        NOT_INIT,
        INIT_IN_PROGRESS,
        INIT_FAILED,
        INITIATED
    }

    /* renamed from: com.ironsource.mediationsdk.Q$b */
    public static class C6479b {

        /* renamed from: a */
        public static int f16547a = 0;

        /* renamed from: b */
        public static int f16548b = 1;

        /* renamed from: c */
        public static int f16549c = 2;

        /* renamed from: d */
        public static int f16550d = 3;

        /* renamed from: e */
        public static int f16551e = 4;
    }

    /* renamed from: com.ironsource.mediationsdk.Q$c */
    abstract class C6480c implements Runnable {

        /* renamed from: a */
        boolean f16552a = true;

        /* renamed from: b */
        String f16553b;

        /* renamed from: c */
        protected C6459L.C6461a f16554c = new C6459L.C6461a() {
            /* renamed from: a */
            public final void mo36161a(String str) {
                C6480c.this.f16552a = false;
                C6480c.this.f16553b = str;
            }
        };

        C6480c() {
        }
    }

    private C6473Q() {
        HandlerThread handlerThread = new HandlerThread("IronSourceInitiatorHandler");
        this.f16535x = handlerThread;
        handlerThread.start();
        this.f16521i = new Handler(this.f16535x.getLooper());
        this.f16514b = 1;
        this.f16515c = 0;
        this.f16516d = 62;
        this.f16517e = 12;
        this.f16518f = 5;
        this.f16537z = new AtomicBoolean(true);
        this.f16519g = false;
        this.f16529q = false;
        this.f16531s = new C8105e();
    }

    /* renamed from: a */
    public static synchronized C6473Q m19479a() {
        C6473Q q;
        synchronized (C6473Q.class) {
            if (f16509u == null) {
                f16509u = new C6473Q();
            }
            q = f16509u;
        }
        return q;
    }

    /* renamed from: a */
    public final void mo36214a(Context context, C6748l lVar) {
        this.f16531s.mo56306e(lVar.mo36979a().f16303b);
        this.f16531s.mo56298a(lVar.mo36979a().f16302a);
        C8196u uVar = lVar.f17750c.f17356e;
        this.f16531s.mo56307f(uVar.mo56493i().f17326a);
        this.f16531s.mo56302b(uVar.mo56487c().f17791c);
        this.f16531s.mo56297a(Boolean.valueOf(IronSourceUtils.getFirstSession(context)));
    }

    /* renamed from: a */
    public final synchronized void mo36215a(Context context, String str, String str2) {
        try {
            if (this.f16537z == null || !this.f16537z.compareAndSet(true, false)) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
                logger.log(ironSourceTag, this.f16534w + ": Multiple calls to init are not allowed", 2);
                return;
            }
            mo36216a(C6478a.INIT_IN_PROGRESS);
            this.f16524l = str2;
            this.f16525m = str;
            if (IronSourceUtils.isNetworkConnected(context)) {
                this.f16521i.post(this.f16512C);
            } else {
                this.f16536y = true;
                if (this.f16510A == null) {
                    this.f16510A = new NetworkStateReceiver(context, this);
                }
                context.registerReceiver(this.f16510A, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                C6387c.f16171a.mo35897c(new Runnable() {
                    public final void run() {
                        C6473Q.this.f16522j = new CountDownTimer(60000, 15000) {
                            public final void onFinish() {
                                if (!C6473Q.this.f16520h) {
                                    C6473Q.this.f16520h = true;
                                    for (C6743i a : C6473Q.this.f16523k) {
                                        a.mo36028a(IronSourceConstants.FALSE_AVAILABILITY_REASON_NO_INTERNET);
                                    }
                                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No internet connection", 1);
                                }
                            }

                            public final void onTick(long j) {
                                if (j <= 45000) {
                                    C6473Q.this.f16529q = true;
                                    for (C6743i f : C6473Q.this.f16523k) {
                                        f.mo36039f();
                                    }
                                }
                            }
                        }.start();
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo36216a(C6478a aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("old status: " + this.f16511B + ", new status: " + aVar + ")");
        this.f16511B = aVar;
    }

    /* renamed from: a */
    public final void mo36217a(C6743i iVar) {
        if (iVar != null) {
            this.f16523k.add(iVar);
        }
    }

    /* renamed from: a */
    public final synchronized void mo36218a(C6748l lVar) {
        int i;
        int i2 = lVar != null ? lVar.f17752e : C6748l.C6749a.f17774a;
        C6478a aVar = this.f16511B;
        if (i2 == C6748l.C6749a.f17775b) {
            i = C6479b.f16549c;
        } else {
            int i3 = C64773.f16541a[aVar.ordinal()];
            i = i3 != 1 ? i3 != 2 ? i3 != 3 ? C6479b.f16547a : C6479b.f16548b : C6479b.f16551e : C6479b.f16550d;
        }
        this.f16532t = i;
        this.f16531s.mo56294a(i);
    }

    /* renamed from: a */
    public final void mo35903a(boolean z) {
        if (this.f16536y && z) {
            CountDownTimer countDownTimer = this.f16522j;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.f16536y = false;
            this.f16519g = true;
            this.f16521i.post(this.f16512C);
        }
    }

    /* renamed from: b */
    public final synchronized C6478a mo36219b() {
        return this.f16511B;
    }

    /* renamed from: b */
    public final void mo36220b(boolean z) {
        Map<String, String> map;
        if (z && TextUtils.isEmpty(C6459L.m19304a().f16425o) && (map = this.f16526n.f17750c.f17356e.mo56491g().f17339a) != null && !map.isEmpty()) {
            for (String next : map.keySet()) {
                if (IronSourceUtils.doesClassExist(next)) {
                    String str = map.get(next);
                    if (!TextUtils.isEmpty(str)) {
                        next = str;
                    }
                    C6459L.m19304a().mo36138d(next);
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public final synchronized boolean mo36221c() {
        return this.f16529q;
    }
}
