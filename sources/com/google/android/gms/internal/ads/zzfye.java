package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfye extends zzgas {
    zzfye() {
        super(zzgcw.class, new zzfyc(zzfwf.class));
    }

    public static void zzg(boolean z) throws GeneralSecurityException {
        if (zzm()) {
            zzfxk.zzm(new zzfye(), true);
        }
    }

    static /* bridge */ /* synthetic */ zzgaq zzh(int i, int i2) {
        zzgcy zzc = zzgcz.zzc();
        zzc.zza(i);
        return new zzgaq((zzgcz) zzc.zzal(), i2);
    }

    private static boolean zzm() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    public final zzgar zza() {
        return new zzfyd(this, zzgcz.class);
    }

    public final /* synthetic */ zzgma zzb(zzgji zzgji) throws zzglc {
        return zzgcw.zze(zzgji, zzgkc.zza());
    }

    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgma zzgma) throws GeneralSecurityException {
        zzgcw zzgcw = (zzgcw) zzgma;
        zzgim.zzb(zzgcw.zza(), 0);
        zzgim.zza(zzgcw.zzf().zzd());
    }

    public final int zzf() {
        return 3;
    }
}
