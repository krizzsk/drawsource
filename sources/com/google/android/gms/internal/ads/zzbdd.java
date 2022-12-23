package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zze;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzbdd implements Runnable {
    public final /* synthetic */ zzbdg zza;
    public final /* synthetic */ zzbcx zzb;
    public final /* synthetic */ zzbcy zzc;
    public final /* synthetic */ zzcga zzd;

    public /* synthetic */ zzbdd(zzbdg zzbdg, zzbcx zzbcx, zzbcy zzbcy, zzcga zzcga) {
        this.zza = zzbdg;
        this.zzb = zzbcx;
        this.zzc = zzbcy;
        this.zzd = zzcga;
    }

    public final void run() {
        zzbcv zzbcv;
        zzbdg zzbdg = this.zza;
        zzbcx zzbcx = this.zzb;
        zzbcy zzbcy = this.zzc;
        zzcga zzcga = this.zzd;
        try {
            zzbda zzq = zzbcx.zzq();
            if (zzbcx.zzp()) {
                zzbcv = zzq.zzg(zzbcy);
            } else {
                zzbcv = zzq.zzf(zzbcy);
            }
            if (!zzbcv.zze()) {
                zzcga.zze(new RuntimeException("No entry contents."));
                zzbdi.zze(zzbdg.zzc);
                return;
            }
            zzbdf zzbdf = new zzbdf(zzbdg, zzbcv.zzc(), 1);
            int read = zzbdf.read();
            if (read != -1) {
                zzbdf.unread(read);
                zzcga.zzd(zzbdk.zzb(zzbdf, zzbcv.zzd(), zzbcv.zzg(), zzbcv.zza(), zzbcv.zzf()));
                return;
            }
            throw new IOException("Unable to read from cache.");
        } catch (RemoteException | IOException e) {
            zze.zzh("Unable to obtain a cache service instance.", e);
            zzcga.zze(e);
            zzbdi.zze(zzbdg.zzc);
        }
    }
}
