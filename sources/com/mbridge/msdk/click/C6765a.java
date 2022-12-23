package com.mbridge.msdk.click;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.CommonJumpLoader;
import com.mbridge.msdk.click.p217a.C6772a;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.C8459d;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p298db.C8414g;
import com.mbridge.msdk.foundation.same.report.C8574b;
import com.mbridge.msdk.foundation.same.report.C8582d;
import com.mbridge.msdk.foundation.same.report.C8598e;
import com.mbridge.msdk.foundation.tools.C8616ad;
import com.mbridge.msdk.foundation.tools.C8660r;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8675y;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.LoadingActivity;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.p078c.C2440a;
import com.mbridge.msdk.p078c.C2445b;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.mbridge.msdk.click.a */
/* compiled from: CommonClickControl */
public final class C6765a {

    /* renamed from: a */
    public static boolean f17824a = false;

    /* renamed from: b */
    public static Map<String, Long> f17825b = new HashMap();

    /* renamed from: c */
    public static Set<String> f17826c = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f17827d;

    /* renamed from: e */
    private long f17828e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C8414g f17829f = null;

    /* renamed from: g */
    private Context f17830g = null;

    /* renamed from: h */
    private CommonJumpLoader f17831h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public NativeListener.NativeTrackingListener f17832i = null;

    /* renamed from: j */
    private C8582d f17833j;

    /* renamed from: k */
    private C2440a f17834k;

    /* renamed from: l */
    private boolean f17835l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f17836m = false;

    /* renamed from: n */
    private boolean f17837n = true;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f17838o;

    public C6765a(Context context, String str) {
        C2440a b = C2445b.m6020a().mo16286b(str);
        this.f17834k = b;
        if (b == null) {
            this.f17834k = C2445b.m6020a().mo16285b();
        }
        this.f17835l = this.f17834k.mo16159N();
        Context applicationContext = context.getApplicationContext();
        this.f17830g = applicationContext;
        this.f17827d = str;
        if (this.f17829f == null) {
            this.f17829f = C8414g.m23969a(applicationContext);
        }
        this.f17833j = new C8582d(this.f17830g);
    }

    /* renamed from: a */
    public final void mo37045a(String str) {
        this.f17827d = str;
    }

    /* renamed from: a */
    public final void mo37044a(NativeListener.NativeTrackingListener nativeTrackingListener) {
        this.f17832i = nativeTrackingListener;
    }

    /* renamed from: a */
    public final void mo37046a(boolean z) {
        this.f17837n = z;
    }

    /* renamed from: a */
    public final void mo37040a() {
        try {
            this.f17832i = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo37042a(CampaignEx campaignEx, NativeListener.NativeAdListener nativeAdListener) {
        if (!(nativeAdListener == null || campaignEx == null)) {
            nativeAdListener.onAdClick(campaignEx);
        }
        mo37041a(campaignEx);
    }

    /* renamed from: b */
    private boolean m20575b(CampaignEx campaignEx) {
        Long l;
        if (campaignEx == null) {
            return true;
        }
        try {
            if (2 != campaignEx.getLinkType() && 3 != campaignEx.getLinkType()) {
                return true;
            }
            String id = campaignEx.getId();
            if (f17825b == null) {
                return true;
            }
            if (f17825b.containsKey(id) && (l = f17825b.get(id)) != null) {
                if (l.longValue() > System.currentTimeMillis() || f17826c.contains(campaignEx.getId())) {
                    return false;
                }
            }
            f17825b.put(campaignEx.getId(), Long.valueOf(System.currentTimeMillis() + ((long) (campaignEx.getClickTimeOutInterval() * 1000))));
            return true;
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return true;
            }
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: a */
    private void m20567a(CampaignEx campaignEx, String str) {
        if (!TextUtils.isEmpty(str)) {
            m20558a(this.f17830g, campaignEx, this.f17827d, str, true, false, C6772a.f17858i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x011a A[Catch:{ all -> 0x020d }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0187 A[Catch:{ all -> 0x020d }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo37041a(com.mbridge.msdk.foundation.entity.CampaignEx r12) {
        /*
            r11 = this;
            boolean r0 = r11.m20575b((com.mbridge.msdk.foundation.entity.CampaignEx) r12)     // Catch:{ all -> 0x020d }
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.String r0 = r12.getNoticeUrl()     // Catch:{ all -> 0x020d }
            com.mbridge.msdk.foundation.db.g r1 = r11.f17829f     // Catch:{ all -> 0x020d }
            com.mbridge.msdk.foundation.db.c r1 = com.mbridge.msdk.foundation.p298db.C8408c.m23915a(r1)     // Catch:{ all -> 0x020d }
            r1.mo56974a()     // Catch:{ all -> 0x020d }
            java.lang.String r2 = r12.getId()     // Catch:{ all -> 0x020d }
            java.lang.String r3 = r11.f17827d     // Catch:{ all -> 0x020d }
            com.mbridge.msdk.click.CommonJumpLoader$JumpLoaderResult r2 = r1.mo56976b(r2, r3)     // Catch:{ all -> 0x020d }
            if (r2 == 0) goto L_0x0032
            java.lang.String r3 = r2.getNoticeurl()     // Catch:{ all -> 0x020d }
            if (r3 == 0) goto L_0x002a
            r3 = 0
            r2.setNoticeurl(r3)     // Catch:{ all -> 0x020d }
        L_0x002a:
            r12.setJumpResult(r2)     // Catch:{ all -> 0x020d }
            java.lang.String r3 = r11.f17827d     // Catch:{ all -> 0x020d }
            r1.mo56973a((com.mbridge.msdk.foundation.entity.CampaignEx) r12, (java.lang.String) r3)     // Catch:{ all -> 0x020d }
        L_0x0032:
            boolean r1 = com.mbridge.msdk.foundation.tools.C8677z.m24919a((com.mbridge.msdk.foundation.entity.CampaignEx) r12)     // Catch:{ all -> 0x020d }
            if (r1 == 0) goto L_0x0092
            com.mbridge.msdk.foundation.tools.n r1 = com.mbridge.msdk.foundation.tools.C8649n.m24782a()     // Catch:{ all -> 0x020d }
            r1.mo58145a((com.mbridge.msdk.foundation.entity.CampaignEx) r12)     // Catch:{ all -> 0x020d }
            android.content.Context r1 = r11.f17830g     // Catch:{ all -> 0x020d }
            java.lang.String r3 = r12.getDeepLinkURL()     // Catch:{ all -> 0x020d }
            boolean r1 = com.mbridge.msdk.click.C6779b.m20649d(r1, r3)     // Catch:{ all -> 0x020d }
            if (r1 == 0) goto L_0x007a
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r1 = r11.f17832i     // Catch:{ all -> 0x020d }
            if (r1 == 0) goto L_0x0058
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r1 = r11.f17832i     // Catch:{ all -> 0x020d }
            java.lang.String r2 = r12.getClickURL()     // Catch:{ all -> 0x020d }
            r1.onStartRedirection(r12, r2)     // Catch:{ all -> 0x020d }
        L_0x0058:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x020d }
            r1.<init>()     // Catch:{ all -> 0x020d }
            r1.append(r0)     // Catch:{ all -> 0x020d }
            java.lang.String r0 = "&opdptype=1"
            r1.append(r0)     // Catch:{ all -> 0x020d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x020d }
            r11.m20567a((com.mbridge.msdk.foundation.entity.CampaignEx) r12, (java.lang.String) r0)     // Catch:{ all -> 0x020d }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f17832i     // Catch:{ all -> 0x020d }
            if (r0 == 0) goto L_0x0079
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f17832i     // Catch:{ all -> 0x020d }
            java.lang.String r1 = r12.getClickURL()     // Catch:{ all -> 0x020d }
            r0.onFinishRedirection(r12, r1)     // Catch:{ all -> 0x020d }
        L_0x0079:
            return
        L_0x007a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x020d }
            r1.<init>()     // Catch:{ all -> 0x020d }
            r1.append(r0)     // Catch:{ all -> 0x020d }
            java.lang.String r0 = "&opdptype=0"
            r1.append(r0)     // Catch:{ all -> 0x020d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x020d }
            com.mbridge.msdk.foundation.tools.n r1 = com.mbridge.msdk.foundation.tools.C8649n.m24782a()     // Catch:{ all -> 0x020d }
            r1.mo58147b((com.mbridge.msdk.foundation.entity.CampaignEx) r12)     // Catch:{ all -> 0x020d }
        L_0x0092:
            int r1 = r12.getLinkType()     // Catch:{ all -> 0x020d }
            r3 = 12
            if (r1 != r3) goto L_0x00bd
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r1 = r11.f17832i     // Catch:{ all -> 0x020d }
            if (r1 == 0) goto L_0x00a7
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r1 = r11.f17832i     // Catch:{ all -> 0x020d }
            java.lang.String r2 = r12.getClickURL()     // Catch:{ all -> 0x020d }
            r1.onStartRedirection(r12, r2)     // Catch:{ all -> 0x020d }
        L_0x00a7:
            r11.m20567a((com.mbridge.msdk.foundation.entity.CampaignEx) r12, (java.lang.String) r0)     // Catch:{ all -> 0x020d }
            android.content.Context r0 = r11.f17830g     // Catch:{ all -> 0x020d }
            r11.m20556a((android.content.Context) r0, (com.mbridge.msdk.foundation.entity.CampaignEx) r12)     // Catch:{ all -> 0x020d }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f17832i     // Catch:{ all -> 0x020d }
            if (r0 == 0) goto L_0x00bc
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f17832i     // Catch:{ all -> 0x020d }
            java.lang.String r1 = r12.getClickURL()     // Catch:{ all -> 0x020d }
            r0.onFinishRedirection(r12, r1)     // Catch:{ all -> 0x020d }
        L_0x00bc:
            return
        L_0x00bd:
            r11.m20567a((com.mbridge.msdk.foundation.entity.CampaignEx) r12, (java.lang.String) r0)     // Catch:{ all -> 0x020d }
            boolean r0 = r12.getUserActivation()     // Catch:{ all -> 0x020d }
            r1 = 1
            if (r0 != 0) goto L_0x00ff
            android.content.Context r0 = r11.f17830g     // Catch:{ all -> 0x020d }
            java.lang.String r3 = r12.getPackageName()     // Catch:{ all -> 0x020d }
            boolean r0 = com.mbridge.msdk.click.C6779b.m20648c(r0, r3)     // Catch:{ all -> 0x020d }
            if (r0 == 0) goto L_0x00ff
            android.content.Context r0 = r11.f17830g     // Catch:{ all -> 0x020d }
            java.lang.String r2 = r12.getPackageName()     // Catch:{ all -> 0x020d }
            com.mbridge.msdk.click.C6779b.m20650e(r0, r2)     // Catch:{ all -> 0x020d }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f17832i     // Catch:{ all -> 0x020d }
            if (r0 == 0) goto L_0x00e9
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f17832i     // Catch:{ all -> 0x020d }
            java.lang.String r2 = r12.getClickURL()     // Catch:{ all -> 0x020d }
            r0.onStartRedirection(r12, r2)     // Catch:{ all -> 0x020d }
        L_0x00e9:
            r11.m20568a((com.mbridge.msdk.foundation.entity.CampaignEx) r12, (boolean) r1)     // Catch:{ all -> 0x020d }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f17832i     // Catch:{ all -> 0x020d }
            if (r0 == 0) goto L_0x00fe
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f17832i     // Catch:{ all -> 0x020d }
            java.lang.String r1 = r12.getClickURL()     // Catch:{ all -> 0x020d }
            r0.onFinishRedirection(r12, r1)     // Catch:{ all -> 0x020d }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r12 = r11.f17832i     // Catch:{ all -> 0x020d }
            com.mbridge.msdk.foundation.tools.C8675y.m24896a((com.mbridge.msdk.out.NativeListener.NativeTrackingListener) r12)     // Catch:{ all -> 0x020d }
        L_0x00fe:
            return
        L_0x00ff:
            int r0 = r12.getLinkType()     // Catch:{ all -> 0x020d }
            int r3 = r11.m20573b()     // Catch:{ all -> 0x020d }
            r4 = 4
            r5 = 9
            r6 = 8
            r7 = 0
            if (r0 == r6) goto L_0x0116
            if (r0 == r5) goto L_0x0116
            if (r0 != r4) goto L_0x0114
            goto L_0x0116
        L_0x0114:
            r8 = r7
            goto L_0x0117
        L_0x0116:
            r8 = r1
        L_0x0117:
            r9 = 2
            if (r8 == 0) goto L_0x0187
            java.lang.String r8 = r12.getClickURL()     // Catch:{ all -> 0x020d }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r10 = r11.f17832i     // Catch:{ all -> 0x020d }
            if (r10 == 0) goto L_0x0127
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r10 = r11.f17832i     // Catch:{ all -> 0x020d }
            r10.onStartRedirection(r12, r8)     // Catch:{ all -> 0x020d }
        L_0x0127:
            boolean r10 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x020d }
            if (r10 == 0) goto L_0x013a
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f17832i     // Catch:{ all -> 0x020d }
            if (r0 == 0) goto L_0x0136
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f17832i     // Catch:{ all -> 0x020d }
            r0.onRedirectionFailed(r12, r8)     // Catch:{ all -> 0x020d }
        L_0x0136:
            r11.m20561a((com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r2, (com.mbridge.msdk.foundation.entity.CampaignEx) r12, (boolean) r1)     // Catch:{ all -> 0x020d }
            return
        L_0x013a:
            if (r0 != r6) goto L_0x0150
            android.content.Context r0 = r11.f17830g     // Catch:{ all -> 0x020d }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r1 = r11.f17832i     // Catch:{ all -> 0x020d }
            com.mbridge.msdk.foundation.tools.C8675y.m24894a(r0, r8, r12, r1)     // Catch:{ all -> 0x020d }
            r11.m20561a((com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r2, (com.mbridge.msdk.foundation.entity.CampaignEx) r12, (boolean) r7)     // Catch:{ all -> 0x020d }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f17832i     // Catch:{ all -> 0x020d }
            if (r0 == 0) goto L_0x014f
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f17832i     // Catch:{ all -> 0x020d }
            r0.onFinishRedirection(r12, r8)     // Catch:{ all -> 0x020d }
        L_0x014f:
            return
        L_0x0150:
            if (r0 != r5) goto L_0x0166
            android.content.Context r0 = r11.f17830g     // Catch:{ all -> 0x020d }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r1 = r11.f17832i     // Catch:{ all -> 0x020d }
            com.mbridge.msdk.foundation.tools.C8675y.m24897b(r0, r8, r1)     // Catch:{ all -> 0x020d }
            r11.m20561a((com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r2, (com.mbridge.msdk.foundation.entity.CampaignEx) r12, (boolean) r7)     // Catch:{ all -> 0x020d }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f17832i     // Catch:{ all -> 0x020d }
            if (r0 == 0) goto L_0x0165
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f17832i     // Catch:{ all -> 0x020d }
            r0.onFinishRedirection(r12, r8)     // Catch:{ all -> 0x020d }
        L_0x0165:
            return
        L_0x0166:
            if (r0 != r4) goto L_0x0179
            if (r3 != r9) goto L_0x0172
            android.content.Context r0 = r11.f17830g     // Catch:{ all -> 0x020d }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r1 = r11.f17832i     // Catch:{ all -> 0x020d }
            com.mbridge.msdk.foundation.tools.C8675y.m24894a(r0, r8, r12, r1)     // Catch:{ all -> 0x020d }
            goto L_0x0179
        L_0x0172:
            android.content.Context r0 = r11.f17830g     // Catch:{ all -> 0x020d }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r1 = r11.f17832i     // Catch:{ all -> 0x020d }
            com.mbridge.msdk.foundation.tools.C8675y.m24897b(r0, r8, r1)     // Catch:{ all -> 0x020d }
        L_0x0179:
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f17832i     // Catch:{ all -> 0x020d }
            if (r0 == 0) goto L_0x0182
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f17832i     // Catch:{ all -> 0x020d }
            r0.onFinishRedirection(r12, r8)     // Catch:{ all -> 0x020d }
        L_0x0182:
            r11.m20561a((com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r2, (com.mbridge.msdk.foundation.entity.CampaignEx) r12, (boolean) r7)     // Catch:{ all -> 0x020d }
            goto L_0x0217
        L_0x0187:
            if (r0 != r9) goto L_0x01db
            java.lang.String r0 = r12.getClickURL()     // Catch:{ all -> 0x020d }
            java.lang.String r1 = "market://"
            boolean r0 = r0.startsWith(r1)     // Catch:{ all -> 0x020d }
            if (r0 != 0) goto L_0x01a6
            java.lang.String r0 = r12.getClickURL()     // Catch:{ all -> 0x020d }
            java.lang.String r1 = "https://play.google.com/"
            boolean r0 = r0.startsWith(r1)     // Catch:{ all -> 0x020d }
            if (r0 == 0) goto L_0x01a2
            goto L_0x01a6
        L_0x01a2:
            r11.m20568a((com.mbridge.msdk.foundation.entity.CampaignEx) r12, (boolean) r7)     // Catch:{ all -> 0x020d }
            goto L_0x0217
        L_0x01a6:
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f17832i     // Catch:{ all -> 0x020d }
            if (r0 == 0) goto L_0x01b3
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f17832i     // Catch:{ all -> 0x020d }
            java.lang.String r1 = r12.getClickURL()     // Catch:{ all -> 0x020d }
            r0.onStartRedirection(r12, r1)     // Catch:{ all -> 0x020d }
        L_0x01b3:
            android.content.Context r0 = r11.f17830g     // Catch:{ all -> 0x020d }
            java.lang.String r1 = r12.getClickURL()     // Catch:{ all -> 0x020d }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r4 = r11.f17832i     // Catch:{ all -> 0x020d }
            boolean r0 = com.mbridge.msdk.foundation.tools.C8675y.C8676a.m24899a(r0, r1, r4)     // Catch:{ all -> 0x020d }
            if (r0 != 0) goto L_0x01ca
            java.lang.String r0 = r12.getClickURL()     // Catch:{ all -> 0x020d }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r1 = r11.f17832i     // Catch:{ all -> 0x020d }
            r11.m20555a((int) r3, (java.lang.String) r0, (com.mbridge.msdk.foundation.entity.CampaignEx) r12, (com.mbridge.msdk.out.NativeListener.NativeTrackingListener) r1)     // Catch:{ all -> 0x020d }
        L_0x01ca:
            r11.m20561a((com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r2, (com.mbridge.msdk.foundation.entity.CampaignEx) r12, (boolean) r7)     // Catch:{ all -> 0x020d }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f17832i     // Catch:{ all -> 0x020d }
            if (r0 == 0) goto L_0x01da
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r11.f17832i     // Catch:{ all -> 0x020d }
            java.lang.String r1 = r12.getClickURL()     // Catch:{ all -> 0x020d }
            r0.onFinishRedirection(r12, r1)     // Catch:{ all -> 0x020d }
        L_0x01da:
            return
        L_0x01db:
            r3 = 3
            if (r0 != r3) goto L_0x01e2
            r11.m20568a((com.mbridge.msdk.foundation.entity.CampaignEx) r12, (boolean) r7)     // Catch:{ all -> 0x020d }
            goto L_0x0217
        L_0x01e2:
            java.lang.String r0 = r12.getClickURL()     // Catch:{ all -> 0x020d }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x020d }
            if (r3 == 0) goto L_0x01f9
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r3 = r11.f17832i     // Catch:{ all -> 0x020d }
            if (r3 == 0) goto L_0x01f5
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r3 = r11.f17832i     // Catch:{ all -> 0x020d }
            r3.onRedirectionFailed(r12, r0)     // Catch:{ all -> 0x020d }
        L_0x01f5:
            r11.m20561a((com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r2, (com.mbridge.msdk.foundation.entity.CampaignEx) r12, (boolean) r1)     // Catch:{ all -> 0x020d }
            return
        L_0x01f9:
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r3 = r11.f17832i     // Catch:{ all -> 0x020d }
            if (r3 == 0) goto L_0x0202
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r3 = r11.f17832i     // Catch:{ all -> 0x020d }
            r3.onFinishRedirection(r12, r0)     // Catch:{ all -> 0x020d }
        L_0x0202:
            android.content.Context r3 = r11.f17830g     // Catch:{ all -> 0x020d }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r4 = r11.f17832i     // Catch:{ all -> 0x020d }
            com.mbridge.msdk.foundation.tools.C8675y.m24897b(r3, r0, r4)     // Catch:{ all -> 0x020d }
            r11.m20561a((com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r2, (com.mbridge.msdk.foundation.entity.CampaignEx) r12, (boolean) r1)     // Catch:{ all -> 0x020d }
            goto L_0x0217
        L_0x020d:
            r12 = move-exception
            java.lang.String r0 = r12.getMessage()
            java.lang.String r1 = "MBridge SDK M"
            com.mbridge.msdk.foundation.tools.C8672v.m24875a(r1, r0, r12)
        L_0x0217:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.C6765a.mo37041a(com.mbridge.msdk.foundation.entity.CampaignEx):void");
    }

    /* renamed from: a */
    private void m20556a(Context context, CampaignEx campaignEx) {
        if (context == null) {
            C8598e.m24666a(C8388a.m23845e().mo56913g(), campaignEx, 2, "context is null", this.f17827d);
            return;
        }
        boolean z = C8660r.m24803a() == 1;
        boolean z2 = C8660r.m24813c(context) == 1;
        if (!z || !z2) {
            C8598e.m24666a(context, campaignEx, 2, "integrated:" + z + "-hasWx:" + z2, this.f17827d);
            m20576c(campaignEx);
            return;
        }
        String ghId = campaignEx.getGhId();
        String ghPath = campaignEx.getGhPath();
        String bindId = campaignEx.getBindId();
        String i = C8388a.m23845e().mo56915i();
        if (!TextUtils.isEmpty(ghId)) {
            try {
                if (!TextUtils.isEmpty(i)) {
                    bindId = i;
                }
                Object a = C8660r.m24805a(bindId);
                Class<?> cls = Class.forName("com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Req");
                Object newInstance = cls.newInstance();
                cls.getField("userName").set(newInstance, ghId);
                cls.getField("path").set(newInstance, ghPath);
                cls.getField("miniprogramType").set(newInstance, cls.getField("MINIPTOGRAM_TYPE_RELEASE").get((Object) null));
                Class.forName("com.tencent.mm.opensdk.openapi.IWXAPI").getMethod("sendReq", new Class[]{Class.forName("com.tencent.mm.opensdk.modelbase.BaseReq")}).invoke(a, new Object[]{newInstance});
                C8598e.m24666a(context, campaignEx, 1, "", this.f17827d);
            } catch (Throwable th) {
                C8598e.m24666a(context, campaignEx, 2, th.getMessage(), this.f17827d);
                m20576c(campaignEx);
            }
        } else {
            m20576c(campaignEx);
            C8598e.m24666a(context, campaignEx, 2, "ghid is empty", this.f17827d);
        }
    }

    /* renamed from: c */
    private void m20576c(CampaignEx campaignEx) {
        if (m20573b() == 2) {
            C8675y.m24894a(this.f17830g, campaignEx.getClickURL(), campaignEx, this.f17832i);
        } else {
            C8675y.m24897b(this.f17830g, campaignEx.getClickURL(), this.f17832i);
        }
    }

    /* renamed from: a */
    public static void m20557a(Context context, CampaignEx campaignEx, String str, String str2, boolean z, boolean z2) {
        if (context != null) {
            new CommonJumpLoader(context.getApplicationContext()).mo37015a(str, campaignEx, new C6784d() {
                /* renamed from: a */
                public final void mo37047a(Object obj) {
                }

                /* renamed from: a */
                public final void mo37048a(Object obj, String str) {
                }

                /* renamed from: b */
                public final void mo37049b(Object obj) {
                }
            }, str2, z, z2, C6772a.f17855f);
        }
    }

    /* renamed from: a */
    public static void m20558a(Context context, CampaignEx campaignEx, String str, String str2, boolean z, boolean z2, int i) {
        if (context != null) {
            new CommonJumpLoader(context.getApplicationContext()).mo37015a(str, campaignEx, new C6784d() {
                /* renamed from: a */
                public final void mo37047a(Object obj) {
                }

                /* renamed from: a */
                public final void mo37048a(Object obj, String str) {
                }

                /* renamed from: b */
                public final void mo37049b(Object obj) {
                }
            }, str2, z, z2, i);
        }
    }

    /* renamed from: a */
    public static void m20559a(Context context, CampaignEx campaignEx, String str, String[] strArr, boolean z, boolean z2) {
        if (context != null && campaignEx != null && !TextUtils.isEmpty(str) && strArr != null) {
            CommonJumpLoader commonJumpLoader = new CommonJumpLoader(context.getApplicationContext());
            for (String a : strArr) {
                commonJumpLoader.mo37015a(str, campaignEx, new C6784d() {
                    /* renamed from: a */
                    public final void mo37047a(Object obj) {
                    }

                    /* renamed from: a */
                    public final void mo37048a(Object obj, String str) {
                    }

                    /* renamed from: b */
                    public final void mo37049b(Object obj) {
                    }
                }, a, z, z2, C6772a.f17855f);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e4 A[Catch:{ Exception -> 0x012d }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f9 A[Catch:{ Exception -> 0x012d }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x010c A[Catch:{ Exception -> 0x012d }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m20568a(final com.mbridge.msdk.foundation.entity.CampaignEx r8, final boolean r9) {
        /*
            r7 = this;
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x012d }
            r7.f17828e = r0     // Catch:{ Exception -> 0x012d }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r7.f17832i     // Catch:{ Exception -> 0x012d }
            r1 = 1
            if (r0 == 0) goto L_0x001e
            if (r9 != 0) goto L_0x001e
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r7.f17832i     // Catch:{ Exception -> 0x012d }
            java.lang.String r2 = r8.getClickURL()     // Catch:{ Exception -> 0x012d }
            r0.onStartRedirection(r8, r2)     // Catch:{ Exception -> 0x012d }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r7.f17832i     // Catch:{ Exception -> 0x012d }
            boolean r0 = r0.onInterceptDefaultLoadingDialog()     // Catch:{ Exception -> 0x012d }
            r0 = r0 ^ r1
            goto L_0x001f
        L_0x001e:
            r0 = r1
        L_0x001f:
            r2 = 0
            r7.f17838o = r2     // Catch:{ Exception -> 0x012d }
            com.mbridge.msdk.click.CommonJumpLoader$JumpLoaderResult r3 = r8.getJumpResult()     // Catch:{ Exception -> 0x012d }
            if (r3 == 0) goto L_0x0039
            if (r9 != 0) goto L_0x0033
            com.mbridge.msdk.click.CommonJumpLoader$JumpLoaderResult r3 = r8.getJumpResult()     // Catch:{ Exception -> 0x012d }
            boolean r4 = r7.f17836m     // Catch:{ Exception -> 0x012d }
            r7.m20566a((com.mbridge.msdk.foundation.entity.CampaignEx) r8, (com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r3, (boolean) r1, (boolean) r4)     // Catch:{ Exception -> 0x012d }
        L_0x0033:
            r7.f17838o = r1     // Catch:{ Exception -> 0x012d }
            r7.f17836m = r2     // Catch:{ Exception -> 0x012d }
            r3 = r2
            goto L_0x003a
        L_0x0039:
            r3 = r1
        L_0x003a:
            com.mbridge.msdk.foundation.db.g r4 = r7.f17829f     // Catch:{ Exception -> 0x012d }
            com.mbridge.msdk.foundation.db.c r4 = com.mbridge.msdk.foundation.p298db.C8408c.m23915a(r4)     // Catch:{ Exception -> 0x012d }
            java.lang.String r5 = r8.getId()     // Catch:{ Exception -> 0x012d }
            java.lang.String r6 = r7.f17827d     // Catch:{ Exception -> 0x012d }
            boolean r4 = r4.mo56975a((java.lang.String) r5, (java.lang.String) r6)     // Catch:{ Exception -> 0x012d }
            if (r4 == 0) goto L_0x0052
            com.mbridge.msdk.click.CommonJumpLoader$JumpLoaderResult r4 = r8.getJumpResult()     // Catch:{ Exception -> 0x012d }
            if (r4 != 0) goto L_0x0131
        L_0x0052:
            com.mbridge.msdk.foundation.db.g r4 = r7.f17829f     // Catch:{ Exception -> 0x012d }
            com.mbridge.msdk.foundation.db.c r4 = com.mbridge.msdk.foundation.p298db.C8408c.m23915a(r4)     // Catch:{ Exception -> 0x012d }
            r4.mo56974a()     // Catch:{ Exception -> 0x012d }
            java.lang.String r5 = r8.getId()     // Catch:{ Exception -> 0x012d }
            java.lang.String r6 = r7.f17827d     // Catch:{ Exception -> 0x012d }
            com.mbridge.msdk.click.CommonJumpLoader$JumpLoaderResult r4 = r4.mo56976b(r5, r6)     // Catch:{ Exception -> 0x012d }
            if (r4 == 0) goto L_0x007a
            if (r9 != 0) goto L_0x007a
            r8.setJumpResult(r4)     // Catch:{ Exception -> 0x012d }
            if (r3 == 0) goto L_0x0078
            boolean r5 = r7.f17836m     // Catch:{ Exception -> 0x012d }
            r7.m20566a((com.mbridge.msdk.foundation.entity.CampaignEx) r8, (com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r4, (boolean) r3, (boolean) r5)     // Catch:{ Exception -> 0x012d }
            r7.f17838o = r1     // Catch:{ Exception -> 0x012d }
            r7.f17836m = r2     // Catch:{ Exception -> 0x012d }
            goto L_0x00cf
        L_0x0078:
            r2 = r3
            goto L_0x00cf
        L_0x007a:
            java.lang.String r4 = r8.getClick_mode()     // Catch:{ Exception -> 0x012d }
            java.lang.String r5 = "6"
            boolean r4 = r4.equals(r5)     // Catch:{ Exception -> 0x012d }
            if (r4 == 0) goto L_0x00c9
            java.lang.String r4 = r8.getPackageName()     // Catch:{ Exception -> 0x012d }
            boolean r4 = r4.isEmpty()     // Catch:{ Exception -> 0x012d }
            if (r4 != 0) goto L_0x00c9
            int r4 = r8.getLinkType()     // Catch:{ Exception -> 0x012d }
            r5 = 2
            if (r4 != r5) goto L_0x00c9
            if (r9 != 0) goto L_0x00c9
            android.content.Context r4 = r7.f17830g     // Catch:{ Exception -> 0x012d }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x012d }
            r5.<init>()     // Catch:{ Exception -> 0x012d }
            java.lang.String r6 = "market://details?id="
            r5.append(r6)     // Catch:{ Exception -> 0x012d }
            java.lang.String r6 = r8.getPackageName()     // Catch:{ Exception -> 0x012d }
            r5.append(r6)     // Catch:{ Exception -> 0x012d }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x012d }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r6 = r7.f17832i     // Catch:{ Exception -> 0x012d }
            com.mbridge.msdk.foundation.tools.C8675y.C8676a.m24899a(r4, r5, r6)     // Catch:{ Exception -> 0x012d }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r4 = r7.f17832i     // Catch:{ Exception -> 0x012d }
            if (r4 == 0) goto L_0x00c6
            if (r3 == 0) goto L_0x00c6
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r3 = r7.f17832i     // Catch:{ Exception -> 0x012d }
            r3.onDismissLoading(r8)     // Catch:{ Exception -> 0x012d }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r3 = r7.f17832i     // Catch:{ Exception -> 0x012d }
            r4 = 0
            r3.onFinishRedirection(r8, r4)     // Catch:{ Exception -> 0x012d }
        L_0x00c6:
            r7.f17838o = r1     // Catch:{ Exception -> 0x012d }
            r3 = r2
        L_0x00c9:
            if (r9 == 0) goto L_0x0078
            r7.f17838o = r1     // Catch:{ Exception -> 0x012d }
            r7.f17836m = r2     // Catch:{ Exception -> 0x012d }
        L_0x00cf:
            android.os.Handler r1 = new android.os.Handler     // Catch:{ Exception -> 0x012d }
            android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x012d }
            r1.<init>(r3)     // Catch:{ Exception -> 0x012d }
            com.mbridge.msdk.click.a$4 r3 = new com.mbridge.msdk.click.a$4     // Catch:{ Exception -> 0x012d }
            r3.<init>(r0, r9, r8)     // Catch:{ Exception -> 0x012d }
            r1.post(r3)     // Catch:{ Exception -> 0x012d }
            com.mbridge.msdk.click.CommonJumpLoader r9 = r7.f17831h     // Catch:{ Exception -> 0x012d }
            if (r9 == 0) goto L_0x00e9
            com.mbridge.msdk.click.CommonJumpLoader r9 = r7.f17831h     // Catch:{ Exception -> 0x012d }
            r9.mo37013a()     // Catch:{ Exception -> 0x012d }
        L_0x00e9:
            java.util.Set<java.lang.String> r9 = f17826c     // Catch:{ Exception -> 0x012d }
            if (r9 == 0) goto L_0x010c
            java.util.Set<java.lang.String> r9 = f17826c     // Catch:{ Exception -> 0x012d }
            java.lang.String r1 = r8.getId()     // Catch:{ Exception -> 0x012d }
            boolean r9 = r9.contains(r1)     // Catch:{ Exception -> 0x012d }
            if (r9 == 0) goto L_0x010c
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r9 = r7.f17832i     // Catch:{ Exception -> 0x012d }
            if (r9 == 0) goto L_0x010b
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r9 = r7.f17832i     // Catch:{ Exception -> 0x012d }
            r9.onDismissLoading(r8)     // Catch:{ Exception -> 0x012d }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r9 = r7.f17832i     // Catch:{ Exception -> 0x012d }
            java.lang.String r0 = r8.getClickURL()     // Catch:{ Exception -> 0x012d }
            r9.onFinishRedirection(r8, r0)     // Catch:{ Exception -> 0x012d }
        L_0x010b:
            return
        L_0x010c:
            java.util.Set<java.lang.String> r9 = f17826c     // Catch:{ Exception -> 0x012d }
            if (r9 == 0) goto L_0x0119
            java.util.Set<java.lang.String> r9 = f17826c     // Catch:{ Exception -> 0x012d }
            java.lang.String r1 = r8.getId()     // Catch:{ Exception -> 0x012d }
            r9.add(r1)     // Catch:{ Exception -> 0x012d }
        L_0x0119:
            com.mbridge.msdk.click.CommonJumpLoader r9 = new com.mbridge.msdk.click.CommonJumpLoader     // Catch:{ Exception -> 0x012d }
            android.content.Context r1 = r7.f17830g     // Catch:{ Exception -> 0x012d }
            r9.<init>(r1)     // Catch:{ Exception -> 0x012d }
            r7.f17831h = r9     // Catch:{ Exception -> 0x012d }
            java.lang.String r1 = r7.f17827d     // Catch:{ Exception -> 0x012d }
            com.mbridge.msdk.click.a$5 r3 = new com.mbridge.msdk.click.a$5     // Catch:{ Exception -> 0x012d }
            r3.<init>(r8, r2, r0)     // Catch:{ Exception -> 0x012d }
            r9.mo37014a(r1, r8, r3)     // Catch:{ Exception -> 0x012d }
            goto L_0x0131
        L_0x012d:
            r8 = move-exception
            r8.printStackTrace()
        L_0x0131:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.C6765a.m20568a(com.mbridge.msdk.foundation.entity.CampaignEx, boolean):void");
    }

    /* renamed from: a */
    private void m20560a(CommonJumpLoader.JumpLoaderResult jumpLoaderResult, CampaignEx campaignEx, int i, boolean z) {
        if (campaignEx != null && jumpLoaderResult != null) {
            try {
                long currentTimeMillis = System.currentTimeMillis() - this.f17828e;
                C8459d dVar = new C8459d();
                int o = C8660r.m24840o(this.f17830g);
                dVar.mo57695a(o);
                dVar.mo57696a(C8660r.m24806a(this.f17830g, o));
                dVar.mo57710j(campaignEx.getRequestId());
                dVar.mo57711k(campaignEx.getRequestIdNotice());
                dVar.mo57701d(i);
                dVar.mo57709i(currentTimeMillis + "");
                dVar.mo57708h(campaignEx.getId());
                dVar.mo57705f(jumpLoaderResult.getType());
                if (!TextUtils.isEmpty(jumpLoaderResult.getUrl())) {
                    dVar.mo57707g(URLEncoder.encode(jumpLoaderResult.getUrl(), "utf-8"));
                }
                dVar.mo57700c((this.f17828e / 1000) + "");
                dVar.mo57697b(Integer.parseInt(campaignEx.getLandingType()));
                dVar.mo57699c(campaignEx.getLinkType());
                dVar.mo57698b(this.f17827d);
                dVar.mo57705f(jumpLoaderResult.getType());
                if (!TextUtils.isEmpty(jumpLoaderResult.getUrl())) {
                    dVar.mo57707g(URLEncoder.encode(jumpLoaderResult.getUrl(), "utf-8"));
                }
                if (this.f17835l) {
                    dVar.mo57703e(jumpLoaderResult.getStatusCode());
                    if (!TextUtils.isEmpty(jumpLoaderResult.getHeader())) {
                        dVar.mo57704e(URLEncoder.encode(jumpLoaderResult.getHeader(), "utf-8"));
                    }
                    if (!TextUtils.isEmpty(jumpLoaderResult.getContent())) {
                        dVar.mo57706f(URLEncoder.encode(jumpLoaderResult.getContent(), "UTF-8"));
                    }
                    if (!TextUtils.isEmpty(jumpLoaderResult.getExceptionMsg())) {
                        dVar.mo57702d(URLEncoder.encode(jumpLoaderResult.getExceptionMsg(), "utf-8"));
                    }
                }
                if (z) {
                    this.f17833j.mo58065a("click_jump_error", dVar, this.f17827d);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(dVar);
                String a = C8459d.m24074a((List<C8459d>) arrayList);
                if (!C8616ad.m24718b(a)) {
                    return;
                }
                if (C8574b.m24577a().mo58054c()) {
                    C8574b.m24577a().mo58052a(a);
                } else {
                    new C8582d(this.f17830g, 0).mo58068a("click_jump_success", a, (String) null, (Frame) null);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo37043a(Campaign campaign, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (campaign != null) {
                CampaignEx campaignEx = null;
                if (campaign instanceof CampaignEx) {
                    campaignEx = (CampaignEx) campaign;
                }
                if ((!str.startsWith("market://") && !str.startsWith("https://play.google.com/")) || C8675y.C8676a.m24899a(this.f17830g, str, this.f17832i) || campaignEx == null) {
                    return;
                }
                if (!TextUtils.isEmpty(campaignEx.getPackageName())) {
                    Context context = this.f17830g;
                    C8675y.C8676a.m24899a(context, "market://details?id=" + campaignEx.getPackageName(), this.f17832i);
                } else if (m20573b() == 2) {
                    C8675y.m24894a(this.f17830g, campaignEx.getClickURL(), campaignEx, this.f17832i);
                } else {
                    C8675y.m24897b(this.f17830g, campaignEx.getClickURL(), this.f17832i);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m20561a(CommonJumpLoader.JumpLoaderResult jumpLoaderResult, CampaignEx campaignEx, boolean z) {
        m20560a(jumpLoaderResult, campaignEx, 1, z);
    }

    /* renamed from: a */
    private void m20555a(int i, String str, CampaignEx campaignEx, NativeListener.NativeTrackingListener nativeTrackingListener) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (i == 2) {
                C8675y.m24894a(this.f17830g, str, campaignEx, nativeTrackingListener);
            } else {
                C8675y.m24897b(this.f17830g, str, nativeTrackingListener);
            }
        } catch (Throwable th) {
            C8672v.m24875a("MBridge SDK M", th.getMessage(), th);
        }
    }

    /* renamed from: a */
    private boolean m20572a(CampaignEx campaignEx, CommonJumpLoader.JumpLoaderResult jumpLoaderResult, boolean z, int i) {
        boolean z2 = false;
        if (z) {
            try {
                int parseInt = Integer.parseInt(campaignEx.getLandingType());
                if (parseInt == 1) {
                    C8675y.m24897b(this.f17830g, jumpLoaderResult.getUrl(), this.f17832i);
                } else if (parseInt == 2) {
                    C8675y.m24894a(this.f17830g, jumpLoaderResult.getUrl(), campaignEx, this.f17832i);
                } else if (campaignEx.getPackageName() != null) {
                    if (!C8675y.C8676a.m24899a(this.f17830g, "market://details?id=" + campaignEx.getPackageName(), this.f17832i)) {
                        m20555a(i, jumpLoaderResult.getUrl(), campaignEx, this.f17832i);
                    }
                } else {
                    m20555a(i, jumpLoaderResult.getUrl(), campaignEx, this.f17832i);
                }
                z2 = true;
            } catch (Throwable th) {
                C8672v.m24875a("MBridge SDK M", th.getMessage(), th);
            }
        }
        if (z2) {
            m20561a(jumpLoaderResult, campaignEx, true);
            if (this.f17832i != null) {
                this.f17832i.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
            }
        } else {
            m20561a(jumpLoaderResult, campaignEx, true);
            if (this.f17832i != null && z) {
                this.f17832i.onRedirectionFailed(campaignEx, jumpLoaderResult.getUrl());
            }
        }
        return z2;
    }

    /* renamed from: a */
    private boolean m20571a(CampaignEx campaignEx, CommonJumpLoader.JumpLoaderResult jumpLoaderResult, boolean z) {
        boolean z2 = false;
        if (z) {
            try {
                C8675y.m24897b(this.f17830g, campaignEx.getClickURL(), this.f17832i);
                z2 = true;
            } catch (Throwable th) {
                C8672v.m24875a("MBridge SDK M", th.getMessage(), th);
            }
        }
        m20561a(jumpLoaderResult, campaignEx, true);
        if (z2) {
            if (this.f17832i != null) {
                this.f17832i.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
            }
        } else if (this.f17832i != null) {
            this.f17832i.onRedirectionFailed(campaignEx, jumpLoaderResult.getUrl());
        }
        return z2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b0, code lost:
        if (com.mbridge.msdk.foundation.tools.C8675y.C8676a.m24899a(r2, "market://details?id=" + r7.getPackageName(), r6.f17832i) == false) goto L_0x00b2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m20566a(com.mbridge.msdk.foundation.entity.CampaignEx r7, com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult r8, boolean r9, boolean r10) {
        /*
            r6 = this;
            boolean r0 = r6.f17837n     // Catch:{ Exception -> 0x0154 }
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            if (r7 == 0) goto L_0x0144
            if (r8 != 0) goto L_0x000c
            goto L_0x0144
        L_0x000c:
            int r1 = r6.m20573b()     // Catch:{ Exception -> 0x0154 }
            int r2 = r8.getCode()     // Catch:{ Exception -> 0x0154 }
            java.lang.String r3 = r8.getUrl()     // Catch:{ Exception -> 0x0154 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0154 }
            r4 = 2
            r5 = 3
            if (r3 == 0) goto L_0x0052
            if (r9 == 0) goto L_0x0052
            int r10 = r7.getLinkType()     // Catch:{ Exception -> 0x0154 }
            if (r10 != r4) goto L_0x0030
            int r10 = r6.m20573b()     // Catch:{ Exception -> 0x0154 }
            r6.m20572a((com.mbridge.msdk.foundation.entity.CampaignEx) r7, (com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r8, (boolean) r9, (int) r10)     // Catch:{ Exception -> 0x0154 }
            return
        L_0x0030:
            if (r10 != r5) goto L_0x0036
            r6.m20571a((com.mbridge.msdk.foundation.entity.CampaignEx) r7, (com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r8, (boolean) r9)     // Catch:{ Exception -> 0x0154 }
            return
        L_0x0036:
            android.content.Context r9 = r6.f17830g     // Catch:{ Exception -> 0x0154 }
            java.lang.String r10 = r7.getClickURL()     // Catch:{ Exception -> 0x0154 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r1 = r6.f17832i     // Catch:{ Exception -> 0x0154 }
            com.mbridge.msdk.foundation.tools.C8675y.m24897b(r9, r10, r1)     // Catch:{ Exception -> 0x0154 }
            r6.m20561a((com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r8, (com.mbridge.msdk.foundation.entity.CampaignEx) r7, (boolean) r0)     // Catch:{ Exception -> 0x0154 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r9 = r6.f17832i     // Catch:{ Exception -> 0x0154 }
            if (r9 == 0) goto L_0x0051
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r9 = r6.f17832i     // Catch:{ Exception -> 0x0154 }
            java.lang.String r8 = r8.getUrl()     // Catch:{ Exception -> 0x0154 }
            r9.onFinishRedirection(r7, r8)     // Catch:{ Exception -> 0x0154 }
        L_0x0051:
            return
        L_0x0052:
            if (r2 != r0) goto L_0x00cb
            java.lang.String r2 = r7.getPackageName()     // Catch:{ Exception -> 0x0154 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0154 }
            if (r2 != 0) goto L_0x0087
            java.lang.String r2 = r8.getUrl()     // Catch:{ Exception -> 0x0154 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0154 }
            if (r2 != 0) goto L_0x0087
            java.lang.String r2 = r8.getUrl()     // Catch:{ Exception -> 0x0154 }
            java.lang.String r3 = r7.getPackageName()     // Catch:{ Exception -> 0x0154 }
            boolean r2 = r2.contains(r3)     // Catch:{ Exception -> 0x0154 }
            if (r2 == 0) goto L_0x0087
            if (r9 == 0) goto L_0x0087
            android.content.Context r2 = r6.f17830g     // Catch:{ Exception -> 0x0154 }
            java.lang.String r3 = r8.getUrl()     // Catch:{ Exception -> 0x0154 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r4 = r6.f17832i     // Catch:{ Exception -> 0x0154 }
            boolean r2 = com.mbridge.msdk.foundation.tools.C8675y.C8676a.m24899a(r2, r3, r4)     // Catch:{ Exception -> 0x0154 }
            if (r2 != 0) goto L_0x00bb
            goto L_0x00b2
        L_0x0087:
            if (r9 == 0) goto L_0x00bb
            java.lang.String r2 = r7.getPackageName()     // Catch:{ Exception -> 0x0154 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0154 }
            if (r2 != 0) goto L_0x00b2
            android.content.Context r2 = r6.f17830g     // Catch:{ Exception -> 0x0154 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0154 }
            r3.<init>()     // Catch:{ Exception -> 0x0154 }
            java.lang.String r4 = "market://details?id="
            r3.append(r4)     // Catch:{ Exception -> 0x0154 }
            java.lang.String r4 = r7.getPackageName()     // Catch:{ Exception -> 0x0154 }
            r3.append(r4)     // Catch:{ Exception -> 0x0154 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0154 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r4 = r6.f17832i     // Catch:{ Exception -> 0x0154 }
            boolean r2 = com.mbridge.msdk.foundation.tools.C8675y.C8676a.m24899a(r2, r3, r4)     // Catch:{ Exception -> 0x0154 }
            if (r2 != 0) goto L_0x00bb
        L_0x00b2:
            java.lang.String r2 = r8.getUrl()     // Catch:{ Exception -> 0x0154 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r3 = r6.f17832i     // Catch:{ Exception -> 0x0154 }
            r6.m20555a((int) r1, (java.lang.String) r2, (com.mbridge.msdk.foundation.entity.CampaignEx) r7, (com.mbridge.msdk.out.NativeListener.NativeTrackingListener) r3)     // Catch:{ Exception -> 0x0154 }
        L_0x00bb:
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r1 = r6.f17832i     // Catch:{ Exception -> 0x0154 }
            if (r1 == 0) goto L_0x011c
            if (r9 == 0) goto L_0x011c
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r1 = r6.f17832i     // Catch:{ Exception -> 0x0154 }
            java.lang.String r2 = r8.getUrl()     // Catch:{ Exception -> 0x0154 }
            r1.onFinishRedirection(r7, r2)     // Catch:{ Exception -> 0x0154 }
            goto L_0x011c
        L_0x00cb:
            if (r2 != r5) goto L_0x00ea
            if (r9 == 0) goto L_0x00da
            android.content.Context r1 = r6.f17830g     // Catch:{ Exception -> 0x0154 }
            java.lang.String r2 = r8.getUrl()     // Catch:{ Exception -> 0x0154 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r3 = r6.f17832i     // Catch:{ Exception -> 0x0154 }
            com.mbridge.msdk.foundation.tools.C8675y.m24897b(r1, r2, r3)     // Catch:{ Exception -> 0x0154 }
        L_0x00da:
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r1 = r6.f17832i     // Catch:{ Exception -> 0x0154 }
            if (r1 == 0) goto L_0x011c
            if (r9 == 0) goto L_0x011c
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r1 = r6.f17832i     // Catch:{ Exception -> 0x0154 }
            java.lang.String r2 = r8.getUrl()     // Catch:{ Exception -> 0x0154 }
            r1.onFinishRedirection(r7, r2)     // Catch:{ Exception -> 0x0154 }
            goto L_0x011c
        L_0x00ea:
            if (r9 == 0) goto L_0x011c
            int r1 = r7.getLinkType()     // Catch:{ Exception -> 0x0154 }
            if (r5 != r1) goto L_0x00f6
            r6.m20571a((com.mbridge.msdk.foundation.entity.CampaignEx) r7, (com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r8, (boolean) r9)     // Catch:{ Exception -> 0x0154 }
            return
        L_0x00f6:
            int r1 = r7.getLinkType()     // Catch:{ Exception -> 0x0154 }
            if (r4 != r1) goto L_0x0104
            int r10 = r6.m20573b()     // Catch:{ Exception -> 0x0154 }
            r6.m20572a((com.mbridge.msdk.foundation.entity.CampaignEx) r7, (com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r8, (boolean) r9, (int) r10)     // Catch:{ Exception -> 0x0154 }
            return
        L_0x0104:
            android.content.Context r1 = r6.f17830g     // Catch:{ Exception -> 0x0154 }
            java.lang.String r2 = r8.getUrl()     // Catch:{ Exception -> 0x0154 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r3 = r6.f17832i     // Catch:{ Exception -> 0x0154 }
            com.mbridge.msdk.foundation.tools.C8675y.m24897b(r1, r2, r3)     // Catch:{ Exception -> 0x0154 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r1 = r6.f17832i     // Catch:{ Exception -> 0x0154 }
            if (r1 == 0) goto L_0x011c
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r1 = r6.f17832i     // Catch:{ Exception -> 0x0154 }
            java.lang.String r2 = r8.getUrl()     // Catch:{ Exception -> 0x0154 }
            r1.onFinishRedirection(r7, r2)     // Catch:{ Exception -> 0x0154 }
        L_0x011c:
            int r1 = r7.getLinkType()     // Catch:{ Exception -> 0x0154 }
            java.lang.String r2 = r8.getUrl()     // Catch:{ Exception -> 0x0154 }
            boolean r1 = r6.m20569a((int) r1, (java.lang.String) r2)     // Catch:{ Exception -> 0x0154 }
            if (r1 == 0) goto L_0x012f
            r0 = 0
            r6.m20561a((com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r8, (com.mbridge.msdk.foundation.entity.CampaignEx) r7, (boolean) r0)     // Catch:{ Exception -> 0x0154 }
            goto L_0x0132
        L_0x012f:
            r6.m20561a((com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r8, (com.mbridge.msdk.foundation.entity.CampaignEx) r7, (boolean) r0)     // Catch:{ Exception -> 0x0154 }
        L_0x0132:
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r6.f17832i     // Catch:{ Exception -> 0x0154 }
            if (r0 == 0) goto L_0x0158
            if (r9 != 0) goto L_0x0158
            if (r10 == 0) goto L_0x0158
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r9 = r6.f17832i     // Catch:{ Exception -> 0x0154 }
            java.lang.String r8 = r8.getUrl()     // Catch:{ Exception -> 0x0154 }
            r9.onFinishRedirection(r7, r8)     // Catch:{ Exception -> 0x0154 }
            goto L_0x0158
        L_0x0144:
            if (r9 == 0) goto L_0x0153
            r6.m20561a((com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult) r8, (com.mbridge.msdk.foundation.entity.CampaignEx) r7, (boolean) r0)     // Catch:{ Exception -> 0x0154 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r7 = r6.f17832i     // Catch:{ Exception -> 0x0154 }
            if (r7 == 0) goto L_0x0153
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r7 = r6.f17832i     // Catch:{ Exception -> 0x0154 }
            r8 = 0
            r7.onRedirectionFailed(r8, r8)     // Catch:{ Exception -> 0x0154 }
        L_0x0153:
            return
        L_0x0154:
            r7 = move-exception
            r7.printStackTrace()
        L_0x0158:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.C6765a.m20566a(com.mbridge.msdk.foundation.entity.CampaignEx, com.mbridge.msdk.click.CommonJumpLoader$JumpLoaderResult, boolean, boolean):void");
    }

    /* renamed from: b */
    private int m20573b() {
        try {
            if (this.f17834k != null) {
                return this.f17834k.mo16154I();
            }
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (android.text.TextUtils.isEmpty(r5) == false) goto L_0x0014;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m20569a(int r4, java.lang.String r5) {
        /*
            r3 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            if (r4 != r0) goto L_0x000c
            boolean r4 = com.mbridge.msdk.foundation.tools.C8675y.C8676a.m24900a((java.lang.String) r5)     // Catch:{ Exception -> 0x0016 }
            if (r4 == 0) goto L_0x0013
            goto L_0x0014
        L_0x000c:
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0016 }
            if (r4 != 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r1 = r2
        L_0x0014:
            r2 = r1
            goto L_0x001a
        L_0x0016:
            r4 = move-exception
            r4.printStackTrace()
        L_0x001a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.C6765a.m20569a(int, java.lang.String):boolean");
    }

    /* renamed from: a */
    static /* synthetic */ void m20563a(C6765a aVar, CampaignEx campaignEx) {
        try {
            Intent intent = new Intent(aVar.f17830g, LoadingActivity.class);
            intent.setFlags(268435456);
            intent.putExtra(CampaignEx.JSON_KEY_ICON_URL, campaignEx.getIconUrl());
            aVar.f17830g.startActivity(intent);
        } catch (Exception e) {
            C8672v.m24875a("MBridge SDK M", "Exception", e);
        }
    }

    /* renamed from: f */
    static /* synthetic */ void m20580f(C6765a aVar) {
        try {
            Intent intent = new Intent();
            intent.setAction("ExitApp");
            aVar.f17830g.sendBroadcast(intent);
        } catch (Exception e) {
            C8672v.m24875a("MBridge SDK M", "Exception", e);
        }
    }
}
