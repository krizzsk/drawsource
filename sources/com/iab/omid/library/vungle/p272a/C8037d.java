package com.iab.omid.library.vungle.p272a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.vungle.a.d */
public final class C8037d extends ContentObserver {

    /* renamed from: a */
    private final Context f19426a;

    /* renamed from: b */
    private final AudioManager f19427b;

    /* renamed from: c */
    private final C8034a f19428c;

    /* renamed from: d */
    private final C8036c f19429d;

    /* renamed from: e */
    private float f19430e;

    public C8037d(Handler handler, Context context, C8034a aVar, C8036c cVar) {
        super(handler);
        this.f19426a = context;
        this.f19427b = (AudioManager) context.getSystemService("audio");
        this.f19428c = aVar;
        this.f19429d = cVar;
    }

    /* renamed from: a */
    private boolean m22896a(float f) {
        return f != this.f19430e;
    }

    /* renamed from: c */
    private float m22897c() {
        return this.f19428c.mo55984a(this.f19427b.getStreamVolume(3), this.f19427b.getStreamMaxVolume(3));
    }

    /* renamed from: d */
    private void m22898d() {
        this.f19429d.mo55986a(this.f19430e);
    }

    /* renamed from: a */
    public void mo55987a() {
        this.f19430e = m22897c();
        m22898d();
        this.f19426a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public void mo55988b() {
        this.f19426a.getContentResolver().unregisterContentObserver(this);
    }

    public void onChange(boolean z) {
        super.onChange(z);
        float c = m22897c();
        if (m22896a(c)) {
            this.f19430e = c;
            m22898d();
        }
    }
}
