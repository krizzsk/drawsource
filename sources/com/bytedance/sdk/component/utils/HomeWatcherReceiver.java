package com.bytedance.sdk.component.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

public class HomeWatcherReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private C2887a f6501a;

    /* renamed from: com.bytedance.sdk.component.utils.HomeWatcherReceiver$a */
    public interface C2887a {
        /* renamed from: a */
        void mo17806a();

        /* renamed from: b */
        void mo17807b();
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            Log.i("HomeReceiver", "onReceive: action: " + action);
            if ("android.intent.action.CLOSE_SYSTEM_DIALOGS".equals(action)) {
                String stringExtra = intent.getStringExtra(IronSourceConstants.EVENTS_ERROR_REASON);
                Log.i("HomeReceiver", "reason: " + stringExtra);
                if ("homekey".equals(stringExtra)) {
                    Log.i("HomeReceiver", "homekey");
                    C2887a aVar = this.f6501a;
                    if (aVar != null) {
                        aVar.mo17806a();
                    }
                } else if ("recentapps".equals(stringExtra)) {
                    Log.i("HomeReceiver", "long press home key or activity switch");
                    C2887a aVar2 = this.f6501a;
                    if (aVar2 != null) {
                        aVar2.mo17807b();
                    }
                } else if ("assist".equals(stringExtra)) {
                    Log.i("HomeReceiver", "assist");
                }
            }
        }
    }

    /* renamed from: a */
    public void mo17804a(C2887a aVar) {
        this.f6501a = aVar;
    }
}
