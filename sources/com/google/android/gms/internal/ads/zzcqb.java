package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzcqb implements zzdxp {
    private final zzcop zza;
    private Context zzb;
    private zzbph zzc;

    /* synthetic */ zzcqb(zzcop zzcop, zzcqa zzcqa) {
        this.zza = zzcop;
    }

    public final /* synthetic */ zzdxp zza(zzbph zzbph) {
        if (zzbph != null) {
            this.zzc = zzbph;
            return this;
        }
        throw null;
    }

    public final /* synthetic */ zzdxp zzb(Context context) {
        if (context != null) {
            this.zzb = context;
            return this;
        }
        throw null;
    }

    public final zzdxq zzc() {
        zzgrc.zzc(this.zzb, Context.class);
        zzgrc.zzc(this.zzc, zzbph.class);
        return new zzcqd(this.zza, this.zzb, this.zzc, (zzcqc) null);
    }
}
