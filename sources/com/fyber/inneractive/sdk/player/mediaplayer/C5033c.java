package com.fyber.inneractive.sdk.player.mediaplayer;

import android.media.AudioManager;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.c */
public class C5033c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C5018a f13416a;

    public C5033c(C5018a aVar) {
        this.f13416a = aVar;
    }

    public void run() {
        C5018a aVar = this.f13416a;
        String c = aVar.mo25615c();
        long currentTimeMillis = System.currentTimeMillis();
        AudioManager audioManager = (AudioManager) aVar.f13378a.getSystemService("audio");
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f = ((float) streamVolume) / ((float) streamMaxVolume);
        IAlog.m16446a("%s unmute maxVolume = %d currentVolume = %d targetVolume = %s", aVar.mo25615c(), Integer.valueOf(streamMaxVolume), Integer.valueOf(streamVolume), Float.valueOf(f));
        if (f == 0.0f) {
            f = 0.1f;
        }
        aVar.setVolume(f, f);
        IAlog.m16449d(c + "timelog: " + "unmute" + " took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
    }
}
