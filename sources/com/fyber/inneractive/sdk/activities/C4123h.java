package com.fyber.inneractive.sdk.activities;

import android.media.MediaPlayer;

/* renamed from: com.fyber.inneractive.sdk.activities.h */
public class C4123h implements MediaPlayer.OnCompletionListener {

    /* renamed from: a */
    public final /* synthetic */ InneractiveRichMediaVideoPlayerActivityCore f10147a;

    public C4123h(InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore) {
        this.f10147a = inneractiveRichMediaVideoPlayerActivityCore;
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        this.f10147a.finish();
    }
}
