package com.tapjoy.internal;

import android.support.p003v4.media.session.PlaybackStateCompat;

/* renamed from: com.tapjoy.internal.jj */
final class C11655jj {

    /* renamed from: a */
    static C11654ji f28099a;

    /* renamed from: b */
    static long f28100b;

    private C11655jj() {
    }

    /* renamed from: a */
    static C11654ji m31975a() {
        synchronized (C11655jj.class) {
            if (f28099a == null) {
                return new C11654ji();
            }
            C11654ji jiVar = f28099a;
            f28099a = jiVar.f28097f;
            jiVar.f28097f = null;
            f28100b -= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            return jiVar;
        }
    }

    /* renamed from: a */
    static void m31976a(C11654ji jiVar) {
        if (jiVar.f28097f != null || jiVar.f28098g != null) {
            throw new IllegalArgumentException();
        } else if (!jiVar.f28095d) {
            synchronized (C11655jj.class) {
                if (f28100b + PlaybackStateCompat.ACTION_PLAY_FROM_URI <= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                    f28100b += PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                    jiVar.f28097f = f28099a;
                    jiVar.f28094c = 0;
                    jiVar.f28093b = 0;
                    f28099a = jiVar;
                }
            }
        }
    }
}
