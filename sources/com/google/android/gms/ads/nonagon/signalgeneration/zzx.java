package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbyk;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzfhs;
import com.google.android.gms.internal.ads.zzfuy;
import java.util.ArrayList;
import java.util.Iterator;
import javax.annotation.Nonnull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzx implements zzfuy {
    final /* synthetic */ zzbyk zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzaa zzc;

    zzx(zzaa zzaa, zzbyk zzbyk, boolean z) {
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
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.zza.zzf(arrayList);
            if (this.zzc.zzt || this.zzb) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Uri uri = (Uri) it.next();
                    if (this.zzc.zzO(uri)) {
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
