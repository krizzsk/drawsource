package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.C4393z;
import com.fyber.inneractive.sdk.util.C5312s;
import java.lang.ref.WeakReference;

public class InneractiveNativeVideoContentController extends C4393z {

    /* renamed from: a */
    public WeakReference<Renderer> f10640a;

    public interface Renderer {
        void pauseVideo();

        void playVideo();
    }

    public boolean canControl(InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent().isVideoAd();
    }

    public void pauseVideo() {
        if (((Renderer) C5312s.m16531a(this.f10640a)) != null) {
            ((Renderer) this.f10640a.get()).pauseVideo();
        }
    }

    public void playVideo() {
        Renderer renderer = (Renderer) C5312s.m16531a(this.f10640a);
        if (renderer != null) {
            renderer.playVideo();
        }
    }

    public void setControlledRenderer(Renderer renderer) {
        this.f10640a = new WeakReference<>(renderer);
    }
}
