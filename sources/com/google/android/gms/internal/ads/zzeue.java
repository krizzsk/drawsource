package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzeue implements zzetg {
    private final Context zza;
    private final String zzb;
    private final zzfvm zzc;

    public zzeue(zzbzx zzbzx, Context context, String str, zzfvm zzfvm) {
        this.zza = context;
        this.zzb = str;
        this.zzc = zzfvm;
    }

    public final int zza() {
        return 42;
    }

    public final zzfvl zzb() {
        return this.zzc.zzb(new zzeud(this));
    }
}
