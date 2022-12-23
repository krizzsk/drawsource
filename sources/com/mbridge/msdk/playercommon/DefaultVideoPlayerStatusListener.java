package com.mbridge.msdk.playercommon;

import com.mbridge.msdk.foundation.tools.C8672v;

public class DefaultVideoPlayerStatusListener implements VideoPlayerStatusListener {
    protected static final String TAG = "DefaultVideoPlayerStatusListener";

    public void onPlayStarted(int i) {
        C8672v.m24874a(TAG, "onPlayStarted:" + i);
    }

    public void onPlayCompleted() {
        C8672v.m24874a(TAG, "onPlayCompleted");
    }

    public void onPlayError(String str) {
        C8672v.m24874a(TAG, "onPlayError:" + str);
    }

    public void onPlayProgress(int i, int i2) {
        C8672v.m24874a(TAG, "onPlayProgress:" + i + ",allDuration:" + i2);
    }

    public void onBufferingStart(String str) {
        C8672v.m24874a(TAG, "OnBufferingStart:" + str);
    }

    public void onBufferingEnd() {
        C8672v.m24874a(TAG, "OnBufferingEnd");
    }

    public void onPlaySetDataSourceError(String str) {
        C8672v.m24874a(TAG, "onPlaySetDataSourceError:" + str);
    }

    public void onPlayProgressMS(int i, int i2) {
        C8672v.m24874a(TAG, "onPlayProgressMS:");
    }
}
