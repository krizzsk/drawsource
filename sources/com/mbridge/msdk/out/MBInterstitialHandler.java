package com.mbridge.msdk.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.interstitial.p319c.C8697a;
import java.util.Map;

public class MBInterstitialHandler {
    private C8697a mController;

    public MBInterstitialHandler(Context context, Map<String, Object> map) {
        if (this.mController == null) {
            this.mController = new C8697a();
        }
        if (map != null && map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
            String str = (String) map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
            if (!TextUtils.isEmpty(str)) {
                String f = C8677z.m24944f(str);
                if (!TextUtils.isEmpty(f)) {
                    C8677z.m24918a(str, f);
                }
            }
        }
        this.mController.mo58219a(context, map);
        if (C8388a.m23845e().mo56913g() == null && context != null) {
            C8388a.m23845e().mo56905b(context);
        }
    }

    public void preload() {
        try {
            if (this.mController != null) {
                this.mController.mo58217a();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getRequestId() {
        C8697a aVar = this.mController;
        return aVar != null ? aVar.mo58220b() : "";
    }

    public void show() {
        try {
            this.mController.mo58221c();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setInterstitialListener(InterstitialListener interstitialListener) {
        try {
            if (this.mController != null) {
                this.mController.mo58218a(interstitialListener);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
