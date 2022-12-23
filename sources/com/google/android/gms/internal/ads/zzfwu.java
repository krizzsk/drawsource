package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfwu {
    private final zzgft zza;

    private zzfwu(zzgft zzgft) {
        this.zza = zzgft;
    }

    public static zzfwu zzd() {
        return new zzfwu(zzgfw.zzd());
    }

    private final synchronized int zze() {
        int zza2;
        zza2 = zzgav.zza();
        while (zzg(zza2)) {
            zza2 = zzgav.zza();
        }
        return zza2;
    }

    private final synchronized zzgfv zzf(zzgfo zzgfo) throws GeneralSecurityException {
        return zzh(zzfxk.zzc(zzgfo), zzgfo.zzi());
    }

    private final synchronized boolean zzg(int i) {
        boolean z;
        Iterator it = this.zza.zzc().iterator();
        while (true) {
            if (it.hasNext()) {
                if (((zzgfv) it.next()).zza() == i) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        return z;
    }

    private final synchronized zzgfv zzh(zzgfj zzgfj, int i) throws GeneralSecurityException {
        zzgfu zzd;
        int zze = zze();
        if (i != 2) {
            zzd = zzgfv.zzd();
            zzd.zza(zzgfj);
            zzd.zzb(zze);
            zzd.zzd(3);
            zzd.zzc(i);
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return (zzgfv) zzd.zzal();
    }

    @Deprecated
    public final synchronized int zza(zzgfo zzgfo, boolean z) throws GeneralSecurityException {
        zzgfv zzf;
        zzf = zzf(zzgfo);
        this.zza.zza(zzf);
        this.zza.zzb(zzf.zza());
        return zzf.zza();
    }

    public final synchronized zzfwt zzb() throws GeneralSecurityException {
        return zzfwt.zza((zzgfw) this.zza.zzal());
    }

    @Deprecated
    public final synchronized zzfwu zzc(zzgfo zzgfo) throws GeneralSecurityException {
        zza(zzgfo, true);
        return this;
    }
}
