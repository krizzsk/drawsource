package com.mbridge.msdk.reward.adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.controller.C8396b;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.entity.C8468m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p298db.C8412f;
import com.mbridge.msdk.foundation.p298db.C8414g;
import com.mbridge.msdk.foundation.p298db.C8423p;
import com.mbridge.msdk.foundation.same.p302c.C8484c;
import com.mbridge.msdk.foundation.same.p305f.C8498b;
import com.mbridge.msdk.foundation.same.report.C8580c;
import com.mbridge.msdk.foundation.tools.C8639i;
import com.mbridge.msdk.foundation.tools.C8660r;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.mbsignalcommon.p339b.C8852a;
import com.mbridge.msdk.mbsignalcommon.p339b.C8853b;
import com.mbridge.msdk.mbsignalcommon.windvane.C8881a;
import com.mbridge.msdk.mbsignalcommon.windvane.C8887g;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.reward.p342a.C9110a;
import com.mbridge.msdk.reward.p343b.C9176a;
import com.mbridge.msdk.video.p347bt.module.p350b.C9303a;
import com.mbridge.msdk.video.p347bt.module.p350b.C9310g;
import com.mbridge.msdk.video.p347bt.p348a.C9261c;
import com.mbridge.msdk.video.signal.p371a.C9514j;
import com.mbridge.msdk.videocommon.C9625a;
import com.mbridge.msdk.videocommon.download.C9645c;
import com.mbridge.msdk.videocommon.download.C9652g;
import com.mbridge.msdk.videocommon.download.C9661h;
import com.mbridge.msdk.videocommon.download.C9664i;
import com.mbridge.msdk.videocommon.listener.C9673a;
import com.mbridge.msdk.videocommon.listener.InterVideoOutListener;
import com.mbridge.msdk.videocommon.p375d.C9640c;
import com.smaato.sdk.video.vast.model.ErrorCode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.reward.adapter.c */
/* compiled from: RewardCampaignsResourceManager */
public final class C9133c {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Map<String, C9138a> f22238c;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C9146h f22239a;

    /* renamed from: b */
    private ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> f22240b;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f22241d;

    /* renamed from: e */
    private volatile List<WindVaneWebView> f22242e;

    /* renamed from: com.mbridge.msdk.reward.adapter.c$c */
    /* compiled from: RewardCampaignsResourceManager */
    public interface C9140c {
        /* renamed from: a */
        void mo61294a(String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList);

        /* renamed from: a */
        void mo61295a(String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str4);
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.c$i */
    /* compiled from: RewardCampaignsResourceManager */
    public interface C9147i {
        /* renamed from: a */
        void mo61300a(String str, String str2, String str3, String str4);

        /* renamed from: a */
        void mo61301a(String str, String str2, String str3, String str4, String str5);
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.c$j */
    /* compiled from: RewardCampaignsResourceManager */
    public interface C9148j {
        /* renamed from: a */
        void mo61297a(String str, String str2, String str3, String str4, String str5, C9625a.C9626a aVar);

        /* renamed from: a */
        void mo61298a(String str, String str2, String str3, String str4, String str5, C9625a.C9626a aVar, String str6);
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.c$m */
    /* compiled from: RewardCampaignsResourceManager */
    private static final class C9153m {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C9133c f22381a = new C9133c();
    }

    private C9133c() {
        this.f22242e = new ArrayList(6);
        HandlerThread handlerThread = new HandlerThread("mb-reward-load-thread");
        f22238c = new HashMap();
        handlerThread.start();
        this.f22239a = new C9146h(handlerThread.getLooper());
        this.f22240b = new ConcurrentHashMap<>();
    }

    /* renamed from: a */
    public static C9133c m25977a() {
        return C9153m.f22381a;
    }

    /* renamed from: a */
    public final synchronized void mo61320a(Context context, boolean z, int i, boolean z2, int i2, String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, C9140c cVar, C9147i iVar) {
        String str4 = str2;
        String str5 = str3;
        synchronized (this) {
            String str6 = str4 + "_" + str5;
            f22238c.put(str6, new C9138a(z, z2, i, copyOnWriteArrayList.size(), str2, str3, i2, copyOnWriteArrayList));
            this.f22239a.mo61329a(str, str4, str5, cVar);
            this.f22239a.mo61328a(context);
            this.f22239a.mo61330a(str6, copyOnWriteArrayList);
            final CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = copyOnWriteArrayList;
            final Context context2 = context;
            final String str7 = str2;
            final int i3 = i2;
            final String str8 = str;
            final String str9 = str3;
            final C9147i iVar2 = iVar;
            this.f22239a.post(new Runnable() {
                /* JADX WARNING: Removed duplicated region for block: B:117:0x02cd  */
                /* JADX WARNING: Removed duplicated region for block: B:49:0x0147  */
                /* JADX WARNING: Removed duplicated region for block: B:70:0x01d2 A[SYNTHETIC, Splitter:B:70:0x01d2] */
                /* JADX WARNING: Removed duplicated region for block: B:78:0x0206 A[SYNTHETIC, Splitter:B:78:0x0206] */
                /* JADX WARNING: Removed duplicated region for block: B:85:0x0232  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r24 = this;
                        r1 = r24
                        java.lang.String r2 = "RewardCampaignsResourceManager"
                        java.util.concurrent.CopyOnWriteArrayList r0 = r3
                        if (r0 == 0) goto L_0x0328
                        int r0 = r0.size()
                        if (r0 <= 0) goto L_0x0328
                        com.mbridge.msdk.videocommon.download.i r0 = com.mbridge.msdk.videocommon.download.C9664i.m27564a()     // Catch:{ Exception -> 0x0041 }
                        java.util.concurrent.CopyOnWriteArrayList r3 = r3     // Catch:{ Exception -> 0x0041 }
                        r0.mo63677a((java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>) r3)     // Catch:{ Exception -> 0x0041 }
                        com.mbridge.msdk.videocommon.download.c r4 = com.mbridge.msdk.videocommon.download.C9645c.getInstance()     // Catch:{ Exception -> 0x0041 }
                        android.content.Context r5 = r4     // Catch:{ Exception -> 0x0041 }
                        java.lang.String r6 = r5     // Catch:{ Exception -> 0x0041 }
                        java.util.concurrent.CopyOnWriteArrayList r7 = r3     // Catch:{ Exception -> 0x0041 }
                        int r8 = r6     // Catch:{ Exception -> 0x0041 }
                        com.mbridge.msdk.reward.adapter.c$f r9 = new com.mbridge.msdk.reward.adapter.c$f     // Catch:{ Exception -> 0x0041 }
                        com.mbridge.msdk.reward.adapter.c r0 = com.mbridge.msdk.reward.adapter.C9133c.this     // Catch:{ Exception -> 0x0041 }
                        com.mbridge.msdk.reward.adapter.c$h r0 = r0.f22239a     // Catch:{ Exception -> 0x0041 }
                        java.lang.String r3 = r7     // Catch:{ Exception -> 0x0041 }
                        java.lang.String r10 = r5     // Catch:{ Exception -> 0x0041 }
                        java.lang.String r11 = r8     // Catch:{ Exception -> 0x0041 }
                        r9.<init>(r0, r3, r10, r11)     // Catch:{ Exception -> 0x0041 }
                        r4.createUnitCache((android.content.Context) r5, (java.lang.String) r6, (java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>) r7, (int) r8, (com.mbridge.msdk.videocommon.listener.C9673a) r9)     // Catch:{ Exception -> 0x0041 }
                        com.mbridge.msdk.videocommon.download.c r0 = com.mbridge.msdk.videocommon.download.C9645c.getInstance()     // Catch:{ Exception -> 0x0041 }
                        java.lang.String r3 = r5     // Catch:{ Exception -> 0x0041 }
                        r0.load(r3)     // Catch:{ Exception -> 0x0041 }
                        goto L_0x004d
                    L_0x0041:
                        r0 = move-exception
                        boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG
                        if (r3 == 0) goto L_0x004d
                        java.lang.String r0 = r0.getLocalizedMessage()
                        com.mbridge.msdk.foundation.tools.C8672v.m24878d(r2, r0)
                    L_0x004d:
                        java.util.concurrent.CopyOnWriteArrayList r0 = r3
                        java.util.Iterator r3 = r0.iterator()
                    L_0x0053:
                        boolean r0 = r3.hasNext()
                        if (r0 == 0) goto L_0x0328
                        java.lang.Object r0 = r3.next()
                        r14 = r0
                        com.mbridge.msdk.foundation.entity.CampaignEx r14 = (com.mbridge.msdk.foundation.entity.CampaignEx) r14
                        if (r14 != 0) goto L_0x0063
                        goto L_0x0053
                    L_0x0063:
                        com.mbridge.msdk.foundation.entity.CampaignEx$c r15 = r14.getRewardTemplateMode()
                        java.lang.String r13 = ".zip"
                        java.lang.String r12 = ""
                        if (r15 == 0) goto L_0x012f
                        java.lang.String r0 = r15.mo57576e()
                        int r4 = r15.mo57573b()
                        boolean r5 = r14.isDynamicView()
                        if (r5 == 0) goto L_0x0098
                        boolean r5 = com.mbridge.msdk.foundation.tools.C8677z.m24950i((java.lang.String) r0)
                        if (r5 == 0) goto L_0x0098
                        com.mbridge.msdk.reward.adapter.c r5 = com.mbridge.msdk.reward.adapter.C9133c.this
                        r6 = 1
                        java.lang.StringBuilder r7 = new java.lang.StringBuilder
                        r7.<init>()
                        r7.append(r4)
                        r7.append(r12)
                        java.lang.String r4 = r7.toString()
                        r5.m25979a(r6, r14, r4, r0)
                        goto L_0x012f
                    L_0x0098:
                        boolean r4 = android.text.TextUtils.isEmpty(r0)
                        if (r4 != 0) goto L_0x012f
                        java.lang.String r4 = "cmpt=1"
                        boolean r4 = r0.contains(r4)
                        if (r4 != 0) goto L_0x012f
                        boolean r4 = r0.contains(r13)
                        if (r4 == 0) goto L_0x00fb
                        com.mbridge.msdk.videocommon.download.g r11 = com.mbridge.msdk.videocommon.download.C9652g.m27539a()     // Catch:{ Exception -> 0x00e8 }
                        com.mbridge.msdk.reward.adapter.c$g r10 = new com.mbridge.msdk.reward.adapter.c$g     // Catch:{ Exception -> 0x00e8 }
                        android.content.Context r5 = r4     // Catch:{ Exception -> 0x00e8 }
                        java.lang.String r6 = r7     // Catch:{ Exception -> 0x00e8 }
                        java.lang.String r7 = r5     // Catch:{ Exception -> 0x00e8 }
                        java.lang.String r8 = r8     // Catch:{ Exception -> 0x00e8 }
                        r16 = 859(0x35b, float:1.204E-42)
                        com.mbridge.msdk.reward.adapter.c r4 = com.mbridge.msdk.reward.adapter.C9133c.this     // Catch:{ Exception -> 0x00e8 }
                        com.mbridge.msdk.reward.adapter.c$h r17 = r4.f22239a     // Catch:{ Exception -> 0x00e8 }
                        com.mbridge.msdk.reward.adapter.c$i r9 = r9     // Catch:{ Exception -> 0x00e8 }
                        java.util.concurrent.CopyOnWriteArrayList r4 = r3     // Catch:{ Exception -> 0x00e8 }
                        r18 = r4
                        r4 = r10
                        r19 = r9
                        r9 = r14
                        r20 = r3
                        r3 = r10
                        r10 = r16
                        r21 = r11
                        r11 = r17
                        r22 = r12
                        r12 = r19
                        r23 = r13
                        r13 = r18
                        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x00e6 }
                        r4 = r21
                        r4.mo63671b(r0, r3)     // Catch:{ Exception -> 0x00e6 }
                        goto L_0x0135
                    L_0x00e6:
                        r0 = move-exception
                        goto L_0x00ef
                    L_0x00e8:
                        r0 = move-exception
                        r20 = r3
                        r22 = r12
                        r23 = r13
                    L_0x00ef:
                        boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG
                        if (r3 == 0) goto L_0x0135
                        java.lang.String r0 = r0.getLocalizedMessage()
                        com.mbridge.msdk.foundation.tools.C8672v.m24878d(r2, r0)
                        goto L_0x0135
                    L_0x00fb:
                        r20 = r3
                        r22 = r12
                        r23 = r13
                        com.mbridge.msdk.videocommon.download.g r3 = com.mbridge.msdk.videocommon.download.C9652g.m27539a()     // Catch:{ Exception -> 0x0122 }
                        com.mbridge.msdk.reward.adapter.c$d r13 = new com.mbridge.msdk.reward.adapter.c$d     // Catch:{ Exception -> 0x0122 }
                        r5 = 859(0x35b, float:1.204E-42)
                        java.lang.String r6 = r7     // Catch:{ Exception -> 0x0122 }
                        java.lang.String r7 = r5     // Catch:{ Exception -> 0x0122 }
                        java.lang.String r8 = r8     // Catch:{ Exception -> 0x0122 }
                        com.mbridge.msdk.reward.adapter.c$i r10 = r9     // Catch:{ Exception -> 0x0122 }
                        com.mbridge.msdk.reward.adapter.c r4 = com.mbridge.msdk.reward.adapter.C9133c.this     // Catch:{ Exception -> 0x0122 }
                        com.mbridge.msdk.reward.adapter.c$h r11 = r4.f22239a     // Catch:{ Exception -> 0x0122 }
                        java.util.concurrent.CopyOnWriteArrayList r12 = r3     // Catch:{ Exception -> 0x0122 }
                        r4 = r13
                        r9 = r14
                        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0122 }
                        r3.mo63671b(r0, r13)     // Catch:{ Exception -> 0x0122 }
                        goto L_0x0135
                    L_0x0122:
                        r0 = move-exception
                        boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG
                        if (r3 == 0) goto L_0x0135
                        java.lang.String r0 = r0.getLocalizedMessage()
                        com.mbridge.msdk.foundation.tools.C8672v.m24878d(r2, r0)
                        goto L_0x0135
                    L_0x012f:
                        r20 = r3
                        r22 = r12
                        r23 = r13
                    L_0x0135:
                        java.lang.String r10 = r14.getendcard_url()
                        boolean r0 = r14.isDynamicView()
                        boolean r3 = com.mbridge.msdk.foundation.tools.C8677z.m24952j((java.lang.String) r10)
                        boolean r4 = android.text.TextUtils.isEmpty(r10)
                        if (r4 != 0) goto L_0x01aa
                        if (r0 != 0) goto L_0x015c
                        com.mbridge.msdk.reward.adapter.c r4 = com.mbridge.msdk.reward.adapter.C9133c.this
                        android.content.Context r5 = r4
                        java.lang.String r6 = r7
                        java.lang.String r7 = r5
                        java.lang.String r8 = r8
                        com.mbridge.msdk.reward.adapter.c$i r11 = r9
                        java.util.concurrent.CopyOnWriteArrayList r12 = r3
                        r9 = r14
                        com.mbridge.msdk.reward.adapter.C9133c.m25981a(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                        goto L_0x01aa
                    L_0x015c:
                        if (r3 == 0) goto L_0x0171
                        com.mbridge.msdk.reward.adapter.c r4 = com.mbridge.msdk.reward.adapter.C9133c.this
                        android.content.Context r5 = r4
                        java.lang.String r6 = r7
                        java.lang.String r7 = r5
                        java.lang.String r8 = r8
                        com.mbridge.msdk.reward.adapter.c$i r11 = r9
                        java.util.concurrent.CopyOnWriteArrayList r12 = r3
                        r9 = r14
                        com.mbridge.msdk.reward.adapter.C9133c.m25981a(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                        goto L_0x01aa
                    L_0x0171:
                        boolean r0 = android.text.TextUtils.isEmpty(r10)
                        if (r0 != 0) goto L_0x01aa
                        boolean r0 = com.mbridge.msdk.foundation.tools.C8677z.m24950i((java.lang.String) r10)
                        if (r0 == 0) goto L_0x01aa
                        java.lang.String r0 = "ecid"
                        java.lang.String r0 = com.mbridge.msdk.foundation.tools.C8617ae.m24720a(r10, r0)     // Catch:{ all -> 0x0188 }
                        int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0188 }
                        goto L_0x0193
                    L_0x0188:
                        r0 = move-exception
                        r3 = 404(0x194, float:5.66E-43)
                        java.lang.String r0 = r0.getMessage()
                        com.mbridge.msdk.foundation.tools.C8672v.m24878d(r2, r0)
                        r0 = r3
                    L_0x0193:
                        com.mbridge.msdk.reward.adapter.c r3 = com.mbridge.msdk.reward.adapter.C9133c.this
                        r4 = 2
                        java.lang.StringBuilder r5 = new java.lang.StringBuilder
                        r5.<init>()
                        r5.append(r0)
                        r6 = r22
                        r5.append(r6)
                        java.lang.String r0 = r5.toString()
                        r3.m25979a(r4, r14, r0, r10)
                    L_0x01aa:
                        java.lang.String r0 = r14.getEndScreenUrl()
                        boolean r0 = android.text.TextUtils.isEmpty(r0)
                        if (r0 != 0) goto L_0x01c8
                        boolean r0 = r14.isDynamicView()
                        if (r0 != 0) goto L_0x01c8
                        com.mbridge.msdk.videocommon.download.g r0 = com.mbridge.msdk.videocommon.download.C9652g.m27539a()
                        java.lang.String r3 = r14.getEndScreenUrl()
                        r4 = 0
                        com.mbridge.msdk.videocommon.download.g$b r4 = (com.mbridge.msdk.videocommon.download.C9652g.C9658b) r4
                        r0.mo63669a(r3, r4)
                    L_0x01c8:
                        java.lang.String r0 = r14.getIconUrl()
                        boolean r3 = android.text.TextUtils.isEmpty(r0)
                        if (r3 != 0) goto L_0x01fc
                        android.content.Context r3 = r4     // Catch:{ Exception -> 0x01f0 }
                        com.mbridge.msdk.foundation.same.c.b r3 = com.mbridge.msdk.foundation.same.p302c.C8481b.m24310a((android.content.Context) r3)     // Catch:{ Exception -> 0x01f0 }
                        com.mbridge.msdk.reward.adapter.c$e r11 = new com.mbridge.msdk.reward.adapter.c$e     // Catch:{ Exception -> 0x01f0 }
                        com.mbridge.msdk.reward.adapter.c r4 = com.mbridge.msdk.reward.adapter.C9133c.this     // Catch:{ Exception -> 0x01f0 }
                        com.mbridge.msdk.reward.adapter.c$h r5 = r4.f22239a     // Catch:{ Exception -> 0x01f0 }
                        r6 = 0
                        java.lang.String r7 = r7     // Catch:{ Exception -> 0x01f0 }
                        java.lang.String r8 = r5     // Catch:{ Exception -> 0x01f0 }
                        java.lang.String r9 = r8     // Catch:{ Exception -> 0x01f0 }
                        r4 = r11
                        r10 = r14
                        r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x01f0 }
                        r3.mo57883a((java.lang.String) r0, (com.mbridge.msdk.foundation.same.p302c.C8484c) r11)     // Catch:{ Exception -> 0x01f0 }
                        goto L_0x01fc
                    L_0x01f0:
                        r0 = move-exception
                        boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG
                        if (r3 == 0) goto L_0x01fc
                        java.lang.String r0 = r0.getLocalizedMessage()
                        com.mbridge.msdk.foundation.tools.C8672v.m24878d(r2, r0)
                    L_0x01fc:
                        java.lang.String r0 = r14.getImageUrl()
                        boolean r3 = android.text.TextUtils.isEmpty(r0)
                        if (r3 != 0) goto L_0x0230
                        android.content.Context r3 = r4     // Catch:{ Exception -> 0x0224 }
                        com.mbridge.msdk.foundation.same.c.b r3 = com.mbridge.msdk.foundation.same.p302c.C8481b.m24310a((android.content.Context) r3)     // Catch:{ Exception -> 0x0224 }
                        com.mbridge.msdk.reward.adapter.c$e r11 = new com.mbridge.msdk.reward.adapter.c$e     // Catch:{ Exception -> 0x0224 }
                        com.mbridge.msdk.reward.adapter.c r4 = com.mbridge.msdk.reward.adapter.C9133c.this     // Catch:{ Exception -> 0x0224 }
                        com.mbridge.msdk.reward.adapter.c$h r5 = r4.f22239a     // Catch:{ Exception -> 0x0224 }
                        r6 = 0
                        java.lang.String r7 = r7     // Catch:{ Exception -> 0x0224 }
                        java.lang.String r8 = r5     // Catch:{ Exception -> 0x0224 }
                        java.lang.String r9 = r8     // Catch:{ Exception -> 0x0224 }
                        r4 = r11
                        r10 = r14
                        r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0224 }
                        r3.mo57883a((java.lang.String) r0, (com.mbridge.msdk.foundation.same.p302c.C8484c) r11)     // Catch:{ Exception -> 0x0224 }
                        goto L_0x0230
                    L_0x0224:
                        r0 = move-exception
                        boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG
                        if (r3 == 0) goto L_0x0230
                        java.lang.String r0 = r0.getLocalizedMessage()
                        com.mbridge.msdk.foundation.tools.C8672v.m24878d(r2, r0)
                    L_0x0230:
                        if (r15 == 0) goto L_0x0324
                        java.lang.String r0 = r15.mo57575d()
                        boolean r3 = android.text.TextUtils.isEmpty(r0)
                        if (r3 != 0) goto L_0x02b5
                        boolean r3 = r14.isDynamicView()
                        if (r3 != 0) goto L_0x02b5
                        r3 = r23
                        boolean r3 = r0.contains(r3)
                        if (r3 == 0) goto L_0x0285
                        com.mbridge.msdk.videocommon.download.g r3 = com.mbridge.msdk.videocommon.download.C9652g.m27539a()     // Catch:{ Exception -> 0x0276 }
                        com.mbridge.msdk.reward.adapter.c$g r13 = new com.mbridge.msdk.reward.adapter.c$g     // Catch:{ Exception -> 0x0276 }
                        android.content.Context r5 = r4     // Catch:{ Exception -> 0x0276 }
                        java.lang.String r6 = r7     // Catch:{ Exception -> 0x0276 }
                        java.lang.String r7 = r5     // Catch:{ Exception -> 0x0276 }
                        java.lang.String r8 = r8     // Catch:{ Exception -> 0x0276 }
                        r10 = 313(0x139, float:4.39E-43)
                        com.mbridge.msdk.reward.adapter.c r4 = com.mbridge.msdk.reward.adapter.C9133c.this     // Catch:{ Exception -> 0x0276 }
                        com.mbridge.msdk.reward.adapter.c$h r11 = r4.f22239a     // Catch:{ Exception -> 0x0276 }
                        com.mbridge.msdk.reward.adapter.c$i r12 = r9     // Catch:{ Exception -> 0x0276 }
                        java.util.concurrent.CopyOnWriteArrayList r9 = r3     // Catch:{ Exception -> 0x0276 }
                        r4 = r13
                        r16 = r9
                        r9 = r14
                        r17 = r15
                        r15 = r13
                        r13 = r16
                        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0274 }
                        r3.mo63671b(r0, r15)     // Catch:{ Exception -> 0x0274 }
                        goto L_0x02b7
                    L_0x0274:
                        r0 = move-exception
                        goto L_0x0279
                    L_0x0276:
                        r0 = move-exception
                        r17 = r15
                    L_0x0279:
                        boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG
                        if (r3 == 0) goto L_0x02b7
                        java.lang.String r0 = r0.getLocalizedMessage()
                        com.mbridge.msdk.foundation.tools.C8672v.m24878d(r2, r0)
                        goto L_0x02b7
                    L_0x0285:
                        r17 = r15
                        com.mbridge.msdk.videocommon.download.g r3 = com.mbridge.msdk.videocommon.download.C9652g.m27539a()     // Catch:{ Exception -> 0x02a8 }
                        com.mbridge.msdk.reward.adapter.c$d r13 = new com.mbridge.msdk.reward.adapter.c$d     // Catch:{ Exception -> 0x02a8 }
                        r5 = 313(0x139, float:4.39E-43)
                        java.lang.String r6 = r7     // Catch:{ Exception -> 0x02a8 }
                        java.lang.String r7 = r5     // Catch:{ Exception -> 0x02a8 }
                        java.lang.String r8 = r8     // Catch:{ Exception -> 0x02a8 }
                        com.mbridge.msdk.reward.adapter.c$i r10 = r9     // Catch:{ Exception -> 0x02a8 }
                        com.mbridge.msdk.reward.adapter.c r4 = com.mbridge.msdk.reward.adapter.C9133c.this     // Catch:{ Exception -> 0x02a8 }
                        com.mbridge.msdk.reward.adapter.c$h r11 = r4.f22239a     // Catch:{ Exception -> 0x02a8 }
                        java.util.concurrent.CopyOnWriteArrayList r12 = r3     // Catch:{ Exception -> 0x02a8 }
                        r4 = r13
                        r9 = r14
                        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x02a8 }
                        r3.mo63671b(r0, r13)     // Catch:{ Exception -> 0x02a8 }
                        goto L_0x02b7
                    L_0x02a8:
                        r0 = move-exception
                        boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG
                        if (r3 == 0) goto L_0x02b7
                        java.lang.String r0 = r0.getLocalizedMessage()
                        com.mbridge.msdk.foundation.tools.C8672v.m24878d(r2, r0)
                        goto L_0x02b7
                    L_0x02b5:
                        r17 = r15
                    L_0x02b7:
                        java.util.List r0 = r17.mo57577f()
                        if (r0 == 0) goto L_0x0324
                        int r3 = r0.size()
                        if (r3 <= 0) goto L_0x0324
                        java.util.Iterator r3 = r0.iterator()
                    L_0x02c7:
                        boolean r0 = r3.hasNext()
                        if (r0 == 0) goto L_0x0324
                        java.lang.Object r0 = r3.next()
                        com.mbridge.msdk.foundation.entity.CampaignEx$c$a r0 = (com.mbridge.msdk.foundation.entity.CampaignEx.C8454c.C8455a) r0
                        if (r0 == 0) goto L_0x02c7
                        java.util.List<java.lang.String> r4 = r0.f20604b
                        if (r4 == 0) goto L_0x02c7
                        java.util.List<java.lang.String> r4 = r0.f20604b
                        int r4 = r4.size()
                        if (r4 <= 0) goto L_0x02c7
                        java.util.List<java.lang.String> r0 = r0.f20604b
                        java.util.Iterator r11 = r0.iterator()
                    L_0x02e7:
                        boolean r0 = r11.hasNext()
                        if (r0 == 0) goto L_0x02c7
                        java.lang.Object r0 = r11.next()
                        java.lang.String r0 = (java.lang.String) r0
                        boolean r4 = android.text.TextUtils.isEmpty(r0)
                        if (r4 != 0) goto L_0x02e7
                        android.content.Context r4 = r4     // Catch:{ Exception -> 0x0317 }
                        com.mbridge.msdk.foundation.same.c.b r12 = com.mbridge.msdk.foundation.same.p302c.C8481b.m24310a((android.content.Context) r4)     // Catch:{ Exception -> 0x0317 }
                        com.mbridge.msdk.reward.adapter.c$e r13 = new com.mbridge.msdk.reward.adapter.c$e     // Catch:{ Exception -> 0x0317 }
                        com.mbridge.msdk.reward.adapter.c r4 = com.mbridge.msdk.reward.adapter.C9133c.this     // Catch:{ Exception -> 0x0317 }
                        com.mbridge.msdk.reward.adapter.c$h r5 = r4.f22239a     // Catch:{ Exception -> 0x0317 }
                        r6 = 1
                        java.lang.String r7 = r7     // Catch:{ Exception -> 0x0317 }
                        java.lang.String r8 = r5     // Catch:{ Exception -> 0x0317 }
                        java.lang.String r9 = r8     // Catch:{ Exception -> 0x0317 }
                        r4 = r13
                        r10 = r14
                        r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0317 }
                        r12.mo57883a((java.lang.String) r0, (com.mbridge.msdk.foundation.same.p302c.C8484c) r13)     // Catch:{ Exception -> 0x0317 }
                        goto L_0x02e7
                    L_0x0317:
                        r0 = move-exception
                        boolean r4 = com.mbridge.msdk.MBridgeConstans.DEBUG
                        if (r4 == 0) goto L_0x02e7
                        java.lang.String r0 = r0.getLocalizedMessage()
                        com.mbridge.msdk.foundation.tools.C8672v.m24878d(r2, r0)
                        goto L_0x02e7
                    L_0x0324:
                        r3 = r20
                        goto L_0x0053
                    L_0x0328:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.C9133c.C91341.run():void");
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25979a(int i, CampaignEx campaignEx, String str, String str2) {
        C8639i.m24752a(i, str, str2, new C8639i.C8642a() {
            /* renamed from: a */
            public final void mo58126a(String str, String str2, String str3) {
                C8672v.m24874a("RewardCampaignsResourceManager", "load xml success");
            }

            /* renamed from: a */
            public final void mo58125a(String str, DownloadError downloadError) {
                C8672v.m24878d("RewardCampaignsResourceManager", "load error");
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0073, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ac, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo61319a(android.content.Context r14, com.mbridge.msdk.foundation.entity.CampaignEx r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, com.mbridge.msdk.reward.adapter.C9133c.C9147i r19) {
        /*
            r13 = this;
            r9 = r13
            r0 = r15
            r4 = r16
            r3 = r17
            r5 = r18
            r6 = r19
            monitor-enter(r13)
            com.mbridge.msdk.reward.adapter.c$h r1 = r9.f22239a     // Catch:{ all -> 0x00ad }
            r7 = r14
            r1.mo61328a(r14)     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x0074
            java.lang.String r1 = r15.getCMPTEntryUrl()     // Catch:{ all -> 0x00ad }
            boolean r2 = r15.isDynamicView()     // Catch:{ all -> 0x00ad }
            if (r2 == 0) goto L_0x0074
            boolean r2 = com.mbridge.msdk.foundation.tools.C8677z.m24950i((java.lang.String) r1)     // Catch:{ all -> 0x00ad }
            if (r2 == 0) goto L_0x003c
            int r2 = r15.getMof_tplid()     // Catch:{ all -> 0x00ad }
            r7 = 0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ad }
            r8.<init>()     // Catch:{ all -> 0x00ad }
            r8.append(r2)     // Catch:{ all -> 0x00ad }
            java.lang.String r2 = ""
            r8.append(r2)     // Catch:{ all -> 0x00ad }
            java.lang.String r2 = r8.toString()     // Catch:{ all -> 0x00ad }
            r13.m25979a(r7, r15, r2, r1)     // Catch:{ all -> 0x00ad }
        L_0x003c:
            com.mbridge.msdk.videocommon.download.i r0 = com.mbridge.msdk.videocommon.download.C9664i.m27564a()     // Catch:{ all -> 0x00ad }
            r2 = 1
            r0.mo63679b(r1, r2)     // Catch:{ all -> 0x00ad }
            android.os.Message r0 = android.os.Message.obtain()     // Catch:{ all -> 0x00ad }
            r2 = 105(0x69, float:1.47E-43)
            r0.what = r2     // Catch:{ all -> 0x00ad }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ all -> 0x00ad }
            r2.<init>()     // Catch:{ all -> 0x00ad }
            java.lang.String r7 = "unit_id"
            r2.putString(r7, r3)     // Catch:{ all -> 0x00ad }
            java.lang.String r7 = com.mbridge.msdk.MBridgeConstans.PLACEMENT_ID     // Catch:{ all -> 0x00ad }
            r2.putString(r7, r4)     // Catch:{ all -> 0x00ad }
            java.lang.String r7 = "request_id"
            r2.putString(r7, r5)     // Catch:{ all -> 0x00ad }
            java.lang.String r7 = "url"
            r2.putString(r7, r1)     // Catch:{ all -> 0x00ad }
            r0.setData(r2)     // Catch:{ all -> 0x00ad }
            com.mbridge.msdk.reward.adapter.c$h r2 = r9.f22239a     // Catch:{ all -> 0x00ad }
            r2.sendMessage(r0)     // Catch:{ all -> 0x00ad }
            if (r6 == 0) goto L_0x0072
            r6.mo61300a(r4, r3, r5, r1)     // Catch:{ all -> 0x00ad }
        L_0x0072:
            monitor-exit(r13)
            return
        L_0x0074:
            if (r0 == 0) goto L_0x00ab
            java.lang.String r1 = r15.getCMPTEntryUrl()     // Catch:{ all -> 0x00ad }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00ad }
            if (r1 != 0) goto L_0x00ab
            com.mbridge.msdk.videocommon.download.g r10 = com.mbridge.msdk.videocommon.download.C9652g.m27539a()     // Catch:{ Exception -> 0x009d }
            java.lang.String r11 = r15.getCMPTEntryUrl()     // Catch:{ Exception -> 0x009d }
            com.mbridge.msdk.reward.adapter.c$3 r12 = new com.mbridge.msdk.reward.adapter.c$3     // Catch:{ Exception -> 0x009d }
            r1 = r12
            r2 = r13
            r3 = r17
            r4 = r16
            r5 = r18
            r6 = r19
            r7 = r14
            r8 = r15
            r1.<init>(r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x009d }
            r10.mo63671b(r11, r12)     // Catch:{ Exception -> 0x009d }
            goto L_0x00ab
        L_0x009d:
            r0 = move-exception
            boolean r1 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch:{ all -> 0x00ad }
            if (r1 == 0) goto L_0x00ab
            java.lang.String r1 = "RewardCampaignsResourceManager"
            java.lang.String r0 = r0.getLocalizedMessage()     // Catch:{ all -> 0x00ad }
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r1, r0)     // Catch:{ all -> 0x00ad }
        L_0x00ab:
            monitor-exit(r13)
            return
        L_0x00ad:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.C9133c.mo61319a(android.content.Context, com.mbridge.msdk.foundation.entity.CampaignEx, java.lang.String, java.lang.String, java.lang.String, com.mbridge.msdk.reward.adapter.c$i):void");
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.c$e */
    /* compiled from: RewardCampaignsResourceManager */
    private static final class C9142e implements C8484c {

        /* renamed from: a */
        private Handler f22306a;

        /* renamed from: b */
        private int f22307b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f22308c;

        /* renamed from: d */
        private String f22309d;

        /* renamed from: e */
        private String f22310e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public CampaignEx f22311f;

        public C9142e(Handler handler, int i, String str, String str2, String str3, CampaignEx campaignEx) {
            this.f22306a = handler;
            this.f22307b = i;
            this.f22309d = str;
            this.f22308c = str2;
            this.f22310e = str3;
            this.f22311f = campaignEx;
        }

        public final void onSuccessLoad(Bitmap bitmap, String str) {
            C9664i.m27564a().mo63681c(str, true);
            Message obtain = Message.obtain();
            obtain.what = this.f22307b == 0 ? 102 : 104;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22308c);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f22309d);
            bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f22310e);
            obtain.setData(bundle);
            this.f22306a.sendMessage(obtain);
        }

        public final void onFailedLoad(final String str, String str2) {
            Message obtain = Message.obtain();
            obtain.what = this.f22307b == 0 ? ErrorCode.DIFFERENT_DURATION_EXPECTED_ERROR : 204;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22308c);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f22309d);
            bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f22310e);
            obtain.setData(bundle);
            this.f22306a.sendMessage(obtain);
            C91431 r5 = new Runnable() {
                public final void run() {
                    if (C9142e.this.f22311f != null) {
                        try {
                            C8423p a = C8423p.m24023a((C8412f) C8414g.m23969a(C8388a.m23845e().mo56913g()));
                            C8672v.m24874a("RewardCampaignsResourceManager", "campaign is null");
                            C8468m mVar = new C8468m();
                            mVar.mo57848o("2000044");
                            mVar.mo57822c(C8660r.m24840o(C8388a.m23845e().mo56913g()));
                            mVar.mo57846n(C9142e.this.f22311f.getId());
                            mVar.mo57826d(C9142e.this.f22311f.getImageUrl());
                            mVar.mo57840k(C9142e.this.f22311f.getRequestId());
                            mVar.mo57842l(C9142e.this.f22311f.getRequestIdNotice());
                            mVar.mo57844m(C9142e.this.f22308c);
                            mVar.mo57850p(str);
                            a.mo57056a(mVar);
                        } catch (Exception e) {
                            if (MBridgeConstans.DEBUG) {
                                C8672v.m24878d("RewardCampaignsResourceManager", e.getLocalizedMessage());
                            }
                        }
                    }
                }
            };
            if (C8396b.m23890a().mo56951d()) {
                C8498b.m24359a().execute(r5);
            } else {
                r5.run();
            }
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.c$f */
    /* compiled from: RewardCampaignsResourceManager */
    private static final class C9144f implements C9673a {

        /* renamed from: a */
        private Handler f22314a;

        /* renamed from: b */
        private final String f22315b;

        /* renamed from: c */
        private final String f22316c;

        /* renamed from: d */
        private final String f22317d;

        public C9144f(Handler handler, String str, String str2, String str3) {
            this.f22314a = handler;
            this.f22316c = str;
            this.f22315b = str2;
            this.f22317d = str3;
        }

        /* renamed from: a */
        public final void mo58773a(String str) {
            C9664i.m27564a().mo63676a(str, true);
            Message obtain = Message.obtain();
            obtain.what = 100;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22315b);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f22316c);
            bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f22317d);
            bundle.putString("url", str);
            obtain.setData(bundle);
            this.f22314a.sendMessage(obtain);
        }

        /* renamed from: a */
        public final void mo58774a(String str, String str2) {
            C9664i.m27564a().mo63676a(str2, false);
            Message obtain = Message.obtain();
            obtain.what = 200;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22315b);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f22316c);
            bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f22317d);
            bundle.putString("url", str2);
            bundle.putString("message", str);
            obtain.setData(bundle);
            this.f22314a.sendMessage(obtain);
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.c$g */
    /* compiled from: RewardCampaignsResourceManager */
    private static final class C9145g implements C9652g.C9660d {

        /* renamed from: a */
        private boolean f22318a = false;

        /* renamed from: b */
        private Context f22319b;

        /* renamed from: c */
        private String f22320c;

        /* renamed from: d */
        private String f22321d;

        /* renamed from: e */
        private String f22322e;

        /* renamed from: f */
        private CampaignEx f22323f;

        /* renamed from: g */
        private int f22324g;

        /* renamed from: h */
        private Handler f22325h;

        /* renamed from: i */
        private C9147i f22326i;

        /* renamed from: j */
        private CopyOnWriteArrayList<CampaignEx> f22327j;

        /* renamed from: k */
        private long f22328k;

        public C9145g(Context context, String str, String str2, String str3, CampaignEx campaignEx, int i, Handler handler, C9147i iVar, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f22319b = context;
            this.f22321d = str;
            this.f22320c = str2;
            this.f22322e = str3;
            this.f22323f = campaignEx;
            this.f22324g = i;
            this.f22325h = handler;
            this.f22326i = iVar;
            this.f22327j = copyOnWriteArrayList;
            this.f22328k = System.currentTimeMillis();
        }

        /* renamed from: a */
        public final void mo61327a(boolean z) {
            this.f22318a = z;
        }

        /* renamed from: a */
        public final void mo58372a(String str) {
            C9664i.m27564a().mo63679b(str, true);
            long currentTimeMillis = System.currentTimeMillis() - this.f22328k;
            int i = this.f22324g;
            if (i == 313) {
                Message obtain = Message.obtain();
                obtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22320c);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f22321d);
                bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f22322e);
                bundle.putString("url", str);
                obtain.setData(bundle);
                this.f22325h.sendMessage(obtain);
            } else if (i == 497) {
                Message obtain2 = Message.obtain();
                obtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22320c);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f22321d);
                bundle2.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f22322e);
                bundle2.putString("url", str);
                obtain2.setData(bundle2);
                this.f22325h.sendMessage(obtain2);
                if (this.f22318a) {
                    try {
                        C8468m mVar = new C8468m("2000043", 14, currentTimeMillis + "", str, this.f22323f.getId(), this.f22320c, "", "1");
                        mVar.mo57840k(this.f22323f.getRequestId());
                        mVar.mo57842l(this.f22323f.getRequestIdNotice());
                        mVar.mo57846n(this.f22323f.getId());
                        mVar.mo57819b(this.f22323f.getAdSpaceT());
                        if (this.f22323f.getAdType() == 287) {
                            mVar.mo57834h("3");
                        } else if (this.f22323f.getAdType() == 94) {
                            mVar.mo57834h("1");
                        }
                        C8580c.m24606a(mVar, this.f22320c);
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            C8672v.m24878d("RewardCampaignsResourceManager", e.getLocalizedMessage());
                        }
                    }
                }
            } else if (i == 859) {
                Message obtain3 = Message.obtain();
                obtain3.what = 103;
                Bundle bundle3 = new Bundle();
                bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22320c);
                bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f22321d);
                bundle3.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f22322e);
                obtain3.setData(bundle3);
                this.f22325h.sendMessage(obtain3);
                C9147i iVar = this.f22326i;
                if (iVar != null) {
                    iVar.mo61300a(this.f22321d, this.f22320c, this.f22322e, str);
                }
                try {
                    C8468m mVar2 = new C8468m();
                    mVar2.mo57848o("2000045");
                    if (this.f22319b != null) {
                        mVar2.mo57822c(C8660r.m24840o(this.f22319b.getApplicationContext()));
                    }
                    mVar2.mo57825d(1);
                    if (this.f22323f != null) {
                        mVar2.mo57846n(this.f22323f.getId());
                        mVar2.mo57840k(this.f22323f.getRequestId());
                        mVar2.mo57842l(this.f22323f.getRequestIdNotice());
                    }
                    mVar2.mo57836i(str);
                    mVar2.mo57850p("");
                    mVar2.mo57844m(this.f22320c);
                    C8423p.m24023a((C8412f) C8414g.m23969a(C8388a.m23845e().mo56913g())).mo57056a(mVar2);
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        C8672v.m24878d("RewardCampaignsResourceManager", e2.getLocalizedMessage());
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo58373a(String str, String str2) {
            C9664i.m27564a().mo63679b(str2, false);
            long currentTimeMillis = System.currentTimeMillis() - this.f22328k;
            int i = this.f22324g;
            if (i == 313) {
                Message obtain = Message.obtain();
                obtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22320c);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f22321d);
                bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f22322e);
                bundle.putString("url", str2);
                bundle.putString("message", str);
                obtain.setData(bundle);
                this.f22325h.sendMessage(obtain);
            } else if (i == 497) {
                Message obtain2 = Message.obtain();
                obtain2.what = ErrorCode.DIFFERENT_LINEARITY_EXPECTED_ERROR;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22320c);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f22321d);
                bundle2.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f22322e);
                bundle2.putString("url", str2);
                bundle2.putString("message", str);
                obtain2.setData(bundle2);
                this.f22325h.sendMessage(obtain2);
                if (this.f22318a) {
                    try {
                        C8468m mVar = new C8468m("2000043", 3, currentTimeMillis + "", str2, this.f22323f.getId(), this.f22320c, "zip download failed", "1");
                        mVar.mo57840k(this.f22323f.getRequestId());
                        mVar.mo57842l(this.f22323f.getRequestIdNotice());
                        mVar.mo57846n(this.f22323f.getId());
                        mVar.mo57819b(this.f22323f.getAdSpaceT());
                        if (this.f22323f.getAdType() == 287) {
                            mVar.mo57834h("3");
                        } else if (this.f22323f.getAdType() == 94) {
                            mVar.mo57834h("1");
                        }
                        C8580c.m24606a(mVar, this.f22320c);
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            C8672v.m24878d("RewardCampaignsResourceManager", e.getLocalizedMessage());
                        }
                    }
                }
            } else if (i == 859) {
                Message obtain3 = Message.obtain();
                obtain3.what = ErrorCode.DIFFERENT_SIZE_EXPECTED_ERROR;
                Bundle bundle3 = new Bundle();
                bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22320c);
                bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f22321d);
                bundle3.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f22322e);
                bundle3.putString("url", str2);
                bundle3.putString("message", str);
                obtain3.setData(bundle3);
                this.f22325h.sendMessage(obtain3);
                C9147i iVar = this.f22326i;
                if (iVar != null) {
                    iVar.mo61301a(this.f22321d, this.f22320c, this.f22322e, str2, str);
                }
                try {
                    C8468m mVar2 = new C8468m();
                    mVar2.mo57848o("2000045");
                    if (this.f22319b != null) {
                        mVar2.mo57822c(C8660r.m24840o(this.f22319b.getApplicationContext()));
                    }
                    mVar2.mo57825d(3);
                    if (this.f22323f != null) {
                        mVar2.mo57846n(this.f22323f.getId());
                        mVar2.mo57840k(this.f22323f.getRequestId());
                        mVar2.mo57842l(this.f22323f.getRequestIdNotice());
                    }
                    mVar2.mo57836i(str2);
                    mVar2.mo57850p(str);
                    mVar2.mo57844m(this.f22320c);
                    C8423p.m24023a((C8412f) C8414g.m23969a(C8388a.m23845e().mo56913g())).mo57056a(mVar2);
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        C8672v.m24878d("RewardCampaignsResourceManager", e2.getLocalizedMessage());
                    }
                }
            }
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.c$d */
    /* compiled from: RewardCampaignsResourceManager */
    private static final class C9141d implements C9652g.C9658b {

        /* renamed from: a */
        private boolean f22296a = false;

        /* renamed from: b */
        private int f22297b;

        /* renamed from: c */
        private final String f22298c;

        /* renamed from: d */
        private final String f22299d;

        /* renamed from: e */
        private final String f22300e;

        /* renamed from: f */
        private CampaignEx f22301f;

        /* renamed from: g */
        private C9147i f22302g;

        /* renamed from: h */
        private Handler f22303h;

        /* renamed from: i */
        private CopyOnWriteArrayList<CampaignEx> f22304i;

        /* renamed from: j */
        private final long f22305j;

        public C9141d(int i, String str, String str2, String str3, CampaignEx campaignEx, C9147i iVar, Handler handler, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f22297b = i;
            this.f22298c = str;
            this.f22299d = str2;
            this.f22300e = str3;
            this.f22301f = campaignEx;
            this.f22302g = iVar;
            this.f22303h = handler;
            this.f22304i = copyOnWriteArrayList;
            this.f22305j = System.currentTimeMillis();
        }

        /* renamed from: a */
        public final void mo61325a(boolean z) {
            this.f22296a = z;
        }

        /* renamed from: a */
        public final void mo58372a(String str) {
            C9664i.m27564a().mo63679b(str, true);
            int i = this.f22297b;
            if (i == 313) {
                Message obtain = Message.obtain();
                obtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22299d);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f22298c);
                bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f22300e);
                bundle.putString("url", str);
                obtain.setData(bundle);
                this.f22303h.sendMessage(obtain);
            } else if (i == 497) {
                Message obtain2 = Message.obtain();
                obtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22299d);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f22298c);
                bundle2.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f22300e);
                bundle2.putString("url", str);
                obtain2.setData(bundle2);
                this.f22303h.sendMessage(obtain2);
                if (this.f22296a) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f22305j;
                    try {
                        C8468m mVar = new C8468m("2000043", 20, currentTimeMillis + "", str, this.f22301f.getId(), this.f22299d, "", "2");
                        mVar.mo57840k(this.f22301f.getRequestId());
                        mVar.mo57842l(this.f22301f.getRequestIdNotice());
                        mVar.mo57846n(this.f22301f.getId());
                        mVar.mo57819b(this.f22301f.getAdSpaceT());
                        if (this.f22301f.getAdType() == 287) {
                            mVar.mo57834h("3");
                        } else if (this.f22301f.getAdType() == 94) {
                            mVar.mo57834h("1");
                        }
                        C8580c.m24606a(mVar, this.f22299d);
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            C8672v.m24878d("RewardCampaignsResourceManager", e.getLocalizedMessage());
                        }
                    }
                }
            } else if (i == 859) {
                Message obtain3 = Message.obtain();
                obtain3.what = 105;
                Bundle bundle3 = new Bundle();
                bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22299d);
                bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f22298c);
                bundle3.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f22300e);
                obtain3.setData(bundle3);
                this.f22303h.sendMessage(obtain3);
                C9147i iVar = this.f22302g;
                if (iVar != null) {
                    iVar.mo61300a(this.f22298c, this.f22299d, this.f22300e, str);
                }
            }
        }

        /* renamed from: a */
        public final void mo58373a(String str, String str2) {
            C9664i.m27564a().mo63679b(str, false);
            int i = this.f22297b;
            if (i == 313) {
                Message obtain = Message.obtain();
                obtain.what = ErrorCode.DIFFERENT_LINEARITY_EXPECTED_ERROR;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22299d);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f22298c);
                bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f22300e);
                bundle.putString("url", str);
                bundle.putString("message", str2);
                obtain.setData(bundle);
                this.f22303h.sendMessage(obtain);
            } else if (i == 497) {
                Message obtain2 = Message.obtain();
                obtain2.what = ErrorCode.DIFFERENT_LINEARITY_EXPECTED_ERROR;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22299d);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f22298c);
                bundle2.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f22300e);
                bundle2.putString("url", str);
                bundle2.putString("message", str2);
                obtain2.setData(bundle2);
                this.f22303h.sendMessage(obtain2);
                if (this.f22296a) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f22305j;
                    try {
                        C8468m mVar = new C8468m("2000043", 21, currentTimeMillis + "", str, this.f22301f.getId(), this.f22299d, "url download failed", "2");
                        mVar.mo57840k(this.f22301f.getRequestId());
                        mVar.mo57842l(this.f22301f.getRequestIdNotice());
                        mVar.mo57846n(this.f22301f.getId());
                        mVar.mo57819b(this.f22301f.getAdSpaceT());
                        if (this.f22301f.getAdType() == 287) {
                            mVar.mo57834h("3");
                        } else if (this.f22301f.getAdType() == 94) {
                            mVar.mo57834h("1");
                        }
                        C8580c.m24606a(mVar, this.f22299d);
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            C8672v.m24878d("RewardCampaignsResourceManager", e.getLocalizedMessage());
                        }
                    }
                }
            } else if (i == 859) {
                Message obtain3 = Message.obtain();
                obtain3.what = ErrorCode.INLINE_CATEGORY_VIOLATES_BLOCKED_CATEGORIES_ERROR;
                Bundle bundle3 = new Bundle();
                bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22299d);
                bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f22298c);
                bundle3.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f22300e);
                bundle3.putString("message", str2);
                obtain3.setData(bundle3);
                this.f22303h.sendMessage(obtain3);
                C9147i iVar = this.f22302g;
                if (iVar != null) {
                    iVar.mo61301a(this.f22298c, this.f22299d, this.f22300e, str, str2);
                }
            }
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.c$h */
    /* compiled from: RewardCampaignsResourceManager */
    private static final class C9146h extends Handler {

        /* renamed from: a */
        private Context f22329a;

        /* renamed from: b */
        private ConcurrentHashMap<String, C9140c> f22330b = new ConcurrentHashMap<>();

        /* renamed from: c */
        private ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> f22331c = new ConcurrentHashMap<>();

        public C9146h(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final void mo61329a(String str, String str2, String str3, C9140c cVar) {
            ConcurrentHashMap<String, C9140c> concurrentHashMap = this.f22330b;
            concurrentHashMap.put(str2 + "_" + str3, cVar);
        }

        /* renamed from: a */
        public final void mo61328a(Context context) {
            this.f22329a = context;
        }

        /* renamed from: a */
        public final void mo61330a(String str, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f22331c.put(str, copyOnWriteArrayList);
        }

        public final void handleMessage(Message message) {
            boolean z;
            String str;
            Message message2 = message;
            Bundle data = message.getData();
            String string = data.getString(MBridgeConstans.PLACEMENT_ID);
            String string2 = data.getString(MBridgeConstans.PROPERTIES_UNIT_ID);
            String string3 = data.getString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID);
            String str2 = string2 + "_" + string3;
            C9138a aVar = (C9138a) C9133c.f22238c.get(str2);
            C9140c cVar = this.f22330b.get(str2);
            CopyOnWriteArrayList copyOnWriteArrayList = this.f22331c.get(str2);
            int i = message2.what;
            switch (i) {
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                    break;
                default:
                    switch (i) {
                        case 200:
                        case ErrorCode.DIFFERENT_LINEARITY_EXPECTED_ERROR /*201*/:
                        case ErrorCode.DIFFERENT_SIZE_EXPECTED_ERROR /*203*/:
                        case ErrorCode.INLINE_CATEGORY_VIOLATES_BLOCKED_CATEGORIES_ERROR /*205*/:
                            if (aVar != null && cVar != null) {
                                String string4 = data.getString("message");
                                if (string4 == null) {
                                    string4 = "";
                                }
                                String str3 = "resource download failed " + C9133c.m25983b(message2.what) + " " + string4;
                                CampaignEx campaignEx = null;
                                if (aVar.f22274h != null && aVar.f22274h.size() > 0) {
                                    campaignEx = aVar.f22274h.get(0);
                                }
                                try {
                                    if (!aVar.f22267a || aVar.f22275i == null) {
                                        str = "resource download failed ";
                                        try {
                                            if (C9645c.getInstance().mo63657a(94, aVar.f22271e, aVar.f22268b, aVar.f22270d, aVar.f22267a, aVar.f22269c, copyOnWriteArrayList)) {
                                                cVar.mo61294a(string, string2, string3, aVar.f22274h);
                                            } else {
                                                if (!(campaignEx == null || campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0)) {
                                                    int i2 = message2.what;
                                                    if (i2 != 200) {
                                                        if (i2 != 201) {
                                                            if (i2 != 203) {
                                                                if (i2 == 205) {
                                                                    if (campaignEx.getRsIgnoreCheckRule().contains(3)) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if (campaignEx.getRsIgnoreCheckRule().contains(1)) {
                                                                return;
                                                            }
                                                        } else if (campaignEx.getRsIgnoreCheckRule().contains(2)) {
                                                            return;
                                                        }
                                                    } else if (campaignEx.getRsIgnoreCheckRule().contains(0)) {
                                                        return;
                                                    }
                                                }
                                                cVar.mo61295a(string, string2, string3, aVar.f22274h, str3);
                                            }
                                            this.f22330b.remove(str2);
                                            C9133c.f22238c.remove(str2);
                                            this.f22331c.remove(str2);
                                            return;
                                        } catch (Exception e) {
                                            e = e;
                                            cVar.mo61295a(string, string2, string3, aVar.f22274h, str + e.getMessage());
                                            return;
                                        }
                                    } else if (aVar.f22269c == 1) {
                                        if (!(campaignEx == null || campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0)) {
                                            int i3 = message2.what;
                                            if (i3 != 200) {
                                                if (i3 != 201) {
                                                    if (i3 != 203) {
                                                        if (i3 == 205) {
                                                            if (!campaignEx.getRsIgnoreCheckRule().contains(3)) {
                                                                if (aVar.f22274h != null && aVar.f22274h.size() > 0) {
                                                                    CampaignEx campaignEx2 = aVar.f22274h.get(0);
                                                                    if (campaignEx2.getCMPTEntryUrl().equals(campaignEx2.getendcard_url()) && campaignEx.getRsIgnoreCheckRule().contains(2)) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else {
                                                                return;
                                                            }
                                                        }
                                                    } else if (campaignEx.getRsIgnoreCheckRule().contains(1)) {
                                                        return;
                                                    }
                                                } else if (campaignEx.getRsIgnoreCheckRule().contains(2)) {
                                                    return;
                                                }
                                            } else if (campaignEx.getRsIgnoreCheckRule().contains(0)) {
                                                return;
                                            }
                                        }
                                        cVar.mo61295a(string, string2, string3, aVar.f22274h, str3);
                                        this.f22330b.remove(str2);
                                        C9133c.f22238c.remove(str2);
                                        this.f22331c.remove(str2);
                                        return;
                                    } else {
                                        String string5 = data.getString("url");
                                        int i4 = message2.what;
                                        if (i4 != 200) {
                                            if (i4 != 201) {
                                                if (i4 != 203) {
                                                    if (i4 == 205) {
                                                        if (campaignEx == null || campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(3)) {
                                                            aVar.f22275i.clear();
                                                            C9133c.f22238c.remove(str2);
                                                            C9133c.f22238c.put(str2, aVar);
                                                        } else {
                                                            C8672v.m24876b("RewardCampaignsResourceManager", "Is TPL but download BTL Template fail but hit ignoreCheckRule");
                                                            return;
                                                        }
                                                    }
                                                } else if (campaignEx == null || campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(1)) {
                                                    for (int i5 = 0; i5 < aVar.f22275i.size(); i5++) {
                                                        CampaignEx campaignEx3 = aVar.f22275i.get(i5);
                                                        if (campaignEx3.getRewardTemplateMode() != null && campaignEx3.getRewardTemplateMode().mo57576e().equals(string5)) {
                                                            aVar.f22275i.remove(i5);
                                                        }
                                                    }
                                                    C9133c.f22238c.remove(str2);
                                                    C9133c.f22238c.put(str2, aVar);
                                                } else {
                                                    C8672v.m24876b("RewardCampaignsResourceManager", "Is TPL but download template fail but hit ignoreCheckRule");
                                                    return;
                                                }
                                            } else if (campaignEx == null || campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(2)) {
                                                for (int i6 = 0; i6 < aVar.f22275i.size(); i6++) {
                                                    CampaignEx campaignEx4 = aVar.f22275i.get(i6);
                                                    if (campaignEx4.getRewardTemplateMode() != null && campaignEx4.getRewardTemplateMode().mo57575d().equals(string5)) {
                                                        aVar.f22275i.remove(i6);
                                                    }
                                                    if (!TextUtils.isEmpty(campaignEx4.getendcard_url()) && campaignEx4.getendcard_url().equals(string5)) {
                                                        aVar.f22275i.remove(i6);
                                                    }
                                                }
                                                C9133c.f22238c.remove(str2);
                                                C9133c.f22238c.put(str2, aVar);
                                            } else {
                                                C8672v.m24876b("RewardCampaignsResourceManager", "Is TPL but download endcard fail but hit ignoreCheckRule");
                                                return;
                                            }
                                        } else if (campaignEx == null || campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(0)) {
                                            for (int i7 = 0; i7 < aVar.f22275i.size(); i7++) {
                                                if (aVar.f22275i.get(i7).getVideoUrlEncode().equals(string5)) {
                                                    aVar.f22275i.remove(i7);
                                                }
                                            }
                                            C9133c.f22238c.remove(str2);
                                            C9133c.f22238c.put(str2, aVar);
                                        } else {
                                            C8672v.m24876b("RewardCampaignsResourceManager", "Is TPL but  video download fail but hit ignoreCheckRule");
                                            return;
                                        }
                                        C9645c instance = C9645c.getInstance();
                                        String str4 = aVar.f22271e;
                                        String str5 = "resource download failed ";
                                        try {
                                            if (instance.mo63657a(94, str4, aVar.f22268b, aVar.f22270d, aVar.f22267a, aVar.f22269c, copyOnWriteArrayList)) {
                                                cVar.mo61294a(string, string2, string3, aVar.f22274h);
                                                this.f22330b.remove(str2);
                                                C9133c.f22238c.remove(str2);
                                                this.f22331c.remove(str2);
                                                return;
                                            } else if (aVar.f22275i.size() == 0) {
                                                str4 = str5;
                                                try {
                                                    cVar.mo61295a(string, string2, string3, aVar.f22274h, str3);
                                                    this.f22330b.remove(str2);
                                                    C9133c.f22238c.remove(str2);
                                                    this.f22331c.remove(str2);
                                                    return;
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    str = str4;
                                                    cVar.mo61295a(string, string2, string3, aVar.f22274h, str + e.getMessage());
                                                    return;
                                                }
                                            } else {
                                                return;
                                            }
                                        } catch (Exception e3) {
                                            e = e3;
                                            str = str5;
                                            cVar.mo61295a(string, string2, string3, aVar.f22274h, str + e.getMessage());
                                            return;
                                        }
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    str = "resource download failed ";
                                    cVar.mo61295a(string, string2, string3, aVar.f22274h, str + e.getMessage());
                                    return;
                                }
                            } else {
                                return;
                            }
                        case ErrorCode.DIFFERENT_DURATION_EXPECTED_ERROR /*202*/:
                        case 204:
                            break;
                        default:
                            return;
                    }
            }
            if (aVar != null && cVar != null) {
                try {
                    z = C9645c.getInstance().mo63657a(94, aVar.f22271e, aVar.f22268b, aVar.f22270d, aVar.f22267a, aVar.f22269c, copyOnWriteArrayList);
                } catch (Exception e5) {
                    if (MBridgeConstans.DEBUG) {
                        C8672v.m24878d("RewardCampaignsResourceManager", e5.getLocalizedMessage());
                    }
                    z = false;
                }
                if (z) {
                    cVar.mo61294a(string, string2, string3, aVar.f22274h);
                    this.f22330b.remove(str2);
                    C9133c.f22238c.remove(str2);
                    this.f22331c.remove(str2);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003c, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x005a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00d4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x0151 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0182 A[Catch:{ Exception -> 0x01e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0188 A[Catch:{ Exception -> 0x01e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01f7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo61321a(boolean r24, android.os.Handler r25, boolean r26, boolean r27, com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r28, java.lang.String r29, int r30, com.mbridge.msdk.foundation.entity.CampaignEx r31, java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, com.mbridge.msdk.videocommon.p375d.C9640c r38, com.mbridge.msdk.reward.adapter.C9133c.C9148j r39) {
        /*
            r23 = this;
            r15 = r29
            r13 = r31
            r0 = r32
            r14 = r35
            r12 = r36
            monitor-enter(r23)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x020d }
            r1.<init>()     // Catch:{ all -> 0x020d }
            r1.append(r14)     // Catch:{ all -> 0x020d }
            java.lang.String r2 = "_"
            r1.append(r2)     // Catch:{ all -> 0x020d }
            r1.append(r15)     // Catch:{ all -> 0x020d }
            java.lang.String r17 = r1.toString()     // Catch:{ all -> 0x020d }
            long r18 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x020d }
            boolean r1 = com.mbridge.msdk.foundation.tools.C8677z.m24948h((java.lang.String) r29)     // Catch:{ Exception -> 0x01e6 }
            if (r1 == 0) goto L_0x003d
            if (r39 == 0) goto L_0x003b
            r7 = 0
            r1 = r39
            r2 = r17
            r3 = r34
            r4 = r35
            r5 = r36
            r6 = r29
            r1.mo61297a(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x01e6 }
        L_0x003b:
            monitor-exit(r23)
            return
        L_0x003d:
            com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x005a }
            android.content.Context r2 = r1.mo56913g()     // Catch:{ Exception -> 0x005a }
            java.lang.String r3 = "start preload template "
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x005a }
            long r8 = r4 - r18
            r1 = r31
            r4 = r35
            r5 = r27
            r6 = r36
            r7 = r37
            com.mbridge.msdk.reward.p343b.C9176a.m26122a(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x005a }
        L_0x005a:
            com.mbridge.msdk.videocommon.a$a r11 = new com.mbridge.msdk.videocommon.a$a     // Catch:{ Exception -> 0x01e6 }
            r11.<init>()     // Catch:{ Exception -> 0x01e6 }
            com.mbridge.msdk.reward.adapter.c r1 = com.mbridge.msdk.reward.adapter.C9133c.C9153m.f22381a     // Catch:{ Exception -> 0x01e6 }
            r2 = 0
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r1 = r1.m25975a((boolean) r2)     // Catch:{ Exception -> 0x01e6 }
            if (r1 != 0) goto L_0x0175
            r1 = 1
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r2 = new com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView     // Catch:{ Exception -> 0x00f8, all -> 0x007b }
            com.mbridge.msdk.foundation.controller.a r3 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x00f8, all -> 0x007b }
            android.content.Context r3 = r3.mo56913g()     // Catch:{ Exception -> 0x00f8, all -> 0x007b }
            r2.<init>(r3)     // Catch:{ Exception -> 0x00f8, all -> 0x007b }
            r10 = r2
            goto L_0x0176
        L_0x007b:
            r0 = move-exception
            if (r39 == 0) goto L_0x00f6
            r11.mo63500a((boolean) r1)     // Catch:{ Exception -> 0x01e6 }
            com.mbridge.msdk.videocommon.download.i r2 = com.mbridge.msdk.videocommon.download.C9664i.m27564a()     // Catch:{ Exception -> 0x01e6 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e6 }
            r3.<init>()     // Catch:{ Exception -> 0x01e6 }
            r3.append(r14)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r4 = "_"
            r3.append(r4)     // Catch:{ Exception -> 0x01e6 }
            r3.append(r12)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r4 = "_"
            r3.append(r4)     // Catch:{ Exception -> 0x01e6 }
            r3.append(r15)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x01e6 }
            r2.mo63683d(r3, r1)     // Catch:{ Exception -> 0x01e6 }
            com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x00d4 }
            android.content.Context r2 = r1.mo56913g()     // Catch:{ Exception -> 0x00d4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d4 }
            r1.<init>()     // Catch:{ Exception -> 0x00d4 }
            java.lang.String r3 = "WebView exception: "
            r1.append(r3)     // Catch:{ Exception -> 0x00d4 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x00d4 }
            r1.append(r0)     // Catch:{ Exception -> 0x00d4 }
            java.lang.String r3 = r1.toString()     // Catch:{ Exception -> 0x00d4 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00d4 }
            long r8 = r0 - r18
            r1 = r31
            r4 = r35
            r5 = r27
            r6 = r36
            r7 = r37
            com.mbridge.msdk.reward.p343b.C9176a.m26122a(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00d4 }
        L_0x00d4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e6 }
            r0.<init>()     // Catch:{ Exception -> 0x01e6 }
            r0.append(r14)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r1 = "_"
            r0.append(r1)     // Catch:{ Exception -> 0x01e6 }
            r0.append(r15)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r2 = r0.toString()     // Catch:{ Exception -> 0x01e6 }
            r1 = r39
            r3 = r34
            r4 = r35
            r5 = r36
            r6 = r29
            r7 = r11
            r1.mo61297a(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x01e6 }
        L_0x00f6:
            monitor-exit(r23)
            return
        L_0x00f8:
            r0 = move-exception
            if (r39 == 0) goto L_0x0173
            r11.mo63500a((boolean) r1)     // Catch:{ Exception -> 0x01e6 }
            com.mbridge.msdk.videocommon.download.i r2 = com.mbridge.msdk.videocommon.download.C9664i.m27564a()     // Catch:{ Exception -> 0x01e6 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e6 }
            r3.<init>()     // Catch:{ Exception -> 0x01e6 }
            r3.append(r14)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r4 = "_"
            r3.append(r4)     // Catch:{ Exception -> 0x01e6 }
            r3.append(r12)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r4 = "_"
            r3.append(r4)     // Catch:{ Exception -> 0x01e6 }
            r3.append(r15)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x01e6 }
            r2.mo63683d(r3, r1)     // Catch:{ Exception -> 0x01e6 }
            com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x0151 }
            android.content.Context r2 = r1.mo56913g()     // Catch:{ Exception -> 0x0151 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0151 }
            r1.<init>()     // Catch:{ Exception -> 0x0151 }
            java.lang.String r3 = "WebView exception: "
            r1.append(r3)     // Catch:{ Exception -> 0x0151 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x0151 }
            r1.append(r0)     // Catch:{ Exception -> 0x0151 }
            java.lang.String r3 = r1.toString()     // Catch:{ Exception -> 0x0151 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0151 }
            long r8 = r0 - r18
            r1 = r31
            r4 = r35
            r5 = r27
            r6 = r36
            r7 = r37
            com.mbridge.msdk.reward.p343b.C9176a.m26122a(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0151 }
        L_0x0151:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e6 }
            r0.<init>()     // Catch:{ Exception -> 0x01e6 }
            r0.append(r14)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r1 = "_"
            r0.append(r1)     // Catch:{ Exception -> 0x01e6 }
            r0.append(r15)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r2 = r0.toString()     // Catch:{ Exception -> 0x01e6 }
            r1 = r39
            r3 = r34
            r4 = r35
            r5 = r36
            r6 = r29
            r7 = r11
            r1.mo61297a(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x01e6 }
        L_0x0173:
            monitor-exit(r23)
            return
        L_0x0175:
            r10 = r1
        L_0x0176:
            r11.mo63498a((com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView) r10)     // Catch:{ Exception -> 0x01e6 }
            r1 = 0
            if (r0 == 0) goto L_0x0188
            int r2 = r32.size()     // Catch:{ Exception -> 0x01e6 }
            if (r2 <= 0) goto L_0x0188
            com.mbridge.msdk.video.signal.a.j r2 = new com.mbridge.msdk.video.signal.a.j     // Catch:{ Exception -> 0x01e6 }
            r2.<init>(r1, r13, r0)     // Catch:{ Exception -> 0x01e6 }
            goto L_0x018d
        L_0x0188:
            com.mbridge.msdk.video.signal.a.j r2 = new com.mbridge.msdk.video.signal.a.j     // Catch:{ Exception -> 0x01e6 }
            r2.<init>(r1, r13)     // Catch:{ Exception -> 0x01e6 }
        L_0x018d:
            r1 = r30
            r9 = r2
            r9.mo63239a((int) r1)     // Catch:{ Exception -> 0x01e6 }
            r9.mo63244a((java.lang.String) r14)     // Catch:{ Exception -> 0x01e6 }
            r1 = r38
            r9.mo63243a((com.mbridge.msdk.videocommon.p375d.C9640c) r1)     // Catch:{ Exception -> 0x01e6 }
            r1 = r24
            r9.mo63281d((boolean) r1)     // Catch:{ Exception -> 0x01e6 }
            com.mbridge.msdk.reward.adapter.c$k r8 = new com.mbridge.msdk.reward.adapter.c$k     // Catch:{ Exception -> 0x01e6 }
            r3 = 0
            r1 = r8
            r2 = r25
            r4 = r26
            r5 = r27
            r6 = r36
            r7 = r39
            r20 = r8
            r8 = r28
            r21 = r9
            r9 = r29
            r22 = r10
            r10 = r34
            r16 = r11
            r11 = r35
            r12 = r16
            r13 = r31
            r14 = r32
            r15 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x01e2 }
            r0 = r20
            r1 = r22
            r1.setWebViewListener(r0)     // Catch:{ Exception -> 0x01e2 }
            r2 = r21
            r1.setObject(r2)     // Catch:{ Exception -> 0x01e2 }
            r0 = r33
            r1.loadUrl(r0)     // Catch:{ Exception -> 0x01e2 }
            r5 = r36
            r1.setRid(r5)     // Catch:{ Exception -> 0x01e0 }
            goto L_0x020b
        L_0x01e0:
            r0 = move-exception
            goto L_0x01e8
        L_0x01e2:
            r0 = move-exception
            r5 = r36
            goto L_0x01e8
        L_0x01e6:
            r0 = move-exception
            r5 = r12
        L_0x01e8:
            boolean r1 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch:{ all -> 0x020d }
            if (r1 == 0) goto L_0x01f5
            java.lang.String r1 = "RewardCampaignsResourceManager"
            java.lang.String r2 = r0.getLocalizedMessage()     // Catch:{ all -> 0x020d }
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r1, r2)     // Catch:{ all -> 0x020d }
        L_0x01f5:
            if (r39 == 0) goto L_0x020b
            r7 = 0
            java.lang.String r8 = r0.getLocalizedMessage()     // Catch:{ all -> 0x020d }
            r1 = r39
            r2 = r17
            r3 = r34
            r4 = r35
            r5 = r36
            r6 = r29
            r1.mo61298a(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x020d }
        L_0x020b:
            monitor-exit(r23)
            return
        L_0x020d:
            r0 = move-exception
            monitor-exit(r23)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.C9133c.mo61321a(boolean, android.os.Handler, boolean, boolean, com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView, java.lang.String, int, com.mbridge.msdk.foundation.entity.CampaignEx, java.util.concurrent.CopyOnWriteArrayList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.mbridge.msdk.videocommon.d.c, com.mbridge.msdk.reward.adapter.c$j):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static synchronized String m25983b(int i) {
        synchronized (C9133c.class) {
            if (i == 200) {
                return "video";
            }
            if (i == 201) {
                return "zip/html";
            }
            if (i != 203) {
                return i != 205 ? "unknown" : "tpl";
            }
            return "temp";
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.c$k */
    /* compiled from: RewardCampaignsResourceManager */
    private static class C9149k extends C8853b {

        /* renamed from: a */
        private Handler f22332a;

        /* renamed from: b */
        private Runnable f22333b;

        /* renamed from: c */
        private final boolean f22334c;

        /* renamed from: d */
        private final boolean f22335d;

        /* renamed from: e */
        private String f22336e;

        /* renamed from: f */
        private final C9148j f22337f;

        /* renamed from: g */
        private final WindVaneWebView f22338g;

        /* renamed from: h */
        private final String f22339h;

        /* renamed from: i */
        private final String f22340i;

        /* renamed from: j */
        private final String f22341j;

        /* renamed from: k */
        private final C9625a.C9626a f22342k;

        /* renamed from: l */
        private final CampaignEx f22343l;

        /* renamed from: m */
        private CopyOnWriteArrayList<CampaignEx> f22344m;

        /* renamed from: n */
        private long f22345n;

        /* renamed from: o */
        private boolean f22346o;

        /* renamed from: p */
        private boolean f22347p;

        /* renamed from: q */
        private final Runnable f22348q;

        /* renamed from: r */
        private final Runnable f22349r;

        public C9149k(Handler handler, Runnable runnable, boolean z, boolean z2, String str, C9148j jVar, WindVaneWebView windVaneWebView, String str2, String str3, String str4, C9625a.C9626a aVar, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, long j) {
            Handler handler2 = handler;
            this.f22332a = handler2;
            this.f22333b = runnable;
            this.f22334c = z;
            this.f22335d = z2;
            this.f22336e = str;
            this.f22337f = jVar;
            this.f22338g = windVaneWebView;
            this.f22339h = str2;
            this.f22340i = str4;
            this.f22341j = str3;
            this.f22342k = aVar;
            this.f22343l = campaignEx;
            this.f22344m = copyOnWriteArrayList;
            this.f22345n = j;
            final C9148j jVar2 = jVar;
            C91501 r14 = r0;
            final C9625a.C9626a aVar2 = aVar;
            final String str5 = str4;
            final String str6 = str;
            final String str7 = str2;
            final CampaignEx campaignEx2 = campaignEx;
            final boolean z3 = z2;
            final long j2 = j;
            final String str8 = str3;
            C91501 r0 = new Runnable() {
                public final void run() {
                    WindVaneWebView a;
                    C9625a.C9626a aVar;
                    if (!(jVar2 == null || (aVar = aVar2) == null)) {
                        aVar.mo63500a(true);
                        C9664i a2 = C9664i.m27564a();
                        a2.mo63683d(str5 + "_" + str6 + "_" + str7, true);
                        try {
                            C9176a.m26122a(campaignEx2, C8388a.m23845e().mo56913g(), "WebView onPageFinish timeout exception after 5s", str5, z3, str6, campaignEx2.getRequestIdNotice(), System.currentTimeMillis() - j2);
                        } catch (Exception unused) {
                        }
                        C9148j jVar = jVar2;
                        jVar.mo61297a(str5 + "_" + str7, str8, str5, str6, str7, aVar2);
                    }
                    C9625a.C9626a aVar2 = aVar2;
                    if (aVar2 != null && (a = aVar2.mo63497a()) != null) {
                        try {
                            a.release();
                        } catch (Exception unused2) {
                        }
                    }
                }
            };
            this.f22349r = r14;
            this.f22348q = new Runnable() {
                public final void run() {
                    WindVaneWebView a;
                    C9625a.C9626a aVar;
                    if (!(jVar2 == null || (aVar = aVar2) == null)) {
                        aVar.mo63500a(true);
                        C9664i a2 = C9664i.m27564a();
                        a2.mo63683d(str5 + "_" + str6 + "_" + str7, true);
                        try {
                            C9176a.m26122a(campaignEx2, C8388a.m23845e().mo56913g(), "WebView readyState timeout exception after 5s", str5, z3, str6, campaignEx2.getRequestIdNotice(), System.currentTimeMillis() - j2);
                        } catch (Exception unused) {
                        }
                        C9148j jVar = jVar2;
                        jVar.mo61297a(str5 + "_" + str7, str8, str5, str6, str7, aVar2);
                    }
                    C9625a.C9626a aVar2 = aVar2;
                    if (aVar2 != null && (a = aVar2.mo63497a()) != null) {
                        try {
                            a.release();
                        } catch (Exception unused2) {
                        }
                    }
                }
            };
            if (handler2 != null) {
                handler2.postDelayed(this.f22349r, 5000);
            }
        }

        /* renamed from: a */
        public final void mo58276a(WebView webView, int i) {
            Handler handler;
            Runnable runnable;
            Runnable runnable2;
            super.mo58276a(webView, i);
            Handler handler2 = this.f22332a;
            if (!(handler2 == null || (runnable2 = this.f22348q) == null)) {
                handler2.removeCallbacks(runnable2);
            }
            Handler handler3 = this.f22332a;
            if (!(handler3 == null || (runnable = this.f22349r) == null)) {
                handler3.removeCallbacks(runnable);
            }
            if (!this.f22347p) {
                try {
                    C9176a.m26122a(this.f22343l, C8388a.m23845e().mo56913g(), "preload temp readState: " + i, this.f22340i, this.f22335d, this.f22336e, this.f22343l.getRequestIdNotice(), System.currentTimeMillis() - this.f22345n);
                } catch (Exception unused) {
                }
                String str = this.f22340i + "_" + this.f22339h;
                if (i == 1) {
                    Runnable runnable3 = this.f22333b;
                    if (!(runnable3 == null || (handler = this.f22332a) == null)) {
                        handler.removeCallbacks(runnable3);
                    }
                    C9664i.m27564a().mo63683d(this.f22340i + "_" + this.f22336e + "_" + this.f22339h, true);
                    C9625a.C9626a aVar = this.f22342k;
                    if (aVar != null) {
                        aVar.mo63500a(true);
                    }
                    if (this.f22334c) {
                        if (this.f22335d) {
                            C9625a.m27302a(287, this.f22343l.getRequestIdNotice(), this.f22342k);
                        } else {
                            C9625a.m27305b(287, this.f22343l.getRequestIdNotice(), this.f22342k);
                        }
                    } else if (this.f22335d) {
                        C9625a.m27302a(94, this.f22343l.getRequestIdNotice(), this.f22342k);
                    } else {
                        C9625a.m27305b(94, this.f22343l.getRequestIdNotice(), this.f22342k);
                    }
                    C9148j jVar = this.f22337f;
                    if (jVar != null) {
                        jVar.mo61297a(str, this.f22341j, this.f22340i, this.f22336e, this.f22339h, this.f22342k);
                    }
                } else {
                    C9148j jVar2 = this.f22337f;
                    if (jVar2 != null) {
                        jVar2.mo61298a(str, this.f22341j, this.f22340i, this.f22336e, this.f22339h, this.f22342k, "state " + i);
                    }
                }
                this.f22347p = true;
            }
        }

        /* renamed from: a */
        public final void mo58277a(WebView webView, int i, String str, String str2) {
            super.mo58277a(webView, i, str, str2);
            C9664i.m27564a().mo63683d(this.f22340i + "_" + this.f22336e + "_" + this.f22339h, false);
            try {
                C9176a.m26122a(this.f22343l, C8388a.m23845e().mo56913g(), "WebView onReceivedError exception: " + str, this.f22340i, this.f22335d, this.f22336e, this.f22343l.getRequestIdNotice(), System.currentTimeMillis() - this.f22345n);
            } catch (Exception unused) {
            }
            Handler handler = this.f22332a;
            if (handler != null) {
                if (this.f22348q != null) {
                    handler.removeCallbacks(this.f22349r);
                }
                Runnable runnable = this.f22348q;
                if (runnable != null) {
                    this.f22332a.removeCallbacks(runnable);
                }
            }
            try {
                String str3 = this.f22340i + "_" + this.f22339h;
                if (this.f22342k != null) {
                    this.f22342k.mo63500a(false);
                }
                if (this.f22337f != null) {
                    this.f22337f.mo61298a(str3, this.f22341j, this.f22340i, this.f22336e, str2, this.f22342k, str);
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    C8672v.m24878d("WindVaneWebView", e.getLocalizedMessage());
                }
            }
        }

        /* renamed from: a */
        public final void mo58278a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.mo58278a(webView, sslErrorHandler, sslError);
            C9664i.m27564a().mo63683d(this.f22340i + "_" + this.f22336e + "_" + this.f22339h, false);
            try {
                CampaignEx campaignEx = this.f22343l;
                Context g = C8388a.m23845e().mo56913g();
                StringBuilder sb = new StringBuilder();
                sb.append("WebView onReceivedSslError exception: ");
                sb.append(sslError == null ? "SSLError" : Integer.toString(sslError.getPrimaryError()));
                C9176a.m26122a(campaignEx, g, sb.toString(), this.f22340i, this.f22335d, this.f22336e, this.f22343l.getRequestIdNotice(), System.currentTimeMillis() - this.f22345n);
            } catch (Exception unused) {
            }
            Handler handler = this.f22332a;
            if (handler != null) {
                if (this.f22348q != null) {
                    handler.removeCallbacks(this.f22349r);
                }
                Runnable runnable = this.f22348q;
                if (runnable != null) {
                    this.f22332a.removeCallbacks(runnable);
                }
            }
            try {
                String str = this.f22340i + "_" + this.f22339h;
                if (this.f22342k != null) {
                    this.f22342k.mo63500a(false);
                }
                if (this.f22337f != null) {
                    this.f22337f.mo61298a(str, this.f22341j, this.f22340i, this.f22336e, this.f22339h, this.f22342k, sslError == null ? "" : Integer.toString(sslError.getPrimaryError()));
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    C8672v.m24878d("WindVaneWebView", e.getLocalizedMessage());
                }
            }
        }

        /* renamed from: a */
        public final void mo58279a(WebView webView, String str) {
            Runnable runnable;
            Handler handler;
            Runnable runnable2;
            super.mo58279a(webView, str);
            Handler handler2 = this.f22332a;
            if (!(handler2 == null || (runnable2 = this.f22349r) == null)) {
                handler2.removeCallbacks(runnable2);
            }
            if (!this.f22346o) {
                try {
                    C9176a.m26122a(this.f22343l, C8388a.m23845e().mo56913g(), "preload temp onPageFinish", this.f22340i, this.f22335d, this.f22336e, this.f22343l.getRequestIdNotice(), System.currentTimeMillis() - this.f22345n);
                } catch (Exception unused) {
                }
                if (!str.contains("wfr=1")) {
                    String str2 = this.f22340i + "_" + this.f22339h;
                    C9664i.m27564a().mo63683d(this.f22340i + "_" + this.f22336e + "_" + this.f22339h, true);
                    Runnable runnable3 = this.f22333b;
                    if (!(runnable3 == null || (handler = this.f22332a) == null)) {
                        handler.removeCallbacks(runnable3);
                    }
                    C9625a.C9626a aVar = this.f22342k;
                    if (aVar != null) {
                        aVar.mo63500a(true);
                    }
                    if (this.f22334c) {
                        if (this.f22343l.isBidCampaign()) {
                            C9625a.m27302a(287, this.f22343l.getRequestIdNotice(), this.f22342k);
                        } else {
                            C9625a.m27305b(287, this.f22343l.getRequestIdNotice(), this.f22342k);
                        }
                    } else if (this.f22343l.isBidCampaign()) {
                        C9625a.m27302a(94, this.f22343l.getRequestIdNotice(), this.f22342k);
                    } else {
                        C9625a.m27305b(94, this.f22343l.getRequestIdNotice(), this.f22342k);
                    }
                    C9148j jVar = this.f22337f;
                    if (jVar != null) {
                        jVar.mo61297a(str2, this.f22341j, this.f22340i, this.f22336e, this.f22339h, this.f22342k);
                    }
                } else {
                    Handler handler3 = this.f22332a;
                    if (!(handler3 == null || (runnable = this.f22348q) == null)) {
                        handler3.postDelayed(runnable, 5000);
                    }
                }
                C8887g.m25669a().mo58686a(webView);
                this.f22346o = true;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:9|10|11|12|(1:14)|15|(1:37)(3:19|(3:23|(5:26|(4:29|(2:33|69)|34|27)|68|35|24)|67)|36)|38|39|40|41|42|(5:43|44|45|46|47)) */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01ce, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01cf, code lost:
        r6 = r14;
        r3 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r42.mo61298a(r21, r33, r34, r31, r35, (com.mbridge.msdk.videocommon.C9625a.C9626a) null, r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01ef, code lost:
        com.mbridge.msdk.foundation.tools.C8672v.m24878d("RewardCampaignsResourceManager", r0.getLocalizedMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0046, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0064 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0074 A[Catch:{ Exception -> 0x01ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a0 A[Catch:{ Exception -> 0x01ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00fd A[Catch:{ Exception -> 0x01ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01ef  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo61322a(boolean r27, android.os.Handler r28, boolean r29, boolean r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, int r36, com.mbridge.msdk.foundation.entity.CampaignEx r37, java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r38, java.lang.String r39, java.lang.String r40, com.mbridge.msdk.videocommon.p375d.C9640c r41, com.mbridge.msdk.reward.adapter.C9133c.C9148j r42, boolean r43) {
        /*
            r26 = this;
            r1 = r26
            r15 = r31
            r14 = r34
            r0 = r37
            r13 = r38
            r12 = r43
            monitor-enter(r26)
            r1.f22241d = r12     // Catch:{ all -> 0x01fa }
            long r19 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01fa }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fa }
            r2.<init>()     // Catch:{ all -> 0x01fa }
            r2.append(r14)     // Catch:{ all -> 0x01fa }
            java.lang.String r3 = "_"
            r2.append(r3)     // Catch:{ all -> 0x01fa }
            r11 = r35
            r2.append(r11)     // Catch:{ all -> 0x01fa }
            java.lang.String r21 = r2.toString()     // Catch:{ all -> 0x01fa }
            r1.f22241d = r12     // Catch:{ all -> 0x01fa }
            boolean r2 = com.mbridge.msdk.foundation.tools.C8677z.m24948h((java.lang.String) r35)     // Catch:{ all -> 0x01fa }
            if (r2 == 0) goto L_0x0047
            if (r42 == 0) goto L_0x0045
            r0 = 0
            r36 = r42
            r37 = r21
            r38 = r33
            r39 = r34
            r40 = r31
            r41 = r35
            r42 = r0
            r36.mo61297a(r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x01fa }
        L_0x0045:
            monitor-exit(r26)
            return
        L_0x0047:
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x0064 }
            android.content.Context r3 = r2.mo56913g()     // Catch:{ Exception -> 0x0064 }
            java.lang.String r4 = "start preload tpl"
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0064 }
            long r9 = r5 - r19
            r2 = r37
            r5 = r40
            r6 = r30
            r7 = r31
            r8 = r32
            com.mbridge.msdk.reward.p343b.C9176a.m26122a(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0064 }
        L_0x0064:
            com.mbridge.msdk.videocommon.a$a r10 = new com.mbridge.msdk.videocommon.a$a     // Catch:{ Exception -> 0x01ce }
            r10.<init>()     // Catch:{ Exception -> 0x01ce }
            com.mbridge.msdk.reward.adapter.c r2 = com.mbridge.msdk.reward.adapter.C9133c.C9153m.f22381a     // Catch:{ Exception -> 0x01ce }
            r3 = 1
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r2 = r2.m25975a((boolean) r3)     // Catch:{ Exception -> 0x01ce }
            if (r2 != 0) goto L_0x0081
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r2 = new com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView     // Catch:{ Exception -> 0x01ce }
            com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x01ce }
            android.content.Context r4 = r4.mo56913g()     // Catch:{ Exception -> 0x01ce }
            r2.<init>(r4)     // Catch:{ Exception -> 0x01ce }
        L_0x0081:
            r9 = r2
            r10.mo63498a((com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView) r9)     // Catch:{ Exception -> 0x01ce }
            com.mbridge.msdk.video.bt.a.c r2 = com.mbridge.msdk.video.p347bt.p348a.C9261c.m26212a()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r8 = r2.mo62511b()     // Catch:{ Exception -> 0x01ce }
            com.mbridge.msdk.video.bt.a.c r2 = com.mbridge.msdk.video.p347bt.p348a.C9261c.m26212a()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r7 = r2.mo62511b()     // Catch:{ Exception -> 0x01ce }
            r10.mo63499a((java.lang.String) r7)     // Catch:{ Exception -> 0x01ce }
            if (r13 == 0) goto L_0x00fd
            int r4 = r38.size()     // Catch:{ Exception -> 0x01ce }
            if (r4 <= 0) goto L_0x00fd
            com.mbridge.msdk.videocommon.download.c r4 = com.mbridge.msdk.videocommon.download.C9645c.getInstance()     // Catch:{ Exception -> 0x01ce }
            java.util.List r4 = r4.mo63653a((java.lang.String) r14)     // Catch:{ Exception -> 0x01ce }
            if (r4 == 0) goto L_0x00f6
            int r5 = r4.size()     // Catch:{ Exception -> 0x01ce }
            if (r5 <= 0) goto L_0x00f6
            r5 = 0
        L_0x00b1:
            int r6 = r38.size()     // Catch:{ Exception -> 0x01ce }
            if (r5 >= r6) goto L_0x00f6
            java.lang.Object r6 = r13.get(r5)     // Catch:{ Exception -> 0x01ce }
            com.mbridge.msdk.foundation.entity.CampaignEx r6 = (com.mbridge.msdk.foundation.entity.CampaignEx) r6     // Catch:{ Exception -> 0x01ce }
            java.util.Iterator r16 = r4.iterator()     // Catch:{ Exception -> 0x01ce }
        L_0x00c1:
            boolean r17 = r16.hasNext()     // Catch:{ Exception -> 0x01ce }
            if (r17 == 0) goto L_0x00f2
            java.lang.Object r17 = r16.next()     // Catch:{ Exception -> 0x01ce }
            com.mbridge.msdk.foundation.entity.CampaignEx r17 = (com.mbridge.msdk.foundation.entity.CampaignEx) r17     // Catch:{ Exception -> 0x01ce }
            java.lang.String r2 = r17.getId()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r3 = r6.getId()     // Catch:{ Exception -> 0x01ce }
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x01ce }
            if (r2 == 0) goto L_0x00f0
            java.lang.String r2 = r17.getRequestId()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r3 = r6.getRequestId()     // Catch:{ Exception -> 0x01ce }
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x01ce }
            if (r2 == 0) goto L_0x00f0
            r2 = 1
            r6.setReady(r2)     // Catch:{ Exception -> 0x01ce }
            r13.set(r5, r6)     // Catch:{ Exception -> 0x01ce }
        L_0x00f0:
            r3 = 1
            goto L_0x00c1
        L_0x00f2:
            int r5 = r5 + 1
            r3 = 1
            goto L_0x00b1
        L_0x00f6:
            com.mbridge.msdk.video.signal.a.j r2 = new com.mbridge.msdk.video.signal.a.j     // Catch:{ Exception -> 0x01ce }
            r3 = 0
            r2.<init>(r3, r0, r13)     // Catch:{ Exception -> 0x01ce }
            goto L_0x0103
        L_0x00fd:
            com.mbridge.msdk.video.signal.a.j r2 = new com.mbridge.msdk.video.signal.a.j     // Catch:{ Exception -> 0x01ce }
            r3 = 0
            r2.<init>(r3, r0)     // Catch:{ Exception -> 0x01ce }
        L_0x0103:
            r4 = r36
            r6 = r2
            r6.mo63239a((int) r4)     // Catch:{ Exception -> 0x01ce }
            r2 = r40
            r6.mo63244a((java.lang.String) r2)     // Catch:{ Exception -> 0x01ce }
            r6.mo63278c((java.lang.String) r7)     // Catch:{ Exception -> 0x01ce }
            r6.mo63280d((java.lang.String) r8)     // Catch:{ Exception -> 0x01ce }
            r2 = 1
            r6.mo63279c((boolean) r2)     // Catch:{ Exception -> 0x01ce }
            r3 = r41
            r6.mo63243a((com.mbridge.msdk.videocommon.p375d.C9640c) r3)     // Catch:{ Exception -> 0x01ce }
            r2 = r27
            r6.mo63281d((boolean) r2)     // Catch:{ Exception -> 0x01ce }
            com.mbridge.msdk.reward.adapter.c$b r5 = new com.mbridge.msdk.reward.adapter.c$b     // Catch:{ Exception -> 0x01ce }
            r16 = 0
            r32 = r5
            r5 = r16
            r2 = r32
            r3 = r27
            r4 = r28
            r22 = r6
            r6 = r29
            r23 = r7
            r7 = r30
            r24 = r8
            r8 = r36
            r25 = r9
            r9 = r35
            r16 = r10
            r10 = r33
            r11 = r34
            r12 = r31
            r13 = r16
            r14 = r37
            r15 = r38
            r16 = r41
            r17 = r42
            r18 = r43
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x01c8 }
            r0 = r32
            r2 = r25
            r2.setWebViewListener(r0)     // Catch:{ Exception -> 0x01c8 }
            r0 = r22
            r2.setObject(r0)     // Catch:{ Exception -> 0x01c8 }
            r0 = r39
            r2.loadUrl(r0)     // Catch:{ Exception -> 0x01c8 }
            r3 = r31
            r2.setRid(r3)     // Catch:{ Exception -> 0x01c6 }
            com.mbridge.msdk.video.bt.module.MBridgeBTRootLayout r0 = new com.mbridge.msdk.video.bt.module.MBridgeBTRootLayout     // Catch:{ Exception -> 0x01c6 }
            com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x01c6 }
            android.content.Context r4 = r4.mo56913g()     // Catch:{ Exception -> 0x01c6 }
            r0.<init>(r4)     // Catch:{ Exception -> 0x01c6 }
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams     // Catch:{ Exception -> 0x01c6 }
            r5 = -1
            r4.<init>(r5, r5)     // Catch:{ Exception -> 0x01c6 }
            r0.setLayoutParams(r4)     // Catch:{ Exception -> 0x01c6 }
            r4 = r24
            r0.setInstanceId(r4)     // Catch:{ Exception -> 0x01c6 }
            r6 = r34
            r0.setUnitId(r6)     // Catch:{ Exception -> 0x01c4 }
            com.mbridge.msdk.video.bt.module.MBridgeBTLayout r7 = new com.mbridge.msdk.video.bt.module.MBridgeBTLayout     // Catch:{ Exception -> 0x01c4 }
            com.mbridge.msdk.foundation.controller.a r8 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x01c4 }
            android.content.Context r8 = r8.mo56913g()     // Catch:{ Exception -> 0x01c4 }
            r7.<init>(r8)     // Catch:{ Exception -> 0x01c4 }
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams     // Catch:{ Exception -> 0x01c4 }
            r8.<init>(r5, r5)     // Catch:{ Exception -> 0x01c4 }
            r7.setLayoutParams(r8)     // Catch:{ Exception -> 0x01c4 }
            r8 = r23
            r7.setInstanceId(r8)     // Catch:{ Exception -> 0x01c4 }
            r7.setUnitId(r6)     // Catch:{ Exception -> 0x01c4 }
            r7.setWebView(r2)     // Catch:{ Exception -> 0x01c4 }
            com.mbridge.msdk.video.bt.a.c r2 = com.mbridge.msdk.video.p347bt.p348a.C9261c.m26212a()     // Catch:{ Exception -> 0x01c4 }
            java.util.LinkedHashMap r2 = r2.mo62512b((java.lang.String) r6, (java.lang.String) r3)     // Catch:{ Exception -> 0x01c4 }
            r2.put(r8, r7)     // Catch:{ Exception -> 0x01c4 }
            r2.put(r4, r0)     // Catch:{ Exception -> 0x01c4 }
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams     // Catch:{ Exception -> 0x01c4 }
            r2.<init>(r5, r5)     // Catch:{ Exception -> 0x01c4 }
            r0.addView(r7, r2)     // Catch:{ Exception -> 0x01c4 }
            goto L_0x01f8
        L_0x01c4:
            r0 = move-exception
            goto L_0x01d1
        L_0x01c6:
            r0 = move-exception
            goto L_0x01cb
        L_0x01c8:
            r0 = move-exception
            r3 = r31
        L_0x01cb:
            r6 = r34
            goto L_0x01d1
        L_0x01ce:
            r0 = move-exception
            r6 = r14
            r3 = r15
        L_0x01d1:
            if (r42 == 0) goto L_0x01eb
            r2 = 0
            java.lang.String r4 = r0.getMessage()     // Catch:{ all -> 0x01fa }
            r36 = r42
            r37 = r21
            r38 = r33
            r39 = r34
            r40 = r31
            r41 = r35
            r42 = r2
            r43 = r4
            r36.mo61298a(r37, r38, r39, r40, r41, r42, r43)     // Catch:{ all -> 0x01fa }
        L_0x01eb:
            boolean r2 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch:{ all -> 0x01fa }
            if (r2 == 0) goto L_0x01f8
            java.lang.String r2 = "RewardCampaignsResourceManager"
            java.lang.String r0 = r0.getLocalizedMessage()     // Catch:{ all -> 0x01fa }
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r2, r0)     // Catch:{ all -> 0x01fa }
        L_0x01f8:
            monitor-exit(r26)
            return
        L_0x01fa:
            r0 = move-exception
            monitor-exit(r26)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.C9133c.mo61322a(boolean, android.os.Handler, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, com.mbridge.msdk.foundation.entity.CampaignEx, java.util.concurrent.CopyOnWriteArrayList, java.lang.String, java.lang.String, com.mbridge.msdk.videocommon.d.c, com.mbridge.msdk.reward.adapter.c$j, boolean):void");
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.c$b */
    /* compiled from: RewardCampaignsResourceManager */
    private static class C9139b extends C8852a {

        /* renamed from: a */
        private final Handler f22276a;

        /* renamed from: b */
        private final Runnable f22277b;

        /* renamed from: c */
        private final boolean f22278c;

        /* renamed from: d */
        private final boolean f22279d;

        /* renamed from: e */
        private int f22280e;

        /* renamed from: f */
        private String f22281f;

        /* renamed from: g */
        private String f22282g;

        /* renamed from: h */
        private String f22283h;

        /* renamed from: i */
        private String f22284i;

        /* renamed from: j */
        private C9625a.C9626a f22285j;

        /* renamed from: k */
        private CampaignEx f22286k;

        /* renamed from: l */
        private CopyOnWriteArrayList<CampaignEx> f22287l;

        /* renamed from: m */
        private C9640c f22288m;

        /* renamed from: n */
        private final C9148j f22289n;

        /* renamed from: o */
        private boolean f22290o;

        /* renamed from: p */
        private boolean f22291p;

        /* renamed from: q */
        private boolean f22292q;

        /* renamed from: r */
        private int f22293r = 0;

        /* renamed from: s */
        private boolean f22294s;

        /* renamed from: t */
        private long f22295t;

        public C9139b(boolean z, Handler handler, Runnable runnable, boolean z2, boolean z3, int i, String str, String str2, String str3, String str4, C9625a.C9626a aVar, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, C9640c cVar, C9148j jVar, boolean z4, long j) {
            this.f22276a = handler;
            this.f22277b = runnable;
            this.f22278c = z2;
            this.f22279d = z3;
            this.f22280e = i;
            this.f22281f = str;
            this.f22283h = str2;
            this.f22282g = str3;
            this.f22284i = str4;
            this.f22285j = aVar;
            this.f22286k = campaignEx;
            this.f22287l = copyOnWriteArrayList;
            this.f22288m = cVar;
            this.f22289n = jVar;
            this.f22290o = z4;
            this.f22294s = z;
            this.f22295t = j;
        }

        /* renamed from: a */
        public final void mo58276a(WebView webView, int i) {
            Runnable runnable;
            if (!this.f22292q) {
                try {
                    C9176a.m26122a(this.f22286k, C8388a.m23845e().mo56913g(), "preload tpl readyState: " + i, this.f22282g, this.f22279d, this.f22284i, this.f22286k.getRequestIdNotice(), System.currentTimeMillis() - this.f22295t);
                } catch (Exception unused) {
                }
                String str = this.f22282g + "_" + this.f22281f;
                if (i == 1) {
                    if (this.f22290o) {
                        C9625a.m27309e(this.f22282g + "_" + this.f22284i);
                    } else {
                        C9625a.m27308d(this.f22282g + "_" + this.f22284i);
                    }
                    C9625a.m27303a(this.f22282g + "_" + this.f22284i + "_" + this.f22281f, this.f22285j, true, this.f22290o);
                    Handler handler = this.f22276a;
                    if (!(handler == null || (runnable = this.f22277b) == null)) {
                        handler.removeCallbacks(runnable);
                    }
                    C9664i.m27564a().mo63683d(this.f22282g + "_" + this.f22284i + "_" + this.f22281f, true);
                    C9625a.C9626a aVar = this.f22285j;
                    if (aVar != null) {
                        aVar.mo63500a(true);
                    }
                    C9148j jVar = this.f22289n;
                    if (jVar != null) {
                        jVar.mo61297a(str, this.f22283h, this.f22282g, this.f22284i, this.f22281f, this.f22285j);
                    }
                } else {
                    C9664i.m27564a().mo63683d(this.f22282g + "_" + this.f22284i + "_" + this.f22281f, false);
                    C9625a.C9626a aVar2 = this.f22285j;
                    if (aVar2 != null) {
                        aVar2.mo63500a(false);
                    }
                    C9148j jVar2 = this.f22289n;
                    if (jVar2 != null) {
                        jVar2.mo61298a(str, this.f22283h, this.f22282g, this.f22284i, this.f22281f, this.f22285j, "state 2");
                    }
                }
                this.f22292q = true;
            }
        }

        /* renamed from: a */
        public final void mo58561a(WebView webView, String str, String str2, int i, int i2) {
            boolean z = true;
            if (i == 1) {
                try {
                    C9110a aVar = new C9110a();
                    aVar.mo61286b(false);
                    if (i2 != 2) {
                        z = false;
                    }
                    aVar.mo61282a(z);
                    aVar.mo61285b(str, str2);
                    aVar.mo61279a((InterVideoOutListener) new C9303a((C9310g) null));
                    aVar.mo61288d(false);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: a */
        public final void mo58563a(Object obj, String str) {
            Object obj2 = obj;
            if (obj2 != null) {
                try {
                    if (!TextUtils.isEmpty(str)) {
                        String optString = new JSONObject(str).optString("id");
                        C9261c.m26212a().mo62504a(obj2, optString);
                        String c = C9261c.m26212a().mo62516c(optString);
                        CampaignEx a = C9261c.m26212a().mo62500a(optString);
                        C9640c b = C9261c.m26212a().mo62510b(optString);
                        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                        copyOnWriteArrayList.add(a);
                        C8881a aVar = (C8881a) obj2;
                        if (aVar.f21883a instanceof WindVaneWebView) {
                            WindVaneWebView windVaneWebView = aVar.f21883a;
                            C9133c a2 = C9153m.f22381a;
                            boolean z = this.f22294s;
                            int i = this.f22293r == 0 ? 3 : 6;
                            if (windVaneWebView != null) {
                                if (!(a == null || b == null)) {
                                    try {
                                        if (a.getRewardTemplateMode() != null) {
                                            if (!TextUtils.isEmpty(c)) {
                                                if (TextUtils.isEmpty(a.getRewardTemplateMode().mo57576e())) {
                                                    JSONObject jSONObject = new JSONObject();
                                                    jSONObject.put("id", optString);
                                                    JSONObject jSONObject2 = new JSONObject();
                                                    jSONObject2.put(IronSourceConstants.EVENTS_RESULT, 1);
                                                    jSONObject2.put("error", "data is null");
                                                    jSONObject.put("data", jSONObject2);
                                                    C8887g.m25669a().mo58687a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                                                } else if (TextUtils.isEmpty(a.getRewardTemplateMode().mo57576e()) || !a.getRewardTemplateMode().mo57576e().contains(CampaignEx.KEY_IS_CMPT_ENTRY)) {
                                                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable(z, windVaneWebView, a, copyOnWriteArrayList, c, b, optString) {

                                                        /* renamed from: a */
                                                        final /* synthetic */ boolean f22259a;

                                                        /* renamed from: b */
                                                        final /* synthetic */ WindVaneWebView f22260b;

                                                        /* renamed from: c */
                                                        final /* synthetic */ CampaignEx f22261c;

                                                        /* renamed from: d */
                                                        final /* synthetic */ CopyOnWriteArrayList f22262d;

                                                        /* renamed from: e */
                                                        final /* synthetic */ String f22263e;

                                                        /* renamed from: f */
                                                        final /* synthetic */ C9640c f22264f;

                                                        /* renamed from: g */
                                                        final /* synthetic */ String f22265g;

                                                        {
                                                            this.f22259a = r2;
                                                            this.f22260b = r3;
                                                            this.f22261c = r4;
                                                            this.f22262d = r5;
                                                            this.f22263e = r6;
                                                            this.f22264f = r7;
                                                            this.f22265g = r8;
                                                        }

                                                        public final void run() {
                                                            C9133c.m25982a(C9133c.this, this.f22259a, this.f22260b, this.f22261c.getRewardTemplateMode().mo57576e(), 0, this.f22261c, this.f22262d, C9652g.m27539a().mo63670b(this.f22261c.getRewardTemplateMode().mo57576e()), this.f22263e, this.f22264f, this.f22265g, C9133c.this.f22241d);
                                                        }
                                                    }, (long) (i * 1000));
                                                } else {
                                                    C8672v.m24874a("RewardCampaignsResourceManager", "getTeamplateUrl contains cmpt=1");
                                                }
                                            }
                                        }
                                    } catch (Exception e) {
                                        if (MBridgeConstans.DEBUG) {
                                            C8672v.m24878d("RewardCampaignsResourceManager", e.getLocalizedMessage());
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        C8672v.m24878d("RVWindVaneWebView", th.getMessage());
                                        return;
                                    }
                                }
                                JSONObject jSONObject3 = new JSONObject();
                                try {
                                    jSONObject3.put("id", optString);
                                    JSONObject jSONObject4 = new JSONObject();
                                    jSONObject4.put(IronSourceConstants.EVENTS_RESULT, 2);
                                    jSONObject4.put("error", "data is null");
                                    jSONObject3.put("data", jSONObject4);
                                    C8887g.m25669a().mo58687a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
                                } catch (Exception e2) {
                                    if (MBridgeConstans.DEBUG) {
                                        C8672v.m24878d("RewardCampaignsResourceManager", e2.getLocalizedMessage());
                                    }
                                }
                            }
                            this.f22293r++;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }

        /* renamed from: a */
        public final void mo58279a(WebView webView, String str) {
            Runnable runnable;
            super.mo58279a(webView, str);
            if (!this.f22291p) {
                try {
                    C9176a.m26122a(this.f22286k, C8388a.m23845e().mo56913g(), "preload tpl onPageFinish", this.f22282g, this.f22279d, this.f22284i, this.f22286k.getRequestIdNotice(), System.currentTimeMillis() - this.f22295t);
                } catch (Exception unused) {
                }
                String str2 = this.f22282g + "_" + this.f22281f;
                if (!str.contains("wfr=1")) {
                    C9664i.m27564a().mo63683d(this.f22282g + "_" + this.f22284i + "_" + this.f22281f, true);
                    Handler handler = this.f22276a;
                    if (!(handler == null || (runnable = this.f22277b) == null)) {
                        handler.removeCallbacks(runnable);
                    }
                    C9625a.C9626a aVar = this.f22285j;
                    if (aVar != null) {
                        aVar.mo63500a(true);
                    }
                    C9148j jVar = this.f22289n;
                    if (jVar != null) {
                        jVar.mo61297a(str2, this.f22283h, this.f22282g, this.f22284i, this.f22281f, this.f22285j);
                    }
                }
                C8887g.m25669a().mo58686a(webView);
                this.f22291p = true;
            }
        }

        /* renamed from: a */
        public final void mo58277a(WebView webView, int i, String str, String str2) {
            super.mo58277a(webView, i, str, str2);
            C9664i.m27564a().mo63683d(this.f22282g + "_" + this.f22284i + "_" + this.f22281f, false);
            if (this.f22289n != null) {
                String str3 = this.f22282g + "_" + this.f22281f;
                C9625a.C9626a aVar = this.f22285j;
                if (aVar != null) {
                    aVar.mo63500a(false);
                }
                this.f22289n.mo61298a(str3, this.f22283h, this.f22282g, this.f22284i, this.f22281f, this.f22285j, str);
            }
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.c$l */
    /* compiled from: RewardCampaignsResourceManager */
    private static class C9152l extends C8853b {

        /* renamed from: a */
        private String f22370a;

        /* renamed from: b */
        private final boolean f22371b;

        /* renamed from: c */
        private final WindVaneWebView f22372c;

        /* renamed from: d */
        private final String f22373d;

        /* renamed from: e */
        private final String f22374e;

        /* renamed from: f */
        private final C9625a.C9626a f22375f;

        /* renamed from: g */
        private final CampaignEx f22376g;

        /* renamed from: h */
        private boolean f22377h;

        /* renamed from: i */
        private String f22378i;

        /* renamed from: j */
        private boolean f22379j;

        /* renamed from: k */
        private boolean f22380k;

        public C9152l(String str, boolean z, WindVaneWebView windVaneWebView, String str2, String str3, C9625a.C9626a aVar, CampaignEx campaignEx, boolean z2, String str4) {
            this.f22371b = z;
            this.f22372c = windVaneWebView;
            this.f22373d = str2;
            this.f22374e = str3;
            this.f22375f = aVar;
            this.f22376g = campaignEx;
            this.f22370a = str;
            this.f22377h = z2;
            this.f22378i = str4;
        }

        /* renamed from: a */
        public final void mo58276a(WebView webView, int i) {
            if (!this.f22380k) {
                if (this.f22372c != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", this.f22370a);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(IronSourceConstants.EVENTS_RESULT, i);
                        jSONObject2.put("error", "");
                        jSONObject.put("data", jSONObject2);
                        C8887g.m25669a().mo58687a((WebView) this.f22372c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            C8672v.m24878d("WindVaneWebView", e.getLocalizedMessage());
                        }
                    }
                }
                String str = this.f22374e + "_" + this.f22376g.getId() + "_" + this.f22376g.getRequestId() + "_" + this.f22373d;
                if (i == 1) {
                    C9664i.m27564a().mo63683d(this.f22374e + "_" + this.f22378i + "_" + this.f22373d, true);
                    C9625a.C9626a aVar = this.f22375f;
                    if (aVar != null) {
                        aVar.mo63500a(true);
                    }
                    if (this.f22371b) {
                        if (this.f22376g.isBidCampaign()) {
                            C9625a.m27303a(str, this.f22375f, false, this.f22377h);
                        } else {
                            C9625a.m27303a(str, this.f22375f, false, this.f22377h);
                        }
                    } else if (this.f22376g.isBidCampaign()) {
                        C9625a.m27303a(str, this.f22375f, false, this.f22377h);
                    } else {
                        C9625a.m27303a(str, this.f22375f, false, this.f22377h);
                    }
                } else {
                    C9664i.m27564a().mo63683d(this.f22374e + "_" + this.f22378i + "_" + this.f22373d, false);
                    C9625a.C9626a aVar2 = this.f22375f;
                    if (aVar2 != null) {
                        aVar2.mo63500a(false);
                    }
                }
                this.f22380k = true;
            }
        }

        /* renamed from: a */
        public final void mo58277a(WebView webView, int i, String str, String str2) {
            C9664i a = C9664i.m27564a();
            a.mo63683d(this.f22374e + "_" + this.f22378i + "_" + this.f22373d, false);
            C9625a.C9626a aVar = this.f22375f;
            if (aVar != null) {
                aVar.mo63500a(false);
            }
            if (this.f22372c != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f22370a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(IronSourceConstants.EVENTS_RESULT, 2);
                    jSONObject2.put("error", str);
                    jSONObject.put("data", jSONObject2);
                    C8887g.m25669a().mo58687a((WebView) this.f22372c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        C8672v.m24878d("WindVaneWebView", e.getLocalizedMessage());
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo58279a(WebView webView, String str) {
            if (!this.f22379j) {
                if (!str.contains("wfr=1")) {
                    if (this.f22372c != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", this.f22370a);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(IronSourceConstants.EVENTS_RESULT, 1);
                            jSONObject2.put("error", "");
                            jSONObject.put("data", jSONObject2);
                            C8887g.m25669a().mo58687a((WebView) this.f22372c, "componentReact", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        } catch (Exception e) {
                            if (MBridgeConstans.DEBUG) {
                                C8672v.m24878d("WindVaneWebView", e.getLocalizedMessage());
                            }
                        }
                    }
                    C9664i.m27564a().mo63683d(this.f22374e + "_" + this.f22378i + "_" + this.f22373d, true);
                    C9625a.C9626a aVar = this.f22375f;
                    if (aVar != null) {
                        aVar.mo63500a(true);
                    }
                    String str2 = this.f22374e + "_" + this.f22376g.getId() + "_" + this.f22376g.getRequestId() + "_" + this.f22373d;
                    if (this.f22371b) {
                        if (this.f22376g.isBidCampaign()) {
                            C9625a.m27302a(287, this.f22376g.getRequestIdNotice(), this.f22375f);
                        } else {
                            C9625a.m27303a(str2, this.f22375f, false, this.f22377h);
                        }
                    } else if (this.f22376g.isBidCampaign()) {
                        C9625a.m27302a(94, this.f22376g.getRequestIdNotice(), this.f22375f);
                    } else {
                        C9625a.m27303a(str2, this.f22375f, false, this.f22377h);
                    }
                }
                C8887g.m25669a().mo58686a(webView);
                this.f22379j = true;
            }
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.c$a */
    /* compiled from: RewardCampaignsResourceManager */
    private static class C9138a {

        /* renamed from: a */
        boolean f22267a;

        /* renamed from: b */
        boolean f22268b;

        /* renamed from: c */
        int f22269c;

        /* renamed from: d */
        int f22270d;

        /* renamed from: e */
        String f22271e;

        /* renamed from: f */
        String f22272f;

        /* renamed from: g */
        int f22273g;

        /* renamed from: h */
        CopyOnWriteArrayList<CampaignEx> f22274h;

        /* renamed from: i */
        CopyOnWriteArrayList<CampaignEx> f22275i;

        public C9138a(boolean z, boolean z2, int i, int i2, String str, String str2, int i3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f22267a = z;
            this.f22268b = z2;
            this.f22269c = i;
            this.f22270d = i2;
            this.f22271e = str;
            this.f22272f = str2;
            this.f22273g = i3;
            this.f22274h = copyOnWriteArrayList;
            this.f22275i = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
        }
    }

    /* renamed from: a */
    private synchronized WindVaneWebView m25975a(boolean z) {
        return null;
    }

    /* renamed from: a */
    static /* synthetic */ void m25981a(C9133c cVar, Context context, String str, String str2, String str3, CampaignEx campaignEx, String str4, C9147i iVar, CopyOnWriteArrayList copyOnWriteArrayList) {
        C9133c cVar2 = cVar;
        String str5 = str4;
        if (!TextUtils.isEmpty(str4) && !campaignEx.isMraid()) {
            if (!str5.contains(".zip") || !str5.contains("md5filename")) {
                boolean isEmpty = TextUtils.isEmpty(C9661h.m27556a().mo63674b(str5));
                try {
                    C9141d dVar = new C9141d(497, str, str2, str3, campaignEx, iVar, cVar2.f22239a, copyOnWriteArrayList);
                    dVar.mo61325a(isEmpty);
                    C9652g.m27539a().mo63671b(str5, dVar);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        C8672v.m24878d("RewardCampaignsResourceManager", e.getLocalizedMessage());
                    }
                }
            } else {
                boolean isEmpty2 = TextUtils.isEmpty(C9652g.m27539a().mo63670b(str5));
                try {
                    C9145g gVar = new C9145g(context, str, str2, str3, campaignEx, 497, cVar2.f22239a, iVar, copyOnWriteArrayList);
                    gVar.mo61327a(isEmpty2);
                    C9652g.m27539a().mo63671b(str5, gVar);
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        C8672v.m24878d("RewardCampaignsResourceManager", e2.getLocalizedMessage());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m25982a(C9133c cVar, boolean z, WindVaneWebView windVaneWebView, String str, int i, CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, String str2, String str3, C9640c cVar2, String str4, boolean z2) {
        C9514j jVar;
        String str5;
        CampaignEx campaignEx2 = campaignEx;
        CopyOnWriteArrayList copyOnWriteArrayList2 = copyOnWriteArrayList;
        String str6 = str3;
        try {
            C9625a.C9626a aVar = new C9625a.C9626a();
            WindVaneWebView a = C9153m.f22381a.m25975a(false);
            if (a == null) {
                a = new WindVaneWebView(C8388a.m23845e().mo56913g());
            }
            WindVaneWebView windVaneWebView2 = a;
            aVar.mo63498a(windVaneWebView2);
            if (copyOnWriteArrayList2 == null || copyOnWriteArrayList.size() <= 0) {
                jVar = new C9514j((Activity) null, campaignEx2);
                str5 = campaignEx.getRequestId();
            } else {
                List<CampaignEx> a2 = C9645c.getInstance().mo63653a(str6);
                if (a2 != null && a2.size() > 0) {
                    for (int i2 = 0; i2 < copyOnWriteArrayList.size(); i2++) {
                        CampaignEx campaignEx3 = (CampaignEx) copyOnWriteArrayList2.get(i2);
                        for (CampaignEx next : a2) {
                            if (next.getId().equals(campaignEx3.getId()) && next.getRequestId().equals(campaignEx3.getRequestId())) {
                                campaignEx3.setReady(true);
                                copyOnWriteArrayList2.set(i2, campaignEx3);
                            }
                        }
                    }
                }
                jVar = new C9514j((Activity) null, campaignEx2, copyOnWriteArrayList2);
                str5 = ((CampaignEx) copyOnWriteArrayList2.get(0)).getRequestId();
            }
            String str7 = str5;
            C9514j jVar2 = jVar;
            jVar2.mo63239a(i);
            jVar2.mo63244a(str6);
            jVar2.mo63278c(str4);
            jVar2.mo63243a(cVar2);
            jVar2.mo63281d(z);
            windVaneWebView2.setWebViewListener(new C9152l(str4, false, windVaneWebView, str, str3, aVar, campaignEx, z2, str7));
            windVaneWebView2.setObject(jVar2);
            windVaneWebView2.loadUrl(str2);
            windVaneWebView2.setRid(str7);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C8672v.m24878d("RewardCampaignsResourceManager", e.getLocalizedMessage());
            }
        }
    }
}
