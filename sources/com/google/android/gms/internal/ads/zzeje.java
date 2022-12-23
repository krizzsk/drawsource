package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public class zzeje extends zzekf {
    private final zzdjp zza;

    public zzeje(zzdbr zzdbr, zzdje zzdje, zzdcl zzdcl, zzdda zzdda, zzddf zzddf, zzdcg zzdcg, zzdgm zzdgm, zzdjw zzdjw, zzddz zzddz, zzdjp zzdjp, zzdgi zzdgi) {
        super(zzdbr, zzdje, zzdcl, zzdda, zzddf, zzdgm, zzddz, zzdjw, zzdgi, zzdcg);
        this.zza = zzdjp;
    }

    public final void zzs(zzcax zzcax) {
        this.zza.zza(zzcax);
    }

    public final void zzt(zzcbb zzcbb) throws RemoteException {
        this.zza.zza(new zzcax(zzcbb.zzf(), zzcbb.zze()));
    }

    public final void zzu() throws RemoteException {
        this.zza.zzb();
    }

    public final void zzv() {
        this.zza.zzb();
    }

    public final void zzy() {
        this.zza.zzc();
    }
}
