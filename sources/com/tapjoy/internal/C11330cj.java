package com.tapjoy.internal;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;

/* renamed from: com.tapjoy.internal.cj */
public final class C11330cj extends ContentObserver {

    /* renamed from: a */
    public final Context f27016a;

    /* renamed from: b */
    public float f27017b;

    /* renamed from: c */
    private final AudioManager f27018c;

    /* renamed from: d */
    private final C11327cg f27019d;

    /* renamed from: e */
    private final C11329ci f27020e;

    public C11330cj(Handler handler, Context context, C11327cg cgVar, C11329ci ciVar) {
        super(handler);
        this.f27016a = context;
        this.f27018c = (AudioManager) context.getSystemService("audio");
        this.f27019d = cgVar;
        this.f27020e = ciVar;
    }

    /* renamed from: a */
    public final float mo69776a() {
        return C11327cg.m31033a(this.f27018c.getStreamVolume(3), this.f27018c.getStreamMaxVolume(3));
    }

    /* renamed from: b */
    public final void mo69777b() {
        this.f27020e.mo69775a(this.f27017b);
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        float a = mo69776a();
        if (a != this.f27017b) {
            this.f27017b = a;
            mo69777b();
        }
    }
}
