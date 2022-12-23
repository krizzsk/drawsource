package com.fyber.inneractive.sdk.activities;

import android.media.MediaPlayer;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.activities.i */
public class C4124i implements MediaPlayer.OnErrorListener {

    /* renamed from: a */
    public final /* synthetic */ InneractiveRichMediaVideoPlayerActivityCore f10148a;

    public C4124i(InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore) {
        this.f10148a = inneractiveRichMediaVideoPlayerActivityCore;
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        IAlog.m16446a("Error: video can not be played.", new Object[0]);
        this.f10148a.finish();
        return false;
    }
}
