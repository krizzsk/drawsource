package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.DownloadListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.common.C3161d;
import com.bytedance.sdk.openadsdk.common.C3171f;
import com.bytedance.sdk.openadsdk.core.C3356b;
import com.bytedance.sdk.openadsdk.core.C3457h;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.C3516n;
import com.bytedance.sdk.openadsdk.core.C3580t;
import com.bytedance.sdk.openadsdk.core.C3666w;
import com.bytedance.sdk.openadsdk.core.C3706z;
import com.bytedance.sdk.openadsdk.core.p144b.C3359a;
import com.bytedance.sdk.openadsdk.core.p149e.C3402a;
import com.bytedance.sdk.openadsdk.core.p149e.C3403b;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.p149e.C3433o;
import com.bytedance.sdk.openadsdk.core.widget.p164a.C3685b;
import com.bytedance.sdk.openadsdk.core.widget.p164a.C3686c;
import com.bytedance.sdk.openadsdk.core.widget.p164a.C3687d;
import com.bytedance.sdk.openadsdk.multipro.C3948b;
import com.bytedance.sdk.openadsdk.p128b.C3060a;
import com.bytedance.sdk.openadsdk.p128b.C3090e;
import com.bytedance.sdk.openadsdk.p128b.C3104n;
import com.bytedance.sdk.openadsdk.p166e.C3730d;
import com.bytedance.sdk.openadsdk.p178l.C3881j;
import com.bytedance.sdk.openadsdk.p178l.C3882k;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import com.bytedance.sdk.openadsdk.p178l.C3904y;
import com.com.bytedance.overseas.sdk.p185a.C3968c;
import com.com.bytedance.overseas.sdk.p185a.C3969d;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

public class TTLandingPageActivity extends Activity implements C3730d {

    /* renamed from: b */
    private static final String f6871b = TTLandingPageActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: A */
    public boolean f6872A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public C3171f f6873B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C3161d f6874C;

    /* renamed from: D */
    private String f6875D = "ダウンロード";

    /* renamed from: a */
    C3104n f6876a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public SSWebView f6877c;

    /* renamed from: d */
    private ImageView f6878d;

    /* renamed from: e */
    private ImageView f6879e;

    /* renamed from: f */
    private TextView f6880f;

    /* renamed from: g */
    private Context f6881g;

    /* renamed from: h */
    private int f6882h;

    /* renamed from: i */
    private ViewStub f6883i;

    /* renamed from: j */
    private ViewStub f6884j;

    /* renamed from: k */
    private ViewStub f6885k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Button f6886l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public ProgressBar f6887m;

    /* renamed from: n */
    private String f6888n;

    /* renamed from: o */
    private String f6889o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C3666w f6890p;

    /* renamed from: q */
    private int f6891q;

    /* renamed from: r */
    private String f6892r;

    /* renamed from: s */
    private C3431n f6893s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C3968c f6894t;

    /* renamed from: u */
    private String f6895u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public AtomicBoolean f6896v = new AtomicBoolean(true);

    /* renamed from: w */
    private JSONArray f6897w = null;

    /* renamed from: x */
    private String f6898x;

    /* renamed from: y */
    private int f6899y = 0;

    /* renamed from: z */
    private int f6900z = 0;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!TTAdSdk.isInitSuccess()) {
            finish();
        }
        try {
            C3513m.m10965a(this);
        } catch (Throwable unused) {
        }
        setContentView(C2914t.m8159f(this, "tt_activity_ttlandingpage"));
        Intent intent = getIntent();
        this.f6882h = intent.getIntExtra("sdk_version", 1);
        this.f6888n = intent.getStringExtra("adid");
        this.f6889o = intent.getStringExtra("log_extra");
        this.f6891q = intent.getIntExtra("source", -1);
        String stringExtra = intent.getStringExtra("url");
        this.f6895u = stringExtra;
        m8527a(4);
        String stringExtra2 = intent.getStringExtra("web_title");
        intent.getStringExtra(CampaignEx.JSON_KEY_ICON_URL);
        this.f6892r = intent.getStringExtra("event_tag");
        this.f6898x = intent.getStringExtra("gecko_id");
        if (C3948b.m12959c()) {
            String stringExtra3 = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
            if (stringExtra3 != null) {
                try {
                    this.f6893s = C3356b.m9935a(new JSONObject(stringExtra3));
                } catch (Exception e) {
                    C2905l.m8115c(f6871b, "TTLandingPageActivity - onCreate MultiGlobalInfo : ", e);
                }
            }
        } else {
            this.f6893s = C3580t.m11322a().mo20135c();
            C3580t.m11322a().mo20140h();
        }
        if (this.f6893s == null) {
            finish();
            return;
        }
        this.f6872A = C3513m.m10973h().mo19854g();
        m8535c();
        this.f6881g = this;
        if (this.f6877c != null) {
            C3685b.m12035a((Context) this).mo20447a(false).mo20449b(false).mo20448a(this.f6877c.getWebView());
        }
        SSWebView sSWebView = this.f6877c;
        if (!(sSWebView == null || sSWebView.getWebView() == null)) {
            this.f6876a = new C3104n(this, this.f6893s, this.f6877c.getWebView()).mo18688a(true);
        }
        m8537d();
        this.f6877c.setLandingPage(true);
        this.f6877c.setTag("landingpage");
        this.f6877c.setMaterialMeta(this.f6893s.mo19559aC());
        this.f6877c.setWebViewClient(new C3687d(this.f6881g, this.f6890p, this.f6888n, this.f6876a, true) {
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                try {
                    if (TTLandingPageActivity.this.f6887m != null && !TTLandingPageActivity.this.isFinishing()) {
                        TTLandingPageActivity.this.f6887m.setVisibility(8);
                    }
                } catch (Throwable unused) {
                }
            }

            public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                return super.shouldInterceptRequest(webView, str);
            }
        });
        SSWebView sSWebView2 = this.f6877c;
        if (sSWebView2 != null) {
            sSWebView2.setUserAgentString(C3881j.m12666a(sSWebView2.getWebView(), this.f6882h));
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f6877c.setMixedContentMode(0);
        }
        C3090e.m8889a(this.f6881g, this.f6893s);
        C3882k.m12668a(this.f6877c, stringExtra);
        this.f6877c.setWebChromeClient(new C3686c(this.f6890p, this.f6876a) {
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (TTLandingPageActivity.this.f6872A) {
                    if (TTLandingPageActivity.this.f6873B != null) {
                        TTLandingPageActivity.this.f6873B.mo18811a(webView, i);
                    }
                    if (TTLandingPageActivity.this.f6874C != null && i == 100) {
                        TTLandingPageActivity.this.f6874C.mo18797a(webView);
                    }
                } else if (TTLandingPageActivity.this.f6887m != null && !TTLandingPageActivity.this.isFinishing()) {
                    if (i != 100 || !TTLandingPageActivity.this.f6887m.isShown()) {
                        TTLandingPageActivity.this.f6887m.setProgress(i);
                    } else {
                        TTLandingPageActivity.this.f6887m.setVisibility(8);
                    }
                }
            }
        });
        if (this.f6872A) {
            this.f6877c.getWebView().setOnTouchListener(new View.OnTouchListener() {

                /* renamed from: a */
                float f6903a = 0.0f;

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 0) {
                        this.f6903a = motionEvent.getY();
                    }
                    if (motionEvent.getAction() == 2) {
                        float y = motionEvent.getY();
                        float f = this.f6903a;
                        if (y - f > 8.0f) {
                            if (TTLandingPageActivity.this.f6873B != null) {
                                TTLandingPageActivity.this.f6873B.mo18810a();
                            }
                            if (TTLandingPageActivity.this.f6874C != null) {
                                TTLandingPageActivity.this.f6874C.mo18796a();
                            }
                            return false;
                        } else if (y - f < -8.0f) {
                            if (TTLandingPageActivity.this.f6873B != null) {
                                TTLandingPageActivity.this.f6873B.mo18812b();
                            }
                            if (TTLandingPageActivity.this.f6874C != null) {
                                TTLandingPageActivity.this.f6874C.mo18798b();
                            }
                        }
                    }
                    return false;
                }
            });
        }
        this.f6877c.setDownloadListener(new DownloadListener() {
            public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                if (TTLandingPageActivity.this.f6894t != null) {
                    TTLandingPageActivity.this.f6894t.mo20860d();
                }
            }
        });
        TextView textView = this.f6880f;
        if (textView != null) {
            if (TextUtils.isEmpty(stringExtra2)) {
                stringExtra2 = C2914t.m8151a(this, "tt_web_title_default");
            }
            textView.setText(stringExtra2);
        }
        m8526a();
    }

    /* renamed from: a */
    private void m8526a() {
        C3431n nVar = this.f6893s;
        if (nVar != null && nVar.mo19519L() == 4) {
            ViewStub viewStub = this.f6885k;
            if (viewStub != null) {
                viewStub.setVisibility(0);
            }
            Button button = (Button) findViewById(C2914t.m8158e(this, "tt_browser_download_btn"));
            this.f6886l = button;
            if (button != null) {
                m8529a(m8531b());
                if (this.f6894t == null) {
                    this.f6894t = C3969d.m13089a(this, this.f6893s, TextUtils.isEmpty(this.f6892r) ? C3898x.m12752a(this.f6891q) : this.f6892r);
                }
                C3359a aVar = new C3359a(this, this.f6893s, this.f6892r, this.f6891q);
                aVar.mo19296a(false);
                this.f6886l.setOnClickListener(aVar);
                this.f6886l.setOnTouchListener(aVar);
                aVar.mo19300c(true);
                aVar.mo19311a(this.f6894t);
            }
        }
    }

    /* renamed from: b */
    private String m8531b() {
        C3431n nVar = this.f6893s;
        if (nVar != null && !TextUtils.isEmpty(nVar.mo19530W())) {
            this.f6875D = this.f6893s.mo19530W();
        }
        return this.f6875D;
    }

    /* renamed from: a */
    private void m8529a(final String str) {
        Button button;
        if (!TextUtils.isEmpty(str) && (button = this.f6886l) != null) {
            button.post(new Runnable() {
                public void run() {
                    if (TTLandingPageActivity.this.f6886l != null && !TTLandingPageActivity.this.isFinishing()) {
                        TTLandingPageActivity.this.f6886l.setText(str);
                    }
                }
            });
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m8526a();
    }

    /* renamed from: c */
    private void m8535c() {
        ViewStub viewStub;
        this.f6877c = (SSWebView) findViewById(C2914t.m8158e(this, "tt_browser_webview"));
        this.f6885k = (ViewStub) findViewById(C2914t.m8158e(this, "tt_browser_download_btn_stub"));
        this.f6883i = (ViewStub) findViewById(C2914t.m8158e(this, "tt_browser_titlebar_view_stub"));
        this.f6884j = (ViewStub) findViewById(C2914t.m8158e(this, "tt_browser_titlebar_dark_view_stub"));
        if (this.f6872A) {
            ((ViewStub) findViewById(C2914t.m8158e(this, "tt_browser_new_title_bar_view_stub"))).setVisibility(0);
            ((ViewStub) findViewById(C2914t.m8158e(this, "tt_browser_new_bottom_bar_view_stub"))).setVisibility(0);
            C3171f fVar = new C3171f(this, (RelativeLayout) findViewById(C2914t.m8158e(this, "tt_title_bar")), this.f6893s);
            this.f6873B = fVar;
            ImageView c = fVar.mo18813c();
            this.f6879e = c;
            c.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    TTLandingPageActivity.this.finish();
                }
            });
            this.f6874C = new C3161d(this, (LinearLayout) findViewById(C2914t.m8158e(this, "tt_bottom_bar")), this.f6877c, this.f6893s, "landingpage");
            return;
        }
        int o = C3457h.m10580d().mo19775o();
        if (o == 0) {
            ViewStub viewStub2 = this.f6883i;
            if (viewStub2 != null) {
                viewStub2.setVisibility(0);
            }
        } else if (o == 1 && (viewStub = this.f6884j) != null) {
            viewStub.setVisibility(0);
        }
        ImageView imageView = (ImageView) findViewById(C2914t.m8158e(this, "tt_titlebar_back"));
        this.f6878d = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (TTLandingPageActivity.this.f6877c == null) {
                        return;
                    }
                    if (TTLandingPageActivity.this.f6877c.mo17846e()) {
                        TTLandingPageActivity.this.f6877c.mo17847f();
                    } else if (TTLandingPageActivity.this.m8539e()) {
                        TTLandingPageActivity.this.onBackPressed();
                    } else {
                        TTLandingPageActivity.this.finish();
                    }
                }
            });
        }
        ImageView imageView2 = (ImageView) findViewById(C2914t.m8158e(this, "tt_titlebar_close"));
        this.f6879e = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    TTLandingPageActivity.this.finish();
                }
            });
        }
        this.f6880f = (TextView) findViewById(C2914t.m8158e(this, "tt_titlebar_title"));
        ProgressBar progressBar = (ProgressBar) findViewById(C2914t.m8158e(this, "tt_browser_progress"));
        this.f6887m = progressBar;
        progressBar.setVisibility(0);
    }

    /* renamed from: d */
    private void m8537d() {
        C3666w wVar = new C3666w(this);
        this.f6890p = wVar;
        wVar.mo20354b(this.f6877c).mo20364d(this.f6888n).mo20368e(this.f6889o).mo20337a(this.f6893s).mo20353b(this.f6891q).mo20331a(this.f6893s.mo19513F()).mo20370f(C3898x.m12810i(this.f6893s)).mo20334a(this.f6877c).mo20360c("landingpage").mo20339a((C3730d) this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C3666w wVar = this.f6890p;
        if (wVar != null) {
            wVar.mo20377l();
        }
        C3104n nVar = this.f6876a;
        if (nVar != null) {
            nVar.mo18701d();
        }
        m8541f();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C3104n nVar = this.f6876a;
        if (nVar != null) {
            nVar.mo18702e();
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C3580t.m11322a().mo20133b(true);
        C3666w wVar = this.f6890p;
        if (wVar != null) {
            wVar.mo20378m();
        }
    }

    public void onBackPressed() {
        if (!m8539e() || this.f6896v.getAndSet(true)) {
            super.onBackPressed();
            return;
        }
        m8530a(true);
        m8527a(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public boolean m8539e() {
        return !TextUtils.isEmpty(this.f6895u) && this.f6895u.contains("__luban_sdk");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8527a(int i) {
        if (this.f6879e != null && m8539e()) {
            C3904y.m12853a((View) this.f6879e, i);
        }
    }

    /* renamed from: a */
    private void m8530a(boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackIntercept", z);
            this.f6890p.mo20350a("temai_back_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    private void m8541f() {
        if (this.f6893s != null) {
            JSONArray b = m8532b(this.f6895u);
            int f = C3898x.m12794f(this.f6893s);
            int e = C3898x.m12790e(this.f6893s);
            C3516n<C3060a> f2 = C3513m.m10971f();
            if (b != null && f2 != null && f > 0 && e > 0) {
                C3433o oVar = new C3433o();
                oVar.f8444e = b;
                AdSlot x = this.f6893s.mo19664x();
                if (x != null) {
                    x.setAdCount(6);
                    f2.mo19983a(x, oVar, e, new C3516n.C3517a() {
                        /* renamed from: a */
                        public void mo18456a(int i, String str) {
                            TTLandingPageActivity.this.m8527a(0);
                        }

                        /* renamed from: a */
                        public void mo18457a(C3402a aVar, C3403b bVar) {
                            if (aVar != null) {
                                try {
                                    TTLandingPageActivity.this.f6896v.set(false);
                                    TTLandingPageActivity.this.f6890p.mo20355b(new JSONObject(aVar.mo19388c()));
                                } catch (Exception unused) {
                                    TTLandingPageActivity.this.m8527a(0);
                                }
                            }
                        }
                    });
                }
            }
        }
    }

    /* renamed from: b */
    private JSONArray m8532b(String str) {
        int i;
        JSONArray jSONArray = this.f6897w;
        if (jSONArray != null && jSONArray.length() > 0) {
            return this.f6897w;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf("?id=");
        int indexOf2 = str.indexOf("&");
        if (indexOf == -1 || indexOf2 == -1 || (i = indexOf + 4) >= indexOf2) {
            return null;
        }
        String substring = str.substring(i, indexOf2);
        if (TextUtils.isEmpty(substring)) {
            return null;
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(substring);
        return jSONArray2;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        ViewGroup viewGroup;
        SSWebView sSWebView;
        super.onDestroy();
        C3104n nVar = this.f6876a;
        if (!(nVar == null || (sSWebView = this.f6877c) == null)) {
            nVar.mo18696a(sSWebView);
        }
        try {
            if (!(getWindow() == null || (viewGroup = (ViewGroup) getWindow().getDecorView()) == null)) {
                viewGroup.removeAllViews();
            }
        } catch (Throwable unused) {
        }
        SSWebView sSWebView2 = this.f6877c;
        if (sSWebView2 != null) {
            C3706z.m12119a(this.f6881g, sSWebView2.getWebView());
            C3706z.m12120a(this.f6877c.getWebView());
        }
        this.f6877c = null;
        C3666w wVar = this.f6890p;
        if (wVar != null) {
            wVar.mo20379n();
        }
        C3104n nVar2 = this.f6876a;
        if (nVar2 != null) {
            nVar2.mo18703f();
        }
    }

    /* renamed from: a */
    public void mo18439a(boolean z, JSONArray jSONArray) {
        if (z && jSONArray != null && jSONArray.length() > 0) {
            this.f6897w = jSONArray;
            m8541f();
        }
    }
}
