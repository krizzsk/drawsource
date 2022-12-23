package com.mbridge.msdk.video.signal.p371a;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.video.signal.C9621i;

/* renamed from: com.mbridge.msdk.video.signal.a.g */
/* compiled from: DefaultJSVideoModule */
public class C9511g implements C9621i {
    public int getBorderViewHeight() {
        return 0;
    }

    public int getBorderViewLeft() {
        return 0;
    }

    public int getBorderViewRadius() {
        return 0;
    }

    public int getBorderViewTop() {
        return 0;
    }

    public int getBorderViewWidth() {
        return 0;
    }

    public boolean isH5Canvas() {
        return false;
    }

    public void showVideoLocation(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        C8672v.m24874a("js", "showVideoLocation:marginTop=" + i + ",marginLeft=" + i2 + ",width=" + i3 + ",height=" + i4 + ",radius=" + i5 + ",borderTop=" + i6 + ",borderTop=" + i6 + ",borderLeft=" + i7 + ",borderWidth=" + i8 + ",borderHeight=" + i9);
    }

    public void soundOperate(int i, int i2) {
        C8672v.m24874a("js", "soundOperate:mute=" + i + ",soundViewVisible=" + i2);
    }

    public void soundOperate(int i, int i2, String str) {
        C8672v.m24874a("js", "soundOperate:mute=" + i + ",soundViewVisible=" + i2 + ",pt=" + str);
    }

    public void videoOperate(int i) {
        C8672v.m24874a("js", "videoOperate:" + i);
    }

    public void closeVideoOperate(int i, int i2) {
        C8672v.m24874a("js", "closeOperte:close=" + i + "closeViewVisible=" + i2);
    }

    public void progressOperate(int i, int i2) {
        C8672v.m24874a("js", "progressOperate:progress=" + i + "progressViewVisible=" + i2);
    }

    public void progressBarOperate(int i) {
        C8672v.m24874a("js", "progressBarOperate:progressViewVisible=" + i);
    }

    public String getCurrentProgress() {
        C8672v.m24874a("js", "getCurrentProgress");
        return JsonUtils.EMPTY_JSON;
    }

    public void setScaleFitXY(int i) {
        C8672v.m24874a("js", "setScaleFitXY:" + i);
    }

    public void setVisible(int i) {
        C8672v.m24874a("js", "setVisible:" + i);
    }

    public void setCover(boolean z) {
        C8672v.m24874a("js", "setCover:" + z);
    }

    public void notifyCloseBtn(int i) {
        C8672v.m24874a("js", "notifyCloseBtn:" + i);
    }

    public void showIVRewardAlertView(String str) {
        C8672v.m24874a("js", "showAlertView:");
    }

    public void showAlertView() {
        C8672v.m24874a("js", "showAlertView:");
    }

    public void hideAlertView(int i) {
        C8672v.m24874a("js", "hideAlertView:");
    }

    public void alertWebViewShowed() {
        C8672v.m24874a("js", "alertWebViewShowed:");
    }

    public void dismissAllAlert() {
        C8672v.m24874a("js", "dismissAllAlert");
    }

    public void setMiniEndCardState(boolean z) {
        C8672v.m24874a("js", "setMiniEndCardState" + z);
    }
}
