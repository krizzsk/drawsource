package com.bytedance.sdk.openadsdk.p169g;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.bytedance.sdk.component.utils.C2905l;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.sdk.openadsdk.g.g */
/* compiled from: VolumeChangeObserver */
public class C3747g {

    /* renamed from: a */
    private int f9672a = -1;

    /* renamed from: b */
    private C3746f f9673b;

    /* renamed from: c */
    private C3748a f9674c;

    /* renamed from: d */
    private Context f9675d;

    /* renamed from: e */
    private AudioManager f9676e;

    /* renamed from: f */
    private boolean f9677f = false;

    /* renamed from: g */
    private boolean f9678g = false;

    /* renamed from: h */
    private int f9679h = -1;

    public C3747g(Context context) {
        this.f9675d = context;
        this.f9676e = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }

    /* renamed from: a */
    public int mo20527a() {
        return this.f9679h;
    }

    /* renamed from: a */
    public void mo20528a(int i) {
        this.f9679h = i;
    }

    /* renamed from: b */
    public int mo20532b() {
        return this.f9672a;
    }

    /* renamed from: b */
    public void mo20533b(int i) {
        this.f9672a = i;
    }

    /* renamed from: c */
    public boolean mo20534c() {
        if (!this.f9678g) {
            return false;
        }
        this.f9678g = false;
        return true;
    }

    /* renamed from: d */
    public int mo20535d() {
        try {
            if (this.f9676e != null) {
                return this.f9676e.getStreamMaxVolume(3);
            }
            return 15;
        } catch (Throwable th) {
            C2905l.m8106a("VolumeChangeObserver", "getMaxMusicVolumeError: ", th);
            return 15;
        }
    }

    /* renamed from: a */
    public void mo20530a(boolean z) {
        mo20531a(z, false);
    }

    /* renamed from: a */
    public void mo20531a(boolean z, boolean z2) {
        if (this.f9676e != null) {
            int i = 0;
            if (z) {
                int g = mo20538g();
                if (g != 0) {
                    this.f9672a = g;
                }
                C2905l.m8111b("VolumeChangeObserver", "mute set volume to 0");
                this.f9676e.setStreamVolume(3, 0, 0);
                this.f9678g = true;
                return;
            }
            int i2 = this.f9672a;
            if (i2 == 0) {
                i2 = mo20535d() / 15;
            } else {
                if (i2 == -1) {
                    if (z2) {
                        i2 = mo20535d() / 15;
                    } else {
                        return;
                    }
                }
                C2905l.m8111b("VolumeChangeObserver", "not mute set volume to " + i2 + " mLastVolume=" + this.f9672a);
                this.f9672a = -1;
                this.f9676e.setStreamVolume(3, i2, i);
                this.f9678g = true;
            }
            i = 1;
            C2905l.m8111b("VolumeChangeObserver", "not mute set volume to " + i2 + " mLastVolume=" + this.f9672a);
            this.f9672a = -1;
            this.f9676e.setStreamVolume(3, i2, i);
            this.f9678g = true;
        }
    }

    /* renamed from: a */
    public void mo20529a(C3746f fVar) {
        this.f9673b = fVar;
    }

    /* renamed from: e */
    public void mo20536e() {
        try {
            this.f9674c = new C3748a(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
            this.f9675d.registerReceiver(this.f9674c, intentFilter);
            this.f9677f = true;
        } catch (Throwable th) {
            C2905l.m8106a("VolumeChangeObserver", "registerReceiverError: ", th);
        }
    }

    /* renamed from: f */
    public void mo20537f() {
        if (this.f9677f) {
            try {
                this.f9675d.unregisterReceiver(this.f9674c);
                this.f9673b = null;
                this.f9677f = false;
            } catch (Throwable th) {
                C2905l.m8106a("VolumeChangeObserver", "unregisterReceiverError: ", th);
            }
        }
    }

    /* renamed from: g */
    public int mo20538g() {
        try {
            if (this.f9676e != null) {
                return this.f9676e.getStreamVolume(3);
            }
            return -1;
        } catch (Throwable th) {
            C2905l.m8106a("VolumeChangeObserver", "getCurrentMusicVolumeError: ", th);
            return -1;
        }
    }

    /* renamed from: h */
    public C3746f mo20539h() {
        return this.f9673b;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.g.g$a */
    /* compiled from: VolumeChangeObserver */
    private static class C3748a extends BroadcastReceiver {

        /* renamed from: a */
        private WeakReference<C3747g> f9680a;

        public C3748a(C3747g gVar) {
            this.f9680a = new WeakReference<>(gVar);
        }

        public void onReceive(Context context, Intent intent) {
            C3746f h;
            int g;
            try {
                if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                    C2905l.m8111b("VolumeChangeObserver", "Media volume change notification.......");
                    C3747g gVar = (C3747g) this.f9680a.get();
                    if (gVar != null && (h = gVar.mo20539h()) != null && (g = gVar.mo20538g()) != gVar.mo20527a()) {
                        gVar.mo20528a(g);
                        if (g >= 0) {
                            h.mo18340b(g);
                        }
                    }
                }
            } catch (Throwable th) {
                C2905l.m8106a("VolumeChangeObserver", "onVolumeChangedError: ", th);
            }
        }
    }
}
