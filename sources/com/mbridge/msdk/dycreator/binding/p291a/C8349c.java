package com.mbridge.msdk.dycreator.binding.p291a;

import android.view.View;
import com.mbridge.msdk.dycreator.binding.base.BaseStrategy;
import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.dycreator.p295f.p296a.C8377a;

/* renamed from: com.mbridge.msdk.dycreator.binding.a.c */
/* compiled from: CloseStrategy */
public final class C8349c<T extends View, K> implements BaseStrategy {
    public final void bindClickData(View view, C8377a aVar) {
        SplashResData splashResData = new SplashResData();
        splashResData.setBaseViewData(aVar);
        splashResData.seteAction(EAction.CLOSE);
        EventBus.getDefault().post(splashResData);
    }
}
