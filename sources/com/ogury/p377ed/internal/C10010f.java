package com.ogury.p377ed.internal;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ogury.core.OguryError;
import com.ogury.p377ed.OguryAdListener;

/* renamed from: com.ogury.ed.internal.f */
public final class C10010f implements C10076h {

    /* renamed from: a */
    public static final C10011a f25174a = new C10011a((byte) 0);

    /* renamed from: b */
    private final OguryAdListener f25175b;

    /* renamed from: b */
    public final void mo64630b() {
    }

    /* renamed from: com.ogury.ed.internal.f$a */
    public static final class C10011a {
        public /* synthetic */ C10011a(byte b) {
            this();
        }

        private C10011a() {
        }

        /* renamed from: a */
        public static C10010f m28994a(OguryAdListener oguryAdListener) {
            if (oguryAdListener != null) {
                return new C10010f(oguryAdListener);
            }
            return null;
        }
    }

    public C10010f(OguryAdListener oguryAdListener) {
        C10263mq.m29882b(oguryAdListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f25175b = oguryAdListener;
    }

    /* renamed from: c */
    public final void mo64631c() {
        this.f25175b.onAdError(new OguryError(2008, "The ad server doesn't have an ad to present to the user"));
    }

    /* renamed from: d */
    public final void mo64632d() {
        this.f25175b.onAdLoaded();
    }

    /* renamed from: e */
    public final void mo64633e() {
        this.f25175b.onAdError(new OguryError(2009, "The loading of the ad failed"));
    }

    /* renamed from: f */
    public final void mo64634f() {
        this.f25175b.onAdDisplayed();
    }

    /* renamed from: g */
    public final void mo64635g() {
        this.f25175b.onAdClosed();
    }

    /* renamed from: a */
    public final void mo64629a(int i) {
        C9924d dVar = C9924d.f24973a;
        this.f25175b.onAdError(C9924d.m28652a(i));
    }

    /* renamed from: a */
    public final void mo64368a() {
        this.f25175b.onAdClicked();
    }
}
