package com.mbridge.msdk.interstitial.view;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.activity.MBBaseActivity;
import com.mbridge.msdk.click.C6765a;
import com.mbridge.msdk.click.C6779b;
import com.mbridge.msdk.click.p217a.C6772a;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.controller.C8396b;
import com.mbridge.msdk.foundation.entity.C8468m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p085b.C2462a;
import com.mbridge.msdk.foundation.p085b.C2470b;
import com.mbridge.msdk.foundation.p298db.C8412f;
import com.mbridge.msdk.foundation.p298db.C8414g;
import com.mbridge.msdk.foundation.p298db.C8417j;
import com.mbridge.msdk.foundation.same.p300a.C8473d;
import com.mbridge.msdk.foundation.same.p305f.C8498b;
import com.mbridge.msdk.foundation.same.report.C8580c;
import com.mbridge.msdk.foundation.same.report.C8582d;
import com.mbridge.msdk.foundation.tools.C8616ad;
import com.mbridge.msdk.foundation.tools.C8658p;
import com.mbridge.msdk.foundation.tools.C8660r;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.interstitial.p318b.C8696a;
import com.mbridge.msdk.interstitial.p319c.C8697a;
import com.mbridge.msdk.mbsignalcommon.mraid.C8871a;
import com.mbridge.msdk.mbsignalcommon.mraid.C8873b;
import com.mbridge.msdk.mbsignalcommon.mraid.C8874c;
import com.mbridge.msdk.mbsignalcommon.mraid.C8875d;
import com.mbridge.msdk.mbsignalcommon.windvane.C8884d;
import com.mbridge.msdk.mbsignalcommon.windvane.C8887g;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.p078c.C2445b;
import com.mbridge.msdk.p078c.C2456d;
import com.smaato.sdk.core.injections.CoreLightModuleInterface;
import com.tapjoy.TJAdUnitConstants;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class MBInterstitialActivity extends MBBaseActivity implements C8873b {
    public static final String INTENT_CAMAPIGN = "campaign";
    public static final String INTENT_UNIT_ID = "unitId";
    public static final long WATI_JS_INVOKE = 2000;
    public static final long WEB_LOAD_TIME = 15000;

    /* renamed from: a */
    Runnable f21364a = new Runnable() {
        public final void run() {
            if (!MBInterstitialActivity.this.f21367d) {
                boolean unused = MBInterstitialActivity.this.f21366c = true;
                if (MBInterstitialActivity.this.f21371h != null) {
                    MBInterstitialActivity.this.f21371h.mo58227a("load page timeout");
                    if (MBInterstitialActivity.this.f21369f != null) {
                        MBInterstitialActivity.this.f21369f.setVisibility(8);
                        MBInterstitialActivity.this.f21369f.setWebViewListener((C8884d) null);
                        MBInterstitialActivity.this.f21369f.release();
                    }
                    MBInterstitialActivity.this.hideLoading();
                }
            }
        }
    };

    /* renamed from: b */
    Runnable f21365b = new Runnable() {
        public final void run() {
            if (!MBInterstitialActivity.this.mIsMBPage) {
                if (MBInterstitialActivity.this.f21368e != null && MBInterstitialActivity.this.f21368e.isMraid()) {
                    MBInterstitialActivity.m25070h(MBInterstitialActivity.this);
                }
                C8696a.m25003a().mo58214a(MBInterstitialActivity.this.f21368e, MBInterstitialActivity.this.mUnitid);
                if (!MBInterstitialActivity.this.f21366c) {
                    boolean unused = MBInterstitialActivity.this.f21367d = true;
                    MBInterstitialActivity.this.hideLoading();
                    MBInterstitialActivity.this.showWebView();
                }
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f21366c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f21367d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public CampaignEx f21368e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public WindVaneWebView f21369f;

    /* renamed from: g */
    private ImageView f21370g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C8697a.C8701c f21371h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f21372i;

    /* renamed from: j */
    private C8875d f21373j;

    /* renamed from: k */
    private long f21374k;

    /* renamed from: l */
    private boolean f21375l;

    /* renamed from: m */
    private boolean f21376m;
    public boolean mIsMBPage = false;
    public ProgressBar mProgressBar;
    public String mUnitid;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public Handler f21377n = new Handler() {
        public final void handleMessage(Message message) {
        }
    };

    /* renamed from: o */
    private C6765a f21378o;

    public void expand(String str, boolean z) {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            int a = C8658p.m24799a(getApplicationContext(), "mbridge_interstitial_activity", "layout");
            if (a != -1) {
                setContentView(a);
                initView();
                m25057a();
                this.f21370g.setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                        MBInterstitialActivity.this.finish();
                    }
                });
                if (!(this.f21369f == null || this.f21368e == null)) {
                    BrowserView.MBDownloadListener mBDownloadListener = new BrowserView.MBDownloadListener(this.f21368e);
                    mBDownloadListener.setTitle(this.f21368e.getAppName());
                    this.f21369f.setCampaignId(this.f21368e.getId());
                    this.f21369f.setDownloadListener(mBDownloadListener);
                }
                m25061b();
                try {
                    if (this.f21368e == null || (TextUtils.isEmpty(this.f21368e.getHtmlUrl()) && !this.f21368e.isMraid())) {
                        if (this.f21371h != null) {
                            this.f21371h.mo58227a("htmlurl is null");
                        }
                        C8388a.m23845e().mo56898a((Context) this);
                        C2470b.m6168a().mo16421a(this.mUnitid, this, (ViewGroup) null, (ViewGroup.LayoutParams) null, new C2462a() {
                            /* renamed from: a */
                            public final void mo16392a() {
                                String str;
                                MBInterstitialActivity.this.onPause();
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    if (C8388a.m23845e().mo56913g() != null) {
                                        jSONObject.put("status", 1);
                                    }
                                    str = jSONObject.toString();
                                } catch (Throwable th) {
                                    C8672v.m24875a("MBInterstitialActivity", th.getMessage(), th);
                                    str = "";
                                }
                                C8887g.m25669a().mo58687a((WebView) MBInterstitialActivity.this.f21369f, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                            }

                            /* renamed from: b */
                            public final void mo16394b() {
                                String str;
                                MBInterstitialActivity.this.onResume();
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    if (C8388a.m23845e().mo56913g() != null) {
                                        jSONObject.put("status", 2);
                                    }
                                    str = jSONObject.toString();
                                } catch (Throwable th) {
                                    C8672v.m24875a("MBInterstitialActivity", th.getMessage(), th);
                                    str = "";
                                }
                                C8887g.m25669a().mo58687a((WebView) MBInterstitialActivity.this.f21369f, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                            }

                            /* renamed from: a */
                            public final void mo16393a(String str) {
                                String str2;
                                MBInterstitialActivity.this.onResume();
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    if (C8388a.m23845e().mo56913g() != null) {
                                        jSONObject.put("status", 2);
                                    }
                                    str2 = jSONObject.toString();
                                } catch (Throwable th) {
                                    C8672v.m24875a("MBInterstitialActivity", th.getMessage(), th);
                                    str2 = "";
                                }
                                C8887g.m25669a().mo58687a((WebView) MBInterstitialActivity.this.f21369f, "onFeedbackAlertStatusNotify", Base64.encodeToString(str2.getBytes(), 2));
                            }
                        });
                        this.f21368e.setCampaignUnitId(this.mUnitid);
                        C2470b.m6168a().mo16423a(this.mUnitid, this.f21368e);
                    }
                    C8672v.m24876b("MBInterstitialActivity", "url:" + this.f21368e.getHtmlUrl());
                    goneWebView();
                    this.f21369f.setWebViewListener(new C8884d() {
                        /* renamed from: a */
                        public final void mo58276a(WebView webView, int i) {
                        }

                        /* renamed from: a */
                        public final void mo58280a(WebView webView, String str, Bitmap bitmap) {
                        }

                        /* renamed from: b */
                        public final void mo58281b(WebView webView, int i) {
                        }

                        /* renamed from: b */
                        public final boolean mo58282b(WebView webView, String str) {
                            return true;
                        }

                        /* renamed from: c */
                        public final void mo58283c(WebView webView, int i) {
                        }

                        /* renamed from: a */
                        public final void mo58278a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                            boolean unused = MBInterstitialActivity.this.f21372i = true;
                        }

                        /* renamed from: a */
                        public final void mo58277a(WebView webView, int i, String str, String str2) {
                            try {
                                boolean unused = MBInterstitialActivity.this.f21372i = true;
                                if (MBInterstitialActivity.this.f21371h != null) {
                                    MBInterstitialActivity.this.f21371h.mo58227a(str);
                                }
                                MBInterstitialActivity.m25058a(MBInterstitialActivity.this, 3, str);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        /* renamed from: a */
                        public final void mo58279a(WebView webView, String str) {
                            try {
                                if (!MBInterstitialActivity.this.f21372i) {
                                    MBInterstitialActivity.m25058a(MBInterstitialActivity.this, 1, "");
                                    if (!(MBInterstitialActivity.this.f21364a == null || MBInterstitialActivity.this.f21377n == null)) {
                                        MBInterstitialActivity.this.f21377n.removeCallbacks(MBInterstitialActivity.this.f21364a);
                                    }
                                    if (MBInterstitialActivity.this.f21371h != null) {
                                        MBInterstitialActivity.this.f21371h.mo58226a();
                                    }
                                    if (!MBInterstitialActivity.this.mIsMBPage) {
                                        MBInterstitialActivity.this.f21377n.postDelayed(MBInterstitialActivity.this.f21365b, 2000);
                                    }
                                    MBInterstitialActivity.m25067e(MBInterstitialActivity.this);
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                                if (MBInterstitialActivity.this.f21371h != null) {
                                    MBInterstitialActivity.this.f21371h.mo58227a("load page failed");
                                }
                            }
                        }
                    });
                    String htmlUrl = this.f21368e.getHtmlUrl();
                    if (this.f21368e.isMraid()) {
                        File file = new File(this.f21368e.getMraid());
                        if (file.exists() && file.isFile() && file.canRead()) {
                            htmlUrl = "file:////" + this.f21368e.getMraid();
                        }
                    }
                    this.f21374k = System.currentTimeMillis();
                    this.f21369f.loadUrl(htmlUrl);
                    this.f21377n.postDelayed(this.f21364a, 15000);
                    C8388a.m23845e().mo56898a((Context) this);
                    C2470b.m6168a().mo16421a(this.mUnitid, this, (ViewGroup) null, (ViewGroup.LayoutParams) null, new C2462a() {
                        /* renamed from: a */
                        public final void mo16392a() {
                            String str;
                            MBInterstitialActivity.this.onPause();
                            try {
                                JSONObject jSONObject = new JSONObject();
                                if (C8388a.m23845e().mo56913g() != null) {
                                    jSONObject.put("status", 1);
                                }
                                str = jSONObject.toString();
                            } catch (Throwable th) {
                                C8672v.m24875a("MBInterstitialActivity", th.getMessage(), th);
                                str = "";
                            }
                            C8887g.m25669a().mo58687a((WebView) MBInterstitialActivity.this.f21369f, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                        }

                        /* renamed from: b */
                        public final void mo16394b() {
                            String str;
                            MBInterstitialActivity.this.onResume();
                            try {
                                JSONObject jSONObject = new JSONObject();
                                if (C8388a.m23845e().mo56913g() != null) {
                                    jSONObject.put("status", 2);
                                }
                                str = jSONObject.toString();
                            } catch (Throwable th) {
                                C8672v.m24875a("MBInterstitialActivity", th.getMessage(), th);
                                str = "";
                            }
                            C8887g.m25669a().mo58687a((WebView) MBInterstitialActivity.this.f21369f, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                        }

                        /* renamed from: a */
                        public final void mo16393a(String str) {
                            String str2;
                            MBInterstitialActivity.this.onResume();
                            try {
                                JSONObject jSONObject = new JSONObject();
                                if (C8388a.m23845e().mo56913g() != null) {
                                    jSONObject.put("status", 2);
                                }
                                str2 = jSONObject.toString();
                            } catch (Throwable th) {
                                C8672v.m24875a("MBInterstitialActivity", th.getMessage(), th);
                                str2 = "";
                            }
                            C8887g.m25669a().mo58687a((WebView) MBInterstitialActivity.this.f21369f, "onFeedbackAlertStatusNotify", Base64.encodeToString(str2.getBytes(), 2));
                        }
                    });
                    this.f21368e.setCampaignUnitId(this.mUnitid);
                    C2470b.m6168a().mo16423a(this.mUnitid, this.f21368e);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                m25057a();
                m25061b();
                if (this.f21371h != null) {
                    this.f21371h.mo58227a("not found resource");
                }
                finish();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        CampaignEx campaignEx = this.f21368e;
        if (campaignEx != null && campaignEx.isMraid()) {
            C8871a.m25621a().mo58637b(this.f21369f, "true");
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        CampaignEx campaignEx = this.f21368e;
        if (campaignEx != null && campaignEx.isMraid()) {
            C8871a.m25621a().mo58637b(this.f21369f, "false");
        }
    }

    /* renamed from: a */
    private void m25057a() {
        Intent intent = getIntent();
        if (intent != null) {
            this.mUnitid = intent.getStringExtra("unitId");
            this.f21368e = (CampaignEx) intent.getSerializableExtra("campaign");
        }
        CampaignEx campaignEx = this.f21368e;
        if (campaignEx != null && campaignEx.isMraid()) {
            C8875d dVar = new C8875d(this);
            this.f21373j = dVar;
            dVar.mo58642c();
            this.f21373j.mo58640a(new C8875d.C8877b() {
                /* renamed from: a */
                public final void mo58259a(double d) {
                    C8871a.m25621a().mo58629a((WebView) MBInterstitialActivity.this.f21369f, d);
                }
            });
        }
        CampaignEx campaignEx2 = this.f21368e;
        if (campaignEx2 != null) {
            C6779b.m20644a((Context) this, campaignEx2.getMaitve(), this.f21368e.getMaitve_src());
        }
    }

    public void initView() {
        this.f21369f = (WindVaneWebView) findViewById(C8658p.m24799a(getApplicationContext(), "mbridge_interstitial_wv", "id"));
        this.mProgressBar = (ProgressBar) findViewById(C8658p.m24799a(getApplicationContext(), "mbridge_interstitial_pb", "id"));
        this.f21370g = (ImageView) findViewById(C8658p.m24799a(getApplicationContext(), "mbridge_interstitial_iv_close", "id"));
    }

    /* renamed from: b */
    private void m25061b() {
        try {
            if (C8697a.f21334e != null && !TextUtils.isEmpty(this.mUnitid) && C8697a.f21334e.containsKey(this.mUnitid)) {
                this.f21371h = C8697a.f21334e.get(this.mUnitid);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showWebView() {
        try {
            runOnUiThread(new Runnable() {
                public final void run() {
                    if (MBInterstitialActivity.this.f21369f != null) {
                        MBInterstitialActivity.this.f21369f.setVisibility(0);
                        if (MBInterstitialActivity.this.f21368e.isMraid()) {
                            MBInterstitialActivity.m25072j(MBInterstitialActivity.this);
                        }
                        MBInterstitialActivity.m25073k(MBInterstitialActivity.this);
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void goneWebView() {
        try {
            runOnUiThread(new Runnable() {
                public final void run() {
                    if (MBInterstitialActivity.this.f21369f != null) {
                        MBInterstitialActivity.this.f21369f.setVisibility(8);
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showLoading() {
        try {
            runOnUiThread(new Runnable() {
                public final void run() {
                    if (MBInterstitialActivity.this.mProgressBar != null) {
                        MBInterstitialActivity.this.mProgressBar.setVisibility(0);
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void hideLoading() {
        try {
            runOnUiThread(new Runnable() {
                public final void run() {
                    if (MBInterstitialActivity.this.mProgressBar != null) {
                        MBInterstitialActivity.this.mProgressBar.setVisibility(8);
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        try {
            if (this.f21371h != null) {
                this.f21371h.mo58228b();
            }
            if (this.f21378o != null) {
                this.f21378o.mo37046a(false);
                this.f21378o.mo37044a((NativeListener.NativeTrackingListener) null);
                this.f21378o.mo37040a();
            }
            if (this.f21373j != null) {
                this.f21373j.mo58643d();
            }
            if (!this.f21375l) {
                m25063c();
            }
            if (C8697a.f21334e != null && !TextUtils.isEmpty(this.mUnitid)) {
                C8697a.f21334e.remove(this.mUnitid);
            }
            this.f21371h = null;
            C2470b.m6168a().mo16429c(this.mUnitid);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void finish() {
        super.finish();
        if (!this.f21375l) {
            m25063c();
        }
        if (!this.f21376m) {
            reportPlayableClosed();
        }
    }

    public void reportPlayableClosed() {
        if (this.f21368e != null) {
            C8468m mVar = new C8468m("2000061", this.f21368e.getId(), this.f21368e.getRequestId(), this.f21368e.getRequestIdNotice(), this.mUnitid, C8660r.m24840o(C8388a.m23845e().mo56913g()));
            mVar.mo57816a(this.f21368e.isMraid() ? C8468m.f20702a : C8468m.f20703b);
            C8580c.m24609b(mVar, C8388a.m23845e().mo56913g(), this.mUnitid);
            this.f21376m = true;
        }
    }

    /* renamed from: c */
    private void m25063c() {
        C8582d dVar = new C8582d(getApplicationContext());
        CampaignEx campaignEx = this.f21368e;
        if (campaignEx != null) {
            dVar.mo58070a(campaignEx.getRequestId(), this.f21368e.getRequestIdNotice(), this.f21368e.getId(), this.mUnitid, C8874c.m25636a(this.f21368e.getId()), this.f21368e.isBidCampaign());
            C8874c.m25637b(this.f21368e.getId());
            this.f21375l = true;
        }
    }

    public void onIntersClick() {
        try {
            if (this.f21371h != null) {
                this.f21371h.mo58229c();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public C2456d getIntersUnitSetting() {
        try {
            if (TextUtils.isEmpty(this.mUnitid)) {
                return null;
            }
            C2456d e = C2445b.m6020a().mo16292e(C8388a.m23845e().mo56914h(), this.mUnitid);
            return e == null ? C2456d.m6072f(this.mUnitid) : e;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public void clickTracking() {
        try {
            if (this.f21368e == null) {
                return;
            }
            if (!C8616ad.m24717a(this.mUnitid)) {
                onIntersClick();
                C6765a aVar = new C6765a(getApplicationContext(), this.mUnitid);
                this.f21378o = aVar;
                aVar.mo37044a((NativeListener.NativeTrackingListener) new NativeListener.NativeTrackingListener() {
                    public final void onDismissLoading(Campaign campaign) {
                    }

                    public final void onDownloadFinish(Campaign campaign) {
                    }

                    public final void onDownloadProgress(int i) {
                    }

                    public final void onDownloadStart(Campaign campaign) {
                    }

                    public final boolean onInterceptDefaultLoadingDialog() {
                        return false;
                    }

                    public final void onShowLoading(Campaign campaign) {
                    }

                    public final void onStartRedirection(Campaign campaign, String str) {
                        try {
                            MBInterstitialActivity.this.showLoading();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }

                    public final void onRedirectionFailed(Campaign campaign, String str) {
                        MBInterstitialActivity.this.hideLoading();
                    }

                    public final void onFinishRedirection(Campaign campaign, String str) {
                        try {
                            MBInterstitialActivity.this.hideLoading();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
                this.f21378o.mo37041a(this.f21368e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void open(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f21368e.setClickURL(str);
            CampaignEx mraidCampaign = getMraidCampaign();
            if (mraidCampaign != null) {
                new C8582d(getApplicationContext()).mo58071b(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.mUnitid, str, mraidCampaign.isBidCampaign());
            }
        }
        clickTracking();
    }

    public void close() {
        finish();
    }

    public void unload() {
        close();
    }

    public CampaignEx getMraidCampaign() {
        return this.f21368e;
    }

    public void useCustomClose(boolean z) {
        if (z) {
            this.f21370g.setImageDrawable(new ColorDrawable(0));
        } else {
            this.f21370g.setImageResource(C8658p.m24799a(getApplicationContext(), "mbridge_interstitial_close", "drawable"));
        }
    }

    public void setTopControllerPadding(int i, int i2, int i3, int i4, int i5) {
        int b = C8677z.m24924b((Context) this, 10.0f);
        if (i2 <= 0) {
            i2 = b;
        }
        if (i3 <= 0) {
            i3 = b;
        }
        if (i4 <= 0) {
            i4 = b;
        }
        if (i5 <= 0) {
            i5 = b;
        }
        if (this.f21370g != null) {
            int b2 = C8677z.m24924b((Context) this, 25.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(b2, b2);
            layoutParams.addRule(11);
            layoutParams.setMargins(i2, i4, i3, i5);
            this.f21370g.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m25058a(MBInterstitialActivity mBInterstitialActivity, int i, String str) {
        CampaignEx campaignEx = mBInterstitialActivity.f21368e;
        if (campaignEx != null && campaignEx.isMraid()) {
            C8468m mVar = new C8468m();
            mVar.mo57840k(mBInterstitialActivity.f21368e.getRequestId());
            mVar.mo57842l(mBInterstitialActivity.f21368e.getRequestIdNotice());
            mVar.mo57846n(mBInterstitialActivity.f21368e.getId());
            mVar.mo57825d(i);
            mVar.mo57852q(String.valueOf(System.currentTimeMillis() - mBInterstitialActivity.f21374k));
            mVar.mo57830f("");
            mVar.mo57850p(str);
            mVar.mo57834h("5");
            mVar.mo57816a(mBInterstitialActivity.f21368e.isMraid() ? C8468m.f20702a : C8468m.f20703b);
            C8580c.m24610b(mVar, mBInterstitialActivity.mUnitid);
        }
    }

    /* renamed from: e */
    static /* synthetic */ void m25067e(MBInterstitialActivity mBInterstitialActivity) {
        CampaignEx campaignEx = mBInterstitialActivity.f21368e;
        if (campaignEx != null && campaignEx.isMraid()) {
            int i = mBInterstitialActivity.getResources().getConfiguration().orientation;
            String str = i != 0 ? i != 1 ? i != 2 ? "UNDEFINED" : "landscape" : "portrait" : AdError.UNDEFINED_DOMAIN;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(TJAdUnitConstants.String.ORIENTATION, str);
                jSONObject.put("locked", "true");
            } catch (Exception e) {
                e.printStackTrace();
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            mBInterstitialActivity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            HashMap hashMap = new HashMap();
            hashMap.put("placementType", IronSourceConstants.INTERSTITIAL_AD_UNIT);
            hashMap.put("state", CoreLightModuleInterface.NAME_DEFAULT_HTTP_HANDLER);
            hashMap.put("viewable", "true");
            hashMap.put("currentAppOrientation", jSONObject);
            C8871a.m25621a().mo58635b(mBInterstitialActivity.f21369f, (float) C8660r.m24829i(mBInterstitialActivity), (float) C8660r.m24831j(mBInterstitialActivity));
            C8871a.m25621a().mo58638c(mBInterstitialActivity.f21369f, (float) displayMetrics.widthPixels, (float) displayMetrics.heightPixels);
            C8871a.m25621a().mo58634a((WebView) mBInterstitialActivity.f21369f, (Map<String, Object>) hashMap);
            C8871a.m25621a().mo58629a((WebView) mBInterstitialActivity.f21369f, mBInterstitialActivity.f21373j.mo58639a());
            C8871a.m25621a().mo58628a(mBInterstitialActivity.f21369f);
        }
    }

    /* renamed from: h */
    static /* synthetic */ void m25070h(MBInterstitialActivity mBInterstitialActivity) {
        List<String> pv_urls;
        try {
            C8388a.m23845e().mo56898a((Context) mBInterstitialActivity);
            if (!TextUtils.isEmpty(mBInterstitialActivity.f21368e.getImpressionURL())) {
                C6765a.m20558a(C8388a.m23845e().mo56913g(), mBInterstitialActivity.f21368e, mBInterstitialActivity.mUnitid, mBInterstitialActivity.f21368e.getImpressionURL(), false, true, C6772a.f17856g);
            }
            if (!TextUtils.isEmpty(mBInterstitialActivity.f21368e.getOnlyImpressionURL())) {
                C6765a.m20558a(C8388a.m23845e().mo56913g(), mBInterstitialActivity.f21368e, mBInterstitialActivity.mUnitid, mBInterstitialActivity.f21368e.getOnlyImpressionURL(), false, true, C6772a.f17857h);
            }
            C8473d.m24279a(mBInterstitialActivity.mUnitid, mBInterstitialActivity.f21368e, "interstitial");
            C87186 r0 = new Runnable() {
                public final void run() {
                    C8417j.m23986a((C8412f) C8414g.m23969a((Context) MBInterstitialActivity.this)).mo57032b(MBInterstitialActivity.this.f21368e.getId());
                }
            };
            if (C8396b.m23890a().mo56951d()) {
                C8498b.m24359a().execute(r0);
            } else {
                r0.run();
            }
            if (mBInterstitialActivity.f21368e != null && (pv_urls = mBInterstitialActivity.f21368e.getPv_urls()) != null && pv_urls.size() > 0) {
                for (String a : pv_urls) {
                    C6765a.m20557a(C8388a.m23845e().mo56913g(), mBInterstitialActivity.f21368e, mBInterstitialActivity.mUnitid, a, false, true);
                }
            }
        } catch (Throwable th) {
            C8672v.m24874a("MBInterstitialActivity", th.getMessage());
        }
    }

    /* renamed from: j */
    static /* synthetic */ void m25072j(MBInterstitialActivity mBInterstitialActivity) {
        try {
            C8468m mVar = new C8468m();
            mVar.mo57840k(mBInterstitialActivity.f21368e.getRequestId());
            mVar.mo57842l(mBInterstitialActivity.f21368e.getRequestIdNotice());
            mVar.mo57846n(mBInterstitialActivity.f21368e.getId());
            mVar.mo57816a(mBInterstitialActivity.f21368e.isMraid() ? C8468m.f20702a : C8468m.f20703b);
            C8580c.m24605a(mVar, mBInterstitialActivity.getApplicationContext(), mBInterstitialActivity.mUnitid);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: k */
    static /* synthetic */ void m25073k(MBInterstitialActivity mBInterstitialActivity) {
        CampaignEx campaignEx = mBInterstitialActivity.f21368e;
        if (campaignEx != null && campaignEx.isMraid()) {
            mBInterstitialActivity.f21369f.post(new Runnable() {
                public final void run() {
                    C8871a.m25621a().mo58631a(MBInterstitialActivity.this.f21369f, (float) MBInterstitialActivity.this.f21369f.getLeft(), (float) MBInterstitialActivity.this.f21369f.getTop(), (float) MBInterstitialActivity.this.f21369f.getWidth(), (float) MBInterstitialActivity.this.f21369f.getHeight());
                    C8871a.m25621a().mo58636b(MBInterstitialActivity.this.f21369f, (float) MBInterstitialActivity.this.f21369f.getLeft(), (float) MBInterstitialActivity.this.f21369f.getTop(), (float) MBInterstitialActivity.this.f21369f.getWidth(), (float) MBInterstitialActivity.this.f21369f.getHeight());
                }
            });
        }
    }
}
