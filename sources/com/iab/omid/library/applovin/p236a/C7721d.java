package com.iab.omid.library.applovin.p236a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.applovin.a.d */
public final class C7721d extends ContentObserver {

    /* renamed from: a */
    private final Context f18659a;

    /* renamed from: b */
    private final AudioManager f18660b;

    /* renamed from: c */
    private final C7718a f18661c;

    /* renamed from: d */
    private final C7720c f18662d;

    /* renamed from: e */
    private float f18663e;

    public C7721d(Handler handler, Context context, C7718a aVar, C7720c cVar) {
        super(handler);
        this.f18659a = context;
        this.f18660b = (AudioManager) context.getSystemService("audio");
        this.f18661c = aVar;
        this.f18662d = cVar;
    }

    /* renamed from: a */
    private boolean m21435a(float f) {
        return f != this.f18663e;
    }

    /* renamed from: c */
    private float m21436c() {
        return this.f18661c.mo54669a(this.f18660b.getStreamVolume(3), this.f18660b.getStreamMaxVolume(3));
    }

    /* renamed from: d */
    private void m21437d() {
        this.f18662d.mo54671a(this.f18663e);
    }

    /* renamed from: a */
    public void mo54672a() {
        this.f18663e = m21436c();
        m21437d();
        this.f18659a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public void mo54673b() {
        this.f18659a.getContentResolver().unregisterContentObserver(this);
    }

    public void onChange(boolean z) {
        super.onChange(z);
        float c = m21436c();
        if (m21435a(c)) {
            this.f18663e = c;
            m21437d();
        }
    }
}
