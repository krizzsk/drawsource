package com.fyber.inneractive.sdk.renderers;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.display.C4290b;
import com.fyber.inneractive.sdk.display.C4291c;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveAdViewVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveNativeVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.C4361j;
import com.fyber.inneractive.sdk.flow.C4363l;
import com.fyber.inneractive.sdk.flow.C4392y;
import com.fyber.inneractive.sdk.interfaces.C4396b;
import com.fyber.inneractive.sdk.model.vast.C4420b;
import com.fyber.inneractive.sdk.model.vast.C4421c;
import com.fyber.inneractive.sdk.model.vast.C4426h;
import com.fyber.inneractive.sdk.network.C4517s;
import com.fyber.inneractive.sdk.p188dv.C4292a;
import com.fyber.inneractive.sdk.player.C4533c;
import com.fyber.inneractive.sdk.player.C5008f;
import com.fyber.inneractive.sdk.player.C5015i;
import com.fyber.inneractive.sdk.player.controller.C4602q;
import com.fyber.inneractive.sdk.player.p190ui.C5036c;
import com.fyber.inneractive.sdk.player.p190ui.C5040g;
import com.fyber.inneractive.sdk.response.C5235g;
import com.fyber.inneractive.sdk.util.C5262d0;
import com.fyber.inneractive.sdk.util.C5267e;
import com.fyber.inneractive.sdk.util.C5270f0;
import com.fyber.inneractive.sdk.util.C5292l;
import com.fyber.inneractive.sdk.util.C5306p0;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.renderers.h */
public class C5218h extends C4363l<C4392y, InneractiveAdViewEventsListener> implements C4396b, InneractiveNativeVideoContentController.Renderer, C5270f0.C5275e {

    /* renamed from: k */
    public FrameLayout f13799k;

    /* renamed from: l */
    public C5040g f13800l;

    /* renamed from: m */
    public C4602q f13801m;

    /* renamed from: n */
    public VideoContentListener f13802n;

    /* renamed from: o */
    public final C4533c.C4536c f13803o = new C5219a();

    /* renamed from: p */
    public ViewGroup f13804p;

    /* renamed from: q */
    public C5228n f13805q;

    /* renamed from: r */
    public float f13806r = 0.0f;

    /* renamed from: s */
    public Rect f13807s = new Rect();

    /* renamed from: t */
    public Runnable f13808t;

    /* renamed from: u */
    public boolean f13809u = false;

    /* renamed from: v */
    public final C4602q.C4603a f13810v = new C5220b();

    /* renamed from: com.fyber.inneractive.sdk.renderers.h$a */
    public class C5219a implements C4533c.C4536c {
        public C5219a() {
        }

        /* renamed from: a */
        public void mo24727a(C4533c cVar) {
            C4602q qVar = C5218h.this.f13801m;
            if (qVar != null) {
                qVar.mo24805d(false);
                C5218h.this.f13801m.mo24807f();
            }
        }
    }

    /* renamed from: E */
    public final void mo26267E() {
        ViewGroup viewGroup;
        Runnable runnable = this.f13808t;
        if (runnable != null && (viewGroup = this.f13804p) != null) {
            viewGroup.removeCallbacks(runnable);
            this.f13808t = null;
        }
    }

    /* renamed from: a */
    public void mo24301a(int i) {
    }

    public void destroy() {
        mo24310t();
        super.destroy();
    }

    /* renamed from: f */
    public int mo24306f() {
        return 0;
    }

    /* renamed from: n */
    public void mo24307n() {
        C4602q qVar = this.f13801m;
        if (qVar != null) {
            qVar.mo24805d(false);
        }
    }

    /* renamed from: p */
    public int mo24308p() {
        return 0;
    }

    public void pauseVideo() {
        C4602q qVar = this.f13801m;
        if (qVar != null) {
            qVar.pauseVideo();
        }
    }

    public void playVideo() {
        C4602q qVar = this.f13801m;
        if (qVar != null) {
            qVar.mo24802b(0);
        }
    }

    /* renamed from: q */
    public void mo24309q() {
    }

    /* renamed from: t */
    public void mo24310t() {
        mo26267E();
        C5270f0.C5274d.f13984a.mo26371a(this.f13804p);
        IAlog.m16446a("%sunbind called. root is %s", IAlog.m16443a((Object) this), this.f13804p);
        if (this.f13801m != null) {
            IAlog.m16446a("%sdestroying video ui controller", IAlog.m16443a((Object) this));
            this.f13801m.mo24801a(null);
            this.f13801m.destroy();
            this.f13801m = null;
        }
        if (this.f13800l != null) {
            this.f13804p.setLayoutTransition((LayoutTransition) null);
            this.f13804p.removeView(this.f13799k);
            this.f13800l.destroy();
            this.f13800l = null;
        }
    }

    /* renamed from: a */
    public boolean mo24304a(C4361j jVar) {
        return jVar instanceof C4392y;
    }

    /* renamed from: a */
    public void mo24302a(ViewGroup viewGroup) {
        Bitmap bitmap;
        InneractiveAdSpot inneractiveAdSpot = this.f10719a;
        if (inneractiveAdSpot == null) {
            IAlog.m16450e("%sYou must set the spot to render before calling renderAd", IAlog.m16443a((Object) this));
            return;
        }
        this.f13804p = viewGroup;
        InneractiveUnitController selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
        if (!(selectedUnitController instanceof InneractiveAdViewUnitController)) {
            IAlog.m16450e("%sWrong type of unit controller found. Expecting InneractiveAdViewUnitController", IAlog.m16443a((Object) this));
        } else {
            InneractiveContentController selectedContentController = selectedUnitController.getSelectedContentController();
            if (selectedContentController != null) {
                if (selectedContentController instanceof InneractiveAdViewVideoContentController) {
                    this.f13802n = (VideoContentListener) ((InneractiveAdViewVideoContentController) selectedContentController).getEventsListener();
                } else {
                    IAlog.m16450e("%sContent controller expected to be InneractiveFullscreenVideoContentController and is %s", IAlog.m16443a((Object) this), selectedContentController.getClass().getSimpleName());
                }
            }
        }
        this.f13809u = false;
        this.f13799k = new FrameLayout(viewGroup.getContext());
        C5015i iVar = ((C4392y) this.f10720b).f10797g;
        Context context = viewGroup.getContext();
        if (iVar != null) {
            ((C5008f) iVar.f13374f).getClass();
            C5207a aVar = new C5207a(iVar);
            this.f13805q = aVar;
            this.f13800l = aVar.mo26246a(context);
            this.f13801m = (C4602q) this.f13805q.mo26245a(this.f10719a, (C4392y) this.f10720b);
            this.f13804p.addView(this.f13799k, new ViewGroup.LayoutParams(-1, -2));
            this.f13804p.setLayoutTransition((LayoutTransition) null);
            this.f13799k.addView((View) this.f13800l, new FrameLayout.LayoutParams(-2, -2, 17));
            this.f13801m.mo24801a(this.f13810v);
            this.f13801m.mo24805d(this.f13805q.mo26248a());
            this.f13805q.mo26247a(this.f13803o);
            if ((this.f13805q instanceof C5207a) && (bitmap = ((C5008f) iVar.f13374f).f11215l) != null) {
                this.f13801m.mo24800a(bitmap);
            }
            C5270f0 f0Var = C5270f0.C5274d.f13984a;
            ViewGroup viewGroup2 = this.f13804p;
            f0Var.getClass();
            f0Var.mo26369a(viewGroup2.getContext(), (View) viewGroup2, (C5270f0.C5275e) this);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.renderers.h$b */
    public class C5220b implements C4602q.C4603a {
        public C5220b() {
        }

        /* renamed from: a */
        public void mo24917a(String str, String str2) {
            C5218h hVar = C5218h.this;
            hVar.getClass();
            IAlog.m16446a("%s ad view video ad renderer callback: onSuspiciousNoUserWebActionDetected", IAlog.m16443a((Object) hVar));
            ViewGroup viewGroup = C5218h.this.f13804p;
            if (viewGroup != null && viewGroup.getContext() != null) {
                C5218h hVar2 = C5218h.this;
                if (!hVar2.f13809u) {
                    C4517s.m13799a(hVar2.f13804p.getContext(), str, str2, C5218h.this.f10720b);
                    boolean unused = C5218h.this.f13809u = true;
                    C5218h hVar3 = C5218h.this;
                    hVar3.getClass();
                    IAlog.m16446a("%s reporting auto redirect", IAlog.m16443a((Object) hVar3));
                    return;
                }
                hVar2.getClass();
                IAlog.m16446a("%s redirect already reported for this ad", IAlog.m16443a((Object) hVar2));
            }
        }

        /* renamed from: a */
        public void mo24918a(boolean z) {
        }

        /* renamed from: a */
        public void mo24919a(boolean z, Orientation orientation) {
        }

        /* renamed from: c */
        public void mo24898c() {
            Object obj;
            C5218h hVar = C5218h.this;
            EventsListener eventslistener = hVar.f10721c;
            if (eventslistener != null) {
                ((InneractiveAdViewEventsListener) eventslistener).onAdExpanded(hVar.f10719a);
            }
            ViewGroup viewGroup = C5218h.this.f13804p;
            if (viewGroup != null && viewGroup.getContext() != null) {
                C5218h hVar2 = C5218h.this;
                if (hVar2.f10720b instanceof C4292a) {
                    obj = new C4290b();
                } else {
                    obj = new C4291c();
                }
                if (obj instanceof C4291c) {
                    C4291c cVar = (C4291c) obj;
                    Context context = hVar2.f13804p.getContext();
                    InneractiveAdSpot inneractiveAdSpot = C5218h.this.f10719a;
                    Intent intent = new Intent(context, InneractiveFullscreenAdActivity.class);
                    intent.putExtra("spotId", inneractiveAdSpot.getLocalUniqueId());
                    if (!(context instanceof Activity)) {
                        intent.setFlags(268435456);
                    }
                    try {
                        IAlog.m16446a("%sIAInterstitialUtil: Opening interstitial for spot id: %s", IAlog.m16443a((Object) context), inneractiveAdSpot.getLocalUniqueId());
                        context.startActivity(intent);
                    } catch (ActivityNotFoundException unused) {
                        IAlog.m16448c("%sIAInterstitialUtil: InneractiveFullscreenAdActivity.class not found. Did you declare InneractiveFullscreenAdActivity in your manifest?", IAlog.m16443a((Object) context));
                    }
                }
            }
        }

        /* renamed from: e */
        public void mo24920e() {
        }

        /* renamed from: g */
        public void mo24921g() {
            C4421c cVar;
            C4426h hVar;
            AdContent adcontent = C5218h.this.f10720b;
            if (adcontent != null) {
                C4392y yVar = (C4392y) adcontent;
                if (yVar.f10712a != null && yVar.f10713b != null) {
                    String str = null;
                    C4420b bVar = ((C5235g) yVar.f10713b).f13893C;
                    if (!(bVar == null || (cVar = bVar.f10865g) == null || (hVar = cVar.f10869b) == null)) {
                        str = hVar.toString();
                    }
                    C5218h.this.mo24528a(str);
                }
            }
        }

        /* renamed from: h */
        public void mo24922h() {
        }

        /* renamed from: j */
        public void mo24923j() {
            C5218h.this.mo24526a((InneractiveUnitController.AdDisplayError) new WebViewRendererProcessHasGoneError());
        }

        /* renamed from: k */
        public void mo24924k() {
        }

        /* renamed from: l */
        public void mo24925l() {
            C5218h hVar = C5218h.this;
            C4392y yVar = (C4392y) hVar.f10720b;
            if (!yVar.f10798h) {
                yVar.f10798h = true;
                hVar.mo24520A();
            }
        }

        public void onCompleted() {
            C5040g gVar;
            C5218h hVar = C5218h.this;
            VideoContentListener videoContentListener = hVar.f13802n;
            if (videoContentListener != null && (gVar = hVar.f13800l) != null && ((C5036c) gVar).f13441e) {
                videoContentListener.onCompleted();
            }
        }

        public void onPlayerError() {
            C5040g gVar;
            C5218h hVar = C5218h.this;
            VideoContentListener videoContentListener = hVar.f13802n;
            if (videoContentListener != null && (gVar = hVar.f13800l) != null && ((C5036c) gVar).f13441e) {
                videoContentListener.onPlayerError();
            }
        }

        public void onProgress(int i, int i2) {
            C5040g gVar;
            C5218h hVar = C5218h.this;
            VideoContentListener videoContentListener = hVar.f13802n;
            if (videoContentListener != null && (gVar = hVar.f13800l) != null && ((C5036c) gVar).f13441e) {
                videoContentListener.onProgress(i, i2);
            }
        }

        /* renamed from: r */
        public void mo24929r() {
            C5218h hVar = C5218h.this;
            if (hVar.f10721c != null) {
                hVar.mo24534z();
            }
        }

        /* renamed from: a */
        public void mo24916a(View view, String str) {
            if (view != null && view.getContext() != null) {
                InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(view.getContext(), str);
                C5218h.this.mo24534z();
            }
        }

        /* renamed from: a */
        public C5262d0.C5263a mo24914a(C5306p0 p0Var, C5267e eVar) {
            Context context;
            C5218h hVar = C5218h.this;
            if (hVar.f13800l.getContext() == null) {
                context = C5292l.f14015a;
            } else {
                context = C5218h.this.f13800l.getContext();
            }
            AdContent adcontent = C5218h.this.f10720b;
            return hVar.mo24524a(context, adcontent != null ? ((C4392y) adcontent).mo24573f() : null, p0Var, eVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
            r0 = (r0 = r0.f10865g).f10869b;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.fyber.inneractive.sdk.util.C5262d0.C5263a mo24915a(java.lang.String r4, com.fyber.inneractive.sdk.util.C5306p0 r5) {
            /*
                r3 = this;
                com.fyber.inneractive.sdk.renderers.h r0 = com.fyber.inneractive.sdk.renderers.C5218h.this
                AdContent r0 = r0.f10720b
                r1 = 0
                if (r0 == 0) goto L_0x002c
                com.fyber.inneractive.sdk.flow.y r0 = (com.fyber.inneractive.sdk.flow.C4392y) r0
                com.fyber.inneractive.sdk.external.InneractiveAdRequest r2 = r0.f10712a
                if (r2 == 0) goto L_0x002c
                T r2 = r0.f10713b
                if (r2 == 0) goto L_0x002c
                T r0 = r0.f10713b
                com.fyber.inneractive.sdk.response.g r0 = (com.fyber.inneractive.sdk.response.C5235g) r0
                com.fyber.inneractive.sdk.model.vast.b r0 = r0.f13893C
                if (r0 == 0) goto L_0x0026
                com.fyber.inneractive.sdk.model.vast.c r0 = r0.f10865g
                if (r0 == 0) goto L_0x0026
                com.fyber.inneractive.sdk.model.vast.h r0 = r0.f10869b
                if (r0 == 0) goto L_0x0026
                java.lang.String r0 = r0.toString()
                goto L_0x0027
            L_0x0026:
                r0 = r1
            L_0x0027:
                com.fyber.inneractive.sdk.renderers.h r2 = com.fyber.inneractive.sdk.renderers.C5218h.this
                r2.mo24528a((java.lang.String) r0)
            L_0x002c:
                android.app.Application r0 = com.fyber.inneractive.sdk.util.C5292l.f14015a
                com.fyber.inneractive.sdk.renderers.h r2 = com.fyber.inneractive.sdk.renderers.C5218h.this
                android.view.ViewGroup r2 = r2.f13804p
                if (r2 == 0) goto L_0x0042
                android.content.Context r2 = r2.getContext()
                if (r2 == 0) goto L_0x0042
                com.fyber.inneractive.sdk.renderers.h r0 = com.fyber.inneractive.sdk.renderers.C5218h.this
                android.view.ViewGroup r0 = r0.f13804p
                android.content.Context r0 = r0.getContext()
            L_0x0042:
                boolean r2 = android.text.TextUtils.isEmpty(r4)
                if (r2 == 0) goto L_0x0064
                com.fyber.inneractive.sdk.renderers.h r4 = com.fyber.inneractive.sdk.renderers.C5218h.this
                AdContent r4 = r4.f10720b
                com.fyber.inneractive.sdk.flow.y r4 = (com.fyber.inneractive.sdk.flow.C4392y) r4
                T r2 = r4.f10713b
                if (r2 == 0) goto L_0x0063
                com.fyber.inneractive.sdk.response.g r2 = (com.fyber.inneractive.sdk.response.C5235g) r2
                com.fyber.inneractive.sdk.model.vast.b r2 = r2.f13893C
                com.fyber.inneractive.sdk.model.vast.c r2 = r2.f10865g
                if (r2 == 0) goto L_0x005c
                java.lang.String r1 = r2.f10874g
            L_0x005c:
                if (r1 != 0) goto L_0x0063
                java.lang.String r4 = r4.mo24573f()
                goto L_0x0064
            L_0x0063:
                r4 = r1
            L_0x0064:
                com.fyber.inneractive.sdk.renderers.h r1 = com.fyber.inneractive.sdk.renderers.C5218h.this
                com.fyber.inneractive.sdk.util.e r2 = com.fyber.inneractive.sdk.util.C5267e.VAST_ENDCARD
                com.fyber.inneractive.sdk.util.d0$a r4 = r1.mo24524a(r0, r4, r5, r2)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.renderers.C5218h.C5220b.mo24915a(java.lang.String, com.fyber.inneractive.sdk.util.p0):com.fyber.inneractive.sdk.util.d0$a");
        }
    }

    /* renamed from: a */
    public void mo26268a(View view, float f, Rect rect) {
        if (this.f13806r != f || !this.f13807s.equals(rect)) {
            this.f13806r = f;
            this.f13807s.set(rect);
            C4602q qVar = this.f13801m;
            if (qVar != null) {
                qVar.mo24851b(false);
                ((C5036c) this.f13800l).mo25652b();
                this.f13801m.mo24850a(f);
            }
            if (f > 0.0f) {
                mo26267E();
                C5221i iVar = new C5221i(this);
                this.f13808t = iVar;
                this.f13804p.postDelayed(iVar, 100);
                return;
            }
            mo26267E();
        }
    }

    /* renamed from: a */
    public boolean mo24303a(View view) {
        return view.equals(this.f13804p);
    }

    /* renamed from: a */
    public void mo24300a() {
        C4602q qVar = this.f13801m;
        if (qVar != null) {
            qVar.mo24849a();
        }
    }
}
