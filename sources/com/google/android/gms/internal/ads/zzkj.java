package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzkj {
    private final zzy zza;
    private final SparseArray zzb;

    public zzkj(zzy zzy, SparseArray sparseArray) {
        this.zza = zzy;
        SparseArray sparseArray2 = new SparseArray(zzy.zzb());
        int i = 0;
        while (i < zzy.zzb()) {
            int zza2 = zzy.zza(i);
            zzki zzki = (zzki) sparseArray.get(zza2);
            if (zzki != null) {
                sparseArray2.append(zza2, zzki);
                i++;
            } else {
                throw null;
            }
        }
        this.zzb = sparseArray2;
    }

    public final int zza(int i) {
        return this.zza.zza(i);
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final zzki zzc(int i) {
        zzki zzki = (zzki) this.zzb.get(i);
        if (zzki != null) {
            return zzki;
        }
        throw null;
    }

    public final boolean zzd(int i) {
        return this.zza.zzc(i);
    }
}
