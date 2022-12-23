package com.adcolony.sdk;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.adcolony.sdk.C0826e0;
import com.iab.omid.library.adcolony.adsession.FriendlyObstructionPurpose;
import java.io.File;

public class AdColonyAdView extends FrameLayout {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C0761c f117a;

    /* renamed from: b */
    private AdColonyAdViewListener f118b;

    /* renamed from: c */
    private AdColonyAdSize f119c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f120d;

    /* renamed from: e */
    private String f121e;

    /* renamed from: f */
    private String f122f;

    /* renamed from: g */
    private String f123g;

    /* renamed from: h */
    private ImageView f124h;

    /* renamed from: i */
    private C0939p0 f125i;

    /* renamed from: j */
    private C0850h0 f126j;

    /* renamed from: k */
    private boolean f127k;

    /* renamed from: l */
    private boolean f128l;

    /* renamed from: m */
    private boolean f129m;

    /* renamed from: n */
    private boolean f130n;

    /* renamed from: o */
    private boolean f131o;

    /* renamed from: p */
    private boolean f132p = true;

    /* renamed from: q */
    private int f133q;

    /* renamed from: r */
    private int f134r;

    /* renamed from: s */
    private int f135s;

    /* renamed from: t */
    private int f136t;

    /* renamed from: u */
    private int f137u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public C0714c f138v;

    /* renamed from: com.adcolony.sdk.AdColonyAdView$a */
    class C0712a implements Runnable {
        C0712a() {
        }

        public void run() {
            Context a = C0723a.m186a();
            if (a instanceof AdColonyAdViewActivity) {
                ((AdColonyAdViewActivity) a).mo10359b();
            }
            C0790d c = C0723a.m193b().mo10889c();
            c.mo10707a(AdColonyAdView.this.f120d);
            c.mo10711a(AdColonyAdView.this.f117a);
            C0832f1 b = C0773c0.m379b();
            C0773c0.m376a(b, "id", AdColonyAdView.this.f120d);
            new C0850h0("AdSession.on_ad_view_destroyed", 1, b).mo10838c();
            if (AdColonyAdView.this.f138v != null) {
                AdColonyAdView.this.f138v.mo10358a();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.AdColonyAdView$b */
    class C0713b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Context f140a;

        C0713b(AdColonyAdView adColonyAdView, Context context) {
            this.f140a = context;
        }

        public void onClick(View view) {
            Context context = this.f140a;
            if (context instanceof AdColonyAdViewActivity) {
                ((AdColonyAdViewActivity) context).mo10359b();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.AdColonyAdView$c */
    interface C0714c {
        /* renamed from: a */
        void mo10358a();
    }

    AdColonyAdView(Context context, C0850h0 h0Var, AdColonyAdViewListener adColonyAdViewListener) throws RuntimeException {
        super(context);
        this.f118b = adColonyAdViewListener;
        this.f121e = adColonyAdViewListener.mo10373c();
        C0832f1 a = h0Var.mo10834a();
        this.f120d = C0773c0.m393h(a, "id");
        this.f122f = C0773c0.m393h(a, "close_button_filepath");
        this.f127k = C0773c0.m382b(a, "trusted_demand_source");
        this.f131o = C0773c0.m382b(a, "close_button_snap_to_webview");
        this.f136t = C0773c0.m389d(a, "close_button_width");
        this.f137u = C0773c0.m389d(a, "close_button_height");
        C0761c cVar = C0723a.m193b().mo10889c().mo10718c().get(this.f120d);
        this.f117a = cVar;
        if (cVar != null) {
            this.f119c = adColonyAdViewListener.mo10368a();
            setLayoutParams(new FrameLayout.LayoutParams(this.f117a.mo10637d(), this.f117a.mo10631b()));
            setBackgroundColor(0);
            addView(this.f117a);
            return;
        }
        throw new RuntimeException("AdColonyAdView container cannot be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo10333d() {
        return this.f128l;
    }

    public boolean destroy() {
        if (this.f128l) {
            new C0826e0.C0827a().mo10746a("Ignoring duplicate call to destroy().").mo10747a(C0826e0.f459f);
            return false;
        }
        this.f128l = true;
        C0939p0 p0Var = this.f125i;
        if (!(p0Var == null || p0Var.mo11005c() == null)) {
            this.f125i.mo11004b();
        }
        C1047z0.m1259b((Runnable) new C0712a());
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo10335e() {
        C0742b1 webView = getWebView();
        if (this.f125i != null && webView != null) {
            webView.mo10569f();
        }
    }

    public AdColonyAdSize getAdSize() {
        return this.f119c;
    }

    /* access modifiers changed from: package-private */
    public String getClickOverride() {
        return this.f123g;
    }

    /* access modifiers changed from: package-private */
    public C0761c getContainer() {
        return this.f117a;
    }

    public AdColonyAdViewListener getListener() {
        return this.f118b;
    }

    /* access modifiers changed from: package-private */
    public C0939p0 getOmidManager() {
        return this.f125i;
    }

    /* access modifiers changed from: package-private */
    public int getOrientation() {
        return this.f133q;
    }

    /* access modifiers changed from: package-private */
    public boolean getTrustedDemandSource() {
        return this.f127k;
    }

    /* access modifiers changed from: package-private */
    public C0742b1 getWebView() {
        C0761c cVar = this.f117a;
        if (cVar == null) {
            return null;
        }
        return cVar.mo10656n().get(2);
    }

    public String getZoneId() {
        return this.f121e;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f132p && !this.f128l) {
            this.f132p = false;
            AdColonyAdViewListener adColonyAdViewListener = this.f118b;
            if (adColonyAdViewListener != null) {
                adColonyAdViewListener.onShow(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setClickOverride(String str) {
        this.f123g = str;
    }

    /* access modifiers changed from: package-private */
    public void setExpandMessage(C0850h0 h0Var) {
        this.f126j = h0Var;
    }

    /* access modifiers changed from: package-private */
    public void setExpandedHeight(int i) {
        this.f135s = (int) (((float) i) * C0723a.m193b().mo10905n().mo11058s());
    }

    /* access modifiers changed from: package-private */
    public void setExpandedWidth(int i) {
        this.f134r = (int) (((float) i) * C0723a.m193b().mo10905n().mo11058s());
    }

    public void setListener(AdColonyAdViewListener adColonyAdViewListener) {
        this.f118b = adColonyAdViewListener;
    }

    /* access modifiers changed from: package-private */
    public void setNoCloseButton(boolean z) {
        this.f129m = this.f127k && z;
    }

    /* access modifiers changed from: package-private */
    public void setOmidManager(C0939p0 p0Var) {
        this.f125i = p0Var;
    }

    /* access modifiers changed from: package-private */
    public void setOnDestroyListenerOrCall(C0714c cVar) {
        if (this.f128l) {
            cVar.mo10358a();
        } else {
            this.f138v = cVar;
        }
    }

    /* access modifiers changed from: package-private */
    public void setOrientation(int i) {
        this.f133q = i;
    }

    /* access modifiers changed from: package-private */
    public void setUserInteraction(boolean z) {
        this.f130n = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10330a() {
        if (this.f127k || this.f130n) {
            float s = C0723a.m193b().mo10905n().mo11058s();
            this.f117a.setLayoutParams(new FrameLayout.LayoutParams((int) (((float) this.f119c.getWidth()) * s), (int) (((float) this.f119c.getHeight()) * s)));
            C0742b1 webView = getWebView();
            if (webView != null) {
                C0850h0 h0Var = new C0850h0("WebView.set_bounds", 0);
                C0832f1 b = C0773c0.m379b();
                C0773c0.m383b(b, "x", webView.getInitialX());
                C0773c0.m383b(b, "y", webView.getInitialY());
                C0773c0.m383b(b, "width", webView.getInitialWidth());
                C0773c0.m383b(b, "height", webView.getInitialHeight());
                h0Var.mo10837b(b);
                webView.mo10563a(h0Var);
                C0832f1 b2 = C0773c0.m379b();
                C0773c0.m376a(b2, "ad_session_id", this.f120d);
                new C0850h0("MRAID.on_close", this.f117a.mo10653k(), b2).mo10838c();
            }
            ImageView imageView = this.f124h;
            if (imageView != null) {
                this.f117a.removeView(imageView);
                this.f117a.mo10627a((View) this.f124h);
            }
            addView(this.f117a);
            AdColonyAdViewListener adColonyAdViewListener = this.f118b;
            if (adColonyAdViewListener != null) {
                adColonyAdViewListener.onClosed(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo10331b() {
        int i;
        if (this.f127k || this.f130n) {
            C0943q n = C0723a.m193b().mo10905n();
            Rect w = n.mo11062w();
            int i2 = this.f134r;
            if (i2 <= 0) {
                i2 = w.width();
            }
            int i3 = this.f135s;
            if (i3 <= 0) {
                i3 = w.height();
            }
            int width = (w.width() - i2) / 2;
            int height = (w.height() - i3) / 2;
            this.f117a.setLayoutParams(new FrameLayout.LayoutParams(w.width(), w.height()));
            C0742b1 webView = getWebView();
            if (webView != null) {
                C0850h0 h0Var = new C0850h0("WebView.set_bounds", 0);
                C0832f1 b = C0773c0.m379b();
                C0773c0.m383b(b, "x", width);
                C0773c0.m383b(b, "y", height);
                C0773c0.m383b(b, "width", i2);
                C0773c0.m383b(b, "height", i3);
                h0Var.mo10837b(b);
                webView.mo10563a(h0Var);
                float s = n.mo11058s();
                C0832f1 b2 = C0773c0.m379b();
                C0773c0.m383b(b2, "app_orientation", C1047z0.m1266d(C1047z0.m1273f()));
                C0773c0.m383b(b2, "width", (int) (((float) i2) / s));
                C0773c0.m383b(b2, "height", (int) (((float) i3) / s));
                C0773c0.m383b(b2, "x", C1047z0.m1230a((View) webView));
                C0773c0.m383b(b2, "y", C1047z0.m1249b((View) webView));
                C0773c0.m376a(b2, "ad_session_id", this.f120d);
                new C0850h0("MRAID.on_size_change", this.f117a.mo10653k(), b2).mo10838c();
            }
            ImageView imageView = this.f124h;
            if (imageView != null) {
                this.f117a.removeView(imageView);
            }
            Context a = C0723a.m186a();
            if (!(a == null || this.f129m || webView == null)) {
                float s2 = C0723a.m193b().mo10905n().mo11058s();
                int i4 = (int) (((float) this.f136t) * s2);
                int i5 = (int) (((float) this.f137u) * s2);
                if (this.f131o) {
                    i = webView.getCurrentX() + webView.getCurrentWidth();
                } else {
                    i = w.width();
                }
                int currentY = this.f131o ? webView.getCurrentY() : 0;
                ImageView imageView2 = new ImageView(a.getApplicationContext());
                this.f124h = imageView2;
                imageView2.setImageURI(Uri.fromFile(new File(this.f122f)));
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i5);
                layoutParams.setMargins(i - i4, currentY, 0, 0);
                this.f124h.setOnClickListener(new C0713b(this, a));
                this.f117a.addView(this.f124h, layoutParams);
                this.f117a.mo10628a((View) this.f124h, FriendlyObstructionPurpose.CLOSE_AD);
            }
            if (this.f126j != null) {
                C0832f1 b3 = C0773c0.m379b();
                C0773c0.m385b(b3, "success", true);
                this.f126j.mo10835a(b3).mo10838c();
                this.f126j = null;
            }
            return true;
        }
        if (this.f126j != null) {
            C0832f1 b4 = C0773c0.m379b();
            C0773c0.m385b(b4, "success", false);
            this.f126j.mo10835a(b4).mo10838c();
            this.f126j = null;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo10332c() {
        return this.f130n;
    }
}
