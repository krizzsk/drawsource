package com.iab.omid.library.adcolony.p224a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.adcolony.a.d */
public final class C7621d extends ContentObserver {

    /* renamed from: a */
    private final Context f18425a;

    /* renamed from: b */
    private final AudioManager f18426b;

    /* renamed from: c */
    private final C7618a f18427c;

    /* renamed from: d */
    private final C7620c f18428d;

    /* renamed from: e */
    private float f18429e;

    public C7621d(Handler handler, Context context, C7618a aVar, C7620c cVar) {
        super(handler);
        this.f18425a = context;
        this.f18426b = (AudioManager) context.getSystemService("audio");
        this.f18427c = aVar;
        this.f18428d = cVar;
    }

    /* renamed from: a */
    private boolean m20975a(float f) {
        return f != this.f18429e;
    }

    /* renamed from: c */
    private float m20976c() {
        return this.f18427c.mo54271a(this.f18426b.getStreamVolume(3), this.f18426b.getStreamMaxVolume(3));
    }

    /* renamed from: d */
    private void m20977d() {
        this.f18428d.mo54273a(this.f18429e);
    }

    /* renamed from: a */
    public void mo54274a() {
        this.f18429e = m20976c();
        m20977d();
        this.f18425a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public void mo54275b() {
        this.f18425a.getContentResolver().unregisterContentObserver(this);
    }

    public void onChange(boolean z) {
        super.onChange(z);
        float c = m20976c();
        if (m20975a(c)) {
            this.f18429e = c;
            m20977d();
        }
    }
}
