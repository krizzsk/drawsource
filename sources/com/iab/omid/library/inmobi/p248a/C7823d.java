package com.iab.omid.library.inmobi.p248a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.inmobi.a.d */
public final class C7823d extends ContentObserver {

    /* renamed from: a */
    private final Context f18893a;

    /* renamed from: b */
    private final AudioManager f18894b;

    /* renamed from: c */
    private final C7820a f18895c;

    /* renamed from: d */
    private final C7822c f18896d;

    /* renamed from: e */
    private float f18897e;

    public C7823d(Handler handler, Context context, C7820a aVar, C7822c cVar) {
        super(handler);
        this.f18893a = context;
        this.f18894b = (AudioManager) context.getSystemService("audio");
        this.f18895c = aVar;
        this.f18896d = cVar;
    }

    /* renamed from: a */
    private boolean m21895a(float f) {
        return f != this.f18897e;
    }

    /* renamed from: c */
    private float m21896c() {
        return this.f18895c.mo55067a(this.f18894b.getStreamVolume(3), this.f18894b.getStreamMaxVolume(3));
    }

    /* renamed from: d */
    private void m21897d() {
        this.f18896d.mo55069a(this.f18897e);
    }

    /* renamed from: a */
    public void mo55070a() {
        this.f18897e = m21896c();
        m21897d();
        this.f18893a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public void mo55071b() {
        this.f18893a.getContentResolver().unregisterContentObserver(this);
    }

    public void onChange(boolean z) {
        super.onChange(z);
        float c = m21896c();
        if (m21895a(c)) {
            this.f18897e = c;
            m21897d();
        }
    }
}
