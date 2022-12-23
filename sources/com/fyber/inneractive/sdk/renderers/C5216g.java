package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.C4109R;
import com.fyber.inneractive.sdk.config.C4269r;
import com.fyber.inneractive.sdk.config.C4287y;
import com.fyber.inneractive.sdk.config.C4288z;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.flow.C4361j;
import com.fyber.inneractive.sdk.flow.C4363l;
import com.fyber.inneractive.sdk.flow.C4379u;
import com.fyber.inneractive.sdk.interfaces.C4396b;
import com.fyber.inneractive.sdk.p191ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.C5256b0;
import com.fyber.inneractive.sdk.util.C5290k;
import com.fyber.inneractive.sdk.util.C5292l;
import com.fyber.inneractive.sdk.util.C5299n;
import com.fyber.inneractive.sdk.util.C5309q0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C5347c;
import com.fyber.inneractive.sdk.web.C5349d;

/* renamed from: com.fyber.inneractive.sdk.renderers.g */
public class C5216g extends C4363l<C4379u, InneractiveAdViewEventsListener> implements C4396b, C5256b0.C5258b {

    /* renamed from: k */
    public long f13783k = 0;

    /* renamed from: l */
    public InneractiveAdViewUnitController f13784l;

    /* renamed from: m */
    public IAmraidWebViewController f13785m;

    /* renamed from: n */
    public C5349d.C5355f f13786n;

    /* renamed from: o */
    public boolean f13787o = false;

    /* renamed from: p */
    public ViewGroup f13788p;

    /* renamed from: q */
    public FrameLayout f13789q;

    /* renamed from: r */
    public long f13790r = 0;

    /* renamed from: s */
    public Runnable f13791s;

    /* renamed from: t */
    public int f13792t = 0;

    /* renamed from: u */
    public long f13793u = 0;

    /* renamed from: v */
    public boolean f13794v = false;

    /* renamed from: w */
    public boolean f13795w = true;

    /* renamed from: x */
    public boolean f13796x = false;

    /* renamed from: y */
    public C5208b f13797y;

    /* renamed from: com.fyber.inneractive.sdk.renderers.g$a */
    public static class C5217a extends FrameLayout {

        /* renamed from: a */
        public final float f13798a;

        public C5217a(Context context, float f) {
            super(context);
            this.f13798a = f;
        }

        public void onMeasure(int i, int i2) {
            int i3;
            View.MeasureSpec.getMode(i);
            int mode = View.MeasureSpec.getMode(i2);
            if (mode == 0 || (mode == Integer.MIN_VALUE && View.MeasureSpec.getSize(i2) > 0)) {
                int size = View.MeasureSpec.getSize(i);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                float f = this.f13798a;
                if (f != 0.0f) {
                    i2 = View.MeasureSpec.makeMeasureSpec((int) (((float) size) * f), 1073741824);
                }
                i3 = makeMeasureSpec;
            } else {
                int size2 = View.MeasureSpec.getSize(i);
                int size3 = View.MeasureSpec.getSize(i2);
                i3 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
                i2 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
            }
            super.onMeasure(i3, i2);
        }
    }

    /* renamed from: E */
    public final void mo26257E() {
        if (this.f13791s != null) {
            IAlog.m16446a("%scancelling refreen runnable", IAlog.m16443a((Object) this));
            C5299n.f14024b.removeCallbacks(this.f13791s);
            this.f13791s = null;
        }
    }

    /* renamed from: F */
    public final void mo26258F() {
        C5208b bVar = this.f13797y;
        if (bVar != null) {
            bVar.mo26251c();
        }
        if (this.f13785m != null) {
            mo26257E();
            AdContent adcontent = this.f10720b;
            if (adcontent != null) {
                ((C4379u) adcontent).mo24291a();
            }
            this.f13785m = null;
            this.f10720b = null;
            ViewGroup viewGroup = this.f13788p;
            if (viewGroup != null) {
                viewGroup.removeView(this.f13789q);
            }
        }
        this.f13794v = false;
    }

    /* renamed from: G */
    public final int mo26259G() {
        C4269r rVar;
        int intValue;
        int i = this.f13792t;
        if (i == -1) {
            IAlog.m16446a("%sreturning disable value for banner refresh", IAlog.m16443a((Object) this));
            return 0;
        }
        if (i > 0) {
            IAlog.m16446a("%sreturning overriden refresh interval = %d", IAlog.m16443a((Object) this), Integer.valueOf(this.f13792t));
            intValue = this.f13792t;
        } else {
            C4288z zVar = this.f10719a.getAdContent().f10715d;
            if (!(zVar == null || (rVar = ((C4287y) zVar).f10546c) == null)) {
                Integer num = rVar.f10489a;
                IAlog.m16446a("%sreturning refreshConfig = %d", IAlog.m16443a((Object) this), num);
                if (num != null) {
                    intValue = num.intValue();
                }
            }
            IAlog.m16446a("%sgetRefreshInterval: returning 0. Refresh is disabled", IAlog.m16443a((Object) this));
            return 0;
        }
        return intValue * 1000;
    }

    /* renamed from: H */
    public final void mo26260H() {
        IAmraidWebViewController iAmraidWebViewController = this.f13785m;
        if (iAmraidWebViewController != null && iAmraidWebViewController.f14079b != null) {
            IAlog.m16446a("%srefreshing ad", IAlog.m16443a((Object) this));
            if (!this.f13785m.mo26480h() || this.f13785m.mo26481i()) {
                this.f13790r = 0;
                this.f13784l.refreshAd();
            }
        }
    }

    /* renamed from: I */
    public final void mo26261I() {
        C5347c cVar;
        IAmraidWebViewController iAmraidWebViewController = this.f13785m;
        if (iAmraidWebViewController != null && (cVar = iAmraidWebViewController.f14079b) != null && cVar.getIsVisible() && this.f13790r != 0 && !this.f13785m.mo26480h() && !this.f13785m.mo26481i()) {
            if (!this.f13795w) {
                if (this.f13783k < System.currentTimeMillis() - this.f13790r) {
                    this.f13793u = 1;
                } else {
                    this.f13793u = this.f13783k - (System.currentTimeMillis() - this.f13790r);
                }
            }
            IAlog.m16446a("%sresuming refresh runnable mRefreshTimeStamp %d", IAlog.m16443a((Object) this), Long.valueOf(this.f13793u));
            mo26262a(this.f13793u, false);
        }
    }

    /* renamed from: a */
    public void mo24300a() {
    }

    public boolean canRefreshAd() {
        IAmraidWebViewController iAmraidWebViewController = this.f13785m;
        if (iAmraidWebViewController != null) {
            return !iAmraidWebViewController.mo26480h() && !this.f13785m.mo26481i();
        }
        return true;
    }

    /* renamed from: d */
    public final void mo26265d(boolean z) {
        if (this.f13791s != null) {
            this.f13795w = z;
            mo26257E();
            this.f13793u = this.f13783k - (System.currentTimeMillis() - this.f13790r);
            IAlog.m16446a("%sPause refresh time : time remaning:%d ,refreshInterval: %d", IAlog.m16443a((Object) this), Long.valueOf(this.f13793u), Long.valueOf(this.f13783k));
        }
    }

    public void destroy() {
        mo26257E();
        mo26258F();
        this.f13786n = null;
        C5256b0.C5257a.f13950a.f13946a.remove(this);
        Runnable runnable = this.f13791s;
        if (runnable != null) {
            C5299n.f14024b.removeCallbacks(runnable);
        }
        super.destroy();
    }

    /* renamed from: f */
    public int mo24306f() {
        return this.f13785m.f14133O;
    }

    /* renamed from: n */
    public void mo24307n() {
    }

    /* renamed from: p */
    public int mo24308p() {
        return this.f13785m.f14134P;
    }

    /* renamed from: t */
    public void mo24310t() {
        C5208b bVar = this.f13797y;
        if (bVar != null) {
            bVar.mo26251c();
        }
        FrameLayout frameLayout = this.f13789q;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        ViewGroup viewGroup = this.f13788p;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f13788p = null;
        }
    }

    /* renamed from: w */
    public int mo24531w() {
        IAmraidWebViewController iAmraidWebViewController = this.f13785m;
        if (iAmraidWebViewController == null) {
            return -1;
        }
        if (iAmraidWebViewController.f14079b == null || !iAmraidWebViewController.mo26480h()) {
            return C5292l.m16512c(this.f13785m.f14134P);
        }
        return C5292l.m16512c(this.f13785m.f14079b.getHeight());
    }

    /* renamed from: x */
    public int mo24532x() {
        IAmraidWebViewController iAmraidWebViewController = this.f13785m;
        if (iAmraidWebViewController == null) {
            return -1;
        }
        if (iAmraidWebViewController.f14079b == null || !iAmraidWebViewController.mo26480h()) {
            return C5292l.m16512c(this.f13785m.f14133O);
        }
        return C5292l.m16512c(this.f13785m.f14079b.getWidth());
    }

    /* renamed from: a */
    public boolean mo24304a(C4361j jVar) {
        return jVar instanceof C4379u;
    }

    /* renamed from: b */
    public void mo26264b(boolean z) {
        IAlog.m16446a("%sgot onLockScreenStateChanged with: %s", IAlog.m16443a((Object) this), Boolean.valueOf(z));
        if (z) {
            mo26265d(false);
            C5208b bVar = this.f13797y;
            if (bVar != null && bVar.f13774h) {
                bVar.mo26251c();
                return;
            }
            return;
        }
        mo26261I();
        C5208b bVar2 = this.f13797y;
        if (bVar2 != null) {
            bVar2.mo26250b();
        }
    }

    /* renamed from: q */
    public void mo24309q() {
        C5347c cVar;
        IAlog.m16446a("%sgot onAdRefreshFailed", IAlog.m16443a((Object) this));
        IAmraidWebViewController iAmraidWebViewController = this.f13785m;
        if (iAmraidWebViewController != null && (cVar = iAmraidWebViewController.f14079b) != null) {
            if (!cVar.getIsVisible() || C5256b0.C5257a.f13950a.f13947b || this.f13785m.mo26480h() || this.f13785m.mo26481i()) {
                IAlog.m16446a("%sview is not visible or screen is locked or webView is Expanded or web is Resised. Waiting for visibility change", IAlog.m16443a((Object) this));
                this.f13793u = 1;
                return;
            }
            IAlog.m16446a("%sview is visible and screen is unlocked: refreshing ad and webView is not expanded", IAlog.m16443a((Object) this));
            long G = (long) mo26259G();
            this.f13783k = G;
            if (G != 0) {
                mo26262a(10000, false);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x015c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24302a(android.view.ViewGroup r15) {
        /*
            r14 = this;
            com.fyber.inneractive.sdk.external.InneractiveAdSpot r0 = r14.f10719a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0014
            java.lang.Object[] r15 = new java.lang.Object[r1]
            java.lang.String r0 = com.fyber.inneractive.sdk.util.IAlog.m16443a((java.lang.Object) r14)
            r15[r2] = r0
            java.lang.String r0 = "%sYou must set the spot to render before calling renderAd"
            com.fyber.inneractive.sdk.util.IAlog.m16450e(r0, r15)
            return
        L_0x0014:
            r14.f13787o = r2
            r14.f10724f = r2
            java.lang.String r3 = "InneractiveAdViewMraidAdRenderer.renderAd: Spot ad content is not the right content :( %s"
            if (r15 == 0) goto L_0x0027
            r14.f13788p = r15
            com.fyber.inneractive.sdk.external.InneractiveUnitController r15 = r0.getSelectedUnitController()
            com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController r15 = (com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController) r15
            r14.f13784l = r15
            goto L_0x0056
        L_0x0027:
            boolean r15 = r14.f13796x
            if (r15 != 0) goto L_0x0056
            r14.mo26258F()
            com.fyber.inneractive.sdk.external.InneractiveAdSpot r15 = r14.f10719a
            com.fyber.inneractive.sdk.flow.j r15 = r15.getAdContent()
            boolean r15 = r15 instanceof com.fyber.inneractive.sdk.flow.C4379u
            if (r15 == 0) goto L_0x0048
            com.fyber.inneractive.sdk.external.InneractiveAdSpot r15 = r14.f10719a
            com.fyber.inneractive.sdk.flow.j r15 = r15.getAdContent()
            com.fyber.inneractive.sdk.flow.u r15 = (com.fyber.inneractive.sdk.flow.C4379u) r15
            r14.f10720b = r15
            r14.f10723e = r2
            r14.mo24522C()
            goto L_0x0056
        L_0x0048:
            java.lang.Object[] r15 = new java.lang.Object[r1]
            com.fyber.inneractive.sdk.external.InneractiveAdSpot r0 = r14.f10719a
            com.fyber.inneractive.sdk.flow.j r0 = r0.getAdContent()
            r15[r2] = r0
            com.fyber.inneractive.sdk.util.IAlog.m16450e(r3, r15)
            return
        L_0x0056:
            AdContent r15 = r14.f10720b
            r0 = 0
            if (r15 == 0) goto L_0x0061
            r4 = r15
            com.fyber.inneractive.sdk.flow.u r4 = (com.fyber.inneractive.sdk.flow.C4379u) r4
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r4 = r4.f10770g
            goto L_0x0062
        L_0x0061:
            r4 = r0
        L_0x0062:
            r14.f13785m = r4
            if (r4 == 0) goto L_0x01a1
            com.fyber.inneractive.sdk.web.d$f r15 = r14.f13786n
            if (r15 != 0) goto L_0x0071
            com.fyber.inneractive.sdk.renderers.e r15 = new com.fyber.inneractive.sdk.renderers.e
            r15.<init>(r14)
            r14.f13786n = r15
        L_0x0071:
            com.fyber.inneractive.sdk.web.d$f r15 = r14.f13786n
            r4.setListener(r15)
            AdContent r15 = r14.f10720b
            com.fyber.inneractive.sdk.flow.u r15 = (com.fyber.inneractive.sdk.flow.C4379u) r15
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r3 = r15.f10712a
            com.fyber.inneractive.sdk.config.z r15 = r15.f10715d
            r3 = -2
            r4 = 0
            if (r15 == 0) goto L_0x00c0
            com.fyber.inneractive.sdk.config.y r15 = (com.fyber.inneractive.sdk.config.C4287y) r15
            com.fyber.inneractive.sdk.config.r r5 = r15.f10546c
            if (r5 == 0) goto L_0x00c0
            com.fyber.inneractive.sdk.config.r r5 = r15.f10546c
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r5 = r5.f10490b
            if (r5 == 0) goto L_0x00c0
            com.fyber.inneractive.sdk.config.r r15 = r15.f10546c
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r15 = r15.f10490b
            boolean r15 = r15.isFullscreenUnit()
            if (r15 == 0) goto L_0x00c0
            com.fyber.inneractive.sdk.renderers.g$a r15 = new com.fyber.inneractive.sdk.renderers.g$a
            android.view.ViewGroup r5 = r14.f13788p
            android.content.Context r5 = r5.getContext()
            r6 = 1069547520(0x3fc00000, float:1.5)
            r15.<init>(r5, r6)
            r14.f13789q = r15
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r5 = r14.f13785m
            android.view.ViewGroup$LayoutParams r6 = new android.view.ViewGroup$LayoutParams
            r7 = -1
            r6.<init>(r7, r7)
            r5.mo26426a(r15, r6)
            android.view.ViewGroup r15 = r14.f13788p
            android.widget.FrameLayout r5 = r14.f13789q
            android.view.ViewGroup$LayoutParams r6 = new android.view.ViewGroup$LayoutParams
            r6.<init>(r3, r3)
            r15.addView(r5, r6)
            goto L_0x014f
        L_0x00c0:
            com.fyber.inneractive.sdk.renderers.g$a r15 = new com.fyber.inneractive.sdk.renderers.g$a
            android.view.ViewGroup r5 = r14.f13788p
            android.content.Context r5 = r5.getContext()
            r15.<init>(r5, r4)
            r14.f13789q = r15
            AdContent r15 = r14.f10720b
            com.fyber.inneractive.sdk.flow.u r15 = (com.fyber.inneractive.sdk.flow.C4379u) r15
            T r5 = r15.f10713b
            com.fyber.inneractive.sdk.response.f r5 = (com.fyber.inneractive.sdk.response.C5234f) r5
            int r6 = r5.f13869e
            int r5 = r5.f13870f
            com.fyber.inneractive.sdk.config.z r15 = r15.f10715d
            com.fyber.inneractive.sdk.util.q0 r15 = m16213a(r6, r5, r15)
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r5 = r14.f13785m
            int r6 = r15.f14037a
            int r7 = r15.f14038b
            r5.setAdDefaultSize(r6, r7)
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r5 = r14.f13785m
            com.fyber.inneractive.sdk.web.c r6 = r5.f14079b
            if (r6 != 0) goto L_0x0120
            android.app.Application r7 = com.fyber.inneractive.sdk.util.C5292l.f14015a
            if (r7 == 0) goto L_0x0120
            boolean r3 = r14.f13796x
            if (r3 != 0) goto L_0x011c
            r14.f13796x = r1
            com.fyber.inneractive.sdk.web.c r3 = new com.fyber.inneractive.sdk.web.c
            r3.<init>(r7)
            r5.f14079b = r3
            r5.mo26431b()     // Catch:{ all -> 0x0115 }
            com.fyber.inneractive.sdk.web.c r8 = r5.f14079b
            java.lang.String r9 = r5.f14096s
            java.lang.String r10 = r5.f14097t
            r13 = 0
            java.lang.String r11 = "text/html"
            java.lang.String r12 = "utf-8"
            r8.loadDataWithBaseURL(r9, r10, r11, r12, r13)
            r5.mo26434e()
            r3 = r1
            goto L_0x0116
        L_0x0115:
            r3 = r2
        L_0x0116:
            if (r3 != 0) goto L_0x014f
            r14.mo26263a((com.fyber.inneractive.sdk.util.C5309q0) r15)
            goto L_0x014f
        L_0x011c:
            r14.mo26263a((com.fyber.inneractive.sdk.util.C5309q0) r15)
            goto L_0x014f
        L_0x0120:
            if (r6 == 0) goto L_0x0127
            android.view.ViewParent r5 = r6.getParent()
            goto L_0x0128
        L_0x0127:
            r5 = r0
        L_0x0128:
            boolean r7 = r5 instanceof android.view.ViewGroup
            if (r7 == 0) goto L_0x0131
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r5.removeView(r6)
        L_0x0131:
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r5 = r14.f13785m
            android.widget.FrameLayout r6 = r14.f13789q
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            int r8 = r15.f14037a
            int r15 = r15.f14038b
            r9 = 17
            r7.<init>(r8, r15, r9)
            r5.mo26426a(r6, r7)
            android.view.ViewGroup r15 = r14.f13788p
            android.widget.FrameLayout r5 = r14.f13789q
            android.view.ViewGroup$LayoutParams r6 = new android.view.ViewGroup$LayoutParams
            r6.<init>(r3, r3)
            r15.addView(r5, r6)
        L_0x014f:
            AdContent r15 = r14.f10720b
            if (r15 == 0) goto L_0x015a
            com.fyber.inneractive.sdk.flow.u r15 = (com.fyber.inneractive.sdk.flow.C4379u) r15
            T r15 = r15.f10713b
            r0 = r15
            com.fyber.inneractive.sdk.response.f r0 = (com.fyber.inneractive.sdk.response.C5234f) r0
        L_0x015a:
            if (r0 == 0) goto L_0x01a8
            com.fyber.inneractive.sdk.renderers.b r15 = new com.fyber.inneractive.sdk.renderers.b
            android.widget.FrameLayout r3 = r14.f13789q
            com.fyber.inneractive.sdk.renderers.d r5 = new com.fyber.inneractive.sdk.renderers.d
            r5.<init>(r14)
            r15.<init>(r0, r3, r5)
            r14.f13797y = r15
            r15.f13775i = r2
            r15.f13771e = r1
            r15.f13772f = r4
            int r3 = r0.f13884t
            if (r3 < r1) goto L_0x017c
            r5 = 100
            int r3 = java.lang.Math.min(r3, r5)
            r15.f13771e = r3
        L_0x017c:
            float r0 = r0.f13885u
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x0186
            r15.f13772f = r0
        L_0x0186:
            float r0 = r15.f13772f
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x01a8
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "IAVisibilityTracker: startTrackingVisibility"
            com.fyber.inneractive.sdk.util.IAlog.m16446a(r2, r0)
            r15.f13770d = r4
            long r2 = java.lang.System.currentTimeMillis()
            r15.f13773g = r2
            r15.f13774h = r1
            r15.mo26249a()
            goto L_0x01a8
        L_0x01a1:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r0[r2] = r15
            com.fyber.inneractive.sdk.util.IAlog.m16450e(r3, r0)
        L_0x01a8:
            com.fyber.inneractive.sdk.util.b0 r15 = com.fyber.inneractive.sdk.util.C5256b0.C5257a.f13950a
            java.util.List<com.fyber.inneractive.sdk.util.b0$b> r0 = r15.f13946a
            boolean r0 = r0.contains(r14)
            if (r0 != 0) goto L_0x01b7
            java.util.List<com.fyber.inneractive.sdk.util.b0$b> r15 = r15.f13946a
            r15.add(r14)
        L_0x01b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.renderers.C5216g.mo24302a(android.view.ViewGroup):void");
    }

    /* renamed from: a */
    public final void mo26262a(long j, boolean z) {
        IAmraidWebViewController iAmraidWebViewController;
        C5347c cVar;
        if (TextUtils.isEmpty(this.f10719a.getMediationNameString()) && j != 0 && !(this.f10719a.getSelectedUnitController() instanceof InneractiveFullscreenUnitController) && this.f13792t != -1 && (iAmraidWebViewController = this.f13785m) != null && (cVar = iAmraidWebViewController.f14079b) != null) {
            if (!cVar.getIsVisible()) {
                IAlog.m16446a("%sstartRefreshTimer called but ad is not visible", IAlog.m16443a((Object) this));
                return;
            }
            this.f13790r = System.currentTimeMillis();
            this.f13783k = z ? this.f13783k : j;
            IAlog.m16446a("%sstartRefreshTimer in %d msec, mRefreshInterval = %d", IAlog.m16443a((Object) this), Long.valueOf(j), Long.valueOf(this.f13783k));
            if (j > 1) {
                Runnable runnable = this.f13791s;
                if (runnable != null) {
                    C5299n.f14024b.removeCallbacks(runnable);
                }
                mo26257E();
                C5215f fVar = new C5215f(this);
                this.f13791s = fVar;
                C5299n.f14024b.postDelayed(fVar, j);
                return;
            }
            mo26260H();
        }
    }

    /* renamed from: a */
    public static C5309q0 m16213a(int i, int i2, C4288z zVar) {
        int i3;
        int i4;
        C4269r rVar;
        IAlog.m16446a("View layout params: response width and height: %d, %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i <= 0 || i2 <= 0) {
            UnitDisplayType unitDisplayType = UnitDisplayType.BANNER;
            if (!(zVar == null || (rVar = ((C4287y) zVar).f10546c) == null)) {
                unitDisplayType = rVar.f10490b;
            }
            if (unitDisplayType.equals(UnitDisplayType.MRECT)) {
                i4 = C5292l.m16499a((float) 300);
                i3 = C5292l.m16499a((float) 250);
            } else if (C5290k.m16497o()) {
                i4 = C5292l.m16499a((float) 728);
                i3 = C5292l.m16499a((float) 90);
            } else {
                i4 = C5292l.m16499a((float) 320);
                i3 = C5292l.m16499a((float) 50);
            }
        } else {
            i4 = C5292l.m16499a((float) i);
            i3 = C5292l.m16499a((float) i2);
        }
        IAlog.m16449d("View layout params: final scaled width and height: %d, %d", Integer.valueOf(i4), Integer.valueOf(i3));
        return new C5309q0(i4, i3);
    }

    /* renamed from: a */
    public boolean mo24303a(View view) {
        return view.equals(this.f13788p);
    }

    /* renamed from: a */
    public void mo24301a(int i) {
        this.f13792t = i;
    }

    /* renamed from: a */
    public final void mo26263a(C5309q0 q0Var) {
        FrameLayout frameLayout = new FrameLayout(this.f13788p.getContext());
        frameLayout.setBackgroundResource(C4109R.color.blank_background);
        this.f13788p.removeAllViews();
        this.f13788p.addView(frameLayout, new FrameLayout.LayoutParams(q0Var.f14037a, q0Var.f14038b, 17));
    }
}
