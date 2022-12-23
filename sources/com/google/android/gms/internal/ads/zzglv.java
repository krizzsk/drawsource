package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzglv {
    zzglv() {
    }

    public static final int zza(int i, Object obj, Object obj2) {
        zzglu zzglu = (zzglu) obj;
        zzglt zzglt = (zzglt) obj2;
        if (zzglu.isEmpty()) {
            return 0;
        }
        Iterator it = zzglu.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final boolean zzb(Object obj) {
        return !((zzglu) obj).zze();
    }

    public static final Object zzc(Object obj, Object obj2) {
        zzglu zzglu = (zzglu) obj;
        zzglu zzglu2 = (zzglu) obj2;
        if (!zzglu2.isEmpty()) {
            if (!zzglu.zze()) {
                zzglu = zzglu.zzb();
            }
            zzglu.zzd(zzglu2);
        }
        return zzglu;
    }
}
