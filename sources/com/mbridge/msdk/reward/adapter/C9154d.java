package com.mbridge.msdk.reward.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.C8461f;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.p298db.C8407b;
import com.mbridge.msdk.foundation.p298db.C8410e;
import com.mbridge.msdk.foundation.p298db.C8412f;
import com.mbridge.msdk.foundation.p298db.C8414g;
import com.mbridge.msdk.foundation.p298db.C8416i;
import com.mbridge.msdk.foundation.p298db.C8417j;
import com.mbridge.msdk.foundation.same.C8469a;
import com.mbridge.msdk.foundation.same.p300a.C8473d;
import com.mbridge.msdk.foundation.same.p305f.C8498b;
import com.mbridge.msdk.foundation.tools.C8616ad;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.mbsignalcommon.p339b.C8852a;
import com.mbridge.msdk.mbsignalcommon.p339b.C8853b;
import com.mbridge.msdk.mbsignalcommon.webEnvCheck.C8878a;
import com.mbridge.msdk.mbsignalcommon.windvane.C8887g;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.p078c.C2440a;
import com.mbridge.msdk.p078c.C2445b;
import com.mbridge.msdk.reward.adapter.C9133c;
import com.mbridge.msdk.reward.p342a.C9110a;
import com.mbridge.msdk.reward.p343b.C9176a;
import com.mbridge.msdk.reward.player.MBRewardVideoActivity;
import com.mbridge.msdk.video.p347bt.module.p350b.C9311h;
import com.mbridge.msdk.video.p347bt.p348a.C9261c;
import com.mbridge.msdk.video.signal.p371a.C9514j;
import com.mbridge.msdk.videocommon.C9625a;
import com.mbridge.msdk.videocommon.download.C9645c;
import com.mbridge.msdk.videocommon.download.C9652g;
import com.mbridge.msdk.videocommon.download.C9664i;
import com.mbridge.msdk.videocommon.p372a.C9627a;
import com.mbridge.msdk.videocommon.p375d.C9640c;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.reward.adapter.d */
/* compiled from: RewardMVVideoAdapter */
public final class C9154d implements C9131a {

    /* renamed from: A */
    private int f22382A;

    /* renamed from: B */
    private int f22383B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public CampaignUnit f22384C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public CopyOnWriteArrayList<CampaignEx> f22385D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public boolean f22386E = false;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public long f22387F = 0;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public C9173d f22388G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public boolean f22389H = false;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public boolean f22390I = false;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public Handler f22391J = new Handler(Looper.getMainLooper()) {
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Object[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: com.mbridge.msdk.foundation.entity.CampaignEx} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: com.mbridge.msdk.foundation.entity.CampaignEx} */
        /* JADX WARNING: type inference failed for: r11v0 */
        /* JADX WARNING: type inference failed for: r3v10 */
        /* JADX WARNING: type inference failed for: r3v11 */
        /* JADX WARNING: type inference failed for: r3v12 */
        /* JADX WARNING: type inference failed for: r3v13 */
        /* JADX WARNING: type inference failed for: r11v1 */
        /* JADX WARNING: type inference failed for: r3v15 */
        /* JADX WARNING: type inference failed for: r2v16 */
        /* JADX WARNING: type inference failed for: r11v14 */
        /* JADX WARNING: type inference failed for: r11v15 */
        /* JADX WARNING: type inference failed for: r11v16 */
        /* JADX WARNING: type inference failed for: r11v17 */
        /* JADX WARNING: type inference failed for: r11v18 */
        /* JADX WARNING: Code restructure failed: missing block: B:188:0x060c, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:189:0x060d, code lost:
            r2 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:192:0x0614, code lost:
            if (com.mbridge.msdk.reward.adapter.C9154d.m26057i(r1.f22422a) != null) goto L_0x0616;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:193:0x0616, code lost:
            com.mbridge.msdk.reward.adapter.C9154d.m26057i(r1.f22422a).removeMessages(5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:194:0x061f, code lost:
            removeMessages(6);
            com.mbridge.msdk.reward.adapter.C9154d.m26036a(r1.f22422a, com.mbridge.msdk.reward.adapter.C9154d.m26048d(r1.f22422a), com.mbridge.msdk.reward.adapter.C9154d.m26042b(r1.f22422a), com.mbridge.msdk.reward.adapter.C9154d.m26052f(r1.f22422a));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:195:0x063d, code lost:
            if (r1.f22422a.f22404i == false) goto L_0x063f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:196:0x063f, code lost:
            r1.f22422a.f22404i = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:197:0x0643, code lost:
            if (r11 != 0) goto L_0x0645;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:198:0x0645, code lost:
            com.mbridge.msdk.reward.p343b.C9176a.m26121a(r11, com.mbridge.msdk.reward.adapter.C9154d.m26055h(r1.f22422a), r2.getMessage(), com.mbridge.msdk.reward.adapter.C9154d.m26048d(r1.f22422a), com.mbridge.msdk.reward.adapter.C9154d.m26052f(r1.f22422a), r11.getRequestId(), r11.getRequestIdNotice());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:199:0x0669, code lost:
            com.mbridge.msdk.reward.p343b.C9176a.m26121a(r11, com.mbridge.msdk.reward.adapter.C9154d.m26055h(r1.f22422a), r2.getMessage(), com.mbridge.msdk.reward.adapter.C9154d.m26048d(r1.f22422a), com.mbridge.msdk.reward.adapter.C9154d.m26052f(r1.f22422a), "", "");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:200:0x0688, code lost:
            com.mbridge.msdk.reward.adapter.C9154d.m26027a(r1.f22422a).mo37117a("errorCode: 3508 errorMessage: data load failed, exception is " + r2.getMessage());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:219:0x0718, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:220:0x0719, code lost:
            r2 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:222:?, code lost:
            com.mbridge.msdk.foundation.tools.C8672v.m24874a("RewardMVVideoAdapter", r2.getLocalizedMessage());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:223:0x0723, code lost:
            if (com.mbridge.msdk.MBridgeConstans.DEBUG != false) goto L_0x0725;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:224:0x0725, code lost:
            r2.printStackTrace();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:237:0x0785, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:238:0x0786, code lost:
            r2 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:240:?, code lost:
            com.mbridge.msdk.foundation.tools.C8672v.m24874a("RewardMVVideoAdapter", r2.getLocalizedMessage());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:241:0x0790, code lost:
            if (com.mbridge.msdk.MBridgeConstans.DEBUG != false) goto L_0x0792;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:242:0x0792, code lost:
            r2.printStackTrace();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:250:0x07c5, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:251:0x07c6, code lost:
            com.mbridge.msdk.foundation.tools.C8672v.m24874a("RewardMVVideoAdapter", r0.getMessage());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:252:0x07cf, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:253:0x07d0, code lost:
            r0.printStackTrace();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:267:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:282:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:283:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:288:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:292:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:293:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:297:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:302:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:106:0x02fe A[SYNTHETIC, Splitter:B:106:0x02fe] */
        /* JADX WARNING: Removed duplicated region for block: B:125:0x03a5 A[SYNTHETIC, Splitter:B:125:0x03a5] */
        /* JADX WARNING: Removed duplicated region for block: B:250:0x07c5 A[ExcHandler: all (r0v1 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0008] */
        /* JADX WARNING: Removed duplicated region for block: B:256:0x0226 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x029a A[SYNTHETIC, Splitter:B:92:0x029a] */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:225:0x072a=Splitter:B:225:0x072a, B:153:0x04ab=Splitter:B:153:0x04ab} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r26) {
            /*
                r25 = this;
                r1 = r25
                r2 = r26
                java.lang.String r3 = "_"
                java.lang.String r4 = "RewardMVVideoAdapter"
                int r5 = r2.what     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                r6 = 8
                if (r5 == r6) goto L_0x0796
                r6 = 9
                r7 = 4
                r8 = 3
                r9 = 2
                java.lang.String r10 = ""
                r11 = 0
                r12 = 6
                r13 = 5
                r14 = 0
                if (r5 == r6) goto L_0x072a
                r6 = 16
                if (r5 == r6) goto L_0x072a
                r6 = 17
                r15 = 1
                if (r5 == r6) goto L_0x06e5
                switch(r5) {
                    case 1: goto L_0x06d4;
                    case 2: goto L_0x06c3;
                    case 3: goto L_0x06a8;
                    case 4: goto L_0x046b;
                    case 5: goto L_0x00ab;
                    case 6: goto L_0x0029;
                    default: goto L_0x0027;
                }
            L_0x0027:
                goto L_0x07d4
            L_0x0029:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.lang.String r3 = r3.f22406k     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r5 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.util.List r5 = r5.f22394M     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r6 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.util.List r6 = r6.f22395N     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                boolean r7 = r7.f22419x     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.C9154d.m26035a((com.mbridge.msdk.reward.adapter.C9154d) r2, (java.lang.String) r3, (java.util.List) r5, (java.util.List) r6, (boolean) r7)     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.b r2 = r2.f22414s     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                if (r2 == 0) goto L_0x07d4
                r1.removeMessages(r12)     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                android.os.Handler r2 = r2.f22391J     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                if (r2 == 0) goto L_0x0062
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                android.os.Handler r2 = r2.f22391J     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                r2.removeMessages(r13)     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
            L_0x0062:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.b r2 = r2.f22414s     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                if (r2 == 0) goto L_0x07d4
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                boolean r2 = r2.f22403h     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                if (r2 != 0) goto L_0x07d4
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                r2.f22403h = r15     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.lang.String r2 = r2.f22406k     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                if (r2 != 0) goto L_0x00a0
                long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r5 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                long r5 = r5.f22392K     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                long r2 = r2 - r5
                com.mbridge.msdk.reward.adapter.d r5 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                android.content.Context r5 = r5.f22405j     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r6 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.util.concurrent.CopyOnWriteArrayList r6 = r6.f22385D     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.lang.String r7 = r7.f22406k     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.p343b.C9176a.m26120a(r5, r6, r7, r2)     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
            L_0x00a0:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.b r2 = r2.f22414s     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                r2.mo37116a()     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                goto L_0x07d4
            L_0x00ab:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.b r2 = r2.f22414s     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                if (r2 == 0) goto L_0x07d4
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.util.List r2 = r2.f22394M     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                if (r2 == 0) goto L_0x0155
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.util.List r2 = r2.f22394M     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                int r2 = r2.size()     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                if (r2 <= 0) goto L_0x0155
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.util.List r2 = r2.f22394M     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.lang.Object r2 = r2.get(r14)     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.foundation.entity.CampaignEx r2 = (com.mbridge.msdk.foundation.entity.CampaignEx) r2     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.lang.String r5 = r2.getCMPTEntryUrl()     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                if (r5 != 0) goto L_0x00df
                r5 = r15
                goto L_0x00e0
            L_0x00df:
                r5 = r14
            L_0x00e0:
                int r2 = r2.getNscpt()     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r6 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.util.concurrent.CopyOnWriteArrayList r7 = r7.f22385D     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                boolean r2 = r6.mo61345a((java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>) r7, (boolean) r5, (int) r2, (boolean) r15)     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                if (r2 == 0) goto L_0x0155
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.lang.String r3 = r3.f22406k     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r5 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.util.List r5 = r5.f22394M     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r6 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.util.List r6 = r6.f22395N     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                boolean r7 = r7.f22419x     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.C9154d.m26035a((com.mbridge.msdk.reward.adapter.C9154d) r2, (java.lang.String) r3, (java.util.List) r5, (java.util.List) r6, (boolean) r7)     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                r1.sendEmptyMessage(r12)     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                r1.removeMessages(r13)     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                boolean r2 = r2.f22403h     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                if (r2 != 0) goto L_0x0154
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                r2.f22403h = r15     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.lang.String r2 = r2.f22406k     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                if (r2 != 0) goto L_0x014b
                long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r5 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                long r5 = r5.f22392K     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                long r2 = r2 - r5
                com.mbridge.msdk.reward.adapter.d r5 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                android.content.Context r5 = r5.f22405j     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r6 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.util.concurrent.CopyOnWriteArrayList r6 = r6.f22385D     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.lang.String r7 = r7.f22406k     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.p343b.C9176a.m26120a(r5, r6, r7, r2)     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
            L_0x014b:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.b r2 = r2.f22414s     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                r2.mo37116a()     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
            L_0x0154:
                return
            L_0x0155:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r5 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.lang.String r5 = r5.f22406k     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r6 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.util.List r6 = r6.f22394M     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                boolean r7 = r7.f22419x     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.C9154d.m26036a((com.mbridge.msdk.reward.adapter.C9154d) r2, (java.lang.String) r5, (java.util.List) r6, (boolean) r7)     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                android.os.Handler r2 = r2.f22391J     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                if (r2 == 0) goto L_0x0186
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                android.os.Handler r2 = r2.f22391J     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                r2.removeMessages(r13)     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                android.os.Handler r2 = r2.f22391J     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                r2.removeMessages(r12)     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
            L_0x0186:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                boolean r2 = r2.f22404i     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                if (r2 != 0) goto L_0x07d4
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                r2.f22404i = r15     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.util.List r2 = r2.f22394M     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                if (r2 == 0) goto L_0x01b1
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.util.List r2 = r2.f22394M     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                int r2 = r2.size()     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                if (r2 <= 0) goto L_0x01b1
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.util.List r2 = r2.f22394M     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.lang.Object r2 = r2.get(r14)     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                r11 = r2
                com.mbridge.msdk.foundation.entity.CampaignEx r11 = (com.mbridge.msdk.foundation.entity.CampaignEx) r11     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
            L_0x01b1:
                if (r11 == 0) goto L_0x01fc
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                android.content.Context r17 = r2.f22405j     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                r2.<init>()     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.lang.String r5 = "resource load timeout is tpl: "
                r2.append(r5)     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.lang.String r5 = r11.getCMPTEntryUrl()     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                if (r5 != 0) goto L_0x01cf
                r5 = r15
                goto L_0x01d0
            L_0x01cf:
                r5 = r14
            L_0x01d0:
                r2.append(r5)     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.lang.String r18 = r2.toString()     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.lang.String r19 = r2.f22406k     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                boolean r20 = r2.f22419x     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                if (r11 != 0) goto L_0x01e8
                r21 = r10
                goto L_0x01ee
            L_0x01e8:
                java.lang.String r2 = r11.getRequestId()     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                r21 = r2
            L_0x01ee:
                if (r11 != 0) goto L_0x01f1
                goto L_0x01f5
            L_0x01f1:
                java.lang.String r10 = r11.getRequestIdNotice()     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
            L_0x01f5:
                r22 = r10
                r16 = r11
                com.mbridge.msdk.reward.p343b.C9176a.m26121a(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
            L_0x01fc:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.b r2 = r2.f22414s     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.lang.String r5 = "errorCode: 3401 errorMessage: resource load timeout"
                r2.mo37117a(r5)     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.util.concurrent.CopyOnWriteArrayList r2 = r2.f22385D     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                if (r2 == 0) goto L_0x07d4
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.util.concurrent.CopyOnWriteArrayList r2 = r2.f22385D     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                int r2 = r2.size()     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                if (r2 <= 0) goto L_0x07d4
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.util.concurrent.CopyOnWriteArrayList r2 = r2.f22385D     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                r5 = r14
            L_0x0226:
                boolean r6 = r2.hasNext()     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                if (r6 == 0) goto L_0x07d4
                java.lang.Object r6 = r2.next()     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.foundation.entity.CampaignEx r6 = (com.mbridge.msdk.foundation.entity.CampaignEx) r6     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                if (r6 == 0) goto L_0x0297
                java.lang.String r7 = r6.getVideoUrlEncode()     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                if (r7 != 0) goto L_0x0297
                com.mbridge.msdk.videocommon.download.i r7 = com.mbridge.msdk.videocommon.download.C9664i.m27564a()     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                java.lang.String r8 = r6.getVideoUrlEncode()     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                boolean r7 = r7.mo63678a((java.lang.String) r8)     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                if (r7 != 0) goto L_0x0297
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x0295, all -> 0x07c5 }
                android.content.Context r17 = r7.f22405j     // Catch:{ Exception -> 0x0295, all -> 0x07c5 }
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0295, all -> 0x07c5 }
                r7.<init>()     // Catch:{ Exception -> 0x0295, all -> 0x07c5 }
                java.lang.String r8 = "resource load timeout exception video is tpl: "
                r7.append(r8)     // Catch:{ Exception -> 0x0295, all -> 0x07c5 }
                java.lang.String r8 = r11.getCMPTEntryUrl()     // Catch:{ Exception -> 0x0295, all -> 0x07c5 }
                boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x0295, all -> 0x07c5 }
                if (r8 != 0) goto L_0x0268
                r8 = r15
                goto L_0x0269
            L_0x0268:
                r8 = r14
            L_0x0269:
                r7.append(r8)     // Catch:{ Exception -> 0x0295, all -> 0x07c5 }
                java.lang.String r18 = r7.toString()     // Catch:{ Exception -> 0x0295, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x0295, all -> 0x07c5 }
                java.lang.String r19 = r7.f22406k     // Catch:{ Exception -> 0x0295, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x0295, all -> 0x07c5 }
                boolean r20 = r7.f22419x     // Catch:{ Exception -> 0x0295, all -> 0x07c5 }
                java.lang.String r21 = r6.getRequestId()     // Catch:{ Exception -> 0x0295, all -> 0x07c5 }
                java.lang.String r22 = r6.getRequestIdNotice()     // Catch:{ Exception -> 0x0295, all -> 0x07c5 }
                long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0295, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r9 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x0295, all -> 0x07c5 }
                long r9 = r9.f22392K     // Catch:{ Exception -> 0x0295, all -> 0x07c5 }
                long r23 = r7 - r9
                r16 = r11
                com.mbridge.msdk.reward.p343b.C9176a.m26122a(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x0295, all -> 0x07c5 }
            L_0x0295:
                r7 = r15
                goto L_0x0298
            L_0x0297:
                r7 = r14
            L_0x0298:
                if (r6 == 0) goto L_0x02fc
                java.lang.String r8 = r6.getendcard_url()     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                if (r8 != 0) goto L_0x02fc
                com.mbridge.msdk.videocommon.download.i r8 = com.mbridge.msdk.videocommon.download.C9664i.m27564a()     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                java.lang.String r9 = r6.getendcard_url()     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                boolean r8 = r8.mo63680b(r9)     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                if (r8 != 0) goto L_0x02fc
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x02fb, all -> 0x07c5 }
                android.content.Context r17 = r7.f22405j     // Catch:{ Exception -> 0x02fb, all -> 0x07c5 }
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02fb, all -> 0x07c5 }
                r7.<init>()     // Catch:{ Exception -> 0x02fb, all -> 0x07c5 }
                java.lang.String r8 = "resource load timeout exception endcard is tpl: "
                r7.append(r8)     // Catch:{ Exception -> 0x02fb, all -> 0x07c5 }
                java.lang.String r8 = r11.getCMPTEntryUrl()     // Catch:{ Exception -> 0x02fb, all -> 0x07c5 }
                boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x02fb, all -> 0x07c5 }
                if (r8 != 0) goto L_0x02ce
                r8 = r15
                goto L_0x02cf
            L_0x02ce:
                r8 = r14
            L_0x02cf:
                r7.append(r8)     // Catch:{ Exception -> 0x02fb, all -> 0x07c5 }
                java.lang.String r18 = r7.toString()     // Catch:{ Exception -> 0x02fb, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x02fb, all -> 0x07c5 }
                java.lang.String r19 = r7.f22406k     // Catch:{ Exception -> 0x02fb, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x02fb, all -> 0x07c5 }
                boolean r20 = r7.f22419x     // Catch:{ Exception -> 0x02fb, all -> 0x07c5 }
                java.lang.String r21 = r6.getRequestId()     // Catch:{ Exception -> 0x02fb, all -> 0x07c5 }
                java.lang.String r22 = r6.getRequestIdNotice()     // Catch:{ Exception -> 0x02fb, all -> 0x07c5 }
                long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x02fb, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r9 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x02fb, all -> 0x07c5 }
                long r9 = r9.f22392K     // Catch:{ Exception -> 0x02fb, all -> 0x07c5 }
                long r23 = r7 - r9
                r16 = r11
                com.mbridge.msdk.reward.p343b.C9176a.m26122a(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x02fb, all -> 0x07c5 }
            L_0x02fb:
                r7 = r15
            L_0x02fc:
                if (r6 == 0) goto L_0x03a3
                java.lang.String r8 = r6.getCMPTEntryUrl()     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                if (r8 != 0) goto L_0x03a3
                com.mbridge.msdk.videocommon.download.i r8 = com.mbridge.msdk.videocommon.download.C9664i.m27564a()     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                java.lang.String r9 = r6.getCMPTEntryUrl()     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                boolean r8 = r8.mo63680b(r9)     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                if (r8 != 0) goto L_0x0345
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x0343, all -> 0x07c5 }
                android.content.Context r17 = r7.f22405j     // Catch:{ Exception -> 0x0343, all -> 0x07c5 }
                java.lang.String r18 = "resource load timeout exception tpl"
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x0343, all -> 0x07c5 }
                java.lang.String r19 = r7.f22406k     // Catch:{ Exception -> 0x0343, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x0343, all -> 0x07c5 }
                boolean r20 = r7.f22419x     // Catch:{ Exception -> 0x0343, all -> 0x07c5 }
                java.lang.String r21 = r6.getRequestId()     // Catch:{ Exception -> 0x0343, all -> 0x07c5 }
                java.lang.String r22 = r6.getRequestIdNotice()     // Catch:{ Exception -> 0x0343, all -> 0x07c5 }
                long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0343, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r9 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x0343, all -> 0x07c5 }
                long r9 = r9.f22392K     // Catch:{ Exception -> 0x0343, all -> 0x07c5 }
                long r23 = r7 - r9
                r16 = r11
                com.mbridge.msdk.reward.p343b.C9176a.m26122a(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x0343, all -> 0x07c5 }
            L_0x0343:
                r7 = r15
                goto L_0x03a3
            L_0x0345:
                if (r5 != 0) goto L_0x03a3
                if (r7 != 0) goto L_0x03a3
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                r8.<init>()     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r9 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                java.lang.String r9 = r9.f22406k     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                r8.append(r9)     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                r8.append(r3)     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                java.lang.String r9 = r6.getRequestId()     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                r8.append(r9)     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                r8.append(r3)     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                java.lang.String r9 = r6.getCMPTEntryUrl()     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                r8.append(r9)     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                com.mbridge.msdk.videocommon.a$a r8 = com.mbridge.msdk.videocommon.C9625a.m27300a(r8)     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                if (r8 != 0) goto L_0x03a3
                com.mbridge.msdk.reward.adapter.d r5 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x03a2, all -> 0x07c5 }
                android.content.Context r17 = r5.f22405j     // Catch:{ Exception -> 0x03a2, all -> 0x07c5 }
                java.lang.String r18 = "resource load timeout exception tpl preload"
                com.mbridge.msdk.reward.adapter.d r5 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x03a2, all -> 0x07c5 }
                java.lang.String r19 = r5.f22406k     // Catch:{ Exception -> 0x03a2, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r5 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x03a2, all -> 0x07c5 }
                boolean r20 = r5.f22419x     // Catch:{ Exception -> 0x03a2, all -> 0x07c5 }
                java.lang.String r21 = r6.getRequestId()     // Catch:{ Exception -> 0x03a2, all -> 0x07c5 }
                java.lang.String r22 = r6.getRequestIdNotice()     // Catch:{ Exception -> 0x03a2, all -> 0x07c5 }
                long r8 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x03a2, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r5 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x03a2, all -> 0x07c5 }
                long r12 = r5.f22392K     // Catch:{ Exception -> 0x03a2, all -> 0x07c5 }
                long r23 = r8 - r12
                r16 = r11
                com.mbridge.msdk.reward.p343b.C9176a.m26122a(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x03a2, all -> 0x07c5 }
            L_0x03a2:
                r5 = r15
            L_0x03a3:
                if (r6 == 0) goto L_0x0226
                com.mbridge.msdk.foundation.entity.CampaignEx$c r8 = r6.getRewardTemplateMode()     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                if (r8 == 0) goto L_0x0226
                com.mbridge.msdk.foundation.entity.CampaignEx$c r8 = r6.getRewardTemplateMode()     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                java.lang.String r8 = r8.mo57576e()     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                if (r8 != 0) goto L_0x0226
                com.mbridge.msdk.foundation.entity.CampaignEx$c r8 = r6.getRewardTemplateMode()     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                java.lang.String r8 = r8.mo57576e()     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                java.lang.String r9 = "cmpt=1"
                boolean r8 = r8.contains(r9)     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                if (r8 != 0) goto L_0x0226
                com.mbridge.msdk.videocommon.download.i r8 = com.mbridge.msdk.videocommon.download.C9664i.m27564a()     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                com.mbridge.msdk.foundation.entity.CampaignEx$c r9 = r6.getRewardTemplateMode()     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                java.lang.String r9 = r9.mo57576e()     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                boolean r8 = r8.mo63680b(r9)     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                if (r8 != 0) goto L_0x0426
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                android.content.Context r17 = r7.f22405j     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                r7.<init>()     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                java.lang.String r8 = "resource load timeout exception template is tpl: "
                r7.append(r8)     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                java.lang.String r8 = r11.getCMPTEntryUrl()     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                if (r8 != 0) goto L_0x03f7
                r8 = r15
                goto L_0x03f8
            L_0x03f7:
                r8 = r14
            L_0x03f8:
                r7.append(r8)     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                java.lang.String r18 = r7.toString()     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                java.lang.String r19 = r7.f22406k     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                boolean r20 = r7.f22419x     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                java.lang.String r21 = r6.getRequestId()     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                java.lang.String r22 = r6.getRequestIdNotice()     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r8 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                long r8 = r8.f22392K     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                long r23 = r6 - r8
                r16 = r11
                com.mbridge.msdk.reward.p343b.C9176a.m26122a(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                goto L_0x0226
            L_0x0426:
                java.lang.String r8 = r6.getCMPTEntryUrl()     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                if (r8 == 0) goto L_0x0226
                if (r7 != 0) goto L_0x0226
                int r7 = r6.getAdType()     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                com.mbridge.msdk.videocommon.a$a r7 = com.mbridge.msdk.videocommon.C9625a.m27299a(r7, r6)     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                if (r7 != 0) goto L_0x0226
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                android.content.Context r17 = r7.f22405j     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                java.lang.String r18 = "resource load timeout exception template preload"
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                java.lang.String r19 = r7.f22406k     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                boolean r20 = r7.f22419x     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                java.lang.String r21 = r6.getRequestId()     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                java.lang.String r22 = r6.getRequestIdNotice()     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r8 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                long r8 = r8.f22392K     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                long r23 = r6 - r8
                r16 = r11
                com.mbridge.msdk.reward.p343b.C9176a.m26122a(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x0226, all -> 0x07c5 }
                goto L_0x0226
            L_0x046b:
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.b r3 = r3.f22414s     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                if (r3 == 0) goto L_0x07d4
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r5 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.lang.String r5 = r5.f22406k     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r6 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.util.List r6 = r6.f22394M     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                boolean r7 = r7.f22419x     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.C9154d.m26036a((com.mbridge.msdk.reward.adapter.C9154d) r3, (java.lang.String) r5, (java.util.List) r6, (boolean) r7)     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.util.List r3 = r3.f22394M     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                if (r3 == 0) goto L_0x04ab
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.util.List r3 = r3.f22394M     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                int r3 = r3.size()     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                if (r3 <= 0) goto L_0x04ab
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.util.List r3 = r3.f22394M     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.lang.Object r3 = r3.get(r14)     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                r11 = r3
                com.mbridge.msdk.foundation.entity.CampaignEx r11 = (com.mbridge.msdk.foundation.entity.CampaignEx) r11     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
            L_0x04ab:
                java.lang.Object r3 = r2.obj     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                if (r3 != 0) goto L_0x051b
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                android.os.Handler r2 = r2.f22391J     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                if (r2 == 0) goto L_0x04c0
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                android.os.Handler r2 = r2.f22391J     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                r2.removeMessages(r13)     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
            L_0x04c0:
                r1.removeMessages(r12)     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                boolean r2 = r2.f22404i     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                if (r2 != 0) goto L_0x07d4
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                r2.f22404i = r15     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                if (r11 == 0) goto L_0x04f1
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                android.content.Context r17 = r2.f22405j     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                java.lang.String r18 = "data load failed"
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                java.lang.String r19 = r2.f22406k     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                boolean r20 = r2.f22419x     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                java.lang.String r21 = r11.getRequestId()     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                java.lang.String r22 = r11.getRequestIdNotice()     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                r16 = r11
                com.mbridge.msdk.reward.p343b.C9176a.m26121a(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                goto L_0x050e
            L_0x04f1:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                android.content.Context r17 = r2.f22405j     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                java.lang.String r18 = "data load failed"
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                java.lang.String r19 = r2.f22406k     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                boolean r20 = r2.f22419x     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                java.lang.String r21 = ""
                java.lang.String r22 = ""
                r16 = r11
                com.mbridge.msdk.reward.p343b.C9176a.m26121a(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
            L_0x050e:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.b r2 = r2.f22414s     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                java.lang.String r3 = "errorCode: 3506 errorMessage: data load failed"
                r2.mo37117a(r3)     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                goto L_0x07d4
            L_0x051b:
                java.lang.Object r2 = r2.obj     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                if (r3 == 0) goto L_0x0591
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                android.os.Handler r2 = r2.f22391J     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                if (r2 == 0) goto L_0x0536
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                android.os.Handler r2 = r2.f22391J     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                r2.removeMessages(r13)     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
            L_0x0536:
                r1.removeMessages(r12)     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                boolean r2 = r2.f22404i     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                if (r2 != 0) goto L_0x07d4
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                r2.f22404i = r15     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                if (r11 == 0) goto L_0x0567
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                android.content.Context r17 = r2.f22405j     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                java.lang.String r18 = "data load failed, errorMsg null"
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                java.lang.String r19 = r2.f22406k     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                boolean r20 = r2.f22419x     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                java.lang.String r21 = r11.getRequestId()     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                java.lang.String r22 = r11.getRequestIdNotice()     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                r16 = r11
                com.mbridge.msdk.reward.p343b.C9176a.m26121a(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                goto L_0x0584
            L_0x0567:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                android.content.Context r17 = r2.f22405j     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                java.lang.String r18 = "data load failed, errorMsg null"
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                java.lang.String r19 = r2.f22406k     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                boolean r20 = r2.f22419x     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                java.lang.String r21 = ""
                java.lang.String r22 = ""
                r16 = r11
                com.mbridge.msdk.reward.p343b.C9176a.m26121a(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
            L_0x0584:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.b r2 = r2.f22414s     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                java.lang.String r3 = "errorCode: 3507 errorMessage: data load failed, errorMsg null"
                r2.mo37117a(r3)     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                goto L_0x07d4
            L_0x0591:
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                android.os.Handler r3 = r3.f22391J     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                if (r3 == 0) goto L_0x05a2
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                android.os.Handler r3 = r3.f22391J     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                r3.removeMessages(r13)     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
            L_0x05a2:
                r1.removeMessages(r12)     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                boolean r3 = r3.f22404i     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                if (r3 != 0) goto L_0x07d4
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                r3.f22404i = r15     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                if (r11 == 0) goto L_0x05d3
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                android.content.Context r17 = r3.f22405j     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                java.lang.String r19 = r3.f22406k     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                boolean r20 = r3.f22419x     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                java.lang.String r21 = r11.getRequestId()     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                java.lang.String r22 = r11.getRequestIdNotice()     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                r16 = r11
                r18 = r2
                com.mbridge.msdk.reward.p343b.C9176a.m26121a(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                goto L_0x05f0
            L_0x05d3:
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                android.content.Context r17 = r3.f22405j     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                java.lang.String r19 = r3.f22406k     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                boolean r20 = r3.f22419x     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                java.lang.String r21 = ""
                java.lang.String r22 = ""
                r16 = r11
                r18 = r2
                com.mbridge.msdk.reward.p343b.C9176a.m26121a(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
            L_0x05f0:
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.b r3 = r3.f22414s     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                r5.<init>()     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                java.lang.String r6 = "errorCode: 3507 errorMessage: data load failed, errorMsg is "
                r5.append(r6)     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                r5.append(r2)     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                java.lang.String r2 = r5.toString()     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                r3.mo37117a(r2)     // Catch:{ Exception -> 0x060c, all -> 0x07c5 }
                goto L_0x07d4
            L_0x060c:
                r0 = move-exception
                r2 = r0
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                android.os.Handler r3 = r3.f22391J     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                if (r3 == 0) goto L_0x061f
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                android.os.Handler r3 = r3.f22391J     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                r3.removeMessages(r13)     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
            L_0x061f:
                r1.removeMessages(r12)     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r5 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.lang.String r5 = r5.f22406k     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r6 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.util.List r6 = r6.f22394M     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                boolean r7 = r7.f22419x     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.C9154d.m26036a((com.mbridge.msdk.reward.adapter.C9154d) r3, (java.lang.String) r5, (java.util.List) r6, (boolean) r7)     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                boolean r3 = r3.f22404i     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                if (r3 != 0) goto L_0x07d4
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                r3.f22404i = r15     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                if (r11 == 0) goto L_0x0669
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                android.content.Context r17 = r3.f22405j     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.lang.String r18 = r2.getMessage()     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.lang.String r19 = r3.f22406k     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                boolean r20 = r3.f22419x     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.lang.String r21 = r11.getRequestId()     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.lang.String r22 = r11.getRequestIdNotice()     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                r16 = r11
                com.mbridge.msdk.reward.p343b.C9176a.m26121a(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                goto L_0x0688
            L_0x0669:
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                android.content.Context r17 = r3.f22405j     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.lang.String r18 = r2.getMessage()     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.lang.String r19 = r3.f22406k     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                boolean r20 = r3.f22419x     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.lang.String r21 = ""
                java.lang.String r22 = ""
                r16 = r11
                com.mbridge.msdk.reward.p343b.C9176a.m26121a(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
            L_0x0688:
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.b r3 = r3.f22414s     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                r5.<init>()     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.lang.String r6 = "errorCode: 3508 errorMessage: data load failed, exception is "
                r5.append(r6)     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.lang.String r2 = r2.getMessage()     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                r5.append(r2)     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.lang.String r2 = r5.toString()     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                r3.mo37117a(r2)     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                goto L_0x07d4
            L_0x06a8:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.b r2 = r2.f22414s     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                if (r2 == 0) goto L_0x06bb
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.b r2 = r2.f22414s     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.lang.String r3 = "campaign is ok"
                r2.mo37118b(r3)     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
            L_0x06bb:
                int r2 = com.mbridge.msdk.foundation.same.C8469a.f20752m     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                long r2 = (long) r2     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                r1.sendEmptyMessageDelayed(r13, r2)     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                goto L_0x07d4
            L_0x06c3:
                java.lang.Object r3 = r2.obj     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                if (r3 == 0) goto L_0x06cd
                java.lang.Object r2 = r2.obj     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.lang.String r11 = r2.toString()     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
            L_0x06cd:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                r2.mo61346b((java.lang.String) r11)     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                goto L_0x07d4
            L_0x06d4:
                java.lang.Object r3 = r2.obj     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                if (r3 == 0) goto L_0x06de
                java.lang.Object r2 = r2.obj     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.lang.String r11 = r2.toString()     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
            L_0x06de:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                r2.mo61346b((java.lang.String) r11)     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                goto L_0x07d4
            L_0x06e5:
                java.lang.Object r2 = r2.obj     // Catch:{ Exception -> 0x0718, all -> 0x07c5 }
                java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch:{ Exception -> 0x0718, all -> 0x07c5 }
                r3 = r2[r14]     // Catch:{ Exception -> 0x0718, all -> 0x07c5 }
                r18 = r3
                com.mbridge.msdk.foundation.entity.CampaignEx r18 = (com.mbridge.msdk.foundation.entity.CampaignEx) r18     // Catch:{ Exception -> 0x0718, all -> 0x07c5 }
                r3 = r2[r15]     // Catch:{ Exception -> 0x0718, all -> 0x07c5 }
                r19 = r3
                java.lang.String r19 = (java.lang.String) r19     // Catch:{ Exception -> 0x0718, all -> 0x07c5 }
                r3 = r2[r9]     // Catch:{ Exception -> 0x0718, all -> 0x07c5 }
                r20 = r3
                java.lang.String r20 = (java.lang.String) r20     // Catch:{ Exception -> 0x0718, all -> 0x07c5 }
                r3 = r2[r8]     // Catch:{ Exception -> 0x0718, all -> 0x07c5 }
                r21 = r3
                com.mbridge.msdk.videocommon.d.c r21 = (com.mbridge.msdk.videocommon.p375d.C9640c) r21     // Catch:{ Exception -> 0x0718, all -> 0x07c5 }
                r2 = r2[r7]     // Catch:{ Exception -> 0x0718, all -> 0x07c5 }
                r17 = r2
                java.lang.String r17 = (java.lang.String) r17     // Catch:{ Exception -> 0x0718, all -> 0x07c5 }
                if (r18 == 0) goto L_0x07d4
                boolean r2 = android.text.TextUtils.isEmpty(r19)     // Catch:{ Exception -> 0x0718, all -> 0x07c5 }
                if (r2 != 0) goto L_0x07d4
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x0718, all -> 0x07c5 }
                r16 = r2
                com.mbridge.msdk.reward.adapter.C9154d.m26033a(r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x0718, all -> 0x07c5 }
                goto L_0x07d4
            L_0x0718:
                r0 = move-exception
                r2 = r0
                java.lang.String r3 = r2.getLocalizedMessage()     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.foundation.tools.C8672v.m24874a(r4, r3)     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                if (r3 == 0) goto L_0x07d4
                r2.printStackTrace()     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                goto L_0x07d4
            L_0x072a:
                java.lang.Object r2 = r2.obj     // Catch:{ Exception -> 0x0785, all -> 0x07c5 }
                java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch:{ Exception -> 0x0785, all -> 0x07c5 }
                r3 = r2[r14]     // Catch:{ Exception -> 0x0785, all -> 0x07c5 }
                r17 = r3
                com.mbridge.msdk.foundation.entity.CampaignEx r17 = (com.mbridge.msdk.foundation.entity.CampaignEx) r17     // Catch:{ Exception -> 0x0785, all -> 0x07c5 }
                r3 = r2[r9]     // Catch:{ Exception -> 0x0785, all -> 0x07c5 }
                r20 = r3
                java.lang.String r20 = (java.lang.String) r20     // Catch:{ Exception -> 0x0785, all -> 0x07c5 }
                r3 = r2[r8]     // Catch:{ Exception -> 0x0785, all -> 0x07c5 }
                r21 = r3
                com.mbridge.msdk.videocommon.d.c r21 = (com.mbridge.msdk.videocommon.p375d.C9640c) r21     // Catch:{ Exception -> 0x0785, all -> 0x07c5 }
                r3 = r2[r7]     // Catch:{ Exception -> 0x0785, all -> 0x07c5 }
                r16 = r3
                java.lang.String r16 = (java.lang.String) r16     // Catch:{ Exception -> 0x0785, all -> 0x07c5 }
                int r3 = r2.length     // Catch:{ Exception -> 0x0785, all -> 0x07c5 }
                r5 = 7
                if (r3 != r5) goto L_0x0754
                r3 = r2[r13]     // Catch:{ Exception -> 0x0785, all -> 0x07c5 }
                r10 = r3
                java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x0785, all -> 0x07c5 }
                r2 = r2[r12]     // Catch:{ Exception -> 0x0785, all -> 0x07c5 }
                r11 = r2
                com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r11 = (com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView) r11     // Catch:{ Exception -> 0x0785, all -> 0x07c5 }
            L_0x0754:
                r22 = r10
                r15 = r11
                if (r17 == 0) goto L_0x07d4
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x0785, all -> 0x07c5 }
                java.util.concurrent.CopyOnWriteArrayList r2 = r2.f22416u     // Catch:{ Exception -> 0x0785, all -> 0x07c5 }
                if (r2 != 0) goto L_0x0777
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x0785, all -> 0x07c5 }
                java.util.List r2 = r2.f22395N     // Catch:{ Exception -> 0x0785, all -> 0x07c5 }
                if (r2 == 0) goto L_0x07d4
                com.mbridge.msdk.reward.adapter.d r14 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x0785, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x0785, all -> 0x07c5 }
                java.util.List r18 = r2.f22395N     // Catch:{ Exception -> 0x0785, all -> 0x07c5 }
                java.lang.String r19 = ""
                com.mbridge.msdk.reward.adapter.C9154d.m26031a(r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x0785, all -> 0x07c5 }
                goto L_0x07d4
            L_0x0777:
                com.mbridge.msdk.reward.adapter.d r14 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x0785, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x0785, all -> 0x07c5 }
                java.util.concurrent.CopyOnWriteArrayList r18 = r2.f22416u     // Catch:{ Exception -> 0x0785, all -> 0x07c5 }
                java.lang.String r19 = ""
                com.mbridge.msdk.reward.adapter.C9154d.m26031a(r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x0785, all -> 0x07c5 }
                goto L_0x07d4
            L_0x0785:
                r0 = move-exception
                r2 = r0
                java.lang.String r3 = r2.getLocalizedMessage()     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.foundation.tools.C8672v.m24874a(r4, r3)     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                if (r3 == 0) goto L_0x07d4
                r2.printStackTrace()     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                goto L_0x07d4
            L_0x0796:
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.b r3 = r3.f22414s     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                if (r3 == 0) goto L_0x07d4
                java.lang.Object r2 = r2.obj     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.foundation.entity.CampaignEx r2 = (com.mbridge.msdk.foundation.entity.CampaignEx) r2     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                if (r2 == 0) goto L_0x07d4
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.lang.String r3 = r3.f22406k     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                if (r3 != 0) goto L_0x07d4
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                android.content.Context r3 = r3.f22405j     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r5 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                java.lang.String r5 = r5.f22406k     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.p343b.C9176a.m26117a((android.content.Context) r3, (com.mbridge.msdk.foundation.entity.CampaignEx) r2, (java.lang.String) r5)     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                r2.mo61348b()     // Catch:{ Exception -> 0x07cf, all -> 0x07c5 }
                goto L_0x07d4
            L_0x07c5:
                r0 = move-exception
                r2 = r0
                java.lang.String r2 = r2.getMessage()
                com.mbridge.msdk.foundation.tools.C8672v.m24874a(r4, r2)
                goto L_0x07d4
            L_0x07cf:
                r0 = move-exception
                r2 = r0
                r2.printStackTrace()
            L_0x07d4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.C9154d.C91551.handleMessage(android.os.Message):void");
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: K */
    public long f22392K = 0;

    /* renamed from: L */
    private String f22393L = "";
    /* access modifiers changed from: private */

    /* renamed from: M */
    public List<CampaignEx> f22394M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public List<CampaignEx> f22395N;

    /* renamed from: a */
    public String f22396a = "";

    /* renamed from: b */
    public String f22397b = "";

    /* renamed from: c */
    public Object f22398c = new Object();

    /* renamed from: d */
    boolean f22399d = false;

    /* renamed from: e */
    volatile boolean f22400e = false;

    /* renamed from: f */
    volatile boolean f22401f = false;

    /* renamed from: g */
    volatile boolean f22402g = false;

    /* renamed from: h */
    volatile boolean f22403h = false;

    /* renamed from: i */
    volatile boolean f22404i = false;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Context f22405j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public String f22406k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public String f22407l;

    /* renamed from: m */
    private int f22408m;

    /* renamed from: n */
    private int f22409n;

    /* renamed from: o */
    private int f22410o;

    /* renamed from: p */
    private boolean f22411p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public String f22412q;

    /* renamed from: r */
    private C9311h f22413r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public volatile C9132b f22414s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C9640c f22415t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public CopyOnWriteArrayList<CampaignEx> f22416u = new CopyOnWriteArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: v */
    public int f22417v = 2;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public boolean f22418w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public boolean f22419x;

    /* renamed from: y */
    private String f22420y = "";

    /* renamed from: z */
    private int f22421z;

    /* renamed from: a */
    public final String mo61335a(boolean z) {
        List<CampaignEx> a;
        CampaignEx campaignEx;
        if (!z) {
            return this.f22396a;
        }
        if (TextUtils.isEmpty(this.f22397b) && (a = C9645c.getInstance().mo63653a(this.f22406k)) != null && a.size() > 0 && (campaignEx = a.get(0)) != null) {
            this.f22397b = campaignEx.getRequestId();
        }
        return this.f22397b;
    }

    /* renamed from: b */
    public final void mo61347b(boolean z) {
        this.f22418w = z;
    }

    /* renamed from: c */
    public final void mo61349c(boolean z) {
        this.f22419x = z;
    }

    /* renamed from: a */
    public final void mo61342a(String str) {
        this.f22420y = str;
    }

    /* renamed from: a */
    public final void mo61336a(int i) {
        this.f22417v = i;
    }

    /* renamed from: a */
    public final String mo61334a() {
        return this.f22406k;
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.d$b */
    /* compiled from: RewardMVVideoAdapter */
    private class C9171b implements Runnable {

        /* renamed from: b */
        private String f22477b;

        /* renamed from: c */
        private CampaignEx f22478c;

        /* renamed from: d */
        private String f22479d;

        /* renamed from: e */
        private String f22480e;

        /* renamed from: f */
        private C9640c f22481f;

        /* renamed from: g */
        private int f22482g;

        /* renamed from: h */
        private C9154d f22483h;

        public C9171b(String str, CampaignEx campaignEx, String str2, String str3, C9640c cVar, int i, C9154d dVar) {
            this.f22477b = str;
            this.f22478c = campaignEx;
            this.f22479d = str2;
            this.f22480e = str3;
            this.f22481f = cVar;
            this.f22482g = i;
            this.f22483h = dVar;
        }

        public final void run() {
            C9514j jVar;
            try {
                C9625a.C9626a aVar = new C9625a.C9626a();
                WindVaneWebView windVaneWebView = new WindVaneWebView(C8388a.m23845e().mo56913g());
                aVar.mo63498a(windVaneWebView);
                String b = C9261c.m26212a().mo62511b();
                aVar.mo63499a(b);
                if (C9154d.this.f22384C.getAds() == null || C9154d.this.f22384C.getAds().size() <= 0) {
                    jVar = new C9514j((Activity) null, this.f22478c);
                } else {
                    jVar = new C9514j((Activity) null, this.f22478c, C9154d.this.f22384C.getAds());
                }
                C9514j jVar2 = jVar;
                jVar2.mo63239a(this.f22482g);
                jVar2.mo63244a(this.f22480e);
                jVar2.mo63278c(b);
                jVar2.mo63243a(this.f22481f);
                jVar2.mo63281d(C9154d.this.f22386E);
                windVaneWebView.setWebViewListener(new C9170a(this.f22479d, this.f22477b, aVar, this.f22478c, this.f22483h, (C9171b) null, (Handler) null));
                windVaneWebView.setObject(jVar2);
                windVaneWebView.loadUrl(this.f22479d);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            } catch (Throwable th) {
                C8672v.m24874a("RewardMVVideoAdapter", th.getMessage());
            }
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.d$c */
    /* compiled from: RewardMVVideoAdapter */
    private class C9172c implements Runnable {

        /* renamed from: b */
        private WindVaneWebView f22485b;

        /* renamed from: c */
        private String f22486c;

        /* renamed from: d */
        private CampaignEx f22487d;

        /* renamed from: e */
        private List<CampaignEx> f22488e;

        /* renamed from: f */
        private String f22489f;

        /* renamed from: g */
        private String f22490g;

        /* renamed from: h */
        private C9640c f22491h;

        /* renamed from: i */
        private int f22492i;

        /* renamed from: j */
        private C9154d f22493j;

        public C9172c(WindVaneWebView windVaneWebView, String str, CampaignEx campaignEx, List<CampaignEx> list, String str2, String str3, C9640c cVar, int i, C9154d dVar) {
            this.f22485b = windVaneWebView;
            this.f22486c = str;
            this.f22487d = campaignEx;
            this.f22488e = list;
            this.f22489f = str2;
            this.f22490g = str3;
            this.f22491h = cVar;
            this.f22492i = i;
            this.f22493j = dVar;
        }

        public final void run() {
            C9514j jVar;
            try {
                C9625a.C9626a aVar = new C9625a.C9626a();
                WindVaneWebView windVaneWebView = new WindVaneWebView(C8388a.m23845e().mo56913g());
                aVar.mo63498a(windVaneWebView);
                if (this.f22488e == null || this.f22488e.size() <= 0) {
                    jVar = new C9514j((Activity) null, this.f22487d);
                } else {
                    jVar = new C9514j((Activity) null, this.f22487d, this.f22488e);
                }
                C9514j jVar2 = jVar;
                jVar2.mo63239a(this.f22492i);
                jVar2.mo63244a(this.f22490g);
                jVar2.mo63243a(this.f22491h);
                jVar2.mo63281d(C9154d.this.f22386E);
                windVaneWebView.setWebViewListener(new C9175f(this.f22485b, this.f22489f, this.f22486c, aVar, this.f22487d, this.f22493j, (C9172c) null, (Handler) null));
                windVaneWebView.setObject(jVar2);
                windVaneWebView.loadUrl(this.f22489f);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            } catch (Throwable th) {
                C8672v.m24874a("RewardMVVideoAdapter", th.getMessage());
            }
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.d$a */
    /* compiled from: RewardMVVideoAdapter */
    private static class C9170a extends C8852a {

        /* renamed from: a */
        private C9154d f22467a;

        /* renamed from: b */
        private String f22468b;

        /* renamed from: c */
        private String f22469c;

        /* renamed from: d */
        private C9625a.C9626a f22470d;

        /* renamed from: e */
        private CampaignEx f22471e;

        /* renamed from: f */
        private boolean f22472f;

        /* renamed from: g */
        private boolean f22473g;

        /* renamed from: h */
        private C9171b f22474h;

        /* renamed from: i */
        private Handler f22475i;

        /* renamed from: a */
        public final void mo58561a(WebView webView, String str, String str2, int i, int i2) {
        }

        public C9170a(String str, String str2, C9625a.C9626a aVar, CampaignEx campaignEx, C9154d dVar, C9171b bVar, Handler handler) {
            this.f22468b = str;
            this.f22469c = str2;
            this.f22470d = aVar;
            if (dVar != null) {
                this.f22467a = dVar;
            }
            this.f22471e = campaignEx;
            this.f22474h = bVar;
            this.f22475i = handler;
        }

        /* renamed from: a */
        public final void mo58276a(WebView webView, int i) {
            Handler handler;
            if (!this.f22473g) {
                C9171b bVar = this.f22474h;
                if (!(bVar == null || (handler = this.f22475i) == null)) {
                    handler.removeCallbacks(bVar);
                }
                C9664i.m27564a().mo63683d(this.f22468b, true);
                C9625a.C9626a aVar = this.f22470d;
                if (aVar != null) {
                    aVar.mo63500a(true);
                }
                List<CampaignEx> a = C9627a.m27316a().mo63505a(this.f22469c, 1, this.f22467a.f22419x);
                if (a != null && a.size() > 0) {
                    for (CampaignEx rewardTemplateMode : a) {
                        CampaignEx.C8454c rewardTemplateMode2 = rewardTemplateMode.getRewardTemplateMode();
                        if (rewardTemplateMode2 != null && !TextUtils.isEmpty(rewardTemplateMode2.mo57576e()) && !rewardTemplateMode2.mo57576e().contains(CampaignEx.KEY_IS_CMPT_ENTRY) && TextUtils.equals(rewardTemplateMode2.mo57576e(), this.f22468b)) {
                            if (!TextUtils.isEmpty(this.f22471e.getCMPTEntryUrl()) || this.f22471e.getMof_tplid() != -1) {
                                this.f22471e.getMof_tplid();
                                this.f22471e.getRequestIdNotice();
                            } else {
                                this.f22471e.getRequestIdNotice();
                            }
                            C9154d dVar = this.f22467a;
                            if (dVar == null || !dVar.f22418w) {
                                if (this.f22471e.isBidCampaign()) {
                                    C9625a.m27302a(94, this.f22471e.getRequestIdNotice(), this.f22470d);
                                }
                            } else if (this.f22471e.isBidCampaign()) {
                                C9625a.m27302a(287, this.f22471e.getRequestIdNotice(), this.f22470d);
                            }
                        }
                    }
                }
                try {
                    if (this.f22467a != null) {
                        synchronized (this.f22467a) {
                            if (!(this.f22467a == null || !this.f22467a.mo61348b() || this.f22467a.f22391J == null)) {
                                Message obtain = Message.obtain();
                                obtain.what = 6;
                                C8672v.m24874a("RVWindVaneWebView", "WHAT_ON_RES_LOAD_SUCCESS TPL");
                                obtain.obj = this.f22471e;
                                this.f22467a.f22391J.sendMessage(obtain);
                                this.f22467a.f22391J.removeMessages(5);
                                this.f22467a = null;
                            }
                        }
                    }
                } catch (Throwable th) {
                    C8672v.m24875a("RVWindVaneWebView", th.getMessage(), th);
                }
                this.f22473g = true;
            }
        }

        /* renamed from: a */
        public final void mo58279a(WebView webView, String str) {
            super.mo58279a(webView, str);
            if (!this.f22472f) {
                C8887g.m25669a().mo58686a(webView);
                this.f22472f = true;
            }
        }

        /* renamed from: a */
        public final void mo58277a(WebView webView, int i, String str, String str2) {
            super.mo58277a(webView, i, str, str2);
            try {
                if (this.f22467a != null) {
                    synchronized (this.f22467a) {
                        C9154d.m26034a(this.f22467a, str, str2);
                        this.f22467a = null;
                    }
                }
            } catch (Throwable th) {
                C8672v.m24875a("RVWindVaneWebView", th.getMessage(), th);
            }
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.d$f */
    /* compiled from: RewardMVVideoAdapter */
    private static class C9175f extends C8853b {

        /* renamed from: a */
        private C9154d f22498a;

        /* renamed from: b */
        private WindVaneWebView f22499b;

        /* renamed from: c */
        private String f22500c;

        /* renamed from: d */
        private String f22501d;

        /* renamed from: e */
        private C9625a.C9626a f22502e;

        /* renamed from: f */
        private CampaignEx f22503f;

        /* renamed from: g */
        private boolean f22504g;

        /* renamed from: h */
        private boolean f22505h;

        /* renamed from: i */
        private C9172c f22506i;

        /* renamed from: j */
        private Handler f22507j;

        public C9175f(WindVaneWebView windVaneWebView, String str, String str2, C9625a.C9626a aVar, CampaignEx campaignEx, C9154d dVar, C9172c cVar, Handler handler) {
            this.f22499b = windVaneWebView;
            this.f22500c = str;
            this.f22501d = str2;
            this.f22502e = aVar;
            if (dVar != null) {
                this.f22498a = dVar;
            }
            this.f22503f = campaignEx;
            this.f22506i = cVar;
            this.f22507j = handler;
        }

        /* renamed from: a */
        public final void mo58276a(WebView webView, int i) {
            Handler handler;
            if (!this.f22505h) {
                C9172c cVar = this.f22506i;
                if (!(cVar == null || (handler = this.f22507j) == null)) {
                    handler.removeCallbacks(cVar);
                }
                String str = this.f22501d + "_" + this.f22500c;
                C9625a.C9626a aVar = this.f22502e;
                if (aVar != null) {
                    aVar.mo63500a(true);
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("type", 1);
                    jSONObject.put("id", str);
                    jSONObject.put("unitid", this.f22501d);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                C9664i.m27564a().mo63683d(this.f22500c, true);
                C9627a.m27316a().mo63505a(this.f22501d, 1, this.f22498a.f22419x);
                C9154d dVar = this.f22498a;
                if (dVar == null || !dVar.f22418w) {
                    if (this.f22503f.isBidCampaign()) {
                        C9625a.m27302a(94, this.f22503f.getRequestIdNotice(), this.f22502e);
                    }
                } else if (this.f22503f.isBidCampaign()) {
                    C9625a.m27302a(287, this.f22503f.getRequestIdNotice(), this.f22502e);
                }
                try {
                    if (this.f22498a != null) {
                        synchronized (this.f22498a) {
                            if (!(this.f22498a == null || !this.f22498a.mo61348b() || this.f22498a.f22391J == null)) {
                                Message obtain = Message.obtain();
                                obtain.what = 6;
                                obtain.obj = this.f22503f;
                                this.f22498a.f22391J.sendMessage(obtain);
                                this.f22498a.f22391J.removeMessages(5);
                                this.f22498a = null;
                            }
                        }
                    }
                } catch (Throwable th) {
                    C8672v.m24875a("WindVaneWebView", th.getMessage(), th);
                }
                this.f22505h = true;
            }
        }

        /* renamed from: a */
        public final void mo58279a(WebView webView, String str) {
            super.mo58279a(webView, str);
            if (!this.f22504g) {
                C8887g.m25669a().mo58686a(webView);
                this.f22504g = true;
            }
        }

        /* renamed from: a */
        public final void mo58277a(WebView webView, int i, String str, String str2) {
            super.mo58277a(webView, i, str, str2);
            try {
                if (this.f22498a != null) {
                    synchronized (this.f22498a) {
                        C9154d.m26034a(this.f22498a, str, str2);
                        this.f22498a = null;
                    }
                }
            } catch (Throwable th) {
                C8672v.m24875a("WindVaneWebView", th.getMessage(), th);
            }
        }
    }

    public C9154d(Context context, String str, String str2) {
        try {
            this.f22405j = context.getApplicationContext();
            this.f22406k = str2;
            this.f22407l = str;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo61341a(C9640c cVar) {
        try {
            this.f22415t = cVar;
            if (cVar != null && cVar.mo63561C() * 1000 != C8469a.f20752m) {
                C8469a.f20752m = this.f22415t.mo63561C() * 1000;
            }
        } catch (Throwable th) {
            C8672v.m24875a("RewardMVVideoAdapter", th.getMessage(), th);
        }
    }

    /* renamed from: a */
    public final boolean mo61344a(List<CampaignEx> list, boolean z, int i) {
        return mo61345a(list, z, i, false);
    }

    /* renamed from: a */
    public final boolean mo61345a(List<CampaignEx> list, boolean z, int i, boolean z2) {
        if (list != null && list.size() > 0) {
            CampaignEx campaignEx = list.get(0);
            if (C9645c.getInstance().mo63658a(94, this.f22406k, this.f22419x, list.size(), z, i, list, z2)) {
                if (z) {
                    if (campaignEx.isDynamicView()) {
                        return true;
                    }
                    if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0) {
                        if (campaignEx.getRsIgnoreCheckRule().contains(3)) {
                            C8672v.m24876b("RewardMVVideoAdapter", "Is not check big template download status");
                            return true;
                        } else if (campaignEx.getCMPTEntryUrl().equals(campaignEx.getendcard_url()) && campaignEx.getRsIgnoreCheckRule().contains(2)) {
                            C8672v.m24876b("RewardMVVideoAdapter", "Is not check big template of ENDCARD download status");
                            return true;
                        }
                    }
                    C9664i a = C9664i.m27564a();
                    if (a.mo63682c(this.f22406k + "_" + campaignEx.getRequestId() + "_" + campaignEx.getCMPTEntryUrl())) {
                        return true;
                    }
                } else if (campaignEx != null && campaignEx.isDynamicView()) {
                    return true;
                } else {
                    if (campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(1)) {
                        if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().mo57576e())) {
                            C9664i a2 = C9664i.m27564a();
                            if (a2.mo63682c(this.f22406k + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().mo57576e())) {
                                return true;
                            }
                        }
                        return true;
                    }
                    C8672v.m24876b("RewardMVVideoAdapter", "Is not check template download status");
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo61348b() {
        List<CampaignEx> a = C9627a.m27316a().mo63506a(this.f22406k, 1, this.f22419x, this.f22420y);
        if (a == null || a.size() <= 0) {
            C8672v.m24874a("RewardVideoController", "database has not can use data");
            return false;
        }
        CampaignEx campaignEx = a.get(0);
        int b = C9627a.m27316a().mo63515b(this.f22406k, 1, this.f22419x, this.f22420y);
        if (TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()) || campaignEx.getNscpt() != 1 || a.size() >= b) {
            return mo61344a(a, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt());
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo61350c() {
        List<CampaignEx> c = C9627a.m27316a().mo63520c(this.f22406k, 1, this.f22419x, this.f22420y);
        if (c == null || c.size() <= 0) {
            C8672v.m24874a("test_isReay_db", "database has not can use data");
            return false;
        }
        CampaignEx campaignEx = c.get(0);
        int b = C9627a.m27316a().mo63515b(this.f22406k, 1, this.f22419x, this.f22420y);
        if (TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()) || campaignEx.getNscpt() != 1 || c.size() >= b) {
            return mo61344a(c, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt());
        }
        return false;
    }

    /* renamed from: a */
    public final void mo61340a(C9311h hVar, String str, String str2, int i, String str3) {
        try {
            this.f22413r = hVar;
            if (this.f22405j != null) {
                if (!C8616ad.m24717a(this.f22406k)) {
                    Intent intent = new Intent(this.f22405j, MBRewardVideoActivity.class);
                    intent.addFlags(268435456);
                    intent.putExtra(MBRewardVideoActivity.INTENT_UNITID, this.f22406k);
                    intent.putExtra(MBridgeConstans.PLACEMENT_ID, this.f22407l);
                    intent.putExtra(MBRewardVideoActivity.INTENT_REWARD, str);
                    intent.putExtra(MBRewardVideoActivity.INTENT_MUTE, i);
                    intent.putExtra(MBRewardVideoActivity.INTENT_ISIV, this.f22418w);
                    intent.putExtra(MBRewardVideoActivity.INTENT_ISBID, this.f22419x);
                    intent.putExtra(MBRewardVideoActivity.INTENT_EXTRADATA, str3);
                    List<CampaignEx> a = C9645c.getInstance().mo63653a(this.f22406k);
                    boolean z = false;
                    if (a != null && a.size() > 0) {
                        CampaignEx campaignEx = a.get(0);
                        if (campaignEx != null) {
                            this.f22397b = campaignEx.getRequestId();
                        }
                        if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())) {
                            z = true;
                        }
                        m26050e();
                    } else if (this.f22413r != null) {
                        this.f22413r.mo61309a("load failed");
                        return;
                    }
                    intent.putExtra(MBRewardVideoActivity.INTENT_ISBIG_OFFER, z);
                    if (this.f22418w) {
                        intent.putExtra(MBRewardVideoActivity.INTENT_IVREWARD_MODETYPE, this.f22421z);
                        intent.putExtra(MBRewardVideoActivity.INTENT_IVREWARD_VALUETYPE, this.f22382A);
                        intent.putExtra(MBRewardVideoActivity.INTENT_IVREWARD_VALUE, this.f22383B);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        intent.putExtra(MBRewardVideoActivity.INTENT_USERID, str2);
                    }
                    RewardUnitCacheManager.getInstance().add(this.f22407l, this.f22406k, this.f22415t);
                    this.f22405j.startActivity(intent);
                    return;
                }
            }
            if (this.f22413r != null) {
                this.f22413r.mo61309a("context or unitid is null");
            }
        } catch (Exception e) {
            e.printStackTrace();
            C9311h hVar2 = this.f22413r;
            if (hVar2 != null) {
                hVar2.mo61309a("show failed, exception is " + e.getMessage());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x007e A[Catch:{ Exception -> 0x009c }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m26050e() {
        /*
            r5 = this;
            com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            android.content.Context r0 = r0.mo56913g()
            com.mbridge.msdk.foundation.db.b r0 = com.mbridge.msdk.foundation.p298db.C8407b.m23908a((android.content.Context) r0)
            java.lang.String r1 = r5.f22406k
            java.lang.String r2 = r5.f22397b
            java.util.List r0 = r0.mo56972b(r1, r2)
            if (r0 == 0) goto L_0x00a6
            int r1 = r0.size()
            java.lang.String r2 = r5.f22406k
            java.lang.String r2 = com.mbridge.msdk.foundation.same.p300a.C8473d.m24286c(r2)
            if (r1 != 0) goto L_0x0023
            return
        L_0x0023:
            r3 = 1
            java.lang.String r4 = ""
            if (r1 != r3) goto L_0x0044
            r1 = 0
            java.lang.Object r3 = r0.get(r1)     // Catch:{ Exception -> 0x009c }
            if (r3 == 0) goto L_0x006f
            java.lang.Object r3 = r0.get(r1)     // Catch:{ Exception -> 0x009c }
            com.mbridge.msdk.foundation.entity.c r3 = (com.mbridge.msdk.foundation.entity.C8458c) r3     // Catch:{ Exception -> 0x009c }
            java.lang.String r4 = r3.mo57690c()     // Catch:{ Exception -> 0x009c }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x009c }
            com.mbridge.msdk.foundation.entity.c r0 = (com.mbridge.msdk.foundation.entity.C8458c) r0     // Catch:{ Exception -> 0x009c }
            java.lang.String r0 = r0.mo57687b()     // Catch:{ Exception -> 0x009c }
            goto L_0x0070
        L_0x0044:
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x009c }
            if (r1 != 0) goto L_0x006f
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x009c }
        L_0x004e:
            boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x009c }
            if (r1 == 0) goto L_0x006f
            java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x009c }
            com.mbridge.msdk.foundation.entity.c r1 = (com.mbridge.msdk.foundation.entity.C8458c) r1     // Catch:{ Exception -> 0x009c }
            if (r1 == 0) goto L_0x004e
            java.lang.String r3 = r1.mo57684a()     // Catch:{ Exception -> 0x009c }
            boolean r3 = r2.equals(r3)     // Catch:{ Exception -> 0x009c }
            if (r3 == 0) goto L_0x004e
            java.lang.String r4 = r1.mo57690c()     // Catch:{ Exception -> 0x009c }
            java.lang.String r0 = r1.mo57687b()     // Catch:{ Exception -> 0x009c }
            goto L_0x0070
        L_0x006f:
            r0 = r4
        L_0x0070:
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x009c }
            if (r1 != 0) goto L_0x00a6
            java.lang.String r1 = r5.f22397b     // Catch:{ Exception -> 0x009c }
            boolean r1 = r4.equals(r1)     // Catch:{ Exception -> 0x009c }
            if (r1 == 0) goto L_0x00a6
            com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x009c }
            android.content.Context r1 = r1.mo56913g()     // Catch:{ Exception -> 0x009c }
            com.mbridge.msdk.foundation.db.b r1 = com.mbridge.msdk.foundation.p298db.C8407b.m23908a((android.content.Context) r1)     // Catch:{ Exception -> 0x009c }
            java.lang.String r3 = r5.f22406k     // Catch:{ Exception -> 0x009c }
            r1.mo56969a((java.lang.String) r2, (java.lang.String) r3)     // Catch:{ Exception -> 0x009c }
            java.lang.String r1 = r5.f22406k     // Catch:{ Exception -> 0x009c }
            java.lang.String r2 = r5.f22397b     // Catch:{ Exception -> 0x009c }
            com.mbridge.msdk.foundation.same.p300a.C8473d.m24281a((java.lang.String) r1, (java.lang.String) r2, (java.lang.String) r0)     // Catch:{ Exception -> 0x009c }
            java.lang.String r0 = r5.f22406k     // Catch:{ Exception -> 0x009c }
            com.mbridge.msdk.foundation.same.p300a.C8473d.m24283b(r0)     // Catch:{ Exception -> 0x009c }
            goto L_0x00a6
        L_0x009c:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "RewardMVVideoAdapter"
            com.mbridge.msdk.foundation.tools.C8672v.m24874a(r1, r0)
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.C9154d.m26050e():void");
    }

    /* renamed from: a */
    public final void mo61338a(int i, int i2, boolean z) {
        mo61339a(i, i2, z, "", this.f22386E);
    }

    /* renamed from: a */
    public final void mo61339a(int i, int i2, boolean z, String str, boolean z2) {
        this.f22409n = i;
        this.f22410o = i2;
        this.f22411p = z;
        this.f22386E = z2;
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f22385D;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
        }
        List<CampaignEx> list = this.f22394M;
        if (list != null) {
            list.clear();
        }
        boolean z3 = false;
        this.f22400e = false;
        this.f22401f = false;
        synchronized (this.f22398c) {
            if (this.f22402g) {
                this.f22402g = false;
            }
        }
        this.f22404i = false;
        this.f22403h = false;
        try {
            z3 = C8878a.m25646a(this.f22405j);
        } catch (Exception unused) {
        }
        if (!z3) {
            m26047c("WebView is not available");
        } else if (this.f22405j == null) {
            m26047c("Context is null");
        } else if (C8616ad.m24717a(this.f22406k)) {
            m26047c("UnitId is null");
        } else if (this.f22415t == null) {
            m26047c("RewardUnitSetting is null");
        } else {
            m26060j();
            m26062k();
            m26051f();
            m26043b(str, z2);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(36:20|(1:22)(1:23)|24|(1:26)(1:27)|28|(1:30)(1:31)|32|(1:34)|35|(1:37)|38|(1:40)|41|42|(5:44|45|46|(3:48|49|(1:51)(1:52))|53)|54|(1:58)|59|(1:63)|64|(1:66)(1:67)|68|(1:70)|71|72|73|74|75|76|(1:78)(1:79)|80|(3:81|82|(1:84))|85|87|88|92) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x021f */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x023a A[Catch:{ Exception -> 0x0289 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x023d A[Catch:{ Exception -> 0x0289 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x025b A[Catch:{ Exception -> 0x026b }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m26039a(java.lang.String r23, boolean r24) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            java.lang.String r2 = "1"
            java.lang.String r3 = ""
            android.content.Context r4 = r1.f22405j     // Catch:{ Exception -> 0x0289 }
            if (r4 != 0) goto L_0x0012
            java.lang.String r0 = "Context is null"
            r1.m26047c((java.lang.String) r0)     // Catch:{ Exception -> 0x0289 }
            return
        L_0x0012:
            java.lang.String r4 = r1.f22406k     // Catch:{ Exception -> 0x0289 }
            boolean r4 = com.mbridge.msdk.foundation.tools.C8616ad.m24717a(r4)     // Catch:{ Exception -> 0x0289 }
            if (r4 == 0) goto L_0x0020
            java.lang.String r0 = "UnitId is null"
            r1.m26047c((java.lang.String) r0)     // Catch:{ Exception -> 0x0289 }
            return
        L_0x0020:
            com.mbridge.msdk.videocommon.d.c r4 = r1.f22415t     // Catch:{ Exception -> 0x0289 }
            if (r4 != 0) goto L_0x002a
            java.lang.String r0 = "RewardUnitSetting is null"
            r1.m26047c((java.lang.String) r0)     // Catch:{ Exception -> 0x0289 }
            return
        L_0x002a:
            boolean r4 = android.text.TextUtils.isEmpty(r23)     // Catch:{ Exception -> 0x0289 }
            if (r4 == 0) goto L_0x004a
            com.mbridge.msdk.videocommon.d.c r4 = r1.f22415t     // Catch:{ Exception -> 0x0289 }
            int r4 = r4.mo63564a()     // Catch:{ Exception -> 0x0289 }
            int r4 = r4 * 1000
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0289 }
            long r7 = r1.f22387F     // Catch:{ Exception -> 0x0289 }
            long r5 = r5 - r7
            long r7 = (long) r4     // Catch:{ Exception -> 0x0289 }
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x004a
            java.lang.String r0 = "EXCEPTION_RETURN_EMPTY"
            r1.m26047c((java.lang.String) r0)     // Catch:{ Exception -> 0x0289 }
            return
        L_0x004a:
            com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x0289 }
            java.lang.String r4 = r4.mo56914h()     // Catch:{ Exception -> 0x0289 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0289 }
            r5.<init>()     // Catch:{ Exception -> 0x0289 }
            com.mbridge.msdk.foundation.controller.a r6 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x0289 }
            java.lang.String r6 = r6.mo56914h()     // Catch:{ Exception -> 0x0289 }
            r5.append(r6)     // Catch:{ Exception -> 0x0289 }
            com.mbridge.msdk.foundation.controller.a r6 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x0289 }
            java.lang.String r6 = r6.mo56916j()     // Catch:{ Exception -> 0x0289 }
            r5.append(r6)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0289 }
            java.lang.String r5 = com.mbridge.msdk.foundation.tools.SameMD5.getMD5(r5)     // Catch:{ Exception -> 0x0289 }
            boolean r6 = r1.f22411p     // Catch:{ Exception -> 0x0289 }
            if (r6 == 0) goto L_0x007b
            r6 = 2
            goto L_0x007c
        L_0x007b:
            r6 = 3
        L_0x007c:
            com.mbridge.msdk.videocommon.d.c r7 = r1.f22415t     // Catch:{ Exception -> 0x0289 }
            r8 = 0
            if (r7 == 0) goto L_0x008e
            com.mbridge.msdk.videocommon.d.c r7 = r1.f22415t     // Catch:{ Exception -> 0x0289 }
            int r8 = r7.mo63602r()     // Catch:{ Exception -> 0x0289 }
            com.mbridge.msdk.videocommon.d.c r7 = r1.f22415t     // Catch:{ Exception -> 0x0289 }
            int r7 = r7.mo63604s()     // Catch:{ Exception -> 0x0289 }
            goto L_0x008f
        L_0x008e:
            r7 = r8
        L_0x008f:
            java.lang.String r9 = r1.f22412q     // Catch:{ Exception -> 0x0289 }
            java.lang.String r10 = r1.f22406k     // Catch:{ Exception -> 0x0289 }
            java.lang.String r11 = "reward"
            java.lang.String r10 = com.mbridge.msdk.foundation.same.p300a.C8473d.m24277a(r10, r11)     // Catch:{ Exception -> 0x0289 }
            int r11 = r22.m26053g()     // Catch:{ Exception -> 0x0289 }
            r1.f22408m = r11     // Catch:{ Exception -> 0x0289 }
            java.lang.String r11 = r22.m26058i()     // Catch:{ Exception -> 0x0289 }
            int r12 = r1.f22409n     // Catch:{ Exception -> 0x0289 }
            boolean r13 = r1.f22418w     // Catch:{ Exception -> 0x0289 }
            if (r13 == 0) goto L_0x00ac
            r13 = 287(0x11f, float:4.02E-43)
            goto L_0x00ae
        L_0x00ac:
            r13 = 94
        L_0x00ae:
            com.mbridge.msdk.foundation.same.net.g.d r14 = new com.mbridge.msdk.foundation.same.net.g.d     // Catch:{ Exception -> 0x0289 }
            r14.<init>()     // Catch:{ Exception -> 0x0289 }
            java.lang.String r15 = "app_id"
            com.mbridge.msdk.foundation.same.net.p311f.C8538b.m24455a(r14, r15, r4)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r4 = "unit_id"
            java.lang.String r15 = r1.f22406k     // Catch:{ Exception -> 0x0289 }
            com.mbridge.msdk.foundation.same.net.p311f.C8538b.m24455a(r14, r4, r15)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r4 = r1.f22407l     // Catch:{ Exception -> 0x0289 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0289 }
            if (r4 != 0) goto L_0x00ce
            java.lang.String r4 = com.mbridge.msdk.MBridgeConstans.PLACEMENT_ID     // Catch:{ Exception -> 0x0289 }
            java.lang.String r15 = r1.f22407l     // Catch:{ Exception -> 0x0289 }
            com.mbridge.msdk.foundation.same.net.p311f.C8538b.m24455a(r14, r4, r15)     // Catch:{ Exception -> 0x0289 }
        L_0x00ce:
            java.lang.String r4 = "sign"
            com.mbridge.msdk.foundation.same.net.p311f.C8538b.m24455a(r14, r4, r5)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r4 = "req_type"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0289 }
            r5.<init>()     // Catch:{ Exception -> 0x0289 }
            r5.append(r6)     // Catch:{ Exception -> 0x0289 }
            r5.append(r3)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0289 }
            com.mbridge.msdk.foundation.same.net.p311f.C8538b.m24455a(r14, r4, r5)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r4 = "ad_num"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0289 }
            r5.<init>()     // Catch:{ Exception -> 0x0289 }
            r5.append(r8)     // Catch:{ Exception -> 0x0289 }
            r5.append(r3)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0289 }
            com.mbridge.msdk.foundation.same.net.p311f.C8538b.m24455a(r14, r4, r5)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r4 = "tnum"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0289 }
            r5.<init>()     // Catch:{ Exception -> 0x0289 }
            boolean r6 = r1.f22418w     // Catch:{ Exception -> 0x0289 }
            if (r6 == 0) goto L_0x0107
            r7 = 1
        L_0x0107:
            r5.append(r7)     // Catch:{ Exception -> 0x0289 }
            r5.append(r3)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0289 }
            com.mbridge.msdk.foundation.same.net.p311f.C8538b.m24455a(r14, r4, r5)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r4 = "only_impression"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0289 }
            r5.<init>()     // Catch:{ Exception -> 0x0289 }
            r5.append(r2)     // Catch:{ Exception -> 0x0289 }
            r5.append(r3)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0289 }
            com.mbridge.msdk.foundation.same.net.p311f.C8538b.m24455a(r14, r4, r5)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r4 = "ping_mode"
            com.mbridge.msdk.foundation.same.net.p311f.C8538b.m24455a(r14, r4, r2)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r4 = com.mbridge.msdk.foundation.same.net.p312g.C8550d.f20982b     // Catch:{ Exception -> 0x0289 }
            com.mbridge.msdk.foundation.same.net.p311f.C8538b.m24455a(r14, r4, r10)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r4 = com.mbridge.msdk.foundation.same.net.p312g.C8550d.f20983c     // Catch:{ Exception -> 0x0289 }
            com.mbridge.msdk.foundation.same.net.p311f.C8538b.m24455a(r14, r4, r9)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r4 = "ad_source_id"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0289 }
            r5.<init>()     // Catch:{ Exception -> 0x0289 }
            r5.append(r12)     // Catch:{ Exception -> 0x0289 }
            r5.append(r3)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0289 }
            com.mbridge.msdk.foundation.same.net.p311f.C8538b.m24455a(r14, r4, r5)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r4 = com.mbridge.msdk.foundation.same.net.p312g.C8550d.f20981a     // Catch:{ Exception -> 0x0289 }
            com.mbridge.msdk.foundation.same.net.p311f.C8538b.m24455a(r14, r4, r11)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r4 = "ad_type"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0289 }
            r5.<init>()     // Catch:{ Exception -> 0x0289 }
            r5.append(r13)     // Catch:{ Exception -> 0x0289 }
            r5.append(r3)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0289 }
            com.mbridge.msdk.foundation.same.net.p311f.C8538b.m24455a(r14, r4, r5)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r4 = "offset"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0289 }
            r5.<init>()     // Catch:{ Exception -> 0x0289 }
            int r6 = r1.f22408m     // Catch:{ Exception -> 0x0289 }
            r5.append(r6)     // Catch:{ Exception -> 0x0289 }
            r5.append(r3)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r3 = r5.toString()     // Catch:{ Exception -> 0x0289 }
            com.mbridge.msdk.foundation.same.net.p311f.C8538b.m24455a(r14, r4, r3)     // Catch:{ Exception -> 0x0289 }
            boolean r3 = android.text.TextUtils.isEmpty(r23)     // Catch:{ Exception -> 0x0289 }
            if (r3 != 0) goto L_0x0185
            java.lang.String r3 = "token"
            r14.mo57981a(r3, r0)     // Catch:{ Exception -> 0x0289 }
        L_0x0185:
            boolean r3 = r1.f22418w     // Catch:{ Exception -> 0x0289 }
            java.lang.String r4 = "0"
            if (r3 == 0) goto L_0x01a1
            int r3 = r1.f22421z     // Catch:{ Exception -> 0x0289 }
            int r5 = com.mbridge.msdk.foundation.same.C8469a.f20754o     // Catch:{ Exception -> 0x0289 }
            java.lang.String r6 = "ivrwd"
            if (r3 == r5) goto L_0x019e
            int r3 = r1.f22421z     // Catch:{ Exception -> 0x0289 }
            int r5 = com.mbridge.msdk.foundation.same.C8469a.f20753n     // Catch:{ Exception -> 0x0289 }
            if (r3 != r5) goto L_0x019a
            goto L_0x019e
        L_0x019a:
            r14.mo57981a(r6, r4)     // Catch:{ Exception -> 0x0289 }
            goto L_0x01a1
        L_0x019e:
            r14.mo57981a(r6, r2)     // Catch:{ Exception -> 0x0289 }
        L_0x01a1:
            com.mbridge.msdk.videocommon.d.b r3 = com.mbridge.msdk.videocommon.p375d.C9638b.m27377a()     // Catch:{ Exception -> 0x0289 }
            com.mbridge.msdk.foundation.controller.a r5 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x0289 }
            java.lang.String r5 = r5.mo56914h()     // Catch:{ Exception -> 0x0289 }
            java.lang.String r6 = r1.f22406k     // Catch:{ Exception -> 0x0289 }
            boolean r7 = r1.f22418w     // Catch:{ Exception -> 0x0289 }
            com.mbridge.msdk.videocommon.d.c r3 = r3.mo63551a((java.lang.String) r5, (java.lang.String) r6, (boolean) r7)     // Catch:{ Exception -> 0x0289 }
            if (r3 == 0) goto L_0x01ca
            java.lang.String r5 = r3.mo63586j()     // Catch:{ Exception -> 0x0289 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0289 }
            if (r5 != 0) goto L_0x01ca
            java.lang.String r5 = "u_stid"
            java.lang.String r3 = r3.mo63586j()     // Catch:{ Exception -> 0x0289 }
            r14.mo57981a(r5, r3)     // Catch:{ Exception -> 0x0289 }
        L_0x01ca:
            com.mbridge.msdk.videocommon.d.b r3 = com.mbridge.msdk.videocommon.p375d.C9638b.m27377a()     // Catch:{ Exception -> 0x0289 }
            com.mbridge.msdk.videocommon.d.a r3 = r3.mo63556b()     // Catch:{ Exception -> 0x0289 }
            if (r3 == 0) goto L_0x01e7
            java.lang.String r5 = r3.mo63532a()     // Catch:{ Exception -> 0x0289 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0289 }
            if (r5 != 0) goto L_0x01e7
            java.lang.String r5 = "r_stid"
            java.lang.String r3 = r3.mo63532a()     // Catch:{ Exception -> 0x0289 }
            r14.mo57981a(r5, r3)     // Catch:{ Exception -> 0x0289 }
        L_0x01e7:
            java.lang.String r3 = "rw_plus"
            if (r24 == 0) goto L_0x01ec
            goto L_0x01ed
        L_0x01ec:
            r2 = r4
        L_0x01ed:
            r14.mo57981a(r3, r2)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r2 = r1.f22406k     // Catch:{ Exception -> 0x0289 }
            java.lang.String r2 = com.mbridge.msdk.foundation.tools.C8677z.m24946g((java.lang.String) r2)     // Catch:{ Exception -> 0x0289 }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0289 }
            if (r3 != 0) goto L_0x0201
            java.lang.String r3 = "j"
            r14.mo57981a(r3, r2)     // Catch:{ Exception -> 0x0289 }
        L_0x0201:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0289 }
            r1.f22392K = r2     // Catch:{ Exception -> 0x0289 }
            r4 = 0
            android.content.Context r5 = r1.f22405j     // Catch:{ Exception -> 0x021f }
            java.lang.String r6 = "start load offer from server"
            java.lang.String r7 = r1.f22406k     // Catch:{ Exception -> 0x021f }
            boolean r8 = r1.f22419x     // Catch:{ Exception -> 0x021f }
            java.lang.String r9 = ""
            java.lang.String r10 = ""
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x021f }
            long r11 = r1.f22392K     // Catch:{ Exception -> 0x021f }
            long r11 = r2 - r11
            com.mbridge.msdk.reward.p343b.C9176a.m26122a(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x021f }
        L_0x021f:
            com.mbridge.msdk.reward.c.b r2 = new com.mbridge.msdk.reward.c.b     // Catch:{ Exception -> 0x0289 }
            android.content.Context r3 = r1.f22405j     // Catch:{ Exception -> 0x0289 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0289 }
            com.mbridge.msdk.reward.adapter.d$2 r5 = new com.mbridge.msdk.reward.adapter.d$2     // Catch:{ Exception -> 0x0289 }
            r5.<init>()     // Catch:{ Exception -> 0x0289 }
            r5.mo61372a((java.lang.String) r0)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r3 = r1.f22406k     // Catch:{ Exception -> 0x0289 }
            r5.f20918d = r3     // Catch:{ Exception -> 0x0289 }
            java.lang.String r3 = r1.f22407l     // Catch:{ Exception -> 0x0289 }
            r5.f20919e = r3     // Catch:{ Exception -> 0x0289 }
            boolean r3 = r1.f22418w     // Catch:{ Exception -> 0x0289 }
            if (r3 == 0) goto L_0x023d
            r3 = 287(0x11f, float:4.02E-43)
            goto L_0x023f
        L_0x023d:
            r3 = 94
        L_0x023f:
            r5.f20920f = r3     // Catch:{ Exception -> 0x0289 }
            int r3 = com.mbridge.msdk.foundation.same.C8469a.f20763x     // Catch:{ Exception -> 0x0289 }
            int r4 = com.mbridge.msdk.foundation.same.C8469a.f20764y     // Catch:{ Exception -> 0x0289 }
            int r6 = com.mbridge.msdk.foundation.same.C8469a.f20762w     // Catch:{ Exception -> 0x0289 }
            int r7 = com.mbridge.msdk.foundation.same.C8469a.f20765z     // Catch:{ Exception -> 0x0289 }
            com.mbridge.msdk.c.b r8 = com.mbridge.msdk.p078c.C2445b.m6020a()     // Catch:{ Exception -> 0x026b }
            com.mbridge.msdk.foundation.controller.a r9 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x026b }
            java.lang.String r9 = r9.mo56914h()     // Catch:{ Exception -> 0x026b }
            com.mbridge.msdk.c.a r8 = r8.mo16294f(r9)     // Catch:{ Exception -> 0x026b }
            if (r8 == 0) goto L_0x026b
            int r3 = r8.mo16260u()     // Catch:{ Exception -> 0x026b }
            int r4 = r8.mo16262v()     // Catch:{ Exception -> 0x026b }
            int r6 = r8.mo16264w()     // Catch:{ Exception -> 0x026b }
            int r7 = r8.mo16266x()     // Catch:{ Exception -> 0x026b }
        L_0x026b:
            r17 = r3
            r18 = r4
            r16 = r6
            r20 = r7
            com.mbridge.msdk.foundation.same.net.b r7 = new com.mbridge.msdk.foundation.same.net.b     // Catch:{ Exception -> 0x0289 }
            int r3 = r1.f22410o     // Catch:{ Exception -> 0x0289 }
            int r3 = r3 * 1000
            r21 = 4
            r15 = r7
            r19 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x0289 }
            r3 = 1
            r4 = r14
            r6 = r23
            r2.mo57974a((int) r3, (com.mbridge.msdk.foundation.same.net.p312g.C8550d) r4, (com.mbridge.msdk.foundation.same.net.C8532e) r5, (java.lang.String) r6, (com.mbridge.msdk.foundation.same.net.C8558l) r7)     // Catch:{ Exception -> 0x0289 }
            goto L_0x0295
        L_0x0289:
            r0 = move-exception
            r0.printStackTrace()
            java.lang.String r0 = "Load exception"
            r1.m26047c((java.lang.String) r0)
            r22.m26056h()
        L_0x0295:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.C9154d.m26039a(java.lang.String, boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m26047c(String str) {
        if (this.f22391J == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f22391J.sendEmptyMessage(4);
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 4;
        obtain.obj = str;
        if (str.contains("exception")) {
            this.f22391J.sendMessageAtFrontOfQueue(obtain);
        } else {
            this.f22391J.sendMessage(obtain);
        }
    }

    /* renamed from: f */
    private void m26051f() {
        if (C9627a.m27316a() != null) {
            try {
                C2440a b = C2445b.m6020a().mo16286b(C8388a.m23845e().mo56914h());
                if (b == null) {
                    b = C2445b.m6020a().mo16285b();
                }
                C9627a.m27316a().mo63508a(b.mo16156K() * 1000, this.f22406k);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo61318a(C9132b bVar) {
        this.f22414s = bVar;
    }

    /* renamed from: d */
    public final void mo61352d(boolean z) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList;
        if (!z && (copyOnWriteArrayList = this.f22385D) != null && copyOnWriteArrayList.size() > 0) {
            C9627a.m27316a().mo63513a(this.f22406k, (List<CampaignEx>) this.f22385D);
        }
    }

    /* renamed from: e */
    public final void mo61353e(boolean z) {
        if (z) {
            List<CampaignEx> list = this.f22395N;
            if (list != null && list.size() > 0) {
                for (CampaignEx next : this.f22395N) {
                    if (next != null) {
                        next.setLoadTimeoutState(0);
                        if (next.getRewardTemplateMode() != null && !TextUtils.isEmpty(next.getRewardTemplateMode().mo57576e())) {
                            C9664i a = C9664i.m27564a();
                            a.mo63683d(this.f22406k + "_" + next.getRequestId() + "_" + next.getRewardTemplateMode().mo57576e(), false);
                        }
                    }
                }
                C9627a.m27316a().mo63514a(this.f22406k, this.f22395N, "load_timeout", 0);
                return;
            }
            return;
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f22385D;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
            Iterator<CampaignEx> it = this.f22385D.iterator();
            while (it.hasNext()) {
                CampaignEx next2 = it.next();
                if (next2 != null) {
                    next2.setLoadTimeoutState(0);
                    if (next2.getRewardTemplateMode() != null && !TextUtils.isEmpty(next2.getRewardTemplateMode().mo57576e())) {
                        C9664i a2 = C9664i.m27564a();
                        a2.mo63683d(this.f22406k + "_" + next2.getRequestId() + "_" + next2.getRewardTemplateMode().mo57576e(), false);
                    }
                }
            }
            C9627a.m27316a().mo63514a(this.f22406k, (List<CampaignEx>) this.f22385D, "load_timeout", 0);
        }
    }

    /* renamed from: f */
    public final boolean mo61354f(boolean z) {
        if (z) {
            List<CampaignEx> list = this.f22395N;
            if (list == null || list.size() <= 0) {
                return false;
            }
            for (CampaignEx next : this.f22395N) {
                if (next != null) {
                    next.setLoadTimeoutState(1);
                    if (next.getRewardTemplateMode() != null && !TextUtils.isEmpty(next.getRewardTemplateMode().mo57576e())) {
                        C9664i a = C9664i.m27564a();
                        a.mo63683d(this.f22406k + "_" + next.getRequestId() + "_" + next.getRewardTemplateMode().mo57576e(), true);
                    }
                }
            }
            C9627a.m27316a().mo63514a(this.f22406k, this.f22395N, "load_timeout", 1);
            return true;
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f22385D;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return false;
        }
        Iterator<CampaignEx> it = this.f22385D.iterator();
        while (it.hasNext()) {
            CampaignEx next2 = it.next();
            if (next2 != null) {
                next2.setLoadTimeoutState(1);
                if (next2.getRewardTemplateMode() != null && !TextUtils.isEmpty(next2.getRewardTemplateMode().mo57576e())) {
                    C9664i a2 = C9664i.m27564a();
                    a2.mo63683d(this.f22406k + "_" + next2.getRequestId() + "_" + next2.getRewardTemplateMode().mo57576e(), true);
                }
            }
        }
        C9627a.m27316a().mo63514a(this.f22406k, (List<CampaignEx>) this.f22385D, "load_timeout", 1);
        return true;
    }

    /* renamed from: a */
    private void m26038a(String str, List<CampaignEx> list, List<CampaignEx> list2) {
        if (!(C9627a.m27316a() == null || this.f22384C == null)) {
            C9627a.m27316a().mo63517b(str);
        }
        if (!(C9627a.m27316a() == null || this.f22384C == null)) {
            C9627a.m27316a().mo63518b(str, this.f22384C.getVcn());
        }
        if (list != null && list.size() > 0) {
            if (!(this.f22384C == null || list.get(0) == null)) {
                C9110a.m25867a(this.f22384C.getRequestId(), list.get(0).getBidToken());
            }
            for (CampaignEx next : list) {
                if (next != null) {
                    C8473d.m24282a(next.getCampaignUnitId(), next.getRequestId(), next.getId(), next.getPlct(), next.getPlctb(), next.getTimestamp());
                }
            }
        }
        if (list2 != null && list2.size() > 0) {
            for (CampaignEx next2 : list2) {
                if (next2 != null) {
                    C8473d.m24284b(next2.getCampaignUnitId(), next2.getRequestId());
                }
            }
        }
        C8473d.m24283b(str);
        C8407b.m23908a(C8388a.m23845e().mo56913g()).mo56967a();
    }

    /* renamed from: a */
    private void m26029a(CampaignEx campaignEx) {
        try {
            C9627a a = C9627a.m27316a();
            if (a != null) {
                a.mo63509a(campaignEx);
            }
        } catch (Throwable th) {
            C8672v.m24875a("RewardMVVideoAdapter", th.getMessage(), th);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01c6, code lost:
        if (r1 != null) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01d2, code lost:
        if (r1 != null) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x018a, code lost:
        if (com.mbridge.msdk.foundation.tools.C8616ad.m24717a(r5.getVideoUrlEncode()) != false) goto L_0x018c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01be A[Catch:{ Exception -> 0x01ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01d8 A[SYNTHETIC, Splitter:B:114:0x01d8] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0131 A[SYNTHETIC, Splitter:B:64:0x0131] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0158 A[Catch:{ Exception -> 0x01ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0191 A[Catch:{ Exception -> 0x01ce }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> m26028a(com.mbridge.msdk.foundation.entity.CampaignUnit r13) {
        /*
            r12 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1 = 0
            com.mbridge.msdk.videocommon.d.c r2 = r12.f22415t     // Catch:{ Exception -> 0x01ce }
            if (r2 == 0) goto L_0x0010
            com.mbridge.msdk.videocommon.d.c r2 = r12.f22415t     // Catch:{ Exception -> 0x01ce }
            int r2 = r2.mo63604s()     // Catch:{ Exception -> 0x01ce }
        L_0x0010:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == 0) goto L_0x01c6
            java.util.ArrayList r3 = r13.getAds()     // Catch:{ Exception -> 0x01ce }
            if (r3 == 0) goto L_0x01c6
            java.util.ArrayList r3 = r13.getAds()     // Catch:{ Exception -> 0x01ce }
            int r3 = r3.size()     // Catch:{ Exception -> 0x01ce }
            if (r3 <= 0) goto L_0x01c6
            java.util.ArrayList r3 = r13.getAds()     // Catch:{ Exception -> 0x01ce }
            r12.f22394M = r3     // Catch:{ Exception -> 0x01ce }
            r4 = 0
            if (r13 == 0) goto L_0x005a
            java.util.ArrayList r5 = r13.getAds()     // Catch:{ Exception -> 0x01ce }
            if (r5 == 0) goto L_0x005a
            java.util.ArrayList r5 = r13.getAds()     // Catch:{ Exception -> 0x01ce }
            int r5 = r5.size()     // Catch:{ Exception -> 0x01ce }
            if (r5 <= 0) goto L_0x005a
            java.util.ArrayList r13 = r13.getAds()     // Catch:{ Exception -> 0x01ce }
            r5 = r4
        L_0x0043:
            int r6 = r13.size()     // Catch:{ Exception -> 0x01ce }
            if (r5 >= r6) goto L_0x005a
            java.lang.Object r6 = r13.get(r5)     // Catch:{ Exception -> 0x01ce }
            com.mbridge.msdk.foundation.entity.CampaignEx r6 = (com.mbridge.msdk.foundation.entity.CampaignEx) r6     // Catch:{ Exception -> 0x01ce }
            java.lang.String r7 = r12.f22406k     // Catch:{ Exception -> 0x01ce }
            r6.setCampaignUnitId(r7)     // Catch:{ Exception -> 0x01ce }
            r13.set(r5, r6)     // Catch:{ Exception -> 0x01ce }
            int r5 = r5 + 1
            goto L_0x0043
        L_0x005a:
            r13 = r4
        L_0x005b:
            int r5 = r3.size()     // Catch:{ Exception -> 0x01ce }
            if (r13 >= r5) goto L_0x01c6
            if (r13 >= r2) goto L_0x01c6
            java.lang.Object r5 = r3.get(r13)     // Catch:{ Exception -> 0x01ce }
            com.mbridge.msdk.foundation.entity.CampaignEx r5 = (com.mbridge.msdk.foundation.entity.CampaignEx) r5     // Catch:{ Exception -> 0x01ce }
            boolean r6 = r5.isMraid()     // Catch:{ Exception -> 0x01ce }
            if (r6 == 0) goto L_0x015c
            java.lang.String r6 = r5.getMraid()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r6 = r6.trim()     // Catch:{ Exception -> 0x01ce }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x01ce }
            if (r6 != 0) goto L_0x01c2
            int r6 = r5.getAdType()     // Catch:{ Exception -> 0x01ce }
            r7 = 287(0x11f, float:4.02E-43)
            java.lang.String r8 = ""
            if (r6 != r7) goto L_0x008a
            java.lang.String r6 = "3"
            goto L_0x00a1
        L_0x008a:
            int r6 = r5.getAdType()     // Catch:{ Exception -> 0x01ce }
            r7 = 94
            if (r6 != r7) goto L_0x0095
            java.lang.String r6 = "1"
            goto L_0x00a1
        L_0x0095:
            int r6 = r5.getAdType()     // Catch:{ Exception -> 0x01ce }
            r7 = 42
            if (r6 != r7) goto L_0x00a0
            java.lang.String r6 = "2"
            goto L_0x00a1
        L_0x00a0:
            r6 = r8
        L_0x00a1:
            com.mbridge.msdk.foundation.same.b.c r7 = com.mbridge.msdk.foundation.same.p301b.C8476c.MBRIDGE_700_HTML     // Catch:{ Exception -> 0x011f }
            java.lang.String r7 = com.mbridge.msdk.foundation.same.p301b.C8478e.m24306b(r7)     // Catch:{ Exception -> 0x011f }
            java.lang.String r9 = r5.getMraid()     // Catch:{ Exception -> 0x011f }
            java.lang.String r9 = com.mbridge.msdk.foundation.tools.SameMD5.getMD5(r9)     // Catch:{ Exception -> 0x011f }
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x011f }
            if (r10 == 0) goto L_0x00bd
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x011f }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x011f }
        L_0x00bd:
            java.lang.String r10 = ".html"
            java.lang.String r9 = r9.concat(r10)     // Catch:{ Exception -> 0x011f }
            java.io.File r10 = new java.io.File     // Catch:{ Exception -> 0x011f }
            r10.<init>(r7, r9)     // Catch:{ Exception -> 0x011f }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x011f }
            r7.<init>(r10)     // Catch:{ Exception -> 0x011f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            r1.<init>()     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            java.lang.String r9 = "<script>"
            r1.append(r9)     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            com.mbridge.msdk.c.b.a r9 = com.mbridge.msdk.p078c.p080b.C2446a.m6038a()     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            java.lang.String r9 = r9.mo16297b()     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            r1.append(r9)     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            java.lang.String r9 = "</script>"
            r1.append(r9)     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            java.lang.String r9 = r5.getMraid()     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            r1.append(r9)     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            byte[] r1 = r1.getBytes()     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            r7.write(r1)     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            r7.flush()     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            java.lang.String r1 = r10.getAbsolutePath()     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            r5.setMraid(r1)     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            java.lang.String r1 = r12.f22406k     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            com.mbridge.msdk.foundation.same.report.C8580c.m24604a(r5, r8, r1, r6)     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            r7.close()     // Catch:{ Exception -> 0x0111, all -> 0x010d }
            r1 = r7
            goto L_0x0134
        L_0x010d:
            r13 = move-exception
            r1 = r7
            goto L_0x01d6
        L_0x0111:
            r13 = move-exception
            r1 = r7
            goto L_0x01cf
        L_0x0115:
            r13 = move-exception
            r1 = r7
            goto L_0x0156
        L_0x0118:
            r1 = move-exception
            r11 = r7
            r7 = r1
            r1 = r11
            goto L_0x0120
        L_0x011d:
            r13 = move-exception
            goto L_0x0156
        L_0x011f:
            r7 = move-exception
        L_0x0120:
            r7.printStackTrace()     // Catch:{ all -> 0x011d }
            r5.setMraid(r8)     // Catch:{ all -> 0x011d }
            java.lang.String r7 = r7.getMessage()     // Catch:{ all -> 0x011d }
            java.lang.String r8 = r12.f22406k     // Catch:{ all -> 0x011d }
            com.mbridge.msdk.foundation.same.report.C8580c.m24604a(r5, r7, r8, r6)     // Catch:{ all -> 0x011d }
            if (r1 == 0) goto L_0x0134
            r1.close()     // Catch:{ Exception -> 0x01ce }
        L_0x0134:
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x01ce }
            java.lang.String r7 = r5.getMraid()     // Catch:{ Exception -> 0x01ce }
            r6.<init>(r7)     // Catch:{ Exception -> 0x01ce }
            boolean r7 = r6.exists()     // Catch:{ Exception -> 0x01ce }
            if (r7 == 0) goto L_0x014f
            boolean r7 = r6.isFile()     // Catch:{ Exception -> 0x01ce }
            if (r7 == 0) goto L_0x014f
            boolean r6 = r6.canRead()     // Catch:{ Exception -> 0x01ce }
            if (r6 != 0) goto L_0x015c
        L_0x014f:
            java.lang.String r5 = "mraid resource write fail"
            r12.m26047c((java.lang.String) r5)     // Catch:{ Exception -> 0x01ce }
            goto L_0x01c2
        L_0x0156:
            if (r1 == 0) goto L_0x015b
            r1.close()     // Catch:{ Exception -> 0x01ce }
        L_0x015b:
            throw r13     // Catch:{ Exception -> 0x01ce }
        L_0x015c:
            if (r5 == 0) goto L_0x01c2
            int r6 = r5.getOfferType()     // Catch:{ Exception -> 0x01ce }
            r7 = 99
            if (r6 == r7) goto L_0x01c2
            boolean r6 = r12.m26044b((com.mbridge.msdk.foundation.entity.CampaignEx) r5)     // Catch:{ Exception -> 0x01ce }
            r7 = 1
            if (r6 == 0) goto L_0x0182
            java.lang.String r6 = r5.getendcard_url()     // Catch:{ Exception -> 0x01ce }
            boolean r6 = com.mbridge.msdk.foundation.tools.C8616ad.m24717a(r6)     // Catch:{ Exception -> 0x01ce }
            if (r6 == 0) goto L_0x018e
            java.lang.String r6 = r5.getMraid()     // Catch:{ Exception -> 0x01ce }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x01ce }
            if (r6 == 0) goto L_0x018e
            goto L_0x018c
        L_0x0182:
            java.lang.String r6 = r5.getVideoUrlEncode()     // Catch:{ Exception -> 0x01ce }
            boolean r6 = com.mbridge.msdk.foundation.tools.C8616ad.m24717a(r6)     // Catch:{ Exception -> 0x01ce }
            if (r6 == 0) goto L_0x018e
        L_0x018c:
            r6 = r4
            goto L_0x018f
        L_0x018e:
            r6 = r7
        L_0x018f:
            if (r6 == 0) goto L_0x01be
            int r6 = r5.getWtick()     // Catch:{ Exception -> 0x01ce }
            if (r6 == r7) goto L_0x01ba
            android.content.Context r6 = r12.f22405j     // Catch:{ Exception -> 0x01ce }
            java.lang.String r7 = r5.getPackageName()     // Catch:{ Exception -> 0x01ce }
            boolean r6 = com.mbridge.msdk.foundation.tools.C8677z.m24934c(r6, r7)     // Catch:{ Exception -> 0x01ce }
            if (r6 != 0) goto L_0x01a4
            goto L_0x01ba
        L_0x01a4:
            boolean r6 = com.mbridge.msdk.foundation.tools.C8677z.m24930b((com.mbridge.msdk.foundation.entity.CampaignEx) r5)     // Catch:{ Exception -> 0x01ce }
            if (r6 == 0) goto L_0x01ae
            r0.add(r5)     // Catch:{ Exception -> 0x01ce }
            goto L_0x01c2
        L_0x01ae:
            java.lang.String r6 = r12.f22406k     // Catch:{ Exception -> 0x01ce }
            int r7 = com.mbridge.msdk.foundation.same.C8469a.f20761v     // Catch:{ Exception -> 0x01ce }
            com.mbridge.msdk.foundation.tools.C8677z.m24917a((java.lang.String) r6, (com.mbridge.msdk.foundation.entity.CampaignEx) r5, (int) r7)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r5 = "APP ALREADY INSTALLED"
            r12.f22393L = r5     // Catch:{ Exception -> 0x01ce }
            goto L_0x01c2
        L_0x01ba:
            r0.add(r5)     // Catch:{ Exception -> 0x01ce }
            goto L_0x01c2
        L_0x01be:
            java.lang.String r5 = "No video campaign"
            r12.f22393L = r5     // Catch:{ Exception -> 0x01ce }
        L_0x01c2:
            int r13 = r13 + 1
            goto L_0x005b
        L_0x01c6:
            if (r1 == 0) goto L_0x01d5
        L_0x01c8:
            r1.close()     // Catch:{ IOException -> 0x01d5 }
            goto L_0x01d5
        L_0x01cc:
            r13 = move-exception
            goto L_0x01d6
        L_0x01ce:
            r13 = move-exception
        L_0x01cf:
            r13.printStackTrace()     // Catch:{ all -> 0x01cc }
            if (r1 == 0) goto L_0x01d5
            goto L_0x01c8
        L_0x01d5:
            return r0
        L_0x01d6:
            if (r1 == 0) goto L_0x01db
            r1.close()     // Catch:{ IOException -> 0x01db }
        L_0x01db:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.C9154d.m26028a(com.mbridge.msdk.foundation.entity.CampaignUnit):java.util.concurrent.CopyOnWriteArrayList");
    }

    /* renamed from: g */
    private int m26053g() {
        try {
            int a = C8616ad.m24718b(this.f22406k) ? C9110a.m25859a(this.f22406k) : 0;
            if (this.f22415t == null || a > this.f22415t.mo63606t()) {
                return 0;
            }
            return a;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m26056h() {
        try {
            if (C8616ad.m24718b(this.f22406k)) {
                C9110a.m25866a(this.f22406k, 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: i */
    private String m26058i() {
        try {
            if (C8616ad.m24718b(C9110a.f22131a)) {
                return C9110a.f22131a;
            }
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: j */
    private void m26060j() {
        try {
            if (C8473d.f20772a != null && C8473d.f20772a.size() > 0) {
                C8473d.f20772a.clear();
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: k */
    private void m26062k() {
        try {
            C8416i.m23982a((C8412f) C8414g.m23969a(this.f22405j)).mo57027a(this.f22406k);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    private boolean m26044b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return false;
        }
        try {
            if (campaignEx.getPlayable_ads_without_video() == 2) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public final void mo61343a(List<CampaignEx> list) {
        this.f22395N = list;
    }

    /* renamed from: d */
    public final CopyOnWriteArrayList<CampaignEx> mo61351d() {
        return this.f22385D;
    }

    /* renamed from: a */
    public final void mo61337a(int i, int i2, int i3) {
        this.f22421z = i;
        this.f22382A = i2;
        this.f22383B = i3;
    }

    /* renamed from: b */
    public final void mo61346b(String str) {
        if (this.f22415t != null && TextUtils.isEmpty(str)) {
            int b = this.f22415t.mo63569b() * 1000;
            List<CampaignEx> list = this.f22395N;
            if (list != null && list.size() > 0) {
                if (System.currentTimeMillis() - this.f22395N.get(0).getTimestamp() < ((long) b)) {
                    m26047c("hit ltorwc");
                    return;
                }
            }
        }
        m26039a(str, this.f22386E);
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.d$e */
    /* compiled from: RewardMVVideoAdapter */
    public class C9174e implements Runnable {

        /* renamed from: b */
        private String f22497b;

        public C9174e(String str) {
            this.f22497b = str;
        }

        public final void run() {
            try {
                String unused = C9154d.this.f22412q = C8677z.m24926b(C9154d.this.f22405j, C9154d.this.f22406k);
                if (!C9154d.this.f22390I) {
                    if (!(C9154d.this.f22388G == null || C9154d.this.f22391J == null)) {
                        C9154d.this.f22391J.removeCallbacks(C9154d.this.f22388G);
                    }
                    boolean unused2 = C9154d.this.f22389H = true;
                    if (C9154d.this.f22391J != null) {
                        Message obtainMessage = C9154d.this.f22391J.obtainMessage();
                        obtainMessage.obj = this.f22497b;
                        obtainMessage.what = 1;
                        C9154d.this.f22391J.sendMessage(obtainMessage);
                    }
                    if (!TextUtils.isEmpty(C9154d.this.f22412q)) {
                        C8672v.m24878d("RewardMVVideoAdapter", "excludeId : " + C9154d.this.f22412q);
                    }
                }
            } catch (Exception e) {
                C8672v.m24878d("RewardMVVideoAdapter", e.getMessage());
            }
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.d$d */
    /* compiled from: RewardMVVideoAdapter */
    public class C9173d implements Runnable {

        /* renamed from: b */
        private String f22495b;

        public C9173d(String str) {
            this.f22495b = str;
        }

        public final void run() {
            try {
                if (!C9154d.this.f22389H) {
                    boolean unused = C9154d.this.f22390I = true;
                    if (C9154d.this.f22391J != null) {
                        Message obtainMessage = C9154d.this.f22391J.obtainMessage();
                        obtainMessage.obj = this.f22495b;
                        obtainMessage.what = 2;
                        C9154d.this.f22391J.sendMessage(obtainMessage);
                    }
                }
            } catch (Exception e) {
                C8672v.m24878d("RewardMVVideoAdapter", e.getMessage());
            }
        }
    }

    /* renamed from: b */
    private void m26043b(String str, boolean z) {
        C8498b.m24359a().execute(new C9174e(str));
        if (this.f22391J != null) {
            C9173d dVar = new C9173d(str);
            this.f22388G = dVar;
            this.f22391J.postDelayed(dVar, 90000);
            return;
        }
        m26039a(str, z);
    }

    /* renamed from: a */
    static /* synthetic */ void m26035a(C9154d dVar, String str, List list, List list2, boolean z) {
        C8410e.m23925a((C8412f) C8414g.m23969a(C8388a.m23845e().mo56913g())).mo56995a(str, (List<CampaignEx>) list, (List<CampaignEx>) list2, z);
        if (list2 != null && list2.size() > 0) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                CampaignEx campaignEx = (CampaignEx) it.next();
                if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().mo57576e())) {
                    C9625a.m27306b(str + "_" + campaignEx.getId() + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().mo57576e());
                    C9625a.m27304b(campaignEx.getAdType(), campaignEx);
                }
            }
        }
        if (z) {
            dVar.m26038a(str, (List<CampaignEx>) list, (List<CampaignEx>) list2);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m26036a(C9154d dVar, String str, List list, boolean z) {
        if (!TextUtils.isEmpty(str) && list != null && list.size() > 0) {
            C8410e.m23925a((C8412f) C8414g.m23969a(C8388a.m23845e().mo56913g())).mo56996a(str, (List<CampaignEx>) list, z);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m26031a(C9154d dVar, WindVaneWebView windVaneWebView, String str, CampaignEx campaignEx, List list, String str2, String str3, C9640c cVar, String str4) {
        C9514j jVar;
        C9154d dVar2 = dVar;
        CampaignEx campaignEx2 = campaignEx;
        List list2 = list;
        try {
            C9625a.C9626a aVar = new C9625a.C9626a();
            WindVaneWebView windVaneWebView2 = new WindVaneWebView(C8388a.m23845e().mo56913g());
            aVar.mo63498a(windVaneWebView2);
            if (list2 == null || list.size() <= 0) {
                jVar = new C9514j((Activity) null, campaignEx2);
            } else {
                jVar = new C9514j((Activity) null, campaignEx2, list2);
            }
            C9514j jVar2 = jVar;
            jVar2.mo63239a(dVar2.f22417v);
            jVar2.mo63244a(str3);
            jVar2.mo63243a(cVar);
            jVar2.mo63281d(dVar2.f22386E);
            C9172c cVar2 = r1;
            C9172c cVar3 = new C9172c(windVaneWebView, str3, campaignEx, list, str2, str3, cVar, dVar2.f22417v, dVar);
            windVaneWebView2.setWebViewListener(new C9175f(windVaneWebView, str, str3, aVar, campaignEx, dVar, cVar2, dVar2.f22391J));
            windVaneWebView2.setObject(jVar2);
            windVaneWebView2.loadUrl(str2);
            dVar2.f22391J.postDelayed(cVar2, 5000);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        } catch (Throwable th) {
            C8672v.m24874a("RewardMVVideoAdapter", th.getMessage());
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m26033a(C9154d dVar, String str, CampaignEx campaignEx, String str2, String str3, C9640c cVar) {
        C9514j jVar;
        C9154d dVar2 = dVar;
        CampaignEx campaignEx2 = campaignEx;
        try {
            C9625a.C9626a aVar = new C9625a.C9626a();
            WindVaneWebView windVaneWebView = new WindVaneWebView(C8388a.m23845e().mo56913g());
            aVar.mo63498a(windVaneWebView);
            String b = C9261c.m26212a().mo62511b();
            aVar.mo63499a(b);
            if (dVar2.f22384C == null || dVar2.f22384C.getAds() == null || dVar2.f22384C.getAds().size() <= 0) {
                jVar = new C9514j((Activity) null, campaignEx2);
            } else {
                jVar = new C9514j((Activity) null, campaignEx2, dVar2.f22384C.getAds());
            }
            C9514j jVar2 = jVar;
            jVar2.mo63239a(dVar2.f22417v);
            jVar2.mo63244a(str3);
            jVar2.mo63278c(b);
            jVar2.mo63243a(cVar);
            jVar2.mo63281d(dVar2.f22386E);
            C9171b bVar = new C9171b(str3, campaignEx, str2, str3, cVar, dVar2.f22417v, dVar);
            windVaneWebView.setWebViewListener(new C9170a(str, str3, aVar, campaignEx, dVar, bVar, dVar2.f22391J));
            windVaneWebView.setObject(jVar2);
            windVaneWebView.loadUrl(str2);
            dVar2.f22391J.postDelayed(bVar, 5000);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        } catch (Throwable th) {
            C8672v.m24874a("RewardMVVideoAdapter", th.getMessage());
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m26034a(C9154d dVar, String str, String str2) {
        try {
            if (dVar.f22416u != null && !TextUtils.isEmpty(str2)) {
                Iterator<CampaignEx> it = dVar.f22416u.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    CampaignEx next = it.next();
                    if (next != null) {
                        String videoUrlEncode = next.getVideoUrlEncode();
                        if (!TextUtils.isEmpty(videoUrlEncode) && str2.equals(videoUrlEncode)) {
                            dVar.f22416u.remove(next);
                            dVar.m26029a(next);
                            break;
                        }
                        String str3 = next.getendcard_url();
                        if (!TextUtils.isEmpty(str3) && str2.equals(str3)) {
                            dVar.f22416u.remove(next);
                            dVar.m26029a(next);
                            break;
                        }
                        CampaignEx.C8454c rewardTemplateMode = next.getRewardTemplateMode();
                        if (rewardTemplateMode != null) {
                            List<CampaignEx.C8454c.C8455a> f = rewardTemplateMode.mo57577f();
                            if (f != null) {
                                Iterator<CampaignEx.C8454c.C8455a> it2 = f.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        CampaignEx.C8454c.C8455a next2 = it2.next();
                                        if (next2 != null && next2.f20604b != null && next2.f20604b.contains(str2)) {
                                            dVar.f22416u.remove(next);
                                            dVar.m26029a(next);
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                            String e = rewardTemplateMode.mo57576e();
                            if (!TextUtils.isEmpty(e) && str2.equals(e)) {
                                dVar.f22416u.remove(next);
                                dVar.m26029a(next);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                if (dVar.f22414s != null && dVar.f22416u != null && dVar.f22416u.size() == 0) {
                    if (dVar.f22391J != null) {
                        dVar.f22391J.removeMessages(5);
                    }
                    dVar.m26047c(str);
                    dVar.f22414s.mo37117a(str);
                }
            } else if (dVar.f22414s != null) {
                if (dVar.f22391J != null) {
                    dVar.f22391J.removeMessages(5);
                }
                dVar.m26047c(str);
                dVar.f22414s.mo37117a(str);
            }
        } catch (Throwable th) {
            C8672v.m24875a("RewardMVVideoAdapter", th.getMessage(), th);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m26030a(C9154d dVar, CampaignUnit campaignUnit) {
        C9154d dVar2 = dVar;
        final CampaignUnit campaignUnit2 = campaignUnit;
        dVar2.f22384C = campaignUnit2;
        dVar2.f22385D = dVar.m26028a(campaignUnit);
        try {
            CampaignEx campaignEx = campaignUnit.getAds().get(0);
            Context context = dVar2.f22405j;
            StringBuilder sb = new StringBuilder();
            sb.append("start download resource tpl ");
            sb.append(!TextUtils.isEmpty(campaignUnit.getAds().get(0).getCMPTEntryUrl()));
            C9176a.m26122a(campaignEx, context, sb.toString(), dVar2.f22406k, dVar2.f22419x, "", "", System.currentTimeMillis() - dVar2.f22392K);
        } catch (Exception unused) {
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = dVar2.f22385D;
        C8498b.m24359a().execute(new Runnable() {
            public final void run() {
                C8417j.m23986a((C8412f) C8414g.m23969a(C9154d.this.f22405j)).mo57031b();
                CampaignUnit campaignUnit = campaignUnit2;
                if (campaignUnit != null && campaignUnit.getAds() != null && campaignUnit2.getAds().size() > 0) {
                    C9154d.m26037a(C9154d.this, (List) campaignUnit2.getAds());
                }
            }
        });
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = dVar2.f22385D;
        if (copyOnWriteArrayList2 == null || copyOnWriteArrayList2.size() <= 0) {
            C8672v.m24876b("RewardMVVideoAdapter", "onload load fail, callback campaign have not video");
            if (TextUtils.isEmpty(dVar2.f22393L)) {
                dVar2.f22393L = "APP ALREADY INSTALLED";
            }
            dVar2.m26047c(dVar2.f22393L);
            return;
        }
        C8672v.m24876b("RewardMVVideoAdapter", "onload load success size:" + dVar2.f22385D.size());
        Handler handler = dVar2.f22391J;
        if (handler != null) {
            handler.sendEmptyMessage(3);
        }
        if (campaignUnit2 != null) {
            String sessionId = campaignUnit.getSessionId();
            if (C8616ad.m24718b(sessionId)) {
                C9110a.f22131a = sessionId;
            }
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList3 = dVar2.f22385D;
        if (copyOnWriteArrayList3 != null) {
            try {
                if (copyOnWriteArrayList3.size() > 0) {
                    dVar2.f22408m += copyOnWriteArrayList3.size();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (dVar2.f22415t == null || dVar2.f22408m > dVar2.f22415t.mo63606t()) {
            dVar2.f22408m = 0;
        }
        if (C8616ad.m24718b(dVar2.f22406k)) {
            C9110a.m25866a(dVar2.f22406k, dVar2.f22408m);
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList4 = dVar2.f22385D;
        if (copyOnWriteArrayList4 != null && copyOnWriteArrayList4.size() > 0) {
            String str = dVar2.f22407l;
            String str2 = dVar2.f22406k;
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList5 = dVar2.f22385D;
            if (C9627a.m27316a() != null) {
                C9627a.m27316a().mo63512a(str, str2, (List<CampaignEx>) copyOnWriteArrayList5);
            }
        }
        final CampaignEx campaignEx2 = dVar2.f22385D.get(0);
        final boolean z = !TextUtils.isEmpty(campaignEx2.getCMPTEntryUrl());
        final int nscpt = campaignEx2.getNscpt();
        dVar2.f22400e = false;
        dVar2.f22401f = false;
        synchronized (dVar2.f22398c) {
            if (dVar2.f22402g) {
                dVar2.f22402g = false;
            }
        }
        dVar2.f22404i = false;
        dVar2.f22403h = false;
        if (dVar2.f22419x && campaignEx2 != null) {
            C8407b.m23908a(C8388a.m23845e().mo56913g()).mo56970a(campaignEx2.getBidToken(), campaignEx2.getCampaignUnitId(), campaignEx2.getEncryptPrice());
        }
        C9133c.C9153m.f22381a.mo61320a(dVar2.f22405j, z, nscpt, dVar2.f22419x, dVar2.f22418w ? 287 : 94, dVar2.f22407l, dVar2.f22406k, campaignEx2.getRequestId(), dVar2.f22385D, new C9133c.C9140c() {
            /* renamed from: a */
            public final void mo61294a(String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
                final String str4 = str2;
                final CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = copyOnWriteArrayList;
                C9154d.this.f22400e = true;
                if (copyOnWriteArrayList2 != null && copyOnWriteArrayList.size() > 0) {
                    try {
                        Context h = C9154d.this.f22405j;
                        C9176a.m26122a(copyOnWriteArrayList2.get(0), h, "resource download success is tpl :" + z, C9154d.this.f22406k, C9154d.this.f22419x, str3, campaignEx2.getRequestIdNotice(), System.currentTimeMillis() - C9154d.this.f22392K);
                    } catch (Exception unused) {
                    }
                }
                if (!z) {
                    Iterator<CampaignEx> it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        final CampaignEx next = it.next();
                        if (next == null || next.getRewardTemplateMode() == null || TextUtils.isEmpty(next.getRewardTemplateMode().mo57576e()) || next.getRewardTemplateMode().mo57576e().contains(CampaignEx.KEY_IS_CMPT_ENTRY) || C9154d.this.f22391J == null) {
                            C9154d dVar = C9154d.this;
                            if (dVar.mo61344a((List<CampaignEx>) dVar.f22385D, z, nscpt)) {
                                C9154d dVar2 = C9154d.this;
                                C9154d.m26035a(dVar2, dVar2.f22406k, (List) copyOnWriteArrayList2, C9154d.this.f22395N, C9154d.this.f22419x);
                                if (C9154d.this.f22391J != null) {
                                    C9154d.this.f22391J.removeMessages(5);
                                }
                                if (C9154d.this.f22414s != null && !C9154d.this.f22403h) {
                                    C9154d.this.f22403h = true;
                                    if (!TextUtils.isEmpty(C9154d.this.f22406k)) {
                                        C9176a.m26120a(C9154d.this.f22405j, C9154d.this.f22385D, C9154d.this.f22406k, System.currentTimeMillis() - C9154d.this.f22392K);
                                    }
                                    C9154d.this.f22414s.mo37116a();
                                }
                            } else {
                                C9154d dVar3 = C9154d.this;
                                C9154d.m26036a(dVar3, str4, dVar3.f22394M, C9154d.this.f22419x);
                                if (C9154d.this.f22391J != null) {
                                    C9154d.this.f22391J.removeMessages(5);
                                }
                                if (C9154d.this.f22414s != null && !C9154d.this.f22404i) {
                                    C9154d.this.f22404i = true;
                                    if (!TextUtils.isEmpty(C9154d.this.f22406k) && C9154d.this.f22385D != null && C9154d.this.f22385D.size() > 0) {
                                        C9176a.m26121a((CampaignEx) C9154d.this.f22385D.get(0), C9154d.this.f22405j, "have no temp but isReady false", C9154d.this.f22406k, C9154d.this.f22419x, str3, campaignEx2.getRequestIdNotice());
                                    }
                                    C9154d.this.f22414s.mo37117a("errorCode: 3503 errorMessage: have no temp but isReady false");
                                }
                            }
                        } else {
                            final String str5 = str;
                            final String str6 = str2;
                            final String str7 = str3;
                            final CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList3 = copyOnWriteArrayList;
                            C9154d.this.f22391J.post(new Runnable() {
                                public final void run() {
                                    C9133c a = C9133c.C9153m.f22381a;
                                    boolean l = C9154d.this.f22386E;
                                    Handler i = C9154d.this.f22391J;
                                    boolean m = C9154d.this.f22418w;
                                    boolean f = C9154d.this.f22419x;
                                    String e = next.getRewardTemplateMode().mo57576e();
                                    int o = C9154d.this.f22417v;
                                    CampaignEx campaignEx = campaignEx2;
                                    CopyOnWriteArrayList c = C9154d.this.f22385D;
                                    String b = C9652g.m27539a().mo63670b(next.getRewardTemplateMode().mo57576e());
                                    String str = str5;
                                    String str2 = str6;
                                    String str3 = str7;
                                    String requestIdNotice = next.getRequestIdNotice();
                                    C9640c p = C9154d.this.f22415t;
                                    C91591 r17 = r6;
                                    C91591 r6 = new C9133c.C9148j() {
                                        /* renamed from: a */
                                        public final void mo61297a(String str, String str2, String str3, String str4, String str5, C9625a.C9626a aVar) {
                                            try {
                                                Context h = C9154d.this.f22405j;
                                                C9176a.m26122a((CampaignEx) copyOnWriteArrayList3.get(0), h, "preload template success is tpl :" + z, C9154d.this.f22406k, C9154d.this.f22419x, str7, campaignEx2.getRequestIdNotice(), System.currentTimeMillis() - C9154d.this.f22392K);
                                            } catch (Exception unused) {
                                            }
                                            if (C9154d.this.mo61344a((List<CampaignEx>) C9154d.this.f22385D, z, nscpt)) {
                                                C9154d.m26035a(C9154d.this, C9154d.this.f22406k, (List) copyOnWriteArrayList3, C9154d.this.f22395N, C9154d.this.f22419x);
                                                if (C9154d.this.f22391J != null) {
                                                    C9154d.this.f22391J.removeMessages(5);
                                                }
                                                if (C9154d.this.f22414s != null && !C9154d.this.f22403h) {
                                                    C9154d.this.f22403h = true;
                                                    if (!TextUtils.isEmpty(C9154d.this.f22406k)) {
                                                        C9176a.m26120a(C9154d.this.f22405j, C9154d.this.f22385D, C9154d.this.f22406k, System.currentTimeMillis() - C9154d.this.f22392K);
                                                    }
                                                    C9154d.this.f22414s.mo37116a();
                                                    return;
                                                }
                                                return;
                                            }
                                            C9154d.m26036a(C9154d.this, str3, C9154d.this.f22394M, C9154d.this.f22419x);
                                            if (C9154d.this.f22391J != null) {
                                                C9154d.this.f22391J.removeMessages(5);
                                            }
                                            if (C9154d.this.f22414s != null && !C9154d.this.f22404i) {
                                                C9154d.this.f22404i = true;
                                                if (!TextUtils.isEmpty(C9154d.this.f22406k) && C9154d.this.f22385D != null && C9154d.this.f22385D.size() > 0) {
                                                    C9176a.m26121a((CampaignEx) C9154d.this.f22385D.get(0), C9154d.this.f22405j, "temp preload success but isReady false", C9154d.this.f22406k, C9154d.this.f22419x, str4, campaignEx2.getRequestIdNotice());
                                                }
                                                C9154d.this.f22414s.mo37117a("errorCode: 3502 errorMessage: temp preload success but isReady false");
                                            }
                                        }

                                        /* renamed from: a */
                                        public final void mo61298a(String str, String str2, String str3, String str4, String str5, C9625a.C9626a aVar, String str6) {
                                            String str7 = str6;
                                            try {
                                                Context h = C9154d.this.f22405j;
                                                C9176a.m26122a((CampaignEx) copyOnWriteArrayList3.get(0), h, "preload template failed is tpl :" + z + " " + str7, C9154d.this.f22406k, C9154d.this.f22419x, str7, campaignEx2.getRequestIdNotice(), System.currentTimeMillis() - C9154d.this.f22392K);
                                            } catch (Exception unused) {
                                            }
                                            if (campaignEx2.getRsIgnoreCheckRule() == null || campaignEx2.getRsIgnoreCheckRule().size() <= 0 || !campaignEx2.getRsIgnoreCheckRule().contains(1)) {
                                                C9154d.m26036a(C9154d.this, str3, C9154d.this.f22394M, C9154d.this.f22419x);
                                                if (C9154d.this.f22391J != null) {
                                                    C9154d.this.f22391J.removeMessages(5);
                                                }
                                                if (C9154d.this.f22414s != null && !C9154d.this.f22404i) {
                                                    C9154d.this.f22404i = true;
                                                    if (!TextUtils.isEmpty(C9154d.this.f22406k) && C9154d.this.f22394M != null && C9154d.this.f22394M.size() > 0) {
                                                        Context h2 = C9154d.this.f22405j;
                                                        C9176a.m26121a((CampaignEx) C9154d.this.f22394M.get(0), h2, "temp preload failed: " + str7, C9154d.this.f22406k, C9154d.this.f22419x, str4, campaignEx2.getRequestIdNotice());
                                                    }
                                                    C9132b a = C9154d.this.f22414s;
                                                    a.mo37117a("errorCode: 3301 errorMessage: temp preload failed: " + str7);
                                                    return;
                                                }
                                                return;
                                            }
                                            C8672v.m24876b("RewardMVVideoAdapter", "template download fail but hit ignoreCheckRule");
                                        }
                                    };
                                    a.mo61321a(l, i, m, f, (WindVaneWebView) null, e, o, campaignEx, c, b, str, str2, str3, requestIdNotice, p, r17);
                                }
                            });
                        }
                    }
                } else if (C9154d.this.f22401f && !C9154d.this.f22402g && C9154d.this.f22391J != null) {
                    synchronized (C9154d.this.f22398c) {
                        if (!C9154d.this.f22402g) {
                            C9154d.this.f22402g = true;
                            final String str8 = str3;
                            C9154d.this.f22391J.post(new Runnable() {
                                public final void run() {
                                    C9133c a = C9133c.C9153m.f22381a;
                                    boolean l = C9154d.this.f22386E;
                                    Handler i = C9154d.this.f22391J;
                                    boolean m = C9154d.this.f22418w;
                                    boolean f = C9154d.this.f22419x;
                                    String str = str8;
                                    String requestIdNotice = campaignEx2.getRequestIdNotice();
                                    String q = C9154d.this.f22407l;
                                    String str2 = str4;
                                    String cMPTEntryUrl = campaignEx2.getCMPTEntryUrl();
                                    int o = C9154d.this.f22417v;
                                    CampaignEx campaignEx = campaignEx2;
                                    CopyOnWriteArrayList c = C9154d.this.f22385D;
                                    String b = C9652g.m27539a().mo63670b(campaignEx2.getCMPTEntryUrl());
                                    String str3 = str4;
                                    C9133c cVar = a;
                                    C9640c p = C9154d.this.f22415t;
                                    C91611 r17 = r1;
                                    C91611 r1 = new C9133c.C9148j() {
                                        /* renamed from: a */
                                        public final void mo61297a(String str, String str2, String str3, String str4, String str5, C9625a.C9626a aVar) {
                                            try {
                                                Context h = C9154d.this.f22405j;
                                                C9176a.m26122a((CampaignEx) copyOnWriteArrayList2.get(0), h, "preload template success is tpl :" + z, C9154d.this.f22406k, C9154d.this.f22419x, str8, campaignEx2.getRequestIdNotice(), System.currentTimeMillis() - C9154d.this.f22392K);
                                            } catch (Exception unused) {
                                            }
                                            if (C9154d.this.mo61344a((List<CampaignEx>) C9154d.this.f22385D, z, nscpt)) {
                                                C9154d.m26035a(C9154d.this, C9154d.this.f22406k, (List) copyOnWriteArrayList2, C9154d.this.f22395N, C9154d.this.f22419x);
                                                if (C9154d.this.f22391J != null) {
                                                    C9154d.this.f22391J.removeMessages(5);
                                                }
                                                if (C9154d.this.f22414s != null && !C9154d.this.f22403h) {
                                                    C9154d.this.f22403h = true;
                                                    if (!TextUtils.isEmpty(C9154d.this.f22406k)) {
                                                        C9176a.m26120a(C9154d.this.f22405j, C9154d.this.f22385D, C9154d.this.f22406k, System.currentTimeMillis() - C9154d.this.f22392K);
                                                    }
                                                    C9154d.this.f22414s.mo37116a();
                                                    return;
                                                }
                                                return;
                                            }
                                            C9154d.m26036a(C9154d.this, str3, C9154d.this.f22394M, C9154d.this.f22419x);
                                            if (C9154d.this.f22391J != null) {
                                                C9154d.this.f22391J.removeMessages(5);
                                            }
                                            if (C9154d.this.f22414s != null && !C9154d.this.f22404i) {
                                                C9154d.this.f22404i = true;
                                                if (!TextUtils.isEmpty(C9154d.this.f22406k) && C9154d.this.f22394M != null && C9154d.this.f22394M.size() > 0) {
                                                    C9176a.m26121a((CampaignEx) C9154d.this.f22394M.get(0), C9154d.this.f22405j, "tpl temp preload success but isReady false", C9154d.this.f22406k, C9154d.this.f22419x, str4, campaignEx2.getRequestIdNotice());
                                                }
                                                C9154d.this.f22414s.mo37117a("errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                                            }
                                        }

                                        /* renamed from: a */
                                        public final void mo61298a(String str, String str2, String str3, String str4, String str5, C9625a.C9626a aVar, String str6) {
                                            String str7 = str6;
                                            try {
                                                Context h = C9154d.this.f22405j;
                                                C9176a.m26122a((CampaignEx) copyOnWriteArrayList2.get(0), h, "preload template failed is tpl :" + z + " " + str7, C9154d.this.f22406k, C9154d.this.f22419x, str8, campaignEx2.getRequestIdNotice(), System.currentTimeMillis() - C9154d.this.f22392K);
                                            } catch (Exception unused) {
                                            }
                                            if (campaignEx2.getRsIgnoreCheckRule() == null || campaignEx2.getRsIgnoreCheckRule().size() <= 0 || !campaignEx2.getRsIgnoreCheckRule().contains(3)) {
                                                C9154d.m26036a(C9154d.this, str3, C9154d.this.f22394M, C9154d.this.f22419x);
                                                if (C9154d.this.f22391J != null) {
                                                    C9154d.this.f22391J.removeMessages(5);
                                                }
                                                if (C9154d.this.f22414s != null && !C9154d.this.f22404i) {
                                                    C9154d.this.f22404i = true;
                                                    if (C9154d.this.f22394M != null && C9154d.this.f22394M.size() > 0) {
                                                        Context h2 = C9154d.this.f22405j;
                                                        C9176a.m26121a((CampaignEx) C9154d.this.f22394M.get(0), h2, "tpl temp preload failed: " + str7, C9154d.this.f22406k, C9154d.this.f22419x, str4, campaignEx2.getRequestIdNotice());
                                                    }
                                                    C9132b a = C9154d.this.f22414s;
                                                    a.mo37117a("errorCode: 3303 errorMessage: tpl temp preload failed: " + str7);
                                                    return;
                                                }
                                                return;
                                            }
                                            C8672v.m24876b("RewardMVVideoAdapter", "template download fail but hit ignoreCheckRule");
                                        }
                                    };
                                    cVar.mo61322a(l, i, m, f, str, requestIdNotice, q, str2, cMPTEntryUrl, o, campaignEx, c, b, str3, p, r17, false);
                                }
                            });
                        }
                    }
                }
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0071  */
            /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo61295a(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r20, java.lang.String r21) {
                /*
                    r16 = this;
                    r6 = r16
                    r3 = r20
                    com.mbridge.msdk.reward.adapter.d r0 = com.mbridge.msdk.reward.adapter.C9154d.this
                    r1 = 0
                    r0.f22400e = r1
                    if (r3 == 0) goto L_0x005f
                    int r0 = r20.size()
                    if (r0 <= 0) goto L_0x005f
                    java.lang.Object r0 = r3.get(r1)     // Catch:{ Exception -> 0x005f }
                    r7 = r0
                    com.mbridge.msdk.foundation.entity.CampaignEx r7 = (com.mbridge.msdk.foundation.entity.CampaignEx) r7     // Catch:{ Exception -> 0x005f }
                    com.mbridge.msdk.reward.adapter.d r0 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x005f }
                    android.content.Context r8 = r0.f22405j     // Catch:{ Exception -> 0x005f }
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005f }
                    r0.<init>()     // Catch:{ Exception -> 0x005f }
                    java.lang.String r1 = "resource download failed: "
                    r0.append(r1)     // Catch:{ Exception -> 0x005f }
                    r4 = r21
                    r0.append(r4)     // Catch:{ Exception -> 0x0061 }
                    java.lang.String r1 = " is tpl: "
                    r0.append(r1)     // Catch:{ Exception -> 0x0061 }
                    boolean r1 = r0     // Catch:{ Exception -> 0x0061 }
                    r0.append(r1)     // Catch:{ Exception -> 0x0061 }
                    java.lang.String r9 = r0.toString()     // Catch:{ Exception -> 0x0061 }
                    com.mbridge.msdk.reward.adapter.d r0 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x0061 }
                    java.lang.String r10 = r0.f22406k     // Catch:{ Exception -> 0x0061 }
                    com.mbridge.msdk.reward.adapter.d r0 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x0061 }
                    boolean r11 = r0.f22419x     // Catch:{ Exception -> 0x0061 }
                    com.mbridge.msdk.foundation.entity.CampaignEx r0 = r6     // Catch:{ Exception -> 0x0061 }
                    java.lang.String r13 = r0.getRequestIdNotice()     // Catch:{ Exception -> 0x0061 }
                    long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0061 }
                    com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9154d.this     // Catch:{ Exception -> 0x0061 }
                    long r14 = r2.f22392K     // Catch:{ Exception -> 0x0061 }
                    long r14 = r0 - r14
                    r12 = r19
                    com.mbridge.msdk.reward.p343b.C9176a.m26122a(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0061 }
                    goto L_0x0061
                L_0x005f:
                    r4 = r21
                L_0x0061:
                    com.mbridge.msdk.reward.adapter.d r0 = com.mbridge.msdk.reward.adapter.C9154d.this
                    com.mbridge.msdk.reward.adapter.b r0 = r0.f22414s
                    if (r0 == 0) goto L_0x008a
                    com.mbridge.msdk.reward.adapter.d r0 = com.mbridge.msdk.reward.adapter.C9154d.this
                    android.os.Handler r0 = r0.f22391J
                    if (r0 == 0) goto L_0x008a
                    com.mbridge.msdk.reward.adapter.d r0 = com.mbridge.msdk.reward.adapter.C9154d.this
                    android.os.Handler r7 = r0.f22391J
                    com.mbridge.msdk.reward.adapter.d$3$3 r8 = new com.mbridge.msdk.reward.adapter.d$3$3
                    r0 = r8
                    r1 = r16
                    r2 = r18
                    r3 = r20
                    r4 = r21
                    r5 = r19
                    r0.<init>(r2, r3, r4, r5)
                    r7.post(r8)
                L_0x008a:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.C9154d.C91573.mo61295a(java.lang.String, java.lang.String, java.lang.String, java.util.concurrent.CopyOnWriteArrayList, java.lang.String):void");
            }
        }, new C9133c.C9147i() {
            /* renamed from: a */
            public final void mo61300a(String str, String str2, String str3, String str4) {
            }

            /* renamed from: a */
            public final void mo61301a(String str, final String str2, final String str3, String str4, final String str5) {
                if (z || C9154d.this.f22414s == null || C9154d.this.f22391J == null) {
                    if (nscpt == 1) {
                        if (campaignEx2.getRsIgnoreCheckRule() != null && campaignEx2.getRsIgnoreCheckRule().size() > 0) {
                            if (campaignEx2.getRsIgnoreCheckRule().contains(3)) {
                                C8672v.m24876b("RewardMVVideoAdapter", "tpl download fail but hit ignoreCheckRule");
                                return;
                            } else if (campaignEx2.getCMPTEntryUrl().equals(campaignEx2.getendcard_url()) && campaignEx2.getRsIgnoreCheckRule().contains(2)) {
                                C8672v.m24876b("RewardMVVideoAdapter", "endcard download fail but hit ignoreCheckRule at 3203");
                                return;
                            }
                        }
                        if (C9154d.this.f22414s != null && C9154d.this.f22391J != null) {
                            C9154d.this.f22391J.post(new Runnable() {
                                public final void run() {
                                    C9154d.m26036a(C9154d.this, str2, C9154d.this.f22394M, C9154d.this.f22419x);
                                    if (C9154d.this.f22391J != null) {
                                        C9154d.this.f22391J.removeMessages(5);
                                    }
                                    if (!C9154d.this.f22404i && C9154d.this.f22414s != null) {
                                        C9154d.this.f22404i = true;
                                        if (C9154d.this.f22394M != null && C9154d.this.f22394M.size() > 0) {
                                            C9176a.m26121a((CampaignEx) C9154d.this.f22394M.get(0), C9154d.this.f22405j, "tpl temp resource download failed", C9154d.this.f22406k, C9154d.this.f22419x, str3, campaignEx2.getRequestIdNotice());
                                        }
                                        C9154d.this.f22414s.mo37117a("errorCode: 3203 errorMessage: tpl temp resource download failed");
                                    }
                                }
                            });
                        }
                    }
                } else if (campaignEx2.getRsIgnoreCheckRule() == null || campaignEx2.getRsIgnoreCheckRule().size() <= 0 || !campaignEx2.getRsIgnoreCheckRule().contains(1)) {
                    C9154d.this.f22391J.post(new Runnable() {
                        public final void run() {
                            C9154d.m26036a(C9154d.this, str2, C9154d.this.f22394M, C9154d.this.f22419x);
                            if (C9154d.this.f22391J != null) {
                                C9154d.this.f22391J.removeMessages(5);
                            }
                            if (!C9154d.this.f22404i && C9154d.this.f22414s != null) {
                                C9154d.this.f22404i = true;
                                if (C9154d.this.f22394M != null && C9154d.this.f22394M.size() > 0) {
                                    Context h = C9154d.this.f22405j;
                                    C9176a.m26121a((CampaignEx) C9154d.this.f22394M.get(0), h, "" + str5, C9154d.this.f22406k, C9154d.this.f22419x, str3, campaignEx2.getRequestIdNotice());
                                }
                                C9154d.this.f22414s.mo37117a("errorCode: 3202 errorMessage: temp resource download failed");
                            }
                        }
                    });
                } else {
                    C8672v.m24876b("RewardMVVideoAdapter", "template download fail but hit ignoreCheckRule");
                }
            }
        });
        if (z) {
            C9133c.C9153m.f22381a.mo61319a(dVar2.f22405j, campaignEx2, dVar2.f22407l, dVar2.f22406k, campaignEx2.getRequestId(), new C9133c.C9147i() {
                /* renamed from: a */
                public final void mo61300a(final String str, final String str2, final String str3, String str4) {
                    try {
                        CampaignEx campaignEx = campaignEx2;
                        Context h = C9154d.this.f22405j;
                        C9176a.m26122a(campaignEx, h, "resource download success is tpl :" + z, C9154d.this.f22406k, C9154d.this.f22419x, str3, campaignEx2.getRequestIdNotice(), System.currentTimeMillis() - C9154d.this.f22392K);
                    } catch (Exception unused) {
                    }
                    C9154d.this.f22401f = true;
                    if (C9154d.this.f22400e && !C9154d.this.f22402g && C9154d.this.f22391J != null) {
                        synchronized (C9154d.this.f22398c) {
                            if (!C9154d.this.f22402g) {
                                C9154d.this.f22402g = true;
                                C9154d.this.f22391J.post(new Runnable() {
                                    public final void run() {
                                        C9133c a = C9133c.C9153m.f22381a;
                                        boolean l = C9154d.this.f22386E;
                                        Handler i = C9154d.this.f22391J;
                                        boolean m = C9154d.this.f22418w;
                                        boolean f = C9154d.this.f22419x;
                                        String str = str3;
                                        String requestIdNotice = campaignEx2.getRequestIdNotice();
                                        String str2 = str;
                                        String str3 = str2;
                                        String cMPTEntryUrl = campaignEx2.getCMPTEntryUrl();
                                        int o = C9154d.this.f22417v;
                                        CampaignEx campaignEx = campaignEx2;
                                        CopyOnWriteArrayList c = C9154d.this.f22385D;
                                        String b = C9652g.m27539a().mo63670b(campaignEx2.getCMPTEntryUrl());
                                        String str4 = str2;
                                        C9133c cVar = a;
                                        C9640c p = C9154d.this.f22415t;
                                        C91681 r17 = r1;
                                        C91681 r1 = new C9133c.C9148j() {
                                            /* renamed from: a */
                                            public final void mo61297a(String str, String str2, String str3, String str4, String str5, C9625a.C9626a aVar) {
                                                try {
                                                    CampaignEx campaignEx = campaignEx2;
                                                    Context h = C9154d.this.f22405j;
                                                    C9176a.m26122a(campaignEx, h, "preload template success is tpl :" + z, C9154d.this.f22406k, C9154d.this.f22419x, str3, campaignEx2.getRequestIdNotice(), System.currentTimeMillis() - C9154d.this.f22392K);
                                                } catch (Exception unused) {
                                                }
                                                if (C9154d.this.mo61344a((List<CampaignEx>) C9154d.this.f22385D, z, nscpt)) {
                                                    C9154d.m26035a(C9154d.this, C9154d.this.f22406k, C9154d.this.f22394M, C9154d.this.f22395N, C9154d.this.f22419x);
                                                    if (C9154d.this.f22391J != null) {
                                                        C9154d.this.f22391J.removeMessages(5);
                                                    }
                                                    if (C9154d.this.f22414s != null && !C9154d.this.f22403h) {
                                                        C9154d.this.f22403h = true;
                                                        if (!TextUtils.isEmpty(C9154d.this.f22406k)) {
                                                            C9176a.m26120a(C9154d.this.f22405j, C9154d.this.f22385D, C9154d.this.f22406k, System.currentTimeMillis() - C9154d.this.f22392K);
                                                        }
                                                        C9154d.this.f22414s.mo37116a();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                C9154d.m26036a(C9154d.this, str3, C9154d.this.f22394M, C9154d.this.f22419x);
                                                if (C9154d.this.f22391J != null) {
                                                    C9154d.this.f22391J.removeMessages(5);
                                                }
                                                if (C9154d.this.f22414s != null && !C9154d.this.f22404i) {
                                                    C9154d.this.f22404i = true;
                                                    if (C9154d.this.f22394M != null && C9154d.this.f22394M.size() > 0) {
                                                        C9176a.m26121a((CampaignEx) C9154d.this.f22394M.get(0), C9154d.this.f22405j, "tpl temp preload success but isReady false", C9154d.this.f22406k, C9154d.this.f22419x, str4, campaignEx2.getRequestIdNotice());
                                                    }
                                                    C9154d.this.f22414s.mo37117a("errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                                                }
                                            }

                                            /* renamed from: a */
                                            public final void mo61298a(String str, String str2, String str3, String str4, String str5, C9625a.C9626a aVar, String str6) {
                                                String str7 = str6;
                                                C9154d.m26036a(C9154d.this, str3, C9154d.this.f22394M, C9154d.this.f22419x);
                                                try {
                                                    CampaignEx campaignEx = campaignEx2;
                                                    Context h = C9154d.this.f22405j;
                                                    C9176a.m26122a(campaignEx, h, "preload template failed is tpl :" + z + " " + str7, C9154d.this.f22406k, C9154d.this.f22419x, str3, campaignEx2.getRequestIdNotice(), System.currentTimeMillis() - C9154d.this.f22392K);
                                                } catch (Exception unused) {
                                                }
                                                if (C9154d.this.f22391J != null) {
                                                    C9154d.this.f22391J.removeMessages(5);
                                                }
                                                if (C9154d.this.f22414s != null && !C9154d.this.f22404i) {
                                                    C9154d.this.f22404i = true;
                                                    if (C9154d.this.f22394M != null && C9154d.this.f22394M.size() > 0) {
                                                        Context h2 = C9154d.this.f22405j;
                                                        C9176a.m26121a((CampaignEx) C9154d.this.f22394M.get(0), h2, "tpl temp preload failed: " + str7, C9154d.this.f22406k, C9154d.this.f22419x, str4, campaignEx2.getRequestIdNotice());
                                                    }
                                                    C9132b a = C9154d.this.f22414s;
                                                    a.mo37117a("errorCode: 3303 errorMessage: tpl temp preload failed: " + str7);
                                                }
                                            }
                                        };
                                        cVar.mo61322a(l, i, m, f, str, requestIdNotice, str2, str3, cMPTEntryUrl, o, campaignEx, c, b, str4, p, r17, false);
                                    }
                                });
                            }
                        }
                    }
                }

                /* renamed from: a */
                public final void mo61301a(String str, String str2, String str3, String str4, String str5) {
                    String str6 = str5;
                    if (C9154d.this.f22394M.get(0) != null && C9154d.this.f22394M.size() > 0) {
                        try {
                            Context h = C9154d.this.f22405j;
                            C9176a.m26122a((CampaignEx) C9154d.this.f22394M.get(0), h, "resource download failed: " + str6 + " is tpl: " + z, C9154d.this.f22406k, C9154d.this.f22419x, str3, ((CampaignEx) C9154d.this.f22394M.get(0)).getRequestIdNotice(), System.currentTimeMillis() - C9154d.this.f22392K);
                        } catch (Exception unused) {
                        }
                    }
                    if (campaignEx2.getRsIgnoreCheckRule() != null && campaignEx2.getRsIgnoreCheckRule().size() > 0) {
                        if (campaignEx2.getRsIgnoreCheckRule().contains(3)) {
                            C8672v.m24876b("RewardMVVideoAdapter", "tpl download fail but hit ignoreCheckRule");
                            return;
                        } else if (campaignEx2.getCMPTEntryUrl().equals(campaignEx2.getendcard_url()) && campaignEx2.getRsIgnoreCheckRule().contains(2)) {
                            C8672v.m24876b("RewardMVVideoAdapter", "endcard download fail but hit ignoreCheckRule at 3203");
                            return;
                        }
                    }
                    C9154d.this.f22401f = false;
                    C9154d dVar = C9154d.this;
                    C9154d.m26036a(dVar, str2, dVar.f22394M, C9154d.this.f22419x);
                    if (C9154d.this.f22391J != null) {
                        C9154d.this.f22391J.removeMessages(5);
                    }
                    if (C9154d.this.f22414s != null && !C9154d.this.f22404i) {
                        C9154d.this.f22404i = true;
                        if (C9154d.this.f22394M != null && C9154d.this.f22394M.size() > 0) {
                            Context h2 = C9154d.this.f22405j;
                            C9176a.m26121a((CampaignEx) C9154d.this.f22394M.get(0), h2, "" + str6, C9154d.this.f22406k, C9154d.this.f22419x, str3, campaignEx2.getRequestIdNotice());
                        }
                        C9154d.this.f22414s.mo37117a("errorCode: 3203 errorMessage: tpl temp resource download failed");
                    }
                }
            });
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m26037a(C9154d dVar, List list) {
        if (dVar.f22405j != null && list != null && list.size() != 0) {
            C8417j a = C8417j.m23986a((C8412f) C8414g.m23969a(dVar.f22405j));
            for (int i = 0; i < list.size(); i++) {
                CampaignEx campaignEx = (CampaignEx) list.get(i);
                if (!(campaignEx == null || a == null || a.mo57029a(campaignEx.getId()))) {
                    C8461f fVar = new C8461f();
                    fVar.mo57724a(campaignEx.getId());
                    fVar.mo57722a(campaignEx.getFca());
                    fVar.mo57726b(campaignEx.getFcb());
                    fVar.mo57730d(0);
                    fVar.mo57728c(0);
                    fVar.mo57723a(System.currentTimeMillis());
                    a.mo57028a(fVar);
                }
            }
        }
    }
}
