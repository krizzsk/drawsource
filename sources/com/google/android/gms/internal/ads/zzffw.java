package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzffw {
    final /* synthetic */ zzffx zza;
    private final Object zzb;
    private final String zzc;
    private final zzfvl zzd;
    private final List zze;
    private final zzfvl zzf;

    private zzffw(zzffx zzffx, Object obj, String str, zzfvl zzfvl, List list, zzfvl zzfvl2) {
        this.zza = zzffx;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = zzfvl;
        this.zze = list;
        this.zzf = zzfvl2;
    }

    /* synthetic */ zzffw(zzffx zzffx, Object obj, String str, zzfvl zzfvl, List list, zzfvl zzfvl2, zzffv zzffv) {
        this(zzffx, obj, (String) null, zzfvl, list, zzfvl2);
    }

    public final zzffk zza() {
        Object obj = this.zzb;
        String str = this.zzc;
        if (str == null) {
            str = this.zza.zzf(obj);
        }
        zzffk zzffk = new zzffk(obj, str, this.zzf);
        this.zza.zzd.zza(zzffk);
        this.zzd.zzc(new zzffq(this, zzffk), zzcfv.zzf);
        zzfvc.zzr(zzffk, new zzffu(this, zzffk), zzcfv.zzf);
        return zzffk;
    }

    public final zzffw zzb(Object obj) {
        return this.zza.zzb(obj, zza());
    }

    public final zzffw zzc(Class cls, zzfuj zzfuj) {
        zzffx zzffx = this.zza;
        return new zzffw(zzffx, this.zzb, this.zzc, this.zzd, this.zze, zzfvc.zzg(this.zzf, cls, zzfuj, zzffx.zzb));
    }

    public final zzffw zzd(zzfvl zzfvl) {
        return zzg(new zzffr(zzfvl), zzcfv.zzf);
    }

    public final zzffw zze(zzffi zzffi) {
        return zzf(new zzfft(zzffi));
    }

    public final zzffw zzf(zzfuj zzfuj) {
        return zzg(zzfuj, this.zza.zzb);
    }

    public final zzffw zzg(zzfuj zzfuj, Executor executor) {
        return new zzffw(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzfvc.zzn(this.zzf, zzfuj, executor));
    }

    public final zzffw zzh(String str) {
        return new zzffw(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final zzffw zzi(long j, TimeUnit timeUnit) {
        zzffx zzffx = this.zza;
        return new zzffw(zzffx, this.zzb, this.zzc, this.zzd, this.zze, zzfvc.zzo(this.zzf, j, timeUnit, zzffx.zzc));
    }
}
