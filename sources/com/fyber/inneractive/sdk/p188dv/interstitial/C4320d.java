package com.fyber.inneractive.sdk.p188dv.interstitial;

import android.app.Activity;
import com.fyber.inneractive.sdk.C4112a;
import com.fyber.inneractive.sdk.cache.session.enums.C4192a;
import com.fyber.inneractive.sdk.cache.session.enums.C4193b;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.C4361j;
import com.fyber.inneractive.sdk.flow.C4375s;
import com.fyber.inneractive.sdk.interfaces.C4397c;
import com.fyber.inneractive.sdk.p188dv.C4305f;
import com.fyber.inneractive.sdk.response.C5233e;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.dv.interstitial.d */
public class C4320d extends C4375s<C4112a, InneractiveFullscreenAdEventsListener> implements C4397c {

    /* renamed from: w */
    public boolean f10585w = false;

    /* renamed from: E */
    public boolean mo24333E() {
        return false;
    }

    /* renamed from: G */
    public int mo24334G() {
        return 0;
    }

    /* renamed from: H */
    public int mo24335H() {
        return 0;
    }

    /* renamed from: I */
    public long mo24336I() {
        return 0;
    }

    /* renamed from: J */
    public boolean mo24337J() {
        return false;
    }

    /* renamed from: a */
    public long mo24338a(long j) {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.fyber.inneractive.sdk.flow.l, com.fyber.inneractive.sdk.dv.interstitial.a, com.fyber.inneractive.sdk.flow.s, com.fyber.inneractive.sdk.dv.interstitial.d, java.lang.Object] */
    /* renamed from: a */
    public void mo24339a(C4397c.C4398a aVar, Activity activity) throws InneractiveUnitController.AdDisplayError {
        super.mo24339a(aVar, activity);
        if (activity != null) {
            AdContent adcontent = this.f10720b;
            if (adcontent != null) {
                C4112a aVar2 = (C4112a) adcontent;
                if (aVar2.f10555i != null) {
                    aVar2.mo23757a(this, activity);
                    return;
                }
            }
            IAlog.m16450e("%sad content is null aborting", IAlog.m16443a((Object) this));
            throw new InneractiveUnitController.AdDisplayError("Ad content is null");
        }
        IAlog.m16450e("%sYou must pass activity in order to show interstitial", IAlog.m16443a((Object) this));
        throw new InneractiveUnitController.AdDisplayError("No activity context");
    }

    /* renamed from: a */
    public void mo24340a(C4397c.C4399b bVar) {
    }

    /* renamed from: b */
    public void mo24341b() {
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo24342b(C4361j jVar) {
        C4112a aVar = (C4112a) jVar;
        return false;
    }

    /* renamed from: d */
    public void mo24343d() {
        AdContent adcontent = this.f10720b;
        if (adcontent != null) {
            C4112a aVar = (C4112a) adcontent;
            if (((C4305f) aVar.f10713b) != null) {
                mo24527a((C5233e) (C4305f) aVar.f10713b);
            }
        }
        mo24525a(C4192a.CLICK, C4193b.INTERSTITIAL_VIDEO);
        mo24534z();
    }

    /* renamed from: i */
    public void mo24344i() {
        EventsListener eventslistener;
        if (!this.f10585w && (eventslistener = this.f10721c) != null) {
            this.f10585w = true;
            ((InneractiveFullscreenAdEventsListener) eventslistener).onAdDismissed(this.f10719a);
        }
    }

    /* renamed from: m */
    public void mo24345m() {
    }

    public void onReward() {
    }

    /* renamed from: u */
    public boolean mo24347u() {
        return false;
    }

    /* renamed from: v */
    public void mo24348v() {
        AdContent adcontent = this.f10720b;
        if (adcontent != null) {
            mo24529b((C5233e) (C4305f) ((C4112a) adcontent).f10713b);
        }
        mo24525a(C4192a.IMPRESSION, C4193b.INTERSTITIAL_VIDEO);
        mo24520A();
    }
}
