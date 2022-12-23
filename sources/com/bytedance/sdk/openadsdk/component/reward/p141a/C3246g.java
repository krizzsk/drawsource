package com.bytedance.sdk.openadsdk.component.reward.p141a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.p108d.C2828j;
import com.bytedance.sdk.component.p108d.C2832n;
import com.bytedance.sdk.component.p108d.C2838t;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p144b.C3365e;
import com.bytedance.sdk.openadsdk.core.p144b.C3367g;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.p154j.C3473a;
import com.bytedance.sdk.openadsdk.core.p154j.C3491c;
import com.bytedance.sdk.openadsdk.p128b.C3090e;
import com.bytedance.sdk.openadsdk.p165d.C3707a;
import com.bytedance.sdk.openadsdk.p178l.C3904y;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.a.g */
/* compiled from: VastEndCardManager */
public class C3246g {

    /* renamed from: a */
    private final Activity f7687a;

    /* renamed from: b */
    private C3431n f7688b;

    /* renamed from: c */
    private FrameLayout f7689c;

    /* renamed from: d */
    private SSWebView f7690d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ImageView f7691e;

    /* renamed from: f */
    private boolean f7692f;

    /* renamed from: g */
    private C3367g f7693g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C3232e f7694h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f7695i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f7696j;

    public C3246g(Activity activity) {
        this.f7687a = activity;
    }

    /* renamed from: a */
    public void mo19060a(C3431n nVar) {
        C3491c c;
        Activity activity = this.f7687a;
        if (activity != null) {
            this.f7688b = nVar;
            this.f7689c = (FrameLayout) activity.findViewById(C2914t.m8158e(activity, "tt_reward_full_endcard_vast"));
            if (this.f7688b.mo19590ax() != null && (c = this.f7688b.mo19590ax().mo19895c()) != null) {
                if (c.mo19939e() != null) {
                    this.f7692f = true;
                    Activity activity2 = this.f7687a;
                    this.f7691e = (ImageView) activity2.findViewById(C2914t.m8158e(activity2, "tt_reward_full_endcard_vast_image"));
                    m9552a(c.mo19935b(), c.mo19937c(), this.f7688b.mo19590ax());
                    C3707a.m12123a(c.mo19939e()).mo17638a(C2838t.BITMAP).mo17633a((C2832n) new C2832n<Bitmap>() {
                        /* renamed from: a */
                        public void mo17179a(C2828j<Bitmap> jVar) {
                            if (C3246g.this.f7691e != null && jVar != null) {
                                Bitmap b = jVar.mo17647b();
                                if (b == null) {
                                    C3246g.this.m9551a(-1);
                                    return;
                                }
                                C3246g.this.f7691e.setImageBitmap(b);
                                boolean unused = C3246g.this.f7696j = true;
                            }
                        }

                        /* renamed from: a */
                        public void mo17178a(int i, String str, Throwable th) {
                            if (C3246g.this.f7691e != null) {
                                C3246g.this.f7691e.setVisibility(8);
                            }
                            C3246g.this.m9551a(-2);
                        }
                    });
                    return;
                }
                Activity activity3 = this.f7687a;
                this.f7690d = (SSWebView) activity3.findViewById(C2914t.m8158e(activity3, "tt_reward_full_endcard_vast_web"));
                m9557b();
                String d = c.mo19938d();
                if (d != null) {
                    this.f7692f = true;
                    if (d.startsWith("http")) {
                        this.f7690d.mo17835a(d);
                        return;
                    }
                    this.f7690d.setDefaultTextEncodingName("UTF -8");
                    this.f7690d.mo17837a((String) null, d, "text/html", "UTF-8", (String) null);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9551a(int i) {
        m9553a(i, (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9553a(int i, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reason_code", i);
            if (str != null) {
                jSONObject.put("url", str);
            }
            String str2 = "";
            if (this.f7688b.mo19590ax() != null) {
                str2 = this.f7688b.mo19590ax().mo19907k();
            }
            C3090e.m8919b(C3513m.m10963a(), this.f7688b, str2, "load_vast_endcard_fail", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private void m9557b() {
        this.f7690d.setWebViewClient(new SSWebView.C2926a() {
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                if (webResourceRequest != null && webResourceRequest.isForMainFrame() && !C3246g.this.f7695i && webResourceError != null) {
                    String str = null;
                    if (webResourceRequest.getUrl() != null) {
                        str = webResourceRequest.getUrl().toString();
                    }
                    C3246g.this.m9553a(webResourceError.getErrorCode(), str);
                    boolean unused = C3246g.this.f7695i = true;
                }
            }

            public void onReceivedError(WebView webView, int i, String str, String str2) {
                super.onReceivedError(webView, i, str, str2);
                if (Build.VERSION.SDK_INT < 23 && !C3246g.this.f7695i) {
                    C3246g.this.m9553a(i, str2);
                    boolean unused = C3246g.this.f7695i = true;
                }
            }
        });
    }

    /* renamed from: a */
    private void m9552a(int i, int i2, final C3473a aVar) {
        Activity activity;
        if (i != 0 && i2 != 0 && this.f7691e != null && (activity = this.f7687a) != null) {
            int c = C3904y.m12877c((Context) activity);
            int d = C3904y.m12881d((Context) this.f7687a);
            float f = ((float) i) / ((float) i2);
            float f2 = (float) c;
            if (f <= f2 / ((float) d)) {
                c = (int) Math.ceil((double) (f2 * f));
            } else {
                d = (int) Math.ceil((double) (f2 / f));
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f7691e.getLayoutParams();
            layoutParams.width = c;
            layoutParams.height = d;
            this.f7691e.setLayoutParams(layoutParams);
            C32493 r4 = new C3367g("VAST_END_CARD", aVar) {
                /* renamed from: a */
                public void mo19064a() {
                    if (aVar.mo19895c() != null) {
                        aVar.mo19895c().mo19933a(C3246g.this.f7694h != null ? C3246g.this.f7694h.mo18999s() : -1);
                    }
                }
            };
            this.f7693g = r4;
            this.f7691e.setOnClickListener(r4);
            this.f7691e.setOnTouchListener(this.f7693g);
        }
    }

    /* renamed from: a */
    public void mo19058a() {
        C3904y.m12853a((View) this.f7689c, 8);
    }

    /* renamed from: a */
    public boolean mo19061a(C3232e eVar) {
        C3491c c;
        if (!this.f7692f) {
            return false;
        }
        this.f7694h = eVar;
        ImageView imageView = this.f7691e;
        if (imageView == null || !this.f7696j) {
            SSWebView sSWebView = this.f7690d;
            if (sSWebView != null) {
                sSWebView.setVisibility(0);
            }
        } else {
            imageView.setVisibility(0);
        }
        C3904y.m12853a((View) this.f7689c, 0);
        C3431n nVar = this.f7688b;
        if (nVar == null || nVar.mo19590ax() == null || (c = this.f7688b.mo19590ax().mo19895c()) == null) {
            return true;
        }
        C3232e eVar2 = this.f7694h;
        c.mo19936b(eVar2 != null ? eVar2.mo18999s() : -1);
        return true;
    }

    /* renamed from: a */
    public void mo19059a(C3365e eVar) {
        C3367g gVar = this.f7693g;
        if (gVar != null) {
            gVar.mo19327a(eVar);
        }
    }
}
