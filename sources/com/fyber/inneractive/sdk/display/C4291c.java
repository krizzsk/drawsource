package com.fyber.inneractive.sdk.display;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.display.c */
public class C4291c extends C4289a {
    /* renamed from: a */
    public void mo24290a(Activity activity, InneractiveAdSpot inneractiveAdSpot, String str) {
        Intent intent = new Intent(activity, InneractiveFullscreenAdActivity.class);
        intent.putExtra("spotId", inneractiveAdSpot.getLocalUniqueId());
        try {
            IAlog.m16446a("%sIAInterstitialUtil: Opening interstitial for spot id: %s", IAlog.m16443a((Object) activity), inneractiveAdSpot.getLocalUniqueId());
            activity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            IAlog.m16448c("%sIAInterstitialUtil: InneractiveFullscreenAdActivity.class not found. Did you declare InneractiveFullscreenAdActivity in your manifest?", IAlog.m16443a((Object) activity));
        }
    }
}
