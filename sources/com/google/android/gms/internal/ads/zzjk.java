package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzjk implements zzjg {
    public final zzrv zza;
    public final Object zzb = new Object();
    public final List zzc = new ArrayList();
    public int zzd;
    public boolean zze;

    public zzjk(zzsc zzsc, boolean z) {
        this.zza = new zzrv(zzsc, z);
    }

    public final zzci zza() {
        return this.zza.zzA();
    }

    public final Object zzb() {
        return this.zzb;
    }

    public final void zzc(int i) {
        this.zzd = i;
        this.zze = false;
        this.zzc.clear();
    }
}
