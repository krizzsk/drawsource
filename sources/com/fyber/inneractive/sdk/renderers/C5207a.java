package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.content.res.Resources;
import com.fyber.inneractive.sdk.config.C4203a;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.C4392y;
import com.fyber.inneractive.sdk.flow.C4393z;
import com.fyber.inneractive.sdk.player.C4533c;
import com.fyber.inneractive.sdk.player.C5008f;
import com.fyber.inneractive.sdk.player.C5015i;
import com.fyber.inneractive.sdk.player.controller.C4574b;
import com.fyber.inneractive.sdk.player.controller.C4592j;
import com.fyber.inneractive.sdk.player.p190ui.C5039f;
import com.fyber.inneractive.sdk.player.p190ui.C5040g;

/* renamed from: com.fyber.inneractive.sdk.renderers.a */
public class C5207a extends C5228n {

    /* renamed from: c */
    public C5008f f13766c;

    public C5207a(C5015i iVar) {
        this.f13766c = (C5008f) iVar.mo25606c();
    }

    /* renamed from: a */
    public C5040g mo26246a(Context context) throws Resources.NotFoundException {
        if (this.f13847b == null) {
            this.f13847b = new C5039f(context);
        }
        return this.f13847b;
    }

    /* renamed from: a */
    public void mo26247a(C4533c.C4536c cVar) {
    }

    /* renamed from: a */
    public C4574b mo26245a(InneractiveAdSpot inneractiveAdSpot, C4392y yVar) {
        if (this.f13846a == null) {
            InneractiveUnitController selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
            boolean z = false;
            if (selectedUnitController instanceof C4393z) {
                z = ((C4393z) selectedUnitController).isOverlayOutside();
            }
            this.f13846a = new C4592j(this.f13766c, (C5039f) this.f13847b, C4203a.m13186b(inneractiveAdSpot.getAdContent().mo24293c().f13877m), yVar.f10714c, z);
        }
        return this.f13846a;
    }

    /* renamed from: a */
    public boolean mo26248a() {
        this.f13766c.getClass();
        return false;
    }
}
