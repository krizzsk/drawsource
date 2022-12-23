package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener;
import com.fyber.inneractive.sdk.util.C5312s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.fyber.inneractive.sdk.flow.x */
public abstract class C4391x<EL extends InneractiveUnitController.EventsListener> implements InneractiveUnitController<EL> {
    public WeakReference<C4371p> mAdSpot;
    public Set<InneractiveContentController> mContentControllers = new HashSet();
    public EL mEventsListener;
    public InneractiveContentController mSelectedContentController;

    public void addContentController(InneractiveContentController inneractiveContentController) {
        this.mContentControllers.add(inneractiveContentController);
    }

    public boolean canRefreshAd() {
        return supportsRefresh();
    }

    public void destroy() {
        for (InneractiveContentController destroy : this.mContentControllers) {
            destroy.destroy();
        }
        this.mContentControllers.clear();
        this.mSelectedContentController = null;
        this.mAdSpot = null;
    }

    public InneractiveAdSpot getAdSpot() {
        return (C4371p) C5312s.m16531a(this.mAdSpot);
    }

    public EL getEventsListener() {
        return this.mEventsListener;
    }

    public InneractiveContentController getSelectedContentController() {
        return this.mSelectedContentController;
    }

    public String logPrefix() {
        return IAlog.m16443a((Object) this);
    }

    public void selectContentController() {
        InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) C5312s.m16531a(this.mAdSpot);
        if (inneractiveAdSpot == null) {
            IAlog.m16450e("selectContentController called, but ad spot is null", new Object[0]);
            return;
        }
        for (InneractiveContentController next : this.mContentControllers) {
            C4372q qVar = (C4372q) next;
            if (qVar.canControl(inneractiveAdSpot)) {
                this.mSelectedContentController = next;
                qVar.setAdSpot(inneractiveAdSpot);
            }
        }
    }

    public void setAdSpot(C4371p pVar) {
        this.mAdSpot = new WeakReference<>(pVar);
    }

    public void setEventsListener(EL el) {
        this.mEventsListener = el;
    }

    public abstract boolean supports(InneractiveAdSpot inneractiveAdSpot);

    public abstract boolean supportsRefresh();
}
