package com.mbridge.msdk.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.tools.C8666t;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.reward.p342a.C9110a;
import com.mbridge.msdk.video.p347bt.module.p350b.C9303a;
import com.mbridge.msdk.video.p347bt.module.p350b.C9310g;
import com.mbridge.msdk.videocommon.listener.InterVideoOutListener;

public class MBBidRewardVideoHandler {
    private static final String TAG = "MBBidRewardVideoHandler";
    private C9110a controller;

    public MBBidRewardVideoHandler(Context context, String str, String str2) {
        if (C8388a.m23845e().mo56913g() == null && context != null) {
            C8388a.m23845e().mo56905b(context);
        }
        String f = C8677z.m24944f(str2);
        if (!TextUtils.isEmpty(f)) {
            C8677z.m24918a(str2, f);
        }
        initMBBidRewardVideoHandler(str, str2);
    }

    public MBBidRewardVideoHandler(String str, String str2) {
        String f = C8677z.m24944f(str2);
        if (!TextUtils.isEmpty(f)) {
            C8677z.m24918a(str2, f);
        }
        initMBBidRewardVideoHandler(str, str2);
    }

    private void initMBBidRewardVideoHandler(String str, String str2) {
        try {
            if (this.controller == null) {
                C9110a aVar = new C9110a();
                this.controller = aVar;
                aVar.mo61282a(false);
                this.controller.mo61286b(true);
            }
            this.controller.mo61285b(str, str2);
        } catch (Throwable th) {
            C8672v.m24875a(TAG, th.getMessage(), th);
        }
    }

    public void loadFromBid(String str) {
        C9110a aVar = this.controller;
        if (aVar != null) {
            aVar.mo61283a(true, str);
        }
    }

    public boolean isBidReady() {
        C9110a aVar = this.controller;
        if (aVar != null) {
            return aVar.mo61289e(false);
        }
        return false;
    }

    public String getRequestId() {
        C9110a aVar = this.controller;
        return aVar != null ? aVar.mo61276a() : "";
    }

    public void showFromBid() {
        C9110a aVar = this.controller;
        if (aVar != null) {
            aVar.mo61280a((String) null, (String) null, (String) null);
        }
    }

    public void showFromBid(String str) {
        C9110a aVar = this.controller;
        if (aVar != null) {
            aVar.mo61280a((String) null, str, (String) null);
        }
    }

    public void showFromBid(String str, String str2) {
        C9110a aVar = this.controller;
        if (aVar != null) {
            aVar.mo61280a((String) null, str, str2);
        }
    }

    public void setRewardVideoListener(C9310g gVar) {
        C9110a aVar = this.controller;
        if (aVar != null) {
            aVar.mo61279a((InterVideoOutListener) new C9303a(gVar));
        }
    }

    public void clearVideoCache() {
        try {
            if (this.controller != null) {
                C8666t.m24858a();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void playVideoMute(int i) {
        C9110a aVar = this.controller;
        if (aVar != null) {
            aVar.mo61277a(i);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        C9110a aVar = this.controller;
        if (aVar != null) {
            aVar.mo61281a(str, str2, str3, str4);
        }
    }

    public void setRewardPlus(boolean z) {
        C9110a aVar = this.controller;
        if (aVar != null) {
            aVar.mo61287c(z);
        }
    }
}
