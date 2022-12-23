package com.inmobi.media;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.GravityCompat;
import com.facebook.share.internal.ShareConstants;
import com.inmobi.media.C5865ch;
import com.inmobi.media.C5996ex;
import com.inmobi.media.C6031fi;
import com.inmobi.media.C6038fm;
import com.inmobi.media.C6281n;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.inmobi.media.ff */
/* compiled from: NativeLayoutInflater */
public final class C6016ff implements C6031fi.C6032a {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final String f15249d = C6016ff.class.getSimpleName();

    /* renamed from: m */
    private static Handler f15250m = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    int f15251a = 0;

    /* renamed from: b */
    public final C5996ex f15252b;

    /* renamed from: c */
    C6052fo f15253c;

    /* renamed from: e */
    private final WeakReference<Context> f15254e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C5854ca f15255f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C6281n f15256g;

    /* renamed from: h */
    private final C6074ft f15257h;

    /* renamed from: i */
    private C6028c f15258i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C6026a f15259j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C6027b f15260k;

    /* renamed from: l */
    private C6033fj f15261l;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f15262n = false;

    /* renamed from: o */
    private C6301q f15263o;

    /* renamed from: com.inmobi.media.ff$a */
    /* compiled from: NativeLayoutInflater */
    interface C6026a {
        /* renamed from: a */
        void mo35171a(View view, C5847bw bwVar);
    }

    /* renamed from: com.inmobi.media.ff$b */
    /* compiled from: NativeLayoutInflater */
    interface C6027b {
        /* renamed from: a */
        void mo35169a(C5864cg cgVar);
    }

    /* renamed from: com.inmobi.media.ff$c */
    /* compiled from: NativeLayoutInflater */
    interface C6028c {
        /* renamed from: a */
        void mo35170a(int i, C5847bw bwVar);
    }

    public C6016ff(Context context, C6074ft ftVar, C6281n nVar, C5854ca caVar, C6028c cVar, C6026a aVar, C6027b bVar) {
        this.f15254e = new WeakReference<>(context);
        this.f15256g = nVar;
        this.f15255f = caVar;
        this.f15258i = cVar;
        this.f15259j = aVar;
        this.f15260k = bVar;
        this.f15252b = new C5996ex();
        this.f15257h = ftVar;
        this.f15253c = C6052fo.m17996a(context);
    }

    /* renamed from: c */
    private Context m17921c() {
        return (Context) this.f15254e.get();
    }

    /* renamed from: a */
    public final C6030fh mo35174a(C6030fh fhVar, ViewGroup viewGroup, C6301q qVar) {
        this.f15263o = qVar;
        C6030fh a = m17912a(fhVar, viewGroup);
        if (!this.f15262n) {
            mo35176b(a, this.f15255f.f14751d);
        }
        return a;
    }

    /* renamed from: b */
    public final C6030fh mo35177b(C6030fh fhVar, final ViewGroup viewGroup, C6301q qVar) {
        this.f15263o = qVar;
        final C6030fh a = m17912a(fhVar, viewGroup);
        f15250m.post(new Runnable() {
            public final void run() {
                if (!C6016ff.this.f15262n) {
                    C6016ff ffVar = C6016ff.this;
                    ffVar.mo35176b(a, ffVar.f15255f.f14751d);
                }
            }
        });
        return a;
    }

    /* renamed from: a */
    private C6030fh m17912a(C6030fh fhVar, ViewGroup viewGroup) {
        C6030fh fhVar2 = fhVar == null ? (C6030fh) this.f15253c.mo35259a(m17921c(), (C5847bw) this.f15255f.f14751d, this.f15257h) : fhVar;
        if (!(fhVar2 == null || fhVar == null)) {
            m17917a(fhVar2);
            this.f15253c.mo35261a((ViewGroup) fhVar2);
            C6052fo.m18002a((View) fhVar2, this.f15255f.f14751d.f14705c);
        }
        C6052fo.m18014b(this.f15255f.f14751d.f14705c.f14728a.x);
        fhVar2.setLayoutParams(C6052fo.m17995a((C5847bw) this.f15255f.f14751d, viewGroup));
        return fhVar2;
    }

    /* renamed from: a */
    private static void m17917a(C6030fh fhVar) {
        ViewParent parent = fhVar.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(fhVar);
        }
    }

    /* renamed from: a */
    public final ViewGroup mo35173a(ViewGroup viewGroup, C5849by byVar) {
        ViewGroup viewGroup2 = (ViewGroup) this.f15253c.mo35259a(m17921c(), (C5847bw) byVar, this.f15257h);
        if (viewGroup2 != null) {
            viewGroup2.setLayoutParams(C6052fo.m17995a((C5847bw) byVar, viewGroup));
        }
        return viewGroup2;
    }

    /* renamed from: a */
    public final int mo35172a(int i) {
        this.f15251a = i;
        this.f15258i.mo35170a(i, this.f15255f.mo34842a(i));
        return m17923d();
    }

    /* renamed from: a */
    private void m17915a(final C5864cg cgVar, C5865ch chVar) {
        chVar.setTimerEventsListener(new C5865ch.C5867b() {
            /* renamed from: a */
            public final void mo34863a() {
                if (C6016ff.this.f15260k != null) {
                    C6016ff.this.f15260k.mo35169a(cgVar);
                }
            }
        });
    }

    /* renamed from: a */
    private void m17913a(View view, final C5847bw bwVar) {
        boolean z;
        final List<C5996ex.C5999a> a = this.f15252b.mo35134a(view, bwVar);
        if (a == null) {
            Iterator<C5868ci> it = bwVar.f14723u.iterator();
            while (true) {
                if (it.hasNext()) {
                    if ("creativeView".equals(it.next().f14815d)) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                return;
            }
        }
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            public final void onViewAttachedToWindow(View view) {
                C6016ff.this.f15252b.mo35136a(a);
                C6281n unused = C6016ff.this.f15256g;
                C5847bw a = C6281n.m18705a(C6016ff.this.f15256g.mo35536i(), bwVar);
                C5847bw bwVar = bwVar;
                C6281n e = C6016ff.this.f15256g;
                if (a == null) {
                    a = bwVar;
                }
                bwVar.mo34824a("creativeView", e.mo35519a(a), (C5817bk) null);
            }

            public final void onViewDetachedFromWindow(View view) {
                view.removeOnAttachStateChangeListener(this);
                C5996ex d = C6016ff.this.f15252b;
                List<C5996ex.C5999a> list = a;
                if (list != null) {
                    for (C5996ex.C5999a aVar : list) {
                        aVar.f15207a.cancel();
                    }
                    d.f15199a.removeAll(list);
                }
            }
        });
    }

    /* renamed from: b */
    public final ViewGroup mo35176b(ViewGroup viewGroup, C5849by byVar) {
        C6301q qVar;
        m17914a((C5847bw) byVar, (View) viewGroup);
        Iterator<C5847bw> it = byVar.iterator();
        while (it.hasNext()) {
            C5847bw next = it.next();
            if (!"CONTAINER".equals(next.f14704b)) {
                View view = null;
                if ("WEBVIEW".equals(next.f14704b)) {
                    C5871ck ckVar = (C5871ck) next;
                    if (ckVar.f14827A && (qVar = this.f15263o) != null) {
                        if (qVar.getParent() != null) {
                            ((ViewGroup) qVar.getParent()).removeView(qVar);
                        }
                        this.f15263o = null;
                        view = qVar;
                    } else if ("UNKNOWN".equals(ckVar.f14829z)) {
                    }
                } else if (ShareConstants.IMAGE_URL.equals(next.f14704b) && next.f14707e == null) {
                }
                if (view == null) {
                    view = this.f15253c.mo35259a(m17921c(), next, this.f15257h);
                }
                if (view != null) {
                    final WeakReference weakReference = new WeakReference(view);
                    if (next.f14717o != -1) {
                        view.setVisibility(4);
                        f15250m.postDelayed(new Runnable() {
                            public final void run() {
                                View view = (View) weakReference.get();
                                if (view != null) {
                                    view.setVisibility(0);
                                }
                            }
                        }, (long) (next.f14717o * 1000));
                    } else if (next.f14718p != -1) {
                        f15250m.postDelayed(new Runnable() {
                            public final void run() {
                                View view = (View) weakReference.get();
                                if (view != null) {
                                    view.setVisibility(4);
                                }
                            }
                        }, (long) (next.f14718p * 1000));
                    }
                    view.setLayoutParams(C6052fo.m17995a(next, viewGroup));
                    m17913a(view, next);
                    viewGroup.addView(view);
                    if (ShareConstants.VIDEO_URL.equals(next.f14704b)) {
                        m17916a((C5869cj) next, ((C6051fn) view).getVideoView());
                    }
                    m17914a(next, view);
                    if ("TIMER".equals(next.f14704b)) {
                        view.setTag("timerView");
                        m17915a((C5864cg) next, (C5865ch) view);
                    }
                    if (ShareConstants.VIDEO_URL.equals(next.f14704b)) {
                        ((C6051fn) view).mo35254a();
                    }
                    if ("WEBVIEW".equals(next.f14704b) && (view instanceof C6301q)) {
                        C6301q qVar2 = (C6301q) view;
                        C5871ck ckVar2 = (C5871ck) next;
                        qVar2.setScrollable(ckVar2.f14828B);
                        qVar2.setReferenceContainer(this.f15256g.f15848l);
                        qVar2.setRenderViewEventListener(this.f15256g.mo35555u());
                        qVar2.setPlacementId(this.f15256g.f15840d);
                        qVar2.setAllowAutoRedirection(this.f15256g.f15842f);
                        qVar2.setCreativeId(this.f15256g.f15841e);
                        qVar2.setImpressionId(this.f15256g.f15839c);
                        if (!ckVar2.f14827A) {
                            this.f15256g.mo35527a(qVar2);
                        }
                    }
                }
            } else if (next.f14706d.equalsIgnoreCase("card_scrollable")) {
                C6031fi fiVar = (C6031fi) this.f15253c.mo35259a(m17921c(), next, this.f15257h);
                if (fiVar != null) {
                    C6033fj a = C6034fk.m17944a(fiVar.getType(), this.f15255f, this);
                    this.f15261l = a;
                    if (a != null) {
                        fiVar.mo35190a((C5849by) next, a, this.f15251a, m17923d(), this);
                        fiVar.setLayoutParams(C6052fo.m17995a(next, viewGroup));
                        m17913a((View) fiVar, next);
                        viewGroup.addView(fiVar);
                    }
                }
            } else {
                ViewGroup viewGroup2 = (ViewGroup) this.f15253c.mo35259a(m17921c(), next, this.f15257h);
                if (viewGroup2 != null) {
                    ViewGroup b = mo35176b(viewGroup2, (C5849by) next);
                    b.setLayoutParams(C6052fo.m17995a(next, viewGroup));
                    m17913a((View) b, next);
                    viewGroup.addView(b);
                }
            }
        }
        return viewGroup;
    }

    /* renamed from: d */
    private int m17923d() {
        if (this.f15251a == 0) {
            return GravityCompat.START;
        }
        if (this.f15255f.mo34846c() - 1 == this.f15251a) {
            return GravityCompat.END;
        }
        return 1;
    }

    /* renamed from: a */
    public final void mo35175a() {
        this.f15262n = true;
        this.f15254e.clear();
        this.f15260k = null;
        C6033fj fjVar = this.f15261l;
        if (fjVar != null) {
            fjVar.destroy();
            this.f15261l = null;
        }
    }

    /* renamed from: a */
    private void m17914a(final C5847bw bwVar, View view) {
        if (bwVar.f14710h) {
            view.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    C6016ff.this.f15259j.mo35171a(view, bwVar);
                }
            });
        }
    }

    /* renamed from: a */
    private void m17916a(final C5869cj cjVar, C6038fm fmVar) {
        C5849by byVar = (C5849by) cjVar.f14722t;
        long currentTimeMillis = System.currentTimeMillis();
        if (!(byVar == null || 0 == byVar.f14742z)) {
            currentTimeMillis = byVar.f14742z;
        }
        if (byVar != null) {
            byVar.f14742z = currentTimeMillis;
        }
        fmVar.setClickable(false);
        fmVar.setId(Integer.MAX_VALUE);
        fmVar.mo35207a(cjVar);
        if (cjVar.f14727y != null) {
            cjVar.mo34865a((C5869cj) cjVar.f14727y);
        }
        fmVar.setQuartileCompletedListener(new C6038fm.C6049c() {
            /* renamed from: a */
            public final void mo35184a(byte b) {
                if (!C6016ff.this.f15256g.f15846j && (C6016ff.this.f15256g instanceof C6296o)) {
                    ((C6296o) C6016ff.this.f15256g).mo35563a(cjVar, b);
                    if (3 == b) {
                        try {
                            C6296o oVar = (C6296o) C6016ff.this.f15256g;
                            C5869cj cjVar = cjVar;
                            if (!((Boolean) cjVar.f14724v.get("didSignalVideoCompleted")).booleanValue()) {
                                oVar.mo35550p();
                                C6281n.C6295c f = oVar.mo35533f();
                                if (f != null) {
                                    f.mo34514h();
                                }
                            }
                            if (1 == oVar.getPlacementType()) {
                                oVar.mo35530c((C5847bw) cjVar);
                            }
                        } catch (Exception unused) {
                            String unused2 = C6016ff.f15249d;
                        }
                    }
                }
            }
        });
        fmVar.setPlaybackEventListener(new C6038fm.C6048b() {
            /* renamed from: a */
            public final void mo35185a(byte b) {
                if (!C6016ff.this.f15256g.f15846j && (C6016ff.this.f15256g instanceof C6296o)) {
                    if (b == 0) {
                        ((C6296o) C6016ff.this.f15256g).mo35571w();
                    } else if (b == 1) {
                        ((C6296o) C6016ff.this.f15256g).mo35565b(cjVar);
                    } else if (b == 2) {
                        ((C6296o) C6016ff.this.f15256g).mo35566c(cjVar);
                    } else if (b == 3) {
                        ((C6296o) C6016ff.this.f15256g).mo35567d(cjVar);
                    } else if (b == 5) {
                        try {
                            ((C6296o) C6016ff.this.f15256g).mo35570g(cjVar);
                        } catch (Exception e) {
                            String unused = C6016ff.f15249d;
                            C6130gj.m18161a().mo35310a(new C6167hk(e));
                        }
                    }
                }
            }
        });
        fmVar.setMediaErrorListener(new C6038fm.C6047a() {
            /* renamed from: a */
            public final void mo35186a() {
                if (!C6016ff.this.f15256g.f15846j && (C6016ff.this.f15256g instanceof C6296o)) {
                    try {
                        ((C6296o) C6016ff.this.f15256g).mo35562a(cjVar);
                    } catch (Exception unused) {
                        String unused2 = C6016ff.f15249d;
                    }
                }
            }
        });
        if (!this.f15256g.f15846j) {
            C6281n nVar = this.f15256g;
            if (nVar instanceof C6296o) {
                try {
                    ((C6296o) nVar).mo35564a(fmVar);
                } catch (Exception unused) {
                }
            }
        }
    }
}
