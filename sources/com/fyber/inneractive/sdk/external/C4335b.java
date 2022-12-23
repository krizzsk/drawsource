package com.fyber.inneractive.sdk.external;

import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.C4509p;
import com.fyber.inneractive.sdk.network.C4511q;
import com.fyber.inneractive.sdk.response.C5233e;
import com.fyber.inneractive.sdk.util.C5292l;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.external.b */
public class C4335b implements Runnable {
    public C4335b(InneractiveAdManager inneractiveAdManager) {
    }

    public void run() {
        IAConfigManager iAConfigManager = IAConfigManager.f10324J;
        SharedPreferences sharedPreferences = C5292l.f14015a.getSharedPreferences("IAConfigurationPreferences", 0);
        if (!(sharedPreferences != null && sharedPreferences.contains("IAConfigFQE"))) {
            SharedPreferences sharedPreferences2 = C5292l.f14015a.getSharedPreferences("IAConfigurationPreferences", 0);
            if (sharedPreferences2 != null) {
                sharedPreferences2.edit().putBoolean("IAConfigFQE", true).apply();
            }
            new C4511q.C4512a(C4509p.FIRST_OPENED, (InneractiveAdRequest) null, (C5233e) null, (JSONArray) null).mo24693a((String) null);
        }
    }
}
