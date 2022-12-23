package com.smaato.sdk.core.locationaware;

import android.content.Context;
import android.telephony.TelephonyManager;

public class SimInfoImpl implements SimInfo {

    /* renamed from: tm */
    private final TelephonyManager f26403tm;

    SimInfoImpl(Context context) {
        this.f26403tm = (TelephonyManager) context.getSystemService("phone");
    }

    public String getSimCountryIso() {
        return this.f26403tm.getSimCountryIso();
    }

    public String getNetworkCountryIso() {
        return this.f26403tm.getNetworkCountryIso();
    }
}
