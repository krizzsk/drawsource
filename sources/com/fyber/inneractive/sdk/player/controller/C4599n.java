package com.fyber.inneractive.sdk.player.controller;

import android.view.View;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.model.vast.C4421c;
import com.fyber.inneractive.sdk.model.vast.C4435q;
import com.fyber.inneractive.sdk.mraid.C4444a0;
import com.fyber.inneractive.sdk.player.C4533c;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.response.C5237i;
import com.fyber.inneractive.sdk.util.C5262d0;
import com.fyber.inneractive.sdk.util.C5306p0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C5349d;

/* renamed from: com.fyber.inneractive.sdk.player.controller.n */
public class C4599n extends C5349d.C5360k {

    /* renamed from: a */
    public final /* synthetic */ C4594k f11436a;

    public C4599n(C4594k kVar) {
        this.f11436a = kVar;
    }

    /* renamed from: a */
    public void mo24893a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        C4594k kVar = this.f11436a;
        kVar.getClass();
        sb.append(IAlog.m16443a((Object) kVar));
        sb.append("web view callback: onSuspiciousNoUserWebActionDetected");
        IAlog.m16446a(sb.toString(), new Object[0]);
        ListenerT listenert = this.f11436a.f11415g;
        if (listenert != null) {
            listenert.mo24917a(str, str2);
        }
    }

    /* renamed from: b */
    public void mo24895b() {
        C4421c f;
        C4594k kVar = this.f11436a;
        kVar.getClass();
        IAlog.m16446a("%sweb view callback: onClickedAndOpen", IAlog.m16443a((Object) kVar));
        this.f11436a.mo24861a("2");
        C4594k kVar2 = this.f11436a;
        if (kVar2.f11415g != null) {
            C4533c cVar = kVar2.f11409a;
            if (!(cVar == null || (f = cVar.mo24724f()) == null)) {
                this.f11436a.f11409a.mo24716a((C5237i) f, VideoClickOrigin.COMPANION, C4435q.EVENT_CLICK);
            }
            int i = IAlog.f13936a;
            IAlog.m16444a(1, (Exception) null, "AD_CLICKED", new Object[0]);
            this.f11436a.f11415g.mo24921g();
        }
    }

    /* renamed from: a */
    public C5262d0.C5263a mo24886a(String str, C5306p0 p0Var) {
        C4421c f;
        C4594k kVar = this.f11436a;
        kVar.getClass();
        IAlog.m16446a("%sweb view callback: onClicked", IAlog.m16443a((Object) kVar));
        this.f11436a.mo24861a("2");
        C4594k kVar2 = this.f11436a;
        if (kVar2.f11415g == null) {
            return new C5262d0.C5263a(C5262d0.C5265c.FAILED, new Exception("mListener is null, internal SDK fatal error"), "null");
        }
        C4533c cVar = kVar2.f11409a;
        if (!(cVar == null || (f = cVar.mo24724f()) == null)) {
            this.f11436a.f11409a.mo24716a((C5237i) f, VideoClickOrigin.COMPANION, C4435q.EVENT_CLICK);
        }
        int i = IAlog.f13936a;
        IAlog.m16444a(1, (Exception) null, "AD_CLICKED", new Object[0]);
        return this.f11436a.f11415g.mo24915a(str, p0Var);
    }

    /* renamed from: b */
    public void mo24896b(C5349d dVar) {
        ListenerT listenert = this.f11436a.f11415g;
        if (listenert != null) {
            listenert.mo24929r();
        }
    }

    /* renamed from: a */
    public void mo24887a() {
        ListenerT listenert = this.f11436a.f11415g;
        if (listenert != null) {
            listenert.mo24923j();
        }
    }

    /* renamed from: a */
    public boolean mo24894a(String str) {
        View endCardView = this.f11436a.f11412d.getEndCardView();
        ListenerT listenert = this.f11436a.f11415g;
        if (listenert == null) {
            return false;
        }
        listenert.mo24916a(endCardView, str);
        return true;
    }

    /* renamed from: a */
    public void mo24888a(InneractiveUnitController.AdDisplayError adDisplayError) {
        ListenerT listenert = this.f11436a.f11415g;
        if (listenert != null) {
            listenert.onPlayerError();
        }
    }

    /* renamed from: a */
    public void mo24889a(C5349d dVar) {
        ListenerT listenert = this.f11436a.f11415g;
        if (listenert != null) {
            listenert.mo24929r();
        }
    }

    /* renamed from: a */
    public void mo24890a(C5349d dVar, C4444a0 a0Var) {
        ListenerT listenert = this.f11436a.f11415g;
        if (listenert != null) {
            listenert.mo24924k();
        }
    }

    /* renamed from: a */
    public void mo24891a(C5349d dVar, boolean z) {
        C4594k kVar = this.f11436a;
        kVar.getClass();
        IAlog.m16446a("%sonCustomCloseButtonAvailableEnabled : %s", IAlog.m16443a((Object) kVar), Boolean.valueOf(z));
        ListenerT listenert = this.f11436a.f11415g;
        if (listenert != null && z) {
            listenert.mo24922h();
        }
    }

    /* renamed from: a */
    public void mo24892a(C5349d dVar, boolean z, Orientation orientation) {
        C4594k kVar = this.f11436a;
        kVar.getClass();
        IAlog.m16446a("%sonOrientationProperties: allowOrientationChange: %s, forceOrientationType: %s", IAlog.m16443a((Object) kVar), Boolean.valueOf(z), orientation.toString());
        ListenerT listenert = this.f11436a.f11415g;
        if (listenert != null) {
            listenert.mo24919a(z, orientation);
        }
    }
}
