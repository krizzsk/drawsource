package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbyk;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzfhs;
import com.google.android.gms.internal.ads.zzfuy;
import java.util.List;
import javax.annotation.Nonnull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzy implements zzfuy {
    final /* synthetic */ zzbyk zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzaa zzc;

    zzy(zzaa zzaa, zzbyk zzbyk, boolean z) {
        this.zzc = zzaa;
        this.zza = zzbyk;
        this.zzb = z;
    }

    public final void zza(Throwable th) {
        try {
            zzbyk zzbyk = this.zza;
            String message = th.getMessage();
            zzbyk.zze("Internal error: " + message);
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(@Nonnull Object obj) {
        List<Uri> list = (List) obj;
        try {
            zzaa.zzF(this.zzc, list);
            this.zza.zzf(list);
            if (this.zzc.zzu || this.zzb) {
                for (Uri uri : list) {
                    if (this.zzc.zzN(uri)) {
                        zzaa zzaa = this.zzc;
                        this.zzc.zzs.zzc(zzaa.zzW(uri, zzaa.zzC, "1").toString(), (zzfhs) null);
                    } else {
                        if (((Boolean) zzay.zzc().zzb(zzbhz.zzgu)).booleanValue()) {
                            this.zzc.zzs.zzc(uri.toString(), (zzfhs) null);
                        }
                    }
                }
            }
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
        }
    }
}
