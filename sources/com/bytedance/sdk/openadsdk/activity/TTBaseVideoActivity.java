package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.adexpress.dynamic.C2620c;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.component.utils.C2923x;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.common.C3160c;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.p141a.C3218a;
import com.bytedance.sdk.openadsdk.component.reward.p141a.C3220b;
import com.bytedance.sdk.openadsdk.component.reward.p141a.C3223c;
import com.bytedance.sdk.openadsdk.component.reward.p141a.C3232e;
import com.bytedance.sdk.openadsdk.component.reward.p141a.C3233f;
import com.bytedance.sdk.openadsdk.component.reward.p142b.C3255a;
import com.bytedance.sdk.openadsdk.component.reward.p142b.C3257b;
import com.bytedance.sdk.openadsdk.component.reward.p142b.C3262c;
import com.bytedance.sdk.openadsdk.component.reward.view.C3317a;
import com.bytedance.sdk.openadsdk.component.reward.view.C3320b;
import com.bytedance.sdk.openadsdk.component.reward.view.C3321c;
import com.bytedance.sdk.openadsdk.component.reward.view.C3322d;
import com.bytedance.sdk.openadsdk.component.reward.view.FullRewardExpressView;
import com.bytedance.sdk.openadsdk.core.C3457h;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.C3706z;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3545e;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3546f;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3552j;
import com.bytedance.sdk.openadsdk.core.p144b.C3360b;
import com.bytedance.sdk.openadsdk.core.p144b.C3362c;
import com.bytedance.sdk.openadsdk.core.p144b.C3365e;
import com.bytedance.sdk.openadsdk.core.p149e.C3409g;
import com.bytedance.sdk.openadsdk.core.p149e.C3418l;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.p149e.C3434p;
import com.bytedance.sdk.openadsdk.core.p153i.C3471f;
import com.bytedance.sdk.openadsdk.core.p154j.p155a.C3474a;
import com.bytedance.sdk.openadsdk.core.video.p162c.C3622b;
import com.bytedance.sdk.openadsdk.core.video.p162c.C3623c;
import com.bytedance.sdk.openadsdk.core.widget.C3680a;
import com.bytedance.sdk.openadsdk.multipro.aidl.C3912a;
import com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3917a;
import com.bytedance.sdk.openadsdk.p128b.C3090e;
import com.bytedance.sdk.openadsdk.p169g.C3742b;
import com.bytedance.sdk.openadsdk.p169g.C3744d;
import com.bytedance.sdk.openadsdk.p169g.C3745e;
import com.bytedance.sdk.openadsdk.p169g.C3746f;
import com.bytedance.sdk.openadsdk.p169g.C3747g;
import com.bytedance.sdk.openadsdk.p170h.C3753b;
import com.bytedance.sdk.openadsdk.p170h.p171a.C3752b;
import com.bytedance.sdk.openadsdk.p178l.C3886o;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import com.bytedance.sdk.openadsdk.p178l.C3904y;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.smaato.sdk.video.vast.model.ErrorCode;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public abstract class TTBaseVideoActivity extends Activity implements C2923x.C2924a, C3622b, C3623c, C3746f {

    /* renamed from: A */
    protected final AtomicBoolean f6759A;

    /* renamed from: B */
    protected C3680a f6760B;

    /* renamed from: C */
    protected IListenerManager f6761C;

    /* renamed from: D */
    protected String f6762D;

    /* renamed from: E */
    protected C3747g f6763E;

    /* renamed from: F */
    boolean f6764F;

    /* renamed from: G */
    boolean f6765G;

    /* renamed from: H */
    protected boolean f6766H;

    /* renamed from: I */
    ProgressBar f6767I;

    /* renamed from: J */
    protected int f6768J;

    /* renamed from: K */
    String f6769K;

    /* renamed from: L */
    protected C3255a f6770L;

    /* renamed from: M */
    protected boolean f6771M;

    /* renamed from: N */
    public AtomicBoolean f6772N;

    /* renamed from: O */
    public int f6773O;

    /* renamed from: P */
    protected C3745e f6774P;

    /* renamed from: Q */
    protected C3744d f6775Q;

    /* renamed from: R */
    private C3365e f6776R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public Double f6777S;

    /* renamed from: T */
    private long f6778T;

    /* renamed from: U */
    private AtomicBoolean f6779U;

    /* renamed from: V */
    private boolean f6780V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public boolean f6781W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public float f6782X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public int f6783Y;

    /* renamed from: Z */
    private int f6784Z;

    /* renamed from: a */
    protected final String f6785a;

    /* renamed from: aa */
    private int f6786aa;

    /* renamed from: ab */
    private boolean f6787ab;

    /* renamed from: ac */
    private AtomicBoolean f6788ac;

    /* renamed from: ad */
    private AtomicBoolean f6789ad;
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public C3160c f6790ae;

    /* renamed from: af */
    private LinearLayout f6791af;
    /* access modifiers changed from: private */

    /* renamed from: ag */
    public boolean f6792ag;

    /* renamed from: ah */
    private int f6793ah;

    /* renamed from: b */
    Context f6794b;

    /* renamed from: c */
    C3431n f6795c;

    /* renamed from: d */
    String f6796d;

    /* renamed from: e */
    TTAdDislikeDialog f6797e;

    /* renamed from: f */
    TTAdDislikeToast f6798f;

    /* renamed from: g */
    public AtomicBoolean f6799g;

    /* renamed from: h */
    public AtomicBoolean f6800h;

    /* renamed from: i */
    C3322d f6801i;

    /* renamed from: j */
    C3317a f6802j;

    /* renamed from: k */
    C3223c f6803k;

    /* renamed from: l */
    C3320b f6804l;

    /* renamed from: m */
    C3232e f6805m;

    /* renamed from: n */
    C3218a f6806n;

    /* renamed from: o */
    C3233f f6807o;

    /* renamed from: p */
    C3220b f6808p;

    /* renamed from: q */
    final C2923x f6809q;

    /* renamed from: r */
    boolean f6810r;

    /* renamed from: s */
    int f6811s;

    /* renamed from: t */
    int f6812t;

    /* renamed from: u */
    protected int f6813u;

    /* renamed from: v */
    final AtomicBoolean f6814v;

    /* renamed from: w */
    final AtomicBoolean f6815w;

    /* renamed from: x */
    final AtomicBoolean f6816x;

    /* renamed from: y */
    final AtomicBoolean f6817y;

    /* renamed from: z */
    final AtomicBoolean f6818z;

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo18320A() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public abstract void mo18327H();

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public abstract boolean mo18328I();

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public boolean mo18329J() {
        return false;
    }

    /* renamed from: e */
    public void mo18347e() {
    }

    public TTBaseVideoActivity() {
        this.f6785a = mo18328I() ? "rewarded_video" : "fullscreen_interstitial_ad";
        this.f6777S = null;
        this.f6778T = 0;
        this.f6779U = new AtomicBoolean(false);
        this.f6799g = new AtomicBoolean(false);
        this.f6800h = new AtomicBoolean(false);
        this.f6801i = mo18329J() ? new C3322d(this) : new C3321c(this);
        this.f6802j = new C3317a(this);
        this.f6803k = new C3223c(this);
        this.f6804l = new C3320b(this);
        this.f6805m = new C3232e(this);
        this.f6806n = new C3218a(this);
        this.f6807o = new C3233f(this);
        this.f6808p = new C3220b(this);
        this.f6809q = new C2923x(Looper.getMainLooper(), this);
        this.f6810r = true;
        this.f6813u = 0;
        this.f6814v = new AtomicBoolean(false);
        this.f6815w = new AtomicBoolean(false);
        this.f6816x = new AtomicBoolean(false);
        this.f6817y = new AtomicBoolean(false);
        this.f6818z = new AtomicBoolean(false);
        this.f6759A = new AtomicBoolean(false);
        this.f6780V = false;
        this.f6766H = false;
        this.f6768J = -1;
        this.f6769K = "video_player";
        this.f6781W = false;
        this.f6783Y = 1;
        this.f6787ab = true;
        this.f6772N = new AtomicBoolean(false);
        this.f6788ac = new AtomicBoolean(false);
        this.f6789ad = new AtomicBoolean(false);
        this.f6793ah = 0;
        this.f6774P = new C3745e() {
            /* renamed from: a */
            public void mo18400a() {
                TTBaseVideoActivity.this.mo18320A();
            }
        };
        this.f6775Q = new C3744d() {
            /* renamed from: a */
            public void mo18402a(int i) {
            }

            /* renamed from: b */
            public void mo18403b() {
            }

            /* renamed from: a */
            public void mo18401a() {
                if (!TTBaseVideoActivity.this.isFinishing()) {
                    if ((TTBaseVideoActivity.this.f6795c == null || TTBaseVideoActivity.this.f6795c.mo19563aG()) && TTBaseVideoActivity.this.f6795c != null && !C3434p.m10495g(TTBaseVideoActivity.this.f6795c)) {
                        TTBaseVideoActivity.this.f6809q.removeMessages(800);
                        TTBaseVideoActivity.this.f6809q.sendMessage(TTBaseVideoActivity.this.mo18430e(1));
                    }
                }
            }
        };
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!TTAdSdk.isInitSuccess()) {
            finish();
        }
        mo18332a(getIntent());
        mo18333a(bundle);
        try {
            C3513m.m10965a(this);
            this.f6813u = C3904y.m12882d(this, C3904y.m12893j(this));
            requestWindowFeature(1);
            getWindow().addFlags(16777216);
        } catch (Throwable unused) {
        }
        if (bundle != null && bundle.getLong("video_current") > 0) {
            this.f6805m.mo18979b(bundle.getLong("video_current", 0));
        }
        this.f6794b = this;
        C3747g gVar = new C3747g(getApplicationContext());
        this.f6763E = gVar;
        gVar.mo20529a((C3746f) this);
        this.f6768J = this.f6763E.mo20538g();
        this.f6763E.mo20536e();
        getWindow().addFlags(128);
        C2905l.m8111b("onVolumeChanged", "onCreate >>>>>> mVolume = " + this.f6768J);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18331a() {
        mo18351h();
        this.f6803k.mo18943b(this.f6810r);
        mo18339b();
        if (!this.f6795c.mo19589aw()) {
            this.f6807o.mo19031h();
            String str = mo18328I() ? "reward_endcard" : "fullscreen_endcard";
            mo18341b(str);
            mo18334a(str);
        }
        mo18353j();
        if (C3434p.m10497i(this.f6795c)) {
            this.f6808p.mo18927e();
        }
        if (C3418l.m10268c(this.f6795c)) {
            this.f6809q.sendEmptyMessageDelayed(500, 100);
        }
        this.f6811s = (int) this.f6805m.mo18963C();
        this.f6801i.mo19222a(mo18350g(), this.f6782X == 100.0f);
        this.f6802j.mo19191c();
        mo18369p();
        mo18327H();
        mo18429M();
        mo18358o();
        C3431n nVar = this.f6795c;
        if (nVar != null && nVar.mo19590ax() != null && this.f6795c.mo19590ax().mo19887a() != null) {
            this.f6795c.mo19590ax().mo19887a().mo19946a(0);
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z || !this.f6779U.get()) {
            this.f6778T = System.currentTimeMillis();
            return;
        }
        C3090e.m8913a((System.currentTimeMillis() - this.f6778T) + "", this.f6795c, this.f6785a, this.f6805m.mo18966a());
        this.f6778T = 0;
    }

    /* renamed from: M */
    private void mo18429M() {
        if (!mo18328I()) {
            if (C3262c.m9622a(this.f6795c)) {
                C3262c cVar = new C3262c(this, this.f6795c, this.f6784Z, this.f6786aa);
                this.f6770L = cVar;
                cVar.mo19083a(this.f6803k, this.f6801i);
                this.f6770L.mo19085a(this.f6805m.mo19006z());
                this.f6770L.mo19081a(this.f6783Y);
                this.f6770L.mo19080a(this.f6782X);
                this.f6770L.mo19084a(this.f6776R);
            } else if (C3257b.m9600c(this.f6795c)) {
                C3257b bVar = new C3257b(this, this.f6795c, this.f6784Z, this.f6786aa);
                this.f6770L = bVar;
                bVar.mo19083a(this.f6803k, this.f6801i);
                this.f6770L.mo19081a(this.f6783Y);
                this.f6770L.mo19080a(this.f6782X);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo18339b() {
        if (C3434p.m10489a(this.f6795c) && this.f6768J == 0) {
            this.f6810r = true;
            this.f6803k.mo18943b(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo18343c() {
        if (C3434p.m10498j(this.f6795c) && this.f6810r) {
            this.f6803k.mo18943b(true);
            this.f6763E.mo20530a(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo18345d() {
        this.f6803k.mo18934a();
        this.f6803k.mo18940a(mo18328I(), this.f6795c);
        if (this.f6795c.mo19589aw()) {
            this.f6803k.mo18939a(false);
        } else {
            this.f6803k.mo18939a(this.f6795c.mo19582ap());
        }
        if (C3434p.m10489a(this.f6795c)) {
            this.f6807o.mo19024c().setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            this.f6807o.mo19026d().setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            this.f6803k.mo18946c(true);
            if (C3434p.m10497i(this.f6795c)) {
                this.f6801i.mo19224b();
                C3904y.m12853a((View) this.f6807o.mo19024c(), 4);
                C3904y.m12853a((View) this.f6807o.mo19026d(), 0);
            }
        }
        if (!C3418l.m10268c(this.f6795c) && !C3418l.m10266b(this.f6795c)) {
            this.f6801i.mo19212a(C3904y.m12886e(this.f6794b, (float) this.f6784Z), C3904y.m12886e(this.f6794b, (float) this.f6786aa));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public boolean mo18488N() {
        return this.f6795c.mo19589aw() || this.f6795c.mo19570ad() == 15 || this.f6795c.mo19570ad() == 5 || this.f6795c.mo19570ad() == 50;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18334a(String str) {
        this.f6807o.mo19017a(str, (C3233f.C3245a) new C3233f.C3245a() {
            /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|(1:9)|10|11|(1:20)(2:15|17)) */
            /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
                return;
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0036 */
            /* JADX WARNING: Removed duplicated region for block: B:15:0x004a A[Catch:{ all -> 0x0072 }] */
            /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo18381a(android.webkit.WebView r4, java.lang.String r5) {
                /*
                    r3 = this;
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0036 }
                    com.bytedance.sdk.openadsdk.core.e.n r4 = r4.f6795c     // Catch:{ all -> 0x0036 }
                    boolean r4 = com.bytedance.sdk.openadsdk.core.p149e.C3434p.m10497i(r4)     // Catch:{ all -> 0x0036 }
                    if (r4 == 0) goto L_0x0036
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0036 }
                    boolean r4 = r4.isFinishing()     // Catch:{ all -> 0x0036 }
                    if (r4 != 0) goto L_0x0036
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0036 }
                    com.bytedance.sdk.openadsdk.core.e.n r4 = r4.f6795c     // Catch:{ all -> 0x0036 }
                    boolean r4 = r4.mo19563aG()     // Catch:{ all -> 0x0036 }
                    if (r4 == 0) goto L_0x0036
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0036 }
                    com.bytedance.sdk.openadsdk.core.e.n r4 = r4.f6795c     // Catch:{ all -> 0x0036 }
                    boolean r4 = com.bytedance.sdk.openadsdk.core.p149e.C3434p.m10495g(r4)     // Catch:{ all -> 0x0036 }
                    if (r4 != 0) goto L_0x0036
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0036 }
                    com.bytedance.sdk.component.utils.x r4 = r4.f6809q     // Catch:{ all -> 0x0036 }
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r5 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0036 }
                    r0 = 0
                    android.os.Message r5 = r5.mo18430e((int) r0)     // Catch:{ all -> 0x0036 }
                    r0 = 1000(0x3e8, double:4.94E-321)
                    r4.sendMessageDelayed(r5, r0)     // Catch:{ all -> 0x0036 }
                L_0x0036:
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.component.reward.a.f r4 = r4.f6807o     // Catch:{ all -> 0x0072 }
                    boolean r4 = r4.mo19033j()     // Catch:{ all -> 0x0072 }
                    if (r4 == 0) goto L_0x0072
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.core.e.n r4 = r4.f6795c     // Catch:{ all -> 0x0072 }
                    boolean r4 = com.bytedance.sdk.openadsdk.core.p149e.C3434p.m10497i(r4)     // Catch:{ all -> 0x0072 }
                    if (r4 == 0) goto L_0x0072
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.component.reward.a.b r4 = r4.f6808p     // Catch:{ all -> 0x0072 }
                    r4.mo18921b()     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.component.reward.a.f r4 = r4.f6807o     // Catch:{ all -> 0x0072 }
                    r5 = 1
                    r4.mo19023b((boolean) r5)     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.component.reward.a.f r4 = r4.f6807o     // Catch:{ all -> 0x0072 }
                    r4.mo19025c((boolean) r5)     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0072 }
                    android.content.Context r4 = r4.f6794b     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r5 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.core.e.n r5 = r5.f6795c     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r0 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0072 }
                    java.lang.String r0 = r0.f6785a     // Catch:{ all -> 0x0072 }
                    java.lang.String r1 = "py_loading_success"
                    r2 = 0
                    com.bytedance.sdk.openadsdk.p128b.C3090e.m8923c((android.content.Context) r4, (com.bytedance.sdk.openadsdk.core.p149e.C3431n) r5, (java.lang.String) r0, (java.lang.String) r1, (org.json.JSONObject) r2)     // Catch:{ all -> 0x0072 }
                L_0x0072:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.C29651.mo18381a(android.webkit.WebView, java.lang.String):void");
            }

            /* renamed from: a */
            public void mo18382a(WebView webView, String str, Bitmap bitmap) {
                if (!TTBaseVideoActivity.this.f6781W && C3434p.m10497i(TTBaseVideoActivity.this.f6795c)) {
                    boolean unused = TTBaseVideoActivity.this.f6781W = true;
                    TTBaseVideoActivity.this.f6808p.mo18911a(TTBaseVideoActivity.this.f6812t, TTBaseVideoActivity.this.f6795c, TTBaseVideoActivity.this.mo18328I());
                    TTBaseVideoActivity.this.f6809q.sendEmptyMessageDelayed(600, (long) (TTBaseVideoActivity.this.f6808p.mo18932j() * 1000));
                    Message obtain = Message.obtain();
                    obtain.what = ErrorCode.UNDEFINED_ERROR;
                    obtain.arg1 = TTBaseVideoActivity.this.f6808p.mo18932j();
                    TTBaseVideoActivity.this.f6809q.sendMessage(obtain);
                    TTBaseVideoActivity.this.f6808p.mo18928f();
                    TTBaseVideoActivity.this.mo18348f();
                    TTBaseVideoActivity.this.f6808p.mo18930h();
                }
            }

            /* renamed from: a */
            public void mo18380a(WebView webView, int i) {
                try {
                    if (C3434p.m10497i(TTBaseVideoActivity.this.f6795c) && TTBaseVideoActivity.this.f6795c.mo19563aG() && !TTBaseVideoActivity.this.isFinishing()) {
                        TTBaseVideoActivity.this.f6808p.mo18910a(i);
                    } else if (TTBaseVideoActivity.this.f6792ag && TTBaseVideoActivity.this.f6790ae != null) {
                        TTBaseVideoActivity.this.f6790ae.mo18791a(webView, i);
                    }
                } catch (Throwable unused) {
                }
            }
        });
        if (C3434p.m10497i(this.f6795c)) {
            C3233f fVar = this.f6807o;
            fVar.mo19012a(fVar.mo19026d());
            this.f6808p.mo18913a((DownloadListener) new DownloadListener() {
                public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                    TTBaseVideoActivity.this.f6806n.mo18908b();
                    TTBaseVideoActivity.this.mo18428L();
                }
            });
        }
        this.f6808p.mo18918a(this.f6764F);
        this.f6807o.mo19011a((DownloadListener) new DownloadListener() {
            public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                TTBaseVideoActivity.this.f6806n.mo18908b();
                TTBaseVideoActivity.this.mo18428L();
            }
        });
    }

    /* renamed from: f */
    public void mo18348f() {
        if (!this.f6800h.getAndSet(true) || C3434p.m10497i(this.f6795c)) {
            HashMap hashMap = null;
            if (!TextUtils.isEmpty(this.f6762D)) {
                hashMap = new HashMap();
                hashMap.put("rit_scene", this.f6762D);
                View findViewById = findViewById(16908290);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("width", findViewById.getWidth());
                    jSONObject.put("height", findViewById.getHeight());
                    jSONObject.put("alpha", (double) findViewById.getAlpha());
                } catch (Throwable unused) {
                }
                hashMap.put("root_view", jSONObject.toString());
            }
            if (!this.f6779U.get() || !C3418l.m10268c(this.f6795c)) {
                this.f6779U.set(true);
                C3090e.m8899a(this.f6794b, this.f6795c, this.f6785a, (Map<String, Object>) hashMap, this.f6777S);
                mo18427K();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public String mo18350g() {
        String a = C2914t.m8151a(this, "tt_video_download_apk");
        C3431n nVar = this.f6795c;
        if (nVar == null) {
            return a;
        }
        if (!TextUtils.isEmpty(nVar.mo19530W())) {
            return this.f6795c.mo19530W();
        }
        if (this.f6795c.mo19519L() != 4) {
            return C2914t.m8151a(this, "tt_video_mobile_go_detail");
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo18351h() {
        if (this.f6808p.mo18919a() && C3434p.m10497i(this.f6795c) && C3434p.m10495g(this.f6795c)) {
            this.f6809q.sendMessageDelayed(mo18430e(2), 10000);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public boolean mo18352i() {
        return C3513m.m10973h().mo19863j(String.valueOf(this.f6812t)) != 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public Message mo18430e(int i) {
        Message obtain = Message.obtain();
        obtain.what = 800;
        obtain.arg1 = i;
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo18353j() {
        this.f6802j.mo19186a(this.f6795c);
        this.f6802j.mo19188a(mo18350g());
    }

    /* renamed from: O */
    private void m8363O() {
        C3431n nVar = this.f6795c;
        if (nVar != null) {
            C3752b e = C3752b.m12257b().mo20542a(mo18328I() ? 7 : 8).mo20547c(String.valueOf(C3898x.m12794f(nVar))).mo20551e(C3898x.m12806h(this.f6795c));
            e.mo20545b(this.f6807o.mo19037n()).mo20553f(this.f6807o.mo19038o());
            e.mo20555g(this.f6795c.mo19569ac()).mo20549d(this.f6795c.mo19532Y());
            C3753b.m12287a().mo20581f(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo18341b(String str) {
        this.f6807o.mo19016a(Boolean.valueOf(mo18328I()), this.f6762D, this.f6810r, this.f6774P, str);
        this.f6807o.mo19028e().mo20332a(this.f6801i.mo19237k()).mo20348a(this.f6764F).mo20343a(this.f6774P).mo20342a(this.f6775Q).mo20341a((C3742b) new C3742b() {
            /* renamed from: a */
            public void mo18389a(boolean z, int i, String str) {
                C2905l.m8111b("end card load finish: ", "code=" + i + " msg=" + str + " isRenderSuc=" + z);
                StringBuilder sb = new StringBuilder();
                sb.append("loadFinish:isRenderSuc = ");
                sb.append(z);
                Log.i("TTBaseVideoActivity", sb.toString());
                if (z) {
                    TTBaseVideoActivity.this.f6808p.mo18923c();
                }
                if (C3431n.m10310b(TTBaseVideoActivity.this.f6795c) && !C3434p.m10489a(TTBaseVideoActivity.this.f6795c)) {
                    C2905l.m8111b("TTBaseVideoActivity", "TimeTrackLog report from js " + z);
                    TTBaseVideoActivity.this.f6807o.mo19019a(z, i, str);
                }
            }
        });
    }

    /* renamed from: P */
    private void m8364P() {
        this.f6809q.postDelayed(new Runnable() {
            public void run() {
                try {
                    TTBaseVideoActivity.this.getWindow().getDecorView().findViewById(16908335).setVisibility(8);
                } catch (Exception unused) {
                }
            }
        }, 300);
    }

    /* renamed from: k */
    public void mo18354k() {
        C3322d dVar;
        if (!(!C3418l.m10266b(this.f6795c) || (dVar = this.f6801i) == null || dVar.f7955x == null)) {
            if (this.f6801i.f7955x.mo19484c()) {
                this.f6801i.mo19244r();
                this.f6799g.set(true);
            } else {
                this.f6789ad.set(true);
                mo18337a(true, false, true);
            }
        }
        if (C3418l.m10268c(this.f6795c)) {
            mo18337a(true, false, true);
        }
    }

    /* renamed from: l */
    public void mo18355l() {
        C3232e eVar = this.f6805m;
        if (eVar != null) {
            eVar.mo18964D();
        }
    }

    /* renamed from: m */
    public View mo18356m() {
        C3232e eVar = this.f6805m;
        if (eVar != null) {
            return eVar.mo18965E();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo18335a(boolean z) {
        mo18336a(z, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo18336a(boolean z, boolean z2) {
        mo18337a(z, z2, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo18337a(boolean z, boolean z2, boolean z3) {
        C3223c cVar;
        C3322d dVar = this.f6801i;
        if (dVar != null) {
            dVar.mo19239m();
        }
        if (z2) {
            this.f6788ac.set(true);
        }
        if (!this.f6799g.get() && (!C3418l.m10266b(this.f6795c) || !this.f6788ac.get() || !this.f6789ad.get())) {
            if (C3418l.m10266b(this.f6795c) && z3) {
                return;
            }
            if ((C3418l.m10266b(this.f6795c) || C3418l.m10268c(this.f6795c)) && (cVar = this.f6803k) != null) {
                cVar.mo18946c(false);
                mo18357n();
                return;
            }
        }
        if ((Build.VERSION.SDK_INT < 17 || !isDestroyed()) && !isFinishing()) {
            this.f6807o.mo19042s();
            this.f6769K = CampaignEx.JSON_NATIVE_VIDEO_ENDCARD;
            this.f6817y.set(false);
            this.f6818z.set(false);
            TTAdDislikeToast tTAdDislikeToast = this.f6798f;
            if (tTAdDislikeToast != null) {
                tTAdDislikeToast.mo18785a();
            }
            m8373Y();
            if (!this.f6814v.getAndSet(true)) {
                if (mo18329J() && C3434p.m10489a(this.f6795c) && z) {
                    this.f6803k.mo18948d(true);
                }
                mo18343c();
                if (!C3434p.m10497i(this.f6795c)) {
                    this.f6816x.set(z);
                    C3680a aVar = this.f6760B;
                    if (aVar != null && aVar.isShowing()) {
                        this.f6760B.dismiss();
                    }
                    if (this.f6795c.mo19589aw()) {
                        this.f6803k.mo18948d(false);
                    } else {
                        this.f6803k.mo18948d(C3434p.m10497i(this.f6795c));
                    }
                    this.f6803k.mo18946c(C3434p.m10489a(this.f6795c));
                    if (mo18329J() && C3434p.m10489a(this.f6795c) && z) {
                        this.f6803k.mo18948d(true);
                    }
                    this.f6807o.mo19043t();
                    C3322d dVar2 = this.f6801i;
                    if (!(dVar2 == null || dVar2.f7955x == null)) {
                        this.f6801i.f7955x.mo19485d();
                    }
                    if (C3431n.m10307a(this.f6795c) || this.f6807o.mo19048y() || (!C3431n.m10308a(this.f6795c, this.f6807o.mo19033j(), this.f6808p.mo18926d(), this.f6807o.mo19044u()) && !C3434p.m10489a(this.f6795c))) {
                        if (!C3431n.m10310b(this.f6795c)) {
                            C2905l.m8111b("TTBaseVideoActivity", "TimeTrackLog report 408 from backup page");
                            this.f6807o.mo19019a(false, 408, "end_card_timeout");
                        }
                        this.f6807o.mo19045v();
                        this.f6807o.mo19009a(8);
                        if (this.f6792ag) {
                            C3904y.m12853a((View) this.f6791af, 8);
                            this.f6803k.mo18945c(0);
                            this.f6801i.mo19230d(0);
                        }
                        this.f6801i.mo19225b(8);
                        if (!this.f6795c.mo19589aw()) {
                            this.f6802j.mo19190b();
                        } else if (!this.f6802j.mo19189a(this.f6805m)) {
                            finish();
                        }
                        mo18357n();
                        this.f6803k.mo18946c(false);
                        m8363O();
                        if (!mo18328I() && this.f6805m.mo18981b() && this.f6816x.get()) {
                            this.f6805m.mo18992l();
                            return;
                        }
                        return;
                    }
                    if (!C3431n.m10310b(this.f6795c) && !C3434p.m10489a(this.f6795c)) {
                        C2905l.m8111b("TTBaseVideoActivity", "TimeTrackLog report Success from Android");
                        this.f6807o.mo19019a(true, 0, (String) null);
                    }
                    this.f6807o.mo19008a(0.0f);
                    this.f6801i.mo19215a(0.0f);
                    this.f6807o.mo19009a(0);
                    if (this.f6792ag) {
                        C3904y.m12853a((View) this.f6791af, 0);
                        this.f6803k.mo18945c(8);
                        this.f6801i.mo19230d(8);
                    }
                    if (C3434p.m10489a(this.f6795c)) {
                        int au = this.f6795c.mo19587au();
                        if (C3434p.m10497i(this.f6795c)) {
                            au = (this.f6795c.mo19586at() + 1) * 1000;
                        }
                        if (au == -1) {
                            mo18357n();
                        } else if (au >= 0) {
                            this.f6809q.sendEmptyMessageDelayed(600, (long) au);
                        }
                    } else if (!C3434p.m10489a(this.f6795c)) {
                        int av = this.f6795c.mo19588av();
                        if (av == -1) {
                            mo18357n();
                        } else if (av >= 0) {
                            this.f6809q.sendEmptyMessageDelayed(600, (long) av);
                        }
                    }
                    this.f6809q.sendEmptyMessageDelayed(500, 100);
                    this.f6807o.mo19020a(this.f6810r, true);
                    this.f6807o.mo19025c(true);
                    this.f6801i.mo19225b(8);
                    this.f6807o.mo19023b(true);
                    this.f6807o.mo19028e().mo20350a("prerender_page_show", (JSONObject) null);
                }
            }
        }
    }

    /* renamed from: n */
    public void mo18357n() {
        if (!this.f6792ag) {
            this.f6803k.mo18947d();
            this.f6801i.mo19230d(0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo18358o() {
        if (C3434p.m10497i(this.f6795c)) {
            mo18335a(false);
            return;
        }
        C3255a aVar = this.f6770L;
        if (aVar != null) {
            aVar.mo19082a(this.f6801i.mo19234h());
        }
        m8365Q();
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public void m8365Q() {
        C3320b bVar;
        C3255a aVar = this.f6770L;
        if (aVar != null && !aVar.mo19087c()) {
            HashMap hashMap = new HashMap();
            if (mo18329J() && (bVar = this.f6804l) != null) {
                hashMap.put("dynamic_show_type", Integer.valueOf(bVar.mo19209i()));
            }
            if (!TextUtils.isEmpty(this.f6762D)) {
                hashMap.put("rit_scene", this.f6762D);
            }
            View findViewById = findViewById(16908290);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("width", findViewById.getWidth());
                jSONObject.put("height", findViewById.getHeight());
                jSONObject.put("alpha", (double) findViewById.getAlpha());
            } catch (Throwable unused) {
            }
            hashMap.put("root_view", jSONObject.toString());
            this.f6779U.set(true);
            C3090e.m8899a(this.f6794b, this.f6795c, this.f6785a, (Map<String, Object>) hashMap, this.f6777S);
            mo18427K();
        } else if (!mo18426a(this.f6805m.mo18988h(), false)) {
            this.f6809q.removeMessages(300);
            mo18377x();
            C3232e eVar = this.f6805m;
            eVar.mo18967a(true ^ eVar.mo18962B() ? 1 : 0, 4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo18338a(long j, boolean z, final Map<String, Object> map) {
        boolean z2 = false;
        if (!this.f6805m.mo19004x()) {
            return false;
        }
        if (C3418l.m10268c(this.f6795c)) {
            return true;
        }
        if (!z || !this.f6805m.mo19005y()) {
            m8371W();
        }
        try {
            z2 = this.f6805m.mo18978a(j, this.f6810r);
        } catch (Exception unused) {
        }
        if (z2 && !z) {
            this.f6779U.set(true);
            final View findViewById = findViewById(16908290);
            if (findViewById == null) {
                findViewById = getWindow().getDecorView();
            }
            findViewById.post(new Runnable() {
                public void run() {
                    if (!TTBaseVideoActivity.this.f6800h.getAndSet(true)) {
                        Map map = map;
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("width", findViewById.getWidth());
                            jSONObject.put("height", findViewById.getHeight());
                            jSONObject.put("alpha", (double) findViewById.getAlpha());
                            if (map == null) {
                                map = new HashMap();
                            }
                            map.put("root_view", jSONObject.toString());
                        } catch (Throwable unused) {
                        }
                        C3090e.m8899a(TTBaseVideoActivity.this.f6794b, TTBaseVideoActivity.this.f6795c, TTBaseVideoActivity.this.f6785a, (Map<String, Object>) map, TTBaseVideoActivity.this.f6777S);
                        TTBaseVideoActivity.this.mo18427K();
                    }
                }
            });
        }
        return z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo18369p() {
        if (this.f6795c != null) {
            C297519 r1 = new C3365e(this, this.f6795c, this.f6785a, mo18328I() ? 7 : 5) {
                /* renamed from: a */
                public void mo18392a(View view, float f, float f2, float f3, float f4, SparseArray<C3362c.C3363a> sparseArray, int i, int i2, int i3, boolean z) {
                    View view2 = view;
                    StringBuilder sb = new StringBuilder();
                    sb.append("ccr log, onRewardBarClick , x = ");
                    float f5 = f;
                    sb.append(f);
                    C2905l.m8111b("TTBaseVideoActivity", sb.toString());
                    if (!(TTBaseVideoActivity.this.f6795c == null || !TTBaseVideoActivity.this.f6795c.mo19589aw() || view2 == null || view.getTag() == null)) {
                        mo19312a(view.getTag().toString());
                    }
                    HashMap hashMap = new HashMap();
                    if (TTBaseVideoActivity.this.f6814v.get()) {
                        hashMap.put("click_scence", 2);
                    } else if (C3434p.m10497i(TTBaseVideoActivity.this.f6795c)) {
                        hashMap.put("click_scence", 3);
                    } else {
                        hashMap.put("click_scence", 1);
                    }
                    mo19313a((Map<String, Object>) hashMap);
                    TTBaseVideoActivity.this.onRewardBarClick(view);
                    if (view.getId() == C2914t.m8158e(TTBaseVideoActivity.this, "tt_playable_play") && C3434p.m10497i(TTBaseVideoActivity.this.f6795c)) {
                        HashMap hashMap2 = new HashMap();
                        if (TTBaseVideoActivity.this.f6795c.mo19517J() != null) {
                            hashMap2.put("playable_url", TTBaseVideoActivity.this.f6795c.mo19517J().mo15955j());
                        }
                        TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                        C3090e.m8926e((Context) tTBaseVideoActivity, tTBaseVideoActivity.f6795c, TTBaseVideoActivity.this.f6785a, "click_playable_download_button_loading", (Map<String, Object>) hashMap2);
                    }
                    TTBaseVideoActivity.this.f6806n.mo18906a(view, f, f2, f3, f4, sparseArray, i, i2, i3, new C3218a.C3219a() {
                        /* renamed from: a */
                        public void mo18394a(String str, JSONObject jSONObject) {
                            TTBaseVideoActivity.this.m8380a(str, jSONObject);
                        }

                        /* renamed from: a */
                        public void mo18393a(View view, float f, float f2, float f3, float f4, SparseArray<C3362c.C3363a> sparseArray, int i, int i2, int i3) {
                            TTBaseVideoActivity.this.m8376a(view, f, f2, f3, f4, sparseArray, i, i2, i3);
                        }
                    });
                }
            };
            this.f6776R = r1;
            r1.mo19305a(findViewById(16908290));
            this.f6776R.mo19317b(findViewById(C2914t.m8158e(C3513m.m10963a(), "tt_top_dislike")));
            if (!TextUtils.isEmpty(this.f6762D)) {
                HashMap hashMap = new HashMap();
                hashMap.put("rit_scene", this.f6762D);
                this.f6776R.mo19313a((Map<String, Object>) hashMap);
            }
            if (this.f6806n.mo18909c() != null) {
                this.f6776R.mo19311a(this.f6806n.mo18909c());
            }
            this.f6808p.mo18915a(this.f6776R);
            C297820 r9 = new C3360b(this, this.f6795c, this.f6785a, mo18328I() ? 7 : 5) {
                /* renamed from: a */
                public void mo18383a(View view, float f, float f2, float f3, float f4, SparseArray<C3362c.C3363a> sparseArray, boolean z) {
                    try {
                        TTBaseVideoActivity.this.m8376a(view, f, f2, f3, f4, sparseArray, this.f8069A, this.f8081y, this.f8082z);
                    } catch (Exception e) {
                        C2905l.m8118e("TTBaseVideoActivity", "onClickReport error :" + e.getMessage());
                    }
                }
            };
            C3322d dVar = this.f6801i;
            C3365e eVar = this.f6776R;
            dVar.mo19219a(eVar, eVar, r9, this.f6805m);
            this.f6802j.mo19185a(this.f6776R);
            this.f6802j.mo19187a(this.f6795c, this.f6785a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8376a(View view, float f, float f2, float f3, float f4, SparseArray<C3362c.C3363a> sparseArray, int i, int i2, int i3) {
        if (view != null) {
            if (view.getId() == C2914t.m8158e(this, "tt_rb_score")) {
                m8380a("click_play_star_level", (JSONObject) null);
            } else if (view.getId() == C2914t.m8158e(this, "tt_comment_vertical") || view.getId() == C2914t.m8158e(this, "tt_reward_ad_description")) {
                m8380a("click_play_star_nums", (JSONObject) null);
            } else if (view.getId() == C2914t.m8158e(this, "tt_reward_ad_appname")) {
                m8380a("click_play_source", (JSONObject) null);
            } else if (view.getId() == C2914t.m8158e(this, "tt_reward_ad_icon")) {
                m8380a("click_play_logo", (JSONObject) null);
            } else if (view.getId() == C2914t.m8158e(this, "tt_video_reward_bar") || view.getId() == C2914t.m8158e(this, "tt_click_lower_non_content_layout") || view.getId() == C2914t.m8158e(this, "tt_click_upper_non_content_layout")) {
                m8380a("click_start_play_bar", mo18370q());
            } else if (view.getId() == C2914t.m8158e(this, "tt_reward_ad_download")) {
                m8380a("click_start_play", mo18370q());
            } else if (view.getId() == C2914t.m8158e(this, "tt_video_reward_container")) {
                m8380a("click_video", mo18370q());
            } else if (view.getId() == C2914t.m8158e(this, "tt_reward_ad_download_backup") || view.getId() == C2914t.m8158e(this, "tt_reward_full_endcard_vast_image")) {
                m8380a("fallback_endcard_click", mo18370q());
            }
            m8388b(view, f, f2, f3, f4, sparseArray, i, i2, i3);
        }
    }

    /* renamed from: b */
    private void m8388b(View view, float f, float f2, float f3, float f4, SparseArray<C3362c.C3363a> sparseArray, int i, int i2, int i3) {
        HashMap hashMap;
        if (mo18371r() && this.f6795c != null && view != null) {
            if (view.getId() == C2914t.m8158e(this, "tt_rb_score") || view.getId() == C2914t.m8158e(this, "tt_comment_vertical") || view.getId() == C2914t.m8158e(this, "tt_reward_ad_appname") || view.getId() == C2914t.m8158e(this, "tt_reward_ad_icon") || view.getId() == C2914t.m8158e(this, "tt_video_reward_bar") || view.getId() == C2914t.m8158e(this, "tt_click_lower_non_content_layout") || view.getId() == C2914t.m8158e(this, "tt_click_upper_non_content_layout") || view.getId() == C2914t.m8158e(this, "tt_reward_ad_download") || view.getId() == C2914t.m8158e(this, "tt_video_reward_container") || view.getId() == C2914t.m8158e(this, "tt_reward_ad_download_backup") || view.getId() == C2914t.m8158e(this, "tt_reward_ad_description")) {
                if (!TextUtils.isEmpty(this.f6762D)) {
                    hashMap = new HashMap();
                    hashMap.put("rit_scene", this.f6762D);
                } else {
                    hashMap = null;
                }
                C3090e.m8901a(this.f6794b, "click_other", this.f6795c, new C3409g.C3411a().mo19441f(f).mo19439e(f2).mo19436d(f3).mo19433c(f4).mo19431b(System.currentTimeMillis()).mo19423a(0).mo19432b(C3904y.m12867a(this.f6801i.mo19238l())).mo19427a(C3904y.m12867a((View) null)).mo19435c(C3904y.m12880c(this.f6801i.mo19238l())).mo19438d(C3904y.m12880c((View) null)).mo19437d(i2).mo19440e(i3).mo19442f(i).mo19424a(sparseArray).mo19430b(C3457h.m10580d().mo19752b() ? 1 : 2).mo19434c(C3904y.m12890g(C3513m.m10963a())).mo19421a(C3904y.m12885e(C3513m.m10963a())).mo19429b(C3904y.m12888f(C3513m.m10963a())).mo19428a(), this.f6785a, true, (Map<String, Object>) hashMap, -1);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public JSONObject mo18370q() {
        try {
            long p = this.f6805m.mo18996p();
            int q = this.f6805m.mo18997q();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("duration", p);
                jSONObject.put("percent", q);
                return jSONObject;
            } catch (Throwable unused) {
                return jSONObject;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8380a(String str, JSONObject jSONObject) {
        Context context = this.f6794b;
        C3431n nVar = this.f6795c;
        String str2 = this.f6785a;
        if (!mo18328I()) {
            jSONObject = null;
        }
        C3090e.m8897a(context, nVar, str2, str, jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo18371r() {
        C3431n nVar = this.f6795c;
        if (nVar == null || nVar.mo19516I() == 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo18372s() {
        HashMap hashMap = new HashMap();
        if (C3434p.m10497i(this.f6795c)) {
            this.f6808p.mo18917a((Map<String, Object>) hashMap);
        }
        Context context = this.f6794b;
        C3431n nVar = this.f6795c;
        String str = this.f6785a;
        if (mo18328I()) {
            hashMap = null;
        }
        C3090e.m8918b(context, nVar, str, "click_close", (Map<String, Object>) hashMap);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo18373t() {
        this.f6812t = C3898x.m12794f(this.f6795c);
        this.f6810r = C3513m.m10973h().mo19839b(this.f6812t);
        this.f6782X = this.f6795c.mo19580an();
        if (26 != Build.VERSION.SDK_INT) {
            this.f6783Y = this.f6795c.mo19579am();
        } else if (this.f6794b.getResources().getConfiguration().orientation == 1) {
            this.f6783Y = 1;
        } else {
            this.f6783Y = 2;
        }
        if (this.f6783Y == 2 || !C3904y.m12879c((Activity) this)) {
            getWindow().addFlags(1024);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo18374u() {
        C3431n nVar = this.f6795c;
        if (nVar == null) {
            finish();
            return;
        }
        setContentView(this.f6801i.mo19214a(nVar));
        this.f6792ag = C3418l.m10270d(this.f6795c);
        mo18375v();
        this.f6801i.mo19220a(this.f6795c, this.f6785a, this.f6783Y, mo18328I(), this.f6803k);
        this.f6802j.mo19184a();
        if (!this.f6795c.mo19589aw()) {
            if (this.f6792ag) {
                m8366R();
            }
            this.f6807o.mo19014a(this.f6795c, this.f6785a, this.f6783Y, mo18328I());
            this.f6807o.mo19022b(this.f6784Z, this.f6786aa);
        }
        this.f6808p.mo18914a(this.f6807o, this.f6795c, this.f6785a, this.f6783Y);
    }

    /* renamed from: R */
    private void m8366R() {
        LinearLayout linearLayout = (LinearLayout) findViewById(C2914t.m8158e(this.f6794b, "tt_lp_new_style_container"));
        this.f6791af = linearLayout;
        C3904y.m12853a((View) linearLayout, 8);
        C3160c cVar = new C3160c(this, this.f6795c, "landingpage_endcard");
        this.f6790ae = cVar;
        cVar.mo18793c().setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTBaseVideoActivity.this.f6801i.mo19237k().performClick();
            }
        });
        this.f6791af.addView(this.f6790ae.mo18795e(), new LinearLayout.LayoutParams(-1, -1));
        this.f6807o.mo19013a(this.f6790ae);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo18375v() {
        float f;
        float f2;
        int i;
        int i2;
        if (Build.VERSION.SDK_INT != 26) {
            if (Build.VERSION.SDK_INT == 27) {
                try {
                    m8367S();
                } catch (Throwable unused) {
                }
            } else {
                m8367S();
            }
        }
        float V = m8370V();
        float U = m8369U();
        if (this.f6783Y == 2) {
            f = Math.max(V, U);
            f2 = Math.min(V, U);
        } else {
            f = Math.min(V, U);
            f2 = Math.max(V, U);
        }
        Context context = this.f6794b;
        int d = C3904y.m12882d(context, C3904y.m12893j(context));
        if (this.f6783Y != 2) {
            if (C3904y.m12879c((Activity) this)) {
                f2 -= (float) d;
            }
        } else if (C3904y.m12879c((Activity) this)) {
            f -= (float) d;
        }
        if (mo18328I()) {
            this.f6784Z = (int) f;
            this.f6786aa = (int) f2;
            return;
        }
        int i3 = 20;
        int i4 = 0;
        if (this.f6783Y != 2) {
            float f3 = this.f6782X;
            if (!(f3 == 0.0f || f3 == 100.0f)) {
                float f4 = (float) 20;
                i = (int) Math.max((f2 - (((f - f4) - f4) / f3)) / 2.0f, 0.0f);
                i4 = i;
                i2 = 20;
                float f5 = (float) i3;
                float f6 = (float) i2;
                this.f6784Z = (int) ((f - f5) - f6);
                float f7 = (float) i4;
                float f8 = (float) i;
                this.f6786aa = (int) ((f2 - f7) - f8);
                getWindow().getDecorView().setPadding(C3904y.m12886e(this, f5), C3904y.m12886e(this, f7), C3904y.m12886e(this, f6), C3904y.m12886e(this, f8));
            }
        } else {
            float f9 = this.f6782X;
            if (!(f9 == 0.0f || f9 == 100.0f)) {
                float f10 = (float) 20;
                i2 = (int) Math.max((f - (((f2 - f10) - f10) * f9)) / 2.0f, 0.0f);
                i = 20;
                i4 = 20;
                i3 = i2;
                float f52 = (float) i3;
                float f62 = (float) i2;
                this.f6784Z = (int) ((f - f52) - f62);
                float f72 = (float) i4;
                float f82 = (float) i;
                this.f6786aa = (int) ((f2 - f72) - f82);
                getWindow().getDecorView().setPadding(C3904y.m12886e(this, f52), C3904y.m12886e(this, f72), C3904y.m12886e(this, f62), C3904y.m12886e(this, f82));
            }
        }
        i2 = 0;
        i = 0;
        i3 = 0;
        float f522 = (float) i3;
        float f622 = (float) i2;
        this.f6784Z = (int) ((f - f522) - f622);
        float f722 = (float) i4;
        float f822 = (float) i;
        this.f6786aa = (int) ((f2 - f722) - f822);
        getWindow().getDecorView().setPadding(C3904y.m12886e(this, f522), C3904y.m12886e(this, f722), C3904y.m12886e(this, f622), C3904y.m12886e(this, f822));
    }

    /* renamed from: S */
    private void m8367S() {
        if (this.f6783Y != 2) {
            setRequestedOrientation(1);
        } else if (mo18376w()) {
            setRequestedOrientation(8);
        } else {
            setRequestedOrientation(0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public boolean mo18376w() {
        try {
            if (getIntent().getIntExtra("orientation_angle", 0) == 3) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: T */
    private void m8368T() {
        try {
            final boolean z = true;
            final boolean z2 = this.f6787ab && C3513m.m10973h().mo19881u() == 1;
            if (!this.f6787ab || !C3904y.m12879c((Activity) this) || Build.VERSION.SDK_INT < 19) {
                z = false;
            }
            if (z || z2) {
                this.f6809q.post(new Runnable() {
                    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c3 A[Catch:{ all -> 0x00d7 }] */
                    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d2 A[Catch:{ all -> 0x00d7 }] */
                    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public void run() {
                        /*
                            r8 = this;
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r0 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            int r0 = r0.f6783Y     // Catch:{ all -> 0x00d7 }
                            r1 = 2
                            if (r0 != r1) goto L_0x0033
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r0 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.content.res.Resources r0 = r0.getResources()     // Catch:{ all -> 0x00d7 }
                            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch:{ all -> 0x00d7 }
                            int r0 = r0.orientation     // Catch:{ all -> 0x00d7 }
                            if (r0 != r1) goto L_0x0033
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r0 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.view.Window r0 = r0.getWindow()     // Catch:{ all -> 0x00d7 }
                            android.view.View r0 = r0.getDecorView()     // Catch:{ all -> 0x00d7 }
                            int r0 = r0.getWidth()     // Catch:{ all -> 0x00d7 }
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r2 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.content.Context r2 = r2.f6794b     // Catch:{ all -> 0x00d7 }
                            int r2 = com.bytedance.sdk.openadsdk.p178l.C3904y.m12892i(r2)     // Catch:{ all -> 0x00d7 }
                            int r2 = r2 - r0
                            int r0 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x00d7 }
                            goto L_0x004e
                        L_0x0033:
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r0 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.view.Window r0 = r0.getWindow()     // Catch:{ all -> 0x00d7 }
                            android.view.View r0 = r0.getDecorView()     // Catch:{ all -> 0x00d7 }
                            int r0 = r0.getHeight()     // Catch:{ all -> 0x00d7 }
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r2 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.content.Context r2 = r2.f6794b     // Catch:{ all -> 0x00d7 }
                            int r2 = com.bytedance.sdk.openadsdk.p178l.C3904y.m12891h(r2)     // Catch:{ all -> 0x00d7 }
                            int r2 = r2 - r0
                            int r0 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x00d7 }
                        L_0x004e:
                            if (r0 != 0) goto L_0x00d7
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r0 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.view.Window r0 = r0.getWindow()     // Catch:{ all -> 0x00d7 }
                            android.view.View r0 = r0.getDecorView()     // Catch:{ all -> 0x00d7 }
                            int r2 = r0.getPaddingLeft()     // Catch:{ all -> 0x00d7 }
                            int r3 = r0.getPaddingTop()     // Catch:{ all -> 0x00d7 }
                            int r4 = r0.getPaddingRight()     // Catch:{ all -> 0x00d7 }
                            int r5 = r0.getPaddingBottom()     // Catch:{ all -> 0x00d7 }
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r6 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            int r6 = r6.f6783Y     // Catch:{ all -> 0x00d7 }
                            r7 = 1
                            if (r6 != r7) goto L_0x008c
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r6 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.content.res.Resources r6 = r6.getResources()     // Catch:{ all -> 0x00d7 }
                            android.content.res.Configuration r6 = r6.getConfiguration()     // Catch:{ all -> 0x00d7 }
                            int r6 = r6.orientation     // Catch:{ all -> 0x00d7 }
                            if (r6 != r7) goto L_0x008c
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r1 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.content.Context r1 = r1.f6794b     // Catch:{ all -> 0x00d7 }
                            float r1 = com.bytedance.sdk.openadsdk.p178l.C3904y.m12893j(r1)     // Catch:{ all -> 0x00d7 }
                        L_0x0089:
                            int r1 = (int) r1     // Catch:{ all -> 0x00d7 }
                            int r3 = r3 + r1
                            goto L_0x00bd
                        L_0x008c:
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r6 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            int r6 = r6.f6783Y     // Catch:{ all -> 0x00d7 }
                            if (r6 != r1) goto L_0x00bd
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r6 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.content.res.Resources r6 = r6.getResources()     // Catch:{ all -> 0x00d7 }
                            android.content.res.Configuration r6 = r6.getConfiguration()     // Catch:{ all -> 0x00d7 }
                            int r6 = r6.orientation     // Catch:{ all -> 0x00d7 }
                            if (r6 != r1) goto L_0x00bd
                            boolean r1 = r1     // Catch:{ all -> 0x00d7 }
                            if (r1 == 0) goto L_0x00b0
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r1 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.content.Context r1 = r1.f6794b     // Catch:{ all -> 0x00d7 }
                            float r1 = com.bytedance.sdk.openadsdk.p178l.C3904y.m12893j(r1)     // Catch:{ all -> 0x00d7 }
                            int r1 = (int) r1     // Catch:{ all -> 0x00d7 }
                            int r2 = r2 + r1
                        L_0x00b0:
                            boolean r1 = r0     // Catch:{ all -> 0x00d7 }
                            if (r1 == 0) goto L_0x00bd
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r1 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.content.Context r1 = r1.f6794b     // Catch:{ all -> 0x00d7 }
                            float r1 = com.bytedance.sdk.openadsdk.p178l.C3904y.m12893j(r1)     // Catch:{ all -> 0x00d7 }
                            goto L_0x0089
                        L_0x00bd:
                            boolean r1 = r0.isAttachedToWindow()     // Catch:{ all -> 0x00d7 }
                            if (r1 == 0) goto L_0x00c6
                            r0.setPadding(r2, r3, r4, r5)     // Catch:{ all -> 0x00d7 }
                        L_0x00c6:
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r1 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            float r1 = r1.f6782X     // Catch:{ all -> 0x00d7 }
                            r2 = 1120403456(0x42c80000, float:100.0)
                            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                            if (r1 != 0) goto L_0x00d7
                            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                            r0.setBackgroundColor(r1)     // Catch:{ all -> 0x00d7 }
                        L_0x00d7:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.C29772.run():void");
                    }
                });
            }
            this.f6787ab = false;
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f6807o.mo19046w();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        this.f6766H = true;
        C2905l.m8111b("TTBaseVideoActivity", "onResume mIsActivityShow=" + this.f6766H + " mIsMute=" + this.f6810r);
        m8368T();
        if (m8374Z()) {
            m8373Y();
        }
        if (C3434p.m10489a(this.f6795c)) {
            if (this.f6768J == 0) {
                this.f6810r = true;
            }
            if (this.f6810r) {
                this.f6763E.mo20530a(true);
                this.f6803k.mo18943b(true);
            }
        }
        if (Build.VERSION.SDK_INT > 28 || Build.VERSION.SDK_INT < 24) {
            super.onResume();
        } else {
            try {
                super.onResume();
            } catch (IllegalArgumentException e) {
                C2905l.m8115c("TTBaseVideoActivity", "super.onResume() run fail", e);
                try {
                    Field declaredField = Activity.class.getDeclaredField("mCalled");
                    declaredField.setAccessible(true);
                    declaredField.set(this, true);
                } catch (Exception e2) {
                    C2905l.m8115c("TTBaseVideoActivity", "onResume set mCalled fail", e2);
                }
            }
        }
        C3322d dVar = this.f6801i;
        if (dVar != null) {
            dVar.mo19241o();
        }
        this.f6807o.mo19036m();
        if (m8386ac()) {
            m8371W();
            this.f6805m.mo18977a(false, this, this.f6793ah != 0);
        }
        this.f6793ah++;
        if (this.f6808p.mo18931i() && C3434p.m10497i(this.f6795c)) {
            this.f6808p.mo18916a("return_foreground");
            C3680a aVar = this.f6760B;
            if ((aVar == null || !aVar.isShowing()) && this.f6808p.mo18933k() > 0) {
                Message obtain = Message.obtain();
                obtain.what = ErrorCode.UNDEFINED_ERROR;
                obtain.arg1 = this.f6808p.mo18933k();
                this.f6809q.sendMessage(obtain);
            }
        }
        mo18321B();
        C3320b bVar = this.f6804l;
        if (bVar != null) {
            bVar.mo19207g();
        }
        m8364P();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C3322d dVar = this.f6801i;
        if (dVar != null) {
            dVar.mo19243q();
        }
        this.f6766H = false;
        C2905l.m8111b("TTBaseVideoActivity", "onPause mIsActivityShow=" + this.f6766H + " mIsMute=" + this.f6810r);
        if (!this.f6817y.get()) {
            this.f6805m.mo18989i();
        }
        m8372X();
        if (C3434p.m10497i(this.f6795c)) {
            this.f6809q.removeMessages(ErrorCode.UNDEFINED_ERROR);
            this.f6809q.removeMessages(600);
            this.f6808p.mo18916a("go_background");
        }
        this.f6807o.mo19035l();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C3322d dVar = this.f6801i;
        if (dVar != null) {
            dVar.mo19242p();
        }
        C2905l.m8111b("TTBaseVideoActivity", "onStop mIsMute=" + this.f6810r + " mLast=" + this.f6763E.mo20532b() + " mVolume=" + this.f6768J);
        this.f6807o.mo19034k();
        if (C3434p.m10497i(this.f6795c)) {
            this.f6809q.removeMessages(ErrorCode.UNDEFINED_ERROR);
            this.f6809q.removeMessages(600);
            this.f6808p.mo18916a("go_background");
        }
        if (this.f6810r) {
            runOnUiThread(new Runnable() {
                public void run() {
                    if (TTBaseVideoActivity.this.f6763E.mo20532b() > 0) {
                        TTBaseVideoActivity.this.f6763E.mo20530a(false);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.f6778T > 0 && this.f6779U.get()) {
            C3090e.m8913a((System.currentTimeMillis() - this.f6778T) + "", this.f6795c, this.f6785a, this.f6805m.mo18966a());
            this.f6778T = 0;
        }
        C3320b bVar = this.f6804l;
        if (bVar != null) {
            bVar.mo19206f();
        }
        C3322d dVar = this.f6801i;
        if (dVar != null) {
            dVar.mo19240n();
        }
        TTAdDislikeToast tTAdDislikeToast = this.f6798f;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.mo18787b();
        }
        this.f6809q.removeCallbacksAndMessages((Object) null);
        C3233f fVar = this.f6807o;
        if (!(fVar == null || fVar.mo19024c() == null)) {
            C3706z.m12119a(this.f6794b, this.f6807o.mo19024c().getWebView());
            C3706z.m12120a(this.f6807o.mo19024c().getWebView());
        }
        this.f6805m.mo18983c(mo18328I());
        C3255a aVar = this.f6770L;
        if (aVar != null && !aVar.mo19086b() && !this.f6814v.get()) {
            this.f6807o.mo19040q();
        }
        C3233f fVar2 = this.f6807o;
        if (fVar2 != null) {
            fVar2.mo19032i();
        }
        C3747g gVar = this.f6763E;
        if (gVar != null) {
            gVar.mo20537f();
            this.f6763E.mo20529a((C3746f) null);
        }
        this.f6808p.mo18912a(getApplicationContext());
        this.f6801i.mo19239m();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            bundle.putString("material_meta", this.f6795c != null ? this.f6795c.mo19584ar().toString() : null);
            bundle.putString(TTAdConstant.MULTI_PROCESS_META_MD5, this.f6796d);
            bundle.putString("video_cache_url", this.f6805m.mo19006z());
            bundle.putLong("video_current", this.f6805m.mo18999s());
            bundle.putBoolean("is_mute", this.f6810r);
            bundle.putString("rit_scene", this.f6762D);
            bundle.putBoolean("has_show_skip_btn", this.f6815w.get());
            bundle.putString(TTAdConstant.CLIENT_BIDDING_AUTION_PRICE, this.f6777S == null ? "" : String.valueOf(this.f6777S));
        } catch (Throwable unused) {
        }
        super.onSaveInstanceState(bundle);
    }

    public void onBackPressed() {
        int i;
        C3223c cVar;
        C3220b bVar;
        if (C3513m.m10973h().mo19856h(this.f6812t) == 1) {
            if (mo18328I()) {
                if (C3434p.m10497i(this.f6795c)) {
                    i = C3513m.m10973h().mo19834a(String.valueOf(this.f6812t), true);
                } else {
                    i = C3513m.m10973h().mo19850f(this.f6812t);
                }
            } else if (C3434p.m10497i(this.f6795c)) {
                i = C3513m.m10973h().mo19834a(String.valueOf(this.f6812t), false);
            } else {
                i = C3513m.m10973h().mo19847e(this.f6812t);
            }
            C3322d dVar = this.f6801i;
            if (dVar != null && dVar.mo19236j()) {
                C3322d dVar2 = this.f6801i;
                if (dVar2 != null) {
                    dVar2.mo19237k().performClick();
                }
            } else if ((!this.f6814v.get() || C3434p.m10497i(this.f6795c)) && i != -1) {
                C3232e eVar = this.f6805m;
                if (((eVar != null && eVar.mo18986f() >= ((long) (i * 1000))) || ((bVar = this.f6808p) != null && bVar.mo18932j() - this.f6808p.mo18933k() >= i)) && (cVar = this.f6803k) != null) {
                    cVar.mo18941b();
                }
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C3904y.m12848a((Activity) this);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
            public void onSystemUiVisibilityChange(int i) {
                if (i == 0) {
                    try {
                        if (!TTBaseVideoActivity.this.isFinishing()) {
                            TTBaseVideoActivity.this.getWindow().getDecorView().postDelayed(new Runnable() {
                                public void run() {
                                    C3904y.m12848a((Activity) TTBaseVideoActivity.this);
                                }
                            }, 2500);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public void mo17240a(Message message) {
        int i = message.what;
        if (i == 300) {
            mo18377x();
            C3232e eVar = this.f6805m;
            eVar.mo18967a(eVar.mo18962B() ^ true ? 1 : 0, this.f6805m.mo18962B() ^ true ? 1 : 0);
            if (this.f6795c.mo19590ax() != null && this.f6795c.mo19590ax().mo19887a() != null) {
                this.f6795c.mo19590ax().mo19887a().mo19949a(C3474a.GENERAL_LINEAR_AD_ERROR);
            }
        } else if (i == 400) {
            this.f6805m.mo18993m();
            mo18336a(false, true);
        } else if (i == 500) {
            if (!C3434p.m10489a(this.f6795c)) {
                this.f6803k.mo18946c(false);
            }
            SSWebView c = this.f6807o.mo19024c();
            if (!(c == null || c.getWebView() == null)) {
                c.mo17859i();
                c.getWebView().resumeTimers();
            }
            if (this.f6807o.mo19024c() != null) {
                this.f6807o.mo19008a(1.0f);
                this.f6801i.mo19215a(1.0f);
            }
            if (!mo18328I() && this.f6805m.mo18981b() && this.f6816x.get()) {
                this.f6805m.mo18992l();
            }
        } else if (i == 600) {
            mo18357n();
        } else if (i == 800) {
            HashMap hashMap = new HashMap();
            hashMap.put("remove_loading_page_type", Integer.valueOf(message.arg1));
            if (this.f6795c.mo19517J() != null) {
                hashMap.put("playable_url", this.f6795c.mo19517J().mo15955j());
            }
            C3090e.m8926e((Context) this, this.f6795c, this.f6785a, "remove_loading_page", (Map<String, Object>) hashMap);
            this.f6809q.removeMessages(800);
            this.f6808p.mo18929g();
        } else if (i == 900 && C3434p.m10497i(this.f6795c)) {
            int i2 = message.arg1;
            if (i2 > 0) {
                this.f6803k.mo18948d(true);
                int b = this.f6808p.mo18920b(i2);
                if (b == i2) {
                    this.f6803k.mo18938a(String.valueOf(i2), (CharSequence) null);
                } else if (b > 0) {
                    this.f6803k.mo18938a(String.valueOf(i2), (CharSequence) String.format(C2914t.m8151a(this.f6794b, "tt_skip_ad_time_text"), new Object[]{Integer.valueOf(b)}));
                } else {
                    this.f6803k.mo18938a(String.valueOf(i2), (CharSequence) C2914t.m8151a(this.f6794b, "tt_txt_skip"));
                    this.f6803k.mo18949e(true);
                }
                Message obtain = Message.obtain();
                obtain.what = ErrorCode.UNDEFINED_ERROR;
                obtain.arg1 = i2 - 1;
                this.f6809q.sendMessageDelayed(obtain, 1000);
                this.f6808p.mo18924c(i2);
            } else {
                this.f6803k.mo18948d(false);
                this.f6772N.set(true);
                mo18357n();
                mo18431f(mo18328I() ? 10001 : 10002);
            }
            mo18320A();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo18377x() {
        this.f6805m.mo19000t();
        this.f6805m.mo18993m();
        mo18336a(false, true);
        if (mo18328I()) {
            mo18431f(10000);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo18378y() {
        C2923x xVar = this.f6809q;
        if (xVar != null) {
            xVar.removeMessages(ErrorCode.UNDEFINED_ERROR);
            this.f6809q.removeMessages(600);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo18379z() {
        Message obtain = Message.obtain();
        obtain.what = ErrorCode.UNDEFINED_ERROR;
        obtain.arg1 = this.f6808p.mo18933k();
        this.f6809q.sendMessageDelayed(obtain, 1000);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IListenerManager mo18330a(int i) {
        if (this.f6761C == null) {
            this.f6761C = C3917a.asInterface(C3912a.m12924a(C3513m.m10963a()).mo20782a(i));
        }
        return this.f6761C;
    }

    /* renamed from: b */
    public void mo18340b(int i) {
        if (i > 0) {
            if (this.f6768J > 0) {
                this.f6768J = i;
            } else {
                C2905l.m8111b("onVolumeChanged", "onVolumeChanged >>>> 变为非静音状态通知 h5");
                this.f6807o.mo19027d(false);
                this.f6768J = i;
                C3431n nVar = this.f6795c;
                if (!(nVar == null || nVar.mo19590ax() == null || this.f6795c.mo19590ax().mo19887a() == null || this.f6805m == null)) {
                    this.f6795c.mo19590ax().mo19887a().mo19970i(this.f6805m.mo18999s());
                }
            }
        } else if (this.f6768J > 0) {
            C2905l.m8111b("onVolumeChanged", "onVolumeChanged >>>> 变为静音状态通知 h5");
            this.f6807o.mo19027d(true);
            this.f6768J = i;
            C3431n nVar2 = this.f6795c;
            if (!(nVar2 == null || nVar2.mo19590ax() == null || this.f6795c.mo19590ax().mo19887a() == null || this.f6805m == null)) {
                this.f6795c.mo19590ax().mo19887a().mo19968h(this.f6805m.mo18999s());
            }
        } else {
            this.f6768J = i;
        }
        if (C3434p.m10498j(this.f6795c) && !this.f6814v.get()) {
            return;
        }
        if (!C3434p.m10497i(this.f6795c) && !C3434p.m10498j(this.f6795c)) {
            return;
        }
        if (this.f6763E.mo20534c()) {
            C2905l.m8111b("TTBaseVideoActivity", "onVolumeChanged by SDK mIsMute=" + this.f6810r + " mVolume=" + this.f6768J + " mLastVolume=" + this.f6763E.mo20532b());
            if (this.f6768J == 0) {
                this.f6803k.mo18943b(true);
                this.f6805m.mo18980b(true);
                return;
            }
            this.f6803k.mo18943b(false);
            this.f6805m.mo18980b(false);
            return;
        }
        this.f6763E.mo20533b(-1);
        C2905l.m8111b("TTBaseVideoActivity", "onVolumeChanged by User mIsMute=" + this.f6810r + " mVolume=" + this.f6768J + " mLastVolume=" + this.f6763E.mo20532b());
        if (!this.f6766H) {
            return;
        }
        if (this.f6768J == 0) {
            this.f6810r = true;
            this.f6803k.mo18943b(true);
            this.f6805m.mo18980b(true);
            return;
        }
        this.f6810r = false;
        this.f6803k.mo18943b(false);
        this.f6805m.mo18980b(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public float[] mo18344c(int i) {
        float U = m8369U();
        float V = m8370V();
        if ((this.f6783Y == 1) != (U > V)) {
            float f = U + V;
            V = f - V;
            U = f - V;
        }
        if (this.f6783Y == 1) {
            U -= (float) i;
        } else {
            V -= (float) i;
        }
        return new float[]{V, U};
    }

    /* renamed from: U */
    private float m8369U() {
        return (float) C3904y.m12882d(this.f6794b, (float) C3904y.m12891h(this.f6794b));
    }

    /* renamed from: V */
    private float m8370V() {
        return (float) C3904y.m12882d(this.f6794b, (float) C3904y.m12892i(this.f6794b));
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo18321B() {
        if (mo18329J() && !this.f6780V) {
            this.f6780V = true;
            getWindow().getDecorView().post(new Runnable() {
                public void run() {
                    if (TTBaseVideoActivity.this.f6795c != null) {
                        TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                        tTBaseVideoActivity.m8381a(tTBaseVideoActivity.mo18322C());
                    }
                }
            });
        }
    }

    /* renamed from: C */
    public float[] mo18322C() {
        float[] fArr = {(float) (getWindow().getDecorView().getWidth() - (getWindow().getDecorView().getPaddingLeft() * 2)), (float) (getWindow().getDecorView().getHeight() - (getWindow().getDecorView().getPaddingTop() * 2))};
        fArr[0] = (float) C3904y.m12882d(this, fArr[0]);
        fArr[1] = (float) C3904y.m12882d(this, fArr[1]);
        if (fArr[0] >= 10.0f && fArr[1] >= 10.0f) {
            return fArr;
        }
        C2905l.m8111b("TTBaseVideoActivity", "get root view size error, so run backup");
        return mo18344c(this.f6813u);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8381a(float[] fArr) {
        C3320b bVar;
        this.f6804l.mo19197a(this.f6795c, new AdSlot.Builder().setCodeId(String.valueOf(C3898x.m12794f(this.f6795c))).setExpressViewAcceptedSize(fArr[0], fArr[1]).build(), this.f6785a, this.f6810r);
        C3223c cVar = this.f6803k;
        if (!(cVar == null || (bVar = this.f6804l) == null)) {
            cVar.mo18936a((C2620c) bVar.mo19194a());
        }
        this.f6804l.mo19199a((C3552j) new C3552j() {
            /* renamed from: a */
            public void mo18407a(boolean z) {
                if (TTBaseVideoActivity.this.f6810r != z) {
                    TTBaseVideoActivity.this.f6803k.mo18944c();
                }
            }

            /* renamed from: a */
            public void mo18405a() {
                TTBaseVideoActivity.this.f6803k.mo18941b();
            }

            /* renamed from: b */
            public void mo18408b() {
                if (TTBaseVideoActivity.this.f6801i != null && TTBaseVideoActivity.this.f6801i.mo19237k() != null) {
                    TTBaseVideoActivity.this.f6801i.mo19237k().performClick();
                }
            }

            /* renamed from: a */
            public void mo18406a(int i) {
                boolean z = false;
                if (i != 1) {
                    if (i == 2) {
                        TTBaseVideoActivity.this.f6805m.mo18961A();
                        return;
                    } else if (i == 3) {
                        C3232e eVar = TTBaseVideoActivity.this.f6805m;
                        if (TTBaseVideoActivity.this.f6814v.get() || TTBaseVideoActivity.this.f6817y.get()) {
                            z = true;
                        }
                        eVar.mo18976a(z, (C3622b) TTBaseVideoActivity.this);
                        return;
                    } else if (i == 4) {
                        TTBaseVideoActivity.this.f6805m.mo18991k();
                        return;
                    } else if (i != 5) {
                        return;
                    }
                }
                if (!TTBaseVideoActivity.this.f6805m.mo18981b() && !TTBaseVideoActivity.this.f6805m.mo18984d()) {
                    TTBaseVideoActivity.this.mo18426a(0, false);
                }
            }

            /* renamed from: c */
            public long mo18410c() {
                return TTBaseVideoActivity.this.f6805m.mo18986f();
            }

            /* renamed from: d */
            public int mo18411d() {
                if (TTBaseVideoActivity.this.f6804l.mo19203c()) {
                    return 4;
                }
                if (TTBaseVideoActivity.this.f6804l.mo19204d()) {
                    return 5;
                }
                if (TTBaseVideoActivity.this.f6805m.mo18985e()) {
                    return 1;
                }
                if (TTBaseVideoActivity.this.f6805m.mo18981b()) {
                    return 2;
                }
                if (TTBaseVideoActivity.this.f6805m.mo18984d()) {
                }
                return 3;
            }

            /* renamed from: e */
            public void mo18412e() {
                TTBaseVideoActivity.this.mo18326G();
            }

            /* renamed from: b */
            public void mo18409b(int i) {
                TTBaseVideoActivity.this.f6773O = i;
            }
        });
        this.f6804l.mo19196a((TTNativeExpressAd.ExpressAdInteractionListener) new TTNativeExpressAd.ExpressAdInteractionListener() {
            public void onAdClicked(View view, int i) {
            }

            public void onAdShow(View view, int i) {
            }

            public void onRenderFail(View view, String str, int i) {
                TTBaseVideoActivity.this.f6807o.mo19018a(true);
                TTBaseVideoActivity.this.f6807o.mo19021b();
                C2905l.m8111b("TTBaseVideoActivity", "onRenderFail、、、code:" + i);
                TTBaseVideoActivity.this.f6804l.mo19205e().post(new Runnable() {
                    public void run() {
                        TTBaseVideoActivity.this.mo18335a(false);
                    }
                });
                TTBaseVideoActivity.this.m8387ad();
            }

            public void onRenderSuccess(View view, float f, float f2) {
                if (!C3434p.m10497i(TTBaseVideoActivity.this.f6795c)) {
                    if (TTBaseVideoActivity.this.f6804l.mo19208h()) {
                        TTBaseVideoActivity.this.mo18342b(true);
                    }
                    TTBaseVideoActivity.this.mo18346d(8);
                    TTBaseVideoActivity.this.f6807o.mo19018a(true);
                    TTBaseVideoActivity.this.f6807o.mo19021b();
                    if (TTBaseVideoActivity.this.f6804l.mo19208h()) {
                        TTBaseVideoActivity.this.f6804l.mo19201b().setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                        if (TTBaseVideoActivity.this.f6770L != null) {
                            TTBaseVideoActivity.this.f6770L.mo19082a(TTBaseVideoActivity.this.f6801i.mo19234h());
                        }
                    } else if (TTBaseVideoActivity.this.f6795c.mo19517J() != null && TTBaseVideoActivity.this.mo18488N()) {
                        TTBaseVideoActivity.this.f6771M = true;
                    }
                    TTBaseVideoActivity.this.m8365Q();
                    TTBaseVideoActivity.this.m8387ad();
                }
            }
        });
        Context context = this.f6794b;
        C3431n nVar = this.f6795c;
        String str = this.f6785a;
        C296610 r5 = new C3546f(context, nVar, str, C3898x.m12747a(str)) {
            /* renamed from: a */
            public void mo18383a(View view, float f, float f2, float f3, float f4, SparseArray<C3362c.C3363a> sparseArray, boolean z) {
                super.mo18383a(view, f, f2, f3, f4, sparseArray, z);
                TTBaseVideoActivity.this.onRewardBarClick(view);
            }
        };
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(this.f6762D)) {
            hashMap.put("rit_scene", this.f6762D);
        }
        if (C3434p.m10497i(this.f6795c)) {
            hashMap.put("click_scence", 3);
        } else {
            hashMap.put("click_scence", 1);
        }
        r5.mo19313a((Map<String, Object>) hashMap);
        Context context2 = this.f6794b;
        C3431n nVar2 = this.f6795c;
        String str2 = this.f6785a;
        C296711 r7 = new C3545e(context2, nVar2, str2, C3898x.m12747a(str2)) {
            /* renamed from: a */
            public void mo18383a(View view, float f, float f2, float f3, float f4, SparseArray<C3362c.C3363a> sparseArray, boolean z) {
                super.mo18383a(view, f, f2, f3, f4, sparseArray, z);
                if (mo19315a(view, z)) {
                    TTBaseVideoActivity.this.onRewardBarClick(view);
                }
            }
        };
        HashMap hashMap2 = new HashMap();
        if (!TextUtils.isEmpty(this.f6762D)) {
            hashMap2.put("rit_scene", this.f6762D);
        }
        if (C3434p.m10497i(this.f6795c)) {
            hashMap2.put("click_scence", 3);
        } else {
            hashMap2.put("click_scence", 1);
        }
        r7.mo19313a((Map<String, Object>) hashMap2);
        this.f6804l.mo19198a(r5, r7);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f6801i.mo19234h().addView(this.f6804l.mo19194a(), layoutParams);
        if (!this.f6804l.mo19208h()) {
            mo18342b(false);
        }
        this.f6804l.mo19211k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo18342b(boolean z) {
        if (!this.f6814v.get()) {
            if (!z) {
                this.f6803k.mo18946c(false);
                this.f6803k.mo18939a(false);
                this.f6803k.mo18948d(false);
                this.f6801i.mo19230d(8);
            } else {
                this.f6803k.mo18939a(this.f6795c.mo19582ap());
                if (C3434p.m10497i(this.f6795c) || mo18488N()) {
                    this.f6803k.mo18946c(true);
                }
                if (mo18488N() || ((this.f6770L instanceof C3257b) && mo18329J())) {
                    this.f6803k.mo18948d(true);
                } else {
                    this.f6803k.mo18947d();
                    this.f6801i.mo19230d(0);
                }
            }
            if (!z) {
                this.f6801i.mo19216a(4);
                this.f6801i.mo19225b(8);
            } else if (mo18328I() || (this.f6782X == FullRewardExpressView.f7898c && mo18488N())) {
                this.f6801i.mo19216a(0);
                this.f6801i.mo19225b(0);
            } else {
                this.f6801i.mo19216a(8);
                this.f6801i.mo19225b(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo18323D() {
        Message message = new Message();
        message.what = 400;
        if (mo18328I()) {
            mo18431f(10000);
        }
        C2923x xVar = this.f6809q;
        if (xVar != null) {
            xVar.sendMessageDelayed(message, 2000);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo18324E() {
        this.f6809q.removeMessages(400);
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public void m8371W() {
        if (!this.f6814v.get() && this.f6766H && !C3434p.m10497i(this.f6795c)) {
            if ((C3431n.m10311c(this.f6795c) || C3513m.m10973h().mo19863j(String.valueOf(this.f6812t)) != 1 || !this.f6804l.mo19204d()) && !C3418l.m10268c(this.f6795c)) {
                C3255a aVar = this.f6770L;
                if (aVar == null || aVar.mo19087c()) {
                    this.f6809q.removeMessages(300);
                    Message obtain = Message.obtain();
                    obtain.what = 300;
                    this.f6809q.sendMessageDelayed(obtain, 5000);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public void m8372X() {
        this.f6809q.removeMessages(300);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo18346d(int i) {
        if (this.f6767I == null) {
            this.f6767I = new ProgressBar(this);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(120, 120);
            layoutParams.gravity = 17;
            this.f6767I.setLayoutParams(layoutParams);
            this.f6767I.setIndeterminateDrawable(getResources().getDrawable(C2914t.m8157d(this, "tt_video_loading_progress_bar")));
            this.f6801i.mo19234h().addView(this.f6767I);
        }
        this.f6767I.setVisibility(i);
    }

    /* renamed from: Y */
    private void m8373Y() {
        this.f6803k.mo18939a(this.f6795c.mo19582ap());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo18325F() {
        if (this.f6797e == null) {
            TTAdDislikeDialog tTAdDislikeDialog = new TTAdDislikeDialog((Context) this, this.f6795c);
            this.f6797e = tTAdDislikeDialog;
            tTAdDislikeDialog.setCallback(new TTAdDislikeDialog.C3155a() {
                /* renamed from: c */
                public void mo18318c(View view) {
                }

                /* renamed from: a */
                public void mo18316a(View view) {
                    TTBaseVideoActivity.this.f6817y.set(true);
                    TTBaseVideoActivity.this.m8372X();
                    if (TTBaseVideoActivity.this.f6805m.mo18981b()) {
                        TTBaseVideoActivity.this.f6805m.mo18995o();
                    }
                }

                /* renamed from: b */
                public void mo18317b(View view) {
                    TTBaseVideoActivity.this.f6817y.set(false);
                    TTBaseVideoActivity.this.m8371W();
                    if (TTBaseVideoActivity.this.f6805m.mo18984d()) {
                        TTBaseVideoActivity.this.f6805m.mo18994n();
                    }
                }

                /* renamed from: a */
                public void mo18315a(int i, FilterWord filterWord) {
                    if (!TTBaseVideoActivity.this.f6818z.get() && filterWord != null && !filterWord.hasSecondOptions()) {
                        TTBaseVideoActivity.this.f6818z.set(true);
                        TTBaseVideoActivity.this.m8385ab();
                    }
                }
            });
            ((FrameLayout) findViewById(16908290)).addView(this.f6797e);
        }
        if (this.f6798f == null) {
            this.f6798f = new TTAdDislikeToast(this);
            ((FrameLayout) findViewById(16908290)).addView(this.f6798f);
        }
    }

    /* renamed from: Z */
    private boolean m8374Z() {
        if ((this instanceof TTFullScreenExpressVideoActivity) || (this instanceof TTRewardExpressVideoActivity)) {
            return this.f6814v.get();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo18326G() {
        if (!isFinishing()) {
            if (this.f6818z.get()) {
                m8384aa();
                return;
            }
            if (this.f6797e == null) {
                mo18325F();
            }
            this.f6797e.mo18778a();
        }
    }

    /* renamed from: aa */
    private void m8384aa() {
        this.f6798f.mo18786a(C3471f.f8594d);
    }

    /* access modifiers changed from: private */
    /* renamed from: ab */
    public void m8385ab() {
        this.f6798f.mo18786a(C3471f.f8595e);
    }

    /* renamed from: ac */
    private boolean m8386ac() {
        if (C3418l.m10266b(this.f6795c) && this.f6772N.get()) {
            C3322d dVar = this.f6801i;
            if (dVar != null) {
                dVar.mo19234h().setVisibility(4);
                this.f6801i.mo19234h().setVisibility(0);
            }
            return false;
        } else if (this.f6814v.get() || this.f6817y.get() || C3434p.m10497i(this.f6795c)) {
            return false;
        } else {
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18332a(Intent intent) {
        if (intent != null) {
            this.f6801i.mo19226b(intent.getBooleanExtra("show_download_bar", true));
            this.f6762D = intent.getStringExtra("rit_scene");
            this.f6805m.mo18972a(intent.getStringExtra("video_cache_url"));
            this.f6796d = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_META_MD5);
            try {
                String stringExtra = intent.getStringExtra(TTAdConstant.CLIENT_BIDDING_AUTION_PRICE);
                if (!TextUtils.isEmpty(stringExtra)) {
                    this.f6777S = Double.valueOf(Double.parseDouble(stringExtra));
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18333a(Bundle bundle) {
        if (bundle != null) {
            this.f6796d = bundle.getString(TTAdConstant.MULTI_PROCESS_META_MD5);
            this.f6805m.mo18972a(bundle.getString("video_cache_url"));
            this.f6810r = bundle.getBoolean("is_mute");
            this.f6762D = bundle.getString("rit_scene");
            try {
                String string = bundle.getString(TTAdConstant.CLIENT_BIDDING_AUTION_PRICE);
                if (!TextUtils.isEmpty(string)) {
                    this.f6777S = Double.valueOf(Double.parseDouble(string));
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ad */
    public void m8387ad() {
        try {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.f6794b, C2914t.m8165l(this.f6794b, "tt_fade_out"));
            if (loadAnimation != null) {
                loadAnimation.setAnimationListener(new Animation.AnimationListener() {
                    public void onAnimationRepeat(Animation animation) {
                    }

                    public void onAnimationStart(Animation animation) {
                    }

                    public void onAnimationEnd(Animation animation) {
                        TTBaseVideoActivity.this.f6801i.mo19239m();
                    }
                });
                this.f6801i.mo19218a(loadAnimation);
                return;
            }
            this.f6801i.mo19239m();
        } catch (Throwable unused) {
            this.f6801i.mo19239m();
        }
    }

    public void finish() {
        super.finish();
        if (C3886o.m12684e()) {
            C3904y.m12871b((Activity) this);
        }
    }
}
