package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import com.fyber.inneractive.sdk.config.C4288z;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.global.C4251s;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.C4390w;
import com.fyber.inneractive.sdk.flow.C4392y;
import com.fyber.inneractive.sdk.flow.C4393z;
import com.fyber.inneractive.sdk.player.C4533c;
import com.fyber.inneractive.sdk.player.C5008f;
import com.fyber.inneractive.sdk.player.C5015i;
import com.fyber.inneractive.sdk.player.controller.C4574b;
import com.fyber.inneractive.sdk.player.controller.C4579e;
import com.fyber.inneractive.sdk.player.p190ui.C5037d;
import com.fyber.inneractive.sdk.player.p190ui.C5040g;

/* renamed from: com.fyber.inneractive.sdk.renderers.c */
public class C5212c extends C5228n {

    /* renamed from: c */
    public C5008f f13779c;

    public C5212c(C5015i iVar) {
        this.f13779c = (C5008f) iVar.mo25606c();
    }

    /* renamed from: a */
    public C5040g mo26254a(Context context) {
        if (this.f13847b == null) {
            this.f13847b = new C5037d(context);
        }
        return this.f13847b;
    }

    /* renamed from: a */
    public C4574b mo26245a(InneractiveAdSpot inneractiveAdSpot, C4392y yVar) {
        if (this.f13846a == null) {
            InneractiveUnitController selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
            boolean z = false;
            boolean isOverlayOutside = selectedUnitController instanceof C4393z ? ((C4393z) selectedUnitController).isOverlayOutside() : false;
            Skip skip = null;
            if (inneractiveAdSpot instanceof C4390w) {
                skip = ((C4390w) inneractiveAdSpot).mo24569a();
            }
            Skip skip2 = skip;
            C5008f fVar = this.f13779c;
            C5037d dVar = (C5037d) this.f13847b;
            C4288z zVar = inneractiveAdSpot.getAdContent().f10715d;
            C4251s sVar = yVar.f10714c;
            if (IAConfigManager.f10324J.f10346l || yVar.f10717f) {
                z = true;
            }
            this.f13846a = new C4579e(fVar, dVar, zVar, sVar, false, isOverlayOutside, skip2, z);
        }
        return this.f13846a;
    }

    /* renamed from: a */
    public boolean mo26248a() {
        this.f13779c.getClass();
        return false;
    }

    /* renamed from: a */
    public void mo26247a(C4533c.C4536c cVar) {
        C5008f fVar = this.f13779c;
        fVar.getClass();
        cVar.mo24727a(fVar);
    }
}
