package com.mbridge.msdk.video.p347bt.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.click.C6765a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.C8582d;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.mbsignalcommon.base.C8858c;
import com.mbridge.msdk.mbsignalcommon.mraid.C8873b;
import com.mbridge.msdk.mbsignalcommon.p339b.C8852a;
import com.mbridge.msdk.mbsignalcommon.windvane.C8887g;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.video.p347bt.p348a.C9261c;
import com.mbridge.msdk.video.signal.p371a.C9514j;
import com.mbridge.msdk.videocommon.p375d.C9640c;
import com.tapjoy.TJAdUnitConstants;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.bt.module.MBridgeBTWebView */
public class MBridgeBTWebView extends BTBaseView implements C8873b {
    /* access modifiers changed from: private */

    /* renamed from: p */
    public String f22821p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public String f22822q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public String f22823r;

    /* renamed from: s */
    private boolean f22824s = false;

    /* renamed from: t */
    private ImageView f22825t;

    /* renamed from: u */
    private boolean f22826u = false;

    /* renamed from: v */
    private C9640c f22827v;

    /* renamed from: w */
    private List<CampaignEx> f22828w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public WindVaneWebView f22829x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public C9514j f22830y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public WebView f22831z;

    public void expand(String str, boolean z) {
    }

    public C9640c getRewardUnitSetting() {
        return this.f22827v;
    }

    public void setRewardUnitSetting(C9640c cVar) {
        this.f22827v = cVar;
    }

    public List<CampaignEx> getCampaigns() {
        return this.f22828w;
    }

    public void setCampaigns(List<CampaignEx> list) {
        this.f22828w = list;
    }

    public void setCreateWebView(WebView webView) {
        this.f22831z = webView;
    }

    public String getFileURL() {
        return this.f22821p;
    }

    public void setFileURL(String str) {
        this.f22821p = str;
        if (!TextUtils.isEmpty(str)) {
            boolean contains = str.contains("play.google.com");
            setWebviewClickable(!contains);
            if (contains) {
                C8858c cVar = new C8858c();
                WindVaneWebView windVaneWebView = this.f22829x;
                if (windVaneWebView != null) {
                    windVaneWebView.setFilter(cVar);
                }
            }
        }
    }

    public String getFilePath() {
        return this.f22822q;
    }

    public void setFilePath(String str) {
        this.f22822q = str;
    }

    public String getHtml() {
        return this.f22823r;
    }

    public void setHtml(String str) {
        this.f22823r = str;
    }

    public WindVaneWebView getWebView() {
        return this.f22829x;
    }

    public MBridgeBTWebView(Context context) {
        super(context);
    }

    public MBridgeBTWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setWebviewClickable(boolean z) {
        WindVaneWebView windVaneWebView = this.f22829x;
        if (windVaneWebView != null) {
            windVaneWebView.setClickable(z);
        }
    }

    public void init(Context context) {
        WindVaneWebView windVaneWebView = new WindVaneWebView(context);
        this.f22829x = windVaneWebView;
        windVaneWebView.setBackgroundColor(0);
        this.f22829x.setVisibility(0);
        C9514j jVar = new C9514j((Activity) null, this.f22640b, this.f22828w);
        this.f22830y = jVar;
        jVar.mo63244a(this.f22641c);
        this.f22829x.setObject(this.f22830y);
        this.f22829x.setMraidObject(this);
        this.f22829x.setWebViewListener(new C8852a() {
            /* renamed from: a */
            public final void mo58562a(Object obj) {
                super.mo58562a(obj);
                try {
                    String str = "";
                    String c = MBridgeBTWebView.this.f22830y != null ? MBridgeBTWebView.this.f22830y.mo63250c() : str;
                    if (!TextUtils.isEmpty(c)) {
                        str = Base64.encodeToString(c.getBytes(), 2);
                        C8672v.m24874a("RVWindVaneWebView", "getEndScreenInfo success");
                    } else {
                        C8672v.m24874a("RVWindVaneWebView", "getEndScreenInfo failed");
                    }
                    C8887g.m25669a().mo58688a(obj, str);
                } catch (Throwable th) {
                    C8672v.m24874a("RVWindVaneWebView", th.getMessage());
                }
            }

            /* renamed from: a */
            public final void mo58279a(WebView webView, String str) {
                super.mo58279a(webView, str);
                if (MBridgeBTWebView.this.f22831z != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", MBridgeBTWebView.this.f22642d);
                        jSONObject.put("code", BTBaseView.f22637n);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("id", MBridgeBTWebView.this.f22642d);
                        jSONObject2.put(IronSourceConstants.EVENTS_RESULT, 1);
                        jSONObject.put("data", jSONObject2);
                        C8887g.m25669a().mo58687a(MBridgeBTWebView.this.f22831z, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e) {
                        C9261c.m26212a().mo62502a(MBridgeBTWebView.this.f22831z, e.getMessage());
                        C8672v.m24874a("RVWindVaneWebView", e.getMessage());
                    }
                }
                C8887g.m25669a().mo58686a(MBridgeBTWebView.this.f22829x);
            }

            /* renamed from: a */
            public final void mo58277a(WebView webView, int i, String str, String str2) {
                super.mo58277a(webView, i, str, str2);
                if (MBridgeBTWebView.this.f22831z != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", MBridgeBTWebView.this.f22642d);
                        jSONObject.put("code", BTBaseView.f22637n);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("id", MBridgeBTWebView.this.f22642d);
                        jSONObject2.put(IronSourceConstants.EVENTS_RESULT, 2);
                        jSONObject2.put("error", str);
                        jSONObject.put("data", jSONObject2);
                        C8887g.m25669a().mo58687a(MBridgeBTWebView.this.f22831z, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e) {
                        C9261c.m26212a().mo62502a(MBridgeBTWebView.this.f22831z, e.getMessage());
                        C8672v.m24874a("RVWindVaneWebView", e.getMessage());
                    }
                }
            }

            /* renamed from: a */
            public final void mo58278a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                super.mo58278a(webView, sslErrorHandler, sslError);
                if (MBridgeBTWebView.this.f22831z != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", MBridgeBTWebView.this.f22642d);
                        jSONObject.put("code", BTBaseView.f22637n);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("id", MBridgeBTWebView.this.f22642d);
                        jSONObject2.put(IronSourceConstants.EVENTS_RESULT, 2);
                        jSONObject2.put("error", sslError.toString());
                        jSONObject.put("data", jSONObject2);
                        C8887g.m25669a().mo58687a(MBridgeBTWebView.this.f22831z, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e) {
                        C9261c.m26212a().mo62502a(MBridgeBTWebView.this.f22831z, e.getMessage());
                        C8672v.m24874a("RVWindVaneWebView", e.getMessage());
                    }
                }
            }

            /* renamed from: a */
            public final void mo58276a(WebView webView, int i) {
                super.mo58276a(webView, i);
            }
        });
        addView(this.f22829x, new FrameLayout.LayoutParams(-1, -1));
        setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                if (MBridgeBTWebView.this.f22831z != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", BTBaseView.f22637n);
                        jSONObject.put("id", MBridgeBTWebView.this.f22642d);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", String.valueOf(view.getX()));
                        jSONObject2.put("y", String.valueOf(view.getY()));
                        jSONObject.put("data", jSONObject2);
                        C8887g.m25669a().mo58687a(MBridgeBTWebView.this.f22831z, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception unused) {
                        C9261c.m26212a().mo62503a(MBridgeBTWebView.this.f22831z, "onClicked", MBridgeBTWebView.this.f22642d);
                    }
                }
            }
        });
        try {
            ImageView imageView = new ImageView(getContext());
            this.f22825t = imageView;
            imageView.setImageResource(findDrawable("mbridge_reward_close"));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
            layoutParams.gravity = 8388661;
            layoutParams.setMargins(30, 30, 30, 30);
            this.f22825t.setLayoutParams(layoutParams);
            this.f22825t.setVisibility(this.f22824s ? 4 : 8);
            if (this.f22640b != null && this.f22640b.isMraid()) {
                this.f22825t.setVisibility(4);
            }
            this.f22825t.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    MBridgeBTWebView.this.close();
                }
            });
            addView(this.f22825t);
        } catch (Throwable th) {
            C8672v.m24874a(BTBaseView.TAG, th.getMessage());
        }
    }

    public void setWebViewRid(String str) {
        WindVaneWebView windVaneWebView = this.f22829x;
        if (windVaneWebView != null) {
            windVaneWebView.setRid(str);
        }
    }

    public void preload() {
        if (!TextUtils.isEmpty(this.f22821p)) {
            this.f22829x.loadUrl(this.f22821p);
        } else if (!TextUtils.isEmpty(this.f22822q)) {
            this.f22829x.loadUrl(this.f22822q);
        } else if (!TextUtils.isEmpty(this.f22823r)) {
            this.f22829x.loadDataWithBaseURL("", this.f22823r, "text/html", "UTF-8", (String) null);
        }
    }

    public void webviewLoad(int i) {
        if (this.f22830y == null) {
            this.f22830y = new C9514j((Activity) null, this.f22640b, this.f22828w);
        }
        if (this.f22640b != null) {
            this.f22830y.mo63276a(this.f22640b);
        } else {
            List<CampaignEx> list = this.f22828w;
            if (list != null && list.size() > 0) {
                this.f22830y.mo63277a(this.f22828w);
                if (this.f22828w.size() == 1) {
                    this.f22830y.mo63276a(this.f22828w.get(0));
                }
            }
        }
        C9640c cVar = this.f22827v;
        if (cVar != null) {
            this.f22830y.mo63243a(cVar);
        }
        this.f22830y.mo63244a(this.f22641c);
        this.f22830y.mo63278c(this.f22642d);
        if (i == 1) {
            this.f22830y.mo63283n();
        }
        WindVaneWebView windVaneWebView = this.f22829x;
        if (windVaneWebView != null) {
            windVaneWebView.setObject(this.f22830y);
        }
        if (this.f22640b != null && this.f22640b.isMraid()) {
            this.f22825t.setVisibility(4);
        }
        preload();
    }

    public boolean webviewReload() {
        WindVaneWebView windVaneWebView = this.f22829x;
        if (windVaneWebView == null) {
            return false;
        }
        windVaneWebView.reload();
        return true;
    }

    public boolean webviewGoBack() {
        WindVaneWebView windVaneWebView = this.f22829x;
        if (windVaneWebView == null || !windVaneWebView.canGoBack()) {
            return false;
        }
        this.f22829x.goBack();
        return true;
    }

    public boolean webviewGoForward() {
        WindVaneWebView windVaneWebView = this.f22829x;
        if (windVaneWebView == null || !windVaneWebView.canGoForward()) {
            return false;
        }
        this.f22829x.goForward();
        return true;
    }

    public void broadcast(String str, JSONObject jSONObject) {
        if (this.f22829x != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", f22637n);
                jSONObject2.put("id", this.f22642d);
                jSONObject2.put("eventName", str);
                jSONObject2.put("data", jSONObject);
                C8887g.m25669a().mo58687a((WebView) this.f22829x, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                C9261c.m26212a().mo62503a((WebView) this.f22829x, "broadcast", this.f22642d);
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (this.f22829x != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (configuration.orientation == 2) {
                    jSONObject.put(TJAdUnitConstants.String.ORIENTATION, "landscape");
                } else {
                    jSONObject.put(TJAdUnitConstants.String.ORIENTATION, "portrait");
                }
                jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_INSTANCE_ID, this.f22642d);
                C8887g.m25669a().mo58687a((WebView) this.f22829x, TJAdUnitConstants.String.ORIENTATION, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void onBackPressed() {
        if (this.f22829x != null) {
            C9261c.m26212a().mo62503a((WebView) this.f22829x, "onSystemBackPressed", this.f22642d);
        }
    }

    public void onDestory() {
        if (!this.f22826u) {
            this.f22826u = true;
            try {
                if (this.f22829x != null) {
                    C9261c.m26212a().mo62503a((WebView) this.f22829x, "onSystemDestory", this.f22642d);
                }
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    public final void run() {
                        try {
                            if (MBridgeBTWebView.this.f22829x != null) {
                                MBridgeBTWebView.this.f22829x.clearWebView();
                                MBridgeBTWebView.this.f22829x.release();
                            }
                            String unused = MBridgeBTWebView.this.f22821p = null;
                            String unused2 = MBridgeBTWebView.this.f22822q = null;
                            String unused3 = MBridgeBTWebView.this.f22823r = null;
                            if (MBridgeBTWebView.this.f22831z != null) {
                                WebView unused4 = MBridgeBTWebView.this.f22831z = null;
                            }
                        } catch (Throwable th) {
                            C8672v.m24874a(BTBaseView.TAG, th.getMessage());
                        }
                    }
                }, 500);
                setOnClickListener((View.OnClickListener) null);
                removeAllViews();
            } catch (Throwable th) {
                C8672v.m24874a(BTBaseView.TAG, th.getMessage());
            }
        }
    }

    public void open(String str) {
        String clickURL;
        try {
            clickURL = this.f22640b.getClickURL();
            if (!TextUtils.isEmpty(str)) {
                this.f22640b.setClickURL(str);
                CampaignEx mraidCampaign = getMraidCampaign();
                if (mraidCampaign != null) {
                    new C8582d(getContext()).mo58071b(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.f22641c, str, this.f22640b.isBidCampaign());
                }
            }
        } catch (Throwable th) {
            C8672v.m24878d(BTBaseView.TAG, th.getMessage());
            return;
        }
        new C6765a(getContext(), this.f22641c).mo37041a(this.f22640b);
        this.f22640b.setClickURL(clickURL);
    }

    public void close() {
        WebView webView = this.f22831z;
        if (webView != null) {
            m26279a(webView, "onPlayerCloseBtnClicked", this.f22642d);
        }
    }

    public void unload() {
        close();
    }

    public CampaignEx getMraidCampaign() {
        return this.f22640b;
    }

    public void useCustomClose(boolean z) {
        try {
            this.f22825t.setVisibility(z ? 4 : 0);
        } catch (Throwable th) {
            C8672v.m24878d(BTBaseView.TAG, th.getMessage());
        }
    }
}
