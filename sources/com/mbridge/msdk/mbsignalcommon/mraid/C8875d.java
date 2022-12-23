package com.mbridge.msdk.mbsignalcommon.mraid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import java.lang.ref.WeakReference;

/* renamed from: com.mbridge.msdk.mbsignalcommon.mraid.d */
/* compiled from: MraidVolumeChangeReceiver */
public final class C8875d {

    /* renamed from: a */
    public static double f21857a = -1.0d;

    /* renamed from: b */
    private Context f21858b;

    /* renamed from: c */
    private AudioManager f21859c;

    /* renamed from: d */
    private boolean f21860d = false;

    /* renamed from: e */
    private C8877b f21861e;

    /* renamed from: f */
    private C8876a f21862f;

    /* renamed from: com.mbridge.msdk.mbsignalcommon.mraid.d$b */
    /* compiled from: MraidVolumeChangeReceiver */
    public interface C8877b {
        /* renamed from: a */
        void mo58259a(double d);
    }

    public C8875d(Context context) {
        this.f21858b = context;
        this.f21859c = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }

    /* renamed from: a */
    public final double mo58639a() {
        AudioManager audioManager = this.f21859c;
        int i = -1;
        int streamMaxVolume = audioManager != null ? audioManager.getStreamMaxVolume(3) : -1;
        AudioManager audioManager2 = this.f21859c;
        if (audioManager2 != null) {
            i = audioManager2.getStreamVolume(3);
        }
        double d = (((double) i) * 100.0d) / ((double) streamMaxVolume);
        f21857a = d;
        return d;
    }

    /* renamed from: b */
    public final C8877b mo58641b() {
        return this.f21861e;
    }

    /* renamed from: a */
    public final void mo58640a(C8877b bVar) {
        this.f21861e = bVar;
    }

    /* renamed from: c */
    public final void mo58642c() {
        if (this.f21858b != null) {
            this.f21862f = new C8876a(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
            this.f21858b.registerReceiver(this.f21862f, intentFilter);
            this.f21860d = true;
        }
    }

    /* renamed from: d */
    public final void mo58643d() {
        Context context;
        if (this.f21860d && (context = this.f21858b) != null) {
            try {
                context.unregisterReceiver(this.f21862f);
                this.f21861e = null;
                this.f21860d = false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mbridge.msdk.mbsignalcommon.mraid.d$a */
    /* compiled from: MraidVolumeChangeReceiver */
    private static class C8876a extends BroadcastReceiver {

        /* renamed from: a */
        private WeakReference<C8875d> f21863a;

        public C8876a(C8875d dVar) {
            this.f21863a = new WeakReference<>(dVar);
        }

        public final void onReceive(Context context, Intent intent) {
            C8875d dVar;
            C8877b b;
            if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3 && (dVar = (C8875d) this.f21863a.get()) != null && (b = dVar.mo58641b()) != null) {
                double a = dVar.mo58639a();
                if (a >= 0.0d) {
                    b.mo58259a(a);
                }
            }
        }
    }
}
