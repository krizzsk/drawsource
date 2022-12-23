package com.mbridge.msdk.video.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C6765a;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.C8468m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p085b.C2462a;
import com.mbridge.msdk.foundation.p085b.C2470b;
import com.mbridge.msdk.foundation.same.C8469a;
import com.mbridge.msdk.foundation.same.report.C8580c;
import com.mbridge.msdk.foundation.same.report.C8582d;
import com.mbridge.msdk.foundation.tools.C8616ad;
import com.mbridge.msdk.foundation.tools.C8660r;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.mbsignalcommon.mraid.C8871a;
import com.mbridge.msdk.mbsignalcommon.mraid.C8873b;
import com.mbridge.msdk.mbsignalcommon.mraid.C8875d;
import com.mbridge.msdk.mbsignalcommon.windvane.C8887g;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.video.module.p367a.C9473a;
import com.mbridge.msdk.video.signal.C9619g;
import com.mbridge.msdk.videocommon.download.C9652g;
import com.mbridge.msdk.widget.FeedBackButton;
import com.smaato.sdk.core.injections.CoreLightModuleInterface;
import com.tapjoy.TJAdUnitConstants;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class MBridgeH5EndCardView extends MBridgeBaseView implements C8873b, C9619g {

    /* renamed from: A */
    private boolean f23266A = false;

    /* renamed from: B */
    private int f23267B = 1;

    /* renamed from: C */
    private int f23268C = 1;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f23269D = false;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public boolean f23270E = false;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public int f23271F = 1;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public long f23272G = 0;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public boolean f23273H = false;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public boolean f23274I = false;

    /* renamed from: J */
    private boolean f23275J = false;

    /* renamed from: K */
    private boolean f23276K = false;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public boolean f23277L = false;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public boolean f23278M = false;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public boolean f23279N = false;

    /* renamed from: O */
    private boolean f23280O = false;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public String f23281P = "";

    /* renamed from: Q */
    private boolean f23282Q = false;

    /* renamed from: R */
    private boolean f23283R = false;

    /* renamed from: n */
    protected View f23284n;

    /* renamed from: o */
    protected RelativeLayout f23285o;

    /* renamed from: p */
    protected ImageView f23286p;

    /* renamed from: q */
    protected WindVaneWebView f23287q;

    /* renamed from: r */
    protected Handler f23288r = new Handler();

    /* renamed from: s */
    protected String f23289s;

    /* renamed from: t */
    protected boolean f23290t = false;

    /* renamed from: u */
    protected boolean f23291u = false;

    /* renamed from: v */
    protected String f23292v;

    /* renamed from: w */
    Handler f23293w = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 100) {
                if (MBridgeH5EndCardView.this.f23273H) {
                    MBridgeH5EndCardView.this.f23199e.mo62631a(122, "");
                }
                MBridgeH5EndCardView.this.f23199e.mo62631a(103, "");
            }
        }
    };

    /* renamed from: x */
    boolean f23294x = false;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public FeedBackButton f23295y;

    /* renamed from: z */
    private boolean f23296z = false;

    public void expand(String str, boolean z) {
    }

    public void install(CampaignEx campaignEx) {
    }

    public void readyStatus(int i) {
    }

    public MBridgeH5EndCardView(Context context) {
        super(context);
    }

    public MBridgeH5EndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        orientation(configuration);
    }

    public void init(Context context) {
        int findLayout = findLayout("mbridge_reward_endcard_h5");
        if (findLayout >= 0) {
            View inflate = this.f23197c.inflate(findLayout, (ViewGroup) null);
            this.f23284n = inflate;
            try {
                this.f23286p = (ImageView) inflate.findViewById(findID("mbridge_windwv_close"));
                this.f23285o = (RelativeLayout) inflate.findViewById(findID("mbridge_windwv_content_rl"));
                this.f23287q = new WindVaneWebView(getContext());
                this.f23287q.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                this.f23285o.addView(this.f23287q);
                this.f23200f = isNotNULL(this.f23286p, this.f23287q);
            } catch (Exception unused) {
                this.f23200f = false;
            }
            addView(this.f23284n, mo62969b());
            mo62973c();
            mo63002e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo62973c() {
        super.mo62973c();
        if (this.f23200f) {
            this.f23286p.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    MBridgeH5EndCardView.this.onCloseViewClick();
                }
            });
        }
    }

    public void onCloseViewClick() {
        try {
            if (this.f23287q != null) {
                C8887g.m25669a().mo58687a((WebView) this.f23287q, "onSystemDestory", "");
                new Thread(new C9430a(this)).start();
                return;
            }
            this.f23199e.mo62631a(103, "");
            this.f23199e.mo62631a(119, "webview is null when closing webview");
        } catch (Exception e) {
            this.f23199e.mo62631a(103, "");
            C9473a aVar = this.f23199e;
            aVar.mo62631a(119, "close webview exception" + e.getMessage());
            C8672v.m24874a(MBridgeBaseView.TAG, e.getMessage());
        }
    }

    /* renamed from: com.mbridge.msdk.video.module.MBridgeH5EndCardView$a */
    private class C9430a implements Runnable {

        /* renamed from: b */
        private MBridgeH5EndCardView f23304b;

        public C9430a(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f23304b = mBridgeH5EndCardView;
        }

        public final void run() {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                C8672v.m24878d("CloseRunnable", e.getMessage());
            }
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f23304b;
            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.f23293w != null) {
                this.f23304b.f23293w.sendEmptyMessage(100);
            }
        }
    }

    public void setError(boolean z) {
        this.f23291u = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fa A[Catch:{ all -> 0x0102 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00fe A[Catch:{ all -> 0x0102 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void preLoadData(com.mbridge.msdk.video.signal.factory.C9618b r10) {
        /*
            r9 = this;
            java.lang.String r0 = "wfr=1"
            java.lang.String r1 = "="
            java.lang.String r3 = r9.mo62968a()
            boolean r2 = r9.f23200f
            r8 = 0
            if (r2 == 0) goto L_0x0149
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r9.f23196b
            if (r2 == 0) goto L_0x0149
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L_0x0149
            long r4 = java.lang.System.currentTimeMillis()
            r9.f23272G = r4
            java.lang.String r2 = "start"
            r9.reportRenderResult(r2, r8)     // Catch:{ Exception -> 0x0022 }
        L_0x0022:
            com.mbridge.msdk.foundation.webview.BrowserView$MBDownloadListener r2 = new com.mbridge.msdk.foundation.webview.BrowserView$MBDownloadListener
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r9.f23196b
            r2.<init>(r4)
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r9.f23196b
            java.lang.String r4 = r4.getAppName()
            r2.setTitle(r4)
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r4 = r9.f23287q
            r4.setDownloadListener(r2)
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r2 = r9.f23287q
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r9.f23196b
            java.lang.String r4 = r4.getId()
            r2.setCampaignId(r4)
            r2 = 8
            r9.setCloseVisible(r2)
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r2 = r9.f23287q
            r2.setApiManagerJSFactory(r10)
            com.mbridge.msdk.foundation.entity.CampaignEx r10 = r9.f23196b
            boolean r10 = r10.isMraid()
            if (r10 == 0) goto L_0x0059
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r10 = r9.f23287q
            r10.setMraidObject(r9)
        L_0x0059:
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r10 = r9.f23287q
            com.mbridge.msdk.video.module.MBridgeH5EndCardView$3 r2 = new com.mbridge.msdk.video.module.MBridgeH5EndCardView$3
            r2.<init>()
            r10.setWebViewListener(r2)
            com.mbridge.msdk.foundation.entity.CampaignEx r10 = r9.f23196b
            java.lang.String r10 = r10.getMraid()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            java.lang.String r2 = "MBridgeBaseView"
            if (r10 == 0) goto L_0x010a
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0102 }
            r9.f23272G = r4     // Catch:{ all -> 0x0102 }
            com.mbridge.msdk.foundation.entity.CampaignEx r10 = r9.f23196b     // Catch:{ all -> 0x0102 }
            java.lang.String r10 = r10.getendcard_url()     // Catch:{ all -> 0x0102 }
            com.mbridge.msdk.videocommon.d.b r4 = com.mbridge.msdk.videocommon.p375d.C9638b.m27377a()     // Catch:{ all -> 0x0102 }
            com.mbridge.msdk.foundation.controller.a r5 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ all -> 0x0102 }
            java.lang.String r5 = r5.mo56914h()     // Catch:{ all -> 0x0102 }
            java.lang.String r6 = r9.f23292v     // Catch:{ all -> 0x0102 }
            com.mbridge.msdk.videocommon.d.c r4 = r4.mo63550a(r5, r6)     // Catch:{ all -> 0x0102 }
            boolean r5 = r9.f23266A     // Catch:{ all -> 0x0102 }
            if (r5 == 0) goto L_0x010a
            boolean r5 = com.mbridge.msdk.foundation.tools.C8616ad.m24718b(r10)     // Catch:{ all -> 0x0102 }
            if (r5 == 0) goto L_0x010a
            boolean r5 = r10.contains(r0)     // Catch:{ all -> 0x0102 }
            if (r5 != 0) goto L_0x00a7
            if (r4 == 0) goto L_0x010a
            int r5 = r4.mo63592m()     // Catch:{ all -> 0x0102 }
            if (r5 <= 0) goto L_0x010a
        L_0x00a7:
            boolean r0 = r10.contains(r0)     // Catch:{ all -> 0x0102 }
            r5 = 20
            if (r0 == 0) goto L_0x00ea
            java.lang.String r0 = "&"
            java.lang.String[] r10 = r10.split(r0)     // Catch:{ all -> 0x0102 }
            if (r10 == 0) goto L_0x00f7
            int r0 = r10.length     // Catch:{ all -> 0x0102 }
            if (r0 <= 0) goto L_0x00f7
            int r0 = r10.length     // Catch:{ all -> 0x0102 }
            r4 = r8
        L_0x00bc:
            if (r4 >= r0) goto L_0x00f7
            r6 = r10[r4]     // Catch:{ all -> 0x0102 }
            boolean r7 = com.mbridge.msdk.foundation.tools.C8616ad.m24718b(r6)     // Catch:{ all -> 0x0102 }
            if (r7 == 0) goto L_0x00e7
            java.lang.String r7 = "to"
            boolean r7 = r6.contains(r7)     // Catch:{ all -> 0x0102 }
            if (r7 == 0) goto L_0x00e7
            java.lang.String[] r7 = r6.split(r1)     // Catch:{ all -> 0x0102 }
            if (r7 == 0) goto L_0x00e7
            java.lang.String[] r7 = r6.split(r1)     // Catch:{ all -> 0x0102 }
            int r7 = r7.length     // Catch:{ all -> 0x0102 }
            if (r7 <= 0) goto L_0x00e7
            java.lang.String[] r10 = r6.split(r1)     // Catch:{ all -> 0x0102 }
            r0 = 1
            r10 = r10[r0]     // Catch:{ all -> 0x0102 }
            int r10 = com.mbridge.msdk.foundation.tools.C8677z.m24907a((java.lang.Object) r10)     // Catch:{ all -> 0x0102 }
            goto L_0x00f8
        L_0x00e7:
            int r4 = r4 + 1
            goto L_0x00bc
        L_0x00ea:
            if (r4 == 0) goto L_0x00f7
            int r10 = r4.mo63592m()     // Catch:{ all -> 0x0102 }
            if (r10 <= 0) goto L_0x00f7
            int r10 = r4.mo63592m()     // Catch:{ all -> 0x0102 }
            goto L_0x00f8
        L_0x00f7:
            r10 = r5
        L_0x00f8:
            if (r10 < 0) goto L_0x00fe
            r9.excuteEndCardShowTask(r10)     // Catch:{ all -> 0x0102 }
            goto L_0x010a
        L_0x00fe:
            r9.excuteEndCardShowTask(r5)     // Catch:{ all -> 0x0102 }
            goto L_0x010a
        L_0x0102:
            r10 = move-exception
            java.lang.String r0 = r10.getMessage()
            com.mbridge.msdk.foundation.tools.C8672v.m24875a(r2, r0, r10)
        L_0x010a:
            com.mbridge.msdk.videocommon.download.h r10 = com.mbridge.msdk.videocommon.download.C9661h.m27556a()
            java.lang.String r10 = r10.mo63674b(r3)
            r9.setHtmlSource(r10)
            java.lang.String r10 = r9.f23289s
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L_0x0137
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "load url:"
            r10.append(r0)
            r10.append(r3)
            java.lang.String r10 = r10.toString()
            com.mbridge.msdk.foundation.tools.C8672v.m24874a(r2, r10)
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r10 = r9.f23287q
            r10.loadUrl(r3)
            goto L_0x015f
        L_0x0137:
            java.lang.String r10 = "load html..."
            com.mbridge.msdk.foundation.tools.C8672v.m24874a(r2, r10)
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r2 = r9.f23287q
            java.lang.String r4 = r9.f23289s
            r7 = 0
            java.lang.String r5 = "text/html"
            java.lang.String r6 = "UTF-8"
            r2.loadDataWithBaseURL(r3, r4, r5, r6, r7)
            goto L_0x015f
        L_0x0149:
            r10 = 3
            java.lang.String r0 = "PL URL IS NULL"
            r9.reportRenderResult(r0, r10)
            com.mbridge.msdk.video.module.a.a r10 = r9.f23199e
            r0 = 127(0x7f, float:1.78E-43)
            java.lang.String r1 = ""
            r10.mo62631a(r0, r1)
            com.mbridge.msdk.video.module.a.a r10 = r9.f23199e
            r0 = 129(0x81, float:1.81E-43)
            r10.mo62631a(r0, r1)
        L_0x015f:
            r9.f23294x = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeH5EndCardView.preLoadData(com.mbridge.msdk.video.signal.factory.b):void");
    }

    public void reportRenderResult(String str, int i) {
        if (this.f23196b != null && !this.f23291u) {
            C8468m mVar = new C8468m();
            mVar.mo57840k(this.f23196b.getRequestId());
            mVar.mo57842l(this.f23196b.getRequestIdNotice());
            mVar.mo57846n(this.f23196b.getId());
            mVar.mo57825d(i);
            mVar.mo57852q(String.valueOf(System.currentTimeMillis() - this.f23272G));
            mVar.mo57850p(str);
            String str2 = "2";
            if (this.f23196b.getAdType() == 287) {
                mVar.mo57834h("3");
            } else if (this.f23196b.getAdType() == 94) {
                mVar.mo57834h("1");
            } else if (this.f23196b.getAdType() == 42) {
                mVar.mo57834h(str2);
            }
            if (this.f23196b.isMraid()) {
                mVar.mo57816a(C8468m.f20702a);
            } else {
                mVar.mo57830f(this.f23196b.getendcard_url());
                if (C8616ad.m24718b(this.f23196b.getendcard_url()) && this.f23196b.getendcard_url().contains(".zip")) {
                    str2 = "1";
                }
                mVar.mo57832g(str2);
                mVar.mo57816a(C8468m.f20703b);
            }
            C8580c.m24610b(mVar, this.f23292v);
        }
    }

    public void startCounterEndCardShowTimer() {
        try {
            String str = this.f23196b.getendcard_url();
            int i = 15;
            if (C8616ad.m24718b(str) && str.contains("wfl=1")) {
                String[] split = str.split("&");
                if (split != null && split.length > 0) {
                    for (String str2 : split) {
                        if (C8616ad.m24718b(str2) && str2.contains("timeout") && str2.split("=") != null && str2.split("=").length > 0) {
                            i = C8677z.m24907a((Object) str2.split("=")[1]);
                        }
                    }
                }
                executeEndCardShow(i);
            }
        } catch (Throwable th) {
            C8672v.m24874a(MBridgeBaseView.TAG, th.getMessage());
        }
    }

    public void defaultShow() {
        super.defaultShow();
    }

    public void notifyCloseBtn(int i) {
        if (i == 0) {
            this.f23275J = true;
        } else if (i == 1) {
            this.f23276K = true;
        }
    }

    public void toggleCloseBtn(int i) {
        int visibility = this.f23286p.getVisibility();
        if (i == 1) {
            this.f23274I = true;
            visibility = 0;
        } else if (i == 2) {
            this.f23274I = false;
            visibility = 8;
            if (this.f23294x) {
                if (!this.f23283R && !this.f23275J) {
                    this.f23283R = true;
                    int i2 = this.f23268C;
                    if (i2 == 0) {
                        this.f23278M = true;
                    } else {
                        this.f23278M = false;
                        if (i2 > -1) {
                            this.f23288r.postDelayed(new C9434e(this), (long) (this.f23268C * 1000));
                        }
                    }
                }
            } else if (!this.f23282Q && !this.f23275J) {
                this.f23282Q = true;
                int i3 = this.f23267B;
                if (i3 == 0) {
                    this.f23277L = true;
                } else {
                    this.f23277L = false;
                    if (i3 > -1) {
                        this.f23288r.postDelayed(new C9433d(this), (long) (this.f23267B * 1000));
                    }
                }
            }
        }
        setCloseVisible(visibility);
    }

    /* renamed from: com.mbridge.msdk.video.module.MBridgeH5EndCardView$d */
    private class C9433d implements Runnable {

        /* renamed from: b */
        private MBridgeH5EndCardView f23310b;

        public C9433d(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f23310b = mBridgeH5EndCardView;
        }

        public final void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f23310b;
            if (mBridgeH5EndCardView != null) {
                boolean unused = mBridgeH5EndCardView.f23277L = true;
            }
        }
    }

    /* renamed from: com.mbridge.msdk.video.module.MBridgeH5EndCardView$e */
    private class C9434e implements Runnable {

        /* renamed from: b */
        private MBridgeH5EndCardView f23312b;

        public C9434e(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f23312b = mBridgeH5EndCardView;
        }

        public final void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f23312b;
            if (mBridgeH5EndCardView != null) {
                boolean unused = mBridgeH5EndCardView.f23278M = true;
            }
        }
    }

    public void handlerPlayableException(String str) {
        if (!this.f23291u) {
            this.f23291u = true;
            this.f23290t = false;
            if (this.f23196b != null) {
                C8468m mVar = new C8468m();
                mVar.mo57840k(this.f23196b.getRequestId());
                mVar.mo57842l(this.f23196b.getRequestIdNotice());
                mVar.mo57846n(this.f23196b.getId());
                mVar.mo57850p(str);
                C8580c.m24612d(mVar, this.f23195a.getApplicationContext(), this.f23292v);
            }
        }
    }

    public void webviewshow() {
        WindVaneWebView windVaneWebView = this.f23287q;
        if (windVaneWebView != null) {
            windVaneWebView.post(new Runnable() {
                public final void run() {
                    String str;
                    try {
                        C8672v.m24874a(MBridgeBaseView.TAG, "webviewshow");
                        try {
                            int[] iArr = new int[2];
                            MBridgeH5EndCardView.this.f23287q.getLocationOnScreen(iArr);
                            C8672v.m24878d(MBridgeBaseView.TAG, "coordinate:" + iArr[0] + "--" + iArr[1]);
                            JSONObject jSONObject = new JSONObject();
                            Context g = C8388a.m23845e().mo56913g();
                            if (g != null) {
                                jSONObject.put("startX", C8677z.m24906a(g, (float) iArr[0]));
                                jSONObject.put("startY", C8677z.m24906a(g, (float) iArr[1]));
                                jSONObject.put(C8469a.f20749j, (double) C8677z.m24936d(g));
                            }
                            str = jSONObject.toString();
                        } catch (Throwable th) {
                            C8672v.m24875a(MBridgeBaseView.TAG, th.getMessage(), th);
                            str = "";
                        }
                        C8887g.m25669a().mo58687a((WebView) MBridgeH5EndCardView.this.f23287q, "webviewshow", Base64.encodeToString(str.toString().getBytes(), 2));
                        MBridgeH5EndCardView.this.f23199e.mo62631a(109, "");
                        MBridgeH5EndCardView.m26849d(MBridgeH5EndCardView.this);
                        MBridgeH5EndCardView.this.startCounterEndCardShowTimer();
                        C8887g.m25669a().mo58687a((WebView) MBridgeH5EndCardView.this.f23287q, "oncutoutfetched", Base64.encodeToString(MBridgeH5EndCardView.this.f23281P.getBytes(), 0));
                        MBridgeH5EndCardView.m26853f(MBridgeH5EndCardView.this);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    public void orientation(Configuration configuration) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (configuration.orientation == 2) {
                jSONObject.put(TJAdUnitConstants.String.ORIENTATION, "landscape");
            } else {
                jSONObject.put(TJAdUnitConstants.String.ORIENTATION, "portrait");
            }
            C8887g.m25669a().mo58687a((WebView) this.f23287q, TJAdUnitConstants.String.ORIENTATION, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean canBackPress() {
        ImageView imageView = this.f23286p;
        return imageView != null && imageView.getVisibility() == 0;
    }

    public boolean isLoadSuccess() {
        return this.f23290t;
    }

    public void setUnitId(String str) {
        this.f23292v = str;
    }

    public void setCloseDelayShowTime(int i) {
        this.f23267B = i;
    }

    public void setPlayCloseBtnTm(int i) {
        this.f23268C = i;
    }

    public void setHtmlSource(String str) {
        this.f23289s = str;
    }

    public void setCloseVisible(int i) {
        if (this.f23200f) {
            this.f23286p.setVisibility(i);
        }
    }

    public void setCloseVisibleForMraid(int i) {
        if (this.f23200f) {
            this.f23279N = true;
            if (i == 4) {
                this.f23286p.setImageDrawable(new ColorDrawable(16711680));
            } else {
                this.f23286p.setImageResource(findDrawable("mbridge_reward_close"));
            }
            this.f23286p.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public RelativeLayout.LayoutParams mo62969b() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo63002e() {
        if (this.f23200f) {
            setMatchParent();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo62968a() {
        if (this.f23196b != null) {
            this.f23273H = true;
            if (this.f23196b.isMraid()) {
                this.f23266A = false;
                String mraid = this.f23196b.getMraid();
                if (TextUtils.isEmpty(mraid)) {
                    return this.f23196b.getEndScreenUrl();
                }
                File file = new File(mraid);
                try {
                    if (!file.exists() || !file.isFile() || !file.canRead()) {
                        return this.f23196b.getEndScreenUrl();
                    }
                    return "file:////" + mraid;
                } catch (Throwable th) {
                    if (!MBridgeConstans.DEBUG) {
                        return mraid;
                    }
                    th.printStackTrace();
                    return mraid;
                }
            } else {
                String str = this.f23196b.getendcard_url();
                if (!C8616ad.m24717a(str)) {
                    this.f23266A = true;
                    String b = C9652g.m27539a().mo63670b(str);
                    if (TextUtils.isEmpty(b)) {
                        try {
                            String path = Uri.parse(str).getPath();
                            if (!TextUtils.isEmpty(path) && path.toLowerCase().endsWith(".zip")) {
                                String endScreenUrl = this.f23196b.getEndScreenUrl();
                                if (TextUtils.isEmpty(endScreenUrl)) {
                                    return null;
                                }
                                this.f23266A = false;
                                excuteTask();
                                return endScreenUrl;
                            }
                        } catch (Throwable th2) {
                            C8672v.m24878d(MBridgeBaseView.TAG, th2.getMessage());
                        }
                        return str + "&native_adtype=" + this.f23196b.getAdType();
                    }
                    return b + "&native_adtype=" + this.f23196b.getAdType();
                }
                this.f23266A = false;
                return this.f23196b.getEndScreenUrl();
            }
        } else {
            this.f23273H = false;
            return null;
        }
    }

    /* renamed from: com.mbridge.msdk.video.module.MBridgeH5EndCardView$f */
    private class C9435f implements Runnable {

        /* renamed from: b */
        private MBridgeH5EndCardView f23314b;

        public C9435f(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f23314b = mBridgeH5EndCardView;
        }

        public final void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f23314b;
            if (mBridgeH5EndCardView != null) {
                if (!mBridgeH5EndCardView.f23279N) {
                    MBridgeH5EndCardView.this.setCloseVisible(0);
                }
                boolean unused = this.f23314b.f23274I = true;
            }
        }
    }

    public void excuteTask() {
        if (!this.f23266A && this.f23267B > -1) {
            this.f23288r.postDelayed(new C9435f(this), (long) (this.f23267B * 1000));
        }
    }

    /* renamed from: com.mbridge.msdk.video.module.MBridgeH5EndCardView$b */
    private class C9431b implements Runnable {

        /* renamed from: b */
        private MBridgeH5EndCardView f23306b;

        public C9431b(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f23306b = mBridgeH5EndCardView;
        }

        public final void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f23306b;
            if (mBridgeH5EndCardView != null && !mBridgeH5EndCardView.f23270E) {
                boolean unused = this.f23306b.f23270E = true;
                this.f23306b.f23290t = false;
                MBridgeH5EndCardView.this.reportRenderResult("timeout", 5);
                this.f23306b.f23199e.mo62631a(127, "");
                C8672v.m24874a(MBridgeBaseView.TAG, "notify TYPE_NOTIFY_SHOW_NATIVE_ENDCARD");
            }
        }
    }

    public void executeEndCardShow(int i) {
        this.f23288r.postDelayed(new C9431b(this), (long) (i * 1000));
    }

    public void excuteEndCardShowTask(int i) {
        this.f23288r.postDelayed(new C9432c(this, i), (long) (i * 1000));
    }

    /* renamed from: com.mbridge.msdk.video.module.MBridgeH5EndCardView$c */
    private static class C9432c implements Runnable {

        /* renamed from: a */
        private MBridgeH5EndCardView f23307a;

        /* renamed from: b */
        private int f23308b;

        public C9432c(MBridgeH5EndCardView mBridgeH5EndCardView, int i) {
            this.f23307a = mBridgeH5EndCardView;
            this.f23308b = i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0084 A[Catch:{ Exception -> 0x00aa, all -> 0x00dd }] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x008a A[Catch:{ Exception -> 0x00aa, all -> 0x00dd }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r13 = this;
                java.lang.String r0 = "MBridgeBaseView"
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r1 = r13.f23307a
                if (r1 == 0) goto L_0x00e5
                com.mbridge.msdk.foundation.entity.CampaignEx r1 = r1.f23196b
                if (r1 == 0) goto L_0x00e5
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r1 = r13.f23307a     // Catch:{ all -> 0x00dd }
                boolean r1 = r1.f23269D     // Catch:{ all -> 0x00dd }
                if (r1 == 0) goto L_0x0018
                java.lang.String r1 = "insertEndCardReadyState hasInsertLoadEndCardReport true return"
                com.mbridge.msdk.foundation.tools.C8672v.m24876b(r0, r1)     // Catch:{ all -> 0x00dd }
                return
            L_0x0018:
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r1 = r13.f23307a     // Catch:{ all -> 0x00dd }
                r2 = 1
                boolean unused = r1.f23269D = r2     // Catch:{ all -> 0x00dd }
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r1 = r13.f23307a     // Catch:{ all -> 0x00dd }
                com.mbridge.msdk.foundation.entity.CampaignEx r1 = r1.f23196b     // Catch:{ all -> 0x00dd }
                java.lang.String r1 = r1.getendcard_url()     // Catch:{ all -> 0x00dd }
                boolean r1 = com.mbridge.msdk.foundation.tools.C8616ad.m24718b(r1)     // Catch:{ all -> 0x00dd }
                java.lang.String r2 = "1"
                java.lang.String r3 = "2"
                if (r1 == 0) goto L_0x0042
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r1 = r13.f23307a     // Catch:{ all -> 0x00dd }
                com.mbridge.msdk.foundation.entity.CampaignEx r1 = r1.f23196b     // Catch:{ all -> 0x00dd }
                java.lang.String r1 = r1.getendcard_url()     // Catch:{ all -> 0x00dd }
                java.lang.String r4 = ".zip"
                boolean r1 = r1.contains(r4)     // Catch:{ all -> 0x00dd }
                if (r1 == 0) goto L_0x0042
                r12 = r2
                goto L_0x0043
            L_0x0042:
                r12 = r3
            L_0x0043:
                r6 = 12
                java.lang.String r11 = "ready timeout"
                com.mbridge.msdk.foundation.entity.m r1 = new com.mbridge.msdk.foundation.entity.m     // Catch:{ all -> 0x00dd }
                java.lang.String r5 = "2000043"
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00dd }
                r4.<init>()     // Catch:{ all -> 0x00dd }
                int r7 = r13.f23308b     // Catch:{ all -> 0x00dd }
                int r7 = r7 * 1000
                r4.append(r7)     // Catch:{ all -> 0x00dd }
                java.lang.String r7 = ""
                r4.append(r7)     // Catch:{ all -> 0x00dd }
                java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x00dd }
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r4 = r13.f23307a     // Catch:{ all -> 0x00dd }
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.f23196b     // Catch:{ all -> 0x00dd }
                java.lang.String r8 = r4.getendcard_url()     // Catch:{ all -> 0x00dd }
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r4 = r13.f23307a     // Catch:{ all -> 0x00dd }
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.f23196b     // Catch:{ all -> 0x00dd }
                java.lang.String r9 = r4.getId()     // Catch:{ all -> 0x00dd }
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r4 = r13.f23307a     // Catch:{ all -> 0x00dd }
                java.lang.String r10 = r4.f23292v     // Catch:{ all -> 0x00dd }
                r4 = r1
                r4.<init>((java.lang.String) r5, (int) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (java.lang.String) r12)     // Catch:{ all -> 0x00dd }
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r4 = r13.f23307a     // Catch:{ Exception -> 0x00aa }
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.f23196b     // Catch:{ Exception -> 0x00aa }
                int r4 = r4.getAdType()     // Catch:{ Exception -> 0x00aa }
                r5 = 287(0x11f, float:4.02E-43)
                if (r4 != r5) goto L_0x008a
                java.lang.String r2 = "3"
                r1.mo57834h((java.lang.String) r2)     // Catch:{ Exception -> 0x00aa }
                goto L_0x00ae
            L_0x008a:
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r4 = r13.f23307a     // Catch:{ Exception -> 0x00aa }
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.f23196b     // Catch:{ Exception -> 0x00aa }
                int r4 = r4.getAdType()     // Catch:{ Exception -> 0x00aa }
                r5 = 94
                if (r4 != r5) goto L_0x009a
                r1.mo57834h((java.lang.String) r2)     // Catch:{ Exception -> 0x00aa }
                goto L_0x00ae
            L_0x009a:
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r2 = r13.f23307a     // Catch:{ Exception -> 0x00aa }
                com.mbridge.msdk.foundation.entity.CampaignEx r2 = r2.f23196b     // Catch:{ Exception -> 0x00aa }
                int r2 = r2.getAdType()     // Catch:{ Exception -> 0x00aa }
                r4 = 42
                if (r2 != r4) goto L_0x00ae
                r1.mo57834h((java.lang.String) r3)     // Catch:{ Exception -> 0x00aa }
                goto L_0x00ae
            L_0x00aa:
                r2 = move-exception
                r2.printStackTrace()     // Catch:{ all -> 0x00dd }
            L_0x00ae:
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r2 = r13.f23307a     // Catch:{ all -> 0x00dd }
                com.mbridge.msdk.foundation.entity.CampaignEx r2 = r2.f23196b     // Catch:{ all -> 0x00dd }
                java.lang.String r2 = r2.getRequestId()     // Catch:{ all -> 0x00dd }
                r1.mo57840k(r2)     // Catch:{ all -> 0x00dd }
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r2 = r13.f23307a     // Catch:{ all -> 0x00dd }
                com.mbridge.msdk.foundation.entity.CampaignEx r2 = r2.f23196b     // Catch:{ all -> 0x00dd }
                java.lang.String r2 = r2.getRequestIdNotice()     // Catch:{ all -> 0x00dd }
                r1.mo57842l(r2)     // Catch:{ all -> 0x00dd }
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r2 = r13.f23307a     // Catch:{ all -> 0x00dd }
                com.mbridge.msdk.foundation.entity.CampaignEx r2 = r2.f23196b     // Catch:{ all -> 0x00dd }
                int r2 = r2.getAdSpaceT()     // Catch:{ all -> 0x00dd }
                r1.mo57819b((int) r2)     // Catch:{ all -> 0x00dd }
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r2 = r13.f23307a     // Catch:{ all -> 0x00dd }
                java.lang.String r2 = r2.f23292v     // Catch:{ all -> 0x00dd }
                com.mbridge.msdk.foundation.same.report.C8580c.m24606a(r1, r2)     // Catch:{ all -> 0x00dd }
                com.mbridge.msdk.video.module.MBridgeH5EndCardView r1 = r13.f23307a     // Catch:{ all -> 0x00dd }
                boolean r0 = r1.isLoadSuccess()     // Catch:{ all -> 0x00dd }
                goto L_0x00e5
            L_0x00dd:
                r1 = move-exception
                java.lang.String r2 = r1.getMessage()
                com.mbridge.msdk.foundation.tools.C8672v.m24875a(r0, r2, r1)
            L_0x00e5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeH5EndCardView.C9432c.run():void");
        }
    }

    public boolean isPlayable() {
        return this.f23266A;
    }

    public void onBackPress() {
        if (this.f23274I || ((this.f23275J && this.f23276K) || ((!this.f23275J && this.f23277L && !this.f23294x) || (!this.f23275J && this.f23278M && this.f23294x)))) {
            onCloseViewClick();
        }
    }

    public void setLoadPlayable(boolean z) {
        this.f23294x = z;
    }

    public void release() {
        Handler handler = this.f23288r;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f23288r = null;
        }
        Handler handler2 = this.f23293w;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages((Object) null);
            this.f23293w = null;
        }
        this.f23285o.removeAllViews();
        this.f23287q.release();
        this.f23287q = null;
    }

    public void volumeChange(double d) {
        C8871a.m25621a().mo58629a((WebView) this.f23287q, d);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f23196b != null && this.f23196b.isMraid()) {
            if (z) {
                C8871a.m25621a().mo58637b(this.f23287q, "true");
            } else {
                C8871a.m25621a().mo58637b(this.f23287q, "false");
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0 && !this.f23280O) {
            this.f23280O = true;
            setFocusableInTouchMode(true);
            requestFocus();
            requestFocusFromTouch();
        }
    }

    public void open(String str) {
        try {
            String clickURL = this.f23196b.getClickURL();
            if (!TextUtils.isEmpty(str)) {
                this.f23196b.setClickURL(str);
                CampaignEx mraidCampaign = getMraidCampaign();
                if (mraidCampaign != null) {
                    new C8582d(getContext()).mo58071b(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.f23292v, str, this.f23196b.isBidCampaign());
                }
            }
            new C6765a(getContext(), this.f23292v).mo37041a(this.f23196b);
            this.f23196b.setClickURL(clickURL);
            this.f23199e.mo62631a(126, "");
        } catch (Exception e) {
            C8672v.m24878d(MBridgeBaseView.TAG, e.getMessage());
        }
    }

    public void close() {
        try {
            onCloseViewClick();
        } catch (Exception e) {
            C8672v.m24878d(MBridgeBaseView.TAG, e.getMessage());
        }
    }

    public void unload() {
        close();
    }

    public CampaignEx getMraidCampaign() {
        return this.f23196b;
    }

    public void useCustomClose(boolean z) {
        try {
            setCloseVisibleForMraid(z ? 4 : 0);
        } catch (Exception e) {
            C8672v.m24878d(MBridgeBaseView.TAG, e.getMessage());
        }
    }

    public void setNotchValue(String str, int i, int i2, int i3, int i4) {
        this.f23281P = str;
        if (this.f23196b != null && this.f23196b.getAdSpaceT() != 2) {
            C8672v.m24878d(MBridgeBaseView.TAG, "NOTCH H5ENDCARD " + String.format("%1s-%2s-%3s-%4s", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}));
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f23286p.getLayoutParams();
            int b = C8677z.m24924b(getContext(), 20.0f);
            layoutParams.setMargins(i + b, i3 + b, i2 + b, i4 + b);
            this.f23286p.setLayoutParams(layoutParams);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033 A[Catch:{ NullPointerException -> 0x00a8, all -> 0x0112 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b A[Catch:{ NullPointerException -> 0x00a8, all -> 0x0112 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0086 A[Catch:{ NullPointerException -> 0x00a8, all -> 0x0112 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008c A[Catch:{ NullPointerException -> 0x00a8, all -> 0x0112 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d5 A[Catch:{ NullPointerException -> 0x00a8, all -> 0x0112 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m26842a(com.mbridge.msdk.video.module.MBridgeH5EndCardView r17, long r18, boolean r20) {
        /*
            r1 = r17
            boolean r0 = r1.f23269D     // Catch:{ all -> 0x0112 }
            if (r0 == 0) goto L_0x0008
            goto L_0x011c
        L_0x0008:
            r2 = 1
            r1.f23269D = r2     // Catch:{ all -> 0x0112 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f23196b     // Catch:{ all -> 0x0112 }
            java.lang.String r0 = r0.getendcard_url()     // Catch:{ all -> 0x0112 }
            boolean r0 = com.mbridge.msdk.foundation.tools.C8616ad.m24718b(r0)     // Catch:{ all -> 0x0112 }
            java.lang.String r3 = "1"
            java.lang.String r4 = "2"
            if (r0 == 0) goto L_0x002b
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f23196b     // Catch:{ all -> 0x0112 }
            java.lang.String r0 = r0.getendcard_url()     // Catch:{ all -> 0x0112 }
            java.lang.String r5 = ".zip"
            boolean r0 = r0.contains(r5)     // Catch:{ all -> 0x0112 }
            if (r0 == 0) goto L_0x002b
            r14 = r3
            goto L_0x002c
        L_0x002b:
            r14 = r4
        L_0x002c:
            r0 = 10
            java.lang.String r5 = "ready yes"
            r6 = 2
            if (r20 == 0) goto L_0x003b
            r0 = 12
            java.lang.String r5 = "ready timeout"
        L_0x0037:
            r7 = r0
            r15 = r5
            r13 = r6
            goto L_0x0048
        L_0x003b:
            int r7 = r1.f23271F     // Catch:{ all -> 0x0112 }
            if (r7 != r6) goto L_0x0045
            r6 = 3
            r0 = 11
            java.lang.String r5 = "ready no"
            goto L_0x0037
        L_0x0045:
            r7 = r0
            r13 = r2
            r15 = r5
        L_0x0048:
            com.mbridge.msdk.foundation.entity.m r12 = new com.mbridge.msdk.foundation.entity.m     // Catch:{ all -> 0x0112 }
            java.lang.String r6 = "2000043"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0112 }
            r0.<init>()     // Catch:{ all -> 0x0112 }
            r10 = r18
            r0.append(r10)     // Catch:{ all -> 0x0112 }
            java.lang.String r5 = ""
            r0.append(r5)     // Catch:{ all -> 0x0112 }
            java.lang.String r8 = r0.toString()     // Catch:{ all -> 0x0112 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f23196b     // Catch:{ all -> 0x0112 }
            java.lang.String r9 = r0.getendcard_url()     // Catch:{ all -> 0x0112 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f23196b     // Catch:{ all -> 0x0112 }
            java.lang.String r0 = r0.getId()     // Catch:{ all -> 0x0112 }
            java.lang.String r5 = r1.f23292v     // Catch:{ all -> 0x0112 }
            r16 = r5
            r5 = r12
            r10 = r0
            r11 = r16
            r2 = r12
            r12 = r15
            r20 = r15
            r15 = r13
            r13 = r14
            r5.<init>((java.lang.String) r6, (int) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r13)     // Catch:{ all -> 0x0112 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f23196b     // Catch:{ NullPointerException -> 0x00a8 }
            int r0 = r0.getAdType()     // Catch:{ NullPointerException -> 0x00a8 }
            r5 = 287(0x11f, float:4.02E-43)
            if (r0 != r5) goto L_0x008c
            java.lang.String r0 = "3"
            r2.mo57834h((java.lang.String) r0)     // Catch:{ NullPointerException -> 0x00a8 }
            goto L_0x00ac
        L_0x008c:
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f23196b     // Catch:{ NullPointerException -> 0x00a8 }
            int r0 = r0.getAdType()     // Catch:{ NullPointerException -> 0x00a8 }
            r5 = 94
            if (r0 != r5) goto L_0x009a
            r2.mo57834h((java.lang.String) r3)     // Catch:{ NullPointerException -> 0x00a8 }
            goto L_0x00ac
        L_0x009a:
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f23196b     // Catch:{ NullPointerException -> 0x00a8 }
            int r0 = r0.getAdType()     // Catch:{ NullPointerException -> 0x00a8 }
            r3 = 42
            if (r0 != r3) goto L_0x00ac
            r2.mo57834h((java.lang.String) r4)     // Catch:{ NullPointerException -> 0x00a8 }
            goto L_0x00ac
        L_0x00a8:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x0112 }
        L_0x00ac:
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f23196b     // Catch:{ all -> 0x0112 }
            java.lang.String r0 = r0.getRequestId()     // Catch:{ all -> 0x0112 }
            r2.mo57840k(r0)     // Catch:{ all -> 0x0112 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f23196b     // Catch:{ all -> 0x0112 }
            java.lang.String r0 = r0.getRequestIdNotice()     // Catch:{ all -> 0x0112 }
            r2.mo57842l(r0)     // Catch:{ all -> 0x0112 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f23196b     // Catch:{ all -> 0x0112 }
            int r0 = r0.getAdSpaceT()     // Catch:{ all -> 0x0112 }
            r2.mo57819b((int) r0)     // Catch:{ all -> 0x0112 }
            java.lang.String r0 = r1.f23292v     // Catch:{ all -> 0x0112 }
            com.mbridge.msdk.foundation.same.report.C8580c.m24606a(r2, r0)     // Catch:{ all -> 0x0112 }
            boolean r0 = r17.isLoadSuccess()     // Catch:{ all -> 0x0112 }
            if (r0 != 0) goto L_0x011c
            r3 = 1
            if (r15 != r3) goto L_0x011c
            r2.mo57825d((int) r15)     // Catch:{ all -> 0x0112 }
            java.lang.String r0 = java.lang.String.valueOf(r18)     // Catch:{ all -> 0x0112 }
            r2.mo57852q(r0)     // Catch:{ all -> 0x0112 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f23196b     // Catch:{ all -> 0x0112 }
            java.lang.String r0 = r0.getId()     // Catch:{ all -> 0x0112 }
            r2.mo57846n(r0)     // Catch:{ all -> 0x0112 }
            r5 = r20
            r2.mo57850p(r5)     // Catch:{ all -> 0x0112 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f23196b     // Catch:{ all -> 0x0112 }
            boolean r0 = r0.isMraid()     // Catch:{ all -> 0x0112 }
            if (r0 == 0) goto L_0x00fb
            int r0 = com.mbridge.msdk.foundation.entity.C8468m.f20702a     // Catch:{ all -> 0x0112 }
            r2.mo57816a((int) r0)     // Catch:{ all -> 0x0112 }
            goto L_0x010c
        L_0x00fb:
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f23196b     // Catch:{ all -> 0x0112 }
            java.lang.String r0 = r0.getendcard_url()     // Catch:{ all -> 0x0112 }
            r2.mo57830f((java.lang.String) r0)     // Catch:{ all -> 0x0112 }
            r2.mo57832g((java.lang.String) r14)     // Catch:{ all -> 0x0112 }
            int r0 = com.mbridge.msdk.foundation.entity.C8468m.f20703b     // Catch:{ all -> 0x0112 }
            r2.mo57816a((int) r0)     // Catch:{ all -> 0x0112 }
        L_0x010c:
            java.lang.String r0 = r1.f23292v     // Catch:{ all -> 0x0112 }
            com.mbridge.msdk.foundation.same.report.C8580c.m24610b(r2, r0)     // Catch:{ all -> 0x0112 }
            goto L_0x011c
        L_0x0112:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            java.lang.String r2 = "MBridgeBaseView"
            com.mbridge.msdk.foundation.tools.C8672v.m24875a(r2, r1, r0)
        L_0x011c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeH5EndCardView.m26842a(com.mbridge.msdk.video.module.MBridgeH5EndCardView, long, boolean):void");
    }

    /* renamed from: d */
    static /* synthetic */ void m26849d(MBridgeH5EndCardView mBridgeH5EndCardView) {
        MBridgeH5EndCardView mBridgeH5EndCardView2 = mBridgeH5EndCardView;
        if (mBridgeH5EndCardView2.f23196b != null && mBridgeH5EndCardView2.f23196b.isMraid()) {
            int i = mBridgeH5EndCardView.getResources().getConfiguration().orientation;
            String str = AdError.UNDEFINED_DOMAIN;
            if (i != 0) {
                if (i == 1) {
                    str = "portrait";
                } else if (i == 2) {
                    str = "landscape";
                }
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(TJAdUnitConstants.String.ORIENTATION, str);
                jSONObject.put("locked", "true");
            } catch (Exception e) {
                e.printStackTrace();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("placementType", IronSourceConstants.INTERSTITIAL_AD_UNIT);
            hashMap.put("state", CoreLightModuleInterface.NAME_DEFAULT_HTTP_HANDLER);
            hashMap.put("viewable", "true");
            hashMap.put("currentAppOrientation", jSONObject);
            if (mBridgeH5EndCardView.getContext() instanceof Activity) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((Activity) mBridgeH5EndCardView.getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                C8871a.m25621a().mo58635b(mBridgeH5EndCardView2.f23287q, (float) C8660r.m24829i(mBridgeH5EndCardView.getContext()), (float) C8660r.m24831j(mBridgeH5EndCardView.getContext()));
                C8871a.m25621a().mo58638c(mBridgeH5EndCardView2.f23287q, (float) displayMetrics.widthPixels, (float) displayMetrics.heightPixels);
            }
            C8871a a = C8871a.m25621a();
            WindVaneWebView windVaneWebView = mBridgeH5EndCardView2.f23287q;
            a.mo58631a(windVaneWebView, (float) windVaneWebView.getLeft(), (float) mBridgeH5EndCardView2.f23287q.getTop(), (float) mBridgeH5EndCardView2.f23287q.getWidth(), (float) mBridgeH5EndCardView2.f23287q.getHeight());
            C8871a a2 = C8871a.m25621a();
            WindVaneWebView windVaneWebView2 = mBridgeH5EndCardView2.f23287q;
            a2.mo58636b(windVaneWebView2, (float) windVaneWebView2.getLeft(), (float) mBridgeH5EndCardView2.f23287q.getTop(), (float) mBridgeH5EndCardView2.f23287q.getWidth(), (float) mBridgeH5EndCardView2.f23287q.getHeight());
            C8871a.m25621a().mo58634a((WebView) mBridgeH5EndCardView2.f23287q, (Map<String, Object>) hashMap);
            C8871a.m25621a().mo58629a((WebView) mBridgeH5EndCardView2.f23287q, C8875d.f21857a);
            C8871a.m25621a().mo58628a(mBridgeH5EndCardView2.f23287q);
        }
    }

    /* renamed from: f */
    static /* synthetic */ void m26853f(MBridgeH5EndCardView mBridgeH5EndCardView) {
        if (C2470b.m6168a().mo16428b()) {
            C2470b a = C2470b.m6168a();
            a.mo16429c(mBridgeH5EndCardView.f23292v + "_" + 1);
            mBridgeH5EndCardView.f23196b.setCampaignUnitId(mBridgeH5EndCardView.f23292v);
            C2470b a2 = C2470b.m6168a();
            a2.mo16423a(mBridgeH5EndCardView.f23292v + "_" + 2, mBridgeH5EndCardView.f23196b);
            C2470b a3 = C2470b.m6168a();
            a3.mo16422a(mBridgeH5EndCardView.f23292v + "_" + 2, (C2462a) new C2462a() {
                /* renamed from: a */
                public final void mo16392a() {
                    String str;
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (C8388a.m23845e().mo56913g() != null) {
                            jSONObject.put("status", 1);
                        }
                        str = jSONObject.toString();
                    } catch (Throwable th) {
                        C8672v.m24875a(MBridgeBaseView.TAG, th.getMessage(), th);
                        str = "";
                    }
                    C8887g.m25669a().mo58687a((WebView) MBridgeH5EndCardView.this.f23287q, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                }

                /* renamed from: b */
                public final void mo16394b() {
                    String str;
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (C8388a.m23845e().mo56913g() != null) {
                            jSONObject.put("status", 2);
                        }
                        str = jSONObject.toString();
                    } catch (Throwable th) {
                        C8672v.m24875a(MBridgeBaseView.TAG, th.getMessage(), th);
                        str = "";
                    }
                    C8887g.m25669a().mo58687a((WebView) MBridgeH5EndCardView.this.f23287q, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                }

                /* renamed from: a */
                public final void mo16393a(String str) {
                    String str2;
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (C8388a.m23845e().mo56913g() != null) {
                            jSONObject.put("status", 2);
                        }
                        str2 = jSONObject.toString();
                    } catch (Throwable th) {
                        C8672v.m24875a(MBridgeBaseView.TAG, th.getMessage(), th);
                        str2 = "";
                    }
                    C8887g.m25669a().mo58687a((WebView) MBridgeH5EndCardView.this.f23287q, "onFeedbackAlertStatusNotify", Base64.encodeToString(str2.getBytes(), 2));
                }
            });
            C2470b a4 = C2470b.m6168a();
            FeedBackButton b = a4.mo16426b(mBridgeH5EndCardView.f23292v + "_" + 2);
            mBridgeH5EndCardView.f23295y = b;
            if (b != null) {
                RelativeLayout.LayoutParams layoutParams = null;
                try {
                    layoutParams = (RelativeLayout.LayoutParams) b.getLayoutParams();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (layoutParams == null) {
                    layoutParams = new RelativeLayout.LayoutParams(C2470b.f5203a, C2470b.f5204b);
                }
                layoutParams.addRule(9);
                ViewGroup viewGroup = (ViewGroup) mBridgeH5EndCardView.f23295y.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(mBridgeH5EndCardView.f23295y);
                }
                mBridgeH5EndCardView.f23285o.addView(mBridgeH5EndCardView.f23295y, layoutParams);
                mBridgeH5EndCardView.f23285o.postDelayed(new Runnable() {
                    public final void run() {
                        MBridgeH5EndCardView.this.f23295y.setVisibility(0);
                    }
                }, 200);
            }
        }
    }
}
