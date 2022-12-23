package com.iab.omid.library.ironsrc.p254a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.ironsrc.a.d */
public final class C7873d extends ContentObserver {

    /* renamed from: a */
    private final Context f19006a;

    /* renamed from: b */
    private final AudioManager f19007b;

    /* renamed from: c */
    private final C7870a f19008c;

    /* renamed from: d */
    private final C7872c f19009d;

    /* renamed from: e */
    private float f19010e;

    public C7873d(Handler handler, Context context, C7870a aVar, C7872c cVar) {
        super(handler);
        this.f19006a = context;
        this.f19007b = (AudioManager) context.getSystemService("audio");
        this.f19008c = aVar;
        this.f19009d = cVar;
    }

    /* renamed from: a */
    private boolean m22119a(float f) {
        return f != this.f19010e;
    }

    /* renamed from: c */
    private float m22120c() {
        return this.f19008c.mo55261a(this.f19007b.getStreamVolume(3), this.f19007b.getStreamMaxVolume(3));
    }

    /* renamed from: d */
    private void m22121d() {
        this.f19009d.mo55263a(this.f19010e);
    }

    /* renamed from: a */
    public final void mo55264a() {
        this.f19010e = m22120c();
        m22121d();
        this.f19006a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public final void mo55265b() {
        this.f19006a.getContentResolver().unregisterContentObserver(this);
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        float c = m22120c();
        if (m22119a(c)) {
            this.f19010e = c;
            m22121d();
        }
    }
}
