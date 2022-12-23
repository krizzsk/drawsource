package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdjw extends zzdhc {
    private boolean zzb;

    protected zzdjw(Set set) {
        super(set);
    }

    public final void zza() {
        zzo(zzdjs.zza);
    }

    public final void zzb() {
        zzo(zzdju.zza);
    }

    public final synchronized void zzc() {
        if (!this.zzb) {
            zzo(zzdjt.zza);
            this.zzb = true;
        }
        zzo(zzdjv.zza);
    }

    public final synchronized void zzd() {
        zzo(zzdjt.zza);
        this.zzb = true;
    }
}
