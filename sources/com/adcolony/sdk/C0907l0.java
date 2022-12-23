package com.adcolony.sdk;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsoluteLayout;
import android.widget.ImageView;
import com.adcolony.sdk.C0774c1;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.iab.omid.library.adcolony.adsession.FriendlyObstructionPurpose;
import java.io.File;
import kotlin.Unit;
import kotlin.text.Regex;
import kotlin.text.Typography;

/* renamed from: com.adcolony.sdk.l0 */
public final class C0907l0 extends C0774c1 {

    /* renamed from: F */
    private final int f625F;

    /* renamed from: G */
    private ImageView f626G;

    /* renamed from: H */
    private String f627H = "";
    /* access modifiers changed from: private */

    /* renamed from: I */
    public String f628I = "";

    /* renamed from: J */
    private int f629J;

    /* renamed from: K */
    private int f630K;

    /* renamed from: L */
    private boolean f631L;

    /* renamed from: M */
    private boolean f632M;

    /* renamed from: com.adcolony.sdk.l0$a */
    private final class C0908a extends C0774c1.C0777c {
        public C0908a() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            new C0913f().mo10942a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: com.adcolony.sdk.l0$b */
    private final class C0909b extends C0774c1.C0778d {
        public C0909b() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            new C0913f().mo10942a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: com.adcolony.sdk.l0$c */
    private final class C0910c extends C0774c1.C0779e {
        public C0910c() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            new C0913f().mo10942a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: com.adcolony.sdk.l0$d */
    private final class C0911d extends C0774c1.C0780f {
        public C0911d() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            new C0913f().mo10942a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: com.adcolony.sdk.l0$e */
    private final class C0912e extends C0774c1.C0781g {
        public C0912e() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            new C0913f().mo10942a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: com.adcolony.sdk.l0$f */
    private final class C0913f {
        public C0913f() {
        }

        /* renamed from: a */
        public final void mo10942a() {
            if (!C0907l0.this.getModuleInitialized()) {
                float s = C0723a.m193b().mo10905n().mo11058s();
                C0832f1 info = C0907l0.this.getInfo();
                C0907l0 l0Var = C0907l0.this;
                C0773c0.m383b(info, "app_orientation", C1047z0.m1266d(C1047z0.m1273f()));
                C0773c0.m383b(info, "x", C1047z0.m1230a((View) l0Var));
                C0773c0.m383b(info, "y", C1047z0.m1249b((View) l0Var));
                C0773c0.m383b(info, "width", (int) (((float) l0Var.getCurrentWidth()) / s));
                C0773c0.m383b(info, "height", (int) (((float) l0Var.getCurrentHeight()) / s));
                C0773c0.m376a(info, "ad_session_id", l0Var.getAdSessionId());
            }
        }
    }

    /* renamed from: com.adcolony.sdk.l0$g */
    static final class C0914g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C0907l0 f639a;

        C0914g(C0907l0 l0Var) {
            this.f639a = l0Var;
        }

        public final void onClick(View view) {
            C1047z0.m1240a(new Intent("android.intent.action.VIEW", Uri.parse(this.f639a.f628I)));
            C0723a.m193b().mo10863A().mo11184c(this.f639a.getAdSessionId());
        }
    }

    public C0907l0(Context context, int i, C0850h0 h0Var, int i2) {
        super(context, i, h0Var);
        this.f625F = i2;
    }

    /* renamed from: q */
    private final void m806q() {
        Context a = C0723a.m186a();
        if (a != null && getParentContainer() != null && !this.f632M) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-1);
            gradientDrawable.setShape(1);
            ImageView imageView = new ImageView(a);
            imageView.setImageURI(Uri.fromFile(new File(this.f627H)));
            imageView.setBackground(gradientDrawable);
            imageView.setOnClickListener(new C0914g(this));
            Unit unit = Unit.INSTANCE;
            this.f626G = imageView;
            m807r();
            addView(this.f626G);
        }
    }

    /* renamed from: r */
    private final void m807r() {
        ImageView imageView = this.f626G;
        if (imageView != null) {
            Rect w = C0723a.m193b().mo10905n().mo11062w();
            int currentX = this.f631L ? getCurrentX() + getCurrentWidth() : w.width();
            int currentY = this.f631L ? getCurrentY() + getCurrentHeight() : w.height();
            float s = C0723a.m193b().mo10905n().mo11058s();
            int i = (int) (((float) this.f629J) * s);
            int i2 = (int) (((float) this.f630K) * s);
            imageView.setLayoutParams(new AbsoluteLayout.LayoutParams(i, i2, currentX - i, currentY - i2));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public /* synthetic */ void mo10568e() {
        super.mo10568e();
        boolean z = true;
        if (this.f627H.length() > 0) {
            if (this.f628I.length() <= 0) {
                z = false;
            }
            if (z) {
                m806q();
            }
        }
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ int getAdc3ModuleId() {
        return this.f625F;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi21() {
        return new C0909b();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi23() {
        return new C0910c();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi24() {
        return new C0911d();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi26() {
        return new C0912e();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientDefault() {
        return new C0908a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public /* synthetic */ void mo10597k() {
        if (getMraidFilepath().length() > 0) {
            Regex regex = new Regex("script\\s*src\\s*=\\s*\"mraid.js\"");
            setMUrl(mo10665a(regex.replaceFirst(getMUrl(), "script src=\"file://" + getMraidFilepath() + Typography.quote), C0773c0.m393h(C0773c0.m391f(getInfo(), DeviceRequestsHelper.DEVICE_INFO_PARAM), "iab_filepath")));
        }
    }

    /* renamed from: p */
    public final void mo10941p() {
        C0761c parentContainer;
        ImageView imageView = this.f626G;
        if (imageView != null && (parentContainer = getParentContainer()) != null) {
            parentContainer.mo10628a((View) imageView, FriendlyObstructionPurpose.OTHER);
        }
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ void setBounds(C0850h0 h0Var) {
        super.setBounds(h0Var);
        m807r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public /* synthetic */ void mo10564a(C0850h0 h0Var, int i, C0761c cVar) {
        C0832f1 a = h0Var.mo10834a();
        this.f627H = C0773c0.m393h(a, "ad_choices_filepath");
        this.f628I = C0773c0.m393h(a, "ad_choices_url");
        this.f629J = C0773c0.m389d(a, "ad_choices_width");
        this.f630K = C0773c0.m389d(a, "ad_choices_height");
        this.f631L = C0773c0.m382b(a, "ad_choices_snap_to_webview");
        this.f632M = C0773c0.m382b(a, "disable_ad_choices");
        super.mo10564a(h0Var, i, cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public /* synthetic */ boolean mo10566a(C0832f1 f1Var, String str) {
        if (super.mo10566a(f1Var, str)) {
            return true;
        }
        setEnableMessages(false);
        return true;
    }
}
