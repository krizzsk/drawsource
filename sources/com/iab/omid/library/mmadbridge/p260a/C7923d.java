package com.iab.omid.library.mmadbridge.p260a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.mmadbridge.a.d */
public final class C7923d extends ContentObserver {

    /* renamed from: a */
    private final Context f19120a;

    /* renamed from: b */
    private final AudioManager f19121b;

    /* renamed from: c */
    private final C7920a f19122c;

    /* renamed from: d */
    private final C7922c f19123d;

    /* renamed from: e */
    private float f19124e;

    public C7923d(Handler handler, Context context, C7920a aVar, C7922c cVar) {
        super(handler);
        this.f19120a = context;
        this.f19121b = (AudioManager) context.getSystemService("audio");
        this.f19122c = aVar;
        this.f19123d = cVar;
    }

    /* renamed from: a */
    private boolean m22340a(float f) {
        return f != this.f19124e;
    }

    /* renamed from: c */
    private float m22341c() {
        return this.f19122c.mo55447a(this.f19121b.getStreamVolume(3), this.f19121b.getStreamMaxVolume(3));
    }

    /* renamed from: d */
    private void m22342d() {
        this.f19123d.mo55449a(this.f19124e);
    }

    /* renamed from: a */
    public void mo55450a() {
        this.f19124e = m22341c();
        m22342d();
        this.f19120a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public void mo55451b() {
        this.f19120a.getContentResolver().unregisterContentObserver(this);
    }

    public void onChange(boolean z) {
        super.onChange(z);
        float c = m22341c();
        if (m22340a(c)) {
            this.f19124e = c;
            m22342d();
        }
    }
}
