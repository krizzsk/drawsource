package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzhd {
    final Context zza;
    final zzcx zzb = zzcx.zza;
    final zzfpj zzc;
    final zzfpj zzd;
    zzfpj zze;
    zzfpj zzf;
    final zzfpj zzg;
    final zzfok zzh;
    final Looper zzi = zzeg.zzD();
    final zzi zzj = zzi.zza;
    final zzjw zzk = zzjw.zze;
    boolean zzl;
    final zzgo zzm = new zzgo(0.97f, 1.03f, 1000, 1.0E-7f, zzeg.zzv(20), zzeg.zzv(500), 0.999f, (zzgn) null);

    public zzhd(Context context, zzckr zzckr, byte[] bArr) {
        zzgx zzgx = new zzgx(zzckr, (byte[]) null);
        zzgy zzgy = new zzgy(context);
        zzgz zzgz = new zzgz(context);
        zzha zzha = zzha.zza;
        zzhb zzhb = new zzhb(context);
        zzhc zzhc = zzhc.zza;
        this.zza = context;
        this.zzc = zzgx;
        this.zzd = zzgy;
        this.zze = zzgz;
        this.zzf = zzha;
        this.zzg = zzhb;
        this.zzh = zzhc;
    }

    static /* synthetic */ zzrz zza(Context context) {
        return new zzrn(context, new zzyn());
    }
}
