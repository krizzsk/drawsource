package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzeir {
    private final zzfcs zza;
    private final zzdtz zzb;
    private final zzdwh zzc;
    private final zzfgp zzd;

    public zzeir(zzfcs zzfcs, zzdtz zzdtz, zzdwh zzdwh, zzfgp zzfgp) {
        this.zza = zzfcs;
        this.zzb = zzdtz;
        this.zzc = zzdwh;
        this.zzd = zzfgp;
    }

    public final void zza(zzfbo zzfbo, zzfbl zzfbl, int i, @Nullable zzefh zzefh, long j) {
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzhj)).booleanValue()) {
            zzfgo zzb2 = zzfgo.zzb("adapter_status");
            zzb2.zzg(zzfbo);
            zzb2.zzf(zzfbl);
            zzb2.zza("adapter_l", String.valueOf(j));
            zzb2.zza("sc", Integer.toString(i));
            if (zzefh != null) {
                zzb2.zza("arec", Integer.toString(zzefh.zzb().zza));
                String zza2 = this.zza.zza(zzefh.getMessage());
                if (zza2 != null) {
                    zzb2.zza("areec", zza2);
                }
            }
            zzdty zzb3 = this.zzb.zzb(zzfbl.zzu);
            if (zzb3 != null) {
                zzb2.zza("ancn", zzb3.zza);
                zzbwg zzbwg = zzb3.zzb;
                if (zzbwg != null) {
                    zzb2.zza("adapter_v", zzbwg.toString());
                }
                zzbwg zzbwg2 = zzb3.zzc;
                if (zzbwg2 != null) {
                    zzb2.zza("adapter_sv", zzbwg2.toString());
                }
            }
            this.zzd.zzb(zzb2);
            return;
        }
        zzdwg zza3 = this.zzc.zza();
        zza3.zze(zzfbo);
        zza3.zzd(zzfbl);
        zza3.zzb("action", "adapter_status");
        zza3.zzb("adapter_l", String.valueOf(j));
        zza3.zzb("sc", Integer.toString(i));
        if (zzefh != null) {
            zza3.zzb("arec", Integer.toString(zzefh.zzb().zza));
            String zza4 = this.zza.zza(zzefh.getMessage());
            if (zza4 != null) {
                zza3.zzb("areec", zza4);
            }
        }
        zzdty zzb4 = this.zzb.zzb(zzfbl.zzu);
        if (zzb4 != null) {
            zza3.zzb("ancn", zzb4.zza);
            zzbwg zzbwg3 = zzb4.zzb;
            if (zzbwg3 != null) {
                zza3.zzb("adapter_v", zzbwg3.toString());
            }
            zzbwg zzbwg4 = zzb4.zzc;
            if (zzbwg4 != null) {
                zza3.zzb("adapter_sv", zzbwg4.toString());
            }
        }
        zza3.zzg();
    }
}
