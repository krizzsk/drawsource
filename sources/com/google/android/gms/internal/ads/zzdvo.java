package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdvo implements zzfgg {
    private final Map zza;
    private final zzbdm zzb;

    zzdvo(zzbdm zzbdm, Map map) {
        this.zza = map;
        this.zzb = zzbdm;
    }

    public final void zzbF(zzffz zzffz, String str) {
    }

    public final void zzbG(zzffz zzffz, String str, Throwable th) {
        if (this.zza.containsKey(zzffz)) {
            this.zzb.zzc(((zzdvn) this.zza.get(zzffz)).zzc);
        }
    }

    public final void zzc(zzffz zzffz, String str) {
        if (this.zza.containsKey(zzffz)) {
            this.zzb.zzc(((zzdvn) this.zza.get(zzffz)).zza);
        }
    }

    public final void zzd(zzffz zzffz, String str) {
        if (this.zza.containsKey(zzffz)) {
            this.zzb.zzc(((zzdvn) this.zza.get(zzffz)).zzb);
        }
    }
}
