package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public abstract class zzgar {
    private final Class zza;

    public zzgar(Class cls) {
        this.zza = cls;
    }

    public abstract zzgma zza(zzgma zzgma) throws GeneralSecurityException;

    public abstract zzgma zzb(zzgji zzgji) throws zzglc;

    public Map zzc() throws GeneralSecurityException {
        return Collections.emptyMap();
    }

    public abstract void zzd(zzgma zzgma) throws GeneralSecurityException;

    public final Class zzg() {
        return this.zza;
    }
}
