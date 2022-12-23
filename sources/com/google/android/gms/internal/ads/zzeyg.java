package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzl;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzeyg implements zzeza {
    private final zzeza zza;
    private final zzeza zzb;
    private final zzfek zzc;
    private final String zzd;
    private zzdbc zze;
    private final Executor zzf;

    public zzeyg(zzeza zzeza, zzeza zzeza2, zzfek zzfek, String str, Executor executor) {
        this.zza = zzeza;
        this.zzb = zzeza2;
        this.zzc = zzfek;
        this.zzd = str;
        this.zzf = executor;
    }

    private final zzfvl zzg(zzfdx zzfdx, zzezb zzezb) {
        zzdbc zzdbc = zzfdx.zza;
        this.zze = zzdbc;
        if (zzfdx.zzc != null) {
            if (zzdbc.zzf() != null) {
                zzfdx.zzc.zzo().zzbL(zzfdx.zza.zzf());
            }
            return zzfvc.zzi(zzfdx.zzc);
        }
        zzdbc.zzb().zzk(zzfdx.zzb);
        return ((zzeyq) this.zza).zzb(zzezb, (zzeyz) null, zzfdx.zza);
    }

    /* renamed from: zza */
    public final synchronized zzdbc zzd() {
        return this.zze;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzb(zzezb zzezb, zzeyf zzeyf, zzeyz zzeyz, zzdbc zzdbc, zzeyl zzeyl) throws Exception {
        if (zzeyl != null) {
            zzeyf zzeyf2 = new zzeyf(zzeyf.zza, zzeyf.zzb, zzeyf.zzc, zzeyf.zzd, zzeyf.zze, zzeyf.zzf, zzeyl.zza);
            if (zzeyl.zzc != null) {
                this.zze = null;
                this.zzc.zze(zzeyf2);
                return zzg(zzeyl.zzc, zzezb);
            }
            zzfvl zza2 = this.zzc.zza(zzeyf2);
            if (zza2 != null) {
                this.zze = null;
                return zzfvc.zzn(zza2, new zzeyc(this), this.zzf);
            }
            this.zzc.zze(zzeyf2);
            zzezb = new zzezb(zzezb.zzb, zzeyl.zzb);
        }
        zzfvl zzb2 = ((zzeyq) this.zza).zzb(zzezb, zzeyz, zzdbc);
        this.zze = zzdbc;
        return zzb2;
    }

    public final /* bridge */ /* synthetic */ zzfvl zzc(zzezb zzezb, zzeyz zzeyz, Object obj) {
        return zzf(zzezb, zzeyz, (zzdbc) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zze(zzfeh zzfeh) throws Exception {
        zzfej zzfej;
        if (zzfeh == null || zzfeh.zza == null || (zzfej = zzfeh.zzb) == null) {
            throw new zzdzl(1, "Empty prefetch");
        }
        zzbeb zza2 = zzbeh.zza();
        zzbdz zza3 = zzbea.zza();
        zza3.zzd(2);
        zza3.zzb(zzbee.zzd());
        zza2.zza(zza3);
        zzfeh.zza.zza.zzb().zzc().zzi((zzbeh) zza2.zzal());
        return zzg(zzfeh.zza, ((zzeyf) zzfej).zzb);
    }

    public final synchronized zzfvl zzf(zzezb zzezb, zzeyz zzeyz, zzdbc zzdbc) {
        zzezb zzezb2 = zzezb;
        zzeyz zzeyz2 = zzeyz;
        synchronized (this) {
            zzdbb zza2 = zzeyz2.zza(zzezb2.zzb);
            zza2.zza(new zzeyh(this.zzd));
            zzdbc zzdbc2 = (zzdbc) zza2.zzh();
            zzdbc2.zzg();
            zzdbc2.zzg();
            zzl zzl = zzdbc2.zzg().zzd;
            if (zzl.zzs == null) {
                if (zzl.zzx == null) {
                    zzfcd zzg = zzdbc2.zzg();
                    zzeyz zzeyz3 = zzeyz;
                    zzezb zzezb3 = zzezb;
                    zzfvl zzn = zzfvc.zzn(zzfut.zzv(((zzeym) this.zzb).zzb(zzezb2, zzeyz2, zzdbc2)), new zzeyd(this, zzezb, new zzeyf(zzeyz3, zzezb3, zzg.zzd, zzg.zzf, this.zzf, zzg.zzj, (zzfdy) null), zzeyz, zzdbc2), this.zzf);
                    return zzn;
                }
            }
            this.zze = zzdbc2;
            zzfvl zzb2 = ((zzeyq) this.zza).zzb(zzezb2, zzeyz2, zzdbc2);
            return zzb2;
        }
    }
}
