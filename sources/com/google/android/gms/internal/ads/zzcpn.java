package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzcpn implements zzexx {
    private final zzcop zza;
    private Context zzb;
    private String zzc;
    private zzq zzd;

    /* synthetic */ zzcpn(zzcop zzcop, zzcpm zzcpm) {
        this.zza = zzcop;
    }

    public final /* synthetic */ zzexx zza(zzq zzq) {
        if (zzq != null) {
            this.zzd = zzq;
            return this;
        }
        throw null;
    }

    public final /* synthetic */ zzexx zzb(String str) {
        if (str != null) {
            this.zzc = str;
            return this;
        }
        throw null;
    }

    public final /* synthetic */ zzexx zzc(Context context) {
        if (context != null) {
            this.zzb = context;
            return this;
        }
        throw null;
    }

    public final zzexy zzd() {
        zzgrc.zzc(this.zzb, Context.class);
        zzgrc.zzc(this.zzc, String.class);
        zzgrc.zzc(this.zzd, zzq.class);
        return new zzcpp(this.zza, this.zzb, this.zzc, this.zzd, (zzcpo) null);
    }
}
