package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzasp {
    private final Handler zza;
    /* access modifiers changed from: private */
    public final zzasq zzb;

    public zzasp(Handler handler, zzasq zzasq) {
        if (handler != null) {
            this.zza = handler;
            this.zzb = zzasq;
            return;
        }
        throw null;
    }

    public final void zzb(int i) {
        this.zza.post(new zzaso(this, i));
    }

    public final void zzc(int i, long j, long j2) {
        this.zza.post(new zzasm(this, i, j, j2));
    }

    public final void zzd(String str, long j, long j2) {
        this.zza.post(new zzask(this, str, j, j2));
    }

    public final void zze(zzatn zzatn) {
        this.zza.post(new zzasn(this, zzatn));
    }

    public final void zzf(zzatn zzatn) {
        this.zza.post(new zzasj(this, zzatn));
    }

    public final void zzg(zzart zzart) {
        this.zza.post(new zzasl(this, zzart));
    }
}
