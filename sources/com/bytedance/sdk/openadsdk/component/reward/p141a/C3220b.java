package com.bytedance.sdk.openadsdk.component.reward.p141a;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.component.utils.HomeWatcherReceiver;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p144b.C3365e;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.p149e.C3434p;
import com.bytedance.sdk.openadsdk.core.widget.PlayableLoadingView;
import com.bytedance.sdk.openadsdk.core.widget.p164a.C3686c;
import com.bytedance.sdk.openadsdk.core.widget.p164a.C3687d;
import com.bytedance.sdk.openadsdk.p128b.C3090e;
import com.bytedance.sdk.openadsdk.p128b.C3104n;
import com.bytedance.sdk.openadsdk.p170h.C3753b;
import com.bytedance.sdk.openadsdk.p178l.C3904y;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.a.b */
/* compiled from: RewardFullPlayableManager */
public class C3220b {

    /* renamed from: a */
    protected final AtomicBoolean f7577a = new AtomicBoolean(false);

    /* renamed from: b */
    protected final AtomicBoolean f7578b = new AtomicBoolean(false);

    /* renamed from: c */
    boolean f7579c = false;

    /* renamed from: d */
    boolean f7580d = false;

    /* renamed from: e */
    long f7581e = 0;

    /* renamed from: f */
    int f7582f = 0;

    /* renamed from: g */
    int f7583g = 0;

    /* renamed from: h */
    int f7584h = 0;

    /* renamed from: i */
    private Activity f7585i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C3431n f7586j;

    /* renamed from: k */
    private C3233f f7587k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public String f7588l;

    /* renamed from: m */
    private int f7589m = 1;

    /* renamed from: n */
    private PlayableLoadingView f7590n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f7591o = true;

    /* renamed from: p */
    private HomeWatcherReceiver f7592p;

    /* renamed from: q */
    private boolean f7593q = false;

    public C3220b(Activity activity) {
        this.f7585i = activity;
    }

    /* renamed from: a */
    public void mo18914a(C3233f fVar, C3431n nVar, String str, int i) {
        if (!this.f7593q) {
            this.f7593q = true;
            this.f7587k = fVar;
            this.f7586j = nVar;
            this.f7588l = str;
            this.f7589m = i;
            m9348l();
        }
    }

    /* renamed from: l */
    private void m9348l() {
        Activity activity = this.f7585i;
        this.f7590n = (PlayableLoadingView) activity.findViewById(C2914t.m8158e(activity, "tt_reward_playable_loading"));
    }

    /* renamed from: a */
    public boolean mo18919a() {
        if (this.f7590n == null) {
            return false;
        }
        C3431n nVar = this.f7586j;
        if (nVar == null || !nVar.mo19563aG() || !C3434p.m10497i(this.f7586j)) {
            this.f7590n.mo20386a();
            return false;
        }
        this.f7590n.mo20387b();
        return true;
    }

    /* renamed from: b */
    public void mo18921b() {
        if (!this.f7577a.getAndSet(true) && this.f7587k.mo19024c() != null && this.f7587k.mo19026d() != null) {
            C3904y.m12853a((View) this.f7587k.mo19024c(), 0);
            C3904y.m12853a((View) this.f7587k.mo19026d(), 8);
        }
    }

    /* renamed from: a */
    public void mo18913a(DownloadListener downloadListener) {
        if (this.f7587k.mo19026d() != null) {
            String m = m9349m();
            if (!TextUtils.isEmpty(m)) {
                this.f7587k.mo19026d().setWebViewClient(new C3687d(this.f7585i, this.f7587k.mo19029f(), this.f7586j.mo19532Y(), (C3104n) null, false) {
                    public void onPageFinished(WebView webView, String str) {
                        if (C3220b.this.f7591o) {
                            C3090e.m8923c(this.f9538d, C3220b.this.f7586j, C3220b.this.f7588l, "loading_h5_success", (JSONObject) null);
                        }
                        super.onPageFinished(webView, str);
                    }

                    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                        boolean unused = C3220b.this.f7591o = false;
                    }

                    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                        super.onReceivedError(webView, webResourceRequest, webResourceError);
                        boolean unused = C3220b.this.f7591o = false;
                    }

                    public void onReceivedError(WebView webView, int i, String str, String str2) {
                        super.onReceivedError(webView, i, str, str2);
                        boolean unused = C3220b.this.f7591o = false;
                    }
                });
                this.f7587k.mo19026d().mo17835a(m);
                this.f7587k.mo19026d().setDisplayZoomControls(false);
                this.f7587k.mo19026d().setWebChromeClient(new C3686c(this.f7587k.mo19029f(), this.f7587k.mo19030g()));
                this.f7587k.mo19026d().setDownloadListener(downloadListener);
            }
        }
    }

    /* renamed from: m */
    private String m9349m() {
        C3431n nVar;
        String l = C3513m.m10973h().mo19867l();
        C2905l.m8114c("Playable", "getPlayableLoadH5Url->loadH5Url=" + l);
        if (TextUtils.isEmpty(l) || (nVar = this.f7586j) == null || nVar.mo19567aa() == null) {
            return l;
        }
        String b = this.f7586j.mo19567aa().mo19404b();
        double d = this.f7586j.mo19567aa().mo19409d();
        int e = this.f7586j.mo19567aa().mo19410e();
        String a = (this.f7586j.mo19520M() == null || TextUtils.isEmpty(this.f7586j.mo19520M().mo19468a())) ? "" : this.f7586j.mo19520M().mo19468a();
        String Y = this.f7586j.mo19532Y();
        String c = this.f7586j.mo19567aa().mo19407c();
        String a2 = this.f7586j.mo19567aa().mo19400a();
        String b2 = this.f7586j.mo19567aa().mo19404b();
        String U = this.f7586j.mo19528U();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("appname=");
        stringBuffer.append(URLEncoder.encode(b));
        stringBuffer.append("&stars=");
        stringBuffer.append(d);
        stringBuffer.append("&comments=");
        stringBuffer.append(e);
        stringBuffer.append("&icon=");
        stringBuffer.append(URLEncoder.encode(a));
        stringBuffer.append("&downloading=");
        stringBuffer.append(true);
        stringBuffer.append("&id=");
        stringBuffer.append(URLEncoder.encode(Y));
        stringBuffer.append("&packageName=");
        stringBuffer.append(URLEncoder.encode(c));
        stringBuffer.append("&downloadUrl=");
        stringBuffer.append(URLEncoder.encode(a2));
        stringBuffer.append("&name=");
        stringBuffer.append(URLEncoder.encode(b2));
        stringBuffer.append("&orientation=");
        stringBuffer.append(this.f7589m == 1 ? "portrait" : "landscape");
        stringBuffer.append("&apptitle=");
        stringBuffer.append(URLEncoder.encode(U));
        String str = l + "?" + stringBuffer.toString();
        C2905l.m8114c("Playable", "Playable-loadH5Url=" + str);
        return str;
    }

    /* renamed from: c */
    public void mo18923c() {
        this.f7579c = true;
    }

    /* renamed from: d */
    public boolean mo18926d() {
        return this.f7579c;
    }

    /* renamed from: a */
    public void mo18918a(boolean z) {
        if (Build.VERSION.SDK_INT >= 19 && z) {
            this.f7587k.mo19024c().setDomStorageEnabled(true);
        }
    }

    /* renamed from: b */
    public void mo18922b(boolean z) {
        if (z) {
            try {
                if (!TextUtils.isEmpty(this.f7587k.mo19039p()) && this.f7587k.mo19037n() != 0) {
                    C3753b.m12287a().mo20571a(this.f7587k.mo19039p(), this.f7587k.mo19037n(), this.f7587k.mo19038o());
                }
            } catch (Throwable unused) {
            }
        }
        if (z) {
            try {
                if (!TextUtils.isEmpty(this.f7587k.mo19039p())) {
                    C3753b.m12287a().mo20576b(this.f7587k.mo19039p());
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: e */
    public void mo18927e() {
        try {
            HomeWatcherReceiver homeWatcherReceiver = new HomeWatcherReceiver();
            this.f7592p = homeWatcherReceiver;
            homeWatcherReceiver.mo17804a(new HomeWatcherReceiver.C2887a() {
                /* renamed from: a */
                public void mo17806a() {
                    C3220b.this.f7580d = true;
                }

                /* renamed from: b */
                public void mo17807b() {
                    C3220b.this.f7580d = true;
                }
            });
            this.f7585i.getApplicationContext().registerReceiver(this.f7592p, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo18912a(Context context) {
        try {
            this.f7592p.mo17804a((HomeWatcherReceiver.C2887a) null);
            context.getApplicationContext().unregisterReceiver(this.f7592p);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo18916a(String str) {
        if (this.f7580d) {
            HashMap hashMap = new HashMap();
            hashMap.put("duration", Long.valueOf(System.currentTimeMillis() - this.f7581e));
            C3090e.m8922c((Context) this.f7585i, this.f7586j, this.f7588l, str, (Map<String, Object>) hashMap);
            if ("return_foreground".equals(str)) {
                this.f7580d = false;
            }
        }
    }

    /* renamed from: f */
    public void mo18928f() {
        this.f7581e = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void mo18917a(Map<String, Object> map) {
        if (map != null) {
            map.put("duration", Long.valueOf(System.currentTimeMillis() - this.f7581e));
        }
    }

    /* renamed from: a */
    public void mo18910a(int i) {
        PlayableLoadingView playableLoadingView = this.f7590n;
        if (playableLoadingView != null) {
            playableLoadingView.setProgress(i);
        }
    }

    /* renamed from: a */
    public void mo18915a(C3365e eVar) {
        PlayableLoadingView playableLoadingView = this.f7590n;
        if (playableLoadingView != null && playableLoadingView.getPlayView() != null && C3434p.m10497i(this.f7586j)) {
            this.f7590n.getPlayView().setOnClickListener(eVar);
            this.f7590n.getPlayView().setOnTouchListener(eVar);
        }
    }

    /* renamed from: g */
    public void mo18929g() {
        PlayableLoadingView playableLoadingView = this.f7590n;
        if (playableLoadingView != null) {
            playableLoadingView.mo20386a();
        }
    }

    /* renamed from: h */
    public void mo18930h() {
        this.f7578b.set(true);
    }

    /* renamed from: i */
    public boolean mo18931i() {
        return this.f7578b.get();
    }

    /* renamed from: b */
    public int mo18920b(int i) {
        return this.f7584h - (this.f7583g - i);
    }

    /* renamed from: j */
    public int mo18932j() {
        return this.f7583g;
    }

    /* renamed from: k */
    public int mo18933k() {
        return this.f7582f;
    }

    /* renamed from: a */
    public void mo18911a(int i, C3431n nVar, boolean z) {
        if (nVar != null) {
            this.f7583g = nVar.mo19586at();
            this.f7584h = C3513m.m10973h().mo19834a(String.valueOf(i), z);
        }
    }

    /* renamed from: c */
    public void mo18924c(int i) {
        this.f7582f = i - 1;
    }

    /* renamed from: d */
    public void mo18925d(int i) {
        this.f7582f = i;
    }
}
