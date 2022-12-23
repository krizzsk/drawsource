package com.ogury.p376cm;

import com.ogury.core.OguryError;
import com.ogury.p376cm.OguryChoiceManager;

/* renamed from: com.ogury.cm.OguryConsentListener */
public interface OguryConsentListener {
    void onComplete(OguryChoiceManager.Answer answer);

    void onError(OguryError oguryError);
}
