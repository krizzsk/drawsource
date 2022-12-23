package com.mbridge.msdk.dycreator.viewmodel;

import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.p295f.C8376a;
import com.mbridge.msdk.dycreator.p297g.C8380c;
import com.mbridge.msdk.dycreator.p297g.C8381d;
import com.mbridge.msdk.dycreator.p297g.C8383f;
import com.mbridge.msdk.dycreator.p297g.C8385h;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener;

public class MBRewardViewVModel implements BaseViewModel {

    /* renamed from: a */
    private C8381d f20449a;

    /* renamed from: b */
    private C8380c f20450b;

    /* renamed from: c */
    private C8383f f20451c;

    /* renamed from: d */
    private C8385h f20452d;

    /* renamed from: e */
    private DynamicViewBackListener f20453e;

    /* renamed from: f */
    private DyOption f20454f;

    public MBRewardViewVModel(DyOption dyOption) {
        this.f20454f = dyOption;
        EventBus.getDefault().register(this);
    }

    public void setModelDataAndBind() {
        C8376a aVar = new C8376a(this.f20454f);
        C8381d dVar = this.f20449a;
        if (dVar != null) {
            dVar.mo56883a(aVar);
        }
        C8380c cVar = this.f20450b;
        if (cVar != null) {
            cVar.mo56882a(aVar);
        }
        C8383f fVar = this.f20451c;
        if (fVar != null) {
            fVar.mo56884a(aVar);
        }
        C8385h hVar = this.f20452d;
        if (hVar != null) {
            hVar.mo56885a(aVar);
        }
    }

    public void setDynamicViewBackListener(DynamicViewBackListener dynamicViewBackListener) {
        if (dynamicViewBackListener != null) {
            this.f20453e = dynamicViewBackListener;
        }
    }

    public void setClickSubject(C8380c cVar) {
        if (cVar != null) {
            this.f20450b = cVar;
        }
    }

    public void setConcreteSubject(C8381d dVar) {
        if (dVar != null) {
            this.f20449a = dVar;
        }
    }

    public void setEffectSubject(C8383f fVar) {
        if (fVar != null) {
            this.f20451c = fVar;
        }
    }

    public void setReportSubject(C8385h hVar) {
        if (hVar != null) {
            this.f20452d = hVar;
        }
    }

    public void onEventMainThread(SplashResData splashResData) {
        DynamicViewBackListener dynamicViewBackListener = this.f20453e;
        if (dynamicViewBackListener != null) {
            dynamicViewBackListener.viewClicked(splashResData);
        }
    }
}
