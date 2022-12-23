package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.C4392y;
import com.fyber.inneractive.sdk.flow.C4393z;
import com.fyber.inneractive.sdk.renderers.C5226m;
import java.lang.ref.WeakReference;

public class InneractiveAdViewVideoContentController extends C4393z {
    public boolean canControl(InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent() instanceof C4392y;
    }

    public void pauseVideo() {
    }

    public void playVideo() {
    }

    public void setControlledRenderer(C5226m mVar) {
        new WeakReference(mVar);
    }
}
