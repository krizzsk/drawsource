package com.applovin.adview;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.applovin.impl.adview.C1552o;
import com.applovin.impl.adview.activity.p030b.C1450a;
import com.applovin.impl.sdk.C1969m;
import java.util.concurrent.atomic.AtomicBoolean;

public class AppLovinFullscreenAdViewObserver implements LifecycleObserver {

    /* renamed from: a */
    private final C1969m f1532a;

    /* renamed from: b */
    private final AtomicBoolean f1533b = new AtomicBoolean(true);

    /* renamed from: c */
    private C1450a f1534c;

    /* renamed from: d */
    private C1552o f1535d;

    public AppLovinFullscreenAdViewObserver(Lifecycle lifecycle, C1552o oVar, C1969m mVar) {
        this.f1535d = oVar;
        this.f1532a = mVar;
        lifecycle.addObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        C1552o oVar = this.f1535d;
        if (oVar != null) {
            oVar.mo13216e();
            this.f1535d = null;
        }
        C1450a aVar = this.f1534c;
        if (aVar != null) {
            aVar.mo12999h();
            this.f1534c.mo13002k();
            this.f1534c = null;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        C1450a aVar = this.f1534c;
        if (aVar != null) {
            aVar.mo12998g();
            this.f1534c.mo12996e();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        C1450a aVar;
        if (!this.f1533b.getAndSet(false) && (aVar = this.f1534c) != null) {
            aVar.mo12997f();
            this.f1534c.mo12982a(0);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        C1450a aVar = this.f1534c;
        if (aVar != null) {
            aVar.mo13001j();
        }
    }

    public void setPresenter(C1450a aVar) {
        this.f1534c = aVar;
    }
}
