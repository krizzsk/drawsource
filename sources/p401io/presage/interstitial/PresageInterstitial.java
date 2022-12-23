package p401io.presage.interstitial;

import android.content.Context;
import com.ogury.p377ed.OguryAdClickCallback;
import com.ogury.p377ed.internal.C10066gs;
import com.ogury.p377ed.internal.C10072gw;
import com.ogury.p377ed.internal.C10076h;
import com.ogury.p377ed.internal.C10263mq;
import com.ogury.p377ed.internal.C10330t;
import com.ogury.p377ed.internal.C9864bm;
import com.ogury.p377ed.internal.C9989ej;
import p401io.presage.common.AdConfig;

@Deprecated
/* renamed from: io.presage.interstitial.PresageInterstitial */
public final class PresageInterstitial {

    /* renamed from: a */
    private final C9864bm f29809a;

    /* renamed from: b */
    private final C10066gs f29810b;

    private PresageInterstitial(C9864bm bmVar) {
        this.f29809a = bmVar;
        this.f29810b = new C10066gs();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PresageInterstitial(Context context) {
        this(context, (AdConfig) null);
        C10263mq.m29882b(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PresageInterstitial(Context context, AdConfig adConfig) {
        this(new C9864bm(context, adConfig, C9989ej.INTERSTITIAL));
        C10263mq.m29882b(context, "context");
    }

    public final boolean isLoaded() {
        return this.f29809a.mo64385b();
    }

    public final void setInterstitialCallback(PresageInterstitialCallback presageInterstitialCallback) {
        this.f29809a.mo64379a((C10076h) this.f29810b.mo64788a(presageInterstitialCallback));
    }

    public final void setOnAdClickedCallback(OguryAdClickCallback oguryAdClickCallback) {
        this.f29810b.mo64789a(oguryAdClickCallback);
    }

    public final void load() {
        this.f29809a.mo64378a();
    }

    public final void show() {
        this.f29809a.mo64382a((C10330t) C10072gw.f25302a);
    }
}
