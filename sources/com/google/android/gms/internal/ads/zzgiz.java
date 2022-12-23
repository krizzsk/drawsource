package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzgiz implements Comparator {
    zzgiz() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzgji zzgji = (zzgji) obj;
        zzgji zzgji2 = (zzgji) obj2;
        zzgjc zzs = zzgji.iterator();
        zzgjc zzs2 = zzgji2.iterator();
        while (zzs.hasNext() && zzs2.hasNext()) {
            int compareTo = Integer.valueOf(zzs.zza() & 255).compareTo(Integer.valueOf(zzs2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzgji.zzd()).compareTo(Integer.valueOf(zzgji2.zzd()));
    }
}
