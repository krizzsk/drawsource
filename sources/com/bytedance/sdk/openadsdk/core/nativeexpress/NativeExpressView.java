package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.C2620c;
import com.bytedance.sdk.component.adexpress.dynamic.p099c.C2630f;
import com.bytedance.sdk.component.adexpress.dynamic.p099c.C2635h;
import com.bytedance.sdk.component.adexpress.p093b.C2550b;
import com.bytedance.sdk.component.adexpress.p093b.C2552c;
import com.bytedance.sdk.component.adexpress.p093b.C2553d;
import com.bytedance.sdk.component.adexpress.p093b.C2554e;
import com.bytedance.sdk.component.adexpress.p093b.C2557g;
import com.bytedance.sdk.component.adexpress.p093b.C2558h;
import com.bytedance.sdk.component.adexpress.p093b.C2559i;
import com.bytedance.sdk.component.adexpress.p093b.C2562k;
import com.bytedance.sdk.component.adexpress.p093b.C2563l;
import com.bytedance.sdk.component.adexpress.p093b.C2566n;
import com.bytedance.sdk.component.adexpress.p093b.C2567o;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.utils.C2898h;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.core.C3446g;
import com.bytedance.sdk.openadsdk.core.C3457h;
import com.bytedance.sdk.openadsdk.core.C3502k;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.C3666w;
import com.bytedance.sdk.openadsdk.core.C3703x;
import com.bytedance.sdk.openadsdk.core.bannerexpress.C3378a;
import com.bytedance.sdk.openadsdk.core.nativeexpress.p159a.C3529a;
import com.bytedance.sdk.openadsdk.core.p144b.C3362c;
import com.bytedance.sdk.openadsdk.core.p145c.C3389a;
import com.bytedance.sdk.openadsdk.core.p145c.p147b.C3392a;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.dislike.C3716b;
import com.bytedance.sdk.openadsdk.p128b.C3100j;
import com.bytedance.sdk.openadsdk.p128b.C3118u;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class NativeExpressView extends FrameLayout implements C2557g, C2566n, C2620c, C3552j {

    /* renamed from: p */
    public static int f8835p = 500;

    /* renamed from: A */
    private C3118u f8836A;

    /* renamed from: B */
    private String f8837B;

    /* renamed from: C */
    private C3378a.C3385a f8838C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public AtomicBoolean f8839D = new AtomicBoolean(false);

    /* renamed from: E */
    private C3530b f8840E;

    /* renamed from: F */
    private final ViewTreeObserver.OnScrollChangedListener f8841F = new ViewTreeObserver.OnScrollChangedListener() {
        public void onScrollChanged() {
            NativeExpressView.this.m11043s();
            NativeExpressView nativeExpressView = NativeExpressView.this;
            nativeExpressView.removeCallbacks(nativeExpressView.f8842G);
            NativeExpressView nativeExpressView2 = NativeExpressView.this;
            nativeExpressView2.postDelayed(nativeExpressView2.f8842G, 500);
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: G */
    public final Runnable f8842G = new Runnable() {
        public void run() {
            if (C3703x.m12105a(NativeExpressView.this, 0, 5)) {
                NativeExpressView nativeExpressView = NativeExpressView.this;
                nativeExpressView.mo20023d(nativeExpressView.getVisibility());
                return;
            }
            NativeExpressView.this.mo20023d(8);
        }
    };

    /* renamed from: H */
    private final Runnable f8843H = new Runnable() {
        public void run() {
            NativeExpressView.this.mo20023d(0);
        }
    };

    /* renamed from: I */
    private final Runnable f8844I = new Runnable() {
        public void run() {
            NativeExpressView.this.mo20023d(8);
        }
    };

    /* renamed from: J */
    private ThemeStatusBroadcastReceiver f8845J;

    /* renamed from: K */
    private C3559o f8846K;

    /* renamed from: L */
    private C2559i.C2560a f8847L;

    /* renamed from: M */
    private List<C2559i> f8848M;

    /* renamed from: N */
    private C2567o f8849N;

    /* renamed from: O */
    private C2554e f8850O;

    /* renamed from: P */
    private C2558h f8851P;

    /* renamed from: Q */
    private C2563l f8852Q;

    /* renamed from: R */
    private SparseArray<C3362c.C3363a> f8853R = new SparseArray<>();

    /* renamed from: S */
    private float f8854S = -1.0f;

    /* renamed from: T */
    private float f8855T = -1.0f;

    /* renamed from: U */
    private float f8856U = -1.0f;

    /* renamed from: V */
    private float f8857V = -1.0f;

    /* renamed from: W */
    private long f8858W = 0;

    /* renamed from: a */
    private boolean f8859a = true;

    /* renamed from: b */
    private int f8860b = 0;

    /* renamed from: c */
    private C3716b f8861c;

    /* renamed from: d */
    private TTDislikeDialogAbstract f8862d;

    /* renamed from: e */
    private TTNativeExpressAd.ExpressAdInteractionListener f8863e;

    /* renamed from: f */
    protected final Context f8864f;

    /* renamed from: g */
    protected String f8865g = "embeded_ad";

    /* renamed from: h */
    protected AdSlot f8866h;
    /* access modifiers changed from: protected */

    /* renamed from: i */
    public C3431n f8867i;

    /* renamed from: j */
    protected TTNativeExpressAd.ExpressVideoAdListener f8868j;

    /* renamed from: k */
    protected FrameLayout f8869k;

    /* renamed from: l */
    protected boolean f8870l;

    /* renamed from: m */
    protected boolean f8871m = false;

    /* renamed from: n */
    protected C2552c f8872n;

    /* renamed from: o */
    protected boolean f8873o = false;

    /* renamed from: q */
    public boolean f8874q = false;

    /* renamed from: r */
    public C3100j f8875r = new C3100j();

    /* renamed from: s */
    protected C2550b f8876s;

    /* renamed from: t */
    public C2553d<? extends View> f8877t;

    /* renamed from: u */
    private C3545e f8878u;

    /* renamed from: v */
    private C3546f f8879v;

    /* renamed from: w */
    private final AtomicBoolean f8880w = new AtomicBoolean(false);

    /* renamed from: x */
    private String f8881x = null;

    /* renamed from: y */
    private float f8882y;

    /* renamed from: z */
    private float f8883z;

    /* renamed from: a */
    public void mo18405a() {
    }

    /* renamed from: a */
    public void mo18406a(int i) {
    }

    /* renamed from: a */
    public void mo18407a(boolean z) {
    }

    /* renamed from: b */
    public void mo18408b() {
    }

    /* renamed from: b */
    public void mo18409b(int i) {
    }

    /* renamed from: c */
    public long mo18410c() {
        return 0;
    }

    /* renamed from: d */
    public int mo18411d() {
        return 0;
    }

    /* renamed from: e */
    public void mo18412e() {
    }

    /* renamed from: f */
    public void mo17098f() {
    }

    public void setTimeUpdate(int i) {
    }

    public C3100j getAdShowTime() {
        return this.f8875r;
    }

    public void setClosedListenerKey(String str) {
        this.f8837B = str;
        C3530b bVar = this.f8840E;
        if (bVar != null) {
            bVar.mo20065a(str);
        }
    }

    public String getClosedListenerKey() {
        return this.f8837B;
    }

    public void setBannerClickClosedListener(C3378a.C3385a aVar) {
        this.f8838C = aVar;
    }

    public NativeExpressView(Context context, C3431n nVar, AdSlot adSlot, String str) {
        super(context);
        this.f8865g = str;
        this.f8864f = context;
        this.f8867i = nVar;
        this.f8866h = adSlot;
        this.f8874q = false;
        mo19177g();
    }

    public NativeExpressView(Context context, C3431n nVar, AdSlot adSlot, String str, boolean z) {
        super(context);
        this.f8865g = str;
        this.f8864f = context;
        this.f8867i = nVar;
        this.f8866h = adSlot;
        this.f8874q = z;
        mo19177g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo19177g() {
        this.f8845J = new ThemeStatusBroadcastReceiver();
        AdSlot adSlot = this.f8866h;
        if (adSlot != null) {
            this.f8882y = adSlot.getExpressViewAcceptedWidth();
            this.f8883z = this.f8866h.getExpressViewAcceptedHeight();
            this.f8881x = this.f8866h.getCodeId();
        }
        setBackgroundColor(0);
        if (this.f8867i.mo19591ay()) {
            this.f8840E = new C3530b(this.f8864f, this, this.f8867i);
            return;
        }
        mo20019h();
        this.f8848M = new ArrayList();
        m11039o();
        C2567o oVar = this.f8849N;
        if (oVar != null) {
            this.f8846K = (C3559o) oVar.mo16732d();
        }
    }

    public SSWebView getWebView() {
        C3559o oVar = this.f8846K;
        if (oVar == null) {
            return null;
        }
        return oVar.mo16735a();
    }

    /* renamed from: h */
    private void mo20019h() {
        long j;
        JSONObject a = C3529a.m11072a(this.f8882y, this.f8883z, this.f8871m, this.f8867i);
        boolean z = true;
        this.f8836A = new C3118u(1, this.f8865g, this.f8867i);
        this.f8851P = new C3549i(this.f8836A, this.f8865g, this.f8867i, this.f8881x);
        boolean z2 = false;
        try {
            j = new JSONObject(this.f8867i.mo19514G().mo19682g()).optLong("render_delay_time");
            try {
                if (C3431n.m10311c(this.f8867i) || C3513m.m10973h().mo19863j(this.f8881x) != 1) {
                    z = false;
                }
                z2 = z;
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            j = 0;
        }
        this.f8852Q = new C2563l.C2564a().mo16692a(this.f8865g).mo16698b(this.f8867i.mo19532Y()).mo16701c(C3898x.m12810i(this.f8867i)).mo16702d(this.f8867i.mo19569ac()).mo16694a(a).mo16691a(this.f8851P).mo16689a(C3513m.m10973h().mo19869m()).mo16695a(this.f8867i.mo19582ap()).mo16697b(this.f8867i.mo19656t()).mo16690a(Math.min(Math.max(j, 0), 10000)).mo16700c(this.f8867i.mo19519L()).mo16693a(C3529a.m11076b(this.f8867i)).mo16699b(z2).mo16696a();
    }

    /* renamed from: o */
    private void m11039o() {
        if (m11047w()) {
            m11040p();
            return;
        }
        try {
            m11041q();
            this.f8846K = new C3559o(this.f8864f, this.f8852Q, this.f8845J, this.f8836A, this.f8867i);
            C2567o oVar = new C2567o(this.f8864f, this.f8852Q, this.f8846K, this);
            this.f8849N = oVar;
            this.f8848M.add(oVar);
        } catch (Exception e) {
            C2905l.m8115c("NativeExpressView", "NativeExpressView dynamicRender fail", e);
        }
        C2554e eVar = new C2554e(this.f8864f, this.f8852Q, new C3554l(this, this.f8845J, this.f8852Q));
        this.f8850O = eVar;
        this.f8848M.add(eVar);
        this.f8847L = new C2562k(this.f8848M, this.f8851P);
    }

    /* renamed from: p */
    private void m11040p() {
        this.f8860b = this.f8867i.mo19649q();
        try {
            m11041q();
            m11042r();
        } catch (Exception e) {
            C2905l.m8115c("NativeExpressView", "NativeExpressView dynamicRender fail", e);
        }
        boolean z = true;
        if (this.f8867i.mo19652r() != 1) {
            z = false;
        }
        this.f8859a = z;
        if (z) {
            C2554e eVar = new C2554e(this.f8864f, this.f8852Q, new C3554l(this, this.f8845J, this.f8852Q));
            this.f8850O = eVar;
            this.f8848M.add(eVar);
        }
        this.f8847L = new C2562k(this.f8848M, this.f8851P);
    }

    /* renamed from: q */
    private void m11041q() {
        if (!TTAdSdk.isInitSuccess()) {
            C3502k.m10919b();
        }
    }

    /* renamed from: r */
    private void m11042r() {
        C3392a aVar = new C3392a();
        int i = this.f8860b;
        if (i == 1) {
            C2550b bVar = new C2550b(this.f8864f, this.f8852Q, this.f8845J, this.f8874q, new C2630f(this.f8864f, C3389a.m10087a(this.f8852Q, this.f8867i)), this, aVar);
            this.f8876s = bVar;
            this.f8848M.add(bVar);
        } else if (i == 2) {
            C2630f fVar = new C2630f(this.f8864f, C3389a.m10087a(this.f8852Q, this.f8867i));
            this.f8846K = new C3559o(this.f8864f, this.f8852Q, this.f8845J, this.f8836A, this.f8867i);
            this.f8849N = new C2567o(this.f8864f, this.f8852Q, this.f8846K, this);
            this.f8876s = new C2550b(this.f8864f, this.f8852Q, this.f8845J, this.f8874q, fVar, this, aVar);
            this.f8848M.add(this.f8849N);
            this.f8848M.add(this.f8876s);
        } else if (i != 3) {
            this.f8846K = new C3559o(this.f8864f, this.f8852Q, this.f8845J, this.f8836A, this.f8867i);
            C2567o oVar = new C2567o(this.f8864f, this.f8852Q, this.f8846K, this);
            this.f8849N = oVar;
            this.f8848M.add(oVar);
        } else {
            C2550b bVar2 = new C2550b(this.f8864f, this.f8852Q, this.f8845J, this.f8874q, new C2635h(), this, aVar);
            this.f8876s = bVar2;
            this.f8848M.add(bVar2);
        }
    }

    public void setVideoAdListener(TTNativeExpressAd.ExpressVideoAdListener expressVideoAdListener) {
        this.f8868j = expressVideoAdListener;
    }

    public void setOuterDislike(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        BackupView backupView;
        C2553d<? extends View> dVar = this.f8877t;
        if (!(dVar == null || !(dVar instanceof C3554l) || (backupView = (BackupView) dVar.mo16642e()) == null)) {
            backupView.setDislikeOuter(tTDislikeDialogAbstract);
        }
        C3530b bVar = this.f8840E;
        if (bVar != null) {
            bVar.mo20064a(tTDislikeDialogAbstract);
        }
        this.f8862d = tTDislikeDialogAbstract;
    }

    public void setDislike(C3716b bVar) {
        BackupView backupView;
        C2553d<? extends View> dVar = this.f8877t;
        if (!(dVar == null || !(dVar instanceof C3554l) || (backupView = (BackupView) dVar.mo16642e()) == null)) {
            backupView.setDislikeInner(bVar);
        }
        C3530b bVar2 = this.f8840E;
        if (bVar2 != null) {
            bVar2.mo20063a((TTAdDislike) bVar);
        }
        this.f8861c = bVar;
    }

    public void setExpressInteractionListener(TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener) {
        this.f8863e = expressAdInteractionListener;
    }

    public void setClickCreativeListener(C3545e eVar) {
        this.f8878u = eVar;
    }

    public C3545e getClickCreativeListener() {
        return this.f8878u;
    }

    public C3546f getClickListener() {
        return this.f8879v;
    }

    public void setClickListener(C3546f fVar) {
        this.f8879v = fVar;
    }

    public void setBackupListener(C2552c cVar) {
        this.f8872n = cVar;
        C2554e eVar = this.f8850O;
        if (eVar != null) {
            eVar.mo16643a(cVar);
        }
    }

    /* renamed from: i */
    public void mo20034i() {
        C2553d<? extends View> dVar = this.f8877t;
        if ((dVar instanceof C3559o) && dVar != null) {
            ((C3559o) dVar).mo16746j();
        }
    }

    /* renamed from: d */
    public void mo20023d(int i) {
        C2553d<? extends View> dVar = this.f8877t;
        if (dVar != null && (dVar instanceof C3559o)) {
            ((C3559o) dVar).mo16736a(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        removeCallbacks(this.f8844I);
        removeCallbacks(this.f8843H);
        if (i == 0) {
            postDelayed(this.f8843H, 50);
        } else {
            postDelayed(this.f8844I, 50);
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (Build.VERSION.SDK_INT < 28) {
            onWindowVisibilityChanged(z ? getVisibility() : 8);
        }
        m11043s();
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m11043s() {
        C2898h.m8093a().post(new Runnable() {
            public void run() {
                if (NativeExpressView.this.f8839D.get()) {
                    NativeExpressView.this.f8875r.mo18681a(System.currentTimeMillis(), C3703x.m12103a(NativeExpressView.this));
                }
            }
        });
    }

    /* renamed from: j */
    public void mo20035j() {
        if (this.f8867i.mo19591ay()) {
            C3530b bVar = this.f8840E;
            if (bVar == null) {
                mo16731a_(106);
                return;
            }
            bVar.mo20062a((C2566n) this);
            this.f8840E.mo20061a();
            return;
        }
        this.f8836A.mo18718a();
        C2559i.C2560a aVar = this.f8847L;
        if (aVar != null) {
            aVar.mo16664a((C2566n) this);
        }
        this.f8847L.mo16662a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            com.bytedance.sdk.openadsdk.core.nativeexpress.e r0 = r12.f8878u
            r1 = 0
            if (r0 == 0) goto L_0x001e
            int r2 = r13.getDeviceId()
            r0.mo19316b((int) r2)
            com.bytedance.sdk.openadsdk.core.nativeexpress.e r0 = r12.f8878u
            int r2 = r13.getSource()
            r0.mo19303a((int) r2)
            com.bytedance.sdk.openadsdk.core.nativeexpress.e r0 = r12.f8878u
            int r2 = r13.getToolType(r1)
            r0.mo19318c((int) r2)
        L_0x001e:
            com.bytedance.sdk.openadsdk.core.nativeexpress.f r0 = r12.f8879v
            if (r0 == 0) goto L_0x003b
            int r2 = r13.getDeviceId()
            r0.mo19316b((int) r2)
            com.bytedance.sdk.openadsdk.core.nativeexpress.f r0 = r12.f8879v
            int r2 = r13.getSource()
            r0.mo19303a((int) r2)
            com.bytedance.sdk.openadsdk.core.nativeexpress.f r0 = r12.f8879v
            int r2 = r13.getToolType(r1)
            r0.mo19318c((int) r2)
        L_0x003b:
            int r0 = r13.getActionMasked()
            r2 = 3
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L_0x009c
            if (r0 == r4) goto L_0x009a
            if (r0 == r3) goto L_0x004f
            if (r0 == r2) goto L_0x004d
            r1 = -1
        L_0x004b:
            r5 = r1
            goto L_0x00af
        L_0x004d:
            r1 = 4
            goto L_0x004b
        L_0x004f:
            float r0 = r12.f8856U
            float r1 = r13.getX()
            float r2 = r12.f8854S
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            float r0 = r0 + r1
            r12.f8856U = r0
            float r0 = r12.f8857V
            float r1 = r13.getY()
            float r2 = r12.f8855T
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            float r0 = r0 + r1
            r12.f8857V = r0
            float r0 = r13.getX()
            r12.f8854S = r0
            float r0 = r13.getY()
            r12.f8855T = r0
            long r0 = java.lang.System.currentTimeMillis()
            long r5 = r12.f8858W
            long r0 = r0 - r5
            r5 = 200(0xc8, double:9.9E-322)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0098
            float r0 = r12.f8856U
            r1 = 1090519040(0x41000000, float:8.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0096
            float r0 = r12.f8857V
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0098
        L_0x0096:
            r5 = r4
            goto L_0x00af
        L_0x0098:
            r5 = r3
            goto L_0x00af
        L_0x009a:
            r5 = r2
            goto L_0x00af
        L_0x009c:
            float r0 = r13.getRawX()
            r12.f8854S = r0
            float r0 = r13.getRawY()
            r12.f8855T = r0
            long r2 = java.lang.System.currentTimeMillis()
            r12.f8858W = r2
            goto L_0x004b
        L_0x00af:
            android.util.SparseArray<com.bytedance.sdk.openadsdk.core.b.c$a> r0 = r12.f8853R
            if (r0 == 0) goto L_0x00ce
            int r1 = r13.getActionMasked()
            com.bytedance.sdk.openadsdk.core.b.c$a r2 = new com.bytedance.sdk.openadsdk.core.b.c$a
            float r3 = r13.getSize()
            double r6 = (double) r3
            float r3 = r13.getPressure()
            double r8 = (double) r3
            long r10 = java.lang.System.currentTimeMillis()
            r4 = r2
            r4.<init>(r5, r6, r8, r10)
            r0.put(r1, r2)
        L_0x00ce:
            boolean r13 = super.dispatchTouchEvent(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: type inference failed for: r24v0, types: [android.view.View] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16644a(android.view.View r24, int r25, com.bytedance.sdk.component.adexpress.C2548b r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = -1
            if (r2 == r3) goto L_0x01d2
            if (r26 != 0) goto L_0x000d
            goto L_0x01d2
        L_0x000d:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            com.bytedance.sdk.openadsdk.core.e.n r4 = r0.f8867i
            boolean r4 = com.bytedance.sdk.openadsdk.core.p149e.C3434p.m10497i(r4)
            java.lang.String r5 = "click_scence"
            r6 = 1
            if (r4 == 0) goto L_0x0026
            r4 = 3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.put(r5, r4)
            goto L_0x002d
        L_0x0026:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r3.put(r5, r4)
        L_0x002d:
            r4 = r26
            com.bytedance.sdk.openadsdk.core.e.j r4 = (com.bytedance.sdk.openadsdk.core.p149e.C3414j) r4
            com.bytedance.sdk.openadsdk.core.nativeexpress.e r5 = r0.f8878u
            if (r5 == 0) goto L_0x0041
            int r7 = r23.getDynamicShowType()
            r5.mo19320d((int) r7)
            com.bytedance.sdk.openadsdk.core.nativeexpress.e r5 = r0.f8878u
            r5.mo19313a((java.util.Map<java.lang.String, java.lang.Object>) r3)
        L_0x0041:
            com.bytedance.sdk.openadsdk.core.nativeexpress.f r5 = r0.f8879v
            if (r5 == 0) goto L_0x0051
            int r7 = r23.getDynamicShowType()
            r5.mo19320d((int) r7)
            com.bytedance.sdk.openadsdk.core.nativeexpress.f r5 = r0.f8879v
            r5.mo19313a((java.util.Map<java.lang.String, java.lang.Object>) r3)
        L_0x0051:
            float r9 = r4.f8265a
            float r10 = r4.f8266b
            float r11 = r4.f8267c
            float r12 = r4.f8268d
            boolean r14 = r4.f8279o
            android.util.SparseArray<com.bytedance.sdk.openadsdk.core.b.c$a> r3 = r4.f8278n
            if (r3 == 0) goto L_0x0065
            int r5 = r3.size()
            if (r5 != 0) goto L_0x0067
        L_0x0065:
            android.util.SparseArray<com.bytedance.sdk.openadsdk.core.b.c$a> r3 = r0.f8853R
        L_0x0067:
            r13 = r3
            java.lang.String r3 = r4.f8275k
            r5 = 0
            if (r1 != 0) goto L_0x006f
            r8 = r0
            goto L_0x0076
        L_0x006f:
            if (r1 == r0) goto L_0x0075
            org.json.JSONObject r5 = m11034a((android.view.View) r24)
        L_0x0075:
            r8 = r1
        L_0x0076:
            if (r4 == 0) goto L_0x0082
            r4.f8276l = r2
            if (r5 == 0) goto L_0x0082
            org.json.JSONObject r1 = r4.f8277m
            if (r1 != 0) goto L_0x0082
            r4.f8277m = r5
        L_0x0082:
            switch(r2) {
                case 1: goto L_0x0190;
                case 2: goto L_0x0166;
                case 3: goto L_0x014c;
                case 4: goto L_0x009f;
                case 5: goto L_0x0097;
                case 6: goto L_0x0092;
                case 7: goto L_0x0087;
                default: goto L_0x0085;
            }
        L_0x0085:
            goto L_0x01d2
        L_0x0087:
            android.content.Context r1 = r0.f8864f
            com.bytedance.sdk.openadsdk.core.e.n r2 = r0.f8867i
            java.lang.String r3 = r0.f8865g
            com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.m8711a(r1, r2, r3)
            goto L_0x01d2
        L_0x0092:
            r23.mo18405a()
            goto L_0x01d2
        L_0x0097:
            boolean r1 = r0.f8874q
            r1 = r1 ^ r6
            r0.mo18407a((boolean) r1)
            goto L_0x01d2
        L_0x009f:
            android.widget.FrameLayout r1 = r0.f8869k
            if (r1 == 0) goto L_0x00b6
            r15 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r15, r17, r19, r20, r21, r22)
            r1.dispatchTouchEvent(r2)
        L_0x00b6:
            com.bytedance.sdk.openadsdk.core.e.n r1 = r0.f8867i
            if (r1 == 0) goto L_0x00c3
            int r1 = r1.mo19621h()
            if (r1 != r6) goto L_0x00c3
            if (r14 != 0) goto L_0x00c3
            return
        L_0x00c3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Creativity....mAdType="
            r1.append(r2)
            java.lang.String r2 = r0.f8865g
            r1.append(r2)
            java.lang.String r2 = ",!mVideoPause="
            r1.append(r2)
            boolean r2 = r0.f8870l
            r2 = r2 ^ r6
            r1.append(r2)
            java.lang.String r2 = "，isAutoPlay="
            r1.append(r2)
            com.bytedance.sdk.openadsdk.core.e.n r2 = r0.f8867i
            boolean r2 = com.bytedance.sdk.openadsdk.p178l.C3898x.m12814j((com.bytedance.sdk.openadsdk.core.p149e.C3431n) r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "ClickCreativeListener"
            com.bytedance.sdk.component.utils.C2905l.m8111b((java.lang.String) r2, (java.lang.String) r1)
            java.lang.String r1 = r0.f8865g
            java.lang.String r5 = "embeded_ad"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x0127
            boolean r1 = r23.m11044t()
            if (r1 == 0) goto L_0x0127
            boolean r1 = r0.f8870l
            if (r1 != 0) goto L_0x0127
            com.bytedance.sdk.openadsdk.core.e.n r1 = r0.f8867i
            boolean r1 = com.bytedance.sdk.openadsdk.p178l.C3898x.m12814j((com.bytedance.sdk.openadsdk.core.p149e.C3431n) r1)
            if (r1 == 0) goto L_0x0127
            java.lang.String r1 = "Creative...."
            com.bytedance.sdk.component.utils.C2905l.m8111b((java.lang.String) r2, (java.lang.String) r1)
            com.bytedance.sdk.openadsdk.core.nativeexpress.e r1 = r0.f8878u
            if (r1 == 0) goto L_0x013d
            r1.mo20092a(r4)
            com.bytedance.sdk.openadsdk.core.nativeexpress.e r1 = r0.f8878u
            r1.mo19312a((java.lang.String) r3)
            com.bytedance.sdk.openadsdk.core.nativeexpress.e r7 = r0.f8878u
            r7.mo18383a(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x013d
        L_0x0127:
            java.lang.String r1 = "normal...."
            com.bytedance.sdk.component.utils.C2905l.m8111b((java.lang.String) r2, (java.lang.String) r1)
            com.bytedance.sdk.openadsdk.core.nativeexpress.f r1 = r0.f8879v
            if (r1 == 0) goto L_0x013d
            r1.mo20093a(r4)
            com.bytedance.sdk.openadsdk.core.nativeexpress.f r1 = r0.f8879v
            r1.mo19312a((java.lang.String) r3)
            com.bytedance.sdk.openadsdk.core.nativeexpress.f r7 = r0.f8879v
            r7.mo18383a(r8, r9, r10, r11, r12, r13, r14)
        L_0x013d:
            com.bytedance.sdk.openadsdk.TTNativeExpressAd$ExpressAdInteractionListener r1 = r0.f8863e
            if (r1 == 0) goto L_0x01d2
            com.bytedance.sdk.openadsdk.core.e.n r2 = r0.f8867i
            int r2 = r2.mo19519L()
            r1.onAdClicked(r0, r2)
            goto L_0x01d2
        L_0x014c:
            com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract r1 = r0.f8862d
            if (r1 == 0) goto L_0x0155
            r1.show()
            goto L_0x01d2
        L_0x0155:
            com.bytedance.sdk.openadsdk.dislike.b r1 = r0.f8861c
            if (r1 == 0) goto L_0x015e
            r1.showDislikeDialog()
            goto L_0x01d2
        L_0x015e:
            com.bytedance.sdk.openadsdk.core.e.n r1 = r0.f8867i
            java.lang.String r2 = r0.f8837B
            com.bytedance.sdk.openadsdk.activity.TTDelegateActivity.m8479a((com.bytedance.sdk.openadsdk.core.p149e.C3431n) r1, (java.lang.String) r2)
            goto L_0x01d2
        L_0x0166:
            int r1 = r4.f8280p
            if (r1 <= 0) goto L_0x016d
            com.bytedance.sdk.openadsdk.core.C3704y.m12112a(r6)
        L_0x016d:
            com.bytedance.sdk.openadsdk.core.nativeexpress.e r1 = r0.f8878u
            if (r1 == 0) goto L_0x017e
            r1.mo20092a(r4)
            com.bytedance.sdk.openadsdk.core.nativeexpress.e r1 = r0.f8878u
            r1.mo19312a((java.lang.String) r3)
            com.bytedance.sdk.openadsdk.core.nativeexpress.e r7 = r0.f8878u
            r7.mo18383a(r8, r9, r10, r11, r12, r13, r14)
        L_0x017e:
            com.bytedance.sdk.openadsdk.TTNativeExpressAd$ExpressAdInteractionListener r1 = r0.f8863e
            if (r1 == 0) goto L_0x018b
            com.bytedance.sdk.openadsdk.core.e.n r2 = r0.f8867i
            int r2 = r2.mo19519L()
            r1.onAdClicked(r0, r2)
        L_0x018b:
            r1 = 0
            com.bytedance.sdk.openadsdk.core.C3704y.m12112a(r1)
            goto L_0x01d2
        L_0x0190:
            android.widget.FrameLayout r1 = r0.f8869k
            if (r1 == 0) goto L_0x01a7
            r15 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r15, r17, r19, r20, r21, r22)
            r1.dispatchTouchEvent(r2)
        L_0x01a7:
            com.bytedance.sdk.openadsdk.core.e.n r1 = r0.f8867i
            if (r1 == 0) goto L_0x01b4
            int r1 = r1.mo19621h()
            if (r1 != r6) goto L_0x01b4
            if (r14 != 0) goto L_0x01b4
            return
        L_0x01b4:
            com.bytedance.sdk.openadsdk.core.nativeexpress.f r1 = r0.f8879v
            if (r1 == 0) goto L_0x01c5
            r1.mo20093a(r4)
            com.bytedance.sdk.openadsdk.core.nativeexpress.f r1 = r0.f8879v
            r1.mo19312a((java.lang.String) r3)
            com.bytedance.sdk.openadsdk.core.nativeexpress.f r7 = r0.f8879v
            r7.mo18383a(r8, r9, r10, r11, r12, r13, r14)
        L_0x01c5:
            com.bytedance.sdk.openadsdk.TTNativeExpressAd$ExpressAdInteractionListener r1 = r0.f8863e
            if (r1 == 0) goto L_0x01d2
            com.bytedance.sdk.openadsdk.core.e.n r2 = r0.f8867i
            int r2 = r2.mo19519L()
            r1.onAdClicked(r0, r2)
        L_0x01d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.mo16644a(android.view.View, int, com.bytedance.sdk.component.adexpress.b):void");
    }

    /* renamed from: a */
    public static JSONObject m11034a(View view) {
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", view.getWidth());
            jSONObject.put("height", view.getHeight());
            jSONObject.put("left", iArr[0]);
            jSONObject.put("top", iArr[1]);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: t */
    private boolean m11044t() {
        return C3431n.m10311c(this.f8867i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int getAdSlotType() {
        /*
            r6 = this;
            java.lang.String r0 = r6.f8865g
            int r1 = r0.hashCode()
            r2 = 5
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r1) {
                case -1695837674: goto L_0x004a;
                case -1364000502: goto L_0x0040;
                case -1263194568: goto L_0x0036;
                case -764631662: goto L_0x002c;
                case -712491894: goto L_0x0022;
                case 1844104722: goto L_0x0018;
                case 1912999166: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0054
        L_0x000e:
            java.lang.String r1 = "draw_ad"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0054
            r0 = r5
            goto L_0x0055
        L_0x0018:
            java.lang.String r1 = "interaction"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0054
            r0 = r2
            goto L_0x0055
        L_0x0022:
            java.lang.String r1 = "embeded_ad"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0054
            r0 = 0
            goto L_0x0055
        L_0x002c:
            java.lang.String r1 = "fullscreen_interstitial_ad"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0054
            r0 = r3
            goto L_0x0055
        L_0x0036:
            java.lang.String r1 = "open_ad"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0054
            r0 = 6
            goto L_0x0055
        L_0x0040:
            java.lang.String r1 = "rewarded_video"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0054
            r0 = r4
            goto L_0x0055
        L_0x004a:
            java.lang.String r1 = "banner_ad"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0054
            r0 = 4
            goto L_0x0055
        L_0x0054:
            r0 = -1
        L_0x0055:
            switch(r0) {
                case 1: goto L_0x0061;
                case 2: goto L_0x005f;
                case 3: goto L_0x005c;
                case 4: goto L_0x005b;
                case 5: goto L_0x005a;
                case 6: goto L_0x0059;
                default: goto L_0x0058;
            }
        L_0x0058:
            return r2
        L_0x0059:
            return r3
        L_0x005a:
            return r4
        L_0x005b:
            return r5
        L_0x005c:
            r0 = 8
            return r0
        L_0x005f:
            r0 = 7
            return r0
        L_0x0061:
            r0 = 9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.getAdSlotType():int");
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m11043s();
        m11045u();
        C2905l.m8118e("webviewpool", "onAttachedToWindow+++");
        getViewTreeObserver().addOnScrollChangedListener(this.f8841F);
        C3457h.m10580d().mo19745a(this.f8837B, this.f8838C);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m11043s();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        C2905l.m8118e("webviewpool", "onFinishTemporaryDetach+++");
    }

    /* renamed from: u */
    private void m11045u() {
        List<C2559i> list = this.f8848M;
        if (list != null) {
            for (C2559i next : list) {
                if (next != null) {
                    next.mo16635b();
                }
            }
        }
    }

    /* renamed from: v */
    private void m11046v() {
        List<C2559i> list = this.f8848M;
        if (list != null) {
            for (C2559i next : list) {
                if (next != null) {
                    next.mo16636c();
                }
            }
        }
    }

    /* renamed from: k */
    public void mo20036k() {
        C3559o oVar = this.f8846K;
        if (oVar != null && oVar.mo16642e() != null) {
            this.f8846K.mo16742f();
        }
    }

    /* renamed from: l */
    public void mo20037l() {
        try {
            if (this.f8840E != null) {
                this.f8840E.mo20066b();
            }
            removeAllViews();
            if (getParent() != null) {
                ((ViewGroup) getParent()).removeView(this);
            }
            if (this.f8848M != null) {
                for (C2559i a : this.f8848M) {
                    a.mo16633a();
                }
            }
            this.f8861c = null;
            this.f8862d = null;
            this.f8866h = null;
            this.f8867i = null;
            this.f8863e = null;
            this.f8878u = null;
            this.f8872n = null;
            this.f8879v = null;
            this.f8868j = null;
        } catch (Throwable th) {
            C2905l.m8115c("NativeExpressView", "detach error", th);
        }
    }

    /* renamed from: m */
    public void mo20038m() {
        try {
            if (this.f8869k != null && this.f8869k.getParent() != null) {
                removeView(this.f8869k);
            }
        } catch (Throwable th) {
            C2905l.m8106a("NativeExpressView", "backupDestroy remove video container error", th);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.f8841F);
        C3457h.m10580d().mo19766f(this.f8837B);
        m11046v();
        C2905l.m8118e("webviewpool", "onDetachedFromWindow===");
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        C2905l.m8118e("webviewpool", "onStartTemporaryDetach===");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.bytedance.sdk.component.adexpress.b.d, com.bytedance.sdk.component.adexpress.b.d<? extends android.view.View>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16730a(com.bytedance.sdk.component.adexpress.p093b.C2553d<? extends android.view.View> r5, com.bytedance.sdk.component.adexpress.p093b.C2565m r6) {
        /*
            r4 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.f8839D
            r1 = 1
            r0.set(r1)
            r4.f8877t = r5
            int r0 = r5.mo16632c()
            r2 = 3
            r3 = 0
            if (r0 != r2) goto L_0x001d
            com.bytedance.sdk.openadsdk.core.e.n r0 = r4.f8867i
            int r0 = r0.mo19615f()
            if (r0 != r1) goto L_0x001d
            com.bytedance.sdk.openadsdk.core.e.n r0 = r4.f8867i
            r0.mo19595b((int) r3)
        L_0x001d:
            int r0 = r5.mo16632c()
            r1 = 2
            if (r0 == r1) goto L_0x0030
            int r0 = r5.mo16632c()
            if (r0 == 0) goto L_0x0030
            int r0 = r5.mo16632c()
            if (r0 != r2) goto L_0x007a
        L_0x0030:
            android.view.View r0 = r5.mo16642e()
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L_0x0043
            android.view.ViewParent r1 = r0.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.removeView(r0)
        L_0x0043:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r3
        L_0x0049:
            int r2 = r4.getChildCount()
            if (r1 >= r2) goto L_0x0059
            android.view.View r2 = r4.getChildAt(r1)
            r0.add(r2)
            int r1 = r1 + 1
            goto L_0x0049
        L_0x0059:
            int r1 = r0.size()
            if (r3 >= r1) goto L_0x0073
            java.lang.Object r1 = r0.get(r3)
            boolean r1 = r1 instanceof com.bytedance.sdk.component.widget.SSWebView
            if (r1 == 0) goto L_0x0070
            java.lang.Object r1 = r0.get(r3)
            android.view.View r1 = (android.view.View) r1
            r4.removeView(r1)
        L_0x0070:
            int r3 = r3 + 1
            goto L_0x0059
        L_0x0073:
            android.view.View r5 = r5.mo16642e()
            r4.addView(r5)
        L_0x007a:
            com.bytedance.sdk.component.adexpress.b.h r5 = r4.f8851P
            if (r5 == 0) goto L_0x0083
            com.bytedance.sdk.openadsdk.core.nativeexpress.i r5 = (com.bytedance.sdk.openadsdk.core.nativeexpress.C3549i) r5
            r5.mo20094i()
        L_0x0083:
            com.bytedance.sdk.openadsdk.TTNativeExpressAd$ExpressAdInteractionListener r5 = r4.f8863e
            if (r5 == 0) goto L_0x0094
            double r0 = r6.mo16709b()
            float r0 = (float) r0
            double r1 = r6.mo16714c()
            float r6 = (float) r1
            r5.onRenderSuccess(r4, r0, r6)
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.mo16730a(com.bytedance.sdk.component.adexpress.b.d, com.bytedance.sdk.component.adexpress.b.m):void");
    }

    /* renamed from: a_ */
    public void mo16731a_(int i) {
        C2558h hVar = this.f8851P;
        if (hVar != null) {
            if (!this.f8859a) {
                hVar.mo16657f();
            }
            this.f8851P.mo16659g();
            ((C3549i) this.f8851P).mo20094i();
        }
        TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener = this.f8863e;
        if (expressAdInteractionListener != null) {
            expressAdInteractionListener.onRenderFail(this, C3446g.m10553a(i), i);
        }
    }

    /* renamed from: n */
    public boolean mo20039n() {
        C2553d<? extends View> dVar = this.f8877t;
        return dVar != null && dVar.mo16632c() == 1;
    }

    public int getDynamicShowType() {
        C2553d<? extends View> dVar = this.f8877t;
        if (dVar != null) {
            return dVar.mo16632c();
        }
        return 0;
    }

    public int getExpectExpressWidth() {
        return Float.valueOf(this.f8882y).intValue();
    }

    public int getExpectExpressHeight() {
        return Float.valueOf(this.f8883z).intValue();
    }

    public C3666w getJsObject() {
        C3559o oVar = this.f8846K;
        if (oVar != null) {
            return oVar.mo20109p();
        }
        return null;
    }

    /* renamed from: w */
    private boolean m11047w() {
        return TextUtils.equals(this.f8865g, "fullscreen_interstitial_ad") || TextUtils.equals(this.f8865g, "rewarded_video") || C3559o.m11210b(this.f8865g);
    }

    /* renamed from: a */
    public void mo17097a(CharSequence charSequence, int i, int i2) {
        mo20022b(Integer.parseInt(String.valueOf(charSequence)), i);
    }

    public void setSoundMute(boolean z) {
        this.f8874q = z;
        C2550b bVar = this.f8876s;
        if (bVar != null && bVar.mo16637d() != null) {
            this.f8876s.mo16637d().setSoundMute(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo20022b(int i, int i2) {
        int i3;
        if (TextUtils.equals(this.f8865g, "fullscreen_interstitial_ad")) {
            i3 = C3513m.m10973h().mo19847e(Integer.valueOf(this.f8881x).intValue());
        } else if (TextUtils.equals(this.f8865g, "rewarded_video")) {
            i3 = C3513m.m10973h().mo19851f(this.f8881x);
        } else {
            return;
        }
        if (i3 < 0) {
            i3 = 5;
        }
        int i4 = 0;
        int i5 = (i2 >= i3 || mo18411d() == 5) ? 1 : 0;
        if (i2 <= i3) {
            i4 = i3 - i2;
        }
        C2550b bVar = this.f8876s;
        if (bVar != null && bVar.mo16637d() != null) {
            this.f8876s.mo16637d().mo17097a(String.valueOf(i), i5, i4);
        }
    }
}
