package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public abstract class zzgas {
    private final Class zza;
    private final Map zzb;
    private final Class zzc;

    @SafeVarargs
    protected zzgas(Class cls, zzgat... zzgatArr) {
        this.zza = cls;
        HashMap hashMap = new HashMap();
        int i = 0;
        while (i <= 0) {
            zzgat zzgat = zzgatArr[i];
            if (!hashMap.containsKey(zzgat.zzb())) {
                hashMap.put(zzgat.zzb(), zzgat);
                i++;
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(zzgat.zzb().getCanonicalName())));
            }
        }
        this.zzc = zzgatArr[0].zzb();
        this.zzb = Collections.unmodifiableMap(hashMap);
    }

    public zzgar zza() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract zzgma zzb(zzgji zzgji) throws zzglc;

    public abstract String zzc();

    public abstract void zzd(zzgma zzgma) throws GeneralSecurityException;

    public int zze() {
        return 1;
    }

    public abstract int zzf();

    public final Class zzi() {
        return this.zzc;
    }

    public final Class zzj() {
        return this.zza;
    }

    public final Object zzk(zzgma zzgma, Class cls) throws GeneralSecurityException {
        zzgat zzgat = (zzgat) this.zzb.get(cls);
        if (zzgat != null) {
            return zzgat.zza(zzgma);
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalArgumentException("Requested primitive class " + canonicalName + " not supported.");
    }

    public final Set zzl() {
        return this.zzb.keySet();
    }
}
