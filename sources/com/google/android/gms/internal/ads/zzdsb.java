package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdsb implements Callable {
    /* access modifiers changed from: private */
    public final zza zza;
    /* access modifiers changed from: private */
    public final zzclu zzb;
    /* access modifiers changed from: private */
    public final Context zzc;
    /* access modifiers changed from: private */
    public final zzdwh zzd;
    /* access modifiers changed from: private */
    public final zzfgp zze;
    /* access modifiers changed from: private */
    public final zzees zzf;
    /* access modifiers changed from: private */
    public final Executor zzg;
    /* access modifiers changed from: private */
    public final zzaoc zzh;
    /* access modifiers changed from: private */
    public final zzcfo zzi;
    /* access modifiers changed from: private */
    public final zzfii zzj;

    public zzdsb(Context context, Executor executor, zzaoc zzaoc, zzcfo zzcfo, zza zza2, zzclu zzclu, zzees zzees, zzfii zzfii, zzdwh zzdwh, zzfgp zzfgp) {
        this.zzc = context;
        this.zzg = executor;
        this.zzh = zzaoc;
        this.zzi = zzcfo;
        this.zza = zza2;
        this.zzb = zzclu;
        this.zzf = zzees;
        this.zzj = zzfii;
        this.zzd = zzdwh;
        this.zze = zzfgp;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzdse zzdse = new zzdse(this);
        zzdse.zzh();
        return zzdse;
    }
}
