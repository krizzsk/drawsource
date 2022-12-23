package com.adcolony.sdk;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.webkit.WebView;
import com.adcolony.sdk.C0826e0;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.adcolony.sdk.d */
class C0790d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public ConcurrentHashMap<String, Runnable> f398a;

    /* renamed from: b */
    private HashMap<String, C0761c> f399b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ConcurrentHashMap<String, AdColonyInterstitial> f400c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ConcurrentHashMap<String, AdColonyAdViewListener> f401d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ConcurrentHashMap<String, AdColonyAdViewListener> f402e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Map<String, AdColonyAdView> f403f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Object f404g = new Object();

    /* renamed from: com.adcolony.sdk.d$a */
    class C0791a implements C0865j0 {
        C0791a() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0790d.this.mo10722e(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$b */
    class C0792b implements C0865j0 {

        /* renamed from: com.adcolony.sdk.d$b$a */
        class C0793a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0850h0 f407a;

            C0793a(C0850h0 h0Var) {
                this.f407a = h0Var;
            }

            public void run() {
                AdColonyInterstitial adColonyInterstitial = (AdColonyInterstitial) C0790d.this.f400c.get(C0773c0.m393h(this.f407a.mo10834a(), "id"));
                if (adColonyInterstitial != null && adColonyInterstitial.getListener() != null) {
                    adColonyInterstitial.getListener().onAudioStopped(adColonyInterstitial);
                }
            }
        }

        C0792b() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C1047z0.m1259b((Runnable) new C0793a(h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.d$c */
    class C0794c implements C0865j0 {

        /* renamed from: com.adcolony.sdk.d$c$a */
        class C0795a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0850h0 f410a;

            C0795a(C0850h0 h0Var) {
                this.f410a = h0Var;
            }

            public void run() {
                AdColonyInterstitial adColonyInterstitial = (AdColonyInterstitial) C0790d.this.f400c.get(C0773c0.m393h(this.f410a.mo10834a(), "id"));
                if (adColonyInterstitial != null && adColonyInterstitial.getListener() != null) {
                    adColonyInterstitial.getListener().onAudioStarted(adColonyInterstitial);
                }
            }
        }

        C0794c() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C1047z0.m1259b((Runnable) new C0795a(h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.d$d */
    class C0796d implements C0865j0 {
        C0796d() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0790d.this.mo10727i(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$e */
    class C0797e implements C0865j0 {
        C0797e() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0790d.this.mo10726h(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$f */
    class C0798f implements C0865j0 {
        C0798f() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            boolean unused = C0790d.this.m450g(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$g */
    class C0799g implements C0865j0 {
        C0799g(C0790d dVar) {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0832f1 b = C0773c0.m379b();
            C0773c0.m385b(b, "success", true);
            h0Var.mo10835a(b).mo10838c();
        }
    }

    /* renamed from: com.adcolony.sdk.d$h */
    class C0800h implements C0865j0 {

        /* renamed from: com.adcolony.sdk.d$h$a */
        class C0801a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0850h0 f415a;

            C0801a(C0800h hVar, C0850h0 h0Var) {
                this.f415a = h0Var;
            }

            public void run() {
                C0850h0 h0Var = this.f415a;
                h0Var.mo10835a(h0Var.mo10834a()).mo10838c();
            }
        }

        C0800h(C0790d dVar) {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C1047z0.m1259b((Runnable) new C0801a(this, h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.d$i */
    class C0802i implements C0865j0 {
        C0802i(C0790d dVar) {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0934o0.m895c().mo10989a(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$j */
    class C0803j implements Runnable {
        C0803j(C0790d dVar) {
        }

        public void run() {
            C0953r o = C0723a.m193b().mo10906o();
            if (o.mo11078a() != null) {
                o.mo11078a().dismiss();
                o.mo11079a((AlertDialog) null);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.d$k */
    class C0804k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f416a;

        /* renamed from: b */
        final /* synthetic */ C0850h0 f417b;

        /* renamed from: c */
        final /* synthetic */ AdColonyAdViewListener f418c;

        /* renamed from: d */
        final /* synthetic */ String f419d;

        C0804k(Context context, C0850h0 h0Var, AdColonyAdViewListener adColonyAdViewListener, String str) {
            this.f416a = context;
            this.f417b = h0Var;
            this.f418c = adColonyAdViewListener;
            this.f419d = str;
        }

        public void run() {
            AdColonyAdView adColonyAdView;
            try {
                adColonyAdView = new AdColonyAdView(this.f416a, this.f417b, this.f418c);
            } catch (RuntimeException e) {
                new C0826e0.C0827a().mo10746a(e.toString()).mo10747a(C0826e0.f462i);
                adColonyAdView = null;
            }
            synchronized (C0790d.this.f404g) {
                if (C0790d.this.f402e.remove(this.f419d) != null) {
                    if (adColonyAdView == null) {
                        C0790d.this.m434a(this.f418c);
                        return;
                    }
                    C0790d.this.f403f.put(this.f419d, adColonyAdView);
                    adColonyAdView.setOmidManager(this.f418c.mo10372b());
                    adColonyAdView.mo10335e();
                    this.f418c.mo10370a((C0939p0) null);
                    this.f418c.onRequestFilled(adColonyAdView);
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.d$l */
    class C0805l implements C0865j0 {

        /* renamed from: com.adcolony.sdk.d$l$a */
        class C0806a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0850h0 f422a;

            C0806a(C0850h0 h0Var) {
                this.f422a = h0Var;
            }

            public void run() {
                C0790d.this.mo10719c(this.f422a);
            }
        }

        C0805l() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C1047z0.m1259b((Runnable) new C0806a(h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.d$m */
    class C0807m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0850h0 f424a;

        /* renamed from: b */
        final /* synthetic */ AdColonyInterstitial f425b;

        /* renamed from: c */
        final /* synthetic */ AdColonyInterstitialListener f426c;

        C0807m(C0790d dVar, C0850h0 h0Var, AdColonyInterstitial adColonyInterstitial, AdColonyInterstitialListener adColonyInterstitialListener) {
            this.f424a = h0Var;
            this.f425b = adColonyInterstitial;
            this.f426c = adColonyInterstitialListener;
        }

        public void run() {
            C0832f1 a = this.f424a.mo10834a();
            if (this.f425b.mo10446e() == null) {
                this.f425b.mo10433a(C0773c0.m391f(a, "iab"));
            }
            this.f425b.mo10434a(C0773c0.m393h(a, "ad_id"));
            this.f425b.mo10441c(C0773c0.m393h(a, CampaignEx.JSON_KEY_CREATIVE_ID));
            this.f425b.setViewNetworkPassFilter(C0773c0.m393h(a, "view_network_pass_filter"));
            C0939p0 e = this.f425b.mo10446e();
            if (!(e == null || e.mo11006d() == 2)) {
                try {
                    e.mo10999a();
                } catch (IllegalArgumentException unused) {
                    new C0826e0.C0827a().mo10746a("IllegalArgumentException when creating omid session").mo10747a(C0826e0.f462i);
                }
            }
            this.f426c.onRequestFilled(this.f425b);
        }
    }

    /* renamed from: com.adcolony.sdk.d$n */
    class C0808n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdColonyAdViewListener f427a;

        C0808n(C0790d dVar, AdColonyAdViewListener adColonyAdViewListener) {
            this.f427a = adColonyAdViewListener;
        }

        public void run() {
            AdColonyAdViewListener adColonyAdViewListener = this.f427a;
            adColonyAdViewListener.onRequestNotFilled(AdColony.m82a(adColonyAdViewListener.mo10373c()));
            if (!C0723a.m195c()) {
                new C0826e0.C0827a().mo10746a("RequestNotFilled called for AdView due to a missing context. ").mo10747a(C0826e0.f462i);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.d$o */
    class C0809o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f428a;

        /* renamed from: b */
        final /* synthetic */ String f429b;

        /* renamed from: c */
        final /* synthetic */ long f430c;

        C0809o(String str, String str2, long j) {
            this.f428a = str;
            this.f429b = str2;
            this.f430c = j;
        }

        public void run() {
            C0790d.this.f398a.remove(this.f428a);
            AdColonyAdViewListener adColonyAdViewListener = (AdColonyAdViewListener) C0790d.this.f401d.remove(this.f428a);
            if (adColonyAdViewListener != null) {
                adColonyAdViewListener.onRequestNotFilled(AdColony.m82a(this.f429b));
                C0832f1 b = C0773c0.m379b();
                C0773c0.m376a(b, "id", this.f428a);
                C0773c0.m376a(b, "zone_id", this.f429b);
                C0773c0.m383b(b, "type", 1);
                C0773c0.m383b(b, "request_fail_reason", 26);
                new C0850h0("AdSession.on_request_failure", 1, b).mo10838c();
                C0826e0.C0827a a = new C0826e0.C0827a().mo10746a("RequestNotFilled called due to a native timeout. ");
                C0826e0.C0827a a2 = a.mo10746a("Timeout set to: " + C0723a.m193b().mo10891d() + " ms. ");
                C0826e0.C0827a a3 = a2.mo10746a("AdView request time allowed: " + this.f430c + " ms. ");
                a3.mo10746a("AdView with adSessionId(" + this.f428a + ") - request failed.").mo10747a(C0826e0.f462i);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.d$p */
    class C0810p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f432a;

        /* renamed from: b */
        final /* synthetic */ String f433b;

        /* renamed from: c */
        final /* synthetic */ long f434c;

        C0810p(String str, String str2, long j) {
            this.f432a = str;
            this.f433b = str2;
            this.f434c = j;
        }

        public void run() {
            AdColonyInterstitialListener adColonyInterstitialListener;
            C0790d.this.f398a.remove(this.f432a);
            AdColonyInterstitial adColonyInterstitial = (AdColonyInterstitial) C0790d.this.f400c.remove(this.f432a);
            if (adColonyInterstitial == null) {
                adColonyInterstitialListener = null;
            } else {
                adColonyInterstitialListener = adColonyInterstitial.getListener();
            }
            if (adColonyInterstitialListener != null) {
                adColonyInterstitialListener.onRequestNotFilled(AdColony.m82a(this.f433b));
                C0832f1 b = C0773c0.m379b();
                C0773c0.m376a(b, "id", this.f432a);
                C0773c0.m376a(b, "zone_id", this.f433b);
                C0773c0.m383b(b, "type", 0);
                C0773c0.m383b(b, "request_fail_reason", 26);
                new C0850h0("AdSession.on_request_failure", 1, b).mo10838c();
                C0826e0.C0827a a = new C0826e0.C0827a().mo10746a("RequestNotFilled called due to a native timeout. ");
                C0826e0.C0827a a2 = a.mo10746a("Timeout set to: " + C0723a.m193b().mo10891d() + " ms. ");
                C0826e0.C0827a a3 = a2.mo10746a("Interstitial request time allowed: " + this.f434c + " ms. ");
                a3.mo10746a("Interstitial with adSessionId(" + this.f432a + ") - request failed.").mo10747a(C0826e0.f462i);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.d$q */
    class C0811q implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdColonyInterstitialListener f436a;

        /* renamed from: b */
        final /* synthetic */ AdColonyInterstitial f437b;

        C0811q(C0790d dVar, AdColonyInterstitialListener adColonyInterstitialListener, AdColonyInterstitial adColonyInterstitial) {
            this.f436a = adColonyInterstitialListener;
            this.f437b = adColonyInterstitial;
        }

        public void run() {
            C0723a.m193b().mo10895e(false);
            this.f436a.onClosed(this.f437b);
        }
    }

    /* renamed from: com.adcolony.sdk.d$r */
    class C0812r implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f438a;

        /* renamed from: b */
        final /* synthetic */ C0742b1 f439b;

        /* renamed from: c */
        final /* synthetic */ C0761c f440c;

        C0812r(String str, C0742b1 b1Var, C0761c cVar) {
            this.f438a = str;
            this.f439b = b1Var;
            this.f440c = cVar;
        }

        public void run() {
            C0939p0 p0Var;
            int i;
            try {
                AdColonyInterstitial adColonyInterstitial = C0790d.this.mo10723f().get(this.f438a);
                AdColonyAdView adColonyAdView = C0790d.this.mo10720d().get(this.f438a);
                if (adColonyInterstitial == null) {
                    p0Var = null;
                } else {
                    p0Var = adColonyInterstitial.mo10446e();
                }
                if (p0Var == null && adColonyAdView != null) {
                    p0Var = adColonyAdView.getOmidManager();
                }
                if (p0Var == null) {
                    i = -1;
                } else {
                    i = p0Var.mo11006d();
                }
                if (p0Var != null && i == 2) {
                    p0Var.mo11000a((WebView) this.f439b);
                    p0Var.mo11001a(this.f440c);
                }
            } catch (IllegalArgumentException unused) {
                new C0826e0.C0827a().mo10746a("IllegalArgumentException when creating omid session").mo10747a(C0826e0.f462i);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.d$s */
    class C0813s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0761c f442a;

        C0813s(C0790d dVar, C0761c cVar) {
            this.f442a = cVar;
        }

        public void run() {
            for (int i = 0; i < this.f442a.mo10649i().size(); i++) {
                C0723a.m194b(this.f442a.mo10651j().get(i), this.f442a.mo10649i().get(i));
            }
            this.f442a.mo10651j().clear();
            this.f442a.mo10649i().clear();
            this.f442a.removeAllViews();
            C0761c cVar = this.f442a;
            cVar.f358z = null;
            cVar.f357y = null;
            for (C0742b1 next : cVar.mo10656n().values()) {
                if (!(next instanceof C0824e)) {
                    if (next instanceof C0774c1) {
                        C0723a.m193b().mo10886a((C0898k0) (C0774c1) next);
                    } else {
                        next.mo10598l();
                    }
                }
            }
            for (C0728a1 next2 : this.f442a.mo10655m().values()) {
                next2.mo10540j();
                next2.mo10541k();
            }
            this.f442a.mo10655m().clear();
            this.f442a.mo10654l().clear();
            this.f442a.mo10656n().clear();
            this.f442a.mo10647h().clear();
            this.f442a.mo10640e().clear();
            this.f442a.mo10643f().clear();
            this.f442a.mo10645g().clear();
            this.f442a.f345m = true;
        }
    }

    /* renamed from: com.adcolony.sdk.d$t */
    class C0814t implements C0865j0 {

        /* renamed from: com.adcolony.sdk.d$t$a */
        class C0815a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0850h0 f444a;

            C0815a(C0850h0 h0Var) {
                this.f444a = h0Var;
            }

            public void run() {
                boolean unused = C0790d.this.m444d(this.f444a);
            }
        }

        C0814t() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C1047z0.m1259b((Runnable) new C0815a(h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.d$u */
    class C0816u implements C0865j0 {
        C0816u() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            boolean unused = C0790d.this.m452k(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$v */
    class C0817v implements C0865j0 {
        C0817v() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            boolean unused = C0790d.this.m451j(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$w */
    class C0818w implements C0865j0 {
        C0818w() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            boolean unused = C0790d.this.m449f(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$x */
    class C0819x implements C0865j0 {
        C0819x() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            boolean unused = C0790d.this.m453l(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$y */
    class C0820y implements C0865j0 {
        C0820y() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0790d.this.mo10717b(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$z */
    class C0821z implements C0865j0 {
        C0821z() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0790d.this.mo10715a(h0Var);
        }
    }

    C0790d() {
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m450g(C0850h0 h0Var) {
        String h = C0773c0.m393h(h0Var.mo10834a(), "id");
        C0832f1 b = C0773c0.m379b();
        C0773c0.m376a(b, "id", h);
        Context a = C0723a.m186a();
        if (a == null) {
            C0773c0.m385b(b, "has_audio", false);
            h0Var.mo10835a(b).mo10838c();
            return false;
        }
        boolean b2 = C1047z0.m1258b(C1047z0.m1232a(a));
        double a2 = C1047z0.m1227a(C1047z0.m1232a(a));
        C0773c0.m385b(b, "has_audio", b2);
        C0773c0.m373a(b, TapjoyConstants.TJC_VOLUME, a2);
        h0Var.mo10835a(b).mo10838c();
        return b2;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public boolean m451j(C0850h0 h0Var) {
        C0832f1 a = h0Var.mo10834a();
        String b = h0Var.mo10836b();
        String h = C0773c0.m393h(a, "ad_session_id");
        int d = C0773c0.m389d(a, "view_id");
        C0761c cVar = this.f399b.get(h);
        if (cVar == null) {
            mo10714a(b, h);
            return false;
        }
        View view = cVar.mo10640e().get(Integer.valueOf(d));
        if (view == null) {
            mo10714a(b, "" + d);
            return false;
        }
        cVar.removeView(view);
        cVar.addView(view, view.getLayoutParams());
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public boolean m452k(C0850h0 h0Var) {
        C0832f1 a = h0Var.mo10834a();
        String b = h0Var.mo10836b();
        String h = C0773c0.m393h(a, "ad_session_id");
        int d = C0773c0.m389d(a, "view_id");
        C0761c cVar = this.f399b.get(h);
        if (cVar == null) {
            mo10714a(b, h);
            return false;
        }
        View view = cVar.mo10640e().get(Integer.valueOf(d));
        if (view == null) {
            mo10714a(b, "" + d);
            return false;
        }
        view.bringToFront();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public boolean m453l(C0850h0 h0Var) {
        C0832f1 a = h0Var.mo10834a();
        String h = C0773c0.m393h(a, "id");
        AdColonyInterstitial adColonyInterstitial = this.f400c.get(h);
        AdColonyAdView adColonyAdView = this.f403f.get(h);
        int a2 = C0773c0.m363a(a, TJAdUnitConstants.String.ORIENTATION, -1);
        boolean z = adColonyAdView != null;
        if (adColonyInterstitial != null || z) {
            C0773c0.m376a(C0773c0.m379b(), "id", h);
            if (adColonyInterstitial != null) {
                adColonyInterstitial.mo10429a(a2);
                adColonyInterstitial.mo10459n();
            }
            return true;
        }
        mo10714a(h0Var.mo10836b(), h);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo10725h() {
        this.f398a = new ConcurrentHashMap<>();
        this.f399b = new HashMap<>();
        this.f400c = new ConcurrentHashMap<>();
        this.f401d = new ConcurrentHashMap<>();
        this.f402e = new ConcurrentHashMap<>();
        this.f403f = Collections.synchronizedMap(new HashMap());
        C0723a.m192a("AdContainer.create", (C0865j0) new C0805l());
        C0723a.m192a("AdContainer.destroy", (C0865j0) new C0814t());
        C0723a.m192a("AdContainer.move_view_to_index", (C0865j0) new C0816u());
        C0723a.m192a("AdContainer.move_view_to_front", (C0865j0) new C0817v());
        C0723a.m192a("AdSession.finish_fullscreen_ad", (C0865j0) new C0818w());
        C0723a.m192a("AdSession.start_fullscreen_ad", (C0865j0) new C0819x());
        C0723a.m192a("AdSession.ad_view_available", (C0865j0) new C0820y());
        C0723a.m192a("AdSession.ad_view_unavailable", (C0865j0) new C0821z());
        C0723a.m192a("AdSession.expiring", (C0865j0) new C0791a());
        C0723a.m192a("AdSession.audio_stopped", (C0865j0) new C0792b());
        C0723a.m192a("AdSession.audio_started", (C0865j0) new C0794c());
        C0723a.m192a("AdSession.interstitial_available", (C0865j0) new C0796d());
        C0723a.m192a("AdSession.interstitial_unavailable", (C0865j0) new C0797e());
        C0723a.m192a("AdSession.has_audio", (C0865j0) new C0798f());
        C0723a.m192a("WebView.prepare", (C0865j0) new C0799g(this));
        C0723a.m192a("AdSession.expanded", (C0865j0) new C0800h(this));
        C0723a.m192a("AdColony.odt_event", (C0865j0) new C0802i(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo10727i(C0850h0 h0Var) {
        C0832f1 a = h0Var.mo10834a();
        String h = C0773c0.m393h(a, "id");
        AdColonyInterstitial adColonyInterstitial = this.f400c.get(h);
        if (adColonyInterstitial == null || adColonyInterstitial.mo10456j()) {
            return false;
        }
        AdColonyInterstitialListener listener = adColonyInterstitial.getListener();
        if (listener == null) {
            mo10714a(h0Var.mo10836b(), h);
            return false;
        }
        C1047z0.m1263c(this.f398a.remove(h));
        if (!C0723a.m195c()) {
            m435a(adColonyInterstitial);
            return false;
        }
        adColonyInterstitial.mo10468t();
        adColonyInterstitial.mo10434a(C0773c0.m393h(a, "ad_id"));
        adColonyInterstitial.mo10441c(C0773c0.m393h(a, CampaignEx.JSON_KEY_CREATIVE_ID));
        adColonyInterstitial.mo10444d(C0773c0.m393h(a, "ad_request_id"));
        C1047z0.m1259b((Runnable) new C0807m(this, h0Var, adColonyInterstitial, listener));
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public boolean m444d(C0850h0 h0Var) {
        String h = C0773c0.m393h(h0Var.mo10834a(), "ad_session_id");
        C0761c cVar = this.f399b.get(h);
        if (cVar == null) {
            mo10714a(h0Var.mo10836b(), h);
            return false;
        }
        mo10711a(cVar);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public boolean m449f(C0850h0 h0Var) {
        AdColonyInterstitialListener adColonyInterstitialListener;
        C0832f1 a = h0Var.mo10834a();
        int d = C0773c0.m389d(a, "status");
        if (d == 5 || d == 1 || d == 0 || d == 6) {
            return false;
        }
        String h = C0773c0.m393h(a, "id");
        AdColonyInterstitial remove = this.f400c.remove(h);
        if (remove == null) {
            adColonyInterstitialListener = null;
        } else {
            adColonyInterstitialListener = remove.getListener();
        }
        if (adColonyInterstitialListener == null) {
            mo10714a(h0Var.mo10836b(), h);
            return false;
        }
        C1047z0.m1259b((Runnable) new C0811q(this, adColonyInterstitialListener, remove));
        remove.mo10460o();
        remove.mo10432a((C0761c) null);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo10717b(C0850h0 h0Var) {
        String h = C0773c0.m393h(h0Var.mo10834a(), "id");
        AdColonyAdViewListener remove = this.f401d.remove(h);
        if (remove == null) {
            mo10714a(h0Var.mo10836b(), h);
            return false;
        }
        this.f402e.put(h, remove);
        C1047z0.m1263c(this.f398a.remove(h));
        Context a = C0723a.m186a();
        if (a == null) {
            m434a(remove);
            return false;
        }
        C1047z0.m1259b((Runnable) new C0804k(a, h0Var, remove, h));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo10719c(C0850h0 h0Var) {
        Context a = C0723a.m186a();
        if (a == null) {
            return false;
        }
        C0832f1 a2 = h0Var.mo10834a();
        String h = C0773c0.m393h(a2, "ad_session_id");
        C0761c cVar = new C0761c(a.getApplicationContext(), h);
        cVar.mo10652j(h0Var);
        this.f399b.put(h, cVar);
        if (C0773c0.m389d(a2, "width") == 0) {
            AdColonyInterstitial adColonyInterstitial = this.f400c.get(h);
            if (adColonyInterstitial == null) {
                mo10714a(h0Var.mo10836b(), h);
                return false;
            }
            adColonyInterstitial.mo10432a(cVar);
        } else {
            cVar.mo10636c(false);
        }
        C0832f1 b = C0773c0.m379b();
        C0773c0.m385b(b, "success", true);
        h0Var.mo10835a(b).mo10838c();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo10722e(C0850h0 h0Var) {
        C0832f1 a = h0Var.mo10834a();
        String h = C0773c0.m393h(a, "id");
        if (C0773c0.m389d(a, "type") != 0) {
            return true;
        }
        AdColonyInterstitial remove = this.f400c.remove(h);
        if (!C0723a.m195c() || remove == null || !remove.mo10461p()) {
            mo10714a(h0Var.mo10836b(), h);
            return true;
        }
        C1047z0.m1259b((Runnable) new C0803j(this));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo10715a(C0850h0 h0Var) {
        String h = C0773c0.m393h(h0Var.mo10834a(), "id");
        AdColonyAdViewListener remove = this.f401d.remove(h);
        if (remove == null) {
            mo10714a(h0Var.mo10836b(), h);
            return false;
        }
        C1047z0.m1263c(this.f398a.remove(h));
        m434a(remove);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Map<String, AdColonyAdView> mo10720d() {
        return this.f403f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10708a() {
        for (AdColonyInterstitial next : this.f400c.values()) {
            if (next != null && next.mo10458m()) {
                next.mo10447e("Controller was reloaded and current ad was closed");
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m434a(AdColonyAdViewListener adColonyAdViewListener) {
        C1047z0.m1259b((Runnable) new C0808n(this, adColonyAdViewListener));
    }

    /* renamed from: a */
    private void m435a(AdColonyInterstitial adColonyInterstitial) {
        adColonyInterstitial.mo10462q();
        if (!C0723a.m195c()) {
            C0826e0.C0827a a = new C0826e0.C0827a().mo10746a("RequestNotFilled called due to a missing context. ");
            a.mo10746a("Interstitial with adSessionId(" + adColonyInterstitial.mo10437b() + ").").mo10747a(C0826e0.f462i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public List<AdColonyInterstitial> mo10724g() {
        ArrayList arrayList = new ArrayList();
        for (AdColonyInterstitial next : mo10723f().values()) {
            if (!next.isExpired()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10716b() {
        HashSet<AdColonyAdViewListener> hashSet = new HashSet<>();
        synchronized (this.f404g) {
            for (String remove : this.f402e.keySet()) {
                AdColonyAdViewListener remove2 = this.f402e.remove(remove);
                if (remove2 != null) {
                    hashSet.add(remove2);
                }
            }
            for (String remove3 : this.f401d.keySet()) {
                AdColonyAdViewListener remove4 = this.f401d.remove(remove3);
                if (remove4 != null) {
                    hashSet.add(remove4);
                }
            }
        }
        for (AdColonyAdViewListener a : hashSet) {
            m434a(a);
        }
        for (String next : this.f400c.keySet()) {
            AdColonyInterstitial adColonyInterstitial = this.f400c.get(next);
            if (adColonyInterstitial != null && adColonyInterstitial.mo10457l()) {
                this.f400c.remove(next);
                m435a(adColonyInterstitial);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public ConcurrentHashMap<String, AdColonyAdViewListener> mo10721e() {
        return this.f401d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10712a(String str, AdColonyAdViewListener adColonyAdViewListener, AdColonyAdSize adColonyAdSize, AdColonyAdOptions adColonyAdOptions, long j) {
        C0832f1 f1Var;
        String a = C1047z0.m1235a();
        float s = C0723a.m193b().mo10905n().mo11058s();
        C0832f1 b = C0773c0.m379b();
        C0773c0.m376a(b, "zone_id", str);
        C0773c0.m383b(b, "type", 1);
        C0773c0.m383b(b, "width_pixels", (int) (((float) adColonyAdSize.getWidth()) * s));
        C0773c0.m383b(b, "height_pixels", (int) (((float) adColonyAdSize.getHeight()) * s));
        C0773c0.m383b(b, "width", adColonyAdSize.getWidth());
        C0773c0.m383b(b, "height", adColonyAdSize.getHeight());
        C0773c0.m376a(b, "id", a);
        if (!(adColonyAdOptions == null || (f1Var = adColonyAdOptions.f114d) == null)) {
            C0773c0.m375a(b, SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, f1Var);
        }
        adColonyAdViewListener.mo10371a(str);
        adColonyAdViewListener.mo10369a(adColonyAdSize);
        this.f401d.put(a, adColonyAdViewListener);
        this.f398a.put(a, new C0809o(a, str, j));
        new C0850h0("AdSession.on_request", 1, b).mo10838c();
        C1047z0.m1244a(this.f398a.get(a), j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public HashMap<String, C0761c> mo10718c() {
        return this.f399b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public ConcurrentHashMap<String, AdColonyInterstitial> mo10723f() {
        return this.f400c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10713a(String str, AdColonyInterstitialListener adColonyInterstitialListener, AdColonyAdOptions adColonyAdOptions, long j) {
        String a = C1047z0.m1235a();
        C0866k b = C0723a.m193b();
        AdColonyInterstitial adColonyInterstitial = new AdColonyInterstitial(a, adColonyInterstitialListener, str);
        C0832f1 b2 = C0773c0.m379b();
        C0773c0.m376a(b2, "zone_id", str);
        C0773c0.m385b(b2, "fullscreen", true);
        Rect w = b.mo10905n().mo11062w();
        C0773c0.m383b(b2, "width", w.width());
        C0773c0.m383b(b2, "height", w.height());
        C0773c0.m383b(b2, "type", 0);
        C0773c0.m376a(b2, "id", a);
        if (!(adColonyAdOptions == null || adColonyAdOptions.f114d == null)) {
            adColonyInterstitial.mo10430a(adColonyAdOptions);
            C0773c0.m375a(b2, SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, adColonyAdOptions.f114d);
        }
        this.f400c.put(a, adColonyInterstitial);
        this.f398a.put(a, new C0810p(a, str, j));
        new C0850h0("AdSession.on_request", 1, b2).mo10838c();
        C1047z0.m1244a(this.f398a.get(a), j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10709a(Context context, C0832f1 f1Var, String str) {
        C0850h0 h0Var = new C0850h0("AdSession.finish_fullscreen_ad", 0);
        C0773c0.m383b(f1Var, "status", 1);
        h0Var.mo10837b(f1Var);
        new C0826e0.C0827a().mo10746a(str).mo10747a(C0826e0.f461h);
        ((C0739b) context).mo10477a(h0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10710a(C0742b1 b1Var, String str, C0761c cVar) {
        C1047z0.m1259b((Runnable) new C0812r(str, b1Var, cVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10711a(C0761c cVar) {
        C1047z0.m1259b((Runnable) new C0813s(this, cVar));
        AdColonyAdView adColonyAdView = this.f403f.get(cVar.mo10625a());
        if (adColonyAdView == null || adColonyAdView.mo10333d()) {
            this.f399b.remove(cVar.mo10625a());
            cVar.f357y = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo10726h(C0850h0 h0Var) {
        AdColonyInterstitialListener adColonyInterstitialListener;
        String h = C0773c0.m393h(h0Var.mo10834a(), "id");
        AdColonyInterstitial remove = this.f400c.remove(h);
        if (remove == null) {
            adColonyInterstitialListener = null;
        } else {
            adColonyInterstitialListener = remove.getListener();
        }
        if (adColonyInterstitialListener == null) {
            mo10714a(h0Var.mo10836b(), h);
            return false;
        }
        C1047z0.m1263c(this.f398a.remove(h));
        m435a(remove);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10714a(String str, String str2) {
        new C0826e0.C0827a().mo10746a("Message '").mo10746a(str).mo10746a("' sent with invalid id: ").mo10746a(str2).mo10747a(C0826e0.f461h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AdColonyAdView mo10707a(String str) {
        AdColonyAdView remove;
        synchronized (this.f404g) {
            remove = this.f403f.remove(str);
        }
        return remove;
    }
}
