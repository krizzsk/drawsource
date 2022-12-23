package com.mbridge.msdk.video.signal.p371a;

import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.video.signal.C9615e;
import com.mbridge.msdk.video.signal.C9619g;

/* renamed from: com.mbridge.msdk.video.signal.a.d */
/* compiled from: DefaultJSContainerModule */
public class C9508d implements C9615e, C9619g {
    public void configurationChanged(int i, int i2, int i3) {
    }

    public void showVideoClickView(int i) {
        C8672v.m24874a("js", "showVideoClickView:" + i);
    }

    public void showEndcard(int i) {
        C8672v.m24874a("js", "showEndcard,type=" + i);
    }

    public void showVideoEndCover() {
        C8672v.m24874a("js", "showVideoEndCover");
    }

    public boolean endCardShowing() {
        C8672v.m24874a("js", "endCardShowing");
        return true;
    }

    public boolean miniCardShowing() {
        C8672v.m24874a("js", "miniCardShowing");
        return false;
    }

    public void notifyCloseBtn(int i) {
        C8672v.m24874a("js", "notifyCloseBtn:state = " + i);
    }

    public void toggleCloseBtn(int i) {
        C8672v.m24874a("js", "toggleCloseBtn:state=" + i);
    }

    public void readyStatus(int i) {
        C8672v.m24874a("js", "readyStatus:isReady=" + i);
    }

    public void showMiniCard(int i, int i2, int i3, int i4, int i5) {
        C8672v.m24874a("js", "showMiniCard top = " + i + " left = " + i2 + " width = " + i3 + " height = " + i4 + " radius = " + i5);
    }

    public void resizeMiniCard(int i, int i2, int i3) {
        C8672v.m24874a("js", "showMiniCard width = " + i + " height = " + i2 + " radius = " + i3);
    }

    public boolean showAlertWebView() {
        C8672v.m24874a("js", "showAlertWebView ,msg=");
        return false;
    }

    public void hideAlertWebview() {
        C8672v.m24874a("js", "hideAlertWebview ,msg=");
    }

    public void ivRewardAdsWithoutVideo(String str) {
        C8672v.m24874a("js", "ivRewardAdsWithoutVideo,params=");
    }
}
