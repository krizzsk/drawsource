package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzuk implements Comparator {
    public static final /* synthetic */ zzuk zza = new zzuk();

    private /* synthetic */ zzuk() {
    }

    public final int compare(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        return zzfqy.zzj().zzc((zzvd) Collections.max(list, zzvb.zza), (zzvd) Collections.max(list2, zzvb.zza), zzvb.zza).zzb(list.size(), list2.size()).zzc((zzvd) Collections.max(list, zzvc.zza), (zzvd) Collections.max(list2, zzvc.zza), zzvc.zza).zza();
    }
}
