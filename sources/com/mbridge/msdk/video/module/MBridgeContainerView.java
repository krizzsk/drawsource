package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.foundation.entity.C8468m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.C8580c;
import com.mbridge.msdk.foundation.tools.C8617ae;
import com.mbridge.msdk.foundation.tools.C8646l;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.mbsignalcommon.windvane.C8887g;
import com.mbridge.msdk.video.dynview.moffer.C9391a;
import com.mbridge.msdk.video.dynview.p354d.C9323b;
import com.mbridge.msdk.video.dynview.p361i.C9365b;
import com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView;
import com.mbridge.msdk.video.module.p367a.C9473a;
import com.mbridge.msdk.video.module.p367a.p368a.C9481g;
import com.mbridge.msdk.video.module.p367a.p368a.C9483i;
import com.mbridge.msdk.video.module.p367a.p368a.C9485k;
import com.mbridge.msdk.video.module.p367a.p368a.C9490l;
import com.mbridge.msdk.video.module.p369b.C9499b;
import com.mbridge.msdk.video.signal.C9615e;
import com.mbridge.msdk.video.signal.C9619g;
import com.mbridge.msdk.video.signal.factory.C9618b;
import java.util.ArrayList;
import java.util.List;

public class MBridgeContainerView extends MBridgeBaseView implements C9615e, C9619g {

    /* renamed from: A */
    private int f23226A = 1;

    /* renamed from: B */
    private int f23227B = 1;

    /* renamed from: C */
    private boolean f23228C = false;

    /* renamed from: D */
    private boolean f23229D = false;

    /* renamed from: E */
    private boolean f23230E = false;

    /* renamed from: F */
    private boolean f23231F = true;

    /* renamed from: G */
    private boolean f23232G = false;

    /* renamed from: H */
    private boolean f23233H = false;

    /* renamed from: I */
    private int f23234I;

    /* renamed from: J */
    private boolean f23235J = false;

    /* renamed from: K */
    private boolean f23236K = false;

    /* renamed from: L */
    private int f23237L;

    /* renamed from: M */
    private int f23238M;

    /* renamed from: N */
    private int f23239N;

    /* renamed from: O */
    private int f23240O;

    /* renamed from: P */
    private int f23241P;

    /* renamed from: Q */
    private String f23242Q;

    /* renamed from: R */
    private C9618b f23243R;

    /* renamed from: S */
    private boolean f23244S = false;

    /* renamed from: T */
    private boolean f23245T = false;

    /* renamed from: U */
    private List<CampaignEx> f23246U = new ArrayList();

    /* renamed from: n */
    private MBridgePlayableView f23247n;

    /* renamed from: o */
    private MBridgeClickCTAView f23248o;

    /* renamed from: p */
    private MBridgeClickMiniCardView f23249p;

    /* renamed from: q */
    private MBridgeNativeEndCardView f23250q;

    /* renamed from: r */
    private MBridgeH5EndCardView f23251r;

    /* renamed from: s */
    private MBridgeVastEndCardView f23252s;

    /* renamed from: t */
    private MBridgeLandingPageView f23253t;

    /* renamed from: u */
    private MBridgeVideoEndCoverView f23254u;

    /* renamed from: v */
    private MBridgeAlertWebview f23255v;

    /* renamed from: w */
    private MBridgeOrderCampView f23256w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public String f23257x;

    /* renamed from: y */
    private int f23258y;

    /* renamed from: z */
    private int f23259z = 1;

    public void setJSFactory(C9618b bVar) {
        this.f23243R = bVar;
    }

    public void addOrderViewData(List<CampaignEx> list) {
        if (list != null) {
            this.f23246U = list;
        }
    }

    public int getVideoSkipTime() {
        return this.f23234I;
    }

    public void setVideoSkipTime(int i) {
        this.f23234I = i;
    }

    public MBridgeContainerView(Context context) {
        super(context);
    }

    public MBridgeContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void init(Context context) {
        setVisibility(0);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        MBridgeBaseView[] mBridgeBaseViewArr = {this.f23247n, this.f23248o, this.f23249p, this.f23250q, this.f23251r, this.f23252s, this.f23253t, this.f23254u};
        for (int i = 0; i < 8; i++) {
            MBridgeBaseView mBridgeBaseView = mBridgeBaseViewArr[i];
            if (mBridgeBaseView != null && (mBridgeBaseView instanceof MBridgeClickMiniCardView)) {
                mBridgeBaseView.onSelfConfigurationChanged(configuration);
            } else if (mBridgeBaseView != null && mBridgeBaseView.getVisibility() == 0 && mBridgeBaseView.getParent() != null && !isLast()) {
                mBridgeBaseView.onSelfConfigurationChanged(configuration);
            }
        }
    }

    public void preLoadData(final C9618b bVar) {
        this.f23243R = bVar;
        if (this.f23196b != null) {
            if (this.f23196b.getPlayable_ads_without_video() == 2) {
                if (this.f23247n == null) {
                    this.f23247n = new MBridgePlayableView(this.f23195a);
                }
                this.f23247n.setCloseDelayShowTime(this.f23226A);
                this.f23247n.setPlayCloseBtnTm(this.f23227B);
                this.f23247n.setCampaign(this.f23196b);
                this.f23247n.setNotifyListener(new C9483i(this.f23199e) {
                    /* renamed from: a */
                    public final void mo62631a(int i, Object obj) {
                        super.mo62631a(i, obj);
                        if (i == 100) {
                            MBridgeContainerView.this.webviewshow();
                            MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                            mBridgeContainerView.onConfigurationChanged(mBridgeContainerView.getResources().getConfiguration());
                            C8468m mVar = new C8468m();
                            mVar.mo57840k(MBridgeContainerView.this.f23196b.getRequestId());
                            mVar.mo57842l(MBridgeContainerView.this.f23196b.getRequestIdNotice());
                            mVar.mo57846n(MBridgeContainerView.this.f23196b.getId());
                            mVar.mo57816a(MBridgeContainerView.this.f23196b.isMraid() ? C8468m.f20702a : C8468m.f20703b);
                            C8580c.m24605a(mVar, MBridgeContainerView.this.f23195a, MBridgeContainerView.this.f23257x);
                        }
                    }
                });
                this.f23247n.preLoadData(bVar);
            } else {
                m26832b(this.f23258y);
                if (this.f23196b.isDynamicView()) {
                    try {
                        m26830a(bVar, Integer.valueOf(this.f23196b.getVideo_end_type()));
                    } catch (Throwable th) {
                        C8672v.m24878d(MBridgeBaseView.TAG, th.getMessage());
                        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new Runnable() {
                            public final void run() {
                                MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                                mBridgeContainerView.m26830a(bVar, Integer.valueOf(mBridgeContainerView.f23196b.getVideo_end_type()));
                            }
                        });
                    }
                    if (!C8677z.m24952j(this.f23196b.getendcard_url())) {
                        try {
                            String a = C8617ae.m24720a(this.f23196b.getendcard_url(), "mof");
                            if (!TextUtils.isEmpty(a) && Integer.parseInt(a) == 1) {
                                C9391a.m26760a().mo62918a(this.f23196b);
                            }
                        } catch (Exception e) {
                            C8672v.m24878d(MBridgeBaseView.TAG, e.getMessage());
                        }
                    }
                } else {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                        public final void run() {
                            MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                            mBridgeContainerView.m26830a(bVar, Integer.valueOf(mBridgeContainerView.f23196b.getVideo_end_type()));
                        }
                    }, (long) getVideoSkipTime());
                }
            }
            m26835g();
        }
    }

    public void showPlayableView() {
        if (this.f23196b != null && !this.f23233H) {
            removeAllViews();
            setMatchParent();
            if (this.f23247n == null) {
                preLoadData(this.f23243R);
            }
            addView(this.f23247n);
            MBridgePlayableView mBridgePlayableView = this.f23247n;
            if (mBridgePlayableView != null) {
                mBridgePlayableView.setUnitId(this.f23257x);
                if (this.f23196b != null && this.f23196b.isMraid() && this.f23196b.getPlayable_ads_without_video() == 2) {
                    this.f23247n.setCloseVisible(0);
                }
                this.f23247n.setNotchValue(this.f23242Q, this.f23237L, this.f23238M, this.f23239N, this.f23240O);
            }
            this.f23245T = true;
            bringToFront();
        }
    }

    public boolean showAlertWebView() {
        MBridgeAlertWebview mBridgeAlertWebview = this.f23255v;
        if (mBridgeAlertWebview == null || !mBridgeAlertWebview.isLoadSuccess()) {
            return false;
        }
        setMatchParent();
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (!(viewGroup.indexOfChild(this) == viewGroup.getChildCount() - 1) && !this.f23245T) {
            removeAllViews();
            bringToFront();
            this.f23244S = true;
        }
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f23249p;
        if (mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.getParent() != null) {
            return false;
        }
        if (this.f23255v == null) {
            m26835g();
        }
        MBridgeAlertWebview mBridgeAlertWebview2 = this.f23255v;
        if (!(mBridgeAlertWebview2 == null || mBridgeAlertWebview2.getParent() == null)) {
            removeView(this.f23255v);
        }
        addView(this.f23255v);
        setBackgroundColor(0);
        this.f23255v.webviewshow();
        return true;
    }

    public void showVideoClickView(int i) {
        if (this.f23196b == null) {
            return;
        }
        if (i != -1) {
            if (i != 1) {
                if (i == 2) {
                    MBridgeClickCTAView mBridgeClickCTAView = this.f23248o;
                    if (!(mBridgeClickCTAView == null || mBridgeClickCTAView.getParent() == null)) {
                        removeView(this.f23248o);
                    }
                    MBridgeAlertWebview mBridgeAlertWebview = this.f23255v;
                    if (mBridgeAlertWebview == null || mBridgeAlertWebview.getParent() == null) {
                        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f23249p;
                        if (mBridgeClickMiniCardView == null || mBridgeClickMiniCardView.getParent() == null) {
                            try {
                                if (this.f23196b != null && this.f23196b.getPlayable_ads_without_video() == 1) {
                                    setMatchParent();
                                    m26834f();
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        if (miniCardLoaded()) {
                            MBridgeH5EndCardView mBridgeH5EndCardView = this.f23251r;
                            if (!(mBridgeH5EndCardView == null || mBridgeH5EndCardView.getParent() == null)) {
                                removeView(this.f23251r);
                            }
                            this.f23199e.mo62631a(112, "");
                            if (this.f23196b != null && !this.f23196b.isHasReportAdTrackPause()) {
                                this.f23196b.setHasReportAdTrackPause(true);
                                C9499b.m27032f(this.f23195a, this.f23196b);
                            }
                            if (this.f23230E) {
                                this.f23199e.mo62631a(115, "");
                            } else {
                                this.f23245T = true;
                                bringToFront();
                                webviewshow();
                                onConfigurationChanged(getResources().getConfiguration());
                            }
                            this.f23229D = true;
                            return;
                        }
                        m26836h();
                    }
                }
            } else if (!this.f23228C) {
                MBridgeH5EndCardView mBridgeH5EndCardView2 = this.f23251r;
                if (!(mBridgeH5EndCardView2 == null || mBridgeH5EndCardView2.getParent() == null)) {
                    removeView(this.f23251r);
                }
                MBridgeClickMiniCardView mBridgeClickMiniCardView2 = this.f23249p;
                if (!(mBridgeClickMiniCardView2 == null || mBridgeClickMiniCardView2.getParent() == null)) {
                    removeView(this.f23249p);
                }
                MBridgeClickCTAView mBridgeClickCTAView2 = this.f23248o;
                if (mBridgeClickCTAView2 == null || mBridgeClickCTAView2.getParent() == null) {
                    try {
                        if (this.f23196b != null && this.f23196b.getPlayable_ads_without_video() == 1) {
                            this.f23245T = true;
                            if (this.f23248o == null) {
                                m26832b(-1);
                            }
                            if (this.f23248o != null) {
                                if (this.f23196b == null || !this.f23196b.isDynamicView()) {
                                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                                    layoutParams.addRule(12, -1);
                                    addView(this.f23248o, 0, layoutParams);
                                }
                            }
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                if (isLast()) {
                    bringToFront();
                }
            }
        } else if (!isLast() && !endCardShowing()) {
            m26836h();
        }
    }

    public void showEndcard(int i) {
        if (this.f23196b != null) {
            if (i == 1) {
                this.f23199e.mo62631a(104, "");
            } else if (i == 100) {
                if (this.f23196b.getPlayable_ads_without_video() == 2) {
                    this.f23233H = true;
                }
                m26828a((View) this.f23247n);
                setMatchParent();
                m26833e();
            } else if (i == 3) {
                removeAllViews();
                setMatchParent();
                if (this.f23252s == null) {
                    m26830a(this.f23243R, 3);
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(13, -1);
                addView(this.f23252s, layoutParams);
                this.f23252s.notifyShowListener();
                this.f23245T = true;
                bringToFront();
            } else if (i == 4) {
                this.f23199e.mo62631a(113, "");
                removeAllViews();
                setMatchParent();
                if (this.f23253t == null) {
                    m26830a(this.f23243R, 4);
                }
                this.f23253t.preLoadData(this.f23243R);
                addView(this.f23253t);
                this.f23245T = true;
                bringToFront();
            } else if (i != 5) {
                removeAllViews();
                setMatchParent();
                this.f23245T = true;
                bringToFront();
                m26827a();
                this.f23199e.mo62631a(117, "");
            } else {
                this.f23199e.mo62631a(106, "");
            }
        }
        this.f23228C = true;
    }

    public void showVideoEndCover() {
        removeAllViews();
        setMatchParent();
        MBridgeVideoEndCoverView mBridgeVideoEndCoverView = this.f23254u;
        if (mBridgeVideoEndCoverView == null) {
            C9618b bVar = this.f23243R;
            this.f23243R = bVar;
            if (mBridgeVideoEndCoverView == null) {
                MBridgeVideoEndCoverView mBridgeVideoEndCoverView2 = new MBridgeVideoEndCoverView(this.f23195a);
                this.f23254u = mBridgeVideoEndCoverView2;
                mBridgeVideoEndCoverView2.setCampaign(this.f23196b);
                this.f23254u.setNotifyListener(new C9483i(this.f23199e));
                this.f23254u.preLoadData(bVar);
            }
        }
        addView(this.f23254u);
        onConfigurationChanged(getResources().getConfiguration());
        this.f23245T = true;
        bringToFront();
    }

    public void showOrderCampView() {
        MBridgeOrderCampView mBridgeOrderCampView = new MBridgeOrderCampView(this.f23195a);
        this.f23256w = mBridgeOrderCampView;
        mBridgeOrderCampView.setCampaignExes(this.f23246U);
        if (this.f23199e != null && (this.f23199e instanceof C9485k)) {
            ((C9485k) this.f23199e).mo63211a(this.f23246U);
        }
        this.f23256w.setNotifyListener(new C9483i(this.f23199e));
        this.f23256w.setRewarded(this.f23236K);
        this.f23256w.setNotchPadding(this.f23237L, this.f23238M, this.f23239N, this.f23240O);
        this.f23256w.setCampOrderViewBuildCallback(new C9323b() {
            /* renamed from: a */
            public final void mo62773a() {
                if (MBridgeContainerView.this.f23199e != null) {
                    MBridgeContainerView.this.f23199e.mo62631a(117, "");
                }
            }

            /* renamed from: b */
            public final void mo62774b() {
                if (MBridgeContainerView.this.f23196b.getAdSpaceT() == 2) {
                    MBridgeContainerView.this.showVideoEndCover();
                    return;
                }
                MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                mBridgeContainerView.showEndcard(mBridgeContainerView.f23196b.getVideo_end_type());
            }
        });
        this.f23256w.createView(this);
    }

    public boolean endCardShowing() {
        return this.f23228C;
    }

    public boolean miniCardShowing() {
        return this.f23229D;
    }

    public boolean miniCardLoaded() {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f23249p;
        return mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.isLoadSuccess();
    }

    public void toggleCloseBtn(int i) {
        MBridgePlayableView mBridgePlayableView = this.f23247n;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.toggleCloseBtn(i);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f23251r;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.toggleCloseBtn(i);
        }
    }

    public void notifyCloseBtn(int i) {
        MBridgePlayableView mBridgePlayableView = this.f23247n;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.notifyCloseBtn(i);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f23251r;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.notifyCloseBtn(i);
        }
    }

    public void triggerCloseBtn(String str) {
        if (this.f23196b != null) {
            this.f23199e.mo62631a(122, "");
            this.f23199e.mo62631a(104, "");
        }
    }

    public void readyStatus(int i) {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f23251r;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.readyStatus(i);
        }
    }

    public void handlerPlayableException(String str) {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f23251r;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.handlerPlayableException(str);
            if (!this.f23235J) {
                return;
            }
        }
        m26827a();
    }

    public void showMiniCard(int i, int i2, int i3, int i4, int i5) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f23249p;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.setMiniCardLocation(i, i2, i3, i4);
            this.f23249p.setRadius(i5);
            this.f23249p.setCloseVisible(8);
            this.f23249p.setClickable(false);
            removeAllViews();
            setMatchParent();
            this.f23245T = true;
            bringToFront();
            m26834f();
            if (!this.f23232G) {
                this.f23232G = true;
                this.f23199e.mo62631a(109, "");
                this.f23199e.mo62631a(117, "");
            }
        }
    }

    public void resizeMiniCard(int i, int i2, int i3) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f23249p;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.resizeMiniCard(i, i2);
            this.f23249p.setRadius(i3);
            removeAllViews();
            setMatchParent();
            this.f23245T = true;
            bringToFront();
            m26834f();
        }
    }

    public void configurationChanged(int i, int i2, int i3) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f23249p;
        if (mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.getVisibility() == 0) {
            this.f23249p.resizeMiniCard(i, i2);
        }
    }

    public void webviewshow() {
        MBridgeH5EndCardView[] mBridgeH5EndCardViewArr = {this.f23247n, this.f23249p, this.f23251r, this.f23255v};
        for (int i = 0; i < 4; i++) {
            MBridgeH5EndCardView mBridgeH5EndCardView = mBridgeH5EndCardViewArr[i];
            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getVisibility() == 0 && mBridgeH5EndCardView.getParent() != null && !isLast()) {
                mBridgeH5EndCardView.webviewshow();
            }
        }
    }

    public void install(CampaignEx campaignEx) {
        this.f23199e.mo62631a(105, campaignEx);
    }

    public void orientation(Configuration configuration) {
        MBridgeH5EndCardView[] mBridgeH5EndCardViewArr = {this.f23247n, this.f23249p, this.f23251r, this.f23255v};
        for (int i = 0; i < 4; i++) {
            MBridgeH5EndCardView mBridgeH5EndCardView = mBridgeH5EndCardViewArr[i];
            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getVisibility() == 0) {
                mBridgeH5EndCardView.orientation(getResources().getConfiguration());
            }
        }
    }

    public void setNotifyListener(C9473a aVar) {
        super.setNotifyListener(aVar);
        MBridgeBaseView[] mBridgeBaseViewArr = {this.f23247n, this.f23248o, this.f23249p, this.f23250q, this.f23251r, this.f23252s, this.f23253t, this.f23254u};
        for (int i = 0; i < 8; i++) {
            MBridgeBaseView mBridgeBaseView = mBridgeBaseViewArr[i];
            if (mBridgeBaseView != null) {
                if (mBridgeBaseView instanceof MBridgeClickMiniCardView) {
                    mBridgeBaseView.setNotifyListener(new C9481g(this.f23249p, aVar));
                } else {
                    mBridgeBaseView.setNotifyListener(new C9483i(aVar));
                }
            }
        }
    }

    public void defaultShow() {
        super.defaultShow();
    }

    public void addView(View view) {
        if (view != null) {
            m26828a(view);
            super.addView(view);
            return;
        }
        C8672v.m24878d(MBridgeBaseView.TAG, "view is null");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view != null) {
            m26828a(view);
            super.addView(view, layoutParams);
            return;
        }
        C8672v.m24878d(MBridgeBaseView.TAG, "view is null");
    }

    public boolean canBackPress() {
        if (this.f23250q != null) {
            return false;
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f23251r;
        if (mBridgeH5EndCardView != null) {
            return mBridgeH5EndCardView.canBackPress();
        }
        MBridgeLandingPageView mBridgeLandingPageView = this.f23253t;
        if (mBridgeLandingPageView != null) {
            return mBridgeLandingPageView.canBackPress();
        }
        MBridgePlayableView mBridgePlayableView = this.f23247n;
        if (mBridgePlayableView != null) {
            return mBridgePlayableView.canBackPress();
        }
        return false;
    }

    public boolean endcardIsPlayable() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f23251r;
        return mBridgeH5EndCardView != null && mBridgeH5EndCardView.isPlayable();
    }

    public void setShowingTransparent(boolean z) {
        this.f23230E = z;
    }

    public boolean getShowingTransparent() {
        return this.f23230E;
    }

    public String getUnitID() {
        return this.f23257x;
    }

    public void setUnitID(String str) {
        this.f23257x = str;
    }

    public void setVideoInteractiveType(int i) {
        if (this.f23196b == null || !this.f23196b.isDynamicView()) {
            this.f23258y = i;
            return;
        }
        int a = C9365b.m26701a(this.f23196b);
        if (a == 100) {
            this.f23258y = i;
        } else {
            this.f23258y = a;
        }
    }

    public void setEndscreenType(int i) {
        this.f23259z = i;
    }

    public int getVideoInteractiveType() {
        return this.f23258y;
    }

    public void setCloseDelayTime(int i) {
        this.f23226A = i;
    }

    public void setPlayCloseBtnTm(int i) {
        this.f23227B = i;
    }

    /* renamed from: a */
    private void m26828a(View view) {
        if (view != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            } catch (Throwable th) {
                C8672v.m24875a(MBridgeBaseView.TAG, th.getMessage(), th);
            }
        }
    }

    /* renamed from: a */
    private void m26827a() {
        if (this.f23196b != null) {
            boolean isDynamicView = this.f23196b.isDynamicView();
            boolean j = C8677z.m24952j(this.f23196b.getendcard_url());
            if (isDynamicView && !j) {
                m26833e();
                return;
            }
        }
        if (this.f23259z != 2 || this.f23235J) {
            m26833e();
        } else {
            m26831b();
        }
    }

    /* renamed from: b */
    private void m26831b() {
        if (this.f23251r == null) {
            m26830a(this.f23243R, 2);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f23251r;
        if (mBridgeH5EndCardView == null || !mBridgeH5EndCardView.isLoadSuccess()) {
            m26833e();
            MBridgeH5EndCardView mBridgeH5EndCardView2 = this.f23251r;
            if (mBridgeH5EndCardView2 != null) {
                mBridgeH5EndCardView2.reportRenderResult("timeout", 3);
                this.f23251r.setError(true);
            }
        } else {
            this.f23235J = true;
            addView(this.f23251r);
            webviewshow();
            onConfigurationChanged(getResources().getConfiguration());
            this.f23251r.excuteTask();
            this.f23251r.setNotchValue(this.f23242Q, this.f23237L, this.f23238M, this.f23239N, this.f23240O);
            C8468m mVar = new C8468m();
            mVar.mo57840k(this.f23196b.getRequestId());
            mVar.mo57842l(this.f23196b.getRequestIdNotice());
            mVar.mo57846n(this.f23196b.getId());
            mVar.mo57816a(this.f23196b.isMraid() ? C8468m.f20702a : C8468m.f20703b);
            C8580c.m24605a(mVar, this.f23195a, this.f23257x);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView3 = this.f23251r;
        if (mBridgeH5EndCardView3 != null) {
            mBridgeH5EndCardView3.setUnitId(this.f23257x);
        }
    }

    /* renamed from: e */
    private void m26833e() {
        this.f23259z = 1;
        if (this.f23250q == null) {
            m26830a(this.f23243R, 2);
        }
        addView(this.f23250q);
        onConfigurationChanged(getResources().getConfiguration());
        this.f23250q.notifyShowListener();
        this.f23245T = true;
        bringToFront();
    }

    /* renamed from: f */
    private void m26834f() {
        if (this.f23249p == null) {
            m26832b(-2);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        if (this.f23230E && this.f23231F) {
            this.f23231F = false;
            layoutParams.width = 1;
            layoutParams.height = 1;
        }
        addView(this.f23249p, layoutParams);
    }

    /* renamed from: g */
    private void m26835g() {
        if (this.f23255v == null) {
            MBridgeAlertWebview mBridgeAlertWebview = new MBridgeAlertWebview(this.f23195a);
            this.f23255v = mBridgeAlertWebview;
            mBridgeAlertWebview.setUnitId(this.f23257x);
            this.f23255v.setCampaign(this.f23196b);
        }
        this.f23255v.preLoadData(this.f23243R);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m26830a(C9618b bVar, Integer num) {
        this.f23243R = bVar;
        if (this.f23196b != null) {
            if (num == null) {
                num = Integer.valueOf(this.f23196b.getVideo_end_type());
            }
            if (!isLast()) {
                m26836h();
            }
            int intValue = num.intValue();
            if (intValue == 1) {
                return;
            }
            if (intValue == 3) {
                if (this.f23252s == null) {
                    this.f23252s = new MBridgeVastEndCardView(this.f23195a);
                }
                this.f23252s.setCampaign(this.f23196b);
                this.f23252s.setNotifyListener(new C9490l(this.f23199e));
                this.f23252s.preLoadData(bVar);
            } else if (intValue == 4) {
                if (this.f23253t == null) {
                    this.f23253t = new MBridgeLandingPageView(this.f23195a);
                }
                this.f23253t.setCampaign(this.f23196b);
                this.f23253t.setNotifyListener(new C9483i(this.f23199e));
            } else if (intValue == 5) {
            } else {
                if (this.f23259z == 2) {
                    boolean isDynamicView = this.f23196b.isDynamicView();
                    boolean j = C8677z.m24952j(this.f23196b.getendcard_url());
                    if ((this.f23196b == null || !isDynamicView || j) && this.f23196b.getAdSpaceT() != 2) {
                        if (this.f23251r == null) {
                            this.f23251r = new MBridgeH5EndCardView(this.f23195a);
                        }
                        if (this.f23196b.getDynamicTempCode() == 5 && this.f23199e != null && (this.f23199e instanceof C9485k)) {
                            ((C9485k) this.f23199e).mo63209a(this.f23196b);
                        }
                        this.f23251r.setCampaign(this.f23196b);
                        this.f23251r.setCloseDelayShowTime(this.f23226A);
                        this.f23251r.setNotifyListener(new C9483i(this.f23199e));
                        this.f23251r.setUnitId(this.f23257x);
                        this.f23251r.setNotchValue(this.f23242Q, this.f23237L, this.f23238M, this.f23239N, this.f23240O);
                        this.f23251r.preLoadData(bVar);
                        if (!this.f23230E) {
                            addView(this.f23251r);
                            return;
                        }
                        return;
                    }
                    return;
                }
                int c = (this.f23196b == null || this.f23196b.getRewardTemplateMode() == null) ? 0 : this.f23196b.getRewardTemplateMode().mo57574c();
                if (this.f23250q == null) {
                    if (this.f23196b.isDynamicView()) {
                        m26837i();
                    } else {
                        MBridgeNativeEndCardView mBridgeNativeEndCardView = new MBridgeNativeEndCardView(this.f23195a, (AttributeSet) null, false, -1, this.f23196b.getAdSpaceT() == 2, c, this.f23196b.getMof_tplid());
                        this.f23250q = mBridgeNativeEndCardView;
                        mBridgeNativeEndCardView.setCampaign(this.f23196b);
                    }
                }
                this.f23250q.setLayout();
                if (this.f23196b.isDynamicView()) {
                    if (C9391a.m26760a().mo62920a(this.f23196b.getRequestId())) {
                        try {
                            C9391a.m26760a().mo62917a((ViewGroup) this.f23250q, this.f23196b.getRequestId(), (C9473a) new C9483i(this.f23199e));
                        } catch (Exception e) {
                            C8672v.m24878d(MBridgeBaseView.TAG, e.getMessage());
                        }
                    } else {
                        try {
                            String a = C8617ae.m24720a(this.f23196b.getendcard_url(), "mof");
                            if (!TextUtils.isEmpty(a) && Integer.parseInt(a) == 1) {
                                C9391a.m26760a().mo62919a(this.f23196b, (ViewGroup) this.f23250q, (C9473a) new C9483i(this.f23199e));
                            }
                        } catch (Exception e2) {
                            C8672v.m24878d(MBridgeBaseView.TAG, e2.getMessage());
                        }
                    }
                }
                this.f23250q.setUnitId(this.f23257x);
                this.f23250q.setCloseBtnDelay(this.f23226A);
                this.f23250q.setNotifyListener(new C9483i(this.f23199e));
                this.f23250q.preLoadData(bVar);
                this.f23250q.setNotchPadding(this.f23237L, this.f23238M, this.f23239N, this.f23240O);
            }
        }
    }

    public boolean isLast() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null || viewGroup.indexOfChild(this) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private void m26836h() {
        this.f23229D = false;
        this.f23245T = false;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            int i = 0;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i);
                if (!(childAt instanceof MBridgeContainerView)) {
                    viewGroup.bringChildToFront(childAt);
                } else {
                    i++;
                }
            }
        }
    }

    /* renamed from: b */
    private void m26832b(int i) {
        if (i == -3) {
            return;
        }
        if (i != -2) {
            if (this.f23248o == null) {
                this.f23248o = new MBridgeClickCTAView(this.f23195a);
            }
            this.f23248o.setCampaign(this.f23196b);
            this.f23248o.setUnitId(this.f23257x);
            this.f23248o.setNotifyListener(new C9483i(this.f23199e));
            this.f23248o.preLoadData(this.f23243R);
        } else if (this.f23196b != null && this.f23196b.getVideo_end_type() == 2) {
            if (this.f23249p == null) {
                this.f23249p = new MBridgeClickMiniCardView(this.f23195a);
            }
            this.f23249p.setCampaign(this.f23196b);
            this.f23249p.setNotifyListener(new C9481g(this.f23249p, this.f23199e));
            this.f23249p.preLoadData(this.f23243R);
            setMatchParent();
            m26834f();
            m26836h();
        }
    }

    public CampaignEx getReSetCampaign() {
        if (!this.f23196b.isDynamicView() || !TextUtils.isEmpty(this.f23196b.getendcard_url())) {
            return null;
        }
        int size = this.f23246U.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (this.f23246U.get(i2) != null && this.f23246U.get(i2).getId() == this.f23196b.getId()) {
                    i = i2 - 1;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        if (i < 0 || i >= size || this.f23246U.get(i) == null) {
            return null;
        }
        return this.f23246U.get(i);
    }

    /* renamed from: i */
    private void m26837i() {
        if (this.f23196b != null) {
            String str = this.f23196b.getendcard_url();
            boolean isEmpty = TextUtils.isEmpty(str);
            int i = TTAdConstant.DEEPLINK_FALLBACK_CODE;
            if (!isEmpty) {
                try {
                    i = Integer.parseInt(C8617ae.m24720a(str, "ecid"));
                } catch (Throwable th) {
                    C8672v.m24878d(MBridgeBaseView.TAG, th.getMessage());
                }
            }
            this.f23250q = new MBridgeNativeEndCardView(this.f23195a, (AttributeSet) null, true, i, this.f23196b.getAdSpaceT() == 2, this.f23206l, this.f23196b.getMof_tplid());
            if (this.f23196b.getDynamicTempCode() == 5) {
                if (this.f23199e != null && (this.f23199e instanceof C9485k)) {
                    ((C9485k) this.f23199e).mo63209a(this.f23196b);
                }
                this.f23250q.setCampaign(this.f23196b);
                return;
            }
            this.f23250q.setCampaign(this.f23196b);
        }
    }

    public void setMBridgeClickMiniCardViewTransparent() {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f23249p;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.setMBridgeClickMiniCardViewTransparent();
            this.f23249p.setMBridgeClickMiniCardViewClickable(false);
        }
    }

    public void onPlayableBackPress() {
        MBridgePlayableView mBridgePlayableView = this.f23247n;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.onBackPress();
        }
    }

    public void onMiniEndcardBackPress() {
        if (this.f23229D) {
            this.f23199e.mo62631a(107, "");
        }
    }

    public void onEndcardBackPress() {
        if (this.f23250q != null || this.f23252s != null) {
            this.f23199e.mo62631a(104, "");
        } else if (this.f23253t != null) {
            this.f23199e.mo62631a(103, "");
        } else {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f23251r;
            if (mBridgeH5EndCardView != null) {
                mBridgeH5EndCardView.onBackPress();
            }
        }
    }

    public void release() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f23251r;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.release();
            this.f23251r = null;
        }
        MBridgePlayableView mBridgePlayableView = this.f23247n;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.release();
        }
        MBridgeLandingPageView mBridgeLandingPageView = this.f23253t;
        if (mBridgeLandingPageView != null) {
            mBridgeLandingPageView.release();
        }
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f23250q;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.clearMoreOfferBitmap();
        }
    }

    public MBridgeH5EndCardView getH5EndCardView() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f23251r;
        return mBridgeH5EndCardView == null ? this.f23247n : mBridgeH5EndCardView;
    }

    public void hideAlertWebview() {
        if (!isLast()) {
            if (this.f23244S && !this.f23245T) {
                m26836h();
                this.f23244S = false;
            }
            MBridgeAlertWebview mBridgeAlertWebview = this.f23255v;
            if (mBridgeAlertWebview != null && mBridgeAlertWebview.getParent() != null) {
                removeView(this.f23255v);
                MBridgeClickCTAView mBridgeClickCTAView = this.f23248o;
                if (mBridgeClickCTAView != null && mBridgeClickCTAView.getParent() != null) {
                    setWrapContent();
                    ViewGroup.LayoutParams layoutParams = getLayoutParams();
                    if (layoutParams instanceof RelativeLayout.LayoutParams) {
                        ((RelativeLayout.LayoutParams) layoutParams).addRule(12, -1);
                    }
                }
            }
        }
    }

    public void ivRewardAdsWithoutVideo(String str) {
        this.f23199e.mo62631a(103, str);
    }

    public void setNotchPadding(int i, int i2, int i3, int i4, int i5) {
        C8672v.m24878d(MBridgeBaseView.TAG, "NOTCH ContainerView " + String.format("%1s-%2s-%3s-%4s-%5s", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i)}));
        this.f23241P = i;
        this.f23237L = i2;
        this.f23238M = i3;
        this.f23239N = i4;
        this.f23240O = i5;
        this.f23242Q = C8646l.m24774a(i, i2, i3, i4, i5);
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f23250q;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setNotchPadding(i2, i3, i4, i5);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f23251r;
        if (!(mBridgeH5EndCardView == null || mBridgeH5EndCardView.f23287q == null)) {
            this.f23251r.setNotchValue(this.f23242Q, i2, i3, i4, i5);
            C8887g.m25669a().mo58687a((WebView) this.f23251r.f23287q, "oncutoutfetched", Base64.encodeToString(this.f23242Q.getBytes(), 0));
        }
        MBridgePlayableView mBridgePlayableView = this.f23247n;
        if (!(mBridgePlayableView == null || mBridgePlayableView.f23287q == null)) {
            this.f23247n.setNotchValue(this.f23242Q, i2, i3, i4, i5);
            C8887g.m25669a().mo58687a((WebView) this.f23247n.f23287q, "oncutoutfetched", Base64.encodeToString(this.f23242Q.getBytes(), 0));
        }
        MBridgeOrderCampView mBridgeOrderCampView = this.f23256w;
        if (mBridgeOrderCampView != null) {
            mBridgeOrderCampView.setNotchPadding(i2, i3, i4, i5);
        }
    }

    public void setOnResume() {
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f23250q;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setOnResume();
        }
    }

    public void setOnPause() {
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f23250q;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setOnPause();
        }
    }

    public void setRewardStatus(boolean z) {
        this.f23236K = z;
    }
}
