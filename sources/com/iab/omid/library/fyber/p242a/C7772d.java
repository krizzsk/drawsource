package com.iab.omid.library.fyber.p242a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.fyber.a.d */
public final class C7772d extends ContentObserver {

    /* renamed from: a */
    private final Context f18776a;

    /* renamed from: b */
    private final AudioManager f18777b;

    /* renamed from: c */
    private final C7769a f18778c;

    /* renamed from: d */
    private final C7771c f18779d;

    /* renamed from: e */
    private float f18780e;

    public C7772d(Handler handler, Context context, C7769a aVar, C7771c cVar) {
        super(handler);
        this.f18776a = context;
        this.f18777b = (AudioManager) context.getSystemService("audio");
        this.f18778c = aVar;
        this.f18779d = cVar;
    }

    /* renamed from: a */
    private boolean m21665a(float f) {
        return f != this.f18780e;
    }

    /* renamed from: c */
    private float m21666c() {
        return this.f18778c.mo54868a(this.f18777b.getStreamVolume(3), this.f18777b.getStreamMaxVolume(3));
    }

    /* renamed from: d */
    private void m21667d() {
        this.f18779d.mo54870a(this.f18780e);
    }

    /* renamed from: a */
    public void mo54871a() {
        this.f18780e = m21666c();
        m21667d();
        this.f18776a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public void mo54872b() {
        this.f18776a.getContentResolver().unregisterContentObserver(this);
    }

    public void onChange(boolean z) {
        super.onChange(z);
        float c = m21666c();
        if (m21665a(c)) {
            this.f18780e = c;
            m21667d();
        }
    }
}
