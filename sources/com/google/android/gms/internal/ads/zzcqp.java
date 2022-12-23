package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzcqp implements zzfbe {
    private final zzcop zza;
    private Context zzb;
    private String zzc;

    /* synthetic */ zzcqp(zzcop zzcop, zzcqo zzcqo) {
        this.zza = zzcop;
    }

    public final /* synthetic */ zzfbe zza(String str) {
        this.zzc = str;
        return this;
    }

    public final /* synthetic */ zzfbe zzb(Context context) {
        if (context != null) {
            this.zzb = context;
            return this;
        }
        throw null;
    }

    public final zzfbf zzc() {
        zzgrc.zzc(this.zzb, Context.class);
        return new zzcqr(this.zza, this.zzb, this.zzc, (zzcqq) null);
    }
}
