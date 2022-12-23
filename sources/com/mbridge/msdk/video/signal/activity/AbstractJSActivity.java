package com.mbridge.msdk.video.signal.activity;

import android.content.res.Configuration;
import com.mbridge.msdk.activity.MBBaseActivity;
import com.mbridge.msdk.foundation.p085b.C2470b;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.video.signal.C9502a;
import com.mbridge.msdk.video.signal.C9520b;
import com.mbridge.msdk.video.signal.C9521c;
import com.mbridge.msdk.video.signal.C9615e;
import com.mbridge.msdk.video.signal.C9616f;
import com.mbridge.msdk.video.signal.C9620h;
import com.mbridge.msdk.video.signal.C9621i;
import com.mbridge.msdk.video.signal.factory.C9617a;
import com.mbridge.msdk.video.signal.factory.IJSFactory;

public abstract class AbstractJSActivity extends MBBaseActivity implements IJSFactory {
    protected static final String TAG = "AbstractJSActivity";
    protected IJSFactory jsFactory = new C9617a();

    public boolean canBackPress() {
        return false;
    }

    public void registerJsFactory(IJSFactory iJSFactory) {
        this.jsFactory = iJSFactory;
    }

    public void onResume() {
        super.onResume();
        if (!C2470b.f5205c) {
            if (getJSCommon().mo63249b()) {
                getActivityProxy().mo63231b();
            }
            getActivityProxy().mo63229a(0);
        }
    }

    public void onPause() {
        super.onPause();
        if (getJSCommon().mo63249b()) {
            getActivityProxy().mo63228a();
        }
        getActivityProxy().mo63229a(1);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (getJSCommon().mo63249b()) {
            getActivityProxy().mo63230a(configuration);
        }
    }

    public void onBackPressed() {
        if (getJSCommon().mo63249b()) {
            if (getJSContainerModule() == null || !getJSContainerModule().miniCardShowing()) {
                getActivityProxy().mo63236g();
            }
        } else if (canBackPress()) {
            super.onBackPressed();
        } else {
            C8672v.m24874a(TAG, "onBackPressed can't excute");
        }
    }

    public C9502a getActivityProxy() {
        return this.jsFactory.getActivityProxy();
    }

    public C9521c getJSCommon() {
        return this.jsFactory.getJSCommon();
    }

    public C9621i getJSVideoModule() {
        return this.jsFactory.getJSVideoModule();
    }

    public C9616f getJSNotifyProxy() {
        return this.jsFactory.getJSNotifyProxy();
    }

    public C9615e getJSContainerModule() {
        return this.jsFactory.getJSContainerModule();
    }

    public C9620h getIJSRewardVideoV1() {
        return this.jsFactory.getIJSRewardVideoV1();
    }

    public C9520b getJSBTModule() {
        return this.jsFactory.getJSBTModule();
    }
}
