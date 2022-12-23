package com.unity3d.player;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.unity3d.player.a */
final class C11745a {

    /* renamed from: a */
    private final Context f28384a;

    /* renamed from: b */
    private final AudioManager f28385b;

    /* renamed from: c */
    private C11746a f28386c;

    /* renamed from: com.unity3d.player.a$a */
    private class C11746a extends ContentObserver {

        /* renamed from: b */
        private final C11747b f28388b;

        /* renamed from: c */
        private final AudioManager f28389c;

        /* renamed from: d */
        private final int f28390d = 3;

        /* renamed from: e */
        private int f28391e;

        public C11746a(Handler handler, AudioManager audioManager, int i, C11747b bVar) {
            super(handler);
            this.f28389c = audioManager;
            this.f28388b = bVar;
            this.f28391e = audioManager.getStreamVolume(3);
        }

        public final boolean deliverSelfNotifications() {
            return super.deliverSelfNotifications();
        }

        public final void onChange(boolean z, Uri uri) {
            int streamVolume;
            AudioManager audioManager = this.f28389c;
            if (audioManager != null && this.f28388b != null && (streamVolume = audioManager.getStreamVolume(this.f28390d)) != this.f28391e) {
                this.f28391e = streamVolume;
                this.f28388b.onAudioVolumeChanged(streamVolume);
            }
        }
    }

    /* renamed from: com.unity3d.player.a$b */
    public interface C11747b {
        void onAudioVolumeChanged(int i);
    }

    public C11745a(Context context) {
        this.f28384a = context;
        this.f28385b = (AudioManager) context.getSystemService("audio");
    }

    /* renamed from: a */
    public final void mo70517a() {
        if (this.f28386c != null) {
            this.f28384a.getContentResolver().unregisterContentObserver(this.f28386c);
            this.f28386c = null;
        }
    }

    /* renamed from: a */
    public final void mo70518a(C11747b bVar) {
        this.f28386c = new C11746a(new Handler(), this.f28385b, 3, bVar);
        this.f28384a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.f28386c);
    }
}
