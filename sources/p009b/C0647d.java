package p009b;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: b.d */
public final class C0647d extends ContentObserver {

    /* renamed from: a */
    private final Context f44a;

    /* renamed from: b */
    private final AudioManager f45b;

    /* renamed from: c */
    private final C0644a f46c;

    /* renamed from: d */
    private final C0646c f47d;

    /* renamed from: e */
    private float f48e;

    public C0647d(Handler handler, Context context, C0644a aVar, C0646c cVar) {
        super(handler);
        this.f44a = context;
        this.f45b = (AudioManager) context.getSystemService("audio");
        this.f46c = aVar;
        this.f47d = cVar;
    }

    /* renamed from: a */
    private float m26a() {
        return this.f46c.mo10087a(this.f45b.getStreamVolume(3), this.f45b.getStreamMaxVolume(3));
    }

    /* renamed from: a */
    private boolean m27a(float f) {
        return f != this.f48e;
    }

    /* renamed from: b */
    private void m28b() {
        this.f47d.mo10089a(this.f48e);
    }

    /* renamed from: c */
    public void mo10090c() {
        this.f48e = m26a();
        m28b();
        this.f44a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: d */
    public void mo10091d() {
        this.f44a.getContentResolver().unregisterContentObserver(this);
    }

    public void onChange(boolean z) {
        super.onChange(z);
        float a = m26a();
        if (m27a(a)) {
            this.f48e = a;
            m28b();
        }
    }
}
