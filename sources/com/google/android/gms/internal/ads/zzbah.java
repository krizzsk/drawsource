package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbah {
    private final Handler zza;
    /* access modifiers changed from: private */
    public final zzbai zzb;

    public zzbah(Handler handler, zzbai zzbai) {
        if (handler != null) {
            this.zza = handler;
            this.zzb = zzbai;
            return;
        }
        throw null;
    }

    public final void zzb(String str, long j, long j2) {
        this.zza.post(new zzbab(this, str, j, j2));
    }

    public final void zzc(zzatn zzatn) {
        this.zza.post(new zzbag(this, zzatn));
    }

    public final void zzd(int i, long j) {
        this.zza.post(new zzbad(this, i, j));
    }

    public final void zze(zzatn zzatn) {
        this.zza.post(new zzbaa(this, zzatn));
    }

    public final void zzf(zzart zzart) {
        this.zza.post(new zzbac(this, zzart));
    }

    public final void zzg(Surface surface) {
        this.zza.post(new zzbaf(this, surface));
    }

    public final void zzh(int i, int i2, int i3, float f) {
        this.zza.post(new zzbae(this, i, i2, i3, f));
    }
}
