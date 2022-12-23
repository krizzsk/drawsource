package com.mbridge.msdk.dycreator.viewmodel;

import com.mbridge.msdk.dycreator.p297g.C8380c;
import com.mbridge.msdk.dycreator.p297g.C8381d;
import com.mbridge.msdk.dycreator.p297g.C8383f;
import com.mbridge.msdk.dycreator.p297g.C8385h;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener;

public interface BaseViewModel {
    void setClickSubject(C8380c cVar);

    void setConcreteSubject(C8381d dVar);

    void setDynamicViewBackListener(DynamicViewBackListener dynamicViewBackListener);

    void setEffectSubject(C8383f fVar);

    void setModelDataAndBind();

    void setReportSubject(C8385h hVar);
}
