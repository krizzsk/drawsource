package com.mbridge.msdk.video.p347bt.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import androidx.core.app.NotificationCompat;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.iab.omid.library.mmadbridge.adsession.media.Position;
import com.iab.omid.library.mmadbridge.adsession.media.VastProperties;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p085b.C2462a;
import com.mbridge.msdk.foundation.p085b.C2470b;
import com.mbridge.msdk.foundation.same.C8469a;
import com.mbridge.msdk.foundation.same.report.C8582d;
import com.mbridge.msdk.foundation.tools.C8646l;
import com.mbridge.msdk.foundation.tools.C8658p;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.mbsignalcommon.mraid.C8874c;
import com.mbridge.msdk.mbsignalcommon.mraid.C8875d;
import com.mbridge.msdk.mbsignalcommon.windvane.C8887g;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.p075a.C2427b;
import com.mbridge.msdk.p078c.C2445b;
import com.mbridge.msdk.video.dynview.p354d.C9322a;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.module.p367a.p368a.C9474a;
import com.mbridge.msdk.video.module.p367a.p368a.C9475b;
import com.mbridge.msdk.video.module.p367a.p368a.C9476c;
import com.mbridge.msdk.video.module.p367a.p368a.C9480f;
import com.mbridge.msdk.video.module.p367a.p368a.C9482h;
import com.mbridge.msdk.video.module.p367a.p368a.C9491m;
import com.mbridge.msdk.video.module.p367a.p368a.C9494n;
import com.mbridge.msdk.video.module.p369b.C9499b;
import com.mbridge.msdk.video.p347bt.module.p349a.C9302b;
import com.mbridge.msdk.video.p347bt.module.p350b.C9305c;
import com.mbridge.msdk.video.p347bt.module.p350b.C9306d;
import com.mbridge.msdk.video.p347bt.module.p350b.C9307e;
import com.mbridge.msdk.video.p347bt.module.p350b.C9311h;
import com.mbridge.msdk.video.p347bt.p348a.C9261c;
import com.mbridge.msdk.video.signal.C9521c;
import com.mbridge.msdk.video.signal.container.AbstractJSContainer;
import com.mbridge.msdk.video.signal.factory.C9618b;
import com.mbridge.msdk.video.signal.p371a.C9505c;
import com.mbridge.msdk.video.signal.p371a.C9514j;
import com.mbridge.msdk.videocommon.C9625a;
import com.mbridge.msdk.videocommon.download.C9641a;
import com.mbridge.msdk.videocommon.p375d.C9637a;
import com.mbridge.msdk.videocommon.p375d.C9638b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer */
public class MBTempContainer extends AbstractJSContainer {
    /* access modifiers changed from: private */

    /* renamed from: y */
    public static final String f22652y = MBTempContainer.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: A */
    public CampaignEx f22653A;

    /* renamed from: B */
    private C9641a f22654B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C9311h f22655C;

    /* renamed from: D */
    private C9302b f22656D;

    /* renamed from: E */
    private C9322a f22657E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public int f22658F = 1;

    /* renamed from: G */
    private String f22659G = "";

    /* renamed from: H */
    private C9618b f22660H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public int f22661I = C8469a.f20757r;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public int f22662J;

    /* renamed from: K */
    private boolean f22663K = false;

    /* renamed from: L */
    private int f22664L;

    /* renamed from: M */
    private int f22665M;

    /* renamed from: N */
    private int f22666N;

    /* renamed from: O */
    private int f22667O;

    /* renamed from: P */
    private int f22668P;

    /* renamed from: Q */
    private String f22669Q = "";

    /* renamed from: R */
    private String f22670R;

    /* renamed from: S */
    private List<CampaignEx> f22671S = new ArrayList();

    /* renamed from: T */
    private int f22672T = 0;

    /* renamed from: U */
    private LayoutInflater f22673U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public int f22674V = 0;

    /* renamed from: W */
    private int f22675W = 0;

    /* renamed from: a */
    protected boolean f22676a = false;
    /* access modifiers changed from: private */

    /* renamed from: aa */
    public View f22677aa;

    /* renamed from: ab */
    private boolean f22678ab = false;
    /* access modifiers changed from: private */

    /* renamed from: ac */
    public boolean f22679ac = false;

    /* renamed from: ad */
    private boolean f22680ad = false;

    /* renamed from: ae */
    private boolean f22681ae;

    /* renamed from: af */
    private boolean f22682af = false;
    /* access modifiers changed from: private */

    /* renamed from: ag */
    public boolean f22683ag = false;
    /* access modifiers changed from: private */

    /* renamed from: ah */
    public boolean f22684ah = false;
    /* access modifiers changed from: private */

    /* renamed from: ai */
    public boolean f22685ai = false;
    /* access modifiers changed from: private */

    /* renamed from: aj */
    public boolean f22686aj = false;

    /* renamed from: ak */
    private boolean f22687ak = false;

    /* renamed from: al */
    private C8875d f22688al;

    /* renamed from: am */
    private AdSession f22689am = null;
    /* access modifiers changed from: private */

    /* renamed from: an */
    public MediaEvents f22690an = null;
    /* access modifiers changed from: private */

    /* renamed from: ao */
    public Runnable f22691ao = new Runnable() {
        public final void run() {
            if (MBTempContainer.this.f22677aa != null) {
                MBTempContainer.this.f22677aa.setVisibility(8);
            }
        }
    };

    /* renamed from: b */
    protected boolean f22692b = false;

    /* renamed from: c */
    protected C9274a f22693c = new C9274a.C9275a();

    /* renamed from: d */
    protected WindVaneWebView f22694d;

    /* renamed from: e */
    protected MBridgeVideoView f22695e;

    /* renamed from: f */
    protected MBridgeContainerView f22696f;

    /* renamed from: g */
    protected Handler f22697g = new Handler();

    /* renamed from: h */
    protected Runnable f22698h = new Runnable() {
        public final void run() {
            if (MBTempContainer.this.getActivityProxy().mo63237h() == 0) {
                MBTempContainer.this.defaultLoad(-1, "WebView load timeout");
            } else {
                int unused = MBTempContainer.this.f22674V = -3;
            }
        }
    };

    /* renamed from: i */
    protected Runnable f22699i = new Runnable() {
        public final void run() {
            if (MBTempContainer.this.getActivityProxy().mo63237h() == 0) {
                MBTempContainer.this.defaultLoad(-3, "Signal Communication connect timeout");
            } else {
                int unused = MBTempContainer.this.f22674V = -4;
            }
        }
    };

    /* renamed from: z */
    private View f22700z;

    public void preload() {
    }

    public void setMediaPlayerUrl(String str) {
    }

    public MBTempContainer(Context context) {
        super(context);
        init(context);
    }

    public MBTempContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public void init(Context context) {
        this.f22673U = LayoutInflater.from(context);
    }

    public void setMatchParent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        layoutParams.height = -1;
        layoutParams.width = -1;
    }

    public void setCampOrderViewData(List<CampaignEx> list, int i) {
        if (list != null) {
            this.f22671S = list;
        }
        this.f22672T = i;
    }

    public void registerErrorListener(C9274a aVar) {
        this.f22693c = aVar;
    }

    public int findID(String str) {
        return C8658p.m24799a(getContext(), str, "id");
    }

    public int findLayout(String str) {
        return C8658p.m24799a(getContext(), str, "layout");
    }

    /* renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer$a */
    public interface C9274a {
        /* renamed from: a */
        void mo62629a(String str);

        /* renamed from: a */
        void mo62630a(boolean z);

        /* renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer$a$a */
        public static class C9275a implements C9274a {

            /* renamed from: a */
            private boolean f22709a = false;

            /* renamed from: a */
            public void mo62629a(String str) {
                C8672v.m24878d("ActivityErrorListener", str);
                this.f22709a = true;
            }

            /* renamed from: a */
            public final void mo62630a(boolean z) {
                this.f22709a = z;
            }
        }
    }

    public boolean isLoadSuccess() {
        return this.f22692b;
    }

    /* renamed from: c */
    private int m26303c() {
        C9514j b = mo63475b(this.f22653A);
        if (b != null) {
            return b.mo63263j();
        }
        return 0;
    }

    /* renamed from: d */
    private boolean m26308d() {
        C9514j b = mo63475b(this.f22653A);
        if (b != null) {
            return b.mo63266m();
        }
        return false;
    }

    /* renamed from: e */
    private boolean m26310e() {
        MBridgeVideoView mBridgeVideoView = this.f22695e;
        if (mBridgeVideoView != null) {
            return mBridgeVideoView.isShowingAlertView();
        }
        return false;
    }

    public void superDefaultLoad(int i, String str) {
        this.f22697g.removeCallbacks(this.f22698h);
        this.f22697g.removeCallbacks(this.f22699i);
        this.f22693c.mo62630a(true);
        WindVaneWebView windVaneWebView = this.f22694d;
        if (windVaneWebView != null) {
            windVaneWebView.setVisibility(8);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62581a(String str) {
        C9311h hVar = this.f22655C;
        if (hVar != null) {
            hVar.mo61309a(str);
        }
        super.mo62581a(str);
    }

    public void onPause() {
        super.onPause();
        this.f22680ad = true;
        try {
            getJSVideoModule().videoOperate(2);
            if (this.f22696f != null) {
                this.f22696f.setOnPause();
            }
        } catch (Throwable th) {
            C8672v.m24875a(f22652y, th.getMessage(), th);
        }
    }

    public void onResume() {
        Runnable runnable;
        super.onResume();
        int i = this.f22674V;
        if (i == -3) {
            runnable = this.f22698h;
        } else {
            runnable = i == -4 ? this.f22699i : null;
        }
        if (runnable != null) {
            runnable.run();
            this.f22674V = 0;
        }
        try {
            if (this.f22695e != null && !m26310e() && !this.f22695e.isMiniCardShowing() && !C2470b.f5205c) {
                this.f22695e.setCover(false);
            }
            if (this.f22696f != null) {
                this.f22696f.setOnResume();
            }
            if (this.f22680ad && !m26310e() && !C2470b.f5205c) {
                getJSVideoModule().videoOperate(1);
            }
            if (this.f23864j != null) {
                C8677z.m24915a(this.f23864j.getWindow().getDecorView());
            }
            if (this.f22682af && this.f22683ag && this.f23864j != null) {
                this.f23864j.finish();
            }
        } catch (Throwable th) {
            C8672v.m24875a(f22652y, th.getMessage(), th);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void onStop() {
        super.onStop();
        MBridgeVideoView mBridgeVideoView = this.f22695e;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.setCover(true);
        }
    }

    public void onDestroy() {
        if (!this.f22663K) {
            boolean z = true;
            this.f22663K = true;
            super.onDestroy();
            try {
                if (this.f22695e != null) {
                    this.f22695e.releasePlayer();
                }
                if (this.f22694d != null) {
                    ViewGroup viewGroup = (ViewGroup) this.f22694d.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeAllViews();
                    }
                    this.f22694d.clearWebView();
                    this.f22694d.release();
                }
                if (this.f22656D != null) {
                    this.f22656D = null;
                }
                this.f22697g.removeCallbacks(this.f22698h);
                this.f22697g.removeCallbacks(this.f22699i);
                getJSCommon().mo63254e();
                if (this.f23872r) {
                    C2445b.m6020a().mo16293e(this.f23865k);
                }
                if (!this.f22678ab) {
                    this.f22678ab = true;
                    if (this.f22653A != null && this.f22653A.getPlayable_ads_without_video() == 2) {
                        this.f22679ac = true;
                    }
                    if (this.f22655C != null) {
                        if (this.f23872r && (this.f23874t == C8469a.f20753n || this.f23874t == C8469a.f20754o)) {
                            C9311h hVar = this.f22655C;
                            if (this.f22662J != 1) {
                                z = false;
                            }
                            hVar.mo61311a(z, this.f22661I);
                        }
                        if (!this.f22679ac) {
                            this.f23869o.mo63525a(0);
                        }
                        this.f22655C.mo61312a(this.f22679ac, this.f23869o);
                    }
                    this.f22697g.removeCallbacks(this.f22691ao);
                    if (((!this.f23872r && !this.f23877w) || (this.f22653A != null && this.f22653A.isDynamicView())) && this.f22679ac) {
                        C8672v.m24874a(f22652y, "sendToServerRewardInfo");
                        C9499b.m27023a(this.f22653A, this.f23869o, this.f23865k, this.f23868n, this.f22670R);
                    }
                    if (!this.f23877w) {
                        if (this.f23872r) {
                            C9625a.m27304b(287, this.f22653A);
                        } else {
                            C9625a.m27304b(94, this.f22653A);
                        }
                    }
                    if (this.f22696f != null) {
                        this.f22696f.release();
                    }
                }
            } catch (Throwable th) {
                C8672v.m24874a(f22652y, th.getMessage());
                return;
            }
            if (!this.f22681ae) {
                m26313f();
            }
            if (this.f22688al != null) {
                this.f22688al.mo58643d();
            }
            if (this.f22689am != null) {
                this.f22689am.removeAllFriendlyObstructions();
                this.f22689am.finish();
                this.f22689am = null;
            }
            if (!this.f23877w) {
                if (isLoadSuccess()) {
                    this.f22697g.postDelayed(new Runnable() {
                        public final void run() {
                            if (MBTempContainer.this.f23864j != null) {
                                MBTempContainer.this.f23864j.finish();
                            }
                        }
                    }, 100);
                } else if (this.f23864j != null) {
                    this.f23864j.finish();
                }
            }
            if (!this.f22681ae) {
                m26313f();
            }
            C9261c.m26212a().mo62523f(this.f22659G);
        }
    }

    /* renamed from: f */
    private void m26313f() {
        C8582d dVar = new C8582d(getContext());
        CampaignEx campaignEx = this.f22653A;
        if (campaignEx != null) {
            dVar.mo58070a(campaignEx.getRequestId(), this.f22653A.getRequestIdNotice(), this.f22653A.getId(), this.f23865k, C8874c.m25636a(this.f22653A.getId()), this.f22653A.isBidCampaign());
            C8874c.m25637b(this.f22653A.getId());
            this.f22681ae = true;
        }
    }

    public void setShowingTransparent() {
        int a;
        boolean d = m26308d();
        this.f22682af = d;
        if (!d && (a = C8658p.m24799a(getContext(), "mbridge_reward_theme", "style")) > 1 && this.f23864j != null) {
            this.f23864j.setTheme(a);
        }
    }

    /* renamed from: g */
    private void m26316g() {
        AdSession adSession = this.f22689am;
        if (adSession != null) {
            try {
                adSession.addFriendlyObstruction(this.f22696f, FriendlyObstructionPurpose.OTHER, (String) null);
                if (this.f22677aa != null) {
                    this.f22689am.addFriendlyObstruction(this.f22677aa, FriendlyObstructionPurpose.OTHER, (String) null);
                }
                if (this.f22694d != null) {
                    this.f22689am.addFriendlyObstruction(this.f22694d, FriendlyObstructionPurpose.OTHER, (String) null);
                }
                AdEvents createAdEvents = AdEvents.createAdEvents(this.f22689am);
                this.f22690an = MediaEvents.createMediaEvents(this.f22689am);
                this.f22689am.start();
                createAdEvents.loaded(VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE));
                this.f22695e.setVideoEvents(this.f22690an);
                if (createAdEvents != null) {
                    createAdEvents.impressionOccurred();
                }
            } catch (Exception e) {
                C8672v.m24874a("omsdk", e.getMessage());
            }
        }
    }

    public void receiveSuccess() {
        C8672v.m24874a(f22652y, "receiveSuccess ,start hybrid");
        this.f22697g.removeCallbacks(this.f22699i);
        this.f22697g.postDelayed(this.f22691ao, 250);
    }

    public void defaultLoad(int i, String str) {
        int i2;
        int i3;
        int i4;
        superDefaultLoad(i, str);
        if (isLoadSuccess()) {
            if (this.f22653A.getPlayable_ads_without_video() == 2) {
                this.f22696f.setCampaign(this.f22653A);
                this.f22696f.addOrderViewData(this.f22671S);
                this.f22696f.setUnitID(this.f23865k);
                if (this.f22653A.getCbd() > -2) {
                    i4 = this.f22653A.getCbd();
                } else {
                    i4 = this.f23867m.mo63594n();
                }
                this.f22696f.setCloseDelayTime(i4);
                this.f22696f.setPlayCloseBtnTm(this.f23867m.mo63582h());
                this.f22696f.setNotifyListener(new C9482h(this.f22653A, this.f22654B, this.f23869o, mo63476b(), this.f23865k, new C9277c(), this.f23867m.mo63614x(), this.f23877w));
                this.f22696f.preLoadData(this.f22660H);
                this.f22696f.showPlayableView();
            } else {
                m26298a(i, str);
                this.f22677aa.setVisibility(8);
                loadModuleDatas();
                int f = this.f23867m.mo63578f();
                int c = m26303c();
                int i5 = c != 0 ? c : f;
                CampaignEx campaignEx = this.f22653A;
                if (campaignEx != null && campaignEx.isDynamicView()) {
                    this.f22695e.setContainerViewOnNotifyListener(new C9276b(this.f23864j, this.f22653A));
                }
                CampaignEx campaignEx2 = this.f22653A;
                if (campaignEx2 == null || campaignEx2.getVst() <= -2) {
                    i2 = this.f23867m.mo63576e();
                } else {
                    i2 = this.f22653A.getVst();
                }
                if (this.f22653A.getDynamicTempCode() == 5 && (i3 = this.f22658F) > 1) {
                    i2 = m26294a(i2, i3);
                    this.f22653A.setVst(i2);
                }
                int i6 = i2;
                this.f22695e.setVideoSkipTime(i6);
                this.f22695e.setNotifyListener(new C9491m(this.f22695e, this.f22696f, this.f22653A, this.f23869o, this.f22654B, mo63476b(), this.f23865k, i5, i6, new C9279e(), this.f23867m.mo63614x(), this.f23877w, this.f23867m.mo63560B()));
                this.f22695e.defaultShow();
                this.f22696f.setNotifyListener(new C9475b(this.f22695e, this.f22696f, this.f22653A, this.f23869o, this.f22654B, mo63476b(), this.f23865k, new C9276b(this.f23864j, this.f22653A), this.f23867m.mo63614x(), this.f23877w));
                this.f22696f.defaultShow();
            }
            m26316g();
            return;
        }
        m26298a(i, str);
        if (this.f23864j != null) {
            this.f23864j.finish();
        }
    }

    public int getLayoutID() {
        return findLayout(this.f22682af ? "mbridge_reward_activity_video_templete_transparent" : "mbridge_reward_activity_video_templete");
    }

    public WindVaneWebView findWindVaneWebView() {
        C9625a.C9626a aVar;
        try {
            if (!this.f23877w) {
                if (this.f23872r) {
                    aVar = C9625a.m27299a(287, this.f22653A);
                } else {
                    aVar = C9625a.m27299a(94, this.f22653A);
                }
                if (aVar == null || !aVar.mo63502c()) {
                    return null;
                }
                if (this.f23872r) {
                    C9625a.m27304b(287, this.f22653A);
                } else {
                    C9625a.m27304b(94, this.f22653A);
                }
                WindVaneWebView a = aVar.mo63497a();
                if (this.f22682af) {
                    a.setWebViewTransparent();
                }
                return a;
            } else if (this.f22653A == null || this.f22653A.getRewardTemplateMode() == null) {
                return null;
            } else {
                C9625a.C9626a a2 = C9625a.m27300a(this.f23865k + "_" + this.f22653A.getId() + "_" + this.f22653A.getRequestId() + "_" + this.f22653A.getRewardTemplateMode().mo57576e());
                if (a2 != null) {
                    return a2.mo63497a();
                }
                return null;
            }
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            e.printStackTrace();
            return null;
        }
    }

    public MBridgeVideoView findMBridgeVideoView() {
        return (MBridgeVideoView) findViewById(findID("mbridge_video_templete_videoview"));
    }

    public MBridgeContainerView findMBridgeContainerView() {
        return (MBridgeContainerView) findViewById(findID("mbridge_video_templete_container"));
    }

    public boolean initViews() {
        View findViewById = findViewById(findID("mbridge_video_templete_progressbar"));
        this.f22677aa = findViewById;
        return findViewById != null;
    }

    public boolean canBackPress() {
        MBridgeContainerView mBridgeContainerView = this.f22696f;
        return mBridgeContainerView == null || mBridgeContainerView.canBackPress();
    }

    public void onBackPressed() {
        MBridgeContainerView mBridgeContainerView;
        MBridgeContainerView mBridgeContainerView2;
        MBridgeVideoView mBridgeVideoView;
        MBridgeVideoView mBridgeVideoView2;
        if (this.f22682af && (mBridgeVideoView2 = this.f22695e) != null) {
            mBridgeVideoView2.notifyVideoClose();
        } else if (!this.f22684ah || (mBridgeVideoView = this.f22695e) == null) {
            if (!this.f22686aj || (mBridgeContainerView2 = this.f22696f) == null) {
                if (this.f22685ai && (mBridgeContainerView = this.f22696f) != null) {
                    mBridgeContainerView.onEndcardBackPress();
                }
                if (getJSCommon().mo63249b()) {
                    if (getJSContainerModule() == null || !getJSContainerModule().miniCardShowing()) {
                        getActivityProxy().mo63236g();
                    }
                } else if (!canBackPress()) {
                    C8672v.m24874a(f22652y, "onBackPressed can't excute");
                } else if (this.f23864j != null && !this.f23877w && !this.f22687ak) {
                    this.f22687ak = true;
                    this.f23864j.onBackPressed();
                }
            } else {
                mBridgeContainerView2.onPlayableBackPress();
            }
        } else if (mBridgeVideoView.isMiniCardShowing()) {
            MBridgeContainerView mBridgeContainerView3 = this.f22696f;
            if (mBridgeContainerView3 != null) {
                mBridgeContainerView3.onMiniEndcardBackPress();
            }
        } else {
            this.f22695e.onBackPress();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004c A[Catch:{ all -> 0x00a7 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m26298a(int r4, java.lang.String r5) {
        /*
            r3 = this;
            com.mbridge.msdk.foundation.entity.m r0 = new com.mbridge.msdk.foundation.entity.m     // Catch:{ all -> 0x00a7 }
            r0.<init>()     // Catch:{ all -> 0x00a7 }
            java.lang.String r1 = "2000037"
            r0.mo57848o(r1)     // Catch:{ all -> 0x00a7 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a7 }
            r1.<init>()     // Catch:{ all -> 0x00a7 }
            java.lang.String r2 = "code="
            r1.append(r2)     // Catch:{ all -> 0x00a7 }
            r1.append(r4)     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = ",desc="
            r1.append(r4)     // Catch:{ all -> 0x00a7 }
            r1.append(r5)     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x00a7 }
            r0.mo57838j(r4)     // Catch:{ all -> 0x00a7 }
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r3.f22653A     // Catch:{ all -> 0x00a7 }
            java.lang.String r5 = ""
            if (r4 == 0) goto L_0x003f
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r3.f22653A     // Catch:{ all -> 0x00a7 }
            com.mbridge.msdk.foundation.entity.CampaignEx$c r4 = r4.getRewardTemplateMode()     // Catch:{ all -> 0x00a7 }
            if (r4 == 0) goto L_0x003f
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r3.f22653A     // Catch:{ all -> 0x00a7 }
            com.mbridge.msdk.foundation.entity.CampaignEx$c r4 = r4.getRewardTemplateMode()     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = r4.mo57576e()     // Catch:{ all -> 0x00a7 }
            goto L_0x0040
        L_0x003f:
            r4 = r5
        L_0x0040:
            r0.mo57836i(r4)     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = r3.f23865k     // Catch:{ all -> 0x00a7 }
            r0.mo57844m(r4)     // Catch:{ all -> 0x00a7 }
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r3.f22653A     // Catch:{ all -> 0x00a7 }
            if (r4 == 0) goto L_0x0052
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r3.f22653A     // Catch:{ all -> 0x00a7 }
            java.lang.String r5 = r4.getId()     // Catch:{ all -> 0x00a7 }
        L_0x0052:
            r0.mo57846n(r5)     // Catch:{ all -> 0x00a7 }
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r3.f22653A     // Catch:{ all -> 0x00a7 }
            if (r4 == 0) goto L_0x006e
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r3.f22653A     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = r4.getRequestId()     // Catch:{ all -> 0x00a7 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x00a7 }
            if (r4 != 0) goto L_0x006e
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r3.f22653A     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = r4.getRequestId()     // Catch:{ all -> 0x00a7 }
            r0.mo57840k(r4)     // Catch:{ all -> 0x00a7 }
        L_0x006e:
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r3.f22653A     // Catch:{ all -> 0x00a7 }
            if (r4 == 0) goto L_0x0087
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r3.f22653A     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = r4.getRequestIdNotice()     // Catch:{ all -> 0x00a7 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x00a7 }
            if (r4 != 0) goto L_0x0087
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r3.f22653A     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = r4.getRequestIdNotice()     // Catch:{ all -> 0x00a7 }
            r0.mo57842l(r4)     // Catch:{ all -> 0x00a7 }
        L_0x0087:
            android.content.Context r4 = r3.getContext()     // Catch:{ all -> 0x00a7 }
            int r4 = com.mbridge.msdk.foundation.tools.C8660r.m24840o(r4)     // Catch:{ all -> 0x00a7 }
            r0.mo57822c((int) r4)     // Catch:{ all -> 0x00a7 }
            android.content.Context r5 = r3.getContext()     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = com.mbridge.msdk.foundation.tools.C8660r.m24806a((android.content.Context) r5, (int) r4)     // Catch:{ all -> 0x00a7 }
            r0.mo57854r(r4)     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = com.mbridge.msdk.foundation.entity.C8468m.m24202e((com.mbridge.msdk.foundation.entity.C8468m) r0)     // Catch:{ all -> 0x00a7 }
            java.lang.String r5 = r3.f23865k     // Catch:{ all -> 0x00a7 }
            com.mbridge.msdk.video.module.p369b.C9499b.m27027a((java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x00a7 }
            goto L_0x00b1
        L_0x00a7:
            r4 = move-exception
            java.lang.String r5 = f22652y
            java.lang.String r0 = r4.getMessage()
            com.mbridge.msdk.foundation.tools.C8672v.m24875a(r5, r0, r4)
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.p347bt.module.MBTempContainer.m26298a(int, java.lang.String):void");
    }

    /* renamed from: h */
    private int m26317h() {
        try {
            C9637a b = C9638b.m27377a().mo63556b();
            if (b == null) {
                C9638b.m27377a().mo63558c();
            }
            if (b != null) {
                return (int) b.mo63545f();
            }
            return 5;
        } catch (Throwable th) {
            th.printStackTrace();
            return 5;
        }
    }

    /* renamed from: a */
    private int m26294a(int i, int i2) {
        List<CampaignEx> list;
        if (i < 0 || (list = this.f22671S) == null || list.size() == 0 || i2 <= 1) {
            return i;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i2 - 1; i4++) {
            if (this.f22671S.get(i4) != null) {
                i3 += this.f22671S.get(i4).getVideoLength();
            }
        }
        if (i > i3) {
            return i - i3;
        }
        return 0;
    }

    /* renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer$e */
    private final class C9279e extends C9480f {
        private C9279e() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:26:0x007f, code lost:
            if (com.mbridge.msdk.video.p347bt.module.MBTempContainer.m26307d(r6.f22713a).isCampaignIsFiltered() != false) goto L_0x008c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x0175, code lost:
            if (com.mbridge.msdk.video.p347bt.module.MBTempContainer.m26307d(r6.f22713a).isCampaignIsFiltered() != false) goto L_0x0182;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo62631a(int r7, java.lang.Object r8) {
            /*
                r6 = this;
                super.mo62631a(r7, r8)
                com.mbridge.msdk.video.bt.module.MBTempContainer r0 = com.mbridge.msdk.video.p347bt.module.MBTempContainer.this
                boolean r0 = r0.f23872r
                java.lang.String r1 = "NotifyListener"
                if (r0 == 0) goto L_0x003e
                boolean r0 = r8 instanceof java.lang.String     // Catch:{ Exception -> 0x0036 }
                if (r0 == 0) goto L_0x003e
                r0 = r8
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0036 }
                boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0036 }
                if (r2 != 0) goto L_0x003e
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0036 }
                r2.<init>(r0)     // Catch:{ Exception -> 0x0036 }
                com.mbridge.msdk.video.bt.module.MBTempContainer r0 = com.mbridge.msdk.video.p347bt.module.MBTempContainer.this     // Catch:{ Exception -> 0x0036 }
                java.lang.String r3 = "Alert_window_status"
                int r3 = r2.getInt(r3)     // Catch:{ Exception -> 0x0036 }
                int unused = r0.f22661I = r3     // Catch:{ Exception -> 0x0036 }
                com.mbridge.msdk.video.bt.module.MBTempContainer r0 = com.mbridge.msdk.video.p347bt.module.MBTempContainer.this     // Catch:{ Exception -> 0x0036 }
                java.lang.String r3 = "complete_info"
                int r2 = r2.getInt(r3)     // Catch:{ Exception -> 0x0036 }
                int unused = r0.f22662J = r2     // Catch:{ Exception -> 0x0036 }
                goto L_0x003e
            L_0x0036:
                r0 = move-exception
                java.lang.String r0 = r0.getMessage()
                com.mbridge.msdk.foundation.tools.C8672v.m24878d(r1, r0)
            L_0x003e:
                r0 = 2
                r2 = 0
                if (r7 == r0) goto L_0x00f2
                r3 = 121(0x79, float:1.7E-43)
                r4 = 1
                if (r7 == r3) goto L_0x00d1
                r3 = 16
                if (r7 == r3) goto L_0x00c6
                r3 = 17
                if (r7 == r3) goto L_0x00b2
                switch(r7) {
                    case 10: goto L_0x0054;
                    case 11: goto L_0x00f2;
                    case 12: goto L_0x00f2;
                    default: goto L_0x0052;
                }
            L_0x0052:
                goto L_0x01ad
            L_0x0054:
                com.mbridge.msdk.video.bt.module.MBTempContainer r7 = com.mbridge.msdk.video.p347bt.module.MBTempContainer.this
                boolean unused = r7.f22684ah = r4
                com.mbridge.msdk.video.bt.module.MBTempContainer r7 = com.mbridge.msdk.video.p347bt.module.MBTempContainer.this
                com.mbridge.msdk.foundation.entity.CampaignEx r7 = r7.f22653A
                if (r7 == 0) goto L_0x01ad
                com.mbridge.msdk.video.bt.module.MBTempContainer r7 = com.mbridge.msdk.video.p347bt.module.MBTempContainer.this
                com.mbridge.msdk.foundation.entity.CampaignEx r7 = r7.f22653A
                boolean r7 = r7.isDynamicView()
                if (r7 == 0) goto L_0x008c
                com.mbridge.msdk.video.bt.module.MBTempContainer r7 = com.mbridge.msdk.video.p347bt.module.MBTempContainer.this
                boolean r7 = r7.f23877w
                if (r7 == 0) goto L_0x0082
                com.mbridge.msdk.video.bt.module.MBTempContainer r7 = com.mbridge.msdk.video.p347bt.module.MBTempContainer.this
                com.mbridge.msdk.foundation.entity.CampaignEx r7 = r7.f22653A
                boolean r7 = r7.isCampaignIsFiltered()
                if (r7 == 0) goto L_0x0095
                goto L_0x008c
            L_0x0082:
                com.mbridge.msdk.video.bt.module.MBTempContainer r7 = com.mbridge.msdk.video.p347bt.module.MBTempContainer.this
                com.mbridge.msdk.video.bt.module.b.h r7 = r7.f22655C
                r7.mo61307a()
                goto L_0x0095
            L_0x008c:
                com.mbridge.msdk.video.bt.module.MBTempContainer r7 = com.mbridge.msdk.video.p347bt.module.MBTempContainer.this
                com.mbridge.msdk.video.bt.module.b.h r7 = r7.f22655C
                r7.mo61307a()
            L_0x0095:
                com.mbridge.msdk.video.bt.module.MBTempContainer r7 = com.mbridge.msdk.video.p347bt.module.MBTempContainer.this
                android.content.Context r7 = r7.getContext()
                com.mbridge.msdk.video.bt.module.MBTempContainer r8 = com.mbridge.msdk.video.p347bt.module.MBTempContainer.this
                com.mbridge.msdk.foundation.entity.CampaignEx r8 = r8.f22653A
                com.mbridge.msdk.video.bt.module.MBTempContainer r0 = com.mbridge.msdk.video.p347bt.module.MBTempContainer.this
                java.lang.String r0 = r0.f23865k
                com.mbridge.msdk.video.bt.module.MBTempContainer r1 = com.mbridge.msdk.video.p347bt.module.MBTempContainer.this
                int r1 = r1.f22658F
                com.mbridge.msdk.video.p347bt.module.p350b.C9308f.m26481a((android.content.Context) r7, (com.mbridge.msdk.foundation.entity.CampaignEx) r8, (java.lang.String) r0, (int) r1)
                goto L_0x01ad
            L_0x00b2:
                com.mbridge.msdk.video.bt.module.MBTempContainer r7 = com.mbridge.msdk.video.p347bt.module.MBTempContainer.this
                boolean unused = r7.f22679ac = r4
                com.mbridge.msdk.video.bt.module.MBTempContainer r7 = com.mbridge.msdk.video.p347bt.module.MBTempContainer.this
                com.mbridge.msdk.video.module.MBridgeContainerView r7 = r7.f22696f
                if (r7 == 0) goto L_0x01ad
                com.mbridge.msdk.video.bt.module.MBTempContainer r7 = com.mbridge.msdk.video.p347bt.module.MBTempContainer.this
                com.mbridge.msdk.video.module.MBridgeContainerView r7 = r7.f22696f
                r7.setRewardStatus(r4)
                goto L_0x01ad
            L_0x00c6:
                com.mbridge.msdk.video.bt.module.MBTempContainer r7 = com.mbridge.msdk.video.p347bt.module.MBTempContainer.this
                com.mbridge.msdk.video.signal.c r7 = r7.getJSCommon()
                r7.mo63252d()
                goto L_0x01ad
            L_0x00d1:
                com.mbridge.msdk.video.bt.module.MBTempContainer r7 = com.mbridge.msdk.video.p347bt.module.MBTempContainer.this
                boolean unused = r7.f22679ac = r4
                com.mbridge.msdk.video.bt.module.MBTempContainer r7 = com.mbridge.msdk.video.p347bt.module.MBTempContainer.this
                com.mbridge.msdk.video.bt.module.b.h r7 = r7.f22655C
                com.mbridge.msdk.video.bt.module.MBTempContainer r8 = com.mbridge.msdk.video.p347bt.module.MBTempContainer.this
                java.lang.String r8 = r8.f23866l
                com.mbridge.msdk.video.bt.module.MBTempContainer r0 = com.mbridge.msdk.video.p347bt.module.MBTempContainer.this
                java.lang.String r0 = r0.f23865k
                r7.mo61310a((java.lang.String) r8, (java.lang.String) r0)
                com.mbridge.msdk.video.bt.module.MBTempContainer r7 = com.mbridge.msdk.video.p347bt.module.MBTempContainer.this
                boolean unused = r7.f22684ah = r2
                goto L_0x01ad
            L_0x00f2:
                r3 = 12
                if (r7 != r3) goto L_0x018b
                java.lang.String r3 = "Play error but has no message."
                boolean r4 = r8 instanceof java.lang.String     // Catch:{ all -> 0x0102 }
                if (r4 == 0) goto L_0x010a
                java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0102 }
                r3 = r8
                goto L_0x010a
            L_0x0102:
                r8 = move-exception
                java.lang.String r8 = r8.getMessage()
                com.mbridge.msdk.foundation.tools.C8672v.m24878d(r1, r8)
            L_0x010a:
                com.mbridge.msdk.video.bt.module.MBTempContainer r8 = com.mbridge.msdk.video.p347bt.module.MBTempContainer.this
                android.content.Context r8 = r8.getContext()
                com.mbridge.msdk.video.bt.module.MBTempContainer r1 = com.mbridge.msdk.video.p347bt.module.MBTempContainer.this
                com.mbridge.msdk.foundation.entity.CampaignEx r1 = r1.f22653A
                com.mbridge.msdk.video.bt.module.MBTempContainer r4 = com.mbridge.msdk.video.p347bt.module.MBTempContainer.this
                java.lang.String r4 = r4.f23865k
                com.mbridge.msdk.video.bt.module.MBTempContainer r5 = com.mbridge.msdk.video.p347bt.module.MBTempContainer.this
                int r5 = r5.f22658F
                com.mbridge.msdk.video.p347bt.module.p350b.C9308f.m26482a(r8, r1, r4, r3, r5)
                com.mbridge.msdk.video.bt.module.MBTempContainer r8 = com.mbridge.msdk.video.p347bt.module.MBTempContainer.this
                boolean r8 = r8.f22684ah
                if (r8 != 0) goto L_0x018b
                com.mbridge.msdk.video.bt.module.MBTempContainer r8 = com.mbridge.msdk.video.p347bt.module.MBTempContainer.this
                com.mbridge.msdk.videocommon.d.c r8 = r8.f23867m
                int r8 = r8.mo63560B()
                if (r8 != 0) goto L_0x014f
                com.mbridge.msdk.video.bt.module.MBTempContainer r7 = com.mbridge.msdk.video.p347bt.module.MBTempContainer.this
                com.mbridge.msdk.video.bt.module.b.h r7 = r7.f22655C
                java.lang.String r8 = "play error"
                r7.mo61309a(r8)
                com.mbridge.msdk.video.bt.module.MBTempContainer r7 = com.mbridge.msdk.video.p347bt.module.MBTempContainer.this
                boolean unused = r7.f22684ah = r2
                com.mbridge.msdk.video.bt.module.MBTempContainer r7 = com.mbridge.msdk.video.p347bt.module.MBTempContainer.this
                com.mbridge.msdk.video.p347bt.module.MBTempContainer.m26323m(r7)
                return
            L_0x014f:
                com.mbridge.msdk.video.bt.module.MBTempContainer r8 = com.mbridge.msdk.video.p347bt.module.MBTempContainer.this
                com.mbridge.msdk.foundation.entity.CampaignEx r8 = r8.f22653A
                if (r8 == 0) goto L_0x0182
                com.mbridge.msdk.video.bt.module.MBTempContainer r8 = com.mbridge.msdk.video.p347bt.module.MBTempContainer.this
                com.mbridge.msdk.foundation.entity.CampaignEx r8 = r8.f22653A
                boolean r8 = r8.isDynamicView()
                if (r8 == 0) goto L_0x0182
                com.mbridge.msdk.video.bt.module.MBTempContainer r8 = com.mbridge.msdk.video.p347bt.module.MBTempContainer.this
                boolean r8 = r8.f23877w
                if (r8 == 0) goto L_0x0178
                com.mbridge.msdk.video.bt.module.MBTempContainer r8 = com.mbridge.msdk.video.p347bt.module.MBTempContainer.this
                com.mbridge.msdk.foundation.entity.CampaignEx r8 = r8.f22653A
                boolean r8 = r8.isCampaignIsFiltered()
                if (r8 == 0) goto L_0x018b
                goto L_0x0182
            L_0x0178:
                com.mbridge.msdk.video.bt.module.MBTempContainer r8 = com.mbridge.msdk.video.p347bt.module.MBTempContainer.this
                com.mbridge.msdk.video.bt.module.b.h r8 = r8.f22655C
                r8.mo61307a()
                goto L_0x018b
            L_0x0182:
                com.mbridge.msdk.video.bt.module.MBTempContainer r8 = com.mbridge.msdk.video.p347bt.module.MBTempContainer.this
                com.mbridge.msdk.video.bt.module.b.h r8 = r8.f22655C
                r8.mo61307a()
            L_0x018b:
                com.mbridge.msdk.video.bt.module.MBTempContainer r8 = com.mbridge.msdk.video.p347bt.module.MBTempContainer.this
                com.mbridge.msdk.video.signal.i r8 = r8.getJSVideoModule()
                r1 = 3
                r8.videoOperate(r1)
                com.mbridge.msdk.video.bt.module.MBTempContainer r8 = com.mbridge.msdk.video.p347bt.module.MBTempContainer.this
                boolean unused = r8.f22684ah = r2
                com.mbridge.msdk.video.bt.module.MBTempContainer r8 = com.mbridge.msdk.video.p347bt.module.MBTempContainer.this
                com.iab.omid.library.mmadbridge.adsession.media.MediaEvents r8 = r8.f22690an
                if (r8 == 0) goto L_0x01ad
                if (r7 != r0) goto L_0x01ad
                com.mbridge.msdk.video.bt.module.MBTempContainer r7 = com.mbridge.msdk.video.p347bt.module.MBTempContainer.this
                com.iab.omid.library.mmadbridge.adsession.media.MediaEvents r7 = r7.f22690an
                r7.skipped()
            L_0x01ad:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.p347bt.module.MBTempContainer.C9279e.mo62631a(int, java.lang.Object):void");
        }
    }

    /* renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer$b */
    private final class C9276b extends C9474a {
        public C9276b(Activity activity, CampaignEx campaignEx) {
            super(activity, campaignEx);
        }

        /* renamed from: a */
        public final void mo62631a(int i, Object obj) {
            String str = "";
            if (i != 108) {
                if (i != 113) {
                    if (i != 117) {
                        if (i != 126 && i != 128) {
                            switch (i) {
                                case 103:
                                case 104:
                                    MBTempContainer.m26323m(MBTempContainer.this);
                                    break;
                                case 105:
                                    C9521c jSCommon = MBTempContainer.this.getJSCommon();
                                    if (obj != null) {
                                        str = obj.toString();
                                    }
                                    jSCommon.click(1, str);
                                    break;
                                case 106:
                                    break;
                            }
                        } else {
                            MBTempContainer.this.f22655C.mo61313a(false, MBTempContainer.this.f23866l, MBTempContainer.this.f23865k);
                        }
                    } else {
                        if (MBTempContainer.this.f22695e != null) {
                            MBTempContainer.this.f22695e.setVisible(4);
                        }
                        boolean unused = MBTempContainer.this.f22685ai = true;
                        MBTempContainer.this.f22655C.mo61314b(MBTempContainer.this.f23866l, MBTempContainer.this.f23865k);
                    }
                }
                MBTempContainer.this.f22655C.mo61313a(true, MBTempContainer.this.f23866l, MBTempContainer.this.f23865k);
            } else {
                MBTempContainer.this.getJSCommon().mo63242a((C9521c.C9522a) new C9505c.C9507b(MBTempContainer.this.getJSCommon(), new C9278d()));
                C9521c jSCommon2 = MBTempContainer.this.getJSCommon();
                if (obj != null) {
                    str = obj.toString();
                }
                jSCommon2.click(1, str);
            }
            super.mo62631a(i, obj);
        }
    }

    /* renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer$c */
    private final class C9277c extends C9480f {
        private C9277c() {
        }

        /* renamed from: a */
        public final void mo62631a(int i, Object obj) {
            String str;
            super.mo62631a(i, obj);
            try {
                if (obj instanceof JSONObject) {
                    str = obj.toString();
                } else {
                    str = (String) obj;
                }
                if (MBTempContainer.this.f23872r && !TextUtils.isEmpty(str)) {
                    JSONObject jSONObject = new JSONObject(str);
                    int optInt = jSONObject.optInt("type");
                    int optInt2 = jSONObject.optInt("complete");
                    if (optInt == 2) {
                        int unused = MBTempContainer.this.f22661I = C8469a.f20759t;
                    } else if (optInt != 3) {
                        int unused2 = MBTempContainer.this.f22661I = C8469a.f20757r;
                    } else {
                        int unused3 = MBTempContainer.this.f22661I = C8469a.f20758s;
                    }
                    int unused4 = MBTempContainer.this.f22662J = optInt2;
                }
            } catch (Exception unused5) {
                C8672v.m24878d("NotifyListener", "PlayableResultListener ERROR");
            }
            if (i == 120) {
                MBTempContainer.this.f22655C.mo61314b(MBTempContainer.this.f23866l, MBTempContainer.this.f23865k);
            } else if (i == 126) {
                MBTempContainer.this.f22655C.mo61313a(false, MBTempContainer.this.f23866l, MBTempContainer.this.f23865k);
            } else if (i != 127) {
                switch (i) {
                    case 100:
                        boolean unused6 = MBTempContainer.this.f22686aj = true;
                        MBTempContainer.this.f22697g.postDelayed(MBTempContainer.this.f22691ao, 250);
                        MBTempContainer.this.f22655C.mo61307a();
                        return;
                    case 101:
                    case 102:
                        MBTempContainer.this.getJSCommon().mo63252d();
                        return;
                    case 103:
                        boolean unused7 = MBTempContainer.this.f22679ac = true;
                        if (MBTempContainer.this.f22653A.isMraid()) {
                            MBTempContainer.m26323m(MBTempContainer.this);
                            return;
                        } else {
                            MBTempContainer.this.getJSCommon().mo63252d();
                            return;
                        }
                    case 104:
                        MBTempContainer.m26323m(MBTempContainer.this);
                        return;
                    case 105:
                        MBTempContainer.this.getJSCommon().click(1, obj != null ? obj.toString() : "");
                        return;
                    default:
                        return;
                }
            } else {
                boolean unused8 = MBTempContainer.this.f22679ac = true;
                MBTempContainer.this.f22655C.mo61307a();
                MBTempContainer.this.f22655C.mo61314b(MBTempContainer.this.f23866l, MBTempContainer.this.f23865k);
                MBTempContainer.this.getJSContainerModule().showEndcard(100);
            }
        }
    }

    /* renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer$d */
    private class C9278d extends C9505c.C9506a {
        private C9278d() {
        }

        /* renamed from: a */
        public final void mo62632a() {
            super.mo62632a();
            MBTempContainer.this.receiveSuccess();
        }

        public final void onStartRedirection(Campaign campaign, String str) {
            super.onStartRedirection(campaign, str);
            MBTempContainer.m26287F(MBTempContainer.this);
        }

        public final void onFinishRedirection(Campaign campaign, String str) {
            super.onFinishRedirection(campaign, str);
            boolean unused = MBTempContainer.this.f22683ag = true;
            MBTempContainer.m26288G(MBTempContainer.this);
            if (campaign != null && (campaign instanceof CampaignEx)) {
                try {
                    CampaignEx campaignEx = (CampaignEx) campaign;
                    String optString = new JSONObject(MBTempContainer.this.getJSVideoModule().getCurrentProgress()).optString(NotificationCompat.CATEGORY_PROGRESS, "");
                    if (campaignEx.getLinkType() == 3 && campaignEx.getEndcard_click_result() == 2 && optString.equals("1.0") && MBTempContainer.this.f23864j != null) {
                        if (MBTempContainer.this.f23877w) {
                            MBTempContainer.m26323m(MBTempContainer.this);
                        } else {
                            MBTempContainer.this.f23864j.finish();
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }

        public final void onRedirectionFailed(Campaign campaign, String str) {
            super.onRedirectionFailed(campaign, str);
            MBTempContainer.m26288G(MBTempContainer.this);
            boolean unused = MBTempContainer.this.f22683ag = true;
        }

        /* renamed from: a */
        public final void mo62634a(boolean z) {
            super.mo62634a(z);
            MBTempContainer.this.f22655C.mo61313a(z, MBTempContainer.this.f23866l, MBTempContainer.this.f23865k);
        }

        /* renamed from: a */
        public final void mo62633a(int i, String str) {
            super.mo62633a(i, str);
            MBTempContainer.this.defaultLoad(i, str);
        }

        /* renamed from: b */
        public final void mo62635b() {
            super.mo62635b();
            if (MBTempContainer.this.f22697g != null) {
                MBTempContainer.this.f22697g.removeCallbacks(MBTempContainer.this.f22698h);
            }
        }
    }

    public void setCampaign(CampaignEx campaignEx) {
        this.f22653A = campaignEx;
        if (campaignEx != null) {
            if (TextUtils.isEmpty(campaignEx.getCampaignUnitId()) && !TextUtils.isEmpty(this.f23865k)) {
                campaignEx.setCampaignUnitId(this.f23865k);
            }
            C2470b a = C2470b.m6168a();
            a.mo16423a(campaignEx.getCampaignUnitId() + "_" + 1, campaignEx);
        }
    }

    public CampaignEx getCampaign() {
        return this.f22653A;
    }

    public void setCampaignExpired(boolean z) {
        try {
            if (this.f22653A == null) {
                return;
            }
            if (z) {
                this.f22653A.setSpareOfferFlag(1);
                if (this.f23867m == null) {
                    return;
                }
                if (this.f23867m.mo63614x() == 1) {
                    this.f22653A.setCbt(1);
                } else {
                    this.f22653A.setCbt(0);
                }
            } else {
                this.f22653A.setSpareOfferFlag(0);
                this.f22653A.setCbt(0);
            }
        } catch (Exception e) {
            C8672v.m24878d(f22652y, e.getMessage());
        }
    }

    public void setCampaignDownLoadTask(C9641a aVar) {
        this.f22654B = aVar;
    }

    public void setShowRewardListener(C9311h hVar) {
        this.f22655C = hVar;
    }

    public void setMBridgeTempCallback(C9302b bVar) {
        this.f22656D = bVar;
    }

    public void setCamPlayOrderCallback(C9322a aVar, int i) {
        this.f22657E = aVar;
        this.f22658F = i;
    }

    public void setJSFactory(C9618b bVar) {
        this.f22660H = bVar;
    }

    public void setInstanceId(String str) {
        this.f22659G = str;
    }

    public String getInstanceId() {
        return this.f22659G;
    }

    public void setWebViewFront(int i) {
        this.f22675W = i;
    }

    public void setNotchPadding(int i, int i2, int i3, int i4, int i5) {
        this.f22664L = i;
        this.f22665M = i2;
        this.f22666N = i3;
        this.f22667O = i4;
        this.f22668P = i5;
        String a = C8646l.m24774a(i, i2, i3, i4, i5);
        this.f22669Q = a;
        C8672v.m24878d(f22652y, a);
        if (getJSCommon() != null && !TextUtils.isEmpty(this.f22669Q)) {
            getJSCommon().mo63247b(this.f22669Q);
            if (this.f22694d != null && !TextUtils.isEmpty(this.f22669Q)) {
                C8887g.m25669a().mo58687a((WebView) this.f22694d, "oncutoutfetched", Base64.encodeToString(this.f22669Q.getBytes(), 0));
            }
        }
        MBridgeVideoView mBridgeVideoView = this.f22695e;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.setNotchPadding(i2, i3, i4, i5);
        }
        MBridgeContainerView mBridgeContainerView = this.f22696f;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.setNotchPadding(i, i2, i3, i4, i5);
        }
    }

    public void setDeveloperExtraData(String str) {
        this.f22670R = str;
    }

    public void onCreate() {
        ViewGroup viewGroup;
        int i;
        int i2;
        if (this.f23867m == null) {
            this.f23867m = C9638b.m27377a().mo63551a(C8388a.m23845e().mo56914h(), this.f23865k, this.f23872r);
        }
        this.f22687ak = false;
        try {
            if (!this.f23877w) {
                this.f22655C = new C9306d(getContext(), this.f23872r, this.f23867m, this.f22653A, this.f22655C, mo63476b(), this.f23865k);
            } else if (this.f22653A == null || !this.f22653A.isDynamicView()) {
                this.f22655C = new C9305c(this.f22656D, this.f22659G);
            } else {
                this.f22655C = new C9306d(getContext(), this.f23872r, this.f23867m, this.f22653A, this.f22655C, mo63476b(), this.f23865k);
            }
            if (this.f22653A != null && this.f22653A.isActiveOm()) {
                this.f22689am = C2427b.m5855a(getContext(), false, this.f22653A.getOmid(), this.f22653A.getRequestId(), this.f22653A.getId(), this.f23865k, this.f22654B.mo63647n(), this.f22653A.getRequestIdNotice());
            }
            registerErrorListener(new C9307e(this.f22655C));
            mo63472a(this.f23867m, this.f22653A);
            setShowingTransparent();
            int layoutID = getLayoutID();
            if (layoutID <= 0) {
                mo62581a("layoutID not found");
                return;
            }
            View inflate = this.f22673U.inflate(layoutID, (ViewGroup) null);
            this.f22700z = inflate;
            addView(inflate, new RelativeLayout.LayoutParams(-1, -1));
            if (this.f22676a) {
                setMatchParent();
            }
            this.f22694d = findWindVaneWebView();
            MBridgeVideoView findMBridgeVideoView = findMBridgeVideoView();
            this.f22695e = findMBridgeVideoView;
            findMBridgeVideoView.setVideoLayout(this.f22653A);
            this.f22695e.setIsIV(this.f23872r);
            this.f22695e.setUnitId(this.f23865k);
            this.f22695e.setCamPlayOrderCallback(this.f22657E, this.f22671S, this.f22658F, this.f22672T);
            if (this.f23877w) {
                this.f22695e.setNotchPadding(this.f22665M, this.f22666N, this.f22667O, this.f22668P);
            }
            this.f22696f = findMBridgeContainerView();
            if (this.f23877w) {
                this.f22696f.setNotchPadding(this.f22664L, this.f22665M, this.f22666N, this.f22667O, this.f22668P);
            }
            if (!((this.f22695e == null || this.f22696f == null || !initViews()) ? false : true)) {
                this.f22693c.mo62629a("not found View IDS");
                if (this.f23864j != null) {
                    this.f23864j.finish();
                    return;
                }
                return;
            }
            this.f22692b = true;
            WindVaneWebView windVaneWebView = this.f22694d;
            this.f22660H = new C9618b(this.f23864j, windVaneWebView, this.f22695e, this.f22696f, this.f22653A, new C9278d());
            if (!(this.f22653A == null || this.f22653A.getDynamicTempCode() != 5 || this.f22671S == null)) {
                this.f22660H.mo63496a(this.f22671S);
            }
            registerJsFactory(this.f22660H);
            C2470b a = C2470b.m6168a();
            a.mo16422a(this.f23865k + "_" + 1, (C2462a) new C2462a() {
                /* renamed from: a */
                public final void mo16392a() {
                    String str;
                    MBTempContainer.this.onPause();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (C8388a.m23845e().mo56913g() != null) {
                            jSONObject.put("status", 1);
                        }
                        str = jSONObject.toString();
                    } catch (Throwable th) {
                        C8672v.m24875a(MBTempContainer.f22652y, th.getMessage(), th);
                        str = "";
                    }
                    C8887g.m25669a().mo58687a((WebView) MBTempContainer.this.f22694d, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                }

                /* renamed from: b */
                public final void mo16394b() {
                    String str;
                    MBTempContainer.this.onResume();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (C8388a.m23845e().mo56913g() != null) {
                            jSONObject.put("status", 2);
                        }
                        str = jSONObject.toString();
                    } catch (Throwable th) {
                        C8672v.m24875a(MBTempContainer.f22652y, th.getMessage(), th);
                        str = "";
                    }
                    C8887g.m25669a().mo58687a((WebView) MBTempContainer.this.f22694d, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                }

                /* renamed from: a */
                public final void mo16393a(String str) {
                    String str2;
                    MBTempContainer.this.onResume();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (C8388a.m23845e().mo56913g() != null) {
                            jSONObject.put("status", 2);
                        }
                        str2 = jSONObject.toString();
                    } catch (Throwable th) {
                        C8672v.m24875a(MBTempContainer.f22652y, th.getMessage(), th);
                        str2 = "";
                    }
                    C8887g.m25669a().mo58687a((WebView) MBTempContainer.this.f22694d, "onFeedbackAlertStatusNotify", Base64.encodeToString(str2.getBytes(), 2));
                }
            });
            if (windVaneWebView != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f22700z.findViewById(C8658p.m24799a(getContext(), "mbridge_video_templete_webview_parent", "id"));
                windVaneWebView.setApiManagerJSFactory(this.f22660H);
                if (windVaneWebView.getParent() != null) {
                    defaultLoad(0, "preload template webview is null or load error");
                    return;
                }
                if (windVaneWebView.getObject() instanceof C9514j) {
                    this.f22660H.mo63495a((C9514j) windVaneWebView.getObject());
                    getJSCommon().mo63239a(this.f23871q);
                    getJSCommon().mo63244a(this.f23865k);
                    getJSCommon().mo63243a(this.f23867m);
                    getJSCommon().mo63242a((C9521c.C9522a) new C9278d());
                    if (this.f22653A != null && (this.f22653A.isMraid() || this.f22653A.isActiveOm())) {
                        C8875d dVar = new C8875d(getContext());
                        this.f22688al = dVar;
                        dVar.mo58642c();
                        this.f22688al.mo58639a();
                        this.f22688al.mo58640a(new C8875d.C8877b() {
                            /* renamed from: a */
                            public final void mo58259a(double d) {
                                String a = MBTempContainer.f22652y;
                                C8672v.m24878d(a, "volume is : " + d);
                                try {
                                    if (MBTempContainer.this.f22653A.isMraid() && MBTempContainer.this.f22696f != null && MBTempContainer.this.f22696f.getH5EndCardView() != null) {
                                        MBTempContainer.this.f22696f.getH5EndCardView().volumeChange(d);
                                    }
                                } catch (Exception e) {
                                    C8672v.m24878d(MBTempContainer.f22652y, e.getMessage());
                                }
                            }
                        });
                    }
                    getJSContainerModule().readyStatus(((C9514j) windVaneWebView.getObject()).mo63284o());
                    if (this.f22694d != null) {
                        int i3 = getResources().getConfiguration().orientation;
                        if (m26308d()) {
                            i2 = C8677z.m24949i(getContext());
                            i = C8677z.m24951j(getContext());
                            if (C8677z.m24749a(getContext())) {
                                int k = C8677z.m24953k(getContext());
                                if (i3 == 2) {
                                    i2 += k;
                                } else {
                                    i += k;
                                }
                            }
                        } else {
                            i2 = C8677z.m24947h(getContext());
                            i = C8677z.m24945g(getContext());
                        }
                        int c = this.f22653A.getRewardTemplateMode().mo57574c();
                        if (mo63477c(this.f22653A) == 1) {
                            c = i3;
                        }
                        getJSNotifyProxy().mo63268a(i3, c, i2, i);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(C8469a.f20749j, (double) C8677z.m24936d(getContext()));
                        try {
                            if (this.f23869o != null) {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("name", this.f23869o.mo63524a());
                                jSONObject2.put("amount", this.f23869o.mo63527b());
                                jSONObject2.put("id", this.f23870p);
                                jSONObject.put(DataKeys.USER_ID, this.f23868n);
                                jSONObject.put("reward", jSONObject2);
                                jSONObject.put("playVideoMute", this.f23871q);
                                jSONObject.put("extra", this.f22670R);
                            }
                        } catch (JSONException e) {
                            C8672v.m24874a(f22652y, e.getMessage());
                        } catch (Exception e2) {
                            C8672v.m24874a(f22652y, e2.getMessage());
                        }
                        getJSNotifyProxy().mo63271a((Object) jSONObject.toString());
                        C8887g.m25669a().mo58687a((WebView) this.f22694d, "oncutoutfetched", Base64.encodeToString(this.f22669Q.getBytes(), 0));
                        getJSCommon().mo63248b(true);
                        loadModuleDatas();
                        this.f22697g.postDelayed(this.f22698h, 2000);
                    }
                    ((C9514j) windVaneWebView.getObject()).f23554l.mo62632a();
                    if (this.f23877w) {
                        getJSCommon().mo63255e(this.f22675W);
                    }
                }
                if (getJSCommon().mo63238a() == 1 && (viewGroup = (ViewGroup) this.f22700z.findViewById(C8658p.m24799a(getContext(), "mbridge_video_templete_webview_parent", "id"))) != null) {
                    ((ViewGroup) this.f22700z).removeView(viewGroup);
                    ((ViewGroup) this.f22700z).addView(viewGroup, 1);
                }
                viewGroup2.addView(windVaneWebView, new ViewGroup.LayoutParams(-1, -1));
                m26316g();
                return;
            }
            defaultLoad(0, "preload template webview is null or load error");
        } catch (Exception e3) {
            if (MBridgeConstans.DEBUG) {
                e3.printStackTrace();
            }
        } catch (Throwable th) {
            th.printStackTrace();
            mo62581a("onCreate error" + th);
        }
    }

    public void loadModuleDatas() {
        int i;
        int i2;
        int i3;
        int i4;
        C9514j b = mo63475b(this.f22653A);
        if (b != null) {
            i = b.mo63264k();
        } else {
            i = 0;
        }
        if (i != 0) {
            this.f23871q = i;
        }
        int f = this.f23867m.mo63578f();
        int c = m26303c();
        int i5 = c != 0 ? c : f;
        this.f22695e.setSoundState(this.f23871q);
        this.f22695e.setCampaign(this.f22653A);
        this.f22695e.setPlayURL(this.f22654B.mo63647n());
        CampaignEx campaignEx = this.f22653A;
        if (campaignEx == null || campaignEx.getVst() <= -2) {
            i2 = this.f23867m.mo63576e();
        } else {
            i2 = this.f22653A.getVst();
        }
        if (this.f22653A.getDynamicTempCode() == 5 && (i4 = this.f22658F) > 1) {
            i2 = m26294a(i2, i4);
            this.f22653A.setVst(i2);
        }
        this.f22695e.setVideoSkipTime(i2);
        this.f22695e.setCloseAlert(this.f23867m.mo63584i());
        this.f22695e.setBufferTimeout(m26317h());
        MBridgeVideoView mBridgeVideoView = this.f22695e;
        C9494n nVar = r3;
        int i6 = i2;
        C9494n nVar2 = new C9494n(this.f22660H, this.f22653A, this.f23869o, this.f22654B, mo63476b(), this.f23865k, i5, i2, new C9279e(), this.f23867m.mo63614x(), this.f23877w, this.f23867m.mo63560B());
        mBridgeVideoView.setNotifyListener(nVar);
        this.f22695e.setShowingTransparent(this.f22682af);
        this.f22695e.setAdSession(this.f22689am);
        if (this.f23872r && (this.f23874t == C8469a.f20753n || this.f23874t == C8469a.f20754o)) {
            this.f22695e.setIVRewardEnable(this.f23874t, this.f23875u, this.f23876v);
            this.f22695e.setDialogRole(getJSCommon() != null ? getJSCommon().mo63260h() : 1);
        }
        this.f22696f.setCampaign(this.f22653A);
        this.f22696f.addOrderViewData(this.f22671S);
        this.f22696f.setUnitID(this.f23865k);
        if (this.f22653A.getCbd() > -2) {
            i3 = this.f22653A.getCbd();
        } else {
            i3 = this.f23867m.mo63594n();
        }
        this.f22696f.setCloseDelayTime(i3);
        this.f22696f.setPlayCloseBtnTm(this.f23867m.mo63582h());
        this.f22696f.setVideoInteractiveType(this.f23867m.mo63580g());
        this.f22696f.setEndscreenType(this.f23867m.mo63596o());
        this.f22696f.setVideoSkipTime(i6);
        this.f22696f.setShowingTransparent(this.f22682af);
        this.f22696f.setJSFactory(this.f22660H);
        if (this.f22653A.getPlayable_ads_without_video() == 2) {
            this.f22696f.setNotifyListener(new C9482h(this.f22653A, this.f22654B, this.f23869o, mo63476b(), this.f23865k, new C9277c(), this.f23867m.mo63614x(), this.f23877w));
            this.f22696f.preLoadData(this.f22660H);
            this.f22696f.showPlayableView();
        } else {
            this.f22696f.setNotifyListener(new C9476c(this.f22660H, this.f22653A, this.f23869o, this.f22654B, mo63476b(), this.f23865k, new C9276b(this.f23864j, this.f22653A), this.f23867m.mo63614x(), this.f23877w));
            this.f22696f.preLoadData(this.f22660H);
            this.f22695e.preLoadData(this.f22660H);
        }
        if (this.f22682af) {
            this.f22696f.setMBridgeClickMiniCardViewTransparent();
        }
    }

    /* renamed from: m */
    static /* synthetic */ void m26323m(MBTempContainer mBTempContainer) {
        try {
            if (mBTempContainer.f22656D != null) {
                if (mBTempContainer.f23872r && (mBTempContainer.f23874t == C8469a.f20753n || mBTempContainer.f23874t == C8469a.f20754o)) {
                    C9302b bVar = mBTempContainer.f22656D;
                    boolean z = true;
                    if (mBTempContainer.f22662J != 1) {
                        z = false;
                    }
                    bVar.mo62666a(z, mBTempContainer.f22661I);
                }
                mBTempContainer.f22656D.mo62665a(mBTempContainer.f22659G, mBTempContainer.f22679ac, mBTempContainer.f23869o);
            } else if (mBTempContainer.f23864j != null) {
                mBTempContainer.f23864j.finish();
            }
        } catch (Exception unused) {
            if (mBTempContainer.f23864j != null) {
                mBTempContainer.f23864j.finish();
            }
        }
    }

    /* renamed from: F */
    static /* synthetic */ void m26287F(MBTempContainer mBTempContainer) {
        if (mBTempContainer.isLoadSuccess()) {
            mBTempContainer.f23864j.runOnUiThread(new Runnable() {
                public final void run() {
                    MBTempContainer.this.f22677aa.setBackgroundColor(0);
                    MBTempContainer.this.f22677aa.setVisibility(0);
                    MBTempContainer.this.f22677aa.bringToFront();
                }
            });
        }
    }

    /* renamed from: G */
    static /* synthetic */ void m26288G(MBTempContainer mBTempContainer) {
        if (mBTempContainer.isLoadSuccess()) {
            mBTempContainer.f23864j.runOnUiThread(new Runnable() {
                public final void run() {
                    MBTempContainer.this.f22677aa.setVisibility(8);
                }
            });
        }
    }
}
