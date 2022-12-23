package com.bykv.p054vk.openvk.component.video.p055a.p067d;

import com.bykv.p054vk.openvk.component.video.api.p074f.C2415c;
import com.bykv.p054vk.openvk.component.video.p055a.p067d.C2366c;

/* renamed from: com.bykv.vk.openvk.component.video.a.d.a */
/* compiled from: AbstractMediaPlayer */
public abstract class C2363a implements C2366c {

    /* renamed from: a */
    protected boolean f4787a = false;

    /* renamed from: b */
    private C2366c.C2371e f4788b;

    /* renamed from: c */
    private C2366c.C2368b f4789c;

    /* renamed from: d */
    private C2366c.C2367a f4790d;

    /* renamed from: e */
    private C2366c.C2372f f4791e;

    /* renamed from: f */
    private C2366c.C2373g f4792f;

    /* renamed from: g */
    private C2366c.C2369c f4793g;

    /* renamed from: h */
    private C2366c.C2370d f4794h;

    /* renamed from: a */
    public final void mo15822a(C2366c.C2371e eVar) {
        this.f4788b = eVar;
    }

    /* renamed from: a */
    public final void mo15819a(C2366c.C2368b bVar) {
        this.f4789c = bVar;
    }

    /* renamed from: a */
    public final void mo15818a(C2366c.C2367a aVar) {
        this.f4790d = aVar;
    }

    /* renamed from: a */
    public final void mo15823a(C2366c.C2372f fVar) {
        this.f4791e = fVar;
    }

    /* renamed from: a */
    public final void mo15820a(C2366c.C2369c cVar) {
        this.f4793g = cVar;
    }

    /* renamed from: a */
    public final void mo15821a(C2366c.C2370d dVar) {
        this.f4794h = dVar;
    }

    /* renamed from: a */
    public final void mo15824a(C2366c.C2373g gVar) {
        this.f4792f = gVar;
    }

    /* renamed from: a */
    public void mo15815a() {
        this.f4788b = null;
        this.f4790d = null;
        this.f4789c = null;
        this.f4791e = null;
        this.f4792f = null;
        this.f4793g = null;
        this.f4794h = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo15827b() {
        try {
            if (this.f4788b != null) {
                this.f4788b.mo15862b(this);
            }
        } catch (Throwable th) {
            C2415c.m5836c("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnPrepared error: ", th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo15829c() {
        try {
            if (this.f4789c != null) {
                this.f4789c.mo15859a(this);
            }
        } catch (Throwable th) {
            C2415c.m5836c("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnCompletion error: ", th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15816a(int i) {
        try {
            if (this.f4790d != null) {
                this.f4790d.mo15858a(this, i);
            }
        } catch (Throwable th) {
            C2415c.m5836c("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnBufferingUpdate error: ", th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo15830d() {
        try {
            if (this.f4791e != null) {
                this.f4791e.mo15863c(this);
            }
        } catch (Throwable th) {
            C2415c.m5836c("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnSeekComplete error: ", th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15817a(int i, int i2, int i3, int i4) {
        try {
            if (this.f4792f != null) {
                this.f4792f.mo15864a(this, i, i2, i3, i4);
            }
        } catch (Throwable th) {
            C2415c.m5836c("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnVideoSizeChanged error: ", th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo15826a(int i, int i2) {
        try {
            return this.f4793g != null && this.f4793g.mo15860a(this, i, i2);
        } catch (Throwable th) {
            C2415c.m5836c("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnError error: ", th);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo15828b(int i, int i2) {
        try {
            return this.f4794h != null && this.f4794h.mo15861b(this, i, i2);
        } catch (Throwable th) {
            C2415c.m5836c("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnInfo error: ", th);
            return false;
        }
    }

    /* renamed from: a */
    public void mo15825a(boolean z) {
        this.f4787a = z;
    }
}
