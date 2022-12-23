package com.bytedance.sdk.component.p102b.p103a.p106b;

import android.support.p003v4.media.session.PlaybackStateCompat;

/* renamed from: com.bytedance.sdk.component.b.a.b.f */
/* compiled from: SegmentPool */
final class C2730f {

    /* renamed from: a */
    static C2729e f6078a;

    /* renamed from: b */
    static long f6079b;

    private C2730f() {
    }

    /* renamed from: a */
    static C2729e m7382a() {
        synchronized (C2730f.class) {
            if (f6078a == null) {
                return new C2729e();
            }
            C2729e eVar = f6078a;
            f6078a = eVar.f6076f;
            eVar.f6076f = null;
            f6079b -= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            return eVar;
        }
    }

    /* renamed from: a */
    static void m7383a(C2729e eVar) {
        if (eVar.f6076f != null || eVar.f6077g != null) {
            throw new IllegalArgumentException();
        } else if (!eVar.f6074d) {
            synchronized (C2730f.class) {
                if (f6079b + PlaybackStateCompat.ACTION_PLAY_FROM_URI <= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                    f6079b += PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                    eVar.f6076f = f6078a;
                    eVar.f6073c = 0;
                    eVar.f6072b = 0;
                    f6078a = eVar;
                }
            }
        }
    }
}
