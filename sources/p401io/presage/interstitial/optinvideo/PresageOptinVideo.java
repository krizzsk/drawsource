package p401io.presage.interstitial.optinvideo;

import android.content.Context;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ogury.p377ed.OguryAdClickCallback;
import com.ogury.p377ed.internal.C10066gs;
import com.ogury.p377ed.internal.C10072gw;
import com.ogury.p377ed.internal.C10076h;
import com.ogury.p377ed.internal.C10182ke;
import com.ogury.p377ed.internal.C10228lk;
import com.ogury.p377ed.internal.C10263mq;
import com.ogury.p377ed.internal.C10264mr;
import com.ogury.p377ed.internal.C10330t;
import com.ogury.p377ed.internal.C9864bm;
import com.ogury.p377ed.internal.C9989ej;
import p401io.presage.common.AdConfig;
import p401io.presage.common.network.models.RewardItem;
import p401io.presage.interstitial.PresageInterstitialCallback;

@Deprecated
/* renamed from: io.presage.interstitial.optinvideo.PresageOptinVideo */
public final class PresageOptinVideo {

    /* renamed from: a */
    private final C9864bm f29811a;

    /* renamed from: b */
    private final C10066gs f29812b;

    private PresageOptinVideo(C9864bm bmVar) {
        this.f29811a = bmVar;
        this.f29812b = new C10066gs();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PresageOptinVideo(Context context, AdConfig adConfig) {
        this(new C9864bm(context, adConfig, C9989ej.OPTIN_VIDEO));
        C10263mq.m29882b(context, "context");
        C10263mq.m29882b(adConfig, "adConfig");
    }

    public final boolean isLoaded() {
        return this.f29811a.mo64385b();
    }

    /* renamed from: io.presage.interstitial.optinvideo.PresageOptinVideo$a */
    static final class C12486a extends C10264mr implements C10228lk<RewardItem, C10182ke> {

        /* renamed from: a */
        final /* synthetic */ PresageOptinVideoCallback f29813a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12486a(PresageOptinVideoCallback presageOptinVideoCallback) {
            super(1);
            this.f29813a = presageOptinVideoCallback;
        }

        /* renamed from: a */
        private void m33349a(RewardItem rewardItem) {
            C10263mq.m29882b(rewardItem, "rewardItem");
            PresageOptinVideoCallback presageOptinVideoCallback = this.f29813a;
            if (presageOptinVideoCallback != null) {
                presageOptinVideoCallback.onAdRewarded(rewardItem);
            }
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo64242a(Object obj) {
            m33349a((RewardItem) obj);
            return C10182ke.f25542a;
        }
    }

    public final void setOptinVideoCallback(PresageOptinVideoCallback presageOptinVideoCallback) {
        this.f29811a.mo64379a((C10076h) this.f29812b.mo64788a((PresageInterstitialCallback) presageOptinVideoCallback));
        this.f29811a.mo64381a((C10228lk<? super RewardItem, C10182ke>) new C12486a(presageOptinVideoCallback));
    }

    public final void setOnAdClickedCallback(OguryAdClickCallback oguryAdClickCallback) {
        this.f29812b.mo64789a(oguryAdClickCallback);
    }

    public final void load() {
        this.f29811a.mo64378a();
    }

    public final void show() {
        this.f29811a.mo64382a((C10330t) C10072gw.f25302a);
    }

    public final void setUserId(String str) {
        C10263mq.m29882b(str, DataKeys.USER_ID);
        this.f29811a.mo64383a(str);
    }
}
