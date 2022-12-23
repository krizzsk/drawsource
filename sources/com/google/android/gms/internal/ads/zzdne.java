package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdne {
    private zzbky zza;

    public zzdne(zzdmt zzdmt) {
        this.zza = zzdmt;
    }

    public final synchronized zzbky zza() {
        return this.zza;
    }

    public final synchronized void zzb(zzbky zzbky) {
        this.zza = zzbky;
    }
}
