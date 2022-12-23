package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzxp {
    private final Handler zza;
    private final zzxq zzb;

    public zzxp(Handler handler, zzxq zzxq) {
        this.zza = zzxq == null ? null : handler;
        this.zzb = zzxq;
    }

    public final void zza(String str, long j, long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzxl(this, str, j, j2));
        }
    }

    public final void zzb(String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzxo(this, str));
        }
    }

    public final void zzc(zzgl zzgl) {
        zzgl.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzxk(this, zzgl));
        }
    }

    public final void zzd(int i, long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzxf(this, i, j));
        }
    }

    public final void zze(zzgl zzgl) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzxj(this, zzgl));
        }
    }

    public final void zzf(zzad zzad, zzgm zzgm) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzxm(this, zzad, zzgm));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(String str, long j, long j2) {
        zzxq zzxq = this.zzb;
        int i = zzeg.zza;
        zzxq.zzp(str, j, j2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(String str) {
        zzxq zzxq = this.zzb;
        int i = zzeg.zza;
        zzxq.zzq(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(zzgl zzgl) {
        zzgl.zza();
        zzxq zzxq = this.zzb;
        int i = zzeg.zza;
        zzxq.zzr(zzgl);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(int i, long j) {
        zzxq zzxq = this.zzb;
        int i2 = zzeg.zza;
        zzxq.zzl(i, j);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzk(zzgl zzgl) {
        zzxq zzxq = this.zzb;
        int i = zzeg.zza;
        zzxq.zzs(zzgl);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzl(zzad zzad, zzgm zzgm) {
        int i = zzeg.zza;
        this.zzb.zzu(zzad, zzgm);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(Object obj, long j) {
        zzxq zzxq = this.zzb;
        int i = zzeg.zza;
        zzxq.zzm(obj, j);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(long j, int i) {
        zzxq zzxq = this.zzb;
        int i2 = zzeg.zza;
        zzxq.zzt(j, i);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(Exception exc) {
        zzxq zzxq = this.zzb;
        int i = zzeg.zza;
        zzxq.zzo(exc);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(zzcv zzcv) {
        zzxq zzxq = this.zzb;
        int i = zzeg.zza;
        zzxq.zzv(zzcv);
    }

    public final void zzq(Object obj) {
        if (this.zza != null) {
            this.zza.post(new zzxg(this, obj, SystemClock.elapsedRealtime()));
        }
    }

    public final void zzr(long j, int i) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzxi(this, j, i));
        }
    }

    public final void zzs(Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzxh(this, exc));
        }
    }

    public final void zzt(zzcv zzcv) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzxn(this, zzcv));
        }
    }
}
