package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgrf implements zzgqu {
    private static final zzgqu zza = zzgqv.zza(Collections.emptySet());
    private final List zzb;
    private final List zzc;

    /* synthetic */ zzgrf(List list, List list2, zzgrd zzgrd) {
        this.zzb = list;
        this.zzc = list2;
    }

    public static zzgre zza(int i, int i2) {
        return new zzgre(i, i2, (zzgrd) null);
    }

    /* renamed from: zzc */
    public final Set zzb() {
        int size = this.zzb.size();
        ArrayList arrayList = new ArrayList(this.zzc.size());
        int size2 = this.zzc.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((zzgrh) this.zzc.get(i)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet zza2 = zzgqr.zza(size);
        int size3 = this.zzb.size();
        int i2 = 0;
        while (i2 < size3) {
            Object zzb2 = ((zzgrh) this.zzb.get(i2)).zzb();
            if (zzb2 != null) {
                zza2.add(zzb2);
                i2++;
            } else {
                throw null;
            }
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object next : (Collection) arrayList.get(i3)) {
                if (next != null) {
                    zza2.add(next);
                } else {
                    throw null;
                }
            }
        }
        return Collections.unmodifiableSet(zza2);
    }
}
