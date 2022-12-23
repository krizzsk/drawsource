package com.iab.omid.library.amazon.p230a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.amazon.a.d */
public final class C7671d extends ContentObserver {

    /* renamed from: a */
    private final Context f18542a;

    /* renamed from: b */
    private final AudioManager f18543b;

    /* renamed from: c */
    private final C7668a f18544c;

    /* renamed from: d */
    private final C7670c f18545d;

    /* renamed from: e */
    private float f18546e;

    public C7671d(Handler handler, Context context, C7668a aVar, C7670c cVar) {
        super(handler);
        this.f18542a = context;
        this.f18543b = (AudioManager) context.getSystemService("audio");
        this.f18544c = aVar;
        this.f18545d = cVar;
    }

    /* renamed from: a */
    private boolean m21205a(float f) {
        return f != this.f18546e;
    }

    /* renamed from: c */
    private float m21206c() {
        return this.f18544c.mo54470a(this.f18543b.getStreamVolume(3), this.f18543b.getStreamMaxVolume(3));
    }

    /* renamed from: d */
    private void m21207d() {
        this.f18545d.mo54472a(this.f18546e);
    }

    /* renamed from: a */
    public void mo54473a() {
        this.f18546e = m21206c();
        m21207d();
        this.f18542a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public void mo54474b() {
        this.f18542a.getContentResolver().unregisterContentObserver(this);
    }

    public void onChange(boolean z) {
        super.onChange(z);
        float c = m21206c();
        if (m21205a(c)) {
            this.f18546e = c;
            m21207d();
        }
    }
}
