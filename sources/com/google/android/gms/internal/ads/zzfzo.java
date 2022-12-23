package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfzo extends zzgau {
    /* access modifiers changed from: private */
    public static final byte[] zza = new byte[0];

    zzfzo() {
        super(zzgdz.class, zzgec.class, new zzfzm(zzfwm.class));
    }

    static /* bridge */ /* synthetic */ zzgaq zzh(int i, int i2, int i3, zzfwr zzfwr, byte[] bArr, int i4) {
        zzgds zza2 = zzgdt.zza();
        zzgee zza3 = zzgef.zza();
        int i5 = 4;
        zza3.zzb(4);
        zza3.zzc(5);
        zza3.zza(zzgji.zzv(bArr));
        zzgef zzgef = (zzgef) zza3.zzal();
        zzgfn zza4 = zzgfo.zza();
        zza4.zza(zzfwr.zzb());
        zza4.zzb(zzgji.zzv(zzfwr.zzc()));
        int zzd = zzfwr.zzd() - 1;
        if (zzd == 0) {
            i5 = 3;
        } else if (zzd != 1) {
            i5 = zzd != 2 ? 6 : 5;
        }
        zza4.zzc(i5);
        zzgdp zza5 = zzgdq.zza();
        zza5.zza((zzgfo) zza4.zzal());
        zzgdv zzc = zzgdw.zzc();
        zzc.zzb(zzgef);
        zzc.zza((zzgdq) zza5.zzal());
        zzc.zzc(i3);
        zza2.zza((zzgdw) zzc.zzal());
        return new zzgaq((zzgdt) zza2.zzal(), i4);
    }

    public final zzgar zza() {
        return new zzfzn(this, zzgdt.class);
    }

    public final /* synthetic */ zzgma zzb(zzgji zzgji) throws zzglc {
        return zzgdz.zze(zzgji, zzgkc.zza());
    }

    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgma zzgma) throws GeneralSecurityException {
        zzgdz zzgdz = (zzgdz) zzgma;
        if (!zzgdz.zzg().zzD()) {
            zzgim.zzb(zzgdz.zza(), 0);
            zzfzx.zza(zzgdz.zzf().zzc());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }

    public final int zzf() {
        return 4;
    }
}
