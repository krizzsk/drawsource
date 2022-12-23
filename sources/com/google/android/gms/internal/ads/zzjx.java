package com.google.android.gms.internal.ads;

import android.content.Context;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzjx {
    private final zzhd zza;

    @Deprecated
    public zzjx(Context context, zzckr zzckr, byte[] bArr) {
        this.zza = new zzhd(context, zzckr, (byte[]) null);
    }

    @Deprecated
    public final zzjx zza(zzja zzja) {
        zzhd zzhd = this.zza;
        zzcw.zzf(!zzhd.zzl);
        zzhd.zzf = new zzgv(zzja);
        return this;
    }

    @Deprecated
    public final zzjx zzb(zzvm zzvm) {
        zzhd zzhd = this.zza;
        zzcw.zzf(!zzhd.zzl);
        zzhd.zze = new zzgw(zzvm);
        return this;
    }

    @Deprecated
    public final zzjy zzc() {
        zzhd zzhd = this.zza;
        zzcw.zzf(!zzhd.zzl);
        zzhd.zzl = true;
        return new zzjy(zzhd);
    }
}
