package com.unity3d.player;

import android.util.Log;
import com.adcolony.sdk.AdColonyAppOptions;

/* renamed from: com.unity3d.player.d */
final class C11756d {

    /* renamed from: a */
    protected static boolean f28431a = false;

    protected static void Log(int i, String str) {
        if (!f28431a) {
            if (i == 6) {
                Log.e(AdColonyAppOptions.UNITY, str);
            }
            if (i == 5) {
                Log.w(AdColonyAppOptions.UNITY, str);
            }
        }
    }
}
