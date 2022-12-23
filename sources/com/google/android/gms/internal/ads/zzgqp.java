package com.google.android.gms.internal.ads;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public class zzgqp {
    final LinkedHashMap zza;

    zzgqp(int i) {
        this.zza = zzgqr.zzb(i);
    }

    /* access modifiers changed from: package-private */
    public final zzgqp zza(Object obj, zzgrh zzgrh) {
        LinkedHashMap linkedHashMap = this.zza;
        zzgrc.zza(obj, SDKConstants.PARAM_KEY);
        zzgrc.zza(zzgrh, IronSourceConstants.EVENTS_PROVIDER);
        linkedHashMap.put(obj, zzgrh);
        return this;
    }
}
