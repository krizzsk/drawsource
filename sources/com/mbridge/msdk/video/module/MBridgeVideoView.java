package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.InteractionType;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.mbridge.msdk.click.C6765a;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeSegmentsProgressBar;
import com.mbridge.msdk.dycreator.baseview.cusview.SoundImageView;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p085b.C2470b;
import com.mbridge.msdk.foundation.same.C8469a;
import com.mbridge.msdk.foundation.same.p302c.C8481b;
import com.mbridge.msdk.foundation.same.p302c.C8484c;
import com.mbridge.msdk.foundation.same.report.C8598e;
import com.mbridge.msdk.foundation.tools.C8616ad;
import com.mbridge.msdk.foundation.tools.C8617ae;
import com.mbridge.msdk.foundation.tools.C8658p;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener;
import com.mbridge.msdk.playercommon.PlayerView;
import com.mbridge.msdk.video.dynview.C9312a;
import com.mbridge.msdk.video.dynview.C9314b;
import com.mbridge.msdk.video.dynview.C9317c;
import com.mbridge.msdk.video.dynview.moffer.C9391a;
import com.mbridge.msdk.video.dynview.p353c.C9321a;
import com.mbridge.msdk.video.dynview.p354d.C9322a;
import com.mbridge.msdk.video.dynview.p354d.C9328g;
import com.mbridge.msdk.video.dynview.p361i.C9363a;
import com.mbridge.msdk.video.dynview.p361i.C9365b;
import com.mbridge.msdk.video.dynview.p365j.C9382c;
import com.mbridge.msdk.video.dynview.widget.MBridgeBaitClickView;
import com.mbridge.msdk.video.module.p367a.C9473a;
import com.mbridge.msdk.video.module.p367a.p368a.C9483i;
import com.mbridge.msdk.video.signal.C9621i;
import com.mbridge.msdk.video.signal.factory.C9618b;
import com.mbridge.msdk.videocommon.p375d.C9638b;
import com.mbridge.msdk.videocommon.p375d.C9640c;
import com.mbridge.msdk.widget.C9676a;
import com.mbridge.msdk.widget.FeedBackButton;
import com.mbridge.msdk.widget.dialog.C9682a;
import com.mbridge.msdk.widget.dialog.MBAlertDialog;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

public class MBridgeVideoView extends MBridgeBaseView implements C9621i {
    /* access modifiers changed from: private */

    /* renamed from: ai */
    public static boolean f23384ai = false;

    /* renamed from: n */
    private static int f23385n;

    /* renamed from: o */
    private static int f23386o;

    /* renamed from: p */
    private static int f23387p;

    /* renamed from: q */
    private static int f23388q;

    /* renamed from: r */
    private static int f23389r;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public MBridgeSegmentsProgressBar f23390A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public C9473a f23391B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C9322a f23392C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public int f23393D = 0;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public boolean f23394E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public FrameLayout f23395F;

    /* renamed from: G */
    private MBridgeClickCTAView f23396G;

    /* renamed from: H */
    private C9618b f23397H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public int f23398I;

    /* renamed from: J */
    private RelativeLayout f23399J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public boolean f23400K = false;

    /* renamed from: L */
    private String f23401L;

    /* renamed from: M */
    private int f23402M;

    /* renamed from: N */
    private int f23403N;

    /* renamed from: O */
    private int f23404O;

    /* renamed from: P */
    private MBAlertDialog f23405P;

    /* renamed from: Q */
    private C9682a f23406Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public String f23407R = "";

    /* renamed from: S */
    private double f23408S;

    /* renamed from: T */
    private double f23409T;

    /* renamed from: U */
    private boolean f23410U = false;

    /* renamed from: V */
    private boolean f23411V = false;

    /* renamed from: W */
    private boolean f23412W = false;

    /* renamed from: aA */
    private C9472b f23413aA = new C9472b(this);

    /* renamed from: aB */
    private boolean f23414aB = false;

    /* renamed from: aC */
    private Runnable f23415aC = new Runnable() {
        public final void run() {
            if (MBridgeVideoView.this.f23395F != null) {
                MBridgeVideoView.this.f23395F.setVisibility(8);
            }
        }
    };

    /* renamed from: aa */
    private boolean f23416aa = false;

    /* renamed from: ab */
    private boolean f23417ab = false;

    /* renamed from: ac */
    private boolean f23418ac = false;

    /* renamed from: ad */
    private boolean f23419ad = false;
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public boolean f23420ae = false;

    /* renamed from: af */
    private boolean f23421af = false;

    /* renamed from: ag */
    private int f23422ag;
    /* access modifiers changed from: private */

    /* renamed from: ah */
    public boolean f23423ah = false;

    /* renamed from: aj */
    private int f23424aj = 2;

    /* renamed from: ak */
    private AdSession f23425ak;
    /* access modifiers changed from: private */

    /* renamed from: al */
    public MediaEvents f23426al;
    /* access modifiers changed from: private */

    /* renamed from: am */
    public String f23427am;
    /* access modifiers changed from: private */

    /* renamed from: an */
    public int f23428an;

    /* renamed from: ao */
    private int f23429ao;

    /* renamed from: ap */
    private int f23430ap;
    /* access modifiers changed from: private */

    /* renamed from: aq */
    public boolean f23431aq = false;
    /* access modifiers changed from: private */

    /* renamed from: ar */
    public boolean f23432ar = false;
    /* access modifiers changed from: private */

    /* renamed from: as */
    public boolean f23433as = false;
    /* access modifiers changed from: private */

    /* renamed from: at */
    public boolean f23434at = true;
    /* access modifiers changed from: private */

    /* renamed from: au */
    public boolean f23435au = false;
    /* access modifiers changed from: private */

    /* renamed from: av */
    public boolean f23436av = false;
    /* access modifiers changed from: private */

    /* renamed from: aw */
    public boolean f23437aw = false;
    /* access modifiers changed from: private */

    /* renamed from: ax */
    public boolean f23438ax = false;
    /* access modifiers changed from: private */

    /* renamed from: ay */
    public AlphaAnimation f23439ay;

    /* renamed from: az */
    private MBridgeBaitClickView f23440az;
    public List<CampaignEx> mCampOrderViewData;
    public int mCampaignSize = 1;
    public int mCurrPlayNum = 1;
    public int mCurrentPlayProgressTime = 0;
    public int mMuteSwitch = 0;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public PlayerView f23441s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public SoundImageView f23442t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public TextView f23443u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public View f23444v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public RelativeLayout f23445w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public ImageView f23446x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public ProgressBar f23447y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public FeedBackButton f23448z;

    public void init(Context context) {
    }

    public void setContainerViewOnNotifyListener(C9473a aVar) {
        this.f23391B = aVar;
    }

    public void setCamPlayOrderCallback(C9322a aVar, List<CampaignEx> list, int i, int i2) {
        MBridgeSegmentsProgressBar mBridgeSegmentsProgressBar;
        this.f23392C = aVar;
        this.mCampaignSize = list.size();
        this.mCurrPlayNum = i;
        this.f23393D = i2;
        this.mCampOrderViewData = list;
        if (this.f23196b != null && this.f23196b.getDynamicTempCode() == 5 && (mBridgeSegmentsProgressBar = this.f23390A) != null && this.mCampOrderViewData != null) {
            if (this.mCampaignSize > 1) {
                mBridgeSegmentsProgressBar.setVisibility(0);
                this.f23390A.init(this.mCampaignSize, 2);
                for (int i3 = 0; i3 < this.mCampOrderViewData.size(); i3++) {
                    int videoPlayProgress = this.mCampOrderViewData.get(i3).getVideoPlayProgress();
                    if (videoPlayProgress > 0) {
                        this.f23390A.setProgress(videoPlayProgress, i3);
                    }
                }
                return;
            }
            mBridgeSegmentsProgressBar.setVisibility(8);
        }
    }

    public boolean isShowingAlertView() {
        return this.f23400K;
    }

    public void setUnitId(String str) {
        this.f23407R = str;
        C9472b bVar = this.f23413aA;
        if (bVar != null) {
            bVar.mo63202a(str);
        }
    }

    public String getUnitId() {
        return this.f23407R;
    }

    public boolean isMiniCardShowing() {
        return this.f23416aa;
    }

    public boolean isShowingTransparent() {
        return this.f23421af;
    }

    public void setShowingTransparent(boolean z) {
        this.f23421af = z;
    }

    public MBridgeVideoView(Context context) {
        super(context);
    }

    public MBridgeVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setVideoLayout(CampaignEx campaignEx) {
        if (campaignEx != null) {
            this.f23196b = campaignEx;
            this.f23203i = campaignEx.isDynamicView();
        }
        if (this.f23203i) {
            final C9317c a = new C9382c().mo62905a((View) this, campaignEx);
            C9314b.m26503a().mo62742a(a, new C9328g() {
                /* renamed from: a */
                public final void mo62659a(C9312a aVar) {
                    if (aVar != null) {
                        if (!(this == null || aVar.mo62736a() == null)) {
                            aVar.mo62736a().setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                            this.addView(aVar.mo62736a());
                        }
                        if (aVar.mo62740b() != null) {
                            for (View onClickListener : aVar.mo62740b()) {
                                onClickListener.setOnClickListener(new C9676a() {
                                    /* access modifiers changed from: protected */
                                    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ab A[SYNTHETIC, Splitter:B:24:0x00ab] */
                                    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
                                    /* renamed from: a */
                                    /* Code decompiled incorrectly, please refer to instructions dump. */
                                    public final void mo58499a(android.view.View r10) {
                                        /*
                                            r9 = this;
                                            com.mbridge.msdk.video.module.MBridgeVideoView$1 r10 = com.mbridge.msdk.video.module.MBridgeVideoView.C94591.this
                                            com.mbridge.msdk.video.module.MBridgeVideoView r10 = com.mbridge.msdk.video.module.MBridgeVideoView.this
                                            com.mbridge.msdk.video.module.a.a r10 = r10.f23391B
                                            if (r10 == 0) goto L_0x00cb
                                            com.mbridge.msdk.video.module.MBridgeVideoView$1 r10 = com.mbridge.msdk.video.module.MBridgeVideoView.C94591.this
                                            com.mbridge.msdk.video.module.MBridgeVideoView r10 = com.mbridge.msdk.video.module.MBridgeVideoView.this
                                            com.mbridge.msdk.foundation.entity.CampaignEx r10 = r10.f23196b
                                            if (r10 == 0) goto L_0x0076
                                            com.mbridge.msdk.video.module.MBridgeVideoView$1 r10 = com.mbridge.msdk.video.module.MBridgeVideoView.C94591.this     // Catch:{ Exception -> 0x0072 }
                                            com.mbridge.msdk.video.module.MBridgeVideoView r10 = com.mbridge.msdk.video.module.MBridgeVideoView.this     // Catch:{ Exception -> 0x0072 }
                                            com.mbridge.msdk.foundation.entity.CampaignEx r10 = r10.f23196b     // Catch:{ Exception -> 0x0072 }
                                            com.mbridge.msdk.foundation.entity.CampaignEx$c r10 = r10.getRewardTemplateMode()     // Catch:{ Exception -> 0x0072 }
                                            java.lang.String r0 = ""
                                            if (r10 == 0) goto L_0x0033
                                            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0072 }
                                            r1.<init>()     // Catch:{ Exception -> 0x0072 }
                                            int r10 = r10.mo57573b()     // Catch:{ Exception -> 0x0072 }
                                            r1.append(r10)     // Catch:{ Exception -> 0x0072 }
                                            r1.append(r0)     // Catch:{ Exception -> 0x0072 }
                                            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0072 }
                                        L_0x0033:
                                            r7 = r0
                                            com.mbridge.msdk.video.module.MBridgeVideoView$1 r10 = com.mbridge.msdk.video.module.MBridgeVideoView.C94591.this     // Catch:{ Exception -> 0x0072 }
                                            com.mbridge.msdk.video.module.MBridgeVideoView r10 = com.mbridge.msdk.video.module.MBridgeVideoView.this     // Catch:{ Exception -> 0x0072 }
                                            android.content.Context r0 = r10.f23195a     // Catch:{ Exception -> 0x0072 }
                                            java.lang.String r1 = "video_play_click"
                                            com.mbridge.msdk.video.module.MBridgeVideoView$1 r10 = com.mbridge.msdk.video.module.MBridgeVideoView.C94591.this     // Catch:{ Exception -> 0x0072 }
                                            com.mbridge.msdk.video.module.MBridgeVideoView r10 = com.mbridge.msdk.video.module.MBridgeVideoView.this     // Catch:{ Exception -> 0x0072 }
                                            com.mbridge.msdk.foundation.entity.CampaignEx r10 = r10.f23196b     // Catch:{ Exception -> 0x0072 }
                                            java.lang.String r2 = r10.getCampaignUnitId()     // Catch:{ Exception -> 0x0072 }
                                            com.mbridge.msdk.video.module.MBridgeVideoView$1 r10 = com.mbridge.msdk.video.module.MBridgeVideoView.C94591.this     // Catch:{ Exception -> 0x0072 }
                                            com.mbridge.msdk.video.module.MBridgeVideoView r10 = com.mbridge.msdk.video.module.MBridgeVideoView.this     // Catch:{ Exception -> 0x0072 }
                                            com.mbridge.msdk.foundation.entity.CampaignEx r10 = r10.f23196b     // Catch:{ Exception -> 0x0072 }
                                            boolean r3 = r10.isBidCampaign()     // Catch:{ Exception -> 0x0072 }
                                            com.mbridge.msdk.video.module.MBridgeVideoView$1 r10 = com.mbridge.msdk.video.module.MBridgeVideoView.C94591.this     // Catch:{ Exception -> 0x0072 }
                                            com.mbridge.msdk.video.module.MBridgeVideoView r10 = com.mbridge.msdk.video.module.MBridgeVideoView.this     // Catch:{ Exception -> 0x0072 }
                                            com.mbridge.msdk.foundation.entity.CampaignEx r10 = r10.f23196b     // Catch:{ Exception -> 0x0072 }
                                            java.lang.String r4 = r10.getRequestId()     // Catch:{ Exception -> 0x0072 }
                                            com.mbridge.msdk.video.module.MBridgeVideoView$1 r10 = com.mbridge.msdk.video.module.MBridgeVideoView.C94591.this     // Catch:{ Exception -> 0x0072 }
                                            com.mbridge.msdk.video.module.MBridgeVideoView r10 = com.mbridge.msdk.video.module.MBridgeVideoView.this     // Catch:{ Exception -> 0x0072 }
                                            com.mbridge.msdk.foundation.entity.CampaignEx r10 = r10.f23196b     // Catch:{ Exception -> 0x0072 }
                                            java.lang.String r5 = r10.getRequestIdNotice()     // Catch:{ Exception -> 0x0072 }
                                            com.mbridge.msdk.video.module.MBridgeVideoView$1 r10 = com.mbridge.msdk.video.module.MBridgeVideoView.C94591.this     // Catch:{ Exception -> 0x0072 }
                                            com.mbridge.msdk.video.module.MBridgeVideoView r10 = com.mbridge.msdk.video.module.MBridgeVideoView.this     // Catch:{ Exception -> 0x0072 }
                                            com.mbridge.msdk.foundation.entity.CampaignEx r10 = r10.f23196b     // Catch:{ Exception -> 0x0072 }
                                            java.lang.String r6 = r10.getId()     // Catch:{ Exception -> 0x0072 }
                                            com.mbridge.msdk.foundation.same.report.C8598e.m24675a((android.content.Context) r0, (java.lang.String) r1, (java.lang.String) r2, (boolean) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7)     // Catch:{ Exception -> 0x0072 }
                                            goto L_0x0076
                                        L_0x0072:
                                            r10 = move-exception
                                            r10.printStackTrace()
                                        L_0x0076:
                                            r10 = 0
                                            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x008d }
                                            r0.<init>()     // Catch:{ JSONException -> 0x008d }
                                            java.lang.String r10 = com.mbridge.msdk.foundation.same.C8469a.f20746g     // Catch:{ JSONException -> 0x008b }
                                            com.mbridge.msdk.video.module.MBridgeVideoView$1 r1 = com.mbridge.msdk.video.module.MBridgeVideoView.C94591.this     // Catch:{ JSONException -> 0x008b }
                                            com.mbridge.msdk.video.module.MBridgeVideoView r1 = com.mbridge.msdk.video.module.MBridgeVideoView.this     // Catch:{ JSONException -> 0x008b }
                                            r2 = 0
                                            org.json.JSONObject r1 = r1.mo62972a(r2)     // Catch:{ JSONException -> 0x008b }
                                            r0.put(r10, r1)     // Catch:{ JSONException -> 0x008b }
                                            goto L_0x0094
                                        L_0x008b:
                                            r10 = move-exception
                                            goto L_0x0091
                                        L_0x008d:
                                            r0 = move-exception
                                            r8 = r0
                                            r0 = r10
                                            r10 = r8
                                        L_0x0091:
                                            r10.printStackTrace()
                                        L_0x0094:
                                            com.mbridge.msdk.video.module.MBridgeVideoView$1 r10 = com.mbridge.msdk.video.module.MBridgeVideoView.C94591.this
                                            com.mbridge.msdk.video.module.MBridgeVideoView r10 = com.mbridge.msdk.video.module.MBridgeVideoView.this
                                            com.mbridge.msdk.video.module.a.a r10 = r10.f23391B
                                            r1 = 105(0x69, float:1.47E-43)
                                            r10.mo62631a(r1, r0)
                                            com.mbridge.msdk.foundation.controller.a r10 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
                                            android.content.Context r10 = r10.mo56913g()
                                            if (r10 == 0) goto L_0x00cb
                                            com.mbridge.msdk.foundation.controller.a r10 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x00c1 }
                                            android.content.Context r10 = r10.mo56913g()     // Catch:{ Exception -> 0x00c1 }
                                            android.content.Context r10 = r10.getApplicationContext()     // Catch:{ Exception -> 0x00c1 }
                                            com.mbridge.msdk.video.module.MBridgeVideoView$1 r0 = com.mbridge.msdk.video.module.MBridgeVideoView.C94591.this     // Catch:{ Exception -> 0x00c1 }
                                            com.mbridge.msdk.video.module.MBridgeVideoView r0 = com.mbridge.msdk.video.module.MBridgeVideoView.this     // Catch:{ Exception -> 0x00c1 }
                                            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r0.f23196b     // Catch:{ Exception -> 0x00c1 }
                                            com.mbridge.msdk.video.module.p369b.C9499b.m27030d(r10, r0)     // Catch:{ Exception -> 0x00c1 }
                                            goto L_0x00cb
                                        L_0x00c1:
                                            r10 = move-exception
                                            java.lang.String r10 = r10.getMessage()
                                            java.lang.String r0 = "MBridgeBaseView"
                                            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r0, r10)
                                        L_0x00cb:
                                            return
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeVideoView.C94591.C94601.mo58499a(android.view.View):void");
                                    }
                                });
                            }
                        }
                        boolean unused = MBridgeVideoView.this.f23438ax = aVar.mo62741c();
                        MBridgeVideoView.this.m26917a();
                        boolean unused2 = MBridgeVideoView.f23384ai = false;
                        int unused3 = MBridgeVideoView.this.f23398I = a.mo62754j();
                    }
                }

                /* renamed from: a */
                public final void mo62660a(C9321a aVar) {
                    C8672v.m24878d(MBridgeBaseView.TAG, "errorMsg：" + aVar.mo62772b());
                }
            });
            return;
        }
        int findLayout = findLayout("mbridge_reward_videoview_item");
        if (findLayout > 0) {
            this.f23197c.inflate(findLayout, this);
            m26917a();
        }
        f23384ai = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m26917a() {
        this.f23200f = m26929e();
        if (!this.f23200f) {
            C8672v.m24878d(MBridgeBaseView.TAG, "MBridgeVideoView init fail");
        }
        mo62973c();
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
        this.f23439ay = alphaAnimation;
        alphaAnimation.setDuration(200);
    }

    public void setIsIV(boolean z) {
        this.f23423ah = z;
        C9472b bVar = this.f23413aA;
        if (bVar != null) {
            bVar.mo63203a(z);
        }
    }

    public void setCampaign(CampaignEx campaignEx) {
        int i;
        super.setCampaign(campaignEx);
        C9472b bVar = this.f23413aA;
        if (bVar != null) {
            bVar.mo63201a(campaignEx);
            C9472b bVar2 = this.f23413aA;
            if (campaignEx == null) {
                i = C9638b.m27377a().mo63551a(C8388a.m23845e().mo56914h(), this.f23407R, false).mo63598p();
            } else if (campaignEx.getReady_rate() != -1) {
                i = campaignEx.getReady_rate();
            } else {
                i = C9638b.m27377a().mo63551a(C8388a.m23845e().mo56914h(), this.f23407R, false).mo63598p();
            }
            bVar2.mo63200a(i, C9638b.m27377a().mo63551a(C8388a.m23845e().mo56914h(), this.f23407R, false).mo63600q());
        }
    }

    public void setSoundState(int i) {
        this.f23424aj = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo62973c() {
        super.mo62973c();
        if (this.f23200f) {
            if (!this.f23203i) {
                this.f23441s.setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                        if (MBridgeVideoView.this.f23199e != null) {
                            MBridgeVideoView.this.f23199e.mo62631a(1, "");
                        }
                    }
                });
            } else if (C9365b.m26701a(this.f23196b) == -1 || C9365b.m26701a(this.f23196b) == 100) {
                this.f23441s.setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                        if (MBridgeVideoView.this.f23199e != null) {
                            MBridgeVideoView.this.f23199e.mo62631a(1, "");
                        }
                        if (MBridgeVideoView.this.f23426al != null) {
                            MBridgeVideoView.this.f23426al.adUserInteraction(InteractionType.CLICK);
                        }
                        MBridgeVideoView.this.setCTALayoutVisibleOrGone();
                    }
                });
            }
            SoundImageView soundImageView = this.f23442t;
            if (soundImageView != null) {
                soundImageView.setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                        Integer num = 2;
                        if (MBridgeVideoView.this.f23441s != null && MBridgeVideoView.this.f23441s.isSilent()) {
                            num = 1;
                        }
                        if (num.intValue() == 1) {
                            MBridgeVideoView.this.mMuteSwitch = 2;
                        } else {
                            MBridgeVideoView.this.mMuteSwitch = 1;
                        }
                        if (MBridgeVideoView.this.f23199e != null) {
                            MBridgeVideoView.this.f23199e.mo62631a(5, num);
                        }
                    }
                });
            }
            this.f23444v.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    if (MBridgeVideoView.this.f23423ah) {
                        boolean unused = MBridgeVideoView.this.f23437aw = true;
                        if (MBridgeVideoView.this.f23434at) {
                            MBridgeVideoView.this.m26922b();
                        } else if (MBridgeVideoView.this.f23199e != null) {
                            MBridgeVideoView.this.f23199e.mo62631a(123, "");
                        }
                    } else {
                        MBridgeVideoView.this.m26922b();
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0119, code lost:
        if (r4 < r0) goto L_0x011b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x012e A[Catch:{ Exception -> 0x014f }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x013b A[Catch:{ Exception -> 0x014f }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m26922b() {
        /*
            r9 = this;
            boolean r0 = r9.f23423ah     // Catch:{ Exception -> 0x014f }
            r1 = 8
            java.lang.String r2 = ""
            r3 = 2
            if (r0 == 0) goto L_0x00eb
            int r0 = r9.f23428an     // Catch:{ Exception -> 0x014f }
            int r4 = com.mbridge.msdk.foundation.same.C8469a.f20753n     // Catch:{ Exception -> 0x014f }
            if (r0 == r4) goto L_0x0015
            int r0 = r9.f23428an     // Catch:{ Exception -> 0x014f }
            int r4 = com.mbridge.msdk.foundation.same.C8469a.f20754o     // Catch:{ Exception -> 0x014f }
            if (r0 != r4) goto L_0x00eb
        L_0x0015:
            boolean r0 = r9.f23431aq     // Catch:{ Exception -> 0x014f }
            if (r0 == 0) goto L_0x002f
            int r0 = r9.f23428an     // Catch:{ Exception -> 0x014f }
            int r1 = com.mbridge.msdk.foundation.same.C8469a.f20754o     // Catch:{ Exception -> 0x014f }
            if (r0 != r1) goto L_0x002e
            com.mbridge.msdk.video.module.a.a r0 = r9.f23199e     // Catch:{ Exception -> 0x014f }
            if (r0 == 0) goto L_0x002e
            com.mbridge.msdk.video.module.a.a r0 = r9.f23199e     // Catch:{ Exception -> 0x014f }
            boolean r1 = r9.f23435au     // Catch:{ Exception -> 0x014f }
            java.lang.String r1 = r9.m26921b((boolean) r1)     // Catch:{ Exception -> 0x014f }
            r0.mo62631a(r3, r1)     // Catch:{ Exception -> 0x014f }
        L_0x002e:
            return
        L_0x002f:
            int r0 = r9.f23428an     // Catch:{ Exception -> 0x014f }
            int r4 = com.mbridge.msdk.foundation.same.C8469a.f20754o     // Catch:{ Exception -> 0x014f }
            if (r0 != r4) goto L_0x0049
            boolean r0 = r9.f23437aw     // Catch:{ Exception -> 0x014f }
            if (r0 == 0) goto L_0x0049
            com.mbridge.msdk.video.module.a.a r0 = r9.f23199e     // Catch:{ Exception -> 0x014f }
            if (r0 == 0) goto L_0x0048
            com.mbridge.msdk.video.module.a.a r0 = r9.f23199e     // Catch:{ Exception -> 0x014f }
            boolean r1 = r9.f23435au     // Catch:{ Exception -> 0x014f }
            java.lang.String r1 = r9.m26921b((boolean) r1)     // Catch:{ Exception -> 0x014f }
            r0.mo62631a(r3, r1)     // Catch:{ Exception -> 0x014f }
        L_0x0048:
            return
        L_0x0049:
            boolean r0 = r9.f23434at     // Catch:{ Exception -> 0x014f }
            if (r0 == 0) goto L_0x00ea
            com.mbridge.msdk.playercommon.PlayerView r0 = r9.f23441s     // Catch:{ Exception -> 0x014f }
            int r0 = r0.getCurPosition()     // Catch:{ Exception -> 0x014f }
            int r0 = r0 / 1000
            com.mbridge.msdk.playercommon.PlayerView r4 = r9.f23441s     // Catch:{ Exception -> 0x014f }
            int r4 = r4.getDuration()     // Catch:{ Exception -> 0x014f }
            if (r4 != 0) goto L_0x0064
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r9.f23196b     // Catch:{ Exception -> 0x014f }
            int r4 = r4.getVideoLength()     // Catch:{ Exception -> 0x014f }
            goto L_0x006a
        L_0x0064:
            com.mbridge.msdk.playercommon.PlayerView r4 = r9.f23441s     // Catch:{ Exception -> 0x014f }
            int r4 = r4.getDuration()     // Catch:{ Exception -> 0x014f }
        L_0x006a:
            float r5 = (float) r0     // Catch:{ Exception -> 0x014f }
            float r4 = (float) r4     // Catch:{ Exception -> 0x014f }
            float r5 = r5 / r4
            r4 = 1120403456(0x42c80000, float:100.0)
            float r5 = r5 * r4
            int r4 = (int) r5     // Catch:{ Exception -> 0x014f }
            int r5 = r9.f23428an     // Catch:{ Exception -> 0x014f }
            int r6 = com.mbridge.msdk.foundation.same.C8469a.f20753n     // Catch:{ Exception -> 0x014f }
            if (r5 != r6) goto L_0x00b7
            r9.m26932f()     // Catch:{ Exception -> 0x014f }
            int r5 = r9.f23429ao     // Catch:{ Exception -> 0x014f }
            int r6 = com.mbridge.msdk.foundation.same.C8469a.f20755p     // Catch:{ Exception -> 0x014f }
            if (r5 != r6) goto L_0x0094
            int r5 = r9.f23430ap     // Catch:{ Exception -> 0x014f }
            if (r4 < r5) goto L_0x0094
            com.mbridge.msdk.video.module.a.a r0 = r9.f23199e     // Catch:{ Exception -> 0x014f }
            if (r0 == 0) goto L_0x0093
            com.mbridge.msdk.video.module.a.a r0 = r9.f23199e     // Catch:{ Exception -> 0x014f }
            boolean r1 = r9.f23435au     // Catch:{ Exception -> 0x014f }
            java.lang.String r1 = r9.m26921b((boolean) r1)     // Catch:{ Exception -> 0x014f }
            r0.mo62631a(r3, r1)     // Catch:{ Exception -> 0x014f }
        L_0x0093:
            return
        L_0x0094:
            int r5 = r9.f23429ao     // Catch:{ Exception -> 0x014f }
            int r6 = com.mbridge.msdk.foundation.same.C8469a.f20756q     // Catch:{ Exception -> 0x014f }
            if (r5 != r6) goto L_0x00ae
            int r5 = r9.f23430ap     // Catch:{ Exception -> 0x014f }
            if (r0 < r5) goto L_0x00ae
            com.mbridge.msdk.video.module.a.a r0 = r9.f23199e     // Catch:{ Exception -> 0x014f }
            if (r0 == 0) goto L_0x00ad
            com.mbridge.msdk.video.module.a.a r0 = r9.f23199e     // Catch:{ Exception -> 0x014f }
            boolean r1 = r9.f23435au     // Catch:{ Exception -> 0x014f }
            java.lang.String r1 = r9.m26921b((boolean) r1)     // Catch:{ Exception -> 0x014f }
            r0.mo62631a(r3, r1)     // Catch:{ Exception -> 0x014f }
        L_0x00ad:
            return
        L_0x00ae:
            com.mbridge.msdk.video.module.a.a r3 = r9.f23199e     // Catch:{ Exception -> 0x014f }
            if (r3 == 0) goto L_0x00b7
            com.mbridge.msdk.video.module.a.a r3 = r9.f23199e     // Catch:{ Exception -> 0x014f }
            r3.mo62631a(r1, r2)     // Catch:{ Exception -> 0x014f }
        L_0x00b7:
            int r3 = r9.f23428an     // Catch:{ Exception -> 0x014f }
            int r5 = com.mbridge.msdk.foundation.same.C8469a.f20754o     // Catch:{ Exception -> 0x014f }
            if (r3 != r5) goto L_0x00ea
            int r3 = r9.f23429ao     // Catch:{ Exception -> 0x014f }
            int r5 = com.mbridge.msdk.foundation.same.C8469a.f20755p     // Catch:{ Exception -> 0x014f }
            if (r3 != r5) goto L_0x00d4
            int r3 = r9.f23430ap     // Catch:{ Exception -> 0x014f }
            if (r4 < r3) goto L_0x00d4
            r9.m26932f()     // Catch:{ Exception -> 0x014f }
            com.mbridge.msdk.video.module.a.a r0 = r9.f23199e     // Catch:{ Exception -> 0x014f }
            if (r0 == 0) goto L_0x00d3
            com.mbridge.msdk.video.module.a.a r0 = r9.f23199e     // Catch:{ Exception -> 0x014f }
            r0.mo62631a(r1, r2)     // Catch:{ Exception -> 0x014f }
        L_0x00d3:
            return
        L_0x00d4:
            int r3 = r9.f23429ao     // Catch:{ Exception -> 0x014f }
            int r4 = com.mbridge.msdk.foundation.same.C8469a.f20756q     // Catch:{ Exception -> 0x014f }
            if (r3 != r4) goto L_0x00ea
            int r3 = r9.f23430ap     // Catch:{ Exception -> 0x014f }
            if (r0 < r3) goto L_0x00ea
            r9.m26932f()     // Catch:{ Exception -> 0x014f }
            com.mbridge.msdk.video.module.a.a r0 = r9.f23199e     // Catch:{ Exception -> 0x014f }
            if (r0 == 0) goto L_0x00ea
            com.mbridge.msdk.video.module.a.a r0 = r9.f23199e     // Catch:{ Exception -> 0x014f }
            r0.mo62631a(r1, r2)     // Catch:{ Exception -> 0x014f }
        L_0x00ea:
            return
        L_0x00eb:
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r9.f23196b     // Catch:{ Exception -> 0x014f }
            if (r0 == 0) goto L_0x0145
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r9.f23196b     // Catch:{ Exception -> 0x014f }
            int r0 = r0.getAdSpaceT()     // Catch:{ Exception -> 0x014f }
            if (r0 == r3) goto L_0x0145
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r9.f23196b     // Catch:{ Exception -> 0x014f }
            int r0 = r0.getVideoCompleteTime()     // Catch:{ Exception -> 0x014f }
            com.mbridge.msdk.playercommon.PlayerView r4 = r9.f23441s     // Catch:{ Exception -> 0x014f }
            int r4 = r4.getCurPosition()     // Catch:{ Exception -> 0x014f }
            int r4 = r4 / 1000
            com.mbridge.msdk.foundation.entity.CampaignEx r5 = r9.f23196b     // Catch:{ Exception -> 0x014f }
            int r5 = r5.getDynamicTempCode()     // Catch:{ Exception -> 0x014f }
            r6 = 5
            r7 = 0
            r8 = 1
            if (r5 != r6) goto L_0x011d
            int r5 = r9.mCurrPlayNum     // Catch:{ Exception -> 0x014f }
            if (r5 <= r8) goto L_0x011d
            if (r0 != 0) goto L_0x0117
            goto L_0x0124
        L_0x0117:
            if (r0 <= 0) goto L_0x0124
            if (r4 >= r0) goto L_0x0124
        L_0x011b:
            r7 = r8
            goto L_0x0124
        L_0x011d:
            if (r0 <= 0) goto L_0x0121
            if (r4 < r0) goto L_0x011b
        L_0x0121:
            if (r0 != 0) goto L_0x0124
            goto L_0x011b
        L_0x0124:
            if (r7 == 0) goto L_0x013b
            int r0 = r9.f23404O     // Catch:{ Exception -> 0x014f }
            if (r0 != r8) goto L_0x013b
            boolean r0 = r9.f23421af     // Catch:{ Exception -> 0x014f }
            if (r0 != 0) goto L_0x013b
            r9.m26932f()     // Catch:{ Exception -> 0x014f }
            com.mbridge.msdk.video.module.a.a r0 = r9.f23199e     // Catch:{ Exception -> 0x014f }
            if (r0 == 0) goto L_0x0159
            com.mbridge.msdk.video.module.a.a r0 = r9.f23199e     // Catch:{ Exception -> 0x014f }
            r0.mo62631a(r1, r2)     // Catch:{ Exception -> 0x014f }
            goto L_0x0159
        L_0x013b:
            com.mbridge.msdk.video.module.a.a r0 = r9.f23199e     // Catch:{ Exception -> 0x014f }
            if (r0 == 0) goto L_0x0159
            com.mbridge.msdk.video.module.a.a r0 = r9.f23199e     // Catch:{ Exception -> 0x014f }
            r0.mo62631a(r3, r2)     // Catch:{ Exception -> 0x014f }
            goto L_0x0159
        L_0x0145:
            com.mbridge.msdk.video.module.a.a r0 = r9.f23199e     // Catch:{ Exception -> 0x014f }
            if (r0 == 0) goto L_0x0159
            com.mbridge.msdk.video.module.a.a r0 = r9.f23199e     // Catch:{ Exception -> 0x014f }
            r0.mo62631a(r3, r2)     // Catch:{ Exception -> 0x014f }
            goto L_0x0159
        L_0x014f:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "MBridgeBaseView"
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r1, r0)
        L_0x0159:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeVideoView.m26922b():void");
    }

    public void hideAlertView(int i) {
        if (this.f23400K) {
            this.f23400K = false;
            this.f23431aq = true;
            setShowingAlertViewCover(false);
            C9638b.m27377a().mo63551a(C8388a.m23845e().mo56914h(), this.f23407R, false);
            C8598e.m24669a(this.f23195a, this.f23196b, C9640c.f23946a, this.f23407R, 1, i);
            if (i == 0) {
                m26936g();
                if (!this.f23423ah) {
                    return;
                }
                if (this.f23428an == C8469a.f20754o || this.f23428an == C8469a.f20753n) {
                    this.f23432ar = true;
                    if (this.f23199e != null) {
                        this.f23199e.mo62631a(124, "");
                    }
                    this.f23436av = true;
                    gonePlayingCloseView();
                    return;
                }
                return;
            }
            this.f23433as = true;
            if (this.f23423ah && this.f23428an == C8469a.f20754o) {
                m26936g();
            } else if (!this.f23423ah || this.f23428an != C8469a.f20753n) {
                if (this.f23199e != null) {
                    this.f23199e.mo62631a(2, "");
                }
            } else if (this.f23199e != null) {
                this.f23199e.mo62631a(2, m26921b(this.f23435au));
            }
        }
    }

    public void alertWebViewShowed() {
        this.f23400K = true;
        setShowingAlertViewCover(true);
    }

    public void dismissAllAlert() {
        MBAlertDialog mBAlertDialog = this.f23405P;
        if (mBAlertDialog != null) {
            mBAlertDialog.dismiss();
        }
        if (this.f23199e != null) {
            this.f23199e.mo62631a(125, "");
        }
    }

    public void showAlertView() {
        if (!this.f23416aa) {
            if (this.f23406Q == null) {
                this.f23406Q = new C9682a() {
                    /* renamed from: a */
                    public final void mo16409a() {
                        boolean unused = MBridgeVideoView.this.f23400K = false;
                        MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                        mBridgeVideoView.setShowingAlertViewCover(mBridgeVideoView.f23400K);
                        if (MBridgeVideoView.this.f23423ah && (MBridgeVideoView.this.f23428an == C8469a.f20754o || MBridgeVideoView.this.f23428an == C8469a.f20753n)) {
                            boolean unused2 = MBridgeVideoView.this.f23432ar = true;
                            if (MBridgeVideoView.this.f23199e != null) {
                                MBridgeVideoView.this.f23199e.mo62631a(124, "");
                            }
                            boolean unused3 = MBridgeVideoView.this.f23436av = true;
                            MBridgeVideoView.this.gonePlayingCloseView();
                        }
                        MBridgeVideoView.this.m26936g();
                        C8598e.m24669a(MBridgeVideoView.this.f23195a, MBridgeVideoView.this.f23196b, MBridgeVideoView.this.f23427am, MBridgeVideoView.this.f23407R, 1, 0);
                    }

                    /* renamed from: b */
                    public final void mo16410b() {
                        boolean unused = MBridgeVideoView.this.f23400K = false;
                        boolean unused2 = MBridgeVideoView.this.f23433as = true;
                        MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                        mBridgeVideoView.setShowingAlertViewCover(mBridgeVideoView.f23400K);
                        C8598e.m24669a(MBridgeVideoView.this.f23195a, MBridgeVideoView.this.f23196b, MBridgeVideoView.this.f23427am, MBridgeVideoView.this.f23407R, 1, 1);
                        if (!MBridgeVideoView.this.f23423ah || MBridgeVideoView.this.f23428an != C8469a.f20753n) {
                            if (MBridgeVideoView.this.f23423ah && MBridgeVideoView.this.f23428an == C8469a.f20754o) {
                                MBridgeVideoView.this.m26936g();
                            } else if (MBridgeVideoView.this.f23199e != null) {
                                MBridgeVideoView.this.f23199e.mo62631a(2, "");
                            }
                        } else if (MBridgeVideoView.this.f23199e != null) {
                            C9473a aVar = MBridgeVideoView.this.f23199e;
                            MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
                            aVar.mo62631a(2, mBridgeVideoView2.m26921b(mBridgeVideoView2.f23435au));
                        }
                    }
                };
            }
            if (this.f23405P == null) {
                MBAlertDialog mBAlertDialog = new MBAlertDialog(getContext(), this.f23406Q);
                this.f23405P = mBAlertDialog;
                AdSession adSession = this.f23425ak;
                if (adSession != null) {
                    adSession.addFriendlyObstruction(mBAlertDialog.getWindow().getDecorView(), FriendlyObstructionPurpose.NOT_VISIBLE, (String) null);
                }
            }
            if (this.f23423ah) {
                this.f23405P.makeIVAlertView(this.f23428an, this.f23407R);
            } else {
                this.f23405P.makeRVAlertView(this.f23407R);
            }
            PlayerView playerView = this.f23441s;
            if (playerView != null && !playerView.isComplete()) {
                this.f23405P.show();
                this.f23431aq = true;
                this.f23400K = true;
                setShowingAlertViewCover(true);
                C9638b.m27377a().mo63551a(C8388a.m23845e().mo56914h(), this.f23407R, false);
                this.f23427am = C9640c.f23946a;
                C8598e.m24668a(this.f23195a, this.f23196b, this.f23427am, this.f23407R, 1);
            }
        }
    }

    public void preLoadData(C9618b bVar) {
        this.f23397H = bVar;
        if (this.f23200f) {
            if (!TextUtils.isEmpty(this.f23401L) && this.f23196b != null) {
                AdSession adSession = this.f23425ak;
                if (adSession != null) {
                    adSession.registerAdView(this.f23441s);
                    SoundImageView soundImageView = this.f23442t;
                    if (soundImageView != null) {
                        this.f23425ak.addFriendlyObstruction(soundImageView, FriendlyObstructionPurpose.OTHER, (String) null);
                    }
                    this.f23425ak.addFriendlyObstruction(this.f23443u, FriendlyObstructionPurpose.OTHER, (String) null);
                    this.f23425ak.addFriendlyObstruction(this.f23444v, FriendlyObstructionPurpose.VIDEO_CONTROLS, (String) null);
                }
                if (this.f23196b != null && C8616ad.m24718b(this.f23196b.getVideoResolution())) {
                    String videoResolution = this.f23196b.getVideoResolution();
                    C8672v.m24876b(MBridgeBaseView.TAG, "MBridgeBaseView videoResolution:" + videoResolution);
                    String[] split = videoResolution.split("x");
                    if (split.length == 2) {
                        if (C8677z.m24922b(split[0]) > 0.0d) {
                            this.f23408S = C8677z.m24922b(split[0]);
                        }
                        if (C8677z.m24922b(split[1]) > 0.0d) {
                            this.f23409T = C8677z.m24922b(split[1]);
                        }
                        C8672v.m24876b(MBridgeBaseView.TAG, "MBridgeBaseView mVideoW:" + this.f23408S + "  mVideoH:" + this.f23409T);
                    }
                    if (this.f23408S <= 0.0d) {
                        this.f23408S = 1280.0d;
                    }
                    if (this.f23409T <= 0.0d) {
                        this.f23409T = 720.0d;
                    }
                }
                this.f23441s.initBufferIngParam(this.f23403N);
                this.f23441s.initVFPData(this.f23401L, this.f23196b.getVideoUrlEncode(), this.f23413aA);
                soundOperate(this.f23424aj, -1, (String) null);
            }
        } else if (this.f23199e != null) {
            this.f23199e.mo62631a(12, "MBridgeVideoView initSuccess false");
        }
        f23384ai = false;
    }

    public void defaultShow() {
        super.defaultShow();
        this.f23410U = true;
        showVideoLocation(0, 0, C8677z.m24947h(this.f23195a), C8677z.m24945g(this.f23195a), 0, 0, 0, 0, 0);
        videoOperate(1);
        if (this.f23402M == 0) {
            closeVideoOperate(-1, 2);
        }
    }

    public void showVideoLocation(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        C8672v.m24876b(MBridgeBaseView.TAG, "showVideoLocation marginTop:" + i + " marginLeft:" + i2 + " width:" + i3 + "  height:" + i4 + " radius:" + i5 + " borderTop:" + i6 + " borderLeft:" + i7 + " borderWidth:" + i8 + " borderHeight:" + i9);
        if (this.f23200f) {
            this.f23445w.setPadding(0, 0, 0, 0);
            setVisibility(0);
            if (this.f23445w.getVisibility() != 0) {
                this.f23445w.setVisibility(0);
            }
            if (this.f23443u.getVisibility() == 0) {
                m26944j();
            }
            if (!(i3 > 0 && i4 > 0 && C8677z.m24947h(this.f23195a) >= i3 && C8677z.m24945g(this.f23195a) >= i4) || this.f23410U) {
                m26938h();
                return;
            }
            f23386o = i6;
            f23387p = i7;
            f23388q = i8 + 4;
            f23389r = i9 + 4;
            float f = ((float) i3) / ((float) i4);
            float f2 = 0.0f;
            try {
                f2 = (float) (this.f23408S / this.f23409T);
            } catch (Throwable th) {
                C8672v.m24875a(MBridgeBaseView.TAG, th.getMessage(), th);
            }
            if (i5 > 0) {
                f23385n = i5;
                if (i5 > 0) {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setCornerRadius((float) C8677z.m24924b(getContext(), (float) i5));
                    gradientDrawable.setColor(-1);
                    gradientDrawable.setStroke(1, 0);
                    if (Build.VERSION.SDK_INT >= 16) {
                        setBackground(gradientDrawable);
                        this.f23441s.setBackground(gradientDrawable);
                    } else {
                        setBackgroundDrawable(gradientDrawable);
                        this.f23441s.setBackgroundDrawable(gradientDrawable);
                    }
                    if (Build.VERSION.SDK_INT >= 21) {
                        setClipToOutline(true);
                        this.f23441s.setClipToOutline(true);
                    }
                }
            }
            if (Math.abs(f - f2) <= 0.1f || this.f23422ag == 1) {
                m26938h();
                if (this.f23421af) {
                    setLayoutCenter(i3, i4);
                    if (f23384ai) {
                        this.f23199e.mo62631a(114, "");
                    } else {
                        this.f23199e.mo62631a(116, "");
                    }
                } else {
                    setLayoutParam(i2, i, i3, i4);
                }
            } else {
                m26938h();
                videoOperate(1);
            }
        }
    }

    public void soundOperate(int i, int i2) {
        soundOperate(i, i2, "2");
    }

    public void soundOperate(int i, int i2, String str) {
        SoundImageView soundImageView;
        if (this.f23200f) {
            this.f23424aj = i;
            if (i == 1) {
                SoundImageView soundImageView2 = this.f23442t;
                if (soundImageView2 != null) {
                    soundImageView2.setSoundStatus(false);
                }
                this.f23441s.closeSound();
                try {
                    if (this.f23426al != null) {
                        this.f23426al.volumeChange(0.0f);
                    }
                } catch (IllegalArgumentException e) {
                    C8672v.m24874a("OMSDK", e.getMessage());
                }
            } else if (i == 2) {
                SoundImageView soundImageView3 = this.f23442t;
                if (soundImageView3 != null) {
                    soundImageView3.setSoundStatus(true);
                }
                this.f23441s.openSound();
                try {
                    if (this.f23426al != null) {
                        this.f23426al.volumeChange(1.0f);
                    }
                } catch (IllegalArgumentException e2) {
                    C8672v.m24874a("OMSDK", e2.getMessage());
                }
            }
            if (this.f23196b != null && this.f23196b.isDynamicView()) {
                SoundImageView soundImageView4 = this.f23442t;
                if (soundImageView4 != null) {
                    soundImageView4.setVisibility(0);
                }
            } else if (i2 == 1) {
                SoundImageView soundImageView5 = this.f23442t;
                if (soundImageView5 != null) {
                    soundImageView5.setVisibility(8);
                }
            } else if (i2 == 2 && (soundImageView = this.f23442t) != null) {
                soundImageView.setVisibility(0);
            }
        }
        if (str != null && str.equals("2") && this.f23199e != null) {
            this.f23199e.mo62631a(7, Integer.valueOf(i));
        }
    }

    public void videoOperate(int i) {
        C8672v.m24874a(MBridgeBaseView.TAG, "VideoView videoOperate:" + i);
        if (!this.f23200f) {
            return;
        }
        if (i == 1) {
            if (getVisibility() == 0 && isfront()) {
                C8672v.m24874a(MBridgeBaseView.TAG, "VideoView videoOperate:play");
                if (!this.f23400K && !C2470b.f5205c) {
                    m26936g();
                }
            }
        } else if (i == 2) {
            if (getVisibility() == 0 && isfront()) {
                C8672v.m24874a(MBridgeBaseView.TAG, "VideoView videoOperate:pause");
                m26932f();
            }
        } else if (i == 3 && !this.f23412W) {
            this.f23441s.release();
            this.f23412W = true;
        }
    }

    public void closeVideoOperate(int i, int i2) {
        if (i == 1) {
            this.f23437aw = true;
            if (getVisibility() == 0) {
                m26922b();
            }
        }
        if (i2 == 1) {
            gonePlayingCloseView();
        } else if (i2 != 2) {
        } else {
            if ((!this.f23436av || getVisibility() != 0) && this.f23200f && this.f23444v.getVisibility() != 0) {
                if (!this.f23203i || this.f23394E) {
                    this.f23444v.setVisibility(0);
                }
                this.f23417ab = true;
            }
        }
    }

    public void progressBarOperate(int i) {
        ProgressBar progressBar;
        if (!this.f23200f) {
            return;
        }
        if (i == 1) {
            ProgressBar progressBar2 = this.f23447y;
            if (progressBar2 != null) {
                progressBar2.setVisibility(8);
            }
        } else if (i == 2 && (progressBar = this.f23447y) != null) {
            progressBar.setVisibility(0);
        }
    }

    public void progressOperate(int i, int i2) {
        if (this.f23200f) {
            C8672v.m24876b(MBridgeBaseView.TAG, "progressOperate progress:" + i);
            int videoLength = this.f23196b != null ? this.f23196b.getVideoLength() : 0;
            if (i > 0 && i <= videoLength && this.f23441s != null) {
                C8672v.m24876b(MBridgeBaseView.TAG, "progressOperate progress:" + i);
                this.f23441s.seekTo(i * 1000);
            }
            if (i2 == 1) {
                this.f23443u.setVisibility(8);
            } else if (i2 == 2) {
                this.f23443u.setVisibility(0);
            }
            if (this.f23443u.getVisibility() == 0) {
                m26944j();
            }
        }
    }

    public String getCurrentProgress() {
        try {
            int a = this.f23413aA.mo63199a();
            int i = 0;
            if (this.f23196b != null) {
                i = this.f23196b.getVideoLength();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_PROGRESS, m26916a(a, i));
            jSONObject.put("time", a);
            jSONObject.put("duration", i + "");
            return jSONObject.toString();
        } catch (Throwable th) {
            C8672v.m24875a(MBridgeBaseView.TAG, th.getMessage(), th);
            return JsonUtils.EMPTY_JSON;
        }
    }

    public void setScaleFitXY(int i) {
        this.f23422ag = i;
    }

    public void setVisible(int i) {
        setVisibility(i);
    }

    public void setCover(boolean z) {
        if (this.f23200f) {
            this.f23441s.setIsCovered(z);
        }
    }

    public void setMiniEndCardState(boolean z) {
        this.f23416aa = z;
    }

    public void setShowingAlertViewCover(boolean z) {
        this.f23441s.setIsCovered(z);
    }

    public boolean isH5Canvas() {
        return getLayoutParams().height < C8677z.m24945g(this.f23195a.getApplicationContext());
    }

    public int getBorderViewHeight() {
        return f23389r;
    }

    public int getBorderViewWidth() {
        return f23388q;
    }

    public int getBorderViewLeft() {
        return f23387p;
    }

    public int getBorderViewTop() {
        return f23386o;
    }

    public int getBorderViewRadius() {
        return f23385n;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if ((this.f23196b == null || !this.f23196b.isDynamicView()) && this.f23200f && this.f23410U) {
            m26938h();
        }
    }

    /* renamed from: a */
    private String m26916a(int i, int i2) {
        if (i2 != 0) {
            double d = (double) (((float) i) / ((float) i2));
            try {
                return C8677z.m24904a(Double.valueOf(d)) + "";
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return i2 + "";
    }

    public int getCloseAlert() {
        return this.f23404O;
    }

    public void setCloseAlert(int i) {
        this.f23404O = i;
    }

    public int getVideoSkipTime() {
        return this.f23402M;
    }

    public void setVideoSkipTime(int i) {
        this.f23402M = i;
    }

    public void setPlayURL(String str) {
        this.f23401L = str;
    }

    public void setBufferTimeout(int i) {
        this.f23403N = i;
    }

    /* renamed from: e */
    private boolean m26929e() {
        try {
            this.f23441s = (PlayerView) findViewById(filterFindViewId(this.f23438ax, "mbridge_vfpv"));
            this.f23443u = (TextView) findViewById(filterFindViewId(this.f23438ax, "mbridge_tv_count"));
            View findViewById = findViewById(filterFindViewId(this.f23438ax, "mbridge_rl_playing_close"));
            this.f23444v = findViewById;
            if (findViewById != null) {
                findViewById.setVisibility(4);
            }
            this.f23445w = (RelativeLayout) findViewById(filterFindViewId(this.f23438ax, "mbridge_top_control"));
            this.f23446x = (ImageView) findViewById(filterFindViewId(this.f23438ax, "mbridge_videoview_bg"));
            this.f23447y = (ProgressBar) findViewById(filterFindViewId(this.f23438ax, "mbridge_video_progress_bar"));
            this.f23448z = (FeedBackButton) findViewById(filterFindViewId(this.f23438ax, "mbridge_native_endcard_feed_btn"));
            this.f23442t = (SoundImageView) findViewById(filterFindViewId(this.f23438ax, "mbridge_sound_switch"));
            this.f23390A = (MBridgeSegmentsProgressBar) findViewById(filterFindViewId(this.f23438ax, "mbridge_reward_segment_progressbar"));
            this.f23395F = (FrameLayout) findViewById(filterFindViewId(this.f23438ax, "mbridge_reward_cta_layout"));
            this.f23440az = (MBridgeBaitClickView) findViewById(filterFindViewId(this.f23438ax, "mbridge_animation_click_view"));
            this.f23399J = (RelativeLayout) findViewById(filterFindViewId(this.f23438ax, "mbridge_reward_moreoffer_layout"));
            return isNotNULL(this.f23441s, this.f23442t, this.f23443u, this.f23444v);
        } catch (Throwable th) {
            C8672v.m24875a(MBridgeBaseView.TAG, th.getMessage(), th);
            return false;
        }
    }

    public boolean isfront() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return false;
        }
        int indexOfChild = viewGroup.indexOfChild(this);
        int childCount = viewGroup.getChildCount();
        int i = indexOfChild + 1;
        boolean z = false;
        while (i <= childCount - 1) {
            if (viewGroup.getChildAt(i).getVisibility() == 0 && this.f23416aa) {
                return false;
            }
            i++;
            z = true;
        }
        return z;
    }

    /* renamed from: f */
    private void m26932f() {
        try {
            if (this.f23441s != null) {
                this.f23441s.onPause();
                if (!(this.f23196b == null || this.f23196b.getNativeVideoTracking() == null || this.f23196b.isHasReportAdTrackPause())) {
                    this.f23196b.setHasReportAdTrackPause(true);
                    C6765a.m20559a(C8388a.m23845e().mo56913g(), this.f23196b, this.f23407R, this.f23196b.getNativeVideoTracking().mo57763f(), false, false);
                }
                if (this.f23426al != null) {
                    this.f23426al.pause();
                    C8672v.m24874a("omsdk", "play:  videoEvents.pause()");
                }
            }
        } catch (Throwable th) {
            C8672v.m24875a(MBridgeBaseView.TAG, th.getMessage(), th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m26936g() {
        try {
            if (!this.f23411V) {
                try {
                    if (this.f23426al != null) {
                        float duration = (float) this.f23441s.getDuration();
                        float f = 0.0f;
                        if (duration == 0.0f && this.f23196b != null) {
                            duration = (float) this.f23196b.getVideoLength();
                        }
                        MediaEvents mediaEvents = this.f23426al;
                        if (getMute() == 2) {
                            f = 1.0f;
                        }
                        mediaEvents.start(duration, f);
                        C8672v.m24874a("omsdk", "play: videoEvents.start()");
                    }
                } catch (IllegalArgumentException e) {
                    C8672v.m24874a(MBridgeBaseView.TAG, e.getMessage());
                }
                boolean playVideo = this.f23441s.playVideo();
                if (!(this.f23196b == null || this.f23196b.getPlayable_ads_without_video() == 2 || playVideo || this.f23413aA == null)) {
                    this.f23413aA.onPlayError("play video failed");
                }
                this.f23411V = true;
                return;
            }
            this.f23441s.onResume();
            try {
                if (this.f23426al != null) {
                    this.f23426al.resume();
                    C8672v.m24874a("omsdk", "play:  videoEvents.resume()");
                }
            } catch (IllegalArgumentException e2) {
                C8672v.m24874a(MBridgeBaseView.TAG, e2.getMessage());
            }
        } catch (Exception e3) {
            C8672v.m24875a(MBridgeBaseView.TAG, e3.getMessage(), e3);
        }
    }

    public void gonePlayingCloseView() {
        if (this.f23200f && this.f23444v.getVisibility() != 8) {
            this.f23444v.setVisibility(8);
            this.f23417ab = false;
        }
        if (!this.f23414aB && !this.f23420ae && !this.f23418ac) {
            this.f23414aB = true;
            int i = this.f23402M;
            if (i >= 0) {
                if (i == 0) {
                    this.f23420ae = true;
                } else {
                    new Handler().postDelayed(new Runnable() {
                        public final void run() {
                            boolean unused = MBridgeVideoView.this.f23420ae = true;
                        }
                    }, (long) (this.f23402M * 1000));
                }
            }
        }
    }

    /* renamed from: h */
    private void m26938h() {
        float f;
        float h = (float) C8677z.m24947h(this.f23195a);
        float g = (float) C8677z.m24945g(this.f23195a);
        int b = C8677z.m24924b(getContext(), 58.0f);
        int b2 = C8677z.m24924b(getContext(), 104.0f);
        if (this.f23196b != null && this.f23196b.getAdSpaceT() == 2) {
            int c = this.f23196b.getRewardTemplateMode().mo57574c();
            if (c == 1) {
                h -= (float) (b * 2);
                g -= (float) (b2 * 2);
            }
            if (c == 2) {
                h -= (float) (b2 * 2);
                g -= (float) (b * 2);
            }
            if (c == 0) {
                if (this.f23198d == 1) {
                    h -= (float) (b * 2);
                    f = (float) (b2 * 2);
                } else {
                    h -= (float) (b2 * 2);
                    f = (float) (b * 2);
                }
                g -= f;
            }
        }
        double d = this.f23408S;
        if (d > 0.0d) {
            double d2 = this.f23409T;
            if (d2 > 0.0d && h > 0.0f && g > 0.0f) {
                double d3 = d / d2;
                double d4 = (double) (h / g);
                C8672v.m24876b(MBridgeBaseView.TAG, "videoWHDivide:" + d3 + "  screenWHDivide:" + d4);
                double a = C8677z.m24904a(Double.valueOf(d3));
                double a2 = C8677z.m24904a(Double.valueOf(d4));
                C8672v.m24876b(MBridgeBaseView.TAG, "videoWHDivideFinal:" + a + "  screenWHDivideFinal:" + a2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f23441s.getLayoutParams();
                if (a > a2) {
                    layoutParams.width = -1;
                    layoutParams.height = (int) ((((double) h) * this.f23409T) / this.f23408S);
                    layoutParams.gravity = 17;
                } else if (a < a2) {
                    layoutParams.width = (int) (((double) g) * d3);
                    layoutParams.height = -1;
                    layoutParams.gravity = 17;
                } else {
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                }
                try {
                    if (this.f23196b != null && this.f23196b.isDynamicView()) {
                        int b3 = this.f23196b.getRewardTemplateMode().mo57573b();
                        int c2 = this.f23196b.getRewardTemplateMode().mo57574c();
                        if (b3 == 102 || b3 == 202) {
                            if (c2 == 1) {
                                layoutParams.width = -1;
                                layoutParams.gravity = 17;
                                layoutParams.height = (int) (this.f23409T / (this.f23408S / ((double) h)));
                            } else {
                                layoutParams.height = -1;
                                layoutParams.gravity = 17;
                                layoutParams.width = (int) (((double) g) * d3);
                            }
                        }
                        if (b3 == 202 && !TextUtils.isEmpty(this.f23196b.getImageUrl())) {
                            m26918a(this.f23196b.getImageUrl());
                        }
                        if (b3 == 302 || b3 == 802) {
                            if (this.f23408S / this.f23409T > 1.0d) {
                                layoutParams.width = -1;
                                layoutParams.height = (int) ((this.f23409T * ((double) h)) / this.f23408S);
                            } else {
                                int b4 = C8677z.m24924b(getContext(), 220.0f);
                                layoutParams.width = (int) ((this.f23408S * ((double) b4)) / this.f23409T);
                                layoutParams.height = b4;
                            }
                        }
                    }
                } catch (Throwable th) {
                    C8672v.m24878d(MBridgeBaseView.TAG, th.getMessage());
                }
                this.f23441s.setLayoutParams(layoutParams);
                setMatchParent();
                return;
            }
        }
        m26942i();
    }

    /* renamed from: i */
    private void m26942i() {
        try {
            setLayoutParam(0, 0, -1, -1);
            if (!isLandscape() && this.f23200f) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f23441s.getLayoutParams();
                int h = C8677z.m24947h(this.f23195a);
                layoutParams.width = -1;
                layoutParams.height = (h * 9) / 16;
                layoutParams.gravity = 17;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: com.mbridge.msdk.video.module.MBridgeVideoView$b */
    private static final class C9472b extends DefaultVideoPlayerStatusListener {

        /* renamed from: a */
        private MBridgeVideoView f23470a;

        /* renamed from: b */
        private int f23471b;

        /* renamed from: c */
        private int f23472c;

        /* renamed from: d */
        private boolean f23473d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public MediaEvents f23474e;

        /* renamed from: f */
        private C9471a f23475f = new C9471a();

        /* renamed from: g */
        private boolean f23476g = false;

        /* renamed from: h */
        private boolean f23477h = false;

        /* renamed from: i */
        private boolean f23478i = false;

        /* renamed from: j */
        private boolean f23479j;

        /* renamed from: k */
        private String f23480k;

        /* renamed from: l */
        private CampaignEx f23481l;

        /* renamed from: m */
        private int f23482m;

        /* renamed from: n */
        private int f23483n;

        /* renamed from: o */
        private boolean f23484o = false;

        /* renamed from: a */
        public final void mo63201a(CampaignEx campaignEx) {
            this.f23481l = campaignEx;
        }

        /* renamed from: a */
        public final void mo63203a(boolean z) {
            this.f23479j = z;
        }

        /* renamed from: a */
        public final void mo63202a(String str) {
            this.f23480k = str;
        }

        /* renamed from: a */
        public final int mo63199a() {
            return this.f23471b;
        }

        /* renamed from: a */
        public final void mo63200a(int i, int i2) {
            this.f23482m = i;
            this.f23483n = i2;
        }

        public C9472b(MBridgeVideoView mBridgeVideoView) {
            this.f23470a = mBridgeVideoView;
        }

        public final void onPlayStarted(int i) {
            super.onPlayStarted(i);
            if (!this.f23473d) {
                MBridgeVideoView mBridgeVideoView = this.f23470a;
                if (mBridgeVideoView != null) {
                    boolean unused = mBridgeVideoView.f23394E = true;
                }
                this.f23470a.f23199e.mo62631a(10, this.f23475f);
                this.f23473d = true;
            }
            CampaignEx campaignEx = this.f23481l;
            if (campaignEx != null) {
                int videoCompleteTime = campaignEx.getVideoCompleteTime();
                String str = "mbridge_reward_shape_progress";
                if (this.f23481l.isDynamicView()) {
                    MBridgeVideoView mBridgeVideoView2 = this.f23470a;
                    if (!(mBridgeVideoView2 == null || mBridgeVideoView2.f23443u == null)) {
                        if (this.f23481l.getDynamicTempCode() != 5 || this.f23470a.mCurrPlayNum <= 1 || videoCompleteTime > 0) {
                            if (videoCompleteTime > 0) {
                                m26970c();
                                str = "mbridge_reward_video_time_count_num_bg";
                            }
                            this.f23470a.f23443u.setBackgroundResource(C8658p.m24799a(C8388a.m23845e().mo56913g(), str, "drawable"));
                        } else {
                            this.f23470a.f23443u.setBackgroundResource(C8658p.m24799a(C8388a.m23845e().mo56913g(), "mbridge_reward_video_time_count_num_bg", "drawable"));
                            m26970c();
                        }
                    }
                } else if (videoCompleteTime > 0) {
                    this.f23470a.f23443u.setBackgroundResource(C8658p.m24799a(C8388a.m23845e().mo56913g(), "mbridge_reward_video_time_count_num_bg", "drawable"));
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, C8677z.m24924b(C8388a.m23845e().mo56913g(), 30.0f));
                    int b = C8677z.m24924b(C8388a.m23845e().mo56913g(), 5.0f);
                    layoutParams.addRule(1, C8658p.m24799a(C8388a.m23845e().mo56913g(), "mbridge_native_endcard_feed_btn", "id"));
                    layoutParams.setMargins(b, 0, 0, 0);
                    this.f23470a.f23443u.setPadding(b, 0, b, 0);
                    this.f23470a.f23443u.setLayoutParams(layoutParams);
                } else {
                    this.f23470a.f23443u.setBackgroundResource(C8658p.m24799a(C8388a.m23845e().mo56913g(), str, "drawable"));
                }
            }
            if (this.f23470a.f23447y != null) {
                this.f23470a.f23447y.setMax(i);
            }
            CampaignEx campaignEx2 = this.f23481l;
            if (campaignEx2 != null && campaignEx2.getAdSpaceT() == 2) {
                this.f23470a.f23445w.setVisibility(0);
            }
            if (this.f23470a.f23443u.getVisibility() == 0) {
                this.f23470a.m26944j();
            }
            boolean unused2 = MBridgeVideoView.f23384ai = false;
            if (this.f23470a.f23398I == 0) {
                this.f23470a.setCTALayoutVisibleOrGone();
            }
            this.f23470a.showMoreOfferInPlayTemplate();
            this.f23470a.showBaitClickView();
        }

        /* renamed from: c */
        private void m26970c() {
            MBridgeVideoView mBridgeVideoView = this.f23470a;
            if (mBridgeVideoView != null) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) mBridgeVideoView.f23443u.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = -2;
                    layoutParams.height = C8677z.m24924b(C8388a.m23845e().mo56913g(), 25.0f);
                    this.f23470a.f23443u.setLayoutParams(layoutParams);
                }
                int b = C8677z.m24924b(C8388a.m23845e().mo56913g(), 5.0f);
                this.f23470a.f23443u.setPadding(b, 0, b, 0);
            }
        }

        public final void onPlayCompleted() {
            MBridgeVideoView mBridgeVideoView;
            super.onPlayCompleted();
            boolean unused = this.f23470a.f23435au = true;
            CampaignEx campaignEx = this.f23481l;
            if (campaignEx != null) {
                if (campaignEx.getVideoCompleteTime() > 0) {
                    this.f23470a.f23443u.setText(C8658p.m24799a(C8388a.m23845e().mo56913g(), "mbridge_reward_video_view_reward_time_complete", "string"));
                } else {
                    this.f23470a.f23443u.setText("0");
                }
                this.f23481l.setVideoPlayProgress(100);
                if (this.f23481l.getAdSpaceT() == 2) {
                    this.f23470a.f23444v.setVisibility(4);
                    if (this.f23470a.f23448z != null) {
                        this.f23470a.f23448z.setClickable(false);
                    }
                    if (this.f23470a.f23442t != null) {
                        this.f23470a.f23442t.setClickable(false);
                    }
                }
            } else {
                this.f23470a.f23443u.setText("0");
            }
            MediaEvents mediaEvents = this.f23474e;
            if (mediaEvents != null) {
                mediaEvents.complete();
                C8672v.m24874a("omsdk", "play:  videoEvents.complete()");
            }
            this.f23470a.f23441s.setClickable(false);
            String g = this.f23470a.m26921b(true);
            CampaignEx campaignEx2 = this.f23481l;
            if (campaignEx2 == null || campaignEx2.getDynamicTempCode() != 5 || (mBridgeVideoView = this.f23470a) == null || mBridgeVideoView.f23392C == null || this.f23470a.mCampaignSize <= this.f23470a.mCurrPlayNum) {
                this.f23470a.f23199e.mo62631a(121, "");
                this.f23470a.f23199e.mo62631a(11, g);
                int i = this.f23472c;
                this.f23471b = i;
                this.f23470a.mCurrentPlayProgressTime = i;
                boolean unused2 = MBridgeVideoView.f23384ai = true;
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("position", Integer.valueOf(this.f23470a.mCurrPlayNum));
            if (this.f23470a.mMuteSwitch != 0) {
                hashMap.put("mute", Integer.valueOf(this.f23470a.mMuteSwitch));
            }
            this.f23470a.f23392C.mo61387a(hashMap);
        }

        public final void onPlayError(String str) {
            C8672v.m24878d("DefaultVideoPlayerStatusListener", "errorStr" + str);
            super.onPlayError(str);
            MBridgeVideoView mBridgeVideoView = this.f23470a;
            if (mBridgeVideoView != null) {
                mBridgeVideoView.f23199e.mo62631a(12, str);
            }
        }

        /* JADX WARNING: type inference failed for: r0v81, types: [java.lang.CharSequence] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onPlayProgress(int r12, int r13) {
            /*
                r11 = this;
                super.onPlayProgress(r12, r13)
                com.mbridge.msdk.video.module.MBridgeVideoView r0 = r11.f23470a
                boolean r0 = r0.f23200f
                java.lang.String r1 = "DefaultVideoPlayerStatusListener"
                r2 = 1
                if (r0 == 0) goto L_0x019d
                r0 = 0
                com.mbridge.msdk.foundation.entity.CampaignEx r3 = r11.f23481l
                if (r3 == 0) goto L_0x0036
                int r0 = r3.getVideoCompleteTime()
                com.mbridge.msdk.foundation.b.b r3 = com.mbridge.msdk.foundation.p085b.C2470b.m6168a()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                com.mbridge.msdk.foundation.entity.CampaignEx r5 = r11.f23481l
                java.lang.String r5 = r5.getCampaignUnitId()
                r4.append(r5)
                java.lang.String r5 = "_"
                r4.append(r5)
                r4.append(r2)
                java.lang.String r4 = r4.toString()
                r3.mo16427b(r4, r12)
            L_0x0036:
                com.mbridge.msdk.foundation.entity.CampaignEx r3 = r11.f23481l
                boolean r3 = r3.isDynamicView()
                java.lang.String r4 = "0"
                java.lang.String r5 = "mbridge_reward_video_view_reward_time_complete"
                java.lang.String r6 = ""
                java.lang.String r7 = "mbridge_reward_video_view_reward_time_left"
                java.lang.String r8 = "string"
                if (r3 == 0) goto L_0x0106
                com.mbridge.msdk.foundation.entity.CampaignEx r3 = r11.f23481l
                int r3 = r3.getDynamicTempCode()
                r9 = 5
                if (r3 != r9) goto L_0x0106
                com.mbridge.msdk.video.module.MBridgeVideoView r3 = r11.f23470a     // Catch:{ Exception -> 0x00fc }
                int r3 = r3.f23393D     // Catch:{ Exception -> 0x00fc }
                com.mbridge.msdk.video.module.MBridgeVideoView r9 = r11.f23470a     // Catch:{ Exception -> 0x00fc }
                if (r9 != 0) goto L_0x005d
                goto L_0x019d
            L_0x005d:
                com.mbridge.msdk.video.module.MBridgeVideoView r9 = r11.f23470a     // Catch:{ Exception -> 0x00fc }
                android.content.Context r9 = r9.getContext()     // Catch:{ Exception -> 0x00fc }
                android.content.res.Resources r9 = r9.getResources()     // Catch:{ Exception -> 0x00fc }
                com.mbridge.msdk.foundation.controller.a r10 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x00fc }
                android.content.Context r10 = r10.mo56913g()     // Catch:{ Exception -> 0x00fc }
                int r5 = com.mbridge.msdk.foundation.tools.C8658p.m24799a(r10, r5, r8)     // Catch:{ Exception -> 0x00fc }
                java.lang.CharSequence r5 = r9.getText(r5)     // Catch:{ Exception -> 0x00fc }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x00fc }
                com.mbridge.msdk.video.module.MBridgeVideoView r9 = r11.f23470a     // Catch:{ Exception -> 0x00fc }
                android.content.Context r9 = r9.getContext()     // Catch:{ Exception -> 0x00fc }
                android.content.res.Resources r9 = r9.getResources()     // Catch:{ Exception -> 0x00fc }
                com.mbridge.msdk.foundation.controller.a r10 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x00fc }
                android.content.Context r10 = r10.mo56913g()     // Catch:{ Exception -> 0x00fc }
                int r7 = com.mbridge.msdk.foundation.tools.C8658p.m24799a(r10, r7, r8)     // Catch:{ Exception -> 0x00fc }
                java.lang.CharSequence r7 = r9.getText(r7)     // Catch:{ Exception -> 0x00fc }
                java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x00fc }
                if (r0 < 0) goto L_0x00ab
                int r0 = r0 - r12
                if (r0 > 0) goto L_0x009b
                goto L_0x00cf
            L_0x009b:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00fc }
                r3.<init>()     // Catch:{ Exception -> 0x00fc }
                r3.append(r0)     // Catch:{ Exception -> 0x00fc }
                r3.append(r7)     // Catch:{ Exception -> 0x00fc }
                java.lang.String r5 = r3.toString()     // Catch:{ Exception -> 0x00fc }
                goto L_0x00cf
            L_0x00ab:
                int r3 = r3 - r12
                if (r3 > 0) goto L_0x00b1
                if (r0 > 0) goto L_0x00cf
                goto L_0x00d0
            L_0x00b1:
                if (r0 > 0) goto L_0x00c3
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00fc }
                r0.<init>()     // Catch:{ Exception -> 0x00fc }
                r0.append(r3)     // Catch:{ Exception -> 0x00fc }
                r0.append(r6)     // Catch:{ Exception -> 0x00fc }
            L_0x00be:
                java.lang.String r5 = r0.toString()     // Catch:{ Exception -> 0x00fc }
                goto L_0x00cf
            L_0x00c3:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00fc }
                r0.<init>()     // Catch:{ Exception -> 0x00fc }
                r0.append(r3)     // Catch:{ Exception -> 0x00fc }
                r0.append(r7)     // Catch:{ Exception -> 0x00fc }
                goto L_0x00be
            L_0x00cf:
                r4 = r5
            L_0x00d0:
                com.mbridge.msdk.video.module.MBridgeVideoView$a r0 = r11.f23475f     // Catch:{ Exception -> 0x00fc }
                r0.f23467a = r12     // Catch:{ Exception -> 0x00fc }
                com.mbridge.msdk.video.module.MBridgeVideoView r0 = r11.f23470a     // Catch:{ Exception -> 0x00fc }
                android.widget.TextView r0 = r0.f23443u     // Catch:{ Exception -> 0x00fc }
                r0.setText(r4)     // Catch:{ Exception -> 0x00fc }
                com.mbridge.msdk.video.module.MBridgeVideoView r0 = r11.f23470a     // Catch:{ Exception -> 0x00fc }
                android.widget.ProgressBar r0 = r0.f23447y     // Catch:{ Exception -> 0x00fc }
                if (r0 == 0) goto L_0x019d
                com.mbridge.msdk.video.module.MBridgeVideoView r0 = r11.f23470a     // Catch:{ Exception -> 0x00fc }
                android.widget.ProgressBar r0 = r0.f23447y     // Catch:{ Exception -> 0x00fc }
                int r0 = r0.getVisibility()     // Catch:{ Exception -> 0x00fc }
                if (r0 != 0) goto L_0x019d
                com.mbridge.msdk.video.module.MBridgeVideoView r0 = r11.f23470a     // Catch:{ Exception -> 0x00fc }
                android.widget.ProgressBar r0 = r0.f23447y     // Catch:{ Exception -> 0x00fc }
                r0.setProgress(r12)     // Catch:{ Exception -> 0x00fc }
                goto L_0x019d
            L_0x00fc:
                r0 = move-exception
                java.lang.String r0 = r0.getMessage()
                com.mbridge.msdk.foundation.tools.C8672v.m24878d(r1, r0)
                goto L_0x019d
            L_0x0106:
                com.mbridge.msdk.video.module.MBridgeVideoView r3 = r11.f23470a
                if (r3 != 0) goto L_0x010c
                goto L_0x0199
            L_0x010c:
                if (r0 <= r13) goto L_0x010f
                r0 = r13
            L_0x010f:
                if (r0 > 0) goto L_0x0114
                int r3 = r13 - r12
                goto L_0x0116
            L_0x0114:
                int r3 = r0 - r12
            L_0x0116:
                if (r3 > 0) goto L_0x0139
                if (r0 > 0) goto L_0x011b
                goto L_0x0173
            L_0x011b:
                com.mbridge.msdk.video.module.MBridgeVideoView r0 = r11.f23470a
                android.content.Context r0 = r0.getContext()
                android.content.res.Resources r0 = r0.getResources()
                com.mbridge.msdk.foundation.controller.a r3 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
                android.content.Context r3 = r3.mo56913g()
                int r3 = com.mbridge.msdk.foundation.tools.C8658p.m24799a(r3, r5, r8)
                java.lang.CharSequence r0 = r0.getText(r3)
                r4 = r0
                java.lang.String r4 = (java.lang.String) r4
                goto L_0x0173
            L_0x0139:
                if (r0 > 0) goto L_0x0147
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                r0.append(r6)
                goto L_0x016e
            L_0x0147:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                com.mbridge.msdk.video.module.MBridgeVideoView r3 = r11.f23470a
                android.content.Context r3 = r3.getContext()
                android.content.res.Resources r3 = r3.getResources()
                com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
                android.content.Context r4 = r4.mo56913g()
                int r4 = com.mbridge.msdk.foundation.tools.C8658p.m24799a(r4, r7, r8)
                java.lang.CharSequence r3 = r3.getText(r4)
                java.lang.String r3 = (java.lang.String) r3
                r0.append(r3)
            L_0x016e:
                java.lang.String r0 = r0.toString()
                r4 = r0
            L_0x0173:
                com.mbridge.msdk.video.module.MBridgeVideoView r0 = r11.f23470a
                android.widget.TextView r0 = r0.f23443u
                r0.setText(r4)
                com.mbridge.msdk.video.module.MBridgeVideoView r0 = r11.f23470a
                android.widget.ProgressBar r0 = r0.f23447y
                if (r0 == 0) goto L_0x0199
                com.mbridge.msdk.video.module.MBridgeVideoView r0 = r11.f23470a
                android.widget.ProgressBar r0 = r0.f23447y
                int r0 = r0.getVisibility()
                if (r0 != 0) goto L_0x0199
                com.mbridge.msdk.video.module.MBridgeVideoView r0 = r11.f23470a
                android.widget.ProgressBar r0 = r0.f23447y
                r0.setProgress(r12)
            L_0x0199:
                com.mbridge.msdk.video.module.MBridgeVideoView$a r0 = r11.f23475f
                r0.f23467a = r12
            L_0x019d:
                r11.f23472c = r13
                com.mbridge.msdk.video.module.MBridgeVideoView$a r0 = r11.f23475f
                r0.f23468b = r13
                com.mbridge.msdk.video.module.MBridgeVideoView$a r0 = r11.f23475f
                com.mbridge.msdk.video.module.MBridgeVideoView r3 = r11.f23470a
                boolean r3 = r3.f23436av
                r0.f23469c = r3
                r11.f23471b = r12
                com.mbridge.msdk.video.module.MBridgeVideoView r0 = r11.f23470a
                r0.mCurrentPlayProgressTime = r12
                com.mbridge.msdk.video.module.MBridgeVideoView r0 = r11.f23470a
                com.mbridge.msdk.video.module.a.a r0 = r0.f23199e
                r3 = 15
                com.mbridge.msdk.video.module.MBridgeVideoView$a r4 = r11.f23475f
                r0.mo62631a(r3, r4)
                com.iab.omid.library.mmadbridge.adsession.media.MediaEvents r0 = r11.f23474e
                r3 = 100
                if (r0 == 0) goto L_0x020f
                int r4 = r12 * 100
                int r4 = r4 / r13
                int r5 = r12 + 1
                int r5 = r5 * r3
                int r5 = r5 / r13
                r6 = 25
                java.lang.String r7 = "omsdk"
                if (r4 > r6) goto L_0x01e2
                if (r6 >= r5) goto L_0x01e2
                boolean r6 = r11.f23476g
                if (r6 != 0) goto L_0x01e2
                r11.f23476g = r2
                r0.firstQuartile()
                java.lang.String r0 = "play:  videoEvents.firstQuartile()"
                com.mbridge.msdk.foundation.tools.C8672v.m24874a(r7, r0)
                goto L_0x020f
            L_0x01e2:
                r0 = 50
                if (r4 > r0) goto L_0x01f9
                if (r0 >= r5) goto L_0x01f9
                boolean r0 = r11.f23477h
                if (r0 != 0) goto L_0x01f9
                r11.f23477h = r2
                com.iab.omid.library.mmadbridge.adsession.media.MediaEvents r0 = r11.f23474e
                r0.midpoint()
                java.lang.String r0 = "play:  videoEvents.midpoint()"
                com.mbridge.msdk.foundation.tools.C8672v.m24874a(r7, r0)
                goto L_0x020f
            L_0x01f9:
                r0 = 75
                if (r4 > r0) goto L_0x020f
                if (r0 >= r5) goto L_0x020f
                boolean r0 = r11.f23478i
                if (r0 != 0) goto L_0x020f
                r11.f23478i = r2
                com.iab.omid.library.mmadbridge.adsession.media.MediaEvents r0 = r11.f23474e
                r0.thirdQuartile()
                java.lang.String r0 = "play:  videoEvents.thirdQuartile()"
                com.mbridge.msdk.foundation.tools.C8672v.m24874a(r7, r0)
            L_0x020f:
                com.mbridge.msdk.video.module.MBridgeVideoView r0 = r11.f23470a
                boolean r0 = r0.f23423ah
                if (r0 == 0) goto L_0x022e
                com.mbridge.msdk.video.module.MBridgeVideoView r0 = r11.f23470a
                boolean r0 = r0.f23431aq
                if (r0 != 0) goto L_0x022e
                com.mbridge.msdk.video.module.MBridgeVideoView r0 = r11.f23470a
                int r0 = r0.f23428an
                int r4 = com.mbridge.msdk.foundation.same.C8469a.f20754o
                if (r0 != r4) goto L_0x022e
                com.mbridge.msdk.video.module.MBridgeVideoView r0 = r11.f23470a
                r0.m26922b()
            L_0x022e:
                com.mbridge.msdk.video.module.MBridgeVideoView r0 = r11.f23470a     // Catch:{ all -> 0x027b }
                if (r0 == 0) goto L_0x0250
                com.mbridge.msdk.video.module.MBridgeVideoView r0 = r11.f23470a     // Catch:{ all -> 0x027b }
                com.mbridge.msdk.dycreator.baseview.cusview.MBridgeSegmentsProgressBar r0 = r0.f23390A     // Catch:{ all -> 0x027b }
                if (r0 == 0) goto L_0x0250
                int r0 = r12 * 100
                int r0 = r0 / r13
                com.mbridge.msdk.video.module.MBridgeVideoView r4 = r11.f23470a     // Catch:{ all -> 0x027b }
                com.mbridge.msdk.dycreator.baseview.cusview.MBridgeSegmentsProgressBar r4 = r4.f23390A     // Catch:{ all -> 0x027b }
                com.mbridge.msdk.video.module.MBridgeVideoView r5 = r11.f23470a     // Catch:{ all -> 0x027b }
                int r5 = r5.mCurrPlayNum     // Catch:{ all -> 0x027b }
                int r5 = r5 - r2
                r4.setProgress(r0, r5)     // Catch:{ all -> 0x027b }
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r11.f23481l     // Catch:{ all -> 0x027b }
                r4.setVideoPlayProgress(r0)     // Catch:{ all -> 0x027b }
            L_0x0250:
                com.mbridge.msdk.video.module.MBridgeVideoView r0 = r11.f23470a     // Catch:{ all -> 0x027b }
                if (r0 == 0) goto L_0x0283
                com.mbridge.msdk.video.module.MBridgeVideoView r0 = r11.f23470a     // Catch:{ all -> 0x027b }
                int r0 = r0.f23398I     // Catch:{ all -> 0x027b }
                r4 = -1
                if (r0 == r4) goto L_0x0283
                com.mbridge.msdk.video.module.MBridgeVideoView r0 = r11.f23470a     // Catch:{ all -> 0x027b }
                int r0 = r0.f23398I     // Catch:{ all -> 0x027b }
                if (r12 != r0) goto L_0x0283
                com.mbridge.msdk.video.module.MBridgeVideoView r0 = r11.f23470a     // Catch:{ all -> 0x027b }
                com.mbridge.msdk.foundation.entity.CampaignEx r0 = r0.f23196b     // Catch:{ all -> 0x027b }
                if (r0 == 0) goto L_0x0283
                com.mbridge.msdk.video.module.MBridgeVideoView r0 = r11.f23470a     // Catch:{ all -> 0x027b }
                com.mbridge.msdk.foundation.entity.CampaignEx r0 = r0.f23196b     // Catch:{ all -> 0x027b }
                boolean r0 = r0.isDynamicView()     // Catch:{ all -> 0x027b }
                if (r0 == 0) goto L_0x0283
                com.mbridge.msdk.video.module.MBridgeVideoView r0 = r11.f23470a     // Catch:{ all -> 0x027b }
                r0.setCTALayoutVisibleOrGone()     // Catch:{ all -> 0x027b }
                goto L_0x0283
            L_0x027b:
                r0 = move-exception
                java.lang.String r0 = r0.getMessage()
                com.mbridge.msdk.foundation.tools.C8672v.m24878d(r1, r0)
            L_0x0283:
                int r0 = r11.f23482m
                if (r0 == r3) goto L_0x0326
                boolean r4 = r11.f23484o
                if (r4 != 0) goto L_0x0326
                if (r0 != 0) goto L_0x028e
                return
            L_0x028e:
                int r4 = r11.f23483n
                if (r4 <= r0) goto L_0x0296
                int r0 = r0 / 2
                r11.f23483n = r0
            L_0x0296:
                int r0 = r11.f23483n
                if (r0 < 0) goto L_0x0326
                int r13 = r13 * r0
                int r13 = r13 / r3
                if (r12 < r13) goto L_0x0326
                com.mbridge.msdk.foundation.entity.CampaignEx r12 = r11.f23481l
                int r12 = r12.getAdType()
                r0 = 94
                if (r12 == r0) goto L_0x02d8
                com.mbridge.msdk.foundation.entity.CampaignEx r12 = r11.f23481l
                int r12 = r12.getAdType()
                r0 = 287(0x11f, float:4.02E-43)
                if (r12 != r0) goto L_0x02b3
                goto L_0x02d8
            L_0x02b3:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                com.mbridge.msdk.foundation.entity.CampaignEx r0 = r11.f23481l
                java.lang.String r0 = r0.getId()
                r12.append(r0)
                com.mbridge.msdk.foundation.entity.CampaignEx r0 = r11.f23481l
                java.lang.String r0 = r0.getVideoUrlEncode()
                r12.append(r0)
                com.mbridge.msdk.foundation.entity.CampaignEx r0 = r11.f23481l
                java.lang.String r0 = r0.getBidToken()
                r12.append(r0)
                java.lang.String r12 = r12.toString()
                goto L_0x02fc
            L_0x02d8:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                com.mbridge.msdk.foundation.entity.CampaignEx r0 = r11.f23481l
                java.lang.String r0 = r0.getRequestId()
                r12.append(r0)
                com.mbridge.msdk.foundation.entity.CampaignEx r0 = r11.f23481l
                java.lang.String r0 = r0.getId()
                r12.append(r0)
                com.mbridge.msdk.foundation.entity.CampaignEx r0 = r11.f23481l
                java.lang.String r0 = r0.getVideoUrlEncode()
                r12.append(r0)
                java.lang.String r12 = r12.toString()
            L_0x02fc:
                com.mbridge.msdk.videocommon.download.c r0 = com.mbridge.msdk.videocommon.download.C9645c.getInstance()
                java.lang.String r3 = r11.f23480k
                com.mbridge.msdk.videocommon.download.a r12 = r0.mo63652a(r3, r12)
                if (r12 == 0) goto L_0x0326
                r12.mo63643j()
                r11.f23484o = r2
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r0 = "CDRate is : "
                r12.append(r0)
                r12.append(r13)
                java.lang.String r13 = " and start download !"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                com.mbridge.msdk.foundation.tools.C8672v.m24878d(r1, r12)
            L_0x0326:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeVideoView.C9472b.onPlayProgress(int, int):void");
        }

        public final void onBufferingStart(String str) {
            try {
                super.onBufferingStart(str);
                if (this.f23474e != null) {
                    this.f23474e.bufferStart();
                }
                this.f23470a.f23199e.mo62631a(13, "");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public final void onBufferingEnd() {
            try {
                super.onBufferingEnd();
                if (this.f23474e != null) {
                    this.f23474e.bufferFinish();
                    C8672v.m24874a("omsdk", "play:  videoEvents.bufferFinish()");
                }
                this.f23470a.f23199e.mo62631a(14, "");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public final void onPlaySetDataSourceError(String str) {
            super.onPlaySetDataSourceError(str);
        }

        /* renamed from: b */
        public final void mo63204b() {
            this.f23470a = null;
            boolean unused = MBridgeVideoView.f23384ai = false;
        }
    }

    /* renamed from: com.mbridge.msdk.video.module.MBridgeVideoView$a */
    public static class C9471a {

        /* renamed from: a */
        public int f23467a;

        /* renamed from: b */
        public int f23468b;

        /* renamed from: c */
        public boolean f23469c;

        public final String toString() {
            return "ProgressData{curPlayPosition=" + this.f23467a + ", allDuration=" + this.f23468b + '}';
        }
    }

    public void onBackPress() {
        if (!this.f23416aa && !this.f23400K && !this.f23432ar) {
            if (this.f23417ab) {
                m26922b();
            } else if (this.f23418ac && this.f23419ad) {
                m26922b();
            } else if (!this.f23418ac && this.f23420ae) {
                m26922b();
            }
        }
    }

    public void notifyCloseBtn(int i) {
        if (i == 0) {
            this.f23418ac = true;
            this.f23420ae = false;
        } else if (i == 1) {
            this.f23419ad = true;
        }
    }

    public void showIVRewardAlertView(String str) {
        this.f23199e.mo62631a(8, "");
    }

    public void notifyVideoClose() {
        this.f23199e.mo62631a(2, "");
    }

    public void setAdSession(AdSession adSession) {
        this.f23425ak = adSession;
    }

    public void setVideoEvents(MediaEvents mediaEvents) {
        this.f23426al = mediaEvents;
        C9472b bVar = this.f23413aA;
        if (bVar != null) {
            MediaEvents unused = bVar.f23474e = mediaEvents;
        }
    }

    public int getMute() {
        return this.f23424aj;
    }

    public void setIVRewardEnable(int i, int i2, int i3) {
        this.f23428an = i;
        this.f23429ao = i2;
        this.f23430ap = i3;
    }

    public void setDialogRole(int i) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        this.f23434at = z;
        C8672v.m24878d(MBridgeBaseView.TAG, i + " " + this.f23434at);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public String m26921b(boolean z) {
        if (!this.f23423ah) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (!this.f23431aq) {
                jSONObject.put("Alert_window_status", C8469a.f20757r);
            }
            if (this.f23433as) {
                jSONObject.put("Alert_window_status", C8469a.f20759t);
            }
            if (this.f23432ar) {
                jSONObject.put("Alert_window_status", C8469a.f20758s);
            }
            jSONObject.put("complete_info", z ? 1 : 2);
            return jSONObject.toString();
        } catch (Exception unused) {
            C8672v.m24878d(MBridgeBaseView.TAG, "getIVRewardStatusString ERROR");
            return "";
        }
    }

    public void setNotchPadding(int i, int i2, int i3, int i4) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("NOTCH VideoView ");
            boolean z = false;
            sb.append(String.format("%1s-%2s-%3s-%4s", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}));
            C8672v.m24878d(MBridgeBaseView.TAG, sb.toString());
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
            if (Math.max(Math.max(layoutParams.leftMargin, layoutParams.rightMargin), Math.max(layoutParams.topMargin, layoutParams.bottomMargin)) > Math.max(Math.max(i, i2), Math.max(i3, i4))) {
                z = true;
            }
            if (!z && this.f23445w != null) {
                final int i5 = i;
                final int i6 = i3;
                final int i7 = i2;
                final int i8 = i4;
                this.f23445w.postDelayed(new Runnable() {
                    public final void run() {
                        if (MBridgeVideoView.this.f23445w != null) {
                            MBridgeVideoView.this.f23445w.setVisibility(0);
                            if (MBridgeVideoView.this.f23196b != null && MBridgeVideoView.this.f23196b.getAdSpaceT() != 2) {
                                MBridgeVideoView.this.f23445w.setPadding(i5, i6, i7, i8);
                                MBridgeVideoView.this.f23445w.startAnimation(MBridgeVideoView.this.f23439ay);
                            }
                        }
                    }
                }, 200);
            }
            if (this.f23443u.getVisibility() == 0) {
                m26944j();
            }
        } catch (Exception e) {
            C8672v.m24878d(MBridgeBaseView.TAG, e.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m26944j() {
        if (C2470b.m6168a().mo16428b()) {
            this.f23196b.setCampaignUnitId(this.f23407R);
            C2470b a = C2470b.m6168a();
            a.mo16423a(this.f23407R + "_" + 1, this.f23196b);
            if (this.f23448z != null) {
                C2470b a2 = C2470b.m6168a();
                a2.mo16424a(this.f23407R + "_" + 1, this.f23448z);
                return;
            }
            return;
        }
        FeedBackButton feedBackButton = this.f23448z;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m26918a(String str) {
        C8481b.m24310a(C8388a.m23845e().mo56913g()).mo57883a(str, (C8484c) new C8484c() {
            public final void onSuccessLoad(Bitmap bitmap, String str) {
                if (bitmap != null) {
                    try {
                        if (!bitmap.isRecycled() && MBridgeVideoView.this.f23446x != null) {
                            MBridgeVideoView.this.f23446x.setVisibility(0);
                            MBridgeVideoView.this.f23446x.setImageBitmap(C9363a.m26695a().mo62878a(bitmap, 20));
                        }
                    } catch (Throwable th) {
                        C8672v.m24878d(MBridgeBaseView.TAG, th.getMessage());
                    }
                }
            }

            public final void onFailedLoad(String str, String str2) {
                C8672v.m24878d(MBridgeBaseView.TAG, str);
            }
        });
    }

    public void setCTALayoutVisibleOrGone() {
        if (this.f23196b != null && this.f23196b.isDynamicView() && this.f23395F != null && this.f23398I >= -1 && this.f23196b.getDynamicTempCode() == 5) {
            MBridgeClickCTAView mBridgeClickCTAView = this.f23396G;
            if (mBridgeClickCTAView == null && this.f23395F != null) {
                if (mBridgeClickCTAView == null) {
                    MBridgeClickCTAView mBridgeClickCTAView2 = new MBridgeClickCTAView(getContext());
                    this.f23396G = mBridgeClickCTAView2;
                    mBridgeClickCTAView2.setCampaign(this.f23196b);
                    this.f23396G.setUnitId(this.f23407R);
                    if (this.f23391B != null) {
                        this.f23396G.setNotifyListener(new C9483i(this.f23391B));
                    }
                    this.f23396G.preLoadData(this.f23397H);
                }
                this.f23395F.addView(this.f23396G);
            }
            int i = this.f23398I;
            if (i >= 0) {
                this.f23395F.setVisibility(0);
            } else if (i != -1) {
            } else {
                if (this.f23395F.getVisibility() != 0) {
                    this.f23395F.setVisibility(0);
                    postDelayed(this.f23415aC, 3000);
                    return;
                }
                this.f23395F.setVisibility(8);
                getHandler().removeCallbacks(this.f23415aC);
            }
        }
    }

    public void showMoreOfferInPlayTemplate() {
        if (this.f23196b != null && this.f23399J != null && this.f23196b.isDynamicView() && this.f23196b.getRewardTemplateMode() != null) {
            String e = this.f23196b.getRewardTemplateMode().mo57576e();
            if (!TextUtils.isEmpty(e)) {
                try {
                    String a = C8617ae.m24720a(e, "mof");
                    if (!TextUtils.isEmpty(a) && Integer.parseInt(a) == 1) {
                        C9391a.m26760a().mo62919a(this.f23196b, (ViewGroup) this, (C9473a) new C9483i(this.f23391B));
                    }
                } catch (Exception e2) {
                    C8672v.m24878d(MBridgeBaseView.TAG, e2.getMessage());
                }
            }
        }
    }

    public void showBaitClickView() {
        int parseInt;
        if (this.f23196b != null && this.f23196b.isDynamicView() && this.f23196b.getRewardTemplateMode() != null) {
            String e = this.f23196b.getRewardTemplateMode().mo57576e();
            if (!TextUtils.isEmpty(e)) {
                try {
                    String a = C8617ae.m24720a(e, "bait_click");
                    if (!TextUtils.isEmpty(a) && (parseInt = Integer.parseInt(a)) != 0 && this.f23440az != null) {
                        this.f23440az.setVisibility(0);
                        this.f23440az.init(parseInt);
                        this.f23440az.startAnimation();
                        this.f23440az.setOnClickListener(new View.OnClickListener() {
                            public final void onClick(View view) {
                                if (MBridgeVideoView.this.f23199e != null) {
                                    MBridgeVideoView.this.f23199e.mo62631a(1, "");
                                }
                            }
                        });
                    }
                } catch (Exception e2) {
                    C8672v.m24878d(MBridgeBaseView.TAG, e2.getMessage());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            if (this.f23415aC != null) {
                getHandler().removeCallbacks(this.f23415aC);
            }
        } catch (Throwable th) {
            C8672v.m24878d(MBridgeBaseView.TAG, th.getMessage());
        }
    }

    public void releasePlayer() {
        try {
            if (this.f23441s != null && !this.f23412W) {
                this.f23441s.release();
            }
            if (this.f23413aA != null) {
                this.f23413aA.mo63204b();
            }
            if (this.f23391B != null) {
                this.f23391B = null;
            }
        } catch (Exception e) {
            C8672v.m24878d(MBridgeBaseView.TAG, e.getMessage());
        }
    }
}
