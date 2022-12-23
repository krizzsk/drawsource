package com.mbridge.msdk.dycreator.binding.p291a;

import android.view.View;
import com.mbridge.msdk.dycreator.binding.base.BaseStrategy;
import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.dycreator.p295f.p296a.C8377a;

/* renamed from: com.mbridge.msdk.dycreator.binding.a.e */
/* compiled from: NoticeStrategy */
public final class C8351e<T extends View, K> implements BaseStrategy {
    public final void bindClickData(View view, C8377a aVar) {
        SplashResData splashResData = new SplashResData();
        splashResData.setBaseViewData(aVar);
        splashResData.seteAction(EAction.NOTICE);
        EventBus.getDefault().post(splashResData);
    }
}
