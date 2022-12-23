package com.bytedance.sdk.openadsdk.common;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.C2889b;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.p128b.C3090e;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.common.d */
/* compiled from: TTBottomNewStyleManager */
public class C3161d {

    /* renamed from: a */
    private final LinearLayout f7418a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final SSWebView f7419b;

    /* renamed from: c */
    private final C3431n f7420c;

    /* renamed from: d */
    private final String f7421d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Context f7422e;

    /* renamed from: f */
    private ImageView f7423f;

    /* renamed from: g */
    private ImageView f7424g;

    /* renamed from: h */
    private ImageView f7425h;

    /* renamed from: i */
    private ImageView f7426i;

    public C3161d(Context context, LinearLayout linearLayout, SSWebView sSWebView, C3431n nVar, String str) {
        this.f7422e = context;
        this.f7418a = linearLayout;
        this.f7419b = sSWebView;
        this.f7420c = nVar;
        this.f7421d = str;
        m9154c();
    }

    /* renamed from: c */
    private void m9154c() {
        this.f7423f = (ImageView) this.f7418a.findViewById(C2914t.m8158e(this.f7422e, "tt_bottom_bar_back"));
        this.f7424g = (ImageView) this.f7418a.findViewById(C2914t.m8158e(this.f7422e, "tt_bottom_bar_forward"));
        this.f7425h = (ImageView) this.f7418a.findViewById(C2914t.m8158e(this.f7422e, "tt_bottom_bar_refresh"));
        this.f7426i = (ImageView) this.f7418a.findViewById(C2914t.m8158e(this.f7422e, "tt_bottom_bar_go_to_browser"));
        this.f7423f.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (C3161d.this.f7419b != null && C3161d.this.f7419b.mo17846e()) {
                    C3161d.this.m9150a("backward");
                    C3161d.this.f7419b.mo17847f();
                }
            }
        });
        this.f7424g.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (C3161d.this.f7419b != null && C3161d.this.f7419b.mo17848g()) {
                    C3161d.this.m9150a("forward");
                    C3161d.this.f7419b.mo17857h();
                }
            }
        });
        this.f7425h.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (C3161d.this.f7419b != null) {
                    C3161d.this.m9153b("refresh");
                    C3161d.this.f7419b.mo17844d();
                }
            }
        });
        this.f7426i.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (C3161d.this.f7419b != null) {
                    C3161d.this.m9153b("external_btn_click");
                    Intent intent = new Intent("android.intent.action.VIEW");
                    String url = C3161d.this.f7419b.getUrl();
                    if (!TextUtils.isEmpty(url)) {
                        intent.setData(Uri.parse(url));
                        C2889b.m8066a(C3161d.this.f7422e, intent, (C2889b.C2890a) null);
                    }
                }
            }
        });
        this.f7418a.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            }
        });
        this.f7423f.setClickable(false);
        this.f7424g.setClickable(false);
        this.f7423f.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
        this.f7424g.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
    }

    /* renamed from: a */
    public void mo18797a(WebView webView) {
        try {
            if (this.f7423f != null) {
                if (webView.canGoBack()) {
                    this.f7423f.setClickable(true);
                    this.f7423f.clearColorFilter();
                } else {
                    this.f7423f.setClickable(false);
                    this.f7423f.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                }
            }
            if (this.f7424g == null) {
                return;
            }
            if (webView.canGoForward()) {
                this.f7424g.setClickable(true);
                this.f7424g.clearColorFilter();
                return;
            }
            this.f7424g.setClickable(false);
            this.f7424g.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo18796a() {
        if (this.f7418a.getAlpha() == 0.0f) {
            ObjectAnimator.ofFloat(this.f7418a, "alpha", new float[]{0.0f, 1.0f}).setDuration(300).start();
        }
    }

    /* renamed from: b */
    public void mo18798b() {
        if (this.f7418a.getAlpha() == 1.0f) {
            ObjectAnimator.ofFloat(this.f7418a, "alpha", new float[]{1.0f, 0.0f}).setDuration(300).start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9150a(String str) {
        WebBackForwardList copyBackForwardList;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!(this.f7419b.getWebView() == null || (copyBackForwardList = this.f7419b.getWebView().copyBackForwardList()) == null)) {
                int currentIndex = copyBackForwardList.getCurrentIndex();
                String url = copyBackForwardList.getItemAtIndex(currentIndex).getUrl();
                if (TextUtils.isEmpty(url)) {
                    url = this.f7419b.getUrl();
                }
                String str2 = "";
                if (str.equals("backward")) {
                    str2 = copyBackForwardList.getItemAtIndex(currentIndex - 1).getUrl();
                }
                int i = 1;
                if (str.equals("forward")) {
                    str2 = copyBackForwardList.getItemAtIndex(currentIndex + 1).getUrl();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("url", url);
                jSONObject2.putOpt("next_url", str2);
                if (copyBackForwardList.getCurrentIndex() != 0) {
                    i = 0;
                }
                jSONObject2.putOpt("first_page", Integer.valueOf(i));
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            }
        } catch (Exception unused) {
        }
        C3090e.m8923c(C3513m.m10963a(), this.f7420c, this.f7421d, str, jSONObject);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m9153b(String str) {
        WebBackForwardList copyBackForwardList;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!(this.f7419b.getWebView() == null || (copyBackForwardList = this.f7419b.getWebView().copyBackForwardList()) == null)) {
                String url = copyBackForwardList.getItemAtIndex(copyBackForwardList.getCurrentIndex()).getUrl();
                if (TextUtils.isEmpty(url)) {
                    url = this.f7419b.getUrl();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("url", url);
                jSONObject2.putOpt("first_page", Integer.valueOf(copyBackForwardList.getCurrentIndex() == 0 ? 1 : 0));
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            }
        } catch (Exception unused) {
        }
        C3090e.m8923c(C3513m.m10963a(), this.f7420c, this.f7421d, str, jSONObject);
    }
}
