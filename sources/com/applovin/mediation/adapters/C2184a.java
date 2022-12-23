package com.applovin.mediation.adapters;

import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.saygames.saypromo.SayPromoTokenCallback;

/* renamed from: com.applovin.mediation.adapters.a */
public final class C2184a implements SayPromoTokenCallback {

    /* renamed from: a */
    final /* synthetic */ MaxSignalCollectionListener f4164a;

    C2184a(MaxSignalCollectionListener maxSignalCollectionListener) {
        this.f4164a = maxSignalCollectionListener;
    }

    public final void onError(String str) {
        this.f4164a.onSignalCollectionFailed(str);
    }

    public final void onSuccess(String str) {
        this.f4164a.onSignalCollected(str);
    }
}
