package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzcql implements zzezq {
    private final zzcop zza;
    private Context zzb;
    private String zzc;
    private zzq zzd;

    /* synthetic */ zzcql(zzcop zzcop, zzcqk zzcqk) {
        this.zza = zzcop;
    }

    public final /* synthetic */ zzezq zza(zzq zzq) {
        if (zzq != null) {
            this.zzd = zzq;
            return this;
        }
        throw null;
    }

    public final /* synthetic */ zzezq zzb(String str) {
        if (str != null) {
            this.zzc = str;
            return this;
        }
        throw null;
    }

    public final /* synthetic */ zzezq zzc(Context context) {
        if (context != null) {
            this.zzb = context;
            return this;
        }
        throw null;
    }

    public final zzezr zzd() {
        zzgrc.zzc(this.zzb, Context.class);
        zzgrc.zzc(this.zzc, String.class);
        zzgrc.zzc(this.zzd, zzq.class);
        return new zzcqn(this.zza, this.zzb, this.zzc, this.zzd, (zzcqm) null);
    }
}
