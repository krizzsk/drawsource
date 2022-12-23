package com.google.android.gms.internal.ads;

import androidx.collection.ArrayMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdpd implements zzdcn {
    private final zzdnh zza;
    private final zzdnm zzb;

    public zzdpd(zzdnh zzdnh, zzdnm zzdnm) {
        this.zza = zzdnh;
        this.zzb = zzdnm;
    }

    public final void zzl() {
        zzdnh zzdnh = this.zza;
        if (zzdnh.zzu() != null) {
            zzcli zzq = zzdnh.zzq();
            zzcli zzr = zzdnh.zzr();
            if (zzq == null) {
                zzq = zzr == null ? null : zzr;
            }
            if (this.zzb.zzd() && zzq != null) {
                zzq.zzd("onSdkImpression", new ArrayMap());
            }
        }
    }
}
