package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdxw implements zzdxg {
    /* access modifiers changed from: private */
    public final long zza;
    private final String zzb;
    /* access modifiers changed from: private */
    public final zzdxl zzc;
    private final zzfbc zzd;

    zzdxw(long j, Context context, zzdxl zzdxl, zzcnf zzcnf, String str) {
        this.zza = j;
        this.zzb = str;
        this.zzc = zzdxl;
        zzfbe zzu = zzcnf.zzu();
        zzu.zzb(context);
        zzu.zza(str);
        this.zzd = zzu.zzc().zza();
    }

    public final void zza() {
    }

    public final void zzb(zzl zzl) {
        try {
            this.zzd.zzf(zzl, new zzdxu(this));
        } catch (RemoteException e) {
            zze.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzc() {
        try {
            this.zzd.zzk(new zzdxv(this));
            this.zzd.zzm(ObjectWrapper.wrap(null));
        } catch (RemoteException e) {
            zze.zzl("#007 Could not call remote method.", e);
        }
    }
}
