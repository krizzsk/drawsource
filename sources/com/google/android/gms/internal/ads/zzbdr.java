package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public final class zzbdr {
    final /* synthetic */ zzbds zza;
    private final byte[] zzb;
    private int zzc;

    /* synthetic */ zzbdr(zzbds zzbds, byte[] bArr, zzbdq zzbdq) {
        this.zza = zzbds;
        this.zzb = bArr;
    }

    /* access modifiers changed from: private */
    public final synchronized void zzd() {
        try {
            zzbds zzbds = this.zza;
            if (zzbds.zzb) {
                zzbds.zza.zzj(this.zzb);
                this.zza.zza.zzi(0);
                this.zza.zza.zzg(this.zzc);
                this.zza.zza.zzh((int[]) null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e) {
            zzcfi.zzf("Clearcut log failed", e);
        }
    }

    public final zzbdr zza(int i) {
        this.zzc = i;
        return this;
    }

    public final synchronized void zzc() {
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzis)).booleanValue()) {
            this.zza.zzc.execute(new zzbdp(this));
        } else {
            zzd();
        }
    }
}
