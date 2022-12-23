package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzay;
import com.google.android.gms.ads.internal.util.zzaz;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzeax extends zzbzq {
    final /* synthetic */ zzeay zza;

    protected zzeax(zzeay zzeay) {
        this.zza = zzeay;
    }

    public final void zze(zzaz zzaz) {
        this.zza.zza.zze(new zzay(zzaz.zza, zzaz.zzb));
    }

    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zza.zzd(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}
