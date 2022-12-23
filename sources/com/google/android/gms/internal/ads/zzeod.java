package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzeod implements zzetg {
    private final Set zza;

    zzeod(Set set) {
        this.zza = set;
    }

    public final int zza() {
        return 8;
    }

    public final zzfvl zzb() {
        ArrayList arrayList = new ArrayList();
        for (String add : this.zza) {
            arrayList.add(add);
        }
        return zzfvc.zzi(new zzeoc(arrayList));
    }
}
