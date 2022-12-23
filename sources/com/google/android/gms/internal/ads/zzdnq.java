package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdnq {
    zzbmc zza;
    zzblz zzb;
    zzbmp zzc;
    zzbmm zzd;
    zzbrb zze;
    final SimpleArrayMap zzf = new SimpleArrayMap();
    final SimpleArrayMap zzg = new SimpleArrayMap();

    public final zzdnq zza(zzblz zzblz) {
        this.zzb = zzblz;
        return this;
    }

    public final zzdnq zzb(zzbmc zzbmc) {
        this.zza = zzbmc;
        return this;
    }

    public final zzdnq zzc(String str, zzbmi zzbmi, zzbmf zzbmf) {
        this.zzf.put(str, zzbmi);
        if (zzbmf != null) {
            this.zzg.put(str, zzbmf);
        }
        return this;
    }

    public final zzdnq zzd(zzbrb zzbrb) {
        this.zze = zzbrb;
        return this;
    }

    public final zzdnq zze(zzbmm zzbmm) {
        this.zzd = zzbmm;
        return this;
    }

    public final zzdnq zzf(zzbmp zzbmp) {
        this.zzc = zzbmp;
        return this;
    }

    public final zzdns zzg() {
        return new zzdns(this);
    }
}
