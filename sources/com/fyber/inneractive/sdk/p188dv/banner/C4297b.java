package com.fyber.inneractive.sdk.p188dv.banner;

import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.cache.session.enums.C4192a;
import com.fyber.inneractive.sdk.cache.session.enums.C4193b;
import com.fyber.inneractive.sdk.config.C4287y;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.flow.C4361j;
import com.fyber.inneractive.sdk.flow.C4363l;
import com.fyber.inneractive.sdk.interfaces.C4396b;
import com.fyber.inneractive.sdk.p188dv.C4292a;
import com.fyber.inneractive.sdk.p188dv.C4305f;
import com.fyber.inneractive.sdk.response.C5233e;
import com.fyber.inneractive.sdk.util.C5292l;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.ads.AdView;

/* renamed from: com.fyber.inneractive.sdk.dv.banner.b */
public class C4297b extends C4363l<C4295a, InneractiveAdViewEventsListener> implements C4396b {

    /* renamed from: k */
    public ViewGroup f10562k;

    /* renamed from: a */
    public void mo24300a() {
    }

    /* renamed from: a */
    public void mo24301a(int i) {
    }

    /* renamed from: a */
    public void mo24302a(ViewGroup viewGroup) {
        AdContent adcontent;
        if (this.f10719a == null) {
            IAlog.m16450e("%sYou must set the spot to render before calling renderAd", IAlog.m16443a((Object) this));
        } else if (viewGroup != null && (adcontent = this.f10720b) != null) {
            C4295a aVar = (C4295a) adcontent;
            if (aVar.f10555i != null) {
                aVar.f10554h = this;
                if (aVar.f10558j) {
                    mo24311v();
                    aVar.f10558j = false;
                }
                this.f10562k = viewGroup;
                viewGroup.addView((View) ((C4295a) this.f10720b).f10555i);
            }
        }
    }

    public void destroy() {
        AdContent adcontent = this.f10720b;
        if (adcontent != null) {
            C4295a aVar = (C4295a) adcontent;
            if (aVar.f10555i != null) {
                ((AdView) aVar.f10555i).destroy();
            }
            ((C4295a) this.f10720b).mo24291a();
        }
        ViewGroup viewGroup = this.f10562k;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f10562k = null;
        }
        super.destroy();
    }

    /* renamed from: f */
    public int mo24306f() {
        AdContent adcontent = this.f10720b;
        if (adcontent == null) {
            return 0;
        }
        C4295a aVar = (C4295a) adcontent;
        if (aVar.f10555i == null || ((AdView) aVar.f10555i).getAdSize() == null) {
            return 0;
        }
        return C5292l.m16507b(((AdView) ((C4295a) this.f10720b).f10555i).getAdSize().getWidth());
    }

    /* renamed from: n */
    public void mo24307n() {
    }

    /* renamed from: p */
    public int mo24308p() {
        AdContent adcontent = this.f10720b;
        if (adcontent == null) {
            return 0;
        }
        C4295a aVar = (C4295a) adcontent;
        if (aVar.f10555i == null || ((AdView) aVar.f10555i).getAdSize() == null) {
            return 0;
        }
        return C5292l.m16507b(((AdView) ((C4295a) this.f10720b).f10555i).getAdSize().getHeight());
    }

    /* renamed from: q */
    public void mo24309q() {
    }

    /* renamed from: t */
    public void mo24310t() {
        ViewGroup viewGroup = this.f10562k;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f10562k = null;
        }
    }

    /* renamed from: v */
    public void mo24311v() {
        C4193b bVar;
        mo24520A();
        AdContent adcontent = this.f10720b;
        if (adcontent != null) {
            C4295a aVar = (C4295a) adcontent;
            if (((C4305f) aVar.f10713b) != null) {
                mo24529b((C5233e) (C4305f) aVar.f10713b);
                C4295a aVar2 = (C4295a) this.f10720b;
                if (aVar2.f10715d != null && ((C4287y) aVar2.f10715d).f10546c != null) {
                    C4192a aVar3 = C4192a.IMPRESSION;
                    if (((C4287y) aVar2.f10715d).f10546c.f10490b == UnitDisplayType.MRECT) {
                        bVar = C4193b.RECTANGLE_DISPLAY;
                    } else {
                        bVar = C4193b.BANNER_DISPLAY;
                    }
                    mo24525a(aVar3, bVar);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo24304a(C4361j jVar) {
        return jVar instanceof C4292a;
    }

    /* renamed from: a */
    public boolean mo24303a(View view) {
        ViewGroup viewGroup = this.f10562k;
        return viewGroup != null && viewGroup.equals(view);
    }
}
