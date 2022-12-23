package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zznj {
    private final Handler zza;
    private final zznk zzb;

    public zznj(Handler handler, zznk zznk) {
        this.zza = zznk == null ? null : handler;
        this.zzb = zznk;
    }

    public final void zza(Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzmz(this, exc));
        }
    }

    public final void zzb(Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zznf(this, exc));
        }
    }

    public final void zzc(String str, long j, long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzne(this, str, j, j2));
        }
    }

    public final void zzd(String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzng(this, str));
        }
    }

    public final void zze(zzgl zzgl) {
        zzgl.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzna(this, zzgl));
        }
    }

    public final void zzf(zzgl zzgl) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zznb(this, zzgl));
        }
    }

    public final void zzg(zzad zzad, zzgm zzgm) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zznh(this, zzad, zzgm));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(Exception exc) {
        zznk zznk = this.zzb;
        int i = zzeg.zza;
        zznk.zzc(exc);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(Exception exc) {
        zznk zznk = this.zzb;
        int i = zzeg.zza;
        zznk.zzj(exc);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(String str, long j, long j2) {
        zznk zznk = this.zzb;
        int i = zzeg.zza;
        zznk.zzd(str, j, j2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzk(String str) {
        zznk zznk = this.zzb;
        int i = zzeg.zza;
        zznk.zze(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzl(zzgl zzgl) {
        zzgl.zza();
        zznk zznk = this.zzb;
        int i = zzeg.zza;
        zznk.zzf(zzgl);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(zzgl zzgl) {
        zznk zznk = this.zzb;
        int i = zzeg.zza;
        zznk.zzg(zzgl);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(zzad zzad, zzgm zzgm) {
        int i = zzeg.zza;
        this.zzb.zzh(zzad, zzgm);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(long j) {
        zznk zznk = this.zzb;
        int i = zzeg.zza;
        zznk.zzi(j);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(boolean z) {
        zznk zznk = this.zzb;
        int i = zzeg.zza;
        zznk.zzn(z);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzq(int i, long j, long j2) {
        zznk zznk = this.zzb;
        int i2 = zzeg.zza;
        zznk.zzk(i, j, j2);
    }

    public final void zzr(long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zznc(this, j));
        }
    }

    public final void zzs(boolean z) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zznd(this, z));
        }
    }

    public final void zzt(int i, long j, long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzni(this, i, j, j2));
        }
    }
}
