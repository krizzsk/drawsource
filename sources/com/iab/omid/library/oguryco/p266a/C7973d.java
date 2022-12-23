package com.iab.omid.library.oguryco.p266a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.oguryco.a.d */
public final class C7973d extends ContentObserver {

    /* renamed from: a */
    private final Context f19237a;

    /* renamed from: b */
    private final AudioManager f19238b;

    /* renamed from: c */
    private final C7970a f19239c;

    /* renamed from: d */
    private final C7972c f19240d;

    /* renamed from: e */
    private float f19241e;

    public C7973d(Handler handler, Context context, C7970a aVar, C7972c cVar) {
        super(handler);
        this.f19237a = context;
        this.f19238b = (AudioManager) context.getSystemService("audio");
        this.f19239c = aVar;
        this.f19240d = cVar;
    }

    /* renamed from: a */
    private boolean m22570a(float f) {
        return f != this.f19241e;
    }

    /* renamed from: c */
    private float m22571c() {
        return this.f19239c.mo55646a(this.f19238b.getStreamVolume(3), this.f19238b.getStreamMaxVolume(3));
    }

    /* renamed from: d */
    private void m22572d() {
        this.f19240d.mo55648a(this.f19241e);
    }

    /* renamed from: a */
    public final void mo55649a() {
        this.f19241e = m22571c();
        m22572d();
        this.f19237a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public final void mo55650b() {
        this.f19237a.getContentResolver().unregisterContentObserver(this);
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        float c = m22571c();
        if (m22570a(c)) {
            this.f19241e = c;
            m22572d();
        }
    }
}
