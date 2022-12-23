package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzebx {
    private final zzfvm zza;
    private final zzebe zzb;
    private final zzgqo zzc;

    public zzebx(zzfvm zzfvm, zzebe zzebe, zzgqo zzgqo) {
        this.zza = zzfvm;
        this.zzb = zzebe;
        this.zzc = zzgqo;
    }

    private final zzfvl zzg(zzbzv zzbzv, zzebw zzebw, zzebw zzebw2, zzfuj zzfuj) {
        zzfvl zzfvl;
        String str = zzbzv.zzd;
        zzt.zzp();
        if (zzs.zzy(str)) {
            zzfvl = zzfvc.zzh(new zzebn(1));
        } else {
            zzfvl = zzfvc.zzg(zzebw.zza(zzbzv), ExecutionException.class, zzebo.zza, this.zza);
        }
        return zzfvc.zzg(zzfvc.zzn(zzfut.zzv(zzfvl), zzfuj, this.zza), zzebn.class, new zzebv(this, zzebw2, zzbzv, zzfuj), this.zza);
    }

    public final zzfvl zza(zzbzv zzbzv) {
        return zzg(zzbzv, new zzebt(this.zzb), new zzebu(this), new zzebs(zzbzv));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzb(zzebw zzebw, zzbzv zzbzv, zzfuj zzfuj, zzebn zzebn) throws Exception {
        return zzfvc.zzn(zzebw.zza(zzbzv), zzfuj, this.zza);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzc(zzbzv zzbzv) {
        return ((zzeco) this.zzc.zzb()).zzb(zzbzv, Binder.getCallingUid());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzd(zzbzv zzbzv) {
        String str;
        zzebe zzebe = this.zzb;
        if (((Boolean) zzbjv.zzd.zze()).booleanValue()) {
            str = zzbzv.zzh;
        } else {
            str = zzbzv.zzj;
        }
        return zzebe.zzc(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zze(zzbzv zzbzv) {
        String str;
        zzeco zzeco = (zzeco) this.zzc.zzb();
        if (((Boolean) zzbjv.zzd.zze()).booleanValue()) {
            str = zzbzv.zzh;
        } else {
            str = zzbzv.zzj;
        }
        return zzeco.zzi(str);
    }

    public final zzfvl zzf(zzbzv zzbzv) {
        if (zzapf.zzg(zzbzv.zzj)) {
            return zzfvc.zzh(new zzdzl(2, "Pool key missing from removeUrl call."));
        }
        return zzg(zzbzv, new zzebq(this), new zzebr(this), zzebp.zza);
    }
}
