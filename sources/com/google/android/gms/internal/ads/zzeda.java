package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzeda implements zzdim {
    private boolean zza = false;
    private boolean zzb = false;
    private final String zzc;
    private final zzfgp zzd;
    private final zzg zze;

    public zzeda(String str, zzfgp zzfgp) {
        this.zzc = str;
        this.zzd = zzfgp;
        this.zze = zzt.zzo().zzh();
    }

    private final zzfgo zzg(String str) {
        String str2;
        if (this.zze.zzP()) {
            str2 = "";
        } else {
            str2 = this.zzc;
        }
        zzfgo zzb2 = zzfgo.zzb(str);
        zzb2.zza("tms", Long.toString(zzt.zzA().elapsedRealtime(), 10));
        zzb2.zza("tid", str2);
        return zzb2;
    }

    public final void zza(String str) {
        zzfgp zzfgp = this.zzd;
        zzfgo zzg = zzg("aaia");
        zzg.zza("aair", "MalformedJson");
        zzfgp.zzb(zzg);
    }

    public final void zzb(String str, String str2) {
        zzfgp zzfgp = this.zzd;
        zzfgo zzg = zzg("adapter_init_finished");
        zzg.zza("ancn", str);
        zzg.zza("rqe", str2);
        zzfgp.zzb(zzg);
    }

    public final void zzc(String str) {
        zzfgp zzfgp = this.zzd;
        zzfgo zzg = zzg("adapter_init_started");
        zzg.zza("ancn", str);
        zzfgp.zzb(zzg);
    }

    public final void zzd(String str) {
        zzfgp zzfgp = this.zzd;
        zzfgo zzg = zzg("adapter_init_finished");
        zzg.zza("ancn", str);
        zzfgp.zzb(zzg);
    }

    public final synchronized void zze() {
        if (!this.zzb) {
            this.zzd.zzb(zzg("init_finished"));
            this.zzb = true;
        }
    }

    public final synchronized void zzf() {
        if (!this.zza) {
            this.zzd.zzb(zzg("init_started"));
            this.zza = true;
        }
    }
}
