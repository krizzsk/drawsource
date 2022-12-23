package com.google.android.gms.internal.ads;

import android.os.Build;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzch;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzevx implements Callable {
    public static final /* synthetic */ zzevx zza = new zzevx();

    private /* synthetic */ zzevx() {
    }

    public final Object call() {
        HashMap hashMap = new HashMap();
        String str = (String) zzay.zzc().zzb(zzbhz.zzI);
        if (str != null && !str.isEmpty()) {
            if (Build.VERSION.SDK_INT >= ((Integer) zzay.zzc().zzb(zzbhz.zzJ)).intValue()) {
                for (String str2 : str.split(",", -1)) {
                    hashMap.put(str2, zzch.zza(str2));
                }
            }
        }
        return new zzevz(hashMap);
    }
}
