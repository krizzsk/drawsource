package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public class zzdkd {
    private final zzdlg zza;
    private final zzcli zzb;

    public zzdkd(zzdlg zzdlg, zzcli zzcli) {
        this.zza = zzdlg;
        this.zzb = zzcli;
    }

    public static final zzdiz zzh(zzfhe zzfhe) {
        return new zzdiz(zzfhe, zzcfv.zzf);
    }

    public static final zzdiz zzi(zzdll zzdll) {
        return new zzdiz(zzdll, zzcfv.zzf);
    }

    public final View zza() {
        zzcli zzcli = this.zzb;
        if (zzcli == null) {
            return null;
        }
        return zzcli.zzI();
    }

    public final View zzb() {
        zzcli zzcli = this.zzb;
        if (zzcli != null) {
            return zzcli.zzI();
        }
        return null;
    }

    public final zzcli zzc() {
        return this.zzb;
    }

    public final zzdiz zzd(Executor executor) {
        return new zzdiz(new zzdkb(this.zzb), executor);
    }

    public final zzdlg zze() {
        return this.zza;
    }

    public Set zzf(zzdat zzdat) {
        return Collections.singleton(new zzdiz(zzdat, zzcfv.zzf));
    }

    public Set zzg(zzdat zzdat) {
        return Collections.singleton(new zzdiz(zzdat, zzcfv.zzf));
    }
}
