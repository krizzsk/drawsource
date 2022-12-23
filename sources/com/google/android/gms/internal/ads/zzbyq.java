package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
final class zzbyq extends zzbyj {
    final /* synthetic */ List zza;

    zzbyq(zzbys zzbys, List list) {
        this.zza = list;
    }

    public final void zze(String str) {
        zzcfi.zzg("Error recording click: ".concat(String.valueOf(str)));
    }

    public final void zzf(List list) {
        zzcfi.zzi("Recorded click: ".concat(this.zza.toString()));
    }
}
