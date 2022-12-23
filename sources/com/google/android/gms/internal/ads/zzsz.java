package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzsz implements zztq {
    final /* synthetic */ zztc zza;
    /* access modifiers changed from: private */
    public final int zzb;

    public zzsz(zztc zztc, int i) {
        this.zza = zztc;
        this.zzb = i;
    }

    public final int zza(zziz zziz, zzgb zzgb, int i) {
        return this.zza.zzg(this.zzb, zziz, zzgb, i);
    }

    public final int zzb(long j) {
        return this.zza.zzi(this.zzb, j);
    }

    public final void zzd() throws IOException {
        this.zza.zzF(this.zzb);
    }

    public final boolean zze() {
        return this.zza.zzM(this.zzb);
    }
}
