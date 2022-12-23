package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
class zzfwq implements zzfwo {
    private final zzgas zza;
    private final Class zzb;

    public zzfwq(zzgas zzgas, Class cls) {
        if (zzgas.zzl().contains(cls) || Void.class.equals(cls)) {
            this.zza = zzgas;
            this.zzb = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[]{zzgas.toString(), cls.getName()}));
    }

    private final zzfwp zzg() {
        return new zzfwp(this.zza.zza());
    }

    private final Object zzh(zzgma zzgma) throws GeneralSecurityException {
        if (!Void.class.equals(this.zzb)) {
            this.zza.zzd(zzgma);
            return this.zza.zzk(zzgma, this.zzb);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    public final zzgfj zza(zzgji zzgji) throws GeneralSecurityException {
        try {
            zzgma zza2 = zzg().zza(zzgji);
            zzgfi zza3 = zzgfj.zza();
            zza3.zza(this.zza.zzc());
            zza3.zzb(zza2.zzas());
            zza3.zzc(this.zza.zzf());
            return (zzgfj) zza3.zzal();
        } catch (zzglc e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    public final zzgma zzb(zzgji zzgji) throws GeneralSecurityException {
        try {
            return zzg().zza(zzgji);
        } catch (zzglc e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(String.valueOf(this.zza.zza().zzg().getName())), e);
        }
    }

    public final Class zzc() {
        return this.zzb;
    }

    public final Object zzd(zzgji zzgji) throws GeneralSecurityException {
        try {
            return zzh(this.zza.zzb(zzgji));
        } catch (zzglc e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(String.valueOf(this.zza.zzj().getName())), e);
        }
    }

    public final Object zze(zzgma zzgma) throws GeneralSecurityException {
        String concat = "Expected proto of type ".concat(String.valueOf(this.zza.zzj().getName()));
        if (this.zza.zzj().isInstance(zzgma)) {
            return zzh(zzgma);
        }
        throw new GeneralSecurityException(concat);
    }

    public final String zzf() {
        return this.zza.zzc();
    }
}
