package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgbb extends zzgas {
    public zzgbb() {
        super(zzgem.class, new zzgaz(zzfwx.class));
    }

    public static final void zzh(zzgem zzgem) throws GeneralSecurityException {
        zzgim.zzb(zzgem.zza(), 0);
        if (zzgem.zzh().zzd() >= 16) {
            zzn(zzgem.zzg());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    static /* bridge */ /* synthetic */ zzgaq zzm(int i, int i2, int i3, int i4) {
        zzgeo zzc = zzgep.zzc();
        zzger zzc2 = zzges.zzc();
        zzc2.zzb(i3);
        zzc2.zza(i2);
        zzc.zzb((zzges) zzc2.zzal());
        zzc.zza(i);
        return new zzgaq((zzgep) zzc.zzal(), i4);
    }

    /* access modifiers changed from: private */
    public static void zzn(zzges zzges) throws GeneralSecurityException {
        if (zzges.zza() >= 10) {
            int zzg = zzges.zzg() - 2;
            if (zzg != 1) {
                if (zzg != 2) {
                    if (zzg != 3) {
                        if (zzg != 4) {
                            if (zzg != 5) {
                                throw new GeneralSecurityException("unknown hash type");
                            } else if (zzges.zza() > 28) {
                                throw new GeneralSecurityException("tag size too big");
                            }
                        } else if (zzges.zza() > 64) {
                            throw new GeneralSecurityException("tag size too big");
                        }
                    } else if (zzges.zza() > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (zzges.zza() > 48) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (zzges.zza() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    public final zzgar zza() {
        return new zzgba(this, zzgep.class);
    }

    public final /* synthetic */ zzgma zzb(zzgji zzgji) throws zzglc {
        return zzgem.zzf(zzgji, zzgkc.zza());
    }

    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgma zzgma) throws GeneralSecurityException {
        zzh((zzgem) zzgma);
    }

    public final int zze() {
        return 2;
    }

    public final int zzf() {
        return 3;
    }
}
