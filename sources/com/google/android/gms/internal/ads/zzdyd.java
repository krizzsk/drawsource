package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzdyd implements Runnable {
    public final /* synthetic */ zzdyj zza;
    public final /* synthetic */ zzbqn zzb;

    public /* synthetic */ zzdyd(zzdyj zzdyj, zzbqn zzbqn) {
        this.zza = zzdyj;
        this.zzb = zzbqn;
    }

    public final void run() {
        zzdyj zzdyj = this.zza;
        try {
            this.zzb.zzb(zzdyj.zzg());
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
        }
    }
}
