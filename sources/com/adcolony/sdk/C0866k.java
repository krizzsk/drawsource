package com.adcolony.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.adcolony.adcolonysdk.BuildConfig;
import com.adcolony.sdk.AdColonyAdView;
import com.adcolony.sdk.AdColonyInterstitial;
import com.adcolony.sdk.C0826e0;
import com.adcolony.sdk.C0928o;
import com.adcolony.sdk.C0960s;
import com.adcolony.sdk.C0988v;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.iab.omid.library.adcolony.Omid;
import com.iab.omid.library.adcolony.adsession.Partner;
import com.smaato.sdk.core.SmaatoSdk;
import com.tapjoy.TapjoyConstants;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.adcolony.sdk.k */
class C0866k {

    /* renamed from: Z */
    static String f534Z = "https://adc3-launch.adcolony.com/v4/launch";

    /* renamed from: a0 */
    private static volatile String f535a0 = "";

    /* renamed from: A */
    private boolean f536A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f537B;

    /* renamed from: C */
    private boolean f538C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C0829f f539D = new C0829f();
    /* access modifiers changed from: private */

    /* renamed from: E */
    public boolean f540E;

    /* renamed from: F */
    private boolean f541F;

    /* renamed from: G */
    private boolean f542G;

    /* renamed from: H */
    private boolean f543H;

    /* renamed from: I */
    private boolean f544I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public boolean f545J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public boolean f546K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public boolean f547L;

    /* renamed from: M */
    private int f548M;

    /* renamed from: N */
    private int f549N = 1;

    /* renamed from: O */
    private Application.ActivityLifecycleCallbacks f550O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public Partner f551P = null;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public C0832f1 f552Q = new C0832f1();

    /* renamed from: R */
    private long f553R = 500;

    /* renamed from: S */
    private long f554S = 500;

    /* renamed from: T */
    private boolean f555T;

    /* renamed from: U */
    private long f556U = SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US;

    /* renamed from: V */
    private long f557V = 300000;

    /* renamed from: W */
    private long f558W = 15000;

    /* renamed from: X */
    private int f559X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public boolean f560Y = false;

    /* renamed from: a */
    private C0852i0 f561a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C0965t f562b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C0969t0 f563c;

    /* renamed from: d */
    private C0790d f564d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C0953r f565e;

    /* renamed from: f */
    private C0993w f566f;

    /* renamed from: g */
    private C1014x0 f567g;

    /* renamed from: h */
    private C0992v0 f568h;

    /* renamed from: i */
    private C0835g0 f569i;

    /* renamed from: j */
    private C0943q f570j;

    /* renamed from: k */
    private C0917m0 f571k;

    /* renamed from: l */
    private C0761c f572l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C1043z f573m;

    /* renamed from: n */
    private AdColonyAdView f574n;

    /* renamed from: o */
    private AdColonyInterstitial f575o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public AdColonyRewardListener f576p;

    /* renamed from: q */
    private HashMap<String, AdColonyCustomMessageListener> f577q = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: r */
    public AdColonyAppOptions f578r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C0850h0 f579s;

    /* renamed from: t */
    private C0832f1 f580t;

    /* renamed from: u */
    private HashMap<String, AdColonyZone> f581u = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: v */
    public HashMap<Integer, C0774c1> f582v = new HashMap<>();

    /* renamed from: w */
    private String f583w;

    /* renamed from: x */
    private String f584x;

    /* renamed from: y */
    private String f585y;

    /* renamed from: z */
    private String f586z = "";

    /* renamed from: com.adcolony.sdk.k$a */
    class C0867a implements C0865j0 {
        C0867a(C0866k kVar) {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0832f1 b = C0773c0.m379b();
            C0773c0.m383b(b, "crc32", C1047z0.m1231a(C0773c0.m393h(h0Var.mo10834a(), "data")));
            h0Var.mo10835a(b).mo10838c();
        }
    }

    /* renamed from: com.adcolony.sdk.k$a0 */
    class C0868a0 implements C0865j0 {
        C0868a0() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            boolean unused = C0866k.this.m681a(true, true);
        }
    }

    /* renamed from: com.adcolony.sdk.k$b */
    class C0869b implements C0865j0 {
        C0869b(C0866k kVar) {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            int d = C0773c0.m389d(h0Var.mo10834a(), "number");
            C0832f1 b = C0773c0.m379b();
            C0773c0.m374a(b, "uuids", C1047z0.m1233a(d));
            h0Var.mo10835a(b).mo10838c();
        }
    }

    /* renamed from: com.adcolony.sdk.k$b0 */
    class C0870b0 implements C0865j0 {
        C0870b0(C0866k kVar) {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0832f1 b = C0773c0.m379b();
            C0773c0.m376a(b, "sha1", C1047z0.m1256b(C0773c0.m393h(h0Var.mo10834a(), "data")));
            h0Var.mo10835a(b).mo10838c();
        }
    }

    /* renamed from: com.adcolony.sdk.k$c */
    class C0871c implements C0865j0 {

        /* renamed from: com.adcolony.sdk.k$c$a */
        class C0872a implements C1031y<String> {

            /* renamed from: a */
            final /* synthetic */ C0850h0 f589a;

            C0872a(C0850h0 h0Var) {
                this.f589a = h0Var;
            }

            /* renamed from: a */
            public void mo10918a(String str) {
                C0832f1 b = C0773c0.m379b();
                C0773c0.m376a(b, "advertiser_id", C0866k.this.mo10905n().mo11045f());
                C0773c0.m385b(b, "limit_ad_tracking", C0866k.this.mo10905n().mo11010A());
                this.f589a.mo10835a(b).mo10838c();
            }

            /* renamed from: a */
            public void mo10920a(Throwable th) {
                new C0826e0.C0827a().mo10746a("Device.query_advertiser_info").mo10746a(" failed with error: ").mo10746a(Log.getStackTraceString(th)).mo10747a(C0826e0.f460g);
            }
        }

        C0871c() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0866k.this.mo10905n().mo11029a(C0723a.m186a(), new C0872a(h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.k$d */
    class C0873d implements C0865j0 {
        C0873d() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0962s0 a = C0866k.this.mo10908q().mo10822a();
            C0866k.this.mo10905n().mo11041c(C0773c0.m393h(h0Var.mo10834a(), "version"));
            if (a != null) {
                a.mo11097e(C0866k.this.mo10905n().mo11054o());
            }
        }
    }

    /* renamed from: com.adcolony.sdk.k$e */
    class C0874e implements C0865j0 {
        C0874e() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0832f1 unused = C0866k.this.f552Q = C0773c0.m391f(h0Var.mo10834a(), "signals");
        }
    }

    /* renamed from: com.adcolony.sdk.k$f */
    class C0875f implements C0865j0 {

        /* renamed from: com.adcolony.sdk.k$f$a */
        class C0876a implements C1013x<C0928o.C0930b> {

            /* renamed from: a */
            final /* synthetic */ C0850h0 f594a;

            C0876a(C0875f fVar, C0850h0 h0Var) {
                this.f594a = h0Var;
            }

            /* renamed from: a */
            public void mo10922a(C0928o.C0930b bVar) {
                C0832f1 b = C0773c0.m379b();
                if (bVar != null) {
                    C0773c0.m375a(b, "odt", bVar.mo10976b());
                }
                this.f594a.mo10835a(b).mo10838c();
            }
        }

        C0875f() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            if (C0866k.this.mo10869G()) {
                C0934o0.m895c().mo10993a((C1013x<C0928o.C0930b>) new C0876a(this, h0Var), C0866k.this.mo10898g());
                return;
            }
            C0928o.C0930b b = C0934o0.m895c().mo10994b();
            C0832f1 b2 = C0773c0.m379b();
            if (b != null) {
                C0773c0.m375a(b2, "odt", b.mo10976b());
            }
            h0Var.mo10835a(b2).mo10838c();
        }
    }

    /* renamed from: com.adcolony.sdk.k$g */
    class C0877g implements C0865j0 {
        C0877g(C0866k kVar) {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0934o0.m895c().mo10988a();
        }
    }

    /* renamed from: com.adcolony.sdk.k$h */
    class C0878h implements C0865j0 {
        C0878h() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0866k.this.f573m.mo11209a(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.k$i */
    class C0879i implements Runnable {
        C0879i() {
        }

        public void run() {
            Context a = C0723a.m186a();
            if (!C0866k.this.f547L && a != null) {
                try {
                    Omid.activate(a.getApplicationContext());
                    boolean unused = C0866k.this.f547L = true;
                } catch (IllegalArgumentException unused2) {
                    new C0826e0.C0827a().mo10746a("IllegalArgumentException when activating Omid").mo10747a(C0826e0.f462i);
                    boolean unused3 = C0866k.this.f547L = false;
                }
            }
            if (C0866k.this.f547L && C0866k.this.f551P == null) {
                try {
                    Partner unused4 = C0866k.this.f551P = Partner.createPartner("AdColony", "4.8.0");
                } catch (IllegalArgumentException unused5) {
                    new C0826e0.C0827a().mo10746a("IllegalArgumentException when creating Omid Partner").mo10747a(C0826e0.f462i);
                    boolean unused6 = C0866k.this.f547L = false;
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.k$j */
    class C0880j implements Runnable {

        /* renamed from: com.adcolony.sdk.k$j$a */
        class C0881a implements C0960s.C0961a {
            C0881a() {
            }

            /* renamed from: a */
            public void mo10925a(C0960s sVar, C0850h0 h0Var, Map<String, List<String>> map) {
                C0866k.this.m673a(sVar);
            }
        }

        C0880j() {
        }

        public void run() {
            C0832f1 b = C0773c0.m379b();
            C0773c0.m376a(b, "url", C0866k.f534Z);
            C0773c0.m376a(b, FirebaseAnalytics.Param.CONTENT_TYPE, "application/json");
            C0773c0.m376a(b, "content", C0866k.this.mo10905n().mo11059t().toString());
            C0773c0.m376a(b, "url", C0866k.f534Z);
            if (C0866k.this.f560Y) {
                C0832f1 b2 = C0773c0.m379b();
                C0773c0.m376a(b2, "request", BuildConfig.LAUNCH_REQ_DICT_ID);
                C0773c0.m376a(b2, "response", BuildConfig.LAUNCH_RESP_DICT_ID);
                C0773c0.m375a(b, "dictionaries_mapping", b2);
            }
            C0866k.this.f562b.mo11104a(new C0960s(new C0850h0("WebServices.post", 0, b), new C0881a()));
        }
    }

    /* renamed from: com.adcolony.sdk.k$k */
    class C0882k implements C0988v.C0991c {
        C0882k(C0866k kVar) {
        }

        /* renamed from: a */
        public void mo10926a() {
            C0934o0.m895c().mo10995d();
        }
    }

    /* renamed from: com.adcolony.sdk.k$l */
    class C0883l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f599a;

        /* renamed from: b */
        final /* synthetic */ C0850h0 f600b;

        C0883l(Context context, C0850h0 h0Var) {
            this.f599a = context;
            this.f600b = h0Var;
        }

        public void run() {
            C0857j a = C0857j.m658a(this.f599a.getApplicationContext(), this.f600b);
            C0866k.this.f582v.put(Integer.valueOf(a.getAdc3ModuleId()), a);
        }
    }

    /* renamed from: com.adcolony.sdk.k$m */
    class C0884m implements Runnable {
        C0884m() {
        }

        public void run() {
            if (C0723a.m193b().mo10915x().mo11119f()) {
                C0866k.this.m663K();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.k$n */
    class C0885n implements C0960s.C0961a {
        C0885n() {
        }

        /* renamed from: a */
        public void mo10925a(C0960s sVar, C0850h0 h0Var, Map<String, List<String>> map) {
            C0866k.this.m666N();
        }
    }

    /* renamed from: com.adcolony.sdk.k$o */
    class C0886o implements Runnable {
        C0886o() {
        }

        public void run() {
            boolean unused = C0866k.this.m664L();
        }
    }

    /* renamed from: com.adcolony.sdk.k$p */
    class C0887p implements AdColonyInterstitial.C0721f {
        C0887p() {
        }

        /* renamed from: a */
        public void mo10476a() {
            C0866k.this.m683b();
        }
    }

    /* renamed from: com.adcolony.sdk.k$q */
    class C0888q implements AdColonyAdView.C0714c {
        C0888q() {
        }

        /* renamed from: a */
        public void mo10358a() {
            C0866k.this.m683b();
        }
    }

    /* renamed from: com.adcolony.sdk.k$r */
    class C0889r implements C1013x<C0923n0> {
        C0889r(C0866k kVar) {
        }

        /* renamed from: a */
        public void mo10922a(C0923n0 n0Var) {
            C0934o0.m895c().mo10990a(n0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.k$s */
    class C0890s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0850h0 f607a;

        C0890s(C0850h0 h0Var) {
            this.f607a = h0Var;
        }

        public void run() {
            C0866k.this.f576p.onReward(new AdColonyReward(this.f607a));
        }
    }

    /* renamed from: com.adcolony.sdk.k$t */
    class C0891t implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        private final Set<Integer> f609a = new HashSet();

        C0891t() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (!C0866k.this.f563c.mo11119f()) {
                C0866k.this.f563c.mo11113c(true);
            }
            C0723a.m188a((Context) activity);
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
            C0723a.f207d = false;
            C0866k.this.f563c.mo11115d(false);
        }

        public void onActivityResumed(Activity activity) {
            ScheduledExecutorService scheduledExecutorService;
            this.f609a.add(Integer.valueOf(activity.hashCode()));
            C0723a.f207d = true;
            C0723a.m188a((Context) activity);
            C0962s0 a = C0866k.this.mo10908q().mo10822a();
            Context a2 = C0723a.m186a();
            if (a2 == null || !C0866k.this.f563c.mo11117e() || !(a2 instanceof C0739b) || ((C0739b) a2).f282d) {
                C0723a.m188a((Context) activity);
                if (C0866k.this.f579s != null) {
                    if (!Objects.equals(C0773c0.m393h(C0866k.this.f579s.mo10834a(), "m_origin"), "")) {
                        C0866k.this.f579s.mo10835a(C0866k.this.f579s.mo10834a()).mo10838c();
                    }
                    C0850h0 unused = C0866k.this.f579s = null;
                }
                boolean unused2 = C0866k.this.f537B = false;
                C0866k.this.f563c.mo11120g(false);
                if (C0866k.this.f540E && !C0866k.this.f563c.mo11119f()) {
                    C0866k.this.f563c.mo11113c(true);
                }
                C0866k.this.f563c.mo11115d(true);
                C0866k.this.f565e.mo11081c();
                if (a == null || (scheduledExecutorService = a.f769b) == null || scheduledExecutorService.isShutdown() || a.f769b.isTerminated()) {
                    AdColony.m88a((Context) activity, C0723a.m193b().f578r);
                }
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            C0866k.this.f563c.mo11116e(true);
        }

        public void onActivityStopped(Activity activity) {
            this.f609a.remove(Integer.valueOf(activity.hashCode()));
            if (this.f609a.isEmpty()) {
                C0866k.this.f563c.mo11116e(false);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.k$u */
    class C0892u implements C0865j0 {
        C0892u() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            boolean unused = C0866k.this.m690c(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.k$v */
    class C0893v implements C0865j0 {
        C0893v() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0866k.this.m671a(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.k$w */
    class C0894w implements C0865j0 {
        C0894w() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0962s0 a = C0866k.this.mo10908q().mo10822a();
            C0866k.this.f539D.mo10763a(true);
            if (C0866k.this.f545J) {
                C0832f1 b = C0773c0.m379b();
                C0832f1 b2 = C0773c0.m379b();
                C0773c0.m376a(b2, TapjoyConstants.TJC_APP_VERSION_NAME, C1047z0.m1262c());
                C0773c0.m375a(b, "app_bundle_info", b2);
                new C0850h0("AdColony.on_update", 1, b).mo10838c();
                boolean unused = C0866k.this.f545J = false;
            }
            if (C0866k.this.f546K) {
                new C0850h0("AdColony.on_install", 1).mo10838c();
            }
            C0832f1 a2 = h0Var.mo10834a();
            if (a != null) {
                a.mo11098f(C0773c0.m393h(a2, "app_session_id"));
            }
            if (AdColonyEventTracker.m129a()) {
                AdColonyEventTracker.m131b();
            }
            Integer i = a2.mo10802i("base_download_threads");
            if (i != null) {
                C0866k.this.f562b.mo11103a(i.intValue());
            }
            Integer i2 = a2.mo10802i("concurrent_requests");
            if (i2 != null) {
                C0866k.this.f562b.mo11105b(i2.intValue());
            }
            Integer i3 = a2.mo10802i("threads_keep_alive_time");
            if (i3 != null) {
                C0866k.this.f562b.mo11106c(i3.intValue());
            }
            double h = a2.mo10801h("thread_pool_scaling_factor");
            if (!Double.isNaN(h)) {
                C0866k.this.f562b.mo11102a(h);
            }
            C0866k.this.f573m.mo11210b();
            C0866k.this.m665M();
        }
    }

    /* renamed from: com.adcolony.sdk.k$x */
    class C0895x implements C0865j0 {
        C0895x() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0866k.this.m685b(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.k$y */
    class C0896y implements C0865j0 {
        C0896y() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0866k.this.mo10896e(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.k$z */
    class C0897z implements C0865j0 {
        C0897z() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0866k.this.m697f(h0Var);
        }
    }

    C0866k() {
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public void m663K() {
        new Thread(new C0880j()).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public boolean m664L() {
        this.f561a.mo10844a();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public void m665M() {
        C0832f1 b = C0773c0.m379b();
        C0773c0.m376a(b, "type", "AdColony.on_configuration_completed");
        C0828e1 e1Var = new C0828e1();
        for (String b2 : mo10865C().keySet()) {
            e1Var.mo10754b(b2);
        }
        C0832f1 b3 = C0773c0.m379b();
        C0773c0.m374a(b3, "zone_ids", e1Var);
        C0773c0.m375a(b, "message", b3);
        new C0850h0("CustomMessage.controller_send", 0, b).mo10838c();
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public void m666N() {
        if (m679a(this.f584x) || C0899l.f618H) {
            if (!this.f541F && !this.f544I) {
                C1047z0.m1259b((Runnable) new C0886o());
            }
            if (this.f541F && this.f544I) {
                mo10874Q();
                return;
            }
            return;
        }
        new C0826e0.C0827a().mo10746a("Downloaded controller sha1 does not match, retrying.").mo10747a(C0826e0.f459f);
        m668S();
    }

    /* renamed from: O */
    private void m667O() {
        Application application;
        Context a = C0723a.m186a();
        if (a != null && this.f550O == null && Build.VERSION.SDK_INT > 14) {
            this.f550O = new C0891t();
            if (a instanceof Application) {
                application = (Application) a;
            } else {
                application = ((Activity) a).getApplication();
            }
            application.registerActivityLifecycleCallbacks(this.f550O);
        }
    }

    /* renamed from: S */
    private void m668S() {
        if (C0723a.m193b().mo10915x().mo11119f()) {
            int i = this.f548M + 1;
            this.f548M = i;
            this.f549N = Math.min(this.f549N * i, 120);
            C1047z0.m1244a((Runnable) new C0884m(), ((long) this.f549N) * 1000);
            return;
        }
        new C0826e0.C0827a().mo10746a("Max launch server download attempts hit, or AdColony is no longer").mo10746a(" active.").mo10747a(C0826e0.f460g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public C1014x0 mo10863A() {
        if (this.f567g == null) {
            C1014x0 x0Var = new C1014x0();
            this.f567g = x0Var;
            x0Var.mo11181a();
        }
        return this.f567g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public HashMap<Integer, C0774c1> mo10864B() {
        return this.f582v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public HashMap<String, AdColonyZone> mo10865C() {
        return this.f581u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean mo10866D() {
        return this.f578r != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public boolean mo10867E() {
        return this.f537B;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public boolean mo10868F() {
        return this.f538C;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public boolean mo10869G() {
        return this.f555T;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public boolean mo10870H() {
        return this.f560Y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public boolean mo10871I() {
        return this.f539D.mo10764a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public boolean mo10872J() {
        return this.f536A;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo10873P() {
        this.f539D.mo10763a(false);
        this.f564d.mo10716b();
        Object option = this.f578r.getOption("force_ad_id");
        if ((option instanceof String) && !((String) option).isEmpty()) {
            mo10875R();
        }
        AdColony.m88a(C0723a.m186a(), this.f578r);
        mo10876T();
        this.f581u.clear();
        this.f561a.mo10844a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo10874Q() {
        this.f559X = 0;
        for (AdColonyInterstitial next : this.f564d.mo10723f().values()) {
            if (next.mo10458m()) {
                this.f559X++;
                next.mo10431a((AdColonyInterstitial.C0721f) new C0887p());
            }
        }
        for (AdColonyAdView onDestroyListenerOrCall : this.f564d.mo10720d().values()) {
            this.f559X++;
            onDestroyListenerOrCall.setOnDestroyListenerOrCall(new C0888q());
        }
        if (this.f559X == 0) {
            mo10873P();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo10875R() {
        synchronized (this.f564d.mo10723f()) {
            for (AdColonyInterstitial p : this.f564d.mo10723f().values()) {
                p.mo10461p();
            }
            this.f564d.mo10723f().clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo10876T() {
        mo10885a(1);
        for (C0774c1 b : this.f582v.values()) {
            this.f561a.mo10848b((C0898k0) b);
        }
        this.f582v.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public AdColonyAppOptions mo10912u() {
        if (this.f578r == null) {
            this.f578r = new AdColonyAppOptions();
        }
        return this.f578r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public String mo10913v() {
        return f535a0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public AdColonyRewardListener mo10914w() {
        return this.f576p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public C0969t0 mo10915x() {
        if (this.f563c == null) {
            C0969t0 t0Var = new C0969t0();
            this.f563c = t0Var;
            t0Var.mo11114d();
        }
        return this.f563c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public long mo10916y() {
        return this.f553R;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public C0992v0 mo10917z() {
        if (this.f568h == null) {
            C0992v0 v0Var = new C0992v0();
            this.f568h = v0Var;
            v0Var.mo11158e();
        }
        return this.f568h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo10897f() {
        return this.f586z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public long mo10898g() {
        return this.f554S;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public long mo10899h() {
        return this.f557V;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public long mo10900i() {
        return this.f558W;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public AdColonyInterstitial mo10901j() {
        return this.f575o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public AdColonyAdView mo10902k() {
        return this.f574n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C0761c mo10903l() {
        return this.f572l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public HashMap<String, AdColonyCustomMessageListener> mo10904m() {
        return this.f577q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C0943q mo10905n() {
        if (this.f570j == null) {
            C0943q qVar = new C0943q();
            this.f570j = qVar;
            qVar.mo11022M();
        }
        return this.f570j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C0953r mo10906o() {
        if (this.f565e == null) {
            this.f565e = new C0953r();
        }
        return this.f565e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C0993w mo10907p() {
        if (this.f566f == null) {
            C0993w wVar = new C0993w();
            this.f566f = wVar;
            wVar.mo11165b();
        }
        return this.f566f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public C0835g0 mo10908q() {
        if (this.f569i == null) {
            C0835g0 g0Var = new C0835g0();
            this.f569i = g0Var;
            g0Var.mo10830c();
        }
        return this.f569i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C0852i0 mo10909r() {
        if (this.f561a == null) {
            C0852i0 i0Var = new C0852i0();
            this.f561a = i0Var;
            i0Var.mo10844a();
        }
        return this.f561a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C0917m0 mo10910s() {
        if (this.f571k == null) {
            this.f571k = new C0917m0();
        }
        return this.f571k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public Partner mo10911t() {
        return this.f551P;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m697f(C0850h0 h0Var) {
        AdColonyZone adColonyZone;
        if (!this.f538C) {
            String h = C0773c0.m393h(h0Var.mo10834a(), "zone_id");
            if (this.f581u.containsKey(h)) {
                adColonyZone = this.f581u.get(h);
            } else {
                AdColonyZone adColonyZone2 = new AdColonyZone(h);
                this.f581u.put(h, adColonyZone2);
                adColonyZone = adColonyZone2;
            }
            adColonyZone.mo10517a(h0Var);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo10892d(C0850h0 h0Var) {
        this.f579s = h0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo10896e(C0850h0 h0Var) {
        if (this.f576p == null) {
            return false;
        }
        C1047z0.m1259b((Runnable) new C0890s(h0Var));
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m690c(C0850h0 h0Var) {
        Context a = C0723a.m186a();
        if (a == null) {
            return false;
        }
        try {
            int j = h0Var.mo10834a().mo10803j("id");
            if (j > 0) {
                mo10885a(j);
            }
            C1047z0.m1259b((Runnable) new C0883l(a, h0Var));
            return true;
        } catch (RuntimeException e) {
            C0826e0.C0827a aVar = new C0826e0.C0827a();
            aVar.mo10746a(e.toString() + ": during WebView initialization.").mo10746a(" Disabling AdColony.").mo10747a(C0826e0.f461h);
            AdColony.disable();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10888b(boolean z) {
        this.f539D.mo10763a(false);
        this.f538C = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo10893d(boolean z) {
        this.f540E = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public long mo10891d() {
        return this.f556U;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo10895e(boolean z) {
        this.f536A = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C0832f1 mo10894e() {
        return this.f552Q;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m685b(C0850h0 h0Var) {
        C0832f1 b = this.f578r.mo10383b();
        C0773c0.m376a(b, "app_id", this.f578r.mo10382a());
        C0832f1 b2 = C0773c0.m379b();
        C0773c0.m375a(b2, SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, b);
        h0Var.mo10835a(b2).mo10838c();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x010f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10881a(com.adcolony.sdk.AdColonyAppOptions r5, boolean r6) {
        /*
            r4 = this;
            r4.f538C = r6
            r4.f578r = r5
            com.adcolony.sdk.i0 r0 = new com.adcolony.sdk.i0
            r0.<init>()
            r4.f561a = r0
            com.adcolony.sdk.m r0 = new com.adcolony.sdk.m
            r0.<init>()
            com.adcolony.sdk.q r0 = new com.adcolony.sdk.q
            r0.<init>()
            r4.f570j = r0
            r0.mo11022M()
            com.adcolony.sdk.t r0 = new com.adcolony.sdk.t
            r0.<init>()
            r4.f562b = r0
            r0.mo11101a()
            com.adcolony.sdk.t0 r0 = new com.adcolony.sdk.t0
            r0.<init>()
            r4.f563c = r0
            r0.mo11114d()
            com.adcolony.sdk.d r0 = new com.adcolony.sdk.d
            r0.<init>()
            r4.f564d = r0
            r0.mo10725h()
            com.adcolony.sdk.r r0 = new com.adcolony.sdk.r
            r0.<init>()
            r4.f565e = r0
            com.adcolony.sdk.w r0 = new com.adcolony.sdk.w
            r0.<init>()
            r4.f566f = r0
            r0.mo11165b()
            com.adcolony.sdk.g0 r0 = new com.adcolony.sdk.g0
            r0.<init>()
            r4.f569i = r0
            r0.mo10830c()
            com.adcolony.sdk.v0 r0 = new com.adcolony.sdk.v0
            r0.<init>()
            r4.f568h = r0
            r0.mo11158e()
            com.adcolony.sdk.x0 r0 = new com.adcolony.sdk.x0
            r0.<init>()
            r4.f567g = r0
            r0.mo11181a()
            com.adcolony.sdk.m0 r0 = new com.adcolony.sdk.m0
            r0.<init>()
            r4.f571k = r0
            com.adcolony.sdk.z r0 = new com.adcolony.sdk.z
            r0.<init>()
            r4.f573m = r0
            com.adcolony.sdk.m0 r0 = r4.f571k
            r0.mo10945b()
            android.content.Context r0 = com.adcolony.sdk.C0723a.m186a()
            com.adcolony.sdk.AdColony.m88a((android.content.Context) r0, (com.adcolony.sdk.AdColonyAppOptions) r5)
            r5 = 0
            r0 = 1
            if (r6 != 0) goto L_0x0135
            java.io.File r6 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.adcolony.sdk.v0 r2 = r4.f568h
            java.lang.String r2 = r2.mo11153a()
            r1.append(r2)
            java.lang.String r2 = "026ae9c9824b3e483fa6c71fa88f57ae27816141"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r6.<init>(r1)
            boolean r6 = r6.exists()
            r4.f542G = r6
            java.io.File r6 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.adcolony.sdk.v0 r3 = r4.f568h
            java.lang.String r3 = r3.mo11153a()
            r1.append(r3)
            java.lang.String r3 = "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r6.<init>(r1)
            boolean r6 = r6.exists()
            r4.f543H = r6
            boolean r1 = r4.f542G
            if (r1 == 0) goto L_0x00fc
            if (r6 == 0) goto L_0x00fc
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            com.adcolony.sdk.v0 r1 = r4.f568h
            java.lang.String r1 = r1.mo11153a()
            r6.append(r1)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            com.adcolony.sdk.f1 r6 = com.adcolony.sdk.C0773c0.m388c(r6)
            java.lang.String r1 = "sdkVersion"
            java.lang.String r6 = com.adcolony.sdk.C0773c0.m393h(r6, r1)
            com.adcolony.sdk.q r1 = r4.f570j
            java.lang.String r1 = r1.mo11018I()
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x00fc
            r6 = r0
            goto L_0x00fd
        L_0x00fc:
            r6 = r5
        L_0x00fd:
            r4.f541F = r6
            com.adcolony.sdk.v r6 = com.adcolony.sdk.C0988v.m1089a()
            com.adcolony.sdk.k$k r1 = new com.adcolony.sdk.k$k
            r1.<init>(r4)
            r6.mo11147a((com.adcolony.sdk.C0988v.C0991c) r1)
            boolean r6 = r4.f542G
            if (r6 == 0) goto L_0x012d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            com.adcolony.sdk.v0 r1 = r4.f568h
            java.lang.String r1 = r1.mo11153a()
            r6.append(r1)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            com.adcolony.sdk.f1 r6 = com.adcolony.sdk.C0773c0.m388c(r6)
            r4.f580t = r6
            r4.m684b((com.adcolony.sdk.C0832f1) r6)
        L_0x012d:
            boolean r6 = r4.f541F
            r4.m680a((boolean) r6)
            r4.m667O()
        L_0x0135:
            com.adcolony.sdk.k$u r6 = new com.adcolony.sdk.k$u
            r6.<init>()
            java.lang.String r1 = "Module.load"
            com.adcolony.sdk.C0723a.m192a((java.lang.String) r1, (com.adcolony.sdk.C0865j0) r6)
            com.adcolony.sdk.k$v r6 = new com.adcolony.sdk.k$v
            r6.<init>()
            java.lang.String r1 = "Module.unload"
            com.adcolony.sdk.C0723a.m192a((java.lang.String) r1, (com.adcolony.sdk.C0865j0) r6)
            com.adcolony.sdk.k$w r6 = new com.adcolony.sdk.k$w
            r6.<init>()
            java.lang.String r1 = "AdColony.on_configured"
            com.adcolony.sdk.C0723a.m192a((java.lang.String) r1, (com.adcolony.sdk.C0865j0) r6)
            com.adcolony.sdk.k$x r6 = new com.adcolony.sdk.k$x
            r6.<init>()
            java.lang.String r1 = "AdColony.get_app_info"
            com.adcolony.sdk.C0723a.m192a((java.lang.String) r1, (com.adcolony.sdk.C0865j0) r6)
            com.adcolony.sdk.k$y r6 = new com.adcolony.sdk.k$y
            r6.<init>()
            java.lang.String r1 = "AdColony.v4vc_reward"
            com.adcolony.sdk.C0723a.m192a((java.lang.String) r1, (com.adcolony.sdk.C0865j0) r6)
            com.adcolony.sdk.k$z r6 = new com.adcolony.sdk.k$z
            r6.<init>()
            java.lang.String r1 = "AdColony.zone_info"
            com.adcolony.sdk.C0723a.m192a((java.lang.String) r1, (com.adcolony.sdk.C0865j0) r6)
            com.adcolony.sdk.k$a0 r6 = new com.adcolony.sdk.k$a0
            r6.<init>()
            java.lang.String r1 = "AdColony.probe_launch_server"
            com.adcolony.sdk.C0723a.m192a((java.lang.String) r1, (com.adcolony.sdk.C0865j0) r6)
            com.adcolony.sdk.k$b0 r6 = new com.adcolony.sdk.k$b0
            r6.<init>(r4)
            java.lang.String r1 = "Crypto.sha1"
            com.adcolony.sdk.C0723a.m192a((java.lang.String) r1, (com.adcolony.sdk.C0865j0) r6)
            com.adcolony.sdk.k$a r6 = new com.adcolony.sdk.k$a
            r6.<init>(r4)
            java.lang.String r1 = "Crypto.crc32"
            com.adcolony.sdk.C0723a.m192a((java.lang.String) r1, (com.adcolony.sdk.C0865j0) r6)
            com.adcolony.sdk.k$b r6 = new com.adcolony.sdk.k$b
            r6.<init>(r4)
            java.lang.String r1 = "Crypto.uuid"
            com.adcolony.sdk.C0723a.m192a((java.lang.String) r1, (com.adcolony.sdk.C0865j0) r6)
            com.adcolony.sdk.k$c r6 = new com.adcolony.sdk.k$c
            r6.<init>()
            java.lang.String r1 = "Device.query_advertiser_info"
            com.adcolony.sdk.C0723a.m192a((java.lang.String) r1, (com.adcolony.sdk.C0865j0) r6)
            com.adcolony.sdk.k$d r6 = new com.adcolony.sdk.k$d
            r6.<init>()
            java.lang.String r1 = "AdColony.controller_version"
            com.adcolony.sdk.C0723a.m192a((java.lang.String) r1, (com.adcolony.sdk.C0865j0) r6)
            com.adcolony.sdk.k$e r6 = new com.adcolony.sdk.k$e
            r6.<init>()
            java.lang.String r1 = "AdColony.provide_signals"
            com.adcolony.sdk.C0723a.m192a((java.lang.String) r1, (com.adcolony.sdk.C0865j0) r6)
            com.adcolony.sdk.k$f r6 = new com.adcolony.sdk.k$f
            r6.<init>()
            java.lang.String r1 = "AdColony.odt_calculate"
            com.adcolony.sdk.C0723a.m192a((java.lang.String) r1, (com.adcolony.sdk.C0865j0) r6)
            com.adcolony.sdk.k$g r6 = new com.adcolony.sdk.k$g
            r6.<init>(r4)
            java.lang.String r1 = "AdColony.odt_cache"
            com.adcolony.sdk.C0723a.m192a((java.lang.String) r1, (com.adcolony.sdk.C0865j0) r6)
            com.adcolony.sdk.k$h r6 = new com.adcolony.sdk.k$h
            r6.<init>()
            java.lang.String r1 = "AdColony.heartbeat"
            com.adcolony.sdk.C0723a.m192a((java.lang.String) r1, (com.adcolony.sdk.C0865j0) r6)
            com.adcolony.sdk.v0 r6 = r4.f568h
            int r6 = com.adcolony.sdk.C1047z0.m1250b((com.adcolony.sdk.C0992v0) r6)
            if (r6 != r0) goto L_0x01df
            r1 = r0
            goto L_0x01e0
        L_0x01df:
            r1 = r5
        L_0x01e0:
            r4.f545J = r1
            r1 = 2
            if (r6 != r1) goto L_0x01e6
            r5 = r0
        L_0x01e6:
            r4.f546K = r5
            com.adcolony.sdk.k$i r5 = new com.adcolony.sdk.k$i
            r5.<init>()
            com.adcolony.sdk.C1047z0.m1259b((java.lang.Runnable) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0866k.mo10881a(com.adcolony.sdk.AdColonyAppOptions, boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m683b() {
        int i = this.f559X - 1;
        this.f559X = i;
        if (i == 0) {
            mo10873P();
        }
    }

    /* renamed from: b */
    private void m684b(C0832f1 f1Var) {
        if (!C0899l.f618H) {
            C0832f1 f = C0773c0.m391f(f1Var, "logging");
            C0835g0.f483h = C0773c0.m363a(f, "send_level", 1);
            C0835g0.f481f = C0773c0.m382b(f, "log_private");
            C0835g0.f482g = C0773c0.m363a(f, "print_level", 3);
            this.f569i.mo10829b(C0773c0.m366a(f, "modules"));
            this.f569i.mo10831c(C0773c0.m390e(f, "included_fields"));
        }
        C0832f1 f2 = C0773c0.m391f(f1Var, "metadata");
        mo10905n().mo11030a(f2);
        mo10915x().mo11108a(C0773c0.m389d(f2, "session_timeout"));
        f535a0 = C0773c0.m393h(f1Var, "pie");
        this.f586z = C0773c0.m393h(C0773c0.m391f(f1Var, "controller"), "version");
        this.f553R = C0773c0.m364a(f2, "signals_timeout", this.f553R);
        this.f554S = C0773c0.m364a(f2, "calculate_odt_timeout", this.f554S);
        this.f555T = C0773c0.m377a(f2, "async_odt_query", this.f555T);
        this.f556U = C0773c0.m364a(f2, "ad_request_timeout", this.f556U);
        this.f557V = C0773c0.m364a(f2, "controller_heartbeat_interval", this.f557V);
        this.f558W = C0773c0.m364a(f2, "controller_heartbeat_timeout", this.f558W);
        this.f560Y = C0773c0.m377a(f2, "enable_compression", false);
        C0988v.m1089a().mo11145a(f2.mo10807n("odt_config"), (C1013x<C0923n0>) new C0889r(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        new java.io.File(r3.f568h.mo11153a() + "026ae9c9824b3e483fa6c71fa88f57ae27816141").delete();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x002f */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m689c(com.adcolony.sdk.C0832f1 r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "controller"
            com.adcolony.sdk.f1 r1 = com.adcolony.sdk.C0773c0.m391f(r4, r1)     // Catch:{ Exception -> 0x002f }
            java.lang.String r2 = "url"
            java.lang.String r2 = com.adcolony.sdk.C0773c0.m393h(r1, r2)     // Catch:{ Exception -> 0x002f }
            r3.f583w = r2     // Catch:{ Exception -> 0x002f }
            java.lang.String r2 = "sha1"
            java.lang.String r1 = com.adcolony.sdk.C0773c0.m393h(r1, r2)     // Catch:{ Exception -> 0x002f }
            r3.f584x = r1     // Catch:{ Exception -> 0x002f }
            java.lang.String r1 = "status"
            java.lang.String r1 = com.adcolony.sdk.C0773c0.m393h(r4, r1)     // Catch:{ Exception -> 0x002f }
            r3.f585y = r1     // Catch:{ Exception -> 0x002f }
            r3.m684b((com.adcolony.sdk.C0832f1) r4)     // Catch:{ Exception -> 0x002f }
            boolean r4 = com.adcolony.sdk.AdColonyEventTracker.m129a()     // Catch:{ Exception -> 0x002f }
            if (r4 == 0) goto L_0x004e
            com.adcolony.sdk.AdColonyEventTracker.m131b()     // Catch:{ Exception -> 0x002f }
            goto L_0x004e
        L_0x002f:
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x004e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004e }
            r1.<init>()     // Catch:{ Exception -> 0x004e }
            com.adcolony.sdk.v0 r2 = r3.f568h     // Catch:{ Exception -> 0x004e }
            java.lang.String r2 = r2.mo11153a()     // Catch:{ Exception -> 0x004e }
            r1.append(r2)     // Catch:{ Exception -> 0x004e }
            java.lang.String r2 = "026ae9c9824b3e483fa6c71fa88f57ae27816141"
            r1.append(r2)     // Catch:{ Exception -> 0x004e }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x004e }
            r4.<init>(r1)     // Catch:{ Exception -> 0x004e }
            r4.delete()     // Catch:{ Exception -> 0x004e }
        L_0x004e:
            java.lang.String r4 = r3.f585y
            java.lang.String r1 = "disable"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x0095
            boolean r4 = com.adcolony.sdk.C0899l.f618H
            if (r4 != 0) goto L_0x0095
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x007b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007b }
            r1.<init>()     // Catch:{ Exception -> 0x007b }
            com.adcolony.sdk.v0 r2 = r3.f568h     // Catch:{ Exception -> 0x007b }
            java.lang.String r2 = r2.mo11153a()     // Catch:{ Exception -> 0x007b }
            r1.append(r2)     // Catch:{ Exception -> 0x007b }
            java.lang.String r2 = "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5"
            r1.append(r2)     // Catch:{ Exception -> 0x007b }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x007b }
            r4.<init>(r1)     // Catch:{ Exception -> 0x007b }
            r4.delete()     // Catch:{ Exception -> 0x007b }
        L_0x007b:
            com.adcolony.sdk.e0$a r4 = new com.adcolony.sdk.e0$a
            r4.<init>()
            java.lang.String r1 = "Launch server response with disabled status. Disabling AdColony "
            com.adcolony.sdk.e0$a r4 = r4.mo10746a((java.lang.String) r1)
            java.lang.String r1 = "until next launch."
            com.adcolony.sdk.e0$a r4 = r4.mo10746a((java.lang.String) r1)
            com.adcolony.sdk.e0 r1 = com.adcolony.sdk.C0826e0.f460g
            r4.mo10747a((com.adcolony.sdk.C0826e0) r1)
            com.adcolony.sdk.AdColony.disable()
            return r0
        L_0x0095:
            java.lang.String r4 = r3.f583w
            java.lang.String r1 = ""
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x00a7
            java.lang.String r4 = r3.f585y
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x00c2
        L_0x00a7:
            boolean r4 = com.adcolony.sdk.C0899l.f618H
            if (r4 != 0) goto L_0x00c2
            com.adcolony.sdk.e0$a r4 = new com.adcolony.sdk.e0$a
            r4.<init>()
            java.lang.String r1 = "Missing controller status or URL. Disabling AdColony until next "
            com.adcolony.sdk.e0$a r4 = r4.mo10746a((java.lang.String) r1)
            java.lang.String r1 = "launch."
            com.adcolony.sdk.e0$a r4 = r4.mo10746a((java.lang.String) r1)
            com.adcolony.sdk.e0 r1 = com.adcolony.sdk.C0826e0.f462i
            r4.mo10747a((com.adcolony.sdk.C0826e0) r1)
            return r0
        L_0x00c2:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0866k.m689c(com.adcolony.sdk.f1):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10887b(AdColonyAppOptions adColonyAppOptions) {
        this.f578r = adColonyAppOptions;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo10890c(boolean z) {
        this.f537B = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0790d mo10889c() {
        if (this.f564d == null) {
            C0790d dVar = new C0790d();
            this.f564d = dVar;
            dVar.mo10725h();
        }
        return this.f564d;
    }

    /* renamed from: a */
    private boolean m680a(boolean z) {
        return m681a(z, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m681a(boolean z, boolean z2) {
        if (!C0723a.m195c()) {
            return false;
        }
        this.f544I = z2;
        this.f541F = z;
        if (z && !z2) {
            if (!m664L()) {
                return false;
            }
            this.f544I = true;
        }
        m663K();
        return true;
    }

    /* renamed from: a */
    private boolean m674a(C0832f1 f1Var) {
        if (!this.f541F) {
            return true;
        }
        C0832f1 f1Var2 = this.f580t;
        if (f1Var2 != null && C0773c0.m393h(C0773c0.m391f(f1Var2, "controller"), "sha1").equals(C0773c0.m393h(C0773c0.m391f(f1Var, "controller"), "sha1"))) {
            return false;
        }
        new C0826e0.C0827a().mo10746a("Controller sha1 does not match, downloading new controller.").mo10747a(C0826e0.f460g);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m671a(C0850h0 h0Var) {
        mo10885a(C0773c0.m389d(h0Var.mo10834a(), "id"));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m673a(C0960s sVar) {
        if (sVar.f765n) {
            C0832f1 a = C0773c0.m369a(sVar.f764m, "Parsing launch response");
            C0773c0.m376a(a, SmaatoSdk.KEY_SDK_VERSION, mo10905n().mo11018I());
            C0773c0.m395j(a, this.f568h.mo11153a() + "026ae9c9824b3e483fa6c71fa88f57ae27816141");
            if (m689c(a)) {
                if (m674a(a)) {
                    C0832f1 b = C0773c0.m379b();
                    C0773c0.m376a(b, "url", this.f583w);
                    C0773c0.m376a(b, "filepath", this.f568h.mo11153a() + "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5");
                    this.f562b.mo11104a(new C0960s(new C0850h0("WebServices.download", 0, b), new C0885n()));
                }
                this.f580t = a;
            } else if (!this.f541F) {
                new C0826e0.C0827a().mo10746a("Incomplete or disabled launch server response. ").mo10746a("Disabling AdColony until next launch.").mo10747a(C0826e0.f461h);
                mo10888b(true);
            }
        } else {
            m668S();
        }
    }

    /* renamed from: a */
    private boolean m679a(String str) {
        Context a = C0723a.m186a();
        if (a == null) {
            return false;
        }
        File file = new File(a.getFilesDir().getAbsolutePath() + "/adc3/" + "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5");
        if (file.exists()) {
            return C1047z0.m1246a(str, file);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10877a() {
        this.f564d.mo10708a();
        mo10873P();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10880a(AdColonyAppOptions adColonyAppOptions) {
        this.f539D.mo10763a(false);
        this.f564d.mo10716b();
        mo10875R();
        AdColony.m88a(C0723a.m186a(), adColonyAppOptions);
        mo10876T();
        this.f581u.clear();
        this.f578r = adColonyAppOptions;
        this.f561a.mo10844a();
        m681a(true, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo10886a(C0898k0 k0Var) {
        this.f582v.remove(Integer.valueOf(k0Var.getModuleId()));
        return this.f561a.mo10848b(k0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo10885a(int i) {
        this.f582v.remove(Integer.valueOf(i));
        return this.f561a.mo10847b(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10883a(AdColonyRewardListener adColonyRewardListener) {
        this.f576p = adColonyRewardListener;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10884a(C0761c cVar) {
        this.f572l = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10879a(AdColonyAdView adColonyAdView) {
        this.f574n = adColonyAdView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10882a(AdColonyInterstitial adColonyInterstitial) {
        this.f575o = adColonyInterstitial;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10878a(long j) {
        this.f539D.mo10762a(j);
    }
}
