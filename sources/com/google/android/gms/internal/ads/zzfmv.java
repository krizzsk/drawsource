package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfmv {
    final /* synthetic */ zzfmw zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    /* synthetic */ zzfmv(zzfmw zzfmw, byte[] bArr, zzfmu zzfmu) {
        this.zza = zzfmw;
        this.zzb = bArr;
    }

    public final zzfmv zza(int i) {
        this.zzd = i;
        return this;
    }

    public final zzfmv zzb(int i) {
        this.zzc = i;
        return this;
    }

    public final synchronized void zzc() {
        try {
            zzfmw zzfmw = this.zza;
            if (zzfmw.zzb) {
                zzfmw.zza.zzj(this.zzb);
                this.zza.zza.zzi(this.zzc);
                this.zza.zza.zzg(this.zzd);
                this.zza.zza.zzh((int[]) null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e) {
            Log.d("GASS", "Clearcut log failed", e);
        }
    }
}
