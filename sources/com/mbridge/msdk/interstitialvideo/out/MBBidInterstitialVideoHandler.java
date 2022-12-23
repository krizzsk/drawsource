package com.mbridge.msdk.interstitialvideo.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.same.C8469a;
import com.mbridge.msdk.foundation.tools.C8666t;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.interstitialvideo.p321a.C8722a;
import com.mbridge.msdk.reward.p342a.C9110a;
import com.mbridge.msdk.videocommon.listener.InterVideoOutListener;

public class MBBidInterstitialVideoHandler {

    /* renamed from: a */
    private C9110a f21394a;

    public MBBidInterstitialVideoHandler(Context context, String str, String str2) {
        if (C8388a.m23845e().mo56913g() == null && context != null) {
            C8388a.m23845e().mo56905b(context);
        }
        String f = C8677z.m24944f(str2);
        if (!TextUtils.isEmpty(f)) {
            C8677z.m24918a(str2, f);
        }
        m25086a(str, str2);
    }

    public MBBidInterstitialVideoHandler(String str, String str2) {
        m25086a(str, str2);
    }

    /* renamed from: a */
    private void m25086a(String str, String str2) {
        try {
            if (this.f21394a == null) {
                C9110a aVar = new C9110a();
                this.f21394a = aVar;
                aVar.mo61282a(true);
                this.f21394a.mo61286b(true);
            }
            this.f21394a.mo61285b(str, str2);
        } catch (Throwable th) {
            C8672v.m24875a("MBBidRewardVideoHandler", th.getMessage(), th);
        }
    }

    public void loadFromBid(String str) {
        C9110a aVar = this.f21394a;
        if (aVar != null) {
            aVar.mo61283a(true, str);
        }
    }

    public void loadFormSelfFilling() {
        C9110a aVar = this.f21394a;
        if (aVar != null) {
            aVar.mo61288d(false);
        }
    }

    public boolean isBidReady() {
        C9110a aVar = this.f21394a;
        if (aVar != null) {
            return aVar.mo61289e(true);
        }
        return false;
    }

    public void showFromBid() {
        C9110a aVar = this.f21394a;
        if (aVar != null) {
            aVar.mo61280a((String) null, (String) null, (String) null);
        }
    }

    public void setRewardVideoListener(InterstitialVideoListener interstitialVideoListener) {
        C9110a aVar = this.f21394a;
        if (aVar != null) {
            aVar.mo61279a((InterVideoOutListener) new C8722a(interstitialVideoListener));
        }
    }

    public void setInterstitialVideoListener(InterstitialVideoListener interstitialVideoListener) {
        C9110a aVar = this.f21394a;
        if (aVar != null) {
            aVar.mo61279a((InterVideoOutListener) new C8722a(interstitialVideoListener));
        }
    }

    public String getRequestId() {
        C9110a aVar = this.f21394a;
        return aVar != null ? aVar.mo61276a() : "";
    }

    public void clearVideoCache() {
        try {
            if (this.f21394a != null) {
                C8666t.m24858a();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void playVideoMute(int i) {
        C9110a aVar = this.f21394a;
        if (aVar != null) {
            aVar.mo61277a(i);
        }
    }

    public void setIVRewardEnable(int i, int i2) {
        C9110a aVar = this.f21394a;
        if (aVar != null) {
            aVar.mo61278a(i, C8469a.f20756q, i2);
        }
    }

    public void setIVRewardEnable(int i, double d) {
        C9110a aVar = this.f21394a;
        if (aVar != null) {
            aVar.mo61278a(i, C8469a.f20755p, (int) (d * 100.0d));
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        C9110a aVar = this.f21394a;
        if (aVar != null) {
            aVar.mo61281a(str, str2, str3, str4);
        }
    }
}
