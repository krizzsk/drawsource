package com.unity3d.player;

import android.content.Context;
import com.unity3d.player.C11745a;

public class AudioVolumeHandler implements C11745a.C11747b {

    /* renamed from: a */
    private C11745a f28240a;

    AudioVolumeHandler(Context context) {
        C11745a aVar = new C11745a(context);
        this.f28240a = aVar;
        aVar.mo70518a(this);
    }

    /* renamed from: a */
    public final void mo70364a() {
        this.f28240a.mo70517a();
        this.f28240a = null;
    }

    public final native void onAudioVolumeChanged(int i);
}
