package com.adcolony.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.adcolony.sdk.b */
class C0739b extends Activity {

    /* renamed from: a */
    C0761c f279a;

    /* renamed from: b */
    int f280b = -1;

    /* renamed from: c */
    int f281c;

    /* renamed from: d */
    boolean f282d;

    /* renamed from: e */
    boolean f283e;

    /* renamed from: f */
    boolean f284f;

    /* renamed from: g */
    boolean f285g;

    /* renamed from: h */
    boolean f286h;

    /* renamed from: i */
    boolean f287i;

    /* renamed from: com.adcolony.sdk.b$a */
    class C0740a implements C0865j0 {
        C0740a() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0739b.this.mo10477a(h0Var);
        }
    }

    C0739b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10558a(boolean z) {
        Iterator<Map.Entry<Integer, C0728a1>> it = this.f279a.mo10655m().entrySet().iterator();
        while (it.hasNext() && !isFinishing()) {
            C0728a1 a1Var = (C0728a1) it.next().getValue();
            if (!a1Var.mo10537f() && a1Var.mo10533b().isPlaying()) {
                a1Var.mo10538h();
            }
        }
        AdColonyInterstitial j = C0723a.m193b().mo10901j();
        if (j != null && j.mo10454i() && j.mo10446e().mo11005c() != null && z && this.f286h) {
            j.mo10446e().mo11002a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10559b(boolean z) {
        for (Map.Entry<Integer, C0728a1> value : this.f279a.mo10655m().entrySet()) {
            C0728a1 a1Var = (C0728a1) value.getValue();
            if (!a1Var.mo10537f() && !a1Var.mo10533b().isPlaying() && !C0723a.m193b().mo10906o().mo11080b()) {
                a1Var.mo10539i();
            }
        }
        AdColonyInterstitial j = C0723a.m193b().mo10901j();
        if (j != null && j.mo10454i() && j.mo10446e().mo11005c() != null) {
            if ((!z || !this.f286h) && this.f287i) {
                j.mo10446e().mo11002a(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
            }
        }
    }

    public void onBackPressed() {
        C0832f1 b = C0773c0.m379b();
        C0773c0.m376a(b, "id", this.f279a.mo10625a());
        new C0850h0("AdSession.on_back_button", this.f279a.mo10653k(), b).mo10838c();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this instanceof AdColonyInterstitialActivity) {
            mo10556a();
        } else {
            ((AdColonyAdViewActivity) this).mo10360c();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!C0723a.m196d() || C0723a.m193b().mo10903l() == null) {
            finish();
            return;
        }
        C0866k b = C0723a.m193b();
        this.f284f = false;
        C0761c l = b.mo10903l();
        this.f279a = l;
        l.mo10639d(false);
        if (C1047z0.m1275g()) {
            this.f279a.mo10639d(true);
        }
        this.f279a.mo10625a();
        this.f281c = this.f279a.mo10653k();
        boolean multiWindowEnabled = b.mo10912u().getMultiWindowEnabled();
        this.f285g = multiWindowEnabled;
        if (multiWindowEnabled) {
            getWindow().addFlags(2048);
            getWindow().clearFlags(1024);
        } else {
            getWindow().addFlags(1024);
            getWindow().clearFlags(2048);
        }
        requestWindowFeature(1);
        getWindow().getDecorView().setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        if (b.mo10912u().getKeepScreenOn()) {
            getWindow().addFlags(128);
        }
        ViewParent parent = this.f279a.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(this.f279a);
        }
        setContentView(this.f279a);
        this.f279a.mo10649i().add(C0723a.m187a("AdSession.finish_fullscreen_ad", (C0865j0) new C0740a(), true));
        this.f279a.mo10651j().add("AdSession.finish_fullscreen_ad");
        mo10557a(this.f280b);
        if (!this.f279a.mo10657o()) {
            C0832f1 b2 = C0773c0.m379b();
            C0773c0.m376a(b2, "id", this.f279a.mo10625a());
            C0773c0.m383b(b2, "screen_width", this.f279a.mo10637d());
            C0773c0.m383b(b2, "screen_height", this.f279a.mo10631b());
            new C0850h0("AdSession.on_fullscreen_ad_started", this.f279a.mo10653k(), b2).mo10838c();
            this.f279a.mo10641e(true);
            return;
        }
        mo10556a();
    }

    public void onDestroy() {
        super.onDestroy();
        if (C0723a.m196d() && this.f279a != null && !this.f282d) {
            if ((Build.VERSION.SDK_INT < 24 || !C1047z0.m1275g()) && !this.f279a.mo10661q()) {
                C0832f1 b = C0773c0.m379b();
                C0773c0.m376a(b, "id", this.f279a.mo10625a());
                new C0850h0("AdSession.on_error", this.f279a.mo10653k(), b).mo10838c();
                this.f284f = true;
            }
        }
    }

    public void onPause() {
        super.onPause();
        mo10558a(this.f283e);
        this.f283e = false;
    }

    public void onResume() {
        super.onResume();
        mo10556a();
        mo10559b(this.f283e);
        this.f283e = true;
        this.f287i = true;
    }

    public void onWindowFocusChanged(boolean z) {
        if (z && this.f283e) {
            C0723a.m193b().mo10915x().mo11111b(true);
            mo10559b(this.f283e);
            this.f286h = true;
        } else if (!z && this.f283e) {
            C0723a.m193b().mo10915x().mo11109a(true);
            mo10558a(this.f283e);
            this.f286h = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10556a() {
        Rect rect;
        C0866k b = C0723a.m193b();
        if (this.f279a == null) {
            this.f279a = b.mo10903l();
        }
        C0761c cVar = this.f279a;
        if (cVar != null) {
            cVar.mo10639d(false);
            if (C1047z0.m1275g()) {
                this.f279a.mo10639d(true);
            }
            if (this.f285g) {
                rect = b.mo10905n().mo11063x();
            } else {
                rect = b.mo10905n().mo11062w();
            }
            if (rect.width() > 0 && rect.height() > 0) {
                C0832f1 b2 = C0773c0.m379b();
                C0832f1 b3 = C0773c0.m379b();
                float s = b.mo10905n().mo11058s();
                C0773c0.m383b(b3, "width", (int) (((float) rect.width()) / s));
                C0773c0.m383b(b3, "height", (int) (((float) rect.height()) / s));
                C0773c0.m383b(b3, "app_orientation", C1047z0.m1266d(C1047z0.m1273f()));
                C0773c0.m383b(b3, "x", 0);
                C0773c0.m383b(b3, "y", 0);
                C0773c0.m376a(b3, "ad_session_id", this.f279a.mo10625a());
                C0773c0.m383b(b2, "screen_width", rect.width());
                C0773c0.m383b(b2, "screen_height", rect.height());
                C0773c0.m376a(b2, "ad_session_id", this.f279a.mo10625a());
                C0773c0.m383b(b2, "id", this.f279a.mo10634c());
                this.f279a.setLayoutParams(new FrameLayout.LayoutParams(rect.width(), rect.height()));
                this.f279a.mo10633b(rect.width());
                this.f279a.mo10626a(rect.height());
                new C0850h0("MRAID.on_size_change", this.f279a.mo10653k(), b3).mo10838c();
                new C0850h0("AdContainer.on_orientation_change", this.f279a.mo10653k(), b2).mo10838c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10477a(C0850h0 h0Var) {
        int d = C0773c0.m389d(h0Var.mo10834a(), "status");
        if ((d == 5 || d == 0 || d == 6 || d == 1) && !this.f282d) {
            C0866k b = C0723a.m193b();
            C0953r o = b.mo10906o();
            b.mo10892d(h0Var);
            if (o.mo11078a() != null) {
                o.mo11078a().dismiss();
                o.mo11079a((AlertDialog) null);
            }
            if (!this.f284f) {
                finish();
            }
            this.f282d = true;
            ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            b.mo10895e(false);
            C0832f1 b2 = C0773c0.m379b();
            C0773c0.m376a(b2, "id", this.f279a.mo10625a());
            new C0850h0("AdSession.on_close", this.f279a.mo10653k(), b2).mo10838c();
            b.mo10884a((C0761c) null);
            b.mo10882a((AdColonyInterstitial) null);
            b.mo10879a((AdColonyAdView) null);
            C0723a.m193b().mo10889c().mo10723f().remove(this.f279a.mo10625a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10557a(int i) {
        if (i == 0) {
            setRequestedOrientation(7);
        } else if (i != 1) {
            setRequestedOrientation(4);
        } else {
            setRequestedOrientation(6);
        }
        this.f280b = i;
    }
}
