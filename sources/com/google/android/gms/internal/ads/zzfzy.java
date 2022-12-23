package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfzy implements zzghk {
    private final String zza;
    private final int zzb;
    private zzgcq zzc;
    private zzgbs zzd;
    private int zze;
    private zzgdc zzf;

    zzfzy(zzgfo zzgfo) throws GeneralSecurityException {
        String zzf2 = zzgfo.zzf();
        this.zza = zzf2;
        if (zzf2.equals(zzfxm.zzb)) {
            try {
                zzgct zze2 = zzgct.zze(zzgfo.zze(), zzgkc.zza());
                this.zzc = (zzgcq) zzfxk.zzd(zzgfo);
                this.zzb = zze2.zza();
            } catch (zzglc e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (this.zza.equals(zzfxm.zza)) {
            try {
                zzgbv zzd2 = zzgbv.zzd(zzgfo.zze(), zzgkc.zza());
                this.zzd = (zzgbs) zzfxk.zzd(zzgfo);
                this.zze = zzd2.zze().zza();
                this.zzb = this.zze + zzd2.zzf().zza();
            } catch (zzglc e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        } else if (this.zza.equals(zzfzj.zza)) {
            try {
                zzgdf zze3 = zzgdf.zze(zzgfo.zze(), zzgkc.zza());
                this.zzf = (zzgdc) zzfxk.zzd(zzgfo);
                this.zzb = zze3.zza();
            } catch (zzglc e3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
            }
        } else {
            throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(String.valueOf(this.zza)));
        }
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzgap zzb(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length != this.zzb) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        } else if (this.zza.equals(zzfxm.zzb)) {
            zzgcp zzc2 = zzgcq.zzc();
            zzc2.zzaj(this.zzc);
            zzc2.zza(zzgji.zzw(bArr, 0, this.zzb));
            return new zzgap((zzfwf) zzfxk.zzg(this.zza, (zzgcq) zzc2.zzal(), zzfwf.class));
        } else if (this.zza.equals(zzfxm.zza)) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.zze);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.zze, this.zzb);
            zzgbx zzc3 = zzgby.zzc();
            zzc3.zzaj(this.zzd.zzf());
            zzc3.zza(zzgji.zzv(copyOfRange));
            zzgel zzc4 = zzgem.zzc();
            zzc4.zzaj(this.zzd.zzg());
            zzc4.zza(zzgji.zzv(copyOfRange2));
            zzgbr zzc5 = zzgbs.zzc();
            zzc5.zzc(this.zzd.zza());
            zzc5.zza((zzgby) zzc3.zzal());
            zzc5.zzb((zzgem) zzc4.zzal());
            return new zzgap((zzfwf) zzfxk.zzg(this.zza, (zzgbs) zzc5.zzal(), zzfwf.class));
        } else if (this.zza.equals(zzfzj.zza)) {
            zzgdb zzc6 = zzgdc.zzc();
            zzc6.zzaj(this.zzf);
            zzc6.zza(zzgji.zzw(bArr, 0, this.zzb));
            return new zzgap((zzfwl) zzfxk.zzg(this.zza, (zzgdc) zzc6.zzal(), zzfwl.class));
        } else {
            throw new GeneralSecurityException("unknown DEM key type");
        }
    }
}
