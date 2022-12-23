package com.fyber.inneractive.sdk.external;

import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.config.C4204a0;
import com.fyber.inneractive.sdk.config.C4269r;
import com.fyber.inneractive.sdk.config.C4287y;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.factories.C4336a;
import com.fyber.inneractive.sdk.factories.C4342c;
import com.fyber.inneractive.sdk.flow.C4365m;
import com.fyber.inneractive.sdk.flow.C4371p;
import com.fyber.inneractive.sdk.flow.C4380v;
import com.fyber.inneractive.sdk.flow.C4391x;
import com.fyber.inneractive.sdk.interfaces.C4396b;
import com.fyber.inneractive.sdk.interfaces.C4397c;
import com.fyber.inneractive.sdk.util.C5299n;
import com.fyber.inneractive.sdk.util.C5312s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class InneractiveAdViewUnitController extends C4391x<InneractiveAdViewEventsListener> implements C4365m.C4368c, InneractiveFullscreenAdActivity.FullScreenRendererProvider {
    public static final int DISABLED_REFRESH_INTERVAL = -1;

    /* renamed from: a */
    public Set<InneractiveAdRenderer> f10622a;

    /* renamed from: b */
    public boolean f10623b;

    /* renamed from: c */
    public View f10624c;

    /* renamed from: d */
    public int f10625d;
    public int mAdContentHeight;
    public int mAdContentWidth;

    /* renamed from: com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController$a */
    public class C4332a implements Runnable {
        public C4332a() {
        }

        public void run() {
            InneractiveAdViewUnitController.this.mo24424a();
        }
    }

    public InneractiveAdViewUnitController() {
        this.f10623b = false;
        this.mAdContentWidth = -1;
        this.mAdContentHeight = -1;
        this.f10625d = 0;
        this.f10622a = new HashSet();
    }

    /* renamed from: a */
    public final void mo24424a() {
        this.f10623b = true;
        Iterator it = new HashSet(this.f10622a).iterator();
        while (it.hasNext()) {
            ((InneractiveAdRenderer) it.next()).destroy();
        }
        this.f10622a.clear();
        this.f10624c = null;
        super.destroy();
    }

    public void bindView(ViewGroup viewGroup) {
        C4396b bVar;
        IAlog.m16446a("%sPPPP bindView called with parent: %s", logPrefix(), viewGroup);
        InneractiveAdSpot adSpot = getAdSpot();
        if (adSpot == null) {
            IAlog.m16450e("InneractiveFullscreenUnitController was not attached to an ad spot", new Object[0]);
            return;
        }
        IAlog.m16446a("%sPPPP bindView spot is %s", logPrefix(), adSpot);
        Iterator it = new HashSet(this.f10622a).iterator();
        while (it.hasNext()) {
            InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
            if (inneractiveAdRenderer instanceof C4396b) {
                C4396b bVar2 = (C4396b) inneractiveAdRenderer;
                if (bVar2.mo24303a((View) viewGroup)) {
                    bVar2.mo24307n();
                    IAlog.m16446a("%sPPPP bindAdToRenderer returning an already attached renderer %s", logPrefix(), bVar2);
                    return;
                }
            }
        }
        this.f10624c = viewGroup;
        Iterator<C4336a.C4337a> it2 = C4336a.C4338b.f10655a.f10654a.iterator();
        while (true) {
            if (!it2.hasNext()) {
                bVar = null;
                break;
            }
            C4336a.C4337a next = it2.next();
            if (next.mo24317a(adSpot)) {
                bVar = next.mo24318b(adSpot);
                break;
            }
        }
        int i = this.f10625d;
        if (i != 0) {
            bVar.mo24301a(i);
        }
        if (bVar != null) {
            bVar.initialize(adSpot);
            selectContentController();
            bVar.mo24302a(viewGroup);
            this.f10622a.add(bVar);
            IAlog.m16446a("%sPPPP bindView created renderer %s", logPrefix(), bVar);
            return;
        }
        IAlog.m16450e("%sCould not find a renderer for the given spot! Did you add the appropriate module to your project?", logPrefix());
    }

    public boolean canRefreshAd() {
        if (!supportsRefresh()) {
            return false;
        }
        for (InneractiveAdRenderer canRefreshAd : this.f10622a) {
            if (!canRefreshAd.canRefreshAd()) {
                return false;
            }
        }
        return true;
    }

    public void destroy() {
        if (Looper.myLooper() == null || Looper.getMainLooper() != Looper.myLooper()) {
            C5299n.f14024b.post(new C4332a());
        } else {
            mo24424a();
        }
    }

    public int getAdContentHeight() {
        int p;
        for (InneractiveAdRenderer next : this.f10622a) {
            if ((next instanceof C4396b) && (p = ((C4396b) next).mo24308p()) > 0) {
                return p;
            }
        }
        return this.mAdContentHeight;
    }

    public int getAdContentWidth() {
        int f;
        for (InneractiveAdRenderer next : this.f10622a) {
            if ((next instanceof C4396b) && (f = ((C4396b) next).mo24306f()) > 0) {
                return f;
            }
        }
        return this.mAdContentWidth;
    }

    public C4397c getFullscreenRenderer() {
        C4397c a = C4342c.C4344b.f10659a.mo24486a((InneractiveAdSpot) C5312s.m16531a(this.mAdSpot));
        this.f10622a.add(a);
        return a;
    }

    public InneractiveContentController getSelectedContentController() {
        return this.mSelectedContentController;
    }

    public void onAdRefreshFailed(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
        Iterator it = new HashSet(this.f10622a).iterator();
        while (it.hasNext()) {
            InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
            if (inneractiveAdRenderer instanceof C4396b) {
                ((C4396b) inneractiveAdRenderer).mo24309q();
                return;
            }
        }
    }

    public void onAdRefreshed(InneractiveAdSpot inneractiveAdSpot) {
        C4396b bVar;
        Iterator it = new HashSet(this.f10622a).iterator();
        while (true) {
            if (!it.hasNext()) {
                bVar = null;
                break;
            }
            InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
            if (inneractiveAdRenderer instanceof C4396b) {
                bVar = (C4396b) inneractiveAdRenderer;
                if (bVar.mo24304a(inneractiveAdSpot.getAdContent())) {
                    break;
                }
            }
        }
        if (bVar != null) {
            bVar.mo24302a((ViewGroup) null);
        } else {
            onAdRefreshFailed(inneractiveAdSpot, InneractiveErrorCode.SDK_INTERNAL_ERROR);
        }
        try {
            if (inneractiveAdSpot instanceof C4365m) {
                int i = IAlog.f13936a;
                IAlog.m16444a(1, (Exception) null, "%s %s", "AD_REFRESH", ((C4365m) inneractiveAdSpot).f10738h.f10682g.f11096f.mo24640a());
            }
        } catch (Exception unused) {
        }
        IAlog.m16446a("InneractiveFullscreenUnitController onAdRefreshed called", new Object[0]);
    }

    public void refreshAd() {
        IAlog.m16446a("InneractiveFullscreenUnitController refreshAd called", new Object[0]);
        InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) C5312s.m16531a(this.mAdSpot);
        if (inneractiveAdSpot != null && (inneractiveAdSpot instanceof C4380v)) {
            ((C4380v) inneractiveAdSpot).mo24537a(this);
        }
    }

    public boolean supports(InneractiveAdSpot inneractiveAdSpot) {
        C4287y yVar = (C4287y) inneractiveAdSpot.getAdContent().f10715d;
        if (yVar.f10548e != null) {
            return false;
        }
        C4269r rVar = yVar.f10546c;
        if (rVar != null) {
            if (UnitDisplayType.BANNER.equals(rVar.f10490b) || UnitDisplayType.MRECT.equals(rVar.f10490b)) {
                return true;
            }
            if (UnitDisplayType.INTERSTITIAL.equals(rVar.f10490b)) {
                return !inneractiveAdSpot.getCurrentProcessedRequest().getAllowFullscreen();
            }
        }
        C4204a0 a0Var = yVar.f10549f;
        if (a0Var == null || (!UnitDisplayType.LANDSCAPE.equals(a0Var.f10378j) && !UnitDisplayType.SQUARE.equals(a0Var.f10378j) && !UnitDisplayType.MRECT.equals(a0Var.f10378j))) {
            return false;
        }
        return true;
    }

    public boolean supportsRefresh() {
        return true;
    }

    public void unbindFullscreenRenderer(C4397c cVar) {
        WeakReference<C4371p> weakReference;
        IAlog.m16446a("%sremoving full screen ad renderer %s", logPrefix(), cVar);
        Set<InneractiveAdRenderer> set = this.f10622a;
        if (set != null) {
            set.remove(cVar);
        }
        if (!this.f10623b) {
            Iterator it = new HashSet(this.f10622a).iterator();
            while (it.hasNext()) {
                InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
                if (inneractiveAdRenderer instanceof C4396b) {
                    ((C4396b) inneractiveAdRenderer).mo24300a();
                    if (!(this.mEventsListener == null || (weakReference = this.mAdSpot) == null || weakReference.get() == null)) {
                        ((InneractiveAdViewEventsListener) this.mEventsListener).onAdCollapsed((InneractiveAdSpot) this.mAdSpot.get());
                    }
                }
            }
        }
    }

    public void unbindView(View view) {
        if (this.f10624c != view) {
            IAlog.m16450e("%s unbindView invoked with incorrect view, was - %s received - %s", logPrefix(), this.f10624c, view);
        } else {
            this.f10624c = null;
        }
        IAlog.m16446a("%sPPPP unbindView called with %s", logPrefix(), view);
        IAlog.m16446a("%sPPPP spot is %s", logPrefix(), this.mAdSpot);
        Iterator it = new HashSet(this.f10622a).iterator();
        while (it.hasNext()) {
            InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
            if (inneractiveAdRenderer instanceof C4396b) {
                C4396b bVar = (C4396b) inneractiveAdRenderer;
                if (bVar.mo24303a(view)) {
                    IAlog.m16446a("%sPPPP unbindView unbinding renderer %s", logPrefix(), inneractiveAdRenderer);
                    bVar.mo24310t();
                    this.f10622a.remove(bVar);
                    return;
                }
            }
        }
    }

    public InneractiveAdViewUnitController(int i) {
        this();
        if (i >= 30) {
            IAlog.m16446a("InneractiveAdViewUnitController: Overriding remote config refresh interval to: %d", Integer.valueOf(i));
            this.f10625d = i;
            return;
        }
        IAlog.m16446a("InneractiveAdViewUnitController: Overriding remote config refresh interval - value too low. Setting to default: %d -> %d", Integer.valueOf(i), 30);
        this.f10625d = 30;
    }

    public InneractiveAdViewUnitController(boolean z) {
        this();
        if (z) {
            this.f10625d = -1;
        }
    }
}
