package com.mbridge.msdk.dycreator.viewmodel;

import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.p297g.C8380c;
import com.mbridge.msdk.dycreator.p297g.C8381d;
import com.mbridge.msdk.dycreator.p297g.C8383f;
import com.mbridge.msdk.dycreator.p297g.C8385h;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener;

public class MBCommonViewVModel implements BaseViewModel {

    /* renamed from: a */
    private C8381d f20444a;

    /* renamed from: b */
    private C8380c f20445b;

    /* renamed from: c */
    private C8383f f20446c;

    /* renamed from: d */
    private C8385h f20447d;

    /* renamed from: e */
    private DynamicViewBackListener f20448e;

    public void setModelDataAndBind() {
    }

    public MBCommonViewVModel() {
        EventBus.getDefault().register(this);
    }

    public void setDynamicViewBackListener(DynamicViewBackListener dynamicViewBackListener) {
        if (dynamicViewBackListener != null) {
            this.f20448e = dynamicViewBackListener;
        }
    }

    public void setClickSubject(C8380c cVar) {
        if (cVar != null) {
            this.f20445b = cVar;
        }
    }

    public void setConcreteSubject(C8381d dVar) {
        if (dVar != null) {
            this.f20444a = dVar;
        }
    }

    public void setEffectSubject(C8383f fVar) {
        if (fVar != null) {
            this.f20446c = fVar;
        }
    }

    public void setReportSubject(C8385h hVar) {
        if (hVar != null) {
            this.f20447d = hVar;
        }
    }

    public void onEventMainThread(SplashResData splashResData) {
        DynamicViewBackListener dynamicViewBackListener = this.f20448e;
        if (dynamicViewBackListener != null) {
            dynamicViewBackListener.viewClicked(splashResData);
        }
    }
}
