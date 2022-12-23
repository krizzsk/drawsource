package com.mbridge.msdk.video.signal.factory;

import com.mbridge.msdk.video.signal.C9502a;
import com.mbridge.msdk.video.signal.C9520b;
import com.mbridge.msdk.video.signal.C9521c;
import com.mbridge.msdk.video.signal.C9615e;
import com.mbridge.msdk.video.signal.C9616f;
import com.mbridge.msdk.video.signal.C9620h;
import com.mbridge.msdk.video.signal.C9621i;

public interface IJSFactory {
    C9502a getActivityProxy();

    C9620h getIJSRewardVideoV1();

    C9520b getJSBTModule();

    C9521c getJSCommon();

    C9615e getJSContainerModule();

    C9616f getJSNotifyProxy();

    C9621i getJSVideoModule();
}
