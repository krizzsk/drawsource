package com.smaato.sdk.interstitial;

import android.app.Activity;
import com.smaato.sdk.core.p380ad.InterstitialAdPresenter;
import com.smaato.sdk.core.util.Intents;
import com.smaato.sdk.core.util.p384fi.Supplier;
import java.util.UUID;

class InterstitialAdImpl extends InterstitialAd {
    private final InterstitialAdPresenter adPresenter;
    private final InterstitialAdPresenter.Listener adPresenterListener;
    /* access modifiers changed from: private */
    public final EventListener eventListener;
    private final InterstitialAdPresenterStorage interstitialAdPresenterStorage;
    private final Supplier<UUID> uuidSupplier;

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, com.smaato.sdk.core.util.fi.Supplier<java.util.UUID>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    InterstitialAdImpl(com.smaato.sdk.core.p380ad.InterstitialAdPresenter r2, com.smaato.sdk.core.util.p384fi.Supplier<java.util.UUID> r3, com.smaato.sdk.interstitial.InterstitialAdPresenterStorage r4, com.smaato.sdk.interstitial.EventListener r5) {
        /*
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = com.smaato.sdk.core.util.Objects.requireNonNull(r2)
            com.smaato.sdk.core.ad.InterstitialAdPresenter r0 = (com.smaato.sdk.core.p380ad.InterstitialAdPresenter) r0
            r1.adPresenter = r0
            java.lang.Object r3 = com.smaato.sdk.core.util.Objects.requireNonNull(r3)
            com.smaato.sdk.core.util.fi.Supplier r3 = (com.smaato.sdk.core.util.p384fi.Supplier) r3
            r1.uuidSupplier = r3
            java.lang.Object r3 = com.smaato.sdk.core.util.Objects.requireNonNull(r4)
            com.smaato.sdk.interstitial.InterstitialAdPresenterStorage r3 = (com.smaato.sdk.interstitial.InterstitialAdPresenterStorage) r3
            r1.interstitialAdPresenterStorage = r3
            java.lang.Object r3 = com.smaato.sdk.core.util.Objects.requireNonNull(r5)
            com.smaato.sdk.interstitial.EventListener r3 = (com.smaato.sdk.interstitial.EventListener) r3
            r1.eventListener = r3
            com.smaato.sdk.core.ad.InterstitialAdPresenter$Listener r3 = r1.createAdPresenterListener()
            r1.adPresenterListener = r3
            r2.setListener(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.interstitial.InterstitialAdImpl.<init>(com.smaato.sdk.core.ad.InterstitialAdPresenter, com.smaato.sdk.core.util.fi.Supplier, com.smaato.sdk.interstitial.InterstitialAdPresenterStorage, com.smaato.sdk.interstitial.EventListener):void");
    }

    /* access modifiers changed from: protected */
    public void showAdInternal(Activity activity, boolean z) {
        if (this.adPresenter.isValid()) {
            UUID uuid = this.uuidSupplier.get();
            this.interstitialAdPresenterStorage.putAdPresenter(uuid, this.adPresenter);
            Intents.startIntent(activity, InterstitialAdActivity.createIntent(activity, uuid, this.backgroundColor, z));
            return;
        }
        this.eventListener.onAdError(this, InterstitialError.CREATIVE_RESOURCE_EXPIRED);
    }

    public String getSessionId() {
        return this.adPresenter.getSessionId();
    }

    public String getCreativeId() {
        return this.adPresenter.getCreativeId();
    }

    public String getAdSpaceId() {
        return this.adPresenter.getAdSpaceId();
    }

    public boolean isAvailableForPresentation() {
        return this.adPresenter.isValid();
    }

    private InterstitialAdPresenter.Listener createAdPresenterListener() {
        return new InterstitialAdPresenter.Listener() {
            public void onOpen(InterstitialAdPresenter interstitialAdPresenter) {
                InterstitialAdImpl.this.eventListener.onAdOpened(InterstitialAdImpl.this);
            }

            public void onClose(InterstitialAdPresenter interstitialAdPresenter) {
                InterstitialAdImpl.this.eventListener.onAdClosed(InterstitialAdImpl.this);
            }

            public void onAdUnload(InterstitialAdPresenter interstitialAdPresenter) {
                InterstitialAdImpl.this.eventListener.onAdError(InterstitialAdImpl.this, InterstitialError.AD_UNLOADED);
            }

            public void onAdImpressed(InterstitialAdPresenter interstitialAdPresenter) {
                InterstitialAdImpl.this.eventListener.onAdImpression(InterstitialAdImpl.this);
            }

            public void onAdClicked(InterstitialAdPresenter interstitialAdPresenter) {
                InterstitialAdImpl.this.eventListener.onAdClicked(InterstitialAdImpl.this);
            }

            public void onAdError(InterstitialAdPresenter interstitialAdPresenter) {
                InterstitialAdImpl.this.eventListener.onAdError(InterstitialAdImpl.this, InterstitialError.INTERNAL_ERROR);
            }

            public void onTTLExpired(InterstitialAdPresenter interstitialAdPresenter) {
                InterstitialAdImpl.this.eventListener.onAdTTLExpired(InterstitialAdImpl.this);
            }
        };
    }
}
