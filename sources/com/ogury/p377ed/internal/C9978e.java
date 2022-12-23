package com.ogury.p377ed.internal;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ogury.p377ed.OguryAdImpressionListener;

/* renamed from: com.ogury.ed.internal.e */
public final class C9978e implements C10177k {

    /* renamed from: a */
    public static final C9979a f25079a = new C9979a((byte) 0);

    /* renamed from: b */
    private final OguryAdImpressionListener f25080b;

    public C9978e(OguryAdImpressionListener oguryAdImpressionListener) {
        C10263mq.m29882b(oguryAdImpressionListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f25080b = oguryAdImpressionListener;
    }

    /* renamed from: com.ogury.ed.internal.e$a */
    public static final class C9979a {
        public /* synthetic */ C9979a(byte b) {
            this();
        }

        private C9979a() {
        }

        /* renamed from: a */
        public static C9978e m28794a(OguryAdImpressionListener oguryAdImpressionListener) {
            if (oguryAdImpressionListener != null) {
                return new C9978e(oguryAdImpressionListener);
            }
            return null;
        }
    }

    /* renamed from: a */
    public final void mo64492a() {
        this.f25080b.onAdImpression();
    }
}
