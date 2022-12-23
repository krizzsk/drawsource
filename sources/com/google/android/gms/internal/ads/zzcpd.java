package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzcpd implements zzewj {
    private final zzcop zza;
    private Context zzb;
    private String zzc;

    /* synthetic */ zzcpd(zzcop zzcop, zzcpc zzcpc) {
        this.zza = zzcop;
    }

    public final /* synthetic */ zzewj zza(String str) {
        if (str != null) {
            this.zzc = str;
            return this;
        }
        throw null;
    }

    public final /* synthetic */ zzewj zzb(Context context) {
        if (context != null) {
            this.zzb = context;
            return this;
        }
        throw null;
    }

    public final zzewk zzc() {
        zzgrc.zzc(this.zzb, Context.class);
        zzgrc.zzc(this.zzc, String.class);
        return new zzcpf(this.zza, this.zzb, this.zzc, (zzcpe) null);
    }
}
