package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzccs {
    private Context zza;
    private Clock zzb;
    private zzg zzc;
    private zzcdn zzd;

    private zzccs() {
    }

    /* synthetic */ zzccs(zzccr zzccr) {
    }

    public final zzccs zza(zzg zzg) {
        this.zzc = zzg;
        return this;
    }

    public final zzccs zzb(Context context) {
        if (context != null) {
            this.zza = context;
            return this;
        }
        throw null;
    }

    public final zzccs zzc(Clock clock) {
        if (clock != null) {
            this.zzb = clock;
            return this;
        }
        throw null;
    }

    public final zzccs zzd(zzcdn zzcdn) {
        this.zzd = zzcdn;
        return this;
    }

    public final zzcdo zze() {
        zzgrc.zzc(this.zza, Context.class);
        zzgrc.zzc(this.zzb, Clock.class);
        zzgrc.zzc(this.zzc, zzg.class);
        zzgrc.zzc(this.zzd, zzcdn.class);
        return new zzccu(this.zza, this.zzb, this.zzc, this.zzd, (zzcct) null);
    }
}
