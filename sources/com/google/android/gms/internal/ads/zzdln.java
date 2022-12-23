package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzdln implements zzcya {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zzgrh zzd;
    private final zzdns zze;

    zzdln(Map map, Map map2, Map map3, zzgrh zzgrh, zzdns zzdns) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzgrh;
        this.zze = zzdns;
    }

    public final zzefd zza(int i, String str) {
        zzefd zza2;
        zzefd zzefd = (zzefd) this.zza.get(str);
        if (zzefd != null) {
            return zzefd;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            zzehr zzehr = (zzehr) this.zzc.get(str);
            if (zzehr != null) {
                return new zzefe(zzehr, zzcyc.zza);
            }
            zzefd zzefd2 = (zzefd) this.zzb.get(str);
            if (zzefd2 == null) {
                return null;
            }
            return zzcye.zza(zzefd2);
        } else if (this.zze.zze() == null || (zza2 = ((zzcya) this.zzd.zzb()).zza(i, str)) == null) {
            return null;
        } else {
            return zzcye.zza(zza2);
        }
    }
}
