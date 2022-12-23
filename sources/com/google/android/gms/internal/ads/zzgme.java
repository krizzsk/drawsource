package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzgme implements zzgmt {
    private final zzgma zza;
    private final zzgnk zzb;
    private final boolean zzc;
    private final zzgkd zzd;

    private zzgme(zzgnk zzgnk, zzgkd zzgkd, zzgma zzgma) {
        this.zzb = zzgnk;
        this.zzc = zzgkd.zzh(zzgma);
        this.zzd = zzgkd;
        this.zza = zzgma;
    }

    static zzgme zzc(zzgnk zzgnk, zzgkd zzgkd, zzgma zzgma) {
        return new zzgme(zzgnk, zzgkd, zzgma);
    }

    public final int zza(Object obj) {
        zzgnk zzgnk = this.zzb;
        int zzb2 = zzgnk.zzb(zzgnk.zzd(obj));
        if (!this.zzc) {
            return zzb2;
        }
        this.zzd.zza(obj);
        throw null;
    }

    public final int zzb(Object obj) {
        int hashCode = this.zzb.zzd(obj).hashCode();
        if (!this.zzc) {
            return hashCode;
        }
        this.zzd.zza(obj);
        throw null;
    }

    public final Object zze() {
        return this.zza.zzaL().zzan();
    }

    public final void zzf(Object obj) {
        this.zzb.zzm(obj);
        this.zzd.zze(obj);
    }

    public final void zzg(Object obj, Object obj2) {
        zzgmv.zzF(this.zzb, obj, obj2);
        if (this.zzc) {
            zzgmv.zzE(this.zzd, obj, obj2);
        }
    }

    public final void zzh(Object obj, zzgml zzgml, zzgkc zzgkc) throws IOException {
        boolean z;
        zzgnk zzgnk = this.zzb;
        zzgkd zzgkd = this.zzd;
        Object zzc2 = zzgnk.zzc(obj);
        zzgkh zzb2 = zzgkd.zzb(obj);
        while (zzgml.zzc() != Integer.MAX_VALUE) {
            int zzd2 = zzgml.zzd();
            if (zzd2 != 11) {
                if ((zzd2 & 7) == 2) {
                    Object zzc3 = zzgkd.zzc(zzgkc, this.zza, zzd2 >>> 3);
                    if (zzc3 != null) {
                        zzgkd.zzf(zzgml, zzc3, zzgkc, zzb2);
                    } else {
                        z = zzgnk.zzp(zzc2, zzgml);
                    }
                } else {
                    z = zzgml.zzO();
                }
                if (!z) {
                    zzgnk.zzn(obj, zzc2);
                    return;
                }
            } else {
                int i = 0;
                Object obj2 = null;
                zzgji zzgji = null;
                while (true) {
                    try {
                        if (zzgml.zzc() == Integer.MAX_VALUE) {
                            break;
                        }
                        int zzd3 = zzgml.zzd();
                        if (zzd3 == 16) {
                            i = zzgml.zzj();
                            obj2 = zzgkd.zzc(zzgkc, this.zza, i);
                        } else if (zzd3 == 26) {
                            if (obj2 != null) {
                                zzgkd.zzf(zzgml, obj2, zzgkc, zzb2);
                            } else {
                                zzgji = zzgml.zzp();
                            }
                        } else if (!zzgml.zzO()) {
                            break;
                        }
                    } catch (Throwable th) {
                        zzgnk.zzn(obj, zzc2);
                        throw th;
                    }
                }
                if (zzgml.zzd() != 12) {
                    throw zzglc.zzb();
                } else if (zzgji != null) {
                    if (obj2 != null) {
                        zzgkd.zzg(zzgji, obj2, zzgkc, zzb2);
                    } else {
                        zzgnk.zzk(zzc2, i, zzgji);
                    }
                }
            }
        }
        zzgnk.zzn(obj, zzc2);
    }

    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzgiu zzgiu) throws IOException {
        zzgkq zzgkq = (zzgkq) obj;
        if (zzgkq.zzc == zzgnl.zzc()) {
            zzgkq.zzc = zzgnl.zze();
        }
        zzgkn zzgkn = (zzgkn) obj;
        throw null;
    }

    public final boolean zzj(Object obj, Object obj2) {
        if (!this.zzb.zzd(obj).equals(this.zzb.zzd(obj2))) {
            return false;
        }
        if (!this.zzc) {
            return true;
        }
        this.zzd.zza(obj);
        this.zzd.zza(obj2);
        throw null;
    }

    public final boolean zzk(Object obj) {
        this.zzd.zza(obj);
        throw null;
    }

    public final void zzn(Object obj, zzgjy zzgjy) throws IOException {
        this.zzd.zza(obj);
        throw null;
    }
}
