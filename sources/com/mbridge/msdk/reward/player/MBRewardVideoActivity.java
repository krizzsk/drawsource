package com.mbridge.msdk.reward.player;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.foundation.p085b.C2462a;
import com.mbridge.msdk.foundation.p085b.C2470b;
import com.mbridge.msdk.foundation.same.p302c.C8481b;
import com.mbridge.msdk.foundation.same.p305f.C8498b;
import com.mbridge.msdk.foundation.tools.C8617ae;
import com.mbridge.msdk.foundation.tools.C8658p;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.reward.p343b.C9176a;
import com.mbridge.msdk.video.dynview.p351a.C9313a;
import com.mbridge.msdk.video.dynview.p354d.C9322a;
import com.mbridge.msdk.video.dynview.p354d.C9325d;
import com.mbridge.msdk.video.dynview.p360h.C9356b;
import com.mbridge.msdk.video.module.p369b.C9497a;
import com.mbridge.msdk.video.module.p369b.C9499b;
import com.mbridge.msdk.video.p347bt.module.MBTempContainer;
import com.mbridge.msdk.video.p347bt.module.MBridgeBTContainer;
import com.mbridge.msdk.video.p347bt.module.p349a.C9301a;
import com.mbridge.msdk.video.p347bt.module.p350b.C9311h;
import com.mbridge.msdk.video.signal.activity.AbstractJSActivity;
import com.mbridge.msdk.video.signal.factory.C9618b;
import com.mbridge.msdk.videocommon.C9625a;
import com.mbridge.msdk.videocommon.download.C9641a;
import com.mbridge.msdk.videocommon.download.C9645c;
import com.mbridge.msdk.videocommon.download.C9670k;
import com.mbridge.msdk.videocommon.p372a.C9627a;
import com.mbridge.msdk.videocommon.p373b.C9630c;
import com.mbridge.msdk.videocommon.p375d.C9640c;
import java.util.List;
import java.util.Map;

public class MBRewardVideoActivity extends AbstractJSActivity {
    public static String INTENT_EXTRADATA = "extraData";
    public static String INTENT_ISBID = "isBid";
    public static String INTENT_ISBIG_OFFER = "isBigOffer";
    public static String INTENT_ISIV = "isIV";
    public static String INTENT_IVREWARD_MODETYPE = "ivRewardMode";
    public static String INTENT_IVREWARD_VALUE = "ivRewardValue";
    public static String INTENT_IVREWARD_VALUETYPE = "ivRewardValueType";
    public static String INTENT_MUTE = "mute";
    public static String INTENT_REWARD = "reward";
    public static String INTENT_UNITID = "unitId";
    public static String INTENT_USERID = "userId";
    public static String SAVE_STATE_KEY_REPORT = "hasRelease";

    /* renamed from: A */
    private boolean f22524A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public int f22525B = 1;

    /* renamed from: C */
    private int f22526C = 0;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public int f22527D = 0;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public int f22528E = 0;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public int f22529F = 0;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public int f22530G = 0;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public int f22531H = 0;

    /* renamed from: I */
    private C9322a f22532I = new C9322a() {
        /* renamed from: a */
        public final void mo61387a(Map<String, Object> map) {
            if (map != null) {
                if (map.containsKey("mute")) {
                    int unused = MBRewardVideoActivity.this.f22538e = ((Integer) map.get("mute")).intValue();
                }
                if (map.containsKey("position")) {
                    int intValue = ((Integer) map.get("position")).intValue();
                    if (MBRewardVideoActivity.this.f22553t != null && MBRewardVideoActivity.this.f22553t.size() > 0 && intValue >= 1) {
                        MBRewardVideoActivity mBRewardVideoActivity = MBRewardVideoActivity.this;
                        CampaignEx unused2 = mBRewardVideoActivity.f22551r = (CampaignEx) mBRewardVideoActivity.f22553t.get(intValue);
                        MBRewardVideoActivity.m26156b(MBRewardVideoActivity.this);
                        int i = intValue - 1;
                        if (MBRewardVideoActivity.this.f22553t.get(i) != null) {
                            MBRewardVideoActivity mBRewardVideoActivity2 = MBRewardVideoActivity.this;
                            MBRewardVideoActivity.m26157b(mBRewardVideoActivity2, ((CampaignEx) mBRewardVideoActivity2.f22553t.get(i)).getVideoLength());
                        }
                        MBRewardVideoActivity mBRewardVideoActivity3 = MBRewardVideoActivity.this;
                        MBRewardVideoActivity.this.f22551r.setVideoCompleteTime(mBRewardVideoActivity3.m26145a(mBRewardVideoActivity3.f22551r.getVideoCompleteTime(), MBRewardVideoActivity.this.f22525B));
                        MBRewardVideoActivity mBRewardVideoActivity4 = MBRewardVideoActivity.this;
                        mBRewardVideoActivity4.m26151a(mBRewardVideoActivity4.f22551r);
                    }
                }
            }
        }
    };

    /* renamed from: J */
    private C9325d f22533J = new C9325d() {
        /* renamed from: a */
        public final void mo61389a(CampaignEx campaignEx) {
            if (campaignEx != null) {
                if (MBRewardVideoActivity.this.f22555v != null) {
                    new C9356b().mo62866b((View) MBRewardVideoActivity.this.f22555v, 500);
                }
                CampaignEx unused = MBRewardVideoActivity.this.f22551r = campaignEx;
                MBRewardVideoActivity mBRewardVideoActivity = MBRewardVideoActivity.this;
                mBRewardVideoActivity.m26151a(mBRewardVideoActivity.f22551r);
                return;
            }
            MBRewardVideoActivity.this.m26153a("campaign is null");
        }

        /* renamed from: a */
        public final void mo61388a() {
            if (MBRewardVideoActivity.this.f22555v != null) {
                new C9356b().mo62866b((View) MBRewardVideoActivity.this.f22555v, 500);
            }
            boolean unused = MBRewardVideoActivity.this.f22544k = true;
            MBRewardVideoActivity.this.m26150a();
            if (MBRewardVideoActivity.this.f22554u != null) {
                MBRewardVideoActivity.this.f22554u.setNotchPadding(MBRewardVideoActivity.this.f22531H, MBRewardVideoActivity.this.f22527D, MBRewardVideoActivity.this.f22529F, MBRewardVideoActivity.this.f22528E, MBRewardVideoActivity.this.f22530G);
            }
            try {
                C8498b.m24360b().execute(new C9191b(MBRewardVideoActivity.this.f22551r, MBRewardVideoActivity.this.f22534a, 1));
            } catch (Exception unused2) {
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f22534a;

    /* renamed from: b */
    private String f22535b;

    /* renamed from: c */
    private String f22536c;

    /* renamed from: d */
    private C9630c f22537d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f22538e = 2;

    /* renamed from: f */
    private boolean f22539f = false;

    /* renamed from: g */
    private boolean f22540g = false;

    /* renamed from: h */
    private int f22541h;

    /* renamed from: i */
    private int f22542i;

    /* renamed from: j */
    private int f22543j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f22544k = false;

    /* renamed from: l */
    private boolean f22545l = false;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C9311h f22546m;

    /* renamed from: n */
    private C9640c f22547n;

    /* renamed from: o */
    private boolean f22548o = false;

    /* renamed from: p */
    private boolean f22549p = false;

    /* renamed from: q */
    private C9641a f22550q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public CampaignEx f22551r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public List<C9641a> f22552s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public List<CampaignEx> f22553t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public MBTempContainer f22554u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public MBridgeBTContainer f22555v;

    /* renamed from: w */
    private WindVaneWebView f22556w;

    /* renamed from: x */
    private C9301a f22557x;

    /* renamed from: y */
    private String f22558y;

    /* renamed from: z */
    private String f22559z;

    /* renamed from: b */
    static /* synthetic */ int m26156b(MBRewardVideoActivity mBRewardVideoActivity) {
        int i = mBRewardVideoActivity.f22525B;
        mBRewardVideoActivity.f22525B = i + 1;
        return i;
    }

    /* renamed from: b */
    static /* synthetic */ int m26157b(MBRewardVideoActivity mBRewardVideoActivity, int i) {
        int i2 = mBRewardVideoActivity.f22526C - i;
        mBRewardVideoActivity.f22526C = i2;
        return i2;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(15:78|(1:84)|85|(5:87|(1:89)(1:90)|91|(1:93)|94)|95|(1:97)|98|(1:104)|105|106|107|108|109|110|(3:112|113|114)(2:115|(2:117|118)(2:119|(2:129|136)(1:(4:124|(1:126)|127|134)(2:128|135))))) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:108:0x02b9 */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02c7 A[SYNTHETIC, Splitter:B:112:0x02c7] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02cb A[Catch:{ Exception -> 0x0153, all -> 0x0329 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r20) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            java.lang.String r2 = "_"
            java.lang.String r3 = ""
            java.lang.String r4 = "anim"
            super.onCreate(r20)
            r5 = 1
            com.mbridge.msdk.MBridgeConstans.isRewardActivityShowing = r5
            com.mbridge.msdk.foundation.controller.a r6 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            r6.mo56898a((android.content.Context) r1)
            java.lang.String r6 = "mbridge_more_offer_activity"
            int r6 = r1.findLayout(r6)     // Catch:{ all -> 0x0329 }
            if (r6 >= 0) goto L_0x0025
            java.lang.String r0 = "no mbridge_more_offer_activity layout"
            r1.m26153a((java.lang.String) r0)     // Catch:{ all -> 0x0329 }
            return
        L_0x0025:
            r1.setContentView(r6)     // Catch:{ all -> 0x0329 }
            android.content.Intent r6 = r19.getIntent()     // Catch:{ all -> 0x0329 }
            java.lang.String r7 = INTENT_UNITID     // Catch:{ all -> 0x0329 }
            java.lang.String r7 = r6.getStringExtra(r7)     // Catch:{ all -> 0x0329 }
            r1.f22534a = r7     // Catch:{ all -> 0x0329 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0329 }
            java.lang.String r8 = "data empty error"
            if (r7 == 0) goto L_0x0040
            r1.m26153a((java.lang.String) r8)     // Catch:{ all -> 0x0329 }
            return
        L_0x0040:
            java.util.Map<java.lang.String, com.mbridge.msdk.reward.a.a$d> r7 = com.mbridge.msdk.reward.p342a.C9110a.f22132b     // Catch:{ all -> 0x0329 }
            java.lang.String r9 = r1.f22534a     // Catch:{ all -> 0x0329 }
            java.lang.Object r7 = r7.get(r9)     // Catch:{ all -> 0x0329 }
            com.mbridge.msdk.video.bt.module.b.h r7 = (com.mbridge.msdk.video.p347bt.module.p350b.C9311h) r7     // Catch:{ all -> 0x0329 }
            r1.f22546m = r7     // Catch:{ all -> 0x0329 }
            java.lang.String r7 = com.mbridge.msdk.MBridgeConstans.PLACEMENT_ID     // Catch:{ all -> 0x0329 }
            java.lang.String r7 = r6.getStringExtra(r7)     // Catch:{ all -> 0x0329 }
            r1.f22535b = r7     // Catch:{ all -> 0x0329 }
            java.lang.String r7 = INTENT_REWARD     // Catch:{ all -> 0x0329 }
            java.lang.String r7 = r6.getStringExtra(r7)     // Catch:{ all -> 0x0329 }
            com.mbridge.msdk.videocommon.b.c r7 = com.mbridge.msdk.videocommon.p373b.C9630c.m27342b(r7)     // Catch:{ all -> 0x0329 }
            r1.f22537d = r7     // Catch:{ all -> 0x0329 }
            java.lang.String r7 = INTENT_USERID     // Catch:{ all -> 0x0329 }
            java.lang.String r7 = r6.getStringExtra(r7)     // Catch:{ all -> 0x0329 }
            r1.f22536c = r7     // Catch:{ all -> 0x0329 }
            java.lang.String r7 = INTENT_MUTE     // Catch:{ all -> 0x0329 }
            r9 = 2
            int r7 = r6.getIntExtra(r7, r9)     // Catch:{ all -> 0x0329 }
            r1.f22538e = r7     // Catch:{ all -> 0x0329 }
            java.lang.String r7 = INTENT_ISIV     // Catch:{ all -> 0x0329 }
            r9 = 0
            boolean r7 = r6.getBooleanExtra(r7, r9)     // Catch:{ all -> 0x0329 }
            r1.f22539f = r7     // Catch:{ all -> 0x0329 }
            com.mbridge.msdk.foundation.controller.a r7 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ all -> 0x0329 }
            boolean r10 = r1.f22539f     // Catch:{ all -> 0x0329 }
            r11 = 287(0x11f, float:4.02E-43)
            r12 = 94
            if (r10 == 0) goto L_0x0088
            r10 = r11
            goto L_0x0089
        L_0x0088:
            r10 = r12
        L_0x0089:
            r7.mo56897a((int) r10)     // Catch:{ all -> 0x0329 }
            java.lang.String r7 = INTENT_ISBID     // Catch:{ all -> 0x0329 }
            boolean r7 = r6.getBooleanExtra(r7, r9)     // Catch:{ all -> 0x0329 }
            r1.f22540g = r7     // Catch:{ all -> 0x0329 }
            java.lang.String r7 = INTENT_EXTRADATA     // Catch:{ all -> 0x0329 }
            java.lang.String r7 = r6.getStringExtra(r7)     // Catch:{ all -> 0x0329 }
            r1.f22559z = r7     // Catch:{ all -> 0x0329 }
            boolean r7 = r1.f22539f     // Catch:{ all -> 0x0329 }
            if (r7 == 0) goto L_0x00b8
            java.lang.String r7 = INTENT_IVREWARD_MODETYPE     // Catch:{ all -> 0x0329 }
            int r7 = r6.getIntExtra(r7, r9)     // Catch:{ all -> 0x0329 }
            r1.f22541h = r7     // Catch:{ all -> 0x0329 }
            java.lang.String r7 = INTENT_IVREWARD_VALUETYPE     // Catch:{ all -> 0x0329 }
            int r7 = r6.getIntExtra(r7, r9)     // Catch:{ all -> 0x0329 }
            r1.f22542i = r7     // Catch:{ all -> 0x0329 }
            java.lang.String r7 = INTENT_IVREWARD_VALUE     // Catch:{ all -> 0x0329 }
            int r7 = r6.getIntExtra(r7, r9)     // Catch:{ all -> 0x0329 }
            r1.f22543j = r7     // Catch:{ all -> 0x0329 }
        L_0x00b8:
            com.mbridge.msdk.video.signal.factory.b r7 = new com.mbridge.msdk.video.signal.factory.b     // Catch:{ all -> 0x0329 }
            r7.<init>(r1)     // Catch:{ all -> 0x0329 }
            r1.jsFactory = r7     // Catch:{ all -> 0x0329 }
            com.mbridge.msdk.video.signal.factory.IJSFactory r7 = r1.jsFactory     // Catch:{ all -> 0x0329 }
            r1.registerJsFactory(r7)     // Catch:{ all -> 0x0329 }
            com.mbridge.msdk.video.bt.module.b.h r7 = r1.f22546m     // Catch:{ all -> 0x0329 }
            if (r7 != 0) goto L_0x00ce
            java.lang.String r0 = "showRewardListener is null"
            r1.m26153a((java.lang.String) r0)     // Catch:{ all -> 0x0329 }
            return
        L_0x00ce:
            com.mbridge.msdk.reward.adapter.RewardUnitCacheManager r7 = com.mbridge.msdk.reward.adapter.RewardUnitCacheManager.getInstance()     // Catch:{ all -> 0x0329 }
            java.lang.String r10 = r1.f22535b     // Catch:{ all -> 0x0329 }
            java.lang.String r13 = r1.f22534a     // Catch:{ all -> 0x0329 }
            com.mbridge.msdk.videocommon.d.c r7 = r7.get(r10, r13)     // Catch:{ all -> 0x0329 }
            r1.f22547n = r7     // Catch:{ all -> 0x0329 }
            if (r7 != 0) goto L_0x010a
            com.mbridge.msdk.videocommon.d.b r7 = com.mbridge.msdk.videocommon.p375d.C9638b.m27377a()     // Catch:{ all -> 0x0329 }
            com.mbridge.msdk.foundation.controller.a r10 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ all -> 0x0329 }
            java.lang.String r10 = r10.mo56914h()     // Catch:{ all -> 0x0329 }
            java.lang.String r13 = r1.f22534a     // Catch:{ all -> 0x0329 }
            com.mbridge.msdk.videocommon.d.c r7 = r7.mo63550a(r10, r13)     // Catch:{ all -> 0x0329 }
            r1.f22547n = r7     // Catch:{ all -> 0x0329 }
            if (r7 != 0) goto L_0x010a
            com.mbridge.msdk.videocommon.d.b r7 = com.mbridge.msdk.videocommon.p375d.C9638b.m27377a()     // Catch:{ all -> 0x0329 }
            com.mbridge.msdk.foundation.controller.a r10 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ all -> 0x0329 }
            java.lang.String r10 = r10.mo56914h()     // Catch:{ all -> 0x0329 }
            java.lang.String r13 = r1.f22534a     // Catch:{ all -> 0x0329 }
            boolean r14 = r1.f22539f     // Catch:{ all -> 0x0329 }
            com.mbridge.msdk.videocommon.d.c r7 = r7.mo63551a((java.lang.String) r10, (java.lang.String) r13, (boolean) r14)     // Catch:{ all -> 0x0329 }
            r1.f22547n = r7     // Catch:{ all -> 0x0329 }
        L_0x010a:
            com.mbridge.msdk.videocommon.d.c r7 = r1.f22547n     // Catch:{ all -> 0x0329 }
            if (r7 == 0) goto L_0x0124
            com.mbridge.msdk.videocommon.b.c r7 = r1.f22537d     // Catch:{ all -> 0x0329 }
            com.mbridge.msdk.videocommon.d.c r10 = r1.f22547n     // Catch:{ all -> 0x0329 }
            int r10 = r10.mo63588k()     // Catch:{ all -> 0x0329 }
            r7.mo63525a((int) r10)     // Catch:{ all -> 0x0329 }
            com.mbridge.msdk.videocommon.b.c r7 = r1.f22537d     // Catch:{ all -> 0x0329 }
            com.mbridge.msdk.videocommon.d.c r10 = r1.f22547n     // Catch:{ all -> 0x0329 }
            java.lang.String r10 = r10.mo63590l()     // Catch:{ all -> 0x0329 }
            r7.mo63526a((java.lang.String) r10)     // Catch:{ all -> 0x0329 }
        L_0x0124:
            com.mbridge.msdk.videocommon.b.c r7 = r1.f22537d     // Catch:{ all -> 0x0329 }
            if (r7 == 0) goto L_0x0135
            com.mbridge.msdk.videocommon.b.c r7 = r1.f22537d     // Catch:{ all -> 0x0329 }
            int r7 = r7.mo63527b()     // Catch:{ all -> 0x0329 }
            if (r7 > 0) goto L_0x0135
            com.mbridge.msdk.videocommon.b.c r7 = r1.f22537d     // Catch:{ all -> 0x0329 }
            r7.mo63525a((int) r5)     // Catch:{ all -> 0x0329 }
        L_0x0135:
            java.lang.String r7 = "mbridge_reward_activity_open"
            int r7 = com.mbridge.msdk.foundation.tools.C8658p.m24799a(r1, r7, r4)     // Catch:{ all -> 0x0329 }
            java.lang.String r10 = "mbridge_reward_activity_stay"
            int r4 = com.mbridge.msdk.foundation.tools.C8658p.m24799a(r1, r10, r4)     // Catch:{ all -> 0x0329 }
            if (r7 <= r5) goto L_0x0148
            if (r4 <= r5) goto L_0x0148
            r1.overridePendingTransition(r7, r4)     // Catch:{ all -> 0x0329 }
        L_0x0148:
            if (r0 == 0) goto L_0x0157
            java.lang.String r4 = SAVE_STATE_KEY_REPORT     // Catch:{ Exception -> 0x0153 }
            boolean r0 = r0.getBoolean(r4)     // Catch:{ Exception -> 0x0153 }
            r1.f22549p = r0     // Catch:{ Exception -> 0x0153 }
            goto L_0x0157
        L_0x0153:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x0329 }
        L_0x0157:
            com.mbridge.msdk.videocommon.download.c r0 = com.mbridge.msdk.videocommon.download.C9645c.getInstance()     // Catch:{ all -> 0x0329 }
            java.lang.String r4 = r1.f22534a     // Catch:{ all -> 0x0329 }
            java.util.List r0 = r0.mo63660b((java.lang.String) r4)     // Catch:{ all -> 0x0329 }
            r1.f22552s = r0     // Catch:{ all -> 0x0329 }
            java.lang.String r0 = INTENT_ISBIG_OFFER     // Catch:{ all -> 0x0329 }
            boolean r0 = r6.getBooleanExtra(r0, r9)     // Catch:{ all -> 0x0329 }
            r1.f22544k = r0     // Catch:{ all -> 0x0329 }
            java.lang.String r0 = "DynamicViewCampaignResourceDownloader"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0329 }
            r4.<init>()     // Catch:{ all -> 0x0329 }
            java.lang.String r6 = "进入 show，大模板 "
            r4.append(r6)     // Catch:{ all -> 0x0329 }
            boolean r6 = r1.f22544k     // Catch:{ all -> 0x0329 }
            r4.append(r6)     // Catch:{ all -> 0x0329 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0329 }
            com.mbridge.msdk.foundation.tools.C8672v.m24874a(r0, r4)     // Catch:{ all -> 0x0329 }
            boolean r0 = r1.f22544k     // Catch:{ all -> 0x0329 }
            if (r0 != 0) goto L_0x01d9
            java.util.List<com.mbridge.msdk.videocommon.download.a> r0 = r1.f22552s     // Catch:{ all -> 0x0329 }
            if (r0 == 0) goto L_0x019d
            java.util.List<com.mbridge.msdk.videocommon.download.a> r0 = r1.f22552s     // Catch:{ all -> 0x0329 }
            int r0 = r0.size()     // Catch:{ all -> 0x0329 }
            if (r0 <= 0) goto L_0x019d
            java.util.List<com.mbridge.msdk.videocommon.download.a> r0 = r1.f22552s     // Catch:{ all -> 0x0329 }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x0329 }
            com.mbridge.msdk.videocommon.download.a r0 = (com.mbridge.msdk.videocommon.download.C9641a) r0     // Catch:{ all -> 0x0329 }
            r1.f22550q = r0     // Catch:{ all -> 0x0329 }
        L_0x019d:
            com.mbridge.msdk.videocommon.download.a r0 = r1.f22550q     // Catch:{ all -> 0x0329 }
            if (r0 == 0) goto L_0x01c6
            com.mbridge.msdk.videocommon.download.a r0 = r1.f22550q     // Catch:{ all -> 0x0329 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r0.mo63640g()     // Catch:{ all -> 0x0329 }
            r1.f22551r = r0     // Catch:{ all -> 0x0329 }
            com.mbridge.msdk.videocommon.download.a r0 = r1.f22550q     // Catch:{ all -> 0x0329 }
            r0.mo63627a((boolean) r5)     // Catch:{ all -> 0x0329 }
            com.mbridge.msdk.videocommon.download.a r0 = r1.f22550q     // Catch:{ all -> 0x0329 }
            r0.mo63631b((boolean) r9)     // Catch:{ all -> 0x0329 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f22551r     // Catch:{ all -> 0x0329 }
            if (r0 == 0) goto L_0x01c6
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f22551r     // Catch:{ all -> 0x0329 }
            int r0 = r0.getMaitve()     // Catch:{ all -> 0x0329 }
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r1.f22551r     // Catch:{ all -> 0x0329 }
            java.lang.String r2 = r2.getMaitve_src()     // Catch:{ all -> 0x0329 }
            com.mbridge.msdk.click.C6779b.m20644a((android.content.Context) r1, (int) r0, (java.lang.String) r2)     // Catch:{ all -> 0x0329 }
        L_0x01c6:
            com.mbridge.msdk.videocommon.download.a r0 = r1.f22550q     // Catch:{ all -> 0x0329 }
            if (r0 == 0) goto L_0x01d2
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f22551r     // Catch:{ all -> 0x0329 }
            if (r0 == 0) goto L_0x01d2
            com.mbridge.msdk.videocommon.b.c r0 = r1.f22537d     // Catch:{ all -> 0x0329 }
            if (r0 != 0) goto L_0x01d5
        L_0x01d2:
            r1.m26153a((java.lang.String) r8)     // Catch:{ all -> 0x0329 }
        L_0x01d5:
            r19.m26150a()     // Catch:{ all -> 0x0329 }
            return
        L_0x01d9:
            com.mbridge.msdk.videocommon.download.c r0 = com.mbridge.msdk.videocommon.download.C9645c.getInstance()     // Catch:{ all -> 0x0329 }
            java.lang.String r4 = r1.f22534a     // Catch:{ all -> 0x0329 }
            java.util.List r0 = r0.mo63653a((java.lang.String) r4)     // Catch:{ all -> 0x0329 }
            r1.f22553t = r0     // Catch:{ all -> 0x0329 }
            r1.f22558y = r3     // Catch:{ all -> 0x0329 }
            if (r0 == 0) goto L_0x020c
            int r0 = r0.size()     // Catch:{ all -> 0x0329 }
            if (r0 <= 0) goto L_0x020c
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r0 = r1.f22553t     // Catch:{ all -> 0x0329 }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x0329 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0     // Catch:{ all -> 0x0329 }
            java.lang.String r3 = r0.getCMPTEntryUrl()     // Catch:{ all -> 0x0329 }
            java.lang.String r4 = r0.getRequestId()     // Catch:{ all -> 0x0329 }
            r1.f22558y = r4     // Catch:{ all -> 0x0329 }
            int r4 = r0.getMaitve()     // Catch:{ all -> 0x0329 }
            java.lang.String r0 = r0.getMaitve_src()     // Catch:{ all -> 0x0329 }
            com.mbridge.msdk.click.C6779b.m20644a((android.content.Context) r1, (int) r4, (java.lang.String) r0)     // Catch:{ all -> 0x0329 }
        L_0x020c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0329 }
            r0.<init>()     // Catch:{ all -> 0x0329 }
            java.lang.String r4 = r1.f22534a     // Catch:{ all -> 0x0329 }
            r0.append(r4)     // Catch:{ all -> 0x0329 }
            r0.append(r2)     // Catch:{ all -> 0x0329 }
            java.lang.String r4 = r1.f22558y     // Catch:{ all -> 0x0329 }
            r0.append(r4)     // Catch:{ all -> 0x0329 }
            r0.append(r2)     // Catch:{ all -> 0x0329 }
            r0.append(r3)     // Catch:{ all -> 0x0329 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0329 }
            com.mbridge.msdk.videocommon.a$a r0 = com.mbridge.msdk.videocommon.C9625a.m27300a(r0)     // Catch:{ all -> 0x0329 }
            r2 = 0
            if (r0 == 0) goto L_0x0234
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r0 = r0.mo63497a()     // Catch:{ all -> 0x0329 }
            goto L_0x0235
        L_0x0234:
            r0 = r2
        L_0x0235:
            r1.f22556w = r0     // Catch:{ all -> 0x0329 }
            if (r0 != 0) goto L_0x0325
            com.mbridge.msdk.videocommon.download.a r0 = r1.f22550q     // Catch:{ all -> 0x0329 }
            if (r0 != 0) goto L_0x0253
            java.util.List<com.mbridge.msdk.videocommon.download.a> r0 = r1.f22552s     // Catch:{ all -> 0x0329 }
            if (r0 == 0) goto L_0x0253
            java.util.List<com.mbridge.msdk.videocommon.download.a> r0 = r1.f22552s     // Catch:{ all -> 0x0329 }
            int r0 = r0.size()     // Catch:{ all -> 0x0329 }
            if (r0 <= 0) goto L_0x0253
            java.util.List<com.mbridge.msdk.videocommon.download.a> r0 = r1.f22552s     // Catch:{ all -> 0x0329 }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x0329 }
            com.mbridge.msdk.videocommon.download.a r0 = (com.mbridge.msdk.videocommon.download.C9641a) r0     // Catch:{ all -> 0x0329 }
            r1.f22550q = r0     // Catch:{ all -> 0x0329 }
        L_0x0253:
            com.mbridge.msdk.videocommon.download.a r0 = r1.f22550q     // Catch:{ all -> 0x0329 }
            if (r0 != 0) goto L_0x0271
            com.mbridge.msdk.videocommon.download.c r0 = com.mbridge.msdk.videocommon.download.C9645c.getInstance()     // Catch:{ all -> 0x0329 }
            boolean r3 = r1.f22539f     // Catch:{ all -> 0x0329 }
            if (r3 == 0) goto L_0x0260
            goto L_0x0261
        L_0x0260:
            r11 = r12
        L_0x0261:
            java.lang.String r3 = r1.f22534a     // Catch:{ all -> 0x0329 }
            boolean r4 = r1.f22540g     // Catch:{ all -> 0x0329 }
            com.mbridge.msdk.videocommon.download.k r0 = r0.mo63662c(r3)     // Catch:{ all -> 0x0329 }
            if (r0 == 0) goto L_0x026f
            com.mbridge.msdk.videocommon.download.a r2 = r0.mo63695b((int) r11, (boolean) r4)     // Catch:{ all -> 0x0329 }
        L_0x026f:
            r1.f22550q = r2     // Catch:{ all -> 0x0329 }
        L_0x0271:
            com.mbridge.msdk.videocommon.download.a r0 = r1.f22550q     // Catch:{ all -> 0x0329 }
            if (r0 == 0) goto L_0x0287
            com.mbridge.msdk.videocommon.download.a r0 = r1.f22550q     // Catch:{ all -> 0x0329 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r0.mo63640g()     // Catch:{ all -> 0x0329 }
            r1.f22551r = r0     // Catch:{ all -> 0x0329 }
            com.mbridge.msdk.videocommon.download.a r0 = r1.f22550q     // Catch:{ all -> 0x0329 }
            r0.mo63627a((boolean) r5)     // Catch:{ all -> 0x0329 }
            com.mbridge.msdk.videocommon.download.a r0 = r1.f22550q     // Catch:{ all -> 0x0329 }
            r0.mo63631b((boolean) r9)     // Catch:{ all -> 0x0329 }
        L_0x0287:
            com.mbridge.msdk.videocommon.download.a r0 = r1.f22550q     // Catch:{ all -> 0x0329 }
            if (r0 == 0) goto L_0x0293
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f22551r     // Catch:{ all -> 0x0329 }
            if (r0 == 0) goto L_0x0293
            com.mbridge.msdk.videocommon.b.c r0 = r1.f22537d     // Catch:{ all -> 0x0329 }
            if (r0 != 0) goto L_0x0296
        L_0x0293:
            r1.m26153a((java.lang.String) r8)     // Catch:{ all -> 0x0329 }
        L_0x0296:
            r1.f22544k = r9     // Catch:{ all -> 0x0329 }
            com.mbridge.msdk.foundation.entity.CampaignEx r10 = r1.f22551r     // Catch:{ Exception -> 0x02b9 }
            com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x02b9 }
            android.content.Context r11 = r0.mo56913g()     // Catch:{ Exception -> 0x02b9 }
            java.lang.String r12 = "showMoreOffer showBTOld"
            java.lang.String r13 = r1.f22534a     // Catch:{ Exception -> 0x02b9 }
            boolean r14 = r1.f22540g     // Catch:{ Exception -> 0x02b9 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f22551r     // Catch:{ Exception -> 0x02b9 }
            java.lang.String r15 = r0.getRequestId()     // Catch:{ Exception -> 0x02b9 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f22551r     // Catch:{ Exception -> 0x02b9 }
            java.lang.String r16 = r0.getRequestIdNotice()     // Catch:{ Exception -> 0x02b9 }
            r17 = 0
            com.mbridge.msdk.reward.p343b.C9176a.m26122a(r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x02b9 }
        L_0x02b9:
            com.mbridge.msdk.videocommon.a.a r0 = com.mbridge.msdk.videocommon.p372a.C9627a.m27316a()     // Catch:{ all -> 0x0329 }
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r2 = r1.f22553t     // Catch:{ all -> 0x0329 }
            java.util.List r0 = r0.mo63507a((java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>) r2)     // Catch:{ all -> 0x0329 }
            java.lang.String r2 = "no available campaign"
            if (r0 != 0) goto L_0x02cb
            r1.m26153a((java.lang.String) r2)     // Catch:{ all -> 0x0329 }
            return
        L_0x02cb:
            int r3 = r0.size()     // Catch:{ all -> 0x0329 }
            if (r3 != 0) goto L_0x02d5
            r1.m26153a((java.lang.String) r2)     // Catch:{ all -> 0x0329 }
            return
        L_0x02d5:
            java.lang.Object r2 = r0.get(r9)     // Catch:{ all -> 0x0329 }
            if (r2 == 0) goto L_0x0321
            java.lang.Object r2 = r0.get(r9)     // Catch:{ all -> 0x0329 }
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = (com.mbridge.msdk.foundation.entity.CampaignEx) r2     // Catch:{ all -> 0x0329 }
            boolean r2 = r2.isDynamicView()     // Catch:{ all -> 0x0329 }
            if (r2 == 0) goto L_0x0321
            if (r3 != r5) goto L_0x031d
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x0329 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0     // Catch:{ all -> 0x0329 }
            r1.f22551r = r0     // Catch:{ all -> 0x0329 }
            if (r0 == 0) goto L_0x0317
            r0.setCampaignIsFiltered(r5)     // Catch:{ all -> 0x0329 }
            com.mbridge.msdk.foundation.entity.CampaignEx r6 = r1.f22551r     // Catch:{ all -> 0x0329 }
            com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ all -> 0x0329 }
            android.content.Context r7 = r0.mo56913g()     // Catch:{ all -> 0x0329 }
            java.lang.String r8 = "no available campaign but to one offer show"
            java.lang.String r9 = r1.f22534a     // Catch:{ all -> 0x0329 }
            boolean r10 = r1.f22540g     // Catch:{ all -> 0x0329 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f22551r     // Catch:{ all -> 0x0329 }
            java.lang.String r11 = r0.getRequestId()     // Catch:{ all -> 0x0329 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f22551r     // Catch:{ all -> 0x0329 }
            java.lang.String r12 = r0.getRequestIdNotice()     // Catch:{ all -> 0x0329 }
            r13 = 0
            com.mbridge.msdk.reward.p343b.C9176a.m26122a(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0329 }
        L_0x0317:
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f22551r     // Catch:{ all -> 0x0329 }
            r1.m26151a((com.mbridge.msdk.foundation.entity.CampaignEx) r0)     // Catch:{ all -> 0x0329 }
            goto L_0x033e
        L_0x031d:
            r1.m26154a((java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>) r0)     // Catch:{ all -> 0x0329 }
            goto L_0x033e
        L_0x0321:
            r19.m26150a()     // Catch:{ all -> 0x0329 }
            goto L_0x033e
        L_0x0325:
            r19.m26158b()     // Catch:{ all -> 0x0329 }
            goto L_0x033e
        L_0x0329:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "onCreate error"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.m26153a((java.lang.String) r0)
        L_0x033e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.player.MBRewardVideoActivity.onCreate(android.os.Bundle):void");
    }

    /* renamed from: a */
    private void m26154a(List<CampaignEx> list) {
        if (list == null) {
            m26153a("no available campaign");
        } else if (list.size() == 0) {
            m26153a("no available campaign");
        } else {
            if ((list.get(0) != null ? list.get(0).getDynamicTempCode() : 0) != 5) {
                m26158b();
                return;
            }
            for (CampaignEx next : list) {
                if (next != null) {
                    this.f22526C += next.getVideoLength();
                }
            }
            CampaignEx campaignEx = list.get(0);
            if (campaignEx != null) {
                int a = m26145a(campaignEx.getVideoCompleteTime(), this.f22525B);
                this.f22551r = campaignEx;
                campaignEx.setCampaignIsFiltered(true);
                this.f22525B = 1;
                this.f22551r.setVideoCompleteTime(a);
                m26151a(this.f22551r);
                return;
            }
            m26153a("campaign is less");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m26151a(CampaignEx campaignEx) {
        CampaignEx g;
        try {
            if (this.f22552s != null && this.f22552s.size() > 0) {
                for (C9641a next : this.f22552s) {
                    if (next != null && (g = next.mo63640g()) != null && TextUtils.equals(g.getId(), campaignEx.getId()) && TextUtils.equals(g.getRequestId(), campaignEx.getRequestId())) {
                        this.f22550q = next;
                    }
                }
            }
            this.f22544k = true;
            m26150a();
            if (this.f22554u != null) {
                this.f22554u.setNotchPadding(this.f22531H, this.f22527D, this.f22529F, this.f22528E, this.f22530G);
            }
        } catch (Exception e) {
            C8672v.m24878d("MBRewardVideoActivity", e.getMessage());
            m26153a("more offer to one offer exception");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m26153a(String str) {
        C8672v.m24878d("MBRewardVideoActivity", str);
        C9311h hVar = this.f22546m;
        if (hVar != null) {
            hVar.mo61309a(str);
        }
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m26150a() {
        RewardPlus rewardPlus;
        List<CampaignEx> list;
        List<CampaignEx> list2;
        int findID = findID("mbridge_temp_container");
        if (findID < 0) {
            m26153a("no id mbridge_bt_container in mbridge_more_offer_activity layout");
        }
        MBTempContainer mBTempContainer = (MBTempContainer) findViewById(findID);
        this.f22554u = mBTempContainer;
        if (mBTempContainer == null) {
            m26153a("env error");
        }
        List<CampaignEx> list3 = this.f22553t;
        if (list3 == null || list3.size() <= 0 || !this.f22553t.get(0).isDynamicView()) {
            this.f22554u.setVisibility(0);
        } else {
            new C9356b().mo62868c((View) this.f22554u, 500);
        }
        changeHalfScreenPadding(-1);
        this.f22554u.setActivity(this);
        this.f22554u.setBidCampaign(this.f22540g);
        this.f22554u.setBigOffer(this.f22544k);
        this.f22554u.setUnitId(this.f22534a);
        this.f22554u.setCampaign(this.f22551r);
        if (this.f22551r.getDynamicTempCode() == 5 && (list2 = this.f22553t) != null && list2.size() > 1) {
            View findViewById = findViewById(findID("mbridge_reward_root_container"));
            if (findViewById != null) {
                findViewById.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            }
            this.f22554u.removeAllViews();
            this.f22554u.setCampOrderViewData(this.f22553t, this.f22526C);
            this.f22554u.setCamPlayOrderCallback(this.f22532I, this.f22525B);
        }
        this.f22554u.setCampaignDownLoadTask(this.f22550q);
        this.f22554u.setIV(this.f22539f);
        CampaignEx campaignEx = this.f22551r;
        if (campaignEx == null || campaignEx.getAdSpaceT() != 2) {
            this.f22554u.setIVRewardEnable(this.f22541h, this.f22542i, this.f22543j);
        } else {
            this.f22554u.setIVRewardEnable(0, 0, 0);
        }
        this.f22554u.setMute(this.f22538e);
        CampaignEx campaignEx2 = this.f22551r;
        if (!((campaignEx2 == null || (rewardPlus = campaignEx2.getRewardPlus()) == null) && ((list = this.f22553t) == null || list.size() <= 0 || this.f22553t.get(0) == null || (rewardPlus = this.f22553t.get(0).getRewardPlus()) == null)) && !TextUtils.isEmpty(rewardPlus.getName()) && rewardPlus.getAmount() > 0) {
            C9630c cVar = new C9630c(rewardPlus.getName(), rewardPlus.getAmount());
            if (cVar.mo63527b() < 0) {
                cVar.mo63525a(1);
            }
            this.f22537d = cVar;
        }
        this.f22554u.setReward(this.f22537d);
        this.f22554u.setRewardUnitSetting(this.f22547n);
        this.f22554u.setPlacementId(this.f22535b);
        this.f22554u.setUserId(this.f22536c);
        this.f22554u.setShowRewardListener(this.f22546m);
        this.f22554u.setDeveloperExtraData(this.f22559z);
        this.f22554u.init(this);
        this.f22554u.onCreate();
        try {
            C9176a.m26122a(this.f22551r, C8388a.m23845e().mo56913g(), "showBTOld", this.f22534a, this.f22540g, "", "", 0);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private void m26158b() {
        RewardPlus rewardPlus;
        int findID = findID("mbridge_bt_container");
        if (findID < 0) {
            m26153a("no mbridge_webview_framelayout in mbridge_more_offer_activity layout");
        }
        MBridgeBTContainer mBridgeBTContainer = (MBridgeBTContainer) findViewById(findID);
        this.f22555v = mBridgeBTContainer;
        if (mBridgeBTContainer == null) {
            m26153a("env error");
        }
        this.f22555v.setVisibility(0);
        C9301a c = m26162c();
        this.f22557x = c;
        this.f22555v.setBTContainerCallback(c);
        this.f22555v.setShowRewardVideoListener(this.f22546m);
        this.f22555v.setChoiceOneCallback(this.f22533J);
        this.f22555v.setCampaigns(this.f22553t);
        this.f22555v.setCampaignDownLoadTasks(this.f22552s);
        this.f22555v.setRewardUnitSetting(this.f22547n);
        this.f22555v.setUnitId(this.f22534a);
        this.f22555v.setPlacementId(this.f22535b);
        this.f22555v.setUserId(this.f22536c);
        this.f22555v.setActivity(this);
        CampaignEx campaignEx = this.f22551r;
        if (!((campaignEx == null || (rewardPlus = campaignEx.getRewardPlus()) == null) && (this.f22553t.get(0) == null || (rewardPlus = this.f22553t.get(0).getRewardPlus()) == null)) && !TextUtils.isEmpty(rewardPlus.getName()) && rewardPlus.getAmount() > 0) {
            C9630c cVar = new C9630c(rewardPlus.getName(), rewardPlus.getAmount());
            if (cVar.mo63527b() < 0) {
                cVar.mo63525a(1);
            }
            this.f22537d = cVar;
        }
        this.f22555v.setReward(this.f22537d);
        this.f22555v.setIVRewardEnable(this.f22541h, this.f22542i, this.f22543j);
        this.f22555v.setIV(this.f22539f);
        this.f22555v.setMute(this.f22538e);
        this.f22555v.setJSFactory((C9618b) this.jsFactory);
        this.f22555v.setDeveloperExtraData(this.f22559z);
        this.f22555v.init(this);
        this.f22555v.onCreate();
        List<C9641a> list = this.f22552s;
        if (list != null && list.size() > 0) {
            try {
                C9176a.m26122a(this.f22552s.get(0).mo63640g(), C8388a.m23845e().mo56913g(), "showMoreOffer", this.f22534a, this.f22540g, "", "", 0);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    private C9301a m26162c() {
        if (this.f22557x == null) {
            this.f22557x = new C9301a() {
                /* renamed from: a */
                public final void mo61390a() {
                    if (MBRewardVideoActivity.this.f22546m != null) {
                        MBRewardVideoActivity.this.f22546m.mo61307a();
                    }
                }

                /* renamed from: a */
                public final void mo61395a(boolean z, C9630c cVar) {
                    if (MBRewardVideoActivity.this.f22546m != null) {
                        MBRewardVideoActivity.this.f22546m.mo61312a(z, cVar);
                    }
                }

                /* renamed from: a */
                public final void mo61394a(boolean z, int i) {
                    if (MBRewardVideoActivity.this.f22546m != null) {
                        MBRewardVideoActivity.this.f22546m.mo61311a(z, i);
                    }
                }

                /* renamed from: a */
                public final void mo61392a(String str) {
                    if (MBRewardVideoActivity.this.f22546m != null) {
                        MBRewardVideoActivity.this.f22546m.mo61309a(str);
                    }
                }

                /* renamed from: a */
                public final void mo61396a(boolean z, String str, String str2) {
                    if (MBRewardVideoActivity.this.f22546m != null) {
                        MBRewardVideoActivity.this.f22546m.mo61313a(z, str, str2);
                    }
                }

                /* renamed from: a */
                public final void mo61393a(String str, String str2) {
                    if (MBRewardVideoActivity.this.f22546m != null) {
                        MBRewardVideoActivity.this.f22546m.mo61310a(str, str2);
                    }
                }

                /* renamed from: b */
                public final void mo61397b(String str, String str2) {
                    if (MBRewardVideoActivity.this.f22546m != null) {
                        MBRewardVideoActivity.this.f22546m.mo61314b(str, str2);
                    }
                }

                /* renamed from: a */
                public final void mo61391a(int i, String str, String str2) {
                    if (MBRewardVideoActivity.this.f22546m != null) {
                        MBRewardVideoActivity.this.f22546m.mo61308a(i, str, str2);
                    }
                }
            };
        }
        return this.f22557x;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int m26145a(int i, int i2) {
        List<CampaignEx> list = this.f22553t;
        if (list == null || list.size() == 0) {
            return i;
        }
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < this.f22553t.size(); i5++) {
            if (this.f22553t.get(0) != null) {
                if (i5 == 0) {
                    i4 = this.f22553t.get(0).getVideoCompleteTime();
                }
                i3 += this.f22553t.get(i5).getVideoLength();
            }
        }
        if (i2 == 1) {
            if (i == 0) {
                if (i3 >= 45) {
                    return 45;
                }
            } else if (i3 > i) {
                if (i > 45) {
                    return 45;
                }
                return i;
            }
            return i3;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < i2 - 1; i7++) {
            if (this.f22553t.get(i7) != null) {
                i6 += this.f22553t.get(i7).getVideoLength();
            }
        }
        if (i4 > i6) {
            return i4 - i6;
        }
        return 0;
    }

    public void onResume() {
        super.onResume();
        if (!C2470b.f5205c) {
            C8388a.m23845e().mo56898a((Context) this);
            C8498b.m24359a().execute(new Runnable() {
                public final void run() {
                    if (MBRewardVideoActivity.this.f22552s != null && MBRewardVideoActivity.this.f22552s.size() > 0) {
                        for (C9641a aVar : MBRewardVideoActivity.this.f22552s) {
                            if (!(aVar == null || aVar.mo63640g() == null)) {
                                C9627a.m27316a().mo63510a(aVar.mo63640g(), MBRewardVideoActivity.this.f22534a);
                            }
                        }
                    }
                }
            });
            MBTempContainer mBTempContainer = this.f22554u;
            if (mBTempContainer != null) {
                mBTempContainer.onResume();
            }
            MBridgeBTContainer mBridgeBTContainer = this.f22555v;
            if (mBridgeBTContainer != null) {
                mBridgeBTContainer.onResume();
            }
        }
    }

    public void onPause() {
        super.onPause();
        MBTempContainer mBTempContainer = this.f22554u;
        if (mBTempContainer != null) {
            mBTempContainer.onPause();
        }
        MBridgeBTContainer mBridgeBTContainer = this.f22555v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onPause();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f22554u != null) {
            changeHalfScreenPadding(configuration.orientation);
            this.f22554u.onConfigurationChanged(configuration);
        }
        MBridgeBTContainer mBridgeBTContainer = this.f22555v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onConfigurationChanged(configuration);
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        MBTempContainer mBTempContainer = this.f22554u;
        if (mBTempContainer != null) {
            mBTempContainer.onBackPressed();
        }
        MBridgeBTContainer mBridgeBTContainer = this.f22555v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        MBridgeConstans.isRewardActivityShowing = false;
        super.onStop();
        MBTempContainer mBTempContainer = this.f22554u;
        if (mBTempContainer != null) {
            mBTempContainer.onStop();
        }
        MBridgeBTContainer mBridgeBTContainer = this.f22555v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onStop();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C9499b.m27026a(this.f22534a);
        try {
            if (this.f22553t != null && this.f22553t.size() > 0) {
                for (CampaignEx b : this.f22553t) {
                    m26159b(b);
                }
            }
            if (this.f22551r != null) {
                m26159b(this.f22551r);
            }
        } catch (Throwable th) {
            C8672v.m24878d("MBRewardVideoActivity", th.getMessage());
        }
        MBTempContainer mBTempContainer = this.f22554u;
        if (mBTempContainer != null) {
            mBTempContainer.onDestroy();
            this.f22554u = null;
        }
        MBridgeBTContainer mBridgeBTContainer = this.f22555v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onDestroy();
            this.f22555v = null;
        }
        C2470b a = C2470b.m6168a();
        a.mo16429c(this.f22534a + "_" + 1);
        C2470b a2 = C2470b.m6168a();
        a2.mo16429c(this.f22534a + "_" + 2);
        C8498b.m24359a().execute(new C9190a(this.f22552s, this.f22534a, this.f22558y));
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        MBTempContainer mBTempContainer = this.f22554u;
        if (mBTempContainer != null) {
            mBTempContainer.onRestart();
        }
        MBridgeBTContainer mBridgeBTContainer = this.f22555v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onRestart();
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (!C2470b.f5205c) {
            new C2462a() {
                /* renamed from: a */
                public final void mo16392a() {
                    MBRewardVideoActivity.this.onPause();
                }

                /* renamed from: b */
                public final void mo16394b() {
                    MBRewardVideoActivity.this.onResume();
                }

                /* renamed from: a */
                public final void mo16393a(String str) {
                    MBRewardVideoActivity.this.onResume();
                }
            };
            MBTempContainer mBTempContainer = this.f22554u;
            if (mBTempContainer != null) {
                mBTempContainer.onStart();
                this.f22551r.setCampaignUnitId(this.f22534a);
                C2470b a = C2470b.m6168a();
                a.mo16423a(this.f22534a + "_" + 1, this.f22551r);
            }
            MBridgeBTContainer mBridgeBTContainer = this.f22555v;
            if (mBridgeBTContainer != null) {
                mBridgeBTContainer.onStart();
                List<CampaignEx> list = this.f22553t;
                if (list != null && list.size() > 0) {
                    CampaignEx campaignEx = this.f22553t.get(0);
                    campaignEx.setCampaignUnitId(this.f22534a);
                    C2470b a2 = C2470b.m6168a();
                    a2.mo16423a(this.f22534a + "_" + 1, campaignEx);
                }
            }
            if (!this.f22524A) {
                C2470b a3 = C2470b.m6168a();
                a3.mo16430c(this.f22534a + "_" + 1, 1);
                C2470b a4 = C2470b.m6168a();
                a4.mo16429c(this.f22534a + "_" + 2);
                this.f22524A = true;
            }
        }
    }

    /* renamed from: com.mbridge.msdk.reward.player.MBRewardVideoActivity$a */
    private static final class C9190a implements Runnable {

        /* renamed from: a */
        private final List<C9641a> f22565a;

        /* renamed from: b */
        private final String f22566b;

        /* renamed from: c */
        private final String f22567c;

        public C9190a(List<C9641a> list, String str, String str2) {
            this.f22565a = list;
            this.f22566b = str;
            this.f22567c = str2;
        }

        public final void run() {
            try {
                if (this.f22565a != null && this.f22565a.size() > 0) {
                    for (C9641a next : this.f22565a) {
                        if (!(next == null || next.mo63640g() == null)) {
                            CampaignEx g = next.mo63640g();
                            String str = g.getRequestId() + g.getId() + g.getVideoUrlEncode();
                            C9670k c = C9645c.getInstance().mo63662c(this.f22566b);
                            if (c != null) {
                                try {
                                    c.mo63697b(str);
                                } catch (Exception unused) {
                                }
                            }
                            if (g != null) {
                                if (g.getRewardTemplateMode() != null) {
                                    if (!TextUtils.isEmpty(g.getRewardTemplateMode().mo57576e())) {
                                        C9625a.m27306b(this.f22566b + "_" + g.getId() + "_" + this.f22567c + "_" + g.getRewardTemplateMode().mo57576e());
                                        C9625a.m27304b(g.getAdType(), g);
                                    }
                                    if (!TextUtils.isEmpty(g.getCMPTEntryUrl())) {
                                        C9625a.m27306b(this.f22566b + "_" + this.f22567c + "_" + g.getCMPTEntryUrl());
                                    }
                                    C9627a.m27316a().mo63509a(g);
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                C8672v.m24874a("MBRewardVideoActivity", e.getMessage());
            }
        }
    }

    public void finish() {
        super.finish();
        C8388a.m23845e().mo56897a(0);
        MBTempContainer mBTempContainer = this.f22554u;
        if (mBTempContainer != null) {
            mBTempContainer.onDestroy();
            this.f22554u = null;
        }
        MBridgeBTContainer mBridgeBTContainer = this.f22555v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onDestroy();
            this.f22555v = null;
        }
        C2470b.m6168a().mo16429c(this.f22534a);
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean(SAVE_STATE_KEY_REPORT, this.f22549p);
        super.onSaveInstanceState(bundle);
    }

    public void setTopControllerPadding(int i, int i2, int i3, int i4, int i5) {
        this.f22527D = i2;
        this.f22529F = i3;
        this.f22528E = i4;
        this.f22530G = i5;
        this.f22531H = i;
        MBTempContainer mBTempContainer = this.f22554u;
        if (mBTempContainer != null) {
            mBTempContainer.setNotchPadding(i, i2, i3, i4, i5);
        }
        MBridgeBTContainer mBridgeBTContainer = this.f22555v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.setNotchPadding(i, i2, i3, i4, i5);
        }
        C9313a.f22859e = i;
        C9313a.f22855a = i2;
        C9313a.f22856b = i3;
        C9313a.f22857c = i4;
        C9313a.f22858d = i5;
    }

    public int findID(String str) {
        return C8658p.m24799a(getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return C8658p.m24799a(getApplicationContext(), str, "layout");
    }

    public void changeHalfScreenPadding(int i) {
        try {
            if (this.f22551r != null && this.f22551r.getAdSpaceT() == 2) {
                getWindow().getDecorView().setBackground(new ColorDrawable(0));
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f22554u.getLayoutParams();
                int b = C8677z.m24924b((Context) this, 58.0f);
                int b2 = C8677z.m24924b((Context) this, 104.0f);
                if (this.f22551r.getRewardTemplateMode().mo57574c() == 0) {
                    if (i == 2) {
                        layoutParams.setMargins(b2, b, b2, b);
                    } else {
                        layoutParams.setMargins(b, b2, b, b2);
                    }
                } else if (this.f22551r.getRewardTemplateMode().mo57574c() == 2) {
                    layoutParams.setMargins(b2, b, b2, b);
                } else {
                    layoutParams.setMargins(b, b2, b, b2);
                }
                this.f22554u.setLayoutParams(layoutParams);
            }
        } catch (Throwable th) {
            C8672v.m24878d("MBRewardVideoActivity", th.getMessage());
        }
    }

    /* renamed from: b */
    private void m26159b(CampaignEx campaignEx) {
        if (campaignEx != null) {
            if (!TextUtils.isEmpty(campaignEx.getImageUrl())) {
                C8481b.m24310a(C8388a.m23845e().mo56913g()).mo57886c(campaignEx.getImageUrl());
            }
            if (!TextUtils.isEmpty(campaignEx.getIconUrl())) {
                C8481b.m24310a(C8388a.m23845e().mo56913g()).mo57886c(campaignEx.getIconUrl());
            }
        }
    }

    public void setTheme(int i) {
        super.setTheme(C8658p.m24799a(this, "mbridge_transparent_theme", "style"));
    }

    /* renamed from: com.mbridge.msdk.reward.player.MBRewardVideoActivity$b */
    private static final class C9191b implements Runnable {

        /* renamed from: a */
        private final CampaignEx f22568a;

        /* renamed from: b */
        private final String f22569b;

        /* renamed from: c */
        private final int f22570c;

        public C9191b(CampaignEx campaignEx, String str, int i) {
            this.f22568a = campaignEx;
            this.f22569b = str;
            this.f22570c = i;
        }

        public final void run() {
            if (this.f22568a != null && !TextUtils.isEmpty(this.f22569b)) {
                try {
                    String mof_template_url = this.f22568a.getMof_template_url();
                    String str = "";
                    if (!TextUtils.isEmpty(mof_template_url)) {
                        str = C8617ae.m24720a(mof_template_url, "cltp");
                    }
                    C9497a.m27014a(this.f22569b, this.f22568a, this.f22570c, str);
                } catch (Exception unused) {
                }
            }
        }
    }
}
