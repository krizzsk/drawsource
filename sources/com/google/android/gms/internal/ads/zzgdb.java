package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgdb extends zzgkm implements zzgmb {
    private zzgdb() {
        super(zzgdc.zzb);
    }

    public final zzgdb zza(zzgji zzgji) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        ((zzgdc) this.zza).zzf = zzgji;
        return this;
    }

    public final zzgdb zzb(int i) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        ((zzgdc) this.zza).zze = 0;
        return this;
    }

    /* synthetic */ zzgdb(zzgda zzgda) {
        super(zzgdc.zzb);
    }
}
