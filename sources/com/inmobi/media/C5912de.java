package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;

/* renamed from: com.inmobi.media.de */
/* compiled from: MraidMediaProcessor */
public final class C5912de {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final String f14973f = C5912de.class.getSimpleName();

    /* renamed from: a */
    public C6301q f14974a;

    /* renamed from: b */
    public C5905db f14975b;

    /* renamed from: c */
    public C5917b f14976c;

    /* renamed from: d */
    public C5918c f14977d;

    /* renamed from: e */
    public C5916a f14978e;

    /* renamed from: com.inmobi.media.de$b */
    /* compiled from: MraidMediaProcessor */
    public final class C5917b extends BroadcastReceiver {

        /* renamed from: b */
        private String f14985b;

        public C5917b(String str) {
            this.f14985b = str;
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent != null && "android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
                int intExtra = intent.getIntExtra("android.media.EXTRA_RINGER_MODE", 2);
                String unused = C5912de.f14973f;
                C5912de.m17589a(C5912de.this, this.f14985b, 2 != intExtra);
            }
        }
    }

    /* renamed from: com.inmobi.media.de$a */
    /* compiled from: MraidMediaProcessor */
    public final class C5916a extends BroadcastReceiver {

        /* renamed from: b */
        private String f14983b;

        public C5916a(String str) {
            this.f14983b = str;
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent != null && "android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
                boolean z = false;
                int intExtra = intent.getIntExtra("state", 0);
                String unused = C5912de.f14973f;
                C5912de deVar = C5912de.this;
                String str = this.f14983b;
                if (1 == intExtra) {
                    z = true;
                }
                C5912de.m17591b(deVar, str, z);
            }
        }
    }

    /* renamed from: com.inmobi.media.de$c */
    /* compiled from: MraidMediaProcessor */
    public final class C5918c extends ContentObserver {

        /* renamed from: b */
        private Context f14987b;

        /* renamed from: c */
        private int f14988c = -1;

        /* renamed from: d */
        private String f14989d;

        public C5918c(String str, Context context, Handler handler) {
            super(handler);
            this.f14989d = str;
            this.f14987b = context;
        }

        public final void onChange(boolean z) {
            AudioManager audioManager;
            super.onChange(z);
            Context context = this.f14987b;
            if (context != null && (audioManager = (AudioManager) context.getSystemService("audio")) != null) {
                try {
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume != this.f14988c) {
                        this.f14988c = streamVolume;
                        C5912de.m17588a(C5912de.this, this.f14989d, streamVolume);
                    }
                } catch (Exception unused) {
                    String unused2 = C5912de.f14973f;
                }
            }
        }
    }

    public C5912de(C6301q qVar) {
        this.f14974a = qVar;
    }

    /* renamed from: a */
    public static boolean m17590a() {
        AudioManager audioManager;
        Context c = C6183hw.m18324c();
        if (c == null || (audioManager = (AudioManager) c.getSystemService("audio")) == null || 2 == audioManager.getRingerMode()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo35018b() {
        C5917b bVar;
        Context c = C6183hw.m18324c();
        if (c != null && (bVar = this.f14976c) != null) {
            c.unregisterReceiver(bVar);
            this.f14976c = null;
        }
    }

    /* renamed from: c */
    public final void mo35019c() {
        Context c = C6183hw.m18324c();
        if (c != null && this.f14977d != null) {
            c.getContentResolver().unregisterContentObserver(this.f14977d);
            this.f14977d = null;
        }
    }

    /* renamed from: d */
    public static boolean m17592d() {
        AudioManager audioManager;
        Context c = C6183hw.m18324c();
        if (c == null || (audioManager = (AudioManager) c.getSystemService("audio")) == null || !audioManager.isWiredHeadsetOn()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final void mo35020e() {
        C5916a aVar;
        Context c = C6183hw.m18324c();
        if (c != null && (aVar = this.f14978e) != null) {
            c.unregisterReceiver(aVar);
            this.f14978e = null;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m17589a(C5912de deVar, String str, boolean z) {
        C6301q qVar = deVar.f14974a;
        if (qVar != null) {
            qVar.mo35579a(str, "fireDeviceMuteChangeEvent(" + z + ");");
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m17591b(C5912de deVar, String str, boolean z) {
        C6301q qVar = deVar.f14974a;
        if (qVar != null) {
            qVar.mo35579a(str, "fireHeadphonePluggedEvent(" + z + ");");
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m17588a(C5912de deVar, String str, int i) {
        C6301q qVar = deVar.f14974a;
        if (qVar != null) {
            qVar.mo35579a(str, "fireDeviceVolumeChangeEvent(" + i + ");");
        }
    }
}
