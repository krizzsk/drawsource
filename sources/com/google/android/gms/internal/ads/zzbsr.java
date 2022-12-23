package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbsr {
    private final Object zza = new Object();
    private final Object zzb = new Object();
    private zzbta zzc;
    private zzbta zzd;

    private static final Context zzc(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final zzbta zza(Context context, zzcfo zzcfo, zzfhu zzfhu) {
        zzbta zzbta;
        synchronized (this.zza) {
            if (this.zzc == null) {
                this.zzc = new zzbta(zzc(context), zzcfo, (String) zzay.zzc().zzb(zzbhz.zza), zzfhu);
            }
            zzbta = this.zzc;
        }
        return zzbta;
    }

    public final zzbta zzb(Context context, zzcfo zzcfo, zzfhu zzfhu) {
        zzbta zzbta;
        synchronized (this.zzb) {
            if (this.zzd == null) {
                this.zzd = new zzbta(zzc(context), zzcfo, (String) zzbjy.zzb.zze(), zzfhu);
            }
            zzbta = this.zzd;
        }
        return zzbta;
    }
}
