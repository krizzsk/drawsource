package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfch {
    public static zzq zza(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfbm zzfbm = (zzfbm) it.next();
            if (zzfbm.zzc) {
                arrayList.add(AdSize.FLUID);
            } else {
                arrayList.add(new AdSize(zzfbm.zza, zzfbm.zzb));
            }
        }
        return new zzq(context, (AdSize[]) arrayList.toArray(new AdSize[arrayList.size()]));
    }

    public static zzfbm zzb(List list, zzfbm zzfbm) {
        return (zzfbm) list.get(0);
    }

    public static zzfbm zzc(zzq zzq) {
        return zzq.zzi ? new zzfbm(-3, 0, true) : new zzfbm(zzq.zze, zzq.zzb, false);
    }
}
