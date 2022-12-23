package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzawu implements zzaxl {
    final /* synthetic */ zzawv zza;
    /* access modifiers changed from: private */
    public final int zzb;

    public zzawu(zzawv zzawv, int i) {
        this.zza = zzawv;
        this.zzb = i;
    }

    public final int zzb(zzaru zzaru, zzato zzato, boolean z) {
        return this.zza.zze(this.zzb, zzaru, zzato, z);
    }

    public final void zzc() throws IOException {
        this.zza.zzr();
    }

    public final void zzd(long j) {
        this.zza.zzy(this.zzb, j);
    }

    public final boolean zze() {
        return this.zza.zzA(this.zzb);
    }
}
